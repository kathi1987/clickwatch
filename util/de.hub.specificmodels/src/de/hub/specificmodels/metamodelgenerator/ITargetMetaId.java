package de.hub.specificmodels.metamodelgenerator;

/**
 * An {@link ITargetMetaId} represents a element in the target meta model.
 * During meta-model generation it is possible that classes with the same name,
 * or features with the same name in one class are generated.
 * 
 * These conflicts are called collisions. Collisions are first resolved in
 * {@link ITargetMetaId}s before actual meta-model elements are created.
 * Meta-model elements are created with names from corresponding
 * {@link ITargetMetaId}s.
 */
@SuppressWarnings("rawtypes")
public interface ITargetMetaId<T extends ITargetMetaId> {

	public void addCollision(T collidee);

	public void resolveCollisions();

	public Object hashableRep();
}
