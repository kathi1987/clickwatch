/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats;

import de.hub.clickwatch.model.Handler;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stats</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Stats#getChannelstats <em>Channelstats</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getStats()
 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler'"
 * @generated
 */
public interface Stats extends Handler {
	/**
     * Returns the value of the '<em><b>Channelstats</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Channelstats#getEContainer_channelstats <em>EContainer channelstats</em>}'.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Channelstats</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Channelstats</em>' containment reference.
     * @see #setChannelstats(Channelstats)
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getStats_Channelstats()
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Channelstats#getEContainer_channelstats
     * @model opposite="eContainer_channelstats" containment="true"
     *        annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/channelstats|channelstats:Channelstats|EObject' IsCopy='false'"
     * @generated
     */
	Channelstats getChannelstats();

	/**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Stats#getChannelstats <em>Channelstats</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Channelstats</em>' containment reference.
     * @see #getChannelstats()
     * @generated
     */
	void setChannelstats(Channelstats value);

} // Stats
