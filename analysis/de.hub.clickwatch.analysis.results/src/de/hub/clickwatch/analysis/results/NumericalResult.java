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
 * A representation of the model object '<em><b>Numerical Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.analysis.results.NumericalResult#getCharts <em>Charts</em>}</li>
 *   <li>{@link de.hub.clickwatch.analysis.results.NumericalResult#getData <em>Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.analysis.results.ResultsPackage#getNumericalResult()
 * @model
 * @generated
 */
public interface NumericalResult extends Result {
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
     * @see de.hub.clickwatch.analysis.results.ResultsPackage#getNumericalResult_Charts()
     * @model containment="true"
     * @generated
     */
    EList<Chart> getCharts();

    /**
     * Returns the value of the '<em><b>Data</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Data</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Data</em>' attribute.
     * @see #setData(DataSet)
     * @see de.hub.clickwatch.analysis.results.ResultsPackage#getNumericalResult_Data()
     * @model dataType="de.hub.clickwatch.analysis.results.DataSet"
     * @generated
     */
    DataSet getData();

    /**
     * Sets the value of the '{@link de.hub.clickwatch.analysis.results.NumericalResult#getData <em>Data</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Data</em>' attribute.
     * @see #getData()
     * @generated
     */
    void setData(DataSet value);

} // NumericalResult
