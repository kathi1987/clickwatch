package de.hub.specificmodels.modelgenerator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;

import com.google.common.base.Preconditions;

import de.hub.specificmodels.common.AbstractGenerator;
import de.hub.specificmodels.common.ModelTraverser;
import de.hub.specificmodels.common.SourceObjectKey;
import de.hub.specificmodels.common.TargetId;
import de.hub.specificmodels.metamodelgenerator.DefaultTargetObjectCreator;

public class ModelGenerator extends AbstractGenerator {
	
	public EObject generate(EPackage specificMetaModel, EObject root) {
		return generate(new NullProgressMonitor(), specificMetaModel, root);
	}

	public EObject generate(IProgressMonitor monitor, EPackage specificMetaModel, EObject root) {
		monitor.beginTask("Create specific model", 2);
		
		// build target_id map
		final Map<String, EClass> targetIdToClass = new HashMap<String, EClass>();
		final Map<String, EStructuralFeature> targetIdToFeature = new HashMap<String, EStructuralFeature>();
		Iterator<EObject> it = specificMetaModel.eAllContents();
		while(it.hasNext()) {
			EObject next = it.next();
			if (next instanceof EModelElement) {
				EModelElement nextModelElement = (EModelElement)next;
				EAnnotation annotation = nextModelElement.getEAnnotation(DefaultTargetObjectCreator.ANNOTATION_SOURCE);
				if (annotation != null) {
					String targetId = annotation.getDetails().get(DefaultTargetObjectCreator.TARGET_ID);
					if (nextModelElement instanceof EClass) {
						Preconditions.checkState(targetIdToClass.get(targetId) == null, "target id was given twice.");
						targetIdToClass.put(targetId, (EClass)nextModelElement);
					} else if (nextModelElement instanceof EStructuralFeature) {
						Preconditions.checkState(targetIdToFeature.get(targetId) == null, "target id was given twice.");
						targetIdToFeature.put(targetId, (EStructuralFeature)nextModelElement);
					} else {
						Preconditions.checkState(false);
					}
				}
			}
		}
		monitor.worked(1);
		
		final EFactory factory = specificMetaModel.getEFactoryInstance();
		
		// traverse the source mode and create targets
		final Map<EObject, EObject> sourceToTarget = new HashMap<EObject, EObject>();
		SourceObjectKey rootKey = new SourceObjectKey(null, null, root);
		new ModelTraverser().traverseSourceModel(new ModelTraverserConfiguration() {
			@SuppressWarnings({ "unchecked", "rawtypes" })
			@Override
			public void work(SourceObjectKey sok) {
				EObject targetObject = null;
				if (sok.getObject() != null) {
					targetObject = sourceToTarget.get(sok.getObject());
				}
				Preconditions.checkState(sok.isRoot() || targetObject != null);
				TargetId[] targetIds = getTargetIds(sok);
				EClass targetClass = null;
				for(TargetId targetId: targetIds) {
					EClass preTargetId = targetIdToClass.get(targetId.getTargetReferenceString());
					if (preTargetId != null) {
						if (targetClass == null) {
							targetClass = preTargetId;
						} else {
							if (targetClass.getEAllSuperTypes().contains(preTargetId)) {
								
							} else if (preTargetId.getEAllSuperTypes().contains(targetClass)) {
								targetClass = preTargetId;
							} else {
								Preconditions.checkState(false, "target has to be instance of two unrelated classes -> impossible");
							}
						}
					}
				}
				
				Object targetValue = null;
				boolean valueHasTarget = false;
				for(TargetId targetId: targetIds) {
					EStructuralFeature targetFeature = targetIdToFeature.get(targetId.getTargetReferenceString());
					if (targetFeature != null) {
						if (targetValue == null) {
							if (targetClass != null) {
								targetValue = factory.create(targetClass);
								sourceToTarget.put((EObject)sok.getValue(), (EObject)targetValue);
							} else {
								Preconditions.checkState(targetFeature instanceof EAttribute);
								if (sok.getFeature().getEType() == targetFeature.getEType()) {
									targetValue = sok.getValue();
								} else {
									targetValue = EcoreFactory.eINSTANCE.createFromString((EDataType)targetFeature.getEType(), sok.getValue().toString());
								}
							}
						}
						if (targetFeature.isMany()) {
							((EList)targetObject.eGet(targetFeature)).add(targetValue);
						} else {
							targetObject.eSet(targetFeature, targetValue);
						}
						valueHasTarget = true;
					} else {
						Preconditions.checkState(sok.isRoot(), "No feature for " + targetId.getTargetReferenceString());
					}
				}				
				
				if (sok.isRoot()) {
					targetValue = factory.create(targetClass);
					sourceToTarget.put((EObject)sok.getValue(), (EObject)targetValue);
				} else if (!valueHasTarget) {
					Preconditions.checkState(true, "No target for SOK " + sok);
				}
			}
		}, rootKey);
		monitor.worked(1);
		
		monitor.done();
		return sourceToTarget.get(root);
	}
}
