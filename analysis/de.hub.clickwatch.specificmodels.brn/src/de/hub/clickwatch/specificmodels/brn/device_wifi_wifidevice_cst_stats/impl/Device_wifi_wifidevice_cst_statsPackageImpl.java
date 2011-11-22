/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl;

import de.hub.clickwatch.model.ClickWatchModelPackage;

import de.hub.clickwatch.specificmodels.brn.BrnPackage;

import de.hub.clickwatch.specificmodels.brn.device_wifi_data_power_systempower.Device_wifi_data_power_systempowerPackage;

import de.hub.clickwatch.specificmodels.brn.device_wifi_data_power_systempower.impl.Device_wifi_data_power_systempowerPackageImpl;

import de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Device_wifi_link_stat_bcast_statsPackage;

import de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.impl.Device_wifi_link_stat_bcast_statsPackageImpl;

import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Channelstats;
import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Ctl;
import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsFactory;
import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage;
import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Ext;
import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac;
import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac_duration;
import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac_percentage;
import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Nb;
import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Neighbourstats;
import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Perf_counter;
import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Phy;
import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Rssi_extended;
import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Rssi_hist;
import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Stats;

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

import de.hub.clickwatch.specificmodels.brn.sf_stats.Sf_statsPackage;

import de.hub.clickwatch.specificmodels.brn.sf_stats.impl.Sf_statsPackageImpl;

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
public class Device_wifi_wifidevice_cst_statsPackageImpl extends EPackageImpl implements Device_wifi_wifidevice_cst_statsPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass channelstatsEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass ctlEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass extEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass macEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass mac_durationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass mac_percentageEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass nbEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass neighbourstatsEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass perf_counterEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass phyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass rssi_extendedEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass rssi_histEClass = null;

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
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private Device_wifi_wifidevice_cst_statsPackageImpl() {
        super(eNS_URI, Device_wifi_wifidevice_cst_statsFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link Device_wifi_wifidevice_cst_statsPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static Device_wifi_wifidevice_cst_statsPackage init() {
        if (isInited) return (Device_wifi_wifidevice_cst_statsPackage)EPackage.Registry.INSTANCE.getEPackage(Device_wifi_wifidevice_cst_statsPackage.eNS_URI);

        // Obtain or create and register package
        Device_wifi_wifidevice_cst_statsPackageImpl theDevice_wifi_wifidevice_cst_statsPackage = (Device_wifi_wifidevice_cst_statsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Device_wifi_wifidevice_cst_statsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Device_wifi_wifidevice_cst_statsPackageImpl());

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
        Sf_statsPackageImpl theSf_statsPackage = (Sf_statsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Sf_statsPackage.eNS_URI) instanceof Sf_statsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Sf_statsPackage.eNS_URI) : Sf_statsPackage.eINSTANCE);
        Routing_dsr_stats_statsPackageImpl theRouting_dsr_stats_statsPackage = (Routing_dsr_stats_statsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Routing_dsr_stats_statsPackage.eNS_URI) instanceof Routing_dsr_stats_statsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Routing_dsr_stats_statsPackage.eNS_URI) : Routing_dsr_stats_statsPackage.eINSTANCE);
        Seismo_localchannelinfoPackageImpl theSeismo_localchannelinfoPackage = (Seismo_localchannelinfoPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Seismo_localchannelinfoPackage.eNS_URI) instanceof Seismo_localchannelinfoPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Seismo_localchannelinfoPackage.eNS_URI) : Seismo_localchannelinfoPackage.eINSTANCE);
        Tsi_syncinfoPackageImpl theTsi_syncinfoPackage = (Tsi_syncinfoPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Tsi_syncinfoPackage.eNS_URI) instanceof Tsi_syncinfoPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Tsi_syncinfoPackage.eNS_URI) : Tsi_syncinfoPackage.eINSTANCE);

        // Create package meta-data objects
        theDevice_wifi_wifidevice_cst_statsPackage.createPackageContents();
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
        theSf_statsPackage.createPackageContents();
        theRouting_dsr_stats_statsPackage.createPackageContents();
        theSeismo_localchannelinfoPackage.createPackageContents();
        theTsi_syncinfoPackage.createPackageContents();

        // Initialize created meta-data
        theDevice_wifi_wifidevice_cst_statsPackage.initializePackageContents();
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
        theSf_statsPackage.initializePackageContents();
        theRouting_dsr_stats_statsPackage.initializePackageContents();
        theSeismo_localchannelinfoPackage.initializePackageContents();
        theTsi_syncinfoPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theDevice_wifi_wifidevice_cst_statsPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(Device_wifi_wifidevice_cst_statsPackage.eNS_URI, theDevice_wifi_wifidevice_cst_statsPackage);
        return theDevice_wifi_wifidevice_cst_statsPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getChannelstats() {
        return channelstatsEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getChannelstats_EContainer_channelstats() {
        return (EReference)channelstatsEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getChannelstats_Text() {
        return (EAttribute)channelstatsEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getChannelstats_Mac() {
        return (EReference)channelstatsEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getChannelstats_Mac_percentage() {
        return (EReference)channelstatsEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getChannelstats_Mac_duration() {
        return (EReference)channelstatsEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getChannelstats_Phy() {
        return (EReference)channelstatsEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getChannelstats_Perf_counter() {
        return (EReference)channelstatsEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getChannelstats_Neighbourstats() {
        return (EReference)channelstatsEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getChannelstats_Node() {
        return (EAttribute)channelstatsEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getChannelstats_Time() {
        return (EAttribute)channelstatsEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getChannelstats_Id() {
        return (EAttribute)channelstatsEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getChannelstats_Length() {
        return (EAttribute)channelstatsEClass.getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getChannelstats_Hw_duration() {
        return (EAttribute)channelstatsEClass.getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getChannelstats_Unit() {
        return (EAttribute)channelstatsEClass.getEStructuralFeatures().get(13);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCtl() {
        return ctlEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCtl_EContainer_ctl() {
        return (EReference)ctlEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCtl_Rssi0() {
        return (EAttribute)ctlEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCtl_Rssi1() {
        return (EAttribute)ctlEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCtl_Rssi2() {
        return (EAttribute)ctlEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getExt() {
        return extEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getExt_EContainer_ext() {
        return (EReference)extEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getExt_Rssi0() {
        return (EAttribute)extEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getExt_Rssi1() {
        return (EAttribute)extEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getExt_Rssi2() {
        return (EAttribute)extEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMac() {
        return macEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getMac_EContainer_mac() {
        return (EReference)macEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMac_Packets() {
        return (EAttribute)macEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMac_Rx_pkt() {
        return (EAttribute)macEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMac_No_err_pkt() {
        return (EAttribute)macEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMac_Crc_err_pkt() {
        return (EAttribute)macEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMac_Phy_err_pkt() {
        return (EAttribute)macEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMac_Unknown_err_pkt() {
        return (EAttribute)macEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMac_Tx_pkt() {
        return (EAttribute)macEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMac_Rx_unicast_pkt() {
        return (EAttribute)macEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMac_Rx_retry_pkt() {
        return (EAttribute)macEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMac_Rx_bcast_pkt() {
        return (EAttribute)macEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMac_Rx_bytes() {
        return (EAttribute)macEClass.getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMac_Tx_unicast_pkt() {
        return (EAttribute)macEClass.getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMac_Tx_retry_pkt() {
        return (EAttribute)macEClass.getEStructuralFeatures().get(13);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMac_Tx_bcast_pkt() {
        return (EAttribute)macEClass.getEStructuralFeatures().get(14);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMac_Tx_bytes() {
        return (EAttribute)macEClass.getEStructuralFeatures().get(15);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMac_Zero_err_pkt() {
        return (EAttribute)macEClass.getEStructuralFeatures().get(16);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMac_Last_packet_time() {
        return (EAttribute)macEClass.getEStructuralFeatures().get(17);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMac_No_src() {
        return (EAttribute)macEClass.getEStructuralFeatures().get(18);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMac_duration() {
        return mac_durationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getMac_duration_EContainer_mac_duration() {
        return (EReference)mac_durationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMac_duration_Busy() {
        return (EAttribute)mac_durationEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMac_duration_Rx() {
        return (EAttribute)mac_durationEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMac_duration_Tx() {
        return (EAttribute)mac_durationEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMac_duration_Noerr_rx() {
        return (EAttribute)mac_durationEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMac_duration_Crc_rx() {
        return (EAttribute)mac_durationEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMac_duration_Phy_rx() {
        return (EAttribute)mac_durationEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMac_duration_Unknown_err_rx() {
        return (EAttribute)mac_durationEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMac_duration_Unit() {
        return (EAttribute)mac_durationEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMac_percentage() {
        return mac_percentageEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getMac_percentage_EContainer_mac_percentage() {
        return (EReference)mac_percentageEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMac_percentage_Busy() {
        return (EAttribute)mac_percentageEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMac_percentage_Rx() {
        return (EAttribute)mac_percentageEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMac_percentage_Tx() {
        return (EAttribute)mac_percentageEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMac_percentage_Noerr_rx() {
        return (EAttribute)mac_percentageEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMac_percentage_Crc_rx() {
        return (EAttribute)mac_percentageEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMac_percentage_Phy_rx() {
        return (EAttribute)mac_percentageEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMac_percentage_Unknown_err_rx() {
        return (EAttribute)mac_percentageEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMac_percentage_Unit() {
        return (EAttribute)mac_percentageEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getNb() {
        return nbEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getNb_EContainer_nb() {
        return (EReference)nbEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getNb_Text() {
        return (EAttribute)nbEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getNb_Rssi_extended() {
        return (EReference)nbEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getNb_Rssi_hist() {
        return (EReference)nbEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getNb_Addr() {
        return (EAttribute)nbEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getNb_Rssi() {
        return (EAttribute)nbEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getNb_Std_rssi() {
        return (EAttribute)nbEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getNb_Min_rssi() {
        return (EAttribute)nbEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getNb_Max_rssi() {
        return (EAttribute)nbEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getNb_Pkt_cnt() {
        return (EAttribute)nbEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getNb_Rx_bytes() {
        return (EAttribute)nbEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getNeighbourstats() {
        return neighbourstatsEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getNeighbourstats_EContainer_neighbourstats() {
        return (EReference)neighbourstatsEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getNeighbourstats_Text() {
        return (EAttribute)neighbourstatsEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getNeighbourstats_Nb() {
        return (EReference)neighbourstatsEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPerf_counter() {
        return perf_counterEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getPerf_counter_EContainer_perf_counter() {
        return (EReference)perf_counterEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPerf_counter_Cycles() {
        return (EAttribute)perf_counterEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPerf_counter_Busy_cycles() {
        return (EAttribute)perf_counterEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPerf_counter_Rx_cycles() {
        return (EAttribute)perf_counterEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPerf_counter_Tx_cycles() {
        return (EAttribute)perf_counterEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPhy() {
        return phyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getPhy_EContainer_phy() {
        return (EReference)phyEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPhy_Hwbusy() {
        return (EAttribute)phyEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPhy_Hwrx() {
        return (EAttribute)phyEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPhy_Hwtx() {
        return (EAttribute)phyEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPhy_Last_hw_stat_time() {
        return (EAttribute)phyEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPhy_Hw_stats_count() {
        return (EAttribute)phyEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPhy_Avg_noise() {
        return (EAttribute)phyEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPhy_Std_noise() {
        return (EAttribute)phyEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPhy_Avg_rssi() {
        return (EAttribute)phyEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPhy_Std_rssi() {
        return (EAttribute)phyEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPhy_Ctl_rssi0() {
        return (EAttribute)phyEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPhy_Ctl_rssi1() {
        return (EAttribute)phyEClass.getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPhy_Ctl_rssi2() {
        return (EAttribute)phyEClass.getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPhy_Ext_rssi0() {
        return (EAttribute)phyEClass.getEStructuralFeatures().get(13);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPhy_Ext_rssi1() {
        return (EAttribute)phyEClass.getEStructuralFeatures().get(14);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPhy_Ext_rssi2() {
        return (EAttribute)phyEClass.getEStructuralFeatures().get(15);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPhy_Channel() {
        return (EAttribute)phyEClass.getEStructuralFeatures().get(16);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRssi_extended() {
        return rssi_extendedEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRssi_extended_EContainer_rssi_extended() {
        return (EReference)rssi_extendedEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRssi_extended_Text() {
        return (EAttribute)rssi_extendedEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRssi_extended_Ctl() {
        return (EReference)rssi_extendedEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRssi_extended_Ext() {
        return (EReference)rssi_extendedEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRssi_hist() {
        return rssi_histEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRssi_hist_EContainer_rssi_hist() {
        return (EReference)rssi_histEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRssi_hist_Size() {
        return (EAttribute)rssi_histEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRssi_hist_Max_size() {
        return (EAttribute)rssi_histEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRssi_hist_Overflow() {
        return (EAttribute)rssi_histEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRssi_hist_Values() {
        return (EAttribute)rssi_histEClass.getEStructuralFeatures().get(4);
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
    public EReference getStats_Channelstats() {
        return (EReference)statsEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Device_wifi_wifidevice_cst_statsFactory getDevice_wifi_wifidevice_cst_statsFactory() {
        return (Device_wifi_wifidevice_cst_statsFactory)getEFactoryInstance();
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
        channelstatsEClass = createEClass(CHANNELSTATS);
        createEReference(channelstatsEClass, CHANNELSTATS__ECONTAINER_CHANNELSTATS);
        createEAttribute(channelstatsEClass, CHANNELSTATS__TEXT);
        createEReference(channelstatsEClass, CHANNELSTATS__MAC);
        createEReference(channelstatsEClass, CHANNELSTATS__MAC_PERCENTAGE);
        createEReference(channelstatsEClass, CHANNELSTATS__MAC_DURATION);
        createEReference(channelstatsEClass, CHANNELSTATS__PHY);
        createEReference(channelstatsEClass, CHANNELSTATS__PERF_COUNTER);
        createEReference(channelstatsEClass, CHANNELSTATS__NEIGHBOURSTATS);
        createEAttribute(channelstatsEClass, CHANNELSTATS__NODE);
        createEAttribute(channelstatsEClass, CHANNELSTATS__TIME);
        createEAttribute(channelstatsEClass, CHANNELSTATS__ID);
        createEAttribute(channelstatsEClass, CHANNELSTATS__LENGTH);
        createEAttribute(channelstatsEClass, CHANNELSTATS__HW_DURATION);
        createEAttribute(channelstatsEClass, CHANNELSTATS__UNIT);

        ctlEClass = createEClass(CTL);
        createEReference(ctlEClass, CTL__ECONTAINER_CTL);
        createEAttribute(ctlEClass, CTL__RSSI0);
        createEAttribute(ctlEClass, CTL__RSSI1);
        createEAttribute(ctlEClass, CTL__RSSI2);

        extEClass = createEClass(EXT);
        createEReference(extEClass, EXT__ECONTAINER_EXT);
        createEAttribute(extEClass, EXT__RSSI0);
        createEAttribute(extEClass, EXT__RSSI1);
        createEAttribute(extEClass, EXT__RSSI2);

        macEClass = createEClass(MAC);
        createEReference(macEClass, MAC__ECONTAINER_MAC);
        createEAttribute(macEClass, MAC__PACKETS);
        createEAttribute(macEClass, MAC__RX_PKT);
        createEAttribute(macEClass, MAC__NO_ERR_PKT);
        createEAttribute(macEClass, MAC__CRC_ERR_PKT);
        createEAttribute(macEClass, MAC__PHY_ERR_PKT);
        createEAttribute(macEClass, MAC__UNKNOWN_ERR_PKT);
        createEAttribute(macEClass, MAC__TX_PKT);
        createEAttribute(macEClass, MAC__RX_UNICAST_PKT);
        createEAttribute(macEClass, MAC__RX_RETRY_PKT);
        createEAttribute(macEClass, MAC__RX_BCAST_PKT);
        createEAttribute(macEClass, MAC__RX_BYTES);
        createEAttribute(macEClass, MAC__TX_UNICAST_PKT);
        createEAttribute(macEClass, MAC__TX_RETRY_PKT);
        createEAttribute(macEClass, MAC__TX_BCAST_PKT);
        createEAttribute(macEClass, MAC__TX_BYTES);
        createEAttribute(macEClass, MAC__ZERO_ERR_PKT);
        createEAttribute(macEClass, MAC__LAST_PACKET_TIME);
        createEAttribute(macEClass, MAC__NO_SRC);

        mac_durationEClass = createEClass(MAC_DURATION);
        createEReference(mac_durationEClass, MAC_DURATION__ECONTAINER_MAC_DURATION);
        createEAttribute(mac_durationEClass, MAC_DURATION__BUSY);
        createEAttribute(mac_durationEClass, MAC_DURATION__RX);
        createEAttribute(mac_durationEClass, MAC_DURATION__TX);
        createEAttribute(mac_durationEClass, MAC_DURATION__NOERR_RX);
        createEAttribute(mac_durationEClass, MAC_DURATION__CRC_RX);
        createEAttribute(mac_durationEClass, MAC_DURATION__PHY_RX);
        createEAttribute(mac_durationEClass, MAC_DURATION__UNKNOWN_ERR_RX);
        createEAttribute(mac_durationEClass, MAC_DURATION__UNIT);

        mac_percentageEClass = createEClass(MAC_PERCENTAGE);
        createEReference(mac_percentageEClass, MAC_PERCENTAGE__ECONTAINER_MAC_PERCENTAGE);
        createEAttribute(mac_percentageEClass, MAC_PERCENTAGE__BUSY);
        createEAttribute(mac_percentageEClass, MAC_PERCENTAGE__RX);
        createEAttribute(mac_percentageEClass, MAC_PERCENTAGE__TX);
        createEAttribute(mac_percentageEClass, MAC_PERCENTAGE__NOERR_RX);
        createEAttribute(mac_percentageEClass, MAC_PERCENTAGE__CRC_RX);
        createEAttribute(mac_percentageEClass, MAC_PERCENTAGE__PHY_RX);
        createEAttribute(mac_percentageEClass, MAC_PERCENTAGE__UNKNOWN_ERR_RX);
        createEAttribute(mac_percentageEClass, MAC_PERCENTAGE__UNIT);

        nbEClass = createEClass(NB);
        createEReference(nbEClass, NB__ECONTAINER_NB);
        createEAttribute(nbEClass, NB__TEXT);
        createEReference(nbEClass, NB__RSSI_EXTENDED);
        createEReference(nbEClass, NB__RSSI_HIST);
        createEAttribute(nbEClass, NB__ADDR);
        createEAttribute(nbEClass, NB__RSSI);
        createEAttribute(nbEClass, NB__STD_RSSI);
        createEAttribute(nbEClass, NB__MIN_RSSI);
        createEAttribute(nbEClass, NB__MAX_RSSI);
        createEAttribute(nbEClass, NB__PKT_CNT);
        createEAttribute(nbEClass, NB__RX_BYTES);

        neighbourstatsEClass = createEClass(NEIGHBOURSTATS);
        createEReference(neighbourstatsEClass, NEIGHBOURSTATS__ECONTAINER_NEIGHBOURSTATS);
        createEAttribute(neighbourstatsEClass, NEIGHBOURSTATS__TEXT);
        createEReference(neighbourstatsEClass, NEIGHBOURSTATS__NB);

        perf_counterEClass = createEClass(PERF_COUNTER);
        createEReference(perf_counterEClass, PERF_COUNTER__ECONTAINER_PERF_COUNTER);
        createEAttribute(perf_counterEClass, PERF_COUNTER__CYCLES);
        createEAttribute(perf_counterEClass, PERF_COUNTER__BUSY_CYCLES);
        createEAttribute(perf_counterEClass, PERF_COUNTER__RX_CYCLES);
        createEAttribute(perf_counterEClass, PERF_COUNTER__TX_CYCLES);

        phyEClass = createEClass(PHY);
        createEReference(phyEClass, PHY__ECONTAINER_PHY);
        createEAttribute(phyEClass, PHY__HWBUSY);
        createEAttribute(phyEClass, PHY__HWRX);
        createEAttribute(phyEClass, PHY__HWTX);
        createEAttribute(phyEClass, PHY__LAST_HW_STAT_TIME);
        createEAttribute(phyEClass, PHY__HW_STATS_COUNT);
        createEAttribute(phyEClass, PHY__AVG_NOISE);
        createEAttribute(phyEClass, PHY__STD_NOISE);
        createEAttribute(phyEClass, PHY__AVG_RSSI);
        createEAttribute(phyEClass, PHY__STD_RSSI);
        createEAttribute(phyEClass, PHY__CTL_RSSI0);
        createEAttribute(phyEClass, PHY__CTL_RSSI1);
        createEAttribute(phyEClass, PHY__CTL_RSSI2);
        createEAttribute(phyEClass, PHY__EXT_RSSI0);
        createEAttribute(phyEClass, PHY__EXT_RSSI1);
        createEAttribute(phyEClass, PHY__EXT_RSSI2);
        createEAttribute(phyEClass, PHY__CHANNEL);

        rssi_extendedEClass = createEClass(RSSI_EXTENDED);
        createEReference(rssi_extendedEClass, RSSI_EXTENDED__ECONTAINER_RSSI_EXTENDED);
        createEAttribute(rssi_extendedEClass, RSSI_EXTENDED__TEXT);
        createEReference(rssi_extendedEClass, RSSI_EXTENDED__CTL);
        createEReference(rssi_extendedEClass, RSSI_EXTENDED__EXT);

        rssi_histEClass = createEClass(RSSI_HIST);
        createEReference(rssi_histEClass, RSSI_HIST__ECONTAINER_RSSI_HIST);
        createEAttribute(rssi_histEClass, RSSI_HIST__SIZE);
        createEAttribute(rssi_histEClass, RSSI_HIST__MAX_SIZE);
        createEAttribute(rssi_histEClass, RSSI_HIST__OVERFLOW);
        createEAttribute(rssi_histEClass, RSSI_HIST__VALUES);

        statsEClass = createEClass(STATS);
        createEReference(statsEClass, STATS__CHANNELSTATS);
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
        initEClass(channelstatsEClass, Channelstats.class, "Channelstats", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getChannelstats_EContainer_channelstats(), this.getStats(), this.getStats_Channelstats(), "eContainer_channelstats", null, 0, 1, Channelstats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getChannelstats_Text(), ecorePackage.getEString(), "text", null, 0, -1, Channelstats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getChannelstats_Mac(), this.getMac(), this.getMac_EContainer_mac(), "mac", null, 0, 1, Channelstats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getChannelstats_Mac_percentage(), this.getMac_percentage(), this.getMac_percentage_EContainer_mac_percentage(), "mac_percentage", null, 0, 1, Channelstats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getChannelstats_Mac_duration(), this.getMac_duration(), this.getMac_duration_EContainer_mac_duration(), "mac_duration", null, 0, 1, Channelstats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getChannelstats_Phy(), this.getPhy(), this.getPhy_EContainer_phy(), "phy", null, 0, 1, Channelstats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getChannelstats_Perf_counter(), this.getPerf_counter(), this.getPerf_counter_EContainer_perf_counter(), "perf_counter", null, 0, 1, Channelstats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getChannelstats_Neighbourstats(), this.getNeighbourstats(), this.getNeighbourstats_EContainer_neighbourstats(), "neighbourstats", null, 0, 1, Channelstats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getChannelstats_Node(), ecorePackage.getEString(), "node", null, 0, 1, Channelstats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getChannelstats_Time(), ecorePackage.getEDouble(), "time", null, 0, 1, Channelstats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getChannelstats_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Channelstats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getChannelstats_Length(), ecorePackage.getEInt(), "length", null, 0, 1, Channelstats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getChannelstats_Hw_duration(), ecorePackage.getEInt(), "hw_duration", null, 0, 1, Channelstats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getChannelstats_Unit(), ecorePackage.getEString(), "unit", null, 0, 1, Channelstats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(ctlEClass, Ctl.class, "Ctl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getCtl_EContainer_ctl(), this.getRssi_extended(), this.getRssi_extended_Ctl(), "eContainer_ctl", null, 0, 1, Ctl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCtl_Rssi0(), ecorePackage.getEInt(), "rssi0", null, 0, 1, Ctl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCtl_Rssi1(), ecorePackage.getEInt(), "rssi1", null, 0, 1, Ctl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCtl_Rssi2(), ecorePackage.getEInt(), "rssi2", null, 0, 1, Ctl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(extEClass, Ext.class, "Ext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getExt_EContainer_ext(), this.getRssi_extended(), this.getRssi_extended_Ext(), "eContainer_ext", null, 0, 1, Ext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getExt_Rssi0(), ecorePackage.getEInt(), "rssi0", null, 0, 1, Ext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getExt_Rssi1(), ecorePackage.getEInt(), "rssi1", null, 0, 1, Ext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getExt_Rssi2(), ecorePackage.getEInt(), "rssi2", null, 0, 1, Ext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(macEClass, Mac.class, "Mac", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getMac_EContainer_mac(), this.getChannelstats(), this.getChannelstats_Mac(), "eContainer_mac", null, 0, 1, Mac.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMac_Packets(), ecorePackage.getEInt(), "packets", null, 0, 1, Mac.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMac_Rx_pkt(), ecorePackage.getEInt(), "rx_pkt", null, 0, 1, Mac.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMac_No_err_pkt(), ecorePackage.getEInt(), "no_err_pkt", null, 0, 1, Mac.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMac_Crc_err_pkt(), ecorePackage.getEInt(), "crc_err_pkt", null, 0, 1, Mac.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMac_Phy_err_pkt(), ecorePackage.getEInt(), "phy_err_pkt", null, 0, 1, Mac.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMac_Unknown_err_pkt(), ecorePackage.getEInt(), "unknown_err_pkt", null, 0, 1, Mac.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMac_Tx_pkt(), ecorePackage.getEInt(), "tx_pkt", null, 0, 1, Mac.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMac_Rx_unicast_pkt(), ecorePackage.getEInt(), "rx_unicast_pkt", null, 0, 1, Mac.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMac_Rx_retry_pkt(), ecorePackage.getEInt(), "rx_retry_pkt", null, 0, 1, Mac.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMac_Rx_bcast_pkt(), ecorePackage.getEInt(), "rx_bcast_pkt", null, 0, 1, Mac.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMac_Rx_bytes(), ecorePackage.getEInt(), "rx_bytes", null, 0, 1, Mac.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMac_Tx_unicast_pkt(), ecorePackage.getEInt(), "tx_unicast_pkt", null, 0, 1, Mac.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMac_Tx_retry_pkt(), ecorePackage.getEInt(), "tx_retry_pkt", null, 0, 1, Mac.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMac_Tx_bcast_pkt(), ecorePackage.getEInt(), "tx_bcast_pkt", null, 0, 1, Mac.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMac_Tx_bytes(), ecorePackage.getEInt(), "tx_bytes", null, 0, 1, Mac.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMac_Zero_err_pkt(), ecorePackage.getEInt(), "zero_err_pkt", null, 0, 1, Mac.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMac_Last_packet_time(), ecorePackage.getEDouble(), "last_packet_time", null, 0, 1, Mac.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMac_No_src(), ecorePackage.getEInt(), "no_src", null, 0, 1, Mac.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(mac_durationEClass, Mac_duration.class, "Mac_duration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getMac_duration_EContainer_mac_duration(), this.getChannelstats(), this.getChannelstats_Mac_duration(), "eContainer_mac_duration", null, 0, 1, Mac_duration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMac_duration_Busy(), ecorePackage.getEInt(), "busy", null, 0, 1, Mac_duration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMac_duration_Rx(), ecorePackage.getEInt(), "rx", null, 0, 1, Mac_duration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMac_duration_Tx(), ecorePackage.getEInt(), "tx", null, 0, 1, Mac_duration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMac_duration_Noerr_rx(), ecorePackage.getEInt(), "noerr_rx", null, 0, 1, Mac_duration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMac_duration_Crc_rx(), ecorePackage.getEInt(), "crc_rx", null, 0, 1, Mac_duration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMac_duration_Phy_rx(), ecorePackage.getEInt(), "phy_rx", null, 0, 1, Mac_duration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMac_duration_Unknown_err_rx(), ecorePackage.getEInt(), "unknown_err_rx", null, 0, 1, Mac_duration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMac_duration_Unit(), ecorePackage.getEString(), "unit", null, 0, 1, Mac_duration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(mac_percentageEClass, Mac_percentage.class, "Mac_percentage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getMac_percentage_EContainer_mac_percentage(), this.getChannelstats(), this.getChannelstats_Mac_percentage(), "eContainer_mac_percentage", null, 0, 1, Mac_percentage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMac_percentage_Busy(), ecorePackage.getEInt(), "busy", null, 0, 1, Mac_percentage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMac_percentage_Rx(), ecorePackage.getEInt(), "rx", null, 0, 1, Mac_percentage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMac_percentage_Tx(), ecorePackage.getEInt(), "tx", null, 0, 1, Mac_percentage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMac_percentage_Noerr_rx(), ecorePackage.getEInt(), "noerr_rx", null, 0, 1, Mac_percentage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMac_percentage_Crc_rx(), ecorePackage.getEInt(), "crc_rx", null, 0, 1, Mac_percentage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMac_percentage_Phy_rx(), ecorePackage.getEInt(), "phy_rx", null, 0, 1, Mac_percentage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMac_percentage_Unknown_err_rx(), ecorePackage.getEInt(), "unknown_err_rx", null, 0, 1, Mac_percentage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMac_percentage_Unit(), ecorePackage.getEString(), "unit", null, 0, 1, Mac_percentage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(nbEClass, Nb.class, "Nb", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getNb_EContainer_nb(), this.getNeighbourstats(), this.getNeighbourstats_Nb(), "eContainer_nb", null, 0, 1, Nb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getNb_Text(), ecorePackage.getEString(), "text", null, 0, -1, Nb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getNb_Rssi_extended(), this.getRssi_extended(), this.getRssi_extended_EContainer_rssi_extended(), "rssi_extended", null, 0, 1, Nb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getNb_Rssi_hist(), this.getRssi_hist(), this.getRssi_hist_EContainer_rssi_hist(), "rssi_hist", null, 0, 1, Nb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getNb_Addr(), ecorePackage.getEString(), "addr", null, 0, 1, Nb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getNb_Rssi(), ecorePackage.getEInt(), "rssi", null, 0, 1, Nb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getNb_Std_rssi(), ecorePackage.getEInt(), "std_rssi", null, 0, 1, Nb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getNb_Min_rssi(), ecorePackage.getEInt(), "min_rssi", null, 0, 1, Nb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getNb_Max_rssi(), ecorePackage.getEInt(), "max_rssi", null, 0, 1, Nb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getNb_Pkt_cnt(), ecorePackage.getEInt(), "pkt_cnt", null, 0, 1, Nb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getNb_Rx_bytes(), ecorePackage.getEInt(), "rx_bytes", null, 0, 1, Nb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(neighbourstatsEClass, Neighbourstats.class, "Neighbourstats", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getNeighbourstats_EContainer_neighbourstats(), this.getChannelstats(), this.getChannelstats_Neighbourstats(), "eContainer_neighbourstats", null, 0, 1, Neighbourstats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getNeighbourstats_Text(), ecorePackage.getEString(), "text", null, 0, -1, Neighbourstats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getNeighbourstats_Nb(), this.getNb(), this.getNb_EContainer_nb(), "nb", null, 0, -1, Neighbourstats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(perf_counterEClass, Perf_counter.class, "Perf_counter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getPerf_counter_EContainer_perf_counter(), this.getChannelstats(), this.getChannelstats_Perf_counter(), "eContainer_perf_counter", null, 0, 1, Perf_counter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPerf_counter_Cycles(), ecorePackage.getEInt(), "cycles", null, 0, 1, Perf_counter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPerf_counter_Busy_cycles(), ecorePackage.getEInt(), "busy_cycles", null, 0, 1, Perf_counter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPerf_counter_Rx_cycles(), ecorePackage.getEInt(), "rx_cycles", null, 0, 1, Perf_counter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPerf_counter_Tx_cycles(), ecorePackage.getEInt(), "tx_cycles", null, 0, 1, Perf_counter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(phyEClass, Phy.class, "Phy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getPhy_EContainer_phy(), this.getChannelstats(), this.getChannelstats_Phy(), "eContainer_phy", null, 0, 1, Phy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPhy_Hwbusy(), ecorePackage.getEInt(), "hwbusy", null, 0, 1, Phy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPhy_Hwrx(), ecorePackage.getEInt(), "hwrx", null, 0, 1, Phy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPhy_Hwtx(), ecorePackage.getEInt(), "hwtx", null, 0, 1, Phy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPhy_Last_hw_stat_time(), ecorePackage.getEDouble(), "last_hw_stat_time", null, 0, 1, Phy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPhy_Hw_stats_count(), ecorePackage.getEInt(), "hw_stats_count", null, 0, 1, Phy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPhy_Avg_noise(), ecorePackage.getEInt(), "avg_noise", null, 0, 1, Phy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPhy_Std_noise(), ecorePackage.getEInt(), "std_noise", null, 0, 1, Phy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPhy_Avg_rssi(), ecorePackage.getEInt(), "avg_rssi", null, 0, 1, Phy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPhy_Std_rssi(), ecorePackage.getEInt(), "std_rssi", null, 0, 1, Phy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPhy_Ctl_rssi0(), ecorePackage.getEInt(), "ctl_rssi0", null, 0, 1, Phy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPhy_Ctl_rssi1(), ecorePackage.getEInt(), "ctl_rssi1", null, 0, 1, Phy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPhy_Ctl_rssi2(), ecorePackage.getEInt(), "ctl_rssi2", null, 0, 1, Phy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPhy_Ext_rssi0(), ecorePackage.getEInt(), "ext_rssi0", null, 0, 1, Phy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPhy_Ext_rssi1(), ecorePackage.getEInt(), "ext_rssi1", null, 0, 1, Phy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPhy_Ext_rssi2(), ecorePackage.getEInt(), "ext_rssi2", null, 0, 1, Phy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPhy_Channel(), ecorePackage.getEInt(), "channel", null, 0, 1, Phy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(rssi_extendedEClass, Rssi_extended.class, "Rssi_extended", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getRssi_extended_EContainer_rssi_extended(), this.getNb(), this.getNb_Rssi_extended(), "eContainer_rssi_extended", null, 0, 1, Rssi_extended.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRssi_extended_Text(), ecorePackage.getEString(), "text", null, 0, -1, Rssi_extended.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRssi_extended_Ctl(), this.getCtl(), this.getCtl_EContainer_ctl(), "ctl", null, 0, 1, Rssi_extended.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRssi_extended_Ext(), this.getExt(), this.getExt_EContainer_ext(), "ext", null, 0, 1, Rssi_extended.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(rssi_histEClass, Rssi_hist.class, "Rssi_hist", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getRssi_hist_EContainer_rssi_hist(), this.getNb(), this.getNb_Rssi_hist(), "eContainer_rssi_hist", null, 0, 1, Rssi_hist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRssi_hist_Size(), ecorePackage.getEInt(), "size", null, 0, 1, Rssi_hist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRssi_hist_Max_size(), ecorePackage.getEInt(), "max_size", null, 0, 1, Rssi_hist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRssi_hist_Overflow(), ecorePackage.getEString(), "overflow", null, 0, 1, Rssi_hist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRssi_hist_Values(), ecorePackage.getEString(), "values", null, 0, 1, Rssi_hist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(statsEClass, Stats.class, "Stats", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getStats_Channelstats(), this.getChannelstats(), this.getChannelstats_EContainer_channelstats(), "channelstats", null, 0, 1, Stats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
             "handler_name", "device_wifi/wifidevice/cst/stats"
           });		
        addAnnotation
          (channelstatsEClass, 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject"
           });		
        addAnnotation
          (getChannelstats_Text(), 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject/text|text:"
           });		
        addAnnotation
          (getChannelstats_Mac(), 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject/mac|mac:Mac|EObject",
             "IsCopy", "false"
           });		
        addAnnotation
          (getChannelstats_Mac_percentage(), 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject/mac_percentage|mac_percentage:Mac_percentage|EObject",
             "IsCopy", "false"
           });		
        addAnnotation
          (getChannelstats_Mac_duration(), 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject/mac_duration|mac_duration:Mac_duration|EObject",
             "IsCopy", "false"
           });		
        addAnnotation
          (getChannelstats_Phy(), 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject/phy|phy:Phy|EObject",
             "IsCopy", "false"
           });		
        addAnnotation
          (getChannelstats_Perf_counter(), 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject/perf_counter|perf_counter:Perf_counter|EObject",
             "IsCopy", "false"
           });		
        addAnnotation
          (getChannelstats_Neighbourstats(), 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject/neighbourstats|neighbourstats:Neighbourstats|EObject",
             "IsCopy", "false"
           });		
        addAnnotation
          (getChannelstats_Node(), 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject/node|node:"
           });		
        addAnnotation
          (getChannelstats_Time(), 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject/time|time:"
           });		
        addAnnotation
          (getChannelstats_Id(), 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject/id|id:"
           });		
        addAnnotation
          (getChannelstats_Length(), 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject/length|length:"
           });		
        addAnnotation
          (getChannelstats_Hw_duration(), 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject/hw_duration|hw_duration:"
           });		
        addAnnotation
          (getChannelstats_Unit(), 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject/unit|unit:"
           });		
        addAnnotation
          (ctlEClass, 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject/neighbourstats|neighbourstats:Neighbourstats|EObject/nb|nb:Nb|EObject/rssi_extended|rssi_extended:Rssi_extended|EObject/ctl|ctl:Ctl|EObject"
           });		
        addAnnotation
          (getCtl_Rssi0(), 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject/neighbourstats|neighbourstats:Neighbourstats|EObject/nb|nb:Nb|EObject/rssi_extended|rssi_extended:Rssi_extended|EObject/ctl|ctl:Ctl|EObject/rssi0|rssi0:"
           });		
        addAnnotation
          (getCtl_Rssi1(), 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject/neighbourstats|neighbourstats:Neighbourstats|EObject/nb|nb:Nb|EObject/rssi_extended|rssi_extended:Rssi_extended|EObject/ctl|ctl:Ctl|EObject/rssi1|rssi1:"
           });		
        addAnnotation
          (getCtl_Rssi2(), 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject/neighbourstats|neighbourstats:Neighbourstats|EObject/nb|nb:Nb|EObject/rssi_extended|rssi_extended:Rssi_extended|EObject/ctl|ctl:Ctl|EObject/rssi2|rssi2:"
           });		
        addAnnotation
          (extEClass, 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject/neighbourstats|neighbourstats:Neighbourstats|EObject/nb|nb:Nb|EObject/rssi_extended|rssi_extended:Rssi_extended|EObject/ext|ext:Ext|EObject"
           });		
        addAnnotation
          (getExt_Rssi0(), 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject/neighbourstats|neighbourstats:Neighbourstats|EObject/nb|nb:Nb|EObject/rssi_extended|rssi_extended:Rssi_extended|EObject/ext|ext:Ext|EObject/rssi0|rssi0:"
           });		
        addAnnotation
          (getExt_Rssi1(), 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject/neighbourstats|neighbourstats:Neighbourstats|EObject/nb|nb:Nb|EObject/rssi_extended|rssi_extended:Rssi_extended|EObject/ext|ext:Ext|EObject/rssi1|rssi1:"
           });		
        addAnnotation
          (getExt_Rssi2(), 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject/neighbourstats|neighbourstats:Neighbourstats|EObject/nb|nb:Nb|EObject/rssi_extended|rssi_extended:Rssi_extended|EObject/ext|ext:Ext|EObject/rssi2|rssi2:"
           });		
        addAnnotation
          (macEClass, 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject/mac|mac:Mac|EObject"
           });		
        addAnnotation
          (getMac_Packets(), 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject/mac|mac:Mac|EObject/packets|packets:"
           });		
        addAnnotation
          (getMac_Rx_pkt(), 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject/mac|mac:Mac|EObject/rx_pkt|rx_pkt:"
           });		
        addAnnotation
          (getMac_No_err_pkt(), 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject/mac|mac:Mac|EObject/no_err_pkt|no_err_pkt:"
           });		
        addAnnotation
          (getMac_Crc_err_pkt(), 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject/mac|mac:Mac|EObject/crc_err_pkt|crc_err_pkt:"
           });		
        addAnnotation
          (getMac_Phy_err_pkt(), 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject/mac|mac:Mac|EObject/phy_err_pkt|phy_err_pkt:"
           });		
        addAnnotation
          (getMac_Unknown_err_pkt(), 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject/mac|mac:Mac|EObject/unknown_err_pkt|unknown_err_pkt:"
           });		
        addAnnotation
          (getMac_Tx_pkt(), 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject/mac|mac:Mac|EObject/tx_pkt|tx_pkt:"
           });		
        addAnnotation
          (getMac_Rx_unicast_pkt(), 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject/mac|mac:Mac|EObject/rx_unicast_pkt|rx_unicast_pkt:"
           });		
        addAnnotation
          (getMac_Rx_retry_pkt(), 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject/mac|mac:Mac|EObject/rx_retry_pkt|rx_retry_pkt:"
           });		
        addAnnotation
          (getMac_Rx_bcast_pkt(), 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject/mac|mac:Mac|EObject/rx_bcast_pkt|rx_bcast_pkt:"
           });		
        addAnnotation
          (getMac_Rx_bytes(), 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject/mac|mac:Mac|EObject/rx_bytes|rx_bytes:"
           });		
        addAnnotation
          (getMac_Tx_unicast_pkt(), 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject/mac|mac:Mac|EObject/tx_unicast_pkt|tx_unicast_pkt:"
           });		
        addAnnotation
          (getMac_Tx_retry_pkt(), 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject/mac|mac:Mac|EObject/tx_retry_pkt|tx_retry_pkt:"
           });		
        addAnnotation
          (getMac_Tx_bcast_pkt(), 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject/mac|mac:Mac|EObject/tx_bcast_pkt|tx_bcast_pkt:"
           });		
        addAnnotation
          (getMac_Tx_bytes(), 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject/mac|mac:Mac|EObject/tx_bytes|tx_bytes:"
           });		
        addAnnotation
          (getMac_Zero_err_pkt(), 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject/mac|mac:Mac|EObject/zero_err_pkt|zero_err_pkt:"
           });		
        addAnnotation
          (getMac_Last_packet_time(), 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject/mac|mac:Mac|EObject/last_packet_time|last_packet_time:"
           });		
        addAnnotation
          (getMac_No_src(), 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject/mac|mac:Mac|EObject/no_src|no_src:"
           });		
        addAnnotation
          (mac_durationEClass, 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject/mac_duration|mac_duration:Mac_duration|EObject"
           });		
        addAnnotation
          (getMac_duration_Busy(), 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject/mac_duration|mac_duration:Mac_duration|EObject/busy|busy:"
           });		
        addAnnotation
          (getMac_duration_Rx(), 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject/mac_duration|mac_duration:Mac_duration|EObject/rx|rx:"
           });		
        addAnnotation
          (getMac_duration_Tx(), 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject/mac_duration|mac_duration:Mac_duration|EObject/tx|tx:"
           });		
        addAnnotation
          (getMac_duration_Noerr_rx(), 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject/mac_duration|mac_duration:Mac_duration|EObject/noerr_rx|noerr_rx:"
           });		
        addAnnotation
          (getMac_duration_Crc_rx(), 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject/mac_duration|mac_duration:Mac_duration|EObject/crc_rx|crc_rx:"
           });		
        addAnnotation
          (getMac_duration_Phy_rx(), 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject/mac_duration|mac_duration:Mac_duration|EObject/phy_rx|phy_rx:"
           });		
        addAnnotation
          (getMac_duration_Unknown_err_rx(), 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject/mac_duration|mac_duration:Mac_duration|EObject/unknown_err_rx|unknown_err_rx:"
           });		
        addAnnotation
          (getMac_duration_Unit(), 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject/mac_duration|mac_duration:Mac_duration|EObject/unit|unit:"
           });		
        addAnnotation
          (mac_percentageEClass, 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject/mac_percentage|mac_percentage:Mac_percentage|EObject"
           });		
        addAnnotation
          (getMac_percentage_Busy(), 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject/mac_percentage|mac_percentage:Mac_percentage|EObject/busy|busy:"
           });		
        addAnnotation
          (getMac_percentage_Rx(), 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject/mac_percentage|mac_percentage:Mac_percentage|EObject/rx|rx:"
           });		
        addAnnotation
          (getMac_percentage_Tx(), 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject/mac_percentage|mac_percentage:Mac_percentage|EObject/tx|tx:"
           });		
        addAnnotation
          (getMac_percentage_Noerr_rx(), 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject/mac_percentage|mac_percentage:Mac_percentage|EObject/noerr_rx|noerr_rx:"
           });		
        addAnnotation
          (getMac_percentage_Crc_rx(), 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject/mac_percentage|mac_percentage:Mac_percentage|EObject/crc_rx|crc_rx:"
           });		
        addAnnotation
          (getMac_percentage_Phy_rx(), 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject/mac_percentage|mac_percentage:Mac_percentage|EObject/phy_rx|phy_rx:"
           });		
        addAnnotation
          (getMac_percentage_Unknown_err_rx(), 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject/mac_percentage|mac_percentage:Mac_percentage|EObject/unknown_err_rx|unknown_err_rx:"
           });		
        addAnnotation
          (getMac_percentage_Unit(), 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject/mac_percentage|mac_percentage:Mac_percentage|EObject/unit|unit:"
           });		
        addAnnotation
          (nbEClass, 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject/neighbourstats|neighbourstats:Neighbourstats|EObject/nb|nb:Nb|EObject"
           });		
        addAnnotation
          (getNb_Text(), 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject/neighbourstats|neighbourstats:Neighbourstats|EObject/nb|nb:Nb|EObject/text|text:"
           });		
        addAnnotation
          (getNb_Rssi_extended(), 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject/neighbourstats|neighbourstats:Neighbourstats|EObject/nb|nb:Nb|EObject/rssi_extended|rssi_extended:Rssi_extended|EObject",
             "IsCopy", "false"
           });		
        addAnnotation
          (getNb_Rssi_hist(), 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject/neighbourstats|neighbourstats:Neighbourstats|EObject/nb|nb:Nb|EObject/rssi_hist|rssi_hist:Rssi_hist|EObject",
             "IsCopy", "false"
           });		
        addAnnotation
          (getNb_Addr(), 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject/neighbourstats|neighbourstats:Neighbourstats|EObject/nb|nb:Nb|EObject/addr|addr:"
           });		
        addAnnotation
          (getNb_Rssi(), 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject/neighbourstats|neighbourstats:Neighbourstats|EObject/nb|nb:Nb|EObject/rssi|rssi:"
           });		
        addAnnotation
          (getNb_Std_rssi(), 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject/neighbourstats|neighbourstats:Neighbourstats|EObject/nb|nb:Nb|EObject/std_rssi|std_rssi:"
           });		
        addAnnotation
          (getNb_Min_rssi(), 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject/neighbourstats|neighbourstats:Neighbourstats|EObject/nb|nb:Nb|EObject/min_rssi|min_rssi:"
           });		
        addAnnotation
          (getNb_Max_rssi(), 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject/neighbourstats|neighbourstats:Neighbourstats|EObject/nb|nb:Nb|EObject/max_rssi|max_rssi:"
           });		
        addAnnotation
          (getNb_Pkt_cnt(), 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject/neighbourstats|neighbourstats:Neighbourstats|EObject/nb|nb:Nb|EObject/pkt_cnt|pkt_cnt:"
           });		
        addAnnotation
          (getNb_Rx_bytes(), 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject/neighbourstats|neighbourstats:Neighbourstats|EObject/nb|nb:Nb|EObject/rx_bytes|rx_bytes:"
           });		
        addAnnotation
          (neighbourstatsEClass, 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject/neighbourstats|neighbourstats:Neighbourstats|EObject"
           });		
        addAnnotation
          (getNeighbourstats_Text(), 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject/neighbourstats|neighbourstats:Neighbourstats|EObject/text|text:"
           });		
        addAnnotation
          (getNeighbourstats_Nb(), 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject/neighbourstats|neighbourstats:Neighbourstats|EObject/nb|nb:Nb|EObject",
             "IsCopy", "false"
           });		
        addAnnotation
          (perf_counterEClass, 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject/perf_counter|perf_counter:Perf_counter|EObject"
           });		
        addAnnotation
          (getPerf_counter_Cycles(), 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject/perf_counter|perf_counter:Perf_counter|EObject/cycles|cycles:"
           });		
        addAnnotation
          (getPerf_counter_Busy_cycles(), 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject/perf_counter|perf_counter:Perf_counter|EObject/busy_cycles|busy_cycles:"
           });		
        addAnnotation
          (getPerf_counter_Rx_cycles(), 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject/perf_counter|perf_counter:Perf_counter|EObject/rx_cycles|rx_cycles:"
           });		
        addAnnotation
          (getPerf_counter_Tx_cycles(), 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject/perf_counter|perf_counter:Perf_counter|EObject/tx_cycles|tx_cycles:"
           });		
        addAnnotation
          (phyEClass, 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject/phy|phy:Phy|EObject"
           });		
        addAnnotation
          (getPhy_Hwbusy(), 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject/phy|phy:Phy|EObject/hwbusy|hwbusy:"
           });		
        addAnnotation
          (getPhy_Hwrx(), 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject/phy|phy:Phy|EObject/hwrx|hwrx:"
           });		
        addAnnotation
          (getPhy_Hwtx(), 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject/phy|phy:Phy|EObject/hwtx|hwtx:"
           });		
        addAnnotation
          (getPhy_Last_hw_stat_time(), 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject/phy|phy:Phy|EObject/last_hw_stat_time|last_hw_stat_time:"
           });		
        addAnnotation
          (getPhy_Hw_stats_count(), 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject/phy|phy:Phy|EObject/hw_stats_count|hw_stats_count:"
           });		
        addAnnotation
          (getPhy_Avg_noise(), 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject/phy|phy:Phy|EObject/avg_noise|avg_noise:"
           });		
        addAnnotation
          (getPhy_Std_noise(), 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject/phy|phy:Phy|EObject/std_noise|std_noise:"
           });		
        addAnnotation
          (getPhy_Avg_rssi(), 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject/phy|phy:Phy|EObject/avg_rssi|avg_rssi:"
           });		
        addAnnotation
          (getPhy_Std_rssi(), 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject/phy|phy:Phy|EObject/std_rssi|std_rssi:"
           });		
        addAnnotation
          (getPhy_Ctl_rssi0(), 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject/phy|phy:Phy|EObject/ctl_rssi0|ctl_rssi0:"
           });		
        addAnnotation
          (getPhy_Ctl_rssi1(), 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject/phy|phy:Phy|EObject/ctl_rssi1|ctl_rssi1:"
           });		
        addAnnotation
          (getPhy_Ctl_rssi2(), 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject/phy|phy:Phy|EObject/ctl_rssi2|ctl_rssi2:"
           });		
        addAnnotation
          (getPhy_Ext_rssi0(), 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject/phy|phy:Phy|EObject/ext_rssi0|ext_rssi0:"
           });		
        addAnnotation
          (getPhy_Ext_rssi1(), 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject/phy|phy:Phy|EObject/ext_rssi1|ext_rssi1:"
           });		
        addAnnotation
          (getPhy_Ext_rssi2(), 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject/phy|phy:Phy|EObject/ext_rssi2|ext_rssi2:"
           });		
        addAnnotation
          (getPhy_Channel(), 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject/phy|phy:Phy|EObject/channel|channel:"
           });		
        addAnnotation
          (rssi_extendedEClass, 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject/neighbourstats|neighbourstats:Neighbourstats|EObject/nb|nb:Nb|EObject/rssi_extended|rssi_extended:Rssi_extended|EObject"
           });		
        addAnnotation
          (getRssi_extended_Text(), 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject/neighbourstats|neighbourstats:Neighbourstats|EObject/nb|nb:Nb|EObject/rssi_extended|rssi_extended:Rssi_extended|EObject/text|text:"
           });		
        addAnnotation
          (getRssi_extended_Ctl(), 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject/neighbourstats|neighbourstats:Neighbourstats|EObject/nb|nb:Nb|EObject/rssi_extended|rssi_extended:Rssi_extended|EObject/ctl|ctl:Ctl|EObject",
             "IsCopy", "false"
           });		
        addAnnotation
          (getRssi_extended_Ext(), 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject/neighbourstats|neighbourstats:Neighbourstats|EObject/nb|nb:Nb|EObject/rssi_extended|rssi_extended:Rssi_extended|EObject/ext|ext:Ext|EObject",
             "IsCopy", "false"
           });		
        addAnnotation
          (rssi_histEClass, 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject/neighbourstats|neighbourstats:Neighbourstats|EObject/nb|nb:Nb|EObject/rssi_hist|rssi_hist:Rssi_hist|EObject"
           });		
        addAnnotation
          (getRssi_hist_Size(), 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject/neighbourstats|neighbourstats:Neighbourstats|EObject/nb|nb:Nb|EObject/rssi_hist|rssi_hist:Rssi_hist|EObject/size|size:"
           });		
        addAnnotation
          (getRssi_hist_Max_size(), 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject/neighbourstats|neighbourstats:Neighbourstats|EObject/nb|nb:Nb|EObject/rssi_hist|rssi_hist:Rssi_hist|EObject/max_size|max_size:"
           });		
        addAnnotation
          (getRssi_hist_Overflow(), 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject/neighbourstats|neighbourstats:Neighbourstats|EObject/nb|nb:Nb|EObject/rssi_hist|rssi_hist:Rssi_hist|EObject/overflow|overflow:"
           });		
        addAnnotation
          (getRssi_hist_Values(), 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject/neighbourstats|neighbourstats:Neighbourstats|EObject/nb|nb:Nb|EObject/rssi_hist|rssi_hist:Rssi_hist|EObject/values|values:"
           });		
        addAnnotation
          (statsEClass, 
           source, 
           new String[] {
             "target_id", "Stats|Handler"
           });		
        addAnnotation
          (getStats_Channelstats(), 
           source, 
           new String[] {
             "target_id", "Stats|Handler/channelstats|channelstats:Channelstats|EObject",
             "IsCopy", "false"
           });
    }

} //Device_wifi_wifidevice_cst_statsPackageImpl
