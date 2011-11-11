/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.impl;

import de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Cpu_usage;
import de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Linux;
import de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Loadavg;
import de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Mem;
import de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Sys_info_systeminfoFactory;
import de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Sys_info_systeminfoPackage;
import de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Systeminfo;
import de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Uptime;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Sys_info_systeminfoFactoryImpl extends EFactoryImpl implements Sys_info_systeminfoFactory {
	/**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static Sys_info_systeminfoFactory init() {
        try {
            Sys_info_systeminfoFactory theSys_info_systeminfoFactory = (Sys_info_systeminfoFactory)EPackage.Registry.INSTANCE.getEFactory("http://de.hub.clickwatch.specificmodels.brn/sys_info/systeminfo"); 
            if (theSys_info_systeminfoFactory != null) {
                return theSys_info_systeminfoFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new Sys_info_systeminfoFactoryImpl();
    }

	/**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Sys_info_systeminfoFactoryImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case Sys_info_systeminfoPackage.CPU_USAGE: return createCpu_usage();
            case Sys_info_systeminfoPackage.LINUX: return createLinux();
            case Sys_info_systeminfoPackage.LOADAVG: return createLoadavg();
            case Sys_info_systeminfoPackage.MEM: return createMem();
            case Sys_info_systeminfoPackage.SYSTEM: return createSystem();
            case Sys_info_systeminfoPackage.SYSTEMINFO: return createSysteminfo();
            case Sys_info_systeminfoPackage.UPTIME: return createUptime();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Cpu_usage createCpu_usage() {
        Cpu_usageImpl cpu_usage = new Cpu_usageImpl();
        return cpu_usage;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Linux createLinux() {
        LinuxImpl linux = new LinuxImpl();
        return linux;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Loadavg createLoadavg() {
        LoadavgImpl loadavg = new LoadavgImpl();
        return loadavg;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Mem createMem() {
        MemImpl mem = new MemImpl();
        return mem;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.System createSystem() {
        SystemImpl system = new SystemImpl();
        return system;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Systeminfo createSysteminfo() {
        SysteminfoImpl systeminfo = new SysteminfoImpl();
        return systeminfo;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Uptime createUptime() {
        UptimeImpl uptime = new UptimeImpl();
        return uptime;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Sys_info_systeminfoPackage getSys_info_systeminfoPackage() {
        return (Sys_info_systeminfoPackage)getEPackage();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
	@Deprecated
	public static Sys_info_systeminfoPackage getPackage() {
        return Sys_info_systeminfoPackage.eINSTANCE;
    }

} //Sys_info_systeminfoFactoryImpl
