/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.tsi_syncinfo.impl;

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
import de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.Seismo_localchannelinfoPackage;
import de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.impl.Seismo_localchannelinfoPackageImpl;
import de.hub.clickwatch.specificmodels.brn.sf_stats.Sf_statsPackage;
import de.hub.clickwatch.specificmodels.brn.sf_stats.impl.Sf_statsPackageImpl;
import de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Sys_info_systeminfoPackage;
import de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.impl.Sys_info_systeminfoPackageImpl;
import de.hub.clickwatch.specificmodels.brn.tsi_syncinfo.Syncinfo;
import de.hub.clickwatch.specificmodels.brn.tsi_syncinfo.Syncpacket;
import de.hub.clickwatch.specificmodels.brn.tsi_syncinfo.Timesyncinfo;
import de.hub.clickwatch.specificmodels.brn.tsi_syncinfo.Tsi_syncinfoFactory;
import de.hub.clickwatch.specificmodels.brn.tsi_syncinfo.Tsi_syncinfoPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Tsi_syncinfoPackageImpl extends EPackageImpl implements Tsi_syncinfoPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass syncinfoEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass syncpacketEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass timesyncinfoEClass = null;

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
     * @see de.hub.clickwatch.specificmodels.brn.tsi_syncinfo.Tsi_syncinfoPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private Tsi_syncinfoPackageImpl() {
        super(eNS_URI, Tsi_syncinfoFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link Tsi_syncinfoPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static Tsi_syncinfoPackage init() {
        if (isInited) return (Tsi_syncinfoPackage)EPackage.Registry.INSTANCE.getEPackage(Tsi_syncinfoPackage.eNS_URI);

        // Obtain or create and register package
        Tsi_syncinfoPackageImpl theTsi_syncinfoPackage = (Tsi_syncinfoPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Tsi_syncinfoPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Tsi_syncinfoPackageImpl());

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
        Seismo_localchannelinfoPackageImpl theSeismo_localchannelinfoPackage = (Seismo_localchannelinfoPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Seismo_localchannelinfoPackage.eNS_URI) instanceof Seismo_localchannelinfoPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Seismo_localchannelinfoPackage.eNS_URI) : Seismo_localchannelinfoPackage.eINSTANCE);

        // Create package meta-data objects
        theTsi_syncinfoPackage.createPackageContents();
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

        // Initialize created meta-data
        theTsi_syncinfoPackage.initializePackageContents();
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

        // Mark meta-data to indicate it can't be changed
        theTsi_syncinfoPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(Tsi_syncinfoPackage.eNS_URI, theTsi_syncinfoPackage);
        return theTsi_syncinfoPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSyncinfo() {
        return syncinfoEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSyncinfo_Timesyncinfo() {
        return (EReference)syncinfoEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSyncpacket() {
        return syncpacketEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSyncpacket_EContainer_syncpacket() {
        return (EReference)syncpacketEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSyncpacket_Time() {
        return (EAttribute)syncpacketEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSyncpacket_Unit() {
        return (EAttribute)syncpacketEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSyncpacket_Id() {
        return (EAttribute)syncpacketEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTimesyncinfo() {
        return timesyncinfoEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTimesyncinfo_EContainer_timesyncinfo() {
        return (EReference)timesyncinfoEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTimesyncinfo_Text() {
        return (EAttribute)timesyncinfoEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTimesyncinfo_Syncpacket() {
        return (EReference)timesyncinfoEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTimesyncinfo_Id() {
        return (EAttribute)timesyncinfoEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTimesyncinfo_Name() {
        return (EAttribute)timesyncinfoEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTimesyncinfo_Time() {
        return (EAttribute)timesyncinfoEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Tsi_syncinfoFactory getTsi_syncinfoFactory() {
        return (Tsi_syncinfoFactory)getEFactoryInstance();
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
        syncinfoEClass = createEClass(SYNCINFO);
        createEReference(syncinfoEClass, SYNCINFO__TIMESYNCINFO);

        syncpacketEClass = createEClass(SYNCPACKET);
        createEReference(syncpacketEClass, SYNCPACKET__ECONTAINER_SYNCPACKET);
        createEAttribute(syncpacketEClass, SYNCPACKET__TIME);
        createEAttribute(syncpacketEClass, SYNCPACKET__UNIT);
        createEAttribute(syncpacketEClass, SYNCPACKET__ID);

        timesyncinfoEClass = createEClass(TIMESYNCINFO);
        createEReference(timesyncinfoEClass, TIMESYNCINFO__ECONTAINER_TIMESYNCINFO);
        createEAttribute(timesyncinfoEClass, TIMESYNCINFO__TEXT);
        createEReference(timesyncinfoEClass, TIMESYNCINFO__SYNCPACKET);
        createEAttribute(timesyncinfoEClass, TIMESYNCINFO__ID);
        createEAttribute(timesyncinfoEClass, TIMESYNCINFO__NAME);
        createEAttribute(timesyncinfoEClass, TIMESYNCINFO__TIME);
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
        syncinfoEClass.getESuperTypes().add(theClickWatchModelPackage.getHandler());

        // Initialize classes and features; add operations and parameters
        initEClass(syncinfoEClass, Syncinfo.class, "Syncinfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getSyncinfo_Timesyncinfo(), this.getTimesyncinfo(), this.getTimesyncinfo_EContainer_timesyncinfo(), "timesyncinfo", null, 0, 1, Syncinfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(syncpacketEClass, Syncpacket.class, "Syncpacket", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getSyncpacket_EContainer_syncpacket(), this.getTimesyncinfo(), this.getTimesyncinfo_Syncpacket(), "eContainer_syncpacket", null, 0, 1, Syncpacket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSyncpacket_Time(), ecorePackage.getELong(), "time", null, 0, 1, Syncpacket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSyncpacket_Unit(), ecorePackage.getEString(), "unit", null, 0, 1, Syncpacket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSyncpacket_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Syncpacket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(timesyncinfoEClass, Timesyncinfo.class, "Timesyncinfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getTimesyncinfo_EContainer_timesyncinfo(), this.getSyncinfo(), this.getSyncinfo_Timesyncinfo(), "eContainer_timesyncinfo", null, 0, 1, Timesyncinfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTimesyncinfo_Text(), ecorePackage.getEString(), "text", null, 0, -1, Timesyncinfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTimesyncinfo_Syncpacket(), this.getSyncpacket(), this.getSyncpacket_EContainer_syncpacket(), "syncpacket", null, 0, -1, Timesyncinfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTimesyncinfo_Id(), ecorePackage.getEString(), "id", null, 0, 1, Timesyncinfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTimesyncinfo_Name(), ecorePackage.getEString(), "name", null, 0, 1, Timesyncinfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTimesyncinfo_Time(), ecorePackage.getEDouble(), "time", null, 0, 1, Timesyncinfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
             "handler_class", "Syncinfo",
             "handler_name", "tsi/syncinfo"
           });		
        addAnnotation
          (syncinfoEClass, 
           source, 
           new String[] {
             "target_id", "Syncinfo|Handler"
           });		
        addAnnotation
          (getSyncinfo_Timesyncinfo(), 
           source, 
           new String[] {
             "target_id", "Syncinfo|Handler/timesyncinfo|timesyncinfo:Timesyncinfo|EObject",
             "IsCopy", "false"
           });		
        addAnnotation
          (syncpacketEClass, 
           source, 
           new String[] {
             "target_id", "Syncinfo|Handler/timesyncinfo|timesyncinfo:Timesyncinfo|EObject/syncpacket|syncpacket:Syncpacket|EObject"
           });		
        addAnnotation
          (getSyncpacket_Time(), 
           source, 
           new String[] {
             "target_id", "Syncinfo|Handler/timesyncinfo|timesyncinfo:Timesyncinfo|EObject/syncpacket|syncpacket:Syncpacket|EObject/time|time:"
           });		
        addAnnotation
          (getSyncpacket_Unit(), 
           source, 
           new String[] {
             "target_id", "Syncinfo|Handler/timesyncinfo|timesyncinfo:Timesyncinfo|EObject/syncpacket|syncpacket:Syncpacket|EObject/unit|unit:"
           });		
        addAnnotation
          (getSyncpacket_Id(), 
           source, 
           new String[] {
             "target_id", "Syncinfo|Handler/timesyncinfo|timesyncinfo:Timesyncinfo|EObject/syncpacket|syncpacket:Syncpacket|EObject/id|id:"
           });		
        addAnnotation
          (timesyncinfoEClass, 
           source, 
           new String[] {
             "target_id", "Syncinfo|Handler/timesyncinfo|timesyncinfo:Timesyncinfo|EObject"
           });		
        addAnnotation
          (getTimesyncinfo_Text(), 
           source, 
           new String[] {
             "target_id", "Syncinfo|Handler/timesyncinfo|timesyncinfo:Timesyncinfo|EObject/text|text:"
           });		
        addAnnotation
          (getTimesyncinfo_Syncpacket(), 
           source, 
           new String[] {
             "target_id", "Syncinfo|Handler/timesyncinfo|timesyncinfo:Timesyncinfo|EObject/syncpacket|syncpacket:Syncpacket|EObject",
             "IsCopy", "false"
           });		
        addAnnotation
          (getTimesyncinfo_Id(), 
           source, 
           new String[] {
             "target_id", "Syncinfo|Handler/timesyncinfo|timesyncinfo:Timesyncinfo|EObject/id|id:"
           });		
        addAnnotation
          (getTimesyncinfo_Name(), 
           source, 
           new String[] {
             "target_id", "Syncinfo|Handler/timesyncinfo|timesyncinfo:Timesyncinfo|EObject/name|name:"
           });		
        addAnnotation
          (getTimesyncinfo_Time(), 
           source, 
           new String[] {
             "target_id", "Syncinfo|Handler/timesyncinfo|timesyncinfo:Timesyncinfo|EObject/time|time:"
           });
    }

} //Tsi_syncinfoPackageImpl
