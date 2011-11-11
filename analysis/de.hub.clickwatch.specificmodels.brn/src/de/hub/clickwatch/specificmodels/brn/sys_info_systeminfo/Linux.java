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
 * A representation of the model object '<em><b>Linux</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Linux#getEContainer_linux <em>EContainer linux</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Linux#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Sys_info_systeminfoPackage#getLinux()
 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Systeminfo|Handler/system|system:System|EObject/linux|linux:Linux|EObject'"
 * @generated
 */
public interface Linux extends EObject {
	/**
     * Returns the value of the '<em><b>EContainer linux</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.System#getLinux <em>Linux</em>}'.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EContainer linux</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>EContainer linux</em>' container reference.
     * @see #setEContainer_linux(de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.System)
     * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Sys_info_systeminfoPackage#getLinux_EContainer_linux()
     * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.System#getLinux
     * @model opposite="linux" transient="false"
     * @generated
     */
	de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.System getEContainer_linux();

	/**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Linux#getEContainer_linux <em>EContainer linux</em>}' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>EContainer linux</em>' container reference.
     * @see #getEContainer_linux()
     * @generated
     */
	void setEContainer_linux(de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.System value);

	/**
     * Returns the value of the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Version</em>' attribute.
     * @see #setVersion(String)
     * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Sys_info_systeminfoPackage#getLinux_Version()
     * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Systeminfo|Handler/system|system:System|EObject/linux|linux:Linux|EObject/version|version:'"
     * @generated
     */
	String getVersion();

	/**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Linux#getVersion <em>Version</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Version</em>' attribute.
     * @see #getVersion()
     * @generated
     */
	void setVersion(String value);

} // Linux
