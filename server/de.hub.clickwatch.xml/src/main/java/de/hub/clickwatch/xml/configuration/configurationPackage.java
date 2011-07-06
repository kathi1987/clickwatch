/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.xml.configuration;

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
 * @see de.hub.clickwatch.xml.configuration.configurationFactory
 * @model kind="package"
 *        extendedMetaData="qualified='false'"
 * @generated
 */
public interface configurationPackage extends EPackage {
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
	configurationPackage eINSTANCE = de.hub.clickwatch.xml.configuration.impl.configurationPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.xml.configuration.impl.ConfigurationTypeImpl <em>Configuration Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.xml.configuration.impl.ConfigurationTypeImpl
	 * @see de.hub.clickwatch.xml.configuration.impl.configurationPackageImpl#getConfigurationType()
	 * @generated
	 */
	int CONFIGURATION_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Network</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_TYPE__NETWORK = 0;

	/**
	 * The feature id for the '<em><b>Database</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_TYPE__DATABASE = 1;

	/**
	 * The feature id for the '<em><b>Log Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_TYPE__LOG_DIRECTORY = 2;

	/**
	 * The number of structural features of the '<em>Configuration Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.xml.configuration.impl.DatabaseTypeImpl <em>Database Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.xml.configuration.impl.DatabaseTypeImpl
	 * @see de.hub.clickwatch.xml.configuration.impl.configurationPackageImpl#getDatabaseType()
	 * @generated
	 */
	int DATABASE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_TYPE__ADDRESS = 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_TYPE__PORT = 1;

	/**
	 * The number of structural features of the '<em>Database Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.xml.configuration.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.xml.configuration.impl.DocumentRootImpl
	 * @see de.hub.clickwatch.xml.configuration.impl.configurationPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 2;

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
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONFIGURATION = 3;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.xml.configuration.impl.NetworkTypeImpl <em>Network Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.xml.configuration.impl.NetworkTypeImpl
	 * @see de.hub.clickwatch.xml.configuration.impl.configurationPackageImpl#getNetworkType()
	 * @generated
	 */
	int NETWORK_TYPE = 3;

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
	 * The meta object id for the '{@link de.hub.clickwatch.xml.configuration.impl.NodeTypeImpl <em>Node Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.xml.configuration.impl.NodeTypeImpl
	 * @see de.hub.clickwatch.xml.configuration.impl.configurationPackageImpl#getNodeType()
	 * @generated
	 */
	int NODE_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TYPE__ADDRESS = 0;

	/**
	 * The feature id for the '<em><b>Element Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TYPE__ELEMENT_FILTER = 1;

	/**
	 * The feature id for the '<em><b>Handler Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TYPE__HANDLER_FILTER = 2;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TYPE__PORT = 3;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TYPE__PROTOCOL = 4;

	/**
	 * The number of structural features of the '<em>Node Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.xml.configuration.ProtocolType <em>Protocol Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.xml.configuration.ProtocolType
	 * @see de.hub.clickwatch.xml.configuration.impl.configurationPackageImpl#getProtocolType()
	 * @generated
	 */
	int PROTOCOL_TYPE = 5;

	/**
	 * The meta object id for the '<em>Address Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see de.hub.clickwatch.xml.configuration.impl.configurationPackageImpl#getAddressType()
	 * @generated
	 */
	int ADDRESS_TYPE = 6;

	/**
	 * The meta object id for the '<em>Port Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see de.hub.clickwatch.xml.configuration.impl.configurationPackageImpl#getPortType()
	 * @generated
	 */
	int PORT_TYPE = 7;

	/**
	 * The meta object id for the '<em>Protocol Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.xml.configuration.ProtocolType
	 * @see de.hub.clickwatch.xml.configuration.impl.configurationPackageImpl#getProtocolTypeObject()
	 * @generated
	 */
	int PROTOCOL_TYPE_OBJECT = 8;


	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.xml.configuration.ConfigurationType <em>Configuration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration Type</em>'.
	 * @see de.hub.clickwatch.xml.configuration.ConfigurationType
	 * @generated
	 */
	EClass getConfigurationType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.hub.clickwatch.xml.configuration.ConfigurationType#getNetwork <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Network</em>'.
	 * @see de.hub.clickwatch.xml.configuration.ConfigurationType#getNetwork()
	 * @see #getConfigurationType()
	 * @generated
	 */
	EReference getConfigurationType_Network();

	/**
	 * Returns the meta object for the containment reference list '{@link de.hub.clickwatch.xml.configuration.ConfigurationType#getDatabase <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Database</em>'.
	 * @see de.hub.clickwatch.xml.configuration.ConfigurationType#getDatabase()
	 * @see #getConfigurationType()
	 * @generated
	 */
	EReference getConfigurationType_Database();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.xml.configuration.ConfigurationType#getLogDirectory <em>Log Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Log Directory</em>'.
	 * @see de.hub.clickwatch.xml.configuration.ConfigurationType#getLogDirectory()
	 * @see #getConfigurationType()
	 * @generated
	 */
	EAttribute getConfigurationType_LogDirectory();

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.xml.configuration.DatabaseType <em>Database Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database Type</em>'.
	 * @see de.hub.clickwatch.xml.configuration.DatabaseType
	 * @generated
	 */
	EClass getDatabaseType();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.xml.configuration.DatabaseType#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see de.hub.clickwatch.xml.configuration.DatabaseType#getAddress()
	 * @see #getDatabaseType()
	 * @generated
	 */
	EAttribute getDatabaseType_Address();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.xml.configuration.DatabaseType#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see de.hub.clickwatch.xml.configuration.DatabaseType#getPort()
	 * @see #getDatabaseType()
	 * @generated
	 */
	EAttribute getDatabaseType_Port();

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.xml.configuration.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see de.hub.clickwatch.xml.configuration.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link de.hub.clickwatch.xml.configuration.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see de.hub.clickwatch.xml.configuration.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link de.hub.clickwatch.xml.configuration.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see de.hub.clickwatch.xml.configuration.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link de.hub.clickwatch.xml.configuration.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see de.hub.clickwatch.xml.configuration.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link de.hub.clickwatch.xml.configuration.DocumentRoot#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Configuration</em>'.
	 * @see de.hub.clickwatch.xml.configuration.DocumentRoot#getConfiguration()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Configuration();

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.xml.configuration.NetworkType <em>Network Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Type</em>'.
	 * @see de.hub.clickwatch.xml.configuration.NetworkType
	 * @generated
	 */
	EClass getNetworkType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.hub.clickwatch.xml.configuration.NetworkType#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Node</em>'.
	 * @see de.hub.clickwatch.xml.configuration.NetworkType#getNode()
	 * @see #getNetworkType()
	 * @generated
	 */
	EReference getNetworkType_Node();

	/**
	 * Returns the meta object for the containment reference list '{@link de.hub.clickwatch.xml.configuration.NetworkType#getNetwork <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Network</em>'.
	 * @see de.hub.clickwatch.xml.configuration.NetworkType#getNetwork()
	 * @see #getNetworkType()
	 * @generated
	 */
	EReference getNetworkType_Network();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.xml.configuration.NetworkType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.hub.clickwatch.xml.configuration.NetworkType#getName()
	 * @see #getNetworkType()
	 * @generated
	 */
	EAttribute getNetworkType_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.xml.configuration.NetworkType#getUpdateInterval <em>Update Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Update Interval</em>'.
	 * @see de.hub.clickwatch.xml.configuration.NetworkType#getUpdateInterval()
	 * @see #getNetworkType()
	 * @generated
	 */
	EAttribute getNetworkType_UpdateInterval();

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.xml.configuration.NodeType <em>Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Type</em>'.
	 * @see de.hub.clickwatch.xml.configuration.NodeType
	 * @generated
	 */
	EClass getNodeType();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.xml.configuration.NodeType#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see de.hub.clickwatch.xml.configuration.NodeType#getAddress()
	 * @see #getNodeType()
	 * @generated
	 */
	EAttribute getNodeType_Address();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.xml.configuration.NodeType#getElementFilter <em>Element Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element Filter</em>'.
	 * @see de.hub.clickwatch.xml.configuration.NodeType#getElementFilter()
	 * @see #getNodeType()
	 * @generated
	 */
	EAttribute getNodeType_ElementFilter();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.xml.configuration.NodeType#getHandlerFilter <em>Handler Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Handler Filter</em>'.
	 * @see de.hub.clickwatch.xml.configuration.NodeType#getHandlerFilter()
	 * @see #getNodeType()
	 * @generated
	 */
	EAttribute getNodeType_HandlerFilter();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.xml.configuration.NodeType#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see de.hub.clickwatch.xml.configuration.NodeType#getPort()
	 * @see #getNodeType()
	 * @generated
	 */
	EAttribute getNodeType_Port();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.xml.configuration.NodeType#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol</em>'.
	 * @see de.hub.clickwatch.xml.configuration.NodeType#getProtocol()
	 * @see #getNodeType()
	 * @generated
	 */
	EAttribute getNodeType_Protocol();

	/**
	 * Returns the meta object for enum '{@link de.hub.clickwatch.xml.configuration.ProtocolType <em>Protocol Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Protocol Type</em>'.
	 * @see de.hub.clickwatch.xml.configuration.ProtocolType
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
	 * Returns the meta object for data type '{@link de.hub.clickwatch.xml.configuration.ProtocolType <em>Protocol Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Protocol Type Object</em>'.
	 * @see de.hub.clickwatch.xml.configuration.ProtocolType
	 * @model instanceClass="de.hub.clickwatch.xml.Configuration.ProtocolType"
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
	configurationFactory getconfigurationFactory();

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
		 * The meta object literal for the '{@link de.hub.clickwatch.xml.configuration.impl.ConfigurationTypeImpl <em>Configuration Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.xml.configuration.impl.ConfigurationTypeImpl
		 * @see de.hub.clickwatch.xml.configuration.impl.configurationPackageImpl#getConfigurationType()
		 * @generated
		 */
		EClass CONFIGURATION_TYPE = eINSTANCE.getConfigurationType();

		/**
		 * The meta object literal for the '<em><b>Network</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION_TYPE__NETWORK = eINSTANCE.getConfigurationType_Network();

		/**
		 * The meta object literal for the '<em><b>Database</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION_TYPE__DATABASE = eINSTANCE.getConfigurationType_Database();

		/**
		 * The meta object literal for the '<em><b>Log Directory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION_TYPE__LOG_DIRECTORY = eINSTANCE.getConfigurationType_LogDirectory();

		/**
		 * The meta object literal for the '{@link de.hub.clickwatch.xml.configuration.impl.DatabaseTypeImpl <em>Database Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.xml.configuration.impl.DatabaseTypeImpl
		 * @see de.hub.clickwatch.xml.configuration.impl.configurationPackageImpl#getDatabaseType()
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
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE_TYPE__PORT = eINSTANCE.getDatabaseType_Port();

		/**
		 * The meta object literal for the '{@link de.hub.clickwatch.xml.configuration.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.xml.configuration.impl.DocumentRootImpl
		 * @see de.hub.clickwatch.xml.configuration.impl.configurationPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CONFIGURATION = eINSTANCE.getDocumentRoot_Configuration();

		/**
		 * The meta object literal for the '{@link de.hub.clickwatch.xml.configuration.impl.NetworkTypeImpl <em>Network Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.xml.configuration.impl.NetworkTypeImpl
		 * @see de.hub.clickwatch.xml.configuration.impl.configurationPackageImpl#getNetworkType()
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
		 * The meta object literal for the '{@link de.hub.clickwatch.xml.configuration.impl.NodeTypeImpl <em>Node Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.xml.configuration.impl.NodeTypeImpl
		 * @see de.hub.clickwatch.xml.configuration.impl.configurationPackageImpl#getNodeType()
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
		 * The meta object literal for the '<em><b>Element Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_TYPE__ELEMENT_FILTER = eINSTANCE.getNodeType_ElementFilter();

		/**
		 * The meta object literal for the '<em><b>Handler Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_TYPE__HANDLER_FILTER = eINSTANCE.getNodeType_HandlerFilter();

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
		 * The meta object literal for the '{@link de.hub.clickwatch.xml.configuration.ProtocolType <em>Protocol Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.xml.configuration.ProtocolType
		 * @see de.hub.clickwatch.xml.configuration.impl.configurationPackageImpl#getProtocolType()
		 * @generated
		 */
		EEnum PROTOCOL_TYPE = eINSTANCE.getProtocolType();

		/**
		 * The meta object literal for the '<em>Address Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see de.hub.clickwatch.xml.configuration.impl.configurationPackageImpl#getAddressType()
		 * @generated
		 */
		EDataType ADDRESS_TYPE = eINSTANCE.getAddressType();

		/**
		 * The meta object literal for the '<em>Port Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see de.hub.clickwatch.xml.configuration.impl.configurationPackageImpl#getPortType()
		 * @generated
		 */
		EDataType PORT_TYPE = eINSTANCE.getPortType();

		/**
		 * The meta object literal for the '<em>Protocol Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.xml.configuration.ProtocolType
		 * @see de.hub.clickwatch.xml.configuration.impl.configurationPackageImpl#getProtocolTypeObject()
		 * @generated
		 */
		EDataType PROTOCOL_TYPE_OBJECT = eINSTANCE.getProtocolTypeObject();

	}

} //configurationPackage
