/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.analysis.results;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Results</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.analysis.results.Results#getResults <em>Results</em>}</li>
 *   <li>{@link de.hub.clickwatch.analysis.results.Results#getGroups <em>Groups</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.analysis.results.ResultsPackage#getResults()
 * @model
 * @generated
 */
public interface Results extends Chart {
	/**
     * Returns the value of the '<em><b>Results</b></em>' containment reference list.
     * The list contents are of type {@link de.hub.clickwatch.analysis.results.Result}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Results</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Results</em>' containment reference list.
     * @see de.hub.clickwatch.analysis.results.ResultsPackage#getResults_Results()
     * @model containment="true"
     * @generated
     */
	EList<Result> getResults();

	/**
     * Returns the value of the '<em><b>Groups</b></em>' containment reference list.
     * The list contents are of type {@link de.hub.clickwatch.analysis.results.Results}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Groups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Groups</em>' containment reference list.
     * @see de.hub.clickwatch.analysis.results.ResultsPackage#getResults_Groups()
     * @model containment="true"
     * @generated
     */
	EList<Results> getGroups();

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @model
     * @generated
     */
	Result createNewResult(String name);

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @model
     * @generated
     */
	Results createNewGroup(String name);

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @model
     * @generated
     */
	Result getResult(String name);

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @model
     * @generated
     */
	Results getGroup(String name);

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @model
     * @generated
     */
	void exportCSV(String fileName);

} // Results
