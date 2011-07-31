/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.impl;

import de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Device_wifi_link_stat_bcast_statsPackage;
import de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Link;
import de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Link_info;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.impl.Link_infoImpl#getEContainer_link_info <em>EContainer link info</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.impl.Link_infoImpl#getSize <em>Size</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.impl.Link_infoImpl#getRate <em>Rate</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.impl.Link_infoImpl#getFwd <em>Fwd</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.impl.Link_infoImpl#getRev <em>Rev</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Link_infoImpl extends EObjectImpl implements Link_info {
	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final int SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected int size = SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRate() <em>Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRate()
	 * @generated
	 * @ordered
	 */
	protected static final int RATE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRate() <em>Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRate()
	 * @generated
	 * @ordered
	 */
	protected int rate = RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFwd() <em>Fwd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFwd()
	 * @generated
	 * @ordered
	 */
	protected static final int FWD_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFwd() <em>Fwd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFwd()
	 * @generated
	 * @ordered
	 */
	protected int fwd = FWD_EDEFAULT;

	/**
	 * The default value of the '{@link #getRev() <em>Rev</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRev()
	 * @generated
	 * @ordered
	 */
	protected static final int REV_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRev() <em>Rev</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRev()
	 * @generated
	 * @ordered
	 */
	protected int rev = REV_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Link_infoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Device_wifi_link_stat_bcast_statsPackage.Literals.LINK_INFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link getEContainer_link_info() {
		if (eContainerFeatureID() != Device_wifi_link_stat_bcast_statsPackage.LINK_INFO__ECONTAINER_LINK_INFO) return null;
		return (Link)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEContainer_link_info(Link newEContainer_link_info, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEContainer_link_info, Device_wifi_link_stat_bcast_statsPackage.LINK_INFO__ECONTAINER_LINK_INFO, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEContainer_link_info(Link newEContainer_link_info) {
		if (newEContainer_link_info != eInternalContainer() || (eContainerFeatureID() != Device_wifi_link_stat_bcast_statsPackage.LINK_INFO__ECONTAINER_LINK_INFO && newEContainer_link_info != null)) {
			if (EcoreUtil.isAncestor(this, newEContainer_link_info))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEContainer_link_info != null)
				msgs = ((InternalEObject)newEContainer_link_info).eInverseAdd(this, Device_wifi_link_stat_bcast_statsPackage.LINK__LINK_INFO, Link.class, msgs);
			msgs = basicSetEContainer_link_info(newEContainer_link_info, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_link_stat_bcast_statsPackage.LINK_INFO__ECONTAINER_LINK_INFO, newEContainer_link_info, newEContainer_link_info));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(int newSize) {
		int oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_link_stat_bcast_statsPackage.LINK_INFO__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRate() {
		return rate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRate(int newRate) {
		int oldRate = rate;
		rate = newRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_link_stat_bcast_statsPackage.LINK_INFO__RATE, oldRate, rate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFwd() {
		return fwd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFwd(int newFwd) {
		int oldFwd = fwd;
		fwd = newFwd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_link_stat_bcast_statsPackage.LINK_INFO__FWD, oldFwd, fwd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRev() {
		return rev;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRev(int newRev) {
		int oldRev = rev;
		rev = newRev;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_link_stat_bcast_statsPackage.LINK_INFO__REV, oldRev, rev));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Device_wifi_link_stat_bcast_statsPackage.LINK_INFO__ECONTAINER_LINK_INFO:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEContainer_link_info((Link)otherEnd, msgs);
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
			case Device_wifi_link_stat_bcast_statsPackage.LINK_INFO__ECONTAINER_LINK_INFO:
				return basicSetEContainer_link_info(null, msgs);
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
			case Device_wifi_link_stat_bcast_statsPackage.LINK_INFO__ECONTAINER_LINK_INFO:
				return eInternalContainer().eInverseRemove(this, Device_wifi_link_stat_bcast_statsPackage.LINK__LINK_INFO, Link.class, msgs);
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
			case Device_wifi_link_stat_bcast_statsPackage.LINK_INFO__ECONTAINER_LINK_INFO:
				return getEContainer_link_info();
			case Device_wifi_link_stat_bcast_statsPackage.LINK_INFO__SIZE:
				return getSize();
			case Device_wifi_link_stat_bcast_statsPackage.LINK_INFO__RATE:
				return getRate();
			case Device_wifi_link_stat_bcast_statsPackage.LINK_INFO__FWD:
				return getFwd();
			case Device_wifi_link_stat_bcast_statsPackage.LINK_INFO__REV:
				return getRev();
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
			case Device_wifi_link_stat_bcast_statsPackage.LINK_INFO__ECONTAINER_LINK_INFO:
				setEContainer_link_info((Link)newValue);
				return;
			case Device_wifi_link_stat_bcast_statsPackage.LINK_INFO__SIZE:
				setSize((Integer)newValue);
				return;
			case Device_wifi_link_stat_bcast_statsPackage.LINK_INFO__RATE:
				setRate((Integer)newValue);
				return;
			case Device_wifi_link_stat_bcast_statsPackage.LINK_INFO__FWD:
				setFwd((Integer)newValue);
				return;
			case Device_wifi_link_stat_bcast_statsPackage.LINK_INFO__REV:
				setRev((Integer)newValue);
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
			case Device_wifi_link_stat_bcast_statsPackage.LINK_INFO__ECONTAINER_LINK_INFO:
				setEContainer_link_info((Link)null);
				return;
			case Device_wifi_link_stat_bcast_statsPackage.LINK_INFO__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case Device_wifi_link_stat_bcast_statsPackage.LINK_INFO__RATE:
				setRate(RATE_EDEFAULT);
				return;
			case Device_wifi_link_stat_bcast_statsPackage.LINK_INFO__FWD:
				setFwd(FWD_EDEFAULT);
				return;
			case Device_wifi_link_stat_bcast_statsPackage.LINK_INFO__REV:
				setRev(REV_EDEFAULT);
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
			case Device_wifi_link_stat_bcast_statsPackage.LINK_INFO__ECONTAINER_LINK_INFO:
				return getEContainer_link_info() != null;
			case Device_wifi_link_stat_bcast_statsPackage.LINK_INFO__SIZE:
				return size != SIZE_EDEFAULT;
			case Device_wifi_link_stat_bcast_statsPackage.LINK_INFO__RATE:
				return rate != RATE_EDEFAULT;
			case Device_wifi_link_stat_bcast_statsPackage.LINK_INFO__FWD:
				return fwd != FWD_EDEFAULT;
			case Device_wifi_link_stat_bcast_statsPackage.LINK_INFO__REV:
				return rev != REV_EDEFAULT;
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
		result.append(" (size: ");
		result.append(size);
		result.append(", rate: ");
		result.append(rate);
		result.append(", fwd: ");
		result.append(fwd);
		result.append(", rev: ");
		result.append(rev);
		result.append(')');
		return result.toString();
	}

} //Link_infoImpl
