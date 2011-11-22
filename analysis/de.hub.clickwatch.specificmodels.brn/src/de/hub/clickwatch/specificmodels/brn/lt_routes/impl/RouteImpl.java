/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.lt_routes.impl;

import de.hub.clickwatch.specificmodels.brn.lt_routes.Link;
import de.hub.clickwatch.specificmodels.brn.lt_routes.Lt_routesPackage;
import de.hub.clickwatch.specificmodels.brn.lt_routes.Route;
import de.hub.clickwatch.specificmodels.brn.lt_routes.Routetable;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Route</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.lt_routes.impl.RouteImpl#getEContainer_route <em>EContainer route</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.lt_routes.impl.RouteImpl#getText <em>Text</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.lt_routes.impl.RouteImpl#getLink <em>Link</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.lt_routes.impl.RouteImpl#getFrom <em>From</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.lt_routes.impl.RouteImpl#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RouteImpl extends EObjectImpl implements Route {
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
     * The cached value of the '{@link #getLink() <em>Link</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLink()
     * @generated
     * @ordered
     */
    protected EList<Link> link;

    /**
     * The default value of the '{@link #getFrom() <em>From</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFrom()
     * @generated
     * @ordered
     */
    protected static final String FROM_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFrom() <em>From</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFrom()
     * @generated
     * @ordered
     */
    protected String from = FROM_EDEFAULT;

    /**
     * The default value of the '{@link #getTo() <em>To</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTo()
     * @generated
     * @ordered
     */
    protected static final String TO_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTo() <em>To</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTo()
     * @generated
     * @ordered
     */
    protected String to = TO_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RouteImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Lt_routesPackage.Literals.ROUTE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Routetable getEContainer_route() {
        if (eContainerFeatureID() != Lt_routesPackage.ROUTE__ECONTAINER_ROUTE) return null;
        return (Routetable)eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEContainer_route(Routetable newEContainer_route, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newEContainer_route, Lt_routesPackage.ROUTE__ECONTAINER_ROUTE, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEContainer_route(Routetable newEContainer_route) {
        if (newEContainer_route != eInternalContainer() || (eContainerFeatureID() != Lt_routesPackage.ROUTE__ECONTAINER_ROUTE && newEContainer_route != null)) {
            if (EcoreUtil.isAncestor(this, newEContainer_route))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newEContainer_route != null)
                msgs = ((InternalEObject)newEContainer_route).eInverseAdd(this, Lt_routesPackage.ROUTETABLE__ROUTE, Routetable.class, msgs);
            msgs = basicSetEContainer_route(newEContainer_route, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Lt_routesPackage.ROUTE__ECONTAINER_ROUTE, newEContainer_route, newEContainer_route));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<String> getText() {
        if (text == null) {
            text = new EDataTypeEList<String>(String.class, this, Lt_routesPackage.ROUTE__TEXT);
        }
        return text;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Link> getLink() {
        if (link == null) {
            link = new EObjectContainmentWithInverseEList<Link>(Link.class, this, Lt_routesPackage.ROUTE__LINK, Lt_routesPackage.LINK__ECONTAINER_LINK);
        }
        return link;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getFrom() {
        return from;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFrom(String newFrom) {
        String oldFrom = from;
        from = newFrom;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Lt_routesPackage.ROUTE__FROM, oldFrom, from));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getTo() {
        return to;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTo(String newTo) {
        String oldTo = to;
        to = newTo;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Lt_routesPackage.ROUTE__TO, oldTo, to));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case Lt_routesPackage.ROUTE__ECONTAINER_ROUTE:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetEContainer_route((Routetable)otherEnd, msgs);
            case Lt_routesPackage.ROUTE__LINK:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getLink()).basicAdd(otherEnd, msgs);
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
            case Lt_routesPackage.ROUTE__ECONTAINER_ROUTE:
                return basicSetEContainer_route(null, msgs);
            case Lt_routesPackage.ROUTE__LINK:
                return ((InternalEList<?>)getLink()).basicRemove(otherEnd, msgs);
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
            case Lt_routesPackage.ROUTE__ECONTAINER_ROUTE:
                return eInternalContainer().eInverseRemove(this, Lt_routesPackage.ROUTETABLE__ROUTE, Routetable.class, msgs);
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
            case Lt_routesPackage.ROUTE__ECONTAINER_ROUTE:
                return getEContainer_route();
            case Lt_routesPackage.ROUTE__TEXT:
                return getText();
            case Lt_routesPackage.ROUTE__LINK:
                return getLink();
            case Lt_routesPackage.ROUTE__FROM:
                return getFrom();
            case Lt_routesPackage.ROUTE__TO:
                return getTo();
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
            case Lt_routesPackage.ROUTE__ECONTAINER_ROUTE:
                setEContainer_route((Routetable)newValue);
                return;
            case Lt_routesPackage.ROUTE__TEXT:
                getText().clear();
                getText().addAll((Collection<? extends String>)newValue);
                return;
            case Lt_routesPackage.ROUTE__LINK:
                getLink().clear();
                getLink().addAll((Collection<? extends Link>)newValue);
                return;
            case Lt_routesPackage.ROUTE__FROM:
                setFrom((String)newValue);
                return;
            case Lt_routesPackage.ROUTE__TO:
                setTo((String)newValue);
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
            case Lt_routesPackage.ROUTE__ECONTAINER_ROUTE:
                setEContainer_route((Routetable)null);
                return;
            case Lt_routesPackage.ROUTE__TEXT:
                getText().clear();
                return;
            case Lt_routesPackage.ROUTE__LINK:
                getLink().clear();
                return;
            case Lt_routesPackage.ROUTE__FROM:
                setFrom(FROM_EDEFAULT);
                return;
            case Lt_routesPackage.ROUTE__TO:
                setTo(TO_EDEFAULT);
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
            case Lt_routesPackage.ROUTE__ECONTAINER_ROUTE:
                return getEContainer_route() != null;
            case Lt_routesPackage.ROUTE__TEXT:
                return text != null && !text.isEmpty();
            case Lt_routesPackage.ROUTE__LINK:
                return link != null && !link.isEmpty();
            case Lt_routesPackage.ROUTE__FROM:
                return FROM_EDEFAULT == null ? from != null : !FROM_EDEFAULT.equals(from);
            case Lt_routesPackage.ROUTE__TO:
                return TO_EDEFAULT == null ? to != null : !TO_EDEFAULT.equals(to);
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
        result.append(", from: ");
        result.append(from);
        result.append(", to: ");
        result.append(to);
        result.append(')');
        return result.toString();
    }

} //RouteImpl
