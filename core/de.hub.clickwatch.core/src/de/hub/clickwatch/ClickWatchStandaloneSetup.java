package de.hub.clickwatch;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import de.hub.clickwatch.model.ClickWatchModelPackage;
import de.hub.clickwatch.model.util.ClickWatchModelResourceFactoryImpl;

public class ClickWatchStandaloneSetup {
	
	public static void doSetup() {
		if (!EPackage.Registry.INSTANCE.containsKey(ClickWatchModelPackage.eINSTANCE.getNsURI())) {
			EPackage.Registry.INSTANCE.put(ClickWatchModelPackage.eINSTANCE.getNsURI(), ClickWatchModelPackage.eINSTANCE);
		}
		if (!EPackage.Registry.INSTANCE.containsKey(EcorePackage.eINSTANCE.getNsURI())) {
			EPackage.Registry.INSTANCE.put(EcorePackage.eINSTANCE.getNsURI(), EcorePackage.eINSTANCE);
		}
		if (!EPackage.Registry.INSTANCE.containsKey(XMLTypePackage.eINSTANCE.getNsURI())) {
			EPackage.Registry.INSTANCE.put(XMLTypePackage.eINSTANCE.getNsURI(), XMLTypePackage.eINSTANCE);
		}
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("clickwatchmodel", new ClickWatchModelResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new XMIResourceFactoryImpl());
	}

}
