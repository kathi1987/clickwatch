package de.hub.specificmodels.metamodelgenerator;

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

import de.hub.specificmodels.metamodelgenerator.targetproperties.Containment;
import de.hub.specificmodels.metamodelgenerator.targetproperties.FeatureMapMultiplicity;
import de.hub.specificmodels.metamodelgenerator.targetproperties.GuessTypes;
import de.hub.specificmodels.metamodelgenerator.targetproperties.IsCopy;
import de.hub.specificmodels.metamodelgenerator.types.ITypeDescription;
import de.hub.specificmodels.metamodelgenerator.types.TypeDescriptions;

public class DefaultTargetObjectCreator implements ITargetObjectCreator {
	
	public final static String ANNOTATION_SOURCE = "http://de.hub.clickwatch.specificmodels";
	public static final String TARGET_ID = "target_id";
	
	private final ITypeDescription rootType; 
	
	private EObject latestObject = null;
	
	public DefaultTargetObjectCreator() {
		TypeDescriptions types = new TypeDescriptions();
		EcorePackage ecore = EcorePackage.eINSTANCE;
		types.addType(null, ecore.getEString());
		types.addType(ecore.getEString(), ecore.getEBigDecimal());
		types.addType(ecore.getEBigDecimal(), ecore.getEDouble());
		types.addType(ecore.getEDouble(), ecore.getEBigInteger());
		types.addType(ecore.getEBigInteger(), ecore.getELong());
		types.addType(ecore.getELong(), ecore.getEInt());
		this.rootType = types.getRoot();
	}

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
	
	private void setLatestObject(SourceObjectKey currentSok) {
		latestObject = currentSok.getObject();
	}
	
	@Override
	public EReference createTargetReference(String featureName, EClass type,
			TargetId targetId, SourceObjectKey sok) {
		setLatestObject(sok);
		EReference targetFeature = EcoreFactory.eINSTANCE.createEReference();
		targetFeature.setName(featureName);
		targetFeature.setEType(type);
		copyAttributeValues(targetId.getSourceFeature(), targetFeature);
		if (!targetId.getProperty(IsCopy.class).get()) {
			targetFeature.setUpperBound(1);
		}
		targetFeature.setContainment(targetId.getProperty(Containment.class).get());
		
		// TODO backwards
		return targetFeature;
	}

	@Override
	public EAttribute createTargetAttribute(String featureName,
			TargetId targetId, SourceObjectKey sok) {
		setLatestObject(sok);
		EAttribute targetFeature = EcoreFactory.eINSTANCE.createEAttribute();
		targetFeature.setName(featureName);
		if (targetId.getProperty(GuessTypes.class).get()) {
			EDataType type = rootType.smallestFittingChild(sok.getValue().toString(), null).getEType();
			targetFeature.setEType(type);
		} else {
			targetFeature.setEType(targetId.getSourceFeature().getEType());
		}
		copyAttributeValues(targetId.getSourceFeature(), targetFeature);
		return targetFeature;
	}

	@Override
	public void updateTargetFeature(EStructuralFeature targetFeature,
			TargetId targetId, SourceObjectKey sok) {
		if (targetFeature instanceof EAttribute && targetId.getProperty(GuessTypes.class).get()) {
			EDataType currentType = (EDataType)targetFeature.getEType();
			EDataType newType = rootType.smallestFittingChild(sok.getValue().toString(), currentType).getEType();
			if (newType != currentType) {
				targetFeature.setEType(newType);
			}
		}
		
		if (targetId.getProperty(FeatureMapMultiplicity.class).get()) {
			if (latestObject == sok.getObject()) {
				targetFeature.setUpperBound(-1);
			}
		}
		
		setLatestObject(sok);
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
