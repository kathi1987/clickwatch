package de.hub.specificmodels.tests;

import static de.hub.specificmodels.metamodelgenerator.AbstractClassCreator.ANNOTATION_SOURCE;
import static de.hub.specificmodels.metamodelgenerator.AbstractClassCreator.META_SOURCE_REFERENCE_KEY;
import static de.hub.specificmodels.metamodelgenerator.AbstractClassCreator.SOURCE_REFERENCE_KEY;
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

import de.hub.specificmodels.metamodelgenerator.MetaModelGenerator;
import de.hub.specificmodels.tests.testsourcemodel.TestSourceModelClassCreatorFactory;
import de.hub.specificmodels.tests.testsourcemodel.util.builder.ClassWithListFeaturesBuilder;
import de.hub.specificmodels.tests.testsourcemodel.util.builder.ListFeatureElementClass1Builder;
import de.hub.specificmodels.tests.testsourcemodel.util.builder.ListFeatureElementClass2Builder;
import de.hub.specificmodels.tests.testsourcemodel.util.builder.ListFeatureElementClass3Builder;
import de.hub.specificmodels.tests.testsourcemodel.util.builder.RootClassBuilder;

public class MetaModelGeneratorTest {
	
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
		
		TestSourceModelClassCreatorFactory factory = new TestSourceModelClassCreatorFactory();
		EPackage result = MetaModelGenerator.generate(source, factory, factory);
		
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
								.withName("listFeature1")					
						)
		).build();
		
		TestSourceModelClassCreatorFactory factory = new TestSourceModelClassCreatorFactory();
		EPackage result = MetaModelGenerator.generate(source, factory, factory);
		
		save(result);

		assertClass(result, "ListFeature1", "RootClass/normalReference:ClassWithListFeatures/listFeature1:listFeature1", "name", null);
	}
	
	@Test
	public void listFeatureNameCollisionTest()  throws IOException {
		EObject source = RootClassBuilder.newRootClassBuilder()
				.withAnAttribute1("anValue")
				.withNormalReference(ClassWithListFeaturesBuilder.newClassWithListFeaturesBuilder()
						.withAnAttribute1(1)
						.withListFeature1(ListFeatureElementClass1Builder.newListFeatureElementClass1Builder()
								.withName("collision")					
						)
						.withListFeature2(ListFeatureElementClass2Builder.newListFeatureElementClass2Builder()
								.withName("collision")
						)
		).build();
		
		TestSourceModelClassCreatorFactory factory = new TestSourceModelClassCreatorFactory();
		EPackage result = MetaModelGenerator.generate(source, factory, factory);	
		
		save(result);
		
		assertClass(result, "ListFeature2_collision", "RootClass/normalReference:ClassWithListFeatures/listFeature2:collision", "name", null);
		assertClass(result, "ListFeature1_collision", "RootClass/normalReference:ClassWithListFeatures/listFeature1:collision", "name", null);
	}
	
	@Test
	public void listFeatureInnerNameCollisionTest()  throws IOException {
		EObject source = RootClassBuilder.newRootClassBuilder()
				.withAnAttribute1("anValue")
				.withNormalReference(ClassWithListFeaturesBuilder.newClassWithListFeaturesBuilder()
						.withAnAttribute1(1)
						.withListFeature1(ListFeatureElementClass1Builder.newListFeatureElementClass1Builder()
								.withName("collision")		
								.withListFeature3(ListFeatureElementClass3Builder.newListFeatureElementClass3Builder()
										.withName("collision"))
						)
		).build();
		
		TestSourceModelClassCreatorFactory factory = new TestSourceModelClassCreatorFactory();
		EPackage result = MetaModelGenerator.generate(source, factory, factory);
		
		save(result);
		
		assertClass(result, "Collision", "RootClass/normalReference:ClassWithListFeatures/listFeature1:collision", null, null);
		assertClass(result, "Collision_listFeature3_collision", "RootClass/normalReference:ClassWithListFeatures/listFeature1:collision/listFeature3:collision", null, null);
	}

	@Test
	public void simpleSingleValuesTest() throws IOException {
		EObject source = RootClassBuilder.newRootClassBuilder()
				.withAnAttribute1("anValue")
				.withNormalReference(ClassWithListFeaturesBuilder.newClassWithListFeaturesBuilder()
						.withAnAttribute1(1)
						.withListFeature1(ListFeatureElementClass1Builder.newListFeatureElementClass1Builder()
								.withName("feature1_1")
								.withListFeature3(ListFeatureElementClass3Builder.newListFeatureElementClass3Builder()
										.withName("feature3_1")
								)
						)
						.withListFeature2(ListFeatureElementClass2Builder.newListFeatureElementClass2Builder()
								.withName("feature2_1")
						)
		).build();
		
		TestSourceModelClassCreatorFactory factory = new TestSourceModelClassCreatorFactory();
		EPackage result = MetaModelGenerator.generate(source, factory, factory);	
	
		save(result);
		
		assertEquals(5, result.getEClassifiers().size());
		assertClass(result, "Feature3_1", "RootClass/normalReference:ClassWithListFeatures/listFeature1:feature1_1/listFeature3:feature3_1", "name", EcorePackage.eINSTANCE.getEString());
		assertClass(result, "Feature2_1", "RootClass/normalReference:ClassWithListFeatures/listFeature2:feature2_1", "name", EcorePackage.eINSTANCE.getEString());
	}
	
	private void save(EPackage result) throws IOException {
		ResourceSet rs = new ResourceSetImpl();
		Resource resource = rs.createResource(URI.createFileURI("test_out.ecore"));
		resource.getContents().add(result);
		resource.save(null);
	}
	

	private static void assertClass(EPackage result, String className, String sourceReference, String attributeName, EDataType attributeType) {
		assertNotNull(result.getEClassifier(className));
		if (attributeName != null) {
			assertNotNull(((EClass)result.getEClassifier(className)).getEStructuralFeature(attributeName));
			if (attributeType != null) {
				assertEquals(attributeType, ((EClass)result.getEClassifier(className)).getEStructuralFeature(attributeName).getEType());
			}
		}
		assertNotNull(result.getEClassifier(className).getEAnnotation(ANNOTATION_SOURCE));
		assertNotNull(result.getEClassifier(className).getEAnnotation(ANNOTATION_SOURCE).getDetails().get(META_SOURCE_REFERENCE_KEY));
		if (sourceReference != null) {
			assertEquals(sourceReference, result.getEClassifier(className).getEAnnotation(ANNOTATION_SOURCE).getDetails().get(SOURCE_REFERENCE_KEY));
		} else {
			assertNotNull(result.getEClassifier(className).getEAnnotation(ANNOTATION_SOURCE).getDetails().get(SOURCE_REFERENCE_KEY));
		}
	}
}
