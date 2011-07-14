package de.hub.specificmodels.tests.metamodelgenerator;

import java.io.IOException;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.junit.Test;

import de.hub.specificmodels.tests.common.AbstractTests;

public class GuessTypesTests extends AbstractTests {

	@Test 
	public void testPrimitiveTypes1() throws IOException {
		String xmlStr = "<foo int='1'/>";	
		EPackage result = generateMetaModel(createRootWithXml(xmlStr));
		
		save(result);
		
		assertClass(result, "Foo", null, "int", EcorePackage.eINSTANCE.getEInt());
	}
	
	@Test 
	public void testPrimitiveTypes2() throws IOException {
		String xmlStr = "<foo int='1'/><foo int='2'/>";	
		EPackage result = generateMetaModel(createRootWithXml(xmlStr));
		
		save(result);
		
		assertClass(result, "Foo", null, "int", EcorePackage.eINSTANCE.getEInt());
	}
	
	@Test 
	public void testPrimitiveTypes3() throws IOException {
		String xmlStr = "<foo double='1'/><foo double='2.2'/>";	
		EPackage result = generateMetaModel(createRootWithXml(xmlStr));
		
		save(result);
		
		assertClass(result, "Foo", null, "double", EcorePackage.eINSTANCE.getEDouble());
	}
	
	@Test 
	public void testPrimitiveTypes4() throws IOException {
		String xmlStr = "<foo string='1'/><foo string='2.2'/><foo string='hellow'/>";	
		EPackage result = generateMetaModel(createRootWithXml(xmlStr));
		
		save(result);
		
		assertClass(result, "Foo", null, "string", EcorePackage.eINSTANCE.getEString());
	}
	
	@Test 
	public void testPrimitiveTypes5() throws IOException {
		String xmlStr = "<foo string='hellow'/><foo string='1'/><foo string='2.2'/>";	
		EPackage result = generateMetaModel(createRootWithXml(xmlStr));
		
		save(result);
		
		assertClass(result, "Foo", null, "string", EcorePackage.eINSTANCE.getEString());
	}
}
