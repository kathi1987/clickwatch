/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.analysis.results;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chart</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.analysis.results.Chart#getType <em>Type</em>}</li>
 *   <li>{@link de.hub.clickwatch.analysis.results.Chart#getValueSpecs <em>Value Specs</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.analysis.results.ResultsPackage#getChart()
 * @model
 * @generated
 */
public interface Chart extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(ChartType)
	 * @see de.hub.clickwatch.analysis.results.ResultsPackage#getChart_Type()
	 * @model containment="true"
	 * @generated
	 */
	ChartType getType();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.analysis.results.Chart#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(ChartType value);

	/**
	 * Returns the value of the '<em><b>Value Specs</b></em>' containment reference list.
	 * The list contents are of type {@link de.hub.clickwatch.analysis.results.ValueSpec}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Specs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Specs</em>' containment reference list.
	 * @see de.hub.clickwatch.analysis.results.ResultsPackage#getChart_ValueSpecs()
	 * @model containment="true"
	 * @generated
	 */
	EList<ValueSpec> getValueSpecs();

} // Chart
