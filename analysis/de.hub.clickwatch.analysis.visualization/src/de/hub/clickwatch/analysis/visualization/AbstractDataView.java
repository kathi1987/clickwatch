package de.hub.clickwatch.analysis.visualization;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.part.ViewPart;

import de.hub.clickwatch.util.Throwables;

public abstract class AbstractDataView extends ViewPart implements ISelectionListener {
	
	private static final String visualizationInputPorviderExtensionId = "de.hub.clickwatch.analysis.VisualizationInputProvider";
	private static List<IVisualizationInputProvider> providersCache = null;
	
	protected abstract void setInput(Object input);

	public void createPartControl(Composite parent) {		
		getViewSite().getPage().addSelectionListener(this);
	}

	@Override
	public final void selectionChanged(IWorkbenchPart part, ISelection selection) {
		for (IVisualizationInputProvider provider: getVisualizationInputProviders()) {
			Object providedInput = provider.getInput(part, selection);
			if (providedInput != null) {
				setInput(providedInput);
				return;
			}
		}
		setInput(null);
	}

	@Override
	public void setFocus() {
		//empty
	}
	
	private List<IVisualizationInputProvider> getVisualizationInputProviders() {
		if (providersCache == null) {
			List<IVisualizationInputProvider> result = new ArrayList<IVisualizationInputProvider>();
			IConfigurationElement[] configs = Platform.getExtensionRegistry().getConfigurationElementsFor(visualizationInputPorviderExtensionId);
			for (IConfigurationElement config: configs) {
				try {
					IVisualizationInputProvider provider = (IVisualizationInputProvider)config.createExecutableExtension("class");
					result.add(provider);
				} catch (CoreException e) {
					Throwables.propagate(e);
				}
			}
			return providersCache = result;
		}
		return providersCache;
	}	
}