package edu.hu.clickwatch.model;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.xmi.impl.GenericXMLResourceFactoryImpl;
import org.eclipse.emf.ecore.xml.type.AnyType;
import org.eclipse.emf.ecore.xml.type.XMLTypeDocumentRoot;

import com.google.common.base.Preconditions;
import com.google.common.base.Throwables;

import edu.hu.clickcontrol.IClickSocket;

/**
 * This adapter assumes there is a special handler that each elements has and
 * that allows to retrieve all handler values as xml.
 * 
 * @author Markus Scheidgen
 * 
 */
public class ClickControlNodeFullXmlAdapter extends AbstractXmlNodeAdapter {

	private static final String XML_HANDLER_NAME = "xml";
	private static final ClickWatchModelFactory modelFactory = ClickWatchModelFactory.eINSTANCE;
	
	@Override
	protected void retrieveAndPopulateInternalNodeCopy(Node internalNodeCopy, IClickSocket cs) {
		try {
			for(String elementName: cs.getConfigElementNames()) {
				String elementAsXml = new String(cs.read(elementName, XML_HANDLER_NAME));
				XMLTypeDocumentRoot xmlRoot = readXml(elementAsXml);
				
				Element element = modelFactory.createElement();
				element.setName(elementName);
				internalNodeCopy.getElements().add(element);
				
				AnyType elementXml = (AnyType)xmlRoot.getMixed().getValue(0);
				
				for (FeatureMap.Entry handlerEntry: elementXml.getMixed()) {
					AnyType handlerXml = (AnyType)handlerEntry.getValue();
					String handlerName = (String)handlerXml.getAnyAttribute().getValue(0);
					
					Handler handler = modelFactory.createHandler();
					handler.setName(handlerName);
					handler.setCanRead(true);
					handler.setValue(handlerXml);
					element.getHandlers().add(handler);
				}
			}
		} catch (Throwable e) {
			Throwables.propagate(e);
		}
	}

	private XMLTypeDocumentRoot readXml(String xml) {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
				Resource.Factory.Registry.DEFAULT_EXTENSION,
				new GenericXMLResourceFactoryImpl());

		Resource resource = resourceSet.createResource(URI.createURI("fake.xml"));
		ByteArrayInputStream bais = new ByteArrayInputStream(xml.trim().getBytes());
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

	@Override
	protected String getPlainHandlerValue(Object value) {
		// TODO
		return super.getPlainHandlerValue(value);
	}

}
