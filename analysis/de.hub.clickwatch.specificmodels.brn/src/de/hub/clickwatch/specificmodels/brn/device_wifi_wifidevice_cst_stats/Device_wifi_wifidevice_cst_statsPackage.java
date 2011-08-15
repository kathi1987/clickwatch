/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import de.hub.clickwatch.model.ClickWatchModelPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsFactory
 * @model kind="package"
 *        annotation="http://de.hub.clickwatch.specificmodels handler_class='Stats' handler_name='device_wifi/wifidevice/cst/stats'"
 * @generated
 */
public interface Device_wifi_wifidevice_cst_statsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "device_wifi_wifidevice_cst_stats";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://de.hub.clickwatch.specificmodels.brn/device_wifi/wifidevice/cst/stats";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "device_wifi_wifidevice_cst_stats";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Device_wifi_wifidevice_cst_statsPackage eINSTANCE = de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.Device_wifi_wifidevice_cst_statsPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.ChannelstatsImpl <em>Channelstats</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.ChannelstatsImpl
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.Device_wifi_wifidevice_cst_statsPackageImpl#getChannelstats()
	 * @generated
	 */
	int CHANNELSTATS = 0;

	/**
	 * The feature id for the '<em><b>EContainer channelstats</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNELSTATS__ECONTAINER_CHANNELSTATS = 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNELSTATS__TEXT = 1;

	/**
	 * The feature id for the '<em><b>Mac</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNELSTATS__MAC = 2;

	/**
	 * The feature id for the '<em><b>Mac percentage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNELSTATS__MAC_PERCENTAGE = 3;

	/**
	 * The feature id for the '<em><b>Mac duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNELSTATS__MAC_DURATION = 4;

	/**
	 * The feature id for the '<em><b>Phy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNELSTATS__PHY = 5;

	/**
	 * The feature id for the '<em><b>Perf counter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNELSTATS__PERF_COUNTER = 6;

	/**
	 * The feature id for the '<em><b>Neighbourstats</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNELSTATS__NEIGHBOURSTATS = 7;

	/**
	 * The feature id for the '<em><b>Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNELSTATS__NODE = 8;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNELSTATS__TIME = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNELSTATS__ID = 10;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNELSTATS__LENGTH = 11;

	/**
	 * The feature id for the '<em><b>Hw duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNELSTATS__HW_DURATION = 12;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNELSTATS__UNIT = 13;

	/**
	 * The number of structural features of the '<em>Channelstats</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNELSTATS_FEATURE_COUNT = 14;

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.CtlImpl <em>Ctl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.CtlImpl
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.Device_wifi_wifidevice_cst_statsPackageImpl#getCtl()
	 * @generated
	 */
	int CTL = 1;

	/**
	 * The feature id for the '<em><b>EContainer ctl</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTL__ECONTAINER_CTL = 0;

	/**
	 * The feature id for the '<em><b>Rssi0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTL__RSSI0 = 1;

	/**
	 * The feature id for the '<em><b>Rssi1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTL__RSSI1 = 2;

	/**
	 * The feature id for the '<em><b>Rssi2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTL__RSSI2 = 3;

	/**
	 * The number of structural features of the '<em>Ctl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTL_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.ExtImpl <em>Ext</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.ExtImpl
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.Device_wifi_wifidevice_cst_statsPackageImpl#getExt()
	 * @generated
	 */
	int EXT = 2;

	/**
	 * The feature id for the '<em><b>EContainer ext</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXT__ECONTAINER_EXT = 0;

	/**
	 * The feature id for the '<em><b>Rssi0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXT__RSSI0 = 1;

	/**
	 * The feature id for the '<em><b>Rssi1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXT__RSSI1 = 2;

	/**
	 * The feature id for the '<em><b>Rssi2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXT__RSSI2 = 3;

	/**
	 * The number of structural features of the '<em>Ext</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.MacImpl <em>Mac</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.MacImpl
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.Device_wifi_wifidevice_cst_statsPackageImpl#getMac()
	 * @generated
	 */
	int MAC = 3;

	/**
	 * The feature id for the '<em><b>EContainer mac</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAC__ECONTAINER_MAC = 0;

	/**
	 * The feature id for the '<em><b>Packets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAC__PACKETS = 1;

	/**
	 * The feature id for the '<em><b>Rx pkt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAC__RX_PKT = 2;

	/**
	 * The feature id for the '<em><b>No err pkt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAC__NO_ERR_PKT = 3;

	/**
	 * The feature id for the '<em><b>Crc err pkt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAC__CRC_ERR_PKT = 4;

	/**
	 * The feature id for the '<em><b>Phy err pkt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAC__PHY_ERR_PKT = 5;

	/**
	 * The feature id for the '<em><b>Unknown err pkt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAC__UNKNOWN_ERR_PKT = 6;

	/**
	 * The feature id for the '<em><b>Tx pkt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAC__TX_PKT = 7;

	/**
	 * The feature id for the '<em><b>Rx unicast pkt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAC__RX_UNICAST_PKT = 8;

	/**
	 * The feature id for the '<em><b>Rx retry pkt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAC__RX_RETRY_PKT = 9;

	/**
	 * The feature id for the '<em><b>Rx bcast pkt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAC__RX_BCAST_PKT = 10;

	/**
	 * The feature id for the '<em><b>Rx bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAC__RX_BYTES = 11;

	/**
	 * The feature id for the '<em><b>Tx unicast pkt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAC__TX_UNICAST_PKT = 12;

	/**
	 * The feature id for the '<em><b>Tx retry pkt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAC__TX_RETRY_PKT = 13;

	/**
	 * The feature id for the '<em><b>Tx bcast pkt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAC__TX_BCAST_PKT = 14;

	/**
	 * The feature id for the '<em><b>Tx bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAC__TX_BYTES = 15;

	/**
	 * The feature id for the '<em><b>Zero err pkt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAC__ZERO_ERR_PKT = 16;

	/**
	 * The feature id for the '<em><b>Last packet time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAC__LAST_PACKET_TIME = 17;

	/**
	 * The feature id for the '<em><b>No src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAC__NO_SRC = 18;

	/**
	 * The number of structural features of the '<em>Mac</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAC_FEATURE_COUNT = 19;

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.Mac_durationImpl <em>Mac duration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.Mac_durationImpl
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.Device_wifi_wifidevice_cst_statsPackageImpl#getMac_duration()
	 * @generated
	 */
	int MAC_DURATION = 4;

	/**
	 * The feature id for the '<em><b>EContainer mac duration</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAC_DURATION__ECONTAINER_MAC_DURATION = 0;

	/**
	 * The feature id for the '<em><b>Busy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAC_DURATION__BUSY = 1;

	/**
	 * The feature id for the '<em><b>Rx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAC_DURATION__RX = 2;

	/**
	 * The feature id for the '<em><b>Tx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAC_DURATION__TX = 3;

	/**
	 * The feature id for the '<em><b>Noerr rx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAC_DURATION__NOERR_RX = 4;

	/**
	 * The feature id for the '<em><b>Crc rx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAC_DURATION__CRC_RX = 5;

	/**
	 * The feature id for the '<em><b>Phy rx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAC_DURATION__PHY_RX = 6;

	/**
	 * The feature id for the '<em><b>Unknown err rx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAC_DURATION__UNKNOWN_ERR_RX = 7;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAC_DURATION__UNIT = 8;

	/**
	 * The number of structural features of the '<em>Mac duration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAC_DURATION_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.Mac_percentageImpl <em>Mac percentage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.Mac_percentageImpl
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.Device_wifi_wifidevice_cst_statsPackageImpl#getMac_percentage()
	 * @generated
	 */
	int MAC_PERCENTAGE = 5;

	/**
	 * The feature id for the '<em><b>EContainer mac percentage</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAC_PERCENTAGE__ECONTAINER_MAC_PERCENTAGE = 0;

	/**
	 * The feature id for the '<em><b>Busy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAC_PERCENTAGE__BUSY = 1;

	/**
	 * The feature id for the '<em><b>Rx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAC_PERCENTAGE__RX = 2;

	/**
	 * The feature id for the '<em><b>Tx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAC_PERCENTAGE__TX = 3;

	/**
	 * The feature id for the '<em><b>Noerr rx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAC_PERCENTAGE__NOERR_RX = 4;

	/**
	 * The feature id for the '<em><b>Crc rx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAC_PERCENTAGE__CRC_RX = 5;

	/**
	 * The feature id for the '<em><b>Phy rx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAC_PERCENTAGE__PHY_RX = 6;

	/**
	 * The feature id for the '<em><b>Unknown err rx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAC_PERCENTAGE__UNKNOWN_ERR_RX = 7;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAC_PERCENTAGE__UNIT = 8;

	/**
	 * The number of structural features of the '<em>Mac percentage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAC_PERCENTAGE_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.NbImpl <em>Nb</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.NbImpl
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.Device_wifi_wifidevice_cst_statsPackageImpl#getNb()
	 * @generated
	 */
	int NB = 6;

	/**
	 * The feature id for the '<em><b>EContainer nb</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB__ECONTAINER_NB = 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB__TEXT = 1;

	/**
	 * The feature id for the '<em><b>Rssi extended</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB__RSSI_EXTENDED = 2;

	/**
	 * The feature id for the '<em><b>Rssi hist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB__RSSI_HIST = 3;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB__ADDR = 4;

	/**
	 * The feature id for the '<em><b>Rssi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB__RSSI = 5;

	/**
	 * The feature id for the '<em><b>Std rssi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB__STD_RSSI = 6;

	/**
	 * The feature id for the '<em><b>Min rssi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB__MIN_RSSI = 7;

	/**
	 * The feature id for the '<em><b>Max rssi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB__MAX_RSSI = 8;

	/**
	 * The feature id for the '<em><b>Pkt cnt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB__PKT_CNT = 9;

	/**
	 * The feature id for the '<em><b>Rx bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB__RX_BYTES = 10;

	/**
	 * The number of structural features of the '<em>Nb</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NB_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.NeighbourstatsImpl <em>Neighbourstats</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.NeighbourstatsImpl
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.Device_wifi_wifidevice_cst_statsPackageImpl#getNeighbourstats()
	 * @generated
	 */
	int NEIGHBOURSTATS = 7;

	/**
	 * The feature id for the '<em><b>EContainer neighbourstats</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEIGHBOURSTATS__ECONTAINER_NEIGHBOURSTATS = 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEIGHBOURSTATS__TEXT = 1;

	/**
	 * The feature id for the '<em><b>Nb</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEIGHBOURSTATS__NB = 2;

	/**
	 * The number of structural features of the '<em>Neighbourstats</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEIGHBOURSTATS_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.Perf_counterImpl <em>Perf counter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.Perf_counterImpl
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.Device_wifi_wifidevice_cst_statsPackageImpl#getPerf_counter()
	 * @generated
	 */
	int PERF_COUNTER = 8;

	/**
	 * The feature id for the '<em><b>EContainer perf counter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERF_COUNTER__ECONTAINER_PERF_COUNTER = 0;

	/**
	 * The feature id for the '<em><b>Cycles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERF_COUNTER__CYCLES = 1;

	/**
	 * The feature id for the '<em><b>Busy cycles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERF_COUNTER__BUSY_CYCLES = 2;

	/**
	 * The feature id for the '<em><b>Rx cycles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERF_COUNTER__RX_CYCLES = 3;

	/**
	 * The feature id for the '<em><b>Tx cycles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERF_COUNTER__TX_CYCLES = 4;

	/**
	 * The number of structural features of the '<em>Perf counter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERF_COUNTER_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.PhyImpl <em>Phy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.PhyImpl
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.Device_wifi_wifidevice_cst_statsPackageImpl#getPhy()
	 * @generated
	 */
	int PHY = 9;

	/**
	 * The feature id for the '<em><b>EContainer phy</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHY__ECONTAINER_PHY = 0;

	/**
	 * The feature id for the '<em><b>Hwbusy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHY__HWBUSY = 1;

	/**
	 * The feature id for the '<em><b>Hwrx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHY__HWRX = 2;

	/**
	 * The feature id for the '<em><b>Hwtx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHY__HWTX = 3;

	/**
	 * The feature id for the '<em><b>Last hw stat time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHY__LAST_HW_STAT_TIME = 4;

	/**
	 * The feature id for the '<em><b>Hw stats count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHY__HW_STATS_COUNT = 5;

	/**
	 * The feature id for the '<em><b>Avg noise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHY__AVG_NOISE = 6;

	/**
	 * The feature id for the '<em><b>Std noise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHY__STD_NOISE = 7;

	/**
	 * The feature id for the '<em><b>Avg rssi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHY__AVG_RSSI = 8;

	/**
	 * The feature id for the '<em><b>Std rssi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHY__STD_RSSI = 9;

	/**
	 * The feature id for the '<em><b>Ctl rssi0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHY__CTL_RSSI0 = 10;

	/**
	 * The feature id for the '<em><b>Ctl rssi1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHY__CTL_RSSI1 = 11;

	/**
	 * The feature id for the '<em><b>Ctl rssi2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHY__CTL_RSSI2 = 12;

	/**
	 * The feature id for the '<em><b>Ext rssi0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHY__EXT_RSSI0 = 13;

	/**
	 * The feature id for the '<em><b>Ext rssi1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHY__EXT_RSSI1 = 14;

	/**
	 * The feature id for the '<em><b>Ext rssi2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHY__EXT_RSSI2 = 15;

	/**
	 * The feature id for the '<em><b>Channel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHY__CHANNEL = 16;

	/**
	 * The number of structural features of the '<em>Phy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHY_FEATURE_COUNT = 17;

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.Rssi_extendedImpl <em>Rssi extended</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.Rssi_extendedImpl
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.Device_wifi_wifidevice_cst_statsPackageImpl#getRssi_extended()
	 * @generated
	 */
	int RSSI_EXTENDED = 10;

	/**
	 * The feature id for the '<em><b>EContainer rssi extended</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSSI_EXTENDED__ECONTAINER_RSSI_EXTENDED = 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSSI_EXTENDED__TEXT = 1;

	/**
	 * The feature id for the '<em><b>Ctl</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSSI_EXTENDED__CTL = 2;

	/**
	 * The feature id for the '<em><b>Ext</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSSI_EXTENDED__EXT = 3;

	/**
	 * The number of structural features of the '<em>Rssi extended</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSSI_EXTENDED_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.Rssi_histImpl <em>Rssi hist</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.Rssi_histImpl
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.Device_wifi_wifidevice_cst_statsPackageImpl#getRssi_hist()
	 * @generated
	 */
	int RSSI_HIST = 11;

	/**
	 * The feature id for the '<em><b>EContainer rssi hist</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSSI_HIST__ECONTAINER_RSSI_HIST = 0;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSSI_HIST__SIZE = 1;

	/**
	 * The feature id for the '<em><b>Max size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSSI_HIST__MAX_SIZE = 2;

	/**
	 * The feature id for the '<em><b>Overflow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSSI_HIST__OVERFLOW = 3;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSSI_HIST__VALUES = 4;

	/**
	 * The number of structural features of the '<em>Rssi hist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSSI_HIST_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.StatsImpl <em>Stats</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.StatsImpl
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.Device_wifi_wifidevice_cst_statsPackageImpl#getStats()
	 * @generated
	 */
	int STATS = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATS__NAME = ClickWatchModelPackage.HANDLER__NAME;

	/**
	 * The feature id for the '<em><b>Can Read</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATS__CAN_READ = ClickWatchModelPackage.HANDLER__CAN_READ;

	/**
	 * The feature id for the '<em><b>Can Write</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATS__CAN_WRITE = ClickWatchModelPackage.HANDLER__CAN_WRITE;

	/**
	 * The feature id for the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATS__CHANGED = ClickWatchModelPackage.HANDLER__CHANGED;

	/**
	 * The feature id for the '<em><b>Watch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATS__WATCH = ClickWatchModelPackage.HANDLER__WATCH;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATS__MIXED = ClickWatchModelPackage.HANDLER__MIXED;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATS__ANY = ClickWatchModelPackage.HANDLER__ANY;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATS__VALUE = ClickWatchModelPackage.HANDLER__VALUE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATS__TIMESTAMP = ClickWatchModelPackage.HANDLER__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Channelstats</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATS__CHANNELSTATS = ClickWatchModelPackage.HANDLER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Stats</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATS_FEATURE_COUNT = ClickWatchModelPackage.HANDLER_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Channelstats <em>Channelstats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Channelstats</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Channelstats
	 * @generated
	 */
	EClass getChannelstats();

	/**
	 * Returns the meta object for the container reference '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Channelstats#getEContainer_channelstats <em>EContainer channelstats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>EContainer channelstats</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Channelstats#getEContainer_channelstats()
	 * @see #getChannelstats()
	 * @generated
	 */
	EReference getChannelstats_EContainer_channelstats();

	/**
	 * Returns the meta object for the attribute list '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Channelstats#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Text</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Channelstats#getText()
	 * @see #getChannelstats()
	 * @generated
	 */
	EAttribute getChannelstats_Text();

	/**
	 * Returns the meta object for the containment reference '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Channelstats#getMac <em>Mac</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mac</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Channelstats#getMac()
	 * @see #getChannelstats()
	 * @generated
	 */
	EReference getChannelstats_Mac();

	/**
	 * Returns the meta object for the containment reference '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Channelstats#getMac_percentage <em>Mac percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mac percentage</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Channelstats#getMac_percentage()
	 * @see #getChannelstats()
	 * @generated
	 */
	EReference getChannelstats_Mac_percentage();

	/**
	 * Returns the meta object for the containment reference '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Channelstats#getMac_duration <em>Mac duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mac duration</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Channelstats#getMac_duration()
	 * @see #getChannelstats()
	 * @generated
	 */
	EReference getChannelstats_Mac_duration();

	/**
	 * Returns the meta object for the containment reference '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Channelstats#getPhy <em>Phy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Phy</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Channelstats#getPhy()
	 * @see #getChannelstats()
	 * @generated
	 */
	EReference getChannelstats_Phy();

	/**
	 * Returns the meta object for the containment reference '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Channelstats#getPerf_counter <em>Perf counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Perf counter</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Channelstats#getPerf_counter()
	 * @see #getChannelstats()
	 * @generated
	 */
	EReference getChannelstats_Perf_counter();

	/**
	 * Returns the meta object for the containment reference '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Channelstats#getNeighbourstats <em>Neighbourstats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Neighbourstats</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Channelstats#getNeighbourstats()
	 * @see #getChannelstats()
	 * @generated
	 */
	EReference getChannelstats_Neighbourstats();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Channelstats#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Channelstats#getNode()
	 * @see #getChannelstats()
	 * @generated
	 */
	EAttribute getChannelstats_Node();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Channelstats#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Channelstats#getTime()
	 * @see #getChannelstats()
	 * @generated
	 */
	EAttribute getChannelstats_Time();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Channelstats#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Channelstats#getId()
	 * @see #getChannelstats()
	 * @generated
	 */
	EAttribute getChannelstats_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Channelstats#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Channelstats#getLength()
	 * @see #getChannelstats()
	 * @generated
	 */
	EAttribute getChannelstats_Length();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Channelstats#getHw_duration <em>Hw duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hw duration</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Channelstats#getHw_duration()
	 * @see #getChannelstats()
	 * @generated
	 */
	EAttribute getChannelstats_Hw_duration();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Channelstats#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Channelstats#getUnit()
	 * @see #getChannelstats()
	 * @generated
	 */
	EAttribute getChannelstats_Unit();

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Ctl <em>Ctl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctl</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Ctl
	 * @generated
	 */
	EClass getCtl();

	/**
	 * Returns the meta object for the container reference '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Ctl#getEContainer_ctl <em>EContainer ctl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>EContainer ctl</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Ctl#getEContainer_ctl()
	 * @see #getCtl()
	 * @generated
	 */
	EReference getCtl_EContainer_ctl();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Ctl#getRssi0 <em>Rssi0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rssi0</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Ctl#getRssi0()
	 * @see #getCtl()
	 * @generated
	 */
	EAttribute getCtl_Rssi0();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Ctl#getRssi1 <em>Rssi1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rssi1</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Ctl#getRssi1()
	 * @see #getCtl()
	 * @generated
	 */
	EAttribute getCtl_Rssi1();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Ctl#getRssi2 <em>Rssi2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rssi2</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Ctl#getRssi2()
	 * @see #getCtl()
	 * @generated
	 */
	EAttribute getCtl_Rssi2();

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Ext <em>Ext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ext</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Ext
	 * @generated
	 */
	EClass getExt();

	/**
	 * Returns the meta object for the container reference '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Ext#getEContainer_ext <em>EContainer ext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>EContainer ext</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Ext#getEContainer_ext()
	 * @see #getExt()
	 * @generated
	 */
	EReference getExt_EContainer_ext();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Ext#getRssi0 <em>Rssi0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rssi0</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Ext#getRssi0()
	 * @see #getExt()
	 * @generated
	 */
	EAttribute getExt_Rssi0();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Ext#getRssi1 <em>Rssi1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rssi1</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Ext#getRssi1()
	 * @see #getExt()
	 * @generated
	 */
	EAttribute getExt_Rssi1();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Ext#getRssi2 <em>Rssi2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rssi2</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Ext#getRssi2()
	 * @see #getExt()
	 * @generated
	 */
	EAttribute getExt_Rssi2();

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac <em>Mac</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mac</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac
	 * @generated
	 */
	EClass getMac();

	/**
	 * Returns the meta object for the container reference '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac#getEContainer_mac <em>EContainer mac</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>EContainer mac</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac#getEContainer_mac()
	 * @see #getMac()
	 * @generated
	 */
	EReference getMac_EContainer_mac();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac#getPackets <em>Packets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Packets</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac#getPackets()
	 * @see #getMac()
	 * @generated
	 */
	EAttribute getMac_Packets();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac#getRx_pkt <em>Rx pkt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rx pkt</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac#getRx_pkt()
	 * @see #getMac()
	 * @generated
	 */
	EAttribute getMac_Rx_pkt();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac#getNo_err_pkt <em>No err pkt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No err pkt</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac#getNo_err_pkt()
	 * @see #getMac()
	 * @generated
	 */
	EAttribute getMac_No_err_pkt();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac#getCrc_err_pkt <em>Crc err pkt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Crc err pkt</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac#getCrc_err_pkt()
	 * @see #getMac()
	 * @generated
	 */
	EAttribute getMac_Crc_err_pkt();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac#getPhy_err_pkt <em>Phy err pkt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phy err pkt</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac#getPhy_err_pkt()
	 * @see #getMac()
	 * @generated
	 */
	EAttribute getMac_Phy_err_pkt();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac#getUnknown_err_pkt <em>Unknown err pkt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unknown err pkt</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac#getUnknown_err_pkt()
	 * @see #getMac()
	 * @generated
	 */
	EAttribute getMac_Unknown_err_pkt();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac#getTx_pkt <em>Tx pkt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tx pkt</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac#getTx_pkt()
	 * @see #getMac()
	 * @generated
	 */
	EAttribute getMac_Tx_pkt();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac#getRx_unicast_pkt <em>Rx unicast pkt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rx unicast pkt</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac#getRx_unicast_pkt()
	 * @see #getMac()
	 * @generated
	 */
	EAttribute getMac_Rx_unicast_pkt();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac#getRx_retry_pkt <em>Rx retry pkt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rx retry pkt</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac#getRx_retry_pkt()
	 * @see #getMac()
	 * @generated
	 */
	EAttribute getMac_Rx_retry_pkt();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac#getRx_bcast_pkt <em>Rx bcast pkt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rx bcast pkt</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac#getRx_bcast_pkt()
	 * @see #getMac()
	 * @generated
	 */
	EAttribute getMac_Rx_bcast_pkt();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac#getRx_bytes <em>Rx bytes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rx bytes</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac#getRx_bytes()
	 * @see #getMac()
	 * @generated
	 */
	EAttribute getMac_Rx_bytes();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac#getTx_unicast_pkt <em>Tx unicast pkt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tx unicast pkt</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac#getTx_unicast_pkt()
	 * @see #getMac()
	 * @generated
	 */
	EAttribute getMac_Tx_unicast_pkt();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac#getTx_retry_pkt <em>Tx retry pkt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tx retry pkt</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac#getTx_retry_pkt()
	 * @see #getMac()
	 * @generated
	 */
	EAttribute getMac_Tx_retry_pkt();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac#getTx_bcast_pkt <em>Tx bcast pkt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tx bcast pkt</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac#getTx_bcast_pkt()
	 * @see #getMac()
	 * @generated
	 */
	EAttribute getMac_Tx_bcast_pkt();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac#getTx_bytes <em>Tx bytes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tx bytes</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac#getTx_bytes()
	 * @see #getMac()
	 * @generated
	 */
	EAttribute getMac_Tx_bytes();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac#getZero_err_pkt <em>Zero err pkt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zero err pkt</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac#getZero_err_pkt()
	 * @see #getMac()
	 * @generated
	 */
	EAttribute getMac_Zero_err_pkt();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac#getLast_packet_time <em>Last packet time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last packet time</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac#getLast_packet_time()
	 * @see #getMac()
	 * @generated
	 */
	EAttribute getMac_Last_packet_time();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac#getNo_src <em>No src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No src</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac#getNo_src()
	 * @see #getMac()
	 * @generated
	 */
	EAttribute getMac_No_src();

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac_duration <em>Mac duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mac duration</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac_duration
	 * @generated
	 */
	EClass getMac_duration();

	/**
	 * Returns the meta object for the container reference '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac_duration#getEContainer_mac_duration <em>EContainer mac duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>EContainer mac duration</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac_duration#getEContainer_mac_duration()
	 * @see #getMac_duration()
	 * @generated
	 */
	EReference getMac_duration_EContainer_mac_duration();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac_duration#getBusy <em>Busy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Busy</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac_duration#getBusy()
	 * @see #getMac_duration()
	 * @generated
	 */
	EAttribute getMac_duration_Busy();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac_duration#getRx <em>Rx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rx</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac_duration#getRx()
	 * @see #getMac_duration()
	 * @generated
	 */
	EAttribute getMac_duration_Rx();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac_duration#getTx <em>Tx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tx</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac_duration#getTx()
	 * @see #getMac_duration()
	 * @generated
	 */
	EAttribute getMac_duration_Tx();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac_duration#getNoerr_rx <em>Noerr rx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Noerr rx</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac_duration#getNoerr_rx()
	 * @see #getMac_duration()
	 * @generated
	 */
	EAttribute getMac_duration_Noerr_rx();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac_duration#getCrc_rx <em>Crc rx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Crc rx</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac_duration#getCrc_rx()
	 * @see #getMac_duration()
	 * @generated
	 */
	EAttribute getMac_duration_Crc_rx();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac_duration#getPhy_rx <em>Phy rx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phy rx</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac_duration#getPhy_rx()
	 * @see #getMac_duration()
	 * @generated
	 */
	EAttribute getMac_duration_Phy_rx();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac_duration#getUnknown_err_rx <em>Unknown err rx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unknown err rx</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac_duration#getUnknown_err_rx()
	 * @see #getMac_duration()
	 * @generated
	 */
	EAttribute getMac_duration_Unknown_err_rx();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac_duration#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac_duration#getUnit()
	 * @see #getMac_duration()
	 * @generated
	 */
	EAttribute getMac_duration_Unit();

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac_percentage <em>Mac percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mac percentage</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac_percentage
	 * @generated
	 */
	EClass getMac_percentage();

	/**
	 * Returns the meta object for the container reference '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac_percentage#getEContainer_mac_percentage <em>EContainer mac percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>EContainer mac percentage</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac_percentage#getEContainer_mac_percentage()
	 * @see #getMac_percentage()
	 * @generated
	 */
	EReference getMac_percentage_EContainer_mac_percentage();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac_percentage#getBusy <em>Busy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Busy</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac_percentage#getBusy()
	 * @see #getMac_percentage()
	 * @generated
	 */
	EAttribute getMac_percentage_Busy();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac_percentage#getRx <em>Rx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rx</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac_percentage#getRx()
	 * @see #getMac_percentage()
	 * @generated
	 */
	EAttribute getMac_percentage_Rx();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac_percentage#getTx <em>Tx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tx</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac_percentage#getTx()
	 * @see #getMac_percentage()
	 * @generated
	 */
	EAttribute getMac_percentage_Tx();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac_percentage#getNoerr_rx <em>Noerr rx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Noerr rx</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac_percentage#getNoerr_rx()
	 * @see #getMac_percentage()
	 * @generated
	 */
	EAttribute getMac_percentage_Noerr_rx();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac_percentage#getCrc_rx <em>Crc rx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Crc rx</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac_percentage#getCrc_rx()
	 * @see #getMac_percentage()
	 * @generated
	 */
	EAttribute getMac_percentage_Crc_rx();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac_percentage#getPhy_rx <em>Phy rx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phy rx</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac_percentage#getPhy_rx()
	 * @see #getMac_percentage()
	 * @generated
	 */
	EAttribute getMac_percentage_Phy_rx();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac_percentage#getUnknown_err_rx <em>Unknown err rx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unknown err rx</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac_percentage#getUnknown_err_rx()
	 * @see #getMac_percentage()
	 * @generated
	 */
	EAttribute getMac_percentage_Unknown_err_rx();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac_percentage#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac_percentage#getUnit()
	 * @see #getMac_percentage()
	 * @generated
	 */
	EAttribute getMac_percentage_Unit();

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Nb <em>Nb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nb</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Nb
	 * @generated
	 */
	EClass getNb();

	/**
	 * Returns the meta object for the container reference '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Nb#getEContainer_nb <em>EContainer nb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>EContainer nb</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Nb#getEContainer_nb()
	 * @see #getNb()
	 * @generated
	 */
	EReference getNb_EContainer_nb();

	/**
	 * Returns the meta object for the attribute list '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Nb#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Text</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Nb#getText()
	 * @see #getNb()
	 * @generated
	 */
	EAttribute getNb_Text();

	/**
	 * Returns the meta object for the containment reference '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Nb#getRssi_extended <em>Rssi extended</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rssi extended</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Nb#getRssi_extended()
	 * @see #getNb()
	 * @generated
	 */
	EReference getNb_Rssi_extended();

	/**
	 * Returns the meta object for the containment reference '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Nb#getRssi_hist <em>Rssi hist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rssi hist</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Nb#getRssi_hist()
	 * @see #getNb()
	 * @generated
	 */
	EReference getNb_Rssi_hist();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Nb#getAddr <em>Addr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Addr</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Nb#getAddr()
	 * @see #getNb()
	 * @generated
	 */
	EAttribute getNb_Addr();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Nb#getRssi <em>Rssi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rssi</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Nb#getRssi()
	 * @see #getNb()
	 * @generated
	 */
	EAttribute getNb_Rssi();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Nb#getStd_rssi <em>Std rssi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Std rssi</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Nb#getStd_rssi()
	 * @see #getNb()
	 * @generated
	 */
	EAttribute getNb_Std_rssi();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Nb#getMin_rssi <em>Min rssi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min rssi</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Nb#getMin_rssi()
	 * @see #getNb()
	 * @generated
	 */
	EAttribute getNb_Min_rssi();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Nb#getMax_rssi <em>Max rssi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max rssi</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Nb#getMax_rssi()
	 * @see #getNb()
	 * @generated
	 */
	EAttribute getNb_Max_rssi();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Nb#getPkt_cnt <em>Pkt cnt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pkt cnt</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Nb#getPkt_cnt()
	 * @see #getNb()
	 * @generated
	 */
	EAttribute getNb_Pkt_cnt();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Nb#getRx_bytes <em>Rx bytes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rx bytes</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Nb#getRx_bytes()
	 * @see #getNb()
	 * @generated
	 */
	EAttribute getNb_Rx_bytes();

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Neighbourstats <em>Neighbourstats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Neighbourstats</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Neighbourstats
	 * @generated
	 */
	EClass getNeighbourstats();

	/**
	 * Returns the meta object for the container reference '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Neighbourstats#getEContainer_neighbourstats <em>EContainer neighbourstats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>EContainer neighbourstats</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Neighbourstats#getEContainer_neighbourstats()
	 * @see #getNeighbourstats()
	 * @generated
	 */
	EReference getNeighbourstats_EContainer_neighbourstats();

	/**
	 * Returns the meta object for the attribute list '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Neighbourstats#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Text</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Neighbourstats#getText()
	 * @see #getNeighbourstats()
	 * @generated
	 */
	EAttribute getNeighbourstats_Text();

	/**
	 * Returns the meta object for the containment reference list '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Neighbourstats#getNb <em>Nb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nb</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Neighbourstats#getNb()
	 * @see #getNeighbourstats()
	 * @generated
	 */
	EReference getNeighbourstats_Nb();

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Perf_counter <em>Perf counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Perf counter</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Perf_counter
	 * @generated
	 */
	EClass getPerf_counter();

	/**
	 * Returns the meta object for the container reference '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Perf_counter#getEContainer_perf_counter <em>EContainer perf counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>EContainer perf counter</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Perf_counter#getEContainer_perf_counter()
	 * @see #getPerf_counter()
	 * @generated
	 */
	EReference getPerf_counter_EContainer_perf_counter();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Perf_counter#getCycles <em>Cycles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cycles</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Perf_counter#getCycles()
	 * @see #getPerf_counter()
	 * @generated
	 */
	EAttribute getPerf_counter_Cycles();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Perf_counter#getBusy_cycles <em>Busy cycles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Busy cycles</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Perf_counter#getBusy_cycles()
	 * @see #getPerf_counter()
	 * @generated
	 */
	EAttribute getPerf_counter_Busy_cycles();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Perf_counter#getRx_cycles <em>Rx cycles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rx cycles</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Perf_counter#getRx_cycles()
	 * @see #getPerf_counter()
	 * @generated
	 */
	EAttribute getPerf_counter_Rx_cycles();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Perf_counter#getTx_cycles <em>Tx cycles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tx cycles</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Perf_counter#getTx_cycles()
	 * @see #getPerf_counter()
	 * @generated
	 */
	EAttribute getPerf_counter_Tx_cycles();

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Phy <em>Phy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Phy</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Phy
	 * @generated
	 */
	EClass getPhy();

	/**
	 * Returns the meta object for the container reference '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Phy#getEContainer_phy <em>EContainer phy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>EContainer phy</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Phy#getEContainer_phy()
	 * @see #getPhy()
	 * @generated
	 */
	EReference getPhy_EContainer_phy();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Phy#getHwbusy <em>Hwbusy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hwbusy</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Phy#getHwbusy()
	 * @see #getPhy()
	 * @generated
	 */
	EAttribute getPhy_Hwbusy();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Phy#getHwrx <em>Hwrx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hwrx</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Phy#getHwrx()
	 * @see #getPhy()
	 * @generated
	 */
	EAttribute getPhy_Hwrx();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Phy#getHwtx <em>Hwtx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hwtx</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Phy#getHwtx()
	 * @see #getPhy()
	 * @generated
	 */
	EAttribute getPhy_Hwtx();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Phy#getLast_hw_stat_time <em>Last hw stat time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last hw stat time</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Phy#getLast_hw_stat_time()
	 * @see #getPhy()
	 * @generated
	 */
	EAttribute getPhy_Last_hw_stat_time();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Phy#getHw_stats_count <em>Hw stats count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hw stats count</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Phy#getHw_stats_count()
	 * @see #getPhy()
	 * @generated
	 */
	EAttribute getPhy_Hw_stats_count();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Phy#getAvg_noise <em>Avg noise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Avg noise</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Phy#getAvg_noise()
	 * @see #getPhy()
	 * @generated
	 */
	EAttribute getPhy_Avg_noise();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Phy#getStd_noise <em>Std noise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Std noise</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Phy#getStd_noise()
	 * @see #getPhy()
	 * @generated
	 */
	EAttribute getPhy_Std_noise();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Phy#getAvg_rssi <em>Avg rssi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Avg rssi</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Phy#getAvg_rssi()
	 * @see #getPhy()
	 * @generated
	 */
	EAttribute getPhy_Avg_rssi();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Phy#getStd_rssi <em>Std rssi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Std rssi</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Phy#getStd_rssi()
	 * @see #getPhy()
	 * @generated
	 */
	EAttribute getPhy_Std_rssi();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Phy#getCtl_rssi0 <em>Ctl rssi0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ctl rssi0</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Phy#getCtl_rssi0()
	 * @see #getPhy()
	 * @generated
	 */
	EAttribute getPhy_Ctl_rssi0();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Phy#getCtl_rssi1 <em>Ctl rssi1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ctl rssi1</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Phy#getCtl_rssi1()
	 * @see #getPhy()
	 * @generated
	 */
	EAttribute getPhy_Ctl_rssi1();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Phy#getCtl_rssi2 <em>Ctl rssi2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ctl rssi2</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Phy#getCtl_rssi2()
	 * @see #getPhy()
	 * @generated
	 */
	EAttribute getPhy_Ctl_rssi2();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Phy#getExt_rssi0 <em>Ext rssi0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ext rssi0</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Phy#getExt_rssi0()
	 * @see #getPhy()
	 * @generated
	 */
	EAttribute getPhy_Ext_rssi0();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Phy#getExt_rssi1 <em>Ext rssi1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ext rssi1</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Phy#getExt_rssi1()
	 * @see #getPhy()
	 * @generated
	 */
	EAttribute getPhy_Ext_rssi1();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Phy#getExt_rssi2 <em>Ext rssi2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ext rssi2</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Phy#getExt_rssi2()
	 * @see #getPhy()
	 * @generated
	 */
	EAttribute getPhy_Ext_rssi2();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Phy#getChannel <em>Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Channel</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Phy#getChannel()
	 * @see #getPhy()
	 * @generated
	 */
	EAttribute getPhy_Channel();

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Rssi_extended <em>Rssi extended</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rssi extended</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Rssi_extended
	 * @generated
	 */
	EClass getRssi_extended();

	/**
	 * Returns the meta object for the container reference '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Rssi_extended#getEContainer_rssi_extended <em>EContainer rssi extended</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>EContainer rssi extended</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Rssi_extended#getEContainer_rssi_extended()
	 * @see #getRssi_extended()
	 * @generated
	 */
	EReference getRssi_extended_EContainer_rssi_extended();

	/**
	 * Returns the meta object for the attribute list '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Rssi_extended#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Text</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Rssi_extended#getText()
	 * @see #getRssi_extended()
	 * @generated
	 */
	EAttribute getRssi_extended_Text();

	/**
	 * Returns the meta object for the containment reference '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Rssi_extended#getCtl <em>Ctl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ctl</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Rssi_extended#getCtl()
	 * @see #getRssi_extended()
	 * @generated
	 */
	EReference getRssi_extended_Ctl();

	/**
	 * Returns the meta object for the containment reference '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Rssi_extended#getExt <em>Ext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ext</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Rssi_extended#getExt()
	 * @see #getRssi_extended()
	 * @generated
	 */
	EReference getRssi_extended_Ext();

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Rssi_hist <em>Rssi hist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rssi hist</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Rssi_hist
	 * @generated
	 */
	EClass getRssi_hist();

	/**
	 * Returns the meta object for the container reference '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Rssi_hist#getEContainer_rssi_hist <em>EContainer rssi hist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>EContainer rssi hist</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Rssi_hist#getEContainer_rssi_hist()
	 * @see #getRssi_hist()
	 * @generated
	 */
	EReference getRssi_hist_EContainer_rssi_hist();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Rssi_hist#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Rssi_hist#getSize()
	 * @see #getRssi_hist()
	 * @generated
	 */
	EAttribute getRssi_hist_Size();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Rssi_hist#getMax_size <em>Max size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max size</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Rssi_hist#getMax_size()
	 * @see #getRssi_hist()
	 * @generated
	 */
	EAttribute getRssi_hist_Max_size();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Rssi_hist#getOverflow <em>Overflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Overflow</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Rssi_hist#getOverflow()
	 * @see #getRssi_hist()
	 * @generated
	 */
	EAttribute getRssi_hist_Overflow();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Rssi_hist#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Values</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Rssi_hist#getValues()
	 * @see #getRssi_hist()
	 * @generated
	 */
	EAttribute getRssi_hist_Values();

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Stats <em>Stats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stats</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Stats
	 * @generated
	 */
	EClass getStats();

	/**
	 * Returns the meta object for the containment reference '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Stats#getChannelstats <em>Channelstats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Channelstats</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Stats#getChannelstats()
	 * @see #getStats()
	 * @generated
	 */
	EReference getStats_Channelstats();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Device_wifi_wifidevice_cst_statsFactory getDevice_wifi_wifidevice_cst_statsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.ChannelstatsImpl <em>Channelstats</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.ChannelstatsImpl
		 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.Device_wifi_wifidevice_cst_statsPackageImpl#getChannelstats()
		 * @generated
		 */
		EClass CHANNELSTATS = eINSTANCE.getChannelstats();

		/**
		 * The meta object literal for the '<em><b>EContainer channelstats</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANNELSTATS__ECONTAINER_CHANNELSTATS = eINSTANCE.getChannelstats_EContainer_channelstats();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANNELSTATS__TEXT = eINSTANCE.getChannelstats_Text();

		/**
		 * The meta object literal for the '<em><b>Mac</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANNELSTATS__MAC = eINSTANCE.getChannelstats_Mac();

		/**
		 * The meta object literal for the '<em><b>Mac percentage</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANNELSTATS__MAC_PERCENTAGE = eINSTANCE.getChannelstats_Mac_percentage();

		/**
		 * The meta object literal for the '<em><b>Mac duration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANNELSTATS__MAC_DURATION = eINSTANCE.getChannelstats_Mac_duration();

		/**
		 * The meta object literal for the '<em><b>Phy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANNELSTATS__PHY = eINSTANCE.getChannelstats_Phy();

		/**
		 * The meta object literal for the '<em><b>Perf counter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANNELSTATS__PERF_COUNTER = eINSTANCE.getChannelstats_Perf_counter();

		/**
		 * The meta object literal for the '<em><b>Neighbourstats</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANNELSTATS__NEIGHBOURSTATS = eINSTANCE.getChannelstats_Neighbourstats();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANNELSTATS__NODE = eINSTANCE.getChannelstats_Node();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANNELSTATS__TIME = eINSTANCE.getChannelstats_Time();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANNELSTATS__ID = eINSTANCE.getChannelstats_Id();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANNELSTATS__LENGTH = eINSTANCE.getChannelstats_Length();

		/**
		 * The meta object literal for the '<em><b>Hw duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANNELSTATS__HW_DURATION = eINSTANCE.getChannelstats_Hw_duration();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANNELSTATS__UNIT = eINSTANCE.getChannelstats_Unit();

		/**
		 * The meta object literal for the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.CtlImpl <em>Ctl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.CtlImpl
		 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.Device_wifi_wifidevice_cst_statsPackageImpl#getCtl()
		 * @generated
		 */
		EClass CTL = eINSTANCE.getCtl();

		/**
		 * The meta object literal for the '<em><b>EContainer ctl</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTL__ECONTAINER_CTL = eINSTANCE.getCtl_EContainer_ctl();

		/**
		 * The meta object literal for the '<em><b>Rssi0</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CTL__RSSI0 = eINSTANCE.getCtl_Rssi0();

		/**
		 * The meta object literal for the '<em><b>Rssi1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CTL__RSSI1 = eINSTANCE.getCtl_Rssi1();

		/**
		 * The meta object literal for the '<em><b>Rssi2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CTL__RSSI2 = eINSTANCE.getCtl_Rssi2();

		/**
		 * The meta object literal for the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.ExtImpl <em>Ext</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.ExtImpl
		 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.Device_wifi_wifidevice_cst_statsPackageImpl#getExt()
		 * @generated
		 */
		EClass EXT = eINSTANCE.getExt();

		/**
		 * The meta object literal for the '<em><b>EContainer ext</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXT__ECONTAINER_EXT = eINSTANCE.getExt_EContainer_ext();

		/**
		 * The meta object literal for the '<em><b>Rssi0</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXT__RSSI0 = eINSTANCE.getExt_Rssi0();

		/**
		 * The meta object literal for the '<em><b>Rssi1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXT__RSSI1 = eINSTANCE.getExt_Rssi1();

		/**
		 * The meta object literal for the '<em><b>Rssi2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXT__RSSI2 = eINSTANCE.getExt_Rssi2();

		/**
		 * The meta object literal for the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.MacImpl <em>Mac</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.MacImpl
		 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.Device_wifi_wifidevice_cst_statsPackageImpl#getMac()
		 * @generated
		 */
		EClass MAC = eINSTANCE.getMac();

		/**
		 * The meta object literal for the '<em><b>EContainer mac</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAC__ECONTAINER_MAC = eINSTANCE.getMac_EContainer_mac();

		/**
		 * The meta object literal for the '<em><b>Packets</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAC__PACKETS = eINSTANCE.getMac_Packets();

		/**
		 * The meta object literal for the '<em><b>Rx pkt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAC__RX_PKT = eINSTANCE.getMac_Rx_pkt();

		/**
		 * The meta object literal for the '<em><b>No err pkt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAC__NO_ERR_PKT = eINSTANCE.getMac_No_err_pkt();

		/**
		 * The meta object literal for the '<em><b>Crc err pkt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAC__CRC_ERR_PKT = eINSTANCE.getMac_Crc_err_pkt();

		/**
		 * The meta object literal for the '<em><b>Phy err pkt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAC__PHY_ERR_PKT = eINSTANCE.getMac_Phy_err_pkt();

		/**
		 * The meta object literal for the '<em><b>Unknown err pkt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAC__UNKNOWN_ERR_PKT = eINSTANCE.getMac_Unknown_err_pkt();

		/**
		 * The meta object literal for the '<em><b>Tx pkt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAC__TX_PKT = eINSTANCE.getMac_Tx_pkt();

		/**
		 * The meta object literal for the '<em><b>Rx unicast pkt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAC__RX_UNICAST_PKT = eINSTANCE.getMac_Rx_unicast_pkt();

		/**
		 * The meta object literal for the '<em><b>Rx retry pkt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAC__RX_RETRY_PKT = eINSTANCE.getMac_Rx_retry_pkt();

		/**
		 * The meta object literal for the '<em><b>Rx bcast pkt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAC__RX_BCAST_PKT = eINSTANCE.getMac_Rx_bcast_pkt();

		/**
		 * The meta object literal for the '<em><b>Rx bytes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAC__RX_BYTES = eINSTANCE.getMac_Rx_bytes();

		/**
		 * The meta object literal for the '<em><b>Tx unicast pkt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAC__TX_UNICAST_PKT = eINSTANCE.getMac_Tx_unicast_pkt();

		/**
		 * The meta object literal for the '<em><b>Tx retry pkt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAC__TX_RETRY_PKT = eINSTANCE.getMac_Tx_retry_pkt();

		/**
		 * The meta object literal for the '<em><b>Tx bcast pkt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAC__TX_BCAST_PKT = eINSTANCE.getMac_Tx_bcast_pkt();

		/**
		 * The meta object literal for the '<em><b>Tx bytes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAC__TX_BYTES = eINSTANCE.getMac_Tx_bytes();

		/**
		 * The meta object literal for the '<em><b>Zero err pkt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAC__ZERO_ERR_PKT = eINSTANCE.getMac_Zero_err_pkt();

		/**
		 * The meta object literal for the '<em><b>Last packet time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAC__LAST_PACKET_TIME = eINSTANCE.getMac_Last_packet_time();

		/**
		 * The meta object literal for the '<em><b>No src</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAC__NO_SRC = eINSTANCE.getMac_No_src();

		/**
		 * The meta object literal for the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.Mac_durationImpl <em>Mac duration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.Mac_durationImpl
		 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.Device_wifi_wifidevice_cst_statsPackageImpl#getMac_duration()
		 * @generated
		 */
		EClass MAC_DURATION = eINSTANCE.getMac_duration();

		/**
		 * The meta object literal for the '<em><b>EContainer mac duration</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAC_DURATION__ECONTAINER_MAC_DURATION = eINSTANCE.getMac_duration_EContainer_mac_duration();

		/**
		 * The meta object literal for the '<em><b>Busy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAC_DURATION__BUSY = eINSTANCE.getMac_duration_Busy();

		/**
		 * The meta object literal for the '<em><b>Rx</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAC_DURATION__RX = eINSTANCE.getMac_duration_Rx();

		/**
		 * The meta object literal for the '<em><b>Tx</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAC_DURATION__TX = eINSTANCE.getMac_duration_Tx();

		/**
		 * The meta object literal for the '<em><b>Noerr rx</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAC_DURATION__NOERR_RX = eINSTANCE.getMac_duration_Noerr_rx();

		/**
		 * The meta object literal for the '<em><b>Crc rx</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAC_DURATION__CRC_RX = eINSTANCE.getMac_duration_Crc_rx();

		/**
		 * The meta object literal for the '<em><b>Phy rx</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAC_DURATION__PHY_RX = eINSTANCE.getMac_duration_Phy_rx();

		/**
		 * The meta object literal for the '<em><b>Unknown err rx</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAC_DURATION__UNKNOWN_ERR_RX = eINSTANCE.getMac_duration_Unknown_err_rx();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAC_DURATION__UNIT = eINSTANCE.getMac_duration_Unit();

		/**
		 * The meta object literal for the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.Mac_percentageImpl <em>Mac percentage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.Mac_percentageImpl
		 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.Device_wifi_wifidevice_cst_statsPackageImpl#getMac_percentage()
		 * @generated
		 */
		EClass MAC_PERCENTAGE = eINSTANCE.getMac_percentage();

		/**
		 * The meta object literal for the '<em><b>EContainer mac percentage</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAC_PERCENTAGE__ECONTAINER_MAC_PERCENTAGE = eINSTANCE.getMac_percentage_EContainer_mac_percentage();

		/**
		 * The meta object literal for the '<em><b>Busy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAC_PERCENTAGE__BUSY = eINSTANCE.getMac_percentage_Busy();

		/**
		 * The meta object literal for the '<em><b>Rx</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAC_PERCENTAGE__RX = eINSTANCE.getMac_percentage_Rx();

		/**
		 * The meta object literal for the '<em><b>Tx</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAC_PERCENTAGE__TX = eINSTANCE.getMac_percentage_Tx();

		/**
		 * The meta object literal for the '<em><b>Noerr rx</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAC_PERCENTAGE__NOERR_RX = eINSTANCE.getMac_percentage_Noerr_rx();

		/**
		 * The meta object literal for the '<em><b>Crc rx</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAC_PERCENTAGE__CRC_RX = eINSTANCE.getMac_percentage_Crc_rx();

		/**
		 * The meta object literal for the '<em><b>Phy rx</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAC_PERCENTAGE__PHY_RX = eINSTANCE.getMac_percentage_Phy_rx();

		/**
		 * The meta object literal for the '<em><b>Unknown err rx</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAC_PERCENTAGE__UNKNOWN_ERR_RX = eINSTANCE.getMac_percentage_Unknown_err_rx();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAC_PERCENTAGE__UNIT = eINSTANCE.getMac_percentage_Unit();

		/**
		 * The meta object literal for the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.NbImpl <em>Nb</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.NbImpl
		 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.Device_wifi_wifidevice_cst_statsPackageImpl#getNb()
		 * @generated
		 */
		EClass NB = eINSTANCE.getNb();

		/**
		 * The meta object literal for the '<em><b>EContainer nb</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NB__ECONTAINER_NB = eINSTANCE.getNb_EContainer_nb();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NB__TEXT = eINSTANCE.getNb_Text();

		/**
		 * The meta object literal for the '<em><b>Rssi extended</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NB__RSSI_EXTENDED = eINSTANCE.getNb_Rssi_extended();

		/**
		 * The meta object literal for the '<em><b>Rssi hist</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NB__RSSI_HIST = eINSTANCE.getNb_Rssi_hist();

		/**
		 * The meta object literal for the '<em><b>Addr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NB__ADDR = eINSTANCE.getNb_Addr();

		/**
		 * The meta object literal for the '<em><b>Rssi</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NB__RSSI = eINSTANCE.getNb_Rssi();

		/**
		 * The meta object literal for the '<em><b>Std rssi</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NB__STD_RSSI = eINSTANCE.getNb_Std_rssi();

		/**
		 * The meta object literal for the '<em><b>Min rssi</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NB__MIN_RSSI = eINSTANCE.getNb_Min_rssi();

		/**
		 * The meta object literal for the '<em><b>Max rssi</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NB__MAX_RSSI = eINSTANCE.getNb_Max_rssi();

		/**
		 * The meta object literal for the '<em><b>Pkt cnt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NB__PKT_CNT = eINSTANCE.getNb_Pkt_cnt();

		/**
		 * The meta object literal for the '<em><b>Rx bytes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NB__RX_BYTES = eINSTANCE.getNb_Rx_bytes();

		/**
		 * The meta object literal for the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.NeighbourstatsImpl <em>Neighbourstats</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.NeighbourstatsImpl
		 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.Device_wifi_wifidevice_cst_statsPackageImpl#getNeighbourstats()
		 * @generated
		 */
		EClass NEIGHBOURSTATS = eINSTANCE.getNeighbourstats();

		/**
		 * The meta object literal for the '<em><b>EContainer neighbourstats</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEIGHBOURSTATS__ECONTAINER_NEIGHBOURSTATS = eINSTANCE.getNeighbourstats_EContainer_neighbourstats();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NEIGHBOURSTATS__TEXT = eINSTANCE.getNeighbourstats_Text();

		/**
		 * The meta object literal for the '<em><b>Nb</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEIGHBOURSTATS__NB = eINSTANCE.getNeighbourstats_Nb();

		/**
		 * The meta object literal for the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.Perf_counterImpl <em>Perf counter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.Perf_counterImpl
		 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.Device_wifi_wifidevice_cst_statsPackageImpl#getPerf_counter()
		 * @generated
		 */
		EClass PERF_COUNTER = eINSTANCE.getPerf_counter();

		/**
		 * The meta object literal for the '<em><b>EContainer perf counter</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERF_COUNTER__ECONTAINER_PERF_COUNTER = eINSTANCE.getPerf_counter_EContainer_perf_counter();

		/**
		 * The meta object literal for the '<em><b>Cycles</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERF_COUNTER__CYCLES = eINSTANCE.getPerf_counter_Cycles();

		/**
		 * The meta object literal for the '<em><b>Busy cycles</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERF_COUNTER__BUSY_CYCLES = eINSTANCE.getPerf_counter_Busy_cycles();

		/**
		 * The meta object literal for the '<em><b>Rx cycles</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERF_COUNTER__RX_CYCLES = eINSTANCE.getPerf_counter_Rx_cycles();

		/**
		 * The meta object literal for the '<em><b>Tx cycles</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERF_COUNTER__TX_CYCLES = eINSTANCE.getPerf_counter_Tx_cycles();

		/**
		 * The meta object literal for the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.PhyImpl <em>Phy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.PhyImpl
		 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.Device_wifi_wifidevice_cst_statsPackageImpl#getPhy()
		 * @generated
		 */
		EClass PHY = eINSTANCE.getPhy();

		/**
		 * The meta object literal for the '<em><b>EContainer phy</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHY__ECONTAINER_PHY = eINSTANCE.getPhy_EContainer_phy();

		/**
		 * The meta object literal for the '<em><b>Hwbusy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHY__HWBUSY = eINSTANCE.getPhy_Hwbusy();

		/**
		 * The meta object literal for the '<em><b>Hwrx</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHY__HWRX = eINSTANCE.getPhy_Hwrx();

		/**
		 * The meta object literal for the '<em><b>Hwtx</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHY__HWTX = eINSTANCE.getPhy_Hwtx();

		/**
		 * The meta object literal for the '<em><b>Last hw stat time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHY__LAST_HW_STAT_TIME = eINSTANCE.getPhy_Last_hw_stat_time();

		/**
		 * The meta object literal for the '<em><b>Hw stats count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHY__HW_STATS_COUNT = eINSTANCE.getPhy_Hw_stats_count();

		/**
		 * The meta object literal for the '<em><b>Avg noise</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHY__AVG_NOISE = eINSTANCE.getPhy_Avg_noise();

		/**
		 * The meta object literal for the '<em><b>Std noise</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHY__STD_NOISE = eINSTANCE.getPhy_Std_noise();

		/**
		 * The meta object literal for the '<em><b>Avg rssi</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHY__AVG_RSSI = eINSTANCE.getPhy_Avg_rssi();

		/**
		 * The meta object literal for the '<em><b>Std rssi</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHY__STD_RSSI = eINSTANCE.getPhy_Std_rssi();

		/**
		 * The meta object literal for the '<em><b>Ctl rssi0</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHY__CTL_RSSI0 = eINSTANCE.getPhy_Ctl_rssi0();

		/**
		 * The meta object literal for the '<em><b>Ctl rssi1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHY__CTL_RSSI1 = eINSTANCE.getPhy_Ctl_rssi1();

		/**
		 * The meta object literal for the '<em><b>Ctl rssi2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHY__CTL_RSSI2 = eINSTANCE.getPhy_Ctl_rssi2();

		/**
		 * The meta object literal for the '<em><b>Ext rssi0</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHY__EXT_RSSI0 = eINSTANCE.getPhy_Ext_rssi0();

		/**
		 * The meta object literal for the '<em><b>Ext rssi1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHY__EXT_RSSI1 = eINSTANCE.getPhy_Ext_rssi1();

		/**
		 * The meta object literal for the '<em><b>Ext rssi2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHY__EXT_RSSI2 = eINSTANCE.getPhy_Ext_rssi2();

		/**
		 * The meta object literal for the '<em><b>Channel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHY__CHANNEL = eINSTANCE.getPhy_Channel();

		/**
		 * The meta object literal for the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.Rssi_extendedImpl <em>Rssi extended</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.Rssi_extendedImpl
		 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.Device_wifi_wifidevice_cst_statsPackageImpl#getRssi_extended()
		 * @generated
		 */
		EClass RSSI_EXTENDED = eINSTANCE.getRssi_extended();

		/**
		 * The meta object literal for the '<em><b>EContainer rssi extended</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RSSI_EXTENDED__ECONTAINER_RSSI_EXTENDED = eINSTANCE.getRssi_extended_EContainer_rssi_extended();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RSSI_EXTENDED__TEXT = eINSTANCE.getRssi_extended_Text();

		/**
		 * The meta object literal for the '<em><b>Ctl</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RSSI_EXTENDED__CTL = eINSTANCE.getRssi_extended_Ctl();

		/**
		 * The meta object literal for the '<em><b>Ext</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RSSI_EXTENDED__EXT = eINSTANCE.getRssi_extended_Ext();

		/**
		 * The meta object literal for the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.Rssi_histImpl <em>Rssi hist</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.Rssi_histImpl
		 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.Device_wifi_wifidevice_cst_statsPackageImpl#getRssi_hist()
		 * @generated
		 */
		EClass RSSI_HIST = eINSTANCE.getRssi_hist();

		/**
		 * The meta object literal for the '<em><b>EContainer rssi hist</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RSSI_HIST__ECONTAINER_RSSI_HIST = eINSTANCE.getRssi_hist_EContainer_rssi_hist();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RSSI_HIST__SIZE = eINSTANCE.getRssi_hist_Size();

		/**
		 * The meta object literal for the '<em><b>Max size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RSSI_HIST__MAX_SIZE = eINSTANCE.getRssi_hist_Max_size();

		/**
		 * The meta object literal for the '<em><b>Overflow</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RSSI_HIST__OVERFLOW = eINSTANCE.getRssi_hist_Overflow();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RSSI_HIST__VALUES = eINSTANCE.getRssi_hist_Values();

		/**
		 * The meta object literal for the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.StatsImpl <em>Stats</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.StatsImpl
		 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.Device_wifi_wifidevice_cst_statsPackageImpl#getStats()
		 * @generated
		 */
		EClass STATS = eINSTANCE.getStats();

		/**
		 * The meta object literal for the '<em><b>Channelstats</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATS__CHANNELSTATS = eINSTANCE.getStats_Channelstats();

	}

} //Device_wifi_wifidevice_cst_statsPackage
