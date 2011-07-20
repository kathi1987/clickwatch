package de.hub.clickwatch.ui.modelactions;

import java.util.Iterator;
import java.util.List;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

public abstract class AbstractAction<T> implements IObjectActionDelegate {

	protected Shell shell;
	protected IEditorPart editor;
	protected Iterator<T> selectedObjectsIterator;
	protected List<T> selectedObjects;

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		if (targetPart instanceof IEditorPart) {
			shell = targetPart.getSite().getShell();
			editor = (IEditorPart)targetPart;
		}
	}


	@Override
	@SuppressWarnings("unchecked")
	public void selectionChanged(IAction action, ISelection selection) {
		try {
			IStructuredSelection sec = ((IStructuredSelection)selection);
			selectedObjectsIterator = sec.iterator();
			selectedObjects = sec.toList();
		} catch (Exception e) {
			MessageDialog.openError(editor.getSite().getShell(), "Clickwatch Error", "ErrorMsg:" + e.getMessage());
		}
	}
}
