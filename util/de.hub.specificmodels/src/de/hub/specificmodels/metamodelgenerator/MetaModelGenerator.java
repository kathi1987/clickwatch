package de.hub.specificmodels.metamodelgenerator;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.util.FeatureMap;

import com.google.common.base.Preconditions;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;

import de.hub.specificmodels.metamodelgenerator.ITargetIdProvider.ITargetIdProviderContext;
import de.hub.specificmodels.metamodelgenerator.targetproperties.SuperClasses;

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
public class MetaModelGenerator {

	private final ITargetIdProvider targetIdProvider;
	private final ITargetIdProviderContext ctx = new TargetIdProviderContext();
	private final Map<SourceObjectKey, TargetId[]> objectToTargetIdMap = new HashMap<SourceObjectKey, TargetId[]>();
	private final Multimap<TargetId, SourceObjectKey> targetIdsToObjectMap = HashMultimap
			.create();

	// TODO injection
	private final ITargetObjectCreator targetObjectCreator = new DefaultTargetObjectCreator();

	public static EPackage generate(ITargetIdProvider targetIdProvider,
			EObject root) {
		return new MetaModelGenerator(targetIdProvider).generateMetaModel(root);
	}

	private MetaModelGenerator(ITargetIdProvider targetIdProvider) {
		super();
		this.targetIdProvider = targetIdProvider;
	}

	private class TargetIdProviderContext implements ITargetIdProviderContext {
		@Override
		public TargetId[] getExistingTargetIds(SourceObjectKey sourceObject) {
			return getProvidedTargetIds(sourceObject);
		}
	}

	private TargetId[] getProvidedTargetIds(SourceObjectKey object) {
		TargetId[] result = objectToTargetIdMap.get(object);
		if (result == null) {
			result = targetIdProvider.provideTargetIds(ctx, object);
			objectToTargetIdMap.put(object, result);
		}
		return result;
	}

	private boolean ommitFeature(EStructuralFeature feature) {
		return false;
	}

	private void collectTargetIdsForSourceObjectKey(SourceObjectKey key) {
		TargetId[] targetIds = getProvidedTargetIds(key);
		for (TargetId targetId : targetIds) {
			this.targetIdsToObjectMap.put(targetId, key);
		}
	}

	private void traverseSourceModel(SourceObjectKey sourceObjectKey) {
		Preconditions.checkArgument(sourceObjectKey.getValue() instanceof EObject);
		EObject sourceObject = (EObject)sourceObjectKey.getValue();
		for (EStructuralFeature feature : sourceObject.eClass()
				.getEStructuralFeatures()) {
			if (!ommitFeature(feature)) {
				Object rawValue = sourceObject.eGet(feature);
				List<?> values = null;
				if (feature.isMany()) {
					values = (List<?>) rawValue;
				} else {
					values = Arrays.asList(new Object[] { rawValue });
				}
				for (Object value : values) {
					SourceObjectKey childKey = createChildKey(sourceObjectKey, sourceObject, feature, value);
					collectTargetIdsForSourceObjectKey(childKey);
				}
				for (Object value : values) {
					SourceObjectKey childKey = createChildKey(sourceObjectKey, sourceObject, feature, value);
					if (feature instanceof EReference || (value instanceof FeatureMap.Entry && ((FeatureMap.Entry)value).getValue() instanceof EObject)) {
						if (feature instanceof EReference) {
							Preconditions.checkArgument(((EReference)feature).isContainment(), "non containment references are not supported");
						}
						traverseSourceModel(childKey);
					} 
				}				
			}
		}
	}

	private SourceObjectKey createChildKey(SourceObjectKey sourceObjectKey,
			EObject sourceObject, EStructuralFeature feature, Object value) {
		SourceObjectKey key;
		if (value instanceof FeatureMap.Entry) {
			FeatureMap.Entry fme = (FeatureMap.Entry)value;
			key = new SourceObjectKey(sourceObjectKey, sourceObject, fme.getEStructuralFeature(), fme.getValue());
		} else {
			key = new SourceObjectKey(sourceObject, feature, value);
		}
		return key;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void resolveCollisions(
			Map<? extends ITargetMetaId, TargetId> metaIds) {
		Multimap<Object, ITargetMetaId> hashableMetaIdRepToMetaIdMap = HashMultimap.create();
		for (ITargetMetaId metaId : metaIds.keySet()) {
			Collection<ITargetMetaId> existingMetaIds = hashableMetaIdRepToMetaIdMap.get(metaId.hashableRep());
			if (existingMetaIds != null && !existingMetaIds.isEmpty()) {
				for (ITargetMetaId collidee : existingMetaIds) {
					collidee.addCollision(metaId);
					metaId.addCollision(collidee);
				}
			}
			hashableMetaIdRepToMetaIdMap.put(metaId.hashableRep(), metaId);
		}
		for (ITargetMetaId metaId : metaIds.keySet()) {
			metaId.resolveCollisions();
		}
	}

	public EPackage generateMetaModel(EObject root) {
		// collecting targetIds for all objects
		SourceObjectKey rootKey = new SourceObjectKey(null, null, root);
		collectTargetIdsForSourceObjectKey(rootKey);
		traverseSourceModel(rootKey);

		// computing targetMetaIds
		Map<TargetClassId, TargetId> targetClassIds = new HashMap<TargetClassId, TargetId>();
		Map<TargetId, TargetClassId> targetIdToTargetClassIdMap = new HashMap<TargetId, TargetClassId>();
		Map<TargetFeatureId, TargetId> targetFeatureIds = new HashMap<TargetFeatureId, TargetId>();
		for (TargetId targetId : targetIdsToObjectMap.keySet()) {
			if (targetId.hasClass()) {
				TargetClassId classId = TargetClassId.create(targetId);
				targetClassIds.put(classId, targetId);
				targetIdToTargetClassIdMap.put(targetId, classId);
			}
		}
		for (TargetId targetId : targetIdsToObjectMap.keySet()) {
			if (targetId.hasFeature()) {
				Preconditions.checkState(targetId.getParent() != null);
				TargetClassId parentClassId = targetIdToTargetClassIdMap.get(targetId.getParent());
				TargetFeatureId featureId = TargetFeatureId.create(parentClassId, targetId);
				targetFeatureIds.put(featureId, targetId);
			}
		}

		// resolve collisions
		resolveCollisions(targetClassIds);
		resolveCollisions(targetFeatureIds);

		// creating and updating targetClasses
		EPackage result = EcoreFactory.eINSTANCE.createEPackage();
		for (TargetClassId targetClassId : targetClassIds.keySet()) {
			TargetId targetId = targetClassIds.get(targetClassId);
			for (SourceObjectKey sok : targetIdsToObjectMap.get(targetId)) {
				String className = targetClassId.getClassName();
				EClass existingTargetClass = (EClass) result
						.getEClassifier(className);
				if (existingTargetClass == null) {
					EClass targetClass = targetObjectCreator.createTargetClass(
							className, targetId, sok);
					result.getEClassifiers().add(targetClass);
				} else {
					targetObjectCreator.updateTargetClass(existingTargetClass,
							targetId, sok);
				}
			}
		}

		// added super classes (this is not perfect, it introduces an unwanted coupling with TargetId properties (e.g. super classes))
		for (TargetClassId targetClassId : targetClassIds.keySet()) {
			TargetId targetId = targetClassIds.get(targetClassId);
			for (TargetId superClassTargetId : targetId.getProperty(SuperClasses.class).get()) {
				TargetClassId superClassTargetClassId = targetIdToTargetClassIdMap
						.get(superClassTargetId);
				EClass superClass = (EClass) result
						.getEClassifier(superClassTargetClassId.getClassName());
				EClass targetClass = (EClass) result
						.getEClassifier(targetClassId.getClassName());
				targetObjectCreator.addSuperClass(targetClass, superClass);
			}
		}

		// creating and updating targetFeatures
		for (TargetFeatureId targetFeatureId : targetFeatureIds.keySet()) {
			TargetId targetId = targetFeatureIds.get(targetFeatureId);
			for (SourceObjectKey sok : targetIdsToObjectMap.get(targetId)) {
				Preconditions.checkState(sok.getFeature() != null);
				String featureName = targetFeatureId.getFeatureName();
				String className = targetFeatureId.getClassId().getClassName();
				EStructuralFeature exisitingFeature = ((EClass) result
						.getEClassifier(className))
						.getEStructuralFeature(featureName);
				if (exisitingFeature == null) {
					EStructuralFeature targetFeature = null;
					if (targetId.getSourceFeature() instanceof EReference) {
						TargetClassId typeClassId = targetIdToTargetClassIdMap
								.get(targetId);
						EClass type = (EClass) result
								.getEClassifier(typeClassId.getClassName());
						targetFeature = targetObjectCreator
								.createTargetReference(featureName, type,
										targetId, sok);
					} else {
						targetFeature = targetObjectCreator
								.createTargetAttribute(featureName, targetId,
										sok);
					}

					((EClass) result.getEClassifier(className))
							.getEStructuralFeatures().add(targetFeature);
				} else {
					targetObjectCreator.updateTargetFeature(exisitingFeature,
							targetId, sok);
				}
			}
		}

		return result;
	}
}
