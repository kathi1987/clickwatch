package de.hub.specificmodels.metamodelgenerator;

import java.util.Collection;
import java.util.HashSet;
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
import org.eclipse.emf.ecore.util.ExtendedMetaData;

import com.google.common.base.Preconditions;

import de.hub.specificmodels.common.SourceObjectKey;
import de.hub.specificmodels.common.TargetId;
import de.hub.specificmodels.common.targetproperties.Containment;
import de.hub.specificmodels.common.targetproperties.GuessMultiplicities;
import de.hub.specificmodels.common.targetproperties.GuessTypes;
import de.hub.specificmodels.common.targetproperties.IsBasedOnXml;
import de.hub.specificmodels.common.targetproperties.IsCopy;
import de.hub.specificmodels.common.targetproperties.XmlName;
import de.hub.specificmodels.metamodelgenerator.types.ITypeDescription;
import de.hub.specificmodels.metamodelgenerator.types.TypeDescriptions;

public class DefaultTargetObjectCreator implements ITargetObjectCreator {
	
	public final static String ANNOTATION_SOURCE = "http://de.hub.clickwatch.specificmodels";
	public static final String TARGET_ID = "target_id";
	
	private final ITypeDescription rootType; 
	
	private EObject latestObject = null;
	private Collection<EStructuralFeature> featuresInLatestObject = new HashSet<EStructuralFeature>();
	
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
		// empty (what to update for? -> drop update completely)		
	}
	
	private void setLatestObject(SourceObjectKey currentSok, EStructuralFeature forFeature) {
		if (latestObject != currentSok.getObject()) {
			featuresInLatestObject.clear();
		}
		featuresInLatestObject.add(forFeature);
		latestObject = currentSok.getObject();
	}
	
	@Override
	public EReference createTargetReference(EClass containingClass, String featureName, EClass type,
			TargetId targetId, SourceObjectKey sok) {
		EReference targetFeature = EcoreFactory.eINSTANCE.createEReference();
		targetFeature.setName(featureName);
		targetFeature.setEType(type);
		copyAttributeValues(targetId.getSourceFeature(), targetFeature);
		setDefaultAttributeValue(targetId, targetFeature);
		if (targetId.getProperty(GuessMultiplicities.class).get()) {
			targetFeature.setUpperBound(1);
		}
		targetFeature.setContainment(targetId.getProperty(Containment.class).get());
		
		setLatestObject(sok, targetFeature);
		addAnnotation(targetFeature, TARGET_ID, targetId.getTargetReferenceString());
		addAnnotation(targetFeature, IsCopy.class.getSimpleName(), targetId.getProperty(IsCopy.class).get().toString());
		
		EReference parentFeature = EcoreFactory.eINSTANCE.createEReference();
		parentFeature.setName("eContainer_" + featureName);
		parentFeature.setEType(containingClass);
		type.getEStructuralFeatures().add(parentFeature);
		parentFeature.setEOpposite(targetFeature);
		targetFeature.setEOpposite(parentFeature);
		parentFeature.setTransient(targetFeature.isTransient());
		
		addXmlNameAnnotation(targetFeature, targetId);
		return targetFeature;
	}

	@Override
	public EAttribute createTargetAttribute(String featureName,
			TargetId targetId, SourceObjectKey sok) {
		EAttribute targetFeature = EcoreFactory.eINSTANCE.createEAttribute();
		targetFeature.setName(featureName);
		if (targetId.getProperty(GuessTypes.class).get()) {
			EDataType type = rootType.smallestFittingChild(sok.getValue().toString(), null).getEType();
			targetFeature.setEType(type);
		} else {
			targetFeature.setEType(targetId.getSourceFeature().getEType());
		}
		copyAttributeValues(targetId.getSourceFeature(), targetFeature);
		setDefaultAttributeValue(targetId, targetFeature);
		if (targetId.getProperty(GuessMultiplicities.class).get()) {
			targetFeature.setUpperBound(1);
		}
		setLatestObject(sok, targetFeature);
		addAnnotation(targetFeature, TARGET_ID, targetId.getTargetReferenceString());
		addXmlNameAnnotation(targetFeature, targetId);
		return targetFeature;
	}

	private void addXmlNameAnnotation(EStructuralFeature targetFeature,
			TargetId targetId) {
		String xmlName = targetId.getProperty(XmlName.class).get();
		if (xmlName != null && !targetFeature.getName().equals(xmlName)) {
			EAnnotation annotation = EcoreFactory.eINSTANCE.createEAnnotation();
			annotation.setSource(ExtendedMetaData.ANNOTATION_URI);
			annotation.getDetails().put("name", xmlName);
			if (targetFeature instanceof EAttribute) {
				annotation.getDetails().put("kind", ExtendedMetaData.FEATURE_KINDS[ExtendedMetaData.ATTRIBUTE_FEATURE]);
			} else if (targetFeature instanceof EReference) {
				annotation.getDetails().put("kind", ExtendedMetaData.FEATURE_KINDS[ExtendedMetaData.ELEMENT_FEATURE]);
			}
			targetFeature.getEAnnotations().add(annotation);
		}
	}

	private void setDefaultAttributeValue(TargetId targetId,
			EStructuralFeature targetFeature) {
		if (targetId.getProperty(IsBasedOnXml.class).get()) {
			targetFeature.setDerived(false);
			targetFeature.setTransient(false);
			targetFeature.setVolatile(false);
		}
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
		
		if (targetId.getProperty(GuessMultiplicities.class).get()) {
			if (latestObject == sok.getObject() && featuresInLatestObject.contains(targetFeature)) {
				targetFeature.setUpperBound(-1);
			}	
		}
		
		setLatestObject(sok, targetFeature);
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
