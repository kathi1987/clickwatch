/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.analysis.composition.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.analysis.composition.model.ModelNode#getMetaModelResource <em>Meta Model Resource</em>}</li>
 *   <li>{@link de.hub.clickwatch.analysis.composition.model.ModelNode#isInferedType <em>Infered Type</em>}</li>
 *   <li>{@link de.hub.clickwatch.analysis.composition.model.ModelNode#getMetaModelClass <em>Meta Model Class</em>}</li>
 *   <li>{@link de.hub.clickwatch.analysis.composition.model.ModelNode#getModelResource <em>Model Resource</em>}</li>
 *   <li>{@link de.hub.clickwatch.analysis.composition.model.ModelNode#isPersistent <em>Persistent</em>}</li>
 *   <li>{@link de.hub.clickwatch.analysis.composition.model.ModelNode#getRegisteredPackage <em>Registered Package</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.analysis.composition.model.CompositionPackage#getModelNode()
 * @model
 * @generated
 */
public interface ModelNode extends Node, DataNode {

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
	 * @see de.hub.clickwatch.analysis.composition.model.CompositionPackage#getModelNode_MetaModelResource()
	 * @model
	 * @generated
	 */
	String getMetaModelResource();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.analysis.composition.model.ModelNode#getMetaModelResource <em>Meta Model Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meta Model Resource</em>' attribute.
	 * @see #getMetaModelResource()
	 * @generated
	 */
	void setMetaModelResource(String value);

	/**
	 * Returns the value of the '<em><b>Infered Type</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Infered Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Infered Type</em>' attribute.
	 * @see #setInferedType(boolean)
	 * @see de.hub.clickwatch.analysis.composition.model.CompositionPackage#getModelNode_InferedType()
	 * @model default="true"
	 * @generated
	 */
	boolean isInferedType();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.analysis.composition.model.ModelNode#isInferedType <em>Infered Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Infered Type</em>' attribute.
	 * @see #isInferedType()
	 * @generated
	 */
	void setInferedType(boolean value);

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
	 * @see de.hub.clickwatch.analysis.composition.model.CompositionPackage#getModelNode_MetaModelClass()
	 * @model
	 * @generated
	 */
	String getMetaModelClass();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.analysis.composition.model.ModelNode#getMetaModelClass <em>Meta Model Class</em>}' attribute.
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
	 * @see de.hub.clickwatch.analysis.composition.model.CompositionPackage#getModelNode_ModelResource()
	 * @model
	 * @generated
	 */
	String getModelResource();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.analysis.composition.model.ModelNode#getModelResource <em>Model Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Resource</em>' attribute.
	 * @see #getModelResource()
	 * @generated
	 */
	void setModelResource(String value);

	/**
	 * Returns the value of the '<em><b>Persistent</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persistent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persistent</em>' attribute.
	 * @see #setPersistent(boolean)
	 * @see de.hub.clickwatch.analysis.composition.model.CompositionPackage#getModelNode_Persistent()
	 * @model default="false"
	 * @generated
	 */
	boolean isPersistent();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.analysis.composition.model.ModelNode#isPersistent <em>Persistent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Persistent</em>' attribute.
	 * @see #isPersistent()
	 * @generated
	 */
	void setPersistent(boolean value);

	/**
	 * Returns the value of the '<em><b>Registered Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Registered Package</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registered Package</em>' attribute.
	 * @see #setRegisteredPackage(String)
	 * @see de.hub.clickwatch.analysis.composition.model.CompositionPackage#getModelNode_RegisteredPackage()
	 * @model
	 * @generated
	 */
	String getRegisteredPackage();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.analysis.composition.model.ModelNode#getRegisteredPackage <em>Registered Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registered Package</em>' attribute.
	 * @see #getRegisteredPackage()
	 * @generated
	 */
	void setRegisteredPackage(String value);
} // ModelNode
