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
     * The meta object id for the '{@link de.hub.clickwatch.model.impl.ModelElementWithStatisticsImpl <em>Model Element With Statistics</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hub.clickwatch.model.impl.ModelElementWithStatisticsImpl
     * @see de.hub.clickwatch.model.impl.ClickWatchModelPackageImpl#getModelElementWithStatistics()
     * @generated
     */
    int MODEL_ELEMENT_WITH_STATISTICS = 4;

    /**
     * The feature id for the '<em><b>Statistics</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_ELEMENT_WITH_STATISTICS__STATISTICS = 0;

    /**
     * The number of structural features of the '<em>Model Element With Statistics</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_ELEMENT_WITH_STATISTICS_FEATURE_COUNT = 1;

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
     * The feature id for the '<em><b>Statistics</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE__STATISTICS = MODEL_ELEMENT_WITH_STATISTICS__STATISTICS;

    /**
     * The feature id for the '<em><b>INet Address</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NODE__INET_ADDRESS = MODEL_ELEMENT_WITH_STATISTICS_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Port</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NODE__PORT = MODEL_ELEMENT_WITH_STATISTICS_FEATURE_COUNT + 1;

	/**
     * The feature id for the '<em><b>Backbone</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NODE__BACKBONE = MODEL_ELEMENT_WITH_STATISTICS_FEATURE_COUNT + 2;

	/**
     * The feature id for the '<em><b>Connection</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NODE__CONNECTION = MODEL_ELEMENT_WITH_STATISTICS_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Retrieving</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE__RETRIEVING = MODEL_ELEMENT_WITH_STATISTICS_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Listening</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE__LISTENING = MODEL_ELEMENT_WITH_STATISTICS_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Recording</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE__RECORDING = MODEL_ELEMENT_WITH_STATISTICS_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Errors</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NODE__ERRORS = MODEL_ELEMENT_WITH_STATISTICS_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Elements</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NODE__ELEMENTS = MODEL_ELEMENT_WITH_STATISTICS_FEATURE_COUNT + 8;

    /**
     * The number of structural features of the '<em>Node</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NODE_FEATURE_COUNT = MODEL_ELEMENT_WITH_STATISTICS_FEATURE_COUNT + 9;

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
     * The feature id for the '<em><b>Statistics</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NETWORK__STATISTICS = MODEL_ELEMENT_WITH_STATISTICS__STATISTICS;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NETWORK__NAME = MODEL_ELEMENT_WITH_STATISTICS_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NETWORK__NODES = MODEL_ELEMENT_WITH_STATISTICS_FEATURE_COUNT + 1;

	/**
     * The feature id for the '<em><b>Element Filter</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NETWORK__ELEMENT_FILTER = MODEL_ELEMENT_WITH_STATISTICS_FEATURE_COUNT + 2;

	/**
     * The feature id for the '<em><b>Handler Filter</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NETWORK__HANDLER_FILTER = MODEL_ELEMENT_WITH_STATISTICS_FEATURE_COUNT + 3;

	/**
     * The feature id for the '<em><b>Subnetworks</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NETWORK__SUBNETWORKS = MODEL_ELEMENT_WITH_STATISTICS_FEATURE_COUNT + 4;

	/**
     * The feature id for the '<em><b>Timestamp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NETWORK__TIMESTAMP = MODEL_ELEMENT_WITH_STATISTICS_FEATURE_COUNT + 5;

    /**
     * The number of structural features of the '<em>Network</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NETWORK_FEATURE_COUNT = MODEL_ELEMENT_WITH_STATISTICS_FEATURE_COUNT + 6;

	/**
     * The meta object id for the '{@link de.hub.clickwatch.model.impl.StatisticsContainerImpl <em>Statistics Container</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hub.clickwatch.model.impl.StatisticsContainerImpl
     * @see de.hub.clickwatch.model.impl.ClickWatchModelPackageImpl#getStatisticsContainer()
     * @generated
     */
    int STATISTICS_CONTAINER = 5;

    /**
     * The feature id for the '<em><b>Statistics</b></em>' map.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATISTICS_CONTAINER__STATISTICS = 0;

    /**
     * The number of structural features of the '<em>Statistics Container</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATISTICS_CONTAINER_FEATURE_COUNT = 1;

    /**
     * The meta object id for the '{@link de.hub.clickwatch.model.impl.EStringToStatisticMapImpl <em>EString To Statistic Map</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hub.clickwatch.model.impl.EStringToStatisticMapImpl
     * @see de.hub.clickwatch.model.impl.ClickWatchModelPackageImpl#getEStringToStatisticMap()
     * @generated
     */
    int ESTRING_TO_STATISTIC_MAP = 6;

    /**
     * The feature id for the '<em><b>Key</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ESTRING_TO_STATISTIC_MAP__KEY = 0;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ESTRING_TO_STATISTIC_MAP__VALUE = 1;

    /**
     * The number of structural features of the '<em>EString To Statistic Map</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ESTRING_TO_STATISTIC_MAP_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link de.hub.clickwatch.model.impl.StatisticImpl <em>Statistic</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hub.clickwatch.model.impl.StatisticImpl
     * @see de.hub.clickwatch.model.impl.ClickWatchModelPackageImpl#getStatistic()
     * @generated
     */
    int STATISTIC = 7;

    /**
     * The feature id for the '<em><b>Sum</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATISTIC__SUM = 0;

    /**
     * The feature id for the '<em><b>Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATISTIC__COUNT = 1;

    /**
     * The feature id for the '<em><b>Mean</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATISTIC__MEAN = 2;

    /**
     * The feature id for the '<em><b>Smallest</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATISTIC__SMALLEST = 3;

    /**
     * The feature id for the '<em><b>Largest</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATISTIC__LARGEST = 4;

    /**
     * The feature id for the '<em><b>Latest</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATISTIC__LATEST = 5;

    /**
     * The number of structural features of the '<em>Statistic</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATISTIC_FEATURE_COUNT = 6;

    /**
     * The meta object id for the '{@link de.hub.clickwatch.model.impl.ClickWatchErrorImpl <em>Click Watch Error</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hub.clickwatch.model.impl.ClickWatchErrorImpl
     * @see de.hub.clickwatch.model.impl.ClickWatchModelPackageImpl#getClickWatchError()
     * @generated
     */
    int CLICK_WATCH_ERROR = 8;

    /**
     * The feature id for the '<em><b>Message</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLICK_WATCH_ERROR__MESSAGE = 0;

    /**
     * The feature id for the '<em><b>Exception</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLICK_WATCH_ERROR__EXCEPTION = 1;

    /**
     * The number of structural features of the '<em>Click Watch Error</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLICK_WATCH_ERROR_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link de.hub.clickwatch.model.BackboneType <em>Backbone Type</em>}' enum.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.hub.clickwatch.model.BackboneType
     * @see de.hub.clickwatch.model.impl.ClickWatchModelPackageImpl#getBackboneType()
     * @generated
     */
	int BACKBONE_TYPE = 9;


	/**
     * The meta object id for the '<em>INode Connection</em>' data type.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.hub.clickwatch.connection.INodeConnection
     * @see de.hub.clickwatch.model.impl.ClickWatchModelPackageImpl#getINodeConnection()
     * @generated
     */
	int INODE_CONNECTION = 10;


	/**
     * The meta object id for the '<em>INode Connection Provider</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hub.clickwatch.connection.INodeConnectionProvider
     * @see de.hub.clickwatch.model.impl.ClickWatchModelPackageImpl#getINodeConnectionProvider()
     * @generated
     */
    int INODE_CONNECTION_PROVIDER = 11;

    /**
     * The meta object id for the '<em>IHandler Event Listener</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hub.clickwatch.connection.adapter.IHandlerEventListener
     * @see de.hub.clickwatch.model.impl.ClickWatchModelPackageImpl#getIHandlerEventListener()
     * @generated
     */
    int IHANDLER_EVENT_LISTENER = 12;

    /**
     * The meta object id for the '<em>Exception</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.Exception
     * @see de.hub.clickwatch.model.impl.ClickWatchModelPackageImpl#getException()
     * @generated
     */
    int EXCEPTION = 13;

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
     * Returns the meta object for the containment reference list '{@link de.hub.clickwatch.model.Node#getErrors <em>Errors</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Errors</em>'.
     * @see de.hub.clickwatch.model.Node#getErrors()
     * @see #getNode()
     * @generated
     */
    EReference getNode_Errors();

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
     * Returns the meta object for the attribute '{@link de.hub.clickwatch.model.Network#getTimestamp <em>Timestamp</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Timestamp</em>'.
     * @see de.hub.clickwatch.model.Network#getTimestamp()
     * @see #getNetwork()
     * @generated
     */
    EAttribute getNetwork_Timestamp();

    /**
     * Returns the meta object for class '{@link de.hub.clickwatch.model.StatisticsContainer <em>Statistics Container</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Statistics Container</em>'.
     * @see de.hub.clickwatch.model.StatisticsContainer
     * @generated
     */
    EClass getStatisticsContainer();

    /**
     * Returns the meta object for the map '{@link de.hub.clickwatch.model.StatisticsContainer#getStatistics <em>Statistics</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the map '<em>Statistics</em>'.
     * @see de.hub.clickwatch.model.StatisticsContainer#getStatistics()
     * @see #getStatisticsContainer()
     * @generated
     */
    EReference getStatisticsContainer_Statistics();

    /**
     * Returns the meta object for class '{@link java.util.Map.Entry <em>EString To Statistic Map</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>EString To Statistic Map</em>'.
     * @see java.util.Map.Entry
     * @model keyDataType="org.eclipse.emf.ecore.EString"
     *        valueType="de.hub.clickwatch.model.Statistic" valueContainment="true"
     * @generated
     */
    EClass getEStringToStatisticMap();

    /**
     * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Key</em>'.
     * @see java.util.Map.Entry
     * @see #getEStringToStatisticMap()
     * @generated
     */
    EAttribute getEStringToStatisticMap_Key();

    /**
     * Returns the meta object for the containment reference '{@link java.util.Map.Entry <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Value</em>'.
     * @see java.util.Map.Entry
     * @see #getEStringToStatisticMap()
     * @generated
     */
    EReference getEStringToStatisticMap_Value();

    /**
     * Returns the meta object for class '{@link de.hub.clickwatch.model.Statistic <em>Statistic</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Statistic</em>'.
     * @see de.hub.clickwatch.model.Statistic
     * @generated
     */
    EClass getStatistic();

    /**
     * Returns the meta object for the attribute '{@link de.hub.clickwatch.model.Statistic#getSum <em>Sum</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Sum</em>'.
     * @see de.hub.clickwatch.model.Statistic#getSum()
     * @see #getStatistic()
     * @generated
     */
    EAttribute getStatistic_Sum();

    /**
     * Returns the meta object for the attribute '{@link de.hub.clickwatch.model.Statistic#getCount <em>Count</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Count</em>'.
     * @see de.hub.clickwatch.model.Statistic#getCount()
     * @see #getStatistic()
     * @generated
     */
    EAttribute getStatistic_Count();

    /**
     * Returns the meta object for the attribute '{@link de.hub.clickwatch.model.Statistic#getMean <em>Mean</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Mean</em>'.
     * @see de.hub.clickwatch.model.Statistic#getMean()
     * @see #getStatistic()
     * @generated
     */
    EAttribute getStatistic_Mean();

    /**
     * Returns the meta object for the attribute '{@link de.hub.clickwatch.model.Statistic#getSmallest <em>Smallest</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Smallest</em>'.
     * @see de.hub.clickwatch.model.Statistic#getSmallest()
     * @see #getStatistic()
     * @generated
     */
    EAttribute getStatistic_Smallest();

    /**
     * Returns the meta object for the attribute '{@link de.hub.clickwatch.model.Statistic#getLargest <em>Largest</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Largest</em>'.
     * @see de.hub.clickwatch.model.Statistic#getLargest()
     * @see #getStatistic()
     * @generated
     */
    EAttribute getStatistic_Largest();

    /**
     * Returns the meta object for the attribute '{@link de.hub.clickwatch.model.Statistic#getLatest <em>Latest</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Latest</em>'.
     * @see de.hub.clickwatch.model.Statistic#getLatest()
     * @see #getStatistic()
     * @generated
     */
    EAttribute getStatistic_Latest();

    /**
     * Returns the meta object for class '{@link de.hub.clickwatch.model.ClickWatchError <em>Click Watch Error</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Click Watch Error</em>'.
     * @see de.hub.clickwatch.model.ClickWatchError
     * @generated
     */
    EClass getClickWatchError();

    /**
     * Returns the meta object for the attribute '{@link de.hub.clickwatch.model.ClickWatchError#getMessage <em>Message</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Message</em>'.
     * @see de.hub.clickwatch.model.ClickWatchError#getMessage()
     * @see #getClickWatchError()
     * @generated
     */
    EAttribute getClickWatchError_Message();

    /**
     * Returns the meta object for the attribute '{@link de.hub.clickwatch.model.ClickWatchError#getException <em>Exception</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Exception</em>'.
     * @see de.hub.clickwatch.model.ClickWatchError#getException()
     * @see #getClickWatchError()
     * @generated
     */
    EAttribute getClickWatchError_Exception();

    /**
     * Returns the meta object for class '{@link de.hub.clickwatch.model.ModelElementWithStatistics <em>Model Element With Statistics</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Model Element With Statistics</em>'.
     * @see de.hub.clickwatch.model.ModelElementWithStatistics
     * @generated
     */
    EClass getModelElementWithStatistics();

    /**
     * Returns the meta object for the containment reference '{@link de.hub.clickwatch.model.ModelElementWithStatistics#getStatistics <em>Statistics</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Statistics</em>'.
     * @see de.hub.clickwatch.model.ModelElementWithStatistics#getStatistics()
     * @see #getModelElementWithStatistics()
     * @generated
     */
    EReference getModelElementWithStatistics_Statistics();

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
     * Returns the meta object for data type '{@link java.lang.Exception <em>Exception</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Exception</em>'.
     * @see java.lang.Exception
     * @model instanceClass="java.lang.Exception"
     * @generated
     */
    EDataType getException();

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
         * The meta object literal for the '<em><b>Errors</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference NODE__ERRORS = eINSTANCE.getNode_Errors();

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
         * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NETWORK__TIMESTAMP = eINSTANCE.getNetwork_Timestamp();

        /**
         * The meta object literal for the '{@link de.hub.clickwatch.model.impl.StatisticsContainerImpl <em>Statistics Container</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.hub.clickwatch.model.impl.StatisticsContainerImpl
         * @see de.hub.clickwatch.model.impl.ClickWatchModelPackageImpl#getStatisticsContainer()
         * @generated
         */
        EClass STATISTICS_CONTAINER = eINSTANCE.getStatisticsContainer();

        /**
         * The meta object literal for the '<em><b>Statistics</b></em>' map feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference STATISTICS_CONTAINER__STATISTICS = eINSTANCE.getStatisticsContainer_Statistics();

        /**
         * The meta object literal for the '{@link de.hub.clickwatch.model.impl.EStringToStatisticMapImpl <em>EString To Statistic Map</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.hub.clickwatch.model.impl.EStringToStatisticMapImpl
         * @see de.hub.clickwatch.model.impl.ClickWatchModelPackageImpl#getEStringToStatisticMap()
         * @generated
         */
        EClass ESTRING_TO_STATISTIC_MAP = eINSTANCE.getEStringToStatisticMap();

        /**
         * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ESTRING_TO_STATISTIC_MAP__KEY = eINSTANCE.getEStringToStatisticMap_Key();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ESTRING_TO_STATISTIC_MAP__VALUE = eINSTANCE.getEStringToStatisticMap_Value();

        /**
         * The meta object literal for the '{@link de.hub.clickwatch.model.impl.StatisticImpl <em>Statistic</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.hub.clickwatch.model.impl.StatisticImpl
         * @see de.hub.clickwatch.model.impl.ClickWatchModelPackageImpl#getStatistic()
         * @generated
         */
        EClass STATISTIC = eINSTANCE.getStatistic();

        /**
         * The meta object literal for the '<em><b>Sum</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute STATISTIC__SUM = eINSTANCE.getStatistic_Sum();

        /**
         * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute STATISTIC__COUNT = eINSTANCE.getStatistic_Count();

        /**
         * The meta object literal for the '<em><b>Mean</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute STATISTIC__MEAN = eINSTANCE.getStatistic_Mean();

        /**
         * The meta object literal for the '<em><b>Smallest</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute STATISTIC__SMALLEST = eINSTANCE.getStatistic_Smallest();

        /**
         * The meta object literal for the '<em><b>Largest</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute STATISTIC__LARGEST = eINSTANCE.getStatistic_Largest();

        /**
         * The meta object literal for the '<em><b>Latest</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute STATISTIC__LATEST = eINSTANCE.getStatistic_Latest();

        /**
         * The meta object literal for the '{@link de.hub.clickwatch.model.impl.ClickWatchErrorImpl <em>Click Watch Error</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.hub.clickwatch.model.impl.ClickWatchErrorImpl
         * @see de.hub.clickwatch.model.impl.ClickWatchModelPackageImpl#getClickWatchError()
         * @generated
         */
        EClass CLICK_WATCH_ERROR = eINSTANCE.getClickWatchError();

        /**
         * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CLICK_WATCH_ERROR__MESSAGE = eINSTANCE.getClickWatchError_Message();

        /**
         * The meta object literal for the '<em><b>Exception</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CLICK_WATCH_ERROR__EXCEPTION = eINSTANCE.getClickWatchError_Exception();

        /**
         * The meta object literal for the '{@link de.hub.clickwatch.model.impl.ModelElementWithStatisticsImpl <em>Model Element With Statistics</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.hub.clickwatch.model.impl.ModelElementWithStatisticsImpl
         * @see de.hub.clickwatch.model.impl.ClickWatchModelPackageImpl#getModelElementWithStatistics()
         * @generated
         */
        EClass MODEL_ELEMENT_WITH_STATISTICS = eINSTANCE.getModelElementWithStatistics();

        /**
         * The meta object literal for the '<em><b>Statistics</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MODEL_ELEMENT_WITH_STATISTICS__STATISTICS = eINSTANCE.getModelElementWithStatistics_Statistics();

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
         * The meta object literal for the '<em>Exception</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.lang.Exception
         * @see de.hub.clickwatch.model.impl.ClickWatchModelPackageImpl#getException()
         * @generated
         */
        EDataType EXCEPTION = eINSTANCE.getException();

	}

} //ModelPackage
