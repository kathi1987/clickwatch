/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl;

import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage;
import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Nb;
import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Rssi_hist;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rssi hist</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.Rssi_histImpl#getEContainer_rssi_hist <em>EContainer rssi hist</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.Rssi_histImpl#getSize <em>Size</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.Rssi_histImpl#getMax_size <em>Max size</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.Rssi_histImpl#getOverflow <em>Overflow</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.Rssi_histImpl#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Rssi_histImpl extends EObjectImpl implements Rssi_hist {
	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final int SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected int size = SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMax_size() <em>Max size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax_size()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMax_size() <em>Max size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax_size()
	 * @generated
	 * @ordered
	 */
	protected int max_size = MAX_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOverflow() <em>Overflow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverflow()
	 * @generated
	 * @ordered
	 */
	protected static final String OVERFLOW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOverflow() <em>Overflow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverflow()
	 * @generated
	 * @ordered
	 */
	protected String overflow = OVERFLOW_EDEFAULT;

	/**
	 * The default value of the '{@link #getValues() <em>Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValues()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValues() <em>Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValues()
	 * @generated
	 * @ordered
	 */
	protected String values = VALUES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Rssi_histImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Device_wifi_wifidevice_cst_statsPackage.Literals.RSSI_HIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Nb getEContainer_rssi_hist() {
		if (eContainerFeatureID() != Device_wifi_wifidevice_cst_statsPackage.RSSI_HIST__ECONTAINER_RSSI_HIST) return null;
		return (Nb)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEContainer_rssi_hist(Nb newEContainer_rssi_hist, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEContainer_rssi_hist, Device_wifi_wifidevice_cst_statsPackage.RSSI_HIST__ECONTAINER_RSSI_HIST, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEContainer_rssi_hist(Nb newEContainer_rssi_hist) {
		if (newEContainer_rssi_hist != eInternalContainer() || (eContainerFeatureID() != Device_wifi_wifidevice_cst_statsPackage.RSSI_HIST__ECONTAINER_RSSI_HIST && newEContainer_rssi_hist != null)) {
			if (EcoreUtil.isAncestor(this, newEContainer_rssi_hist))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEContainer_rssi_hist != null)
				msgs = ((InternalEObject)newEContainer_rssi_hist).eInverseAdd(this, Device_wifi_wifidevice_cst_statsPackage.NB__RSSI_HIST, Nb.class, msgs);
			msgs = basicSetEContainer_rssi_hist(newEContainer_rssi_hist, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_cst_statsPackage.RSSI_HIST__ECONTAINER_RSSI_HIST, newEContainer_rssi_hist, newEContainer_rssi_hist));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(int newSize) {
		int oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_cst_statsPackage.RSSI_HIST__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMax_size() {
		return max_size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMax_size(int newMax_size) {
		int oldMax_size = max_size;
		max_size = newMax_size;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_cst_statsPackage.RSSI_HIST__MAX_SIZE, oldMax_size, max_size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOverflow() {
		return overflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverflow(String newOverflow) {
		String oldOverflow = overflow;
		overflow = newOverflow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_cst_statsPackage.RSSI_HIST__OVERFLOW, oldOverflow, overflow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValues() {
		return values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValues(String newValues) {
		String oldValues = values;
		values = newValues;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_cst_statsPackage.RSSI_HIST__VALUES, oldValues, values));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Device_wifi_wifidevice_cst_statsPackage.RSSI_HIST__ECONTAINER_RSSI_HIST:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEContainer_rssi_hist((Nb)otherEnd, msgs);
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
			case Device_wifi_wifidevice_cst_statsPackage.RSSI_HIST__ECONTAINER_RSSI_HIST:
				return basicSetEContainer_rssi_hist(null, msgs);
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
			case Device_wifi_wifidevice_cst_statsPackage.RSSI_HIST__ECONTAINER_RSSI_HIST:
				return eInternalContainer().eInverseRemove(this, Device_wifi_wifidevice_cst_statsPackage.NB__RSSI_HIST, Nb.class, msgs);
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
			case Device_wifi_wifidevice_cst_statsPackage.RSSI_HIST__ECONTAINER_RSSI_HIST:
				return getEContainer_rssi_hist();
			case Device_wifi_wifidevice_cst_statsPackage.RSSI_HIST__SIZE:
				return getSize();
			case Device_wifi_wifidevice_cst_statsPackage.RSSI_HIST__MAX_SIZE:
				return getMax_size();
			case Device_wifi_wifidevice_cst_statsPackage.RSSI_HIST__OVERFLOW:
				return getOverflow();
			case Device_wifi_wifidevice_cst_statsPackage.RSSI_HIST__VALUES:
				return getValues();
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
			case Device_wifi_wifidevice_cst_statsPackage.RSSI_HIST__ECONTAINER_RSSI_HIST:
				setEContainer_rssi_hist((Nb)newValue);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.RSSI_HIST__SIZE:
				setSize((Integer)newValue);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.RSSI_HIST__MAX_SIZE:
				setMax_size((Integer)newValue);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.RSSI_HIST__OVERFLOW:
				setOverflow((String)newValue);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.RSSI_HIST__VALUES:
				setValues((String)newValue);
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
			case Device_wifi_wifidevice_cst_statsPackage.RSSI_HIST__ECONTAINER_RSSI_HIST:
				setEContainer_rssi_hist((Nb)null);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.RSSI_HIST__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.RSSI_HIST__MAX_SIZE:
				setMax_size(MAX_SIZE_EDEFAULT);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.RSSI_HIST__OVERFLOW:
				setOverflow(OVERFLOW_EDEFAULT);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.RSSI_HIST__VALUES:
				setValues(VALUES_EDEFAULT);
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
			case Device_wifi_wifidevice_cst_statsPackage.RSSI_HIST__ECONTAINER_RSSI_HIST:
				return getEContainer_rssi_hist() != null;
			case Device_wifi_wifidevice_cst_statsPackage.RSSI_HIST__SIZE:
				return size != SIZE_EDEFAULT;
			case Device_wifi_wifidevice_cst_statsPackage.RSSI_HIST__MAX_SIZE:
				return max_size != MAX_SIZE_EDEFAULT;
			case Device_wifi_wifidevice_cst_statsPackage.RSSI_HIST__OVERFLOW:
				return OVERFLOW_EDEFAULT == null ? overflow != null : !OVERFLOW_EDEFAULT.equals(overflow);
			case Device_wifi_wifidevice_cst_statsPackage.RSSI_HIST__VALUES:
				return VALUES_EDEFAULT == null ? values != null : !VALUES_EDEFAULT.equals(values);
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
		result.append(" (size: ");
		result.append(size);
		result.append(", max_size: ");
		result.append(max_size);
		result.append(", overflow: ");
		result.append(overflow);
		result.append(", values: ");
		result.append(values);
		result.append(')');
		return result.toString();
	}

} //Rssi_histImpl
