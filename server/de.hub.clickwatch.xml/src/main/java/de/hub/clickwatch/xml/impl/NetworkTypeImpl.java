/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.xml.impl;


import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.hub.clickwatch.xml.ConfigurationPackage;
import de.hub.clickwatch.xml.NetworkType;
import de.hub.clickwatch.xml.NodeType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Network Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.clickwatch.xml.impl.NetworkTypeImpl#getNode <em>Node</em>}</li>
 *   <li>{@link de.hub.clickwatch.xml.impl.NetworkTypeImpl#getNetwork <em>Network</em>}</li>
 *   <li>{@link de.hub.clickwatch.xml.impl.NetworkTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.hub.clickwatch.xml.impl.NetworkTypeImpl#getUpdateInterval <em>Update Interval</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NetworkTypeImpl extends EObjectImpl implements NetworkType {
	/**
	 * The cached value of the '{@link #getNode() <em>Node</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode()
	 * @generated
	 * @ordered
	 */
	protected EList<NodeType> node;

	/**
	 * The cached value of the '{@link #getNetwork() <em>Network</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetwork()
	 * @generated
	 * @ordered
	 */
	protected EList<NetworkType> network;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

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
	 * The default value of the '{@link #getUpdateInterval() <em>Update Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateInterval()
	 * @generated
	 * @ordered
	 */
	protected static final int UPDATE_INTERVAL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getUpdateInterval() <em>Update Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateInterval()
	 * @generated
	 * @ordered
	 */
	protected int updateInterval = UPDATE_INTERVAL_EDEFAULT;

	/**
	 * This is true if the Update Interval attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean updateIntervalESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetworkTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return de.hub.clickwatch.xml.ConfigurationPackage.Literals.NETWORK_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NodeType> getNode() {
		if (node == null) {
			node = new EObjectContainmentEList<NodeType>(NodeType.class, this, ConfigurationPackage.NETWORK_TYPE__NODE);
		}
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NetworkType> getNetwork() {
		if (network == null) {
			network = new EObjectContainmentEList<NetworkType>(NetworkType.class, this, ConfigurationPackage.NETWORK_TYPE__NETWORK);
		}
		return network;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.NETWORK_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getUpdateInterval() {
		return updateInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdateInterval(int newUpdateInterval) {
		int oldUpdateInterval = updateInterval;
		updateInterval = newUpdateInterval;
		boolean oldUpdateIntervalESet = updateIntervalESet;
		updateIntervalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.NETWORK_TYPE__UPDATE_INTERVAL, oldUpdateInterval, updateInterval, !oldUpdateIntervalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUpdateInterval() {
		int oldUpdateInterval = updateInterval;
		boolean oldUpdateIntervalESet = updateIntervalESet;
		updateInterval = UPDATE_INTERVAL_EDEFAULT;
		updateIntervalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ConfigurationPackage.NETWORK_TYPE__UPDATE_INTERVAL, oldUpdateInterval, UPDATE_INTERVAL_EDEFAULT, oldUpdateIntervalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUpdateInterval() {
		return updateIntervalESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConfigurationPackage.NETWORK_TYPE__NODE:
				return ((InternalEList<?>)getNode()).basicRemove(otherEnd, msgs);
			case ConfigurationPackage.NETWORK_TYPE__NETWORK:
				return ((InternalEList<?>)getNetwork()).basicRemove(otherEnd, msgs);
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
			case ConfigurationPackage.NETWORK_TYPE__NODE:
				return getNode();
			case ConfigurationPackage.NETWORK_TYPE__NETWORK:
				return getNetwork();
			case ConfigurationPackage.NETWORK_TYPE__NAME:
				return getName();
			case ConfigurationPackage.NETWORK_TYPE__UPDATE_INTERVAL:
				return getUpdateInterval();
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
			case ConfigurationPackage.NETWORK_TYPE__NODE:
				getNode().clear();
				getNode().addAll((Collection<? extends NodeType>)newValue);
				return;
			case ConfigurationPackage.NETWORK_TYPE__NETWORK:
				getNetwork().clear();
				getNetwork().addAll((Collection<? extends NetworkType>)newValue);
				return;
			case ConfigurationPackage.NETWORK_TYPE__NAME:
				setName((String)newValue);
				return;
			case ConfigurationPackage.NETWORK_TYPE__UPDATE_INTERVAL:
				setUpdateInterval((Integer)newValue);
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
			case ConfigurationPackage.NETWORK_TYPE__NODE:
				getNode().clear();
				return;
			case ConfigurationPackage.NETWORK_TYPE__NETWORK:
				getNetwork().clear();
				return;
			case ConfigurationPackage.NETWORK_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ConfigurationPackage.NETWORK_TYPE__UPDATE_INTERVAL:
				unsetUpdateInterval();
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
			case ConfigurationPackage.NETWORK_TYPE__NODE:
				return node != null && !node.isEmpty();
			case ConfigurationPackage.NETWORK_TYPE__NETWORK:
				return network != null && !network.isEmpty();
			case ConfigurationPackage.NETWORK_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ConfigurationPackage.NETWORK_TYPE__UPDATE_INTERVAL:
				return isSetUpdateInterval();
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
		result.append(", updateInterval: ");
		if (updateIntervalESet) result.append(updateInterval); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //NetworkTypeImpl
