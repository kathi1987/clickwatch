package de.hub.clickwatch.main;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;

import com.google.inject.Guice;
import com.google.inject.Injector;

import de.hub.clickwatch.main.internal.IClickWatchContextAdapter;
import de.hub.clickwatch.util.Throwables;

public class ClickWatchExtensionPointLauncher {
	
	private static final String extensionPointId = "de.hub.clickwatch.apps.main.ClickWatchMain";
	private static Class<? extends IClickWatchContextAdapter>[] adapterClasses;
	
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
	
	private IClickWatchContext createContext(final Map<Class<?>, IClickWatchContextAdapter> adapters) {		
		return new IClickWatchContext() {			
			@SuppressWarnings("unchecked")
			@Override
			public <T> T getAdapter(Class<T> adapterClass) {
				Object adapter = adapters.get(adapterClass);
				if (adapter != null) {
					return (T)adapter;
				} else {
					return null;
				}
			}
		};
	}
	
	@SuppressWarnings("unchecked")
	public void launch(IConfigurationElement element) {
		Injector adapterInjector = Guice.createInjector();
		String mainClassName = element.getAttribute("class");
		Map<Class<?>, IClickWatchContextAdapter> adapters = new HashMap<Class<?>, IClickWatchContextAdapter>();

		for(Class<? extends IClickWatchContextAdapter> adapterClass: adapterClasses) {
			IClickWatchContextAdapter adapter = adapterInjector.getInstance(adapterClass);
			adapters.put(adapterClass, adapter);
			for (IConfigurationElement adapterConfigurationElement: element.getChildren()) {
				String adapterName = adapterConfigurationElement.getAttribute("name");
				if (adapterClass.getSimpleName().endsWith(adapterName)) {
					adapter.initialize(element);
				}
			}
		}
		
		Injector injector = ((IInjectorProvider)adapters.get(IInjectorProvider.class)).getInjector();
		Class<IClickWatchMain> mainClass = null;
		try {
			mainClass = (Class<IClickWatchMain>)Thread.currentThread().getContextClassLoader().loadClass(mainClassName);
		} catch (ClassNotFoundException e) {
			Throwables.propagate(e);
		}
		injector.getInstance(mainClass).main(createContext(adapters));
	}
}
