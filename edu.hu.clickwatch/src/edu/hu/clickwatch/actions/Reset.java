package edu.hu.clickwatch.actions;

import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import edu.hu.clickwatch.model.Handler;
import edu.hu.clickwatch.model.Network;

public class Reset implements IObjectActionDelegate {

	private Shell shell;
	private Network network;
	
	/**
	 * Constructor for Action1.
	 */
	public Reset() {
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
		if (network == null) {
			return;
		}
		
		Iterator<EObject> allContents = network.eAllContents();
		while (allContents.hasNext()) {
			EObject next = allContents.next();
			if (next instanceof Handler) {
				((Handler)next).setChanged(false);
			}
		}
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		try {
			network = (Network)((IStructuredSelection)selection).getFirstElement();
		} catch (Exception e) {
			MessageDialog.openError(shell, "Clickwatch Error", "You can only call this action on a single Node");
			// TODO
		}
	}

}
