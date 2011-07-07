package de.hub.specificmodels.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.junit.Test;

public class XmlTests extends AbstractTests {
	
	@Test
	public void testXmlCreation() throws IOException {
		EObject root = deserialize("<foo><bar/></foo>");
		assertNotNull(root);
	}
	
	@Test
	public void testGeneral() throws IOException {
		String xmlStr = "<xml><foo name='foo'><bar name='bar1'/><bar name='bar2'/></foo></xml>";
		
		EPackage result = generate(deserialize(xmlStr));
		
		save(result);
		
		assertEquals(4, result.getEClassifiers().size());
		assertClass(result, "Foo", "RootClass/xml|xml:Xml|EObject/foo|foo:Foo|EObject", "name", null);
		assertClass(result, "Bar", null, "name", null);
	}
	
	@Test
	public void testParallel() throws IOException {
		String xmlStr = "<xml><foo><bar/></foo><foo><bar/></foo></xml>";
		
		EPackage result = generate(deserialize(xmlStr));
		
		save(result);
		
		assertEquals(4, result.getEClassifiers().size());
		assertClass(result, "Foo", "RootClass/xml|xml:Xml|EObject/foo|foo:Foo|EObject", null, null);
		assertClass(result, "Bar", null, null, null);
	}

}
