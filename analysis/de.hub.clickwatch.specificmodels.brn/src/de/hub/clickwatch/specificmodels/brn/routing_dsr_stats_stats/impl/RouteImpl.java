/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats.Route;
import de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats.Route_info;
import de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats.Routing_dsr_stats_statsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Route</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats.impl.RouteImpl#getEContainer_route <em>EContainer route</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats.impl.RouteImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats.impl.RouteImpl#getMetric <em>Metric</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats.impl.RouteImpl#getUsage <em>Usage</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats.impl.RouteImpl#getLast_usage <em>Last usage</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats.impl.RouteImpl#getHop_count <em>Hop count</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats.impl.RouteImpl#getHops <em>Hops</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RouteImpl extends EObjectImpl implements Route {
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
     * The default value of the '{@link #getMetric() <em>Metric</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMetric()
     * @generated
     * @ordered
     */
    protected static final int METRIC_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getMetric() <em>Metric</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMetric()
     * @generated
     * @ordered
     */
    protected int metric = METRIC_EDEFAULT;

    /**
     * The default value of the '{@link #getUsage() <em>Usage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUsage()
     * @generated
     * @ordered
     */
    protected static final int USAGE_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getUsage() <em>Usage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUsage()
     * @generated
     * @ordered
     */
    protected int usage = USAGE_EDEFAULT;

    /**
     * The default value of the '{@link #getLast_usage() <em>Last usage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLast_usage()
     * @generated
     * @ordered
     */
    protected static final double LAST_USAGE_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getLast_usage() <em>Last usage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLast_usage()
     * @generated
     * @ordered
     */
    protected double last_usage = LAST_USAGE_EDEFAULT;

    /**
     * The default value of the '{@link #getHop_count() <em>Hop count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHop_count()
     * @generated
     * @ordered
     */
    protected static final int HOP_COUNT_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getHop_count() <em>Hop count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHop_count()
     * @generated
     * @ordered
     */
    protected int hop_count = HOP_COUNT_EDEFAULT;

    /**
     * The default value of the '{@link #getHops() <em>Hops</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHops()
     * @generated
     * @ordered
     */
    protected static final String HOPS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getHops() <em>Hops</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHops()
     * @generated
     * @ordered
     */
    protected String hops = HOPS_EDEFAULT;

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
        return Routing_dsr_stats_statsPackage.Literals.ROUTE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Route_info getEContainer_route() {
        if (eContainerFeatureID() != Routing_dsr_stats_statsPackage.ROUTE__ECONTAINER_ROUTE) return null;
        return (Route_info)eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEContainer_route(Route_info newEContainer_route, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newEContainer_route, Routing_dsr_stats_statsPackage.ROUTE__ECONTAINER_ROUTE, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEContainer_route(Route_info newEContainer_route) {
        if (newEContainer_route != eInternalContainer() || (eContainerFeatureID() != Routing_dsr_stats_statsPackage.ROUTE__ECONTAINER_ROUTE && newEContainer_route != null)) {
            if (EcoreUtil.isAncestor(this, newEContainer_route))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newEContainer_route != null)
                msgs = ((InternalEObject)newEContainer_route).eInverseAdd(this, Routing_dsr_stats_statsPackage.ROUTE_INFO__ROUTE, Route_info.class, msgs);
            msgs = basicSetEContainer_route(newEContainer_route, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Routing_dsr_stats_statsPackage.ROUTE__ECONTAINER_ROUTE, newEContainer_route, newEContainer_route));
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
            eNotify(new ENotificationImpl(this, Notification.SET, Routing_dsr_stats_statsPackage.ROUTE__ID, oldId, id));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getMetric() {
        return metric;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMetric(int newMetric) {
        int oldMetric = metric;
        metric = newMetric;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Routing_dsr_stats_statsPackage.ROUTE__METRIC, oldMetric, metric));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getUsage() {
        return usage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUsage(int newUsage) {
        int oldUsage = usage;
        usage = newUsage;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Routing_dsr_stats_statsPackage.ROUTE__USAGE, oldUsage, usage));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public double getLast_usage() {
        return last_usage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLast_usage(double newLast_usage) {
        double oldLast_usage = last_usage;
        last_usage = newLast_usage;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Routing_dsr_stats_statsPackage.ROUTE__LAST_USAGE, oldLast_usage, last_usage));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getHop_count() {
        return hop_count;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setHop_count(int newHop_count) {
        int oldHop_count = hop_count;
        hop_count = newHop_count;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Routing_dsr_stats_statsPackage.ROUTE__HOP_COUNT, oldHop_count, hop_count));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getHops() {
        return hops;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setHops(String newHops) {
        String oldHops = hops;
        hops = newHops;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Routing_dsr_stats_statsPackage.ROUTE__HOPS, oldHops, hops));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case Routing_dsr_stats_statsPackage.ROUTE__ECONTAINER_ROUTE:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetEContainer_route((Route_info)otherEnd, msgs);
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
            case Routing_dsr_stats_statsPackage.ROUTE__ECONTAINER_ROUTE:
                return basicSetEContainer_route(null, msgs);
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
            case Routing_dsr_stats_statsPackage.ROUTE__ECONTAINER_ROUTE:
                return eInternalContainer().eInverseRemove(this, Routing_dsr_stats_statsPackage.ROUTE_INFO__ROUTE, Route_info.class, msgs);
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
            case Routing_dsr_stats_statsPackage.ROUTE__ECONTAINER_ROUTE:
                return getEContainer_route();
            case Routing_dsr_stats_statsPackage.ROUTE__ID:
                return getId();
            case Routing_dsr_stats_statsPackage.ROUTE__METRIC:
                return getMetric();
            case Routing_dsr_stats_statsPackage.ROUTE__USAGE:
                return getUsage();
            case Routing_dsr_stats_statsPackage.ROUTE__LAST_USAGE:
                return getLast_usage();
            case Routing_dsr_stats_statsPackage.ROUTE__HOP_COUNT:
                return getHop_count();
            case Routing_dsr_stats_statsPackage.ROUTE__HOPS:
                return getHops();
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
            case Routing_dsr_stats_statsPackage.ROUTE__ECONTAINER_ROUTE:
                setEContainer_route((Route_info)newValue);
                return;
            case Routing_dsr_stats_statsPackage.ROUTE__ID:
                setId((Integer)newValue);
                return;
            case Routing_dsr_stats_statsPackage.ROUTE__METRIC:
                setMetric((Integer)newValue);
                return;
            case Routing_dsr_stats_statsPackage.ROUTE__USAGE:
                setUsage((Integer)newValue);
                return;
            case Routing_dsr_stats_statsPackage.ROUTE__LAST_USAGE:
                setLast_usage((Double)newValue);
                return;
            case Routing_dsr_stats_statsPackage.ROUTE__HOP_COUNT:
                setHop_count((Integer)newValue);
                return;
            case Routing_dsr_stats_statsPackage.ROUTE__HOPS:
                setHops((String)newValue);
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
            case Routing_dsr_stats_statsPackage.ROUTE__ECONTAINER_ROUTE:
                setEContainer_route((Route_info)null);
                return;
            case Routing_dsr_stats_statsPackage.ROUTE__ID:
                setId(ID_EDEFAULT);
                return;
            case Routing_dsr_stats_statsPackage.ROUTE__METRIC:
                setMetric(METRIC_EDEFAULT);
                return;
            case Routing_dsr_stats_statsPackage.ROUTE__USAGE:
                setUsage(USAGE_EDEFAULT);
                return;
            case Routing_dsr_stats_statsPackage.ROUTE__LAST_USAGE:
                setLast_usage(LAST_USAGE_EDEFAULT);
                return;
            case Routing_dsr_stats_statsPackage.ROUTE__HOP_COUNT:
                setHop_count(HOP_COUNT_EDEFAULT);
                return;
            case Routing_dsr_stats_statsPackage.ROUTE__HOPS:
                setHops(HOPS_EDEFAULT);
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
            case Routing_dsr_stats_statsPackage.ROUTE__ECONTAINER_ROUTE:
                return getEContainer_route() != null;
            case Routing_dsr_stats_statsPackage.ROUTE__ID:
                return id != ID_EDEFAULT;
            case Routing_dsr_stats_statsPackage.ROUTE__METRIC:
                return metric != METRIC_EDEFAULT;
            case Routing_dsr_stats_statsPackage.ROUTE__USAGE:
                return usage != USAGE_EDEFAULT;
            case Routing_dsr_stats_statsPackage.ROUTE__LAST_USAGE:
                return last_usage != LAST_USAGE_EDEFAULT;
            case Routing_dsr_stats_statsPackage.ROUTE__HOP_COUNT:
                return hop_count != HOP_COUNT_EDEFAULT;
            case Routing_dsr_stats_statsPackage.ROUTE__HOPS:
                return HOPS_EDEFAULT == null ? hops != null : !HOPS_EDEFAULT.equals(hops);
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
        result.append(", metric: ");
        result.append(metric);
        result.append(", usage: ");
        result.append(usage);
        result.append(", last_usage: ");
        result.append(last_usage);
        result.append(", hop_count: ");
        result.append(hop_count);
        result.append(", hops: ");
        result.append(hops);
        result.append(')');
        return result.toString();
    }

} //RouteImpl
