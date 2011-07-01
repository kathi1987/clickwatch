package de.hub.clickwatch.analysis.ui;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.ui.dialogs.WorkspaceResourceDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

import de.hub.clickwatch.analysis.specificmodels.ClickWatchHelper;


public class CreateConcreteModelsHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IStructuredSelection selection = (IStructuredSelection) HandlerUtil.getActiveMenuSelection(event);
		IFile genericModelFile = (IFile)selection.getFirstElement();

		Shell activeShell = PlatformUI.getWorkbench().getDisplay().getActiveShell();
		IContainer[] directories = WorkspaceResourceDialog.openFolderSelection(activeShell, 
				"Select target directory", "Select target directory", false, null, null);
		IContainer targetDirectory = directories[0];
		
		try {
			ClickWatchHelper.generateSpecificModels(genericModelFile, targetDirectory);
		} catch (Exception e) {
			MessageDialog.openError(activeShell, "Error", "Could not generate models: " + e.getMessage());
			e.printStackTrace();
		}
		
		return null;
	}

	
}
