/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.gps_cart_coord.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
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
import de.hub.clickwatch.specificmodels.brn.gps_cart_coord.Cart_coord;
import de.hub.clickwatch.specificmodels.brn.gps_cart_coord.Gps_cart_coordFactory;
import de.hub.clickwatch.specificmodels.brn.gps_cart_coord.Gps_cart_coordPackage;
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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Gps_cart_coordPackageImpl extends EPackageImpl implements Gps_cart_coordPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass cart_coordEClass = null;

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
     * @see de.hub.clickwatch.specificmodels.brn.gps_cart_coord.Gps_cart_coordPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private Gps_cart_coordPackageImpl() {
        super(eNS_URI, Gps_cart_coordFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link Gps_cart_coordPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static Gps_cart_coordPackage init() {
        if (isInited) return (Gps_cart_coordPackage)EPackage.Registry.INSTANCE.getEPackage(Gps_cart_coordPackage.eNS_URI);

        // Obtain or create and register package
        Gps_cart_coordPackageImpl theGps_cart_coordPackage = (Gps_cart_coordPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Gps_cart_coordPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Gps_cart_coordPackageImpl());

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
        Lt_routesPackageImpl theLt_routesPackage = (Lt_routesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Lt_routesPackage.eNS_URI) instanceof Lt_routesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Lt_routesPackage.eNS_URI) : Lt_routesPackage.eINSTANCE);
        Lt_linksPackageImpl theLt_linksPackage = (Lt_linksPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Lt_linksPackage.eNS_URI) instanceof Lt_linksPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Lt_linksPackage.eNS_URI) : Lt_linksPackage.eINSTANCE);
        Device_wifi_link_stat_bcast_statsPackageImpl theDevice_wifi_link_stat_bcast_statsPackage = (Device_wifi_link_stat_bcast_statsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Device_wifi_link_stat_bcast_statsPackage.eNS_URI) instanceof Device_wifi_link_stat_bcast_statsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Device_wifi_link_stat_bcast_statsPackage.eNS_URI) : Device_wifi_link_stat_bcast_statsPackage.eINSTANCE);
        Device_wifi_wifidevice_cst_statsPackageImpl theDevice_wifi_wifidevice_cst_statsPackage = (Device_wifi_wifidevice_cst_statsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Device_wifi_wifidevice_cst_statsPackage.eNS_URI) instanceof Device_wifi_wifidevice_cst_statsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Device_wifi_wifidevice_cst_statsPackage.eNS_URI) : Device_wifi_wifidevice_cst_statsPackage.eINSTANCE);
        Sf_statsPackageImpl theSf_statsPackage = (Sf_statsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Sf_statsPackage.eNS_URI) instanceof Sf_statsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Sf_statsPackage.eNS_URI) : Sf_statsPackage.eINSTANCE);
        Routing_dsr_stats_statsPackageImpl theRouting_dsr_stats_statsPackage = (Routing_dsr_stats_statsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Routing_dsr_stats_statsPackage.eNS_URI) instanceof Routing_dsr_stats_statsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Routing_dsr_stats_statsPackage.eNS_URI) : Routing_dsr_stats_statsPackage.eINSTANCE);
        Seismo_localchannelinfoPackageImpl theSeismo_localchannelinfoPackage = (Seismo_localchannelinfoPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Seismo_localchannelinfoPackage.eNS_URI) instanceof Seismo_localchannelinfoPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Seismo_localchannelinfoPackage.eNS_URI) : Seismo_localchannelinfoPackage.eINSTANCE);
        Tsi_syncinfoPackageImpl theTsi_syncinfoPackage = (Tsi_syncinfoPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Tsi_syncinfoPackage.eNS_URI) instanceof Tsi_syncinfoPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Tsi_syncinfoPackage.eNS_URI) : Tsi_syncinfoPackage.eINSTANCE);

        // Create package meta-data objects
        theGps_cart_coordPackage.createPackageContents();
        theBrnPackage.createPackageContents();
        theSys_info_systeminfoPackage.createPackageContents();
        theDevice_wifi_data_power_systempowerPackage.createPackageContents();
        theDevice_wifi_wifidevice_sc_systemchannelPackage.createPackageContents();
        theLease_tab_leasesPackage.createPackageContents();
        theGps_gps_coordPackage.createPackageContents();
        theLt_routesPackage.createPackageContents();
        theLt_linksPackage.createPackageContents();
        theDevice_wifi_link_stat_bcast_statsPackage.createPackageContents();
        theDevice_wifi_wifidevice_cst_statsPackage.createPackageContents();
        theSf_statsPackage.createPackageContents();
        theRouting_dsr_stats_statsPackage.createPackageContents();
        theSeismo_localchannelinfoPackage.createPackageContents();
        theTsi_syncinfoPackage.createPackageContents();

        // Initialize created meta-data
        theGps_cart_coordPackage.initializePackageContents();
        theBrnPackage.initializePackageContents();
        theSys_info_systeminfoPackage.initializePackageContents();
        theDevice_wifi_data_power_systempowerPackage.initializePackageContents();
        theDevice_wifi_wifidevice_sc_systemchannelPackage.initializePackageContents();
        theLease_tab_leasesPackage.initializePackageContents();
        theGps_gps_coordPackage.initializePackageContents();
        theLt_routesPackage.initializePackageContents();
        theLt_linksPackage.initializePackageContents();
        theDevice_wifi_link_stat_bcast_statsPackage.initializePackageContents();
        theDevice_wifi_wifidevice_cst_statsPackage.initializePackageContents();
        theSf_statsPackage.initializePackageContents();
        theRouting_dsr_stats_statsPackage.initializePackageContents();
        theSeismo_localchannelinfoPackage.initializePackageContents();
        theTsi_syncinfoPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theGps_cart_coordPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(Gps_cart_coordPackage.eNS_URI, theGps_cart_coordPackage);
        return theGps_cart_coordPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCart_coord() {
        return cart_coordEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCart_coord_Text() {
        return (EAttribute)cart_coordEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Gps_cart_coordFactory getGps_cart_coordFactory() {
        return (Gps_cart_coordFactory)getEFactoryInstance();
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
        cart_coordEClass = createEClass(CART_COORD);
        createEAttribute(cart_coordEClass, CART_COORD__TEXT);
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
        cart_coordEClass.getESuperTypes().add(theClickWatchModelPackage.getHandler());

        // Initialize classes and features; add operations and parameters
        initEClass(cart_coordEClass, Cart_coord.class, "Cart_coord", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getCart_coord_Text(), ecorePackage.getEString(), "text", null, 0, 1, Cart_coord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
             "handler_class", "Cart_coord"
           });		
        addAnnotation
          (cart_coordEClass, 
           source, 
           new String[] {
             "target_id", "Cart_coord|Handler"
           });		
        addAnnotation
          (getCart_coord_Text(), 
           source, 
           new String[] {
             "target_id", "Cart_coord|Handler/text|text:"
           });
    }

} //Gps_cart_coordPackageImpl
