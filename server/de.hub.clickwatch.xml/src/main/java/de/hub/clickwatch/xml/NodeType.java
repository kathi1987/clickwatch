/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.xml;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.xml.NodeType#getAddress <em>Address</em>}</li>
 *   <li>{@link de.hub.clickwatch.xml.NodeType#getPort <em>Port</em>}</li>
 *   <li>{@link de.hub.clickwatch.xml.NodeType#getProtocol <em>Protocol</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.xml.ConfigurationPackage#getNodeType()
 * @model extendedMetaData="name='nodeType' kind='empty'"
 * @generated
 */
public interface NodeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(String)
	 * @see de.hub.clickwatch.xml.ConfigurationPackage#getNodeType_Address()
	 * @model dataType="Configuration.AddressType" required="true"
	 *        extendedMetaData="kind='attribute' name='address' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.xml.NodeType#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' attribute.
	 * @see #setPort(BigInteger)
	 * @see de.hub.clickwatch.xml.ConfigurationPackage#getNodeType_Port()
	 * @model dataType="Configuration.PortType" required="true"
	 *        extendedMetaData="kind='attribute' name='port' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getPort();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.xml.NodeType#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' attribute.
	 * The literals are from the enumeration {@link de.hub.clickwatch.xml.ProtocolType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protocol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol</em>' attribute.
	 * @see de.hub.clickwatch.xml.ProtocolType
	 * @see #isSetProtocol()
	 * @see #unsetProtocol()
	 * @see #setProtocol(ProtocolType)
	 * @see de.hub.clickwatch.xml.ConfigurationPackage#getNodeType_Protocol()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='protocol' namespace='##targetNamespace'"
	 * @generated
	 */
	ProtocolType getProtocol();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.xml.NodeType#getProtocol <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' attribute.
	 * @see de.hub.clickwatch.xml.ProtocolType
	 * @see #isSetProtocol()
	 * @see #unsetProtocol()
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(ProtocolType value);

	/**
	 * Unsets the value of the '{@link de.hub.clickwatch.xml.NodeType#getProtocol <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProtocol()
	 * @see #getProtocol()
	 * @see #setProtocol(ProtocolType)
	 * @generated
	 */
	void unsetProtocol();

	/**
	 * Returns whether the value of the '{@link de.hub.clickwatch.xml.NodeType#getProtocol <em>Protocol</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Protocol</em>' attribute is set.
	 * @see #unsetProtocol()
	 * @see #getProtocol()
	 * @see #setProtocol(ProtocolType)
	 * @generated
	 */
	boolean isSetProtocol();

} // NodeType
