/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_sc_systemchannel.impl;

import de.hub.clickwatch.model.impl.HandlerImpl;

import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_sc_systemchannel.Device_wifi_wifidevice_sc_systemchannelPackage;
import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_sc_systemchannel.Setchannel;
import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_sc_systemchannel.Systemchannel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Systemchannel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_sc_systemchannel.impl.SystemchannelImpl#getSetchannel <em>Setchannel</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SystemchannelImpl extends HandlerImpl implements Systemchannel {
	/**
     * The cached value of the '{@link #getSetchannel() <em>Setchannel</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getSetchannel()
     * @generated
     * @ordered
     */
	protected Setchannel setchannel;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected SystemchannelImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return Device_wifi_wifidevice_sc_systemchannelPackage.Literals.SYSTEMCHANNEL;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Setchannel getSetchannel() {
        return setchannel;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetSetchannel(Setchannel newSetchannel, NotificationChain msgs) {
        Setchannel oldSetchannel = setchannel;
        setchannel = newSetchannel;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_sc_systemchannelPackage.SYSTEMCHANNEL__SETCHANNEL, oldSetchannel, newSetchannel);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setSetchannel(Setchannel newSetchannel) {
        if (newSetchannel != setchannel) {
            NotificationChain msgs = null;
            if (setchannel != null)
                msgs = ((InternalEObject)setchannel).eInverseRemove(this, Device_wifi_wifidevice_sc_systemchannelPackage.SETCHANNEL__ECONTAINER_SETCHANNEL, Setchannel.class, msgs);
            if (newSetchannel != null)
                msgs = ((InternalEObject)newSetchannel).eInverseAdd(this, Device_wifi_wifidevice_sc_systemchannelPackage.SETCHANNEL__ECONTAINER_SETCHANNEL, Setchannel.class, msgs);
            msgs = basicSetSetchannel(newSetchannel, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_sc_systemchannelPackage.SYSTEMCHANNEL__SETCHANNEL, newSetchannel, newSetchannel));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case Device_wifi_wifidevice_sc_systemchannelPackage.SYSTEMCHANNEL__SETCHANNEL:
                if (setchannel != null)
                    msgs = ((InternalEObject)setchannel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Device_wifi_wifidevice_sc_systemchannelPackage.SYSTEMCHANNEL__SETCHANNEL, null, msgs);
                return basicSetSetchannel((Setchannel)otherEnd, msgs);
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
            case Device_wifi_wifidevice_sc_systemchannelPackage.SYSTEMCHANNEL__SETCHANNEL:
                return basicSetSetchannel(null, msgs);
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
            case Device_wifi_wifidevice_sc_systemchannelPackage.SYSTEMCHANNEL__SETCHANNEL:
                return getSetchannel();
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
            case Device_wifi_wifidevice_sc_systemchannelPackage.SYSTEMCHANNEL__SETCHANNEL:
                setSetchannel((Setchannel)newValue);
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
            case Device_wifi_wifidevice_sc_systemchannelPackage.SYSTEMCHANNEL__SETCHANNEL:
                setSetchannel((Setchannel)null);
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
            case Device_wifi_wifidevice_sc_systemchannelPackage.SYSTEMCHANNEL__SETCHANNEL:
                return setchannel != null;
        }
        return super.eIsSet(featureID);
    }

} //SystemchannelImpl
