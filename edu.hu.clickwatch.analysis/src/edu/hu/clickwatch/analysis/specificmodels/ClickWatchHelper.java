package edu.hu.clickwatch.analysis.specificmodels;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import com.google.common.base.Preconditions;

import edu.hu.clickwatch.model.Network;

public class ClickWatchHelper {

	public static EPackage generateSpecificMetaModel(IFile genericModelFile, IContainer targetDirectory) throws IOException {
		return generateSpecificMetaModel(URI.createPlatformResourceURI(genericModelFile.getFullPath().toString(), true),
				URI.createPlatformResourceURI(targetDirectory.getFullPath().toString() + "/SpecificMetaModel.ecore", true));
	}
	
	public static EPackage generateSpecificMetaModel(URI genericModelUri, URI specificMetaModelUri) throws IOException {
		SpecificMetaModelGenerator metaModelGenerator = new SpecificMetaModelGenerator();

		ResourceSet rs = new ResourceSetImpl();
		Map<Object, Object> options = new HashMap<Object, Object>();
		options.put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
		rs.getLoadOptions().put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
		Resource resource = rs.getResource(genericModelUri, true);
		Network genericModel = (Network)resource.getContents().get(0);
		
		EPackage specificMetaModel = metaModelGenerator.generateMetaModel(genericModel);	
		
		EPackage.Registry.INSTANCE.put(EcorePackage.eINSTANCE.getNsURI(), EcorePackage.eINSTANCE);
		specificMetaModel.setNsURI("src/SpecificMetaModel");
		specificMetaModel.setNsPrefix("scwm");
		EPackage.Registry.INSTANCE.put(specificMetaModel.getNsURI(), specificMetaModel);

		
		Resource specificMetaModelResource = rs.createResource(specificMetaModelUri);
		specificMetaModelResource.getContents().add(specificMetaModel);
		specificMetaModelResource.save(options);
		
		return specificMetaModel;
	}
	
	public static void generateSpecificModel(IFile genericModelFile, EPackage specificMetaModel, IContainer targetDirectory) throws IOException {
		generateSpecificModel(URI.createPlatformResourceURI(genericModelFile.getFullPath().toString(), true),
				specificMetaModel,
				URI.createPlatformResourceURI(targetDirectory.getFullPath().toString() + "/SpecificModel.scwm", true));
	}
	
	public static void generateSpecificModel(URI genericModelUri, EPackage specificMetaModel, URI specificModelUri) throws IOException {
		ResourceSet rs = new ResourceSetImpl();
		Map<Object, Object> options = new HashMap<Object, Object>();
		options.put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
		rs.getLoadOptions().put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
		Resource resource = rs.getResource(genericModelUri, true);
		Network genericModel = (Network)resource.getContents().get(0);
		
		SpecificModelGenerator modelGenerator = new SpecificModelGenerator();
		EObject specificModel = modelGenerator.generateModel(specificMetaModel, genericModel);
		Preconditions.checkState(specificModel != null);
		
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("scwm", new XMIResourceFactoryImpl());
		Resource specificModelResource = rs.createResource(specificModelUri);
		specificModelResource.getContents().add(specificModel);
		specificModelResource.save(options);
	}
	
	public static void generateSpecificModels(IFile genericModelFile, IContainer targetDirectory) throws IOException {
		generateSpecificModel(genericModelFile, generateSpecificMetaModel(genericModelFile, targetDirectory), targetDirectory);
	}
}
