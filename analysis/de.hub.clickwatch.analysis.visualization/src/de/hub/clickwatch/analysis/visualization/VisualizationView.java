package de.hub.clickwatch.analysis.visualization;

import java.awt.Frame;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.swt.SWT;
import org.eclipse.swt.awt.SWT_AWT;
import org.eclipse.swt.widgets.Composite;

import de.hub.clickwatch.util.Throwables;

public class VisualizationView extends AbstractDataView {
	
	private static final String visualizationExtensionId = "de.hub.clickwatch.analysis.Visualization";
	private static List<IVisualization> providersCache = null;
	
	public static final String ID = "edu.hu.clickwatch.analysis.composition.VisualizationView";
	
	private Frame frame = null;
	
	protected void setInput(Object input) {
		for (IVisualization visualization: getVisualizations()) {
			if (visualization.isEnabledForInput(input)) {
				frame.removeAll();
				frame.setVisible(false);
				
				frame.add(visualization.createVisualization(input));
				frame.setVisible(true);
				return;
			}
		}
	}


	public void createPartControl(Composite parent) {
		super.createPartControl(parent);
		Composite composite = new Composite(parent, SWT.EMBEDDED | SWT.NO_BACKGROUND);
	    frame = SWT_AWT.new_Frame(composite);
	    frame.pack();
	}
	
	private List<IVisualization> getVisualizations() {
		if (providersCache == null) {
			List<IVisualization> result = new ArrayList<IVisualization>();
			IConfigurationElement[] configs = Platform.getExtensionRegistry().getConfigurationElementsFor(visualizationExtensionId);
			for (IConfigurationElement config: configs) {
				try {
					IVisualization provider = (IVisualization)config.createExecutableExtension("class");
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