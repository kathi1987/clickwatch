/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package edu.hu.clickwatch.model;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.hu.clickwatch.model.Node#getINetAdress <em>INet Adress</em>}</li>
 *   <li>{@link edu.hu.clickwatch.model.Node#getPort <em>Port</em>}</li>
 *   <li>{@link edu.hu.clickwatch.model.Node#getElements <em>Elements</em>}</li>
 *   <li>{@link edu.hu.clickwatch.model.Node#isConnected <em>Connected</em>}</li>
 *   <li>{@link edu.hu.clickwatch.model.Node#getConnection <em>Connection</em>}</li>
 *   <li>{@link edu.hu.clickwatch.model.Node#getBackbone <em>Backbone</em>}</li>
 *   <li>{@link edu.hu.clickwatch.model.Node#isRetrieving <em>Retrieving</em>}</li>
 *   <li>{@link edu.hu.clickwatch.model.Node#isHasRecord <em>Has Record</em>}</li>
 *   <li>{@link edu.hu.clickwatch.model.Node#isRecording <em>Recording</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.hu.clickwatch.model.ClickWatchModelPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends EObject {
	/**
	 * Returns the value of the '<em><b>INet Adress</b></em>' attribute.
	 * The default value is <code>"localhost"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>INet Adress</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>INet Adress</em>' attribute.
	 * @see #setINetAdress(String)
	 * @see edu.hu.clickwatch.model.ClickWatchModelPackage#getNode_INetAdress()
	 * @model default="localhost"
	 * @generated
	 */
	String getINetAdress();

	/**
	 * Sets the value of the '{@link edu.hu.clickwatch.model.Node#getINetAdress <em>INet Adress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>INet Adress</em>' attribute.
	 * @see #getINetAdress()
	 * @generated
	 */
	void setINetAdress(String value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' attribute.
	 * The default value is <code>"7777"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' attribute.
	 * @see #setPort(String)
	 * @see edu.hu.clickwatch.model.ClickWatchModelPackage#getNode_Port()
	 * @model default="7777"
	 * @generated
	 */
	String getPort();

	/**
	 * Sets the value of the '{@link edu.hu.clickwatch.model.Node#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(String value);

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link edu.hu.clickwatch.model.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see edu.hu.clickwatch.model.ClickWatchModelPackage#getNode_Elements()
	 * @model containment="true"
	 *        extendedMetaData="name='element' kind='element'"
	 * @generated
	 */
	EList<Element> getElements();

	/**
	 * Returns the value of the '<em><b>Connected</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connected</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connected</em>' attribute.
	 * @see #setConnected(boolean)
	 * @see edu.hu.clickwatch.model.ClickWatchModelPackage#getNode_Connected()
	 * @model default="false" transient="true"
	 * @generated
	 */
	boolean isConnected();

	/**
	 * Sets the value of the '{@link edu.hu.clickwatch.model.Node#isConnected <em>Connected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connected</em>' attribute.
	 * @see #isConnected()
	 * @generated
	 */
	void setConnected(boolean value);

	/**
	 * Returns the value of the '<em><b>Connection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection</em>' attribute.
	 * @see #setConnection(Object)
	 * @see edu.hu.clickwatch.model.ClickWatchModelPackage#getNode_Connection()
	 * @model transient="true"
	 * @generated
	 */
	Object getConnection();

	/**
	 * Sets the value of the '{@link edu.hu.clickwatch.model.Node#getConnection <em>Connection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection</em>' attribute.
	 * @see #getConnection()
	 * @generated
	 */
	void setConnection(Object value);

	/**
	 * Returns the value of the '<em><b>Backbone</b></em>' attribute.
	 * The default value is <code>"unknown"</code>.
	 * The literals are from the enumeration {@link edu.hu.clickwatch.model.BackboneType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Backbone</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Backbone</em>' attribute.
	 * @see edu.hu.clickwatch.model.BackboneType
	 * @see #setBackbone(BackboneType)
	 * @see edu.hu.clickwatch.model.ClickWatchModelPackage#getNode_Backbone()
	 * @model default="unknown"
	 * @generated
	 */
	BackboneType getBackbone();

	/**
	 * Sets the value of the '{@link edu.hu.clickwatch.model.Node#getBackbone <em>Backbone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Backbone</em>' attribute.
	 * @see edu.hu.clickwatch.model.BackboneType
	 * @see #getBackbone()
	 * @generated
	 */
	void setBackbone(BackboneType value);

	/**
	 * Returns the value of the '<em><b>Retrieving</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Retrieving</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Retrieving</em>' attribute.
	 * @see #setRetrieving(boolean)
	 * @see edu.hu.clickwatch.model.ClickWatchModelPackage#getNode_Retrieving()
	 * @model default="false" transient="true"
	 * @generated
	 */
	boolean isRetrieving();

	/**
	 * Sets the value of the '{@link edu.hu.clickwatch.model.Node#isRetrieving <em>Retrieving</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retrieving</em>' attribute.
	 * @see #isRetrieving()
	 * @generated
	 */
	void setRetrieving(boolean value);

	/**
	 * Returns the value of the '<em><b>Has Record</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Record</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Record</em>' attribute.
	 * @see #setHasRecord(boolean)
	 * @see edu.hu.clickwatch.model.ClickWatchModelPackage#getNode_HasRecord()
	 * @model default="false"
	 * @generated
	 */
	boolean isHasRecord();

	/**
	 * Sets the value of the '{@link edu.hu.clickwatch.model.Node#isHasRecord <em>Has Record</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Record</em>' attribute.
	 * @see #isHasRecord()
	 * @generated
	 */
	void setHasRecord(boolean value);

	/**
	 * Returns the value of the '<em><b>Recording</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recording</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recording</em>' attribute.
	 * @see #setRecording(boolean)
	 * @see edu.hu.clickwatch.model.ClickWatchModelPackage#getNode_Recording()
	 * @model default="false" transient="true"
	 * @generated
	 */
	boolean isRecording();

	/**
	 * Sets the value of the '{@link edu.hu.clickwatch.model.Node#isRecording <em>Recording</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recording</em>' attribute.
	 * @see #isRecording()
	 * @generated
	 */
	void setRecording(boolean value);

} // Node
