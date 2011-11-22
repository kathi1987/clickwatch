/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_sc_systemchannel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Setchannel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_sc_systemchannel.Setchannel#getEContainer_setchannel <em>EContainer setchannel</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_sc_systemchannel.Setchannel#getText <em>Text</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_sc_systemchannel.Setchannel#getDevice <em>Device</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_sc_systemchannel.Setchannel#getName <em>Name</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_sc_systemchannel.Setchannel#getId <em>Id</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_sc_systemchannel.Setchannel#getChannel <em>Channel</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_sc_systemchannel.Device_wifi_wifidevice_sc_systemchannelPackage#getSetchannel()
 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Systemchannel|Handler/setchannel|setchannel:Setchannel|EObject'"
 * @generated
 */
public interface Setchannel extends EObject {
    /**
     * Returns the value of the '<em><b>EContainer setchannel</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_sc_systemchannel.Systemchannel#getSetchannel <em>Setchannel</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>EContainer setchannel</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>EContainer setchannel</em>' container reference.
     * @see #setEContainer_setchannel(Systemchannel)
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_sc_systemchannel.Device_wifi_wifidevice_sc_systemchannelPackage#getSetchannel_EContainer_setchannel()
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_sc_systemchannel.Systemchannel#getSetchannel
     * @model opposite="setchannel" transient="false"
     * @generated
     */
    Systemchannel getEContainer_setchannel();

    /**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_sc_systemchannel.Setchannel#getEContainer_setchannel <em>EContainer setchannel</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>EContainer setchannel</em>' container reference.
     * @see #getEContainer_setchannel()
     * @generated
     */
    void setEContainer_setchannel(Systemchannel value);

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
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_sc_systemchannel.Device_wifi_wifidevice_sc_systemchannelPackage#getSetchannel_Text()
     * @model unique="false"
     *        annotation="http://de.hub.clickwatch.specificmodels target_id='Systemchannel|Handler/setchannel|setchannel:Setchannel|EObject/text|text:'"
     * @generated
     */
    EList<String> getText();

    /**
     * Returns the value of the '<em><b>Device</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_sc_systemchannel.Device#getEContainer_device <em>EContainer device</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Device</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Device</em>' containment reference.
     * @see #setDevice(Device)
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_sc_systemchannel.Device_wifi_wifidevice_sc_systemchannelPackage#getSetchannel_Device()
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_sc_systemchannel.Device#getEContainer_device
     * @model opposite="eContainer_device" containment="true"
     *        annotation="http://de.hub.clickwatch.specificmodels target_id='Systemchannel|Handler/setchannel|setchannel:Setchannel|EObject/device|device:Device|EObject' IsCopy='false'"
     * @generated
     */
    Device getDevice();

    /**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_sc_systemchannel.Setchannel#getDevice <em>Device</em>}' containment reference.
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
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_sc_systemchannel.Device_wifi_wifidevice_sc_systemchannelPackage#getSetchannel_Name()
     * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Systemchannel|Handler/setchannel|setchannel:Setchannel|EObject/name|name:'"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_sc_systemchannel.Setchannel#getName <em>Name</em>}' attribute.
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
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_sc_systemchannel.Device_wifi_wifidevice_sc_systemchannelPackage#getSetchannel_Id()
     * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Systemchannel|Handler/setchannel|setchannel:Setchannel|EObject/id|id:'"
     * @generated
     */
    String getId();

    /**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_sc_systemchannel.Setchannel#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Id</em>' attribute.
     * @see #getId()
     * @generated
     */
    void setId(String value);

    /**
     * Returns the value of the '<em><b>Channel</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Channel</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Channel</em>' attribute.
     * @see #setChannel(int)
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_sc_systemchannel.Device_wifi_wifidevice_sc_systemchannelPackage#getSetchannel_Channel()
     * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Systemchannel|Handler/setchannel|setchannel:Setchannel|EObject/channel|channel:'"
     * @generated
     */
    int getChannel();

    /**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_sc_systemchannel.Setchannel#getChannel <em>Channel</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Channel</em>' attribute.
     * @see #getChannel()
     * @generated
     */
    void setChannel(int value);

} // Setchannel
