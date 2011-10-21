/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.analysis.activity_composition.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Progress Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.analysis.activity_composition.model.ProgressEdge#getTarget <em>Target</em>}</li>
 *   <li>{@link de.hub.clickwatch.analysis.activity_composition.model.ProgressEdge#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.analysis.activity_composition.model.ModelPackage#getProgressEdge()
 * @model
 * @generated
 */
public interface ProgressEdge extends Edge {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(ActionNode)
	 * @see de.hub.clickwatch.analysis.activity_composition.model.ModelPackage#getProgressEdge_Target()
	 * @model
	 * @generated
	 */
	ActionNode getTarget();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.analysis.activity_composition.model.ProgressEdge#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(ActionNode value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(ActionNode)
	 * @see de.hub.clickwatch.analysis.activity_composition.model.ModelPackage#getProgressEdge_Source()
	 * @model
	 * @generated
	 */
	ActionNode getSource();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.analysis.activity_composition.model.ProgressEdge#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ActionNode value);

} // ProgressEdge
