/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.analysis.composition.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Set Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.analysis.composition.model.DataSetNode#getData <em>Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.analysis.composition.model.CompositionPackage#getDataSetNode()
 * @model
 * @generated
 */
public interface DataSetNode extends Node, DataNode {

	/**
	 * Returns the value of the '<em><b>Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' containment reference.
	 * @see #setData(DataSet)
	 * @see de.hub.clickwatch.analysis.composition.model.CompositionPackage#getDataSetNode_Data()
	 * @model containment="true" transient="true"
	 * @generated
	 */
	DataSet getData();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.analysis.composition.model.DataSetNode#getData <em>Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' containment reference.
	 * @see #getData()
	 * @generated
	 */
	void setData(DataSet value);
} // DataSetNode
