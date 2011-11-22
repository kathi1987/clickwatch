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
 * A representation of the model object '<em><b>Mac</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac#getEContainer_mac <em>EContainer mac</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac#getPackets <em>Packets</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac#getRx_pkt <em>Rx pkt</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac#getNo_err_pkt <em>No err pkt</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac#getCrc_err_pkt <em>Crc err pkt</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac#getPhy_err_pkt <em>Phy err pkt</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac#getUnknown_err_pkt <em>Unknown err pkt</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac#getTx_pkt <em>Tx pkt</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac#getRx_unicast_pkt <em>Rx unicast pkt</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac#getRx_retry_pkt <em>Rx retry pkt</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac#getRx_bcast_pkt <em>Rx bcast pkt</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac#getRx_bytes <em>Rx bytes</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac#getTx_unicast_pkt <em>Tx unicast pkt</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac#getTx_retry_pkt <em>Tx retry pkt</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac#getTx_bcast_pkt <em>Tx bcast pkt</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac#getTx_bytes <em>Tx bytes</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac#getZero_err_pkt <em>Zero err pkt</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac#getLast_packet_time <em>Last packet time</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac#getNo_src <em>No src</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getMac()
 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/channelstats|channelstats:Channelstats|EObject/mac|mac:Mac|EObject'"
 * @generated
 */
public interface Mac extends EObject {
    /**
     * Returns the value of the '<em><b>EContainer mac</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Channelstats#getMac <em>Mac</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>EContainer mac</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>EContainer mac</em>' container reference.
     * @see #setEContainer_mac(Channelstats)
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getMac_EContainer_mac()
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Channelstats#getMac
     * @model opposite="mac" transient="false"
     * @generated
     */
    Channelstats getEContainer_mac();

    /**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac#getEContainer_mac <em>EContainer mac</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>EContainer mac</em>' container reference.
     * @see #getEContainer_mac()
     * @generated
     */
    void setEContainer_mac(Channelstats value);

    /**
     * Returns the value of the '<em><b>Packets</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Packets</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Packets</em>' attribute.
     * @see #setPackets(int)
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getMac_Packets()
     * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/channelstats|channelstats:Channelstats|EObject/mac|mac:Mac|EObject/packets|packets:'"
     * @generated
     */
    int getPackets();

    /**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac#getPackets <em>Packets</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Packets</em>' attribute.
     * @see #getPackets()
     * @generated
     */
    void setPackets(int value);

    /**
     * Returns the value of the '<em><b>Rx pkt</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rx pkt</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rx pkt</em>' attribute.
     * @see #setRx_pkt(int)
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getMac_Rx_pkt()
     * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/channelstats|channelstats:Channelstats|EObject/mac|mac:Mac|EObject/rx_pkt|rx_pkt:'"
     * @generated
     */
    int getRx_pkt();

    /**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac#getRx_pkt <em>Rx pkt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rx pkt</em>' attribute.
     * @see #getRx_pkt()
     * @generated
     */
    void setRx_pkt(int value);

    /**
     * Returns the value of the '<em><b>No err pkt</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>No err pkt</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>No err pkt</em>' attribute.
     * @see #setNo_err_pkt(int)
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getMac_No_err_pkt()
     * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/channelstats|channelstats:Channelstats|EObject/mac|mac:Mac|EObject/no_err_pkt|no_err_pkt:'"
     * @generated
     */
    int getNo_err_pkt();

    /**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac#getNo_err_pkt <em>No err pkt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>No err pkt</em>' attribute.
     * @see #getNo_err_pkt()
     * @generated
     */
    void setNo_err_pkt(int value);

    /**
     * Returns the value of the '<em><b>Crc err pkt</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Crc err pkt</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Crc err pkt</em>' attribute.
     * @see #setCrc_err_pkt(int)
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getMac_Crc_err_pkt()
     * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/channelstats|channelstats:Channelstats|EObject/mac|mac:Mac|EObject/crc_err_pkt|crc_err_pkt:'"
     * @generated
     */
    int getCrc_err_pkt();

    /**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac#getCrc_err_pkt <em>Crc err pkt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Crc err pkt</em>' attribute.
     * @see #getCrc_err_pkt()
     * @generated
     */
    void setCrc_err_pkt(int value);

    /**
     * Returns the value of the '<em><b>Phy err pkt</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Phy err pkt</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Phy err pkt</em>' attribute.
     * @see #setPhy_err_pkt(int)
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getMac_Phy_err_pkt()
     * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/channelstats|channelstats:Channelstats|EObject/mac|mac:Mac|EObject/phy_err_pkt|phy_err_pkt:'"
     * @generated
     */
    int getPhy_err_pkt();

    /**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac#getPhy_err_pkt <em>Phy err pkt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Phy err pkt</em>' attribute.
     * @see #getPhy_err_pkt()
     * @generated
     */
    void setPhy_err_pkt(int value);

    /**
     * Returns the value of the '<em><b>Unknown err pkt</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Unknown err pkt</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Unknown err pkt</em>' attribute.
     * @see #setUnknown_err_pkt(int)
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getMac_Unknown_err_pkt()
     * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/channelstats|channelstats:Channelstats|EObject/mac|mac:Mac|EObject/unknown_err_pkt|unknown_err_pkt:'"
     * @generated
     */
    int getUnknown_err_pkt();

    /**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac#getUnknown_err_pkt <em>Unknown err pkt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Unknown err pkt</em>' attribute.
     * @see #getUnknown_err_pkt()
     * @generated
     */
    void setUnknown_err_pkt(int value);

    /**
     * Returns the value of the '<em><b>Tx pkt</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tx pkt</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tx pkt</em>' attribute.
     * @see #setTx_pkt(int)
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getMac_Tx_pkt()
     * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/channelstats|channelstats:Channelstats|EObject/mac|mac:Mac|EObject/tx_pkt|tx_pkt:'"
     * @generated
     */
    int getTx_pkt();

    /**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac#getTx_pkt <em>Tx pkt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tx pkt</em>' attribute.
     * @see #getTx_pkt()
     * @generated
     */
    void setTx_pkt(int value);

    /**
     * Returns the value of the '<em><b>Rx unicast pkt</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rx unicast pkt</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rx unicast pkt</em>' attribute.
     * @see #setRx_unicast_pkt(int)
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getMac_Rx_unicast_pkt()
     * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/channelstats|channelstats:Channelstats|EObject/mac|mac:Mac|EObject/rx_unicast_pkt|rx_unicast_pkt:'"
     * @generated
     */
    int getRx_unicast_pkt();

    /**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac#getRx_unicast_pkt <em>Rx unicast pkt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rx unicast pkt</em>' attribute.
     * @see #getRx_unicast_pkt()
     * @generated
     */
    void setRx_unicast_pkt(int value);

    /**
     * Returns the value of the '<em><b>Rx retry pkt</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rx retry pkt</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rx retry pkt</em>' attribute.
     * @see #setRx_retry_pkt(int)
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getMac_Rx_retry_pkt()
     * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/channelstats|channelstats:Channelstats|EObject/mac|mac:Mac|EObject/rx_retry_pkt|rx_retry_pkt:'"
     * @generated
     */
    int getRx_retry_pkt();

    /**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac#getRx_retry_pkt <em>Rx retry pkt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rx retry pkt</em>' attribute.
     * @see #getRx_retry_pkt()
     * @generated
     */
    void setRx_retry_pkt(int value);

    /**
     * Returns the value of the '<em><b>Rx bcast pkt</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rx bcast pkt</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rx bcast pkt</em>' attribute.
     * @see #setRx_bcast_pkt(int)
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getMac_Rx_bcast_pkt()
     * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/channelstats|channelstats:Channelstats|EObject/mac|mac:Mac|EObject/rx_bcast_pkt|rx_bcast_pkt:'"
     * @generated
     */
    int getRx_bcast_pkt();

    /**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac#getRx_bcast_pkt <em>Rx bcast pkt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rx bcast pkt</em>' attribute.
     * @see #getRx_bcast_pkt()
     * @generated
     */
    void setRx_bcast_pkt(int value);

    /**
     * Returns the value of the '<em><b>Rx bytes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rx bytes</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rx bytes</em>' attribute.
     * @see #setRx_bytes(int)
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getMac_Rx_bytes()
     * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/channelstats|channelstats:Channelstats|EObject/mac|mac:Mac|EObject/rx_bytes|rx_bytes:'"
     * @generated
     */
    int getRx_bytes();

    /**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac#getRx_bytes <em>Rx bytes</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rx bytes</em>' attribute.
     * @see #getRx_bytes()
     * @generated
     */
    void setRx_bytes(int value);

    /**
     * Returns the value of the '<em><b>Tx unicast pkt</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tx unicast pkt</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tx unicast pkt</em>' attribute.
     * @see #setTx_unicast_pkt(int)
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getMac_Tx_unicast_pkt()
     * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/channelstats|channelstats:Channelstats|EObject/mac|mac:Mac|EObject/tx_unicast_pkt|tx_unicast_pkt:'"
     * @generated
     */
    int getTx_unicast_pkt();

    /**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac#getTx_unicast_pkt <em>Tx unicast pkt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tx unicast pkt</em>' attribute.
     * @see #getTx_unicast_pkt()
     * @generated
     */
    void setTx_unicast_pkt(int value);

    /**
     * Returns the value of the '<em><b>Tx retry pkt</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tx retry pkt</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tx retry pkt</em>' attribute.
     * @see #setTx_retry_pkt(int)
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getMac_Tx_retry_pkt()
     * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/channelstats|channelstats:Channelstats|EObject/mac|mac:Mac|EObject/tx_retry_pkt|tx_retry_pkt:'"
     * @generated
     */
    int getTx_retry_pkt();

    /**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac#getTx_retry_pkt <em>Tx retry pkt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tx retry pkt</em>' attribute.
     * @see #getTx_retry_pkt()
     * @generated
     */
    void setTx_retry_pkt(int value);

    /**
     * Returns the value of the '<em><b>Tx bcast pkt</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tx bcast pkt</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tx bcast pkt</em>' attribute.
     * @see #setTx_bcast_pkt(int)
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getMac_Tx_bcast_pkt()
     * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/channelstats|channelstats:Channelstats|EObject/mac|mac:Mac|EObject/tx_bcast_pkt|tx_bcast_pkt:'"
     * @generated
     */
    int getTx_bcast_pkt();

    /**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac#getTx_bcast_pkt <em>Tx bcast pkt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tx bcast pkt</em>' attribute.
     * @see #getTx_bcast_pkt()
     * @generated
     */
    void setTx_bcast_pkt(int value);

    /**
     * Returns the value of the '<em><b>Tx bytes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tx bytes</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tx bytes</em>' attribute.
     * @see #setTx_bytes(int)
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getMac_Tx_bytes()
     * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/channelstats|channelstats:Channelstats|EObject/mac|mac:Mac|EObject/tx_bytes|tx_bytes:'"
     * @generated
     */
    int getTx_bytes();

    /**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac#getTx_bytes <em>Tx bytes</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tx bytes</em>' attribute.
     * @see #getTx_bytes()
     * @generated
     */
    void setTx_bytes(int value);

    /**
     * Returns the value of the '<em><b>Zero err pkt</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Zero err pkt</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Zero err pkt</em>' attribute.
     * @see #setZero_err_pkt(int)
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getMac_Zero_err_pkt()
     * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/channelstats|channelstats:Channelstats|EObject/mac|mac:Mac|EObject/zero_err_pkt|zero_err_pkt:'"
     * @generated
     */
    int getZero_err_pkt();

    /**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac#getZero_err_pkt <em>Zero err pkt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Zero err pkt</em>' attribute.
     * @see #getZero_err_pkt()
     * @generated
     */
    void setZero_err_pkt(int value);

    /**
     * Returns the value of the '<em><b>Last packet time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Last packet time</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Last packet time</em>' attribute.
     * @see #setLast_packet_time(double)
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getMac_Last_packet_time()
     * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/channelstats|channelstats:Channelstats|EObject/mac|mac:Mac|EObject/last_packet_time|last_packet_time:'"
     * @generated
     */
    double getLast_packet_time();

    /**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac#getLast_packet_time <em>Last packet time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Last packet time</em>' attribute.
     * @see #getLast_packet_time()
     * @generated
     */
    void setLast_packet_time(double value);

    /**
     * Returns the value of the '<em><b>No src</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>No src</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>No src</em>' attribute.
     * @see #setNo_src(int)
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getMac_No_src()
     * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/channelstats|channelstats:Channelstats|EObject/mac|mac:Mac|EObject/no_src|no_src:'"
     * @generated
     */
    int getNo_src();

    /**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac#getNo_src <em>No src</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>No src</em>' attribute.
     * @see #getNo_src()
     * @generated
     */
    void setNo_src(int value);

} // Mac
