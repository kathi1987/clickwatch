package de.hub.specificmodels.metamodelgenerator2;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * Implementations of this interface are used to create and update actual target
 * meta-model elements form {@link ITargetMetaId}s, corresponding
 * {@link TargetId}, and corresponding {@link SourceObjectKey}s.
 * 
 * Create methods are used, when a meta-model element does not already exist.
 * Once two {@link SourceObjectKey}s refer to one {@link TargetId} (two source
 * objects belong to the same target meta-class) it happens that a target
 * meta-class might already exist. In this case the update methods are used to
 * potentially specialize the target meta-elements.
 */
// TODO injection
public interface ITargetObjectCreator {

	public EClass createTargetClass(String className, TargetId targetId,
			SourceObjectKey object);

	public void addSuperClass(EClass targetClass, EClass superClass);

	public void updateTargetClass(EClass targetClass, TargetId targetId,
			SourceObjectKey object);

	public EReference createTargetReference(String featureName, EClass type,
			TargetId targetId, SourceObjectKey object);

	public EAttribute createTargetAttribute(String featureName,
			TargetId targetId, SourceObjectKey object);

	public void updateTargetFeature(EStructuralFeature targetFeature,
			TargetId targetId, SourceObjectKey object);

}
