/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_sc_systemchannel.impl;

import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_sc_systemchannel.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_sc_systemchannel.Device;
import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_sc_systemchannel.Device_wifi_wifidevice_sc_systemchannelFactory;
import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_sc_systemchannel.Device_wifi_wifidevice_sc_systemchannelPackage;
import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_sc_systemchannel.Setchannel;
import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_sc_systemchannel.Systemchannel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Device_wifi_wifidevice_sc_systemchannelFactoryImpl extends EFactoryImpl implements Device_wifi_wifidevice_sc_systemchannelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Device_wifi_wifidevice_sc_systemchannelFactory init() {
		try {
			Device_wifi_wifidevice_sc_systemchannelFactory theDevice_wifi_wifidevice_sc_systemchannelFactory = (Device_wifi_wifidevice_sc_systemchannelFactory)EPackage.Registry.INSTANCE.getEFactory("http://de.hub.clickwatch.specificmodels.brn/device_wifi/wifidevice/sc/systemchannel"); 
			if (theDevice_wifi_wifidevice_sc_systemchannelFactory != null) {
				return theDevice_wifi_wifidevice_sc_systemchannelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Device_wifi_wifidevice_sc_systemchannelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Device_wifi_wifidevice_sc_systemchannelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Device_wifi_wifidevice_sc_systemchannelPackage.DEVICE: return createDevice();
			case Device_wifi_wifidevice_sc_systemchannelPackage.SETCHANNEL: return createSetchannel();
			case Device_wifi_wifidevice_sc_systemchannelPackage.SYSTEMCHANNEL: return createSystemchannel();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Device createDevice() {
		DeviceImpl device = new DeviceImpl();
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Setchannel createSetchannel() {
		SetchannelImpl setchannel = new SetchannelImpl();
		return setchannel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Systemchannel createSystemchannel() {
		SystemchannelImpl systemchannel = new SystemchannelImpl();
		return systemchannel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Device_wifi_wifidevice_sc_systemchannelPackage getDevice_wifi_wifidevice_sc_systemchannelPackage() {
		return (Device_wifi_wifidevice_sc_systemchannelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Device_wifi_wifidevice_sc_systemchannelPackage getPackage() {
		return Device_wifi_wifidevice_sc_systemchannelPackage.eINSTANCE;
	}

} //Device_wifi_wifidevice_sc_systemchannelFactoryImpl
