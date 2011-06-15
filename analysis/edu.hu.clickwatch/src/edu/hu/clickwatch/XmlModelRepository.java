package edu.hu.clickwatch;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.GenericXMLResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import org.eclipse.emf.ecore.xml.type.AnyType;
import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.xsd.XSDComplexTypeDefinition;
import org.eclipse.xsd.XSDNamedComponent;
import org.eclipse.xsd.XSDSchema;
import org.eclipse.xsd.ecore.XSDEcoreBuilder;
import org.eclipse.xsd.util.XSDResourceFactoryImpl;
import org.eclipse.xsd.util.XSDResourceImpl;

import com.google.common.base.Preconditions;
import com.google.common.base.Throwables;
import com.google.inject.Singleton;

@Singleton
public class XmlModelRepository {
	
	private class XmlStringAdapter extends AdapterImpl {
		final String xmlString;

		public XmlStringAdapter(String xmlString) {
			super();
			this.xmlString = xmlString;
		}

		public String getXmlString() {
			return xmlString;
		}
	}
	
	public String getOriginalXml(EObject value) {
		for (Adapter adapter: value.eAdapters()) {
			if (adapter instanceof XmlStringAdapter) {
				return ((XmlStringAdapter)adapter).getXmlString();
			}
		}
		return null;
	}
	
	public AnyType createXMLText(String text) {
		AnyType result = XMLTypeFactory.eINSTANCE.createAnyType();
		result.getAny().add(XMLTypePackage.eINSTANCE.getXMLTypeDocumentRoot_Text(), text);
		return result;
	}
	
	public static Map<Object, Object> defaultLoadSaveOptions() {
		Map<Object, Object> options = new HashMap<Object, Object>();
		options.put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
		options.put(XMLResource.OPTION_ENCODING, "UTF-8");
		return options;
	}
	
	private ResourceSet resourceSet = null;
	private Map<URI, EPackage> metaModels = new HashMap<URI, EPackage>();
	private Map<Object, Object> options = null;
	
	private void initialize() {
		if (resourceSet == null) {
			resourceSet = new ResourceSetImpl();
			options = new HashMap<Object, Object>();
			options.put(XSDResourceImpl.XSD_TRACK_LOCATION, Boolean.TRUE);
			options.put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
			options.put(XMLResource.OPTION_ENCODING, "UTF-8");
			
			resourceSet.getLoadOptions().putAll(options);
			
			Map<String, Object> extensionToFactoryMap = resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap();
			extensionToFactoryMap.put("wsdl", new XSDResourceFactoryImpl());
			extensionToFactoryMap.put("xsd", new XSDResourceFactoryImpl());
			extensionToFactoryMap.put("xml", new XMLResourceFactoryImpl());
			extensionToFactoryMap.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new GenericXMLResourceFactoryImpl());
		}
	}
	
	@SuppressWarnings("unchecked")
	private synchronized <T> T load(URI uri, String str, Class<? extends T> resultClass, boolean keep) {
		initialize();
		
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
		
		Preconditions.checkNotNull(result);
		result.eAdapters().add(new XmlStringAdapter(str));
		return (T)result;
	}
	
	public EObject deserializeXml(String xml) {
		return load(URI.createURI("transient.xmls"), xml, EObject.class, false);
	}
	
	public XSDSchema loadXSD(URI uri, String xsd) {
		return load(uri, xsd, XSDSchema.class, true);
	}
	
	public String serializeXml(EObject object) {
		initialize();

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
	
	public String serializeModel(EPackage metaModel, EObject model) {
		initialize();
		resourceSet.getPackageRegistry().put(metaModel.getNsURI(), metaModel);
		return serializeXml(model);
	}
	
	public EObject deserializeModel(EPackage metaModel, String xml) {
		initialize();
		xml = stripProcessingInstructions(xml);
		xml = addNamespaceToRootElement(xml, metaModel.getNsURI());
		resourceSet.getPackageRegistry().put(metaModel.getNsURI(), metaModel);
		return load(URI.createURI("transient.xml"), xml, EObject.class, false);
	}
	
	public synchronized EPackage loadMetaModelFromXSD(URI xsdUri, String xsdStr) {
		EPackage result = metaModels.get(xsdUri);
		if (result == null) {
			XSDSchema xsd = loadXSD(xsdUri, xsdStr);	
		
			Iterator<EObject> xsd_it = xsd.eAllContents();
			while (xsd_it.hasNext()) {
				EObject next = xsd_it.next();
				if (next instanceof XSDComplexTypeDefinition) {
					XSDComplexTypeDefinition complexTypeDefinition = (XSDComplexTypeDefinition)next;
					if (complexTypeDefinition.getName() == null) {
						EObject container = complexTypeDefinition.eContainer();
						if (container instanceof XSDNamedComponent) {
							String name = ((XSDNamedComponent)container).getName();
							if (name != null) {
								complexTypeDefinition.setName(name);
								complexTypeDefinition.getElement().setAttributeNS(EcorePackage.eNS_URI, "name", name);
							} else {
								String alias = ((XSDNamedComponent)container).getAliasName();
								if (!alias.contains("_._")) {
									complexTypeDefinition.setName(alias);
									complexTypeDefinition.getElement().setAttributeNS(EcorePackage.eNS_URI, "name", alias);
								}
							}
						}
					}
				}
			}
			
			XSDEcoreBuilder xsdEcoreBuilder = new XSDEcoreBuilder();
			xsdEcoreBuilder.generate(xsd);
			Collection<EPackage> values = xsdEcoreBuilder.getTargetNamespaceToEPackageMap().values();
			Preconditions.checkState(values.size() == 1);
			result = values.iterator().next();
			
			result.setNsURI(xsdUri.toString());
			metaModels.put(xsdUri, result);
		} else {
			System.out.println("metamodel is reused");
		}
		return result;		
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
		return xml;
	}
}
