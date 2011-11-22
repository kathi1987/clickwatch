/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats.impl;

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

import de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats.Dsr_route_stats;
import de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats.Route_info;
import de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats.Routing_dsr_stats_statsPackage;
import de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats.Stats;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dsr route stats</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats.impl.Dsr_route_statsImpl#getEContainer_dsr_route_stats <em>EContainer dsr route stats</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats.impl.Dsr_route_statsImpl#getText <em>Text</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats.impl.Dsr_route_statsImpl#getRoute_info <em>Route info</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats.impl.Dsr_route_statsImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats.impl.Dsr_route_statsImpl#getNode_pairs <em>Node pairs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Dsr_route_statsImpl extends EObjectImpl implements Dsr_route_stats {
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
     * The cached value of the '{@link #getRoute_info() <em>Route info</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRoute_info()
     * @generated
     * @ordered
     */
    protected EList<Route_info> route_info;

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
     * The default value of the '{@link #getNode_pairs() <em>Node pairs</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNode_pairs()
     * @generated
     * @ordered
     */
    protected static final int NODE_PAIRS_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getNode_pairs() <em>Node pairs</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNode_pairs()
     * @generated
     * @ordered
     */
    protected int node_pairs = NODE_PAIRS_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected Dsr_route_statsImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Routing_dsr_stats_statsPackage.Literals.DSR_ROUTE_STATS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Stats getEContainer_dsr_route_stats() {
        if (eContainerFeatureID() != Routing_dsr_stats_statsPackage.DSR_ROUTE_STATS__ECONTAINER_DSR_ROUTE_STATS) return null;
        return (Stats)eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEContainer_dsr_route_stats(Stats newEContainer_dsr_route_stats, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newEContainer_dsr_route_stats, Routing_dsr_stats_statsPackage.DSR_ROUTE_STATS__ECONTAINER_DSR_ROUTE_STATS, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEContainer_dsr_route_stats(Stats newEContainer_dsr_route_stats) {
        if (newEContainer_dsr_route_stats != eInternalContainer() || (eContainerFeatureID() != Routing_dsr_stats_statsPackage.DSR_ROUTE_STATS__ECONTAINER_DSR_ROUTE_STATS && newEContainer_dsr_route_stats != null)) {
            if (EcoreUtil.isAncestor(this, newEContainer_dsr_route_stats))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newEContainer_dsr_route_stats != null)
                msgs = ((InternalEObject)newEContainer_dsr_route_stats).eInverseAdd(this, Routing_dsr_stats_statsPackage.STATS__DSR_ROUTE_STATS, Stats.class, msgs);
            msgs = basicSetEContainer_dsr_route_stats(newEContainer_dsr_route_stats, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Routing_dsr_stats_statsPackage.DSR_ROUTE_STATS__ECONTAINER_DSR_ROUTE_STATS, newEContainer_dsr_route_stats, newEContainer_dsr_route_stats));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<String> getText() {
        if (text == null) {
            text = new EDataTypeEList<String>(String.class, this, Routing_dsr_stats_statsPackage.DSR_ROUTE_STATS__TEXT);
        }
        return text;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Route_info> getRoute_info() {
        if (route_info == null) {
            route_info = new EObjectContainmentWithInverseEList<Route_info>(Route_info.class, this, Routing_dsr_stats_statsPackage.DSR_ROUTE_STATS__ROUTE_INFO, Routing_dsr_stats_statsPackage.ROUTE_INFO__ECONTAINER_ROUTE_INFO);
        }
        return route_info;
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
            eNotify(new ENotificationImpl(this, Notification.SET, Routing_dsr_stats_statsPackage.DSR_ROUTE_STATS__ID, oldId, id));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getNode_pairs() {
        return node_pairs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNode_pairs(int newNode_pairs) {
        int oldNode_pairs = node_pairs;
        node_pairs = newNode_pairs;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Routing_dsr_stats_statsPackage.DSR_ROUTE_STATS__NODE_PAIRS, oldNode_pairs, node_pairs));
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
            case Routing_dsr_stats_statsPackage.DSR_ROUTE_STATS__ECONTAINER_DSR_ROUTE_STATS:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetEContainer_dsr_route_stats((Stats)otherEnd, msgs);
            case Routing_dsr_stats_statsPackage.DSR_ROUTE_STATS__ROUTE_INFO:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getRoute_info()).basicAdd(otherEnd, msgs);
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
            case Routing_dsr_stats_statsPackage.DSR_ROUTE_STATS__ECONTAINER_DSR_ROUTE_STATS:
                return basicSetEContainer_dsr_route_stats(null, msgs);
            case Routing_dsr_stats_statsPackage.DSR_ROUTE_STATS__ROUTE_INFO:
                return ((InternalEList<?>)getRoute_info()).basicRemove(otherEnd, msgs);
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
            case Routing_dsr_stats_statsPackage.DSR_ROUTE_STATS__ECONTAINER_DSR_ROUTE_STATS:
                return eInternalContainer().eInverseRemove(this, Routing_dsr_stats_statsPackage.STATS__DSR_ROUTE_STATS, Stats.class, msgs);
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
            case Routing_dsr_stats_statsPackage.DSR_ROUTE_STATS__ECONTAINER_DSR_ROUTE_STATS:
                return getEContainer_dsr_route_stats();
            case Routing_dsr_stats_statsPackage.DSR_ROUTE_STATS__TEXT:
                return getText();
            case Routing_dsr_stats_statsPackage.DSR_ROUTE_STATS__ROUTE_INFO:
                return getRoute_info();
            case Routing_dsr_stats_statsPackage.DSR_ROUTE_STATS__ID:
                return getId();
            case Routing_dsr_stats_statsPackage.DSR_ROUTE_STATS__NODE_PAIRS:
                return getNode_pairs();
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
            case Routing_dsr_stats_statsPackage.DSR_ROUTE_STATS__ECONTAINER_DSR_ROUTE_STATS:
                setEContainer_dsr_route_stats((Stats)newValue);
                return;
            case Routing_dsr_stats_statsPackage.DSR_ROUTE_STATS__TEXT:
                getText().clear();
                getText().addAll((Collection<? extends String>)newValue);
                return;
            case Routing_dsr_stats_statsPackage.DSR_ROUTE_STATS__ROUTE_INFO:
                getRoute_info().clear();
                getRoute_info().addAll((Collection<? extends Route_info>)newValue);
                return;
            case Routing_dsr_stats_statsPackage.DSR_ROUTE_STATS__ID:
                setId((String)newValue);
                return;
            case Routing_dsr_stats_statsPackage.DSR_ROUTE_STATS__NODE_PAIRS:
                setNode_pairs((Integer)newValue);
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
            case Routing_dsr_stats_statsPackage.DSR_ROUTE_STATS__ECONTAINER_DSR_ROUTE_STATS:
                setEContainer_dsr_route_stats((Stats)null);
                return;
            case Routing_dsr_stats_statsPackage.DSR_ROUTE_STATS__TEXT:
                getText().clear();
                return;
            case Routing_dsr_stats_statsPackage.DSR_ROUTE_STATS__ROUTE_INFO:
                getRoute_info().clear();
                return;
            case Routing_dsr_stats_statsPackage.DSR_ROUTE_STATS__ID:
                setId(ID_EDEFAULT);
                return;
            case Routing_dsr_stats_statsPackage.DSR_ROUTE_STATS__NODE_PAIRS:
                setNode_pairs(NODE_PAIRS_EDEFAULT);
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
            case Routing_dsr_stats_statsPackage.DSR_ROUTE_STATS__ECONTAINER_DSR_ROUTE_STATS:
                return getEContainer_dsr_route_stats() != null;
            case Routing_dsr_stats_statsPackage.DSR_ROUTE_STATS__TEXT:
                return text != null && !text.isEmpty();
            case Routing_dsr_stats_statsPackage.DSR_ROUTE_STATS__ROUTE_INFO:
                return route_info != null && !route_info.isEmpty();
            case Routing_dsr_stats_statsPackage.DSR_ROUTE_STATS__ID:
                return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
            case Routing_dsr_stats_statsPackage.DSR_ROUTE_STATS__NODE_PAIRS:
                return node_pairs != NODE_PAIRS_EDEFAULT;
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
        result.append(", id: ");
        result.append(id);
        result.append(", node_pairs: ");
        result.append(node_pairs);
        result.append(')');
        return result.toString();
    }

} //Dsr_route_statsImpl
