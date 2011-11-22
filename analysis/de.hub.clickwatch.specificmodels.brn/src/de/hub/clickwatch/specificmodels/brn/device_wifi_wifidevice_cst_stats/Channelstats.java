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
 * A representation of the model object '<em><b>Channelstats</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Channelstats#getEContainer_channelstats <em>EContainer channelstats</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Channelstats#getText <em>Text</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Channelstats#getMac <em>Mac</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Channelstats#getMac_percentage <em>Mac percentage</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Channelstats#getMac_duration <em>Mac duration</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Channelstats#getPhy <em>Phy</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Channelstats#getPerf_counter <em>Perf counter</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Channelstats#getNeighbourstats <em>Neighbourstats</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Channelstats#getNode <em>Node</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Channelstats#getTime <em>Time</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Channelstats#getId <em>Id</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Channelstats#getLength <em>Length</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Channelstats#getHw_duration <em>Hw duration</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Channelstats#getUnit <em>Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getChannelstats()
 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/channelstats|channelstats:Channelstats|EObject'"
 * @generated
 */
public interface Channelstats extends EObject {
    /**
     * Returns the value of the '<em><b>EContainer channelstats</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Stats#getChannelstats <em>Channelstats</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>EContainer channelstats</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>EContainer channelstats</em>' container reference.
     * @see #setEContainer_channelstats(Stats)
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getChannelstats_EContainer_channelstats()
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Stats#getChannelstats
     * @model opposite="channelstats" transient="false"
     * @generated
     */
    Stats getEContainer_channelstats();

    /**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Channelstats#getEContainer_channelstats <em>EContainer channelstats</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>EContainer channelstats</em>' container reference.
     * @see #getEContainer_channelstats()
     * @generated
     */
    void setEContainer_channelstats(Stats value);

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
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getChannelstats_Text()
     * @model unique="false"
     *        annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/channelstats|channelstats:Channelstats|EObject/text|text:'"
     * @generated
     */
    EList<String> getText();

    /**
     * Returns the value of the '<em><b>Mac</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac#getEContainer_mac <em>EContainer mac</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mac</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Mac</em>' containment reference.
     * @see #setMac(Mac)
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getChannelstats_Mac()
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac#getEContainer_mac
     * @model opposite="eContainer_mac" containment="true"
     *        annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/channelstats|channelstats:Channelstats|EObject/mac|mac:Mac|EObject' IsCopy='false'"
     * @generated
     */
    Mac getMac();

    /**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Channelstats#getMac <em>Mac</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Mac</em>' containment reference.
     * @see #getMac()
     * @generated
     */
    void setMac(Mac value);

    /**
     * Returns the value of the '<em><b>Mac percentage</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac_percentage#getEContainer_mac_percentage <em>EContainer mac percentage</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mac percentage</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Mac percentage</em>' containment reference.
     * @see #setMac_percentage(Mac_percentage)
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getChannelstats_Mac_percentage()
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac_percentage#getEContainer_mac_percentage
     * @model opposite="eContainer_mac_percentage" containment="true"
     *        annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/channelstats|channelstats:Channelstats|EObject/mac_percentage|mac_percentage:Mac_percentage|EObject' IsCopy='false'"
     * @generated
     */
    Mac_percentage getMac_percentage();

    /**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Channelstats#getMac_percentage <em>Mac percentage</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Mac percentage</em>' containment reference.
     * @see #getMac_percentage()
     * @generated
     */
    void setMac_percentage(Mac_percentage value);

    /**
     * Returns the value of the '<em><b>Mac duration</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac_duration#getEContainer_mac_duration <em>EContainer mac duration</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mac duration</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Mac duration</em>' containment reference.
     * @see #setMac_duration(Mac_duration)
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getChannelstats_Mac_duration()
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac_duration#getEContainer_mac_duration
     * @model opposite="eContainer_mac_duration" containment="true"
     *        annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/channelstats|channelstats:Channelstats|EObject/mac_duration|mac_duration:Mac_duration|EObject' IsCopy='false'"
     * @generated
     */
    Mac_duration getMac_duration();

    /**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Channelstats#getMac_duration <em>Mac duration</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Mac duration</em>' containment reference.
     * @see #getMac_duration()
     * @generated
     */
    void setMac_duration(Mac_duration value);

    /**
     * Returns the value of the '<em><b>Phy</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Phy#getEContainer_phy <em>EContainer phy</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Phy</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Phy</em>' containment reference.
     * @see #setPhy(Phy)
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getChannelstats_Phy()
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Phy#getEContainer_phy
     * @model opposite="eContainer_phy" containment="true"
     *        annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/channelstats|channelstats:Channelstats|EObject/phy|phy:Phy|EObject' IsCopy='false'"
     * @generated
     */
    Phy getPhy();

    /**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Channelstats#getPhy <em>Phy</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Phy</em>' containment reference.
     * @see #getPhy()
     * @generated
     */
    void setPhy(Phy value);

    /**
     * Returns the value of the '<em><b>Perf counter</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Perf_counter#getEContainer_perf_counter <em>EContainer perf counter</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Perf counter</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Perf counter</em>' containment reference.
     * @see #setPerf_counter(Perf_counter)
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getChannelstats_Perf_counter()
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Perf_counter#getEContainer_perf_counter
     * @model opposite="eContainer_perf_counter" containment="true"
     *        annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/channelstats|channelstats:Channelstats|EObject/perf_counter|perf_counter:Perf_counter|EObject' IsCopy='false'"
     * @generated
     */
    Perf_counter getPerf_counter();

    /**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Channelstats#getPerf_counter <em>Perf counter</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Perf counter</em>' containment reference.
     * @see #getPerf_counter()
     * @generated
     */
    void setPerf_counter(Perf_counter value);

    /**
     * Returns the value of the '<em><b>Neighbourstats</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Neighbourstats#getEContainer_neighbourstats <em>EContainer neighbourstats</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Neighbourstats</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Neighbourstats</em>' containment reference.
     * @see #setNeighbourstats(Neighbourstats)
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getChannelstats_Neighbourstats()
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Neighbourstats#getEContainer_neighbourstats
     * @model opposite="eContainer_neighbourstats" containment="true"
     *        annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/channelstats|channelstats:Channelstats|EObject/neighbourstats|neighbourstats:Neighbourstats|EObject' IsCopy='false'"
     * @generated
     */
    Neighbourstats getNeighbourstats();

    /**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Channelstats#getNeighbourstats <em>Neighbourstats</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Neighbourstats</em>' containment reference.
     * @see #getNeighbourstats()
     * @generated
     */
    void setNeighbourstats(Neighbourstats value);

    /**
     * Returns the value of the '<em><b>Node</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Node</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Node</em>' attribute.
     * @see #setNode(String)
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getChannelstats_Node()
     * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/channelstats|channelstats:Channelstats|EObject/node|node:'"
     * @generated
     */
    String getNode();

    /**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Channelstats#getNode <em>Node</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Node</em>' attribute.
     * @see #getNode()
     * @generated
     */
    void setNode(String value);

    /**
     * Returns the value of the '<em><b>Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Time</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Time</em>' attribute.
     * @see #setTime(double)
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getChannelstats_Time()
     * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/channelstats|channelstats:Channelstats|EObject/time|time:'"
     * @generated
     */
    double getTime();

    /**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Channelstats#getTime <em>Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Time</em>' attribute.
     * @see #getTime()
     * @generated
     */
    void setTime(double value);

    /**
     * Returns the value of the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Id</em>' attribute.
     * @see #setId(int)
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getChannelstats_Id()
     * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/channelstats|channelstats:Channelstats|EObject/id|id:'"
     * @generated
     */
    int getId();

    /**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Channelstats#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Id</em>' attribute.
     * @see #getId()
     * @generated
     */
    void setId(int value);

    /**
     * Returns the value of the '<em><b>Length</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Length</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Length</em>' attribute.
     * @see #setLength(int)
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getChannelstats_Length()
     * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/channelstats|channelstats:Channelstats|EObject/length|length:'"
     * @generated
     */
    int getLength();

    /**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Channelstats#getLength <em>Length</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Length</em>' attribute.
     * @see #getLength()
     * @generated
     */
    void setLength(int value);

    /**
     * Returns the value of the '<em><b>Hw duration</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Hw duration</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Hw duration</em>' attribute.
     * @see #setHw_duration(int)
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getChannelstats_Hw_duration()
     * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/channelstats|channelstats:Channelstats|EObject/hw_duration|hw_duration:'"
     * @generated
     */
    int getHw_duration();

    /**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Channelstats#getHw_duration <em>Hw duration</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Hw duration</em>' attribute.
     * @see #getHw_duration()
     * @generated
     */
    void setHw_duration(int value);

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
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getChannelstats_Unit()
     * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/channelstats|channelstats:Channelstats|EObject/unit|unit:'"
     * @generated
     */
    String getUnit();

    /**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Channelstats#getUnit <em>Unit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Unit</em>' attribute.
     * @see #getUnit()
     * @generated
     */
    void setUnit(String value);

} // Channelstats
