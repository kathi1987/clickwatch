package de.hub.specificmodels.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.junit.Test;

import de.hub.specificmodels.tests.testsourcemodel.RootClass;
import de.hub.specificmodels.tests.testsourcemodel.util.builder.ClassWithListFeaturesBuilder;
import de.hub.specificmodels.tests.testsourcemodel.util.builder.ListFeatureElementClass1Builder;
import de.hub.specificmodels.tests.testsourcemodel.util.builder.RootClassBuilder;

public class XmlNamesAndCollisionTests extends AbstractTests {
	
	@Test
	public void testXmlCreation() throws IOException {
		EObject root = createRootWithXml("<foo><bar/></foo>");
		assertNotNull(root);
	}
	
	@Test
	public void testGeneral() throws IOException {
		String xmlStr = "<xml><foo name='foo'><bar name='bar1'/><bar name='bar2'/></foo></xml>";
		
		EPackage result = generate(createRootWithXml(xmlStr));
		
		save(result);
		
		assertEquals(4, result.getEClassifiers().size());
		assertClass(result, "Foo", "RootClass/xml|xml:Xml|EObject/foo|foo:Foo|EObject", "name", null);
		assertClass(result, "Bar", null, "name", null);
	}
	
	@Test
	public void testParallel() throws IOException {
		String xmlStr = "<xml><foo><bar/></foo><foo><bar/></foo></xml>";
		
		EPackage result = generate(createRootWithXml(xmlStr));
		
		save(result);
		
		assertEquals(4, result.getEClassifiers().size());
		assertClass(result, "Foo", "RootClass/xml|xml:Xml|EObject/foo|foo:Foo|EObject", null, null);
		assertClass(result, "Bar", null, null, null);
	}
	
	@Test
	public void testParallelCollision() throws IOException {
		String xmlStr = "<one><foo/></one><two><foo/></two>";
		
		EPackage result = generate(createRootWithXml(xmlStr));
		
		save(result);
		
		assertEquals(5, result.getEClassifiers().size());		
		assertClass(result, "RootClassOneFoo", "RootClass/one|one:One|EObject/foo|foo:Foo|EObject", null, null);
		assertClass(result, "RootClassTwoFoo", "RootClass/two|two:Two|EObject/foo|foo:Foo|EObject", null, null);
	}

	@Test
	public void testCopyAttributeCollision() throws IOException {
		String xmlStr = "<anAttribute1 name='1'><foo/></anAttribute1>";
		
		EPackage result = generate(createRootWithXml(xmlStr));
		
		save(result);
		
		assertEquals(3, result.getEClassifiers().size());
		assertClass(result, "AnAttribute1", null, "name", null);
		assertClass(result, "RootClass", null, "anAttribute1", null);
		assertClass(result, "RootClass", null, "anAttribute1AnAttribute1", null);
	}
	
	@Test
	public void listFeatureWithXmlCollisionTest()  throws IOException {
		EObject source = RootClassBuilder.newRootClassBuilder()
				.withNormalReference(ClassWithListFeaturesBuilder.newClassWithListFeaturesBuilder()
						.withListFeature1(ListFeatureElementClass1Builder.newListFeatureElementClass1Builder()
								.withName("listFeature1_1")					
						)
						.withListFeature1(ListFeatureElementClass1Builder.newListFeatureElementClass1Builder()
								.withName("listFeature1_2")
						)
		).build();
		
		RootClass rootClass = (RootClass)source;
		deserialize("<foo name='foo1'/>", rootClass.getNormalReference().get(0).getListFeature1().get(0).getAny());
		deserialize("<foo name='foo2'/>", rootClass.getNormalReference().get(0).getListFeature1().get(1).getAny());

		EPackage result = generate(source);
		
		save(result);
		
		assertClass(result, "RootClassClassWithListFeaturesListFeature1_1Foo", "RootClass/normalReference:ClassWithListFeatures/listFeature1_1|listFeature1:ListFeature1_1|ListFeatureElementClass1/foo|foo:Foo|EObject", "name", null);
		assertClass(result, "RootClassClassWithListFeaturesListFeature1_2Foo", "RootClass/normalReference:ClassWithListFeatures/listFeature1_2|listFeature1:ListFeature1_2|ListFeatureElementClass1/foo|foo:Foo|EObject", "name", null);
	}
	
}
