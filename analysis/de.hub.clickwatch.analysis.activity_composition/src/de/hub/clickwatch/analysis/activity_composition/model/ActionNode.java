/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.analysis.activity_composition.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.analysis.activity_composition.model.ActionNode#getProgressConnection <em>Progress Connection</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.analysis.activity_composition.model.ModelPackage#getActionNode()
 * @model
 * @generated
 */
public interface ActionNode extends Node {
	/**
	 * Returns the value of the '<em><b>Progress Connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Progress Connection</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Progress Connection</em>' reference.
	 * @see #setProgressConnection(ProgressEdge)
	 * @see de.hub.clickwatch.analysis.activity_composition.model.ModelPackage#getActionNode_ProgressConnection()
	 * @model
	 * @generated
	 */
	ProgressEdge getProgressConnection();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.analysis.activity_composition.model.ActionNode#getProgressConnection <em>Progress Connection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Progress Connection</em>' reference.
	 * @see #getProgressConnection()
	 * @generated
	 */
	void setProgressConnection(ProgressEdge value);

} // ActionNode
