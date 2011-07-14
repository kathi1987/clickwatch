package de.hub.specificmodels.metamodelgenerator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;

import com.google.common.base.Preconditions;
import com.google.inject.Inject;

import de.hub.specificmodels.common.AbstractGenerator;
import de.hub.specificmodels.common.ITargetIdProvider;
import de.hub.specificmodels.common.ModelTraverser;
import de.hub.specificmodels.common.SourceObjectKey;
import de.hub.specificmodels.common.TargetId;
import de.hub.specificmodels.common.targetproperties.SuperClasses;

/**
 * This class realizes the following algorithm: First source elements (source
 * objects, their attributes and references) are represented by
 * {@link SourceObjectKey}s. For those {@link SourceObjectKey}s,
 * {@link TargetId}s are generated. Those {@link TargetId}s provide an unique
 * identifier for the target meta-model that the source model elements are
 * mapped to.
 * 
 * {@link TargetId}s are for {@link SourceObjectKey}s what meta-objects are for
 * objects. {@link TargetId}s are created from {@link SourceObjectKey} by a
 * {@link ITargetIdProvider}. This {@link ITargetIdProvider} is source
 * meta-model specific and has to be implemented by API users.
 * 
 * Then, {@link ITargetMetaId}s are created for {@link TargetId}s. A
 * {@link TargetId} can potentially be mapped to both a {@link TargetClassId}
 * and {@link TargetFeatureId}, because a {@link TargetId} represents both a
 * reference to an class and the class.
 * 
 * {@link ITargetMetaId}s represent target meta-model elements and their names.
 * Name conflicts (called collisions) are resolved within the
 * {@link ITargetMetaId}s. After that actual meta-model elements are created
 * from {@link ITargetMetaId}s and their corresponding {@link TargetId}.
 * 
 * Meta-model elements are then updated based on {@link SourceObjectKey}
 * corresponding to corresponding {@link TargetId}s.
 * 
 * A {@link ITargetObjectCreator} is used to create and unpdate target meta
 * model elements based on {@link ITargetMetaId}s, {@link TargetId}, and
 * {@link SourceObjectKey}s. The is a {@link DefaultTargetObjectCreator} but it
 * can also be configured by API users.
 */
public class MetaModelGenerator extends AbstractGenerator {

	public static final String COMMON_CLASS_PREFIX_NAME = "commonClassPrefixName";
	
	@Inject
	private TargetClassId.TargetClassIdProvider targetClassIdProvider;

	@Inject
	private ITargetObjectCreator targetObjectCreator;
	

	public EPackage generateMetaModel(EObject root) {
		final Collection<TargetId> targetIds = new HashSet<TargetId>();
		
		// collecting targetIds for all objects
		ModelTraverserConfiguration collectTargetIdsConfig = new ModelTraverserConfiguration() {
			@Override
			public void work(SourceObjectKey sok) {
				TargetId[] providedTargetIds = getTargetIds(sok);
				for (TargetId targetId : providedTargetIds) {
					targetIds.add(targetId);
				}
			}
		};
		SourceObjectKey rootKey = new SourceObjectKey(null, null, root);
		collectTargetIdsConfig.work(rootKey);
		new ModelTraverser().traverseSourceModel(collectTargetIdsConfig, rootKey);

		// computing targetMetaIds
		Namespace<TargetClassId> packageNS = new Namespace<TargetClassId>();
		final Map<TargetId, TargetClassId> targetIdToTargetClassIdMap = new HashMap<TargetId, TargetClassId>();
		final Map<TargetId, TargetFeatureId> targetIdToTargetFeatureIdMap = new HashMap<TargetId, TargetFeatureId>();
		for (TargetId targetId : targetIds) {
			if (targetId.hasClass()) {
				TargetClassId classId = targetClassIdProvider.create(targetId);
				targetIdToTargetClassIdMap.put(targetId, classId);
				packageNS.addName(classId);
			}
		}
		for (TargetId targetId : targetIds) {
			if (targetId.hasFeature()) {
				Preconditions.checkState(targetId.getParent() != null);
				TargetClassId parentClassId = targetIdToTargetClassIdMap.get(targetId.getParent());
				TargetFeatureId featureId = TargetFeatureId.create(parentClassId, targetId);
				targetIdToTargetFeatureIdMap.put(targetId, featureId);
			}
		}

		// resolve class collisions
		packageNS.handleCollisions();

		// creating and updating targetClasses
		final EPackage result = EcoreFactory.eINSTANCE.createEPackage();
		new ModelTraverser().traverseSourceModel(new ModelTraverserConfiguration() {
			@Override
			public void work(SourceObjectKey sok) {
				for(TargetId targetId: sokToTargetId.get(sok)) {
					TargetClassId targetClassId = targetIdToTargetClassIdMap.get(targetId);
					if (targetClassId != null) {
						String className = targetClassId.getName();
						EClass existingTargetClass = (EClass)result.getEClassifier(className);
						if (existingTargetClass == null) {
							EClass targetClass = targetObjectCreator.createTargetClass(className, targetId, sok);
							result.getEClassifiers().add(targetClass);
						} else {
							targetObjectCreator.updateTargetClass(existingTargetClass, targetId, sok);
						}
					}
				}
			}
		}, rootKey);	

		// adding super classes (this is not perfect, it introduces an unwanted 
		// coupling with TargetId properties (e.g. super classes))
		for (TargetClassId targetClassId : targetIdToTargetClassIdMap.values()) {
			TargetId targetId = targetClassId.getTargetId(); 
			for (TargetId superClassTargetId : targetId.getProperty(SuperClasses.class).get()) {
				TargetClassId superClassTargetClassId = targetIdToTargetClassIdMap.get(superClassTargetId);
				EClass superClass = (EClass) result.getEClassifier(superClassTargetClassId.getName());
				EClass targetClass = (EClass) result.getEClassifier(targetClassId.getName());
				targetObjectCreator.addSuperClass(targetClass, superClass);
				targetClassId.inherit(superClassTargetClassId);
			}
		}
		
		// resolving feature collisions
		for (TargetClassId targetClassId: targetIdToTargetClassIdMap.values()) {
			targetClassId.handleCollisions();
		}

		// creating and updating targetFeatures
		new ModelTraverser().traverseSourceModel(new ModelTraverserConfiguration() {
			@Override
			public void work(SourceObjectKey sok) {
				for(TargetId targetId: sokToTargetId.get(sok)) {
					TargetFeatureId targetFeatureId = targetIdToTargetFeatureIdMap.get(targetId);
					if (targetFeatureId != null) {
						Preconditions.checkState(sok.getFeature() != null);
						String featureName = targetFeatureId.getName();
						String className = targetFeatureId.getClassId().getName();
						EStructuralFeature exisitingFeature = ((EClass) result
								.getEClassifier(className))
								.getEStructuralFeature(featureName);
						if (exisitingFeature == null) {
							EStructuralFeature targetFeature = null;
							if (targetId.getSourceFeature() instanceof EReference) {
								TargetClassId typeClassId = targetIdToTargetClassIdMap.get(targetId);
								EClass type = (EClass) result.getEClassifier(typeClassId.getName());
								targetFeature = targetObjectCreator.createTargetReference(featureName, type,
										targetId, sok);
							} else {
								targetFeature = targetObjectCreator.createTargetAttribute(featureName, targetId, sok);
							}
	
							((EClass) result.getEClassifier(className)).getEStructuralFeatures().add(targetFeature);
						} else {
							targetObjectCreator.updateTargetFeature(exisitingFeature,
									targetId, sok);
						}
					}
				}
			}
		}, rootKey);	
		
		List<EClassifier> classifiers = result.getEClassifiers();
		List<EClassifier> copy = new ArrayList<EClassifier>();
		copy.addAll(classifiers);
		Collections.sort(copy, new Comparator<EClassifier>() {
			@Override
			public int compare(EClassifier arg0, EClassifier arg1) {
				return arg0.getName().compareTo(arg1.getName());
			}			
		});
		
		EPackage result2 = EcoreFactory.eINSTANCE.createEPackage();
		result2.getEClassifiers().addAll(copy);

		return result2;
	}
}
