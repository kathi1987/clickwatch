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
 * A representation of the model object '<em><b>Database Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.xml.DatabaseType#getAddress <em>Address</em>}</li>
 *   <li>{@link de.hub.clickwatch.xml.DatabaseType#getDatabase <em>Database</em>}</li>
 *   <li>{@link de.hub.clickwatch.xml.DatabaseType#getPassword <em>Password</em>}</li>
 *   <li>{@link de.hub.clickwatch.xml.DatabaseType#getPort <em>Port</em>}</li>
 *   <li>{@link de.hub.clickwatch.xml.DatabaseType#getUser <em>User</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.xml.ConfigurationPackage#getDatabaseType()
 * @model extendedMetaData="name='databaseType' kind='empty'"
 * @generated
 */
public interface DatabaseType extends EObject {
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
	 * @see de.hub.clickwatch.xml.ConfigurationPackage#getDatabaseType_Address()
	 * @model dataType="Configuration.AddressType" required="true"
	 *        extendedMetaData="kind='attribute' name='address' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.xml.DatabaseType#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

	/**
	 * Returns the value of the '<em><b>Database</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Database</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database</em>' attribute.
	 * @see #setDatabase(String)
	 * @see de.hub.clickwatch.xml.ConfigurationPackage#getDatabaseType_Database()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='database' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDatabase();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.xml.DatabaseType#getDatabase <em>Database</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database</em>' attribute.
	 * @see #getDatabase()
	 * @generated
	 */
	void setDatabase(String value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see de.hub.clickwatch.xml.ConfigurationPackage#getDatabaseType_Password()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='password' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.xml.DatabaseType#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

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
	 * @see de.hub.clickwatch.xml.ConfigurationPackage#getDatabaseType_Port()
	 * @model dataType="Configuration.PortType" required="true"
	 *        extendedMetaData="kind='attribute' name='port' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getPort();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.xml.DatabaseType#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(BigInteger value);

	/**
	 * Returns the value of the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' attribute.
	 * @see #setUser(String)
	 * @see de.hub.clickwatch.xml.ConfigurationPackage#getDatabaseType_User()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='user' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUser();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.xml.DatabaseType#getUser <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' attribute.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(String value);

} // DatabaseType
