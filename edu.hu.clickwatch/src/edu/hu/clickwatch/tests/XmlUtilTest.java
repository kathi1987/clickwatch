package edu.hu.clickwatch.tests;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import junit.framework.TestCase;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xml.type.AnyType;
import org.eclipse.emf.ecore.xml.type.XMLTypeDocumentRoot;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import edu.hu.clickwatch.ClickWatchStandaloneSetup;
import edu.hu.clickwatch.XmlUtil;
import edu.hu.clickwatch.model.ClickWatchModelFactory;
import edu.hu.clickwatch.model.ClickWatchModelPackage;
import edu.hu.clickwatch.model.Element;
import edu.hu.clickwatch.model.Handler;
import edu.hu.clickwatch.model.Network;
import edu.hu.clickwatch.model.Node;

public class XmlUtilTest extends TestCase {
	
	

	@Override
	protected void setUp() throws Exception {
		ClickWatchStandaloneSetup.doSetup();
	}

	public void testSaveAndLoadClickWatchModel() {
		Map<Object, Object> options = new HashMap<Object, Object>();
		options.put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
		
		ResourceSet rs = new ResourceSetImpl();
		URI resourceUri = URI.createURI("clickwatch.clickwatchmodel");
		Resource resource = rs.createResource(resourceUri);
		
		{
			Network network = ClickWatchModelFactory.eINSTANCE.createNetwork();
			resource.getContents().add(network);
			Node node = ClickWatchModelFactory.eINSTANCE.createNode();
			network.getNodes().add(node);
			Element element = ClickWatchModelFactory.eINSTANCE.createElement();
			node.getElements().add(element);
			Handler handler = ClickWatchModelFactory.eINSTANCE.createHandler();
			element.getHandlers().add(handler);
			EObject xml = XmlUtil.deserializeXml("<value><foo><bar>TEXT</bar></foo></value>");
			handler.setValue((AnyType)((XMLTypeDocumentRoot)xml).getMixed().getValue(0));
		}
		
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		try {
			resource.save(baos, options);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String modelXmi = baos.toString();
		System.out.println(modelXmi);
		
		try {
			resource.delete(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		resource = rs.createResource(resourceUri);
		ByteArrayInputStream bais = new ByteArrayInputStream(modelXmi.getBytes());
		try {
			resource.load(bais, options);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		assertEquals(1, resource.getContents().size());
		assertEquals(ClickWatchModelPackage.eINSTANCE.getNetwork(), resource.getContents().get(0).eClass());
		Handler handler = ((Network)resource.getContents().get(0)).getNodes().get(0).getElements().get(0).getHandlers().get(0);
		EObject value = handler.getValue();
		assertTrue(XMLTypePackage.eINSTANCE.getAnyType().isInstance(value));
		
		handler.setValue(XmlUtil.createXMLText("newValue"));
		
		baos = new ByteArrayOutputStream();
		try {
			resource.save(baos, options);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(baos.toString());
	}
}
