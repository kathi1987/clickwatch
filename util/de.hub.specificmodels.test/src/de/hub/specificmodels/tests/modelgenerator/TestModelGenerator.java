package de.hub.specificmodels.tests.modelgenerator;

import java.io.IOException;
import java.util.List;

import junit.framework.Assert;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.junit.Test;

import de.hub.specificmodels.modelgenerator.ModelGenerator;
import de.hub.specificmodels.tests.common.AbstractTests;
import de.hub.specificmodels.tests.testsourcemodel.util.builder.ClassWithListFeaturesBuilder;
import de.hub.specificmodels.tests.testsourcemodel.util.builder.ListFeatureElementClass1Builder;
import de.hub.specificmodels.tests.testsourcemodel.util.builder.RootClassBuilder;

public class TestModelGenerator extends AbstractTests {

	@Test
	public void testGeneral() throws IOException {
		EObject source = RootClassBuilder.newRootClassBuilder().withAnAttribute1("anValue").build();
		
		EPackage metaModel = generateMetaModel(source);
		EObject model = generateModel(metaModel, source);
		
		Assert.assertEquals("anValue", model.eGet(model.eClass().getEStructuralFeature("anAttribute1")));
	}

	private EObject generateModel(EPackage metaModel, EObject source) {
		ModelGenerator modelGenerator = injector.getInstance(ModelGenerator.class);
		return modelGenerator.generate(metaModel, source);
	}
	
	@Test
	public void testWithListFeature()  throws IOException {
		EObject source = RootClassBuilder.newRootClassBuilder()
				.withAnAttribute1("anValue")
				.withNormalReference(ClassWithListFeaturesBuilder.newClassWithListFeaturesBuilder()
						.withAnAttribute1(1)
						.withListFeature1(ListFeatureElementClass1Builder.newListFeatureElementClass1Builder()
								.withName("listFeature1_1")					
						)
		).build();
		
		EPackage metaModel = generateMetaModel(source);
		EObject model = generateModel(metaModel, source);
		
		Assert.assertEquals("anValue", model.eGet(model.eClass().getEStructuralFeature("anAttribute1")));
		Assert.assertEquals(1, ((List<?>)model.eGet(model.eClass().getEStructuralFeature("normalReference"))).size());
		EObject classWithListFeaturesInstance = (EObject)((List<?>)model.eGet(model.eClass().getEStructuralFeature("normalReference"))).get(0);
		Assert.assertNotNull(classWithListFeaturesInstance);
		EObject listFeatureElementClassInstance = (EObject)classWithListFeaturesInstance.eGet(classWithListFeaturesInstance.eClass().getEStructuralFeature("listFeature1_1"));
		Assert.assertNotNull(listFeatureElementClassInstance);
		Assert.assertEquals("ListFeature1_1", listFeatureElementClassInstance.eClass().getName());
		Assert.assertEquals("ListFeatureElementClass1", listFeatureElementClassInstance.eClass().getESuperTypes().get(0).getName());
		Assert.assertEquals("listFeature1_1", listFeatureElementClassInstance.eGet(listFeatureElementClassInstance.eClass().getEStructuralFeature("name")));
	}
	
	@Test
	public void testWithXml() throws IOException {
		String xmlStr = "<xml><foo a='str' b='1'/><foo a='str' b='1.3'/></xml>";
		
		EObject source = createRootWithXml(xmlStr);
		EPackage metaModel = generateMetaModel(source);
		EObject model = generateModel(metaModel, source);
		
		EObject xml = (EObject)model.eGet(model.eClass().getEStructuralFeature("xml"));
		Assert.assertNotNull(xml);
		EObject foo = (EObject)((List<?>)xml.eGet(xml.eClass().getEStructuralFeature("foo"))).get(0);
		Assert.assertNotNull(foo);
		Assert.assertEquals("str", foo.eGet(foo.eClass().getEStructuralFeature("a")));
		Assert.assertEquals(1.0, foo.eGet(foo.eClass().getEStructuralFeature("b")));
	}
}
