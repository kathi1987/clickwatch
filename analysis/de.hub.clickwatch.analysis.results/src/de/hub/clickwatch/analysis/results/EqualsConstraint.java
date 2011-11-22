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
 * A representation of the model object '<em><b>Equals Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.analysis.results.EqualsConstraint#getConstraint <em>Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.analysis.results.ResultsPackage#getEqualsConstraint()
 * @model
 * @generated
 */
public interface EqualsConstraint extends Constraint {
	/**
     * Returns the value of the '<em><b>Constraint</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Constraint</em>' attribute.
     * @see #setConstraint(Object)
     * @see de.hub.clickwatch.analysis.results.ResultsPackage#getEqualsConstraint_Constraint()
     * @model
     * @generated
     */
	Object getConstraint();

	/**
     * Sets the value of the '{@link de.hub.clickwatch.analysis.results.EqualsConstraint#getConstraint <em>Constraint</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Constraint</em>' attribute.
     * @see #getConstraint()
     * @generated
     */
	void setConstraint(Object value);

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @model kind="operation"
     * @generated
     */
	EList<Object> getValues();

} // EqualsConstraint
