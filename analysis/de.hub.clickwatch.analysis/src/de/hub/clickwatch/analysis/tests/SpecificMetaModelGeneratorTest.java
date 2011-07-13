package de.hub.clickwatch.analysis.tests;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.junit.Test;

import de.hub.clickwatch.XmlModelRepository;
import de.hub.clickwatch.analysis.specificmodels.SpecificMetaModelGenerator;
import de.hub.clickwatch.analysis.specificmodels.SpecificModelGenerator;
import de.hub.clickwatch.model.Network;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.tests.AbstractTest;

import static org.junit.Assert.*;

public class SpecificMetaModelGeneratorTest extends AbstractTest {

	@Test
	public void testSimpleValues() {
		SpecificMetaModelGenerator metaModelGenerator = new SpecificMetaModelGenerator();
		String modelStr =
			"<edu.hu.clickwatch.model:Node xmlns:edu.hu.clickwatch.model='edu.hu.clickwatch.model'>" + 
			"  <element name='e1'>" +
			"    <handler name='h1'>20</handler>" +
			"  </element>" +
			"</edu.hu.clickwatch.model:Node>";
		
		XmlModelRepository xmlModelRepository = injector.getInstance(XmlModelRepository.class);
		Node genericModel = (Node)xmlModelRepository.deserializeXml(modelStr);
		EPackage specificMetaModel = metaModelGenerator.generateMetaModel(genericModel);
		
		assertNotNull(specificMetaModel.getEClassifier("Node"));
		assertNotNull(specificMetaModel.getEClassifier("Element"));
		assertNotNull(specificMetaModel.getEClassifier("e1"));
		assertNotNull(specificMetaModel.getEClassifier("h1"));
		
		assertEquals(specificMetaModel.getEClassifier("e1"), ((EClass)specificMetaModel.getEClassifier("Node")).getEStructuralFeature("e1").getEType());
		assertEquals(specificMetaModel.getEClassifier("h1"), ((EClass)specificMetaModel.getEClassifier("e1")).getEStructuralFeature("h1").getEType());
		assertEquals(false, ((EClass)specificMetaModel.getEClassifier("e1")).getEStructuralFeature("h1").isMany());
		
		SpecificModelGenerator modelGenerator = new SpecificModelGenerator();
		EObject specificModel = modelGenerator.generateModel(specificMetaModel, genericModel);
		
		assertNotNull(specificModel);
		System.out.println(xmlModelRepository.serializeModel(specificMetaModel, specificModel));
	}
	
	@Test
	public void testComplexValues1() {
		SpecificMetaModelGenerator instance = new SpecificMetaModelGenerator();
		String modelStr =
			"<edu.hu.clickwatch.model:Node xmlns:edu.hu.clickwatch.model='edu.hu.clickwatch.model'>" + 
			"  <element name='e1'>" +
			"    <handler name='h1'><A name='a'>TEXT<B name='b'/><B/></A></handler>" +
			"  </element>" +
			"</edu.hu.clickwatch.model:Node>";
		
		XmlModelRepository xmlModelRepository = injector.getInstance(XmlModelRepository.class);
		Node genericModel = (Node)xmlModelRepository.deserializeXml(modelStr);
		EPackage specificMetaModel = instance.generateMetaModel(genericModel);
		
		assertNotNull(specificMetaModel.getEClassifier("Node"));
		assertNotNull(specificMetaModel.getEClassifier("Element"));
		assertNotNull(specificMetaModel.getEClassifier("e1"));
		assertNotNull(specificMetaModel.getEClassifier("h1"));
		assertNotNull(specificMetaModel.getEClassifier("B"));
		assertNotNull(specificMetaModel.getEClassifier("A"));
		
		assertEquals(true, ((EClass)specificMetaModel.getEClassifier("A")).getEStructuralFeature("B").isMany());
		
		SpecificModelGenerator modelGenerator = new SpecificModelGenerator();
		EObject specificModel = modelGenerator.generateModel(specificMetaModel, genericModel);
		
		assertNotNull(specificModel);
		System.out.println(xmlModelRepository.serializeModel(specificMetaModel, specificModel));
	}
	
	@Test
	public void testComplexValues2() {
		SpecificMetaModelGenerator instance = new SpecificMetaModelGenerator();
		String modelStr =
			"<edu.hu.clickwatch.model:Node xmlns:edu.hu.clickwatch.model='edu.hu.clickwatch.model'>" + 
			"  <element name='e1'>" +
			"    <handler name='h1'><A name='a'>TEXT<B name='b'/></A></handler>" +
			"  </element>" +
			"</edu.hu.clickwatch.model:Node>";
		
		XmlModelRepository xmlModelRepository = injector.getInstance(XmlModelRepository.class);
		Node genericModel = (Node)xmlModelRepository.deserializeXml(modelStr);
		EPackage specificMetaModel = instance.generateMetaModel(genericModel);
		
		assertNotNull(specificMetaModel.getEClassifier("Node"));
		assertNotNull(specificMetaModel.getEClassifier("Element"));
		assertNotNull(specificMetaModel.getEClassifier("e1"));
		assertNotNull(specificMetaModel.getEClassifier("h1"));
		assertNotNull(specificMetaModel.getEClassifier("B"));
		assertNotNull(specificMetaModel.getEClassifier("A"));
		
		assertEquals(false, ((EClass)specificMetaModel.getEClassifier("A")).getEStructuralFeature("B").isMany());
		
		SpecificModelGenerator modelGenerator = new SpecificModelGenerator();
		EObject specificModel = modelGenerator.generateModel(specificMetaModel, genericModel);
		
		assertNotNull(specificModel);
		System.out.println(xmlModelRepository.serializeModel(specificMetaModel, specificModel));
	}
	
	@Test
	public void testMultipleNodes() {
		SpecificMetaModelGenerator instance = new SpecificMetaModelGenerator();
		String modelStr =
			"<edu.hu.clickwatch.model:Network xmlns:edu.hu.clickwatch.model='edu.hu.clickwatch.model'>" +
			"  <node>" +
			"    <element name='e1'>" +
			"      <handler name='h1'>20</handler>" +
			"    </element>" +
			"  </node>" +
			"  <node>" +
			"    <element name='e1'>" +
			"      <handler name='h1'>TEXT</handler>" +
			"    </element>" +
			"  </node>" +
			"</edu.hu.clickwatch.model:Network>";
		
		XmlModelRepository xmlModelRepository = injector.getInstance(XmlModelRepository.class);
		Network genericModel = (Network)xmlModelRepository.deserializeXml(modelStr);
		EPackage specificMetaModel = instance.generateMetaModel(genericModel);
		
		assertNotNull(specificMetaModel.getEClassifier("Network"));
		assertNotNull(specificMetaModel.getEClassifier("Node"));
		assertNotNull(specificMetaModel.getEClassifier("Element"));
		assertNotNull(specificMetaModel.getEClassifier("e1"));
		
		assertEquals(specificMetaModel.getEClassifier("e1"), ((EClass)specificMetaModel.getEClassifier("Node")).getEStructuralFeature("e1").getEType());
		assertEquals(false, ((EClass)specificMetaModel.getEClassifier("e1")).getEStructuralFeature("h1").isMany());
		
		SpecificModelGenerator modelGenerator = new SpecificModelGenerator();
		EObject specificModel = modelGenerator.generateModel(specificMetaModel, genericModel);
		
		assertNotNull(specificModel);
		System.out.println(xmlModelRepository.serializeModel(specificMetaModel, specificModel));
	}
	
	@Test
	public void testWithRecordedModel() throws Exception {
		String record = 
			"src/" + this.getClass().getPackage().getName().replace(".", "/") + "/test.clickwatchmodel";
		ResourceSet rs = new ResourceSetImpl();
		Map<Object, Object> options = new HashMap<Object, Object>();
		options.put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
		rs.getLoadOptions().put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
		Resource resource = rs.getResource(URI.createFileURI(record), true);
		Network genericModel = (Network)resource.getContents().get(0);
		
		XmlModelRepository xmlModelRepository = injector.getInstance(XmlModelRepository.class);
		SpecificMetaModelGenerator instance = new SpecificMetaModelGenerator();
		EPackage specificMetaModel = instance.generateMetaModel(genericModel);
		
		SpecificModelGenerator modelGenerator = new SpecificModelGenerator();
		EObject specificModel = modelGenerator.generateModel(specificMetaModel, genericModel);
		
		assertNotNull(specificModel);
		System.out.println(xmlModelRepository.serializeModel(EcorePackage.eINSTANCE, specificMetaModel));
		System.out.println(xmlModelRepository.serializeModel(specificMetaModel, specificModel));
	}
}
