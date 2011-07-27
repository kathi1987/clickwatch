package de.hub.clickwatch.ui.modelactions;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Dialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IViewReference;
import org.eclipse.ui.IWorkbenchPart;

import com.google.inject.Inject;
import com.jcraft.jsch.Session;

import de.hub.clickwatch.connection.INodeConnection;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.ui.util.SshConnectionFactory;
import de.hub.clickwatch.ui.views.ResultView;
import de.hub.emfxml.XmlModelRepository;

/**
 * Executes shell commands in parallel on each node using SSH.
 * 
 * @author zubow
 */
class ExecWorkerThread extends Thread {
	
	public String iNodeAddr;
	public String cmd;
	public String result;
	public Exception exception;
	public long latency; // in ms
	
	public ExecWorkerThread(String iNodeAddr, String cmd) {
		this.iNodeAddr = iNodeAddr;
		this.cmd = cmd;
	}
	
	public void run() {
		// remote execute
		System.out.println("cmd " + cmd + " on node " + iNodeAddr + " called.");
		try {
			result = execRemote(iNodeAddr, cmd);
		} catch (Exception e) {
			System.err.println("ErrorMsg:" + e.getMessage());
			exception = e;
		}
	}
	
	private String execRemote(String host, String command) throws Exception {
		
		// init ssh
		long start = System.currentTimeMillis();
		Session session = SshConnectionFactory.getInstance().createSession(SSHParams.SSH_USER, host);

		StringBuffer logMsg = SshConnectionFactory.getInstance().execRemote(session, command);
		log2Sout(logMsg);
		
		// close session
		SshConnectionFactory.getInstance().closeSession(session);
		
		latency = System.currentTimeMillis() - start;
		
		return logMsg.toString();
	}

	private void log2Sout(StringBuffer sb) {
		System.out.println(sb.toString());
	}
}

/**
 * Exec remote code via ssh.
 * @author zubow
 */
public class Execute extends AbstractNodeAction {
	
	@Inject
	private XmlModelRepository xmlModelRepository;

	private EObject currentResult = null;

	/**
	 * GUI dialog for entering a command to be remotely executed 
	 */
	public class InputDialog extends Dialog {

		private String cmdMessage;
		private String cmdInput;
		
		/**
		 * InputDialog constructor
		 */
		public InputDialog(Shell parent) {
			// Pass the default styles here
			this(parent, SWT.DIALOG_TRIM | SWT.APPLICATION_MODAL);
		}

		/**
		 * InputDialog constructor
		 */
		public InputDialog(Shell parent, int style) {
			// Let users override the default styles
			super(parent, style);
			setText("Node configuration");
			setCmdMessage("Command to execute:");
			setCmdInput("");
		}

		public String getCmdMessage() {
			return cmdMessage;
		}

		public void setCmdMessage(String cmdMessage) {
			this.cmdMessage = cmdMessage;
		}

		public String getCmdInput() {
			return cmdInput;
		}

		public void setCmdInput(String cmdInput) {
			this.cmdInput = cmdInput;
		}

		/**
		 * Opens the dialog ...
		 */
		public void open() {
			// Create the dialog window
			Shell shell = new Shell(getParent(), getStyle());
			shell.setText(getText());
			createContents(shell);
			shell.pack();
			shell.open();
			Display display = getParent().getDisplay();
			while (!shell.isDisposed()) {
				if (!display.readAndDispatch()) {
					display.sleep();
				}
			}
		}

		/**
		 * Creates the dialog's contents
		 */
		private void createContents(final Shell shell) {
			shell.setLayout(new GridLayout(2, true));

			//
			// command
			Label label = new Label(shell, SWT.NONE);
			label.setText(cmdMessage);
			GridData data = new GridData();
			data.horizontalSpan = 2;
			label.setLayoutData(data);
			
			// input box
			final Text cmdText = new Text(shell, SWT.BORDER);
			//cmdText.setSize(64, 32);
			cmdText.setText("cat /proc/cpuinfo                             ");
			data = new GridData(GridData.FILL_HORIZONTAL);
			data.horizontalSpan = 2;
			cmdText.setLayoutData(data);

			// Create the OK button and add a handler
			// so that pressing it will set input
			// to the entered value
			Button ok = new Button(shell, SWT.PUSH);
			ok.setText("Exec");
			data = new GridData(GridData.FILL_HORIZONTAL);
			ok.setLayoutData(data);
			ok.addSelectionListener(new SelectionAdapter() {
				public void widgetSelected(SelectionEvent event) {
					cmdInput = cmdText.getText();
					shell.close();
				}
			});

			// Create the cancel button and add a handler
			// so that pressing it will set input to null
			Button cancel = new Button(shell, SWT.PUSH);
			cancel.setText("Cancel");
			data = new GridData(GridData.FILL_HORIZONTAL);
			cancel.setLayoutData(data);
			cancel.addSelectionListener(new SelectionAdapter() {
				public void widgetSelected(SelectionEvent event) {
					cmdInput = null;
					shell.close();
				}
			});

			// Set the OK button as the default, so
			// user can type input and press Enter
			// to dismiss
			shell.setDefaultButton(ok);
		}
	}	
	
	/**
	 * Constructor for Execute action.
	 */
	public Execute() {
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
		if (selectedObjects == null || selectedObjects.isEmpty()) {
			return;
		}
		
		// ask user for command to execute
		InputDialog diag = new InputDialog(editor.getSite().getShell());
		diag.open();
		
		final String cmd = diag.getCmdInput();
		
		if (cmd == null) {
			return;
		}
		
		// show exec result directly via popup only if a single node was selected otherwise go into batch mode
		// final boolean show_log = (node_lst.size() == 1) ? true : false;

		//  create n parallel execution threads
		ExecWorkerThread[] workerThreads = new ExecWorkerThread[selectedObjects.size()];
		for (int idx=0; idx<selectedObjects.size(); idx++) {
			final Node node = selectedObjects.get(idx);

			// disconnect if connected
			if (node.getConnection() != null) {
				INodeConnection oldConnection = (INodeConnection)node.getConnection();
				node.setConnection(null);
				oldConnection.disconnect();
			}

			workerThreads[idx] = new ExecWorkerThread(node.getINetAddress(), cmd);
			workerThreads[idx].start();
		}
		
		// sync point: wait until all worker threads are finished
		for (int i=0; i<workerThreads.length; i++) {
			try {
				workerThreads[i].join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
        final List<String> results = new ArrayList<String>();
        final List<Long> latency = new ArrayList<Long>();
        final List<String> nodeNames = new ArrayList<String>();
        final List<Exception> exceptions = new ArrayList<Exception>();
		for (int i=0; i<workerThreads.length; i++) {
			results.add(workerThreads[i].result);
			latency.add(workerThreads[i].latency);
			nodeNames.add(workerThreads[i].iNodeAddr);
			exceptions.add(workerThreads[i].exception);
		}
			
        // show results in treeview
		showResults(results, nodeNames, latency);
		
		// show exceptions in popup window
		showExceptions(nodeNames, exceptions);
	}
	
	/**
	 * Update results in resultview 
	 */
	private void showResults(List<String> results, List<String> nodeNames, List<Long> latency) {

		// create xml from results string
		StringBuffer xmlResults = new StringBuffer();
		xmlResults.append("<network>");
		for (int i=0; i<results.size(); i++) {
			xmlResults.append("<node id='" + nodeNames.get(i) + "' latency='" + latency.get(i) + "'>");
			xmlResults.append(results.get(i));
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

	private void showExceptions(List<String> nodeNames, List<Exception> exceptions) {
		StringBuffer txtExc = new StringBuffer();
		for (int i=0; i<exceptions.size(); i++) {
			txtExc.append("Node ").append(nodeNames.get(i)).append(" -> ");
			if (exceptions.get(i) != null) {
				txtExc.append(exceptions.get(i).getMessage());
			} else {
				txtExc.append("OK");
			}
			txtExc.append("\n");
		}
		
		MessageDialog.openError(editor.getSite().getShell(), "Result stats", txtExc.toString());		
	}
}
