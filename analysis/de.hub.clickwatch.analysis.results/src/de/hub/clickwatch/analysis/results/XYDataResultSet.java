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
 * A representation of the model object '<em><b>XY Data Result Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.analysis.results.XYDataResultSet#getName <em>Name</em>}</li>
 *   <li>{@link de.hub.clickwatch.analysis.results.XYDataResultSet#getXValues <em>XValues</em>}</li>
 *   <li>{@link de.hub.clickwatch.analysis.results.XYDataResultSet#getYValues <em>YValues</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.analysis.results.ResultsPackage#getXYDataResultSet()
 * @model
 * @generated
 */
public interface XYDataResultSet extends DataResultSet {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.hub.clickwatch.analysis.results.ResultsPackage#getXYDataResultSet_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.analysis.results.XYDataResultSet#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>XValues</b></em>' containment reference list.
	 * The list contents are of type {@link de.hub.clickwatch.analysis.results.DataResultValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XValues</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XValues</em>' containment reference list.
	 * @see de.hub.clickwatch.analysis.results.ResultsPackage#getXYDataResultSet_XValues()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataResultValue> getXValues();

	/**
	 * Returns the value of the '<em><b>YValues</b></em>' containment reference list.
	 * The list contents are of type {@link de.hub.clickwatch.analysis.results.DataResultValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>YValues</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YValues</em>' containment reference list.
	 * @see de.hub.clickwatch.analysis.results.ResultsPackage#getXYDataResultSet_YValues()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataResultValue> getYValues();

} // XYDataResultSet
