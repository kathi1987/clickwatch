/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.model.impl;


import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.hub.clickwatch.model.ClickWatchModelPackage;
import de.hub.clickwatch.model.Network;
import de.hub.clickwatch.model.Node;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Network</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.clickwatch.model.impl.NetworkImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.hub.clickwatch.model.impl.NetworkImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link de.hub.clickwatch.model.impl.NetworkImpl#getElementFilter <em>Element Filter</em>}</li>
 *   <li>{@link de.hub.clickwatch.model.impl.NetworkImpl#getHandlerFilter <em>Handler Filter</em>}</li>
 *   <li>{@link de.hub.clickwatch.model.impl.NetworkImpl#getSubnetworks <em>Subnetworks</em>}</li>
 *   <li>{@link de.hub.clickwatch.model.impl.NetworkImpl#getTimestamp <em>Timestamp</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NetworkImpl extends ModelElementWithStatisticsImpl implements Network {
	/**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
	protected static final String NAME_EDEFAULT = "My Network";
	/**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
	protected String name = NAME_EDEFAULT;
	/**
     * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getNodes()
     * @generated
     * @ordered
     */
	protected EList<Node> nodes;
	/**
     * The default value of the '{@link #getElementFilter() <em>Element Filter</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getElementFilter()
     * @generated
     * @ordered
     */
	protected static final String ELEMENT_FILTER_EDEFAULT = null;
	/**
     * The cached value of the '{@link #getElementFilter() <em>Element Filter</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getElementFilter()
     * @generated
     * @ordered
     */
	protected String elementFilter = ELEMENT_FILTER_EDEFAULT;
	/**
     * The default value of the '{@link #getHandlerFilter() <em>Handler Filter</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getHandlerFilter()
     * @generated
     * @ordered
     */
	protected static final String HANDLER_FILTER_EDEFAULT = null;
	/**
     * The cached value of the '{@link #getHandlerFilter() <em>Handler Filter</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getHandlerFilter()
     * @generated
     * @ordered
     */
	protected String handlerFilter = HANDLER_FILTER_EDEFAULT;
	/**
     * The cached value of the '{@link #getSubnetworks() <em>Subnetworks</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getSubnetworks()
     * @generated
     * @ordered
     */
	protected EList<Network> subnetworks;
	/**
     * The default value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTimestamp()
     * @generated
     * @ordered
     */
    protected static final long TIMESTAMP_EDEFAULT = 0L;
    /**
     * The cached value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTimestamp()
     * @generated
     * @ordered
     */
    protected long timestamp = TIMESTAMP_EDEFAULT;
    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected NetworkImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return ClickWatchModelPackage.Literals.NETWORK;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getName() {
        return name;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setName(String newName) {
        String oldName = name;
        name = newName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ClickWatchModelPackage.NETWORK__NAME, oldName, name));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<Node> getNodes() {
        if (nodes == null) {
            nodes = new EObjectContainmentEList<Node>(Node.class, this, ClickWatchModelPackage.NETWORK__NODES);
        }
        return nodes;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getElementFilter() {
        return elementFilter;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setElementFilter(String newElementFilter) {
        String oldElementFilter = elementFilter;
        elementFilter = newElementFilter;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ClickWatchModelPackage.NETWORK__ELEMENT_FILTER, oldElementFilter, elementFilter));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getHandlerFilter() {
        return handlerFilter;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setHandlerFilter(String newHandlerFilter) {
        String oldHandlerFilter = handlerFilter;
        handlerFilter = newHandlerFilter;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ClickWatchModelPackage.NETWORK__HANDLER_FILTER, oldHandlerFilter, handlerFilter));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<Network> getSubnetworks() {
        if (subnetworks == null) {
            subnetworks = new EObjectContainmentEList<Network>(Network.class, this, ClickWatchModelPackage.NETWORK__SUBNETWORKS);
        }
        return subnetworks;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public long getTimestamp() {
        return timestamp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTimestamp(long newTimestamp) {
        long oldTimestamp = timestamp;
        timestamp = newTimestamp;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ClickWatchModelPackage.NETWORK__TIMESTAMP, oldTimestamp, timestamp));
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ClickWatchModelPackage.NETWORK__NODES:
                return ((InternalEList<?>)getNodes()).basicRemove(otherEnd, msgs);
            case ClickWatchModelPackage.NETWORK__SUBNETWORKS:
                return ((InternalEList<?>)getSubnetworks()).basicRemove(otherEnd, msgs);
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
            case ClickWatchModelPackage.NETWORK__NAME:
                return getName();
            case ClickWatchModelPackage.NETWORK__NODES:
                return getNodes();
            case ClickWatchModelPackage.NETWORK__ELEMENT_FILTER:
                return getElementFilter();
            case ClickWatchModelPackage.NETWORK__HANDLER_FILTER:
                return getHandlerFilter();
            case ClickWatchModelPackage.NETWORK__SUBNETWORKS:
                return getSubnetworks();
            case ClickWatchModelPackage.NETWORK__TIMESTAMP:
                return getTimestamp();
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
            case ClickWatchModelPackage.NETWORK__NAME:
                setName((String)newValue);
                return;
            case ClickWatchModelPackage.NETWORK__NODES:
                getNodes().clear();
                getNodes().addAll((Collection<? extends Node>)newValue);
                return;
            case ClickWatchModelPackage.NETWORK__ELEMENT_FILTER:
                setElementFilter((String)newValue);
                return;
            case ClickWatchModelPackage.NETWORK__HANDLER_FILTER:
                setHandlerFilter((String)newValue);
                return;
            case ClickWatchModelPackage.NETWORK__SUBNETWORKS:
                getSubnetworks().clear();
                getSubnetworks().addAll((Collection<? extends Network>)newValue);
                return;
            case ClickWatchModelPackage.NETWORK__TIMESTAMP:
                setTimestamp((Long)newValue);
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
            case ClickWatchModelPackage.NETWORK__NAME:
                setName(NAME_EDEFAULT);
                return;
            case ClickWatchModelPackage.NETWORK__NODES:
                getNodes().clear();
                return;
            case ClickWatchModelPackage.NETWORK__ELEMENT_FILTER:
                setElementFilter(ELEMENT_FILTER_EDEFAULT);
                return;
            case ClickWatchModelPackage.NETWORK__HANDLER_FILTER:
                setHandlerFilter(HANDLER_FILTER_EDEFAULT);
                return;
            case ClickWatchModelPackage.NETWORK__SUBNETWORKS:
                getSubnetworks().clear();
                return;
            case ClickWatchModelPackage.NETWORK__TIMESTAMP:
                setTimestamp(TIMESTAMP_EDEFAULT);
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
            case ClickWatchModelPackage.NETWORK__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case ClickWatchModelPackage.NETWORK__NODES:
                return nodes != null && !nodes.isEmpty();
            case ClickWatchModelPackage.NETWORK__ELEMENT_FILTER:
                return ELEMENT_FILTER_EDEFAULT == null ? elementFilter != null : !ELEMENT_FILTER_EDEFAULT.equals(elementFilter);
            case ClickWatchModelPackage.NETWORK__HANDLER_FILTER:
                return HANDLER_FILTER_EDEFAULT == null ? handlerFilter != null : !HANDLER_FILTER_EDEFAULT.equals(handlerFilter);
            case ClickWatchModelPackage.NETWORK__SUBNETWORKS:
                return subnetworks != null && !subnetworks.isEmpty();
            case ClickWatchModelPackage.NETWORK__TIMESTAMP:
                return timestamp != TIMESTAMP_EDEFAULT;
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
        result.append(" (name: ");
        result.append(name);
        result.append(", ElementFilter: ");
        result.append(elementFilter);
        result.append(", HandlerFilter: ");
        result.append(handlerFilter);
        result.append(", timestamp: ");
        result.append(timestamp);
        result.append(')');
        return result.toString();
    }

} //NetworkImpl
