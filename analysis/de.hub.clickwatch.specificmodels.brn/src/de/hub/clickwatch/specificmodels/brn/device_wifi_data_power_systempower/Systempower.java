/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.device_wifi_data_power_systempower;

import de.hub.clickwatch.model.Handler;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Systempower</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_data_power_systempower.Systempower#getSettxpower <em>Settxpower</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_data_power_systempower.Device_wifi_data_power_systempowerPackage#getSystempower()
 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Systempower|Handler'"
 * @generated
 */
public interface Systempower extends Handler {
    /**
     * Returns the value of the '<em><b>Settxpower</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_data_power_systempower.Settxpower#getEContainer_settxpower <em>EContainer settxpower</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Settxpower</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Settxpower</em>' containment reference.
     * @see #setSettxpower(Settxpower)
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_data_power_systempower.Device_wifi_data_power_systempowerPackage#getSystempower_Settxpower()
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_data_power_systempower.Settxpower#getEContainer_settxpower
     * @model opposite="eContainer_settxpower" containment="true"
     *        annotation="http://de.hub.clickwatch.specificmodels target_id='Systempower|Handler/settxpower|settxpower:Settxpower|EObject' IsCopy='false'"
     * @generated
     */
    Settxpower getSettxpower();

    /**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_data_power_systempower.Systempower#getSettxpower <em>Settxpower</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Settxpower</em>' containment reference.
     * @see #getSettxpower()
     * @generated
     */
    void setSettxpower(Settxpower value);

} // Systempower
