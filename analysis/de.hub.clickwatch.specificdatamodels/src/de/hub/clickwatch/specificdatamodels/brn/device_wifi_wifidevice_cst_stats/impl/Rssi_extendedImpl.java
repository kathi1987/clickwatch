/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.impl;

import de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Ctl;
import de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage;
import de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Ext;
import de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Nb;
import de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Rssi_extended;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rssi extended</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.impl.Rssi_extendedImpl#getEContainer_rssi_extended <em>EContainer rssi extended</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.impl.Rssi_extendedImpl#getText <em>Text</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.impl.Rssi_extendedImpl#getCtl <em>Ctl</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.impl.Rssi_extendedImpl#getExt <em>Ext</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Rssi_extendedImpl extends EObjectImpl implements Rssi_extended {
	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected EList<String> text;

	/**
	 * The cached value of the '{@link #getCtl() <em>Ctl</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCtl()
	 * @generated
	 * @ordered
	 */
	protected Ctl ctl;

	/**
	 * The cached value of the '{@link #getExt() <em>Ext</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExt()
	 * @generated
	 * @ordered
	 */
	protected Ext ext;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Rssi_extendedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Device_wifi_wifidevice_cst_statsPackage.Literals.RSSI_EXTENDED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Nb getEContainer_rssi_extended() {
		if (eContainerFeatureID() != Device_wifi_wifidevice_cst_statsPackage.RSSI_EXTENDED__ECONTAINER_RSSI_EXTENDED) return null;
		return (Nb)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEContainer_rssi_extended(Nb newEContainer_rssi_extended, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEContainer_rssi_extended, Device_wifi_wifidevice_cst_statsPackage.RSSI_EXTENDED__ECONTAINER_RSSI_EXTENDED, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEContainer_rssi_extended(Nb newEContainer_rssi_extended) {
		if (newEContainer_rssi_extended != eInternalContainer() || (eContainerFeatureID() != Device_wifi_wifidevice_cst_statsPackage.RSSI_EXTENDED__ECONTAINER_RSSI_EXTENDED && newEContainer_rssi_extended != null)) {
			if (EcoreUtil.isAncestor(this, newEContainer_rssi_extended))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEContainer_rssi_extended != null)
				msgs = ((InternalEObject)newEContainer_rssi_extended).eInverseAdd(this, Device_wifi_wifidevice_cst_statsPackage.NB__RSSI_EXTENDED, Nb.class, msgs);
			msgs = basicSetEContainer_rssi_extended(newEContainer_rssi_extended, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_cst_statsPackage.RSSI_EXTENDED__ECONTAINER_RSSI_EXTENDED, newEContainer_rssi_extended, newEContainer_rssi_extended));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getText() {
		if (text == null) {
			text = new EDataTypeEList<String>(String.class, this, Device_wifi_wifidevice_cst_statsPackage.RSSI_EXTENDED__TEXT);
		}
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ctl getCtl() {
		return ctl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCtl(Ctl newCtl, NotificationChain msgs) {
		Ctl oldCtl = ctl;
		ctl = newCtl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_cst_statsPackage.RSSI_EXTENDED__CTL, oldCtl, newCtl);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCtl(Ctl newCtl) {
		if (newCtl != ctl) {
			NotificationChain msgs = null;
			if (ctl != null)
				msgs = ((InternalEObject)ctl).eInverseRemove(this, Device_wifi_wifidevice_cst_statsPackage.CTL__ECONTAINER_CTL, Ctl.class, msgs);
			if (newCtl != null)
				msgs = ((InternalEObject)newCtl).eInverseAdd(this, Device_wifi_wifidevice_cst_statsPackage.CTL__ECONTAINER_CTL, Ctl.class, msgs);
			msgs = basicSetCtl(newCtl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_cst_statsPackage.RSSI_EXTENDED__CTL, newCtl, newCtl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ext getExt() {
		return ext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExt(Ext newExt, NotificationChain msgs) {
		Ext oldExt = ext;
		ext = newExt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_cst_statsPackage.RSSI_EXTENDED__EXT, oldExt, newExt);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExt(Ext newExt) {
		if (newExt != ext) {
			NotificationChain msgs = null;
			if (ext != null)
				msgs = ((InternalEObject)ext).eInverseRemove(this, Device_wifi_wifidevice_cst_statsPackage.EXT__ECONTAINER_EXT, Ext.class, msgs);
			if (newExt != null)
				msgs = ((InternalEObject)newExt).eInverseAdd(this, Device_wifi_wifidevice_cst_statsPackage.EXT__ECONTAINER_EXT, Ext.class, msgs);
			msgs = basicSetExt(newExt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_cst_statsPackage.RSSI_EXTENDED__EXT, newExt, newExt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Device_wifi_wifidevice_cst_statsPackage.RSSI_EXTENDED__ECONTAINER_RSSI_EXTENDED:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEContainer_rssi_extended((Nb)otherEnd, msgs);
			case Device_wifi_wifidevice_cst_statsPackage.RSSI_EXTENDED__CTL:
				if (ctl != null)
					msgs = ((InternalEObject)ctl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Device_wifi_wifidevice_cst_statsPackage.RSSI_EXTENDED__CTL, null, msgs);
				return basicSetCtl((Ctl)otherEnd, msgs);
			case Device_wifi_wifidevice_cst_statsPackage.RSSI_EXTENDED__EXT:
				if (ext != null)
					msgs = ((InternalEObject)ext).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Device_wifi_wifidevice_cst_statsPackage.RSSI_EXTENDED__EXT, null, msgs);
				return basicSetExt((Ext)otherEnd, msgs);
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
			case Device_wifi_wifidevice_cst_statsPackage.RSSI_EXTENDED__ECONTAINER_RSSI_EXTENDED:
				return basicSetEContainer_rssi_extended(null, msgs);
			case Device_wifi_wifidevice_cst_statsPackage.RSSI_EXTENDED__CTL:
				return basicSetCtl(null, msgs);
			case Device_wifi_wifidevice_cst_statsPackage.RSSI_EXTENDED__EXT:
				return basicSetExt(null, msgs);
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
			case Device_wifi_wifidevice_cst_statsPackage.RSSI_EXTENDED__ECONTAINER_RSSI_EXTENDED:
				return eInternalContainer().eInverseRemove(this, Device_wifi_wifidevice_cst_statsPackage.NB__RSSI_EXTENDED, Nb.class, msgs);
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
			case Device_wifi_wifidevice_cst_statsPackage.RSSI_EXTENDED__ECONTAINER_RSSI_EXTENDED:
				return getEContainer_rssi_extended();
			case Device_wifi_wifidevice_cst_statsPackage.RSSI_EXTENDED__TEXT:
				return getText();
			case Device_wifi_wifidevice_cst_statsPackage.RSSI_EXTENDED__CTL:
				return getCtl();
			case Device_wifi_wifidevice_cst_statsPackage.RSSI_EXTENDED__EXT:
				return getExt();
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
			case Device_wifi_wifidevice_cst_statsPackage.RSSI_EXTENDED__ECONTAINER_RSSI_EXTENDED:
				setEContainer_rssi_extended((Nb)newValue);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.RSSI_EXTENDED__TEXT:
				getText().clear();
				getText().addAll((Collection<? extends String>)newValue);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.RSSI_EXTENDED__CTL:
				setCtl((Ctl)newValue);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.RSSI_EXTENDED__EXT:
				setExt((Ext)newValue);
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
			case Device_wifi_wifidevice_cst_statsPackage.RSSI_EXTENDED__ECONTAINER_RSSI_EXTENDED:
				setEContainer_rssi_extended((Nb)null);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.RSSI_EXTENDED__TEXT:
				getText().clear();
				return;
			case Device_wifi_wifidevice_cst_statsPackage.RSSI_EXTENDED__CTL:
				setCtl((Ctl)null);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.RSSI_EXTENDED__EXT:
				setExt((Ext)null);
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
			case Device_wifi_wifidevice_cst_statsPackage.RSSI_EXTENDED__ECONTAINER_RSSI_EXTENDED:
				return getEContainer_rssi_extended() != null;
			case Device_wifi_wifidevice_cst_statsPackage.RSSI_EXTENDED__TEXT:
				return text != null && !text.isEmpty();
			case Device_wifi_wifidevice_cst_statsPackage.RSSI_EXTENDED__CTL:
				return ctl != null;
			case Device_wifi_wifidevice_cst_statsPackage.RSSI_EXTENDED__EXT:
				return ext != null;
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
		result.append(" (text: ");
		result.append(text);
		result.append(')');
		return result.toString();
	}

} //Rssi_extendedImpl
