/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.impl;

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

import de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.Localchannelinfo;
import de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.Seismo_localchannelinfoFactory;
import de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.Seismo_localchannelinfoPackage;

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
public class Seismo_localchannelinfoPackageImpl extends EPackageImpl implements Seismo_localchannelinfoPackage {
	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass cEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass localchannelinfoEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass vEClass = null;

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
     * @see de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.Seismo_localchannelinfoPackage#eNS_URI
     * @see #init()
     * @generated
     */
	private Seismo_localchannelinfoPackageImpl() {
        super(eNS_URI, Seismo_localchannelinfoFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link Seismo_localchannelinfoPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
	public static Seismo_localchannelinfoPackage init() {
        if (isInited) return (Seismo_localchannelinfoPackage)EPackage.Registry.INSTANCE.getEPackage(Seismo_localchannelinfoPackage.eNS_URI);

        // Obtain or create and register package
        Seismo_localchannelinfoPackageImpl theSeismo_localchannelinfoPackage = (Seismo_localchannelinfoPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Seismo_localchannelinfoPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Seismo_localchannelinfoPackageImpl());

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
        Tsi_syncinfoPackageImpl theTsi_syncinfoPackage = (Tsi_syncinfoPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Tsi_syncinfoPackage.eNS_URI) instanceof Tsi_syncinfoPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Tsi_syncinfoPackage.eNS_URI) : Tsi_syncinfoPackage.eINSTANCE);

        // Create package meta-data objects
        theSeismo_localchannelinfoPackage.createPackageContents();
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
        theTsi_syncinfoPackage.createPackageContents();

        // Initialize created meta-data
        theSeismo_localchannelinfoPackage.initializePackageContents();
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
        theTsi_syncinfoPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theSeismo_localchannelinfoPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(Seismo_localchannelinfoPackage.eNS_URI, theSeismo_localchannelinfoPackage);
        return theSeismo_localchannelinfoPackage;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getC() {
        return cEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getC_EContainer_c() {
        return (EReference)cEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getC_V() {
        return (EReference)cEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getLocalchannelinfo() {
        return localchannelinfoEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getLocalchannelinfo_C() {
        return (EReference)localchannelinfoEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getV() {
        return vEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getV_EContainer_v() {
        return (EReference)vEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getV_T() {
        return (EAttribute)vEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getV_S() {
        return (EAttribute)vEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getV_C0() {
        return (EAttribute)vEClass.getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getV_C1() {
        return (EAttribute)vEClass.getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getV_C2() {
        return (EAttribute)vEClass.getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Seismo_localchannelinfoFactory getSeismo_localchannelinfoFactory() {
        return (Seismo_localchannelinfoFactory)getEFactoryInstance();
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
        cEClass = createEClass(C);
        createEReference(cEClass, C__ECONTAINER_C);
        createEReference(cEClass, C__V);

        localchannelinfoEClass = createEClass(LOCALCHANNELINFO);
        createEReference(localchannelinfoEClass, LOCALCHANNELINFO__C);

        vEClass = createEClass(V);
        createEReference(vEClass, V__ECONTAINER_V);
        createEAttribute(vEClass, V__T);
        createEAttribute(vEClass, V__S);
        createEAttribute(vEClass, V__C0);
        createEAttribute(vEClass, V__C1);
        createEAttribute(vEClass, V__C2);
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
        localchannelinfoEClass.getESuperTypes().add(theClickWatchModelPackage.getHandler());

        // Initialize classes and features; add operations and parameters
        initEClass(cEClass, de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.C.class, "C", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getC_EContainer_c(), this.getLocalchannelinfo(), this.getLocalchannelinfo_C(), "eContainer_c", null, 0, 1, de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.C.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getC_V(), this.getV(), this.getV_EContainer_v(), "v", null, 0, -1, de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.C.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(localchannelinfoEClass, Localchannelinfo.class, "Localchannelinfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getLocalchannelinfo_C(), this.getC(), this.getC_EContainer_c(), "c", null, 0, 1, Localchannelinfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(vEClass, de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.V.class, "V", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getV_EContainer_v(), this.getC(), this.getC_V(), "eContainer_v", null, 0, 1, de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.V.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getV_T(), ecorePackage.getELong(), "t", null, 0, 1, de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.V.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getV_S(), ecorePackage.getELong(), "s", null, 0, 1, de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.V.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getV_C0(), ecorePackage.getEInt(), "c0", null, 0, 1, de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.V.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getV_C1(), ecorePackage.getEInt(), "c1", null, 0, 1, de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.V.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getV_C2(), ecorePackage.getEInt(), "c2", null, 0, 1, de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.V.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
             "handler_class", "Localchannelinfo",
             "handler_name", "seismo/localchannelinfo"
           });		
        addAnnotation
          (cEClass, 
           source, 
           new String[] {
             "target_id", "Localchannelinfo|Handler/c|c:C|EObject"
           });		
        addAnnotation
          (getC_V(), 
           source, 
           new String[] {
             "target_id", "Localchannelinfo|Handler/c|c:C|EObject/v|v:V|EObject",
             "IsCopy", "false"
           });		
        addAnnotation
          (localchannelinfoEClass, 
           source, 
           new String[] {
             "target_id", "Localchannelinfo|Handler"
           });		
        addAnnotation
          (getLocalchannelinfo_C(), 
           source, 
           new String[] {
             "target_id", "Localchannelinfo|Handler/c|c:C|EObject",
             "IsCopy", "false"
           });		
        addAnnotation
          (vEClass, 
           source, 
           new String[] {
             "target_id", "Localchannelinfo|Handler/c|c:C|EObject/v|v:V|EObject"
           });		
        addAnnotation
          (getV_T(), 
           source, 
           new String[] {
             "target_id", "Localchannelinfo|Handler/c|c:C|EObject/v|v:V|EObject/t|t:"
           });		
        addAnnotation
          (getV_S(), 
           source, 
           new String[] {
             "target_id", "Localchannelinfo|Handler/c|c:C|EObject/v|v:V|EObject/s|s:"
           });		
        addAnnotation
          (getV_C0(), 
           source, 
           new String[] {
             "target_id", "Localchannelinfo|Handler/c|c:C|EObject/v|v:V|EObject/c0|c0:"
           });		
        addAnnotation
          (getV_C1(), 
           source, 
           new String[] {
             "target_id", "Localchannelinfo|Handler/c|c:C|EObject/v|v:V|EObject/c1|c1:"
           });		
        addAnnotation
          (getV_C2(), 
           source, 
           new String[] {
             "target_id", "Localchannelinfo|Handler/c|c:C|EObject/v|v:V|EObject/c2|c2:"
           });
    }

} //Seismo_localchannelinfoPackageImpl
