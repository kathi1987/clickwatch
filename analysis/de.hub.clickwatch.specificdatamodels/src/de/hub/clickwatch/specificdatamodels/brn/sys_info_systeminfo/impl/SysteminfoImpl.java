/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificdatamodels.brn.sys_info_systeminfo.impl;

import de.hub.clickwatch.datamodel.impl.ValueImpl;

import de.hub.clickwatch.specificdatamodels.brn.sys_info_systeminfo.Sys_info_systeminfoPackage;
import de.hub.clickwatch.specificdatamodels.brn.sys_info_systeminfo.Systeminfo;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Systeminfo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.sys_info_systeminfo.impl.SysteminfoImpl#getSystem <em>System</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SysteminfoImpl extends ValueImpl implements Systeminfo {
	/**
	 * The cached value of the '{@link #getSystem() <em>System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystem()
	 * @generated
	 * @ordered
	 */
	protected de.hub.clickwatch.specificdatamodels.brn.sys_info_systeminfo.System system;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SysteminfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Sys_info_systeminfoPackage.Literals.SYSTEMINFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.hub.clickwatch.specificdatamodels.brn.sys_info_systeminfo.System getSystem() {
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSystem(de.hub.clickwatch.specificdatamodels.brn.sys_info_systeminfo.System newSystem, NotificationChain msgs) {
		de.hub.clickwatch.specificdatamodels.brn.sys_info_systeminfo.System oldSystem = system;
		system = newSystem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Sys_info_systeminfoPackage.SYSTEMINFO__SYSTEM, oldSystem, newSystem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystem(de.hub.clickwatch.specificdatamodels.brn.sys_info_systeminfo.System newSystem) {
		if (newSystem != system) {
			NotificationChain msgs = null;
			if (system != null)
				msgs = ((InternalEObject)system).eInverseRemove(this, Sys_info_systeminfoPackage.SYSTEM__ECONTAINER_SYSTEM, de.hub.clickwatch.specificdatamodels.brn.sys_info_systeminfo.System.class, msgs);
			if (newSystem != null)
				msgs = ((InternalEObject)newSystem).eInverseAdd(this, Sys_info_systeminfoPackage.SYSTEM__ECONTAINER_SYSTEM, de.hub.clickwatch.specificdatamodels.brn.sys_info_systeminfo.System.class, msgs);
			msgs = basicSetSystem(newSystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Sys_info_systeminfoPackage.SYSTEMINFO__SYSTEM, newSystem, newSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Sys_info_systeminfoPackage.SYSTEMINFO__SYSTEM:
				if (system != null)
					msgs = ((InternalEObject)system).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Sys_info_systeminfoPackage.SYSTEMINFO__SYSTEM, null, msgs);
				return basicSetSystem((de.hub.clickwatch.specificdatamodels.brn.sys_info_systeminfo.System)otherEnd, msgs);
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
			case Sys_info_systeminfoPackage.SYSTEMINFO__SYSTEM:
				return basicSetSystem(null, msgs);
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
			case Sys_info_systeminfoPackage.SYSTEMINFO__SYSTEM:
				return getSystem();
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
			case Sys_info_systeminfoPackage.SYSTEMINFO__SYSTEM:
				setSystem((de.hub.clickwatch.specificdatamodels.brn.sys_info_systeminfo.System)newValue);
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
			case Sys_info_systeminfoPackage.SYSTEMINFO__SYSTEM:
				setSystem((de.hub.clickwatch.specificdatamodels.brn.sys_info_systeminfo.System)null);
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
			case Sys_info_systeminfoPackage.SYSTEMINFO__SYSTEM:
				return system != null;
		}
		return super.eIsSet(featureID);
	}

} //SysteminfoImpl
