/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.impl;

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
import de.hub.clickwatch.specificmodels.brn.lt_routes.Lt_routesPackage;
import de.hub.clickwatch.specificmodels.brn.lt_routes.impl.Lt_routesPackageImpl;
import de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats.Routing_dsr_stats_statsPackage;
import de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats.impl.Routing_dsr_stats_statsPackageImpl;
import de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.Channel_info;
import de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.Channel_infos;
import de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.Latestchannelinfos;
import de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.Seismo_latestchannelinfosFactory;
import de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.Seismo_latestchannelinfosPackage;
import de.hub.clickwatch.specificmodels.brn.sf_stats.Sf_statsPackage;
import de.hub.clickwatch.specificmodels.brn.sf_stats.impl.Sf_statsPackageImpl;
import de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Sys_info_systeminfoPackage;
import de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.impl.Sys_info_systeminfoPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Seismo_latestchannelinfosPackageImpl extends EPackageImpl implements Seismo_latestchannelinfosPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass channel_infoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass channel_infosEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass latestchannelinfosEClass = null;

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
	 * @see de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.Seismo_latestchannelinfosPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Seismo_latestchannelinfosPackageImpl() {
		super(eNS_URI, Seismo_latestchannelinfosFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Seismo_latestchannelinfosPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Seismo_latestchannelinfosPackage init() {
		if (isInited) return (Seismo_latestchannelinfosPackage)EPackage.Registry.INSTANCE.getEPackage(Seismo_latestchannelinfosPackage.eNS_URI);

		// Obtain or create and register package
		Seismo_latestchannelinfosPackageImpl theSeismo_latestchannelinfosPackage = (Seismo_latestchannelinfosPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Seismo_latestchannelinfosPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Seismo_latestchannelinfosPackageImpl());

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
		Routing_dsr_stats_statsPackageImpl theRouting_dsr_stats_statsPackage = (Routing_dsr_stats_statsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Routing_dsr_stats_statsPackage.eNS_URI) instanceof Routing_dsr_stats_statsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Routing_dsr_stats_statsPackage.eNS_URI) : Routing_dsr_stats_statsPackage.eINSTANCE);

		// Create package meta-data objects
		theSeismo_latestchannelinfosPackage.createPackageContents();
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
		theRouting_dsr_stats_statsPackage.createPackageContents();

		// Initialize created meta-data
		theSeismo_latestchannelinfosPackage.initializePackageContents();
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
		theRouting_dsr_stats_statsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSeismo_latestchannelinfosPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Seismo_latestchannelinfosPackage.eNS_URI, theSeismo_latestchannelinfosPackage);
		return theSeismo_latestchannelinfosPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChannel_info() {
		return channel_infoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChannel_info_EContainer_channel_info() {
		return (EReference)channel_infoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChannel_info_Time() {
		return (EAttribute)channel_infoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChannel_info_Channel_0() {
		return (EAttribute)channel_infoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChannel_info_Channel_1() {
		return (EAttribute)channel_infoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChannel_info_Channel_2() {
		return (EAttribute)channel_infoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChannel_info_Channel_3() {
		return (EAttribute)channel_infoEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChannel_infos() {
		return channel_infosEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChannel_infos_EContainer_channel_infos() {
		return (EReference)channel_infosEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChannel_infos_Text() {
		return (EAttribute)channel_infosEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChannel_infos_Channel_info() {
		return (EReference)channel_infosEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLatestchannelinfos() {
		return latestchannelinfosEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLatestchannelinfos_Channel_infos() {
		return (EReference)latestchannelinfosEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Seismo_latestchannelinfosFactory getSeismo_latestchannelinfosFactory() {
		return (Seismo_latestchannelinfosFactory)getEFactoryInstance();
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
		channel_infoEClass = createEClass(CHANNEL_INFO);
		createEReference(channel_infoEClass, CHANNEL_INFO__ECONTAINER_CHANNEL_INFO);
		createEAttribute(channel_infoEClass, CHANNEL_INFO__TIME);
		createEAttribute(channel_infoEClass, CHANNEL_INFO__CHANNEL_0);
		createEAttribute(channel_infoEClass, CHANNEL_INFO__CHANNEL_1);
		createEAttribute(channel_infoEClass, CHANNEL_INFO__CHANNEL_2);
		createEAttribute(channel_infoEClass, CHANNEL_INFO__CHANNEL_3);

		channel_infosEClass = createEClass(CHANNEL_INFOS);
		createEReference(channel_infosEClass, CHANNEL_INFOS__ECONTAINER_CHANNEL_INFOS);
		createEAttribute(channel_infosEClass, CHANNEL_INFOS__TEXT);
		createEReference(channel_infosEClass, CHANNEL_INFOS__CHANNEL_INFO);

		latestchannelinfosEClass = createEClass(LATESTCHANNELINFOS);
		createEReference(latestchannelinfosEClass, LATESTCHANNELINFOS__CHANNEL_INFOS);
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
		latestchannelinfosEClass.getESuperTypes().add(theClickWatchModelPackage.getHandler());

		// Initialize classes and features; add operations and parameters
		initEClass(channel_infoEClass, Channel_info.class, "Channel_info", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChannel_info_EContainer_channel_info(), this.getChannel_infos(), this.getChannel_infos_Channel_info(), "eContainer_channel_info", null, 0, 1, Channel_info.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChannel_info_Time(), ecorePackage.getELong(), "time", null, 0, 1, Channel_info.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChannel_info_Channel_0(), ecorePackage.getEInt(), "channel_0", null, 0, 1, Channel_info.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChannel_info_Channel_1(), ecorePackage.getEInt(), "channel_1", null, 0, 1, Channel_info.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChannel_info_Channel_2(), ecorePackage.getEInt(), "channel_2", null, 0, 1, Channel_info.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChannel_info_Channel_3(), ecorePackage.getEInt(), "channel_3", null, 0, 1, Channel_info.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(channel_infosEClass, Channel_infos.class, "Channel_infos", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChannel_infos_EContainer_channel_infos(), this.getLatestchannelinfos(), this.getLatestchannelinfos_Channel_infos(), "eContainer_channel_infos", null, 0, 1, Channel_infos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChannel_infos_Text(), ecorePackage.getEString(), "text", null, 0, -1, Channel_infos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChannel_infos_Channel_info(), this.getChannel_info(), this.getChannel_info_EContainer_channel_info(), "channel_info", null, 0, -1, Channel_infos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(latestchannelinfosEClass, Latestchannelinfos.class, "Latestchannelinfos", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLatestchannelinfos_Channel_infos(), this.getChannel_infos(), this.getChannel_infos_EContainer_channel_infos(), "channel_infos", null, 0, 1, Latestchannelinfos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
			 "handler_class", "Latestchannelinfos",
			 "handler_name", "seismo/latestchannelinfos"
		   });		
		addAnnotation
		  (channel_infoEClass, 
		   source, 
		   new String[] {
			 "target_id", "Latestchannelinfos|Handler/channel_infos|channel_infos:Channel_infos|EObject/channel_info|channel_info:Channel_info|EObject"
		   });		
		addAnnotation
		  (getChannel_info_Time(), 
		   source, 
		   new String[] {
			 "target_id", "Latestchannelinfos|Handler/channel_infos|channel_infos:Channel_infos|EObject/channel_info|channel_info:Channel_info|EObject/time|time:"
		   });		
		addAnnotation
		  (getChannel_info_Channel_0(), 
		   source, 
		   new String[] {
			 "target_id", "Latestchannelinfos|Handler/channel_infos|channel_infos:Channel_infos|EObject/channel_info|channel_info:Channel_info|EObject/channel_0|channel_0:"
		   });		
		addAnnotation
		  (getChannel_info_Channel_1(), 
		   source, 
		   new String[] {
			 "target_id", "Latestchannelinfos|Handler/channel_infos|channel_infos:Channel_infos|EObject/channel_info|channel_info:Channel_info|EObject/channel_1|channel_1:"
		   });		
		addAnnotation
		  (getChannel_info_Channel_2(), 
		   source, 
		   new String[] {
			 "target_id", "Latestchannelinfos|Handler/channel_infos|channel_infos:Channel_infos|EObject/channel_info|channel_info:Channel_info|EObject/channel_2|channel_2:"
		   });		
		addAnnotation
		  (getChannel_info_Channel_3(), 
		   source, 
		   new String[] {
			 "target_id", "Latestchannelinfos|Handler/channel_infos|channel_infos:Channel_infos|EObject/channel_info|channel_info:Channel_info|EObject/channel_3|channel_3:"
		   });		
		addAnnotation
		  (channel_infosEClass, 
		   source, 
		   new String[] {
			 "target_id", "Latestchannelinfos|Handler/channel_infos|channel_infos:Channel_infos|EObject"
		   });		
		addAnnotation
		  (getChannel_infos_Text(), 
		   source, 
		   new String[] {
			 "target_id", "Latestchannelinfos|Handler/channel_infos|channel_infos:Channel_infos|EObject/text|text:"
		   });		
		addAnnotation
		  (getChannel_infos_Channel_info(), 
		   source, 
		   new String[] {
			 "target_id", "Latestchannelinfos|Handler/channel_infos|channel_infos:Channel_infos|EObject/channel_info|channel_info:Channel_info|EObject",
			 "IsCopy", "false"
		   });		
		addAnnotation
		  (latestchannelinfosEClass, 
		   source, 
		   new String[] {
			 "target_id", "Latestchannelinfos|Handler"
		   });		
		addAnnotation
		  (getLatestchannelinfos_Channel_infos(), 
		   source, 
		   new String[] {
			 "target_id", "Latestchannelinfos|Handler/channel_infos|channel_infos:Channel_infos|EObject",
			 "IsCopy", "false"
		   });
	}

} //Seismo_latestchannelinfosPackageImpl
