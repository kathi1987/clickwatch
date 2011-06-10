/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package edu.hu.clickwatch.analysis.composition.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measure Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.hu.clickwatch.analysis.composition.model.MeasureNode#getData <em>Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.hu.clickwatch.analysis.composition.model.CompositionPackage#getMeasureNode()
 * @model
 * @generated
 */
public interface MeasureNode extends Node, DataNode {

	/**
	 * Returns the value of the '<em><b>Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' reference.
	 * @see #setData(Measure)
	 * @see edu.hu.clickwatch.analysis.composition.model.CompositionPackage#getMeasureNode_Data()
	 * @model
	 * @generated
	 */
	Measure getData();

	/**
	 * Sets the value of the '{@link edu.hu.clickwatch.analysis.composition.model.MeasureNode#getData <em>Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' reference.
	 * @see #getData()
	 * @generated
	 */
	void setData(Measure value);
} // MeasureNode
