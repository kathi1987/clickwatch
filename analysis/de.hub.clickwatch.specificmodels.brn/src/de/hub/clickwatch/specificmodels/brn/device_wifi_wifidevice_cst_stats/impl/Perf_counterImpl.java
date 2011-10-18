/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl;

import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Channelstats;
import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage;
import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Perf_counter;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Perf counter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.Perf_counterImpl#getEContainer_perf_counter <em>EContainer perf counter</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.Perf_counterImpl#getCycles <em>Cycles</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.Perf_counterImpl#getBusy_cycles <em>Busy cycles</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.Perf_counterImpl#getRx_cycles <em>Rx cycles</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.Perf_counterImpl#getTx_cycles <em>Tx cycles</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Perf_counterImpl extends EObjectImpl implements Perf_counter {
	/**
	 * The default value of the '{@link #getCycles() <em>Cycles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCycles()
	 * @generated
	 * @ordered
	 */
	protected static final int CYCLES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCycles() <em>Cycles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCycles()
	 * @generated
	 * @ordered
	 */
	protected int cycles = CYCLES_EDEFAULT;

	/**
	 * The default value of the '{@link #getBusy_cycles() <em>Busy cycles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusy_cycles()
	 * @generated
	 * @ordered
	 */
	protected static final int BUSY_CYCLES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBusy_cycles() <em>Busy cycles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusy_cycles()
	 * @generated
	 * @ordered
	 */
	protected int busy_cycles = BUSY_CYCLES_EDEFAULT;

	/**
	 * The default value of the '{@link #getRx_cycles() <em>Rx cycles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRx_cycles()
	 * @generated
	 * @ordered
	 */
	protected static final int RX_CYCLES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRx_cycles() <em>Rx cycles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRx_cycles()
	 * @generated
	 * @ordered
	 */
	protected int rx_cycles = RX_CYCLES_EDEFAULT;

	/**
	 * The default value of the '{@link #getTx_cycles() <em>Tx cycles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTx_cycles()
	 * @generated
	 * @ordered
	 */
	protected static final int TX_CYCLES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTx_cycles() <em>Tx cycles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTx_cycles()
	 * @generated
	 * @ordered
	 */
	protected int tx_cycles = TX_CYCLES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Perf_counterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Device_wifi_wifidevice_cst_statsPackage.Literals.PERF_COUNTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Channelstats getEContainer_perf_counter() {
		if (eContainerFeatureID() != Device_wifi_wifidevice_cst_statsPackage.PERF_COUNTER__ECONTAINER_PERF_COUNTER) return null;
		return (Channelstats)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEContainer_perf_counter(Channelstats newEContainer_perf_counter, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEContainer_perf_counter, Device_wifi_wifidevice_cst_statsPackage.PERF_COUNTER__ECONTAINER_PERF_COUNTER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEContainer_perf_counter(Channelstats newEContainer_perf_counter) {
		if (newEContainer_perf_counter != eInternalContainer() || (eContainerFeatureID() != Device_wifi_wifidevice_cst_statsPackage.PERF_COUNTER__ECONTAINER_PERF_COUNTER && newEContainer_perf_counter != null)) {
			if (EcoreUtil.isAncestor(this, newEContainer_perf_counter))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEContainer_perf_counter != null)
				msgs = ((InternalEObject)newEContainer_perf_counter).eInverseAdd(this, Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__PERF_COUNTER, Channelstats.class, msgs);
			msgs = basicSetEContainer_perf_counter(newEContainer_perf_counter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_cst_statsPackage.PERF_COUNTER__ECONTAINER_PERF_COUNTER, newEContainer_perf_counter, newEContainer_perf_counter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCycles() {
		return cycles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCycles(int newCycles) {
		int oldCycles = cycles;
		cycles = newCycles;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_cst_statsPackage.PERF_COUNTER__CYCLES, oldCycles, cycles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBusy_cycles() {
		return busy_cycles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusy_cycles(int newBusy_cycles) {
		int oldBusy_cycles = busy_cycles;
		busy_cycles = newBusy_cycles;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_cst_statsPackage.PERF_COUNTER__BUSY_CYCLES, oldBusy_cycles, busy_cycles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRx_cycles() {
		return rx_cycles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRx_cycles(int newRx_cycles) {
		int oldRx_cycles = rx_cycles;
		rx_cycles = newRx_cycles;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_cst_statsPackage.PERF_COUNTER__RX_CYCLES, oldRx_cycles, rx_cycles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTx_cycles() {
		return tx_cycles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTx_cycles(int newTx_cycles) {
		int oldTx_cycles = tx_cycles;
		tx_cycles = newTx_cycles;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_cst_statsPackage.PERF_COUNTER__TX_CYCLES, oldTx_cycles, tx_cycles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Device_wifi_wifidevice_cst_statsPackage.PERF_COUNTER__ECONTAINER_PERF_COUNTER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEContainer_perf_counter((Channelstats)otherEnd, msgs);
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
			case Device_wifi_wifidevice_cst_statsPackage.PERF_COUNTER__ECONTAINER_PERF_COUNTER:
				return basicSetEContainer_perf_counter(null, msgs);
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
			case Device_wifi_wifidevice_cst_statsPackage.PERF_COUNTER__ECONTAINER_PERF_COUNTER:
				return eInternalContainer().eInverseRemove(this, Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__PERF_COUNTER, Channelstats.class, msgs);
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
			case Device_wifi_wifidevice_cst_statsPackage.PERF_COUNTER__ECONTAINER_PERF_COUNTER:
				return getEContainer_perf_counter();
			case Device_wifi_wifidevice_cst_statsPackage.PERF_COUNTER__CYCLES:
				return getCycles();
			case Device_wifi_wifidevice_cst_statsPackage.PERF_COUNTER__BUSY_CYCLES:
				return getBusy_cycles();
			case Device_wifi_wifidevice_cst_statsPackage.PERF_COUNTER__RX_CYCLES:
				return getRx_cycles();
			case Device_wifi_wifidevice_cst_statsPackage.PERF_COUNTER__TX_CYCLES:
				return getTx_cycles();
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
			case Device_wifi_wifidevice_cst_statsPackage.PERF_COUNTER__ECONTAINER_PERF_COUNTER:
				setEContainer_perf_counter((Channelstats)newValue);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.PERF_COUNTER__CYCLES:
				setCycles((Integer)newValue);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.PERF_COUNTER__BUSY_CYCLES:
				setBusy_cycles((Integer)newValue);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.PERF_COUNTER__RX_CYCLES:
				setRx_cycles((Integer)newValue);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.PERF_COUNTER__TX_CYCLES:
				setTx_cycles((Integer)newValue);
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
			case Device_wifi_wifidevice_cst_statsPackage.PERF_COUNTER__ECONTAINER_PERF_COUNTER:
				setEContainer_perf_counter((Channelstats)null);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.PERF_COUNTER__CYCLES:
				setCycles(CYCLES_EDEFAULT);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.PERF_COUNTER__BUSY_CYCLES:
				setBusy_cycles(BUSY_CYCLES_EDEFAULT);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.PERF_COUNTER__RX_CYCLES:
				setRx_cycles(RX_CYCLES_EDEFAULT);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.PERF_COUNTER__TX_CYCLES:
				setTx_cycles(TX_CYCLES_EDEFAULT);
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
			case Device_wifi_wifidevice_cst_statsPackage.PERF_COUNTER__ECONTAINER_PERF_COUNTER:
				return getEContainer_perf_counter() != null;
			case Device_wifi_wifidevice_cst_statsPackage.PERF_COUNTER__CYCLES:
				return cycles != CYCLES_EDEFAULT;
			case Device_wifi_wifidevice_cst_statsPackage.PERF_COUNTER__BUSY_CYCLES:
				return busy_cycles != BUSY_CYCLES_EDEFAULT;
			case Device_wifi_wifidevice_cst_statsPackage.PERF_COUNTER__RX_CYCLES:
				return rx_cycles != RX_CYCLES_EDEFAULT;
			case Device_wifi_wifidevice_cst_statsPackage.PERF_COUNTER__TX_CYCLES:
				return tx_cycles != TX_CYCLES_EDEFAULT;
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
		result.append(" (cycles: ");
		result.append(cycles);
		result.append(", busy_cycles: ");
		result.append(busy_cycles);
		result.append(", rx_cycles: ");
		result.append(rx_cycles);
		result.append(", tx_cycles: ");
		result.append(tx_cycles);
		result.append(')');
		return result.toString();
	}

} //Perf_counterImpl
