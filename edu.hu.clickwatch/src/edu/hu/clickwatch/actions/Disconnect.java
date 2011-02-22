package edu.hu.clickwatch.actions;

import java.util.Iterator;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import edu.hu.clickwatch.model.AbstractNodeConnection;
import edu.hu.clickwatch.model.Node;

/**
 * Closes a connection to a remote node (click control element) 
 * 
 * @author zubow
 */
public class Disconnect implements IObjectActionDelegate {

	private Shell shell;
	private Iterator<Node> node_it;
	
	public Disconnect() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	@Override
	public void run(IAction action) {
		if (node_it == null) {
			return;
		}
		
		while (node_it.hasNext()) {
			Node node = node_it.next();
			
			if (node.getConnection() != null) {
				AbstractNodeConnection oldConnection = (AbstractNodeConnection)node.getConnection();
				node.setConnection(null);
				oldConnection.disconnect();
			}
		}
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		try {
			node_it = ((IStructuredSelection)selection).iterator();
		} catch (Exception e) {
			MessageDialog.openError(shell, "Clickwatch Error", "ErrorMsg:" + e.getMessage());
		}
	}

}
