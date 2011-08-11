/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rssi extended</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Rssi_extended#getEContainer_rssi_extended <em>EContainer rssi extended</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Rssi_extended#getText <em>Text</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Rssi_extended#getCtl <em>Ctl</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Rssi_extended#getExt <em>Ext</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getRssi_extended()
 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/channelstats|channelstats:Channelstats|EObject/neighbourstats|neighbourstats:Neighbourstats|EObject/nb|nb:Nb|EObject/rssi_extended|rssi_extended:Rssi_extended|EObject'"
 * @generated
 */
public interface Rssi_extended extends EObject {
	/**
	 * Returns the value of the '<em><b>EContainer rssi extended</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Nb#getRssi_extended <em>Rssi extended</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EContainer rssi extended</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EContainer rssi extended</em>' container reference.
	 * @see #setEContainer_rssi_extended(Nb)
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getRssi_extended_EContainer_rssi_extended()
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Nb#getRssi_extended
	 * @model opposite="rssi_extended" transient="false"
	 * @generated
	 */
	Nb getEContainer_rssi_extended();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Rssi_extended#getEContainer_rssi_extended <em>EContainer rssi extended</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EContainer rssi extended</em>' container reference.
	 * @see #getEContainer_rssi_extended()
	 * @generated
	 */
	void setEContainer_rssi_extended(Nb value);

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
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getRssi_extended_Text()
	 * @model unique="false"
	 *        annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/channelstats|channelstats:Channelstats|EObject/neighbourstats|neighbourstats:Neighbourstats|EObject/nb|nb:Nb|EObject/rssi_extended|rssi_extended:Rssi_extended|EObject/text|text:'"
	 * @generated
	 */
	EList<String> getText();

	/**
	 * Returns the value of the '<em><b>Ctl</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Ctl#getEContainer_ctl <em>EContainer ctl</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ctl</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ctl</em>' containment reference.
	 * @see #setCtl(Ctl)
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getRssi_extended_Ctl()
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Ctl#getEContainer_ctl
	 * @model opposite="eContainer_ctl" containment="true"
	 *        annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/channelstats|channelstats:Channelstats|EObject/neighbourstats|neighbourstats:Neighbourstats|EObject/nb|nb:Nb|EObject/rssi_extended|rssi_extended:Rssi_extended|EObject/ctl|ctl:Ctl|EObject' IsCopy='false'"
	 * @generated
	 */
	Ctl getCtl();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Rssi_extended#getCtl <em>Ctl</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ctl</em>' containment reference.
	 * @see #getCtl()
	 * @generated
	 */
	void setCtl(Ctl value);

	/**
	 * Returns the value of the '<em><b>Ext</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Ext#getEContainer_ext <em>EContainer ext</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ext</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ext</em>' containment reference.
	 * @see #setExt(Ext)
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getRssi_extended_Ext()
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Ext#getEContainer_ext
	 * @model opposite="eContainer_ext" containment="true"
	 *        annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/channelstats|channelstats:Channelstats|EObject/neighbourstats|neighbourstats:Neighbourstats|EObject/nb|nb:Nb|EObject/rssi_extended|rssi_extended:Rssi_extended|EObject/ext|ext:Ext|EObject' IsCopy='false'"
	 * @generated
	 */
	Ext getExt();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Rssi_extended#getExt <em>Ext</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ext</em>' containment reference.
	 * @see #getExt()
	 * @generated
	 */
	void setExt(Ext value);

} // Rssi_extended
