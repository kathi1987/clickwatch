/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Uptime</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Uptime#getEContainer_uptime <em>EContainer uptime</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Uptime#getTotal <em>Total</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Uptime#getIdle <em>Idle</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Sys_info_systeminfoPackage#getUptime()
 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Systeminfo|Handler/system|system:System|EObject/uptime|uptime:Uptime|EObject'"
 * @generated
 */
public interface Uptime extends EObject {
	/**
     * Returns the value of the '<em><b>EContainer uptime</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.System#getUptime <em>Uptime</em>}'.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EContainer uptime</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>EContainer uptime</em>' container reference.
     * @see #setEContainer_uptime(de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.System)
     * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Sys_info_systeminfoPackage#getUptime_EContainer_uptime()
     * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.System#getUptime
     * @model opposite="uptime" transient="false"
     * @generated
     */
	de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.System getEContainer_uptime();

	/**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Uptime#getEContainer_uptime <em>EContainer uptime</em>}' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>EContainer uptime</em>' container reference.
     * @see #getEContainer_uptime()
     * @generated
     */
	void setEContainer_uptime(de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.System value);

	/**
     * Returns the value of the '<em><b>Total</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Total</em>' attribute.
     * @see #setTotal(double)
     * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Sys_info_systeminfoPackage#getUptime_Total()
     * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Systeminfo|Handler/system|system:System|EObject/uptime|uptime:Uptime|EObject/total|total:'"
     * @generated
     */
	double getTotal();

	/**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Uptime#getTotal <em>Total</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Total</em>' attribute.
     * @see #getTotal()
     * @generated
     */
	void setTotal(double value);

	/**
     * Returns the value of the '<em><b>Idle</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Idle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Idle</em>' attribute.
     * @see #setIdle(double)
     * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Sys_info_systeminfoPackage#getUptime_Idle()
     * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Systeminfo|Handler/system|system:System|EObject/uptime|uptime:Uptime|EObject/idle|idle:'"
     * @generated
     */
	double getIdle();

	/**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Uptime#getIdle <em>Idle</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Idle</em>' attribute.
     * @see #getIdle()
     * @generated
     */
	void setIdle(double value);

} // Uptime
