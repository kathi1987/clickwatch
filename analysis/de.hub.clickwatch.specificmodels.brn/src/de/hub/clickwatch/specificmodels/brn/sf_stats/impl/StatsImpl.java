/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.sf_stats.impl;

import de.hub.clickwatch.model.impl.HandlerImpl;

import de.hub.clickwatch.specificmodels.brn.sf_stats.Flowstats;
import de.hub.clickwatch.specificmodels.brn.sf_stats.Sf_statsPackage;
import de.hub.clickwatch.specificmodels.brn.sf_stats.Stats;

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
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.sf_stats.impl.StatsImpl#getFlowstats <em>Flowstats</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StatsImpl extends HandlerImpl implements Stats {
	/**
	 * The cached value of the '{@link #getFlowstats() <em>Flowstats</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowstats()
	 * @generated
	 * @ordered
	 */
	protected Flowstats flowstats;

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
		return Sf_statsPackage.Literals.STATS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Flowstats getFlowstats() {
		return flowstats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlowstats(Flowstats newFlowstats, NotificationChain msgs) {
		Flowstats oldFlowstats = flowstats;
		flowstats = newFlowstats;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Sf_statsPackage.STATS__FLOWSTATS, oldFlowstats, newFlowstats);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlowstats(Flowstats newFlowstats) {
		if (newFlowstats != flowstats) {
			NotificationChain msgs = null;
			if (flowstats != null)
				msgs = ((InternalEObject)flowstats).eInverseRemove(this, Sf_statsPackage.FLOWSTATS__ECONTAINER_FLOWSTATS, Flowstats.class, msgs);
			if (newFlowstats != null)
				msgs = ((InternalEObject)newFlowstats).eInverseAdd(this, Sf_statsPackage.FLOWSTATS__ECONTAINER_FLOWSTATS, Flowstats.class, msgs);
			msgs = basicSetFlowstats(newFlowstats, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Sf_statsPackage.STATS__FLOWSTATS, newFlowstats, newFlowstats));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Sf_statsPackage.STATS__FLOWSTATS:
				if (flowstats != null)
					msgs = ((InternalEObject)flowstats).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Sf_statsPackage.STATS__FLOWSTATS, null, msgs);
				return basicSetFlowstats((Flowstats)otherEnd, msgs);
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
			case Sf_statsPackage.STATS__FLOWSTATS:
				return basicSetFlowstats(null, msgs);
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
			case Sf_statsPackage.STATS__FLOWSTATS:
				return getFlowstats();
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
			case Sf_statsPackage.STATS__FLOWSTATS:
				setFlowstats((Flowstats)newValue);
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
			case Sf_statsPackage.STATS__FLOWSTATS:
				setFlowstats((Flowstats)null);
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
			case Sf_statsPackage.STATS__FLOWSTATS:
				return flowstats != null;
		}
		return super.eIsSet(featureID);
	}

} //StatsImpl
