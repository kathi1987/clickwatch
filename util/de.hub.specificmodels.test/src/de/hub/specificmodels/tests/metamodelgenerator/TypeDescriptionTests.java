package de.hub.specificmodels.tests.metamodelgenerator;

import junit.framework.Assert;

import org.eclipse.emf.ecore.EcorePackage;
import org.junit.Test;

import de.hub.specificmodels.metamodelgenerator.types.TypeDescriptions;

public class TypeDescriptionTests {

	@Test
	public void threadHierarchy() {
		TypeDescriptions types = new TypeDescriptions();
		EcorePackage ecore = EcorePackage.eINSTANCE;
		types.addType(null, ecore.getEString());
		types.addType(ecore.getEString(), ecore.getEDouble());
		types.addType(ecore.getEDouble(), ecore.getEInt());
		
		Assert.assertEquals(ecore.getEInt(), types.getRoot().smallestFittingChild("1", null).getEType());
		Assert.assertEquals(ecore.getEDouble(), types.getRoot().smallestFittingChild("1.1", null).getEType());
	}
	
	@Test
	public void threadHierarchyWithRestrictions() {
		TypeDescriptions types = new TypeDescriptions();
		EcorePackage ecore = EcorePackage.eINSTANCE;
		types.addType(null, ecore.getEString());
		types.addType(ecore.getEString(), ecore.getEDouble());
		types.addType(ecore.getEDouble(), ecore.getEInt());
		
		Assert.assertEquals(ecore.getEInt(), types.getRoot().smallestFittingChild("1", null).getEType());
		Assert.assertEquals(ecore.getEDouble(), types.getRoot().smallestFittingChild("1.1", null).getEType());
		Assert.assertEquals(ecore.getEDouble(), types.getRoot().smallestFittingChild("1", ecore.getEDouble()).getEType());
	}
}
