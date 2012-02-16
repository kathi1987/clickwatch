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
 * A representation of the model object '<em><b>Ctl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Ctl#getEContainer_ctl <em>EContainer ctl</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Ctl#getRssi0 <em>Rssi0</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Ctl#getRssi1 <em>Rssi1</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Ctl#getRssi2 <em>Rssi2</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getCtl()
 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/channelstats|channelstats:Channelstats|EObject/neighbourstats|neighbourstats:Neighbourstats|EObject/nb|nb:Nb|EObject/rssi_extended|rssi_extended:Rssi_extended|EObject/ctl|ctl:Ctl|EObject'"
 * @generated
 */
public interface Ctl extends EObject {
	/**
	 * Returns the value of the '<em><b>EContainer ctl</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Rssi_extended#getCtl <em>Ctl</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EContainer ctl</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EContainer ctl</em>' container reference.
	 * @see #setEContainer_ctl(Rssi_extended)
	 * @see de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getCtl_EContainer_ctl()
	 * @see de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Rssi_extended#getCtl
	 * @model opposite="ctl" transient="false"
	 * @generated
	 */
	Rssi_extended getEContainer_ctl();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Ctl#getEContainer_ctl <em>EContainer ctl</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EContainer ctl</em>' container reference.
	 * @see #getEContainer_ctl()
	 * @generated
	 */
	void setEContainer_ctl(Rssi_extended value);

	/**
	 * Returns the value of the '<em><b>Rssi0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rssi0</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rssi0</em>' attribute.
	 * @see #setRssi0(int)
	 * @see de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getCtl_Rssi0()
	 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/channelstats|channelstats:Channelstats|EObject/neighbourstats|neighbourstats:Neighbourstats|EObject/nb|nb:Nb|EObject/rssi_extended|rssi_extended:Rssi_extended|EObject/ctl|ctl:Ctl|EObject/rssi0|rssi0:'"
	 * @generated
	 */
	int getRssi0();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Ctl#getRssi0 <em>Rssi0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rssi0</em>' attribute.
	 * @see #getRssi0()
	 * @generated
	 */
	void setRssi0(int value);

	/**
	 * Returns the value of the '<em><b>Rssi1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rssi1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rssi1</em>' attribute.
	 * @see #setRssi1(int)
	 * @see de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getCtl_Rssi1()
	 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/channelstats|channelstats:Channelstats|EObject/neighbourstats|neighbourstats:Neighbourstats|EObject/nb|nb:Nb|EObject/rssi_extended|rssi_extended:Rssi_extended|EObject/ctl|ctl:Ctl|EObject/rssi1|rssi1:'"
	 * @generated
	 */
	int getRssi1();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Ctl#getRssi1 <em>Rssi1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rssi1</em>' attribute.
	 * @see #getRssi1()
	 * @generated
	 */
	void setRssi1(int value);

	/**
	 * Returns the value of the '<em><b>Rssi2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rssi2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rssi2</em>' attribute.
	 * @see #setRssi2(int)
	 * @see de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getCtl_Rssi2()
	 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/channelstats|channelstats:Channelstats|EObject/neighbourstats|neighbourstats:Neighbourstats|EObject/nb|nb:Nb|EObject/rssi_extended|rssi_extended:Rssi_extended|EObject/ctl|ctl:Ctl|EObject/rssi2|rssi2:'"
	 * @generated
	 */
	int getRssi2();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Ctl#getRssi2 <em>Rssi2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rssi2</em>' attribute.
	 * @see #getRssi2()
	 * @generated
	 */
	void setRssi2(int value);

} // Ctl
