/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.analysis.compositionV2.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.analysis.compositionV2.model.ModelNode#getMetaModelResource <em>Meta Model Resource</em>}</li>
 *   <li>{@link de.hub.clickwatch.analysis.compositionV2.model.ModelNode#getMetaModelClass <em>Meta Model Class</em>}</li>
 *   <li>{@link de.hub.clickwatch.analysis.compositionV2.model.ModelNode#getModelResource <em>Model Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.analysis.compositionV2.model.Compositemodelv2Package#getModelNode()
 * @model
 * @generated
 */
public interface ModelNode extends DataNode {
	/**
	 * Returns the value of the '<em><b>Meta Model Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meta Model Resource</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta Model Resource</em>' attribute.
	 * @see #setMetaModelResource(String)
	 * @see de.hub.clickwatch.analysis.compositionV2.model.Compositemodelv2Package#getModelNode_MetaModelResource()
	 * @model
	 * @generated
	 */
	String getMetaModelResource();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.analysis.compositionV2.model.ModelNode#getMetaModelResource <em>Meta Model Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meta Model Resource</em>' attribute.
	 * @see #getMetaModelResource()
	 * @generated
	 */
	void setMetaModelResource(String value);

	/**
	 * Returns the value of the '<em><b>Meta Model Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meta Model Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta Model Class</em>' attribute.
	 * @see #setMetaModelClass(String)
	 * @see de.hub.clickwatch.analysis.compositionV2.model.Compositemodelv2Package#getModelNode_MetaModelClass()
	 * @model
	 * @generated
	 */
	String getMetaModelClass();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.analysis.compositionV2.model.ModelNode#getMetaModelClass <em>Meta Model Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meta Model Class</em>' attribute.
	 * @see #getMetaModelClass()
	 * @generated
	 */
	void setMetaModelClass(String value);

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
	 * @see de.hub.clickwatch.analysis.compositionV2.model.Compositemodelv2Package#getModelNode_ModelResource()
	 * @model
	 * @generated
	 */
	String getModelResource();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.analysis.compositionV2.model.ModelNode#getModelResource <em>Model Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Resource</em>' attribute.
	 * @see #getModelResource()
	 * @generated
	 */
	void setModelResource(String value);

} // ModelNode
