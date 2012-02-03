/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificdatamodels.brn.routing_dsr_stats_stats.impl;

import de.hub.clickwatch.datamodel.impl.ValueImpl;

import de.hub.clickwatch.specificdatamodels.brn.routing_dsr_stats_stats.Dsr_route_stats;
import de.hub.clickwatch.specificdatamodels.brn.routing_dsr_stats_stats.Routing_dsr_stats_statsPackage;
import de.hub.clickwatch.specificdatamodels.brn.routing_dsr_stats_stats.Stats;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stats</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.routing_dsr_stats_stats.impl.StatsImpl#getDsr_route_stats <em>Dsr route stats</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StatsImpl extends ValueImpl implements Stats {
	/**
	 * The cached value of the '{@link #getDsr_route_stats() <em>Dsr route stats</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDsr_route_stats()
	 * @generated
	 * @ordered
	 */
	protected Dsr_route_stats dsr_route_stats;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StatsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Routing_dsr_stats_statsPackage.Literals.STATS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dsr_route_stats getDsr_route_stats() {
		return dsr_route_stats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDsr_route_stats(Dsr_route_stats newDsr_route_stats, NotificationChain msgs) {
		Dsr_route_stats oldDsr_route_stats = dsr_route_stats;
		dsr_route_stats = newDsr_route_stats;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Routing_dsr_stats_statsPackage.STATS__DSR_ROUTE_STATS, oldDsr_route_stats, newDsr_route_stats);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDsr_route_stats(Dsr_route_stats newDsr_route_stats) {
		if (newDsr_route_stats != dsr_route_stats) {
			NotificationChain msgs = null;
			if (dsr_route_stats != null)
				msgs = ((InternalEObject)dsr_route_stats).eInverseRemove(this, Routing_dsr_stats_statsPackage.DSR_ROUTE_STATS__ECONTAINER_DSR_ROUTE_STATS, Dsr_route_stats.class, msgs);
			if (newDsr_route_stats != null)
				msgs = ((InternalEObject)newDsr_route_stats).eInverseAdd(this, Routing_dsr_stats_statsPackage.DSR_ROUTE_STATS__ECONTAINER_DSR_ROUTE_STATS, Dsr_route_stats.class, msgs);
			msgs = basicSetDsr_route_stats(newDsr_route_stats, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Routing_dsr_stats_statsPackage.STATS__DSR_ROUTE_STATS, newDsr_route_stats, newDsr_route_stats));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Routing_dsr_stats_statsPackage.STATS__DSR_ROUTE_STATS:
				if (dsr_route_stats != null)
					msgs = ((InternalEObject)dsr_route_stats).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Routing_dsr_stats_statsPackage.STATS__DSR_ROUTE_STATS, null, msgs);
				return basicSetDsr_route_stats((Dsr_route_stats)otherEnd, msgs);
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
			case Routing_dsr_stats_statsPackage.STATS__DSR_ROUTE_STATS:
				return basicSetDsr_route_stats(null, msgs);
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
			case Routing_dsr_stats_statsPackage.STATS__DSR_ROUTE_STATS:
				return getDsr_route_stats();
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
			case Routing_dsr_stats_statsPackage.STATS__DSR_ROUTE_STATS:
				setDsr_route_stats((Dsr_route_stats)newValue);
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
			case Routing_dsr_stats_statsPackage.STATS__DSR_ROUTE_STATS:
				setDsr_route_stats((Dsr_route_stats)null);
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
			case Routing_dsr_stats_statsPackage.STATS__DSR_ROUTE_STATS:
				return dsr_route_stats != null;
		}
		return super.eIsSet(featureID);
	}

} //StatsImpl
