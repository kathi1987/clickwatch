package de.hub.clickwatch.ui.modelactions;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;

import de.hub.clickwatch.main.ClickWatchExtensionPointLauncher;
import de.hub.clickwatch.ui.PluginActivator;
import de.hub.clickwatch.util.Throwables;


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
		final ClickWatchExtensionPointLauncher clickWatchExtensionPointLauncher = new ClickWatchExtensionPointLauncher();
		final Map<String, IConfigurationElement> extensions = clickWatchExtensionPointLauncher.getExtensions();
		if (!extensions.keySet().isEmpty()) {
			final IConfigurationElement extension = extensions.get(extensions.keySet().iterator().next());
			ProgressMonitorDialog progressDialog = new ProgressMonitorDialog(shell);
			try {
				progressDialog.run(true, false, new IRunnableWithProgress() {
					@Override
					public void run(IProgressMonitor monitor) throws InvocationTargetException,
							InterruptedException {
						try {
							clickWatchExtensionPointLauncher.launch(extension, object, PluginActivator.getInstance().getBundle(), monitor);
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
		}
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		try {
			object = (EObject) ((IStructuredSelection) selection).getFirstElement();
		} catch (Exception e) {
			MessageDialog.openError(shell, "Clickwatch Error",
					"You can only call this action on an ClickWatch model element");
		}
	}

}
