/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.tsi_syncinfo.impl;

import de.hub.clickwatch.specificmodels.brn.tsi_syncinfo.Syncpacket;
import de.hub.clickwatch.specificmodels.brn.tsi_syncinfo.Timesyncinfo;
import de.hub.clickwatch.specificmodels.brn.tsi_syncinfo.Tsi_syncinfoPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Syncpacket</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.tsi_syncinfo.impl.SyncpacketImpl#getEContainer_syncpacket <em>EContainer syncpacket</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.tsi_syncinfo.impl.SyncpacketImpl#getTime <em>Time</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.tsi_syncinfo.impl.SyncpacketImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.tsi_syncinfo.impl.SyncpacketImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SyncpacketImpl extends EObjectImpl implements Syncpacket {
    /**
     * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTime()
     * @generated
     * @ordered
     */
    protected static final long TIME_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTime()
     * @generated
     * @ordered
     */
    protected long time = TIME_EDEFAULT;

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
     * The default value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
    protected static final int ID_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
    protected int id = ID_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SyncpacketImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Tsi_syncinfoPackage.Literals.SYNCPACKET;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Timesyncinfo getEContainer_syncpacket() {
        if (eContainerFeatureID() != Tsi_syncinfoPackage.SYNCPACKET__ECONTAINER_SYNCPACKET) return null;
        return (Timesyncinfo)eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEContainer_syncpacket(Timesyncinfo newEContainer_syncpacket, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newEContainer_syncpacket, Tsi_syncinfoPackage.SYNCPACKET__ECONTAINER_SYNCPACKET, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEContainer_syncpacket(Timesyncinfo newEContainer_syncpacket) {
        if (newEContainer_syncpacket != eInternalContainer() || (eContainerFeatureID() != Tsi_syncinfoPackage.SYNCPACKET__ECONTAINER_SYNCPACKET && newEContainer_syncpacket != null)) {
            if (EcoreUtil.isAncestor(this, newEContainer_syncpacket))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newEContainer_syncpacket != null)
                msgs = ((InternalEObject)newEContainer_syncpacket).eInverseAdd(this, Tsi_syncinfoPackage.TIMESYNCINFO__SYNCPACKET, Timesyncinfo.class, msgs);
            msgs = basicSetEContainer_syncpacket(newEContainer_syncpacket, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Tsi_syncinfoPackage.SYNCPACKET__ECONTAINER_SYNCPACKET, newEContainer_syncpacket, newEContainer_syncpacket));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public long getTime() {
        return time;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTime(long newTime) {
        long oldTime = time;
        time = newTime;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Tsi_syncinfoPackage.SYNCPACKET__TIME, oldTime, time));
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
            eNotify(new ENotificationImpl(this, Notification.SET, Tsi_syncinfoPackage.SYNCPACKET__UNIT, oldUnit, unit));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getId() {
        return id;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setId(int newId) {
        int oldId = id;
        id = newId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Tsi_syncinfoPackage.SYNCPACKET__ID, oldId, id));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case Tsi_syncinfoPackage.SYNCPACKET__ECONTAINER_SYNCPACKET:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetEContainer_syncpacket((Timesyncinfo)otherEnd, msgs);
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
            case Tsi_syncinfoPackage.SYNCPACKET__ECONTAINER_SYNCPACKET:
                return basicSetEContainer_syncpacket(null, msgs);
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
            case Tsi_syncinfoPackage.SYNCPACKET__ECONTAINER_SYNCPACKET:
                return eInternalContainer().eInverseRemove(this, Tsi_syncinfoPackage.TIMESYNCINFO__SYNCPACKET, Timesyncinfo.class, msgs);
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
            case Tsi_syncinfoPackage.SYNCPACKET__ECONTAINER_SYNCPACKET:
                return getEContainer_syncpacket();
            case Tsi_syncinfoPackage.SYNCPACKET__TIME:
                return getTime();
            case Tsi_syncinfoPackage.SYNCPACKET__UNIT:
                return getUnit();
            case Tsi_syncinfoPackage.SYNCPACKET__ID:
                return getId();
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
            case Tsi_syncinfoPackage.SYNCPACKET__ECONTAINER_SYNCPACKET:
                setEContainer_syncpacket((Timesyncinfo)newValue);
                return;
            case Tsi_syncinfoPackage.SYNCPACKET__TIME:
                setTime((Long)newValue);
                return;
            case Tsi_syncinfoPackage.SYNCPACKET__UNIT:
                setUnit((String)newValue);
                return;
            case Tsi_syncinfoPackage.SYNCPACKET__ID:
                setId((Integer)newValue);
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
            case Tsi_syncinfoPackage.SYNCPACKET__ECONTAINER_SYNCPACKET:
                setEContainer_syncpacket((Timesyncinfo)null);
                return;
            case Tsi_syncinfoPackage.SYNCPACKET__TIME:
                setTime(TIME_EDEFAULT);
                return;
            case Tsi_syncinfoPackage.SYNCPACKET__UNIT:
                setUnit(UNIT_EDEFAULT);
                return;
            case Tsi_syncinfoPackage.SYNCPACKET__ID:
                setId(ID_EDEFAULT);
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
            case Tsi_syncinfoPackage.SYNCPACKET__ECONTAINER_SYNCPACKET:
                return getEContainer_syncpacket() != null;
            case Tsi_syncinfoPackage.SYNCPACKET__TIME:
                return time != TIME_EDEFAULT;
            case Tsi_syncinfoPackage.SYNCPACKET__UNIT:
                return UNIT_EDEFAULT == null ? unit != null : !UNIT_EDEFAULT.equals(unit);
            case Tsi_syncinfoPackage.SYNCPACKET__ID:
                return id != ID_EDEFAULT;
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
        result.append(" (time: ");
        result.append(time);
        result.append(", unit: ");
        result.append(unit);
        result.append(", id: ");
        result.append(id);
        result.append(')');
        return result.toString();
    }

} //SyncpacketImpl
