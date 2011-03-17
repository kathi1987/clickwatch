/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package edu.hu.clickwatch.examples.linkdist.ldp.impl;

import edu.hu.clickwatch.examples.linkdist.ldp.Link;
import edu.hu.clickwatch.examples.linkdist.ldp.LinkDistPlotPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.hu.clickwatch.examples.linkdist.ldp.impl.LinkImpl#getSrcAddr <em>Src Addr</em>}</li>
 *   <li>{@link edu.hu.clickwatch.examples.linkdist.ldp.impl.LinkImpl#getDestAddr <em>Dest Addr</em>}</li>
 *   <li>{@link edu.hu.clickwatch.examples.linkdist.ldp.impl.LinkImpl#getDistance <em>Distance</em>}</li>
 *   <li>{@link edu.hu.clickwatch.examples.linkdist.ldp.impl.LinkImpl#getRssi <em>Rssi</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinkImpl extends EObjectImpl implements Link {
	/**
	 * The default value of the '{@link #getSrcAddr() <em>Src Addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrcAddr()
	 * @generated
	 * @ordered
	 */
	protected static final String SRC_ADDR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSrcAddr() <em>Src Addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrcAddr()
	 * @generated
	 * @ordered
	 */
	protected String srcAddr = SRC_ADDR_EDEFAULT;

	/**
	 * The default value of the '{@link #getDestAddr() <em>Dest Addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestAddr()
	 * @generated
	 * @ordered
	 */
	protected static final String DEST_ADDR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDestAddr() <em>Dest Addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestAddr()
	 * @generated
	 * @ordered
	 */
	protected String destAddr = DEST_ADDR_EDEFAULT;

	/**
	 * The default value of the '{@link #getDistance() <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance()
	 * @generated
	 * @ordered
	 */
	protected static final double DISTANCE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDistance() <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance()
	 * @generated
	 * @ordered
	 */
	protected double distance = DISTANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRssi() <em>Rssi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRssi()
	 * @generated
	 * @ordered
	 */
	protected static final int RSSI_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRssi() <em>Rssi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRssi()
	 * @generated
	 * @ordered
	 */
	protected int rssi = RSSI_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LinkDistPlotPackage.Literals.LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSrcAddr() {
		return srcAddr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSrcAddr(String newSrcAddr) {
		String oldSrcAddr = srcAddr;
		srcAddr = newSrcAddr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LinkDistPlotPackage.LINK__SRC_ADDR, oldSrcAddr, srcAddr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDestAddr() {
		return destAddr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestAddr(String newDestAddr) {
		String oldDestAddr = destAddr;
		destAddr = newDestAddr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LinkDistPlotPackage.LINK__DEST_ADDR, oldDestAddr, destAddr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDistance() {
		return distance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistance(double newDistance) {
		double oldDistance = distance;
		distance = newDistance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LinkDistPlotPackage.LINK__DISTANCE, oldDistance, distance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRssi() {
		return rssi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRssi(int newRssi) {
		int oldRssi = rssi;
		rssi = newRssi;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LinkDistPlotPackage.LINK__RSSI, oldRssi, rssi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LinkDistPlotPackage.LINK__SRC_ADDR:
				return getSrcAddr();
			case LinkDistPlotPackage.LINK__DEST_ADDR:
				return getDestAddr();
			case LinkDistPlotPackage.LINK__DISTANCE:
				return getDistance();
			case LinkDistPlotPackage.LINK__RSSI:
				return getRssi();
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
			case LinkDistPlotPackage.LINK__SRC_ADDR:
				setSrcAddr((String)newValue);
				return;
			case LinkDistPlotPackage.LINK__DEST_ADDR:
				setDestAddr((String)newValue);
				return;
			case LinkDistPlotPackage.LINK__DISTANCE:
				setDistance((Double)newValue);
				return;
			case LinkDistPlotPackage.LINK__RSSI:
				setRssi((Integer)newValue);
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
			case LinkDistPlotPackage.LINK__SRC_ADDR:
				setSrcAddr(SRC_ADDR_EDEFAULT);
				return;
			case LinkDistPlotPackage.LINK__DEST_ADDR:
				setDestAddr(DEST_ADDR_EDEFAULT);
				return;
			case LinkDistPlotPackage.LINK__DISTANCE:
				setDistance(DISTANCE_EDEFAULT);
				return;
			case LinkDistPlotPackage.LINK__RSSI:
				setRssi(RSSI_EDEFAULT);
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
			case LinkDistPlotPackage.LINK__SRC_ADDR:
				return SRC_ADDR_EDEFAULT == null ? srcAddr != null : !SRC_ADDR_EDEFAULT.equals(srcAddr);
			case LinkDistPlotPackage.LINK__DEST_ADDR:
				return DEST_ADDR_EDEFAULT == null ? destAddr != null : !DEST_ADDR_EDEFAULT.equals(destAddr);
			case LinkDistPlotPackage.LINK__DISTANCE:
				return distance != DISTANCE_EDEFAULT;
			case LinkDistPlotPackage.LINK__RSSI:
				return rssi != RSSI_EDEFAULT;
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
		result.append(" (srcAddr: ");
		result.append(srcAddr);
		result.append(", destAddr: ");
		result.append(destAddr);
		result.append(", distance: ");
		result.append(distance);
		result.append(", rssi: ");
		result.append(rssi);
		result.append(')');
		return result.toString();
	}

} //LinkImpl
