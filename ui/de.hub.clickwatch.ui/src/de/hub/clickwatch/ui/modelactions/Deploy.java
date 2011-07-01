package de.hub.clickwatch.ui.modelactions;

import java.io.File;
import java.io.FileInputStream;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IViewReference;

import com.google.inject.Inject;
import com.jcraft.jsch.Session;

import de.hub.clickwatch.XmlModelRepository;
import de.hub.clickwatch.model.AbstractNodeConnection;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.ui.util.SshConnectionFactory;
import de.hub.clickwatch.ui.views.ResultView;

/**
 * Hot deployment: do not reconfigure wireless device; restart click
 */
class HotDeploy extends Deploy {
	protected StringBuffer startScript(String host, boolean showProgressbar, Session session) throws Exception {
		String command = "(cd /tmp/seismo; ./lib/standalone/seismo.sh delaystart )";
		StringBuffer logMsg = null;
		if (showProgressbar) {
			logMsg = SshConnectionFactory.getInstance().execRemoteGUI(session, command, "Starting router conf on node " + host, shell);
		} else {
			logMsg = SshConnectionFactory.getInstance().execRemote(session, command);
		}
		return logMsg;
	}
	protected boolean busyWait() throws Exception {
		// no waiting
		return false;
	}
}

/**
 * Full deployment: reconfigure wireless device + restart click
 */
class FullDeploy extends Deploy {
	protected StringBuffer startScript(String host, boolean showProgressbar, Session session) throws Exception {
		String command = "(cd /tmp/seismo; DRIVERSETUP=yes ./lib/standalone/seismo.sh delaystart)";
		StringBuffer logMsg = null;
		if (showProgressbar) {
			logMsg = SshConnectionFactory.getInstance().execRemoteGUI(session, command, "Starting router conf on node " + host, shell);
		} else {
			logMsg = SshConnectionFactory.getInstance().execRemote(session, command);
		}
		return logMsg;
	}

	protected boolean busyWait() throws Exception {
		// wait so that the driver reconfiguration can settle down
		return true;
	}
}

/**
 * Deploy a new Click configuration to remote nodes using ssh in parallel.
 * 
 * @author zubow
 */
public abstract class Deploy extends AbstractNodeAction implements SSHParams {
	
	@Inject
	private XmlModelRepository xmlModelRepository;

	private EObject currentResult = null;
	
	public class Marker {
		public boolean value;
		
		public Marker(boolean value) {
			this.value = value;
		}
	}
	
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
	
	/**
	 * This threads is responsible for observing worker/run threads for their progress. 
	 * Based on that the progress dialog is updated.
	 */
	public class ObserverThread extends Thread {
		
		public final static int OUTSTANDING_THR = 3;
		
		private WorkerStatus[] observedThreads;
		private IProgressMonitor monitor;
		private Counter counter;
		private String title;
		private boolean wasCanceled;
		
		public ObserverThread(WorkerStatus[] observedThreads, IProgressMonitor monitor, Counter counter, String title) {
			this.observedThreads = observedThreads;
			this.monitor = monitor;
			this.counter = counter;
			this.title = title;
			this.wasCanceled = false;
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

				String monName = title + " waiting: " + (observedThreads.length-running_cnt) + " / " + (observedThreads.length);
				
				// show some more detailed information if there are only OUTSTANDING_THR-many outstanding jobs
				if (running_cnt <= OUTSTANDING_THR) {
					StringBuffer runThr = new StringBuffer();
					for (WorkerStatus worker : observedThreads) {
						if (!worker.hasFinished()) {
							runThr.append(worker.getNodeName()).append(", ");
						}
					}
					String runThr2 = runThr.toString();
					monName += " (Open: " + runThr2.substring(0, runThr2.length()-2) + ")";
				}
				
				monitor.setTaskName(monName);
				try {
					sleep(50);
				} catch (InterruptedException e) { }
				int progress = counter.get() - count_before;
				monitor.worked(progress);
				if (monitor.isCanceled()) {
					monitor.done();
					wasCanceled = true;
					// cancel all observed threads
					for (WorkerStatus worker : observedThreads) {
						worker.cancel();
					}
					return; // stop the thread
				}
			}
		}
	}
	
	/**
	 * Common interface of all worker threads 
	 */
	public interface WorkerStatus {
		public boolean hasFinished();
		public String getNodeName();
		public void cancel();
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
		//private boolean canceled;
		
		public PrepareWorkerThread(String iNodeAddr, String lfile, String md5cs, Counter counter) {
			this.iNodeAddr = iNodeAddr;
			this.lfile = lfile;
			this.md5cs = md5cs;
			this.counter = counter;
			finished = false;
			//canceled = false;
		}
		
		public void run() {
			try {
				// remote deploy
				System.out.println("deploying on node " + iNodeAddr + " called.");
				result = deployRemote(iNodeAddr, lfile, md5cs, false);
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
		
		public String getNodeName() {
			return iNodeAddr;
		}
		public void cancel() {
			//canceled = true;
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
		private boolean canceled;
		
		public RunWorkerThread(String iNodeAddr, PrepareWorkerThread prepareThr, Counter counter) {
			this.iNodeAddr = iNodeAddr;
			this.prepareThr = prepareThr;
			this.counter = counter;
			finished = false;
			canceled = false;
		}
		
		public void run() {
			// start router only if preparation phase was successful
			if (!prepareThr.failed()) {
				System.out.println("starting on node " + iNodeAddr + " called.");
				try {
					result = startRemote(iNodeAddr, false);
					if (result == null) {
						exception = new Exception("Canceled.");
					}
				} catch (Exception e) {
					System.err.println("ErrorMsg:" + e.getMessage());
					exception = e;			
				}
			} else {
				// do not start failed nodes; skipped
				exception = new Exception("Skipped.");
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
		public String getNodeName() {
			return iNodeAddr;
		}
		public void cancel() {
			canceled = true;
		}
		
		/**
		 * Start router configuration
		 */
		public String startRemote(String host, boolean showProgressbar) throws Exception {
			
			// init ssh
			Session session = SshConnectionFactory.getInstance().createSession(SSH_USER, host);

			// start
			long startTime = System.currentTimeMillis();
			String command;
			StringBuffer logMsg = startScript(host, showProgressbar, session);
			log2Sout(logMsg.append("\n").append("Starting executed in ").append((System.currentTimeMillis() - startTime) / 1000).append(" sec"));

			if (busyWait()) {
				// give some time to configure devices
				sleep(10000);
				
				// busy waiting in case the node is not reachable
				while (true) {
					int timeOut = 3000; // I recommend 3 seconds at least
					boolean status = InetAddress.getByName(host).isReachable(timeOut);
					if (status) {
						System.out.println("Host: " + host + " is available again.");
						break;
					}
					sleep(1000);
					if (canceled)
						return null;
			    }
			}
			
			// check log file after sleeping for 5 seconds
			startTime = System.currentTimeMillis();
			command = "(sleep 5; cd /tmp; cat seismo_brn.log )";
			if (showProgressbar) {
				logMsg = SshConnectionFactory.getInstance().execRemoteGUI(session, command, "Fetching log file from node " + host, shell);
			} else {
				logMsg = SshConnectionFactory.getInstance().execRemote(session, command);
			}
			String logstr = logMsg.toString();
			log2Sout(logMsg.append("\n").append("Fetching log-file executed in ").append((System.currentTimeMillis() - startTime) / 1000).append(" sec"));

			// close session
			SshConnectionFactory.getInstance().closeSession(session);
			return logstr;
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

		final Marker canceled = new Marker(false);
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
							prepareWorkerThreads[idx] = new PrepareWorkerThread(node.getINetAddress(), lfile, md5cs, counter);
							prepareWorkerThreads[idx].start();
						}
						observer.start();
						
						// sync point: wait until all worker threads are finished
						for (int i=0; i<prepareWorkerThreads.length; i++) {
							prepareWorkerThreads[i].join();
						}
						observer.join();
						
						// check if canceled
						if (observer.wasCanceled) {
							canceled.value = true;
							return;
						}
						
						//monitor.worked(counter.get());
						monitor.setTaskName("Start router conf ...");
						
						final ObserverThread observer2 = new ObserverThread(runWorkerThreads, monitor, counter, "Start router conf ...");
						//
				        // Step 2: start router in parallel
						for (int idx=0; idx<node_lst.size(); idx++) {
							final Node node = node_lst.get(idx);
				
							// do it in parallel
							runWorkerThreads[idx] = new RunWorkerThread(node.getINetAddress(), prepareWorkerThreads[idx], counter);
							runWorkerThreads[idx].start();
						}
						observer2.start();
						
						// sync point: wait until all worker threads are finished
						for (int i=0; i<runWorkerThreads.length; i++) {
							runWorkerThreads[i].join();
						}
						observer2.join();
						// check if canceled
						if (observer2.wasCanceled) {
							canceled.value = true;
							return;
						}
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
		if (!canceled.value) {
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
	}

	/**
	 * Remote deployment: clean-up, copy and unpack router conf
	 */
	public String deployRemote(String host, String lfile, String md5cs, boolean showProgressbar) throws Exception {
		
		StringBuffer results = new StringBuffer();
		// init ssh
		Session session = SshConnectionFactory.getInstance().createSession(SSH_USER, host);

		String lFileUnqualified = (new File(lfile)).getName();
		String rfile = "/tmp/" + lFileUnqualified;
		
		// clean-up old
		long startTime = System.currentTimeMillis();
		String command = "rm -rf /tmp/seismo; md5sum " + rfile + " | awk '{ print $1 }'";
		StringBuffer logMsg = null;
		if (showProgressbar) {
			logMsg = SshConnectionFactory.getInstance().execRemoteGUI(session, command, "Cleanup router conf on node " + host, shell);
		} else {
			logMsg = SshConnectionFactory.getInstance().execRemote(session, command);
		}
		log2Sout(logMsg.append("\n").append("Clean-up executed in ").append((System.currentTimeMillis() - startTime) / 1000).append(" sec"));
		results.append(logMsg);
		
		// compare checksum
		if (logMsg.toString().indexOf(md5cs) > -1) {
			String msg = "There is already a file with the same MD5 checksum; skip copying ... ";
			System.out.println(msg);
			results.append("\n").append(msg).append("\n");
		} else {
			// copy resource file to remote
			startTime = System.currentTimeMillis();
			long file_sz;
			if (showProgressbar) {
				file_sz = SshConnectionFactory.getInstance().scpToGUI(session, lfile, rfile, "Uploading router conf on node " + host, shell);
			} else {
				file_sz = SshConnectionFactory.getInstance().scpTo(session, lfile, rfile);
			}
			long tx_dur = ((System.currentTimeMillis() - startTime) / 1000);
			double avg_thr = file_sz / (double)tx_dur;
			String msg = "Copy file executed in " + tx_dur + " sec with an avg. throughput of " + avg_thr + " bytes/s";
			System.out.println(msg);
			results.append("\n").append(msg).append("\n");
		}
		
		// unpack
		startTime = System.currentTimeMillis();
		command = "(cd /tmp/; bzcat " + lFileUnqualified + " | tar xvf - )";
		if (showProgressbar) {
			logMsg = SshConnectionFactory.getInstance().execRemoteGUI(session, command, "Unpacking router conf on node " + host, shell);
		} else {
			logMsg = SshConnectionFactory.getInstance().execRemote(session, command);
		}
		log2Sout(logMsg.append("\n").append("Unpacking executed in ").append((System.currentTimeMillis() - startTime) / 1000).append(" sec"));
		results.append("\n").append(logMsg).append("\n");
		
		// close session
		SshConnectionFactory.getInstance().closeSession(session);
		results.append("closing session.\n");
		return results.toString();
	}
	
	// implemented by derived classes
	abstract protected StringBuffer startScript(String host, boolean showProgressbar, Session session) throws Exception;

	// implemented by derived classes
	abstract protected boolean busyWait() throws Exception;
	
	private void log2Sout(StringBuffer sb) {
		System.out.println(sb.toString());
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
		
		EObject result = xmlModelRepository.deserializeXml(xmlResults.toString());

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
		
		MessageDialog.openInformation(editor.getSite().getShell(), "Result stats", txtExc.toString());		
	}
}
