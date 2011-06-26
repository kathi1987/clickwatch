package de.hub.clickwatch.ui.util;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;

public class UiThreadder {
	
	protected void showMessage(String title, String message) {
		MessageDialog.openError(getDisplay().getActiveShell(), title, message);
	}

	protected Display getDisplay() {
		return PlatformUI.getWorkbench().getDisplay();
	}

	public void runInGUI(final Runnable runnable) {
		getDisplay().syncExec(new Runnable() {
			@Override
			public void run() {
				try {
					runnable.run();
				} catch (RuntimeException e) {
					showMessage("Exception", "Exception " + e.getClass().getName()
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
							showMessage("Exception", "Exception " + e.getClass().getName() + " occured: " + e.getMessage());
						}
					});
				}
			}
		}.start();
	}
}
