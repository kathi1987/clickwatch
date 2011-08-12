package de.hub.clickwatch.analysis.visualization;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;

public class VisualizationsUtil {

	public static Map<String, IVisualization> getVisualizations() {
		Map<String, IVisualization> result = new HashMap<String, IVisualization>();
		for (IConfigurationElement configurationElement: Platform.getExtensionRegistry()
				.getConfigurationElementsFor("edu.hu.clickwatch.analysis.composition.Visualization")) {
			String name = configurationElement.getAttribute("name");
			IVisualization visualization = null;
			try {
				Object o = configurationElement.createExecutableExtension("class");				
				if (o instanceof IVisualization) {
					 visualization = (IVisualization)o;
				}
			} catch (CoreException e) {

			}
			if (name != null && visualization != null) {
				result.put(name, visualization);
			}			
		}
		return result;
	}
}
