package edu.hu.clickwatch.tests;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import junit.framework.TestCase;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import org.eclipse.emf.ecore.xml.type.AnyType;
import org.eclipse.emf.ecore.xml.type.XMLTypeDocumentRoot;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.xsd.XSDSchema;
import org.eclipse.xsd.ecore.XSDEcoreBuilder;

import com.google.common.base.Function;
import com.google.common.base.Throwables;
import com.google.common.collect.Collections2;

import edu.hu.clickwatch.ClickWatchStandaloneSetup;
import edu.hu.clickwatch.XmlModelRepository;
import edu.hu.clickwatch.model.ClickWatchModelFactory;
import edu.hu.clickwatch.model.ClickWatchModelPackage;
import edu.hu.clickwatch.model.Element;
import edu.hu.clickwatch.model.Handler;
import edu.hu.clickwatch.model.Network;
import edu.hu.clickwatch.model.Node;

public class XmlModelRepositoryTest extends TestCase {
	
	private XmlModelRepository xmlModelRepository = null;

	@Override
	protected void setUp() throws Exception {
		ClickWatchStandaloneSetup.doSetup();
		xmlModelRepository = new XmlModelRepository();
	}
	
	public void testDeserialize() {		
		for (int i = 0; i < 2; i++) {
			EObject deserializedXml = xmlModelRepository.deserializeXml("<foo>TEXT</foo>");
			
			assertNotNull(deserializedXml);
			assertTrue(deserializedXml instanceof XMLTypeDocumentRoot);
			assertEquals(1, ((XMLTypeDocumentRoot)deserializedXml).getMixed().size());
			assertTrue(((XMLTypeDocumentRoot)deserializedXml).getMixed().getValue(0) instanceof AnyType);
			assertEquals(1, ((AnyType)((XMLTypeDocumentRoot)deserializedXml).getMixed().getValue(0)).getMixed().size());
			assertEquals("TEXT", ((AnyType)((XMLTypeDocumentRoot)deserializedXml).getMixed().getValue(0)).getMixed().getValue(0));
			
			EcoreUtil.delete(deserializedXml, true);
		}
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
			EObject xml = xmlModelRepository.deserializeXml("<value><foo><bar>TEXT</bar></foo></value>");
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
		
		handler.setValue(xmlModelRepository.createXMLText("newValue"));
		
		baos = new ByteArrayOutputStream();
		try {
			resource.save(baos, options);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(baos.toString());
	}
	
	public void testTryXDS() {
		Collection<EObject> xsd = new XSDEcoreBuilder().generate(URI.createFileURI("/Users/markus/Downloads/link_stat.xsd"));
		Collection<EPackage> xsdPackages = Collections2.transform(xsd, new Function<EObject, EPackage>() {
			@Override
			public EPackage apply(EObject input) {
				return (EPackage)input;
			}
		});
		final ResourceSet rs = new ResourceSetImpl();
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xml", new XMLResourceFactoryImpl());
		for (EPackage ePackage: xsdPackages) {
			rs.getPackageRegistry().put(ePackage.getNsURI(), ePackage);
		}
		
		Resource xmlResource = rs.createResource(URI.createFileURI("/Users/markus/Downloads/test.xml"));
	
		Map<String, Object> options = new HashMap<String, Object>();
		options.put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
		options.put(XMLResource.OPTION_ENCODING, "UTF-8");
		
		try {
			xmlResource.load(options);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void testDeserializeXSD() {
		URI uri = URI.createFileURI("/Users/markus/Downloads/link_stat.xsd");
		String xsdStr = null;
		try {
			xsdStr = readFileAsString(uri.toFileString());
		} catch (IOException e) {
			Throwables.propagate(e);
		}
		
		XSDSchema xsd = xmlModelRepository.loadXSD(uri, xsdStr);
		assertNotNull(xsd);
		
		XSDEcoreBuilder xsdEcoreBuilder = new XSDEcoreBuilder();
		xsdEcoreBuilder.generate(xsd);
		Collection<EPackage> metaModel = xsdEcoreBuilder.getTargetNamespaceToEPackageMap().values();
		
		assertEquals(1, metaModel.size());
	}

    private static String readFileAsString(String filePath) throws java.io.IOException{
        StringBuffer fileData = new StringBuffer(1000);
        BufferedReader reader = new BufferedReader(
                new FileReader(filePath));
        char[] buf = new char[1024];
        int numRead=0;
        while((numRead=reader.read(buf)) != -1){
            String readData = String.valueOf(buf, 0, numRead);
            fileData.append(readData);
            buf = new char[1024];
        }
        reader.close();
        return fileData.toString();
    }

}
