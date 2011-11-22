/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.lt_routes.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.hub.clickwatch.model.impl.HandlerImpl;
import de.hub.clickwatch.specificmodels.brn.lt_routes.Lt_routesPackage;
import de.hub.clickwatch.specificmodels.brn.lt_routes.Routes;
import de.hub.clickwatch.specificmodels.brn.lt_routes.Routetable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Routes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.lt_routes.impl.RoutesImpl#getRoutetable <em>Routetable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoutesImpl extends HandlerImpl implements Routes {
    /**
     * The cached value of the '{@link #getRoutetable() <em>Routetable</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRoutetable()
     * @generated
     * @ordered
     */
    protected Routetable routetable;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RoutesImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Lt_routesPackage.Literals.ROUTES;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Routetable getRoutetable() {
        return routetable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRoutetable(Routetable newRoutetable, NotificationChain msgs) {
        Routetable oldRoutetable = routetable;
        routetable = newRoutetable;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Lt_routesPackage.ROUTES__ROUTETABLE, oldRoutetable, newRoutetable);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRoutetable(Routetable newRoutetable) {
        if (newRoutetable != routetable) {
            NotificationChain msgs = null;
            if (routetable != null)
                msgs = ((InternalEObject)routetable).eInverseRemove(this, Lt_routesPackage.ROUTETABLE__ECONTAINER_ROUTETABLE, Routetable.class, msgs);
            if (newRoutetable != null)
                msgs = ((InternalEObject)newRoutetable).eInverseAdd(this, Lt_routesPackage.ROUTETABLE__ECONTAINER_ROUTETABLE, Routetable.class, msgs);
            msgs = basicSetRoutetable(newRoutetable, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Lt_routesPackage.ROUTES__ROUTETABLE, newRoutetable, newRoutetable));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case Lt_routesPackage.ROUTES__ROUTETABLE:
                if (routetable != null)
                    msgs = ((InternalEObject)routetable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Lt_routesPackage.ROUTES__ROUTETABLE, null, msgs);
                return basicSetRoutetable((Routetable)otherEnd, msgs);
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
            case Lt_routesPackage.ROUTES__ROUTETABLE:
                return basicSetRoutetable(null, msgs);
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
            case Lt_routesPackage.ROUTES__ROUTETABLE:
                return getRoutetable();
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
            case Lt_routesPackage.ROUTES__ROUTETABLE:
                setRoutetable((Routetable)newValue);
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
            case Lt_routesPackage.ROUTES__ROUTETABLE:
                setRoutetable((Routetable)null);
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
            case Lt_routesPackage.ROUTES__ROUTETABLE:
                return routetable != null;
        }
        return super.eIsSet(featureID);
    }

} //RoutesImpl
