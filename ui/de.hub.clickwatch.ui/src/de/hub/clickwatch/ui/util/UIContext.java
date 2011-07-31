package de.hub.clickwatch.ui.util;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;

import com.google.inject.Singleton;

@Singleton
public class UIContext implements IUIContext {
	
	public void openError(String title, String message) {
		MessageDialog.openError(getDisplay().getActiveShell(), title, message);
	}

	public void openWarning(String title, String message) {
		MessageDialog.openWarning(getDisplay().getActiveShell(), title, message);
	}
	
	protected Display getDisplay() {
		return PlatformUI.getWorkbench().getDisplay();
	}

	@Override
	public <T> T getAdapter(Class<T> adapterClass) {
		return null;
	}

	public void runInGUI(final Runnable runnable) {
		getDisplay().syncExec(new Runnable() {
			@Override
			public void run() {
				try {
					runnable.run();
				} catch (RuntimeException e) {
					openError("Exception", "Exception " + e.getClass().getName()
									+ " occured: " + e.getMessage()
									+ ". Node is forced to disconnect.");
				}
			}
		});
	}

	public void runInExtraThread(final Runnable runnable) {
		new Thread() {
			@Override
			public void run() {
				try {
					runnable.run();
				} catch (final RuntimeException e) {
					runInGUI(new Runnable() {
						@Override
						public void run() {
							openError("Exception", "Exception " + e.getClass().getName() + " occured: " + e.getMessage());
						}
					});
				}
			}
		}.start();
	}
}
