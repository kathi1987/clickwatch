package de.hub.specificmodels.tests.common;

import static de.hub.specificmodels.metamodelgenerator.DefaultTargetObjectCreator.ANNOTATION_SOURCE;
import static de.hub.specificmodels.metamodelgenerator.DefaultTargetObjectCreator.TARGET_ID;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xml.type.AnyType;
import org.eclipse.emf.ecore.xml.type.XMLTypeDocumentRoot;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.junit.Before;
import org.junit.BeforeClass;

import com.google.inject.Binder;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;
import com.google.inject.name.Names;

import de.hub.clickwatch.XmlModelRepository;
import de.hub.specificmodels.common.ITargetIdProvider;
import de.hub.specificmodels.common.targetidprovider.TargetIdProviderFactoryProvider;
import de.hub.specificmodels.metamodelgenerator.MetaModelGenerator;
import de.hub.specificmodels.tests.testsourcemodel.RootClass;
import de.hub.specificmodels.tests.testsourcemodel.TestSourceModelFactory;

public class AbstractTests {
	
	protected Injector injector = null;

	@BeforeClass
	public static void initializeClass() {
		if (!EPackage.Registry.INSTANCE.containsKey(EcorePackage.eINSTANCE.getNsURI())) {
			EPackage.Registry.INSTANCE.put(EcorePackage.eINSTANCE.getNsURI(), EcorePackage.eINSTANCE);
		}
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new XMIResourceFactoryImpl());
		
		if (!EPackage.Registry.INSTANCE.containsKey(XMLTypePackage.eINSTANCE.getNsURI())) {
			EPackage.Registry.INSTANCE.put(XMLTypePackage.eINSTANCE.getNsURI(), XMLTypePackage.eINSTANCE);
		}
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xml", new XMIResourceFactoryImpl());
	}
	
	@Before
	public void initialize() {
		injector = Guice.createInjector(new Module() {
			@Override
			public void configure(Binder binder) {
				binder.bind(String.class).annotatedWith(Names.named(MetaModelGenerator.COMMON_CLASS_PREFIX_NAME)).toInstance("");
				binder.bind(ITargetIdProvider.class).toInstance(new TargetIdProviderFactoryProvider(new TestTargetIdProviderFactory()));
			}
		});
	}
	
	protected EPackage generateMetaModel(EObject source) {
		return injector.getInstance(MetaModelGenerator.class).generateMetaModel(source);
	}
	
	protected void save(EPackage result) throws IOException {
		ResourceSet rs = new ResourceSetImpl();
		Resource resource = rs.createResource(URI.createFileURI("test_out.ecore"));
		resource.getContents().add(result);
		resource.save(null);
	}
	
	protected void deserialize(String xmlStr, FeatureMap map) {
		XmlModelRepository xmlModelRepository = new XmlModelRepository();
		xmlStr = XmlModelRepository.stripProcessingInstructions(xmlStr);
		XMLTypeDocumentRoot xml = (XMLTypeDocumentRoot)xmlModelRepository.deserializeXml("<xml>" + xmlStr + "</xml>");
		
		FeatureMap xmlRootMixed = ((AnyType)xml.getMixed().getValue(0)).getMixed();
		if (xmlRootMixed.size() > 0) {
			for(FeatureMap.Entry entry: xmlRootMixed) {
				Object anyValue = entry.getValue();
				if (!(anyValue == null || (anyValue instanceof String && "".equals(((String)anyValue).trim())))) {
					EStructuralFeature anyFeature = entry.getEStructuralFeature();
					if (anyValue instanceof EObject) {
						anyValue = EcoreUtil.copy((EObject)anyValue);
					}
					map.add(FeatureMapUtil.createRawEntry(anyFeature, anyValue));						
				}
			}					
		}
		EcoreUtil.delete(xml, true);
	}

	public static void assertClass(EPackage result, String className, String targetId, String attributeName, EDataType attributeType, int upperBound) {
		assertNotNull(result.getEClassifier(className));
		if (attributeName != null) {
			assertNotNull(((EClass)result.getEClassifier(className)).getEStructuralFeature(attributeName));
			if (attributeType != null) {
				assertEquals(attributeType, ((EClass)result.getEClassifier(className)).getEStructuralFeature(attributeName).getEType());
			}
			if (upperBound != -10) {
				assertEquals(upperBound, ((EClass)result.getEClassifier(className)).getEStructuralFeature(attributeName).getUpperBound());
			}
		}
		assertNotNull(result.getEClassifier(className).getEAnnotation(ANNOTATION_SOURCE));
		if (targetId != null) {
			assertEquals(targetId, result.getEClassifier(className).getEAnnotation(ANNOTATION_SOURCE).getDetails().get(TARGET_ID));
		} else {
			assertNotNull(result.getEClassifier(className).getEAnnotation(ANNOTATION_SOURCE).getDetails().get(TARGET_ID));
		}

	}
	
	protected static void assertClass(EPackage result, String className, String targetId, String attributeName, EDataType attributeType) {
		assertClass(result, className, targetId, attributeName, attributeType, -10);
	}
	
	protected EObject createRootWithXml(String xmlStr) throws IOException {	
		RootClass root = TestSourceModelFactory.eINSTANCE.createRootClass();
		FeatureMap map = root.getAny();
		deserialize(xmlStr, map);		
		return root;
	}
}
