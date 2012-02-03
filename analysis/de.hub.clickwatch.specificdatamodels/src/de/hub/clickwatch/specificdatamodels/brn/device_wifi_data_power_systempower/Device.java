/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificdatamodels.brn.device_wifi_data_power_systempower;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_data_power_systempower.Device#getEContainer_device <em>EContainer device</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_data_power_systempower.Device#getName <em>Name</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_data_power_systempower.Device#getDevice_addr <em>Device addr</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.specificdatamodels.brn.device_wifi_data_power_systempower.Device_wifi_data_power_systempowerPackage#getDevice()
 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Systempower|Handler/settxpower|settxpower:Settxpower|EObject/device|device:Device|EObject'"
 * @generated
 */
public interface Device extends EObject {
	/**
	 * Returns the value of the '<em><b>EContainer device</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_data_power_systempower.Settxpower#getDevice <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EContainer device</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EContainer device</em>' container reference.
	 * @see #setEContainer_device(Settxpower)
	 * @see de.hub.clickwatch.specificdatamodels.brn.device_wifi_data_power_systempower.Device_wifi_data_power_systempowerPackage#getDevice_EContainer_device()
	 * @see de.hub.clickwatch.specificdatamodels.brn.device_wifi_data_power_systempower.Settxpower#getDevice
	 * @model opposite="device" transient="false"
	 * @generated
	 */
	Settxpower getEContainer_device();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_data_power_systempower.Device#getEContainer_device <em>EContainer device</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EContainer device</em>' container reference.
	 * @see #getEContainer_device()
	 * @generated
	 */
	void setEContainer_device(Settxpower value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.hub.clickwatch.specificdatamodels.brn.device_wifi_data_power_systempower.Device_wifi_data_power_systempowerPackage#getDevice_Name()
	 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Systempower|Handler/settxpower|settxpower:Settxpower|EObject/device|device:Device|EObject/name|name:'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_data_power_systempower.Device#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Device addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device addr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device addr</em>' attribute.
	 * @see #setDevice_addr(String)
	 * @see de.hub.clickwatch.specificdatamodels.brn.device_wifi_data_power_systempower.Device_wifi_data_power_systempowerPackage#getDevice_Device_addr()
	 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Systempower|Handler/settxpower|settxpower:Settxpower|EObject/device|device:Device|EObject/device_addr|device_addr:'"
	 * @generated
	 */
	String getDevice_addr();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_data_power_systempower.Device#getDevice_addr <em>Device addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device addr</em>' attribute.
	 * @see #getDevice_addr()
	 * @generated
	 */
	void setDevice_addr(String value);

} // Device
