package de.hub.clickwatch.ui.util;

import com.google.inject.ImplementedBy;

@ImplementedBy(UIContext.class)
public interface IUIContext {
	
	public void openError(String title, String message);
	
	public void openWarning(String title, String message);
	
	public void runInGUI(final Runnable runnable);

	public void runInExtraThread(final Runnable runnable);
	
	public <T> T getAdapter(Class<T> adapterClass);
	
}
