package de.hub.clickwatch;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import de.hub.clickwatch.cwdatabase.CWDataBasePackage;
import de.hub.clickwatch.model.ClickWatchModelPackage;


public class ClickWatchStandaloneSetup {
	
	public static void doSetup() {
		if (!EPackage.Registry.INSTANCE.containsKey(ClickWatchModelPackage.eINSTANCE.getNsURI())) {
			EPackage.Registry.INSTANCE.put(ClickWatchModelPackage.eINSTANCE.getNsURI(), ClickWatchModelPackage.eINSTANCE);
		}
		if (!EPackage.Registry.INSTANCE.containsKey(CWDataBasePackage.eINSTANCE.getNsURI())) {
			EPackage.Registry.INSTANCE.put(CWDataBasePackage.eINSTANCE.getNsURI(), CWDataBasePackage.eINSTANCE);
		}
		if (!EPackage.Registry.INSTANCE.containsKey(EcorePackage.eINSTANCE.getNsURI())) {
			EPackage.Registry.INSTANCE.put(EcorePackage.eINSTANCE.getNsURI(), EcorePackage.eINSTANCE);
		}
		if (!EPackage.Registry.INSTANCE.containsKey(XMLTypePackage.eINSTANCE.getNsURI())) {
			EPackage.Registry.INSTANCE.put(XMLTypePackage.eINSTANCE.getNsURI(), XMLTypePackage.eINSTANCE);
		}
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("clickwatchmodel", new XMIResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("cwdatabase", new XMIResourceFactoryImpl());
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
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new XMIResourceFactoryImpl());
	}

}
