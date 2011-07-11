package de.hub.specificmodels.tests;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.eclipse.emf.ecore.EPackage;
import org.junit.Test;

public class XmlMultiplicitiesTests extends AbstractTests {

	@Test
	public void testMultiplicities0() throws IOException {
		String xmlStr = "<xml><foo/></xml>";
		
		EPackage result = generate(createRootWithXml(xmlStr));
		
		save(result);
		
		assertEquals(3, result.getEClassifiers().size());
		assertClass(result, "RootClass", null, "xml", null, 1);
		assertClass(result, "Xml", null, "foo", null, 1);
		assertClass(result, "Foo", "RootClass/xml|xml:Xml|EObject/foo|foo:Foo|EObject", null, null, 1);
	}
	
	@Test
	public void testMultiplicities1() throws IOException {
		String xmlStr = "<xml><foo/><foo/><foo/></xml>";
		
		EPackage result = generate(createRootWithXml(xmlStr));
		
		save(result);
		
		assertEquals(3, result.getEClassifiers().size());
		assertClass(result, "RootClass", null, "xml", null, 1);
		assertClass(result, "Xml", null, "foo", null, -1);
		assertClass(result, "Foo", "RootClass/xml|xml:Xml|EObject/foo|foo:Foo|EObject", null, null, 1);
	}
	
	@Test
	public void testMultiplicities2() throws IOException {
		String xmlStr = "<xml><foo/></xml><xml><foo/></xml>";
		
		EPackage result = generate(createRootWithXml(xmlStr));
		
		save(result);
		
		assertEquals(3, result.getEClassifiers().size());
		assertClass(result, "RootClass", null, "xml", null, -1);
		assertClass(result, "Xml", null, "foo", null, 1);
		assertClass(result, "Foo", "RootClass/xml|xml:Xml|EObject/foo|foo:Foo|EObject", null, null, 1);
	}
	
	@Test
	public void testMultiplicities3() throws IOException {
		String xmlStr = "<xml><bar><foo/></bar></xml><xml><bar><foo/></bar></xml>";
		
		EPackage result = generate(createRootWithXml(xmlStr));
		
		save(result);
		
		assertClass(result, "RootClass", null, "xml", null, -1);
		assertClass(result, "Xml", null, "bar", null, 1);
		assertClass(result, "Bar", null, "foo", null, 1);
		assertClass(result, "Foo", null, null, null);
	}
	
	@Test
	public void testMultiplicities4() throws IOException {
		String xmlStr = "<xml><bar><foo/></bar><bar/></xml><xml><bar><foo/></bar></xml>";
		
		EPackage result = generate(createRootWithXml(xmlStr));
		
		save(result);
		
		assertClass(result, "RootClass", null, "xml", null, -1);
		assertClass(result, "Xml", null, "bar", null, -1);
		assertClass(result, "Bar", null, "foo", null, 1);
		assertClass(result, "Foo", null, null, null);
	}
	
	@Test
	public void testMultiplicities5() throws IOException {
		String xmlStr = "<xml><bar><foo/><foo/></bar></xml><xml><bar><foo/></bar></xml>";
		
		EPackage result = generate(createRootWithXml(xmlStr));
		
		save(result);
		
		assertClass(result, "RootClass", null, "xml", null, -1);
		assertClass(result, "Xml", null, "bar", null, 1);
		assertClass(result, "Bar", null, "foo", null, -1);
		assertClass(result, "Foo", null, null, null);
	}
	
	@Test
	public void testMultiplicities6() throws IOException {
		String xmlStr = "<xml><bar><foo/><foo/></bar></xml><xml><bar><foo/></bar><bar/></xml>";
		
		EPackage result = generate(createRootWithXml(xmlStr));
		
		save(result);
		
		assertClass(result, "RootClass", null, "xml", null, -1);
		assertClass(result, "Xml", null, "bar", null, -1);
		assertClass(result, "Bar", null, "foo", null, -1);
		assertClass(result, "Foo", null, null, null);
	}
}
