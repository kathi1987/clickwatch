package de.hub.clickwatch.ui.modelactions;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import de.hub.clickwatch.main.ClickWatchExtensionPointLauncher;


public class ExecuteClickWatchMain implements IObjectActionDelegate {

	private Shell shell;
	private EObject object;

	public ExecuteClickWatchMain() {
		super();
	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
	}


	@Override
	public void run(IAction action) {
		ClickWatchExtensionPointLauncher clickWatchExtensionPointLauncher = new ClickWatchExtensionPointLauncher();
		clickWatchExtensionPointLauncher.getExtensions();
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		try {
			object = (EObject) ((IStructuredSelection) selection)
					.getFirstElement();
		} catch (Exception e) {
			MessageDialog.openError(shell, "Clickwatch Error",
					"You can only call this action on an ClickWatch model element");
		}
	}

}
