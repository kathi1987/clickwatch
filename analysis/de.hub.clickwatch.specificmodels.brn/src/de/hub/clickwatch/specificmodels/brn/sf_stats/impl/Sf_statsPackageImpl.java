/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.sf_stats.impl;

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

import de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.Seismo_localchannelinfoPackage;

import de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.impl.Seismo_localchannelinfoPackageImpl;

import de.hub.clickwatch.specificmodels.brn.sf_stats.Flowstats;
import de.hub.clickwatch.specificmodels.brn.sf_stats.Rxflow;
import de.hub.clickwatch.specificmodels.brn.sf_stats.Sf_statsFactory;
import de.hub.clickwatch.specificmodels.brn.sf_stats.Sf_statsPackage;
import de.hub.clickwatch.specificmodels.brn.sf_stats.Stats;
import de.hub.clickwatch.specificmodels.brn.sf_stats.Txflow;

import de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Sys_info_systeminfoPackage;

import de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.impl.Sys_info_systeminfoPackageImpl;

import de.hub.clickwatch.specificmodels.brn.tsi_syncinfo.Tsi_syncinfoPackage;
import de.hub.clickwatch.specificmodels.brn.tsi_syncinfo.impl.Tsi_syncinfoPackageImpl;
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
public class Sf_statsPackageImpl extends EPackageImpl implements Sf_statsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowstatsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rxflowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass txflowEClass = null;

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
	 * @see de.hub.clickwatch.specificmodels.brn.sf_stats.Sf_statsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Sf_statsPackageImpl() {
		super(eNS_URI, Sf_statsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Sf_statsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Sf_statsPackage init() {
		if (isInited) return (Sf_statsPackage)EPackage.Registry.INSTANCE.getEPackage(Sf_statsPackage.eNS_URI);

		// Obtain or create and register package
		Sf_statsPackageImpl theSf_statsPackage = (Sf_statsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Sf_statsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Sf_statsPackageImpl());

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
		Routing_dsr_stats_statsPackageImpl theRouting_dsr_stats_statsPackage = (Routing_dsr_stats_statsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Routing_dsr_stats_statsPackage.eNS_URI) instanceof Routing_dsr_stats_statsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Routing_dsr_stats_statsPackage.eNS_URI) : Routing_dsr_stats_statsPackage.eINSTANCE);
		Seismo_localchannelinfoPackageImpl theSeismo_localchannelinfoPackage = (Seismo_localchannelinfoPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Seismo_localchannelinfoPackage.eNS_URI) instanceof Seismo_localchannelinfoPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Seismo_localchannelinfoPackage.eNS_URI) : Seismo_localchannelinfoPackage.eINSTANCE);
		Tsi_syncinfoPackageImpl theTsi_syncinfoPackage = (Tsi_syncinfoPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Tsi_syncinfoPackage.eNS_URI) instanceof Tsi_syncinfoPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Tsi_syncinfoPackage.eNS_URI) : Tsi_syncinfoPackage.eINSTANCE);

		// Create package meta-data objects
		theSf_statsPackage.createPackageContents();
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
		theRouting_dsr_stats_statsPackage.createPackageContents();
		theSeismo_localchannelinfoPackage.createPackageContents();
		theTsi_syncinfoPackage.createPackageContents();

		// Initialize created meta-data
		theSf_statsPackage.initializePackageContents();
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
		theRouting_dsr_stats_statsPackage.initializePackageContents();
		theSeismo_localchannelinfoPackage.initializePackageContents();
		theTsi_syncinfoPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSf_statsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Sf_statsPackage.eNS_URI, theSf_statsPackage);
		return theSf_statsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlowstats() {
		return flowstatsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowstats_EContainer_flowstats() {
		return (EReference)flowstatsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlowstats_Text() {
		return (EAttribute)flowstatsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowstats_Txflow() {
		return (EReference)flowstatsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowstats_Rxflow() {
		return (EReference)flowstatsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlowstats_Node() {
		return (EAttribute)flowstatsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRxflow() {
		return rxflowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRxflow_EContainer_rxflow() {
		return (EReference)rxflowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRxflow_Src() {
		return (EAttribute)rxflowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRxflow_Dst() {
		return (EAttribute)rxflowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRxflow_Flowid() {
		return (EAttribute)rxflowEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRxflow_Packet_count() {
		return (EAttribute)rxflowEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRxflow_Packet_size() {
		return (EAttribute)rxflowEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRxflow_Crc_err() {
		return (EAttribute)rxflowEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRxflow_Avg_hops() {
		return (EAttribute)rxflowEClass.getEStructuralFeatures().get(7);
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
	public EReference getStats_Flowstats() {
		return (EReference)statsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTxflow() {
		return txflowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTxflow_EContainer_txflow() {
		return (EReference)txflowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTxflow_Src() {
		return (EAttribute)txflowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTxflow_Dst() {
		return (EAttribute)txflowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTxflow_Flowid() {
		return (EAttribute)txflowEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTxflow_Packet_count() {
		return (EAttribute)txflowEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTxflow_Packet_size() {
		return (EAttribute)txflowEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTxflow_Replies() {
		return (EAttribute)txflowEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTxflow_Avg_hops() {
		return (EAttribute)txflowEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTxflow_Time() {
		return (EAttribute)txflowEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sf_statsFactory getSf_statsFactory() {
		return (Sf_statsFactory)getEFactoryInstance();
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
		flowstatsEClass = createEClass(FLOWSTATS);
		createEReference(flowstatsEClass, FLOWSTATS__ECONTAINER_FLOWSTATS);
		createEAttribute(flowstatsEClass, FLOWSTATS__TEXT);
		createEReference(flowstatsEClass, FLOWSTATS__TXFLOW);
		createEReference(flowstatsEClass, FLOWSTATS__RXFLOW);
		createEAttribute(flowstatsEClass, FLOWSTATS__NODE);

		rxflowEClass = createEClass(RXFLOW);
		createEReference(rxflowEClass, RXFLOW__ECONTAINER_RXFLOW);
		createEAttribute(rxflowEClass, RXFLOW__SRC);
		createEAttribute(rxflowEClass, RXFLOW__DST);
		createEAttribute(rxflowEClass, RXFLOW__FLOWID);
		createEAttribute(rxflowEClass, RXFLOW__PACKET_COUNT);
		createEAttribute(rxflowEClass, RXFLOW__PACKET_SIZE);
		createEAttribute(rxflowEClass, RXFLOW__CRC_ERR);
		createEAttribute(rxflowEClass, RXFLOW__AVG_HOPS);

		statsEClass = createEClass(STATS);
		createEReference(statsEClass, STATS__FLOWSTATS);

		txflowEClass = createEClass(TXFLOW);
		createEReference(txflowEClass, TXFLOW__ECONTAINER_TXFLOW);
		createEAttribute(txflowEClass, TXFLOW__SRC);
		createEAttribute(txflowEClass, TXFLOW__DST);
		createEAttribute(txflowEClass, TXFLOW__FLOWID);
		createEAttribute(txflowEClass, TXFLOW__PACKET_COUNT);
		createEAttribute(txflowEClass, TXFLOW__PACKET_SIZE);
		createEAttribute(txflowEClass, TXFLOW__REPLIES);
		createEAttribute(txflowEClass, TXFLOW__AVG_HOPS);
		createEAttribute(txflowEClass, TXFLOW__TIME);
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
		initEClass(flowstatsEClass, Flowstats.class, "Flowstats", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFlowstats_EContainer_flowstats(), this.getStats(), this.getStats_Flowstats(), "eContainer_flowstats", null, 0, 1, Flowstats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlowstats_Text(), ecorePackage.getEString(), "text", null, 0, -1, Flowstats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlowstats_Txflow(), this.getTxflow(), this.getTxflow_EContainer_txflow(), "txflow", null, 0, -1, Flowstats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlowstats_Rxflow(), this.getRxflow(), this.getRxflow_EContainer_rxflow(), "rxflow", null, 0, -1, Flowstats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlowstats_Node(), ecorePackage.getEString(), "node", null, 0, 1, Flowstats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rxflowEClass, Rxflow.class, "Rxflow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRxflow_EContainer_rxflow(), this.getFlowstats(), this.getFlowstats_Rxflow(), "eContainer_rxflow", null, 0, 1, Rxflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRxflow_Src(), ecorePackage.getEString(), "src", null, 0, 1, Rxflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRxflow_Dst(), ecorePackage.getEString(), "dst", null, 0, 1, Rxflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRxflow_Flowid(), ecorePackage.getEInt(), "flowid", null, 0, 1, Rxflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRxflow_Packet_count(), ecorePackage.getEInt(), "packet_count", null, 0, 1, Rxflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRxflow_Packet_size(), ecorePackage.getEInt(), "packet_size", null, 0, 1, Rxflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRxflow_Crc_err(), ecorePackage.getEInt(), "crc_err", null, 0, 1, Rxflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRxflow_Avg_hops(), ecorePackage.getEInt(), "avg_hops", null, 0, 1, Rxflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statsEClass, Stats.class, "Stats", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStats_Flowstats(), this.getFlowstats(), this.getFlowstats_EContainer_flowstats(), "flowstats", null, 0, 1, Stats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(txflowEClass, Txflow.class, "Txflow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTxflow_EContainer_txflow(), this.getFlowstats(), this.getFlowstats_Txflow(), "eContainer_txflow", null, 0, 1, Txflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTxflow_Src(), ecorePackage.getEString(), "src", null, 0, 1, Txflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTxflow_Dst(), ecorePackage.getEString(), "dst", null, 0, 1, Txflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTxflow_Flowid(), ecorePackage.getEInt(), "flowid", null, 0, 1, Txflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTxflow_Packet_count(), ecorePackage.getEInt(), "packet_count", null, 0, 1, Txflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTxflow_Packet_size(), ecorePackage.getEInt(), "packet_size", null, 0, 1, Txflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTxflow_Replies(), ecorePackage.getEInt(), "replies", null, 0, 1, Txflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTxflow_Avg_hops(), ecorePackage.getEInt(), "avg_hops", null, 0, 1, Txflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTxflow_Time(), ecorePackage.getEInt(), "time", null, 0, 1, Txflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
			 "handler_name", "sf/stats"
		   });		
		addAnnotation
		  (flowstatsEClass, 
		   source, 
		   new String[] {
			 "target_id", "Stats|Handler/flowstats|flowstats:Flowstats|EObject"
		   });		
		addAnnotation
		  (getFlowstats_Text(), 
		   source, 
		   new String[] {
			 "target_id", "Stats|Handler/flowstats|flowstats:Flowstats|EObject/text|text:"
		   });		
		addAnnotation
		  (getFlowstats_Txflow(), 
		   source, 
		   new String[] {
			 "target_id", "Stats|Handler/flowstats|flowstats:Flowstats|EObject/txflow|txflow:Txflow|EObject",
			 "IsCopy", "false"
		   });		
		addAnnotation
		  (getFlowstats_Rxflow(), 
		   source, 
		   new String[] {
			 "target_id", "Stats|Handler/flowstats|flowstats:Flowstats|EObject/rxflow|rxflow:Rxflow|EObject",
			 "IsCopy", "false"
		   });		
		addAnnotation
		  (getFlowstats_Node(), 
		   source, 
		   new String[] {
			 "target_id", "Stats|Handler/flowstats|flowstats:Flowstats|EObject/node|node:"
		   });		
		addAnnotation
		  (rxflowEClass, 
		   source, 
		   new String[] {
			 "target_id", "Stats|Handler/flowstats|flowstats:Flowstats|EObject/rxflow|rxflow:Rxflow|EObject"
		   });		
		addAnnotation
		  (getRxflow_Src(), 
		   source, 
		   new String[] {
			 "target_id", "Stats|Handler/flowstats|flowstats:Flowstats|EObject/rxflow|rxflow:Rxflow|EObject/src|src:"
		   });		
		addAnnotation
		  (getRxflow_Dst(), 
		   source, 
		   new String[] {
			 "target_id", "Stats|Handler/flowstats|flowstats:Flowstats|EObject/rxflow|rxflow:Rxflow|EObject/dst|dst:"
		   });		
		addAnnotation
		  (getRxflow_Flowid(), 
		   source, 
		   new String[] {
			 "target_id", "Stats|Handler/flowstats|flowstats:Flowstats|EObject/rxflow|rxflow:Rxflow|EObject/flowid|flowid:"
		   });		
		addAnnotation
		  (getRxflow_Packet_count(), 
		   source, 
		   new String[] {
			 "target_id", "Stats|Handler/flowstats|flowstats:Flowstats|EObject/rxflow|rxflow:Rxflow|EObject/packet_count|packet_count:"
		   });		
		addAnnotation
		  (getRxflow_Packet_size(), 
		   source, 
		   new String[] {
			 "target_id", "Stats|Handler/flowstats|flowstats:Flowstats|EObject/rxflow|rxflow:Rxflow|EObject/packet_size|packet_size:"
		   });		
		addAnnotation
		  (getRxflow_Crc_err(), 
		   source, 
		   new String[] {
			 "target_id", "Stats|Handler/flowstats|flowstats:Flowstats|EObject/rxflow|rxflow:Rxflow|EObject/crc_err|crc_err:"
		   });		
		addAnnotation
		  (getRxflow_Avg_hops(), 
		   source, 
		   new String[] {
			 "target_id", "Stats|Handler/flowstats|flowstats:Flowstats|EObject/rxflow|rxflow:Rxflow|EObject/avg_hops|avg_hops:"
		   });		
		addAnnotation
		  (statsEClass, 
		   source, 
		   new String[] {
			 "target_id", "Stats|Handler"
		   });		
		addAnnotation
		  (getStats_Flowstats(), 
		   source, 
		   new String[] {
			 "target_id", "Stats|Handler/flowstats|flowstats:Flowstats|EObject",
			 "IsCopy", "false"
		   });		
		addAnnotation
		  (txflowEClass, 
		   source, 
		   new String[] {
			 "target_id", "Stats|Handler/flowstats|flowstats:Flowstats|EObject/txflow|txflow:Txflow|EObject"
		   });		
		addAnnotation
		  (getTxflow_Src(), 
		   source, 
		   new String[] {
			 "target_id", "Stats|Handler/flowstats|flowstats:Flowstats|EObject/txflow|txflow:Txflow|EObject/src|src:"
		   });		
		addAnnotation
		  (getTxflow_Dst(), 
		   source, 
		   new String[] {
			 "target_id", "Stats|Handler/flowstats|flowstats:Flowstats|EObject/txflow|txflow:Txflow|EObject/dst|dst:"
		   });		
		addAnnotation
		  (getTxflow_Flowid(), 
		   source, 
		   new String[] {
			 "target_id", "Stats|Handler/flowstats|flowstats:Flowstats|EObject/txflow|txflow:Txflow|EObject/flowid|flowid:"
		   });		
		addAnnotation
		  (getTxflow_Packet_count(), 
		   source, 
		   new String[] {
			 "target_id", "Stats|Handler/flowstats|flowstats:Flowstats|EObject/txflow|txflow:Txflow|EObject/packet_count|packet_count:"
		   });		
		addAnnotation
		  (getTxflow_Packet_size(), 
		   source, 
		   new String[] {
			 "target_id", "Stats|Handler/flowstats|flowstats:Flowstats|EObject/txflow|txflow:Txflow|EObject/packet_size|packet_size:"
		   });		
		addAnnotation
		  (getTxflow_Replies(), 
		   source, 
		   new String[] {
			 "target_id", "Stats|Handler/flowstats|flowstats:Flowstats|EObject/txflow|txflow:Txflow|EObject/replies|replies:"
		   });		
		addAnnotation
		  (getTxflow_Avg_hops(), 
		   source, 
		   new String[] {
			 "target_id", "Stats|Handler/flowstats|flowstats:Flowstats|EObject/txflow|txflow:Txflow|EObject/avg_hops|avg_hops:"
		   });		
		addAnnotation
		  (getTxflow_Time(), 
		   source, 
		   new String[] {
			 "target_id", "Stats|Handler/flowstats|flowstats:Flowstats|EObject/txflow|txflow:Txflow|EObject/time|time:"
		   });
	}

} //Sf_statsPackageImpl
