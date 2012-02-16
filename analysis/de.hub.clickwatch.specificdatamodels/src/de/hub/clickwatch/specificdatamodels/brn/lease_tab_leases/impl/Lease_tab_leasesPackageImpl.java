/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificdatamodels.brn.lease_tab_leases.impl;

import de.hub.clickwatch.datamodel.ClickWatchDataModelPackage;

import de.hub.clickwatch.specificdatamodels.brn.BrnPackage;

import de.hub.clickwatch.specificdatamodels.brn.device_wifi_data_power_systempower.Device_wifi_data_power_systempowerPackage;

import de.hub.clickwatch.specificdatamodels.brn.device_wifi_data_power_systempower.impl.Device_wifi_data_power_systempowerPackageImpl;

import de.hub.clickwatch.specificdatamodels.brn.device_wifi_link_stat_bcast_stats.Device_wifi_link_stat_bcast_statsPackage;

import de.hub.clickwatch.specificdatamodels.brn.device_wifi_link_stat_bcast_stats.impl.Device_wifi_link_stat_bcast_statsPackageImpl;

import de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage;

import de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.impl.Device_wifi_wifidevice_cst_statsPackageImpl;

import de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_sc_systemchannel.Device_wifi_wifidevice_sc_systemchannelPackage;

import de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_sc_systemchannel.impl.Device_wifi_wifidevice_sc_systemchannelPackageImpl;

import de.hub.clickwatch.specificdatamodels.brn.gps_cart_coord.Gps_cart_coordPackage;

import de.hub.clickwatch.specificdatamodels.brn.gps_cart_coord.impl.Gps_cart_coordPackageImpl;

import de.hub.clickwatch.specificdatamodels.brn.gps_gps_coord.Gps_gps_coordPackage;

import de.hub.clickwatch.specificdatamodels.brn.gps_gps_coord.impl.Gps_gps_coordPackageImpl;

import de.hub.clickwatch.specificdatamodels.brn.impl.BrnPackageImpl;

import de.hub.clickwatch.specificdatamodels.brn.lease_tab_leases.Client;
import de.hub.clickwatch.specificdatamodels.brn.lease_tab_leases.Dhcpleases;
import de.hub.clickwatch.specificdatamodels.brn.lease_tab_leases.Lease_tab_leasesFactory;
import de.hub.clickwatch.specificdatamodels.brn.lease_tab_leases.Lease_tab_leasesPackage;
import de.hub.clickwatch.specificdatamodels.brn.lease_tab_leases.Leases;

import de.hub.clickwatch.specificdatamodels.brn.lt_links.Lt_linksPackage;

import de.hub.clickwatch.specificdatamodels.brn.lt_links.impl.Lt_linksPackageImpl;

import de.hub.clickwatch.specificdatamodels.brn.lt_routes.Lt_routesPackage;

import de.hub.clickwatch.specificdatamodels.brn.lt_routes.impl.Lt_routesPackageImpl;

import de.hub.clickwatch.specificdatamodels.brn.routing_dsr_stats_stats.Routing_dsr_stats_statsPackage;

import de.hub.clickwatch.specificdatamodels.brn.routing_dsr_stats_stats.impl.Routing_dsr_stats_statsPackageImpl;

import de.hub.clickwatch.specificdatamodels.brn.seismo_localchannelinfo.Seismo_localchannelinfoPackage;

import de.hub.clickwatch.specificdatamodels.brn.seismo_localchannelinfo.impl.Seismo_localchannelinfoPackageImpl;

import de.hub.clickwatch.specificdatamodels.brn.sf_stats.Sf_statsPackage;

import de.hub.clickwatch.specificdatamodels.brn.sf_stats.impl.Sf_statsPackageImpl;

import de.hub.clickwatch.specificdatamodels.brn.sys_info_systeminfo.Sys_info_systeminfoPackage;

import de.hub.clickwatch.specificdatamodels.brn.sys_info_systeminfo.impl.Sys_info_systeminfoPackageImpl;

import de.hub.clickwatch.specificdatamodels.brn.tsi_syncinfo.Tsi_syncinfoPackage;

import de.hub.clickwatch.specificdatamodels.brn.tsi_syncinfo.impl.Tsi_syncinfoPackageImpl;

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
public class Lease_tab_leasesPackageImpl extends EPackageImpl implements Lease_tab_leasesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dhcpleasesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass leasesEClass = null;

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
	 * @see de.hub.clickwatch.specificdatamodels.brn.lease_tab_leases.Lease_tab_leasesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Lease_tab_leasesPackageImpl() {
		super(eNS_URI, Lease_tab_leasesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Lease_tab_leasesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Lease_tab_leasesPackage init() {
		if (isInited) return (Lease_tab_leasesPackage)EPackage.Registry.INSTANCE.getEPackage(Lease_tab_leasesPackage.eNS_URI);

		// Obtain or create and register package
		Lease_tab_leasesPackageImpl theLease_tab_leasesPackage = (Lease_tab_leasesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Lease_tab_leasesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Lease_tab_leasesPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ClickWatchDataModelPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		BrnPackageImpl theBrnPackage = (BrnPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BrnPackage.eNS_URI) instanceof BrnPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BrnPackage.eNS_URI) : BrnPackage.eINSTANCE);
		Sys_info_systeminfoPackageImpl theSys_info_systeminfoPackage = (Sys_info_systeminfoPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Sys_info_systeminfoPackage.eNS_URI) instanceof Sys_info_systeminfoPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Sys_info_systeminfoPackage.eNS_URI) : Sys_info_systeminfoPackage.eINSTANCE);
		Device_wifi_data_power_systempowerPackageImpl theDevice_wifi_data_power_systempowerPackage = (Device_wifi_data_power_systempowerPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Device_wifi_data_power_systempowerPackage.eNS_URI) instanceof Device_wifi_data_power_systempowerPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Device_wifi_data_power_systempowerPackage.eNS_URI) : Device_wifi_data_power_systempowerPackage.eINSTANCE);
		Device_wifi_wifidevice_sc_systemchannelPackageImpl theDevice_wifi_wifidevice_sc_systemchannelPackage = (Device_wifi_wifidevice_sc_systemchannelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Device_wifi_wifidevice_sc_systemchannelPackage.eNS_URI) instanceof Device_wifi_wifidevice_sc_systemchannelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Device_wifi_wifidevice_sc_systemchannelPackage.eNS_URI) : Device_wifi_wifidevice_sc_systemchannelPackage.eINSTANCE);
		Gps_gps_coordPackageImpl theGps_gps_coordPackage = (Gps_gps_coordPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Gps_gps_coordPackage.eNS_URI) instanceof Gps_gps_coordPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Gps_gps_coordPackage.eNS_URI) : Gps_gps_coordPackage.eINSTANCE);
		Gps_cart_coordPackageImpl theGps_cart_coordPackage = (Gps_cart_coordPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Gps_cart_coordPackage.eNS_URI) instanceof Gps_cart_coordPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Gps_cart_coordPackage.eNS_URI) : Gps_cart_coordPackage.eINSTANCE);
		Lt_routesPackageImpl theLt_routesPackage = (Lt_routesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Lt_routesPackage.eNS_URI) instanceof Lt_routesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Lt_routesPackage.eNS_URI) : Lt_routesPackage.eINSTANCE);
		Lt_linksPackageImpl theLt_linksPackage = (Lt_linksPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Lt_linksPackage.eNS_URI) instanceof Lt_linksPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Lt_linksPackage.eNS_URI) : Lt_linksPackage.eINSTANCE);
		Device_wifi_link_stat_bcast_statsPackageImpl theDevice_wifi_link_stat_bcast_statsPackage = (Device_wifi_link_stat_bcast_statsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Device_wifi_link_stat_bcast_statsPackage.eNS_URI) instanceof Device_wifi_link_stat_bcast_statsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Device_wifi_link_stat_bcast_statsPackage.eNS_URI) : Device_wifi_link_stat_bcast_statsPackage.eINSTANCE);
		Device_wifi_wifidevice_cst_statsPackageImpl theDevice_wifi_wifidevice_cst_statsPackage = (Device_wifi_wifidevice_cst_statsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Device_wifi_wifidevice_cst_statsPackage.eNS_URI) instanceof Device_wifi_wifidevice_cst_statsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Device_wifi_wifidevice_cst_statsPackage.eNS_URI) : Device_wifi_wifidevice_cst_statsPackage.eINSTANCE);
		Sf_statsPackageImpl theSf_statsPackage = (Sf_statsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Sf_statsPackage.eNS_URI) instanceof Sf_statsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Sf_statsPackage.eNS_URI) : Sf_statsPackage.eINSTANCE);
		Routing_dsr_stats_statsPackageImpl theRouting_dsr_stats_statsPackage = (Routing_dsr_stats_statsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Routing_dsr_stats_statsPackage.eNS_URI) instanceof Routing_dsr_stats_statsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Routing_dsr_stats_statsPackage.eNS_URI) : Routing_dsr_stats_statsPackage.eINSTANCE);
		Seismo_localchannelinfoPackageImpl theSeismo_localchannelinfoPackage = (Seismo_localchannelinfoPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Seismo_localchannelinfoPackage.eNS_URI) instanceof Seismo_localchannelinfoPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Seismo_localchannelinfoPackage.eNS_URI) : Seismo_localchannelinfoPackage.eINSTANCE);
		Tsi_syncinfoPackageImpl theTsi_syncinfoPackage = (Tsi_syncinfoPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Tsi_syncinfoPackage.eNS_URI) instanceof Tsi_syncinfoPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Tsi_syncinfoPackage.eNS_URI) : Tsi_syncinfoPackage.eINSTANCE);

		// Create package meta-data objects
		theLease_tab_leasesPackage.createPackageContents();
		theBrnPackage.createPackageContents();
		theSys_info_systeminfoPackage.createPackageContents();
		theDevice_wifi_data_power_systempowerPackage.createPackageContents();
		theDevice_wifi_wifidevice_sc_systemchannelPackage.createPackageContents();
		theGps_gps_coordPackage.createPackageContents();
		theGps_cart_coordPackage.createPackageContents();
		theLt_routesPackage.createPackageContents();
		theLt_linksPackage.createPackageContents();
		theDevice_wifi_link_stat_bcast_statsPackage.createPackageContents();
		theDevice_wifi_wifidevice_cst_statsPackage.createPackageContents();
		theSf_statsPackage.createPackageContents();
		theRouting_dsr_stats_statsPackage.createPackageContents();
		theSeismo_localchannelinfoPackage.createPackageContents();
		theTsi_syncinfoPackage.createPackageContents();

		// Initialize created meta-data
		theLease_tab_leasesPackage.initializePackageContents();
		theBrnPackage.initializePackageContents();
		theSys_info_systeminfoPackage.initializePackageContents();
		theDevice_wifi_data_power_systempowerPackage.initializePackageContents();
		theDevice_wifi_wifidevice_sc_systemchannelPackage.initializePackageContents();
		theGps_gps_coordPackage.initializePackageContents();
		theGps_cart_coordPackage.initializePackageContents();
		theLt_routesPackage.initializePackageContents();
		theLt_linksPackage.initializePackageContents();
		theDevice_wifi_link_stat_bcast_statsPackage.initializePackageContents();
		theDevice_wifi_wifidevice_cst_statsPackage.initializePackageContents();
		theSf_statsPackage.initializePackageContents();
		theRouting_dsr_stats_statsPackage.initializePackageContents();
		theSeismo_localchannelinfoPackage.initializePackageContents();
		theTsi_syncinfoPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLease_tab_leasesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Lease_tab_leasesPackage.eNS_URI, theLease_tab_leasesPackage);
		return theLease_tab_leasesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClient() {
		return clientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClient_EContainer_client() {
		return (EReference)clientEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClient_Ip() {
		return (EAttribute)clientEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClient_Mac() {
		return (EAttribute)clientEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClient_Start() {
		return (EAttribute)clientEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClient_End() {
		return (EAttribute)clientEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClient_Duration() {
		return (EAttribute)clientEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClient_Time_left() {
		return (EAttribute)clientEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDhcpleases() {
		return dhcpleasesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDhcpleases_EContainer_dhcpleases() {
		return (EReference)dhcpleasesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDhcpleases_Text() {
		return (EAttribute)dhcpleasesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDhcpleases_Client() {
		return (EReference)dhcpleasesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDhcpleases_Count() {
		return (EAttribute)dhcpleasesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDhcpleases_Time() {
		return (EAttribute)dhcpleasesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLeases() {
		return leasesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLeases_Dhcpleases() {
		return (EReference)leasesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lease_tab_leasesFactory getLease_tab_leasesFactory() {
		return (Lease_tab_leasesFactory)getEFactoryInstance();
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
		clientEClass = createEClass(CLIENT);
		createEReference(clientEClass, CLIENT__ECONTAINER_CLIENT);
		createEAttribute(clientEClass, CLIENT__IP);
		createEAttribute(clientEClass, CLIENT__MAC);
		createEAttribute(clientEClass, CLIENT__START);
		createEAttribute(clientEClass, CLIENT__END);
		createEAttribute(clientEClass, CLIENT__DURATION);
		createEAttribute(clientEClass, CLIENT__TIME_LEFT);

		dhcpleasesEClass = createEClass(DHCPLEASES);
		createEReference(dhcpleasesEClass, DHCPLEASES__ECONTAINER_DHCPLEASES);
		createEAttribute(dhcpleasesEClass, DHCPLEASES__TEXT);
		createEReference(dhcpleasesEClass, DHCPLEASES__CLIENT);
		createEAttribute(dhcpleasesEClass, DHCPLEASES__COUNT);
		createEAttribute(dhcpleasesEClass, DHCPLEASES__TIME);

		leasesEClass = createEClass(LEASES);
		createEReference(leasesEClass, LEASES__DHCPLEASES);
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
		ClickWatchDataModelPackage theClickWatchDataModelPackage = (ClickWatchDataModelPackage)EPackage.Registry.INSTANCE.getEPackage(ClickWatchDataModelPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		leasesEClass.getESuperTypes().add(theClickWatchDataModelPackage.getValue());

		// Initialize classes and features; add operations and parameters
		initEClass(clientEClass, Client.class, "Client", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClient_EContainer_client(), this.getDhcpleases(), this.getDhcpleases_Client(), "eContainer_client", null, 0, 1, Client.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClient_Ip(), ecorePackage.getEString(), "ip", null, 0, 1, Client.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClient_Mac(), ecorePackage.getEString(), "mac", null, 0, 1, Client.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClient_Start(), ecorePackage.getEInt(), "start", null, 0, 1, Client.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClient_End(), ecorePackage.getEInt(), "end", null, 0, 1, Client.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClient_Duration(), ecorePackage.getEInt(), "duration", null, 0, 1, Client.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClient_Time_left(), ecorePackage.getEInt(), "time_left", null, 0, 1, Client.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dhcpleasesEClass, Dhcpleases.class, "Dhcpleases", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDhcpleases_EContainer_dhcpleases(), this.getLeases(), this.getLeases_Dhcpleases(), "eContainer_dhcpleases", null, 0, 1, Dhcpleases.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDhcpleases_Text(), ecorePackage.getEString(), "text", null, 0, -1, Dhcpleases.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDhcpleases_Client(), this.getClient(), this.getClient_EContainer_client(), "client", null, 0, -1, Dhcpleases.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDhcpleases_Count(), ecorePackage.getEInt(), "count", null, 0, 1, Dhcpleases.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDhcpleases_Time(), ecorePackage.getEDouble(), "time", null, 0, 1, Dhcpleases.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(leasesEClass, Leases.class, "Leases", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLeases_Dhcpleases(), this.getDhcpleases(), this.getDhcpleases_EContainer_dhcpleases(), "dhcpleases", null, 0, 1, Leases.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
			 "handler_class", "Leases"
		   });		
		addAnnotation
		  (clientEClass, 
		   source, 
		   new String[] {
			 "target_id", "Leases|Handler/dhcpleases|dhcpleases:Dhcpleases|EObject/client|client:Client|EObject"
		   });		
		addAnnotation
		  (getClient_Ip(), 
		   source, 
		   new String[] {
			 "target_id", "Leases|Handler/dhcpleases|dhcpleases:Dhcpleases|EObject/client|client:Client|EObject/ip|ip:"
		   });		
		addAnnotation
		  (getClient_Mac(), 
		   source, 
		   new String[] {
			 "target_id", "Leases|Handler/dhcpleases|dhcpleases:Dhcpleases|EObject/client|client:Client|EObject/mac|mac:"
		   });		
		addAnnotation
		  (getClient_Start(), 
		   source, 
		   new String[] {
			 "target_id", "Leases|Handler/dhcpleases|dhcpleases:Dhcpleases|EObject/client|client:Client|EObject/start|start:"
		   });		
		addAnnotation
		  (getClient_End(), 
		   source, 
		   new String[] {
			 "target_id", "Leases|Handler/dhcpleases|dhcpleases:Dhcpleases|EObject/client|client:Client|EObject/end|end:"
		   });		
		addAnnotation
		  (getClient_Duration(), 
		   source, 
		   new String[] {
			 "target_id", "Leases|Handler/dhcpleases|dhcpleases:Dhcpleases|EObject/client|client:Client|EObject/duration|duration:"
		   });		
		addAnnotation
		  (getClient_Time_left(), 
		   source, 
		   new String[] {
			 "target_id", "Leases|Handler/dhcpleases|dhcpleases:Dhcpleases|EObject/client|client:Client|EObject/time_left|time_left:"
		   });		
		addAnnotation
		  (dhcpleasesEClass, 
		   source, 
		   new String[] {
			 "target_id", "Leases|Handler/dhcpleases|dhcpleases:Dhcpleases|EObject"
		   });		
		addAnnotation
		  (getDhcpleases_Text(), 
		   source, 
		   new String[] {
			 "target_id", "Leases|Handler/dhcpleases|dhcpleases:Dhcpleases|EObject/text|text:"
		   });		
		addAnnotation
		  (getDhcpleases_Client(), 
		   source, 
		   new String[] {
			 "target_id", "Leases|Handler/dhcpleases|dhcpleases:Dhcpleases|EObject/client|client:Client|EObject",
			 "IsCopy", "false"
		   });		
		addAnnotation
		  (getDhcpleases_Count(), 
		   source, 
		   new String[] {
			 "target_id", "Leases|Handler/dhcpleases|dhcpleases:Dhcpleases|EObject/count|count:"
		   });		
		addAnnotation
		  (getDhcpleases_Time(), 
		   source, 
		   new String[] {
			 "target_id", "Leases|Handler/dhcpleases|dhcpleases:Dhcpleases|EObject/time|time:"
		   });		
		addAnnotation
		  (leasesEClass, 
		   source, 
		   new String[] {
			 "target_id", "Leases|Handler"
		   });		
		addAnnotation
		  (getLeases_Dhcpleases(), 
		   source, 
		   new String[] {
			 "target_id", "Leases|Handler/dhcpleases|dhcpleases:Dhcpleases|EObject",
			 "IsCopy", "false"
		   });
	}

} //Lease_tab_leasesPackageImpl
