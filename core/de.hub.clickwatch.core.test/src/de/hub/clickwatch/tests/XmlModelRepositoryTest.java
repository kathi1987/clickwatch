package de.hub.clickwatch.tests;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
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
import com.google.common.collect.Collections2;

import de.hub.clickwatch.XmlModelRepository;
import de.hub.clickwatch.model.ClickWatchModelFactory;
import de.hub.clickwatch.model.ClickWatchModelPackage;
import de.hub.clickwatch.model.Element;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.model.Network;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.util.Throwables;


public class XmlModelRepositoryTest extends AbstractTest {
	
	public final static String LINK_STAT_XSD = "src/" + XmlModelRepositoryTest.class.getPackage().getName().replace(".", "/") + "/link_stat.xsd";
	public final static String LINK_STAT_XML = "src/" + XmlModelRepositoryTest.class.getPackage().getName().replace(".", "/") + "/link_stat_test.xml";
	
	private XmlModelRepository xmlModelRepository = null;

	@Override
	protected void additionalSetUp() {
		xmlModelRepository = injector.getInstance(XmlModelRepository.class);
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
			EObject xml = xmlModelRepository.deserializeXml("<value_><foo><bar>TEXT</bar></foo></value_>");
			handler.getAny().addAll(((XMLTypeDocumentRoot)xml).getMixed());
		}
		
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		try {
			resource.save(baos, options);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String modelXmi = baos.toString();
		
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
		EObject value = (EObject)handler.getAny().getValue(0);
		assertTrue(XMLTypePackage.eINSTANCE.getAnyType().isInstance(value));
		
		handler.getAny().clear();
		handler.getMixed().add(XMLTypePackage.eINSTANCE.getXMLTypeDocumentRoot_Text(), "newValue");
		
		baos = new ByteArrayOutputStream();
		try {
			resource.save(baos, options);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void testBasicXDS() {
		Collection<EObject> xsd = new XSDEcoreBuilder().generate(URI.createFileURI(LINK_STAT_XSD));
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
		
		Resource xmlResource = rs.createResource(URI.createFileURI(LINK_STAT_XML));
	
		Map<String, Object> options = new HashMap<String, Object>();
		options.put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
		options.put(XMLResource.OPTION_ENCODING, "UTF-8");
		
		try {
			xmlResource.load(options);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		EObject model = xmlResource.getContents().get(0);
		Iterator<EObject> it = model.eAllContents();
		while (it.hasNext()) {
			assertTrue(! (it.next() instanceof AnyType));
		}	
	}
	
	public void testDeserializeXSD() {
		URI uri = URI.createFileURI(LINK_STAT_XSD);
		String xsdStr = null;
		try {
			xsdStr = TestUtil.readFileAsString(uri.toFileString());
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
	
	public void testXSD() throws IOException {
		EPackage metaModel = xmlModelRepository.loadMetaModelFromXSD(URI.createFileURI(LINK_STAT_XSD), 
				TestUtil.readFileAsString(LINK_STAT_XSD));
		
		for (EClassifier eClassifier: metaModel.getEClassifiers()) {
			if (eClassifier instanceof EClass) {
				assertTrue(!eClassifier.getName().contains(" Type"));
			}
		}
		
		EObject result = xmlModelRepository.deserializeModel(metaModel, TestUtil.readFileAsString(LINK_STAT_XML));
		
		assertNotNull(result);
		assertTrue(result.eClass().getEPackage().getName().equals(metaModel.getName()));
		
		EFactory factory = metaModel.getEFactoryInstance();
		EObject documentRoot = factory.create((EClass)metaModel.getEClassifier("DocumentRoot"));
		
		EStructuralFeature xMLNSPrefixMapFeature = documentRoot.eClass().getEStructuralFeature("xMLNSPrefixMap");
		documentRoot.eSet(xMLNSPrefixMapFeature, result.eGet(xMLNSPrefixMapFeature));
		
		EStructuralFeature xSISchemaLocation = documentRoot.eClass().getEStructuralFeature("xSISchemaLocation");
		documentRoot.eSet(xSISchemaLocation, result.eGet(xSISchemaLocation));
		
		String featureName = result.eContents().get(0).eContents().get(0).eContainmentFeature().getName();
		documentRoot.eSet(documentRoot.eClass().getEStructuralFeature(featureName), result.eContents().get(0).eContents().get(0));
		
		String serializedResult = xmlModelRepository.serializeModel(metaModel, documentRoot);
		result = xmlModelRepository.deserializeModel(metaModel, serializedResult);
		
		Iterator<EObject> it = result.eAllContents();
		while (it.hasNext()) {
			assertTrue(! (it.next() instanceof AnyType));
		}	
	}

}
