/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificdatamodels.brn.tsi_syncinfo.impl;

import de.hub.clickwatch.datamodel.impl.ValueImpl;

import de.hub.clickwatch.specificdatamodels.brn.tsi_syncinfo.Syncinfo;
import de.hub.clickwatch.specificdatamodels.brn.tsi_syncinfo.Timesyncinfo;
import de.hub.clickwatch.specificdatamodels.brn.tsi_syncinfo.Tsi_syncinfoPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Syncinfo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.tsi_syncinfo.impl.SyncinfoImpl#getTimesyncinfo <em>Timesyncinfo</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SyncinfoImpl extends ValueImpl implements Syncinfo {
	/**
	 * The cached value of the '{@link #getTimesyncinfo() <em>Timesyncinfo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimesyncinfo()
	 * @generated
	 * @ordered
	 */
	protected Timesyncinfo timesyncinfo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SyncinfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Tsi_syncinfoPackage.Literals.SYNCINFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Timesyncinfo getTimesyncinfo() {
		return timesyncinfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimesyncinfo(Timesyncinfo newTimesyncinfo, NotificationChain msgs) {
		Timesyncinfo oldTimesyncinfo = timesyncinfo;
		timesyncinfo = newTimesyncinfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tsi_syncinfoPackage.SYNCINFO__TIMESYNCINFO, oldTimesyncinfo, newTimesyncinfo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimesyncinfo(Timesyncinfo newTimesyncinfo) {
		if (newTimesyncinfo != timesyncinfo) {
			NotificationChain msgs = null;
			if (timesyncinfo != null)
				msgs = ((InternalEObject)timesyncinfo).eInverseRemove(this, Tsi_syncinfoPackage.TIMESYNCINFO__ECONTAINER_TIMESYNCINFO, Timesyncinfo.class, msgs);
			if (newTimesyncinfo != null)
				msgs = ((InternalEObject)newTimesyncinfo).eInverseAdd(this, Tsi_syncinfoPackage.TIMESYNCINFO__ECONTAINER_TIMESYNCINFO, Timesyncinfo.class, msgs);
			msgs = basicSetTimesyncinfo(newTimesyncinfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tsi_syncinfoPackage.SYNCINFO__TIMESYNCINFO, newTimesyncinfo, newTimesyncinfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Tsi_syncinfoPackage.SYNCINFO__TIMESYNCINFO:
				if (timesyncinfo != null)
					msgs = ((InternalEObject)timesyncinfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tsi_syncinfoPackage.SYNCINFO__TIMESYNCINFO, null, msgs);
				return basicSetTimesyncinfo((Timesyncinfo)otherEnd, msgs);
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
			case Tsi_syncinfoPackage.SYNCINFO__TIMESYNCINFO:
				return basicSetTimesyncinfo(null, msgs);
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
			case Tsi_syncinfoPackage.SYNCINFO__TIMESYNCINFO:
				return getTimesyncinfo();
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
			case Tsi_syncinfoPackage.SYNCINFO__TIMESYNCINFO:
				setTimesyncinfo((Timesyncinfo)newValue);
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
			case Tsi_syncinfoPackage.SYNCINFO__TIMESYNCINFO:
				setTimesyncinfo((Timesyncinfo)null);
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
			case Tsi_syncinfoPackage.SYNCINFO__TIMESYNCINFO:
				return timesyncinfo != null;
		}
		return super.eIsSet(featureID);
	}

} //SyncinfoImpl
