/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.clientlocation.clientstats.impl;

import de.hub.clickwatch.clientlocation.clientstats.APLink;
import de.hub.clickwatch.clientlocation.clientstats.ClientStatsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AP Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.clickwatch.clientlocation.clientstats.impl.APLinkImpl#getLong <em>Long</em>}</li>
 *   <li>{@link de.hub.clickwatch.clientlocation.clientstats.impl.APLinkImpl#getLat <em>Lat</em>}</li>
 *   <li>{@link de.hub.clickwatch.clientlocation.clientstats.impl.APLinkImpl#getRssi <em>Rssi</em>}</li>
 *   <li>{@link de.hub.clickwatch.clientlocation.clientstats.impl.APLinkImpl#getMac <em>Mac</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class APLinkImpl extends EObjectImpl implements APLink {
	/**
	 * The default value of the '{@link #getLong() <em>Long</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLong()
	 * @generated
	 * @ordered
	 */
	protected static final String LONG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLong() <em>Long</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLong()
	 * @generated
	 * @ordered
	 */
	protected String long_ = LONG_EDEFAULT;

	/**
	 * The default value of the '{@link #getLat() <em>Lat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLat()
	 * @generated
	 * @ordered
	 */
	protected static final String LAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLat() <em>Lat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLat()
	 * @generated
	 * @ordered
	 */
	protected String lat = LAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRssi() <em>Rssi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRssi()
	 * @generated
	 * @ordered
	 */
	protected static final int RSSI_EDEFAULT = -1;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected APLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClientStatsPackage.Literals.AP_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLong() {
		return long_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLong(String newLong) {
		String oldLong = long_;
		long_ = newLong;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClientStatsPackage.AP_LINK__LONG, oldLong, long_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLat() {
		return lat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLat(String newLat) {
		String oldLat = lat;
		lat = newLat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClientStatsPackage.AP_LINK__LAT, oldLat, lat));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ClientStatsPackage.AP_LINK__RSSI, oldRssi, rssi));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ClientStatsPackage.AP_LINK__MAC, oldMac, mac));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClientStatsPackage.AP_LINK__LONG:
				return getLong();
			case ClientStatsPackage.AP_LINK__LAT:
				return getLat();
			case ClientStatsPackage.AP_LINK__RSSI:
				return getRssi();
			case ClientStatsPackage.AP_LINK__MAC:
				return getMac();
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
			case ClientStatsPackage.AP_LINK__LONG:
				setLong((String)newValue);
				return;
			case ClientStatsPackage.AP_LINK__LAT:
				setLat((String)newValue);
				return;
			case ClientStatsPackage.AP_LINK__RSSI:
				setRssi((Integer)newValue);
				return;
			case ClientStatsPackage.AP_LINK__MAC:
				setMac((String)newValue);
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
			case ClientStatsPackage.AP_LINK__LONG:
				setLong(LONG_EDEFAULT);
				return;
			case ClientStatsPackage.AP_LINK__LAT:
				setLat(LAT_EDEFAULT);
				return;
			case ClientStatsPackage.AP_LINK__RSSI:
				setRssi(RSSI_EDEFAULT);
				return;
			case ClientStatsPackage.AP_LINK__MAC:
				setMac(MAC_EDEFAULT);
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
			case ClientStatsPackage.AP_LINK__LONG:
				return LONG_EDEFAULT == null ? long_ != null : !LONG_EDEFAULT.equals(long_);
			case ClientStatsPackage.AP_LINK__LAT:
				return LAT_EDEFAULT == null ? lat != null : !LAT_EDEFAULT.equals(lat);
			case ClientStatsPackage.AP_LINK__RSSI:
				return rssi != RSSI_EDEFAULT;
			case ClientStatsPackage.AP_LINK__MAC:
				return MAC_EDEFAULT == null ? mac != null : !MAC_EDEFAULT.equals(mac);
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
		result.append(" (long: ");
		result.append(long_);
		result.append(", lat: ");
		result.append(lat);
		result.append(", rssi: ");
		result.append(rssi);
		result.append(", mac: ");
		result.append(mac);
		result.append(')');
		return result.toString();
	}

} //APLinkImpl
