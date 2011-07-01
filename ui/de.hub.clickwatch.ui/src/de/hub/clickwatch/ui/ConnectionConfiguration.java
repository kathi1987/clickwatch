package de.hub.clickwatch.ui;

import java.util.Collection;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;

import de.hub.clickwatch.model.AbstractNodeConnection;
import de.hub.clickwatch.model.ChangeMark;
import de.hub.clickwatch.model.IConnectionConfiguration;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.model.presentation.ClickWatchModelEditor;
import de.hub.clickwatch.ui.util.UiThreadder;

public class ConnectionConfiguration extends UiThreadder implements IConnectionConfiguration {
	
	private IEditorPart editor = null;
	private AbstractNodeConnection connection = null;

	@Override
	public void runInModelThread(Runnable runnable) {
		runInGUI(runnable);
	}

	@Override
	public void registerModelChanges(AbstractNodeConnection connection, Node node, Collection<ChangeMark> changes) {
		if (editor instanceof ClickWatchModelEditor) {
			((ClickWatchModelEditor)editor).markChanges(node, changes);
		}
	}

	@Override
	public void handleConnect(AbstractNodeConnection connection, Object context) {
		if (context instanceof IEditorPart) {
			this.editor = (IEditorPart)context;
		}
		this.connection = connection;
		PlatformUI.getWorkbench().getActiveWorkbenchWindow().getPartService().addPartListener(closeListener);
	}

	@Override
	public void handleDisconnect(AbstractNodeConnection connection) {
		PlatformUI.getWorkbench().getActiveWorkbenchWindow().getPartService().removePartListener(closeListener);		
	}

	@Override
	public void handleIncident(int type, String message) {
		Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
		if (type == ERROR) {
			MessageDialog.openError(shell, "Error", message);
		} else if (type == WARNING) {
			MessageDialog.openWarning(shell, "Warning", message);
		}
	}
	
	private final IPartListener closeListener = new IPartListener() {

		@Override
		public void partActivated(IWorkbenchPart part) {

		}

		@Override
		public void partBroughtToTop(IWorkbenchPart part) {

		}

		@Override
		public void partClosed(IWorkbenchPart part) {
			if (editor == part) {
				connection.disconnect();
			}
		}

		@Override
		public void partDeactivated(IWorkbenchPart part) {

		}

		@Override
		public void partOpened(IWorkbenchPart part) {

		}

	};
}
