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
 * A representation of the model object '<em><b>Configuration Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.xml.configuration.ConfigurationType#getNetwork <em>Network</em>}</li>
 *   <li>{@link de.hub.clickwatch.xml.configuration.ConfigurationType#getDatabase <em>Database</em>}</li>
 *   <li>{@link de.hub.clickwatch.xml.configuration.ConfigurationType#getLogDirectory <em>Log Directory</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.xml.configuration.configurationPackage#getConfigurationType()
 * @model extendedMetaData="name='configurationType' kind='elementOnly'"
 * @generated
 */
public interface ConfigurationType extends EObject {
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
	 * @see de.hub.clickwatch.xml.configuration.configurationPackage#getConfigurationType_Network()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='network' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NetworkType> getNetwork();

	/**
	 * Returns the value of the '<em><b>Database</b></em>' containment reference list.
	 * The list contents are of type {@link de.hub.clickwatch.xml.configuration.DatabaseType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Database</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database</em>' containment reference list.
	 * @see de.hub.clickwatch.xml.configuration.configurationPackage#getConfigurationType_Database()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='database' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DatabaseType> getDatabase();

	/**
	 * Returns the value of the '<em><b>Log Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Log Directory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log Directory</em>' attribute.
	 * @see #setLogDirectory(String)
	 * @see de.hub.clickwatch.xml.configuration.configurationPackage#getConfigurationType_LogDirectory()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='logDirectory' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLogDirectory();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.xml.configuration.ConfigurationType#getLogDirectory <em>Log Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Log Directory</em>' attribute.
	 * @see #getLogDirectory()
	 * @generated
	 */
	void setLogDirectory(String value);

} // ConfigurationType
