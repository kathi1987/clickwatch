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

import de.hub.clickwatch.xml.ConfigurationFactory;
import de.hub.clickwatch.xml.ConfigurationPackage;
import de.hub.clickwatch.xml.DatabaseType;
import de.hub.clickwatch.xml.DocumentRoot;
import de.hub.clickwatch.xml.ExperimentListType;
import de.hub.clickwatch.xml.ExperimentType;
import de.hub.clickwatch.xml.HandlerListType;
import de.hub.clickwatch.xml.HandlerType;
import de.hub.clickwatch.xml.NetworkType;
import de.hub.clickwatch.xml.NodeListType;
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
	private EClass databaseTypeEClass = null;

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
	private EClass experimentListTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass experimentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass handlerListTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass handlerTypeEClass = null;

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
	private EClass nodeListTypeEClass = null;

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
	public EClass getDatabaseType() {
		return databaseTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabaseType_Address() {
		return (EAttribute)databaseTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabaseType_Database() {
		return (EAttribute)databaseTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabaseType_Password() {
		return (EAttribute)databaseTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabaseType_Port() {
		return (EAttribute)databaseTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabaseType_User() {
		return (EAttribute)databaseTypeEClass.getEStructuralFeatures().get(4);
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
	public EReference getDocumentRoot_Experiments() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExperimentListType() {
		return experimentListTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExperimentListType_Experiment() {
		return (EReference)experimentListTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExperimentType() {
		return experimentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExperimentType_Nodes() {
		return (EReference)experimentTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExperimentType_Handlers() {
		return (EReference)experimentTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExperimentType_Database() {
		return (EReference)experimentTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExperimentType_LogDirectory() {
		return (EAttribute)experimentTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExperimentType_Name() {
		return (EAttribute)experimentTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExperimentType_Start() {
		return (EAttribute)experimentTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExperimentType_Stop() {
		return (EAttribute)experimentTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHandlerListType() {
		return handlerListTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHandlerListType_Handler() {
		return (EReference)handlerListTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHandlerType() {
		return handlerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHandlerType_Element() {
		return (EAttribute)handlerTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHandlerType_Rate() {
		return (EAttribute)handlerTypeEClass.getEStructuralFeatures().get(1);
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
	public EClass getNodeListType() {
		return nodeListTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeListType_Node() {
		return (EReference)nodeListTypeEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getNodeType_Port() {
		return (EAttribute)nodeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeType_Protocol() {
		return (EAttribute)nodeTypeEClass.getEStructuralFeatures().get(2);
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
		databaseTypeEClass = createEClass(DATABASE_TYPE);
		createEAttribute(databaseTypeEClass, DATABASE_TYPE__ADDRESS);
		createEAttribute(databaseTypeEClass, DATABASE_TYPE__DATABASE);
		createEAttribute(databaseTypeEClass, DATABASE_TYPE__PASSWORD);
		createEAttribute(databaseTypeEClass, DATABASE_TYPE__PORT);
		createEAttribute(databaseTypeEClass, DATABASE_TYPE__USER);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__EXPERIMENTS);

		experimentListTypeEClass = createEClass(EXPERIMENT_LIST_TYPE);
		createEReference(experimentListTypeEClass, EXPERIMENT_LIST_TYPE__EXPERIMENT);

		experimentTypeEClass = createEClass(EXPERIMENT_TYPE);
		createEReference(experimentTypeEClass, EXPERIMENT_TYPE__NODES);
		createEReference(experimentTypeEClass, EXPERIMENT_TYPE__HANDLERS);
		createEReference(experimentTypeEClass, EXPERIMENT_TYPE__DATABASE);
		createEAttribute(experimentTypeEClass, EXPERIMENT_TYPE__LOG_DIRECTORY);
		createEAttribute(experimentTypeEClass, EXPERIMENT_TYPE__NAME);
		createEAttribute(experimentTypeEClass, EXPERIMENT_TYPE__START);
		createEAttribute(experimentTypeEClass, EXPERIMENT_TYPE__STOP);

		handlerListTypeEClass = createEClass(HANDLER_LIST_TYPE);
		createEReference(handlerListTypeEClass, HANDLER_LIST_TYPE__HANDLER);

		handlerTypeEClass = createEClass(HANDLER_TYPE);
		createEAttribute(handlerTypeEClass, HANDLER_TYPE__ELEMENT);
		createEAttribute(handlerTypeEClass, HANDLER_TYPE__RATE);

		networkTypeEClass = createEClass(NETWORK_TYPE);
		createEReference(networkTypeEClass, NETWORK_TYPE__NODE);
		createEReference(networkTypeEClass, NETWORK_TYPE__NETWORK);
		createEAttribute(networkTypeEClass, NETWORK_TYPE__NAME);
		createEAttribute(networkTypeEClass, NETWORK_TYPE__UPDATE_INTERVAL);

		nodeListTypeEClass = createEClass(NODE_LIST_TYPE);
		createEReference(nodeListTypeEClass, NODE_LIST_TYPE__NODE);

		nodeTypeEClass = createEClass(NODE_TYPE);
		createEAttribute(nodeTypeEClass, NODE_TYPE__ADDRESS);
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
		initEClass(databaseTypeEClass, DatabaseType.class, "DatabaseType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDatabaseType_Address(), this.getAddressType(), "address", null, 1, 1, DatabaseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabaseType_Database(), theXMLTypePackage.getString(), "database", null, 1, 1, DatabaseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabaseType_Password(), theXMLTypePackage.getString(), "password", null, 1, 1, DatabaseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabaseType_Port(), this.getPortType(), "port", null, 1, 1, DatabaseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabaseType_User(), theXMLTypePackage.getString(), "user", null, 1, 1, DatabaseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Experiments(), this.getExperimentListType(), null, "experiments", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(experimentListTypeEClass, ExperimentListType.class, "ExperimentListType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExperimentListType_Experiment(), this.getExperimentType(), null, "experiment", null, 1, -1, ExperimentListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(experimentTypeEClass, ExperimentType.class, "ExperimentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExperimentType_Nodes(), this.getNodeListType(), null, "nodes", null, 1, -1, ExperimentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExperimentType_Handlers(), this.getHandlerListType(), null, "handlers", null, 1, -1, ExperimentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExperimentType_Database(), this.getDatabaseType(), null, "database", null, 1, -1, ExperimentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExperimentType_LogDirectory(), theXMLTypePackage.getString(), "logDirectory", null, 1, 1, ExperimentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExperimentType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, ExperimentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExperimentType_Start(), theXMLTypePackage.getString(), "start", null, 1, 1, ExperimentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExperimentType_Stop(), theXMLTypePackage.getString(), "stop", null, 1, 1, ExperimentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(handlerListTypeEClass, HandlerListType.class, "HandlerListType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHandlerListType_Handler(), this.getHandlerType(), null, "handler", null, 1, -1, HandlerListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(handlerTypeEClass, HandlerType.class, "HandlerType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHandlerType_Element(), theXMLTypePackage.getString(), "element", null, 1, 1, HandlerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHandlerType_Rate(), theXMLTypePackage.getString(), "rate", null, 1, 1, HandlerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(networkTypeEClass, NetworkType.class, "NetworkType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNetworkType_Node(), this.getNodeType(), null, "node", null, 1, -1, NetworkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNetworkType_Network(), this.getNetworkType(), null, "network", null, 0, -1, NetworkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetworkType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, NetworkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetworkType_UpdateInterval(), theXMLTypePackage.getInt(), "updateInterval", null, 1, 1, NetworkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeListTypeEClass, NodeListType.class, "NodeListType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNodeListType_Node(), this.getNodeType(), null, "node", null, 1, -1, NodeListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeTypeEClass, NodeType.class, "NodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNodeType_Address(), this.getAddressType(), "address", null, 1, 1, NodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
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
		  (databaseTypeEClass, 
		   source, 
		   new String[] {
			 "name", "databaseType",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getDatabaseType_Address(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "address",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDatabaseType_Database(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "database",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDatabaseType_Password(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "password",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDatabaseType_Port(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "port",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDatabaseType_User(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "user",
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
		  (getDocumentRoot_Experiments(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "experiments",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (experimentListTypeEClass, 
		   source, 
		   new String[] {
			 "name", "experimentListType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getExperimentListType_Experiment(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "experiment",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (experimentTypeEClass, 
		   source, 
		   new String[] {
			 "name", "experimentType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getExperimentType_Nodes(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "nodes",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getExperimentType_Handlers(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "handlers",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getExperimentType_Database(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "database",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getExperimentType_LogDirectory(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "logDirectory",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getExperimentType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getExperimentType_Start(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "start",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getExperimentType_Stop(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "stop",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (handlerListTypeEClass, 
		   source, 
		   new String[] {
			 "name", "handlerListType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getHandlerListType_Handler(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "handler",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (handlerTypeEClass, 
		   source, 
		   new String[] {
			 "name", "handlerType",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getHandlerType_Element(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "element",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getHandlerType_Rate(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "rate",
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
		  (nodeListTypeEClass, 
		   source, 
		   new String[] {
			 "name", "nodeListType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getNodeListType_Node(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "node",
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
