/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.impl;

import de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Channelstats;
import de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage;
import de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Mac;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mac</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.impl.MacImpl#getEContainer_mac <em>EContainer mac</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.impl.MacImpl#getPackets <em>Packets</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.impl.MacImpl#getRx_pkt <em>Rx pkt</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.impl.MacImpl#getNo_err_pkt <em>No err pkt</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.impl.MacImpl#getCrc_err_pkt <em>Crc err pkt</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.impl.MacImpl#getPhy_err_pkt <em>Phy err pkt</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.impl.MacImpl#getUnknown_err_pkt <em>Unknown err pkt</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.impl.MacImpl#getTx_pkt <em>Tx pkt</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.impl.MacImpl#getRx_unicast_pkt <em>Rx unicast pkt</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.impl.MacImpl#getRx_retry_pkt <em>Rx retry pkt</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.impl.MacImpl#getRx_bcast_pkt <em>Rx bcast pkt</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.impl.MacImpl#getRx_bytes <em>Rx bytes</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.impl.MacImpl#getTx_unicast_pkt <em>Tx unicast pkt</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.impl.MacImpl#getTx_retry_pkt <em>Tx retry pkt</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.impl.MacImpl#getTx_bcast_pkt <em>Tx bcast pkt</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.impl.MacImpl#getTx_bytes <em>Tx bytes</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.impl.MacImpl#getZero_err_pkt <em>Zero err pkt</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.impl.MacImpl#getLast_packet_time <em>Last packet time</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.impl.MacImpl#getNo_src <em>No src</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MacImpl extends EObjectImpl implements Mac {
	/**
	 * The default value of the '{@link #getPackets() <em>Packets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackets()
	 * @generated
	 * @ordered
	 */
	protected static final int PACKETS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPackets() <em>Packets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackets()
	 * @generated
	 * @ordered
	 */
	protected int packets = PACKETS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRx_pkt() <em>Rx pkt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRx_pkt()
	 * @generated
	 * @ordered
	 */
	protected static final int RX_PKT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRx_pkt() <em>Rx pkt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRx_pkt()
	 * @generated
	 * @ordered
	 */
	protected int rx_pkt = RX_PKT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNo_err_pkt() <em>No err pkt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNo_err_pkt()
	 * @generated
	 * @ordered
	 */
	protected static final int NO_ERR_PKT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNo_err_pkt() <em>No err pkt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNo_err_pkt()
	 * @generated
	 * @ordered
	 */
	protected int no_err_pkt = NO_ERR_PKT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCrc_err_pkt() <em>Crc err pkt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrc_err_pkt()
	 * @generated
	 * @ordered
	 */
	protected static final int CRC_ERR_PKT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCrc_err_pkt() <em>Crc err pkt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrc_err_pkt()
	 * @generated
	 * @ordered
	 */
	protected int crc_err_pkt = CRC_ERR_PKT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhy_err_pkt() <em>Phy err pkt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhy_err_pkt()
	 * @generated
	 * @ordered
	 */
	protected static final int PHY_ERR_PKT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPhy_err_pkt() <em>Phy err pkt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhy_err_pkt()
	 * @generated
	 * @ordered
	 */
	protected int phy_err_pkt = PHY_ERR_PKT_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnknown_err_pkt() <em>Unknown err pkt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnknown_err_pkt()
	 * @generated
	 * @ordered
	 */
	protected static final int UNKNOWN_ERR_PKT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getUnknown_err_pkt() <em>Unknown err pkt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnknown_err_pkt()
	 * @generated
	 * @ordered
	 */
	protected int unknown_err_pkt = UNKNOWN_ERR_PKT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTx_pkt() <em>Tx pkt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTx_pkt()
	 * @generated
	 * @ordered
	 */
	protected static final int TX_PKT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTx_pkt() <em>Tx pkt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTx_pkt()
	 * @generated
	 * @ordered
	 */
	protected int tx_pkt = TX_PKT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRx_unicast_pkt() <em>Rx unicast pkt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRx_unicast_pkt()
	 * @generated
	 * @ordered
	 */
	protected static final int RX_UNICAST_PKT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRx_unicast_pkt() <em>Rx unicast pkt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRx_unicast_pkt()
	 * @generated
	 * @ordered
	 */
	protected int rx_unicast_pkt = RX_UNICAST_PKT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRx_retry_pkt() <em>Rx retry pkt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRx_retry_pkt()
	 * @generated
	 * @ordered
	 */
	protected static final int RX_RETRY_PKT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRx_retry_pkt() <em>Rx retry pkt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRx_retry_pkt()
	 * @generated
	 * @ordered
	 */
	protected int rx_retry_pkt = RX_RETRY_PKT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRx_bcast_pkt() <em>Rx bcast pkt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRx_bcast_pkt()
	 * @generated
	 * @ordered
	 */
	protected static final int RX_BCAST_PKT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRx_bcast_pkt() <em>Rx bcast pkt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRx_bcast_pkt()
	 * @generated
	 * @ordered
	 */
	protected int rx_bcast_pkt = RX_BCAST_PKT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRx_bytes() <em>Rx bytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRx_bytes()
	 * @generated
	 * @ordered
	 */
	protected static final int RX_BYTES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRx_bytes() <em>Rx bytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRx_bytes()
	 * @generated
	 * @ordered
	 */
	protected int rx_bytes = RX_BYTES_EDEFAULT;

	/**
	 * The default value of the '{@link #getTx_unicast_pkt() <em>Tx unicast pkt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTx_unicast_pkt()
	 * @generated
	 * @ordered
	 */
	protected static final int TX_UNICAST_PKT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTx_unicast_pkt() <em>Tx unicast pkt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTx_unicast_pkt()
	 * @generated
	 * @ordered
	 */
	protected int tx_unicast_pkt = TX_UNICAST_PKT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTx_retry_pkt() <em>Tx retry pkt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTx_retry_pkt()
	 * @generated
	 * @ordered
	 */
	protected static final int TX_RETRY_PKT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTx_retry_pkt() <em>Tx retry pkt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTx_retry_pkt()
	 * @generated
	 * @ordered
	 */
	protected int tx_retry_pkt = TX_RETRY_PKT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTx_bcast_pkt() <em>Tx bcast pkt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTx_bcast_pkt()
	 * @generated
	 * @ordered
	 */
	protected static final int TX_BCAST_PKT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTx_bcast_pkt() <em>Tx bcast pkt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTx_bcast_pkt()
	 * @generated
	 * @ordered
	 */
	protected int tx_bcast_pkt = TX_BCAST_PKT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTx_bytes() <em>Tx bytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTx_bytes()
	 * @generated
	 * @ordered
	 */
	protected static final int TX_BYTES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTx_bytes() <em>Tx bytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTx_bytes()
	 * @generated
	 * @ordered
	 */
	protected int tx_bytes = TX_BYTES_EDEFAULT;

	/**
	 * The default value of the '{@link #getZero_err_pkt() <em>Zero err pkt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZero_err_pkt()
	 * @generated
	 * @ordered
	 */
	protected static final int ZERO_ERR_PKT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getZero_err_pkt() <em>Zero err pkt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZero_err_pkt()
	 * @generated
	 * @ordered
	 */
	protected int zero_err_pkt = ZERO_ERR_PKT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLast_packet_time() <em>Last packet time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLast_packet_time()
	 * @generated
	 * @ordered
	 */
	protected static final double LAST_PACKET_TIME_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLast_packet_time() <em>Last packet time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLast_packet_time()
	 * @generated
	 * @ordered
	 */
	protected double last_packet_time = LAST_PACKET_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNo_src() <em>No src</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNo_src()
	 * @generated
	 * @ordered
	 */
	protected static final int NO_SRC_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNo_src() <em>No src</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNo_src()
	 * @generated
	 * @ordered
	 */
	protected int no_src = NO_SRC_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MacImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Device_wifi_wifidevice_cst_statsPackage.Literals.MAC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Channelstats getEContainer_mac() {
		if (eContainerFeatureID() != Device_wifi_wifidevice_cst_statsPackage.MAC__ECONTAINER_MAC) return null;
		return (Channelstats)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEContainer_mac(Channelstats newEContainer_mac, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEContainer_mac, Device_wifi_wifidevice_cst_statsPackage.MAC__ECONTAINER_MAC, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEContainer_mac(Channelstats newEContainer_mac) {
		if (newEContainer_mac != eInternalContainer() || (eContainerFeatureID() != Device_wifi_wifidevice_cst_statsPackage.MAC__ECONTAINER_MAC && newEContainer_mac != null)) {
			if (EcoreUtil.isAncestor(this, newEContainer_mac))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEContainer_mac != null)
				msgs = ((InternalEObject)newEContainer_mac).eInverseAdd(this, Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__MAC, Channelstats.class, msgs);
			msgs = basicSetEContainer_mac(newEContainer_mac, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_cst_statsPackage.MAC__ECONTAINER_MAC, newEContainer_mac, newEContainer_mac));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPackets() {
		return packets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackets(int newPackets) {
		int oldPackets = packets;
		packets = newPackets;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_cst_statsPackage.MAC__PACKETS, oldPackets, packets));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRx_pkt() {
		return rx_pkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRx_pkt(int newRx_pkt) {
		int oldRx_pkt = rx_pkt;
		rx_pkt = newRx_pkt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_cst_statsPackage.MAC__RX_PKT, oldRx_pkt, rx_pkt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNo_err_pkt() {
		return no_err_pkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNo_err_pkt(int newNo_err_pkt) {
		int oldNo_err_pkt = no_err_pkt;
		no_err_pkt = newNo_err_pkt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_cst_statsPackage.MAC__NO_ERR_PKT, oldNo_err_pkt, no_err_pkt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCrc_err_pkt() {
		return crc_err_pkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCrc_err_pkt(int newCrc_err_pkt) {
		int oldCrc_err_pkt = crc_err_pkt;
		crc_err_pkt = newCrc_err_pkt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_cst_statsPackage.MAC__CRC_ERR_PKT, oldCrc_err_pkt, crc_err_pkt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPhy_err_pkt() {
		return phy_err_pkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhy_err_pkt(int newPhy_err_pkt) {
		int oldPhy_err_pkt = phy_err_pkt;
		phy_err_pkt = newPhy_err_pkt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_cst_statsPackage.MAC__PHY_ERR_PKT, oldPhy_err_pkt, phy_err_pkt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getUnknown_err_pkt() {
		return unknown_err_pkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnknown_err_pkt(int newUnknown_err_pkt) {
		int oldUnknown_err_pkt = unknown_err_pkt;
		unknown_err_pkt = newUnknown_err_pkt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_cst_statsPackage.MAC__UNKNOWN_ERR_PKT, oldUnknown_err_pkt, unknown_err_pkt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTx_pkt() {
		return tx_pkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTx_pkt(int newTx_pkt) {
		int oldTx_pkt = tx_pkt;
		tx_pkt = newTx_pkt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_cst_statsPackage.MAC__TX_PKT, oldTx_pkt, tx_pkt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRx_unicast_pkt() {
		return rx_unicast_pkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRx_unicast_pkt(int newRx_unicast_pkt) {
		int oldRx_unicast_pkt = rx_unicast_pkt;
		rx_unicast_pkt = newRx_unicast_pkt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_cst_statsPackage.MAC__RX_UNICAST_PKT, oldRx_unicast_pkt, rx_unicast_pkt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRx_retry_pkt() {
		return rx_retry_pkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRx_retry_pkt(int newRx_retry_pkt) {
		int oldRx_retry_pkt = rx_retry_pkt;
		rx_retry_pkt = newRx_retry_pkt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_cst_statsPackage.MAC__RX_RETRY_PKT, oldRx_retry_pkt, rx_retry_pkt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRx_bcast_pkt() {
		return rx_bcast_pkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRx_bcast_pkt(int newRx_bcast_pkt) {
		int oldRx_bcast_pkt = rx_bcast_pkt;
		rx_bcast_pkt = newRx_bcast_pkt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_cst_statsPackage.MAC__RX_BCAST_PKT, oldRx_bcast_pkt, rx_bcast_pkt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRx_bytes() {
		return rx_bytes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRx_bytes(int newRx_bytes) {
		int oldRx_bytes = rx_bytes;
		rx_bytes = newRx_bytes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_cst_statsPackage.MAC__RX_BYTES, oldRx_bytes, rx_bytes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTx_unicast_pkt() {
		return tx_unicast_pkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTx_unicast_pkt(int newTx_unicast_pkt) {
		int oldTx_unicast_pkt = tx_unicast_pkt;
		tx_unicast_pkt = newTx_unicast_pkt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_cst_statsPackage.MAC__TX_UNICAST_PKT, oldTx_unicast_pkt, tx_unicast_pkt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTx_retry_pkt() {
		return tx_retry_pkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTx_retry_pkt(int newTx_retry_pkt) {
		int oldTx_retry_pkt = tx_retry_pkt;
		tx_retry_pkt = newTx_retry_pkt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_cst_statsPackage.MAC__TX_RETRY_PKT, oldTx_retry_pkt, tx_retry_pkt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTx_bcast_pkt() {
		return tx_bcast_pkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTx_bcast_pkt(int newTx_bcast_pkt) {
		int oldTx_bcast_pkt = tx_bcast_pkt;
		tx_bcast_pkt = newTx_bcast_pkt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_cst_statsPackage.MAC__TX_BCAST_PKT, oldTx_bcast_pkt, tx_bcast_pkt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTx_bytes() {
		return tx_bytes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTx_bytes(int newTx_bytes) {
		int oldTx_bytes = tx_bytes;
		tx_bytes = newTx_bytes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_cst_statsPackage.MAC__TX_BYTES, oldTx_bytes, tx_bytes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getZero_err_pkt() {
		return zero_err_pkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZero_err_pkt(int newZero_err_pkt) {
		int oldZero_err_pkt = zero_err_pkt;
		zero_err_pkt = newZero_err_pkt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_cst_statsPackage.MAC__ZERO_ERR_PKT, oldZero_err_pkt, zero_err_pkt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLast_packet_time() {
		return last_packet_time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLast_packet_time(double newLast_packet_time) {
		double oldLast_packet_time = last_packet_time;
		last_packet_time = newLast_packet_time;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_cst_statsPackage.MAC__LAST_PACKET_TIME, oldLast_packet_time, last_packet_time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNo_src() {
		return no_src;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNo_src(int newNo_src) {
		int oldNo_src = no_src;
		no_src = newNo_src;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_cst_statsPackage.MAC__NO_SRC, oldNo_src, no_src));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Device_wifi_wifidevice_cst_statsPackage.MAC__ECONTAINER_MAC:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEContainer_mac((Channelstats)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Device_wifi_wifidevice_cst_statsPackage.MAC__ECONTAINER_MAC:
				return basicSetEContainer_mac(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case Device_wifi_wifidevice_cst_statsPackage.MAC__ECONTAINER_MAC:
				return eInternalContainer().eInverseRemove(this, Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__MAC, Channelstats.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Device_wifi_wifidevice_cst_statsPackage.MAC__ECONTAINER_MAC:
				return getEContainer_mac();
			case Device_wifi_wifidevice_cst_statsPackage.MAC__PACKETS:
				return getPackets();
			case Device_wifi_wifidevice_cst_statsPackage.MAC__RX_PKT:
				return getRx_pkt();
			case Device_wifi_wifidevice_cst_statsPackage.MAC__NO_ERR_PKT:
				return getNo_err_pkt();
			case Device_wifi_wifidevice_cst_statsPackage.MAC__CRC_ERR_PKT:
				return getCrc_err_pkt();
			case Device_wifi_wifidevice_cst_statsPackage.MAC__PHY_ERR_PKT:
				return getPhy_err_pkt();
			case Device_wifi_wifidevice_cst_statsPackage.MAC__UNKNOWN_ERR_PKT:
				return getUnknown_err_pkt();
			case Device_wifi_wifidevice_cst_statsPackage.MAC__TX_PKT:
				return getTx_pkt();
			case Device_wifi_wifidevice_cst_statsPackage.MAC__RX_UNICAST_PKT:
				return getRx_unicast_pkt();
			case Device_wifi_wifidevice_cst_statsPackage.MAC__RX_RETRY_PKT:
				return getRx_retry_pkt();
			case Device_wifi_wifidevice_cst_statsPackage.MAC__RX_BCAST_PKT:
				return getRx_bcast_pkt();
			case Device_wifi_wifidevice_cst_statsPackage.MAC__RX_BYTES:
				return getRx_bytes();
			case Device_wifi_wifidevice_cst_statsPackage.MAC__TX_UNICAST_PKT:
				return getTx_unicast_pkt();
			case Device_wifi_wifidevice_cst_statsPackage.MAC__TX_RETRY_PKT:
				return getTx_retry_pkt();
			case Device_wifi_wifidevice_cst_statsPackage.MAC__TX_BCAST_PKT:
				return getTx_bcast_pkt();
			case Device_wifi_wifidevice_cst_statsPackage.MAC__TX_BYTES:
				return getTx_bytes();
			case Device_wifi_wifidevice_cst_statsPackage.MAC__ZERO_ERR_PKT:
				return getZero_err_pkt();
			case Device_wifi_wifidevice_cst_statsPackage.MAC__LAST_PACKET_TIME:
				return getLast_packet_time();
			case Device_wifi_wifidevice_cst_statsPackage.MAC__NO_SRC:
				return getNo_src();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Device_wifi_wifidevice_cst_statsPackage.MAC__ECONTAINER_MAC:
				setEContainer_mac((Channelstats)newValue);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.MAC__PACKETS:
				setPackets((Integer)newValue);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.MAC__RX_PKT:
				setRx_pkt((Integer)newValue);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.MAC__NO_ERR_PKT:
				setNo_err_pkt((Integer)newValue);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.MAC__CRC_ERR_PKT:
				setCrc_err_pkt((Integer)newValue);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.MAC__PHY_ERR_PKT:
				setPhy_err_pkt((Integer)newValue);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.MAC__UNKNOWN_ERR_PKT:
				setUnknown_err_pkt((Integer)newValue);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.MAC__TX_PKT:
				setTx_pkt((Integer)newValue);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.MAC__RX_UNICAST_PKT:
				setRx_unicast_pkt((Integer)newValue);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.MAC__RX_RETRY_PKT:
				setRx_retry_pkt((Integer)newValue);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.MAC__RX_BCAST_PKT:
				setRx_bcast_pkt((Integer)newValue);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.MAC__RX_BYTES:
				setRx_bytes((Integer)newValue);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.MAC__TX_UNICAST_PKT:
				setTx_unicast_pkt((Integer)newValue);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.MAC__TX_RETRY_PKT:
				setTx_retry_pkt((Integer)newValue);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.MAC__TX_BCAST_PKT:
				setTx_bcast_pkt((Integer)newValue);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.MAC__TX_BYTES:
				setTx_bytes((Integer)newValue);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.MAC__ZERO_ERR_PKT:
				setZero_err_pkt((Integer)newValue);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.MAC__LAST_PACKET_TIME:
				setLast_packet_time((Double)newValue);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.MAC__NO_SRC:
				setNo_src((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Device_wifi_wifidevice_cst_statsPackage.MAC__ECONTAINER_MAC:
				setEContainer_mac((Channelstats)null);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.MAC__PACKETS:
				setPackets(PACKETS_EDEFAULT);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.MAC__RX_PKT:
				setRx_pkt(RX_PKT_EDEFAULT);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.MAC__NO_ERR_PKT:
				setNo_err_pkt(NO_ERR_PKT_EDEFAULT);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.MAC__CRC_ERR_PKT:
				setCrc_err_pkt(CRC_ERR_PKT_EDEFAULT);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.MAC__PHY_ERR_PKT:
				setPhy_err_pkt(PHY_ERR_PKT_EDEFAULT);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.MAC__UNKNOWN_ERR_PKT:
				setUnknown_err_pkt(UNKNOWN_ERR_PKT_EDEFAULT);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.MAC__TX_PKT:
				setTx_pkt(TX_PKT_EDEFAULT);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.MAC__RX_UNICAST_PKT:
				setRx_unicast_pkt(RX_UNICAST_PKT_EDEFAULT);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.MAC__RX_RETRY_PKT:
				setRx_retry_pkt(RX_RETRY_PKT_EDEFAULT);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.MAC__RX_BCAST_PKT:
				setRx_bcast_pkt(RX_BCAST_PKT_EDEFAULT);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.MAC__RX_BYTES:
				setRx_bytes(RX_BYTES_EDEFAULT);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.MAC__TX_UNICAST_PKT:
				setTx_unicast_pkt(TX_UNICAST_PKT_EDEFAULT);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.MAC__TX_RETRY_PKT:
				setTx_retry_pkt(TX_RETRY_PKT_EDEFAULT);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.MAC__TX_BCAST_PKT:
				setTx_bcast_pkt(TX_BCAST_PKT_EDEFAULT);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.MAC__TX_BYTES:
				setTx_bytes(TX_BYTES_EDEFAULT);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.MAC__ZERO_ERR_PKT:
				setZero_err_pkt(ZERO_ERR_PKT_EDEFAULT);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.MAC__LAST_PACKET_TIME:
				setLast_packet_time(LAST_PACKET_TIME_EDEFAULT);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.MAC__NO_SRC:
				setNo_src(NO_SRC_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Device_wifi_wifidevice_cst_statsPackage.MAC__ECONTAINER_MAC:
				return getEContainer_mac() != null;
			case Device_wifi_wifidevice_cst_statsPackage.MAC__PACKETS:
				return packets != PACKETS_EDEFAULT;
			case Device_wifi_wifidevice_cst_statsPackage.MAC__RX_PKT:
				return rx_pkt != RX_PKT_EDEFAULT;
			case Device_wifi_wifidevice_cst_statsPackage.MAC__NO_ERR_PKT:
				return no_err_pkt != NO_ERR_PKT_EDEFAULT;
			case Device_wifi_wifidevice_cst_statsPackage.MAC__CRC_ERR_PKT:
				return crc_err_pkt != CRC_ERR_PKT_EDEFAULT;
			case Device_wifi_wifidevice_cst_statsPackage.MAC__PHY_ERR_PKT:
				return phy_err_pkt != PHY_ERR_PKT_EDEFAULT;
			case Device_wifi_wifidevice_cst_statsPackage.MAC__UNKNOWN_ERR_PKT:
				return unknown_err_pkt != UNKNOWN_ERR_PKT_EDEFAULT;
			case Device_wifi_wifidevice_cst_statsPackage.MAC__TX_PKT:
				return tx_pkt != TX_PKT_EDEFAULT;
			case Device_wifi_wifidevice_cst_statsPackage.MAC__RX_UNICAST_PKT:
				return rx_unicast_pkt != RX_UNICAST_PKT_EDEFAULT;
			case Device_wifi_wifidevice_cst_statsPackage.MAC__RX_RETRY_PKT:
				return rx_retry_pkt != RX_RETRY_PKT_EDEFAULT;
			case Device_wifi_wifidevice_cst_statsPackage.MAC__RX_BCAST_PKT:
				return rx_bcast_pkt != RX_BCAST_PKT_EDEFAULT;
			case Device_wifi_wifidevice_cst_statsPackage.MAC__RX_BYTES:
				return rx_bytes != RX_BYTES_EDEFAULT;
			case Device_wifi_wifidevice_cst_statsPackage.MAC__TX_UNICAST_PKT:
				return tx_unicast_pkt != TX_UNICAST_PKT_EDEFAULT;
			case Device_wifi_wifidevice_cst_statsPackage.MAC__TX_RETRY_PKT:
				return tx_retry_pkt != TX_RETRY_PKT_EDEFAULT;
			case Device_wifi_wifidevice_cst_statsPackage.MAC__TX_BCAST_PKT:
				return tx_bcast_pkt != TX_BCAST_PKT_EDEFAULT;
			case Device_wifi_wifidevice_cst_statsPackage.MAC__TX_BYTES:
				return tx_bytes != TX_BYTES_EDEFAULT;
			case Device_wifi_wifidevice_cst_statsPackage.MAC__ZERO_ERR_PKT:
				return zero_err_pkt != ZERO_ERR_PKT_EDEFAULT;
			case Device_wifi_wifidevice_cst_statsPackage.MAC__LAST_PACKET_TIME:
				return last_packet_time != LAST_PACKET_TIME_EDEFAULT;
			case Device_wifi_wifidevice_cst_statsPackage.MAC__NO_SRC:
				return no_src != NO_SRC_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (packets: ");
		result.append(packets);
		result.append(", rx_pkt: ");
		result.append(rx_pkt);
		result.append(", no_err_pkt: ");
		result.append(no_err_pkt);
		result.append(", crc_err_pkt: ");
		result.append(crc_err_pkt);
		result.append(", phy_err_pkt: ");
		result.append(phy_err_pkt);
		result.append(", unknown_err_pkt: ");
		result.append(unknown_err_pkt);
		result.append(", tx_pkt: ");
		result.append(tx_pkt);
		result.append(", rx_unicast_pkt: ");
		result.append(rx_unicast_pkt);
		result.append(", rx_retry_pkt: ");
		result.append(rx_retry_pkt);
		result.append(", rx_bcast_pkt: ");
		result.append(rx_bcast_pkt);
		result.append(", rx_bytes: ");
		result.append(rx_bytes);
		result.append(", tx_unicast_pkt: ");
		result.append(tx_unicast_pkt);
		result.append(", tx_retry_pkt: ");
		result.append(tx_retry_pkt);
		result.append(", tx_bcast_pkt: ");
		result.append(tx_bcast_pkt);
		result.append(", tx_bytes: ");
		result.append(tx_bytes);
		result.append(", zero_err_pkt: ");
		result.append(zero_err_pkt);
		result.append(", last_packet_time: ");
		result.append(last_packet_time);
		result.append(", no_src: ");
		result.append(no_src);
		result.append(')');
		return result.toString();
	}

} //MacImpl
