/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.gps_gps_coord.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import de.hub.clickwatch.specificmodels.brn.gps_gps_coord.Gps;
import de.hub.clickwatch.specificmodels.brn.gps_gps_coord.Gps_coord;
import de.hub.clickwatch.specificmodels.brn.gps_gps_coord.Gps_gps_coordPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gps</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.gps_gps_coord.impl.GpsImpl#getEContainer_gps <em>EContainer gps</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.gps_gps_coord.impl.GpsImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.gps_gps_coord.impl.GpsImpl#getTime <em>Time</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.gps_gps_coord.impl.GpsImpl#getLat <em>Lat</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.gps_gps_coord.impl.GpsImpl#getLong <em>Long</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.gps_gps_coord.impl.GpsImpl#getAlt <em>Alt</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.gps_gps_coord.impl.GpsImpl#getSpeed <em>Speed</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GpsImpl extends EObjectImpl implements Gps {
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
     * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTime()
     * @generated
     * @ordered
     */
    protected static final double TIME_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTime()
     * @generated
     * @ordered
     */
    protected double time = TIME_EDEFAULT;

    /**
     * The default value of the '{@link #getLat() <em>Lat</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLat()
     * @generated
     * @ordered
     */
    protected static final double LAT_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getLat() <em>Lat</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLat()
     * @generated
     * @ordered
     */
    protected double lat = LAT_EDEFAULT;

    /**
     * The default value of the '{@link #getLong() <em>Long</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLong()
     * @generated
     * @ordered
     */
    protected static final double LONG_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getLong() <em>Long</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLong()
     * @generated
     * @ordered
     */
    protected double long_ = LONG_EDEFAULT;

    /**
     * The default value of the '{@link #getAlt() <em>Alt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAlt()
     * @generated
     * @ordered
     */
    protected static final double ALT_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getAlt() <em>Alt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAlt()
     * @generated
     * @ordered
     */
    protected double alt = ALT_EDEFAULT;

    /**
     * The default value of the '{@link #getSpeed() <em>Speed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSpeed()
     * @generated
     * @ordered
     */
    protected static final double SPEED_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getSpeed() <em>Speed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSpeed()
     * @generated
     * @ordered
     */
    protected double speed = SPEED_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected GpsImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Gps_gps_coordPackage.Literals.GPS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Gps_coord getEContainer_gps() {
        if (eContainerFeatureID() != Gps_gps_coordPackage.GPS__ECONTAINER_GPS) return null;
        return (Gps_coord)eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEContainer_gps(Gps_coord newEContainer_gps, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newEContainer_gps, Gps_gps_coordPackage.GPS__ECONTAINER_GPS, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEContainer_gps(Gps_coord newEContainer_gps) {
        if (newEContainer_gps != eInternalContainer() || (eContainerFeatureID() != Gps_gps_coordPackage.GPS__ECONTAINER_GPS && newEContainer_gps != null)) {
            if (EcoreUtil.isAncestor(this, newEContainer_gps))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newEContainer_gps != null)
                msgs = ((InternalEObject)newEContainer_gps).eInverseAdd(this, Gps_gps_coordPackage.GPS_COORD__GPS, Gps_coord.class, msgs);
            msgs = basicSetEContainer_gps(newEContainer_gps, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Gps_gps_coordPackage.GPS__ECONTAINER_GPS, newEContainer_gps, newEContainer_gps));
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
            eNotify(new ENotificationImpl(this, Notification.SET, Gps_gps_coordPackage.GPS__ID, oldId, id));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public double getTime() {
        return time;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTime(double newTime) {
        double oldTime = time;
        time = newTime;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Gps_gps_coordPackage.GPS__TIME, oldTime, time));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public double getLat() {
        return lat;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLat(double newLat) {
        double oldLat = lat;
        lat = newLat;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Gps_gps_coordPackage.GPS__LAT, oldLat, lat));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public double getLong() {
        return long_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLong(double newLong) {
        double oldLong = long_;
        long_ = newLong;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Gps_gps_coordPackage.GPS__LONG, oldLong, long_));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public double getAlt() {
        return alt;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAlt(double newAlt) {
        double oldAlt = alt;
        alt = newAlt;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Gps_gps_coordPackage.GPS__ALT, oldAlt, alt));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public double getSpeed() {
        return speed;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSpeed(double newSpeed) {
        double oldSpeed = speed;
        speed = newSpeed;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Gps_gps_coordPackage.GPS__SPEED, oldSpeed, speed));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case Gps_gps_coordPackage.GPS__ECONTAINER_GPS:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetEContainer_gps((Gps_coord)otherEnd, msgs);
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
            case Gps_gps_coordPackage.GPS__ECONTAINER_GPS:
                return basicSetEContainer_gps(null, msgs);
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
            case Gps_gps_coordPackage.GPS__ECONTAINER_GPS:
                return eInternalContainer().eInverseRemove(this, Gps_gps_coordPackage.GPS_COORD__GPS, Gps_coord.class, msgs);
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
            case Gps_gps_coordPackage.GPS__ECONTAINER_GPS:
                return getEContainer_gps();
            case Gps_gps_coordPackage.GPS__ID:
                return getId();
            case Gps_gps_coordPackage.GPS__TIME:
                return getTime();
            case Gps_gps_coordPackage.GPS__LAT:
                return getLat();
            case Gps_gps_coordPackage.GPS__LONG:
                return getLong();
            case Gps_gps_coordPackage.GPS__ALT:
                return getAlt();
            case Gps_gps_coordPackage.GPS__SPEED:
                return getSpeed();
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
            case Gps_gps_coordPackage.GPS__ECONTAINER_GPS:
                setEContainer_gps((Gps_coord)newValue);
                return;
            case Gps_gps_coordPackage.GPS__ID:
                setId((String)newValue);
                return;
            case Gps_gps_coordPackage.GPS__TIME:
                setTime((Double)newValue);
                return;
            case Gps_gps_coordPackage.GPS__LAT:
                setLat((Double)newValue);
                return;
            case Gps_gps_coordPackage.GPS__LONG:
                setLong((Double)newValue);
                return;
            case Gps_gps_coordPackage.GPS__ALT:
                setAlt((Double)newValue);
                return;
            case Gps_gps_coordPackage.GPS__SPEED:
                setSpeed((Double)newValue);
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
            case Gps_gps_coordPackage.GPS__ECONTAINER_GPS:
                setEContainer_gps((Gps_coord)null);
                return;
            case Gps_gps_coordPackage.GPS__ID:
                setId(ID_EDEFAULT);
                return;
            case Gps_gps_coordPackage.GPS__TIME:
                setTime(TIME_EDEFAULT);
                return;
            case Gps_gps_coordPackage.GPS__LAT:
                setLat(LAT_EDEFAULT);
                return;
            case Gps_gps_coordPackage.GPS__LONG:
                setLong(LONG_EDEFAULT);
                return;
            case Gps_gps_coordPackage.GPS__ALT:
                setAlt(ALT_EDEFAULT);
                return;
            case Gps_gps_coordPackage.GPS__SPEED:
                setSpeed(SPEED_EDEFAULT);
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
            case Gps_gps_coordPackage.GPS__ECONTAINER_GPS:
                return getEContainer_gps() != null;
            case Gps_gps_coordPackage.GPS__ID:
                return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
            case Gps_gps_coordPackage.GPS__TIME:
                return time != TIME_EDEFAULT;
            case Gps_gps_coordPackage.GPS__LAT:
                return lat != LAT_EDEFAULT;
            case Gps_gps_coordPackage.GPS__LONG:
                return long_ != LONG_EDEFAULT;
            case Gps_gps_coordPackage.GPS__ALT:
                return alt != ALT_EDEFAULT;
            case Gps_gps_coordPackage.GPS__SPEED:
                return speed != SPEED_EDEFAULT;
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
        result.append(" (id: ");
        result.append(id);
        result.append(", time: ");
        result.append(time);
        result.append(", lat: ");
        result.append(lat);
        result.append(", long: ");
        result.append(long_);
        result.append(", alt: ");
        result.append(alt);
        result.append(", speed: ");
        result.append(speed);
        result.append(')');
        return result.toString();
    }

} //GpsImpl
