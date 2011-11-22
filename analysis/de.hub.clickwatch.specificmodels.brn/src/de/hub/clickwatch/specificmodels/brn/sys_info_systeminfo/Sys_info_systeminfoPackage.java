/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo;

import de.hub.clickwatch.model.ClickWatchModelPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Sys_info_systeminfoFactory
 * @model kind="package"
 *        annotation="http://de.hub.clickwatch.specificmodels handler_class='Systeminfo'"
 * @generated
 */
public interface Sys_info_systeminfoPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "sys_info_systeminfo";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://de.hub.clickwatch.specificmodels.brn/sys_info/systeminfo";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "sys_info_systeminfo";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    Sys_info_systeminfoPackage eINSTANCE = de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.impl.Sys_info_systeminfoPackageImpl.init();

    /**
     * The meta object id for the '{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.impl.Cpu_usageImpl <em>Cpu usage</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.impl.Cpu_usageImpl
     * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.impl.Sys_info_systeminfoPackageImpl#getCpu_usage()
     * @generated
     */
    int CPU_USAGE = 0;

    /**
     * The feature id for the '<em><b>EContainer cpu usage</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CPU_USAGE__ECONTAINER_CPU_USAGE = 0;

    /**
     * The feature id for the '<em><b>Real</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CPU_USAGE__REAL = 1;

    /**
     * The feature id for the '<em><b>User</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CPU_USAGE__USER = 2;

    /**
     * The feature id for the '<em><b>Sys</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CPU_USAGE__SYS = 3;

    /**
     * The feature id for the '<em><b>Unit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CPU_USAGE__UNIT = 4;

    /**
     * The number of structural features of the '<em>Cpu usage</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CPU_USAGE_FEATURE_COUNT = 5;

    /**
     * The meta object id for the '{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.impl.LinuxImpl <em>Linux</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.impl.LinuxImpl
     * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.impl.Sys_info_systeminfoPackageImpl#getLinux()
     * @generated
     */
    int LINUX = 1;

    /**
     * The feature id for the '<em><b>EContainer linux</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINUX__ECONTAINER_LINUX = 0;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINUX__VERSION = 1;

    /**
     * The number of structural features of the '<em>Linux</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINUX_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.impl.LoadavgImpl <em>Loadavg</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.impl.LoadavgImpl
     * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.impl.Sys_info_systeminfoPackageImpl#getLoadavg()
     * @generated
     */
    int LOADAVG = 2;

    /**
     * The feature id for the '<em><b>EContainer loadavg</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOADAVG__ECONTAINER_LOADAVG = 0;

    /**
     * The feature id for the '<em><b>Onemin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOADAVG__ONEMIN = 1;

    /**
     * The feature id for the '<em><b>Fivemin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOADAVG__FIVEMIN = 2;

    /**
     * The feature id for the '<em><b>Fifteen</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOADAVG__FIFTEEN = 3;

    /**
     * The number of structural features of the '<em>Loadavg</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOADAVG_FEATURE_COUNT = 4;

    /**
     * The meta object id for the '{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.impl.MemImpl <em>Mem</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.impl.MemImpl
     * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.impl.Sys_info_systeminfoPackageImpl#getMem()
     * @generated
     */
    int MEM = 3;

    /**
     * The feature id for the '<em><b>EContainer mem</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEM__ECONTAINER_MEM = 0;

    /**
     * The feature id for the '<em><b>Total</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEM__TOTAL = 1;

    /**
     * The feature id for the '<em><b>Used</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEM__USED = 2;

    /**
     * The feature id for the '<em><b>Cached</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEM__CACHED = 3;

    /**
     * The feature id for the '<em><b>Buffers</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEM__BUFFERS = 4;

    /**
     * The feature id for the '<em><b>NFS Unstable</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEM__NFS_UNSTABLE = 5;

    /**
     * The number of structural features of the '<em>Mem</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEM_FEATURE_COUNT = 6;

    /**
     * The meta object id for the '{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.impl.SystemImpl <em>System</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.impl.SystemImpl
     * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.impl.Sys_info_systeminfoPackageImpl#getSystem()
     * @generated
     */
    int SYSTEM = 4;

    /**
     * The feature id for the '<em><b>EContainer system</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEM__ECONTAINER_SYSTEM = 0;

    /**
     * The feature id for the '<em><b>Text</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEM__TEXT = 1;

    /**
     * The feature id for the '<em><b>Mem</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEM__MEM = 2;

    /**
     * The feature id for the '<em><b>Loadavg</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEM__LOADAVG = 3;

    /**
     * The feature id for the '<em><b>Cpu usage</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEM__CPU_USAGE = 4;

    /**
     * The feature id for the '<em><b>Uptime</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEM__UPTIME = 5;

    /**
     * The feature id for the '<em><b>Linux</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEM__LINUX = 6;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEM__ID = 7;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEM__NAME = 8;

    /**
     * The feature id for the '<em><b>Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEM__TIME = 9;

    /**
     * The number of structural features of the '<em>System</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEM_FEATURE_COUNT = 10;

    /**
     * The meta object id for the '{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.impl.SysteminfoImpl <em>Systeminfo</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.impl.SysteminfoImpl
     * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.impl.Sys_info_systeminfoPackageImpl#getSysteminfo()
     * @generated
     */
    int SYSTEMINFO = 5;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEMINFO__NAME = ClickWatchModelPackage.HANDLER__NAME;

    /**
     * The feature id for the '<em><b>Can Read</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEMINFO__CAN_READ = ClickWatchModelPackage.HANDLER__CAN_READ;

    /**
     * The feature id for the '<em><b>Can Write</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEMINFO__CAN_WRITE = ClickWatchModelPackage.HANDLER__CAN_WRITE;

    /**
     * The feature id for the '<em><b>Changed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEMINFO__CHANGED = ClickWatchModelPackage.HANDLER__CHANGED;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEMINFO__MIXED = ClickWatchModelPackage.HANDLER__MIXED;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEMINFO__ANY = ClickWatchModelPackage.HANDLER__ANY;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEMINFO__VALUE = ClickWatchModelPackage.HANDLER__VALUE;

    /**
     * The feature id for the '<em><b>Timestamp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEMINFO__TIMESTAMP = ClickWatchModelPackage.HANDLER__TIMESTAMP;

    /**
     * The feature id for the '<em><b>System</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEMINFO__SYSTEM = ClickWatchModelPackage.HANDLER_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Systeminfo</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEMINFO_FEATURE_COUNT = ClickWatchModelPackage.HANDLER_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.impl.UptimeImpl <em>Uptime</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.impl.UptimeImpl
     * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.impl.Sys_info_systeminfoPackageImpl#getUptime()
     * @generated
     */
    int UPTIME = 6;

    /**
     * The feature id for the '<em><b>EContainer uptime</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UPTIME__ECONTAINER_UPTIME = 0;

    /**
     * The feature id for the '<em><b>Total</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UPTIME__TOTAL = 1;

    /**
     * The feature id for the '<em><b>Idle</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UPTIME__IDLE = 2;

    /**
     * The number of structural features of the '<em>Uptime</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UPTIME_FEATURE_COUNT = 3;


    /**
     * Returns the meta object for class '{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Cpu_usage <em>Cpu usage</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Cpu usage</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Cpu_usage
     * @generated
     */
    EClass getCpu_usage();

    /**
     * Returns the meta object for the container reference '{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Cpu_usage#getEContainer_cpu_usage <em>EContainer cpu usage</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>EContainer cpu usage</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Cpu_usage#getEContainer_cpu_usage()
     * @see #getCpu_usage()
     * @generated
     */
    EReference getCpu_usage_EContainer_cpu_usage();

    /**
     * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Cpu_usage#getReal <em>Real</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Real</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Cpu_usage#getReal()
     * @see #getCpu_usage()
     * @generated
     */
    EAttribute getCpu_usage_Real();

    /**
     * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Cpu_usage#getUser <em>User</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>User</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Cpu_usage#getUser()
     * @see #getCpu_usage()
     * @generated
     */
    EAttribute getCpu_usage_User();

    /**
     * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Cpu_usage#getSys <em>Sys</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Sys</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Cpu_usage#getSys()
     * @see #getCpu_usage()
     * @generated
     */
    EAttribute getCpu_usage_Sys();

    /**
     * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Cpu_usage#getUnit <em>Unit</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Unit</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Cpu_usage#getUnit()
     * @see #getCpu_usage()
     * @generated
     */
    EAttribute getCpu_usage_Unit();

    /**
     * Returns the meta object for class '{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Linux <em>Linux</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Linux</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Linux
     * @generated
     */
    EClass getLinux();

    /**
     * Returns the meta object for the container reference '{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Linux#getEContainer_linux <em>EContainer linux</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>EContainer linux</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Linux#getEContainer_linux()
     * @see #getLinux()
     * @generated
     */
    EReference getLinux_EContainer_linux();

    /**
     * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Linux#getVersion <em>Version</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Version</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Linux#getVersion()
     * @see #getLinux()
     * @generated
     */
    EAttribute getLinux_Version();

    /**
     * Returns the meta object for class '{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Loadavg <em>Loadavg</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Loadavg</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Loadavg
     * @generated
     */
    EClass getLoadavg();

    /**
     * Returns the meta object for the container reference '{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Loadavg#getEContainer_loadavg <em>EContainer loadavg</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>EContainer loadavg</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Loadavg#getEContainer_loadavg()
     * @see #getLoadavg()
     * @generated
     */
    EReference getLoadavg_EContainer_loadavg();

    /**
     * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Loadavg#getOnemin <em>Onemin</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Onemin</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Loadavg#getOnemin()
     * @see #getLoadavg()
     * @generated
     */
    EAttribute getLoadavg_Onemin();

    /**
     * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Loadavg#getFivemin <em>Fivemin</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Fivemin</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Loadavg#getFivemin()
     * @see #getLoadavg()
     * @generated
     */
    EAttribute getLoadavg_Fivemin();

    /**
     * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Loadavg#getFifteen <em>Fifteen</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Fifteen</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Loadavg#getFifteen()
     * @see #getLoadavg()
     * @generated
     */
    EAttribute getLoadavg_Fifteen();

    /**
     * Returns the meta object for class '{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Mem <em>Mem</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Mem</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Mem
     * @generated
     */
    EClass getMem();

    /**
     * Returns the meta object for the container reference '{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Mem#getEContainer_mem <em>EContainer mem</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>EContainer mem</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Mem#getEContainer_mem()
     * @see #getMem()
     * @generated
     */
    EReference getMem_EContainer_mem();

    /**
     * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Mem#getTotal <em>Total</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Total</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Mem#getTotal()
     * @see #getMem()
     * @generated
     */
    EAttribute getMem_Total();

    /**
     * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Mem#getUsed <em>Used</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Used</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Mem#getUsed()
     * @see #getMem()
     * @generated
     */
    EAttribute getMem_Used();

    /**
     * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Mem#getCached <em>Cached</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Cached</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Mem#getCached()
     * @see #getMem()
     * @generated
     */
    EAttribute getMem_Cached();

    /**
     * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Mem#getBuffers <em>Buffers</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Buffers</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Mem#getBuffers()
     * @see #getMem()
     * @generated
     */
    EAttribute getMem_Buffers();

    /**
     * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Mem#getNFS_Unstable <em>NFS Unstable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>NFS Unstable</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Mem#getNFS_Unstable()
     * @see #getMem()
     * @generated
     */
    EAttribute getMem_NFS_Unstable();

    /**
     * Returns the meta object for class '{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.System <em>System</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>System</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.System
     * @generated
     */
    EClass getSystem();

    /**
     * Returns the meta object for the container reference '{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.System#getEContainer_system <em>EContainer system</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>EContainer system</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.System#getEContainer_system()
     * @see #getSystem()
     * @generated
     */
    EReference getSystem_EContainer_system();

    /**
     * Returns the meta object for the attribute list '{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.System#getText <em>Text</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Text</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.System#getText()
     * @see #getSystem()
     * @generated
     */
    EAttribute getSystem_Text();

    /**
     * Returns the meta object for the containment reference '{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.System#getMem <em>Mem</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Mem</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.System#getMem()
     * @see #getSystem()
     * @generated
     */
    EReference getSystem_Mem();

    /**
     * Returns the meta object for the containment reference '{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.System#getLoadavg <em>Loadavg</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Loadavg</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.System#getLoadavg()
     * @see #getSystem()
     * @generated
     */
    EReference getSystem_Loadavg();

    /**
     * Returns the meta object for the containment reference '{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.System#getCpu_usage <em>Cpu usage</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Cpu usage</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.System#getCpu_usage()
     * @see #getSystem()
     * @generated
     */
    EReference getSystem_Cpu_usage();

    /**
     * Returns the meta object for the containment reference '{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.System#getUptime <em>Uptime</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Uptime</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.System#getUptime()
     * @see #getSystem()
     * @generated
     */
    EReference getSystem_Uptime();

    /**
     * Returns the meta object for the containment reference '{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.System#getLinux <em>Linux</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Linux</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.System#getLinux()
     * @see #getSystem()
     * @generated
     */
    EReference getSystem_Linux();

    /**
     * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.System#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.System#getId()
     * @see #getSystem()
     * @generated
     */
    EAttribute getSystem_Id();

    /**
     * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.System#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.System#getName()
     * @see #getSystem()
     * @generated
     */
    EAttribute getSystem_Name();

    /**
     * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.System#getTime <em>Time</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Time</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.System#getTime()
     * @see #getSystem()
     * @generated
     */
    EAttribute getSystem_Time();

    /**
     * Returns the meta object for class '{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Systeminfo <em>Systeminfo</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Systeminfo</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Systeminfo
     * @generated
     */
    EClass getSysteminfo();

    /**
     * Returns the meta object for the containment reference '{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Systeminfo#getSystem <em>System</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>System</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Systeminfo#getSystem()
     * @see #getSysteminfo()
     * @generated
     */
    EReference getSysteminfo_System();

    /**
     * Returns the meta object for class '{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Uptime <em>Uptime</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Uptime</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Uptime
     * @generated
     */
    EClass getUptime();

    /**
     * Returns the meta object for the container reference '{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Uptime#getEContainer_uptime <em>EContainer uptime</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>EContainer uptime</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Uptime#getEContainer_uptime()
     * @see #getUptime()
     * @generated
     */
    EReference getUptime_EContainer_uptime();

    /**
     * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Uptime#getTotal <em>Total</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Total</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Uptime#getTotal()
     * @see #getUptime()
     * @generated
     */
    EAttribute getUptime_Total();

    /**
     * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Uptime#getIdle <em>Idle</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Idle</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Uptime#getIdle()
     * @see #getUptime()
     * @generated
     */
    EAttribute getUptime_Idle();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    Sys_info_systeminfoFactory getSys_info_systeminfoFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.impl.Cpu_usageImpl <em>Cpu usage</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.impl.Cpu_usageImpl
         * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.impl.Sys_info_systeminfoPackageImpl#getCpu_usage()
         * @generated
         */
        EClass CPU_USAGE = eINSTANCE.getCpu_usage();

        /**
         * The meta object literal for the '<em><b>EContainer cpu usage</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CPU_USAGE__ECONTAINER_CPU_USAGE = eINSTANCE.getCpu_usage_EContainer_cpu_usage();

        /**
         * The meta object literal for the '<em><b>Real</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CPU_USAGE__REAL = eINSTANCE.getCpu_usage_Real();

        /**
         * The meta object literal for the '<em><b>User</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CPU_USAGE__USER = eINSTANCE.getCpu_usage_User();

        /**
         * The meta object literal for the '<em><b>Sys</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CPU_USAGE__SYS = eINSTANCE.getCpu_usage_Sys();

        /**
         * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CPU_USAGE__UNIT = eINSTANCE.getCpu_usage_Unit();

        /**
         * The meta object literal for the '{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.impl.LinuxImpl <em>Linux</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.impl.LinuxImpl
         * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.impl.Sys_info_systeminfoPackageImpl#getLinux()
         * @generated
         */
        EClass LINUX = eINSTANCE.getLinux();

        /**
         * The meta object literal for the '<em><b>EContainer linux</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference LINUX__ECONTAINER_LINUX = eINSTANCE.getLinux_EContainer_linux();

        /**
         * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute LINUX__VERSION = eINSTANCE.getLinux_Version();

        /**
         * The meta object literal for the '{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.impl.LoadavgImpl <em>Loadavg</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.impl.LoadavgImpl
         * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.impl.Sys_info_systeminfoPackageImpl#getLoadavg()
         * @generated
         */
        EClass LOADAVG = eINSTANCE.getLoadavg();

        /**
         * The meta object literal for the '<em><b>EContainer loadavg</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference LOADAVG__ECONTAINER_LOADAVG = eINSTANCE.getLoadavg_EContainer_loadavg();

        /**
         * The meta object literal for the '<em><b>Onemin</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute LOADAVG__ONEMIN = eINSTANCE.getLoadavg_Onemin();

        /**
         * The meta object literal for the '<em><b>Fivemin</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute LOADAVG__FIVEMIN = eINSTANCE.getLoadavg_Fivemin();

        /**
         * The meta object literal for the '<em><b>Fifteen</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute LOADAVG__FIFTEEN = eINSTANCE.getLoadavg_Fifteen();

        /**
         * The meta object literal for the '{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.impl.MemImpl <em>Mem</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.impl.MemImpl
         * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.impl.Sys_info_systeminfoPackageImpl#getMem()
         * @generated
         */
        EClass MEM = eINSTANCE.getMem();

        /**
         * The meta object literal for the '<em><b>EContainer mem</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MEM__ECONTAINER_MEM = eINSTANCE.getMem_EContainer_mem();

        /**
         * The meta object literal for the '<em><b>Total</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MEM__TOTAL = eINSTANCE.getMem_Total();

        /**
         * The meta object literal for the '<em><b>Used</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MEM__USED = eINSTANCE.getMem_Used();

        /**
         * The meta object literal for the '<em><b>Cached</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MEM__CACHED = eINSTANCE.getMem_Cached();

        /**
         * The meta object literal for the '<em><b>Buffers</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MEM__BUFFERS = eINSTANCE.getMem_Buffers();

        /**
         * The meta object literal for the '<em><b>NFS Unstable</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MEM__NFS_UNSTABLE = eINSTANCE.getMem_NFS_Unstable();

        /**
         * The meta object literal for the '{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.impl.SystemImpl <em>System</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.impl.SystemImpl
         * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.impl.Sys_info_systeminfoPackageImpl#getSystem()
         * @generated
         */
        EClass SYSTEM = eINSTANCE.getSystem();

        /**
         * The meta object literal for the '<em><b>EContainer system</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SYSTEM__ECONTAINER_SYSTEM = eINSTANCE.getSystem_EContainer_system();

        /**
         * The meta object literal for the '<em><b>Text</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SYSTEM__TEXT = eINSTANCE.getSystem_Text();

        /**
         * The meta object literal for the '<em><b>Mem</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SYSTEM__MEM = eINSTANCE.getSystem_Mem();

        /**
         * The meta object literal for the '<em><b>Loadavg</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SYSTEM__LOADAVG = eINSTANCE.getSystem_Loadavg();

        /**
         * The meta object literal for the '<em><b>Cpu usage</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SYSTEM__CPU_USAGE = eINSTANCE.getSystem_Cpu_usage();

        /**
         * The meta object literal for the '<em><b>Uptime</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SYSTEM__UPTIME = eINSTANCE.getSystem_Uptime();

        /**
         * The meta object literal for the '<em><b>Linux</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SYSTEM__LINUX = eINSTANCE.getSystem_Linux();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SYSTEM__ID = eINSTANCE.getSystem_Id();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SYSTEM__NAME = eINSTANCE.getSystem_Name();

        /**
         * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SYSTEM__TIME = eINSTANCE.getSystem_Time();

        /**
         * The meta object literal for the '{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.impl.SysteminfoImpl <em>Systeminfo</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.impl.SysteminfoImpl
         * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.impl.Sys_info_systeminfoPackageImpl#getSysteminfo()
         * @generated
         */
        EClass SYSTEMINFO = eINSTANCE.getSysteminfo();

        /**
         * The meta object literal for the '<em><b>System</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SYSTEMINFO__SYSTEM = eINSTANCE.getSysteminfo_System();

        /**
         * The meta object literal for the '{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.impl.UptimeImpl <em>Uptime</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.impl.UptimeImpl
         * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.impl.Sys_info_systeminfoPackageImpl#getUptime()
         * @generated
         */
        EClass UPTIME = eINSTANCE.getUptime();

        /**
         * The meta object literal for the '<em><b>EContainer uptime</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference UPTIME__ECONTAINER_UPTIME = eINSTANCE.getUptime_EContainer_uptime();

        /**
         * The meta object literal for the '<em><b>Total</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute UPTIME__TOTAL = eINSTANCE.getUptime_Total();

        /**
         * The meta object literal for the '<em><b>Idle</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute UPTIME__IDLE = eINSTANCE.getUptime_Idle();

    }

} //Sys_info_systeminfoPackage
