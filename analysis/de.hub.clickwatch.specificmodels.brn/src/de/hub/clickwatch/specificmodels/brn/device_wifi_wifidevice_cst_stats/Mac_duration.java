/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mac duration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac_duration#getEContainer_mac_duration <em>EContainer mac duration</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac_duration#getBusy <em>Busy</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac_duration#getRx <em>Rx</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac_duration#getTx <em>Tx</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac_duration#getNoerr_rx <em>Noerr rx</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac_duration#getCrc_rx <em>Crc rx</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac_duration#getPhy_rx <em>Phy rx</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac_duration#getUnknown_err_rx <em>Unknown err rx</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac_duration#getUnit <em>Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getMac_duration()
 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/channelstats|channelstats:Channelstats|EObject/mac_duration|mac_duration:Mac_duration|EObject'"
 * @generated
 */
public interface Mac_duration extends EObject {
	/**
     * Returns the value of the '<em><b>EContainer mac duration</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Channelstats#getMac_duration <em>Mac duration</em>}'.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EContainer mac duration</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>EContainer mac duration</em>' container reference.
     * @see #setEContainer_mac_duration(Channelstats)
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getMac_duration_EContainer_mac_duration()
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Channelstats#getMac_duration
     * @model opposite="mac_duration" transient="false"
     * @generated
     */
	Channelstats getEContainer_mac_duration();

	/**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac_duration#getEContainer_mac_duration <em>EContainer mac duration</em>}' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>EContainer mac duration</em>' container reference.
     * @see #getEContainer_mac_duration()
     * @generated
     */
	void setEContainer_mac_duration(Channelstats value);

	/**
     * Returns the value of the '<em><b>Busy</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Busy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Busy</em>' attribute.
     * @see #setBusy(int)
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getMac_duration_Busy()
     * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/channelstats|channelstats:Channelstats|EObject/mac_duration|mac_duration:Mac_duration|EObject/busy|busy:'"
     * @generated
     */
	int getBusy();

	/**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac_duration#getBusy <em>Busy</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Busy</em>' attribute.
     * @see #getBusy()
     * @generated
     */
	void setBusy(int value);

	/**
     * Returns the value of the '<em><b>Rx</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rx</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Rx</em>' attribute.
     * @see #setRx(int)
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getMac_duration_Rx()
     * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/channelstats|channelstats:Channelstats|EObject/mac_duration|mac_duration:Mac_duration|EObject/rx|rx:'"
     * @generated
     */
	int getRx();

	/**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac_duration#getRx <em>Rx</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rx</em>' attribute.
     * @see #getRx()
     * @generated
     */
	void setRx(int value);

	/**
     * Returns the value of the '<em><b>Tx</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tx</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Tx</em>' attribute.
     * @see #setTx(int)
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getMac_duration_Tx()
     * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/channelstats|channelstats:Channelstats|EObject/mac_duration|mac_duration:Mac_duration|EObject/tx|tx:'"
     * @generated
     */
	int getTx();

	/**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac_duration#getTx <em>Tx</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tx</em>' attribute.
     * @see #getTx()
     * @generated
     */
	void setTx(int value);

	/**
     * Returns the value of the '<em><b>Noerr rx</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Noerr rx</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Noerr rx</em>' attribute.
     * @see #setNoerr_rx(int)
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getMac_duration_Noerr_rx()
     * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/channelstats|channelstats:Channelstats|EObject/mac_duration|mac_duration:Mac_duration|EObject/noerr_rx|noerr_rx:'"
     * @generated
     */
	int getNoerr_rx();

	/**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac_duration#getNoerr_rx <em>Noerr rx</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Noerr rx</em>' attribute.
     * @see #getNoerr_rx()
     * @generated
     */
	void setNoerr_rx(int value);

	/**
     * Returns the value of the '<em><b>Crc rx</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Crc rx</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Crc rx</em>' attribute.
     * @see #setCrc_rx(int)
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getMac_duration_Crc_rx()
     * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/channelstats|channelstats:Channelstats|EObject/mac_duration|mac_duration:Mac_duration|EObject/crc_rx|crc_rx:'"
     * @generated
     */
	int getCrc_rx();

	/**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac_duration#getCrc_rx <em>Crc rx</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Crc rx</em>' attribute.
     * @see #getCrc_rx()
     * @generated
     */
	void setCrc_rx(int value);

	/**
     * Returns the value of the '<em><b>Phy rx</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phy rx</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Phy rx</em>' attribute.
     * @see #setPhy_rx(int)
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getMac_duration_Phy_rx()
     * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/channelstats|channelstats:Channelstats|EObject/mac_duration|mac_duration:Mac_duration|EObject/phy_rx|phy_rx:'"
     * @generated
     */
	int getPhy_rx();

	/**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac_duration#getPhy_rx <em>Phy rx</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Phy rx</em>' attribute.
     * @see #getPhy_rx()
     * @generated
     */
	void setPhy_rx(int value);

	/**
     * Returns the value of the '<em><b>Unknown err rx</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unknown err rx</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Unknown err rx</em>' attribute.
     * @see #setUnknown_err_rx(int)
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getMac_duration_Unknown_err_rx()
     * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/channelstats|channelstats:Channelstats|EObject/mac_duration|mac_duration:Mac_duration|EObject/unknown_err_rx|unknown_err_rx:'"
     * @generated
     */
	int getUnknown_err_rx();

	/**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac_duration#getUnknown_err_rx <em>Unknown err rx</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Unknown err rx</em>' attribute.
     * @see #getUnknown_err_rx()
     * @generated
     */
	void setUnknown_err_rx(int value);

	/**
     * Returns the value of the '<em><b>Unit</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Unit</em>' attribute.
     * @see #setUnit(String)
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getMac_duration_Unit()
     * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/channelstats|channelstats:Channelstats|EObject/mac_duration|mac_duration:Mac_duration|EObject/unit|unit:'"
     * @generated
     */
	String getUnit();

	/**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac_duration#getUnit <em>Unit</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Unit</em>' attribute.
     * @see #getUnit()
     * @generated
     */
	void setUnit(String value);

} // Mac_duration
