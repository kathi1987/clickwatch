/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificdatamodels.brn.sys_info_systeminfo.impl;

import de.hub.clickwatch.specificdatamodels.brn.sys_info_systeminfo.Loadavg;
import de.hub.clickwatch.specificdatamodels.brn.sys_info_systeminfo.Sys_info_systeminfoPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Loadavg</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.sys_info_systeminfo.impl.LoadavgImpl#getEContainer_loadavg <em>EContainer loadavg</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.sys_info_systeminfo.impl.LoadavgImpl#getOnemin <em>Onemin</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.sys_info_systeminfo.impl.LoadavgImpl#getFivemin <em>Fivemin</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.sys_info_systeminfo.impl.LoadavgImpl#getFifteen <em>Fifteen</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LoadavgImpl extends EObjectImpl implements Loadavg {
	/**
	 * The default value of the '{@link #getOnemin() <em>Onemin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnemin()
	 * @generated
	 * @ordered
	 */
	protected static final double ONEMIN_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getOnemin() <em>Onemin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnemin()
	 * @generated
	 * @ordered
	 */
	protected double onemin = ONEMIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getFivemin() <em>Fivemin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFivemin()
	 * @generated
	 * @ordered
	 */
	protected static final double FIVEMIN_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFivemin() <em>Fivemin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFivemin()
	 * @generated
	 * @ordered
	 */
	protected double fivemin = FIVEMIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getFifteen() <em>Fifteen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFifteen()
	 * @generated
	 * @ordered
	 */
	protected static final double FIFTEEN_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFifteen() <em>Fifteen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFifteen()
	 * @generated
	 * @ordered
	 */
	protected double fifteen = FIFTEEN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoadavgImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Sys_info_systeminfoPackage.Literals.LOADAVG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.hub.clickwatch.specificdatamodels.brn.sys_info_systeminfo.System getEContainer_loadavg() {
		if (eContainerFeatureID() != Sys_info_systeminfoPackage.LOADAVG__ECONTAINER_LOADAVG) return null;
		return (de.hub.clickwatch.specificdatamodels.brn.sys_info_systeminfo.System)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEContainer_loadavg(de.hub.clickwatch.specificdatamodels.brn.sys_info_systeminfo.System newEContainer_loadavg, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEContainer_loadavg, Sys_info_systeminfoPackage.LOADAVG__ECONTAINER_LOADAVG, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEContainer_loadavg(de.hub.clickwatch.specificdatamodels.brn.sys_info_systeminfo.System newEContainer_loadavg) {
		if (newEContainer_loadavg != eInternalContainer() || (eContainerFeatureID() != Sys_info_systeminfoPackage.LOADAVG__ECONTAINER_LOADAVG && newEContainer_loadavg != null)) {
			if (EcoreUtil.isAncestor(this, newEContainer_loadavg))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEContainer_loadavg != null)
				msgs = ((InternalEObject)newEContainer_loadavg).eInverseAdd(this, Sys_info_systeminfoPackage.SYSTEM__LOADAVG, de.hub.clickwatch.specificdatamodels.brn.sys_info_systeminfo.System.class, msgs);
			msgs = basicSetEContainer_loadavg(newEContainer_loadavg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Sys_info_systeminfoPackage.LOADAVG__ECONTAINER_LOADAVG, newEContainer_loadavg, newEContainer_loadavg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getOnemin() {
		return onemin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnemin(double newOnemin) {
		double oldOnemin = onemin;
		onemin = newOnemin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Sys_info_systeminfoPackage.LOADAVG__ONEMIN, oldOnemin, onemin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFivemin() {
		return fivemin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFivemin(double newFivemin) {
		double oldFivemin = fivemin;
		fivemin = newFivemin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Sys_info_systeminfoPackage.LOADAVG__FIVEMIN, oldFivemin, fivemin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFifteen() {
		return fifteen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFifteen(double newFifteen) {
		double oldFifteen = fifteen;
		fifteen = newFifteen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Sys_info_systeminfoPackage.LOADAVG__FIFTEEN, oldFifteen, fifteen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Sys_info_systeminfoPackage.LOADAVG__ECONTAINER_LOADAVG:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEContainer_loadavg((de.hub.clickwatch.specificdatamodels.brn.sys_info_systeminfo.System)otherEnd, msgs);
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
			case Sys_info_systeminfoPackage.LOADAVG__ECONTAINER_LOADAVG:
				return basicSetEContainer_loadavg(null, msgs);
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
			case Sys_info_systeminfoPackage.LOADAVG__ECONTAINER_LOADAVG:
				return eInternalContainer().eInverseRemove(this, Sys_info_systeminfoPackage.SYSTEM__LOADAVG, de.hub.clickwatch.specificdatamodels.brn.sys_info_systeminfo.System.class, msgs);
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
			case Sys_info_systeminfoPackage.LOADAVG__ECONTAINER_LOADAVG:
				return getEContainer_loadavg();
			case Sys_info_systeminfoPackage.LOADAVG__ONEMIN:
				return getOnemin();
			case Sys_info_systeminfoPackage.LOADAVG__FIVEMIN:
				return getFivemin();
			case Sys_info_systeminfoPackage.LOADAVG__FIFTEEN:
				return getFifteen();
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
			case Sys_info_systeminfoPackage.LOADAVG__ECONTAINER_LOADAVG:
				setEContainer_loadavg((de.hub.clickwatch.specificdatamodels.brn.sys_info_systeminfo.System)newValue);
				return;
			case Sys_info_systeminfoPackage.LOADAVG__ONEMIN:
				setOnemin((Double)newValue);
				return;
			case Sys_info_systeminfoPackage.LOADAVG__FIVEMIN:
				setFivemin((Double)newValue);
				return;
			case Sys_info_systeminfoPackage.LOADAVG__FIFTEEN:
				setFifteen((Double)newValue);
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
			case Sys_info_systeminfoPackage.LOADAVG__ECONTAINER_LOADAVG:
				setEContainer_loadavg((de.hub.clickwatch.specificdatamodels.brn.sys_info_systeminfo.System)null);
				return;
			case Sys_info_systeminfoPackage.LOADAVG__ONEMIN:
				setOnemin(ONEMIN_EDEFAULT);
				return;
			case Sys_info_systeminfoPackage.LOADAVG__FIVEMIN:
				setFivemin(FIVEMIN_EDEFAULT);
				return;
			case Sys_info_systeminfoPackage.LOADAVG__FIFTEEN:
				setFifteen(FIFTEEN_EDEFAULT);
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
			case Sys_info_systeminfoPackage.LOADAVG__ECONTAINER_LOADAVG:
				return getEContainer_loadavg() != null;
			case Sys_info_systeminfoPackage.LOADAVG__ONEMIN:
				return onemin != ONEMIN_EDEFAULT;
			case Sys_info_systeminfoPackage.LOADAVG__FIVEMIN:
				return fivemin != FIVEMIN_EDEFAULT;
			case Sys_info_systeminfoPackage.LOADAVG__FIFTEEN:
				return fifteen != FIFTEEN_EDEFAULT;
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
		result.append(" (onemin: ");
		result.append(onemin);
		result.append(", fivemin: ");
		result.append(fivemin);
		result.append(", fifteen: ");
		result.append(fifteen);
		result.append(')');
		return result.toString();
	}

} //LoadavgImpl
