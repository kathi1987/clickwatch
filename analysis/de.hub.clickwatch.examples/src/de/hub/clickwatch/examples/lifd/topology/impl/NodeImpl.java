/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.examples.lifd.topology.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.hub.clickwatch.examples.lifd.topology.Gps;
import de.hub.clickwatch.examples.lifd.topology.Link;
import de.hub.clickwatch.examples.lifd.topology.Node;
import de.hub.clickwatch.examples.lifd.topology.TopologyPackage;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.clickwatch.examples.lifd.topology.impl.NodeImpl#getIp <em>Ip</em>}</li>
 *   <li>{@link de.hub.clickwatch.examples.lifd.topology.impl.NodeImpl#getMac <em>Mac</em>}</li>
 *   <li>{@link de.hub.clickwatch.examples.lifd.topology.impl.NodeImpl#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link de.hub.clickwatch.examples.lifd.topology.impl.NodeImpl#getIncomming <em>Incomming</em>}</li>
 *   <li>{@link de.hub.clickwatch.examples.lifd.topology.impl.NodeImpl#getGps <em>Gps</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodeImpl extends EObjectImpl implements Node {
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
	 * The cached value of the '{@link #getOutgoing() <em>Outgoing</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoing()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> outgoing;

	/**
	 * The cached value of the '{@link #getIncomming() <em>Incomming</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomming()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> incomming;

	/**
	 * The cached value of the '{@link #getGps() <em>Gps</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGps()
	 * @generated
	 * @ordered
	 */
	protected Gps gps;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TopologyPackage.Literals.NODE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TopologyPackage.NODE__IP, oldIp, ip));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TopologyPackage.NODE__MAC, oldMac, mac));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Link> getOutgoing() {
		if (outgoing == null) {
			outgoing = new EObjectWithInverseResolvingEList<Link>(Link.class, this, TopologyPackage.NODE__OUTGOING, TopologyPackage.LINK__SOURCE);
		}
		return outgoing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Link> getIncomming() {
		if (incomming == null) {
			incomming = new EObjectWithInverseResolvingEList<Link>(Link.class, this, TopologyPackage.NODE__INCOMMING, TopologyPackage.LINK__TARGET);
		}
		return incomming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gps getGps() {
		return gps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGps(Gps newGps, NotificationChain msgs) {
		Gps oldGps = gps;
		gps = newGps;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TopologyPackage.NODE__GPS, oldGps, newGps);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGps(Gps newGps) {
		if (newGps != gps) {
			NotificationChain msgs = null;
			if (gps != null)
				msgs = ((InternalEObject)gps).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TopologyPackage.NODE__GPS, null, msgs);
			if (newGps != null)
				msgs = ((InternalEObject)newGps).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TopologyPackage.NODE__GPS, null, msgs);
			msgs = basicSetGps(newGps, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TopologyPackage.NODE__GPS, newGps, newGps));
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
			case TopologyPackage.NODE__OUTGOING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoing()).basicAdd(otherEnd, msgs);
			case TopologyPackage.NODE__INCOMMING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomming()).basicAdd(otherEnd, msgs);
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
			case TopologyPackage.NODE__OUTGOING:
				return ((InternalEList<?>)getOutgoing()).basicRemove(otherEnd, msgs);
			case TopologyPackage.NODE__INCOMMING:
				return ((InternalEList<?>)getIncomming()).basicRemove(otherEnd, msgs);
			case TopologyPackage.NODE__GPS:
				return basicSetGps(null, msgs);
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
			case TopologyPackage.NODE__IP:
				return getIp();
			case TopologyPackage.NODE__MAC:
				return getMac();
			case TopologyPackage.NODE__OUTGOING:
				return getOutgoing();
			case TopologyPackage.NODE__INCOMMING:
				return getIncomming();
			case TopologyPackage.NODE__GPS:
				return getGps();
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
			case TopologyPackage.NODE__IP:
				setIp((String)newValue);
				return;
			case TopologyPackage.NODE__MAC:
				setMac((String)newValue);
				return;
			case TopologyPackage.NODE__OUTGOING:
				getOutgoing().clear();
				getOutgoing().addAll((Collection<? extends Link>)newValue);
				return;
			case TopologyPackage.NODE__INCOMMING:
				getIncomming().clear();
				getIncomming().addAll((Collection<? extends Link>)newValue);
				return;
			case TopologyPackage.NODE__GPS:
				setGps((Gps)newValue);
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
			case TopologyPackage.NODE__IP:
				setIp(IP_EDEFAULT);
				return;
			case TopologyPackage.NODE__MAC:
				setMac(MAC_EDEFAULT);
				return;
			case TopologyPackage.NODE__OUTGOING:
				getOutgoing().clear();
				return;
			case TopologyPackage.NODE__INCOMMING:
				getIncomming().clear();
				return;
			case TopologyPackage.NODE__GPS:
				setGps((Gps)null);
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
			case TopologyPackage.NODE__IP:
				return IP_EDEFAULT == null ? ip != null : !IP_EDEFAULT.equals(ip);
			case TopologyPackage.NODE__MAC:
				return MAC_EDEFAULT == null ? mac != null : !MAC_EDEFAULT.equals(mac);
			case TopologyPackage.NODE__OUTGOING:
				return outgoing != null && !outgoing.isEmpty();
			case TopologyPackage.NODE__INCOMMING:
				return incomming != null && !incomming.isEmpty();
			case TopologyPackage.NODE__GPS:
				return gps != null;
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
		result.append(')');
		return result.toString();
	}

} //NodeImpl
