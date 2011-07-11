package de.hub.specificmodels.metamodelgenerator.types;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;

/**
 * An {@link ITypeDescription} represents a primitive type. Subsets of primitive
 * type value sets form a hierarchy of {@link ITypeDescription}s. A hierarchy of
 * {@link ITypeDescription}s allows to determine the "smallest" type for a
 * value.
 */
public interface ITypeDescription {

	/**
	 * @return true, if the given sample is a string representation of a value
	 *         that fits this type.
	 */
	public boolean isOfType(String sample);

	/**
	 * The EMF type of the represented primitive type.
	 */
	public EDataType getEType();

	/**
	 * @return the "smallest" (i.e. deepest) child in the hierarchy of this type
	 * that fits the sample and is not smaller than the given restriction.
	 */
	public ITypeDescription smallestFittingChild(String sample, EClassifier restriction);

}
