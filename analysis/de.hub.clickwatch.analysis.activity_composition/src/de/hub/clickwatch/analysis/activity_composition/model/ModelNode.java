/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.analysis.activity_composition.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.analysis.activity_composition.model.ModelNode#getModelResource <em>Model Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.analysis.activity_composition.model.ModelPackage#getModelNode()
 * @model
 * @generated
 */
public interface ModelNode extends DataNode {
	/**
	 * Returns the value of the '<em><b>Model Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Resource</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Resource</em>' attribute.
	 * @see #setModelResource(String)
	 * @see de.hub.clickwatch.analysis.activity_composition.model.ModelPackage#getModelNode_ModelResource()
	 * @model
	 * @generated
	 */
	String getModelResource();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.analysis.activity_composition.model.ModelNode#getModelResource <em>Model Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Resource</em>' attribute.
	 * @see #getModelResource()
	 * @generated
	 */
	void setModelResource(String value);

} // ModelNode
