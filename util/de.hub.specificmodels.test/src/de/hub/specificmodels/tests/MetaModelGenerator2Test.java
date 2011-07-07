package de.hub.specificmodels.tests;

import static de.hub.specificmodels.metamodelgenerator2.DefaultTargetObjectCreator.ANNOTATION_SOURCE;
import static de.hub.specificmodels.metamodelgenerator2.DefaultTargetObjectCreator.TARGET_ID;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.junit.BeforeClass;
import org.junit.Test;

import de.hub.specificmodels.metamodelgenerator2.MetaModelGenerator;
import de.hub.specificmodels.tests.testsourcemodel.TestTargetIdProvider;
import de.hub.specificmodels.tests.testsourcemodel.util.builder.ClassWithListFeaturesBuilder;
import de.hub.specificmodels.tests.testsourcemodel.util.builder.ListFeatureElementClass1Builder;
import de.hub.specificmodels.tests.testsourcemodel.util.builder.RootClassBuilder;

public class MetaModelGenerator2Test {

	@BeforeClass
	public static void initialize() {
		if (!EPackage.Registry.INSTANCE.containsKey(EcorePackage.eINSTANCE.getNsURI())) {
			EPackage.Registry.INSTANCE.put(EcorePackage.eINSTANCE.getNsURI(), EcorePackage.eINSTANCE);
		}
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new XMIResourceFactoryImpl());
	}
	
	@Test
	public void rootClassTest() throws IOException {
		EObject source = RootClassBuilder.newRootClassBuilder()
				.withAnAttribute1("anValue").build();
		
		EPackage result = MetaModelGenerator.generate(new TestTargetIdProvider(), source);
		
		save(result);
		
		assertEquals(1, result.getEClassifiers().size());
		assertClass(result, "RootClass", "RootClass", "anAttribute1", null);
	}
	
	@Test
	public void listFeatureTest()  throws IOException {
		EObject source = RootClassBuilder.newRootClassBuilder()
				.withAnAttribute1("anValue")
				.withNormalReference(ClassWithListFeaturesBuilder.newClassWithListFeaturesBuilder()
						.withAnAttribute1(1)
						.withListFeature1(ListFeatureElementClass1Builder.newListFeatureElementClass1Builder()
								.withName("listFeature1_1")					
						)
		).build();
		
		EPackage result = MetaModelGenerator.generate(new TestTargetIdProvider(), source);
		
		save(result);

		assertClass(result, "ListFeature1_1", "RootClass/normalReference:ClassWithListFeatures/listFeature1_1|listFeature1:ListFeature1_1|ListFeatureElementClass1", "name", null);
	}
	
	private void save(EPackage result) throws IOException {
		ResourceSet rs = new ResourceSetImpl();
		Resource resource = rs.createResource(URI.createFileURI("test_out.ecore"));
		resource.getContents().add(result);
		resource.save(null);
	}
	

	private static void assertClass(EPackage result, String className, String targetId, String attributeName, EDataType attributeType) {
		assertNotNull(result.getEClassifier(className));
		if (attributeName != null) {
			assertNotNull(((EClass)result.getEClassifier(className)).getEStructuralFeature(attributeName));
			if (attributeType != null) {
				assertEquals(attributeType, ((EClass)result.getEClassifier(className)).getEStructuralFeature(attributeName).getEType());
			}
		}
		assertNotNull(result.getEClassifier(className).getEAnnotation(ANNOTATION_SOURCE));
		if (targetId != null) {
			assertEquals(targetId, result.getEClassifier(className).getEAnnotation(ANNOTATION_SOURCE).getDetails().get(TARGET_ID));
		} else {
			assertNotNull(result.getEClassifier(className).getEAnnotation(ANNOTATION_SOURCE).getDetails().get(TARGET_ID));
		}
	}
}
