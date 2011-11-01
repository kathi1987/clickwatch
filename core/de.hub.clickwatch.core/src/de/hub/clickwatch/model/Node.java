/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.model;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import de.hub.clickwatch.connection.INodeConnection;
import de.hub.clickwatch.connection.INodeConnectionProvider;
import de.hub.clickwatch.connection.adapter.IHandlerEventListener;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.model.Node#getINetAddress <em>INet Address</em>}</li>
 *   <li>{@link de.hub.clickwatch.model.Node#getPort <em>Port</em>}</li>
 *   <li>{@link de.hub.clickwatch.model.Node#getElements <em>Elements</em>}</li>
 *   <li>{@link de.hub.clickwatch.model.Node#getBackbone <em>Backbone</em>}</li>
 *   <li>{@link de.hub.clickwatch.model.Node#getActiveListeners <em>Active Listeners</em>}</li>
 *   <li>{@link de.hub.clickwatch.model.Node#getChanges <em>Changes</em>}</li>
 *   <li>{@link de.hub.clickwatch.model.Node#getErrors <em>Errors</em>}</li>
 *   <li>{@link de.hub.clickwatch.model.Node#getConnection <em>Connection</em>}</li>
 *   <li>{@link de.hub.clickwatch.model.Node#isRetrieving <em>Retrieving</em>}</li>
 *   <li>{@link de.hub.clickwatch.model.Node#isListening <em>Listening</em>}</li>
 *   <li>{@link de.hub.clickwatch.model.Node#isRecording <em>Recording</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.model.ClickWatchModelPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends EObject {
	/**
     * Returns the value of the '<em><b>INet Address</b></em>' attribute.
     * The default value is <code>"localhost"</code>.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>INet Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>INet Address</em>' attribute.
     * @see #setINetAddress(String)
     * @see de.hub.clickwatch.model.ClickWatchModelPackage#getNode_INetAddress()
     * @model default="localhost"
     * @generated
     */
	String getINetAddress();

	/**
     * Sets the value of the '{@link de.hub.clickwatch.model.Node#getINetAddress <em>INet Address</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>INet Address</em>' attribute.
     * @see #getINetAddress()
     * @generated
     */
	void setINetAddress(String value);

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
     * @see de.hub.clickwatch.model.ClickWatchModelPackage#getNode_Port()
     * @model default="7777"
     * @generated
     */
	String getPort();

	/**
     * Sets the value of the '{@link de.hub.clickwatch.model.Node#getPort <em>Port</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Port</em>' attribute.
     * @see #getPort()
     * @generated
     */
	void setPort(String value);

	/**
     * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
     * The list contents are of type {@link de.hub.clickwatch.model.Element}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Elements</em>' containment reference list.
     * @see de.hub.clickwatch.model.ClickWatchModelPackage#getNode_Elements()
     * @model containment="true"
     *        extendedMetaData="name='element' kind='element'"
     * @generated
     */
	EList<Element> getElements();

	/**
     * Returns the value of the '<em><b>Connection</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Connection</em>' attribute.
     * @see #setConnection(INodeConnection)
     * @see de.hub.clickwatch.model.ClickWatchModelPackage#getNode_Connection()
     * @model dataType="de.hub.clickwatch.model.INodeConnection" transient="true"
     * @generated
     */
	INodeConnection getConnection();

	/**
     * Sets the value of the '{@link de.hub.clickwatch.model.Node#getConnection <em>Connection</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Connection</em>' attribute.
     * @see #getConnection()
     * @generated
     */
    void setConnection(INodeConnection value);

    /**
     * Returns the value of the '<em><b>Retrieving</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Retrieving</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Retrieving</em>' attribute.
     * @see #setRetrieving(boolean)
     * @see de.hub.clickwatch.model.ClickWatchModelPackage#getNode_Retrieving()
     * @model transient="true"
     * @generated
     */
    boolean isRetrieving();

    /**
     * Sets the value of the '{@link de.hub.clickwatch.model.Node#isRetrieving <em>Retrieving</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Retrieving</em>' attribute.
     * @see #isRetrieving()
     * @generated
     */
    void setRetrieving(boolean value);

    /**
     * Returns the value of the '<em><b>Listening</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Listening</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Listening</em>' attribute.
     * @see #setListening(boolean)
     * @see de.hub.clickwatch.model.ClickWatchModelPackage#getNode_Listening()
     * @model transient="true"
     * @generated
     */
    boolean isListening();

    /**
     * Sets the value of the '{@link de.hub.clickwatch.model.Node#isListening <em>Listening</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Listening</em>' attribute.
     * @see #isListening()
     * @generated
     */
    void setListening(boolean value);

    /**
     * Returns the value of the '<em><b>Recording</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Recording</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Recording</em>' attribute.
     * @see #setRecording(boolean)
     * @see de.hub.clickwatch.model.ClickWatchModelPackage#getNode_Recording()
     * @model transient="true"
     * @generated
     */
    boolean isRecording();

    /**
     * Sets the value of the '{@link de.hub.clickwatch.model.Node#isRecording <em>Recording</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Recording</em>' attribute.
     * @see #isRecording()
     * @generated
     */
    void setRecording(boolean value);

    /**
     * Returns the value of the '<em><b>Backbone</b></em>' attribute.
     * The default value is <code>"unknown"</code>.
     * The literals are from the enumeration {@link de.hub.clickwatch.model.BackboneType}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Backbone</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Backbone</em>' attribute.
     * @see de.hub.clickwatch.model.BackboneType
     * @see #setBackbone(BackboneType)
     * @see de.hub.clickwatch.model.ClickWatchModelPackage#getNode_Backbone()
     * @model default="unknown"
     * @generated
     */
	BackboneType getBackbone();

	/**
     * Sets the value of the '{@link de.hub.clickwatch.model.Node#getBackbone <em>Backbone</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Backbone</em>' attribute.
     * @see de.hub.clickwatch.model.BackboneType
     * @see #getBackbone()
     * @generated
     */
	void setBackbone(BackboneType value);

	/**
     * Returns the value of the '<em><b>Active Listeners</b></em>' attribute list.
     * The list contents are of type {@link de.hub.clickwatch.connection.adapter.IHandlerEventListener}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Active Listeners</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Active Listeners</em>' attribute list.
     * @see de.hub.clickwatch.model.ClickWatchModelPackage#getNode_ActiveListeners()
     * @model default="" dataType="de.hub.clickwatch.model.IHandlerEventListener" transient="true" changeable="false" derived="true"
     * @generated
     */
    EList<IHandlerEventListener> getActiveListeners();

    /**
     * Returns the value of the '<em><b>Changes</b></em>' attribute list.
     * The list contents are of type {@link de.hub.clickwatch.model.ChangeMark}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Changes</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Changes</em>' attribute list.
     * @see de.hub.clickwatch.model.ClickWatchModelPackage#getNode_Changes()
     * @model default="" dataType="de.hub.clickwatch.model.Change" transient="true"
     * @generated
     */
    EList<ChangeMark> getChanges();

    /**
     * Returns the value of the '<em><b>Errors</b></em>' attribute list.
     * The list contents are of type {@link de.hub.clickwatch.model.ClickWatchError}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Errors</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Errors</em>' attribute list.
     * @see de.hub.clickwatch.model.ClickWatchModelPackage#getNode_Errors()
     * @model default="" dataType="de.hub.clickwatch.model.Error" transient="true" changeable="false" derived="true"
     * @generated
     */
    EList<ClickWatchError> getErrors();

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @model
     * @generated
     */
	void filter(String elementFilter, String handlerFilter);

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @model
     * @generated
     */
	Handler getHandler(String qualifiedName);

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @model
     * @generated
     */
	Element getElement(String name);

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @model kind="operation"
     * @generated
     */
	EList<Handler> getAllHandlers();

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @model
     * @generated
     */
	void filter();

} // Node
