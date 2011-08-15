/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.lt_routes.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

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
import de.hub.clickwatch.specificmodels.brn.lt_routes.Link;
import de.hub.clickwatch.specificmodels.brn.lt_routes.Lt_routesFactory;
import de.hub.clickwatch.specificmodels.brn.lt_routes.Lt_routesPackage;
import de.hub.clickwatch.specificmodels.brn.lt_routes.Route;
import de.hub.clickwatch.specificmodels.brn.lt_routes.Routes;
import de.hub.clickwatch.specificmodels.brn.lt_routes.Routetable;
import de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Sys_info_systeminfoPackage;
import de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.impl.Sys_info_systeminfoPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Lt_routesPackageImpl extends EPackageImpl implements Lt_routesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkEClass = null;
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
	private EClass routesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass routetableEClass = null;

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
	 * @see de.hub.clickwatch.specificmodels.brn.lt_routes.Lt_routesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Lt_routesPackageImpl() {
		super(eNS_URI, Lt_routesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Lt_routesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Lt_routesPackage init() {
		if (isInited) return (Lt_routesPackage)EPackage.Registry.INSTANCE.getEPackage(Lt_routesPackage.eNS_URI);

		// Obtain or create and register package
		Lt_routesPackageImpl theLt_routesPackage = (Lt_routesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Lt_routesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Lt_routesPackageImpl());

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
		Lt_linksPackageImpl theLt_linksPackage = (Lt_linksPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Lt_linksPackage.eNS_URI) instanceof Lt_linksPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Lt_linksPackage.eNS_URI) : Lt_linksPackage.eINSTANCE);
		Device_wifi_link_stat_bcast_statsPackageImpl theDevice_wifi_link_stat_bcast_statsPackage = (Device_wifi_link_stat_bcast_statsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Device_wifi_link_stat_bcast_statsPackage.eNS_URI) instanceof Device_wifi_link_stat_bcast_statsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Device_wifi_link_stat_bcast_statsPackage.eNS_URI) : Device_wifi_link_stat_bcast_statsPackage.eINSTANCE);
		Device_wifi_wifidevice_cst_statsPackageImpl theDevice_wifi_wifidevice_cst_statsPackage = (Device_wifi_wifidevice_cst_statsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Device_wifi_wifidevice_cst_statsPackage.eNS_URI) instanceof Device_wifi_wifidevice_cst_statsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Device_wifi_wifidevice_cst_statsPackage.eNS_URI) : Device_wifi_wifidevice_cst_statsPackage.eINSTANCE);

		// Create package meta-data objects
		theLt_routesPackage.createPackageContents();
		theBrnPackage.createPackageContents();
		theSys_info_systeminfoPackage.createPackageContents();
		theDevice_wifi_data_power_systempowerPackage.createPackageContents();
		theDevice_wifi_wifidevice_sc_systemchannelPackage.createPackageContents();
		theLease_tab_leasesPackage.createPackageContents();
		theGps_gps_coordPackage.createPackageContents();
		theGps_cart_coordPackage.createPackageContents();
		theLt_linksPackage.createPackageContents();
		theDevice_wifi_link_stat_bcast_statsPackage.createPackageContents();
		theDevice_wifi_wifidevice_cst_statsPackage.createPackageContents();

		// Initialize created meta-data
		theLt_routesPackage.initializePackageContents();
		theBrnPackage.initializePackageContents();
		theSys_info_systeminfoPackage.initializePackageContents();
		theDevice_wifi_data_power_systempowerPackage.initializePackageContents();
		theDevice_wifi_wifidevice_sc_systemchannelPackage.initializePackageContents();
		theLease_tab_leasesPackage.initializePackageContents();
		theGps_gps_coordPackage.initializePackageContents();
		theGps_cart_coordPackage.initializePackageContents();
		theLt_linksPackage.initializePackageContents();
		theDevice_wifi_link_stat_bcast_statsPackage.initializePackageContents();
		theDevice_wifi_wifidevice_cst_statsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLt_routesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Lt_routesPackage.eNS_URI, theLt_routesPackage);
		return theLt_routesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLink() {
		return linkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLink_EContainer_link() {
		return (EReference)linkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLink_From() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLink_To() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLink_Metric() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLink_Seq() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLink_Age() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(5);
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
	public EAttribute getRoute_Text() {
		return (EAttribute)routeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoute_Link() {
		return (EReference)routeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoute_From() {
		return (EAttribute)routeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoute_To() {
		return (EAttribute)routeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoutes() {
		return routesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoutes_Routetable() {
		return (EReference)routesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoutetable() {
		return routetableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoutetable_EContainer_routetable() {
		return (EReference)routetableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoutetable_Text() {
		return (EAttribute)routetableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoutetable_Route() {
		return (EReference)routetableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoutetable_Id() {
		return (EAttribute)routetableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lt_routesFactory getLt_routesFactory() {
		return (Lt_routesFactory)getEFactoryInstance();
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
		linkEClass = createEClass(LINK);
		createEReference(linkEClass, LINK__ECONTAINER_LINK);
		createEAttribute(linkEClass, LINK__FROM);
		createEAttribute(linkEClass, LINK__TO);
		createEAttribute(linkEClass, LINK__METRIC);
		createEAttribute(linkEClass, LINK__SEQ);
		createEAttribute(linkEClass, LINK__AGE);

		routeEClass = createEClass(ROUTE);
		createEReference(routeEClass, ROUTE__ECONTAINER_ROUTE);
		createEAttribute(routeEClass, ROUTE__TEXT);
		createEReference(routeEClass, ROUTE__LINK);
		createEAttribute(routeEClass, ROUTE__FROM);
		createEAttribute(routeEClass, ROUTE__TO);

		routesEClass = createEClass(ROUTES);
		createEReference(routesEClass, ROUTES__ROUTETABLE);

		routetableEClass = createEClass(ROUTETABLE);
		createEReference(routetableEClass, ROUTETABLE__ECONTAINER_ROUTETABLE);
		createEAttribute(routetableEClass, ROUTETABLE__TEXT);
		createEReference(routetableEClass, ROUTETABLE__ROUTE);
		createEAttribute(routetableEClass, ROUTETABLE__ID);
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
		routesEClass.getESuperTypes().add(theClickWatchModelPackage.getHandler());

		// Initialize classes and features; add operations and parameters
		initEClass(linkEClass, Link.class, "Link", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLink_EContainer_link(), this.getRoute(), this.getRoute_Link(), "eContainer_link", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLink_From(), ecorePackage.getEString(), "from", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLink_To(), ecorePackage.getEString(), "to", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLink_Metric(), ecorePackage.getEInt(), "metric", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLink_Seq(), ecorePackage.getEInt(), "seq", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLink_Age(), ecorePackage.getEInt(), "age", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(routeEClass, Route.class, "Route", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoute_EContainer_route(), this.getRoutetable(), this.getRoutetable_Route(), "eContainer_route", null, 0, 1, Route.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoute_Text(), ecorePackage.getEString(), "text", null, 0, -1, Route.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoute_Link(), this.getLink(), this.getLink_EContainer_link(), "link", null, 0, -1, Route.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoute_From(), ecorePackage.getEString(), "from", null, 0, 1, Route.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoute_To(), ecorePackage.getEString(), "to", null, 0, 1, Route.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(routesEClass, Routes.class, "Routes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoutes_Routetable(), this.getRoutetable(), this.getRoutetable_EContainer_routetable(), "routetable", null, 0, 1, Routes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(routetableEClass, Routetable.class, "Routetable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoutetable_EContainer_routetable(), this.getRoutes(), this.getRoutes_Routetable(), "eContainer_routetable", null, 0, 1, Routetable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoutetable_Text(), ecorePackage.getEString(), "text", null, 0, -1, Routetable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoutetable_Route(), this.getRoute(), this.getRoute_EContainer_route(), "route", null, 0, -1, Routetable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoutetable_Id(), ecorePackage.getEString(), "id", null, 0, 1, Routetable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
			 "handler_class", "Routes",
			 "handler_name", "lt/routes"
		   });		
		addAnnotation
		  (linkEClass, 
		   source, 
		   new String[] {
			 "target_id", "Routes|Handler/routetable|routetable:Routetable|EObject/route|route:Route|EObject/link|link:Link|EObject"
		   });		
		addAnnotation
		  (getLink_From(), 
		   source, 
		   new String[] {
			 "target_id", "Routes|Handler/routetable|routetable:Routetable|EObject/route|route:Route|EObject/link|link:Link|EObject/from|from:"
		   });		
		addAnnotation
		  (getLink_To(), 
		   source, 
		   new String[] {
			 "target_id", "Routes|Handler/routetable|routetable:Routetable|EObject/route|route:Route|EObject/link|link:Link|EObject/to|to:"
		   });		
		addAnnotation
		  (getLink_Metric(), 
		   source, 
		   new String[] {
			 "target_id", "Routes|Handler/routetable|routetable:Routetable|EObject/route|route:Route|EObject/link|link:Link|EObject/metric|metric:"
		   });		
		addAnnotation
		  (getLink_Seq(), 
		   source, 
		   new String[] {
			 "target_id", "Routes|Handler/routetable|routetable:Routetable|EObject/route|route:Route|EObject/link|link:Link|EObject/seq|seq:"
		   });		
		addAnnotation
		  (getLink_Age(), 
		   source, 
		   new String[] {
			 "target_id", "Routes|Handler/routetable|routetable:Routetable|EObject/route|route:Route|EObject/link|link:Link|EObject/age|age:"
		   });		
		addAnnotation
		  (routeEClass, 
		   source, 
		   new String[] {
			 "target_id", "Routes|Handler/routetable|routetable:Routetable|EObject/route|route:Route|EObject"
		   });		
		addAnnotation
		  (getRoute_Text(), 
		   source, 
		   new String[] {
			 "target_id", "Routes|Handler/routetable|routetable:Routetable|EObject/route|route:Route|EObject/text|text:"
		   });		
		addAnnotation
		  (getRoute_Link(), 
		   source, 
		   new String[] {
			 "target_id", "Routes|Handler/routetable|routetable:Routetable|EObject/route|route:Route|EObject/link|link:Link|EObject",
			 "IsCopy", "false"
		   });		
		addAnnotation
		  (getRoute_From(), 
		   source, 
		   new String[] {
			 "target_id", "Routes|Handler/routetable|routetable:Routetable|EObject/route|route:Route|EObject/from|from:"
		   });		
		addAnnotation
		  (getRoute_To(), 
		   source, 
		   new String[] {
			 "target_id", "Routes|Handler/routetable|routetable:Routetable|EObject/route|route:Route|EObject/to|to:"
		   });		
		addAnnotation
		  (routesEClass, 
		   source, 
		   new String[] {
			 "target_id", "Routes|Handler"
		   });		
		addAnnotation
		  (getRoutes_Routetable(), 
		   source, 
		   new String[] {
			 "target_id", "Routes|Handler/routetable|routetable:Routetable|EObject",
			 "IsCopy", "false"
		   });		
		addAnnotation
		  (routetableEClass, 
		   source, 
		   new String[] {
			 "target_id", "Routes|Handler/routetable|routetable:Routetable|EObject"
		   });		
		addAnnotation
		  (getRoutetable_Text(), 
		   source, 
		   new String[] {
			 "target_id", "Routes|Handler/routetable|routetable:Routetable|EObject/text|text:"
		   });		
		addAnnotation
		  (getRoutetable_Route(), 
		   source, 
		   new String[] {
			 "target_id", "Routes|Handler/routetable|routetable:Routetable|EObject/route|route:Route|EObject",
			 "IsCopy", "false"
		   });		
		addAnnotation
		  (getRoutetable_Id(), 
		   source, 
		   new String[] {
			 "target_id", "Routes|Handler/routetable|routetable:Routetable|EObject/id|id:"
		   });
	}

} //Lt_routesPackageImpl
