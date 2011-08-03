/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.device_wifi_data_power_systempower.impl;

import de.hub.clickwatch.specificmodels.brn.device_wifi_data_power_systempower.Device;
import de.hub.clickwatch.specificmodels.brn.device_wifi_data_power_systempower.Device_wifi_data_power_systempowerPackage;
import de.hub.clickwatch.specificmodels.brn.device_wifi_data_power_systempower.Settxpower;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_data_power_systempower.impl.DeviceImpl#getEContainer_device <em>EContainer device</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_data_power_systempower.impl.DeviceImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_data_power_systempower.impl.DeviceImpl#getDevice_addr <em>Device addr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeviceImpl extends EObjectImpl implements Device {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDevice_addr() <em>Device addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevice_addr()
	 * @generated
	 * @ordered
	 */
	protected static final String DEVICE_ADDR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDevice_addr() <em>Device addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevice_addr()
	 * @generated
	 * @ordered
	 */
	protected String device_addr = DEVICE_ADDR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Device_wifi_data_power_systempowerPackage.Literals.DEVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Settxpower getEContainer_device() {
		if (eContainerFeatureID() != Device_wifi_data_power_systempowerPackage.DEVICE__ECONTAINER_DEVICE) return null;
		return (Settxpower)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEContainer_device(Settxpower newEContainer_device, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEContainer_device, Device_wifi_data_power_systempowerPackage.DEVICE__ECONTAINER_DEVICE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEContainer_device(Settxpower newEContainer_device) {
		if (newEContainer_device != eInternalContainer() || (eContainerFeatureID() != Device_wifi_data_power_systempowerPackage.DEVICE__ECONTAINER_DEVICE && newEContainer_device != null)) {
			if (EcoreUtil.isAncestor(this, newEContainer_device))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEContainer_device != null)
				msgs = ((InternalEObject)newEContainer_device).eInverseAdd(this, Device_wifi_data_power_systempowerPackage.SETTXPOWER__DEVICE, Settxpower.class, msgs);
			msgs = basicSetEContainer_device(newEContainer_device, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_data_power_systempowerPackage.DEVICE__ECONTAINER_DEVICE, newEContainer_device, newEContainer_device));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_data_power_systempowerPackage.DEVICE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDevice_addr() {
		return device_addr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDevice_addr(String newDevice_addr) {
		String oldDevice_addr = device_addr;
		device_addr = newDevice_addr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_data_power_systempowerPackage.DEVICE__DEVICE_ADDR, oldDevice_addr, device_addr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Device_wifi_data_power_systempowerPackage.DEVICE__ECONTAINER_DEVICE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEContainer_device((Settxpower)otherEnd, msgs);
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
			case Device_wifi_data_power_systempowerPackage.DEVICE__ECONTAINER_DEVICE:
				return basicSetEContainer_device(null, msgs);
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
			case Device_wifi_data_power_systempowerPackage.DEVICE__ECONTAINER_DEVICE:
				return eInternalContainer().eInverseRemove(this, Device_wifi_data_power_systempowerPackage.SETTXPOWER__DEVICE, Settxpower.class, msgs);
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
			case Device_wifi_data_power_systempowerPackage.DEVICE__ECONTAINER_DEVICE:
				return getEContainer_device();
			case Device_wifi_data_power_systempowerPackage.DEVICE__NAME:
				return getName();
			case Device_wifi_data_power_systempowerPackage.DEVICE__DEVICE_ADDR:
				return getDevice_addr();
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
			case Device_wifi_data_power_systempowerPackage.DEVICE__ECONTAINER_DEVICE:
				setEContainer_device((Settxpower)newValue);
				return;
			case Device_wifi_data_power_systempowerPackage.DEVICE__NAME:
				setName((String)newValue);
				return;
			case Device_wifi_data_power_systempowerPackage.DEVICE__DEVICE_ADDR:
				setDevice_addr((String)newValue);
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
			case Device_wifi_data_power_systempowerPackage.DEVICE__ECONTAINER_DEVICE:
				setEContainer_device((Settxpower)null);
				return;
			case Device_wifi_data_power_systempowerPackage.DEVICE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Device_wifi_data_power_systempowerPackage.DEVICE__DEVICE_ADDR:
				setDevice_addr(DEVICE_ADDR_EDEFAULT);
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
			case Device_wifi_data_power_systempowerPackage.DEVICE__ECONTAINER_DEVICE:
				return getEContainer_device() != null;
			case Device_wifi_data_power_systempowerPackage.DEVICE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Device_wifi_data_power_systempowerPackage.DEVICE__DEVICE_ADDR:
				return DEVICE_ADDR_EDEFAULT == null ? device_addr != null : !DEVICE_ADDR_EDEFAULT.equals(device_addr);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", device_addr: ");
		result.append(device_addr);
		result.append(')');
		return result.toString();
	}

} //DeviceImpl
