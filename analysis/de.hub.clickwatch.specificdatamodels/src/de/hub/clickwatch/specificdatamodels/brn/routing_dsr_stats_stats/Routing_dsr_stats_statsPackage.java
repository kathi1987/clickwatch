/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificdatamodels.brn.routing_dsr_stats_stats;

import de.hub.clickwatch.datamodel.ClickWatchDataModelPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see de.hub.clickwatch.specificdatamodels.brn.routing_dsr_stats_stats.Routing_dsr_stats_statsFactory
 * @model kind="package"
 *        annotation="http://de.hub.clickwatch.specificmodels handler_class='Stats' handler_name='routing/dsr_stats/stats'"
 * @generated
 */
public interface Routing_dsr_stats_statsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "routing_dsr_stats_stats";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://de.hub.clickwatch.specificmodels.brn/routing/dsr_stats/stats";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "routing_dsr_stats_stats";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Routing_dsr_stats_statsPackage eINSTANCE = de.hub.clickwatch.specificdatamodels.brn.routing_dsr_stats_stats.impl.Routing_dsr_stats_statsPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.specificdatamodels.brn.routing_dsr_stats_stats.impl.Dsr_route_statsImpl <em>Dsr route stats</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.specificdatamodels.brn.routing_dsr_stats_stats.impl.Dsr_route_statsImpl
	 * @see de.hub.clickwatch.specificdatamodels.brn.routing_dsr_stats_stats.impl.Routing_dsr_stats_statsPackageImpl#getDsr_route_stats()
	 * @generated
	 */
	int DSR_ROUTE_STATS = 0;

	/**
	 * The feature id for the '<em><b>EContainer dsr route stats</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSR_ROUTE_STATS__ECONTAINER_DSR_ROUTE_STATS = 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSR_ROUTE_STATS__TEXT = 1;

	/**
	 * The feature id for the '<em><b>Route info</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSR_ROUTE_STATS__ROUTE_INFO = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSR_ROUTE_STATS__ID = 3;

	/**
	 * The feature id for the '<em><b>Node pairs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSR_ROUTE_STATS__NODE_PAIRS = 4;

	/**
	 * The number of structural features of the '<em>Dsr route stats</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSR_ROUTE_STATS_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.specificdatamodels.brn.routing_dsr_stats_stats.impl.RouteImpl <em>Route</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.specificdatamodels.brn.routing_dsr_stats_stats.impl.RouteImpl
	 * @see de.hub.clickwatch.specificdatamodels.brn.routing_dsr_stats_stats.impl.Routing_dsr_stats_statsPackageImpl#getRoute()
	 * @generated
	 */
	int ROUTE = 1;

	/**
	 * The feature id for the '<em><b>EContainer route</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__ECONTAINER_ROUTE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__ID = 1;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__METRIC = 2;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__USAGE = 3;

	/**
	 * The feature id for the '<em><b>Last usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__LAST_USAGE = 4;

	/**
	 * The feature id for the '<em><b>Hop count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__HOP_COUNT = 5;

	/**
	 * The feature id for the '<em><b>Hops</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__HOPS = 6;

	/**
	 * The number of structural features of the '<em>Route</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.specificdatamodels.brn.routing_dsr_stats_stats.impl.Route_infoImpl <em>Route info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.specificdatamodels.brn.routing_dsr_stats_stats.impl.Route_infoImpl
	 * @see de.hub.clickwatch.specificdatamodels.brn.routing_dsr_stats_stats.impl.Routing_dsr_stats_statsPackageImpl#getRoute_info()
	 * @generated
	 */
	int ROUTE_INFO = 2;

	/**
	 * The feature id for the '<em><b>EContainer route info</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_INFO__ECONTAINER_ROUTE_INFO = 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_INFO__TEXT = 1;

	/**
	 * The feature id for the '<em><b>Route</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_INFO__ROUTE = 2;

	/**
	 * The feature id for the '<em><b>Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_INFO__SRC = 3;

	/**
	 * The feature id for the '<em><b>Dst</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_INFO__DST = 4;

	/**
	 * The number of structural features of the '<em>Route info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_INFO_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.specificdatamodels.brn.routing_dsr_stats_stats.impl.StatsImpl <em>Stats</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.specificdatamodels.brn.routing_dsr_stats_stats.impl.StatsImpl
	 * @see de.hub.clickwatch.specificdatamodels.brn.routing_dsr_stats_stats.impl.Routing_dsr_stats_statsPackageImpl#getStats()
	 * @generated
	 */
	int STATS = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATS__NAME = ClickWatchDataModelPackage.VALUE__NAME;

	/**
	 * The feature id for the '<em><b>Can Read</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATS__CAN_READ = ClickWatchDataModelPackage.VALUE__CAN_READ;

	/**
	 * The feature id for the '<em><b>Can Write</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATS__CAN_WRITE = ClickWatchDataModelPackage.VALUE__CAN_WRITE;

	/**
	 * The feature id for the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATS__CHANGED = ClickWatchDataModelPackage.VALUE__CHANGED;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATS__MIXED = ClickWatchDataModelPackage.VALUE__MIXED;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATS__ANY = ClickWatchDataModelPackage.VALUE__ANY;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATS__VALUE = ClickWatchDataModelPackage.VALUE__VALUE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATS__TIMESTAMP = ClickWatchDataModelPackage.VALUE__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Dsr route stats</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATS__DSR_ROUTE_STATS = ClickWatchDataModelPackage.VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Stats</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATS_FEATURE_COUNT = ClickWatchDataModelPackage.VALUE_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.specificdatamodels.brn.routing_dsr_stats_stats.Dsr_route_stats <em>Dsr route stats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dsr route stats</em>'.
	 * @see de.hub.clickwatch.specificdatamodels.brn.routing_dsr_stats_stats.Dsr_route_stats
	 * @generated
	 */
	EClass getDsr_route_stats();

	/**
	 * Returns the meta object for the container reference '{@link de.hub.clickwatch.specificdatamodels.brn.routing_dsr_stats_stats.Dsr_route_stats#getEContainer_dsr_route_stats <em>EContainer dsr route stats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>EContainer dsr route stats</em>'.
	 * @see de.hub.clickwatch.specificdatamodels.brn.routing_dsr_stats_stats.Dsr_route_stats#getEContainer_dsr_route_stats()
	 * @see #getDsr_route_stats()
	 * @generated
	 */
	EReference getDsr_route_stats_EContainer_dsr_route_stats();

	/**
	 * Returns the meta object for the attribute list '{@link de.hub.clickwatch.specificdatamodels.brn.routing_dsr_stats_stats.Dsr_route_stats#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Text</em>'.
	 * @see de.hub.clickwatch.specificdatamodels.brn.routing_dsr_stats_stats.Dsr_route_stats#getText()
	 * @see #getDsr_route_stats()
	 * @generated
	 */
	EAttribute getDsr_route_stats_Text();

	/**
	 * Returns the meta object for the containment reference list '{@link de.hub.clickwatch.specificdatamodels.brn.routing_dsr_stats_stats.Dsr_route_stats#getRoute_info <em>Route info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Route info</em>'.
	 * @see de.hub.clickwatch.specificdatamodels.brn.routing_dsr_stats_stats.Dsr_route_stats#getRoute_info()
	 * @see #getDsr_route_stats()
	 * @generated
	 */
	EReference getDsr_route_stats_Route_info();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificdatamodels.brn.routing_dsr_stats_stats.Dsr_route_stats#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.hub.clickwatch.specificdatamodels.brn.routing_dsr_stats_stats.Dsr_route_stats#getId()
	 * @see #getDsr_route_stats()
	 * @generated
	 */
	EAttribute getDsr_route_stats_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificdatamodels.brn.routing_dsr_stats_stats.Dsr_route_stats#getNode_pairs <em>Node pairs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node pairs</em>'.
	 * @see de.hub.clickwatch.specificdatamodels.brn.routing_dsr_stats_stats.Dsr_route_stats#getNode_pairs()
	 * @see #getDsr_route_stats()
	 * @generated
	 */
	EAttribute getDsr_route_stats_Node_pairs();

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.specificdatamodels.brn.routing_dsr_stats_stats.Route <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Route</em>'.
	 * @see de.hub.clickwatch.specificdatamodels.brn.routing_dsr_stats_stats.Route
	 * @generated
	 */
	EClass getRoute();

	/**
	 * Returns the meta object for the container reference '{@link de.hub.clickwatch.specificdatamodels.brn.routing_dsr_stats_stats.Route#getEContainer_route <em>EContainer route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>EContainer route</em>'.
	 * @see de.hub.clickwatch.specificdatamodels.brn.routing_dsr_stats_stats.Route#getEContainer_route()
	 * @see #getRoute()
	 * @generated
	 */
	EReference getRoute_EContainer_route();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificdatamodels.brn.routing_dsr_stats_stats.Route#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.hub.clickwatch.specificdatamodels.brn.routing_dsr_stats_stats.Route#getId()
	 * @see #getRoute()
	 * @generated
	 */
	EAttribute getRoute_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificdatamodels.brn.routing_dsr_stats_stats.Route#getMetric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metric</em>'.
	 * @see de.hub.clickwatch.specificdatamodels.brn.routing_dsr_stats_stats.Route#getMetric()
	 * @see #getRoute()
	 * @generated
	 */
	EAttribute getRoute_Metric();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificdatamodels.brn.routing_dsr_stats_stats.Route#getUsage <em>Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usage</em>'.
	 * @see de.hub.clickwatch.specificdatamodels.brn.routing_dsr_stats_stats.Route#getUsage()
	 * @see #getRoute()
	 * @generated
	 */
	EAttribute getRoute_Usage();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificdatamodels.brn.routing_dsr_stats_stats.Route#getLast_usage <em>Last usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last usage</em>'.
	 * @see de.hub.clickwatch.specificdatamodels.brn.routing_dsr_stats_stats.Route#getLast_usage()
	 * @see #getRoute()
	 * @generated
	 */
	EAttribute getRoute_Last_usage();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificdatamodels.brn.routing_dsr_stats_stats.Route#getHop_count <em>Hop count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hop count</em>'.
	 * @see de.hub.clickwatch.specificdatamodels.brn.routing_dsr_stats_stats.Route#getHop_count()
	 * @see #getRoute()
	 * @generated
	 */
	EAttribute getRoute_Hop_count();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificdatamodels.brn.routing_dsr_stats_stats.Route#getHops <em>Hops</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hops</em>'.
	 * @see de.hub.clickwatch.specificdatamodels.brn.routing_dsr_stats_stats.Route#getHops()
	 * @see #getRoute()
	 * @generated
	 */
	EAttribute getRoute_Hops();

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.specificdatamodels.brn.routing_dsr_stats_stats.Route_info <em>Route info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Route info</em>'.
	 * @see de.hub.clickwatch.specificdatamodels.brn.routing_dsr_stats_stats.Route_info
	 * @generated
	 */
	EClass getRoute_info();

	/**
	 * Returns the meta object for the container reference '{@link de.hub.clickwatch.specificdatamodels.brn.routing_dsr_stats_stats.Route_info#getEContainer_route_info <em>EContainer route info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>EContainer route info</em>'.
	 * @see de.hub.clickwatch.specificdatamodels.brn.routing_dsr_stats_stats.Route_info#getEContainer_route_info()
	 * @see #getRoute_info()
	 * @generated
	 */
	EReference getRoute_info_EContainer_route_info();

	/**
	 * Returns the meta object for the attribute list '{@link de.hub.clickwatch.specificdatamodels.brn.routing_dsr_stats_stats.Route_info#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Text</em>'.
	 * @see de.hub.clickwatch.specificdatamodels.brn.routing_dsr_stats_stats.Route_info#getText()
	 * @see #getRoute_info()
	 * @generated
	 */
	EAttribute getRoute_info_Text();

	/**
	 * Returns the meta object for the containment reference list '{@link de.hub.clickwatch.specificdatamodels.brn.routing_dsr_stats_stats.Route_info#getRoute <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Route</em>'.
	 * @see de.hub.clickwatch.specificdatamodels.brn.routing_dsr_stats_stats.Route_info#getRoute()
	 * @see #getRoute_info()
	 * @generated
	 */
	EReference getRoute_info_Route();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificdatamodels.brn.routing_dsr_stats_stats.Route_info#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Src</em>'.
	 * @see de.hub.clickwatch.specificdatamodels.brn.routing_dsr_stats_stats.Route_info#getSrc()
	 * @see #getRoute_info()
	 * @generated
	 */
	EAttribute getRoute_info_Src();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificdatamodels.brn.routing_dsr_stats_stats.Route_info#getDst <em>Dst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dst</em>'.
	 * @see de.hub.clickwatch.specificdatamodels.brn.routing_dsr_stats_stats.Route_info#getDst()
	 * @see #getRoute_info()
	 * @generated
	 */
	EAttribute getRoute_info_Dst();

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.specificdatamodels.brn.routing_dsr_stats_stats.Stats <em>Stats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stats</em>'.
	 * @see de.hub.clickwatch.specificdatamodels.brn.routing_dsr_stats_stats.Stats
	 * @generated
	 */
	EClass getStats();

	/**
	 * Returns the meta object for the containment reference '{@link de.hub.clickwatch.specificdatamodels.brn.routing_dsr_stats_stats.Stats#getDsr_route_stats <em>Dsr route stats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dsr route stats</em>'.
	 * @see de.hub.clickwatch.specificdatamodels.brn.routing_dsr_stats_stats.Stats#getDsr_route_stats()
	 * @see #getStats()
	 * @generated
	 */
	EReference getStats_Dsr_route_stats();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Routing_dsr_stats_statsFactory getRouting_dsr_stats_statsFactory();

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
		 * The meta object literal for the '{@link de.hub.clickwatch.specificdatamodels.brn.routing_dsr_stats_stats.impl.Dsr_route_statsImpl <em>Dsr route stats</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.specificdatamodels.brn.routing_dsr_stats_stats.impl.Dsr_route_statsImpl
		 * @see de.hub.clickwatch.specificdatamodels.brn.routing_dsr_stats_stats.impl.Routing_dsr_stats_statsPackageImpl#getDsr_route_stats()
		 * @generated
		 */
		EClass DSR_ROUTE_STATS = eINSTANCE.getDsr_route_stats();

		/**
		 * The meta object literal for the '<em><b>EContainer dsr route stats</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSR_ROUTE_STATS__ECONTAINER_DSR_ROUTE_STATS = eINSTANCE.getDsr_route_stats_EContainer_dsr_route_stats();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSR_ROUTE_STATS__TEXT = eINSTANCE.getDsr_route_stats_Text();

		/**
		 * The meta object literal for the '<em><b>Route info</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSR_ROUTE_STATS__ROUTE_INFO = eINSTANCE.getDsr_route_stats_Route_info();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSR_ROUTE_STATS__ID = eINSTANCE.getDsr_route_stats_Id();

		/**
		 * The meta object literal for the '<em><b>Node pairs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSR_ROUTE_STATS__NODE_PAIRS = eINSTANCE.getDsr_route_stats_Node_pairs();

		/**
		 * The meta object literal for the '{@link de.hub.clickwatch.specificdatamodels.brn.routing_dsr_stats_stats.impl.RouteImpl <em>Route</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.specificdatamodels.brn.routing_dsr_stats_stats.impl.RouteImpl
		 * @see de.hub.clickwatch.specificdatamodels.brn.routing_dsr_stats_stats.impl.Routing_dsr_stats_statsPackageImpl#getRoute()
		 * @generated
		 */
		EClass ROUTE = eINSTANCE.getRoute();

		/**
		 * The meta object literal for the '<em><b>EContainer route</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTE__ECONTAINER_ROUTE = eINSTANCE.getRoute_EContainer_route();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTE__ID = eINSTANCE.getRoute_Id();

		/**
		 * The meta object literal for the '<em><b>Metric</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTE__METRIC = eINSTANCE.getRoute_Metric();

		/**
		 * The meta object literal for the '<em><b>Usage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTE__USAGE = eINSTANCE.getRoute_Usage();

		/**
		 * The meta object literal for the '<em><b>Last usage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTE__LAST_USAGE = eINSTANCE.getRoute_Last_usage();

		/**
		 * The meta object literal for the '<em><b>Hop count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTE__HOP_COUNT = eINSTANCE.getRoute_Hop_count();

		/**
		 * The meta object literal for the '<em><b>Hops</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTE__HOPS = eINSTANCE.getRoute_Hops();

		/**
		 * The meta object literal for the '{@link de.hub.clickwatch.specificdatamodels.brn.routing_dsr_stats_stats.impl.Route_infoImpl <em>Route info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.specificdatamodels.brn.routing_dsr_stats_stats.impl.Route_infoImpl
		 * @see de.hub.clickwatch.specificdatamodels.brn.routing_dsr_stats_stats.impl.Routing_dsr_stats_statsPackageImpl#getRoute_info()
		 * @generated
		 */
		EClass ROUTE_INFO = eINSTANCE.getRoute_info();

		/**
		 * The meta object literal for the '<em><b>EContainer route info</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTE_INFO__ECONTAINER_ROUTE_INFO = eINSTANCE.getRoute_info_EContainer_route_info();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTE_INFO__TEXT = eINSTANCE.getRoute_info_Text();

		/**
		 * The meta object literal for the '<em><b>Route</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTE_INFO__ROUTE = eINSTANCE.getRoute_info_Route();

		/**
		 * The meta object literal for the '<em><b>Src</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTE_INFO__SRC = eINSTANCE.getRoute_info_Src();

		/**
		 * The meta object literal for the '<em><b>Dst</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTE_INFO__DST = eINSTANCE.getRoute_info_Dst();

		/**
		 * The meta object literal for the '{@link de.hub.clickwatch.specificdatamodels.brn.routing_dsr_stats_stats.impl.StatsImpl <em>Stats</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.specificdatamodels.brn.routing_dsr_stats_stats.impl.StatsImpl
		 * @see de.hub.clickwatch.specificdatamodels.brn.routing_dsr_stats_stats.impl.Routing_dsr_stats_statsPackageImpl#getStats()
		 * @generated
		 */
		EClass STATS = eINSTANCE.getStats();

		/**
		 * The meta object literal for the '<em><b>Dsr route stats</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATS__DSR_ROUTE_STATS = eINSTANCE.getStats_Dsr_route_stats();

	}

} //Routing_dsr_stats_statsPackage
