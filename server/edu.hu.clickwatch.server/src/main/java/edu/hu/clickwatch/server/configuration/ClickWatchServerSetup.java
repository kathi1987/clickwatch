package edu.hu.clickwatch.server.configuration;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import edu.hu.clickwatch.model.ClickWatchModelPackage;

/**
 * 
 * @author Markus Scheidgen
 */
public class ClickWatchServerSetup {
	public static void initialize() {
		if (!EPackage.Registry.INSTANCE.containsKey(ClickWatchModelPackage.eINSTANCE.getNsURI())) {
			EPackage.Registry.INSTANCE.put(ClickWatchModelPackage.eINSTANCE.getNsURI(), ClickWatchModelPackage.eINSTANCE);
		}
		if (!EPackage.Registry.INSTANCE.containsKey(XMLTypePackage.eINSTANCE.getNsURI())) {
			EPackage.Registry.INSTANCE.put(XMLTypePackage.eINSTANCE.getNsURI(), XMLTypePackage.eINSTANCE);
		}
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("clickwatchmodel", new XMIResourceFactoryImpl());
	}
}
