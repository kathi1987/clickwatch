/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.lease_tab_leases.impl;

import de.hub.clickwatch.model.impl.HandlerImpl;

import de.hub.clickwatch.specificmodels.brn.lease_tab_leases.Dhcpleases;
import de.hub.clickwatch.specificmodels.brn.lease_tab_leases.Lease_tab_leasesPackage;
import de.hub.clickwatch.specificmodels.brn.lease_tab_leases.Leases;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Leases</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.lease_tab_leases.impl.LeasesImpl#getDhcpleases <em>Dhcpleases</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LeasesImpl extends HandlerImpl implements Leases {
	/**
	 * The cached value of the '{@link #getDhcpleases() <em>Dhcpleases</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDhcpleases()
	 * @generated
	 * @ordered
	 */
	protected EList<Dhcpleases> dhcpleases;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LeasesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Lease_tab_leasesPackage.Literals.LEASES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dhcpleases> getDhcpleases() {
		if (dhcpleases == null) {
			dhcpleases = new EObjectContainmentWithInverseEList<Dhcpleases>(Dhcpleases.class, this, Lease_tab_leasesPackage.LEASES__DHCPLEASES, Lease_tab_leasesPackage.DHCPLEASES__ECONTAINER_DHCPLEASES);
		}
		return dhcpleases;
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
			case Lease_tab_leasesPackage.LEASES__DHCPLEASES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDhcpleases()).basicAdd(otherEnd, msgs);
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
			case Lease_tab_leasesPackage.LEASES__DHCPLEASES:
				return ((InternalEList<?>)getDhcpleases()).basicRemove(otherEnd, msgs);
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
			case Lease_tab_leasesPackage.LEASES__DHCPLEASES:
				return getDhcpleases();
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
			case Lease_tab_leasesPackage.LEASES__DHCPLEASES:
				getDhcpleases().clear();
				getDhcpleases().addAll((Collection<? extends Dhcpleases>)newValue);
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
			case Lease_tab_leasesPackage.LEASES__DHCPLEASES:
				getDhcpleases().clear();
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
			case Lease_tab_leasesPackage.LEASES__DHCPLEASES:
				return dhcpleases != null && !dhcpleases.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LeasesImpl
