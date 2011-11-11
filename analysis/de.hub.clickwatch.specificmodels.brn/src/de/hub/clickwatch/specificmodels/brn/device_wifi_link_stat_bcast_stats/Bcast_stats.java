/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats;

import de.hub.clickwatch.model.Handler;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bcast stats</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Bcast_stats#getEntry <em>Entry</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Device_wifi_link_stat_bcast_statsPackage#getBcast_stats()
 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Bcast_stats|Handler'"
 * @generated
 */
public interface Bcast_stats extends Handler {
	/**
     * Returns the value of the '<em><b>Entry</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Entry#getEContainer_entry <em>EContainer entry</em>}'.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Entry</em>' containment reference.
     * @see #setEntry(Entry)
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Device_wifi_link_stat_bcast_statsPackage#getBcast_stats_Entry()
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Entry#getEContainer_entry
     * @model opposite="eContainer_entry" containment="true"
     *        annotation="http://de.hub.clickwatch.specificmodels target_id='Bcast_stats|Handler/entry|entry:Entry|EObject' IsCopy='false'"
     * @generated
     */
	Entry getEntry();

	/**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Bcast_stats#getEntry <em>Entry</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Entry</em>' containment reference.
     * @see #getEntry()
     * @generated
     */
	void setEntry(Entry value);

} // Bcast_stats
