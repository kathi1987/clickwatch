/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.datamodel.impl;


import de.hub.clickwatch.analysis.traceable.Traceable;
import de.hub.clickwatch.analysis.traceable.TraceablePackage;
import de.hub.clickwatch.datamodel.ClickWatchDataModelPackage;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.hub.clickwatch.datamodel.ClickWatchModelPackage;
import de.hub.clickwatch.datamodel.Network;
import de.hub.clickwatch.datamodel.Node;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Network</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.clickwatch.datamodel.impl.NetworkImpl#getTracesFrom <em>Traces From</em>}</li>
 *   <li>{@link de.hub.clickwatch.datamodel.impl.NetworkImpl#getTracesTo <em>Traces To</em>}</li>
 *   <li>{@link de.hub.clickwatch.datamodel.impl.NetworkImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.hub.clickwatch.datamodel.impl.NetworkImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link de.hub.clickwatch.datamodel.impl.NetworkImpl#getElementFilter <em>Element Filter</em>}</li>
 *   <li>{@link de.hub.clickwatch.datamodel.impl.NetworkImpl#getHandlerFilter <em>Handler Filter</em>}</li>
 *   <li>{@link de.hub.clickwatch.datamodel.impl.NetworkImpl#getSubnetworks <em>Subnetworks</em>}</li>
 *   <li>{@link de.hub.clickwatch.datamodel.impl.NetworkImpl#getTimestamp <em>Timestamp</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NetworkImpl extends ModelElementWithStatisticsImpl implements Network {
	/**
	 * The cached value of the '{@link #getTracesFrom() <em>Traces From</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTracesFrom()
	 * @generated
	 * @ordered
	 */
	protected EList<Traceable> tracesFrom;
	/**
	 * The cached value of the '{@link #getTracesTo() <em>Traces To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTracesTo()
	 * @generated
	 * @ordered
	 */
	protected EList<Traceable> tracesTo;
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
		return ClickWatchDataModelPackage.Literals.NETWORK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Traceable> getTracesFrom() {
		if (tracesFrom == null) {
			tracesFrom = new EObjectResolvingEList<Traceable>(Traceable.class, this, ClickWatchDataModelPackage.NETWORK__TRACES_FROM);
		}
		return tracesFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Traceable> getTracesTo() {
		if (tracesTo == null) {
			tracesTo = new EObjectResolvingEList<Traceable>(Traceable.class, this, ClickWatchDataModelPackage.NETWORK__TRACES_TO);
		}
		return tracesTo;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ClickWatchDataModelPackage.NETWORK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getNodes() {
		if (nodes == null) {
			nodes = new EObjectContainmentEList<Node>(Node.class, this, ClickWatchDataModelPackage.NETWORK__NODES);
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
			eNotify(new ENotificationImpl(this, Notification.SET, ClickWatchDataModelPackage.NETWORK__ELEMENT_FILTER, oldElementFilter, elementFilter));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ClickWatchDataModelPackage.NETWORK__HANDLER_FILTER, oldHandlerFilter, handlerFilter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Network> getSubnetworks() {
		if (subnetworks == null) {
			subnetworks = new EObjectContainmentEList<Network>(Network.class, this, ClickWatchDataModelPackage.NETWORK__SUBNETWORKS);
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
			eNotify(new ENotificationImpl(this, Notification.SET, ClickWatchDataModelPackage.NETWORK__TIMESTAMP, oldTimestamp, timestamp));
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ClickWatchDataModelPackage.NETWORK__NODES:
				return ((InternalEList<?>)getNodes()).basicRemove(otherEnd, msgs);
			case ClickWatchDataModelPackage.NETWORK__SUBNETWORKS:
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
			case ClickWatchDataModelPackage.NETWORK__TRACES_FROM:
				return getTracesFrom();
			case ClickWatchDataModelPackage.NETWORK__TRACES_TO:
				return getTracesTo();
			case ClickWatchDataModelPackage.NETWORK__NAME:
				return getName();
			case ClickWatchDataModelPackage.NETWORK__NODES:
				return getNodes();
			case ClickWatchDataModelPackage.NETWORK__ELEMENT_FILTER:
				return getElementFilter();
			case ClickWatchDataModelPackage.NETWORK__HANDLER_FILTER:
				return getHandlerFilter();
			case ClickWatchDataModelPackage.NETWORK__SUBNETWORKS:
				return getSubnetworks();
			case ClickWatchDataModelPackage.NETWORK__TIMESTAMP:
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
			case ClickWatchDataModelPackage.NETWORK__TRACES_FROM:
				getTracesFrom().clear();
				getTracesFrom().addAll((Collection<? extends Traceable>)newValue);
				return;
			case ClickWatchDataModelPackage.NETWORK__TRACES_TO:
				getTracesTo().clear();
				getTracesTo().addAll((Collection<? extends Traceable>)newValue);
				return;
			case ClickWatchDataModelPackage.NETWORK__NAME:
				setName((String)newValue);
				return;
			case ClickWatchDataModelPackage.NETWORK__NODES:
				getNodes().clear();
				getNodes().addAll((Collection<? extends Node>)newValue);
				return;
			case ClickWatchDataModelPackage.NETWORK__ELEMENT_FILTER:
				setElementFilter((String)newValue);
				return;
			case ClickWatchDataModelPackage.NETWORK__HANDLER_FILTER:
				setHandlerFilter((String)newValue);
				return;
			case ClickWatchDataModelPackage.NETWORK__SUBNETWORKS:
				getSubnetworks().clear();
				getSubnetworks().addAll((Collection<? extends Network>)newValue);
				return;
			case ClickWatchDataModelPackage.NETWORK__TIMESTAMP:
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
			case ClickWatchDataModelPackage.NETWORK__TRACES_FROM:
				getTracesFrom().clear();
				return;
			case ClickWatchDataModelPackage.NETWORK__TRACES_TO:
				getTracesTo().clear();
				return;
			case ClickWatchDataModelPackage.NETWORK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ClickWatchDataModelPackage.NETWORK__NODES:
				getNodes().clear();
				return;
			case ClickWatchDataModelPackage.NETWORK__ELEMENT_FILTER:
				setElementFilter(ELEMENT_FILTER_EDEFAULT);
				return;
			case ClickWatchDataModelPackage.NETWORK__HANDLER_FILTER:
				setHandlerFilter(HANDLER_FILTER_EDEFAULT);
				return;
			case ClickWatchDataModelPackage.NETWORK__SUBNETWORKS:
				getSubnetworks().clear();
				return;
			case ClickWatchDataModelPackage.NETWORK__TIMESTAMP:
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
			case ClickWatchDataModelPackage.NETWORK__TRACES_FROM:
				return tracesFrom != null && !tracesFrom.isEmpty();
			case ClickWatchDataModelPackage.NETWORK__TRACES_TO:
				return tracesTo != null && !tracesTo.isEmpty();
			case ClickWatchDataModelPackage.NETWORK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ClickWatchDataModelPackage.NETWORK__NODES:
				return nodes != null && !nodes.isEmpty();
			case ClickWatchDataModelPackage.NETWORK__ELEMENT_FILTER:
				return ELEMENT_FILTER_EDEFAULT == null ? elementFilter != null : !ELEMENT_FILTER_EDEFAULT.equals(elementFilter);
			case ClickWatchDataModelPackage.NETWORK__HANDLER_FILTER:
				return HANDLER_FILTER_EDEFAULT == null ? handlerFilter != null : !HANDLER_FILTER_EDEFAULT.equals(handlerFilter);
			case ClickWatchDataModelPackage.NETWORK__SUBNETWORKS:
				return subnetworks != null && !subnetworks.isEmpty();
			case ClickWatchDataModelPackage.NETWORK__TIMESTAMP:
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
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Traceable.class) {
			switch (derivedFeatureID) {
				case ClickWatchDataModelPackage.NETWORK__TRACES_FROM: return TraceablePackage.TRACEABLE__TRACES_FROM;
				case ClickWatchDataModelPackage.NETWORK__TRACES_TO: return TraceablePackage.TRACEABLE__TRACES_TO;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Traceable.class) {
			switch (baseFeatureID) {
				case TraceablePackage.TRACEABLE__TRACES_FROM: return ClickWatchDataModelPackage.NETWORK__TRACES_FROM;
				case TraceablePackage.TRACEABLE__TRACES_TO: return ClickWatchDataModelPackage.NETWORK__TRACES_TO;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
