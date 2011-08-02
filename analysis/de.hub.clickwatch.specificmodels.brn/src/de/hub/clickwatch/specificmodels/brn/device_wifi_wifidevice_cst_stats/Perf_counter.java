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
 * A representation of the model object '<em><b>Perf counter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Perf_counter#getEContainer_perf_counter <em>EContainer perf counter</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Perf_counter#getCycles <em>Cycles</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Perf_counter#getBusy_cycles <em>Busy cycles</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Perf_counter#getRx_cycles <em>Rx cycles</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Perf_counter#getTx_cycles <em>Tx cycles</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getPerf_counter()
 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/channelstats|channelstats:Channelstats|EObject/perf_counter|perf_counter:Perf_counter|EObject'"
 * @generated
 */
public interface Perf_counter extends EObject {
	/**
	 * Returns the value of the '<em><b>EContainer perf counter</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Channelstats#getPerf_counter <em>Perf counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EContainer perf counter</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EContainer perf counter</em>' container reference.
	 * @see #setEContainer_perf_counter(Channelstats)
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getPerf_counter_EContainer_perf_counter()
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Channelstats#getPerf_counter
	 * @model opposite="perf_counter" transient="false"
	 * @generated
	 */
	Channelstats getEContainer_perf_counter();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Perf_counter#getEContainer_perf_counter <em>EContainer perf counter</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EContainer perf counter</em>' container reference.
	 * @see #getEContainer_perf_counter()
	 * @generated
	 */
	void setEContainer_perf_counter(Channelstats value);

	/**
	 * Returns the value of the '<em><b>Cycles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cycles</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cycles</em>' attribute.
	 * @see #setCycles(int)
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getPerf_counter_Cycles()
	 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/channelstats|channelstats:Channelstats|EObject/perf_counter|perf_counter:Perf_counter|EObject/cycles|cycles:'"
	 * @generated
	 */
	int getCycles();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Perf_counter#getCycles <em>Cycles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cycles</em>' attribute.
	 * @see #getCycles()
	 * @generated
	 */
	void setCycles(int value);

	/**
	 * Returns the value of the '<em><b>Busy cycles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Busy cycles</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Busy cycles</em>' attribute.
	 * @see #setBusy_cycles(int)
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getPerf_counter_Busy_cycles()
	 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/channelstats|channelstats:Channelstats|EObject/perf_counter|perf_counter:Perf_counter|EObject/busy_cycles|busy_cycles:'"
	 * @generated
	 */
	int getBusy_cycles();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Perf_counter#getBusy_cycles <em>Busy cycles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Busy cycles</em>' attribute.
	 * @see #getBusy_cycles()
	 * @generated
	 */
	void setBusy_cycles(int value);

	/**
	 * Returns the value of the '<em><b>Rx cycles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rx cycles</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rx cycles</em>' attribute.
	 * @see #setRx_cycles(int)
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getPerf_counter_Rx_cycles()
	 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/channelstats|channelstats:Channelstats|EObject/perf_counter|perf_counter:Perf_counter|EObject/rx_cycles|rx_cycles:'"
	 * @generated
	 */
	int getRx_cycles();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Perf_counter#getRx_cycles <em>Rx cycles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rx cycles</em>' attribute.
	 * @see #getRx_cycles()
	 * @generated
	 */
	void setRx_cycles(int value);

	/**
	 * Returns the value of the '<em><b>Tx cycles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tx cycles</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tx cycles</em>' attribute.
	 * @see #setTx_cycles(int)
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getPerf_counter_Tx_cycles()
	 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/channelstats|channelstats:Channelstats|EObject/perf_counter|perf_counter:Perf_counter|EObject/tx_cycles|tx_cycles:'"
	 * @generated
	 */
	int getTx_cycles();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Perf_counter#getTx_cycles <em>Tx cycles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tx cycles</em>' attribute.
	 * @see #getTx_cycles()
	 * @generated
	 */
	void setTx_cycles(int value);

} // Perf_counter
