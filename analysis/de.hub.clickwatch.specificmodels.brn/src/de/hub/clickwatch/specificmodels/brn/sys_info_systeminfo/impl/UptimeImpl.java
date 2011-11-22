/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.impl;

import de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Sys_info_systeminfoPackage;
import de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Uptime;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Uptime</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.impl.UptimeImpl#getEContainer_uptime <em>EContainer uptime</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.impl.UptimeImpl#getTotal <em>Total</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.impl.UptimeImpl#getIdle <em>Idle</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UptimeImpl extends EObjectImpl implements Uptime {
    /**
     * The default value of the '{@link #getTotal() <em>Total</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTotal()
     * @generated
     * @ordered
     */
    protected static final double TOTAL_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getTotal() <em>Total</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTotal()
     * @generated
     * @ordered
     */
    protected double total = TOTAL_EDEFAULT;

    /**
     * The default value of the '{@link #getIdle() <em>Idle</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIdle()
     * @generated
     * @ordered
     */
    protected static final double IDLE_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getIdle() <em>Idle</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIdle()
     * @generated
     * @ordered
     */
    protected double idle = IDLE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected UptimeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Sys_info_systeminfoPackage.Literals.UPTIME;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.System getEContainer_uptime() {
        if (eContainerFeatureID() != Sys_info_systeminfoPackage.UPTIME__ECONTAINER_UPTIME) return null;
        return (de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.System)eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEContainer_uptime(de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.System newEContainer_uptime, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newEContainer_uptime, Sys_info_systeminfoPackage.UPTIME__ECONTAINER_UPTIME, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEContainer_uptime(de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.System newEContainer_uptime) {
        if (newEContainer_uptime != eInternalContainer() || (eContainerFeatureID() != Sys_info_systeminfoPackage.UPTIME__ECONTAINER_UPTIME && newEContainer_uptime != null)) {
            if (EcoreUtil.isAncestor(this, newEContainer_uptime))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newEContainer_uptime != null)
                msgs = ((InternalEObject)newEContainer_uptime).eInverseAdd(this, Sys_info_systeminfoPackage.SYSTEM__UPTIME, de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.System.class, msgs);
            msgs = basicSetEContainer_uptime(newEContainer_uptime, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Sys_info_systeminfoPackage.UPTIME__ECONTAINER_UPTIME, newEContainer_uptime, newEContainer_uptime));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public double getTotal() {
        return total;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTotal(double newTotal) {
        double oldTotal = total;
        total = newTotal;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Sys_info_systeminfoPackage.UPTIME__TOTAL, oldTotal, total));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public double getIdle() {
        return idle;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIdle(double newIdle) {
        double oldIdle = idle;
        idle = newIdle;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Sys_info_systeminfoPackage.UPTIME__IDLE, oldIdle, idle));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case Sys_info_systeminfoPackage.UPTIME__ECONTAINER_UPTIME:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetEContainer_uptime((de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.System)otherEnd, msgs);
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
            case Sys_info_systeminfoPackage.UPTIME__ECONTAINER_UPTIME:
                return basicSetEContainer_uptime(null, msgs);
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
            case Sys_info_systeminfoPackage.UPTIME__ECONTAINER_UPTIME:
                return eInternalContainer().eInverseRemove(this, Sys_info_systeminfoPackage.SYSTEM__UPTIME, de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.System.class, msgs);
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
            case Sys_info_systeminfoPackage.UPTIME__ECONTAINER_UPTIME:
                return getEContainer_uptime();
            case Sys_info_systeminfoPackage.UPTIME__TOTAL:
                return getTotal();
            case Sys_info_systeminfoPackage.UPTIME__IDLE:
                return getIdle();
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
            case Sys_info_systeminfoPackage.UPTIME__ECONTAINER_UPTIME:
                setEContainer_uptime((de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.System)newValue);
                return;
            case Sys_info_systeminfoPackage.UPTIME__TOTAL:
                setTotal((Double)newValue);
                return;
            case Sys_info_systeminfoPackage.UPTIME__IDLE:
                setIdle((Double)newValue);
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
            case Sys_info_systeminfoPackage.UPTIME__ECONTAINER_UPTIME:
                setEContainer_uptime((de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.System)null);
                return;
            case Sys_info_systeminfoPackage.UPTIME__TOTAL:
                setTotal(TOTAL_EDEFAULT);
                return;
            case Sys_info_systeminfoPackage.UPTIME__IDLE:
                setIdle(IDLE_EDEFAULT);
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
            case Sys_info_systeminfoPackage.UPTIME__ECONTAINER_UPTIME:
                return getEContainer_uptime() != null;
            case Sys_info_systeminfoPackage.UPTIME__TOTAL:
                return total != TOTAL_EDEFAULT;
            case Sys_info_systeminfoPackage.UPTIME__IDLE:
                return idle != IDLE_EDEFAULT;
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
        result.append(" (total: ");
        result.append(total);
        result.append(", idle: ");
        result.append(idle);
        result.append(')');
        return result.toString();
    }

} //UptimeImpl
