/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package edu.hu.clickwatch.clientlocation.clientstats.impl;

import edu.hu.clickwatch.clientlocation.clientstats.APLink;
import edu.hu.clickwatch.clientlocation.clientstats.Client;
import edu.hu.clickwatch.clientlocation.clientstats.ClientStats;
import edu.hu.clickwatch.clientlocation.clientstats.ClientStatsPackage;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Client Stats</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.hu.clickwatch.clientlocation.clientstats.impl.ClientStatsImpl#getClients <em>Clients</em>}</li>
 *   <li>{@link edu.hu.clickwatch.clientlocation.clientstats.impl.ClientStatsImpl#getApLinks <em>Ap Links</em>}</li>
 *   <li>{@link edu.hu.clickwatch.clientlocation.clientstats.impl.ClientStatsImpl#getTime <em>Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClientStatsImpl extends EObjectImpl implements ClientStats {
	/**
	 * The cached value of the '{@link #getClients() <em>Clients</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClients()
	 * @generated
	 * @ordered
	 */
	protected EList<Client> clients;

	/**
	 * The cached value of the '{@link #getApLinks() <em>Ap Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<APLink> apLinks;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClientStatsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClientStatsPackage.Literals.CLIENT_STATS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Client> getClients() {
		if (clients == null) {
			clients = new EObjectContainmentEList<Client>(Client.class, this, ClientStatsPackage.CLIENT_STATS__CLIENTS);
		}
		return clients;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<APLink> getApLinks() {
		if (apLinks == null) {
			apLinks = new EObjectContainmentEList<APLink>(APLink.class, this, ClientStatsPackage.CLIENT_STATS__AP_LINKS);
		}
		return apLinks;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ClientStatsPackage.CLIENT_STATS__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ClientStatsPackage.CLIENT_STATS__CLIENTS:
				return ((InternalEList<?>)getClients()).basicRemove(otherEnd, msgs);
			case ClientStatsPackage.CLIENT_STATS__AP_LINKS:
				return ((InternalEList<?>)getApLinks()).basicRemove(otherEnd, msgs);
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
			case ClientStatsPackage.CLIENT_STATS__CLIENTS:
				return getClients();
			case ClientStatsPackage.CLIENT_STATS__AP_LINKS:
				return getApLinks();
			case ClientStatsPackage.CLIENT_STATS__TIME:
				return getTime();
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
			case ClientStatsPackage.CLIENT_STATS__CLIENTS:
				getClients().clear();
				getClients().addAll((Collection<? extends Client>)newValue);
				return;
			case ClientStatsPackage.CLIENT_STATS__AP_LINKS:
				getApLinks().clear();
				getApLinks().addAll((Collection<? extends APLink>)newValue);
				return;
			case ClientStatsPackage.CLIENT_STATS__TIME:
				setTime((Long)newValue);
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
			case ClientStatsPackage.CLIENT_STATS__CLIENTS:
				getClients().clear();
				return;
			case ClientStatsPackage.CLIENT_STATS__AP_LINKS:
				getApLinks().clear();
				return;
			case ClientStatsPackage.CLIENT_STATS__TIME:
				setTime(TIME_EDEFAULT);
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
			case ClientStatsPackage.CLIENT_STATS__CLIENTS:
				return clients != null && !clients.isEmpty();
			case ClientStatsPackage.CLIENT_STATS__AP_LINKS:
				return apLinks != null && !apLinks.isEmpty();
			case ClientStatsPackage.CLIENT_STATS__TIME:
				return time != TIME_EDEFAULT;
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
		result.append(')');
		return result.toString();
	}

} //ClientStatsImpl
