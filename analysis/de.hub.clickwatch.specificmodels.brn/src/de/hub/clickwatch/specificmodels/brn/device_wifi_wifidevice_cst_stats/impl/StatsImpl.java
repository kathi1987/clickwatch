/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl;

import de.hub.clickwatch.model.impl.HandlerImpl;

import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Channelstats;
import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage;
import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Stats;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stats</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.StatsImpl#getChannelstats <em>Channelstats</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StatsImpl extends HandlerImpl implements Stats {
    /**
     * The cached value of the '{@link #getChannelstats() <em>Channelstats</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getChannelstats()
     * @generated
     * @ordered
     */
    protected Channelstats channelstats;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected StatsImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Device_wifi_wifidevice_cst_statsPackage.Literals.STATS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Channelstats getChannelstats() {
        return channelstats;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetChannelstats(Channelstats newChannelstats, NotificationChain msgs) {
        Channelstats oldChannelstats = channelstats;
        channelstats = newChannelstats;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_cst_statsPackage.STATS__CHANNELSTATS, oldChannelstats, newChannelstats);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setChannelstats(Channelstats newChannelstats) {
        if (newChannelstats != channelstats) {
            NotificationChain msgs = null;
            if (channelstats != null)
                msgs = ((InternalEObject)channelstats).eInverseRemove(this, Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__ECONTAINER_CHANNELSTATS, Channelstats.class, msgs);
            if (newChannelstats != null)
                msgs = ((InternalEObject)newChannelstats).eInverseAdd(this, Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__ECONTAINER_CHANNELSTATS, Channelstats.class, msgs);
            msgs = basicSetChannelstats(newChannelstats, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_cst_statsPackage.STATS__CHANNELSTATS, newChannelstats, newChannelstats));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case Device_wifi_wifidevice_cst_statsPackage.STATS__CHANNELSTATS:
                if (channelstats != null)
                    msgs = ((InternalEObject)channelstats).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Device_wifi_wifidevice_cst_statsPackage.STATS__CHANNELSTATS, null, msgs);
                return basicSetChannelstats((Channelstats)otherEnd, msgs);
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
            case Device_wifi_wifidevice_cst_statsPackage.STATS__CHANNELSTATS:
                return basicSetChannelstats(null, msgs);
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
            case Device_wifi_wifidevice_cst_statsPackage.STATS__CHANNELSTATS:
                return getChannelstats();
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
            case Device_wifi_wifidevice_cst_statsPackage.STATS__CHANNELSTATS:
                setChannelstats((Channelstats)newValue);
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
            case Device_wifi_wifidevice_cst_statsPackage.STATS__CHANNELSTATS:
                setChannelstats((Channelstats)null);
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
            case Device_wifi_wifidevice_cst_statsPackage.STATS__CHANNELSTATS:
                return channelstats != null;
        }
        return super.eIsSet(featureID);
    }

} //StatsImpl
