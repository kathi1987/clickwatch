/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_sc_systemchannel.impl;

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

import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_sc_systemchannel.Device;
import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_sc_systemchannel.Device_wifi_wifidevice_sc_systemchannelPackage;
import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_sc_systemchannel.Setchannel;
import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_sc_systemchannel.Systemchannel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Setchannel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_sc_systemchannel.impl.SetchannelImpl#getEContainer_setchannel <em>EContainer setchannel</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_sc_systemchannel.impl.SetchannelImpl#getText <em>Text</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_sc_systemchannel.impl.SetchannelImpl#getDevice <em>Device</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_sc_systemchannel.impl.SetchannelImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_sc_systemchannel.impl.SetchannelImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_sc_systemchannel.impl.SetchannelImpl#getChannel <em>Channel</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SetchannelImpl extends EObjectImpl implements Setchannel {
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
	 * The cached value of the '{@link #getDevice() <em>Device</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevice()
	 * @generated
	 * @ordered
	 */
	protected Device device;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getChannel() <em>Channel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannel()
	 * @generated
	 * @ordered
	 */
	protected static final int CHANNEL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getChannel() <em>Channel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannel()
	 * @generated
	 * @ordered
	 */
	protected int channel = CHANNEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetchannelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Device_wifi_wifidevice_sc_systemchannelPackage.Literals.SETCHANNEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Systemchannel getEContainer_setchannel() {
		if (eContainerFeatureID() != Device_wifi_wifidevice_sc_systemchannelPackage.SETCHANNEL__ECONTAINER_SETCHANNEL) return null;
		return (Systemchannel)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEContainer_setchannel(Systemchannel newEContainer_setchannel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEContainer_setchannel, Device_wifi_wifidevice_sc_systemchannelPackage.SETCHANNEL__ECONTAINER_SETCHANNEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEContainer_setchannel(Systemchannel newEContainer_setchannel) {
		if (newEContainer_setchannel != eInternalContainer() || (eContainerFeatureID() != Device_wifi_wifidevice_sc_systemchannelPackage.SETCHANNEL__ECONTAINER_SETCHANNEL && newEContainer_setchannel != null)) {
			if (EcoreUtil.isAncestor(this, newEContainer_setchannel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEContainer_setchannel != null)
				msgs = ((InternalEObject)newEContainer_setchannel).eInverseAdd(this, Device_wifi_wifidevice_sc_systemchannelPackage.SYSTEMCHANNEL__SETCHANNEL, Systemchannel.class, msgs);
			msgs = basicSetEContainer_setchannel(newEContainer_setchannel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_sc_systemchannelPackage.SETCHANNEL__ECONTAINER_SETCHANNEL, newEContainer_setchannel, newEContainer_setchannel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getText() {
		if (text == null) {
			text = new EDataTypeEList<String>(String.class, this, Device_wifi_wifidevice_sc_systemchannelPackage.SETCHANNEL__TEXT);
		}
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Device getDevice() {
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDevice(Device newDevice, NotificationChain msgs) {
		Device oldDevice = device;
		device = newDevice;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_sc_systemchannelPackage.SETCHANNEL__DEVICE, oldDevice, newDevice);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDevice(Device newDevice) {
		if (newDevice != device) {
			NotificationChain msgs = null;
			if (device != null)
				msgs = ((InternalEObject)device).eInverseRemove(this, Device_wifi_wifidevice_sc_systemchannelPackage.DEVICE__ECONTAINER_DEVICE, Device.class, msgs);
			if (newDevice != null)
				msgs = ((InternalEObject)newDevice).eInverseAdd(this, Device_wifi_wifidevice_sc_systemchannelPackage.DEVICE__ECONTAINER_DEVICE, Device.class, msgs);
			msgs = basicSetDevice(newDevice, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_sc_systemchannelPackage.SETCHANNEL__DEVICE, newDevice, newDevice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_sc_systemchannelPackage.SETCHANNEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_sc_systemchannelPackage.SETCHANNEL__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getChannel() {
		return channel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChannel(int newChannel) {
		int oldChannel = channel;
		channel = newChannel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_sc_systemchannelPackage.SETCHANNEL__CHANNEL, oldChannel, channel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Device_wifi_wifidevice_sc_systemchannelPackage.SETCHANNEL__ECONTAINER_SETCHANNEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEContainer_setchannel((Systemchannel)otherEnd, msgs);
			case Device_wifi_wifidevice_sc_systemchannelPackage.SETCHANNEL__DEVICE:
				if (device != null)
					msgs = ((InternalEObject)device).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Device_wifi_wifidevice_sc_systemchannelPackage.SETCHANNEL__DEVICE, null, msgs);
				return basicSetDevice((Device)otherEnd, msgs);
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
			case Device_wifi_wifidevice_sc_systemchannelPackage.SETCHANNEL__ECONTAINER_SETCHANNEL:
				return basicSetEContainer_setchannel(null, msgs);
			case Device_wifi_wifidevice_sc_systemchannelPackage.SETCHANNEL__DEVICE:
				return basicSetDevice(null, msgs);
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
			case Device_wifi_wifidevice_sc_systemchannelPackage.SETCHANNEL__ECONTAINER_SETCHANNEL:
				return eInternalContainer().eInverseRemove(this, Device_wifi_wifidevice_sc_systemchannelPackage.SYSTEMCHANNEL__SETCHANNEL, Systemchannel.class, msgs);
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
			case Device_wifi_wifidevice_sc_systemchannelPackage.SETCHANNEL__ECONTAINER_SETCHANNEL:
				return getEContainer_setchannel();
			case Device_wifi_wifidevice_sc_systemchannelPackage.SETCHANNEL__TEXT:
				return getText();
			case Device_wifi_wifidevice_sc_systemchannelPackage.SETCHANNEL__DEVICE:
				return getDevice();
			case Device_wifi_wifidevice_sc_systemchannelPackage.SETCHANNEL__NAME:
				return getName();
			case Device_wifi_wifidevice_sc_systemchannelPackage.SETCHANNEL__ID:
				return getId();
			case Device_wifi_wifidevice_sc_systemchannelPackage.SETCHANNEL__CHANNEL:
				return getChannel();
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
			case Device_wifi_wifidevice_sc_systemchannelPackage.SETCHANNEL__ECONTAINER_SETCHANNEL:
				setEContainer_setchannel((Systemchannel)newValue);
				return;
			case Device_wifi_wifidevice_sc_systemchannelPackage.SETCHANNEL__TEXT:
				getText().clear();
				getText().addAll((Collection<? extends String>)newValue);
				return;
			case Device_wifi_wifidevice_sc_systemchannelPackage.SETCHANNEL__DEVICE:
				setDevice((Device)newValue);
				return;
			case Device_wifi_wifidevice_sc_systemchannelPackage.SETCHANNEL__NAME:
				setName((String)newValue);
				return;
			case Device_wifi_wifidevice_sc_systemchannelPackage.SETCHANNEL__ID:
				setId((String)newValue);
				return;
			case Device_wifi_wifidevice_sc_systemchannelPackage.SETCHANNEL__CHANNEL:
				setChannel((Integer)newValue);
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
			case Device_wifi_wifidevice_sc_systemchannelPackage.SETCHANNEL__ECONTAINER_SETCHANNEL:
				setEContainer_setchannel((Systemchannel)null);
				return;
			case Device_wifi_wifidevice_sc_systemchannelPackage.SETCHANNEL__TEXT:
				getText().clear();
				return;
			case Device_wifi_wifidevice_sc_systemchannelPackage.SETCHANNEL__DEVICE:
				setDevice((Device)null);
				return;
			case Device_wifi_wifidevice_sc_systemchannelPackage.SETCHANNEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Device_wifi_wifidevice_sc_systemchannelPackage.SETCHANNEL__ID:
				setId(ID_EDEFAULT);
				return;
			case Device_wifi_wifidevice_sc_systemchannelPackage.SETCHANNEL__CHANNEL:
				setChannel(CHANNEL_EDEFAULT);
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
			case Device_wifi_wifidevice_sc_systemchannelPackage.SETCHANNEL__ECONTAINER_SETCHANNEL:
				return getEContainer_setchannel() != null;
			case Device_wifi_wifidevice_sc_systemchannelPackage.SETCHANNEL__TEXT:
				return text != null && !text.isEmpty();
			case Device_wifi_wifidevice_sc_systemchannelPackage.SETCHANNEL__DEVICE:
				return device != null;
			case Device_wifi_wifidevice_sc_systemchannelPackage.SETCHANNEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Device_wifi_wifidevice_sc_systemchannelPackage.SETCHANNEL__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Device_wifi_wifidevice_sc_systemchannelPackage.SETCHANNEL__CHANNEL:
				return channel != CHANNEL_EDEFAULT;
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
		result.append(", name: ");
		result.append(name);
		result.append(", id: ");
		result.append(id);
		result.append(", channel: ");
		result.append(channel);
		result.append(')');
		return result.toString();
	}

} //SetchannelImpl
