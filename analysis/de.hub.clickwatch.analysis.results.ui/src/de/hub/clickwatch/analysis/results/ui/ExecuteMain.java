package de.hub.clickwatch.analysis.results.ui;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;

import de.hub.clickwatch.main.ClickWatchExtensionPointLauncher;
import de.hub.clickwatch.util.Throwables;

public class ExecuteMain extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		final Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
		final EObject object = getSelection();
		
		String mainId = event.getParameter("id");
		final ClickWatchExtensionPointLauncher clickWatchExtensionPointLauncher = new ClickWatchExtensionPointLauncher();
		final Map<String, IConfigurationElement> extensions = clickWatchExtensionPointLauncher.getExtensions();

		final IConfigurationElement extension = extensions.get(mainId);
		ProgressMonitorDialog progressDialog = new ProgressMonitorDialog(shell);
		try {
			progressDialog.run(true, false, new IRunnableWithProgress() {
				@Override
				public void run(IProgressMonitor monitor) throws InvocationTargetException,
						InterruptedException {
					try {
						clickWatchExtensionPointLauncher.launch(extension, object, ResultsUIPlugin.getInstance().getBundle(), monitor);
					} catch (final Exception e) {
						shell.getDisplay().syncExec(new Runnable() {
							@Override
							public void run() {
								MessageDialog.openError(shell, "Error in main", "Exception while executing main: " + e.getMessage());		
							}
						});
					}		
				}
			});
		} catch (Exception e) {
			Throwables.propagate(e);
		}
		return null;
	}
		
	@Override
	public boolean isHandled() {
		return getSelection() != null;
	}

	private EObject getSelection() {
		ISelection selection = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActivePart().getSite().getSelectionProvider().getSelection();
		if (selection instanceof IStructuredSelection) {
			Object firstElement = ((IStructuredSelection)selection).getFirstElement();
			if (firstElement != null && firstElement instanceof EObject) {
				return (EObject)firstElement;
			}
		}
		return null;
	}
}
