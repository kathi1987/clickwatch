/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage;
import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Ext;
import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Rssi_extended;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ext</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.ExtImpl#getEContainer_ext <em>EContainer ext</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.ExtImpl#getRssi0 <em>Rssi0</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.ExtImpl#getRssi1 <em>Rssi1</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.ExtImpl#getRssi2 <em>Rssi2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExtImpl extends EObjectImpl implements Ext {
    /**
     * The default value of the '{@link #getRssi0() <em>Rssi0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRssi0()
     * @generated
     * @ordered
     */
    protected static final int RSSI0_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getRssi0() <em>Rssi0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRssi0()
     * @generated
     * @ordered
     */
    protected int rssi0 = RSSI0_EDEFAULT;

    /**
     * The default value of the '{@link #getRssi1() <em>Rssi1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRssi1()
     * @generated
     * @ordered
     */
    protected static final int RSSI1_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getRssi1() <em>Rssi1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRssi1()
     * @generated
     * @ordered
     */
    protected int rssi1 = RSSI1_EDEFAULT;

    /**
     * The default value of the '{@link #getRssi2() <em>Rssi2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRssi2()
     * @generated
     * @ordered
     */
    protected static final int RSSI2_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getRssi2() <em>Rssi2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRssi2()
     * @generated
     * @ordered
     */
    protected int rssi2 = RSSI2_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ExtImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Device_wifi_wifidevice_cst_statsPackage.Literals.EXT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Rssi_extended getEContainer_ext() {
        if (eContainerFeatureID() != Device_wifi_wifidevice_cst_statsPackage.EXT__ECONTAINER_EXT) return null;
        return (Rssi_extended)eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEContainer_ext(Rssi_extended newEContainer_ext, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newEContainer_ext, Device_wifi_wifidevice_cst_statsPackage.EXT__ECONTAINER_EXT, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEContainer_ext(Rssi_extended newEContainer_ext) {
        if (newEContainer_ext != eInternalContainer() || (eContainerFeatureID() != Device_wifi_wifidevice_cst_statsPackage.EXT__ECONTAINER_EXT && newEContainer_ext != null)) {
            if (EcoreUtil.isAncestor(this, newEContainer_ext))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newEContainer_ext != null)
                msgs = ((InternalEObject)newEContainer_ext).eInverseAdd(this, Device_wifi_wifidevice_cst_statsPackage.RSSI_EXTENDED__EXT, Rssi_extended.class, msgs);
            msgs = basicSetEContainer_ext(newEContainer_ext, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_cst_statsPackage.EXT__ECONTAINER_EXT, newEContainer_ext, newEContainer_ext));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getRssi0() {
        return rssi0;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRssi0(int newRssi0) {
        int oldRssi0 = rssi0;
        rssi0 = newRssi0;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_cst_statsPackage.EXT__RSSI0, oldRssi0, rssi0));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getRssi1() {
        return rssi1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRssi1(int newRssi1) {
        int oldRssi1 = rssi1;
        rssi1 = newRssi1;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_cst_statsPackage.EXT__RSSI1, oldRssi1, rssi1));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getRssi2() {
        return rssi2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRssi2(int newRssi2) {
        int oldRssi2 = rssi2;
        rssi2 = newRssi2;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_cst_statsPackage.EXT__RSSI2, oldRssi2, rssi2));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case Device_wifi_wifidevice_cst_statsPackage.EXT__ECONTAINER_EXT:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetEContainer_ext((Rssi_extended)otherEnd, msgs);
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
            case Device_wifi_wifidevice_cst_statsPackage.EXT__ECONTAINER_EXT:
                return basicSetEContainer_ext(null, msgs);
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
            case Device_wifi_wifidevice_cst_statsPackage.EXT__ECONTAINER_EXT:
                return eInternalContainer().eInverseRemove(this, Device_wifi_wifidevice_cst_statsPackage.RSSI_EXTENDED__EXT, Rssi_extended.class, msgs);
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
            case Device_wifi_wifidevice_cst_statsPackage.EXT__ECONTAINER_EXT:
                return getEContainer_ext();
            case Device_wifi_wifidevice_cst_statsPackage.EXT__RSSI0:
                return getRssi0();
            case Device_wifi_wifidevice_cst_statsPackage.EXT__RSSI1:
                return getRssi1();
            case Device_wifi_wifidevice_cst_statsPackage.EXT__RSSI2:
                return getRssi2();
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
            case Device_wifi_wifidevice_cst_statsPackage.EXT__ECONTAINER_EXT:
                setEContainer_ext((Rssi_extended)newValue);
                return;
            case Device_wifi_wifidevice_cst_statsPackage.EXT__RSSI0:
                setRssi0((Integer)newValue);
                return;
            case Device_wifi_wifidevice_cst_statsPackage.EXT__RSSI1:
                setRssi1((Integer)newValue);
                return;
            case Device_wifi_wifidevice_cst_statsPackage.EXT__RSSI2:
                setRssi2((Integer)newValue);
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
            case Device_wifi_wifidevice_cst_statsPackage.EXT__ECONTAINER_EXT:
                setEContainer_ext((Rssi_extended)null);
                return;
            case Device_wifi_wifidevice_cst_statsPackage.EXT__RSSI0:
                setRssi0(RSSI0_EDEFAULT);
                return;
            case Device_wifi_wifidevice_cst_statsPackage.EXT__RSSI1:
                setRssi1(RSSI1_EDEFAULT);
                return;
            case Device_wifi_wifidevice_cst_statsPackage.EXT__RSSI2:
                setRssi2(RSSI2_EDEFAULT);
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
            case Device_wifi_wifidevice_cst_statsPackage.EXT__ECONTAINER_EXT:
                return getEContainer_ext() != null;
            case Device_wifi_wifidevice_cst_statsPackage.EXT__RSSI0:
                return rssi0 != RSSI0_EDEFAULT;
            case Device_wifi_wifidevice_cst_statsPackage.EXT__RSSI1:
                return rssi1 != RSSI1_EDEFAULT;
            case Device_wifi_wifidevice_cst_statsPackage.EXT__RSSI2:
                return rssi2 != RSSI2_EDEFAULT;
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
        result.append(" (rssi0: ");
        result.append(rssi0);
        result.append(", rssi1: ");
        result.append(rssi1);
        result.append(", rssi2: ");
        result.append(rssi2);
        result.append(')');
        return result.toString();
    }

} //ExtImpl
