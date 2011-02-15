package edu.hu.clickwatch;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.GenericXMLResourceFactoryImpl;
import org.eclipse.emf.ecore.xml.type.AnyType;
import org.eclipse.emf.ecore.xml.type.XMLTypeDocumentRoot;
import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import com.google.common.base.Throwables;

public class XmlUtil {
	
	public static AnyType createXMLText(String text) {
		AnyType result = XMLTypeFactory.eINSTANCE.createAnyType();
		result.getAny().add(XMLTypePackage.eINSTANCE.getXMLTypeDocumentRoot_Text(), text);
		return result;
	}
	
	public static XMLTypeDocumentRoot createXMLDocument(AnyType content) {
		XMLTypeDocumentRoot document = XMLTypeFactory.eINSTANCE.createXMLTypeDocumentRoot();
		document.getMixed().add(XMLTypePackage.eINSTANCE.getXMLTypeDocumentRoot_Mixed(), content);
		return document;
	}
	
	public static EObject deserializeXml(String xml) {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
				Resource.Factory.Registry.DEFAULT_EXTENSION,
				new GenericXMLResourceFactoryImpl());

		Resource resource = resourceSet.createResource(URI.createURI("fake.xml"));
		ByteArrayInputStream bais = new ByteArrayInputStream(xml.getBytes());
		try {
			resource.load(bais, null);
		} catch (IOException e) {
			Throwables.propagate(e);
		}
		
		// Validate the contents of the loaded resource.
		for (EObject eObject: resource.getContents()) {
			Diagnostic diagnostic = Diagnostician.INSTANCE
					.validate(eObject);
			if (diagnostic.getSeverity() != Diagnostic.OK) {
				// TODO
			}
		}
		
		EObject result = null;		
		if (resource.getContents().size() > 0) {
			result = resource.getContents().get(0);
			resource.getContents().remove(0);
		}
		
		try {
			resource.delete(null);
		} catch (IOException e) {
			Throwables.propagate(e);
		}
		
		return result;
	}
	
	public static String serializeXml(EObject object) {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
				Resource.Factory.Registry.DEFAULT_EXTENSION,
				new GenericXMLResourceFactoryImpl());

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
