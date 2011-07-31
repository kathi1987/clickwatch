package de.hub.clickwatch.ui.connection;

import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;

import de.hub.clickwatch.model.presentation.ClickWatchModelEditor;
import de.hub.clickwatch.ui.util.UIContext;

public class ClickWatchUIContext extends UIContext {

	@SuppressWarnings("unchecked")
	@Override
	public <T> T getAdapter(Class<T> adapterClass) {
		if (adapterClass == ClickWatchModelEditor.class) {
			IEditorPart editor = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
			if (editor != null && editor instanceof ClickWatchModelEditor) {
				return (T)editor;
			}
		} else if (adapterClass == IWorkbench.class) {
			return (T)PlatformUI.getWorkbench();
		}
		
		return super.getAdapter(adapterClass);
	}
}
