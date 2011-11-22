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

import de.hub.clickwatch.model.impl.HandlerImpl;
import de.hub.clickwatch.specificmodels.brn.gps_gps_coord.Gps;
import de.hub.clickwatch.specificmodels.brn.gps_gps_coord.Gps_coord;
import de.hub.clickwatch.specificmodels.brn.gps_gps_coord.Gps_gps_coordPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gps coord</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.gps_gps_coord.impl.Gps_coordImpl#getGps <em>Gps</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Gps_coordImpl extends HandlerImpl implements Gps_coord {
    /**
     * The cached value of the '{@link #getGps() <em>Gps</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGps()
     * @generated
     * @ordered
     */
    protected Gps gps;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected Gps_coordImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Gps_gps_coordPackage.Literals.GPS_COORD;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Gps getGps() {
        return gps;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetGps(Gps newGps, NotificationChain msgs) {
        Gps oldGps = gps;
        gps = newGps;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Gps_gps_coordPackage.GPS_COORD__GPS, oldGps, newGps);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setGps(Gps newGps) {
        if (newGps != gps) {
            NotificationChain msgs = null;
            if (gps != null)
                msgs = ((InternalEObject)gps).eInverseRemove(this, Gps_gps_coordPackage.GPS__ECONTAINER_GPS, Gps.class, msgs);
            if (newGps != null)
                msgs = ((InternalEObject)newGps).eInverseAdd(this, Gps_gps_coordPackage.GPS__ECONTAINER_GPS, Gps.class, msgs);
            msgs = basicSetGps(newGps, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Gps_gps_coordPackage.GPS_COORD__GPS, newGps, newGps));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case Gps_gps_coordPackage.GPS_COORD__GPS:
                if (gps != null)
                    msgs = ((InternalEObject)gps).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Gps_gps_coordPackage.GPS_COORD__GPS, null, msgs);
                return basicSetGps((Gps)otherEnd, msgs);
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
            case Gps_gps_coordPackage.GPS_COORD__GPS:
                return basicSetGps(null, msgs);
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
            case Gps_gps_coordPackage.GPS_COORD__GPS:
                return getGps();
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
            case Gps_gps_coordPackage.GPS_COORD__GPS:
                setGps((Gps)newValue);
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
            case Gps_gps_coordPackage.GPS_COORD__GPS:
                setGps((Gps)null);
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
            case Gps_gps_coordPackage.GPS_COORD__GPS:
                return gps != null;
        }
        return super.eIsSet(featureID);
    }

} //Gps_coordImpl
