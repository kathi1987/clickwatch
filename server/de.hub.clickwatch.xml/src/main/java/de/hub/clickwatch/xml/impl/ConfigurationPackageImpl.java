/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.xml.impl;



import java.math.BigInteger;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import de.hub.clickwatch.xml.CdoType;
import de.hub.clickwatch.xml.ConfigurationFactory;
import de.hub.clickwatch.xml.ConfigurationPackage;
import de.hub.clickwatch.xml.ConfigurationType;
import de.hub.clickwatch.xml.DocumentRoot;
import de.hub.clickwatch.xml.NetworkType;
import de.hub.clickwatch.xml.NodeType;
import de.hub.clickwatch.xml.ProtocolType;
import de.hub.clickwatch.xml.util.ConfigurationValidator;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConfigurationPackageImpl extends EPackageImpl implements ConfigurationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdoTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum protocolTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType addressTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType portTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType protocolTypeObjectEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.hub.clickwatch.xml.ConfigurationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ConfigurationPackageImpl() {
		super(eNS_URI, ConfigurationFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ConfigurationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ConfigurationPackage init() {
		if (isInited) return (ConfigurationPackage)EPackage.Registry.INSTANCE.getEPackage(ConfigurationPackage.eNS_URI);

		// Obtain or create and register package
		ConfigurationPackageImpl theConfigurationPackage = (ConfigurationPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ConfigurationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ConfigurationPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theConfigurationPackage.createPackageContents();

		// Initialize created meta-data
		theConfigurationPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theConfigurationPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return ConfigurationValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theConfigurationPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ConfigurationPackage.eNS_URI, theConfigurationPackage);
		return theConfigurationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCdoType() {
		return cdoTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCdoType_Address() {
		return (EAttribute)cdoTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCdoType_Port() {
		return (EAttribute)cdoTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCdoType_Repository() {
		return (EAttribute)cdoTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfigurationType() {
		return configurationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigurationType_Network() {
		return (EReference)configurationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigurationType_Cdo() {
		return (EReference)configurationTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigurationType_LogDirectory() {
		return (EAttribute)configurationTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Configuration() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetworkType() {
		return networkTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNetworkType_Node() {
		return (EReference)networkTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNetworkType_Network() {
		return (EReference)networkTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetworkType_Name() {
		return (EAttribute)networkTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetworkType_UpdateInterval() {
		return (EAttribute)networkTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodeType() {
		return nodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeType_Address() {
		return (EAttribute)nodeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeType_ElementFilter() {
		return (EAttribute)nodeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeType_HandlerFilter() {
		return (EAttribute)nodeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeType_Port() {
		return (EAttribute)nodeTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeType_Protocol() {
		return (EAttribute)nodeTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProtocolType() {
		return protocolTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAddressType() {
		return addressTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPortType() {
		return portTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getProtocolTypeObject() {
		return protocolTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationFactory getConfigurationFactory() {
		return (ConfigurationFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		cdoTypeEClass = createEClass(CDO_TYPE);
		createEAttribute(cdoTypeEClass, CDO_TYPE__ADDRESS);
		createEAttribute(cdoTypeEClass, CDO_TYPE__PORT);
		createEAttribute(cdoTypeEClass, CDO_TYPE__REPOSITORY);

		configurationTypeEClass = createEClass(CONFIGURATION_TYPE);
		createEReference(configurationTypeEClass, CONFIGURATION_TYPE__NETWORK);
		createEReference(configurationTypeEClass, CONFIGURATION_TYPE__CDO);
		createEAttribute(configurationTypeEClass, CONFIGURATION_TYPE__LOG_DIRECTORY);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CONFIGURATION);

		networkTypeEClass = createEClass(NETWORK_TYPE);
		createEReference(networkTypeEClass, NETWORK_TYPE__NODE);
		createEReference(networkTypeEClass, NETWORK_TYPE__NETWORK);
		createEAttribute(networkTypeEClass, NETWORK_TYPE__NAME);
		createEAttribute(networkTypeEClass, NETWORK_TYPE__UPDATE_INTERVAL);

		nodeTypeEClass = createEClass(NODE_TYPE);
		createEAttribute(nodeTypeEClass, NODE_TYPE__ADDRESS);
		createEAttribute(nodeTypeEClass, NODE_TYPE__ELEMENT_FILTER);
		createEAttribute(nodeTypeEClass, NODE_TYPE__HANDLER_FILTER);
		createEAttribute(nodeTypeEClass, NODE_TYPE__PORT);
		createEAttribute(nodeTypeEClass, NODE_TYPE__PROTOCOL);

		// Create enums
		protocolTypeEEnum = createEEnum(PROTOCOL_TYPE);

		// Create data types
		addressTypeEDataType = createEDataType(ADDRESS_TYPE);
		portTypeEDataType = createEDataType(PORT_TYPE);
		protocolTypeObjectEDataType = createEDataType(PROTOCOL_TYPE_OBJECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(cdoTypeEClass, CdoType.class, "CdoType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCdoType_Address(), this.getAddressType(), "address", null, 1, 1, CdoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCdoType_Port(), this.getPortType(), "port", null, 1, 1, CdoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCdoType_Repository(), theXMLTypePackage.getString(), "repository", null, 1, 1, CdoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configurationTypeEClass, ConfigurationType.class, "ConfigurationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfigurationType_Network(), this.getNetworkType(), null, "network", null, 1, -1, ConfigurationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfigurationType_Cdo(), this.getCdoType(), null, "cdo", null, 1, -1, ConfigurationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfigurationType_LogDirectory(), theXMLTypePackage.getString(), "logDirectory", null, 0, 1, ConfigurationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Configuration(), this.getConfigurationType(), null, "configuration", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(networkTypeEClass, NetworkType.class, "NetworkType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNetworkType_Node(), this.getNodeType(), null, "node", null, 1, -1, NetworkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNetworkType_Network(), this.getNetworkType(), null, "network", null, 0, -1, NetworkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetworkType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, NetworkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetworkType_UpdateInterval(), theXMLTypePackage.getInt(), "updateInterval", null, 1, 1, NetworkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeTypeEClass, NodeType.class, "NodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNodeType_Address(), this.getAddressType(), "address", null, 1, 1, NodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeType_ElementFilter(), theXMLTypePackage.getString(), "elementFilter", null, 0, 1, NodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeType_HandlerFilter(), theXMLTypePackage.getString(), "handlerFilter", null, 0, 1, NodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeType_Port(), this.getPortType(), "port", null, 1, 1, NodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeType_Protocol(), this.getProtocolType(), "protocol", null, 1, 1, NodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(protocolTypeEEnum, ProtocolType.class, "ProtocolType");
		addEEnumLiteral(protocolTypeEEnum, ProtocolType.TCP);
		addEEnumLiteral(protocolTypeEEnum, ProtocolType.UDP);

		// Initialize data types
		initEDataType(addressTypeEDataType, String.class, "AddressType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(portTypeEDataType, BigInteger.class, "PortType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(protocolTypeObjectEDataType, ProtocolType.class, "ProtocolTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "qualified", "false"
		   });		
		addAnnotation
		  (addressTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "addressType",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "pattern", "((1?[0-9]?[0-9]|2[0-4][0-9]|25[0-5]).){3}(1?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])"
		   });		
		addAnnotation
		  (cdoTypeEClass, 
		   source, 
		   new String[] {
			 "name", "cdoType",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getCdoType_Address(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "address",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCdoType_Port(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "port",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCdoType_Repository(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "repository",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (configurationTypeEClass, 
		   source, 
		   new String[] {
			 "name", "configurationType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getConfigurationType_Network(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "network",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getConfigurationType_Cdo(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "cdo",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getConfigurationType_LogDirectory(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "logDirectory",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (documentRootEClass, 
		   source, 
		   new String[] {
			 "name", "",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xmlns:prefix"
		   });		
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xsi:schemaLocation"
		   });		
		addAnnotation
		  (getDocumentRoot_Configuration(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "configuration",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (networkTypeEClass, 
		   source, 
		   new String[] {
			 "name", "networkType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getNetworkType_Node(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "node",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getNetworkType_Network(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "network",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getNetworkType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getNetworkType_UpdateInterval(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "updateInterval",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (nodeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "nodeType",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getNodeType_Address(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "address",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getNodeType_ElementFilter(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "elementFilter",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getNodeType_HandlerFilter(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "handlerFilter",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getNodeType_Port(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "port",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getNodeType_Protocol(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "protocol",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (portTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "portType",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#integer",
			 "minInclusive", "0",
			 "maxInclusive", "65535"
		   });		
		addAnnotation
		  (protocolTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "protocolType"
		   });		
		addAnnotation
		  (protocolTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "protocolType:Object",
			 "baseType", "protocolType"
		   });
	}

} //ConfigurationPackageImpl
