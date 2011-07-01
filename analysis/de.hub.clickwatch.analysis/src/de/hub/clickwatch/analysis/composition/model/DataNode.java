/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.analysis.composition.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.analysis.composition.model.DataNode#isHasData <em>Has Data</em>}</li>
 *   <li>{@link de.hub.clickwatch.analysis.composition.model.DataNode#getVisualization <em>Visualization</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.analysis.composition.model.CompositionPackage#getDataNode()
 * @model
 * @generated
 */
public interface DataNode extends Node {

	/**
	 * Returns the value of the '<em><b>Has Data</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Data</em>' attribute.
	 * @see #setHasData(boolean)
	 * @see de.hub.clickwatch.analysis.composition.model.CompositionPackage#getDataNode_HasData()
	 * @model default="false" transient="true"
	 * @generated
	 */
	boolean isHasData();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.analysis.composition.model.DataNode#isHasData <em>Has Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Data</em>' attribute.
	 * @see #isHasData()
	 * @generated
	 */
	void setHasData(boolean value);

	/**
	 * Returns the value of the '<em><b>Visualization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visualization</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visualization</em>' containment reference.
	 * @see #setVisualization(Visualization)
	 * @see de.hub.clickwatch.analysis.composition.model.CompositionPackage#getDataNode_Visualization()
	 * @model containment="true"
	 * @generated
	 */
	Visualization getVisualization();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.analysis.composition.model.DataNode#getVisualization <em>Visualization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visualization</em>' containment reference.
	 * @see #getVisualization()
	 * @generated
	 */
	void setVisualization(Visualization value);
} // DataNode
