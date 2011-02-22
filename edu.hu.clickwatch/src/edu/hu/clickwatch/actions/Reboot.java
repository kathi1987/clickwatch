package edu.hu.clickwatch.actions;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
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
 * Reboots a node using SSH.
 * 
 * @author zubow
 */
public class Reboot implements IObjectActionDelegate {

	private IEditorPart editor = null;
	private List<Node> node_lst;

	public Reboot() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		if (targetPart instanceof IEditorPart) {
			editor = (IEditorPart)targetPart;
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
	
		String cmd = "reboot";
		
		//  create n parallel execution threads
		ExecWorkerThread[] workerThreads = new ExecWorkerThread[node_lst.size()];
		for (int idx=0; idx<node_lst.size(); idx++) {
			final Node node = node_lst.get(idx);

			// disconnect if connected
			if (node.getConnection() != null) {
				AbstractNodeConnection oldConnection = (AbstractNodeConnection)node.getConnection();
				node.setConnection(null);
				oldConnection.disconnect();
			}

			workerThreads[idx] = new ExecWorkerThread(node.getINetAdress(), cmd);
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
