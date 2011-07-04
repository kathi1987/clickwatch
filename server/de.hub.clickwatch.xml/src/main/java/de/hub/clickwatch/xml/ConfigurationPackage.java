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
 * @see de.hub.clickwatch.xml.ConfigurationFactory
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
	String eNS_URI = "platform:/resource/edu.hu.clickwatch.xml/src/main/resources/configuration.xsd";

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
	 * The meta object id for the '{@link de.hub.clickwatch.xml.impl.CdoTypeImpl <em>Cdo Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.xml.impl.CdoTypeImpl
	 * @see de.hub.clickwatch.xml.impl.ConfigurationPackageImpl#getCdoType()
	 * @generated
	 */
	int CDO_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDO_TYPE__ADDRESS = 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDO_TYPE__PORT = 1;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDO_TYPE__REPOSITORY = 2;

	/**
	 * The number of structural features of the '<em>Cdo Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDO_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.xml.impl.ConfigurationTypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.xml.impl.ConfigurationTypeImpl
	 * @see de.hub.clickwatch.xml.impl.ConfigurationPackageImpl#getConfigurationType()
	 * @generated
	 */
	int CONFIGURATION_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Network</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_TYPE__NETWORK = 0;

	/**
	 * The feature id for the '<em><b>Cdo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_TYPE__CDO = 1;

	/**
	 * The feature id for the '<em><b>Log Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_TYPE__LOG_DIRECTORY = 2;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.xml.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.xml.impl.DocumentRootImpl
	 * @see de.hub.clickwatch.xml.impl.ConfigurationPackageImpl#getDocumentRoot()
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
	 * The meta object id for the '{@link de.hub.clickwatch.xml.impl.NetworkTypeImpl <em>Network Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.xml.impl.NetworkTypeImpl
	 * @see de.hub.clickwatch.xml.impl.ConfigurationPackageImpl#getNetworkType()
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
	 * The meta object id for the '{@link de.hub.clickwatch.xml.impl.NodeTypeImpl <em>Node Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.xml.impl.NodeTypeImpl
	 * @see de.hub.clickwatch.xml.impl.ConfigurationPackageImpl#getNodeType()
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
	 * The meta object id for the '{@link de.hub.clickwatch.xml.ProtocolType <em>Protocol Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.xml.ProtocolType
	 * @see de.hub.clickwatch.xml.impl.ConfigurationPackageImpl#getProtocolType()
	 * @generated
	 */
	int PROTOCOL_TYPE = 5;

	/**
	 * The meta object id for the '<em>Address Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see de.hub.clickwatch.xml.impl.ConfigurationPackageImpl#getAddressType()
	 * @generated
	 */
	int ADDRESS_TYPE = 6;

	/**
	 * The meta object id for the '<em>Port Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see de.hub.clickwatch.xml.impl.ConfigurationPackageImpl#getPortType()
	 * @generated
	 */
	int PORT_TYPE = 7;

	/**
	 * The meta object id for the '<em>Protocol Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.xml.ProtocolType
	 * @see de.hub.clickwatch.xml.impl.ConfigurationPackageImpl#getProtocolTypeObject()
	 * @generated
	 */
	int PROTOCOL_TYPE_OBJECT = 8;


	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.xml.CdoType <em>Cdo Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cdo Type</em>'.
	 * @see de.hub.clickwatch.xml.CdoType
	 * @generated
	 */
	EClass getCdoType();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.xml.CdoType#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see de.hub.clickwatch.xml.CdoType#getAddress()
	 * @see #getCdoType()
	 * @generated
	 */
	EAttribute getCdoType_Address();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.xml.CdoType#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see de.hub.clickwatch.xml.CdoType#getPort()
	 * @see #getCdoType()
	 * @generated
	 */
	EAttribute getCdoType_Port();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.xml.CdoType#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repository</em>'.
	 * @see de.hub.clickwatch.xml.CdoType#getRepository()
	 * @see #getCdoType()
	 * @generated
	 */
	EAttribute getCdoType_Repository();

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.xml.ConfigurationType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see de.hub.clickwatch.xml.ConfigurationType
	 * @generated
	 */
	EClass getConfigurationType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.hub.clickwatch.xml.ConfigurationType#getNetwork <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Network</em>'.
	 * @see de.hub.clickwatch.xml.ConfigurationType#getNetwork()
	 * @see #getConfigurationType()
	 * @generated
	 */
	EReference getConfigurationType_Network();

	/**
	 * Returns the meta object for the containment reference list '{@link de.hub.clickwatch.xml.ConfigurationType#getCdo <em>Cdo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cdo</em>'.
	 * @see de.hub.clickwatch.xml.ConfigurationType#getCdo()
	 * @see #getConfigurationType()
	 * @generated
	 */
	EReference getConfigurationType_Cdo();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.xml.ConfigurationType#getLogDirectory <em>Log Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Log Directory</em>'.
	 * @see de.hub.clickwatch.xml.ConfigurationType#getLogDirectory()
	 * @see #getConfigurationType()
	 * @generated
	 */
	EAttribute getConfigurationType_LogDirectory();

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.xml.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see de.hub.clickwatch.xml.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link de.hub.clickwatch.xml.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see de.hub.clickwatch.xml.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link de.hub.clickwatch.xml.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see de.hub.clickwatch.xml.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link de.hub.clickwatch.xml.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see de.hub.clickwatch.xml.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link de.hub.clickwatch.xml.DocumentRoot#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Configuration</em>'.
	 * @see de.hub.clickwatch.xml.DocumentRoot#getConfiguration()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Configuration();

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.xml.NetworkType <em>Network Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Type</em>'.
	 * @see de.hub.clickwatch.xml.NetworkType
	 * @generated
	 */
	EClass getNetworkType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.hub.clickwatch.xml.NetworkType#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Node</em>'.
	 * @see de.hub.clickwatch.xml.NetworkType#getNode()
	 * @see #getNetworkType()
	 * @generated
	 */
	EReference getNetworkType_Node();

	/**
	 * Returns the meta object for the containment reference list '{@link de.hub.clickwatch.xml.NetworkType#getNetwork <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Network</em>'.
	 * @see de.hub.clickwatch.xml.NetworkType#getNetwork()
	 * @see #getNetworkType()
	 * @generated
	 */
	EReference getNetworkType_Network();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.xml.NetworkType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.hub.clickwatch.xml.NetworkType#getName()
	 * @see #getNetworkType()
	 * @generated
	 */
	EAttribute getNetworkType_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.xml.NetworkType#getUpdateInterval <em>Update Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Update Interval</em>'.
	 * @see de.hub.clickwatch.xml.NetworkType#getUpdateInterval()
	 * @see #getNetworkType()
	 * @generated
	 */
	EAttribute getNetworkType_UpdateInterval();

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.xml.NodeType <em>Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Type</em>'.
	 * @see de.hub.clickwatch.xml.NodeType
	 * @generated
	 */
	EClass getNodeType();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.xml.NodeType#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see de.hub.clickwatch.xml.NodeType#getAddress()
	 * @see #getNodeType()
	 * @generated
	 */
	EAttribute getNodeType_Address();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.xml.NodeType#getElementFilter <em>Element Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element Filter</em>'.
	 * @see de.hub.clickwatch.xml.NodeType#getElementFilter()
	 * @see #getNodeType()
	 * @generated
	 */
	EAttribute getNodeType_ElementFilter();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.xml.NodeType#getHandlerFilter <em>Handler Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Handler Filter</em>'.
	 * @see de.hub.clickwatch.xml.NodeType#getHandlerFilter()
	 * @see #getNodeType()
	 * @generated
	 */
	EAttribute getNodeType_HandlerFilter();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.xml.NodeType#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see de.hub.clickwatch.xml.NodeType#getPort()
	 * @see #getNodeType()
	 * @generated
	 */
	EAttribute getNodeType_Port();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.xml.NodeType#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol</em>'.
	 * @see de.hub.clickwatch.xml.NodeType#getProtocol()
	 * @see #getNodeType()
	 * @generated
	 */
	EAttribute getNodeType_Protocol();

	/**
	 * Returns the meta object for enum '{@link de.hub.clickwatch.xml.ProtocolType <em>Protocol Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Protocol Type</em>'.
	 * @see de.hub.clickwatch.xml.ProtocolType
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
	 * Returns the meta object for data type '{@link de.hub.clickwatch.xml.ProtocolType <em>Protocol Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Protocol Type Object</em>'.
	 * @see de.hub.clickwatch.xml.ProtocolType
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
		 * The meta object literal for the '{@link de.hub.clickwatch.xml.impl.CdoTypeImpl <em>Cdo Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.xml.impl.CdoTypeImpl
		 * @see de.hub.clickwatch.xml.impl.ConfigurationPackageImpl#getCdoType()
		 * @generated
		 */
		EClass CDO_TYPE = eINSTANCE.getCdoType();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CDO_TYPE__ADDRESS = eINSTANCE.getCdoType_Address();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CDO_TYPE__PORT = eINSTANCE.getCdoType_Port();

		/**
		 * The meta object literal for the '<em><b>Repository</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CDO_TYPE__REPOSITORY = eINSTANCE.getCdoType_Repository();

		/**
		 * The meta object literal for the '{@link de.hub.clickwatch.xml.impl.ConfigurationTypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.xml.impl.ConfigurationTypeImpl
		 * @see de.hub.clickwatch.xml.impl.ConfigurationPackageImpl#getConfigurationType()
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
		 * The meta object literal for the '<em><b>Cdo</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION_TYPE__CDO = eINSTANCE.getConfigurationType_Cdo();

		/**
		 * The meta object literal for the '<em><b>Log Directory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION_TYPE__LOG_DIRECTORY = eINSTANCE.getConfigurationType_LogDirectory();

		/**
		 * The meta object literal for the '{@link de.hub.clickwatch.xml.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.xml.impl.DocumentRootImpl
		 * @see de.hub.clickwatch.xml.impl.ConfigurationPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '{@link de.hub.clickwatch.xml.impl.NetworkTypeImpl <em>Network Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.xml.impl.NetworkTypeImpl
		 * @see de.hub.clickwatch.xml.impl.ConfigurationPackageImpl#getNetworkType()
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
		 * The meta object literal for the '{@link de.hub.clickwatch.xml.impl.NodeTypeImpl <em>Node Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.xml.impl.NodeTypeImpl
		 * @see de.hub.clickwatch.xml.impl.ConfigurationPackageImpl#getNodeType()
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
		 * The meta object literal for the '{@link de.hub.clickwatch.xml.ProtocolType <em>Protocol Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.xml.ProtocolType
		 * @see de.hub.clickwatch.xml.impl.ConfigurationPackageImpl#getProtocolType()
		 * @generated
		 */
		EEnum PROTOCOL_TYPE = eINSTANCE.getProtocolType();

		/**
		 * The meta object literal for the '<em>Address Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see de.hub.clickwatch.xml.impl.ConfigurationPackageImpl#getAddressType()
		 * @generated
		 */
		EDataType ADDRESS_TYPE = eINSTANCE.getAddressType();

		/**
		 * The meta object literal for the '<em>Port Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see de.hub.clickwatch.xml.impl.ConfigurationPackageImpl#getPortType()
		 * @generated
		 */
		EDataType PORT_TYPE = eINSTANCE.getPortType();

		/**
		 * The meta object literal for the '<em>Protocol Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.xml.ProtocolType
		 * @see de.hub.clickwatch.xml.impl.ConfigurationPackageImpl#getProtocolTypeObject()
		 * @generated
		 */
		EDataType PROTOCOL_TYPE_OBJECT = eINSTANCE.getProtocolTypeObject();

	}

} //ConfigurationPackage
