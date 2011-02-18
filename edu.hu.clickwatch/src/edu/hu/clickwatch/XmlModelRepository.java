package edu.hu.clickwatch;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.GenericXMLResourceFactoryImpl;
import org.eclipse.emf.ecore.xml.type.AnyType;
import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.xsd.XSDSchema;
import org.eclipse.xsd.util.XSDResourceFactoryImpl;
import org.eclipse.xsd.util.XSDResourceImpl;

import com.google.common.base.Preconditions;
import com.google.common.base.Throwables;

public class XmlModelRepository {
	
	public static AnyType createXMLText(String text) {
		AnyType result = XMLTypeFactory.eINSTANCE.createAnyType();
		result.getAny().add(XMLTypePackage.eINSTANCE.getXMLTypeDocumentRoot_Text(), text);
		return result;
	}
	
	private static ResourceSet resourceSet = null;
	
	private static void initialize() {
		if (resourceSet == null) {
			resourceSet = new ResourceSetImpl();
			resourceSet.getLoadOptions().put(XSDResourceImpl.XSD_TRACK_LOCATION, Boolean.TRUE);
			
			Map<String, Object> extensionToFactoryMap = resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap();
			extensionToFactoryMap.put("wsdl", new XSDResourceFactoryImpl());
			extensionToFactoryMap.put("xsd", new XSDResourceFactoryImpl());
			extensionToFactoryMap.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new GenericXMLResourceFactoryImpl());
		}
	}
	
	@SuppressWarnings("unchecked")
	private static <T> T load(URI uri, String str, Class<? extends T> resultClass, boolean keep) {
		initialize();
		
		Resource resource = null;
		resource = resourceSet.getResource(uri, false);
		if (resource == null) {
			resource = resourceSet.createResource(uri);
			ByteArrayInputStream bais = new ByteArrayInputStream(str.getBytes());
			try {
				resource.load(bais, null);
			} catch (IOException e) {
				Throwables.propagate(e);
			}
			
			Preconditions.checkState((resource.getErrors().size() + resource.getWarnings().size()) == 0);
		}
			
		EObject result = null;		
		if (resource.getContents().size() > 0) {
			result = resource.getContents().get(0);
			if (!keep) {
				resource.getContents().remove(0);
			}
		}
		
		if (!keep) {
			try {
				resource.delete(null);
			} catch (IOException e) {
				Throwables.propagate(e);
			}
		}
			
		return (T)result;
	}
	
	public static EObject deserializeXml(String xml) {
		return load(URI.createURI("transient.xml"), xml, EObject.class, false);
	}
	
	public static XSDSchema loadXSD(URI uri, String xsd) {
		return load(uri, xsd, XSDSchema.class, true);
	}
	
	public static String serializeXml(EObject object) {
		initialize();

		Resource resource = resourceSet.createResource(URI.createURI("fake.xml"));
		resource.getContents().add(EcoreUtil.copy(object));
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		try {
			resource.save(baos, null);
			resource.delete(null);
		} catch (IOException e) {
			Throwables.propagate(e);
		}
		
		return baos.toString();
	}
	
}
