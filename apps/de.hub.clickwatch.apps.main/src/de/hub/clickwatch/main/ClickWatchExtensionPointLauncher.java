package de.hub.clickwatch.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import de.hub.clickwatch.main.impl.ProgressMonitorProvider;
import de.hub.clickwatch.util.Throwables;

public class ClickWatchExtensionPointLauncher {
	
	private static final String extensionPointId = "de.hub.clickwatch.apps.main.ClickWatchMain";
	private static final String adapterExtensionPointId = "de.hub.clickwatch.apps.main.ClickWatchContextAdapter";
	
	private Map<String, IConfigurationElement> extensions = null;

	public Map<String, IConfigurationElement> getExtensions() {
		if (extensions == null) {
			extensions = new HashMap<String, IConfigurationElement>();
			IConfigurationElement[] config = Platform.getExtensionRegistry().getConfigurationElementsFor(extensionPointId);
			try {
				for (IConfigurationElement e : config) {
					String name = e.getAttribute("name");
					extensions.put(name, e);	
				}
			} catch (Exception e) {
				Throwables.propagate(e);
			}
		}
		return extensions;
	}
	
	private List<IClickWatchContextAdapter> creatContextAdapters() {
		IConfigurationElement[] config = Platform.getExtensionRegistry().getConfigurationElementsFor(adapterExtensionPointId);
		Map<String, IConfigurationElement> contextAdapterExtensions = new HashMap<String, IConfigurationElement>();
		for (IConfigurationElement e : config) {
			contextAdapterExtensions.put(e.getAttribute("id"), e);
		}
		List<String> replaceds = new ArrayList<String>();
		for (String id: contextAdapterExtensions.keySet()) {
			String replaces = contextAdapterExtensions.get(id).getAttribute("replaces");
			if (replaces != null) {
				replaceds.add(replaces);
			}
		}
		for (String replaced: replaceds) {
			contextAdapterExtensions.remove(replaced);
		}
		List<IClickWatchContextAdapter> result = new ArrayList<IClickWatchContextAdapter>();
		for (IConfigurationElement adapterExtension: contextAdapterExtensions.values()) {
			try {
				result.add((IClickWatchContextAdapter)adapterExtension.createExecutableExtension("class"));
			} catch (CoreException e) {
				Throwables.propagate(e);
			}
		}
		return result;
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void launch(IConfigurationElement element, EObject selection, Bundle bundle, IProgressMonitor monitor) {
		monitor.beginTask("Executing main", 12);
		final Map<Class, IClickWatchContextAdapter> adapterMap = new HashMap<Class, IClickWatchContextAdapter>();
		
		List<IClickWatchContextAdapter> adapters = creatContextAdapters();
		for(IClickWatchContextAdapter adapter: adapters) {
			IConfigurationElement adapterConfigurationElement = null;
			for (IConfigurationElement child: element.getChildren()) {			
				String adapterName = child.getName();
				if (adapter.getAdpaterClass().getSimpleName().endsWith(adapterName)) {
					adapterConfigurationElement = child;
				}
			}
			adapter.initialize(adapterConfigurationElement, selection);
			adapterMap.put(adapter.getAdpaterClass(), adapter);
		}
		
		Injector injector = ((IInjectorProvider)adapterMap.get(IInjectorProvider.class)).getInjector();
		Class<IClickWatchMain> mainClass = null;
		try {
			mainClass = (Class)element.createExecutableExtension("class").getClass();
		} catch (Exception e) {
			Throwables.propagate(e);
		}
		monitor.worked(1);
		((ProgressMonitorProvider)adapterMap.get(IProgressMonitorProvider.class)).initialize(new SubProgressMonitor(monitor, 10));
		injector.getInstance(mainClass).main(new IClickWatchContext() {			
			@Override
			public <T> T getAdapter(Class<T> adapterClass) {
				return (T)adapterMap.get(adapterClass);
			}
		});
		monitor.worked(2);
		monitor.done();
	}
}
