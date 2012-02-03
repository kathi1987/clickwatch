/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificdatamodels.brn.impl;

import de.hub.clickwatch.datamodel.ClickWatchDataModelPackage;

import de.hub.clickwatch.specificdatamodels.brn.BrnFactory;
import de.hub.clickwatch.specificdatamodels.brn.BrnPackage;
import de.hub.clickwatch.specificdatamodels.brn.HandlerSubClass;

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

import de.hub.clickwatch.specificdatamodels.brn.lease_tab_leases.Lease_tab_leasesPackage;

import de.hub.clickwatch.specificdatamodels.brn.lease_tab_leases.impl.Lease_tab_leasesPackageImpl;

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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BrnPackageImpl extends EPackageImpl implements BrnPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass handlerSubClassEClass = null;

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
	 * @see de.hub.clickwatch.specificdatamodels.brn.BrnPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BrnPackageImpl() {
		super(eNS_URI, BrnFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link BrnPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BrnPackage init() {
		if (isInited) return (BrnPackage)EPackage.Registry.INSTANCE.getEPackage(BrnPackage.eNS_URI);

		// Obtain or create and register package
		BrnPackageImpl theBrnPackage = (BrnPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BrnPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BrnPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ClickWatchDataModelPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
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
		Seismo_localchannelinfoPackageImpl theSeismo_localchannelinfoPackage = (Seismo_localchannelinfoPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Seismo_localchannelinfoPackage.eNS_URI) instanceof Seismo_localchannelinfoPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Seismo_localchannelinfoPackage.eNS_URI) : Seismo_localchannelinfoPackage.eINSTANCE);
		Tsi_syncinfoPackageImpl theTsi_syncinfoPackage = (Tsi_syncinfoPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Tsi_syncinfoPackage.eNS_URI) instanceof Tsi_syncinfoPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Tsi_syncinfoPackage.eNS_URI) : Tsi_syncinfoPackage.eINSTANCE);

		// Create package meta-data objects
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
		theSeismo_localchannelinfoPackage.createPackageContents();
		theTsi_syncinfoPackage.createPackageContents();

		// Initialize created meta-data
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
		theSeismo_localchannelinfoPackage.initializePackageContents();
		theTsi_syncinfoPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBrnPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BrnPackage.eNS_URI, theBrnPackage);
		return theBrnPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHandlerSubClass() {
		return handlerSubClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BrnFactory getBrnFactory() {
		return (BrnFactory)getEFactoryInstance();
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
		handlerSubClassEClass = createEClass(HANDLER_SUB_CLASS);
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
		Sys_info_systeminfoPackage theSys_info_systeminfoPackage = (Sys_info_systeminfoPackage)EPackage.Registry.INSTANCE.getEPackage(Sys_info_systeminfoPackage.eNS_URI);
		Device_wifi_data_power_systempowerPackage theDevice_wifi_data_power_systempowerPackage = (Device_wifi_data_power_systempowerPackage)EPackage.Registry.INSTANCE.getEPackage(Device_wifi_data_power_systempowerPackage.eNS_URI);
		Device_wifi_wifidevice_sc_systemchannelPackage theDevice_wifi_wifidevice_sc_systemchannelPackage = (Device_wifi_wifidevice_sc_systemchannelPackage)EPackage.Registry.INSTANCE.getEPackage(Device_wifi_wifidevice_sc_systemchannelPackage.eNS_URI);
		Lease_tab_leasesPackage theLease_tab_leasesPackage = (Lease_tab_leasesPackage)EPackage.Registry.INSTANCE.getEPackage(Lease_tab_leasesPackage.eNS_URI);
		Gps_gps_coordPackage theGps_gps_coordPackage = (Gps_gps_coordPackage)EPackage.Registry.INSTANCE.getEPackage(Gps_gps_coordPackage.eNS_URI);
		Gps_cart_coordPackage theGps_cart_coordPackage = (Gps_cart_coordPackage)EPackage.Registry.INSTANCE.getEPackage(Gps_cart_coordPackage.eNS_URI);
		Lt_routesPackage theLt_routesPackage = (Lt_routesPackage)EPackage.Registry.INSTANCE.getEPackage(Lt_routesPackage.eNS_URI);
		Lt_linksPackage theLt_linksPackage = (Lt_linksPackage)EPackage.Registry.INSTANCE.getEPackage(Lt_linksPackage.eNS_URI);
		Device_wifi_link_stat_bcast_statsPackage theDevice_wifi_link_stat_bcast_statsPackage = (Device_wifi_link_stat_bcast_statsPackage)EPackage.Registry.INSTANCE.getEPackage(Device_wifi_link_stat_bcast_statsPackage.eNS_URI);
		Device_wifi_wifidevice_cst_statsPackage theDevice_wifi_wifidevice_cst_statsPackage = (Device_wifi_wifidevice_cst_statsPackage)EPackage.Registry.INSTANCE.getEPackage(Device_wifi_wifidevice_cst_statsPackage.eNS_URI);
		Sf_statsPackage theSf_statsPackage = (Sf_statsPackage)EPackage.Registry.INSTANCE.getEPackage(Sf_statsPackage.eNS_URI);
		Routing_dsr_stats_statsPackage theRouting_dsr_stats_statsPackage = (Routing_dsr_stats_statsPackage)EPackage.Registry.INSTANCE.getEPackage(Routing_dsr_stats_statsPackage.eNS_URI);
		Seismo_localchannelinfoPackage theSeismo_localchannelinfoPackage = (Seismo_localchannelinfoPackage)EPackage.Registry.INSTANCE.getEPackage(Seismo_localchannelinfoPackage.eNS_URI);
		Tsi_syncinfoPackage theTsi_syncinfoPackage = (Tsi_syncinfoPackage)EPackage.Registry.INSTANCE.getEPackage(Tsi_syncinfoPackage.eNS_URI);
		ClickWatchDataModelPackage theClickWatchDataModelPackage = (ClickWatchDataModelPackage)EPackage.Registry.INSTANCE.getEPackage(ClickWatchDataModelPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theSys_info_systeminfoPackage);
		getESubpackages().add(theDevice_wifi_data_power_systempowerPackage);
		getESubpackages().add(theDevice_wifi_wifidevice_sc_systemchannelPackage);
		getESubpackages().add(theLease_tab_leasesPackage);
		getESubpackages().add(theGps_gps_coordPackage);
		getESubpackages().add(theGps_cart_coordPackage);
		getESubpackages().add(theLt_routesPackage);
		getESubpackages().add(theLt_linksPackage);
		getESubpackages().add(theDevice_wifi_link_stat_bcast_statsPackage);
		getESubpackages().add(theDevice_wifi_wifidevice_cst_statsPackage);
		getESubpackages().add(theSf_statsPackage);
		getESubpackages().add(theRouting_dsr_stats_statsPackage);
		getESubpackages().add(theSeismo_localchannelinfoPackage);
		getESubpackages().add(theTsi_syncinfoPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		handlerSubClassEClass.getESuperTypes().add(theClickWatchDataModelPackage.getValue());

		// Initialize classes and features; add operations and parameters
		initEClass(handlerSubClassEClass, HandlerSubClass.class, "HandlerSubClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //BrnPackageImpl
