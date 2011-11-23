package de.hub.clickwatch.recorder.database;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;

import de.hub.clickwatch.recorder.database.util.CWDataBaseResourceFactoryImpl;

public class CWRecorderStandaloneSetup {
	
	public static void doSetup() {
		if (!EPackage.Registry.INSTANCE.containsKey(CWDataBasePackage.eINSTANCE.getNsURI())) {
			EPackage.Registry.INSTANCE.put(CWDataBasePackage.eINSTANCE.getNsURI(), CWDataBasePackage.eINSTANCE);
		}
		
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("cwdatabase", new CWDataBaseResourceFactoryImpl());
	}
}
