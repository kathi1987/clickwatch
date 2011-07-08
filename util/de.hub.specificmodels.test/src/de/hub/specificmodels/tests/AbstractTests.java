package de.hub.specificmodels.tests;

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
import org.junit.BeforeClass;

import de.hub.clickwatch.XmlModelRepository;
import de.hub.specificmodels.metamodelgenerator.MetaModelGenerator;
import de.hub.specificmodels.metamodelgenerator.targetidprovider.TargetIdProviderFactoryProvider;
import de.hub.specificmodels.tests.testsourcemodel.RootClass;
import de.hub.specificmodels.tests.testsourcemodel.TestSourceModelFactory;
import de.hub.specificmodels.tests.testsourcemodel.TestTargetIdProviderFactory;

public class AbstractTests {

	@BeforeClass
	public static void initialize() {
		if (!EPackage.Registry.INSTANCE.containsKey(EcorePackage.eINSTANCE.getNsURI())) {
			EPackage.Registry.INSTANCE.put(EcorePackage.eINSTANCE.getNsURI(), EcorePackage.eINSTANCE);
		}
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new XMIResourceFactoryImpl());
		
		if (!EPackage.Registry.INSTANCE.containsKey(XMLTypePackage.eINSTANCE.getNsURI())) {
			EPackage.Registry.INSTANCE.put(XMLTypePackage.eINSTANCE.getNsURI(), XMLTypePackage.eINSTANCE);
		}
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xml", new XMIResourceFactoryImpl());
	}
	

	protected EPackage generate(EObject source) {
		return MetaModelGenerator.generate(new TargetIdProviderFactoryProvider(new TestTargetIdProviderFactory()), source);
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

	protected static void assertClass(EPackage result, String className, String targetId, String attributeName, EDataType attributeType) {
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
	
	protected EObject createRootWithXml(String xmlStr) throws IOException {	
		RootClass root = TestSourceModelFactory.eINSTANCE.createRootClass();
		FeatureMap map = root.getAny();
		deserialize(xmlStr, map);		
		return root;
	}
}
