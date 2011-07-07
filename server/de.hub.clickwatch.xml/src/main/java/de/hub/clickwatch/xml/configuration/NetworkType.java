/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.xml.configuration;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.xml.configuration.NetworkType#getNode <em>Node</em>}</li>
 *   <li>{@link de.hub.clickwatch.xml.configuration.NetworkType#getNetwork <em>Network</em>}</li>
 *   <li>{@link de.hub.clickwatch.xml.configuration.NetworkType#getName <em>Name</em>}</li>
 *   <li>{@link de.hub.clickwatch.xml.configuration.NetworkType#getUpdateInterval <em>Update Interval</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.xml.configuration.ConfigurationPackage#getNetworkType()
 * @model extendedMetaData="name='networkType' kind='elementOnly'"
 * @generated
 */
public interface NetworkType extends EObject {
	/**
	 * Returns the value of the '<em><b>Node</b></em>' containment reference list.
	 * The list contents are of type {@link de.hub.clickwatch.xml.configuration.NodeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' containment reference list.
	 * @see de.hub.clickwatch.xml.configuration.ConfigurationPackage#getNetworkType_Node()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='node' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NodeType> getNode();

	/**
	 * Returns the value of the '<em><b>Network</b></em>' containment reference list.
	 * The list contents are of type {@link de.hub.clickwatch.xml.configuration.NetworkType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Network</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network</em>' containment reference list.
	 * @see de.hub.clickwatch.xml.configuration.ConfigurationPackage#getNetworkType_Network()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='network' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NetworkType> getNetwork();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.hub.clickwatch.xml.configuration.ConfigurationPackage#getNetworkType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.xml.configuration.NetworkType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Update Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Update Interval</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Interval</em>' attribute.
	 * @see #isSetUpdateInterval()
	 * @see #unsetUpdateInterval()
	 * @see #setUpdateInterval(int)
	 * @see de.hub.clickwatch.xml.configuration.ConfigurationPackage#getNetworkType_UpdateInterval()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 *        extendedMetaData="kind='attribute' name='updateInterval' namespace='##targetNamespace'"
	 * @generated
	 */
	int getUpdateInterval();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.xml.configuration.NetworkType#getUpdateInterval <em>Update Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Interval</em>' attribute.
	 * @see #isSetUpdateInterval()
	 * @see #unsetUpdateInterval()
	 * @see #getUpdateInterval()
	 * @generated
	 */
	void setUpdateInterval(int value);

	/**
	 * Unsets the value of the '{@link de.hub.clickwatch.xml.configuration.NetworkType#getUpdateInterval <em>Update Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUpdateInterval()
	 * @see #getUpdateInterval()
	 * @see #setUpdateInterval(int)
	 * @generated
	 */
	void unsetUpdateInterval();

	/**
	 * Returns whether the value of the '{@link de.hub.clickwatch.xml.configuration.NetworkType#getUpdateInterval <em>Update Interval</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Update Interval</em>' attribute is set.
	 * @see #unsetUpdateInterval()
	 * @see #getUpdateInterval()
	 * @see #setUpdateInterval(int)
	 * @generated
	 */
	boolean isSetUpdateInterval();

} // NetworkType
