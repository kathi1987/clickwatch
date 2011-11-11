/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Sys_info_systeminfoPackage
 * @generated
 */
public interface Sys_info_systeminfoFactory extends EFactory {
	/**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	Sys_info_systeminfoFactory eINSTANCE = de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.impl.Sys_info_systeminfoFactoryImpl.init();

	/**
     * Returns a new object of class '<em>Cpu usage</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Cpu usage</em>'.
     * @generated
     */
	Cpu_usage createCpu_usage();

	/**
     * Returns a new object of class '<em>Linux</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Linux</em>'.
     * @generated
     */
	Linux createLinux();

	/**
     * Returns a new object of class '<em>Loadavg</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Loadavg</em>'.
     * @generated
     */
	Loadavg createLoadavg();

	/**
     * Returns a new object of class '<em>Mem</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Mem</em>'.
     * @generated
     */
	Mem createMem();

	/**
     * Returns a new object of class '<em>System</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>System</em>'.
     * @generated
     */
	System createSystem();

	/**
     * Returns a new object of class '<em>Systeminfo</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Systeminfo</em>'.
     * @generated
     */
	Systeminfo createSysteminfo();

	/**
     * Returns a new object of class '<em>Uptime</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Uptime</em>'.
     * @generated
     */
	Uptime createUptime();

	/**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
	Sys_info_systeminfoPackage getSys_info_systeminfoPackage();

} //Sys_info_systeminfoFactory
