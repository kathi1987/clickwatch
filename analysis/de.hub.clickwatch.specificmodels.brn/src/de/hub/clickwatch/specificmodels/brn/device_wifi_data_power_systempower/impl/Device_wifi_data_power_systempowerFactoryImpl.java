/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.device_wifi_data_power_systempower.impl;

import de.hub.clickwatch.specificmodels.brn.device_wifi_data_power_systempower.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Device_wifi_data_power_systempowerFactoryImpl extends EFactoryImpl implements Device_wifi_data_power_systempowerFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static Device_wifi_data_power_systempowerFactory init() {
        try {
            Device_wifi_data_power_systempowerFactory theDevice_wifi_data_power_systempowerFactory = (Device_wifi_data_power_systempowerFactory)EPackage.Registry.INSTANCE.getEFactory("http://de.hub.clickwatch.specificmodels.brn/device_wifi/data_power/systempower"); 
            if (theDevice_wifi_data_power_systempowerFactory != null) {
                return theDevice_wifi_data_power_systempowerFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new Device_wifi_data_power_systempowerFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Device_wifi_data_power_systempowerFactoryImpl() {
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
            case Device_wifi_data_power_systempowerPackage.DEVICE: return createDevice();
            case Device_wifi_data_power_systempowerPackage.SETTXPOWER: return createSettxpower();
            case Device_wifi_data_power_systempowerPackage.SYSTEMPOWER: return createSystempower();
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
    public Settxpower createSettxpower() {
        SettxpowerImpl settxpower = new SettxpowerImpl();
        return settxpower;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Systempower createSystempower() {
        SystempowerImpl systempower = new SystempowerImpl();
        return systempower;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Device_wifi_data_power_systempowerPackage getDevice_wifi_data_power_systempowerPackage() {
        return (Device_wifi_data_power_systempowerPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static Device_wifi_data_power_systempowerPackage getPackage() {
        return Device_wifi_data_power_systempowerPackage.eINSTANCE;
    }

} //Device_wifi_data_power_systempowerFactoryImpl
