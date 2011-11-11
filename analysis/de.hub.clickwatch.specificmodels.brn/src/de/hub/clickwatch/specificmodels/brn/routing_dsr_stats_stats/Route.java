/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Route</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats.Route#getEContainer_route <em>EContainer route</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats.Route#getId <em>Id</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats.Route#getMetric <em>Metric</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats.Route#getUsage <em>Usage</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats.Route#getLast_usage <em>Last usage</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats.Route#getHop_count <em>Hop count</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats.Route#getHops <em>Hops</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats.Routing_dsr_stats_statsPackage#getRoute()
 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/dsr_route_stats|dsr_route_stats:Dsr_route_stats|EObject/route_info|route_info:Route_info|EObject/route|route:Route|EObject'"
 * @generated
 */
public interface Route extends EObject {
	/**
     * Returns the value of the '<em><b>EContainer route</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats.Route_info#getRoute <em>Route</em>}'.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EContainer route</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>EContainer route</em>' container reference.
     * @see #setEContainer_route(Route_info)
     * @see de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats.Routing_dsr_stats_statsPackage#getRoute_EContainer_route()
     * @see de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats.Route_info#getRoute
     * @model opposite="route" transient="false"
     * @generated
     */
	Route_info getEContainer_route();

	/**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats.Route#getEContainer_route <em>EContainer route</em>}' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>EContainer route</em>' container reference.
     * @see #getEContainer_route()
     * @generated
     */
	void setEContainer_route(Route_info value);

	/**
     * Returns the value of the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Id</em>' attribute.
     * @see #setId(int)
     * @see de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats.Routing_dsr_stats_statsPackage#getRoute_Id()
     * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/dsr_route_stats|dsr_route_stats:Dsr_route_stats|EObject/route_info|route_info:Route_info|EObject/route|route:Route|EObject/id|id:'"
     * @generated
     */
	int getId();

	/**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats.Route#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Id</em>' attribute.
     * @see #getId()
     * @generated
     */
	void setId(int value);

	/**
     * Returns the value of the '<em><b>Metric</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metric</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Metric</em>' attribute.
     * @see #setMetric(int)
     * @see de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats.Routing_dsr_stats_statsPackage#getRoute_Metric()
     * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/dsr_route_stats|dsr_route_stats:Dsr_route_stats|EObject/route_info|route_info:Route_info|EObject/route|route:Route|EObject/metric|metric:'"
     * @generated
     */
	int getMetric();

	/**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats.Route#getMetric <em>Metric</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Metric</em>' attribute.
     * @see #getMetric()
     * @generated
     */
	void setMetric(int value);

	/**
     * Returns the value of the '<em><b>Usage</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Usage</em>' attribute.
     * @see #setUsage(int)
     * @see de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats.Routing_dsr_stats_statsPackage#getRoute_Usage()
     * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/dsr_route_stats|dsr_route_stats:Dsr_route_stats|EObject/route_info|route_info:Route_info|EObject/route|route:Route|EObject/usage|usage:'"
     * @generated
     */
	int getUsage();

	/**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats.Route#getUsage <em>Usage</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Usage</em>' attribute.
     * @see #getUsage()
     * @generated
     */
	void setUsage(int value);

	/**
     * Returns the value of the '<em><b>Last usage</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last usage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Last usage</em>' attribute.
     * @see #setLast_usage(double)
     * @see de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats.Routing_dsr_stats_statsPackage#getRoute_Last_usage()
     * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/dsr_route_stats|dsr_route_stats:Dsr_route_stats|EObject/route_info|route_info:Route_info|EObject/route|route:Route|EObject/last_usage|last_usage:'"
     * @generated
     */
	double getLast_usage();

	/**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats.Route#getLast_usage <em>Last usage</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Last usage</em>' attribute.
     * @see #getLast_usage()
     * @generated
     */
	void setLast_usage(double value);

	/**
     * Returns the value of the '<em><b>Hop count</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hop count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Hop count</em>' attribute.
     * @see #setHop_count(int)
     * @see de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats.Routing_dsr_stats_statsPackage#getRoute_Hop_count()
     * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/dsr_route_stats|dsr_route_stats:Dsr_route_stats|EObject/route_info|route_info:Route_info|EObject/route|route:Route|EObject/hop_count|hop_count:'"
     * @generated
     */
	int getHop_count();

	/**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats.Route#getHop_count <em>Hop count</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Hop count</em>' attribute.
     * @see #getHop_count()
     * @generated
     */
	void setHop_count(int value);

	/**
     * Returns the value of the '<em><b>Hops</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hops</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Hops</em>' attribute.
     * @see #setHops(String)
     * @see de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats.Routing_dsr_stats_statsPackage#getRoute_Hops()
     * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/dsr_route_stats|dsr_route_stats:Dsr_route_stats|EObject/route_info|route_info:Route_info|EObject/route|route:Route|EObject/hops|hops:'"
     * @generated
     */
	String getHops();

	/**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats.Route#getHops <em>Hops</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Hops</em>' attribute.
     * @see #getHops()
     * @generated
     */
	void setHops(String value);

} // Route
