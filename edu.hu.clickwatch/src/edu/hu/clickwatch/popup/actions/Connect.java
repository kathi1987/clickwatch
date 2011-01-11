package edu.hu.clickwatch.popup.actions;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import com.google.inject.Guice;

import edu.hu.clickwatch.GuiceModule;
import edu.hu.clickwatch.model.ClickControlNodeConnection;
import edu.hu.clickwatch.model.MultiNode;
import edu.hu.clickwatch.model.MultiNodeNodeConnection;
import edu.hu.clickwatch.model.Node;
import edu.hu.clickwatch.model.AbstractNodeConnection;

public class Connect implements IObjectActionDelegate {

	private IEditorPart editor = null;
	private Node node;
	
	/**
	 * Constructor for Action1.
	 */
	public Connect() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		if (targetPart instanceof IEditorPart) {
			editor = (IEditorPart)targetPart;
		}
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		if (node == null) {
			return;
		}
		
		AbstractNodeConnection nodeConnection = null;
		if (node instanceof MultiNode) {
			nodeConnection = Guice.createInjector(new GuiceModule()).getInstance(MultiNodeNodeConnection.class);
		} else {
			nodeConnection = Guice.createInjector(new GuiceModule()).getInstance(ClickControlNodeConnection.class);
		}
		node.setConnection(nodeConnection);
		nodeConnection.setUp(node);
		nodeConnection.connect(editor);
		
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		try {
			node = (Node)((IStructuredSelection)selection).getFirstElement();
		} catch (Exception e) {
			MessageDialog.openError(editor.getSite().getShell(), "Clickwatch Error", "You can only call this action on a single Node");
		}
	}

}
