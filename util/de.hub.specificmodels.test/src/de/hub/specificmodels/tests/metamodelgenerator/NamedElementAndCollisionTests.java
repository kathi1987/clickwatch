package de.hub.specificmodels.tests.metamodelgenerator;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.junit.Test;

import de.hub.specificmodels.tests.common.AbstractTests;
import de.hub.specificmodels.tests.testsourcemodel.util.builder.ClassWithListFeaturesBuilder;
import de.hub.specificmodels.tests.testsourcemodel.util.builder.ListFeatureElementClass1Builder;
import de.hub.specificmodels.tests.testsourcemodel.util.builder.ListFeatureElementClass2Builder;
import de.hub.specificmodels.tests.testsourcemodel.util.builder.ListFeatureElementClass3Builder;
import de.hub.specificmodels.tests.testsourcemodel.util.builder.RootClassBuilder;

public class NamedElementAndCollisionTests extends AbstractTests {
	
	@Test
	public void rootClassTest() throws IOException {
		EObject source = RootClassBuilder.newRootClassBuilder().withAnAttribute1("anValue").build();
		
		EPackage result = generateMetaModel(source);
		
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
		
		EPackage result = generateMetaModel(source);
		
		save(result);

		assertClass(result, "ListFeature1_1", "RootClass/normalReference:ClassWithListFeatures/listFeature1_1|listFeature1:ListFeature1_1|ListFeatureElementClass1", "name", null);
		assertClass(result, "RootClass", null, "normalReference", null, -1);
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

		EPackage result = generateMetaModel(source);
		
		save(result);
		
		assertClass(result, "RootClassClassWithListFeaturesListFeatureElementClass1", "RootClass/normalReference:ClassWithListFeatures/collision|listFeature1:Collision|ListFeatureElementClass1", "name", null);
		assertClass(result, "RootClassClassWithListFeaturesListFeatureElementClass2", "RootClass/normalReference:ClassWithListFeatures/collision|listFeature2:Collision|ListFeatureElementClass2", "name", null);
	}
	
	@Test
	public void listFeatureWithRegularFeatureCollisionTest() throws IOException {
		EObject source = RootClassBuilder.newRootClassBuilder()
				.withNormalReference(ClassWithListFeaturesBuilder.newClassWithListFeaturesBuilder()
						.withAnAttribute1(1)
						.withListFeature1(ListFeatureElementClass1Builder.newListFeatureElementClass1Builder()
								.withName("anAttribute1")					
						)
		).build();

		EPackage result = generateMetaModel(source);	
		
		save(result);
		
		assertClass(result, "ClassWithListFeatures", "RootClass/normalReference:ClassWithListFeatures", "anAttribute1", null);
		assertClass(result, "ClassWithListFeatures", "RootClass/normalReference:ClassWithListFeatures", "listFeature1AnAttribute1", null);
		assertClass(result, "AnAttribute1", "RootClass/normalReference:ClassWithListFeatures/anAttribute1|listFeature1:AnAttribute1|ListFeatureElementClass1", null, null);
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
		
		EPackage result = generateMetaModel(source);
		
		save(result);
		
		assertClass(result, "RootClassClassWithListFeaturesCollision", "RootClass/normalReference:ClassWithListFeatures/collision|listFeature1:Collision|ListFeatureElementClass1", "collision", null);
		assertClass(result, "RootClassClassWithListFeaturesCollisionCollision", "RootClass/normalReference:ClassWithListFeatures/collision|listFeature1:Collision|ListFeatureElementClass1/collision|listFeature3:Collision|ListFeatureElementClass3", null, null);
	}
	
}
