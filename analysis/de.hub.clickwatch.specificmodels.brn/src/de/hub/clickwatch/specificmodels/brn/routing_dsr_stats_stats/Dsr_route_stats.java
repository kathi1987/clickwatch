/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dsr route stats</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats.Dsr_route_stats#getEContainer_dsr_route_stats <em>EContainer dsr route stats</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats.Dsr_route_stats#getText <em>Text</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats.Dsr_route_stats#getRoute_info <em>Route info</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats.Dsr_route_stats#getId <em>Id</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats.Dsr_route_stats#getNode_pairs <em>Node pairs</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats.Routing_dsr_stats_statsPackage#getDsr_route_stats()
 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/dsr_route_stats|dsr_route_stats:Dsr_route_stats|EObject'"
 * @generated
 */
public interface Dsr_route_stats extends EObject {
	/**
	 * Returns the value of the '<em><b>EContainer dsr route stats</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats.Stats#getDsr_route_stats <em>Dsr route stats</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EContainer dsr route stats</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EContainer dsr route stats</em>' container reference.
	 * @see #setEContainer_dsr_route_stats(Stats)
	 * @see de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats.Routing_dsr_stats_statsPackage#getDsr_route_stats_EContainer_dsr_route_stats()
	 * @see de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats.Stats#getDsr_route_stats
	 * @model opposite="dsr_route_stats" transient="false"
	 * @generated
	 */
	Stats getEContainer_dsr_route_stats();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats.Dsr_route_stats#getEContainer_dsr_route_stats <em>EContainer dsr route stats</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EContainer dsr route stats</em>' container reference.
	 * @see #getEContainer_dsr_route_stats()
	 * @generated
	 */
	void setEContainer_dsr_route_stats(Stats value);

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
	 * @see de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats.Routing_dsr_stats_statsPackage#getDsr_route_stats_Text()
	 * @model unique="false"
	 *        annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/dsr_route_stats|dsr_route_stats:Dsr_route_stats|EObject/text|text:'"
	 * @generated
	 */
	EList<String> getText();

	/**
	 * Returns the value of the '<em><b>Route info</b></em>' containment reference list.
	 * The list contents are of type {@link de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats.Route_info}.
	 * It is bidirectional and its opposite is '{@link de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats.Route_info#getEContainer_route_info <em>EContainer route info</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Route info</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Route info</em>' containment reference list.
	 * @see de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats.Routing_dsr_stats_statsPackage#getDsr_route_stats_Route_info()
	 * @see de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats.Route_info#getEContainer_route_info
	 * @model opposite="eContainer_route_info" containment="true"
	 *        annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/dsr_route_stats|dsr_route_stats:Dsr_route_stats|EObject/route_info|route_info:Route_info|EObject' IsCopy='false'"
	 * @generated
	 */
	EList<Route_info> getRoute_info();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats.Routing_dsr_stats_statsPackage#getDsr_route_stats_Id()
	 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/dsr_route_stats|dsr_route_stats:Dsr_route_stats|EObject/id|id:'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats.Dsr_route_stats#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Node pairs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node pairs</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node pairs</em>' attribute.
	 * @see #setNode_pairs(int)
	 * @see de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats.Routing_dsr_stats_statsPackage#getDsr_route_stats_Node_pairs()
	 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/dsr_route_stats|dsr_route_stats:Dsr_route_stats|EObject/node_pairs|node_pairs:'"
	 * @generated
	 */
	int getNode_pairs();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats.Dsr_route_stats#getNode_pairs <em>Node pairs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node pairs</em>' attribute.
	 * @see #getNode_pairs()
	 * @generated
	 */
	void setNode_pairs(int value);

} // Dsr_route_stats
