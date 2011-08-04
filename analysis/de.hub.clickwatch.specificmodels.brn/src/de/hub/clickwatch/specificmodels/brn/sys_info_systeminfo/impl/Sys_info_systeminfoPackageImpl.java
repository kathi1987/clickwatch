/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.impl;

import de.hub.clickwatch.model.ClickWatchModelPackage;

import de.hub.clickwatch.specificmodels.brn.BrnPackage;

import de.hub.clickwatch.specificmodels.brn.device_wifi_data_power_systempower.Device_wifi_data_power_systempowerPackage;
import de.hub.clickwatch.specificmodels.brn.device_wifi_data_power_systempower.impl.Device_wifi_data_power_systempowerPackageImpl;
import de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Device_wifi_link_stat_bcast_statsPackage;

import de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.impl.Device_wifi_link_stat_bcast_statsPackageImpl;

import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage;

import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.Device_wifi_wifidevice_cst_statsPackageImpl;

import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_sc_systemchannel.Device_wifi_wifidevice_sc_systemchannelPackage;
import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_sc_systemchannel.impl.Device_wifi_wifidevice_sc_systemchannelPackageImpl;
import de.hub.clickwatch.specificmodels.brn.gps_gps_coord.Gps_gps_coordPackage;
import de.hub.clickwatch.specificmodels.brn.gps_gps_coord.impl.Gps_gps_coordPackageImpl;
import de.hub.clickwatch.specificmodels.brn.impl.BrnPackageImpl;

import de.hub.clickwatch.specificmodels.brn.lease_tab_leases.Lease_tab_leasesPackage;
import de.hub.clickwatch.specificmodels.brn.lease_tab_leases.impl.Lease_tab_leasesPackageImpl;
import de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Cpu_usage;
import de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Linux;
import de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Loadavg;
import de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Mem;
import de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Sys_info_systeminfoFactory;
import de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Sys_info_systeminfoPackage;
import de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Systeminfo;
import de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Uptime;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Sys_info_systeminfoPackageImpl extends EPackageImpl implements Sys_info_systeminfoPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cpu_usageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linuxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loadavgEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systeminfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uptimeEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Sys_info_systeminfoPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Sys_info_systeminfoPackageImpl() {
		super(eNS_URI, Sys_info_systeminfoFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link Sys_info_systeminfoPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Sys_info_systeminfoPackage init() {
		if (isInited) return (Sys_info_systeminfoPackage)EPackage.Registry.INSTANCE.getEPackage(Sys_info_systeminfoPackage.eNS_URI);

		// Obtain or create and register package
		Sys_info_systeminfoPackageImpl theSys_info_systeminfoPackage = (Sys_info_systeminfoPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Sys_info_systeminfoPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Sys_info_systeminfoPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ClickWatchModelPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		BrnPackageImpl theBrnPackage = (BrnPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BrnPackage.eNS_URI) instanceof BrnPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BrnPackage.eNS_URI) : BrnPackage.eINSTANCE);
		Device_wifi_link_stat_bcast_statsPackageImpl theDevice_wifi_link_stat_bcast_statsPackage = (Device_wifi_link_stat_bcast_statsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Device_wifi_link_stat_bcast_statsPackage.eNS_URI) instanceof Device_wifi_link_stat_bcast_statsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Device_wifi_link_stat_bcast_statsPackage.eNS_URI) : Device_wifi_link_stat_bcast_statsPackage.eINSTANCE);
		Device_wifi_wifidevice_cst_statsPackageImpl theDevice_wifi_wifidevice_cst_statsPackage = (Device_wifi_wifidevice_cst_statsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Device_wifi_wifidevice_cst_statsPackage.eNS_URI) instanceof Device_wifi_wifidevice_cst_statsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Device_wifi_wifidevice_cst_statsPackage.eNS_URI) : Device_wifi_wifidevice_cst_statsPackage.eINSTANCE);
		Gps_gps_coordPackageImpl theGps_gps_coordPackage = (Gps_gps_coordPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Gps_gps_coordPackage.eNS_URI) instanceof Gps_gps_coordPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Gps_gps_coordPackage.eNS_URI) : Gps_gps_coordPackage.eINSTANCE);
		Device_wifi_data_power_systempowerPackageImpl theDevice_wifi_data_power_systempowerPackage = (Device_wifi_data_power_systempowerPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Device_wifi_data_power_systempowerPackage.eNS_URI) instanceof Device_wifi_data_power_systempowerPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Device_wifi_data_power_systempowerPackage.eNS_URI) : Device_wifi_data_power_systempowerPackage.eINSTANCE);
		Device_wifi_wifidevice_sc_systemchannelPackageImpl theDevice_wifi_wifidevice_sc_systemchannelPackage = (Device_wifi_wifidevice_sc_systemchannelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Device_wifi_wifidevice_sc_systemchannelPackage.eNS_URI) instanceof Device_wifi_wifidevice_sc_systemchannelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Device_wifi_wifidevice_sc_systemchannelPackage.eNS_URI) : Device_wifi_wifidevice_sc_systemchannelPackage.eINSTANCE);
		Lease_tab_leasesPackageImpl theLease_tab_leasesPackage = (Lease_tab_leasesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Lease_tab_leasesPackage.eNS_URI) instanceof Lease_tab_leasesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Lease_tab_leasesPackage.eNS_URI) : Lease_tab_leasesPackage.eINSTANCE);

		// Create package meta-data objects
		theSys_info_systeminfoPackage.createPackageContents();
		theBrnPackage.createPackageContents();
		theDevice_wifi_link_stat_bcast_statsPackage.createPackageContents();
		theDevice_wifi_wifidevice_cst_statsPackage.createPackageContents();
		theGps_gps_coordPackage.createPackageContents();
		theDevice_wifi_data_power_systempowerPackage.createPackageContents();
		theDevice_wifi_wifidevice_sc_systemchannelPackage.createPackageContents();
		theLease_tab_leasesPackage.createPackageContents();

		// Initialize created meta-data
		theSys_info_systeminfoPackage.initializePackageContents();
		theBrnPackage.initializePackageContents();
		theDevice_wifi_link_stat_bcast_statsPackage.initializePackageContents();
		theDevice_wifi_wifidevice_cst_statsPackage.initializePackageContents();
		theGps_gps_coordPackage.initializePackageContents();
		theDevice_wifi_data_power_systempowerPackage.initializePackageContents();
		theDevice_wifi_wifidevice_sc_systemchannelPackage.initializePackageContents();
		theLease_tab_leasesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSys_info_systeminfoPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Sys_info_systeminfoPackage.eNS_URI, theSys_info_systeminfoPackage);
		return theSys_info_systeminfoPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCpu_usage() {
		return cpu_usageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCpu_usage_EContainer_cpu_usage() {
		return (EReference)cpu_usageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCpu_usage_Real() {
		return (EAttribute)cpu_usageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCpu_usage_User() {
		return (EAttribute)cpu_usageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCpu_usage_Sys() {
		return (EAttribute)cpu_usageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCpu_usage_Unit() {
		return (EAttribute)cpu_usageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinux() {
		return linuxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinux_EContainer_linux() {
		return (EReference)linuxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinux_Version() {
		return (EAttribute)linuxEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoadavg() {
		return loadavgEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoadavg_EContainer_loadavg() {
		return (EReference)loadavgEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoadavg_Onemin() {
		return (EAttribute)loadavgEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoadavg_Fivemin() {
		return (EAttribute)loadavgEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoadavg_Fifteen() {
		return (EAttribute)loadavgEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMem() {
		return memEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMem_EContainer_mem() {
		return (EReference)memEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMem_Total() {
		return (EAttribute)memEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMem_Used() {
		return (EAttribute)memEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMem_Cached() {
		return (EAttribute)memEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMem_Buffers() {
		return (EAttribute)memEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMem_NFS_Unstable() {
		return (EAttribute)memEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystem() {
		return systemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_EContainer_system() {
		return (EReference)systemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystem_Text() {
		return (EAttribute)systemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_Mem() {
		return (EReference)systemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_Loadavg() {
		return (EReference)systemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_Cpu_usage() {
		return (EReference)systemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_Uptime() {
		return (EReference)systemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_Linux() {
		return (EReference)systemEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystem_Id() {
		return (EAttribute)systemEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystem_Name() {
		return (EAttribute)systemEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystem_Time() {
		return (EAttribute)systemEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSysteminfo() {
		return systeminfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSysteminfo_System() {
		return (EReference)systeminfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUptime() {
		return uptimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUptime_EContainer_uptime() {
		return (EReference)uptimeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUptime_Total() {
		return (EAttribute)uptimeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUptime_Idle() {
		return (EAttribute)uptimeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sys_info_systeminfoFactory getSys_info_systeminfoFactory() {
		return (Sys_info_systeminfoFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		cpu_usageEClass = createEClass(CPU_USAGE);
		createEReference(cpu_usageEClass, CPU_USAGE__ECONTAINER_CPU_USAGE);
		createEAttribute(cpu_usageEClass, CPU_USAGE__REAL);
		createEAttribute(cpu_usageEClass, CPU_USAGE__USER);
		createEAttribute(cpu_usageEClass, CPU_USAGE__SYS);
		createEAttribute(cpu_usageEClass, CPU_USAGE__UNIT);

		linuxEClass = createEClass(LINUX);
		createEReference(linuxEClass, LINUX__ECONTAINER_LINUX);
		createEAttribute(linuxEClass, LINUX__VERSION);

		loadavgEClass = createEClass(LOADAVG);
		createEReference(loadavgEClass, LOADAVG__ECONTAINER_LOADAVG);
		createEAttribute(loadavgEClass, LOADAVG__ONEMIN);
		createEAttribute(loadavgEClass, LOADAVG__FIVEMIN);
		createEAttribute(loadavgEClass, LOADAVG__FIFTEEN);

		memEClass = createEClass(MEM);
		createEReference(memEClass, MEM__ECONTAINER_MEM);
		createEAttribute(memEClass, MEM__TOTAL);
		createEAttribute(memEClass, MEM__USED);
		createEAttribute(memEClass, MEM__CACHED);
		createEAttribute(memEClass, MEM__BUFFERS);
		createEAttribute(memEClass, MEM__NFS_UNSTABLE);

		systemEClass = createEClass(SYSTEM);
		createEReference(systemEClass, SYSTEM__ECONTAINER_SYSTEM);
		createEAttribute(systemEClass, SYSTEM__TEXT);
		createEReference(systemEClass, SYSTEM__MEM);
		createEReference(systemEClass, SYSTEM__LOADAVG);
		createEReference(systemEClass, SYSTEM__CPU_USAGE);
		createEReference(systemEClass, SYSTEM__UPTIME);
		createEReference(systemEClass, SYSTEM__LINUX);
		createEAttribute(systemEClass, SYSTEM__ID);
		createEAttribute(systemEClass, SYSTEM__NAME);
		createEAttribute(systemEClass, SYSTEM__TIME);

		systeminfoEClass = createEClass(SYSTEMINFO);
		createEReference(systeminfoEClass, SYSTEMINFO__SYSTEM);

		uptimeEClass = createEClass(UPTIME);
		createEReference(uptimeEClass, UPTIME__ECONTAINER_UPTIME);
		createEAttribute(uptimeEClass, UPTIME__TOTAL);
		createEAttribute(uptimeEClass, UPTIME__IDLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ClickWatchModelPackage theClickWatchModelPackage = (ClickWatchModelPackage)EPackage.Registry.INSTANCE.getEPackage(ClickWatchModelPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		systeminfoEClass.getESuperTypes().add(theClickWatchModelPackage.getHandler());

		// Initialize classes and features; add operations and parameters
		initEClass(cpu_usageEClass, Cpu_usage.class, "Cpu_usage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCpu_usage_EContainer_cpu_usage(), this.getSystem(), this.getSystem_Cpu_usage(), "eContainer_cpu_usage", null, 0, 1, Cpu_usage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCpu_usage_Real(), ecorePackage.getEDouble(), "real", null, 0, 1, Cpu_usage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCpu_usage_User(), ecorePackage.getEDouble(), "user", null, 0, 1, Cpu_usage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCpu_usage_Sys(), ecorePackage.getEDouble(), "sys", null, 0, 1, Cpu_usage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCpu_usage_Unit(), ecorePackage.getEString(), "unit", null, 0, 1, Cpu_usage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linuxEClass, Linux.class, "Linux", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLinux_EContainer_linux(), this.getSystem(), this.getSystem_Linux(), "eContainer_linux", null, 0, 1, Linux.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinux_Version(), ecorePackage.getEString(), "version", null, 0, 1, Linux.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(loadavgEClass, Loadavg.class, "Loadavg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLoadavg_EContainer_loadavg(), this.getSystem(), this.getSystem_Loadavg(), "eContainer_loadavg", null, 0, 1, Loadavg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLoadavg_Onemin(), ecorePackage.getEDouble(), "onemin", null, 0, 1, Loadavg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLoadavg_Fivemin(), ecorePackage.getEDouble(), "fivemin", null, 0, 1, Loadavg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLoadavg_Fifteen(), ecorePackage.getEDouble(), "fifteen", null, 0, 1, Loadavg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(memEClass, Mem.class, "Mem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMem_EContainer_mem(), this.getSystem(), this.getSystem_Mem(), "eContainer_mem", null, 0, 1, Mem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMem_Total(), ecorePackage.getEInt(), "total", null, 0, 1, Mem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMem_Used(), ecorePackage.getEInt(), "used", null, 0, 1, Mem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMem_Cached(), ecorePackage.getEInt(), "cached", null, 0, 1, Mem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMem_Buffers(), ecorePackage.getEInt(), "buffers", null, 0, 1, Mem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMem_NFS_Unstable(), ecorePackage.getEInt(), "nFS_Unstable", null, 0, 1, Mem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemEClass, de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.System.class, "System", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystem_EContainer_system(), this.getSysteminfo(), this.getSysteminfo_System(), "eContainer_system", null, 0, 1, de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystem_Text(), ecorePackage.getEString(), "text", null, 0, -1, de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_Mem(), this.getMem(), this.getMem_EContainer_mem(), "mem", null, 0, 1, de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_Loadavg(), this.getLoadavg(), this.getLoadavg_EContainer_loadavg(), "loadavg", null, 0, 1, de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_Cpu_usage(), this.getCpu_usage(), this.getCpu_usage_EContainer_cpu_usage(), "cpu_usage", null, 0, 1, de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_Uptime(), this.getUptime(), this.getUptime_EContainer_uptime(), "uptime", null, 0, 1, de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_Linux(), this.getLinux(), this.getLinux_EContainer_linux(), "linux", null, 0, 1, de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystem_Id(), ecorePackage.getEString(), "id", null, 0, 1, de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystem_Name(), ecorePackage.getEString(), "name", null, 0, 1, de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystem_Time(), ecorePackage.getEDouble(), "time", null, 0, 1, de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systeminfoEClass, Systeminfo.class, "Systeminfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSysteminfo_System(), this.getSystem(), this.getSystem_EContainer_system(), "system", null, 0, 1, Systeminfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uptimeEClass, Uptime.class, "Uptime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUptime_EContainer_uptime(), this.getSystem(), this.getSystem_Uptime(), "eContainer_uptime", null, 0, 1, Uptime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUptime_Total(), ecorePackage.getEDouble(), "total", null, 0, 1, Uptime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUptime_Idle(), ecorePackage.getEDouble(), "idle", null, 0, 1, Uptime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create annotations
		// http://de.hub.clickwatch.specificmodels
		createDeAnnotations();
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://de.hub.clickwatch.specificmodels</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDeAnnotations() {
		String source = "http://de.hub.clickwatch.specificmodels";		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "handler_class", "Systeminfo"
		   });		
		addAnnotation
		  (cpu_usageEClass, 
		   source, 
		   new String[] {
			 "target_id", "Systeminfo|Handler/system|system:System|EObject/cpu_usage|cpu_usage:Cpu_usage|EObject"
		   });		
		addAnnotation
		  (getCpu_usage_Real(), 
		   source, 
		   new String[] {
			 "target_id", "Systeminfo|Handler/system|system:System|EObject/cpu_usage|cpu_usage:Cpu_usage|EObject/real|real:"
		   });		
		addAnnotation
		  (getCpu_usage_User(), 
		   source, 
		   new String[] {
			 "target_id", "Systeminfo|Handler/system|system:System|EObject/cpu_usage|cpu_usage:Cpu_usage|EObject/user|user:"
		   });		
		addAnnotation
		  (getCpu_usage_Sys(), 
		   source, 
		   new String[] {
			 "target_id", "Systeminfo|Handler/system|system:System|EObject/cpu_usage|cpu_usage:Cpu_usage|EObject/sys|sys:"
		   });		
		addAnnotation
		  (getCpu_usage_Unit(), 
		   source, 
		   new String[] {
			 "target_id", "Systeminfo|Handler/system|system:System|EObject/cpu_usage|cpu_usage:Cpu_usage|EObject/unit|unit:"
		   });		
		addAnnotation
		  (linuxEClass, 
		   source, 
		   new String[] {
			 "target_id", "Systeminfo|Handler/system|system:System|EObject/linux|linux:Linux|EObject"
		   });		
		addAnnotation
		  (getLinux_Version(), 
		   source, 
		   new String[] {
			 "target_id", "Systeminfo|Handler/system|system:System|EObject/linux|linux:Linux|EObject/version|version:"
		   });		
		addAnnotation
		  (loadavgEClass, 
		   source, 
		   new String[] {
			 "target_id", "Systeminfo|Handler/system|system:System|EObject/loadavg|loadavg:Loadavg|EObject"
		   });		
		addAnnotation
		  (getLoadavg_Onemin(), 
		   source, 
		   new String[] {
			 "target_id", "Systeminfo|Handler/system|system:System|EObject/loadavg|loadavg:Loadavg|EObject/onemin|onemin:"
		   });		
		addAnnotation
		  (getLoadavg_Fivemin(), 
		   source, 
		   new String[] {
			 "target_id", "Systeminfo|Handler/system|system:System|EObject/loadavg|loadavg:Loadavg|EObject/fivemin|fivemin:"
		   });		
		addAnnotation
		  (getLoadavg_Fifteen(), 
		   source, 
		   new String[] {
			 "target_id", "Systeminfo|Handler/system|system:System|EObject/loadavg|loadavg:Loadavg|EObject/fifteen|fifteen:"
		   });		
		addAnnotation
		  (memEClass, 
		   source, 
		   new String[] {
			 "target_id", "Systeminfo|Handler/system|system:System|EObject/mem|mem:Mem|EObject"
		   });		
		addAnnotation
		  (getMem_Total(), 
		   source, 
		   new String[] {
			 "target_id", "Systeminfo|Handler/system|system:System|EObject/mem|mem:Mem|EObject/total|total:"
		   });		
		addAnnotation
		  (getMem_Used(), 
		   source, 
		   new String[] {
			 "target_id", "Systeminfo|Handler/system|system:System|EObject/mem|mem:Mem|EObject/used|used:"
		   });		
		addAnnotation
		  (getMem_Cached(), 
		   source, 
		   new String[] {
			 "target_id", "Systeminfo|Handler/system|system:System|EObject/mem|mem:Mem|EObject/cached|cached:"
		   });		
		addAnnotation
		  (getMem_Buffers(), 
		   source, 
		   new String[] {
			 "target_id", "Systeminfo|Handler/system|system:System|EObject/mem|mem:Mem|EObject/buffers|buffers:"
		   });		
		addAnnotation
		  (getMem_NFS_Unstable(), 
		   source, 
		   new String[] {
			 "target_id", "Systeminfo|Handler/system|system:System|EObject/mem|mem:Mem|EObject/nFS_Unstable|NFS_Unstable:"
		   });			
		addAnnotation
		  (systemEClass, 
		   source, 
		   new String[] {
			 "target_id", "Systeminfo|Handler/system|system:System|EObject"
		   });		
		addAnnotation
		  (getSystem_Text(), 
		   source, 
		   new String[] {
			 "target_id", "Systeminfo|Handler/system|system:System|EObject/text|text:"
		   });		
		addAnnotation
		  (getSystem_Mem(), 
		   source, 
		   new String[] {
			 "target_id", "Systeminfo|Handler/system|system:System|EObject/mem|mem:Mem|EObject",
			 "IsCopy", "false"
		   });		
		addAnnotation
		  (getSystem_Loadavg(), 
		   source, 
		   new String[] {
			 "target_id", "Systeminfo|Handler/system|system:System|EObject/loadavg|loadavg:Loadavg|EObject",
			 "IsCopy", "false"
		   });		
		addAnnotation
		  (getSystem_Cpu_usage(), 
		   source, 
		   new String[] {
			 "target_id", "Systeminfo|Handler/system|system:System|EObject/cpu_usage|cpu_usage:Cpu_usage|EObject",
			 "IsCopy", "false"
		   });		
		addAnnotation
		  (getSystem_Uptime(), 
		   source, 
		   new String[] {
			 "target_id", "Systeminfo|Handler/system|system:System|EObject/uptime|uptime:Uptime|EObject",
			 "IsCopy", "false"
		   });		
		addAnnotation
		  (getSystem_Linux(), 
		   source, 
		   new String[] {
			 "target_id", "Systeminfo|Handler/system|system:System|EObject/linux|linux:Linux|EObject",
			 "IsCopy", "false"
		   });		
		addAnnotation
		  (getSystem_Id(), 
		   source, 
		   new String[] {
			 "target_id", "Systeminfo|Handler/system|system:System|EObject/id|id:"
		   });		
		addAnnotation
		  (getSystem_Name(), 
		   source, 
		   new String[] {
			 "target_id", "Systeminfo|Handler/system|system:System|EObject/name|name:"
		   });		
		addAnnotation
		  (getSystem_Time(), 
		   source, 
		   new String[] {
			 "target_id", "Systeminfo|Handler/system|system:System|EObject/time|time:"
		   });		
		addAnnotation
		  (systeminfoEClass, 
		   source, 
		   new String[] {
			 "target_id", "Systeminfo|Handler"
		   });		
		addAnnotation
		  (getSysteminfo_System(), 
		   source, 
		   new String[] {
			 "target_id", "Systeminfo|Handler/system|system:System|EObject",
			 "IsCopy", "false"
		   });		
		addAnnotation
		  (uptimeEClass, 
		   source, 
		   new String[] {
			 "target_id", "Systeminfo|Handler/system|system:System|EObject/uptime|uptime:Uptime|EObject"
		   });		
		addAnnotation
		  (getUptime_Total(), 
		   source, 
		   new String[] {
			 "target_id", "Systeminfo|Handler/system|system:System|EObject/uptime|uptime:Uptime|EObject/total|total:"
		   });		
		addAnnotation
		  (getUptime_Idle(), 
		   source, 
		   new String[] {
			 "target_id", "Systeminfo|Handler/system|system:System|EObject/uptime|uptime:Uptime|EObject/idle|idle:"
		   });
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";																				
		addAnnotation
		  (getMem_NFS_Unstable(), 
		   source, 
		   new String[] {
			 "name", "NFS_Unstable",
			 "kind", "attribute"
		   });															
	}

} //Sys_info_systeminfoPackageImpl
