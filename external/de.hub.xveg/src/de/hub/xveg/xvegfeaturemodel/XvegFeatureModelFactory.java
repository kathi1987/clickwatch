/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.xveg.xvegfeaturemodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.hub.xveg.xvegfeaturemodel.XvegFeatureModelPackage
 * @generated
 */
public interface XvegFeatureModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XvegFeatureModelFactory eINSTANCE = de.hub.xveg.xvegfeaturemodel.impl.XvegFeatureModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Xveg Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Xveg Feature</em>'.
	 * @generated
	 */
	XvegFeature createXvegFeature();

	/**
	 * Returns a new object of class '<em>Vertex Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vertex Feature</em>'.
	 * @generated
	 */
	VertexFeature createVertexFeature();

	/**
	 * Returns a new object of class '<em>Edge Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Edge Feature</em>'.
	 * @generated
	 */
	EdgeFeature createEdgeFeature();

	/**
	 * Returns a new object of class '<em>Xveg Diagram Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Xveg Diagram Type</em>'.
	 * @generated
	 */
	XvegDiagramType createXvegDiagramType();

	/**
	 * Returns a new object of class '<em>Color</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Color</em>'.
	 * @generated
	 */
	Color createColor();

	/**
	 * Returns a new object of class '<em>Style Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Style Info</em>'.
	 * @generated
	 */
	StyleInfo createStyleInfo();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	XvegFeatureModelPackage getXvegFeatureModelPackage();

} //XvegFeatureModelFactory
