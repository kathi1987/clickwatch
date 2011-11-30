package de.hub.clickwatch.analysis.results.ui;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import de.hub.clickwatch.analysis.results.Result;
import de.hub.clickwatch.analysis.results.Results;

public class ExportCSVAction implements IObjectActionDelegate {

	private Object slectionObject = null;
	private Shell shell = null;
	
	@Override
	public void run(IAction action) {
		FileDialog fd = new FileDialog(shell, SWT.SAVE);
        fd.setText("Open");
        String[] filterExt = { "*.txt", "*.*" };
        fd.setFilterExtensions(filterExt);
        String fileName = fd.open();
        if (fileName == null) {
            // user cancled
            return;
        }
        
        if (this.slectionObject instanceof Results) {
        	((Results)slectionObject).exportCSV(fileName);
        } else if (this.slectionObject instanceof Result) {
        	((Result)slectionObject).exportCSV(fileName);
        } else {
        	MessageDialog.openError(shell, "Not available", "Export is only available for Results and Result");
        }
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		slectionObject = ((IStructuredSelection)selection).getFirstElement();
	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		this.shell = targetPart.getSite().getShell();
	}

}
