package edu.hu.clickwatch.model;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.xmi.impl.GenericXMLResourceFactoryImpl;
import org.eclipse.emf.ecore.xml.type.AnyType;
import org.eclipse.emf.ecore.xml.type.XMLTypeDocumentRoot;

import com.google.common.base.Preconditions;
import com.google.common.base.Throwables;

public class AbstractXmlNodeAdapter extends ClickControlNodeAdapter {
	
	@Override
	public boolean determineHandlerHasChangedInModel(Notification notification) {
		if (notification.getNotifier() instanceof Handler) {
			return super.determineHandlerHasChangedInModel(notification);
		} else {
			return true;
		}
	}
	
	@Override
	public boolean determineHandlerHasChangedInReality(Handler modelCopy,
			Handler realityCopy) {
		return !compareXml(modelCopy.getValue(), realityCopy.getValue());
	}

	private boolean compareXml(FeatureMap v1, FeatureMap v2) {
		if (v1.size() != v2.size()) {
			return false;
		}
		int i = 0;
		for (FeatureMap.Entry e1: v1) {
			FeatureMap.Entry e2 = v2.get(i++);

			if (!e1.getEStructuralFeature().getName().equals(e2.getEStructuralFeature().getName())) {
				return false;
			}
			if (e1.getValue() instanceof AnyType && e2.getValue() instanceof AnyType) {
				if (!compareXml(((AnyType)e1.getValue()).getMixed(), ((AnyType)e2.getValue()).getMixed())) {
					return false;
				}
			} else {
				if (!e1.getValue().equals(e2.getValue())) {
					return false;
				}
			}
		}
		return true;
	}

	protected static XMLTypeDocumentRoot deserializeXml(String xml) {
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
		
		Preconditions.checkState(resource.getContents().size() == 1 && resource.getContents().get(0) instanceof XMLTypeDocumentRoot);
		return (XMLTypeDocumentRoot)resource.getContents().get(0);
	}
	
	protected static String serializeXml(XMLTypeDocumentRoot xml) {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
				Resource.Factory.Registry.DEFAULT_EXTENSION,
				new GenericXMLResourceFactoryImpl());

		Resource resource = resourceSet.createResource(URI.createURI("fake.xml"));
		resource.getContents().add(EcoreUtil.copy(xml));
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		try {
			resource.save(baos, null);
		} catch (IOException e) {
			Throwables.propagate(e);
		}
		
		return baos.toString();
	}
}
