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
 * A representation of the model object '<em><b>Rssi hist</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Rssi_hist#getEContainer_rssi_hist <em>EContainer rssi hist</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Rssi_hist#getSize <em>Size</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Rssi_hist#getMax_size <em>Max size</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Rssi_hist#getOverflow <em>Overflow</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Rssi_hist#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getRssi_hist()
 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/channelstats|channelstats:Channelstats|EObject/neighbourstats|neighbourstats:Neighbourstats|EObject/nb|nb:Nb|EObject/rssi_hist|rssi_hist:Rssi_hist|EObject'"
 * @generated
 */
public interface Rssi_hist extends EObject {
	/**
	 * Returns the value of the '<em><b>EContainer rssi hist</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Nb#getRssi_hist <em>Rssi hist</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EContainer rssi hist</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EContainer rssi hist</em>' container reference.
	 * @see #setEContainer_rssi_hist(Nb)
	 * @see de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getRssi_hist_EContainer_rssi_hist()
	 * @see de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Nb#getRssi_hist
	 * @model opposite="rssi_hist" transient="false"
	 * @generated
	 */
	Nb getEContainer_rssi_hist();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Rssi_hist#getEContainer_rssi_hist <em>EContainer rssi hist</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EContainer rssi hist</em>' container reference.
	 * @see #getEContainer_rssi_hist()
	 * @generated
	 */
	void setEContainer_rssi_hist(Nb value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(int)
	 * @see de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getRssi_hist_Size()
	 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/channelstats|channelstats:Channelstats|EObject/neighbourstats|neighbourstats:Neighbourstats|EObject/nb|nb:Nb|EObject/rssi_hist|rssi_hist:Rssi_hist|EObject/size|size:'"
	 * @generated
	 */
	int getSize();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Rssi_hist#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(int value);

	/**
	 * Returns the value of the '<em><b>Max size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max size</em>' attribute.
	 * @see #setMax_size(int)
	 * @see de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getRssi_hist_Max_size()
	 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/channelstats|channelstats:Channelstats|EObject/neighbourstats|neighbourstats:Neighbourstats|EObject/nb|nb:Nb|EObject/rssi_hist|rssi_hist:Rssi_hist|EObject/max_size|max_size:'"
	 * @generated
	 */
	int getMax_size();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Rssi_hist#getMax_size <em>Max size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max size</em>' attribute.
	 * @see #getMax_size()
	 * @generated
	 */
	void setMax_size(int value);

	/**
	 * Returns the value of the '<em><b>Overflow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Overflow</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overflow</em>' attribute.
	 * @see #setOverflow(String)
	 * @see de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getRssi_hist_Overflow()
	 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/channelstats|channelstats:Channelstats|EObject/neighbourstats|neighbourstats:Neighbourstats|EObject/nb|nb:Nb|EObject/rssi_hist|rssi_hist:Rssi_hist|EObject/overflow|overflow:'"
	 * @generated
	 */
	String getOverflow();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Rssi_hist#getOverflow <em>Overflow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overflow</em>' attribute.
	 * @see #getOverflow()
	 * @generated
	 */
	void setOverflow(String value);

	/**
	 * Returns the value of the '<em><b>Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' attribute.
	 * @see #setValues(String)
	 * @see de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getRssi_hist_Values()
	 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/channelstats|channelstats:Channelstats|EObject/neighbourstats|neighbourstats:Neighbourstats|EObject/nb|nb:Nb|EObject/rssi_hist|rssi_hist:Rssi_hist|EObject/values|values:'"
	 * @generated
	 */
	String getValues();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Rssi_hist#getValues <em>Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Values</em>' attribute.
	 * @see #getValues()
	 * @generated
	 */
	void setValues(String value);

} // Rssi_hist
