/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificdatamodels.brn.routing_dsr_stats_stats;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Route info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.routing_dsr_stats_stats.Route_info#getEContainer_route_info <em>EContainer route info</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.routing_dsr_stats_stats.Route_info#getText <em>Text</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.routing_dsr_stats_stats.Route_info#getRoute <em>Route</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.routing_dsr_stats_stats.Route_info#getSrc <em>Src</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.routing_dsr_stats_stats.Route_info#getDst <em>Dst</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.specificdatamodels.brn.routing_dsr_stats_stats.Routing_dsr_stats_statsPackage#getRoute_info()
 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/dsr_route_stats|dsr_route_stats:Dsr_route_stats|EObject/route_info|route_info:Route_info|EObject'"
 * @generated
 */
public interface Route_info extends EObject {
	/**
	 * Returns the value of the '<em><b>EContainer route info</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.hub.clickwatch.specificdatamodels.brn.routing_dsr_stats_stats.Dsr_route_stats#getRoute_info <em>Route info</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EContainer route info</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EContainer route info</em>' container reference.
	 * @see #setEContainer_route_info(Dsr_route_stats)
	 * @see de.hub.clickwatch.specificdatamodels.brn.routing_dsr_stats_stats.Routing_dsr_stats_statsPackage#getRoute_info_EContainer_route_info()
	 * @see de.hub.clickwatch.specificdatamodels.brn.routing_dsr_stats_stats.Dsr_route_stats#getRoute_info
	 * @model opposite="route_info" transient="false"
	 * @generated
	 */
	Dsr_route_stats getEContainer_route_info();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificdatamodels.brn.routing_dsr_stats_stats.Route_info#getEContainer_route_info <em>EContainer route info</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EContainer route info</em>' container reference.
	 * @see #getEContainer_route_info()
	 * @generated
	 */
	void setEContainer_route_info(Dsr_route_stats value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute list.
	 * @see de.hub.clickwatch.specificdatamodels.brn.routing_dsr_stats_stats.Routing_dsr_stats_statsPackage#getRoute_info_Text()
	 * @model unique="false"
	 *        annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/dsr_route_stats|dsr_route_stats:Dsr_route_stats|EObject/route_info|route_info:Route_info|EObject/text|text:'"
	 * @generated
	 */
	EList<String> getText();

	/**
	 * Returns the value of the '<em><b>Route</b></em>' containment reference list.
	 * The list contents are of type {@link de.hub.clickwatch.specificdatamodels.brn.routing_dsr_stats_stats.Route}.
	 * It is bidirectional and its opposite is '{@link de.hub.clickwatch.specificdatamodels.brn.routing_dsr_stats_stats.Route#getEContainer_route <em>EContainer route</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Route</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Route</em>' containment reference list.
	 * @see de.hub.clickwatch.specificdatamodels.brn.routing_dsr_stats_stats.Routing_dsr_stats_statsPackage#getRoute_info_Route()
	 * @see de.hub.clickwatch.specificdatamodels.brn.routing_dsr_stats_stats.Route#getEContainer_route
	 * @model opposite="eContainer_route" containment="true"
	 *        annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/dsr_route_stats|dsr_route_stats:Dsr_route_stats|EObject/route_info|route_info:Route_info|EObject/route|route:Route|EObject' IsCopy='false'"
	 * @generated
	 */
	EList<Route> getRoute();

	/**
	 * Returns the value of the '<em><b>Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Src</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Src</em>' attribute.
	 * @see #setSrc(String)
	 * @see de.hub.clickwatch.specificdatamodels.brn.routing_dsr_stats_stats.Routing_dsr_stats_statsPackage#getRoute_info_Src()
	 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/dsr_route_stats|dsr_route_stats:Dsr_route_stats|EObject/route_info|route_info:Route_info|EObject/src|src:'"
	 * @generated
	 */
	String getSrc();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificdatamodels.brn.routing_dsr_stats_stats.Route_info#getSrc <em>Src</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Src</em>' attribute.
	 * @see #getSrc()
	 * @generated
	 */
	void setSrc(String value);

	/**
	 * Returns the value of the '<em><b>Dst</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dst</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dst</em>' attribute.
	 * @see #setDst(String)
	 * @see de.hub.clickwatch.specificdatamodels.brn.routing_dsr_stats_stats.Routing_dsr_stats_statsPackage#getRoute_info_Dst()
	 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/dsr_route_stats|dsr_route_stats:Dsr_route_stats|EObject/route_info|route_info:Route_info|EObject/dst|dst:'"
	 * @generated
	 */
	String getDst();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificdatamodels.brn.routing_dsr_stats_stats.Route_info#getDst <em>Dst</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dst</em>' attribute.
	 * @see #getDst()
	 * @generated
	 */
	void setDst(String value);

} // Route_info
