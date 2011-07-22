package de.hub.clickwatch.analysis.ui;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.ui.dialogs.WorkspaceResourceDialog;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

import com.google.inject.Inject;

import de.hub.specificmodels.metamodelgenerator.MetaModelGenerator;
import de.hub.specificmodels.modelgenerator.ModelGenerator;

public class ExecuteTransformationHandler extends AbstractHandler {

	@Inject
	MetaModelGenerator metaModelGenerator;
	@Inject
	ModelGenerator modelGenerator;
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// HandlerUtil.getActiveWorkbenchWindow(event)
		
		IStructuredSelection selection = (IStructuredSelection) HandlerUtil.getActiveMenuSelection(event);
		final IFile genericModelFile = (IFile)selection.getFirstElement();
		final Shell activeShell = PlatformUI.getWorkbench().getDisplay().getActiveShell();
		
		/*IContainer[] directories = WorkspaceResourceDialog.openFolderSelection(activeShell, 
				"Select target directory", "Select target directory", false, null, null);
		final IContainer targetDirectory = directories[0];		*/
			
		//ProgressMonitorDialog dialog = new ProgressMonitorDialog(activeShell);
		
		Dialog configureTransfDialog = new TransformationDialog(activeShell);
		if(configureTransfDialog.open() == Dialog.OK)
		{
			
		}
		
		return null;
	}

}
