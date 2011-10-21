/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.analysis.compositionV2.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.analysis.compositionV2.model.OutputEdge#getSource <em>Source</em>}</li>
 *   <li>{@link de.hub.clickwatch.analysis.compositionV2.model.OutputEdge#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.analysis.compositionV2.model.Compositemodelv2Package#getOutputEdge()
 * @model
 * @generated
 */
public interface OutputEdge extends DataEdge {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Transformation)
	 * @see de.hub.clickwatch.analysis.compositionV2.model.Compositemodelv2Package#getOutputEdge_Source()
	 * @model
	 * @generated
	 */
	Transformation getSource();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.analysis.compositionV2.model.OutputEdge#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Transformation value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(DataNode)
	 * @see de.hub.clickwatch.analysis.compositionV2.model.Compositemodelv2Package#getOutputEdge_Target()
	 * @model
	 * @generated
	 */
	DataNode getTarget();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.analysis.compositionV2.model.OutputEdge#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(DataNode value);

} // OutputEdge
