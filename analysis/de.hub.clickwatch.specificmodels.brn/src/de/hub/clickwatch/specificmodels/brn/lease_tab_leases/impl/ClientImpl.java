/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.lease_tab_leases.impl;

import de.hub.clickwatch.specificmodels.brn.lease_tab_leases.Client;
import de.hub.clickwatch.specificmodels.brn.lease_tab_leases.Dhcpleases;
import de.hub.clickwatch.specificmodels.brn.lease_tab_leases.Lease_tab_leasesPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Client</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.lease_tab_leases.impl.ClientImpl#getEContainer_client <em>EContainer client</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.lease_tab_leases.impl.ClientImpl#getIp <em>Ip</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.lease_tab_leases.impl.ClientImpl#getMac <em>Mac</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.lease_tab_leases.impl.ClientImpl#getStart <em>Start</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.lease_tab_leases.impl.ClientImpl#getEnd <em>End</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.lease_tab_leases.impl.ClientImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.lease_tab_leases.impl.ClientImpl#getTime_left <em>Time left</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClientImpl extends EObjectImpl implements Client {
	/**
	 * The default value of the '{@link #getIp() <em>Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIp()
	 * @generated
	 * @ordered
	 */
	protected static final String IP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIp() <em>Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIp()
	 * @generated
	 * @ordered
	 */
	protected String ip = IP_EDEFAULT;

	/**
	 * The default value of the '{@link #getMac() <em>Mac</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMac()
	 * @generated
	 * @ordered
	 */
	protected static final String MAC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMac() <em>Mac</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMac()
	 * @generated
	 * @ordered
	 */
	protected String mac = MAC_EDEFAULT;

	/**
	 * The default value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected static final int START_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected int start = START_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected static final int END_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected int end = END_EDEFAULT;

	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final int DURATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected int duration = DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTime_left() <em>Time left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime_left()
	 * @generated
	 * @ordered
	 */
	protected static final int TIME_LEFT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTime_left() <em>Time left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime_left()
	 * @generated
	 * @ordered
	 */
	protected int time_left = TIME_LEFT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Lease_tab_leasesPackage.Literals.CLIENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dhcpleases getEContainer_client() {
		if (eContainerFeatureID() != Lease_tab_leasesPackage.CLIENT__ECONTAINER_CLIENT) return null;
		return (Dhcpleases)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEContainer_client(Dhcpleases newEContainer_client, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEContainer_client, Lease_tab_leasesPackage.CLIENT__ECONTAINER_CLIENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEContainer_client(Dhcpleases newEContainer_client) {
		if (newEContainer_client != eInternalContainer() || (eContainerFeatureID() != Lease_tab_leasesPackage.CLIENT__ECONTAINER_CLIENT && newEContainer_client != null)) {
			if (EcoreUtil.isAncestor(this, newEContainer_client))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEContainer_client != null)
				msgs = ((InternalEObject)newEContainer_client).eInverseAdd(this, Lease_tab_leasesPackage.DHCPLEASES__CLIENT, Dhcpleases.class, msgs);
			msgs = basicSetEContainer_client(newEContainer_client, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lease_tab_leasesPackage.CLIENT__ECONTAINER_CLIENT, newEContainer_client, newEContainer_client));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIp() {
		return ip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIp(String newIp) {
		String oldIp = ip;
		ip = newIp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lease_tab_leasesPackage.CLIENT__IP, oldIp, ip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMac() {
		return mac;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMac(String newMac) {
		String oldMac = mac;
		mac = newMac;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lease_tab_leasesPackage.CLIENT__MAC, oldMac, mac));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(int newStart) {
		int oldStart = start;
		start = newStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lease_tab_leasesPackage.CLIENT__START, oldStart, start));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd(int newEnd) {
		int oldEnd = end;
		end = newEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lease_tab_leasesPackage.CLIENT__END, oldEnd, end));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(int newDuration) {
		int oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lease_tab_leasesPackage.CLIENT__DURATION, oldDuration, duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTime_left() {
		return time_left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime_left(int newTime_left) {
		int oldTime_left = time_left;
		time_left = newTime_left;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lease_tab_leasesPackage.CLIENT__TIME_LEFT, oldTime_left, time_left));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Lease_tab_leasesPackage.CLIENT__ECONTAINER_CLIENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEContainer_client((Dhcpleases)otherEnd, msgs);
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
			case Lease_tab_leasesPackage.CLIENT__ECONTAINER_CLIENT:
				return basicSetEContainer_client(null, msgs);
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
			case Lease_tab_leasesPackage.CLIENT__ECONTAINER_CLIENT:
				return eInternalContainer().eInverseRemove(this, Lease_tab_leasesPackage.DHCPLEASES__CLIENT, Dhcpleases.class, msgs);
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
			case Lease_tab_leasesPackage.CLIENT__ECONTAINER_CLIENT:
				return getEContainer_client();
			case Lease_tab_leasesPackage.CLIENT__IP:
				return getIp();
			case Lease_tab_leasesPackage.CLIENT__MAC:
				return getMac();
			case Lease_tab_leasesPackage.CLIENT__START:
				return getStart();
			case Lease_tab_leasesPackage.CLIENT__END:
				return getEnd();
			case Lease_tab_leasesPackage.CLIENT__DURATION:
				return getDuration();
			case Lease_tab_leasesPackage.CLIENT__TIME_LEFT:
				return getTime_left();
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
			case Lease_tab_leasesPackage.CLIENT__ECONTAINER_CLIENT:
				setEContainer_client((Dhcpleases)newValue);
				return;
			case Lease_tab_leasesPackage.CLIENT__IP:
				setIp((String)newValue);
				return;
			case Lease_tab_leasesPackage.CLIENT__MAC:
				setMac((String)newValue);
				return;
			case Lease_tab_leasesPackage.CLIENT__START:
				setStart((Integer)newValue);
				return;
			case Lease_tab_leasesPackage.CLIENT__END:
				setEnd((Integer)newValue);
				return;
			case Lease_tab_leasesPackage.CLIENT__DURATION:
				setDuration((Integer)newValue);
				return;
			case Lease_tab_leasesPackage.CLIENT__TIME_LEFT:
				setTime_left((Integer)newValue);
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
			case Lease_tab_leasesPackage.CLIENT__ECONTAINER_CLIENT:
				setEContainer_client((Dhcpleases)null);
				return;
			case Lease_tab_leasesPackage.CLIENT__IP:
				setIp(IP_EDEFAULT);
				return;
			case Lease_tab_leasesPackage.CLIENT__MAC:
				setMac(MAC_EDEFAULT);
				return;
			case Lease_tab_leasesPackage.CLIENT__START:
				setStart(START_EDEFAULT);
				return;
			case Lease_tab_leasesPackage.CLIENT__END:
				setEnd(END_EDEFAULT);
				return;
			case Lease_tab_leasesPackage.CLIENT__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case Lease_tab_leasesPackage.CLIENT__TIME_LEFT:
				setTime_left(TIME_LEFT_EDEFAULT);
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
			case Lease_tab_leasesPackage.CLIENT__ECONTAINER_CLIENT:
				return getEContainer_client() != null;
			case Lease_tab_leasesPackage.CLIENT__IP:
				return IP_EDEFAULT == null ? ip != null : !IP_EDEFAULT.equals(ip);
			case Lease_tab_leasesPackage.CLIENT__MAC:
				return MAC_EDEFAULT == null ? mac != null : !MAC_EDEFAULT.equals(mac);
			case Lease_tab_leasesPackage.CLIENT__START:
				return start != START_EDEFAULT;
			case Lease_tab_leasesPackage.CLIENT__END:
				return end != END_EDEFAULT;
			case Lease_tab_leasesPackage.CLIENT__DURATION:
				return duration != DURATION_EDEFAULT;
			case Lease_tab_leasesPackage.CLIENT__TIME_LEFT:
				return time_left != TIME_LEFT_EDEFAULT;
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
		result.append(" (ip: ");
		result.append(ip);
		result.append(", mac: ");
		result.append(mac);
		result.append(", start: ");
		result.append(start);
		result.append(", end: ");
		result.append(end);
		result.append(", duration: ");
		result.append(duration);
		result.append(", time_left: ");
		result.append(time_left);
		result.append(')');
		return result.toString();
	}

} //ClientImpl
