/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.xml;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see Configuration.ConfigurationFactory
 * @model kind="package"
 *        extendedMetaData="qualified='false'"
 * @generated
 */
public interface ConfigurationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Configuration";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "file:/vol/home-vol1/simulant/frey/Desktop/configuration.xsd";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Configuration";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConfigurationPackage eINSTANCE = de.hub.clickwatch.xml.impl.ConfigurationPackageImpl.init();

	/**
	 * The meta object id for the '{@link Configuration.impl.DatabaseTypeImpl <em>Database Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Configuration.impl.DatabaseTypeImpl
	 * @see Configuration.impl.ConfigurationPackageImpl#getDatabaseType()
	 * @generated
	 */
	int DATABASE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_TYPE__ADDRESS = 0;

	/**
	 * The feature id for the '<em><b>Database</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_TYPE__DATABASE = 1;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_TYPE__PASSWORD = 2;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_TYPE__PORT = 3;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_TYPE__USER = 4;

	/**
	 * The number of structural features of the '<em>Database Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link Configuration.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Configuration.impl.DocumentRootImpl
	 * @see Configuration.impl.ConfigurationPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 1;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Experiments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXPERIMENTS = 3;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link Configuration.impl.ExperimentListTypeImpl <em>Experiment List Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Configuration.impl.ExperimentListTypeImpl
	 * @see Configuration.impl.ConfigurationPackageImpl#getExperimentListType()
	 * @generated
	 */
	int EXPERIMENT_LIST_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Experiment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_LIST_TYPE__EXPERIMENT = 0;

	/**
	 * The number of structural features of the '<em>Experiment List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_LIST_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link Configuration.impl.ExperimentTypeImpl <em>Experiment Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Configuration.impl.ExperimentTypeImpl
	 * @see Configuration.impl.ConfigurationPackageImpl#getExperimentType()
	 * @generated
	 */
	int EXPERIMENT_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_TYPE__NODES = 0;

	/**
	 * The feature id for the '<em><b>Handlers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_TYPE__HANDLERS = 1;

	/**
	 * The feature id for the '<em><b>Database</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_TYPE__DATABASE = 2;

	/**
	 * The feature id for the '<em><b>Log Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_TYPE__LOG_DIRECTORY = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_TYPE__NAME = 4;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_TYPE__START = 5;

	/**
	 * The feature id for the '<em><b>Stop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_TYPE__STOP = 6;

	/**
	 * The number of structural features of the '<em>Experiment Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_TYPE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link Configuration.impl.HandlerListTypeImpl <em>Handler List Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Configuration.impl.HandlerListTypeImpl
	 * @see Configuration.impl.ConfigurationPackageImpl#getHandlerListType()
	 * @generated
	 */
	int HANDLER_LIST_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Handler</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLER_LIST_TYPE__HANDLER = 0;

	/**
	 * The number of structural features of the '<em>Handler List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLER_LIST_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link Configuration.impl.HandlerTypeImpl <em>Handler Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Configuration.impl.HandlerTypeImpl
	 * @see Configuration.impl.ConfigurationPackageImpl#getHandlerType()
	 * @generated
	 */
	int HANDLER_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLER_TYPE__ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLER_TYPE__RATE = 1;

	/**
	 * The number of structural features of the '<em>Handler Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLER_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link Configuration.impl.NetworkTypeImpl <em>Network Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Configuration.impl.NetworkTypeImpl
	 * @see Configuration.impl.ConfigurationPackageImpl#getNetworkType()
	 * @generated
	 */
	int NETWORK_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_TYPE__NODE = 0;

	/**
	 * The feature id for the '<em><b>Network</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_TYPE__NETWORK = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_TYPE__NAME = 2;

	/**
	 * The feature id for the '<em><b>Update Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_TYPE__UPDATE_INTERVAL = 3;

	/**
	 * The number of structural features of the '<em>Network Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link Configuration.impl.NodeListTypeImpl <em>Node List Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Configuration.impl.NodeListTypeImpl
	 * @see Configuration.impl.ConfigurationPackageImpl#getNodeListType()
	 * @generated
	 */
	int NODE_LIST_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_LIST_TYPE__NODE = 0;

	/**
	 * The number of structural features of the '<em>Node List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_LIST_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link Configuration.impl.NodeTypeImpl <em>Node Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Configuration.impl.NodeTypeImpl
	 * @see Configuration.impl.ConfigurationPackageImpl#getNodeType()
	 * @generated
	 */
	int NODE_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TYPE__ADDRESS = 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TYPE__PORT = 1;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TYPE__PROTOCOL = 2;

	/**
	 * The number of structural features of the '<em>Node Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link Configuration.ProtocolType <em>Protocol Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Configuration.ProtocolType
	 * @see Configuration.impl.ConfigurationPackageImpl#getProtocolType()
	 * @generated
	 */
	int PROTOCOL_TYPE = 9;

	/**
	 * The meta object id for the '<em>Address Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see Configuration.impl.ConfigurationPackageImpl#getAddressType()
	 * @generated
	 */
	int ADDRESS_TYPE = 10;

	/**
	 * The meta object id for the '<em>Port Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see Configuration.impl.ConfigurationPackageImpl#getPortType()
	 * @generated
	 */
	int PORT_TYPE = 11;

	/**
	 * The meta object id for the '<em>Protocol Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Configuration.ProtocolType
	 * @see Configuration.impl.ConfigurationPackageImpl#getProtocolTypeObject()
	 * @generated
	 */
	int PROTOCOL_TYPE_OBJECT = 12;


	/**
	 * Returns the meta object for class '{@link Configuration.DatabaseType <em>Database Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database Type</em>'.
	 * @see Configuration.DatabaseType
	 * @generated
	 */
	EClass getDatabaseType();

	/**
	 * Returns the meta object for the attribute '{@link Configuration.DatabaseType#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see Configuration.DatabaseType#getAddress()
	 * @see #getDatabaseType()
	 * @generated
	 */
	EAttribute getDatabaseType_Address();

	/**
	 * Returns the meta object for the attribute '{@link Configuration.DatabaseType#getDatabase <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Database</em>'.
	 * @see Configuration.DatabaseType#getDatabase()
	 * @see #getDatabaseType()
	 * @generated
	 */
	EAttribute getDatabaseType_Database();

	/**
	 * Returns the meta object for the attribute '{@link Configuration.DatabaseType#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see Configuration.DatabaseType#getPassword()
	 * @see #getDatabaseType()
	 * @generated
	 */
	EAttribute getDatabaseType_Password();

	/**
	 * Returns the meta object for the attribute '{@link Configuration.DatabaseType#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see Configuration.DatabaseType#getPort()
	 * @see #getDatabaseType()
	 * @generated
	 */
	EAttribute getDatabaseType_Port();

	/**
	 * Returns the meta object for the attribute '{@link Configuration.DatabaseType#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User</em>'.
	 * @see Configuration.DatabaseType#getUser()
	 * @see #getDatabaseType()
	 * @generated
	 */
	EAttribute getDatabaseType_User();

	/**
	 * Returns the meta object for class '{@link Configuration.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see Configuration.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link Configuration.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see Configuration.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link Configuration.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see Configuration.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link Configuration.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see Configuration.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link Configuration.DocumentRoot#getExperiments <em>Experiments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Experiments</em>'.
	 * @see Configuration.DocumentRoot#getExperiments()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Experiments();

	/**
	 * Returns the meta object for class '{@link Configuration.ExperimentListType <em>Experiment List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Experiment List Type</em>'.
	 * @see Configuration.ExperimentListType
	 * @generated
	 */
	EClass getExperimentListType();

	/**
	 * Returns the meta object for the containment reference list '{@link Configuration.ExperimentListType#getExperiment <em>Experiment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Experiment</em>'.
	 * @see Configuration.ExperimentListType#getExperiment()
	 * @see #getExperimentListType()
	 * @generated
	 */
	EReference getExperimentListType_Experiment();

	/**
	 * Returns the meta object for class '{@link Configuration.ExperimentType <em>Experiment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Experiment Type</em>'.
	 * @see Configuration.ExperimentType
	 * @generated
	 */
	EClass getExperimentType();

	/**
	 * Returns the meta object for the containment reference '{@link Configuration.ExperimentType#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nodes</em>'.
	 * @see Configuration.ExperimentType#getNodes()
	 * @see #getExperimentType()
	 * @generated
	 */
	EReference getExperimentType_Nodes();

	/**
	 * Returns the meta object for the containment reference '{@link Configuration.ExperimentType#getHandlers <em>Handlers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Handlers</em>'.
	 * @see Configuration.ExperimentType#getHandlers()
	 * @see #getExperimentType()
	 * @generated
	 */
	EReference getExperimentType_Handlers();

	/**
	 * Returns the meta object for the containment reference '{@link Configuration.ExperimentType#getDatabase <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Database</em>'.
	 * @see Configuration.ExperimentType#getDatabase()
	 * @see #getExperimentType()
	 * @generated
	 */
	EReference getExperimentType_Database();

	/**
	 * Returns the meta object for the attribute '{@link Configuration.ExperimentType#getLogDirectory <em>Log Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Log Directory</em>'.
	 * @see Configuration.ExperimentType#getLogDirectory()
	 * @see #getExperimentType()
	 * @generated
	 */
	EAttribute getExperimentType_LogDirectory();

	/**
	 * Returns the meta object for the attribute '{@link Configuration.ExperimentType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Configuration.ExperimentType#getName()
	 * @see #getExperimentType()
	 * @generated
	 */
	EAttribute getExperimentType_Name();

	/**
	 * Returns the meta object for the attribute '{@link Configuration.ExperimentType#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see Configuration.ExperimentType#getStart()
	 * @see #getExperimentType()
	 * @generated
	 */
	EAttribute getExperimentType_Start();

	/**
	 * Returns the meta object for the attribute '{@link Configuration.ExperimentType#getStop <em>Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stop</em>'.
	 * @see Configuration.ExperimentType#getStop()
	 * @see #getExperimentType()
	 * @generated
	 */
	EAttribute getExperimentType_Stop();

	/**
	 * Returns the meta object for class '{@link Configuration.HandlerListType <em>Handler List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Handler List Type</em>'.
	 * @see Configuration.HandlerListType
	 * @generated
	 */
	EClass getHandlerListType();

	/**
	 * Returns the meta object for the containment reference list '{@link Configuration.HandlerListType#getHandler <em>Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Handler</em>'.
	 * @see Configuration.HandlerListType#getHandler()
	 * @see #getHandlerListType()
	 * @generated
	 */
	EReference getHandlerListType_Handler();

	/**
	 * Returns the meta object for class '{@link Configuration.HandlerType <em>Handler Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Handler Type</em>'.
	 * @see Configuration.HandlerType
	 * @generated
	 */
	EClass getHandlerType();

	/**
	 * Returns the meta object for the attribute '{@link Configuration.HandlerType#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element</em>'.
	 * @see Configuration.HandlerType#getElement()
	 * @see #getHandlerType()
	 * @generated
	 */
	EAttribute getHandlerType_Element();

	/**
	 * Returns the meta object for the attribute '{@link Configuration.HandlerType#getRate <em>Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rate</em>'.
	 * @see Configuration.HandlerType#getRate()
	 * @see #getHandlerType()
	 * @generated
	 */
	EAttribute getHandlerType_Rate();

	/**
	 * Returns the meta object for class '{@link Configuration.NetworkType <em>Network Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Type</em>'.
	 * @see Configuration.NetworkType
	 * @generated
	 */
	EClass getNetworkType();

	/**
	 * Returns the meta object for the containment reference list '{@link Configuration.NetworkType#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Node</em>'.
	 * @see Configuration.NetworkType#getNode()
	 * @see #getNetworkType()
	 * @generated
	 */
	EReference getNetworkType_Node();

	/**
	 * Returns the meta object for the containment reference list '{@link Configuration.NetworkType#getNetwork <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Network</em>'.
	 * @see Configuration.NetworkType#getNetwork()
	 * @see #getNetworkType()
	 * @generated
	 */
	EReference getNetworkType_Network();

	/**
	 * Returns the meta object for the attribute '{@link Configuration.NetworkType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Configuration.NetworkType#getName()
	 * @see #getNetworkType()
	 * @generated
	 */
	EAttribute getNetworkType_Name();

	/**
	 * Returns the meta object for the attribute '{@link Configuration.NetworkType#getUpdateInterval <em>Update Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Update Interval</em>'.
	 * @see Configuration.NetworkType#getUpdateInterval()
	 * @see #getNetworkType()
	 * @generated
	 */
	EAttribute getNetworkType_UpdateInterval();

	/**
	 * Returns the meta object for class '{@link Configuration.NodeListType <em>Node List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node List Type</em>'.
	 * @see Configuration.NodeListType
	 * @generated
	 */
	EClass getNodeListType();

	/**
	 * Returns the meta object for the containment reference list '{@link Configuration.NodeListType#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Node</em>'.
	 * @see Configuration.NodeListType#getNode()
	 * @see #getNodeListType()
	 * @generated
	 */
	EReference getNodeListType_Node();

	/**
	 * Returns the meta object for class '{@link Configuration.NodeType <em>Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Type</em>'.
	 * @see Configuration.NodeType
	 * @generated
	 */
	EClass getNodeType();

	/**
	 * Returns the meta object for the attribute '{@link Configuration.NodeType#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see Configuration.NodeType#getAddress()
	 * @see #getNodeType()
	 * @generated
	 */
	EAttribute getNodeType_Address();

	/**
	 * Returns the meta object for the attribute '{@link Configuration.NodeType#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see Configuration.NodeType#getPort()
	 * @see #getNodeType()
	 * @generated
	 */
	EAttribute getNodeType_Port();

	/**
	 * Returns the meta object for the attribute '{@link Configuration.NodeType#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol</em>'.
	 * @see Configuration.NodeType#getProtocol()
	 * @see #getNodeType()
	 * @generated
	 */
	EAttribute getNodeType_Protocol();

	/**
	 * Returns the meta object for enum '{@link Configuration.ProtocolType <em>Protocol Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Protocol Type</em>'.
	 * @see Configuration.ProtocolType
	 * @generated
	 */
	EEnum getProtocolType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Address Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Address Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='addressType' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='((1?[0-9]?[0-9]|2[0-4][0-9]|25[0-5]).){3}(1?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])'"
	 * @generated
	 */
	EDataType getAddressType();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Port Type</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='portType' baseType='http://www.eclipse.org/emf/2003/XMLType#integer' minInclusive='0' maxInclusive='65535'"
	 * @generated
	 */
	EDataType getPortType();

	/**
	 * Returns the meta object for data type '{@link Configuration.ProtocolType <em>Protocol Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Protocol Type Object</em>'.
	 * @see Configuration.ProtocolType
	 * @model instanceClass="Configuration.ProtocolType"
	 *        extendedMetaData="name='protocolType:Object' baseType='protocolType'"
	 * @generated
	 */
	EDataType getProtocolTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ConfigurationFactory getConfigurationFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link Configuration.impl.DatabaseTypeImpl <em>Database Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Configuration.impl.DatabaseTypeImpl
		 * @see Configuration.impl.ConfigurationPackageImpl#getDatabaseType()
		 * @generated
		 */
		EClass DATABASE_TYPE = eINSTANCE.getDatabaseType();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE_TYPE__ADDRESS = eINSTANCE.getDatabaseType_Address();

		/**
		 * The meta object literal for the '<em><b>Database</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE_TYPE__DATABASE = eINSTANCE.getDatabaseType_Database();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE_TYPE__PASSWORD = eINSTANCE.getDatabaseType_Password();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE_TYPE__PORT = eINSTANCE.getDatabaseType_Port();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE_TYPE__USER = eINSTANCE.getDatabaseType_User();

		/**
		 * The meta object literal for the '{@link Configuration.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Configuration.impl.DocumentRootImpl
		 * @see Configuration.impl.ConfigurationPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Experiments</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__EXPERIMENTS = eINSTANCE.getDocumentRoot_Experiments();

		/**
		 * The meta object literal for the '{@link Configuration.impl.ExperimentListTypeImpl <em>Experiment List Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Configuration.impl.ExperimentListTypeImpl
		 * @see Configuration.impl.ConfigurationPackageImpl#getExperimentListType()
		 * @generated
		 */
		EClass EXPERIMENT_LIST_TYPE = eINSTANCE.getExperimentListType();

		/**
		 * The meta object literal for the '<em><b>Experiment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPERIMENT_LIST_TYPE__EXPERIMENT = eINSTANCE.getExperimentListType_Experiment();

		/**
		 * The meta object literal for the '{@link Configuration.impl.ExperimentTypeImpl <em>Experiment Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Configuration.impl.ExperimentTypeImpl
		 * @see Configuration.impl.ConfigurationPackageImpl#getExperimentType()
		 * @generated
		 */
		EClass EXPERIMENT_TYPE = eINSTANCE.getExperimentType();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPERIMENT_TYPE__NODES = eINSTANCE.getExperimentType_Nodes();

		/**
		 * The meta object literal for the '<em><b>Handlers</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPERIMENT_TYPE__HANDLERS = eINSTANCE.getExperimentType_Handlers();

		/**
		 * The meta object literal for the '<em><b>Database</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPERIMENT_TYPE__DATABASE = eINSTANCE.getExperimentType_Database();

		/**
		 * The meta object literal for the '<em><b>Log Directory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPERIMENT_TYPE__LOG_DIRECTORY = eINSTANCE.getExperimentType_LogDirectory();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPERIMENT_TYPE__NAME = eINSTANCE.getExperimentType_Name();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPERIMENT_TYPE__START = eINSTANCE.getExperimentType_Start();

		/**
		 * The meta object literal for the '<em><b>Stop</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPERIMENT_TYPE__STOP = eINSTANCE.getExperimentType_Stop();

		/**
		 * The meta object literal for the '{@link Configuration.impl.HandlerListTypeImpl <em>Handler List Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Configuration.impl.HandlerListTypeImpl
		 * @see Configuration.impl.ConfigurationPackageImpl#getHandlerListType()
		 * @generated
		 */
		EClass HANDLER_LIST_TYPE = eINSTANCE.getHandlerListType();

		/**
		 * The meta object literal for the '<em><b>Handler</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HANDLER_LIST_TYPE__HANDLER = eINSTANCE.getHandlerListType_Handler();

		/**
		 * The meta object literal for the '{@link Configuration.impl.HandlerTypeImpl <em>Handler Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Configuration.impl.HandlerTypeImpl
		 * @see Configuration.impl.ConfigurationPackageImpl#getHandlerType()
		 * @generated
		 */
		EClass HANDLER_TYPE = eINSTANCE.getHandlerType();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HANDLER_TYPE__ELEMENT = eINSTANCE.getHandlerType_Element();

		/**
		 * The meta object literal for the '<em><b>Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HANDLER_TYPE__RATE = eINSTANCE.getHandlerType_Rate();

		/**
		 * The meta object literal for the '{@link Configuration.impl.NetworkTypeImpl <em>Network Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Configuration.impl.NetworkTypeImpl
		 * @see Configuration.impl.ConfigurationPackageImpl#getNetworkType()
		 * @generated
		 */
		EClass NETWORK_TYPE = eINSTANCE.getNetworkType();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK_TYPE__NODE = eINSTANCE.getNetworkType_Node();

		/**
		 * The meta object literal for the '<em><b>Network</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK_TYPE__NETWORK = eINSTANCE.getNetworkType_Network();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_TYPE__NAME = eINSTANCE.getNetworkType_Name();

		/**
		 * The meta object literal for the '<em><b>Update Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_TYPE__UPDATE_INTERVAL = eINSTANCE.getNetworkType_UpdateInterval();

		/**
		 * The meta object literal for the '{@link Configuration.impl.NodeListTypeImpl <em>Node List Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Configuration.impl.NodeListTypeImpl
		 * @see Configuration.impl.ConfigurationPackageImpl#getNodeListType()
		 * @generated
		 */
		EClass NODE_LIST_TYPE = eINSTANCE.getNodeListType();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_LIST_TYPE__NODE = eINSTANCE.getNodeListType_Node();

		/**
		 * The meta object literal for the '{@link Configuration.impl.NodeTypeImpl <em>Node Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Configuration.impl.NodeTypeImpl
		 * @see Configuration.impl.ConfigurationPackageImpl#getNodeType()
		 * @generated
		 */
		EClass NODE_TYPE = eINSTANCE.getNodeType();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_TYPE__ADDRESS = eINSTANCE.getNodeType_Address();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_TYPE__PORT = eINSTANCE.getNodeType_Port();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_TYPE__PROTOCOL = eINSTANCE.getNodeType_Protocol();

		/**
		 * The meta object literal for the '{@link Configuration.ProtocolType <em>Protocol Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Configuration.ProtocolType
		 * @see Configuration.impl.ConfigurationPackageImpl#getProtocolType()
		 * @generated
		 */
		EEnum PROTOCOL_TYPE = eINSTANCE.getProtocolType();

		/**
		 * The meta object literal for the '<em>Address Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see Configuration.impl.ConfigurationPackageImpl#getAddressType()
		 * @generated
		 */
		EDataType ADDRESS_TYPE = eINSTANCE.getAddressType();

		/**
		 * The meta object literal for the '<em>Port Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see Configuration.impl.ConfigurationPackageImpl#getPortType()
		 * @generated
		 */
		EDataType PORT_TYPE = eINSTANCE.getPortType();

		/**
		 * The meta object literal for the '<em>Protocol Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Configuration.ProtocolType
		 * @see Configuration.impl.ConfigurationPackageImpl#getProtocolTypeObject()
		 * @generated
		 */
		EDataType PROTOCOL_TYPE_OBJECT = eINSTANCE.getProtocolTypeObject();

	}

} //ConfigurationPackage
