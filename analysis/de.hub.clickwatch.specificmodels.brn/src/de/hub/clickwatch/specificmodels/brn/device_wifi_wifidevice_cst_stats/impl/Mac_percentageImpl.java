/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl;

import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Channelstats;
import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage;
import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac_percentage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mac percentage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.Mac_percentageImpl#getEContainer_mac_percentage <em>EContainer mac percentage</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.Mac_percentageImpl#getBusy <em>Busy</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.Mac_percentageImpl#getRx <em>Rx</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.Mac_percentageImpl#getTx <em>Tx</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.Mac_percentageImpl#getNoerr_rx <em>Noerr rx</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.Mac_percentageImpl#getCrc_rx <em>Crc rx</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.Mac_percentageImpl#getPhy_rx <em>Phy rx</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.Mac_percentageImpl#getUnknown_err_rx <em>Unknown err rx</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.Mac_percentageImpl#getUnit <em>Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Mac_percentageImpl extends EObjectImpl implements Mac_percentage {
	/**
	 * The default value of the '{@link #getBusy() <em>Busy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusy()
	 * @generated
	 * @ordered
	 */
	protected static final int BUSY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBusy() <em>Busy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusy()
	 * @generated
	 * @ordered
	 */
	protected int busy = BUSY_EDEFAULT;

	/**
	 * The default value of the '{@link #getRx() <em>Rx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRx()
	 * @generated
	 * @ordered
	 */
	protected static final int RX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRx() <em>Rx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRx()
	 * @generated
	 * @ordered
	 */
	protected int rx = RX_EDEFAULT;

	/**
	 * The default value of the '{@link #getTx() <em>Tx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTx()
	 * @generated
	 * @ordered
	 */
	protected static final int TX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTx() <em>Tx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTx()
	 * @generated
	 * @ordered
	 */
	protected int tx = TX_EDEFAULT;

	/**
	 * The default value of the '{@link #getNoerr_rx() <em>Noerr rx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoerr_rx()
	 * @generated
	 * @ordered
	 */
	protected static final int NOERR_RX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNoerr_rx() <em>Noerr rx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoerr_rx()
	 * @generated
	 * @ordered
	 */
	protected int noerr_rx = NOERR_RX_EDEFAULT;

	/**
	 * The default value of the '{@link #getCrc_rx() <em>Crc rx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrc_rx()
	 * @generated
	 * @ordered
	 */
	protected static final int CRC_RX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCrc_rx() <em>Crc rx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrc_rx()
	 * @generated
	 * @ordered
	 */
	protected int crc_rx = CRC_RX_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhy_rx() <em>Phy rx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhy_rx()
	 * @generated
	 * @ordered
	 */
	protected static final int PHY_RX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPhy_rx() <em>Phy rx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhy_rx()
	 * @generated
	 * @ordered
	 */
	protected int phy_rx = PHY_RX_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnknown_err_rx() <em>Unknown err rx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnknown_err_rx()
	 * @generated
	 * @ordered
	 */
	protected static final int UNKNOWN_ERR_RX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getUnknown_err_rx() <em>Unknown err rx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnknown_err_rx()
	 * @generated
	 * @ordered
	 */
	protected int unknown_err_rx = UNKNOWN_ERR_RX_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected String unit = UNIT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Mac_percentageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Device_wifi_wifidevice_cst_statsPackage.Literals.MAC_PERCENTAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Channelstats getEContainer_mac_percentage() {
		if (eContainerFeatureID() != Device_wifi_wifidevice_cst_statsPackage.MAC_PERCENTAGE__ECONTAINER_MAC_PERCENTAGE) return null;
		return (Channelstats)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEContainer_mac_percentage(Channelstats newEContainer_mac_percentage, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEContainer_mac_percentage, Device_wifi_wifidevice_cst_statsPackage.MAC_PERCENTAGE__ECONTAINER_MAC_PERCENTAGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEContainer_mac_percentage(Channelstats newEContainer_mac_percentage) {
		if (newEContainer_mac_percentage != eInternalContainer() || (eContainerFeatureID() != Device_wifi_wifidevice_cst_statsPackage.MAC_PERCENTAGE__ECONTAINER_MAC_PERCENTAGE && newEContainer_mac_percentage != null)) {
			if (EcoreUtil.isAncestor(this, newEContainer_mac_percentage))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEContainer_mac_percentage != null)
				msgs = ((InternalEObject)newEContainer_mac_percentage).eInverseAdd(this, Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__MAC_PERCENTAGE, Channelstats.class, msgs);
			msgs = basicSetEContainer_mac_percentage(newEContainer_mac_percentage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_cst_statsPackage.MAC_PERCENTAGE__ECONTAINER_MAC_PERCENTAGE, newEContainer_mac_percentage, newEContainer_mac_percentage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBusy() {
		return busy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusy(int newBusy) {
		int oldBusy = busy;
		busy = newBusy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_cst_statsPackage.MAC_PERCENTAGE__BUSY, oldBusy, busy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRx() {
		return rx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRx(int newRx) {
		int oldRx = rx;
		rx = newRx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_cst_statsPackage.MAC_PERCENTAGE__RX, oldRx, rx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTx() {
		return tx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTx(int newTx) {
		int oldTx = tx;
		tx = newTx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_cst_statsPackage.MAC_PERCENTAGE__TX, oldTx, tx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNoerr_rx() {
		return noerr_rx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoerr_rx(int newNoerr_rx) {
		int oldNoerr_rx = noerr_rx;
		noerr_rx = newNoerr_rx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_cst_statsPackage.MAC_PERCENTAGE__NOERR_RX, oldNoerr_rx, noerr_rx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCrc_rx() {
		return crc_rx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCrc_rx(int newCrc_rx) {
		int oldCrc_rx = crc_rx;
		crc_rx = newCrc_rx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_cst_statsPackage.MAC_PERCENTAGE__CRC_RX, oldCrc_rx, crc_rx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPhy_rx() {
		return phy_rx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhy_rx(int newPhy_rx) {
		int oldPhy_rx = phy_rx;
		phy_rx = newPhy_rx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_cst_statsPackage.MAC_PERCENTAGE__PHY_RX, oldPhy_rx, phy_rx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getUnknown_err_rx() {
		return unknown_err_rx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnknown_err_rx(int newUnknown_err_rx) {
		int oldUnknown_err_rx = unknown_err_rx;
		unknown_err_rx = newUnknown_err_rx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_cst_statsPackage.MAC_PERCENTAGE__UNKNOWN_ERR_RX, oldUnknown_err_rx, unknown_err_rx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(String newUnit) {
		String oldUnit = unit;
		unit = newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_cst_statsPackage.MAC_PERCENTAGE__UNIT, oldUnit, unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Device_wifi_wifidevice_cst_statsPackage.MAC_PERCENTAGE__ECONTAINER_MAC_PERCENTAGE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEContainer_mac_percentage((Channelstats)otherEnd, msgs);
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
			case Device_wifi_wifidevice_cst_statsPackage.MAC_PERCENTAGE__ECONTAINER_MAC_PERCENTAGE:
				return basicSetEContainer_mac_percentage(null, msgs);
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
			case Device_wifi_wifidevice_cst_statsPackage.MAC_PERCENTAGE__ECONTAINER_MAC_PERCENTAGE:
				return eInternalContainer().eInverseRemove(this, Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__MAC_PERCENTAGE, Channelstats.class, msgs);
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
			case Device_wifi_wifidevice_cst_statsPackage.MAC_PERCENTAGE__ECONTAINER_MAC_PERCENTAGE:
				return getEContainer_mac_percentage();
			case Device_wifi_wifidevice_cst_statsPackage.MAC_PERCENTAGE__BUSY:
				return getBusy();
			case Device_wifi_wifidevice_cst_statsPackage.MAC_PERCENTAGE__RX:
				return getRx();
			case Device_wifi_wifidevice_cst_statsPackage.MAC_PERCENTAGE__TX:
				return getTx();
			case Device_wifi_wifidevice_cst_statsPackage.MAC_PERCENTAGE__NOERR_RX:
				return getNoerr_rx();
			case Device_wifi_wifidevice_cst_statsPackage.MAC_PERCENTAGE__CRC_RX:
				return getCrc_rx();
			case Device_wifi_wifidevice_cst_statsPackage.MAC_PERCENTAGE__PHY_RX:
				return getPhy_rx();
			case Device_wifi_wifidevice_cst_statsPackage.MAC_PERCENTAGE__UNKNOWN_ERR_RX:
				return getUnknown_err_rx();
			case Device_wifi_wifidevice_cst_statsPackage.MAC_PERCENTAGE__UNIT:
				return getUnit();
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
			case Device_wifi_wifidevice_cst_statsPackage.MAC_PERCENTAGE__ECONTAINER_MAC_PERCENTAGE:
				setEContainer_mac_percentage((Channelstats)newValue);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.MAC_PERCENTAGE__BUSY:
				setBusy((Integer)newValue);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.MAC_PERCENTAGE__RX:
				setRx((Integer)newValue);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.MAC_PERCENTAGE__TX:
				setTx((Integer)newValue);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.MAC_PERCENTAGE__NOERR_RX:
				setNoerr_rx((Integer)newValue);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.MAC_PERCENTAGE__CRC_RX:
				setCrc_rx((Integer)newValue);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.MAC_PERCENTAGE__PHY_RX:
				setPhy_rx((Integer)newValue);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.MAC_PERCENTAGE__UNKNOWN_ERR_RX:
				setUnknown_err_rx((Integer)newValue);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.MAC_PERCENTAGE__UNIT:
				setUnit((String)newValue);
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
			case Device_wifi_wifidevice_cst_statsPackage.MAC_PERCENTAGE__ECONTAINER_MAC_PERCENTAGE:
				setEContainer_mac_percentage((Channelstats)null);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.MAC_PERCENTAGE__BUSY:
				setBusy(BUSY_EDEFAULT);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.MAC_PERCENTAGE__RX:
				setRx(RX_EDEFAULT);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.MAC_PERCENTAGE__TX:
				setTx(TX_EDEFAULT);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.MAC_PERCENTAGE__NOERR_RX:
				setNoerr_rx(NOERR_RX_EDEFAULT);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.MAC_PERCENTAGE__CRC_RX:
				setCrc_rx(CRC_RX_EDEFAULT);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.MAC_PERCENTAGE__PHY_RX:
				setPhy_rx(PHY_RX_EDEFAULT);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.MAC_PERCENTAGE__UNKNOWN_ERR_RX:
				setUnknown_err_rx(UNKNOWN_ERR_RX_EDEFAULT);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.MAC_PERCENTAGE__UNIT:
				setUnit(UNIT_EDEFAULT);
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
			case Device_wifi_wifidevice_cst_statsPackage.MAC_PERCENTAGE__ECONTAINER_MAC_PERCENTAGE:
				return getEContainer_mac_percentage() != null;
			case Device_wifi_wifidevice_cst_statsPackage.MAC_PERCENTAGE__BUSY:
				return busy != BUSY_EDEFAULT;
			case Device_wifi_wifidevice_cst_statsPackage.MAC_PERCENTAGE__RX:
				return rx != RX_EDEFAULT;
			case Device_wifi_wifidevice_cst_statsPackage.MAC_PERCENTAGE__TX:
				return tx != TX_EDEFAULT;
			case Device_wifi_wifidevice_cst_statsPackage.MAC_PERCENTAGE__NOERR_RX:
				return noerr_rx != NOERR_RX_EDEFAULT;
			case Device_wifi_wifidevice_cst_statsPackage.MAC_PERCENTAGE__CRC_RX:
				return crc_rx != CRC_RX_EDEFAULT;
			case Device_wifi_wifidevice_cst_statsPackage.MAC_PERCENTAGE__PHY_RX:
				return phy_rx != PHY_RX_EDEFAULT;
			case Device_wifi_wifidevice_cst_statsPackage.MAC_PERCENTAGE__UNKNOWN_ERR_RX:
				return unknown_err_rx != UNKNOWN_ERR_RX_EDEFAULT;
			case Device_wifi_wifidevice_cst_statsPackage.MAC_PERCENTAGE__UNIT:
				return UNIT_EDEFAULT == null ? unit != null : !UNIT_EDEFAULT.equals(unit);
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
		result.append(" (busy: ");
		result.append(busy);
		result.append(", rx: ");
		result.append(rx);
		result.append(", tx: ");
		result.append(tx);
		result.append(", noerr_rx: ");
		result.append(noerr_rx);
		result.append(", crc_rx: ");
		result.append(crc_rx);
		result.append(", phy_rx: ");
		result.append(phy_rx);
		result.append(", unknown_err_rx: ");
		result.append(unknown_err_rx);
		result.append(", unit: ");
		result.append(unit);
		result.append(')');
		return result.toString();
	}

} //Mac_percentageImpl
