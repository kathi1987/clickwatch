/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo;

import de.hub.clickwatch.model.Handler;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Systeminfo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Systeminfo#getSystem <em>System</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Sys_info_systeminfoPackage#getSysteminfo()
 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Systeminfo|Handler'"
 * @generated
 */
public interface Systeminfo extends Handler {
	/**
     * Returns the value of the '<em><b>System</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.System#getEContainer_system <em>EContainer system</em>}'.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>System</em>' containment reference.
     * @see #setSystem(de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.System)
     * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Sys_info_systeminfoPackage#getSysteminfo_System()
     * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.System#getEContainer_system
     * @model opposite="eContainer_system" containment="true"
     *        annotation="http://de.hub.clickwatch.specificmodels target_id='Systeminfo|Handler/system|system:System|EObject' IsCopy='false'"
     * @generated
     */
	de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.System getSystem();

	/**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Systeminfo#getSystem <em>System</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>System</em>' containment reference.
     * @see #getSystem()
     * @generated
     */
	void setSystem(de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.System value);

} // Systeminfo
