/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.xml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Experiment Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.xml.ExperimentType#getNodes <em>Nodes</em>}</li>
 *   <li>{@link de.hub.clickwatch.xml.ExperimentType#getHandlers <em>Handlers</em>}</li>
 *   <li>{@link de.hub.clickwatch.xml.ExperimentType#getDatabase <em>Database</em>}</li>
 *   <li>{@link de.hub.clickwatch.xml.ExperimentType#getLogDirectory <em>Log Directory</em>}</li>
 *   <li>{@link de.hub.clickwatch.xml.ExperimentType#getName <em>Name</em>}</li>
 *   <li>{@link de.hub.clickwatch.xml.ExperimentType#getStart <em>Start</em>}</li>
 *   <li>{@link de.hub.clickwatch.xml.ExperimentType#getStop <em>Stop</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.xml.ConfigurationPackage#getExperimentType()
 * @model extendedMetaData="name='experimentType' kind='elementOnly'"
 * @generated
 */
public interface ExperimentType extends EObject {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link de.hub.clickwatch.xml.NodeListType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see de.hub.clickwatch.xml.ConfigurationPackage#getExperimentType_Nodes()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='nodes' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NodeListType> getNodes();

	/**
	 * Returns the value of the '<em><b>Handlers</b></em>' containment reference list.
	 * The list contents are of type {@link de.hub.clickwatch.xml.HandlerListType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Handlers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Handlers</em>' containment reference list.
	 * @see de.hub.clickwatch.xml.ConfigurationPackage#getExperimentType_Handlers()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='handlers' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<HandlerListType> getHandlers();

	/**
	 * Returns the value of the '<em><b>Database</b></em>' containment reference list.
	 * The list contents are of type {@link de.hub.clickwatch.xml.DatabaseType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Database</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database</em>' containment reference list.
	 * @see de.hub.clickwatch.xml.ConfigurationPackage#getExperimentType_Database()
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
	 * @see de.hub.clickwatch.xml.ConfigurationPackage#getExperimentType_LogDirectory()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='logDirectory' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLogDirectory();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.xml.ExperimentType#getLogDirectory <em>Log Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Log Directory</em>' attribute.
	 * @see #getLogDirectory()
	 * @generated
	 */
	void setLogDirectory(String value);

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
	 * @see de.hub.clickwatch.xml.ConfigurationPackage#getExperimentType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.xml.ExperimentType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' attribute.
	 * @see #setStart(String)
	 * @see de.hub.clickwatch.xml.ConfigurationPackage#getExperimentType_Start()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='start' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStart();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.xml.ExperimentType#getStart <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' attribute.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(String value);

	/**
	 * Returns the value of the '<em><b>Stop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stop</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stop</em>' attribute.
	 * @see #setStop(String)
	 * @see de.hub.clickwatch.xml.ConfigurationPackage#getExperimentType_Stop()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='stop' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStop();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.xml.ExperimentType#getStop <em>Stop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stop</em>' attribute.
	 * @see #getStop()
	 * @generated
	 */
	void setStop(String value);

} // ExperimentType
