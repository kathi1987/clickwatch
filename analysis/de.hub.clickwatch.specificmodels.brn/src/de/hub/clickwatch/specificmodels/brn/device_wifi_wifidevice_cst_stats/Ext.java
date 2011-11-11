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
 * A representation of the model object '<em><b>Ext</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Ext#getEContainer_ext <em>EContainer ext</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Ext#getRssi0 <em>Rssi0</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Ext#getRssi1 <em>Rssi1</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Ext#getRssi2 <em>Rssi2</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getExt()
 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/channelstats|channelstats:Channelstats|EObject/neighbourstats|neighbourstats:Neighbourstats|EObject/nb|nb:Nb|EObject/rssi_extended|rssi_extended:Rssi_extended|EObject/ext|ext:Ext|EObject'"
 * @generated
 */
public interface Ext extends EObject {
	/**
     * Returns the value of the '<em><b>EContainer ext</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Rssi_extended#getExt <em>Ext</em>}'.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EContainer ext</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>EContainer ext</em>' container reference.
     * @see #setEContainer_ext(Rssi_extended)
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getExt_EContainer_ext()
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Rssi_extended#getExt
     * @model opposite="ext" transient="false"
     * @generated
     */
	Rssi_extended getEContainer_ext();

	/**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Ext#getEContainer_ext <em>EContainer ext</em>}' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>EContainer ext</em>' container reference.
     * @see #getEContainer_ext()
     * @generated
     */
	void setEContainer_ext(Rssi_extended value);

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
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getExt_Rssi0()
     * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/channelstats|channelstats:Channelstats|EObject/neighbourstats|neighbourstats:Neighbourstats|EObject/nb|nb:Nb|EObject/rssi_extended|rssi_extended:Rssi_extended|EObject/ext|ext:Ext|EObject/rssi0|rssi0:'"
     * @generated
     */
	int getRssi0();

	/**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Ext#getRssi0 <em>Rssi0</em>}' attribute.
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
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getExt_Rssi1()
     * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/channelstats|channelstats:Channelstats|EObject/neighbourstats|neighbourstats:Neighbourstats|EObject/nb|nb:Nb|EObject/rssi_extended|rssi_extended:Rssi_extended|EObject/ext|ext:Ext|EObject/rssi1|rssi1:'"
     * @generated
     */
	int getRssi1();

	/**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Ext#getRssi1 <em>Rssi1</em>}' attribute.
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
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getExt_Rssi2()
     * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/channelstats|channelstats:Channelstats|EObject/neighbourstats|neighbourstats:Neighbourstats|EObject/nb|nb:Nb|EObject/rssi_extended|rssi_extended:Rssi_extended|EObject/ext|ext:Ext|EObject/rssi2|rssi2:'"
     * @generated
     */
	int getRssi2();

	/**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Ext#getRssi2 <em>Rssi2</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rssi2</em>' attribute.
     * @see #getRssi2()
     * @generated
     */
	void setRssi2(int value);

} // Ext
