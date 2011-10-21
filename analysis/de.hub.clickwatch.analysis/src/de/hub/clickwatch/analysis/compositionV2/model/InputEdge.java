/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.analysis.compositionV2.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.analysis.compositionV2.model.InputEdge#getSource <em>Source</em>}</li>
 *   <li>{@link de.hub.clickwatch.analysis.compositionV2.model.InputEdge#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.analysis.compositionV2.model.Compositemodelv2Package#getInputEdge()
 * @model
 * @generated
 */
public interface InputEdge extends DataEdge {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(DataNode)
	 * @see de.hub.clickwatch.analysis.compositionV2.model.Compositemodelv2Package#getInputEdge_Source()
	 * @model
	 * @generated
	 */
	DataNode getSource();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.analysis.compositionV2.model.InputEdge#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(DataNode value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Transformation)
	 * @see de.hub.clickwatch.analysis.compositionV2.model.Compositemodelv2Package#getInputEdge_Target()
	 * @model
	 * @generated
	 */
	Transformation getTarget();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.analysis.compositionV2.model.InputEdge#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Transformation value);

} // InputEdge
