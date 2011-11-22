/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats;

import de.hub.clickwatch.model.Handler;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stats</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats.Stats#getDsr_route_stats <em>Dsr route stats</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats.Routing_dsr_stats_statsPackage#getStats()
 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler'"
 * @generated
 */
public interface Stats extends Handler {
    /**
     * Returns the value of the '<em><b>Dsr route stats</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats.Dsr_route_stats#getEContainer_dsr_route_stats <em>EContainer dsr route stats</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Dsr route stats</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Dsr route stats</em>' containment reference.
     * @see #setDsr_route_stats(Dsr_route_stats)
     * @see de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats.Routing_dsr_stats_statsPackage#getStats_Dsr_route_stats()
     * @see de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats.Dsr_route_stats#getEContainer_dsr_route_stats
     * @model opposite="eContainer_dsr_route_stats" containment="true"
     *        annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/dsr_route_stats|dsr_route_stats:Dsr_route_stats|EObject' IsCopy='false'"
     * @generated
     */
    Dsr_route_stats getDsr_route_stats();

    /**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats.Stats#getDsr_route_stats <em>Dsr route stats</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Dsr route stats</em>' containment reference.
     * @see #getDsr_route_stats()
     * @generated
     */
    void setDsr_route_stats(Dsr_route_stats value);

} // Stats
