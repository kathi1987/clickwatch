package edu.hu.clickwatch.popup.actions;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import edu.hu.clickwatch.model.Connection;
import edu.hu.clickwatch.model.Node;

public class Disconnect implements IObjectActionDelegate {

	private Shell shell;
	private Node node;
	
	/**
	 * Constructor for Action1.
	 */
	public Disconnect() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		if (node == null) {
			return;
		}
		
		if (node.getConnection() != null) {
			Connection oldConnection = (Connection)node.getConnection();
			node.setConnection(null);
			oldConnection.disconnect();
		}
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		try {
			node = (Node)((IStructuredSelection)selection).getFirstElement();
		} catch (Exception e) {
			MessageDialog.openError(shell, "Clickwatch Error", "You can only call this action on a single Node");
			// TODO
		}
	}

}
