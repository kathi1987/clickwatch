/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.analysis.results;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.hub.clickwatch.analysis.results.ResultsPackage
 * @generated
 */
public interface ResultsFactory extends EFactory {
	/**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	ResultsFactory eINSTANCE = de.hub.clickwatch.analysis.results.impl.ResultsFactoryImpl.init();

	/**
     * Returns a new object of class '<em>Chart</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Chart</em>'.
     * @generated
     */
	Chart createChart();

	/**
     * Returns a new object of class '<em>Axis</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Axis</em>'.
     * @generated
     */
	Axis createAxis();

	/**
     * Returns a new object of class '<em>Series</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Series</em>'.
     * @generated
     */
	Series createSeries();

	/**
     * Returns a new object of class '<em>Category</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Category</em>'.
     * @generated
     */
	Category createCategory();

	/**
     * Returns a new object of class '<em>XY</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>XY</em>'.
     * @generated
     */
	XY createXY();

	/**
     * Returns a new object of class '<em>Box And Whiskers</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Box And Whiskers</em>'.
     * @generated
     */
	BoxAndWhiskers createBoxAndWhiskers();

	/**
     * Returns a new object of class '<em>Bar</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Bar</em>'.
     * @generated
     */
	Bar createBar();

	/**
     * Returns a new object of class '<em>Results</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Results</em>'.
     * @generated
     */
	Results createResults();

	/**
     * Returns a new object of class '<em>Equals Constraint</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Equals Constraint</em>'.
     * @generated
     */
	EqualsConstraint createEqualsConstraint();

	/**
     * Returns a new object of class '<em>Or</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Or</em>'.
     * @generated
     */
	Or createOr();

	/**
     * Returns a new object of class '<em>Numerical Result</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Numerical Result</em>'.
     * @generated
     */
    NumericalResult createNumericalResult();

    /**
     * Returns a new object of class '<em>Graph Result</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Graph Result</em>'.
     * @generated
     */
    GraphResult createGraphResult();

    /**
     * Returns a new object of class '<em>Graph Node</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Graph Node</em>'.
     * @generated
     */
    GraphNode createGraphNode();

    /**
     * Returns a new object of class '<em>Graph Link</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Graph Link</em>'.
     * @generated
     */
    GraphLink createGraphLink();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
	ResultsPackage getResultsPackage();

} //ResultsFactory
