/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mac percentage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Mac_percentage#getEContainer_mac_percentage <em>EContainer mac percentage</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Mac_percentage#getBusy <em>Busy</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Mac_percentage#getRx <em>Rx</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Mac_percentage#getTx <em>Tx</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Mac_percentage#getNoerr_rx <em>Noerr rx</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Mac_percentage#getCrc_rx <em>Crc rx</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Mac_percentage#getPhy_rx <em>Phy rx</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Mac_percentage#getUnknown_err_rx <em>Unknown err rx</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Mac_percentage#getUnit <em>Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getMac_percentage()
 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/channelstats|channelstats:Channelstats|EObject/mac_percentage|mac_percentage:Mac_percentage|EObject'"
 * @generated
 */
public interface Mac_percentage extends EObject {
	/**
	 * Returns the value of the '<em><b>EContainer mac percentage</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Channelstats#getMac_percentage <em>Mac percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EContainer mac percentage</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EContainer mac percentage</em>' container reference.
	 * @see #setEContainer_mac_percentage(Channelstats)
	 * @see de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getMac_percentage_EContainer_mac_percentage()
	 * @see de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Channelstats#getMac_percentage
	 * @model opposite="mac_percentage" transient="false"
	 * @generated
	 */
	Channelstats getEContainer_mac_percentage();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Mac_percentage#getEContainer_mac_percentage <em>EContainer mac percentage</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EContainer mac percentage</em>' container reference.
	 * @see #getEContainer_mac_percentage()
	 * @generated
	 */
	void setEContainer_mac_percentage(Channelstats value);

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
	 * @see de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getMac_percentage_Busy()
	 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/channelstats|channelstats:Channelstats|EObject/mac_percentage|mac_percentage:Mac_percentage|EObject/busy|busy:'"
	 * @generated
	 */
	int getBusy();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Mac_percentage#getBusy <em>Busy</em>}' attribute.
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
	 * @see de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getMac_percentage_Rx()
	 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/channelstats|channelstats:Channelstats|EObject/mac_percentage|mac_percentage:Mac_percentage|EObject/rx|rx:'"
	 * @generated
	 */
	int getRx();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Mac_percentage#getRx <em>Rx</em>}' attribute.
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
	 * @see de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getMac_percentage_Tx()
	 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/channelstats|channelstats:Channelstats|EObject/mac_percentage|mac_percentage:Mac_percentage|EObject/tx|tx:'"
	 * @generated
	 */
	int getTx();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Mac_percentage#getTx <em>Tx</em>}' attribute.
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
	 * @see de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getMac_percentage_Noerr_rx()
	 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/channelstats|channelstats:Channelstats|EObject/mac_percentage|mac_percentage:Mac_percentage|EObject/noerr_rx|noerr_rx:'"
	 * @generated
	 */
	int getNoerr_rx();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Mac_percentage#getNoerr_rx <em>Noerr rx</em>}' attribute.
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
	 * @see de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getMac_percentage_Crc_rx()
	 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/channelstats|channelstats:Channelstats|EObject/mac_percentage|mac_percentage:Mac_percentage|EObject/crc_rx|crc_rx:'"
	 * @generated
	 */
	int getCrc_rx();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Mac_percentage#getCrc_rx <em>Crc rx</em>}' attribute.
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
	 * @see de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getMac_percentage_Phy_rx()
	 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/channelstats|channelstats:Channelstats|EObject/mac_percentage|mac_percentage:Mac_percentage|EObject/phy_rx|phy_rx:'"
	 * @generated
	 */
	int getPhy_rx();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Mac_percentage#getPhy_rx <em>Phy rx</em>}' attribute.
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
	 * @see de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getMac_percentage_Unknown_err_rx()
	 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/channelstats|channelstats:Channelstats|EObject/mac_percentage|mac_percentage:Mac_percentage|EObject/unknown_err_rx|unknown_err_rx:'"
	 * @generated
	 */
	int getUnknown_err_rx();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Mac_percentage#getUnknown_err_rx <em>Unknown err rx</em>}' attribute.
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
	 * @see de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getMac_percentage_Unit()
	 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/channelstats|channelstats:Channelstats|EObject/mac_percentage|mac_percentage:Mac_percentage|EObject/unit|unit:'"
	 * @generated
	 */
	String getUnit();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Mac_percentage#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(String value);

} // Mac_percentage
