package edu.hu.clickwatch.actions;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IViewReference;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;

import com.google.inject.Guice;
import com.jcraft.jsch.*;

import edu.hu.clickwatch.ClickWatchPluginActivator;
import edu.hu.clickwatch.GuiceModule;
import edu.hu.clickwatch.XmlUtil;
import edu.hu.clickwatch.actions.Execute.WorkerThread;
import edu.hu.clickwatch.model.AbstractNodeConnection;
import edu.hu.clickwatch.model.ClickControlNodeConnection;
import edu.hu.clickwatch.model.MultiNode;
import edu.hu.clickwatch.model.MultiNodeNodeConnection;
import edu.hu.clickwatch.model.Node;
import edu.hu.clickwatch.util.SshConnectionFactory;
import edu.hu.clickwatch.views.ResultView;

/**
 * Deploy a new Click configuration to remote nodes via ssh in parallel.
 * @author zubow
 */
public class DeployPara implements IObjectActionDelegate {

	private Shell shell;
	private IEditorPart editor = null;
	private List<Node> node_lst;
	private EObject currentResult = null;
	
	// synchronized counter
	public class Counter {
		private int count;
		public synchronized void inc() {
			count++;
		}
		public synchronized int get() {
			return count;
		}
	}
	
	public class ObserverThread extends Thread {
		private WorkerStatus[] observedThreads;
		private IProgressMonitor monitor;
		private Counter counter;
		private String title;
		
		public ObserverThread(WorkerStatus[] observedThreads, IProgressMonitor monitor, Counter counter, String title) {
			this.observedThreads = observedThreads;
			this.monitor = monitor;
			this.counter = counter;
			this.title = title;
		}

		public void run() {
			while (true) {
				int count_before = counter.get();
				int running_cnt = 0;
				for (WorkerStatus worker : observedThreads) {
					if (!worker.hasFinished()) {
						running_cnt++;
					}
				}
				if (running_cnt == 0) {
					break; // finished
				}

				monitor.setTaskName(title + " waiting: " + (observedThreads.length-running_cnt) + " / " + (observedThreads.length));
				try {
					sleep(50);
				} catch (InterruptedException e) { }
				int progress = counter.get() - count_before;
				monitor.worked(progress);
				if (monitor.isCanceled()) {
					monitor.done();
					throw new RuntimeException("User canceled operation!");
				}
			}
		}
	}
	
	public interface WorkerStatus {
		public boolean hasFinished();
	}
	
	/**
	 * Executing deployment in parallel - clean-up, copy, unpack
	 */
	public class PrepareWorkerThread extends Thread implements WorkerStatus {
		
		public String iNodeAddr;
		public String lfile;
		public String md5cs;
		public String result;
		public Exception exception;
		private Counter counter;
		private boolean finished;
		
		public PrepareWorkerThread(String iNodeAddr, String lfile, String md5cs, Counter counter) {
			this.iNodeAddr = iNodeAddr;
			this.lfile = lfile;
			this.md5cs = md5cs;
			this.counter = counter;
			finished = false;
		}
		
		public void run() {
			try {
				// remote deploy
				System.out.println("deploying on node " + iNodeAddr + " called.");
				result = DeploymentHelper.getInstance().deployRemote(iNodeAddr, lfile, md5cs, shell, false);
			} catch (Exception e) {
				System.err.println("ErrorMsg:" + e.getMessage());
				exception = e;			
			} finally {
				counter.inc();
				finished = true;
			}
		}
		
		public boolean failed() {
			return (exception != null);
		}

		@Override
		public boolean hasFinished() {
			return finished;
		}
	}	
	
	/**
	 * Start nodes in parallel
	 */
	public class RunWorkerThread extends Thread implements WorkerStatus {
		
		public String iNodeAddr;
		public PrepareWorkerThread prepareThr;
		public String result;
		public Exception exception;
		private Counter counter;
		private boolean finished;
		
		public RunWorkerThread(String iNodeAddr, PrepareWorkerThread prepareThr, Counter counter) {
			this.iNodeAddr = iNodeAddr;
			this.prepareThr = prepareThr;
			this.counter = counter;
			finished = false;
		}
		
		public void run() {
			// start router only if preparation phase was successful
			if (!prepareThr.failed()) {
				System.out.println("starting on node " + iNodeAddr + " called.");
				try {
					result = DeploymentHelper.getInstance().startRemote(iNodeAddr, shell, false);
				} catch (Exception e) {
					System.err.println("ErrorMsg:" + e.getMessage());
					exception = e;			
				}
			} else {
				// do not start failed nodes
			}
			counter.inc();
			finished = true;
		}
		
		public boolean failed() {
			return (exception != null);
		}
		
		@Override
		public boolean hasFinished() {
			return finished;
		}		
	}	

	/**
	 * Constructor for Action1.
	 */
	public DeployPara() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		if (targetPart instanceof IEditorPart) {
			editor = (IEditorPart)targetPart;
			shell = targetPart.getSite().getShell();
		}
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	@Override
	public void run(IAction action) {
		if (node_lst == null || node_lst.isEmpty()) {
			return;
		}
		
		// select resource for deployment
		FileDialog fd = new FileDialog(shell, SWT.OPEN);
        fd.setText("Open");
        String[] filterExt = { "*.bz2", "*.tar", "*.gz", "*.zip", "*.dat", "*.*" };
        fd.setFilterExtensions(filterExt);
        final String lfile = fd.open();
        
        if (lfile == null) {
        	return;
        }

		//  create n parallel execution threads
		final PrepareWorkerThread[] prepareWorkerThreads = new PrepareWorkerThread[node_lst.size()];
		//  create n parallel execution threads
		final RunWorkerThread[] runWorkerThreads = new RunWorkerThread[node_lst.size()];

		try {
	        ProgressMonitorDialog dialog = new ProgressMonitorDialog(shell);
	        dialog.run(true, true, new IRunnableWithProgress() {
	            public void run(IProgressMonitor monitor) {
		        	try {
		        		int numtasks = 1 + 2 * node_lst.size();
		        		Counter counter = new Counter();
		        		monitor.beginTask("Remote deployment", numtasks);

				        //
				        // Step 0: calc MD5 checksum
						monitor.setTaskName("MD5 calc ...");
				        String md5cs = "";
				        FileInputStream fis;
						try {
							fis = new FileInputStream( new File(lfile) );
					        md5cs = org.apache.commons.codec.digest.DigestUtils.md5Hex( fis );
						} catch (Exception e1) {
							System.err.println("ErrorMsg:" + e1.getMessage());
							MessageDialog.openError(editor.getSite().getShell(), "Clickwatch Error", "ErrorMsg:" + e1.getMessage());
						}
						counter.inc();
						monitor.worked(1);
						
						monitor.setTaskName("Prepare deployment ...");
						final ObserverThread observer = new ObserverThread(prepareWorkerThreads, monitor, counter, "Prepare deployment ... ");
						
				        //
				        // Step 1: prepare, copy and unpack router conf in parallel
						for (int idx=0; idx<node_lst.size(); idx++) {
							final Node node = node_lst.get(idx);
				
							// disconnect if connected
							if (node.getConnection() != null) {
								AbstractNodeConnection oldConnection = (AbstractNodeConnection)node.getConnection();
								node.setConnection(null);
								oldConnection.disconnect();
							}
							
							// do it in parallel
							prepareWorkerThreads[idx] = new PrepareWorkerThread(node.getINetAdress(), lfile, md5cs, counter);
							prepareWorkerThreads[idx].start();
						}
						observer.start();
						
						// sync point: wait until all worker threads are finished
						for (int i=0; i<prepareWorkerThreads.length; i++) {
							prepareWorkerThreads[i].join();
						}
						observer.join();
						
						//monitor.worked(counter.get());
						monitor.setTaskName("Start router conf ...");
						
						final ObserverThread observer2 = new ObserverThread(runWorkerThreads, monitor, counter, "Start router conf ...");
						//
				        // Step 2: start router in parallel
						for (int idx=0; idx<node_lst.size(); idx++) {
							final Node node = node_lst.get(idx);
				
							// do it in parallel
							runWorkerThreads[idx] = new RunWorkerThread(node.getINetAdress(), prepareWorkerThreads[idx], counter);
							runWorkerThreads[idx].start();
						}
						observer2.start();
						
						// sync point: wait until all worker threads are finished
						for (int i=0; i<runWorkerThreads.length; i++) {
							runWorkerThreads[i].join();
						}
						observer2.join();
						
						//monitor.worked(counter.get());
		        	} catch(Exception e) {
		    			System.err.println("Exception: " + e.getMessage());
		        		MessageDialog.openError(shell, "Clickwatch Error", "Exception: " + e.getMessage());	
		        	} finally {
		        		monitor.done();
		        	}
	            }
	        });
		} catch (Exception e) {
			System.err.println("Exception: " + e.getMessage());
    		MessageDialog.openError(shell, "Clickwatch Error", "Exception: " + e.getMessage());	
		}

		//
		// analyze results
        final List<String> prepResults = new ArrayList<String>();
        final List<String> runResults = new ArrayList<String>();
        final List<String> nodeNames = new ArrayList<String>();
        final List<Exception> prepareExceptions = new ArrayList<Exception>();
        final List<Exception> runExceptions = new ArrayList<Exception>();
		for (int i=0; i<runWorkerThreads.length; i++) {
			runResults.add(runWorkerThreads[i].result);
			prepResults.add(prepareWorkerThreads[i].result);
			nodeNames.add(runWorkerThreads[i].iNodeAddr);
			prepareExceptions.add(prepareWorkerThreads[i].exception);
			runExceptions.add(runWorkerThreads[i].exception);
		}
			
        // show results in treeview
		showResults(prepResults, runResults, nodeNames);
		
		// show exceptions in popup window
		showExceptions(nodeNames, prepareExceptions, runExceptions);
	}

	/**
	 * Update results in resultview 
	 */
	private void showResults(List<String> prepResults, List<String> runResults, List<String> nodeNames) {

		// create xml from results string
		StringBuffer xmlResults = new StringBuffer();
		xmlResults.append("<network>");
		for (int i=0; i<prepResults.size(); i++) {
			xmlResults.append("<node id='" + nodeNames.get(i) + "'>");
			xmlResults.append("<prepare>");
			xmlResults.append(prepResults.get(i));
			xmlResults.append("</prepare>");
			xmlResults.append("<run>");
			xmlResults.append(runResults.get(i));
			xmlResults.append("</run>");
			xmlResults.append("</node>");
		}
		xmlResults.append("</network>");
		
		System.out.println("XMl results to display: " + xmlResults.toString());
		
		EObject result = XmlUtil.deserializeXml(xmlResults.toString());

		for(IViewReference viewRef: editor.getEditorSite().getPage().getViewReferences()) {
			IViewPart view = viewRef.getView(false);
			if (view instanceof ResultView) {
				((ResultView)view).setInput(result);
				if (currentResult != null) {
					EcoreUtil.delete(currentResult, true);			
				}
				currentResult = result;
			}
		}
	}

	/**
	 * At the end display the statistics about failed execs
	 */
	private void showExceptions(List<String> nodeNames, List<Exception> prepareExceptions, List<Exception> runExceptions) {
		StringBuffer txtExc = new StringBuffer();
		for (int i=0; i<prepareExceptions.size(); i++) {
			txtExc.append("Node ").append(nodeNames.get(i)).append(" -> ").append(" Prepare: ");
			if (prepareExceptions.get(i) != null) {
				txtExc.append(prepareExceptions.get(i).getMessage());
			} else {
				txtExc.append("OK");
			}
			txtExc.append(", Run: ");
			if (runExceptions.get(i) != null) {
				txtExc.append(runExceptions.get(i).getMessage());
			} else {
				txtExc.append("OK");
			}
			txtExc.append("\n");
		}
		
		MessageDialog.openError(editor.getSite().getShell(), "Result stats", txtExc.toString());		
	}
	
	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	@Override
	@SuppressWarnings("unchecked")
	public void selectionChanged(IAction action, ISelection selection) {
		try {
			IStructuredSelection sec = ((IStructuredSelection)selection);
			node_lst = sec.toList();
		} catch (Exception e) {
			MessageDialog.openError(editor.getSite().getShell(), "Clickwatch Error", "ErrorMsg:" + e.getMessage());
		}
	}
}
