/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.device_wifi_data_power_systempower;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Settxpower</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_data_power_systempower.Settxpower#getEContainer_settxpower <em>EContainer settxpower</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_data_power_systempower.Settxpower#getText <em>Text</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_data_power_systempower.Settxpower#getDevice <em>Device</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_data_power_systempower.Settxpower#getName <em>Name</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_data_power_systempower.Settxpower#getId <em>Id</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_data_power_systempower.Settxpower#getPower <em>Power</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_data_power_systempower.Device_wifi_data_power_systempowerPackage#getSettxpower()
 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Systempower|Handler/settxpower|settxpower:Settxpower|EObject'"
 * @generated
 */
public interface Settxpower extends EObject {
	/**
	 * Returns the value of the '<em><b>EContainer settxpower</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_data_power_systempower.Systempower#getSettxpower <em>Settxpower</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EContainer settxpower</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EContainer settxpower</em>' container reference.
	 * @see #setEContainer_settxpower(Systempower)
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_data_power_systempower.Device_wifi_data_power_systempowerPackage#getSettxpower_EContainer_settxpower()
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_data_power_systempower.Systempower#getSettxpower
	 * @model opposite="settxpower" transient="false"
	 * @generated
	 */
	Systempower getEContainer_settxpower();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_data_power_systempower.Settxpower#getEContainer_settxpower <em>EContainer settxpower</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EContainer settxpower</em>' container reference.
	 * @see #getEContainer_settxpower()
	 * @generated
	 */
	void setEContainer_settxpower(Systempower value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute list.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_data_power_systempower.Device_wifi_data_power_systempowerPackage#getSettxpower_Text()
	 * @model unique="false"
	 *        annotation="http://de.hub.clickwatch.specificmodels target_id='Systempower|Handler/settxpower|settxpower:Settxpower|EObject/text|text:'"
	 * @generated
	 */
	EList<String> getText();

	/**
	 * Returns the value of the '<em><b>Device</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_data_power_systempower.Device#getEContainer_device <em>EContainer device</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device</em>' containment reference.
	 * @see #setDevice(Device)
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_data_power_systempower.Device_wifi_data_power_systempowerPackage#getSettxpower_Device()
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_data_power_systempower.Device#getEContainer_device
	 * @model opposite="eContainer_device" containment="true"
	 *        annotation="http://de.hub.clickwatch.specificmodels target_id='Systempower|Handler/settxpower|settxpower:Settxpower|EObject/device|device:Device|EObject' IsCopy='false'"
	 * @generated
	 */
	Device getDevice();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_data_power_systempower.Settxpower#getDevice <em>Device</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device</em>' containment reference.
	 * @see #getDevice()
	 * @generated
	 */
	void setDevice(Device value);

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
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_data_power_systempower.Device_wifi_data_power_systempowerPackage#getSettxpower_Name()
	 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Systempower|Handler/settxpower|settxpower:Settxpower|EObject/name|name:'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_data_power_systempower.Settxpower#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_data_power_systempower.Device_wifi_data_power_systempowerPackage#getSettxpower_Id()
	 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Systempower|Handler/settxpower|settxpower:Settxpower|EObject/id|id:'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_data_power_systempower.Settxpower#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power</em>' attribute.
	 * @see #setPower(int)
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_data_power_systempower.Device_wifi_data_power_systempowerPackage#getSettxpower_Power()
	 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Systempower|Handler/settxpower|settxpower:Settxpower|EObject/power|power:'"
	 * @generated
	 */
	int getPower();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_data_power_systempower.Settxpower#getPower <em>Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power</em>' attribute.
	 * @see #getPower()
	 * @generated
	 */
	void setPower(int value);

} // Settxpower
