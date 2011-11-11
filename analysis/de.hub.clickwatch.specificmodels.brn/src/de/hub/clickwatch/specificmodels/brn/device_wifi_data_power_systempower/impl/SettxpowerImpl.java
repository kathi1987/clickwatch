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
import de.hub.clickwatch.specificmodels.brn.device_wifi_data_power_systempower.Systempower;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Settxpower</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_data_power_systempower.impl.SettxpowerImpl#getEContainer_settxpower <em>EContainer settxpower</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_data_power_systempower.impl.SettxpowerImpl#getText <em>Text</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_data_power_systempower.impl.SettxpowerImpl#getDevice <em>Device</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_data_power_systempower.impl.SettxpowerImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_data_power_systempower.impl.SettxpowerImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_data_power_systempower.impl.SettxpowerImpl#getPower <em>Power</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SettxpowerImpl extends EObjectImpl implements Settxpower {
	/**
     * The cached value of the '{@link #getText() <em>Text</em>}' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getText()
     * @generated
     * @ordered
     */
	protected EList<String> text;

	/**
     * The cached value of the '{@link #getDevice() <em>Device</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getDevice()
     * @generated
     * @ordered
     */
	protected Device device;

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
     * The default value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
	protected static final String ID_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
	protected String id = ID_EDEFAULT;

	/**
     * The default value of the '{@link #getPower() <em>Power</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getPower()
     * @generated
     * @ordered
     */
	protected static final int POWER_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getPower() <em>Power</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getPower()
     * @generated
     * @ordered
     */
	protected int power = POWER_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected SettxpowerImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return Device_wifi_data_power_systempowerPackage.Literals.SETTXPOWER;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Systempower getEContainer_settxpower() {
        if (eContainerFeatureID() != Device_wifi_data_power_systempowerPackage.SETTXPOWER__ECONTAINER_SETTXPOWER) return null;
        return (Systempower)eContainer();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetEContainer_settxpower(Systempower newEContainer_settxpower, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newEContainer_settxpower, Device_wifi_data_power_systempowerPackage.SETTXPOWER__ECONTAINER_SETTXPOWER, msgs);
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setEContainer_settxpower(Systempower newEContainer_settxpower) {
        if (newEContainer_settxpower != eInternalContainer() || (eContainerFeatureID() != Device_wifi_data_power_systempowerPackage.SETTXPOWER__ECONTAINER_SETTXPOWER && newEContainer_settxpower != null)) {
            if (EcoreUtil.isAncestor(this, newEContainer_settxpower))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newEContainer_settxpower != null)
                msgs = ((InternalEObject)newEContainer_settxpower).eInverseAdd(this, Device_wifi_data_power_systempowerPackage.SYSTEMPOWER__SETTXPOWER, Systempower.class, msgs);
            msgs = basicSetEContainer_settxpower(newEContainer_settxpower, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_data_power_systempowerPackage.SETTXPOWER__ECONTAINER_SETTXPOWER, newEContainer_settxpower, newEContainer_settxpower));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<String> getText() {
        if (text == null) {
            text = new EDataTypeEList<String>(String.class, this, Device_wifi_data_power_systempowerPackage.SETTXPOWER__TEXT);
        }
        return text;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Device getDevice() {
        return device;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetDevice(Device newDevice, NotificationChain msgs) {
        Device oldDevice = device;
        device = newDevice;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Device_wifi_data_power_systempowerPackage.SETTXPOWER__DEVICE, oldDevice, newDevice);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setDevice(Device newDevice) {
        if (newDevice != device) {
            NotificationChain msgs = null;
            if (device != null)
                msgs = ((InternalEObject)device).eInverseRemove(this, Device_wifi_data_power_systempowerPackage.DEVICE__ECONTAINER_DEVICE, Device.class, msgs);
            if (newDevice != null)
                msgs = ((InternalEObject)newDevice).eInverseAdd(this, Device_wifi_data_power_systempowerPackage.DEVICE__ECONTAINER_DEVICE, Device.class, msgs);
            msgs = basicSetDevice(newDevice, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_data_power_systempowerPackage.SETTXPOWER__DEVICE, newDevice, newDevice));
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
            eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_data_power_systempowerPackage.SETTXPOWER__NAME, oldName, name));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getId() {
        return id;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setId(String newId) {
        String oldId = id;
        id = newId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_data_power_systempowerPackage.SETTXPOWER__ID, oldId, id));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public int getPower() {
        return power;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setPower(int newPower) {
        int oldPower = power;
        power = newPower;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_data_power_systempowerPackage.SETTXPOWER__POWER, oldPower, power));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case Device_wifi_data_power_systempowerPackage.SETTXPOWER__ECONTAINER_SETTXPOWER:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetEContainer_settxpower((Systempower)otherEnd, msgs);
            case Device_wifi_data_power_systempowerPackage.SETTXPOWER__DEVICE:
                if (device != null)
                    msgs = ((InternalEObject)device).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Device_wifi_data_power_systempowerPackage.SETTXPOWER__DEVICE, null, msgs);
                return basicSetDevice((Device)otherEnd, msgs);
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
            case Device_wifi_data_power_systempowerPackage.SETTXPOWER__ECONTAINER_SETTXPOWER:
                return basicSetEContainer_settxpower(null, msgs);
            case Device_wifi_data_power_systempowerPackage.SETTXPOWER__DEVICE:
                return basicSetDevice(null, msgs);
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
            case Device_wifi_data_power_systempowerPackage.SETTXPOWER__ECONTAINER_SETTXPOWER:
                return eInternalContainer().eInverseRemove(this, Device_wifi_data_power_systempowerPackage.SYSTEMPOWER__SETTXPOWER, Systempower.class, msgs);
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
            case Device_wifi_data_power_systempowerPackage.SETTXPOWER__ECONTAINER_SETTXPOWER:
                return getEContainer_settxpower();
            case Device_wifi_data_power_systempowerPackage.SETTXPOWER__TEXT:
                return getText();
            case Device_wifi_data_power_systempowerPackage.SETTXPOWER__DEVICE:
                return getDevice();
            case Device_wifi_data_power_systempowerPackage.SETTXPOWER__NAME:
                return getName();
            case Device_wifi_data_power_systempowerPackage.SETTXPOWER__ID:
                return getId();
            case Device_wifi_data_power_systempowerPackage.SETTXPOWER__POWER:
                return getPower();
        }
        return super.eGet(featureID, resolve, coreType);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case Device_wifi_data_power_systempowerPackage.SETTXPOWER__ECONTAINER_SETTXPOWER:
                setEContainer_settxpower((Systempower)newValue);
                return;
            case Device_wifi_data_power_systempowerPackage.SETTXPOWER__TEXT:
                getText().clear();
                getText().addAll((Collection<? extends String>)newValue);
                return;
            case Device_wifi_data_power_systempowerPackage.SETTXPOWER__DEVICE:
                setDevice((Device)newValue);
                return;
            case Device_wifi_data_power_systempowerPackage.SETTXPOWER__NAME:
                setName((String)newValue);
                return;
            case Device_wifi_data_power_systempowerPackage.SETTXPOWER__ID:
                setId((String)newValue);
                return;
            case Device_wifi_data_power_systempowerPackage.SETTXPOWER__POWER:
                setPower((Integer)newValue);
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
            case Device_wifi_data_power_systempowerPackage.SETTXPOWER__ECONTAINER_SETTXPOWER:
                setEContainer_settxpower((Systempower)null);
                return;
            case Device_wifi_data_power_systempowerPackage.SETTXPOWER__TEXT:
                getText().clear();
                return;
            case Device_wifi_data_power_systempowerPackage.SETTXPOWER__DEVICE:
                setDevice((Device)null);
                return;
            case Device_wifi_data_power_systempowerPackage.SETTXPOWER__NAME:
                setName(NAME_EDEFAULT);
                return;
            case Device_wifi_data_power_systempowerPackage.SETTXPOWER__ID:
                setId(ID_EDEFAULT);
                return;
            case Device_wifi_data_power_systempowerPackage.SETTXPOWER__POWER:
                setPower(POWER_EDEFAULT);
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
            case Device_wifi_data_power_systempowerPackage.SETTXPOWER__ECONTAINER_SETTXPOWER:
                return getEContainer_settxpower() != null;
            case Device_wifi_data_power_systempowerPackage.SETTXPOWER__TEXT:
                return text != null && !text.isEmpty();
            case Device_wifi_data_power_systempowerPackage.SETTXPOWER__DEVICE:
                return device != null;
            case Device_wifi_data_power_systempowerPackage.SETTXPOWER__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case Device_wifi_data_power_systempowerPackage.SETTXPOWER__ID:
                return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
            case Device_wifi_data_power_systempowerPackage.SETTXPOWER__POWER:
                return power != POWER_EDEFAULT;
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
        result.append(" (text: ");
        result.append(text);
        result.append(", name: ");
        result.append(name);
        result.append(", id: ");
        result.append(id);
        result.append(", power: ");
        result.append(power);
        result.append(')');
        return result.toString();
    }

} //SettxpowerImpl
