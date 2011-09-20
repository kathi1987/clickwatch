/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats.impl;

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

import de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats.Dsr_route_stats;
import de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats.Route;
import de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats.Route_info;
import de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats.Routing_dsr_stats_statsFactory;
import de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats.Routing_dsr_stats_statsPackage;
import de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats.Stats;

import de.hub.clickwatch.specificmodels.brn.sf_stats.Sf_statsPackage;

import de.hub.clickwatch.specificmodels.brn.sf_stats.impl.Sf_statsPackageImpl;

import de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Sys_info_systeminfoPackage;

import de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.impl.Sys_info_systeminfoPackageImpl;

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
public class Routing_dsr_stats_statsPackageImpl extends EPackageImpl implements Routing_dsr_stats_statsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dsr_route_statsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass routeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass route_infoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statsEClass = null;

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
	 * @see de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats.Routing_dsr_stats_statsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Routing_dsr_stats_statsPackageImpl() {
		super(eNS_URI, Routing_dsr_stats_statsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Routing_dsr_stats_statsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Routing_dsr_stats_statsPackage init() {
		if (isInited) return (Routing_dsr_stats_statsPackage)EPackage.Registry.INSTANCE.getEPackage(Routing_dsr_stats_statsPackage.eNS_URI);

		// Obtain or create and register package
		Routing_dsr_stats_statsPackageImpl theRouting_dsr_stats_statsPackage = (Routing_dsr_stats_statsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Routing_dsr_stats_statsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Routing_dsr_stats_statsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ClickWatchModelPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		BrnPackageImpl theBrnPackage = (BrnPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BrnPackage.eNS_URI) instanceof BrnPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BrnPackage.eNS_URI) : BrnPackage.eINSTANCE);
		Sys_info_systeminfoPackageImpl theSys_info_systeminfoPackage = (Sys_info_systeminfoPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Sys_info_systeminfoPackage.eNS_URI) instanceof Sys_info_systeminfoPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Sys_info_systeminfoPackage.eNS_URI) : Sys_info_systeminfoPackage.eINSTANCE);
		Device_wifi_data_power_systempowerPackageImpl theDevice_wifi_data_power_systempowerPackage = (Device_wifi_data_power_systempowerPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Device_wifi_data_power_systempowerPackage.eNS_URI) instanceof Device_wifi_data_power_systempowerPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Device_wifi_data_power_systempowerPackage.eNS_URI) : Device_wifi_data_power_systempowerPackage.eINSTANCE);
		Device_wifi_wifidevice_sc_systemchannelPackageImpl theDevice_wifi_wifidevice_sc_systemchannelPackage = (Device_wifi_wifidevice_sc_systemchannelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Device_wifi_wifidevice_sc_systemchannelPackage.eNS_URI) instanceof Device_wifi_wifidevice_sc_systemchannelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Device_wifi_wifidevice_sc_systemchannelPackage.eNS_URI) : Device_wifi_wifidevice_sc_systemchannelPackage.eINSTANCE);
		Lease_tab_leasesPackageImpl theLease_tab_leasesPackage = (Lease_tab_leasesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Lease_tab_leasesPackage.eNS_URI) instanceof Lease_tab_leasesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Lease_tab_leasesPackage.eNS_URI) : Lease_tab_leasesPackage.eINSTANCE);
		Gps_gps_coordPackageImpl theGps_gps_coordPackage = (Gps_gps_coordPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Gps_gps_coordPackage.eNS_URI) instanceof Gps_gps_coordPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Gps_gps_coordPackage.eNS_URI) : Gps_gps_coordPackage.eINSTANCE);
		Gps_cart_coordPackageImpl theGps_cart_coordPackage = (Gps_cart_coordPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Gps_cart_coordPackage.eNS_URI) instanceof Gps_cart_coordPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Gps_cart_coordPackage.eNS_URI) : Gps_cart_coordPackage.eINSTANCE);
		Lt_routesPackageImpl theLt_routesPackage = (Lt_routesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Lt_routesPackage.eNS_URI) instanceof Lt_routesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Lt_routesPackage.eNS_URI) : Lt_routesPackage.eINSTANCE);
		Lt_linksPackageImpl theLt_linksPackage = (Lt_linksPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Lt_linksPackage.eNS_URI) instanceof Lt_linksPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Lt_linksPackage.eNS_URI) : Lt_linksPackage.eINSTANCE);
		Device_wifi_link_stat_bcast_statsPackageImpl theDevice_wifi_link_stat_bcast_statsPackage = (Device_wifi_link_stat_bcast_statsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Device_wifi_link_stat_bcast_statsPackage.eNS_URI) instanceof Device_wifi_link_stat_bcast_statsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Device_wifi_link_stat_bcast_statsPackage.eNS_URI) : Device_wifi_link_stat_bcast_statsPackage.eINSTANCE);
		Device_wifi_wifidevice_cst_statsPackageImpl theDevice_wifi_wifidevice_cst_statsPackage = (Device_wifi_wifidevice_cst_statsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Device_wifi_wifidevice_cst_statsPackage.eNS_URI) instanceof Device_wifi_wifidevice_cst_statsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Device_wifi_wifidevice_cst_statsPackage.eNS_URI) : Device_wifi_wifidevice_cst_statsPackage.eINSTANCE);
		Sf_statsPackageImpl theSf_statsPackage = (Sf_statsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Sf_statsPackage.eNS_URI) instanceof Sf_statsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Sf_statsPackage.eNS_URI) : Sf_statsPackage.eINSTANCE);

		// Create package meta-data objects
		theRouting_dsr_stats_statsPackage.createPackageContents();
		theBrnPackage.createPackageContents();
		theSys_info_systeminfoPackage.createPackageContents();
		theDevice_wifi_data_power_systempowerPackage.createPackageContents();
		theDevice_wifi_wifidevice_sc_systemchannelPackage.createPackageContents();
		theLease_tab_leasesPackage.createPackageContents();
		theGps_gps_coordPackage.createPackageContents();
		theGps_cart_coordPackage.createPackageContents();
		theLt_routesPackage.createPackageContents();
		theLt_linksPackage.createPackageContents();
		theDevice_wifi_link_stat_bcast_statsPackage.createPackageContents();
		theDevice_wifi_wifidevice_cst_statsPackage.createPackageContents();
		theSf_statsPackage.createPackageContents();

		// Initialize created meta-data
		theRouting_dsr_stats_statsPackage.initializePackageContents();
		theBrnPackage.initializePackageContents();
		theSys_info_systeminfoPackage.initializePackageContents();
		theDevice_wifi_data_power_systempowerPackage.initializePackageContents();
		theDevice_wifi_wifidevice_sc_systemchannelPackage.initializePackageContents();
		theLease_tab_leasesPackage.initializePackageContents();
		theGps_gps_coordPackage.initializePackageContents();
		theGps_cart_coordPackage.initializePackageContents();
		theLt_routesPackage.initializePackageContents();
		theLt_linksPackage.initializePackageContents();
		theDevice_wifi_link_stat_bcast_statsPackage.initializePackageContents();
		theDevice_wifi_wifidevice_cst_statsPackage.initializePackageContents();
		theSf_statsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRouting_dsr_stats_statsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Routing_dsr_stats_statsPackage.eNS_URI, theRouting_dsr_stats_statsPackage);
		return theRouting_dsr_stats_statsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDsr_route_stats() {
		return dsr_route_statsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDsr_route_stats_EContainer_dsr_route_stats() {
		return (EReference)dsr_route_statsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDsr_route_stats_Text() {
		return (EAttribute)dsr_route_statsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDsr_route_stats_Route_info() {
		return (EReference)dsr_route_statsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDsr_route_stats_Id() {
		return (EAttribute)dsr_route_statsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDsr_route_stats_Node_pairs() {
		return (EAttribute)dsr_route_statsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoute() {
		return routeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoute_EContainer_route() {
		return (EReference)routeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoute_Id() {
		return (EAttribute)routeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoute_Metric() {
		return (EAttribute)routeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoute_Usage() {
		return (EAttribute)routeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoute_Last_usage() {
		return (EAttribute)routeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoute_Hop_count() {
		return (EAttribute)routeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoute_Hops() {
		return (EAttribute)routeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoute_info() {
		return route_infoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoute_info_EContainer_route_info() {
		return (EReference)route_infoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoute_info_Text() {
		return (EAttribute)route_infoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoute_info_Route() {
		return (EReference)route_infoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoute_info_Src() {
		return (EAttribute)route_infoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoute_info_Dst() {
		return (EAttribute)route_infoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStats() {
		return statsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStats_Dsr_route_stats() {
		return (EReference)statsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Routing_dsr_stats_statsFactory getRouting_dsr_stats_statsFactory() {
		return (Routing_dsr_stats_statsFactory)getEFactoryInstance();
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
		dsr_route_statsEClass = createEClass(DSR_ROUTE_STATS);
		createEReference(dsr_route_statsEClass, DSR_ROUTE_STATS__ECONTAINER_DSR_ROUTE_STATS);
		createEAttribute(dsr_route_statsEClass, DSR_ROUTE_STATS__TEXT);
		createEReference(dsr_route_statsEClass, DSR_ROUTE_STATS__ROUTE_INFO);
		createEAttribute(dsr_route_statsEClass, DSR_ROUTE_STATS__ID);
		createEAttribute(dsr_route_statsEClass, DSR_ROUTE_STATS__NODE_PAIRS);

		routeEClass = createEClass(ROUTE);
		createEReference(routeEClass, ROUTE__ECONTAINER_ROUTE);
		createEAttribute(routeEClass, ROUTE__ID);
		createEAttribute(routeEClass, ROUTE__METRIC);
		createEAttribute(routeEClass, ROUTE__USAGE);
		createEAttribute(routeEClass, ROUTE__LAST_USAGE);
		createEAttribute(routeEClass, ROUTE__HOP_COUNT);
		createEAttribute(routeEClass, ROUTE__HOPS);

		route_infoEClass = createEClass(ROUTE_INFO);
		createEReference(route_infoEClass, ROUTE_INFO__ECONTAINER_ROUTE_INFO);
		createEAttribute(route_infoEClass, ROUTE_INFO__TEXT);
		createEReference(route_infoEClass, ROUTE_INFO__ROUTE);
		createEAttribute(route_infoEClass, ROUTE_INFO__SRC);
		createEAttribute(route_infoEClass, ROUTE_INFO__DST);

		statsEClass = createEClass(STATS);
		createEReference(statsEClass, STATS__DSR_ROUTE_STATS);
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
		statsEClass.getESuperTypes().add(theClickWatchModelPackage.getHandler());

		// Initialize classes and features; add operations and parameters
		initEClass(dsr_route_statsEClass, Dsr_route_stats.class, "Dsr_route_stats", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDsr_route_stats_EContainer_dsr_route_stats(), this.getStats(), this.getStats_Dsr_route_stats(), "eContainer_dsr_route_stats", null, 0, 1, Dsr_route_stats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDsr_route_stats_Text(), ecorePackage.getEString(), "text", null, 0, -1, Dsr_route_stats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDsr_route_stats_Route_info(), this.getRoute_info(), this.getRoute_info_EContainer_route_info(), "route_info", null, 0, -1, Dsr_route_stats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDsr_route_stats_Id(), ecorePackage.getEString(), "id", null, 0, 1, Dsr_route_stats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDsr_route_stats_Node_pairs(), ecorePackage.getEInt(), "node_pairs", null, 0, 1, Dsr_route_stats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(routeEClass, Route.class, "Route", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoute_EContainer_route(), this.getRoute_info(), this.getRoute_info_Route(), "eContainer_route", null, 0, 1, Route.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoute_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Route.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoute_Metric(), ecorePackage.getEInt(), "metric", null, 0, 1, Route.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoute_Usage(), ecorePackage.getEInt(), "usage", null, 0, 1, Route.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoute_Last_usage(), ecorePackage.getEDouble(), "last_usage", null, 0, 1, Route.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoute_Hop_count(), ecorePackage.getEInt(), "hop_count", null, 0, 1, Route.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoute_Hops(), ecorePackage.getEString(), "hops", null, 0, 1, Route.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(route_infoEClass, Route_info.class, "Route_info", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoute_info_EContainer_route_info(), this.getDsr_route_stats(), this.getDsr_route_stats_Route_info(), "eContainer_route_info", null, 0, 1, Route_info.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoute_info_Text(), ecorePackage.getEString(), "text", null, 0, -1, Route_info.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoute_info_Route(), this.getRoute(), this.getRoute_EContainer_route(), "route", null, 0, -1, Route_info.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoute_info_Src(), ecorePackage.getEString(), "src", null, 0, 1, Route_info.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoute_info_Dst(), ecorePackage.getEString(), "dst", null, 0, 1, Route_info.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statsEClass, Stats.class, "Stats", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStats_Dsr_route_stats(), this.getDsr_route_stats(), this.getDsr_route_stats_EContainer_dsr_route_stats(), "dsr_route_stats", null, 0, 1, Stats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
			 "handler_class", "Stats",
			 "handler_name", "routing/dsr_stats/stats"
		   });		
		addAnnotation
		  (dsr_route_statsEClass, 
		   source, 
		   new String[] {
			 "target_id", "Stats|Handler/dsr_route_stats|dsr_route_stats:Dsr_route_stats|EObject"
		   });		
		addAnnotation
		  (getDsr_route_stats_Text(), 
		   source, 
		   new String[] {
			 "target_id", "Stats|Handler/dsr_route_stats|dsr_route_stats:Dsr_route_stats|EObject/text|text:"
		   });		
		addAnnotation
		  (getDsr_route_stats_Route_info(), 
		   source, 
		   new String[] {
			 "target_id", "Stats|Handler/dsr_route_stats|dsr_route_stats:Dsr_route_stats|EObject/route_info|route_info:Route_info|EObject",
			 "IsCopy", "false"
		   });		
		addAnnotation
		  (getDsr_route_stats_Id(), 
		   source, 
		   new String[] {
			 "target_id", "Stats|Handler/dsr_route_stats|dsr_route_stats:Dsr_route_stats|EObject/id|id:"
		   });		
		addAnnotation
		  (getDsr_route_stats_Node_pairs(), 
		   source, 
		   new String[] {
			 "target_id", "Stats|Handler/dsr_route_stats|dsr_route_stats:Dsr_route_stats|EObject/node_pairs|node_pairs:"
		   });		
		addAnnotation
		  (routeEClass, 
		   source, 
		   new String[] {
			 "target_id", "Stats|Handler/dsr_route_stats|dsr_route_stats:Dsr_route_stats|EObject/route_info|route_info:Route_info|EObject/route|route:Route|EObject"
		   });		
		addAnnotation
		  (getRoute_Id(), 
		   source, 
		   new String[] {
			 "target_id", "Stats|Handler/dsr_route_stats|dsr_route_stats:Dsr_route_stats|EObject/route_info|route_info:Route_info|EObject/route|route:Route|EObject/id|id:"
		   });		
		addAnnotation
		  (getRoute_Metric(), 
		   source, 
		   new String[] {
			 "target_id", "Stats|Handler/dsr_route_stats|dsr_route_stats:Dsr_route_stats|EObject/route_info|route_info:Route_info|EObject/route|route:Route|EObject/metric|metric:"
		   });		
		addAnnotation
		  (getRoute_Usage(), 
		   source, 
		   new String[] {
			 "target_id", "Stats|Handler/dsr_route_stats|dsr_route_stats:Dsr_route_stats|EObject/route_info|route_info:Route_info|EObject/route|route:Route|EObject/usage|usage:"
		   });		
		addAnnotation
		  (getRoute_Last_usage(), 
		   source, 
		   new String[] {
			 "target_id", "Stats|Handler/dsr_route_stats|dsr_route_stats:Dsr_route_stats|EObject/route_info|route_info:Route_info|EObject/route|route:Route|EObject/last_usage|last_usage:"
		   });		
		addAnnotation
		  (getRoute_Hop_count(), 
		   source, 
		   new String[] {
			 "target_id", "Stats|Handler/dsr_route_stats|dsr_route_stats:Dsr_route_stats|EObject/route_info|route_info:Route_info|EObject/route|route:Route|EObject/hop_count|hop_count:"
		   });		
		addAnnotation
		  (getRoute_Hops(), 
		   source, 
		   new String[] {
			 "target_id", "Stats|Handler/dsr_route_stats|dsr_route_stats:Dsr_route_stats|EObject/route_info|route_info:Route_info|EObject/route|route:Route|EObject/hops|hops:"
		   });		
		addAnnotation
		  (route_infoEClass, 
		   source, 
		   new String[] {
			 "target_id", "Stats|Handler/dsr_route_stats|dsr_route_stats:Dsr_route_stats|EObject/route_info|route_info:Route_info|EObject"
		   });		
		addAnnotation
		  (getRoute_info_Text(), 
		   source, 
		   new String[] {
			 "target_id", "Stats|Handler/dsr_route_stats|dsr_route_stats:Dsr_route_stats|EObject/route_info|route_info:Route_info|EObject/text|text:"
		   });		
		addAnnotation
		  (getRoute_info_Route(), 
		   source, 
		   new String[] {
			 "target_id", "Stats|Handler/dsr_route_stats|dsr_route_stats:Dsr_route_stats|EObject/route_info|route_info:Route_info|EObject/route|route:Route|EObject",
			 "IsCopy", "false"
		   });		
		addAnnotation
		  (getRoute_info_Src(), 
		   source, 
		   new String[] {
			 "target_id", "Stats|Handler/dsr_route_stats|dsr_route_stats:Dsr_route_stats|EObject/route_info|route_info:Route_info|EObject/src|src:"
		   });		
		addAnnotation
		  (getRoute_info_Dst(), 
		   source, 
		   new String[] {
			 "target_id", "Stats|Handler/dsr_route_stats|dsr_route_stats:Dsr_route_stats|EObject/route_info|route_info:Route_info|EObject/dst|dst:"
		   });		
		addAnnotation
		  (statsEClass, 
		   source, 
		   new String[] {
			 "target_id", "Stats|Handler"
		   });		
		addAnnotation
		  (getStats_Dsr_route_stats(), 
		   source, 
		   new String[] {
			 "target_id", "Stats|Handler/dsr_route_stats|dsr_route_stats:Dsr_route_stats|EObject",
			 "IsCopy", "false"
		   });
	}

} //Routing_dsr_stats_statsPackageImpl
