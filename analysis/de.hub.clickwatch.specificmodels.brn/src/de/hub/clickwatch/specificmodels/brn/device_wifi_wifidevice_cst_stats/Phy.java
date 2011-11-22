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
 * A representation of the model object '<em><b>Phy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Phy#getEContainer_phy <em>EContainer phy</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Phy#getHwbusy <em>Hwbusy</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Phy#getHwrx <em>Hwrx</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Phy#getHwtx <em>Hwtx</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Phy#getLast_hw_stat_time <em>Last hw stat time</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Phy#getHw_stats_count <em>Hw stats count</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Phy#getAvg_noise <em>Avg noise</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Phy#getStd_noise <em>Std noise</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Phy#getAvg_rssi <em>Avg rssi</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Phy#getStd_rssi <em>Std rssi</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Phy#getCtl_rssi0 <em>Ctl rssi0</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Phy#getCtl_rssi1 <em>Ctl rssi1</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Phy#getCtl_rssi2 <em>Ctl rssi2</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Phy#getExt_rssi0 <em>Ext rssi0</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Phy#getExt_rssi1 <em>Ext rssi1</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Phy#getExt_rssi2 <em>Ext rssi2</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Phy#getChannel <em>Channel</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getPhy()
 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/channelstats|channelstats:Channelstats|EObject/phy|phy:Phy|EObject'"
 * @generated
 */
public interface Phy extends EObject {
    /**
     * Returns the value of the '<em><b>EContainer phy</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Channelstats#getPhy <em>Phy</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>EContainer phy</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>EContainer phy</em>' container reference.
     * @see #setEContainer_phy(Channelstats)
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getPhy_EContainer_phy()
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Channelstats#getPhy
     * @model opposite="phy" transient="false"
     * @generated
     */
    Channelstats getEContainer_phy();

    /**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Phy#getEContainer_phy <em>EContainer phy</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>EContainer phy</em>' container reference.
     * @see #getEContainer_phy()
     * @generated
     */
    void setEContainer_phy(Channelstats value);

    /**
     * Returns the value of the '<em><b>Hwbusy</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Hwbusy</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Hwbusy</em>' attribute.
     * @see #setHwbusy(int)
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getPhy_Hwbusy()
     * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/channelstats|channelstats:Channelstats|EObject/phy|phy:Phy|EObject/hwbusy|hwbusy:'"
     * @generated
     */
    int getHwbusy();

    /**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Phy#getHwbusy <em>Hwbusy</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Hwbusy</em>' attribute.
     * @see #getHwbusy()
     * @generated
     */
    void setHwbusy(int value);

    /**
     * Returns the value of the '<em><b>Hwrx</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Hwrx</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Hwrx</em>' attribute.
     * @see #setHwrx(int)
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getPhy_Hwrx()
     * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/channelstats|channelstats:Channelstats|EObject/phy|phy:Phy|EObject/hwrx|hwrx:'"
     * @generated
     */
    int getHwrx();

    /**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Phy#getHwrx <em>Hwrx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Hwrx</em>' attribute.
     * @see #getHwrx()
     * @generated
     */
    void setHwrx(int value);

    /**
     * Returns the value of the '<em><b>Hwtx</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Hwtx</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Hwtx</em>' attribute.
     * @see #setHwtx(int)
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getPhy_Hwtx()
     * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/channelstats|channelstats:Channelstats|EObject/phy|phy:Phy|EObject/hwtx|hwtx:'"
     * @generated
     */
    int getHwtx();

    /**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Phy#getHwtx <em>Hwtx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Hwtx</em>' attribute.
     * @see #getHwtx()
     * @generated
     */
    void setHwtx(int value);

    /**
     * Returns the value of the '<em><b>Last hw stat time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Last hw stat time</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Last hw stat time</em>' attribute.
     * @see #setLast_hw_stat_time(double)
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getPhy_Last_hw_stat_time()
     * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/channelstats|channelstats:Channelstats|EObject/phy|phy:Phy|EObject/last_hw_stat_time|last_hw_stat_time:'"
     * @generated
     */
    double getLast_hw_stat_time();

    /**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Phy#getLast_hw_stat_time <em>Last hw stat time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Last hw stat time</em>' attribute.
     * @see #getLast_hw_stat_time()
     * @generated
     */
    void setLast_hw_stat_time(double value);

    /**
     * Returns the value of the '<em><b>Hw stats count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Hw stats count</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Hw stats count</em>' attribute.
     * @see #setHw_stats_count(int)
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getPhy_Hw_stats_count()
     * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/channelstats|channelstats:Channelstats|EObject/phy|phy:Phy|EObject/hw_stats_count|hw_stats_count:'"
     * @generated
     */
    int getHw_stats_count();

    /**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Phy#getHw_stats_count <em>Hw stats count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Hw stats count</em>' attribute.
     * @see #getHw_stats_count()
     * @generated
     */
    void setHw_stats_count(int value);

    /**
     * Returns the value of the '<em><b>Avg noise</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Avg noise</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Avg noise</em>' attribute.
     * @see #setAvg_noise(int)
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getPhy_Avg_noise()
     * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/channelstats|channelstats:Channelstats|EObject/phy|phy:Phy|EObject/avg_noise|avg_noise:'"
     * @generated
     */
    int getAvg_noise();

    /**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Phy#getAvg_noise <em>Avg noise</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Avg noise</em>' attribute.
     * @see #getAvg_noise()
     * @generated
     */
    void setAvg_noise(int value);

    /**
     * Returns the value of the '<em><b>Std noise</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Std noise</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Std noise</em>' attribute.
     * @see #setStd_noise(int)
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getPhy_Std_noise()
     * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/channelstats|channelstats:Channelstats|EObject/phy|phy:Phy|EObject/std_noise|std_noise:'"
     * @generated
     */
    int getStd_noise();

    /**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Phy#getStd_noise <em>Std noise</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Std noise</em>' attribute.
     * @see #getStd_noise()
     * @generated
     */
    void setStd_noise(int value);

    /**
     * Returns the value of the '<em><b>Avg rssi</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Avg rssi</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Avg rssi</em>' attribute.
     * @see #setAvg_rssi(int)
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getPhy_Avg_rssi()
     * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/channelstats|channelstats:Channelstats|EObject/phy|phy:Phy|EObject/avg_rssi|avg_rssi:'"
     * @generated
     */
    int getAvg_rssi();

    /**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Phy#getAvg_rssi <em>Avg rssi</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Avg rssi</em>' attribute.
     * @see #getAvg_rssi()
     * @generated
     */
    void setAvg_rssi(int value);

    /**
     * Returns the value of the '<em><b>Std rssi</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Std rssi</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Std rssi</em>' attribute.
     * @see #setStd_rssi(int)
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getPhy_Std_rssi()
     * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/channelstats|channelstats:Channelstats|EObject/phy|phy:Phy|EObject/std_rssi|std_rssi:'"
     * @generated
     */
    int getStd_rssi();

    /**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Phy#getStd_rssi <em>Std rssi</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Std rssi</em>' attribute.
     * @see #getStd_rssi()
     * @generated
     */
    void setStd_rssi(int value);

    /**
     * Returns the value of the '<em><b>Ctl rssi0</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ctl rssi0</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ctl rssi0</em>' attribute.
     * @see #setCtl_rssi0(int)
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getPhy_Ctl_rssi0()
     * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/channelstats|channelstats:Channelstats|EObject/phy|phy:Phy|EObject/ctl_rssi0|ctl_rssi0:'"
     * @generated
     */
    int getCtl_rssi0();

    /**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Phy#getCtl_rssi0 <em>Ctl rssi0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ctl rssi0</em>' attribute.
     * @see #getCtl_rssi0()
     * @generated
     */
    void setCtl_rssi0(int value);

    /**
     * Returns the value of the '<em><b>Ctl rssi1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ctl rssi1</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ctl rssi1</em>' attribute.
     * @see #setCtl_rssi1(int)
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getPhy_Ctl_rssi1()
     * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/channelstats|channelstats:Channelstats|EObject/phy|phy:Phy|EObject/ctl_rssi1|ctl_rssi1:'"
     * @generated
     */
    int getCtl_rssi1();

    /**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Phy#getCtl_rssi1 <em>Ctl rssi1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ctl rssi1</em>' attribute.
     * @see #getCtl_rssi1()
     * @generated
     */
    void setCtl_rssi1(int value);

    /**
     * Returns the value of the '<em><b>Ctl rssi2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ctl rssi2</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ctl rssi2</em>' attribute.
     * @see #setCtl_rssi2(int)
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getPhy_Ctl_rssi2()
     * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/channelstats|channelstats:Channelstats|EObject/phy|phy:Phy|EObject/ctl_rssi2|ctl_rssi2:'"
     * @generated
     */
    int getCtl_rssi2();

    /**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Phy#getCtl_rssi2 <em>Ctl rssi2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ctl rssi2</em>' attribute.
     * @see #getCtl_rssi2()
     * @generated
     */
    void setCtl_rssi2(int value);

    /**
     * Returns the value of the '<em><b>Ext rssi0</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ext rssi0</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ext rssi0</em>' attribute.
     * @see #setExt_rssi0(int)
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getPhy_Ext_rssi0()
     * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/channelstats|channelstats:Channelstats|EObject/phy|phy:Phy|EObject/ext_rssi0|ext_rssi0:'"
     * @generated
     */
    int getExt_rssi0();

    /**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Phy#getExt_rssi0 <em>Ext rssi0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ext rssi0</em>' attribute.
     * @see #getExt_rssi0()
     * @generated
     */
    void setExt_rssi0(int value);

    /**
     * Returns the value of the '<em><b>Ext rssi1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ext rssi1</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ext rssi1</em>' attribute.
     * @see #setExt_rssi1(int)
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getPhy_Ext_rssi1()
     * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/channelstats|channelstats:Channelstats|EObject/phy|phy:Phy|EObject/ext_rssi1|ext_rssi1:'"
     * @generated
     */
    int getExt_rssi1();

    /**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Phy#getExt_rssi1 <em>Ext rssi1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ext rssi1</em>' attribute.
     * @see #getExt_rssi1()
     * @generated
     */
    void setExt_rssi1(int value);

    /**
     * Returns the value of the '<em><b>Ext rssi2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ext rssi2</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ext rssi2</em>' attribute.
     * @see #setExt_rssi2(int)
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getPhy_Ext_rssi2()
     * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/channelstats|channelstats:Channelstats|EObject/phy|phy:Phy|EObject/ext_rssi2|ext_rssi2:'"
     * @generated
     */
    int getExt_rssi2();

    /**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Phy#getExt_rssi2 <em>Ext rssi2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ext rssi2</em>' attribute.
     * @see #getExt_rssi2()
     * @generated
     */
    void setExt_rssi2(int value);

    /**
     * Returns the value of the '<em><b>Channel</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Channel</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Channel</em>' attribute.
     * @see #setChannel(int)
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getPhy_Channel()
     * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/channelstats|channelstats:Channelstats|EObject/phy|phy:Phy|EObject/channel|channel:'"
     * @generated
     */
    int getChannel();

    /**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Phy#getChannel <em>Channel</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Channel</em>' attribute.
     * @see #getChannel()
     * @generated
     */
    void setChannel(int value);

} // Phy
