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
 * A representation of the model object '<em><b>Or</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.analysis.results.Or#getOps <em>Ops</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.analysis.results.ResultsPackage#getOr()
 * @model
 * @generated
 */
public interface Or extends Constraint {
	/**
     * Returns the value of the '<em><b>Ops</b></em>' containment reference list.
     * The list contents are of type {@link de.hub.clickwatch.analysis.results.Constraint}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ops</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Ops</em>' containment reference list.
     * @see de.hub.clickwatch.analysis.results.ResultsPackage#getOr_Ops()
     * @model containment="true"
     * @generated
     */
	EList<Constraint> getOps();

} // Or
