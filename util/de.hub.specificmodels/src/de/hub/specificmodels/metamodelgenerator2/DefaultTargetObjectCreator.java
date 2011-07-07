package de.hub.specificmodels.metamodelgenerator2;

import java.util.List;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;

import com.google.common.base.Preconditions;

import de.hub.specificmodels.metamodelgenerator.IFeatureKey;

public class DefaultTargetObjectCreator implements ITargetObjectCreator {
	
	public final static String ANNOTATION_SOURCE = "http://de.hub.clickwatch.specificmodels";
	public static final String TARGET_ID = "target_id";

	@Override
	public EClass createTargetClass(String className, TargetId targetId,
			SourceObjectKey object) {
		EClass targetClass = EcoreFactory.eINSTANCE.createEClass();
		targetClass.setName(className);	
		
		addAnnotation(targetClass, TARGET_ID, targetId.getTargetReferenceString());
		copyAttributeValues(targetId.getSourceClass(), targetClass);
		return targetClass;
	}

	@Override
	public void addSuperClass(EClass targetClass, EClass superClass) {
		targetClass.getESuperTypes().add(superClass);
	}

	@Override
	public void updateTargetClass(EClass targetClass, TargetId targetId,
			SourceObjectKey object) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public EReference createTargetReference(String featureName, EClass type,
			TargetId targetId, SourceObjectKey object) {
		EReference targetFeature = EcoreFactory.eINSTANCE.createEReference();
		targetFeature.setName(featureName);
		targetFeature.setEType(type);
		copyAttributeValues(targetId.getSourceFeature(), targetFeature);
		if (!targetId.getTargetFeatureName().equals("")) {
			targetFeature.setUpperBound(1);
		}
		targetFeature.setContainment(targetId.isContainment());
		
		// TODO backwards
		return targetFeature;
	}

	@Override
	public EAttribute createTargetAttribute(String featureName,
			TargetId targetId, SourceObjectKey object) {
		EAttribute targetFeature = EcoreFactory.eINSTANCE.createEAttribute();
		targetFeature.setName(featureName);
		targetFeature.setEType(targetId.getSourceFeature().getEType());
		// TODO type hierarchy ala legacy metamodel generator
		copyAttributeValues(targetId.getSourceFeature(), targetFeature);
		return targetFeature;
	}

	@Override
	public void updateTargetFeature(EStructuralFeature targetFeature,
			TargetId targetId, SourceObjectKey object) {
		// TODO Auto-generated method stub
		
	}

	protected void addAnnotation(EModelElement targetObject, String key, String value) {
		EAnnotation annotation = targetObject.getEAnnotation(ANNOTATION_SOURCE);
		if (annotation == null) {
			EcoreFactory factory = EcoreFactory.eINSTANCE;
			annotation = factory.createEAnnotation();
			annotation.setSource(ANNOTATION_SOURCE);
			targetObject.getEAnnotations().add(annotation);
		}
			
		annotation.getDetails().put(key, value);

	}
	
	protected void updateFeature(EStructuralFeature target, IFeatureKey featureKey, Object value) {
		if (target instanceof EAttribute) {
			EAttribute targetAttribute = (EAttribute)target;
			EDataType dataType = targetAttribute.getEAttributeType();
			if (dataType != EcorePackage.eINSTANCE.getEString()) {
				if (!dataType.isInstance(value)) {
					targetAttribute.setEType(EcorePackage.eINSTANCE.getEString());
				}
			}
		}
	}

	@SuppressWarnings("unchecked")
	private void copyAttributeValues(EObject source, EObject target) {
		Preconditions.checkArgument(source.eClass() == target.eClass());
		for (EStructuralFeature feature: source.eClass().getEAllStructuralFeatures()) {
			if (feature instanceof EAttribute && 
					!feature.isDerived() && 
					!feature.isTransient() && 
					!feature.isUnsettable() && feature != EcorePackage.eINSTANCE.getENamedElement_Name()) {
				if (feature.isMany()) {
					List<Object> sourceList = (List<Object>)source.eGet(feature);
					((List<Object>)target.eGet(feature)).addAll(sourceList);
				} else {
					target.eSet(feature, source.eGet(feature));
				}
			}
		}
	}
}
