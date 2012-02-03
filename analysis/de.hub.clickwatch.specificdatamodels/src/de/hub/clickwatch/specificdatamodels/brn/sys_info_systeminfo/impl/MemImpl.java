/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificdatamodels.brn.sys_info_systeminfo.impl;

import de.hub.clickwatch.specificdatamodels.brn.sys_info_systeminfo.Mem;
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
 * An implementation of the model object '<em><b>Mem</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.sys_info_systeminfo.impl.MemImpl#getEContainer_mem <em>EContainer mem</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.sys_info_systeminfo.impl.MemImpl#getTotal <em>Total</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.sys_info_systeminfo.impl.MemImpl#getUsed <em>Used</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.sys_info_systeminfo.impl.MemImpl#getCached <em>Cached</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.sys_info_systeminfo.impl.MemImpl#getBuffers <em>Buffers</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.sys_info_systeminfo.impl.MemImpl#getNFS_Unstable <em>NFS Unstable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MemImpl extends EObjectImpl implements Mem {
	/**
	 * The default value of the '{@link #getTotal() <em>Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotal()
	 * @generated
	 * @ordered
	 */
	protected static final int TOTAL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTotal() <em>Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotal()
	 * @generated
	 * @ordered
	 */
	protected int total = TOTAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getUsed() <em>Used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsed()
	 * @generated
	 * @ordered
	 */
	protected static final int USED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getUsed() <em>Used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsed()
	 * @generated
	 * @ordered
	 */
	protected int used = USED_EDEFAULT;

	/**
	 * The default value of the '{@link #getCached() <em>Cached</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCached()
	 * @generated
	 * @ordered
	 */
	protected static final int CACHED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCached() <em>Cached</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCached()
	 * @generated
	 * @ordered
	 */
	protected int cached = CACHED_EDEFAULT;

	/**
	 * The default value of the '{@link #getBuffers() <em>Buffers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuffers()
	 * @generated
	 * @ordered
	 */
	protected static final int BUFFERS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBuffers() <em>Buffers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuffers()
	 * @generated
	 * @ordered
	 */
	protected int buffers = BUFFERS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNFS_Unstable() <em>NFS Unstable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNFS_Unstable()
	 * @generated
	 * @ordered
	 */
	protected static final int NFS_UNSTABLE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNFS_Unstable() <em>NFS Unstable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNFS_Unstable()
	 * @generated
	 * @ordered
	 */
	protected int nFS_Unstable = NFS_UNSTABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Sys_info_systeminfoPackage.Literals.MEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.hub.clickwatch.specificdatamodels.brn.sys_info_systeminfo.System getEContainer_mem() {
		if (eContainerFeatureID() != Sys_info_systeminfoPackage.MEM__ECONTAINER_MEM) return null;
		return (de.hub.clickwatch.specificdatamodels.brn.sys_info_systeminfo.System)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEContainer_mem(de.hub.clickwatch.specificdatamodels.brn.sys_info_systeminfo.System newEContainer_mem, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEContainer_mem, Sys_info_systeminfoPackage.MEM__ECONTAINER_MEM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEContainer_mem(de.hub.clickwatch.specificdatamodels.brn.sys_info_systeminfo.System newEContainer_mem) {
		if (newEContainer_mem != eInternalContainer() || (eContainerFeatureID() != Sys_info_systeminfoPackage.MEM__ECONTAINER_MEM && newEContainer_mem != null)) {
			if (EcoreUtil.isAncestor(this, newEContainer_mem))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEContainer_mem != null)
				msgs = ((InternalEObject)newEContainer_mem).eInverseAdd(this, Sys_info_systeminfoPackage.SYSTEM__MEM, de.hub.clickwatch.specificdatamodels.brn.sys_info_systeminfo.System.class, msgs);
			msgs = basicSetEContainer_mem(newEContainer_mem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Sys_info_systeminfoPackage.MEM__ECONTAINER_MEM, newEContainer_mem, newEContainer_mem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTotal() {
		return total;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotal(int newTotal) {
		int oldTotal = total;
		total = newTotal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Sys_info_systeminfoPackage.MEM__TOTAL, oldTotal, total));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getUsed() {
		return used;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsed(int newUsed) {
		int oldUsed = used;
		used = newUsed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Sys_info_systeminfoPackage.MEM__USED, oldUsed, used));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCached() {
		return cached;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCached(int newCached) {
		int oldCached = cached;
		cached = newCached;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Sys_info_systeminfoPackage.MEM__CACHED, oldCached, cached));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBuffers() {
		return buffers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBuffers(int newBuffers) {
		int oldBuffers = buffers;
		buffers = newBuffers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Sys_info_systeminfoPackage.MEM__BUFFERS, oldBuffers, buffers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNFS_Unstable() {
		return nFS_Unstable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNFS_Unstable(int newNFS_Unstable) {
		int oldNFS_Unstable = nFS_Unstable;
		nFS_Unstable = newNFS_Unstable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Sys_info_systeminfoPackage.MEM__NFS_UNSTABLE, oldNFS_Unstable, nFS_Unstable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Sys_info_systeminfoPackage.MEM__ECONTAINER_MEM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEContainer_mem((de.hub.clickwatch.specificdatamodels.brn.sys_info_systeminfo.System)otherEnd, msgs);
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
			case Sys_info_systeminfoPackage.MEM__ECONTAINER_MEM:
				return basicSetEContainer_mem(null, msgs);
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
			case Sys_info_systeminfoPackage.MEM__ECONTAINER_MEM:
				return eInternalContainer().eInverseRemove(this, Sys_info_systeminfoPackage.SYSTEM__MEM, de.hub.clickwatch.specificdatamodels.brn.sys_info_systeminfo.System.class, msgs);
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
			case Sys_info_systeminfoPackage.MEM__ECONTAINER_MEM:
				return getEContainer_mem();
			case Sys_info_systeminfoPackage.MEM__TOTAL:
				return getTotal();
			case Sys_info_systeminfoPackage.MEM__USED:
				return getUsed();
			case Sys_info_systeminfoPackage.MEM__CACHED:
				return getCached();
			case Sys_info_systeminfoPackage.MEM__BUFFERS:
				return getBuffers();
			case Sys_info_systeminfoPackage.MEM__NFS_UNSTABLE:
				return getNFS_Unstable();
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
			case Sys_info_systeminfoPackage.MEM__ECONTAINER_MEM:
				setEContainer_mem((de.hub.clickwatch.specificdatamodels.brn.sys_info_systeminfo.System)newValue);
				return;
			case Sys_info_systeminfoPackage.MEM__TOTAL:
				setTotal((Integer)newValue);
				return;
			case Sys_info_systeminfoPackage.MEM__USED:
				setUsed((Integer)newValue);
				return;
			case Sys_info_systeminfoPackage.MEM__CACHED:
				setCached((Integer)newValue);
				return;
			case Sys_info_systeminfoPackage.MEM__BUFFERS:
				setBuffers((Integer)newValue);
				return;
			case Sys_info_systeminfoPackage.MEM__NFS_UNSTABLE:
				setNFS_Unstable((Integer)newValue);
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
			case Sys_info_systeminfoPackage.MEM__ECONTAINER_MEM:
				setEContainer_mem((de.hub.clickwatch.specificdatamodels.brn.sys_info_systeminfo.System)null);
				return;
			case Sys_info_systeminfoPackage.MEM__TOTAL:
				setTotal(TOTAL_EDEFAULT);
				return;
			case Sys_info_systeminfoPackage.MEM__USED:
				setUsed(USED_EDEFAULT);
				return;
			case Sys_info_systeminfoPackage.MEM__CACHED:
				setCached(CACHED_EDEFAULT);
				return;
			case Sys_info_systeminfoPackage.MEM__BUFFERS:
				setBuffers(BUFFERS_EDEFAULT);
				return;
			case Sys_info_systeminfoPackage.MEM__NFS_UNSTABLE:
				setNFS_Unstable(NFS_UNSTABLE_EDEFAULT);
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
			case Sys_info_systeminfoPackage.MEM__ECONTAINER_MEM:
				return getEContainer_mem() != null;
			case Sys_info_systeminfoPackage.MEM__TOTAL:
				return total != TOTAL_EDEFAULT;
			case Sys_info_systeminfoPackage.MEM__USED:
				return used != USED_EDEFAULT;
			case Sys_info_systeminfoPackage.MEM__CACHED:
				return cached != CACHED_EDEFAULT;
			case Sys_info_systeminfoPackage.MEM__BUFFERS:
				return buffers != BUFFERS_EDEFAULT;
			case Sys_info_systeminfoPackage.MEM__NFS_UNSTABLE:
				return nFS_Unstable != NFS_UNSTABLE_EDEFAULT;
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
		result.append(" (total: ");
		result.append(total);
		result.append(", used: ");
		result.append(used);
		result.append(", cached: ");
		result.append(cached);
		result.append(", buffers: ");
		result.append(buffers);
		result.append(", nFS_Unstable: ");
		result.append(nFS_Unstable);
		result.append(')');
		return result.toString();
	}

} //MemImpl
