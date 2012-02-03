/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_sc_systemchannel;

import de.hub.clickwatch.datamodel.Value;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Systemchannel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_sc_systemchannel.Systemchannel#getSetchannel <em>Setchannel</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_sc_systemchannel.Device_wifi_wifidevice_sc_systemchannelPackage#getSystemchannel()
 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Systemchannel|Handler'"
 * @generated
 */
public interface Systemchannel extends Value {
	/**
	 * Returns the value of the '<em><b>Setchannel</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_sc_systemchannel.Setchannel#getEContainer_setchannel <em>EContainer setchannel</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Setchannel</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Setchannel</em>' containment reference.
	 * @see #setSetchannel(Setchannel)
	 * @see de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_sc_systemchannel.Device_wifi_wifidevice_sc_systemchannelPackage#getSystemchannel_Setchannel()
	 * @see de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_sc_systemchannel.Setchannel#getEContainer_setchannel
	 * @model opposite="eContainer_setchannel" containment="true"
	 *        annotation="http://de.hub.clickwatch.specificmodels target_id='Systemchannel|Handler/setchannel|setchannel:Setchannel|EObject' IsCopy='false'"
	 * @generated
	 */
	Setchannel getSetchannel();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_sc_systemchannel.Systemchannel#getSetchannel <em>Setchannel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Setchannel</em>' containment reference.
	 * @see #getSetchannel()
	 * @generated
	 */
	void setSetchannel(Setchannel value);

} // Systemchannel
