/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.datamodel;

import de.hub.clickwatch.model.ClickWatchModelPackage;
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
 * @see de.hub.clickwatch.datamodel.ClickWatchDataModelFactory
 * @model kind="package"
 * @generated
 */
public interface ClickWatchDataModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "datamodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://de.hub.clickwatch.datamodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cwdm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ClickWatchDataModelPackage eINSTANCE = de.hub.clickwatch.datamodel.impl.ClickWatchDataModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.datamodel.impl.ModelElementWithStatisticsImpl <em>Model Element With Statistics</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.datamodel.impl.ModelElementWithStatisticsImpl
	 * @see de.hub.clickwatch.datamodel.impl.ClickWatchDataModelPackageImpl#getModelElementWithStatistics()
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
	 * The meta object id for the '{@link de.hub.clickwatch.datamodel.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.datamodel.impl.NodeImpl
	 * @see de.hub.clickwatch.datamodel.impl.ClickWatchDataModelPackageImpl#getNode()
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
	 * The meta object id for the '{@link de.hub.clickwatch.datamodel.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.datamodel.impl.ElementImpl
	 * @see de.hub.clickwatch.datamodel.impl.ClickWatchDataModelPackageImpl#getElement()
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
	 * The meta object id for the '{@link de.hub.clickwatch.datamodel.impl.HandlerImpl <em>Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.datamodel.impl.HandlerImpl
	 * @see de.hub.clickwatch.datamodel.impl.ClickWatchDataModelPackageImpl#getHandler()
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
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLER__VALUES = 4;

	/**
	 * The number of structural features of the '<em>Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLER_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.datamodel.impl.NetworkImpl <em>Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.datamodel.impl.NetworkImpl
	 * @see de.hub.clickwatch.datamodel.impl.ClickWatchDataModelPackageImpl#getNetwork()
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
	 * The meta object id for the '{@link de.hub.clickwatch.datamodel.impl.StatisticsContainerImpl <em>Statistics Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.datamodel.impl.StatisticsContainerImpl
	 * @see de.hub.clickwatch.datamodel.impl.ClickWatchDataModelPackageImpl#getStatisticsContainer()
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
	 * The meta object id for the '{@link de.hub.clickwatch.datamodel.impl.EStringToStatisticMapImpl <em>EString To Statistic Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.datamodel.impl.EStringToStatisticMapImpl
	 * @see de.hub.clickwatch.datamodel.impl.ClickWatchDataModelPackageImpl#getEStringToStatisticMap()
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
	 * The meta object id for the '{@link de.hub.clickwatch.datamodel.impl.StatisticImpl <em>Statistic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.datamodel.impl.StatisticImpl
	 * @see de.hub.clickwatch.datamodel.impl.ClickWatchDataModelPackageImpl#getStatistic()
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
	 * The meta object id for the '{@link de.hub.clickwatch.datamodel.impl.ClickWatchErrorImpl <em>Click Watch Error</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.datamodel.impl.ClickWatchErrorImpl
	 * @see de.hub.clickwatch.datamodel.impl.ClickWatchDataModelPackageImpl#getClickWatchError()
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
	 * The meta object id for the '{@link de.hub.clickwatch.datamodel.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.datamodel.impl.ValueImpl
	 * @see de.hub.clickwatch.datamodel.impl.ClickWatchDataModelPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__NAME = ClickWatchModelPackage.HANDLER__NAME;

	/**
	 * The feature id for the '<em><b>Can Read</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__CAN_READ = ClickWatchModelPackage.HANDLER__CAN_READ;

	/**
	 * The feature id for the '<em><b>Can Write</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__CAN_WRITE = ClickWatchModelPackage.HANDLER__CAN_WRITE;

	/**
	 * The feature id for the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__CHANGED = ClickWatchModelPackage.HANDLER__CHANGED;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__MIXED = ClickWatchModelPackage.HANDLER__MIXED;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__ANY = ClickWatchModelPackage.HANDLER__ANY;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__VALUE = ClickWatchModelPackage.HANDLER__VALUE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__TIMESTAMP = ClickWatchModelPackage.HANDLER__TIMESTAMP;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = ClickWatchModelPackage.HANDLER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.datamodel.BackboneType <em>Backbone Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.datamodel.BackboneType
	 * @see de.hub.clickwatch.datamodel.impl.ClickWatchDataModelPackageImpl#getBackboneType()
	 * @generated
	 */
	int BACKBONE_TYPE = 10;

	/**
	 * The meta object id for the '<em>INode Connection</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.connection.INodeConnection
	 * @see de.hub.clickwatch.datamodel.impl.ClickWatchDataModelPackageImpl#getINodeConnection()
	 * @generated
	 */
	int INODE_CONNECTION = 11;

	/**
	 * The meta object id for the '<em>INode Connection Provider</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.connection.INodeConnectionProvider
	 * @see de.hub.clickwatch.datamodel.impl.ClickWatchDataModelPackageImpl#getINodeConnectionProvider()
	 * @generated
	 */
	int INODE_CONNECTION_PROVIDER = 12;

	/**
	 * The meta object id for the '<em>IHandler Event Listener</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.connection.adapter.IHandlerEventListener
	 * @see de.hub.clickwatch.datamodel.impl.ClickWatchDataModelPackageImpl#getIHandlerEventListener()
	 * @generated
	 */
	int IHANDLER_EVENT_LISTENER = 13;

	/**
	 * The meta object id for the '<em>Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Exception
	 * @see de.hub.clickwatch.datamodel.impl.ClickWatchDataModelPackageImpl#getException()
	 * @generated
	 */
	int EXCEPTION = 14;


	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.datamodel.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see de.hub.clickwatch.datamodel.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.datamodel.Node#getINetAddress <em>INet Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>INet Address</em>'.
	 * @see de.hub.clickwatch.datamodel.Node#getINetAddress()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_INetAddress();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.datamodel.Node#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see de.hub.clickwatch.datamodel.Node#getPort()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Port();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.datamodel.Node#getBackbone <em>Backbone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Backbone</em>'.
	 * @see de.hub.clickwatch.datamodel.Node#getBackbone()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Backbone();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.datamodel.Node#getConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connection</em>'.
	 * @see de.hub.clickwatch.datamodel.Node#getConnection()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Connection();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.datamodel.Node#isRetrieving <em>Retrieving</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Retrieving</em>'.
	 * @see de.hub.clickwatch.datamodel.Node#isRetrieving()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Retrieving();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.datamodel.Node#isListening <em>Listening</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Listening</em>'.
	 * @see de.hub.clickwatch.datamodel.Node#isListening()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Listening();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.datamodel.Node#isRecording <em>Recording</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recording</em>'.
	 * @see de.hub.clickwatch.datamodel.Node#isRecording()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Recording();

	/**
	 * Returns the meta object for the containment reference list '{@link de.hub.clickwatch.datamodel.Node#getErrors <em>Errors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Errors</em>'.
	 * @see de.hub.clickwatch.datamodel.Node#getErrors()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Errors();

	/**
	 * Returns the meta object for the containment reference list '{@link de.hub.clickwatch.datamodel.Node#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see de.hub.clickwatch.datamodel.Node#getElements()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Elements();

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.datamodel.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see de.hub.clickwatch.datamodel.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.datamodel.Element#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.hub.clickwatch.datamodel.Element#getName()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link de.hub.clickwatch.datamodel.Element#getHandlers <em>Handlers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Handlers</em>'.
	 * @see de.hub.clickwatch.datamodel.Element#getHandlers()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Handlers();

	/**
	 * Returns the meta object for the containment reference list '{@link de.hub.clickwatch.datamodel.Element#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see de.hub.clickwatch.datamodel.Element#getChildren()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Children();

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.datamodel.Handler <em>Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Handler</em>'.
	 * @see de.hub.clickwatch.datamodel.Handler
	 * @generated
	 */
	EClass getHandler();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.datamodel.Handler#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.hub.clickwatch.datamodel.Handler#getName()
	 * @see #getHandler()
	 * @generated
	 */
	EAttribute getHandler_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.datamodel.Handler#isCanRead <em>Can Read</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Can Read</em>'.
	 * @see de.hub.clickwatch.datamodel.Handler#isCanRead()
	 * @see #getHandler()
	 * @generated
	 */
	EAttribute getHandler_CanRead();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.datamodel.Handler#isCanWrite <em>Can Write</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Can Write</em>'.
	 * @see de.hub.clickwatch.datamodel.Handler#isCanWrite()
	 * @see #getHandler()
	 * @generated
	 */
	EAttribute getHandler_CanWrite();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.datamodel.Handler#isChanged <em>Changed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Changed</em>'.
	 * @see de.hub.clickwatch.datamodel.Handler#isChanged()
	 * @see #getHandler()
	 * @generated
	 */
	EAttribute getHandler_Changed();

	/**
	 * Returns the meta object for the containment reference list '{@link de.hub.clickwatch.datamodel.Handler#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see de.hub.clickwatch.datamodel.Handler#getValues()
	 * @see #getHandler()
	 * @generated
	 */
	EReference getHandler_Values();

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.datamodel.Network <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network</em>'.
	 * @see de.hub.clickwatch.datamodel.Network
	 * @generated
	 */
	EClass getNetwork();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.datamodel.Network#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.hub.clickwatch.datamodel.Network#getName()
	 * @see #getNetwork()
	 * @generated
	 */
	EAttribute getNetwork_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link de.hub.clickwatch.datamodel.Network#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see de.hub.clickwatch.datamodel.Network#getNodes()
	 * @see #getNetwork()
	 * @generated
	 */
	EReference getNetwork_Nodes();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.datamodel.Network#getElementFilter <em>Element Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element Filter</em>'.
	 * @see de.hub.clickwatch.datamodel.Network#getElementFilter()
	 * @see #getNetwork()
	 * @generated
	 */
	EAttribute getNetwork_ElementFilter();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.datamodel.Network#getHandlerFilter <em>Handler Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Handler Filter</em>'.
	 * @see de.hub.clickwatch.datamodel.Network#getHandlerFilter()
	 * @see #getNetwork()
	 * @generated
	 */
	EAttribute getNetwork_HandlerFilter();

	/**
	 * Returns the meta object for the containment reference list '{@link de.hub.clickwatch.datamodel.Network#getSubnetworks <em>Subnetworks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subnetworks</em>'.
	 * @see de.hub.clickwatch.datamodel.Network#getSubnetworks()
	 * @see #getNetwork()
	 * @generated
	 */
	EReference getNetwork_Subnetworks();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.datamodel.Network#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see de.hub.clickwatch.datamodel.Network#getTimestamp()
	 * @see #getNetwork()
	 * @generated
	 */
	EAttribute getNetwork_Timestamp();

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.datamodel.ModelElementWithStatistics <em>Model Element With Statistics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Element With Statistics</em>'.
	 * @see de.hub.clickwatch.datamodel.ModelElementWithStatistics
	 * @generated
	 */
	EClass getModelElementWithStatistics();

	/**
	 * Returns the meta object for the containment reference '{@link de.hub.clickwatch.datamodel.ModelElementWithStatistics#getStatistics <em>Statistics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Statistics</em>'.
	 * @see de.hub.clickwatch.datamodel.ModelElementWithStatistics#getStatistics()
	 * @see #getModelElementWithStatistics()
	 * @generated
	 */
	EReference getModelElementWithStatistics_Statistics();

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.datamodel.StatisticsContainer <em>Statistics Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statistics Container</em>'.
	 * @see de.hub.clickwatch.datamodel.StatisticsContainer
	 * @generated
	 */
	EClass getStatisticsContainer();

	/**
	 * Returns the meta object for the map '{@link de.hub.clickwatch.datamodel.StatisticsContainer#getStatistics <em>Statistics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Statistics</em>'.
	 * @see de.hub.clickwatch.datamodel.StatisticsContainer#getStatistics()
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
	 *        valueType="de.hub.clickwatch.datamodel.Statistic" valueContainment="true"
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
	 * Returns the meta object for class '{@link de.hub.clickwatch.datamodel.Statistic <em>Statistic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statistic</em>'.
	 * @see de.hub.clickwatch.datamodel.Statistic
	 * @generated
	 */
	EClass getStatistic();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.datamodel.Statistic#getSum <em>Sum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sum</em>'.
	 * @see de.hub.clickwatch.datamodel.Statistic#getSum()
	 * @see #getStatistic()
	 * @generated
	 */
	EAttribute getStatistic_Sum();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.datamodel.Statistic#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see de.hub.clickwatch.datamodel.Statistic#getCount()
	 * @see #getStatistic()
	 * @generated
	 */
	EAttribute getStatistic_Count();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.datamodel.Statistic#getMean <em>Mean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mean</em>'.
	 * @see de.hub.clickwatch.datamodel.Statistic#getMean()
	 * @see #getStatistic()
	 * @generated
	 */
	EAttribute getStatistic_Mean();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.datamodel.Statistic#getSmallest <em>Smallest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Smallest</em>'.
	 * @see de.hub.clickwatch.datamodel.Statistic#getSmallest()
	 * @see #getStatistic()
	 * @generated
	 */
	EAttribute getStatistic_Smallest();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.datamodel.Statistic#getLargest <em>Largest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Largest</em>'.
	 * @see de.hub.clickwatch.datamodel.Statistic#getLargest()
	 * @see #getStatistic()
	 * @generated
	 */
	EAttribute getStatistic_Largest();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.datamodel.Statistic#getLatest <em>Latest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latest</em>'.
	 * @see de.hub.clickwatch.datamodel.Statistic#getLatest()
	 * @see #getStatistic()
	 * @generated
	 */
	EAttribute getStatistic_Latest();

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.datamodel.ClickWatchError <em>Click Watch Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Click Watch Error</em>'.
	 * @see de.hub.clickwatch.datamodel.ClickWatchError
	 * @generated
	 */
	EClass getClickWatchError();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.datamodel.ClickWatchError#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see de.hub.clickwatch.datamodel.ClickWatchError#getMessage()
	 * @see #getClickWatchError()
	 * @generated
	 */
	EAttribute getClickWatchError_Message();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.datamodel.ClickWatchError#getException <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exception</em>'.
	 * @see de.hub.clickwatch.datamodel.ClickWatchError#getException()
	 * @see #getClickWatchError()
	 * @generated
	 */
	EAttribute getClickWatchError_Exception();

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.datamodel.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see de.hub.clickwatch.datamodel.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for enum '{@link de.hub.clickwatch.datamodel.BackboneType <em>Backbone Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Backbone Type</em>'.
	 * @see de.hub.clickwatch.datamodel.BackboneType
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
	ClickWatchDataModelFactory getClickWatchDataModelFactory();

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
		 * The meta object literal for the '{@link de.hub.clickwatch.datamodel.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.datamodel.impl.NodeImpl
		 * @see de.hub.clickwatch.datamodel.impl.ClickWatchDataModelPackageImpl#getNode()
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
		 * The meta object literal for the '<em><b>Backbone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__BACKBONE = eINSTANCE.getNode_Backbone();

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
		 * The meta object literal for the '<em><b>Errors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__ERRORS = eINSTANCE.getNode_Errors();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__ELEMENTS = eINSTANCE.getNode_Elements();

		/**
		 * The meta object literal for the '{@link de.hub.clickwatch.datamodel.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.datamodel.impl.ElementImpl
		 * @see de.hub.clickwatch.datamodel.impl.ClickWatchDataModelPackageImpl#getElement()
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
		 * The meta object literal for the '{@link de.hub.clickwatch.datamodel.impl.HandlerImpl <em>Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.datamodel.impl.HandlerImpl
		 * @see de.hub.clickwatch.datamodel.impl.ClickWatchDataModelPackageImpl#getHandler()
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
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HANDLER__VALUES = eINSTANCE.getHandler_Values();

		/**
		 * The meta object literal for the '{@link de.hub.clickwatch.datamodel.impl.NetworkImpl <em>Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.datamodel.impl.NetworkImpl
		 * @see de.hub.clickwatch.datamodel.impl.ClickWatchDataModelPackageImpl#getNetwork()
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
		 * The meta object literal for the '{@link de.hub.clickwatch.datamodel.impl.ModelElementWithStatisticsImpl <em>Model Element With Statistics</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.datamodel.impl.ModelElementWithStatisticsImpl
		 * @see de.hub.clickwatch.datamodel.impl.ClickWatchDataModelPackageImpl#getModelElementWithStatistics()
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
		 * The meta object literal for the '{@link de.hub.clickwatch.datamodel.impl.StatisticsContainerImpl <em>Statistics Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.datamodel.impl.StatisticsContainerImpl
		 * @see de.hub.clickwatch.datamodel.impl.ClickWatchDataModelPackageImpl#getStatisticsContainer()
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
		 * The meta object literal for the '{@link de.hub.clickwatch.datamodel.impl.EStringToStatisticMapImpl <em>EString To Statistic Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.datamodel.impl.EStringToStatisticMapImpl
		 * @see de.hub.clickwatch.datamodel.impl.ClickWatchDataModelPackageImpl#getEStringToStatisticMap()
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
		 * The meta object literal for the '{@link de.hub.clickwatch.datamodel.impl.StatisticImpl <em>Statistic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.datamodel.impl.StatisticImpl
		 * @see de.hub.clickwatch.datamodel.impl.ClickWatchDataModelPackageImpl#getStatistic()
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
		 * The meta object literal for the '{@link de.hub.clickwatch.datamodel.impl.ClickWatchErrorImpl <em>Click Watch Error</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.datamodel.impl.ClickWatchErrorImpl
		 * @see de.hub.clickwatch.datamodel.impl.ClickWatchDataModelPackageImpl#getClickWatchError()
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
		 * The meta object literal for the '{@link de.hub.clickwatch.datamodel.impl.ValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.datamodel.impl.ValueImpl
		 * @see de.hub.clickwatch.datamodel.impl.ClickWatchDataModelPackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

		/**
		 * The meta object literal for the '{@link de.hub.clickwatch.datamodel.BackboneType <em>Backbone Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.datamodel.BackboneType
		 * @see de.hub.clickwatch.datamodel.impl.ClickWatchDataModelPackageImpl#getBackboneType()
		 * @generated
		 */
		EEnum BACKBONE_TYPE = eINSTANCE.getBackboneType();

		/**
		 * The meta object literal for the '<em>INode Connection</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.connection.INodeConnection
		 * @see de.hub.clickwatch.datamodel.impl.ClickWatchDataModelPackageImpl#getINodeConnection()
		 * @generated
		 */
		EDataType INODE_CONNECTION = eINSTANCE.getINodeConnection();

		/**
		 * The meta object literal for the '<em>INode Connection Provider</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.connection.INodeConnectionProvider
		 * @see de.hub.clickwatch.datamodel.impl.ClickWatchDataModelPackageImpl#getINodeConnectionProvider()
		 * @generated
		 */
		EDataType INODE_CONNECTION_PROVIDER = eINSTANCE.getINodeConnectionProvider();

		/**
		 * The meta object literal for the '<em>IHandler Event Listener</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.connection.adapter.IHandlerEventListener
		 * @see de.hub.clickwatch.datamodel.impl.ClickWatchDataModelPackageImpl#getIHandlerEventListener()
		 * @generated
		 */
		EDataType IHANDLER_EVENT_LISTENER = eINSTANCE.getIHandlerEventListener();

		/**
		 * The meta object literal for the '<em>Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Exception
		 * @see de.hub.clickwatch.datamodel.impl.ClickWatchDataModelPackageImpl#getException()
		 * @generated
		 */
		EDataType EXCEPTION = eINSTANCE.getException();

	}

} //ClickWatchDataModelPackage
