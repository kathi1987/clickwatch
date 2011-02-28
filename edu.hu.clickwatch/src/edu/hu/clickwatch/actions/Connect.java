package edu.hu.clickwatch.actions;

import java.util.Iterator;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import edu.hu.clickwatch.ClickWatchPluginActivator;
import edu.hu.clickwatch.model.AbstractNodeConnection;
import edu.hu.clickwatch.model.ClickControlNodeConnection;
import edu.hu.clickwatch.model.MultiNode;
import edu.hu.clickwatch.model.MultiNodeNodeConnection;
import edu.hu.clickwatch.model.Node;

/**
 * Establish a connection to the remote node via the click control element.
 *  
 * @author zubow
 */
public class Connect implements IObjectActionDelegate {

	private IEditorPart editor = null;
	private Iterator<Node> node_it;
	
	/**
	 * Constructor for Action1.
	 */
	public Connect() {
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
		if (node_it == null) {
			return;
		}
		
		AbstractNodeConnection nodeConnection = null;
		while (node_it.hasNext()) {
			Node node = node_it.next();
			if (node.getConnection() == null || !node.isConnected()) {
				if (node instanceof MultiNode) {
					nodeConnection = ClickWatchPluginActivator.getInstance().getInjector().getInstance(MultiNodeNodeConnection.class);
				} else {
					nodeConnection = ClickWatchPluginActivator.getInstance().getInjector().getInstance(ClickControlNodeConnection.class);
				}
				node.setConnection(nodeConnection);
				nodeConnection.setUp(node);
				nodeConnection.connect(editor);
			} else {
				System.out.println("Already connected");
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
			node_it = sec.iterator();
		} catch (Exception e) {
			MessageDialog.openError(editor.getSite().getShell(), "Clickwatch Error", "ErrorMsg:" + e.getMessage());
		}
	}

}
