package de.hub.clickwatch;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.Plugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.osgi.framework.BundleContext;

public class PluginActivator extends Plugin {

	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("zip", new XMIResourceFactoryImpl() {
			@Override
			public Resource createResource(URI uri) {
				return new XMIResourceImpl(uri) {
					@Override
					public void load(Map<?, ?> options) throws IOException {
						Map<Object, Object> localOptions = new HashMap<Object, Object>();
						localOptions.putAll(options);
						localOptions.put(XMLResource.OPTION_ZIP, Boolean.TRUE);
						super.load(localOptions);
					}

					@Override
					public void save(Map<?, ?> options) throws IOException {
						Map<Object, Object> localOptions = new HashMap<Object, Object>();
						localOptions.putAll(options);
						localOptions.put(XMLResource.OPTION_ZIP, Boolean.TRUE);
						super.save(localOptions);
					}	
				};
			}
		});
	}

}
