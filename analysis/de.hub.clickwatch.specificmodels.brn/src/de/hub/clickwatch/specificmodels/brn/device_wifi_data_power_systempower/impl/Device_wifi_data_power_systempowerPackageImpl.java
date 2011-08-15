/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.device_wifi_data_power_systempower.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import de.hub.clickwatch.model.ClickWatchModelPackage;
import de.hub.clickwatch.specificmodels.brn.BrnPackage;
import de.hub.clickwatch.specificmodels.brn.device_wifi_data_power_systempower.Device;
import de.hub.clickwatch.specificmodels.brn.device_wifi_data_power_systempower.Device_wifi_data_power_systempowerFactory;
import de.hub.clickwatch.specificmodels.brn.device_wifi_data_power_systempower.Device_wifi_data_power_systempowerPackage;
import de.hub.clickwatch.specificmodels.brn.device_wifi_data_power_systempower.Settxpower;
import de.hub.clickwatch.specificmodels.brn.device_wifi_data_power_systempower.Systempower;
import de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Device_wifi_link_stat_bcast_statsPackage;
import de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.impl.Device_wifi_link_stat_bcast_statsPackageImpl;
import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage;
import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.Device_wifi_wifidevice_cst_statsPackageImpl;
import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_sc_systemchannel.Device_wifi_wifidevice_sc_systemchannelPackage;
import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_sc_systemchannel.impl.Device_wifi_wifidevice_sc_systemchannelPackageImpl;
import de.hub.clickwatch.specificmodels.brn.gps_cart_coord.Gps_cart_coordPackage;
import de.hub.clickwatch.specificmodels.brn.gps_cart_coord.impl.Gps_cart_coordPackageImpl;
import de.hub.clickwatch.specificmodels.brn.gps_gps_coord.Gps_gps_coordPackage;
import de.hub.clickwatch.specificmodels.brn.gps_gps_coord.impl.Gps_gps_coordPackageImpl;
import de.hub.clickwatch.specificmodels.brn.impl.BrnPackageImpl;
import de.hub.clickwatch.specificmodels.brn.lease_tab_leases.Lease_tab_leasesPackage;
import de.hub.clickwatch.specificmodels.brn.lease_tab_leases.impl.Lease_tab_leasesPackageImpl;
import de.hub.clickwatch.specificmodels.brn.lt_links.Lt_linksPackage;
import de.hub.clickwatch.specificmodels.brn.lt_links.impl.Lt_linksPackageImpl;
import de.hub.clickwatch.specificmodels.brn.lt_routes.Lt_routesPackage;
import de.hub.clickwatch.specificmodels.brn.lt_routes.impl.Lt_routesPackageImpl;
import de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Sys_info_systeminfoPackage;
import de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.impl.Sys_info_systeminfoPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Device_wifi_data_power_systempowerPackageImpl extends EPackageImpl implements Device_wifi_data_power_systempowerPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass settxpowerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systempowerEClass = null;

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
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_data_power_systempower.Device_wifi_data_power_systempowerPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Device_wifi_data_power_systempowerPackageImpl() {
		super(eNS_URI, Device_wifi_data_power_systempowerFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Device_wifi_data_power_systempowerPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Device_wifi_data_power_systempowerPackage init() {
		if (isInited) return (Device_wifi_data_power_systempowerPackage)EPackage.Registry.INSTANCE.getEPackage(Device_wifi_data_power_systempowerPackage.eNS_URI);

		// Obtain or create and register package
		Device_wifi_data_power_systempowerPackageImpl theDevice_wifi_data_power_systempowerPackage = (Device_wifi_data_power_systempowerPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Device_wifi_data_power_systempowerPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Device_wifi_data_power_systempowerPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ClickWatchModelPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		BrnPackageImpl theBrnPackage = (BrnPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BrnPackage.eNS_URI) instanceof BrnPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BrnPackage.eNS_URI) : BrnPackage.eINSTANCE);
		Sys_info_systeminfoPackageImpl theSys_info_systeminfoPackage = (Sys_info_systeminfoPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Sys_info_systeminfoPackage.eNS_URI) instanceof Sys_info_systeminfoPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Sys_info_systeminfoPackage.eNS_URI) : Sys_info_systeminfoPackage.eINSTANCE);
		Device_wifi_wifidevice_sc_systemchannelPackageImpl theDevice_wifi_wifidevice_sc_systemchannelPackage = (Device_wifi_wifidevice_sc_systemchannelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Device_wifi_wifidevice_sc_systemchannelPackage.eNS_URI) instanceof Device_wifi_wifidevice_sc_systemchannelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Device_wifi_wifidevice_sc_systemchannelPackage.eNS_URI) : Device_wifi_wifidevice_sc_systemchannelPackage.eINSTANCE);
		Lease_tab_leasesPackageImpl theLease_tab_leasesPackage = (Lease_tab_leasesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Lease_tab_leasesPackage.eNS_URI) instanceof Lease_tab_leasesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Lease_tab_leasesPackage.eNS_URI) : Lease_tab_leasesPackage.eINSTANCE);
		Gps_gps_coordPackageImpl theGps_gps_coordPackage = (Gps_gps_coordPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Gps_gps_coordPackage.eNS_URI) instanceof Gps_gps_coordPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Gps_gps_coordPackage.eNS_URI) : Gps_gps_coordPackage.eINSTANCE);
		Gps_cart_coordPackageImpl theGps_cart_coordPackage = (Gps_cart_coordPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Gps_cart_coordPackage.eNS_URI) instanceof Gps_cart_coordPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Gps_cart_coordPackage.eNS_URI) : Gps_cart_coordPackage.eINSTANCE);
		Lt_routesPackageImpl theLt_routesPackage = (Lt_routesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Lt_routesPackage.eNS_URI) instanceof Lt_routesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Lt_routesPackage.eNS_URI) : Lt_routesPackage.eINSTANCE);
		Lt_linksPackageImpl theLt_linksPackage = (Lt_linksPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Lt_linksPackage.eNS_URI) instanceof Lt_linksPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Lt_linksPackage.eNS_URI) : Lt_linksPackage.eINSTANCE);
		Device_wifi_link_stat_bcast_statsPackageImpl theDevice_wifi_link_stat_bcast_statsPackage = (Device_wifi_link_stat_bcast_statsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Device_wifi_link_stat_bcast_statsPackage.eNS_URI) instanceof Device_wifi_link_stat_bcast_statsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Device_wifi_link_stat_bcast_statsPackage.eNS_URI) : Device_wifi_link_stat_bcast_statsPackage.eINSTANCE);
		Device_wifi_wifidevice_cst_statsPackageImpl theDevice_wifi_wifidevice_cst_statsPackage = (Device_wifi_wifidevice_cst_statsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Device_wifi_wifidevice_cst_statsPackage.eNS_URI) instanceof Device_wifi_wifidevice_cst_statsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Device_wifi_wifidevice_cst_statsPackage.eNS_URI) : Device_wifi_wifidevice_cst_statsPackage.eINSTANCE);

		// Create package meta-data objects
		theDevice_wifi_data_power_systempowerPackage.createPackageContents();
		theBrnPackage.createPackageContents();
		theSys_info_systeminfoPackage.createPackageContents();
		theDevice_wifi_wifidevice_sc_systemchannelPackage.createPackageContents();
		theLease_tab_leasesPackage.createPackageContents();
		theGps_gps_coordPackage.createPackageContents();
		theGps_cart_coordPackage.createPackageContents();
		theLt_routesPackage.createPackageContents();
		theLt_linksPackage.createPackageContents();
		theDevice_wifi_link_stat_bcast_statsPackage.createPackageContents();
		theDevice_wifi_wifidevice_cst_statsPackage.createPackageContents();

		// Initialize created meta-data
		theDevice_wifi_data_power_systempowerPackage.initializePackageContents();
		theBrnPackage.initializePackageContents();
		theSys_info_systeminfoPackage.initializePackageContents();
		theDevice_wifi_wifidevice_sc_systemchannelPackage.initializePackageContents();
		theLease_tab_leasesPackage.initializePackageContents();
		theGps_gps_coordPackage.initializePackageContents();
		theGps_cart_coordPackage.initializePackageContents();
		theLt_routesPackage.initializePackageContents();
		theLt_linksPackage.initializePackageContents();
		theDevice_wifi_link_stat_bcast_statsPackage.initializePackageContents();
		theDevice_wifi_wifidevice_cst_statsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDevice_wifi_data_power_systempowerPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Device_wifi_data_power_systempowerPackage.eNS_URI, theDevice_wifi_data_power_systempowerPackage);
		return theDevice_wifi_data_power_systempowerPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDevice() {
		return deviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevice_EContainer_device() {
		return (EReference)deviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDevice_Name() {
		return (EAttribute)deviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDevice_Device_addr() {
		return (EAttribute)deviceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSettxpower() {
		return settxpowerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSettxpower_EContainer_settxpower() {
		return (EReference)settxpowerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSettxpower_Text() {
		return (EAttribute)settxpowerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSettxpower_Device() {
		return (EReference)settxpowerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSettxpower_Name() {
		return (EAttribute)settxpowerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSettxpower_Id() {
		return (EAttribute)settxpowerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSettxpower_Power() {
		return (EAttribute)settxpowerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystempower() {
		return systempowerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystempower_Settxpower() {
		return (EReference)systempowerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Device_wifi_data_power_systempowerFactory getDevice_wifi_data_power_systempowerFactory() {
		return (Device_wifi_data_power_systempowerFactory)getEFactoryInstance();
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
		deviceEClass = createEClass(DEVICE);
		createEReference(deviceEClass, DEVICE__ECONTAINER_DEVICE);
		createEAttribute(deviceEClass, DEVICE__NAME);
		createEAttribute(deviceEClass, DEVICE__DEVICE_ADDR);

		settxpowerEClass = createEClass(SETTXPOWER);
		createEReference(settxpowerEClass, SETTXPOWER__ECONTAINER_SETTXPOWER);
		createEAttribute(settxpowerEClass, SETTXPOWER__TEXT);
		createEReference(settxpowerEClass, SETTXPOWER__DEVICE);
		createEAttribute(settxpowerEClass, SETTXPOWER__NAME);
		createEAttribute(settxpowerEClass, SETTXPOWER__ID);
		createEAttribute(settxpowerEClass, SETTXPOWER__POWER);

		systempowerEClass = createEClass(SYSTEMPOWER);
		createEReference(systempowerEClass, SYSTEMPOWER__SETTXPOWER);
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
		systempowerEClass.getESuperTypes().add(theClickWatchModelPackage.getHandler());

		// Initialize classes and features; add operations and parameters
		initEClass(deviceEClass, Device.class, "Device", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDevice_EContainer_device(), this.getSettxpower(), this.getSettxpower_Device(), "eContainer_device", null, 0, 1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDevice_Name(), ecorePackage.getEString(), "name", null, 0, 1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDevice_Device_addr(), ecorePackage.getEString(), "device_addr", null, 0, 1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(settxpowerEClass, Settxpower.class, "Settxpower", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSettxpower_EContainer_settxpower(), this.getSystempower(), this.getSystempower_Settxpower(), "eContainer_settxpower", null, 0, 1, Settxpower.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSettxpower_Text(), ecorePackage.getEString(), "text", null, 0, -1, Settxpower.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSettxpower_Device(), this.getDevice(), this.getDevice_EContainer_device(), "device", null, 0, 1, Settxpower.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSettxpower_Name(), ecorePackage.getEString(), "name", null, 0, 1, Settxpower.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSettxpower_Id(), ecorePackage.getEString(), "id", null, 0, 1, Settxpower.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSettxpower_Power(), ecorePackage.getEInt(), "power", null, 0, 1, Settxpower.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systempowerEClass, Systempower.class, "Systempower", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystempower_Settxpower(), this.getSettxpower(), this.getSettxpower_EContainer_settxpower(), "settxpower", null, 0, 1, Systempower.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create annotations
		// http://de.hub.clickwatch.specificmodels
		createDeAnnotations();
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
			 "handler_class", "Systempower"
		   });		
		addAnnotation
		  (deviceEClass, 
		   source, 
		   new String[] {
			 "target_id", "Systempower|Handler/settxpower|settxpower:Settxpower|EObject/device|device:Device|EObject"
		   });		
		addAnnotation
		  (getDevice_Name(), 
		   source, 
		   new String[] {
			 "target_id", "Systempower|Handler/settxpower|settxpower:Settxpower|EObject/device|device:Device|EObject/name|name:"
		   });		
		addAnnotation
		  (getDevice_Device_addr(), 
		   source, 
		   new String[] {
			 "target_id", "Systempower|Handler/settxpower|settxpower:Settxpower|EObject/device|device:Device|EObject/device_addr|device_addr:"
		   });		
		addAnnotation
		  (settxpowerEClass, 
		   source, 
		   new String[] {
			 "target_id", "Systempower|Handler/settxpower|settxpower:Settxpower|EObject"
		   });		
		addAnnotation
		  (getSettxpower_Text(), 
		   source, 
		   new String[] {
			 "target_id", "Systempower|Handler/settxpower|settxpower:Settxpower|EObject/text|text:"
		   });		
		addAnnotation
		  (getSettxpower_Device(), 
		   source, 
		   new String[] {
			 "target_id", "Systempower|Handler/settxpower|settxpower:Settxpower|EObject/device|device:Device|EObject",
			 "IsCopy", "false"
		   });		
		addAnnotation
		  (getSettxpower_Name(), 
		   source, 
		   new String[] {
			 "target_id", "Systempower|Handler/settxpower|settxpower:Settxpower|EObject/name|name:"
		   });		
		addAnnotation
		  (getSettxpower_Id(), 
		   source, 
		   new String[] {
			 "target_id", "Systempower|Handler/settxpower|settxpower:Settxpower|EObject/id|id:"
		   });		
		addAnnotation
		  (getSettxpower_Power(), 
		   source, 
		   new String[] {
			 "target_id", "Systempower|Handler/settxpower|settxpower:Settxpower|EObject/power|power:"
		   });		
		addAnnotation
		  (systempowerEClass, 
		   source, 
		   new String[] {
			 "target_id", "Systempower|Handler"
		   });		
		addAnnotation
		  (getSystempower_Settxpower(), 
		   source, 
		   new String[] {
			 "target_id", "Systempower|Handler/settxpower|settxpower:Settxpower|EObject",
			 "IsCopy", "false"
		   });
	}

} //Device_wifi_data_power_systempowerPackageImpl
