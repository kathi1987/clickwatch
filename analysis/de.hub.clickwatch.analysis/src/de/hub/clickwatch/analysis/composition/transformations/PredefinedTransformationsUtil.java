package de.hub.clickwatch.analysis.composition.transformations;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;

public class PredefinedTransformationsUtil {

	public static Map<String, IPredefinedTransformation> getPredefinedTransformations() {
		Map<String, IPredefinedTransformation> result = new HashMap<String, IPredefinedTransformation>();
		for (IConfigurationElement configurationElement: Platform.getExtensionRegistry()
				.getConfigurationElementsFor("edu.hu.clickwatch.analysis.composition.PredefinedTransformation")) {
			String name = configurationElement.getAttribute("name");
			IPredefinedTransformation transformation = null;
			try {
				Object o = configurationElement.createExecutableExtension("class");				
				if (o instanceof IPredefinedTransformation) {
					 transformation = (IPredefinedTransformation)o;
				}
			} catch (CoreException e) {

			}
			if (name != null && transformation != null) {
				result.put(name, transformation);
			}			
		}
		return result;
	}
}
