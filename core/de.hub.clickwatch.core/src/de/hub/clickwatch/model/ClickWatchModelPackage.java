/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.model;

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
 * @see de.hub.clickwatch.model.ClickWatchModelFactory
 * @model kind="package"
 * @generated
 */
public interface ClickWatchModelPackage extends EPackage {
	/**
     * The package name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	String eNAME = "model";

	/**
     * The package namespace URI.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	String eNS_URI = "http://de.hub.clickwatch.model";

	/**
     * The package namespace name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	String eNS_PREFIX = "cwm";

	/**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	ClickWatchModelPackage eINSTANCE = de.hub.clickwatch.model.impl.ClickWatchModelPackageImpl.init();

	/**
     * The meta object id for the '{@link de.hub.clickwatch.model.impl.NodeImpl <em>Node</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.hub.clickwatch.model.impl.NodeImpl
     * @see de.hub.clickwatch.model.impl.ClickWatchModelPackageImpl#getNode()
     * @generated
     */
	int NODE = 0;

	/**
     * The feature id for the '<em><b>INet Address</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NODE__INET_ADDRESS = 0;

	/**
     * The feature id for the '<em><b>Port</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NODE__PORT = 1;

	/**
     * The feature id for the '<em><b>Elements</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NODE__ELEMENTS = 2;

	/**
     * The feature id for the '<em><b>Backbone</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NODE__BACKBONE = 3;

	/**
     * The feature id for the '<em><b>Active Listeners</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE__ACTIVE_LISTENERS = 4;

    /**
     * The feature id for the '<em><b>Changes</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE__CHANGES = 5;

    /**
     * The feature id for the '<em><b>Errors</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE__ERRORS = 6;

    /**
     * The feature id for the '<em><b>Connection</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NODE__CONNECTION = 7;

    /**
     * The feature id for the '<em><b>Retrieving</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE__RETRIEVING = 8;

    /**
     * The feature id for the '<em><b>Listening</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE__LISTENING = 9;

    /**
     * The feature id for the '<em><b>Recording</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE__RECORDING = 10;

    /**
     * The number of structural features of the '<em>Node</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NODE_FEATURE_COUNT = 11;

	/**
     * The meta object id for the '{@link de.hub.clickwatch.model.impl.ElementImpl <em>Element</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.hub.clickwatch.model.impl.ElementImpl
     * @see de.hub.clickwatch.model.impl.ClickWatchModelPackageImpl#getElement()
     * @generated
     */
	int ELEMENT = 1;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ELEMENT__NAME = 0;

	/**
     * The feature id for the '<em><b>Handlers</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ELEMENT__HANDLERS = 1;

	/**
     * The feature id for the '<em><b>Children</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ELEMENT__CHILDREN = 2;

	/**
     * The number of structural features of the '<em>Element</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ELEMENT_FEATURE_COUNT = 3;

	/**
     * The meta object id for the '{@link de.hub.clickwatch.model.impl.HandlerImpl <em>Handler</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.hub.clickwatch.model.impl.HandlerImpl
     * @see de.hub.clickwatch.model.impl.ClickWatchModelPackageImpl#getHandler()
     * @generated
     */
	int HANDLER = 2;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HANDLER__NAME = 0;

	/**
     * The feature id for the '<em><b>Can Read</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HANDLER__CAN_READ = 1;

	/**
     * The feature id for the '<em><b>Can Write</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HANDLER__CAN_WRITE = 2;

	/**
     * The feature id for the '<em><b>Changed</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HANDLER__CHANGED = 3;

	/**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HANDLER__MIXED = 4;

	/**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HANDLER__ANY = 5;

	/**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HANDLER__VALUE = 6;

	/**
     * The feature id for the '<em><b>Timestamp</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HANDLER__TIMESTAMP = 7;

	/**
     * The number of structural features of the '<em>Handler</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int HANDLER_FEATURE_COUNT = 8;

	/**
     * The meta object id for the '{@link de.hub.clickwatch.model.impl.NetworkImpl <em>Network</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.hub.clickwatch.model.impl.NetworkImpl
     * @see de.hub.clickwatch.model.impl.ClickWatchModelPackageImpl#getNetwork()
     * @generated
     */
	int NETWORK = 3;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NETWORK__NAME = 0;

	/**
     * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NETWORK__NODES = 1;

	/**
     * The feature id for the '<em><b>Element Filter</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NETWORK__ELEMENT_FILTER = 2;

	/**
     * The feature id for the '<em><b>Handler Filter</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NETWORK__HANDLER_FILTER = 3;

	/**
     * The feature id for the '<em><b>Subnetworks</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NETWORK__SUBNETWORKS = 4;

	/**
     * The number of structural features of the '<em>Network</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NETWORK_FEATURE_COUNT = 5;

	/**
     * The meta object id for the '{@link de.hub.clickwatch.model.BackboneType <em>Backbone Type</em>}' enum.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.hub.clickwatch.model.BackboneType
     * @see de.hub.clickwatch.model.impl.ClickWatchModelPackageImpl#getBackboneType()
     * @generated
     */
	int BACKBONE_TYPE = 4;


	/**
     * The meta object id for the '<em>INode Connection</em>' data type.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.hub.clickwatch.connection.INodeConnection
     * @see de.hub.clickwatch.model.impl.ClickWatchModelPackageImpl#getINodeConnection()
     * @generated
     */
	int INODE_CONNECTION = 5;


	/**
     * The meta object id for the '<em>INode Connection Provider</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hub.clickwatch.connection.INodeConnectionProvider
     * @see de.hub.clickwatch.model.impl.ClickWatchModelPackageImpl#getINodeConnectionProvider()
     * @generated
     */
    int INODE_CONNECTION_PROVIDER = 6;

    /**
     * The meta object id for the '<em>IHandler Event Listener</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hub.clickwatch.connection.adapter.IHandlerEventListener
     * @see de.hub.clickwatch.model.impl.ClickWatchModelPackageImpl#getIHandlerEventListener()
     * @generated
     */
    int IHANDLER_EVENT_LISTENER = 7;

    /**
     * The meta object id for the '<em>Change</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hub.clickwatch.model.ChangeMark
     * @see de.hub.clickwatch.model.impl.ClickWatchModelPackageImpl#getChange()
     * @generated
     */
    int CHANGE = 8;

    /**
     * The meta object id for the '<em>Error</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hub.clickwatch.model.ClickWatchError
     * @see de.hub.clickwatch.model.impl.ClickWatchModelPackageImpl#getError()
     * @generated
     */
    int ERROR = 9;


    /**
     * Returns the meta object for class '{@link de.hub.clickwatch.model.Node <em>Node</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Node</em>'.
     * @see de.hub.clickwatch.model.Node
     * @generated
     */
	EClass getNode();

	/**
     * Returns the meta object for the attribute '{@link de.hub.clickwatch.model.Node#getINetAddress <em>INet Address</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>INet Address</em>'.
     * @see de.hub.clickwatch.model.Node#getINetAddress()
     * @see #getNode()
     * @generated
     */
	EAttribute getNode_INetAddress();

	/**
     * Returns the meta object for the attribute '{@link de.hub.clickwatch.model.Node#getPort <em>Port</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Port</em>'.
     * @see de.hub.clickwatch.model.Node#getPort()
     * @see #getNode()
     * @generated
     */
	EAttribute getNode_Port();

	/**
     * Returns the meta object for the containment reference list '{@link de.hub.clickwatch.model.Node#getElements <em>Elements</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Elements</em>'.
     * @see de.hub.clickwatch.model.Node#getElements()
     * @see #getNode()
     * @generated
     */
	EReference getNode_Elements();

	/**
     * Returns the meta object for the attribute '{@link de.hub.clickwatch.model.Node#getConnection <em>Connection</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Connection</em>'.
     * @see de.hub.clickwatch.model.Node#getConnection()
     * @see #getNode()
     * @generated
     */
	EAttribute getNode_Connection();

	/**
     * Returns the meta object for the attribute '{@link de.hub.clickwatch.model.Node#isRetrieving <em>Retrieving</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Retrieving</em>'.
     * @see de.hub.clickwatch.model.Node#isRetrieving()
     * @see #getNode()
     * @generated
     */
    EAttribute getNode_Retrieving();

    /**
     * Returns the meta object for the attribute '{@link de.hub.clickwatch.model.Node#isListening <em>Listening</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Listening</em>'.
     * @see de.hub.clickwatch.model.Node#isListening()
     * @see #getNode()
     * @generated
     */
    EAttribute getNode_Listening();

    /**
     * Returns the meta object for the attribute '{@link de.hub.clickwatch.model.Node#isRecording <em>Recording</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Recording</em>'.
     * @see de.hub.clickwatch.model.Node#isRecording()
     * @see #getNode()
     * @generated
     */
    EAttribute getNode_Recording();

    /**
     * Returns the meta object for the attribute '{@link de.hub.clickwatch.model.Node#getBackbone <em>Backbone</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Backbone</em>'.
     * @see de.hub.clickwatch.model.Node#getBackbone()
     * @see #getNode()
     * @generated
     */
	EAttribute getNode_Backbone();

	/**
     * Returns the meta object for the attribute list '{@link de.hub.clickwatch.model.Node#getActiveListeners <em>Active Listeners</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Active Listeners</em>'.
     * @see de.hub.clickwatch.model.Node#getActiveListeners()
     * @see #getNode()
     * @generated
     */
    EAttribute getNode_ActiveListeners();

    /**
     * Returns the meta object for the attribute list '{@link de.hub.clickwatch.model.Node#getChanges <em>Changes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Changes</em>'.
     * @see de.hub.clickwatch.model.Node#getChanges()
     * @see #getNode()
     * @generated
     */
    EAttribute getNode_Changes();

    /**
     * Returns the meta object for the attribute list '{@link de.hub.clickwatch.model.Node#getErrors <em>Errors</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Errors</em>'.
     * @see de.hub.clickwatch.model.Node#getErrors()
     * @see #getNode()
     * @generated
     */
    EAttribute getNode_Errors();

    /**
     * Returns the meta object for class '{@link de.hub.clickwatch.model.Element <em>Element</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Element</em>'.
     * @see de.hub.clickwatch.model.Element
     * @generated
     */
	EClass getElement();

	/**
     * Returns the meta object for the attribute '{@link de.hub.clickwatch.model.Element#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see de.hub.clickwatch.model.Element#getName()
     * @see #getElement()
     * @generated
     */
	EAttribute getElement_Name();

	/**
     * Returns the meta object for the containment reference list '{@link de.hub.clickwatch.model.Element#getHandlers <em>Handlers</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Handlers</em>'.
     * @see de.hub.clickwatch.model.Element#getHandlers()
     * @see #getElement()
     * @generated
     */
	EReference getElement_Handlers();

	/**
     * Returns the meta object for the containment reference list '{@link de.hub.clickwatch.model.Element#getChildren <em>Children</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Children</em>'.
     * @see de.hub.clickwatch.model.Element#getChildren()
     * @see #getElement()
     * @generated
     */
	EReference getElement_Children();

	/**
     * Returns the meta object for class '{@link de.hub.clickwatch.model.Handler <em>Handler</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Handler</em>'.
     * @see de.hub.clickwatch.model.Handler
     * @generated
     */
	EClass getHandler();

	/**
     * Returns the meta object for the attribute '{@link de.hub.clickwatch.model.Handler#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see de.hub.clickwatch.model.Handler#getName()
     * @see #getHandler()
     * @generated
     */
	EAttribute getHandler_Name();

	/**
     * Returns the meta object for the attribute '{@link de.hub.clickwatch.model.Handler#isCanRead <em>Can Read</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Can Read</em>'.
     * @see de.hub.clickwatch.model.Handler#isCanRead()
     * @see #getHandler()
     * @generated
     */
	EAttribute getHandler_CanRead();

	/**
     * Returns the meta object for the attribute '{@link de.hub.clickwatch.model.Handler#isCanWrite <em>Can Write</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Can Write</em>'.
     * @see de.hub.clickwatch.model.Handler#isCanWrite()
     * @see #getHandler()
     * @generated
     */
	EAttribute getHandler_CanWrite();

	/**
     * Returns the meta object for the attribute '{@link de.hub.clickwatch.model.Handler#isChanged <em>Changed</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Changed</em>'.
     * @see de.hub.clickwatch.model.Handler#isChanged()
     * @see #getHandler()
     * @generated
     */
	EAttribute getHandler_Changed();

	/**
     * Returns the meta object for the attribute list '{@link de.hub.clickwatch.model.Handler#getMixed <em>Mixed</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Mixed</em>'.
     * @see de.hub.clickwatch.model.Handler#getMixed()
     * @see #getHandler()
     * @generated
     */
	EAttribute getHandler_Mixed();

	/**
     * Returns the meta object for the attribute list '{@link de.hub.clickwatch.model.Handler#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any</em>'.
     * @see de.hub.clickwatch.model.Handler#getAny()
     * @see #getHandler()
     * @generated
     */
	EAttribute getHandler_Any();

	/**
     * Returns the meta object for the attribute '{@link de.hub.clickwatch.model.Handler#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see de.hub.clickwatch.model.Handler#getValue()
     * @see #getHandler()
     * @generated
     */
	EAttribute getHandler_Value();

	/**
     * Returns the meta object for the attribute '{@link de.hub.clickwatch.model.Handler#getTimestamp <em>Timestamp</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Timestamp</em>'.
     * @see de.hub.clickwatch.model.Handler#getTimestamp()
     * @see #getHandler()
     * @generated
     */
	EAttribute getHandler_Timestamp();

	/**
     * Returns the meta object for class '{@link de.hub.clickwatch.model.Network <em>Network</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Network</em>'.
     * @see de.hub.clickwatch.model.Network
     * @generated
     */
	EClass getNetwork();

	/**
     * Returns the meta object for the attribute '{@link de.hub.clickwatch.model.Network#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see de.hub.clickwatch.model.Network#getName()
     * @see #getNetwork()
     * @generated
     */
	EAttribute getNetwork_Name();

	/**
     * Returns the meta object for the containment reference list '{@link de.hub.clickwatch.model.Network#getNodes <em>Nodes</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Nodes</em>'.
     * @see de.hub.clickwatch.model.Network#getNodes()
     * @see #getNetwork()
     * @generated
     */
	EReference getNetwork_Nodes();

	/**
     * Returns the meta object for the attribute '{@link de.hub.clickwatch.model.Network#getElementFilter <em>Element Filter</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Element Filter</em>'.
     * @see de.hub.clickwatch.model.Network#getElementFilter()
     * @see #getNetwork()
     * @generated
     */
	EAttribute getNetwork_ElementFilter();

	/**
     * Returns the meta object for the attribute '{@link de.hub.clickwatch.model.Network#getHandlerFilter <em>Handler Filter</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Handler Filter</em>'.
     * @see de.hub.clickwatch.model.Network#getHandlerFilter()
     * @see #getNetwork()
     * @generated
     */
	EAttribute getNetwork_HandlerFilter();

	/**
     * Returns the meta object for the containment reference list '{@link de.hub.clickwatch.model.Network#getSubnetworks <em>Subnetworks</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Subnetworks</em>'.
     * @see de.hub.clickwatch.model.Network#getSubnetworks()
     * @see #getNetwork()
     * @generated
     */
	EReference getNetwork_Subnetworks();

	/**
     * Returns the meta object for enum '{@link de.hub.clickwatch.model.BackboneType <em>Backbone Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Backbone Type</em>'.
     * @see de.hub.clickwatch.model.BackboneType
     * @generated
     */
	EEnum getBackboneType();

	/**
     * Returns the meta object for data type '{@link de.hub.clickwatch.connection.INodeConnection <em>INode Connection</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for data type '<em>INode Connection</em>'.
     * @see de.hub.clickwatch.connection.INodeConnection
     * @model instanceClass="de.hub.clickwatch.connection.INodeConnection" serializeable="false"
     * @generated
     */
	EDataType getINodeConnection();

	/**
     * Returns the meta object for data type '{@link de.hub.clickwatch.connection.INodeConnectionProvider <em>INode Connection Provider</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>INode Connection Provider</em>'.
     * @see de.hub.clickwatch.connection.INodeConnectionProvider
     * @model instanceClass="de.hub.clickwatch.connection.INodeConnectionProvider" serializeable="false"
     * @generated
     */
    EDataType getINodeConnectionProvider();

    /**
     * Returns the meta object for data type '{@link de.hub.clickwatch.connection.adapter.IHandlerEventListener <em>IHandler Event Listener</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>IHandler Event Listener</em>'.
     * @see de.hub.clickwatch.connection.adapter.IHandlerEventListener
     * @model instanceClass="de.hub.clickwatch.connection.adapter.IHandlerEventListener" serializeable="false"
     * @generated
     */
    EDataType getIHandlerEventListener();

    /**
     * Returns the meta object for data type '{@link de.hub.clickwatch.model.ChangeMark <em>Change</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Change</em>'.
     * @see de.hub.clickwatch.model.ChangeMark
     * @model instanceClass="de.hub.clickwatch.model.ChangeMark"
     * @generated
     */
    EDataType getChange();

    /**
     * Returns the meta object for data type '{@link de.hub.clickwatch.model.ClickWatchError <em>Error</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Error</em>'.
     * @see de.hub.clickwatch.model.ClickWatchError
     * @model instanceClass="de.hub.clickwatch.model.ClickWatchError"
     * @generated
     */
    EDataType getError();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
	ClickWatchModelFactory getClickWatchModelFactory();

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
         * The meta object literal for the '{@link de.hub.clickwatch.model.impl.NodeImpl <em>Node</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.hub.clickwatch.model.impl.NodeImpl
         * @see de.hub.clickwatch.model.impl.ClickWatchModelPackageImpl#getNode()
         * @generated
         */
		EClass NODE = eINSTANCE.getNode();

		/**
         * The meta object literal for the '<em><b>INet Address</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute NODE__INET_ADDRESS = eINSTANCE.getNode_INetAddress();

		/**
         * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute NODE__PORT = eINSTANCE.getNode_Port();

		/**
         * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference NODE__ELEMENTS = eINSTANCE.getNode_Elements();

		/**
         * The meta object literal for the '<em><b>Connection</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute NODE__CONNECTION = eINSTANCE.getNode_Connection();

		/**
         * The meta object literal for the '<em><b>Retrieving</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NODE__RETRIEVING = eINSTANCE.getNode_Retrieving();

        /**
         * The meta object literal for the '<em><b>Listening</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NODE__LISTENING = eINSTANCE.getNode_Listening();

        /**
         * The meta object literal for the '<em><b>Recording</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NODE__RECORDING = eINSTANCE.getNode_Recording();

        /**
         * The meta object literal for the '<em><b>Backbone</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute NODE__BACKBONE = eINSTANCE.getNode_Backbone();

		/**
         * The meta object literal for the '<em><b>Active Listeners</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NODE__ACTIVE_LISTENERS = eINSTANCE.getNode_ActiveListeners();

        /**
         * The meta object literal for the '<em><b>Changes</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NODE__CHANGES = eINSTANCE.getNode_Changes();

        /**
         * The meta object literal for the '<em><b>Errors</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NODE__ERRORS = eINSTANCE.getNode_Errors();

        /**
         * The meta object literal for the '{@link de.hub.clickwatch.model.impl.ElementImpl <em>Element</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.hub.clickwatch.model.impl.ElementImpl
         * @see de.hub.clickwatch.model.impl.ClickWatchModelPackageImpl#getElement()
         * @generated
         */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute ELEMENT__NAME = eINSTANCE.getElement_Name();

		/**
         * The meta object literal for the '<em><b>Handlers</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference ELEMENT__HANDLERS = eINSTANCE.getElement_Handlers();

		/**
         * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference ELEMENT__CHILDREN = eINSTANCE.getElement_Children();

		/**
         * The meta object literal for the '{@link de.hub.clickwatch.model.impl.HandlerImpl <em>Handler</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.hub.clickwatch.model.impl.HandlerImpl
         * @see de.hub.clickwatch.model.impl.ClickWatchModelPackageImpl#getHandler()
         * @generated
         */
		EClass HANDLER = eINSTANCE.getHandler();

		/**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute HANDLER__NAME = eINSTANCE.getHandler_Name();

		/**
         * The meta object literal for the '<em><b>Can Read</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute HANDLER__CAN_READ = eINSTANCE.getHandler_CanRead();

		/**
         * The meta object literal for the '<em><b>Can Write</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute HANDLER__CAN_WRITE = eINSTANCE.getHandler_CanWrite();

		/**
         * The meta object literal for the '<em><b>Changed</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute HANDLER__CHANGED = eINSTANCE.getHandler_Changed();

		/**
         * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute HANDLER__MIXED = eINSTANCE.getHandler_Mixed();

		/**
         * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute HANDLER__ANY = eINSTANCE.getHandler_Any();

		/**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute HANDLER__VALUE = eINSTANCE.getHandler_Value();

		/**
         * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute HANDLER__TIMESTAMP = eINSTANCE.getHandler_Timestamp();

		/**
         * The meta object literal for the '{@link de.hub.clickwatch.model.impl.NetworkImpl <em>Network</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.hub.clickwatch.model.impl.NetworkImpl
         * @see de.hub.clickwatch.model.impl.ClickWatchModelPackageImpl#getNetwork()
         * @generated
         */
		EClass NETWORK = eINSTANCE.getNetwork();

		/**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute NETWORK__NAME = eINSTANCE.getNetwork_Name();

		/**
         * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference NETWORK__NODES = eINSTANCE.getNetwork_Nodes();

		/**
         * The meta object literal for the '<em><b>Element Filter</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute NETWORK__ELEMENT_FILTER = eINSTANCE.getNetwork_ElementFilter();

		/**
         * The meta object literal for the '<em><b>Handler Filter</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute NETWORK__HANDLER_FILTER = eINSTANCE.getNetwork_HandlerFilter();

		/**
         * The meta object literal for the '<em><b>Subnetworks</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference NETWORK__SUBNETWORKS = eINSTANCE.getNetwork_Subnetworks();

		/**
         * The meta object literal for the '{@link de.hub.clickwatch.model.BackboneType <em>Backbone Type</em>}' enum.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.hub.clickwatch.model.BackboneType
         * @see de.hub.clickwatch.model.impl.ClickWatchModelPackageImpl#getBackboneType()
         * @generated
         */
		EEnum BACKBONE_TYPE = eINSTANCE.getBackboneType();

		/**
         * The meta object literal for the '<em>INode Connection</em>' data type.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.hub.clickwatch.connection.INodeConnection
         * @see de.hub.clickwatch.model.impl.ClickWatchModelPackageImpl#getINodeConnection()
         * @generated
         */
		EDataType INODE_CONNECTION = eINSTANCE.getINodeConnection();

        /**
         * The meta object literal for the '<em>INode Connection Provider</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.hub.clickwatch.connection.INodeConnectionProvider
         * @see de.hub.clickwatch.model.impl.ClickWatchModelPackageImpl#getINodeConnectionProvider()
         * @generated
         */
        EDataType INODE_CONNECTION_PROVIDER = eINSTANCE.getINodeConnectionProvider();

        /**
         * The meta object literal for the '<em>IHandler Event Listener</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.hub.clickwatch.connection.adapter.IHandlerEventListener
         * @see de.hub.clickwatch.model.impl.ClickWatchModelPackageImpl#getIHandlerEventListener()
         * @generated
         */
        EDataType IHANDLER_EVENT_LISTENER = eINSTANCE.getIHandlerEventListener();

        /**
         * The meta object literal for the '<em>Change</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.hub.clickwatch.model.ChangeMark
         * @see de.hub.clickwatch.model.impl.ClickWatchModelPackageImpl#getChange()
         * @generated
         */
        EDataType CHANGE = eINSTANCE.getChange();

        /**
         * The meta object literal for the '<em>Error</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.hub.clickwatch.model.ClickWatchError
         * @see de.hub.clickwatch.model.impl.ClickWatchModelPackageImpl#getError()
         * @generated
         */
        EDataType ERROR = eINSTANCE.getError();

	}

} //ModelPackage
