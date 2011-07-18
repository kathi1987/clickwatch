/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.xml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Experiment Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Configuration.ExperimentType#getNodes <em>Nodes</em>}</li>
 *   <li>{@link Configuration.ExperimentType#getHandlers <em>Handlers</em>}</li>
 *   <li>{@link Configuration.ExperimentType#getDatabase <em>Database</em>}</li>
 *   <li>{@link Configuration.ExperimentType#getLogDirectory <em>Log Directory</em>}</li>
 *   <li>{@link Configuration.ExperimentType#getName <em>Name</em>}</li>
 *   <li>{@link Configuration.ExperimentType#getStart <em>Start</em>}</li>
 *   <li>{@link Configuration.ExperimentType#getStop <em>Stop</em>}</li>
 * </ul>
 * </p>
 *
 * @see Configuration.ConfigurationPackage#getExperimentType()
 * @model extendedMetaData="name='experimentType' kind='elementOnly'"
 * @generated
 */
public interface ExperimentType extends EObject {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference.
	 * @see #setNodes(NodeListType)
	 * @see Configuration.ConfigurationPackage#getExperimentType_Nodes()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='nodes' namespace='##targetNamespace'"
	 * @generated
	 */
	NodeListType getNodes();

	/**
	 * Sets the value of the '{@link Configuration.ExperimentType#getNodes <em>Nodes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nodes</em>' containment reference.
	 * @see #getNodes()
	 * @generated
	 */
	void setNodes(NodeListType value);

	/**
	 * Returns the value of the '<em><b>Handlers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Handlers</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Handlers</em>' containment reference.
	 * @see #setHandlers(HandlerListType)
	 * @see Configuration.ConfigurationPackage#getExperimentType_Handlers()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='handlers' namespace='##targetNamespace'"
	 * @generated
	 */
	HandlerListType getHandlers();

	/**
	 * Sets the value of the '{@link Configuration.ExperimentType#getHandlers <em>Handlers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Handlers</em>' containment reference.
	 * @see #getHandlers()
	 * @generated
	 */
	void setHandlers(HandlerListType value);

	/**
	 * Returns the value of the '<em><b>Database</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Database</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database</em>' containment reference.
	 * @see #setDatabase(DatabaseType)
	 * @see Configuration.ConfigurationPackage#getExperimentType_Database()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='database' namespace='##targetNamespace'"
	 * @generated
	 */
	DatabaseType getDatabase();

	/**
	 * Sets the value of the '{@link Configuration.ExperimentType#getDatabase <em>Database</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database</em>' containment reference.
	 * @see #getDatabase()
	 * @generated
	 */
	void setDatabase(DatabaseType value);

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
	 * @see Configuration.ConfigurationPackage#getExperimentType_LogDirectory()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='logDirectory' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLogDirectory();

	/**
	 * Sets the value of the '{@link Configuration.ExperimentType#getLogDirectory <em>Log Directory</em>}' attribute.
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
	 * @see Configuration.ConfigurationPackage#getExperimentType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Configuration.ExperimentType#getName <em>Name</em>}' attribute.
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
	 * @see Configuration.ConfigurationPackage#getExperimentType_Start()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='start' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStart();

	/**
	 * Sets the value of the '{@link Configuration.ExperimentType#getStart <em>Start</em>}' attribute.
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
	 * @see Configuration.ConfigurationPackage#getExperimentType_Stop()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='stop' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStop();

	/**
	 * Sets the value of the '{@link Configuration.ExperimentType#getStop <em>Stop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stop</em>' attribute.
	 * @see #getStop()
	 * @generated
	 */
	void setStop(String value);

} // ExperimentType
