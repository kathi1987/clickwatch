package de.hub.emfxml.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.GenericXMLResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLParserPoolImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import org.eclipse.emf.ecore.xml.type.AnyType;
import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.xsd.util.XSDResourceFactoryImpl;
import org.eclipse.xsd.util.XSDResourceImpl;

import com.google.common.base.Preconditions;

public class EmfXmlUtil {

	private static XMLParserPoolImpl xmlParserPool = new XMLParserPoolImpl(true);
	private static Map<Object, Object> options = null;
	static {
		options = new HashMap<Object, Object>();
		options.put(XSDResourceImpl.XSD_TRACK_LOCATION, Boolean.TRUE);
		options.put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
		options.put(XMLResource.OPTION_ENCODING, "UTF-8");
		options.put(XMLResource.OPTION_USE_PARSER_POOL, xmlParserPool);
		HashMap<String, Boolean> parserFeatures = new HashMap<String, Boolean>();
		parserFeatures.put("http://apache.org/xml/features/nonvalidating/load-external-dtd", false);
		options.put(XMLResource.OPTION_PARSER_FEATURES, parserFeatures);
				
		Map<String, Object> extensionToFactoryMap = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
		extensionToFactoryMap.put("wsdl", new XSDResourceFactoryImpl());
		extensionToFactoryMap.put("xsd", new XSDResourceFactoryImpl());
		extensionToFactoryMap.put("xml", new XMLResourceFactoryImpl());
		extensionToFactoryMap.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new GenericXMLResourceFactoryImpl());
	}

	public static Map<Object, Object> defaultLoadSaveOptions() {
		return options;
	}
	
	public static ResourceSet createResourceSet() {
		ResourceSet resourceSet = new ResourceSetImpl();		
		resourceSet.getLoadOptions().putAll(options);
		return resourceSet;
	}
	
	public static AnyType createXMLText(String text) {
		AnyType result = XMLTypeFactory.eINSTANCE.createAnyType();
		result.getAny().add(XMLTypePackage.eINSTANCE.getXMLTypeDocumentRoot_Text(), text);
		return result;
	}
	
	@SuppressWarnings("unchecked")
	public static <T> T load(ResourceSet resourceSet, URI uri, String str, Class<? extends T> resultClass) {	
		Resource resource = null;
		resource = resourceSet.getResource(uri, false);
		if (resource == null) {
			resource = resourceSet.createResource(uri);
			ByteArrayInputStream bais = new ByteArrayInputStream(str.getBytes());
			try {
				Map<Object, Object> loadOptions = resourceSet.getLoadOptions();
				resource.load(bais, loadOptions);
			} catch (IOException e) {
				e.printStackTrace();
				Throwables.propagate(e);
			}
			
			Preconditions.checkState((resource.getErrors().size() + resource.getWarnings().size()) == 0);
		}
			
		EObject result = null;	
		if (resource.getContents().size() > 0) {
			result = resource.getContents().get(0);		
		}
		
		Preconditions.checkNotNull(result);
		return (T)result;
	}
	
	public static EObject deserializeXml(String xml) {
		return load(createResourceSet(), URI.createURI("transient.xmls"), xml, EObject.class);
	}
	
	public static String serializeXml(EObject object) {
		ResourceSet resourceSet = createResourceSet();
		Resource resource = resourceSet.createResource(URI.createURI("transient.xmls"));
		resource.getContents().add(EcoreUtil.copy(object));
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		try {
			resource.save(baos, options);
			resource.delete(null);
		} catch (IOException e) {
			Throwables.propagate(e);
		}
		
		return baos.toString();
	}
	
	public static EObject deserializeModel(EPackage metaModel, String xml) {
		xml = stripProcessingInstructions(xml);
		xml = addNamespaceToRootElement(xml, metaModel.getNsURI());
		EPackage.Registry.INSTANCE.put(metaModel.getNsURI(), metaModel);		
		return load(createResourceSet(), URI.createURI(".xml"), xml, EObject.class);
	}
	
	public static String serializeModel(EPackage metaModel, EObject model) {
		EPackage.Registry.INSTANCE.put(metaModel.getNsURI(), metaModel);
		return serializeXml(model);
	}
	
	public static String stripProcessingInstructions(String xml) {
		return xml.replaceFirst("^<\\?[^\\?]+\\?>", "").trim();
	}

	private static String addNamespaceToRootElement(String xml, String nsURI) {
		// TODO this is an ugly way to provide the schema URI
		if (!xml.contains("xsi:noNamespaceSchemaLocation")) {
			int xsdRefPos = xml.indexOf(">");
			if (xsdRefPos > 0) {
				if (xml.charAt(xsdRefPos - 1) == '/') {
					xsdRefPos -= 1;
				}
				xml = xml.substring(0, xsdRefPos) + 
						" xsi:noNamespaceSchemaLocation='" +
						nsURI + "'" + xml.substring(xsdRefPos);
			}
		}
		if (!xml.contains("xmlns:xsi=") && xml.contains("xsi")) {
			int refPos = xml.indexOf(">");
			if (refPos > 0) {
				if (xml.charAt(refPos - 1) == '/') {
					refPos -= 1;
				}
				xml = xml.substring(0, refPos) + 
						" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"" + 
						xml.substring(refPos);
			}
		}
		return xml;
	}
}
