package de.hub.specificmodels.metamodelgenerator;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;

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
	
	private final Map<SourceObjectKey, TargetId[]> sokToTargetId = new HashMap<SourceObjectKey, TargetId[]>();	
	private final Collection<TargetId> targetIds = new HashSet<TargetId>();

	// TODO injection
	private final ITargetObjectCreator targetObjectCreator = new DefaultTargetObjectCreator();

	public MetaModelGenerator(ITargetIdProvider targetIdProvider) {
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
		TargetId[] result = sokToTargetId.get(object);
		if (result == null) {
			result = targetIdProvider.provideTargetIds(ctx, object);
			sokToTargetId.put(object, result);
		}
		return result;
	}

	private void collectTargetIdsForSourceObjectKey(SourceObjectKey key) {
		TargetId[] targetIds = getProvidedTargetIds(key);
		for (TargetId targetId : targetIds) {
			this.targetIds.add(targetId);
		}
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void resolveCollisions(Collection<? extends ITargetMetaId> metaIds) {
		Multimap<Object, ITargetMetaId> hashableMetaIdRepToMetaIdMap = HashMultimap.create();
		for (ITargetMetaId metaId : metaIds) {
			Collection<ITargetMetaId> existingMetaIds = hashableMetaIdRepToMetaIdMap.get(metaId.hashableRep());
			if (existingMetaIds != null && !existingMetaIds.isEmpty()) {
				for (ITargetMetaId collidee : existingMetaIds) {
					collidee.addCollision(metaId);
					metaId.addCollision(collidee);
				}
			}
			hashableMetaIdRepToMetaIdMap.put(metaId.hashableRep(), metaId);
		}
		for (ITargetMetaId metaId : metaIds) {
			metaId.resolveCollisions();
		}
	}
	
	protected boolean ommitFeature(EStructuralFeature feature) {
		if (feature.isDerived() == true) {
			return true;
		} else {
			return false;
		}
	}
	
	private abstract class ModelTraverserConfiguration implements ModelTraverser.Configuration {
		@Override
		public boolean ommitFeature(EStructuralFeature feature) {
			return MetaModelGenerator.this.ommitFeature(feature);
		}
	}

	public EPackage generateMetaModel(EObject root) {
		// collecting targetIds for all objects
		SourceObjectKey rootKey = new SourceObjectKey(null, null, root);
		collectTargetIdsForSourceObjectKey(rootKey);
		new ModelTraverser().traverseSourceModel(new ModelTraverserConfiguration() {
			@Override
			public void work(SourceObjectKey sok) {
				collectTargetIdsForSourceObjectKey(sok);
			}
		}, rootKey);

		// computing targetMetaIds
		final Map<TargetClassId, TargetId> targetClassIds = new HashMap<TargetClassId, TargetId>();
		final Map<TargetId, TargetClassId> targetIdToTargetClassIdMap = new HashMap<TargetId, TargetClassId>();
		final Map<TargetId, TargetFeatureId> targetIdToTargetFeatureIdMap = new HashMap<TargetId, TargetFeatureId>();
		for (TargetId targetId : targetIds) {
			if (targetId.hasClass()) {
				TargetClassId classId = TargetClassId.create(targetId);
				targetClassIds.put(classId, targetId);
				targetIdToTargetClassIdMap.put(targetId, classId);
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

		// resolve collisions
		resolveCollisions(targetIdToTargetClassIdMap.values());
		resolveCollisions(targetIdToTargetFeatureIdMap.values());

		// creating and updating targetClasses
		final EPackage result = EcoreFactory.eINSTANCE.createEPackage();
		new ModelTraverser().traverseSourceModel(new ModelTraverserConfiguration() {
			@Override
			public void work(SourceObjectKey sok) {
				for(TargetId targetId: sokToTargetId.get(sok)) {
					TargetClassId targetClassId = targetIdToTargetClassIdMap.get(targetId);
					if (targetClassId != null) {
						String className = targetClassId.getClassName();
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

		// added super classes (this is not perfect, it introduces an unwanted coupling with TargetId properties (e.g. super classes))
		for (TargetClassId targetClassId : targetIdToTargetClassIdMap.values()) {
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
		new ModelTraverser().traverseSourceModel(new ModelTraverserConfiguration() {
			@Override
			public void work(SourceObjectKey sok) {
				for(TargetId targetId: sokToTargetId.get(sok)) {
					TargetFeatureId targetFeatureId = targetIdToTargetFeatureIdMap.get(targetId);
					if (targetFeatureId != null) {
						Preconditions.checkState(sok.getFeature() != null);
						String featureName = targetFeatureId.getFeatureName();
						String className = targetFeatureId.getClassId().getClassName();
						EStructuralFeature exisitingFeature = ((EClass) result
								.getEClassifier(className))
								.getEStructuralFeature(featureName);
						if (exisitingFeature == null) {
							EStructuralFeature targetFeature = null;
							if (targetId.getSourceFeature() instanceof EReference) {
								TargetClassId typeClassId = targetIdToTargetClassIdMap.get(targetId);
								EClass type = (EClass) result.getEClassifier(typeClassId.getClassName());
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

		return result;
	}
}
