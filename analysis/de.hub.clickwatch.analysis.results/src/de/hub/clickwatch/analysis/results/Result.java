/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.analysis.results;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.analysis.results.Result#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link de.hub.clickwatch.analysis.results.Result#getCharts <em>Charts</em>}</li>
 *   <li>{@link de.hub.clickwatch.analysis.results.Result#getDataSet <em>Data Set</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.analysis.results.ResultsPackage#getResult()
 * @model
 * @generated
 */
public interface Result extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timestamp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(Date)
	 * @see de.hub.clickwatch.analysis.results.ResultsPackage#getResult_Timestamp()
	 * @model
	 * @generated
	 */
	Date getTimestamp();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.analysis.results.Result#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(Date value);

	/**
	 * Returns the value of the '<em><b>Charts</b></em>' containment reference list.
	 * The list contents are of type {@link de.hub.clickwatch.analysis.results.Chart}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Charts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Charts</em>' containment reference list.
	 * @see de.hub.clickwatch.analysis.results.ResultsPackage#getResult_Charts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Chart> getCharts();

	/**
	 * Returns the value of the '<em><b>Data Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Set</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Set</em>' containment reference.
	 * @see #setDataSet(DataSet)
	 * @see de.hub.clickwatch.analysis.results.ResultsPackage#getResult_DataSet()
	 * @model containment="true"
	 * @generated
	 */
	DataSet getDataSet();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.analysis.results.Result#getDataSet <em>Data Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Set</em>' containment reference.
	 * @see #getDataSet()
	 * @generated
	 */
	void setDataSet(DataSet value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void exportCSV(String name);

} // Result
