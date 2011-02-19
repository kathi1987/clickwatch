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
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
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
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;

import com.google.inject.Guice;
import com.jcraft.jsch.*;

import edu.hu.clickwatch.ClickWatchPluginActivator;
import edu.hu.clickwatch.GuiceModule;
import edu.hu.clickwatch.model.AbstractNodeConnection;
import edu.hu.clickwatch.model.ClickControlNodeConnection;
import edu.hu.clickwatch.model.MultiNode;
import edu.hu.clickwatch.model.MultiNodeNodeConnection;
import edu.hu.clickwatch.model.Node;
import edu.hu.clickwatch.util.SshConnectionFactory;

/**
 * Deploy a new Click configuration to remote nodes via ssh.
 * @author zubow
 */
public class Deploy implements IObjectActionDelegate {

	public final static String SSH_USER = "root";
	
	private Shell shell;
	private IEditorPart editor = null;
	private List<Node> node_lst;

	/**
	 * Constructor for Action1.
	 */
	public Deploy() {
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
        String lfile = fd.open();
        
        if (lfile == null) {
        	return;
        }

        //
        // Step 0: calc MD5 checksum
        String md5cs = "";
        FileInputStream fis;
		try {
			fis = new FileInputStream( new File(lfile) );
	        md5cs = org.apache.commons.codec.digest.DigestUtils.md5Hex( fis );
		} catch (Exception e1) {
			System.err.println("ErrorMsg:" + e1.getMessage());
			MessageDialog.openError(editor.getSite().getShell(), "Clickwatch Error", "ErrorMsg:" + e1.getMessage());
		}
        
        Iterator<Node> node_it = node_lst.iterator();
		//
        // Step 1: prepare, copy and unpack router conf
		while (node_it.hasNext()) {
			Node node = node_it.next();

			// disconnect if connected
			if (node.getConnection() != null) {
				AbstractNodeConnection oldConnection = (AbstractNodeConnection)node.getConnection();
				node.setConnection(null);
				oldConnection.disconnect();
			}
			
			// remote deploy
			System.out.println("deploying on node " + node.getINetAdress() + " called.");
			try {
				deployRemote(node.getINetAdress(), lfile, md5cs);
			} catch (Exception e) {
				System.err.println("ErrorMsg:" + e.getMessage());
				MessageDialog.openError(editor.getSite().getShell(), "Clickwatch Error", "ErrorMsg:" + e.getMessage());			}
		}

        node_it = node_lst.iterator();
		//
        // Step 2: start router conf
		while (node_it.hasNext()) {
			Node node = node_it.next();

			// remote deploy
			System.out.println("starting on node " + node.getINetAdress() + " called.");
			try {
				startRemote(node.getINetAdress());
			} catch (Exception e) {
				System.err.println("ErrorMsg:" + e.getMessage());
				MessageDialog.openError(editor.getSite().getShell(), "Clickwatch Error", "ErrorMsg:" + e.getMessage());			}
		}
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

	private void deployRemote(String host, String lfile, String md5cs) throws Exception {
		
		// init ssh
		Session session = SshConnectionFactory.getInstance().createSession(SSH_USER, host);

		String lFileUnqualified = (new File(lfile)).getName();
		String rfile = "/tmp/" + lFileUnqualified;
		
		// clean-up old
		long startTime = System.currentTimeMillis();
		String command = "rm -rf /tmp/seismo; md5sum " + rfile + " | awk '{ print $1 }'";
		StringBuffer logMsg = SshConnectionFactory.getInstance().execRemote(session, command, "Cleanup router conf on node " + host, shell);
		log2Sout(logMsg.append("\n").append("Clean-up executed in ").append((System.currentTimeMillis() - startTime) / 1000).append(" sec"));
		
		// compare checksum
		if (logMsg.toString().indexOf(md5cs) > -1) {
			System.out.println("There is already a file with the same MD5 checksum; skip copying ... ");
		} else {
			// copy resource file to remote
			startTime = System.currentTimeMillis();
			SshConnectionFactory.getInstance().scpTo(session, lfile, rfile, "Uploading router conf on node " + host, shell);
			System.out.println("Copy file executed in " + ((System.currentTimeMillis() - startTime) / 1000) + " sec");
		}
		
		// unpack
		startTime = System.currentTimeMillis();
		command = "(cd /tmp/; bzcat " + lFileUnqualified + " | tar xvf - )";
		logMsg = SshConnectionFactory.getInstance().execRemote(session, command, "Unpacking router conf on node " + host, shell);
		log2Sout(logMsg.append("\n").append("Unpacking executed in ").append((System.currentTimeMillis() - startTime) / 1000).append(" sec"));
		
		// close session
		SshConnectionFactory.getInstance().closeSession(session);
	}
	
	private void startRemote(String host) throws Exception {
		
		// init ssh
		Session session = SshConnectionFactory.getInstance().createSession(SSH_USER, host);

		// start
		long startTime = System.currentTimeMillis();
		String command = "(cd /tmp/seismo; ./bin/seismo.sh delaystart )";
		StringBuffer logMsg = SshConnectionFactory.getInstance().execRemote(session, command, "Starting router conf on node " + host, shell);
		log2Sout(logMsg.append("\n").append("Starting executed in ").append((System.currentTimeMillis() - startTime) / 1000).append(" sec"));
		
		// check log file after sleeping for 5 seconds
		startTime = System.currentTimeMillis();
		command = "(sleep 5; cd /tmp; cat seismo_brn.log )";
		logMsg = SshConnectionFactory.getInstance().execRemote(session, command, "Fetching log file from node " + host, shell);
		log2Sout(logMsg.append("\n").append("Fetching log-file executed in ").append((System.currentTimeMillis() - startTime) / 1000).append(" sec"));

		// close session
		SshConnectionFactory.getInstance().closeSession(session);
	}
	
	private void log2Sout(StringBuffer sb) {
		System.out.println(sb.toString());
	}
}
