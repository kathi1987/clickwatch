/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificdatamodels.brn.seismo_localchannelinfo.impl;

import de.hub.clickwatch.datamodel.impl.ValueImpl;

import de.hub.clickwatch.specificdatamodels.brn.seismo_localchannelinfo.C;
import de.hub.clickwatch.specificdatamodels.brn.seismo_localchannelinfo.Localchannelinfo;
import de.hub.clickwatch.specificdatamodels.brn.seismo_localchannelinfo.Seismo_localchannelinfoPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Localchannelinfo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.seismo_localchannelinfo.impl.LocalchannelinfoImpl#getC <em>C</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LocalchannelinfoImpl extends ValueImpl implements Localchannelinfo {
	/**
	 * The cached value of the '{@link #getC() <em>C</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC()
	 * @generated
	 * @ordered
	 */
	protected C c;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocalchannelinfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Seismo_localchannelinfoPackage.Literals.LOCALCHANNELINFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public C getC() {
		return c;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetC(C newC, NotificationChain msgs) {
		C oldC = c;
		c = newC;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Seismo_localchannelinfoPackage.LOCALCHANNELINFO__C, oldC, newC);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setC(C newC) {
		if (newC != c) {
			NotificationChain msgs = null;
			if (c != null)
				msgs = ((InternalEObject)c).eInverseRemove(this, Seismo_localchannelinfoPackage.C__ECONTAINER_C, C.class, msgs);
			if (newC != null)
				msgs = ((InternalEObject)newC).eInverseAdd(this, Seismo_localchannelinfoPackage.C__ECONTAINER_C, C.class, msgs);
			msgs = basicSetC(newC, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Seismo_localchannelinfoPackage.LOCALCHANNELINFO__C, newC, newC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Seismo_localchannelinfoPackage.LOCALCHANNELINFO__C:
				if (c != null)
					msgs = ((InternalEObject)c).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Seismo_localchannelinfoPackage.LOCALCHANNELINFO__C, null, msgs);
				return basicSetC((C)otherEnd, msgs);
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
			case Seismo_localchannelinfoPackage.LOCALCHANNELINFO__C:
				return basicSetC(null, msgs);
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
			case Seismo_localchannelinfoPackage.LOCALCHANNELINFO__C:
				return getC();
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
			case Seismo_localchannelinfoPackage.LOCALCHANNELINFO__C:
				setC((C)newValue);
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
			case Seismo_localchannelinfoPackage.LOCALCHANNELINFO__C:
				setC((C)null);
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
			case Seismo_localchannelinfoPackage.LOCALCHANNELINFO__C:
				return c != null;
		}
		return super.eIsSet(featureID);
	}

} //LocalchannelinfoImpl
