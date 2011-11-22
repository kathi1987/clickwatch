/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.device_wifi_data_power_systempower.impl;

import de.hub.clickwatch.model.impl.HandlerImpl;

import de.hub.clickwatch.specificmodels.brn.device_wifi_data_power_systempower.Device_wifi_data_power_systempowerPackage;
import de.hub.clickwatch.specificmodels.brn.device_wifi_data_power_systempower.Settxpower;
import de.hub.clickwatch.specificmodels.brn.device_wifi_data_power_systempower.Systempower;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Systempower</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_data_power_systempower.impl.SystempowerImpl#getSettxpower <em>Settxpower</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SystempowerImpl extends HandlerImpl implements Systempower {
    /**
     * The cached value of the '{@link #getSettxpower() <em>Settxpower</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSettxpower()
     * @generated
     * @ordered
     */
    protected Settxpower settxpower;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SystempowerImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Device_wifi_data_power_systempowerPackage.Literals.SYSTEMPOWER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Settxpower getSettxpower() {
        return settxpower;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSettxpower(Settxpower newSettxpower, NotificationChain msgs) {
        Settxpower oldSettxpower = settxpower;
        settxpower = newSettxpower;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Device_wifi_data_power_systempowerPackage.SYSTEMPOWER__SETTXPOWER, oldSettxpower, newSettxpower);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSettxpower(Settxpower newSettxpower) {
        if (newSettxpower != settxpower) {
            NotificationChain msgs = null;
            if (settxpower != null)
                msgs = ((InternalEObject)settxpower).eInverseRemove(this, Device_wifi_data_power_systempowerPackage.SETTXPOWER__ECONTAINER_SETTXPOWER, Settxpower.class, msgs);
            if (newSettxpower != null)
                msgs = ((InternalEObject)newSettxpower).eInverseAdd(this, Device_wifi_data_power_systempowerPackage.SETTXPOWER__ECONTAINER_SETTXPOWER, Settxpower.class, msgs);
            msgs = basicSetSettxpower(newSettxpower, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_data_power_systempowerPackage.SYSTEMPOWER__SETTXPOWER, newSettxpower, newSettxpower));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case Device_wifi_data_power_systempowerPackage.SYSTEMPOWER__SETTXPOWER:
                if (settxpower != null)
                    msgs = ((InternalEObject)settxpower).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Device_wifi_data_power_systempowerPackage.SYSTEMPOWER__SETTXPOWER, null, msgs);
                return basicSetSettxpower((Settxpower)otherEnd, msgs);
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
            case Device_wifi_data_power_systempowerPackage.SYSTEMPOWER__SETTXPOWER:
                return basicSetSettxpower(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case Device_wifi_data_power_systempowerPackage.SYSTEMPOWER__SETTXPOWER:
                return getSettxpower();
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
            case Device_wifi_data_power_systempowerPackage.SYSTEMPOWER__SETTXPOWER:
                setSettxpower((Settxpower)newValue);
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
            case Device_wifi_data_power_systempowerPackage.SYSTEMPOWER__SETTXPOWER:
                setSettxpower((Settxpower)null);
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
            case Device_wifi_data_power_systempowerPackage.SYSTEMPOWER__SETTXPOWER:
                return settxpower != null;
        }
        return super.eIsSet(featureID);
    }

} //SystempowerImpl
