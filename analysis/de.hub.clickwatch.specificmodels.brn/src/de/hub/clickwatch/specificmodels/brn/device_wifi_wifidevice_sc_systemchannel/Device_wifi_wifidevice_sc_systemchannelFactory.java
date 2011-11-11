/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_sc_systemchannel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_sc_systemchannel.Device_wifi_wifidevice_sc_systemchannelPackage
 * @generated
 */
public interface Device_wifi_wifidevice_sc_systemchannelFactory extends EFactory {
	/**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	Device_wifi_wifidevice_sc_systemchannelFactory eINSTANCE = de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_sc_systemchannel.impl.Device_wifi_wifidevice_sc_systemchannelFactoryImpl.init();

	/**
     * Returns a new object of class '<em>Device</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Device</em>'.
     * @generated
     */
	Device createDevice();

	/**
     * Returns a new object of class '<em>Setchannel</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Setchannel</em>'.
     * @generated
     */
	Setchannel createSetchannel();

	/**
     * Returns a new object of class '<em>Systemchannel</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Systemchannel</em>'.
     * @generated
     */
	Systemchannel createSystemchannel();

	/**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
	Device_wifi_wifidevice_sc_systemchannelPackage getDevice_wifi_wifidevice_sc_systemchannelPackage();

} //Device_wifi_wifidevice_sc_systemchannelFactory
