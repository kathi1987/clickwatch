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
        
		// show log files only for single node deployment
		boolean show_log = (node_lst.size() == 1) ? true : false;
		
        Iterator<Node> node_it = node_lst.iterator();
        List<Boolean> mask = new ArrayList<Boolean>();
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
			
			try {
				// remote deploy
				System.out.println("deploying on node " + node.getINetAdress() + " called.");
				DeploymentHelper.getInstance().deployRemote(node.getINetAdress(), lfile, md5cs, shell, true);
				mask.add(true);
			} catch (Exception e) {
				System.err.println("ErrorMsg:" + e.getMessage());
				MessageDialog.openError(editor.getSite().getShell(), "Clickwatch Error", "ErrorMsg:" + e.getMessage());			
				mask.add(false);
			}
		}

        node_it = node_lst.iterator();
        Iterator<Boolean> mask_it = mask.iterator();
		//
        // Step 2: start router conf
		while (node_it.hasNext()) {
			Node node = node_it.next();
			Boolean status = mask_it.next();

			// remote deploy
			if (status) {
				System.out.println("starting on node " + node.getINetAdress() + " called.");
				try {
					String remoteLog = DeploymentHelper.getInstance().startRemote(node.getINetAdress(), shell, true);
					if (show_log) {
						MessageDialog.openInformation(editor.getSite().getShell(), "Clickwatch Log Info", "Remote Log: " + remoteLog);			
					}
				} catch (Exception e) {
					System.err.println("ErrorMsg:" + e.getMessage());
					MessageDialog.openError(editor.getSite().getShell(), "Clickwatch Error", "ErrorMsg:" + e.getMessage());			
				}
			} else {
				// do not start failed nodes
			}
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
}
