/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.impl;

import de.hub.clickwatch.model.ClickWatchModelPackage;

import de.hub.clickwatch.specificmodels.brn.BrnPackage;

import de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Bcast_stats;
import de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Device_wifi_link_stat_bcast_statsFactory;
import de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Device_wifi_link_stat_bcast_statsPackage;
import de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Entry;
import de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Link;
import de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Link_info;

import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage;
import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.Device_wifi_wifidevice_cst_statsPackageImpl;
import de.hub.clickwatch.specificmodels.brn.impl.BrnPackageImpl;

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
public class Device_wifi_link_stat_bcast_statsPackageImpl extends EPackageImpl implements Device_wifi_link_stat_bcast_statsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bcast_statsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entryEClass = null;

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
	private EClass link_infoEClass = null;

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
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Device_wifi_link_stat_bcast_statsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Device_wifi_link_stat_bcast_statsPackageImpl() {
		super(eNS_URI, Device_wifi_link_stat_bcast_statsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Device_wifi_link_stat_bcast_statsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Device_wifi_link_stat_bcast_statsPackage init() {
		if (isInited) return (Device_wifi_link_stat_bcast_statsPackage)EPackage.Registry.INSTANCE.getEPackage(Device_wifi_link_stat_bcast_statsPackage.eNS_URI);

		// Obtain or create and register package
		Device_wifi_link_stat_bcast_statsPackageImpl theDevice_wifi_link_stat_bcast_statsPackage = (Device_wifi_link_stat_bcast_statsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Device_wifi_link_stat_bcast_statsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Device_wifi_link_stat_bcast_statsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ClickWatchModelPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		BrnPackageImpl theBrnPackage = (BrnPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BrnPackage.eNS_URI) instanceof BrnPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BrnPackage.eNS_URI) : BrnPackage.eINSTANCE);
		Device_wifi_wifidevice_cst_statsPackageImpl theDevice_wifi_wifidevice_cst_statsPackage = (Device_wifi_wifidevice_cst_statsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Device_wifi_wifidevice_cst_statsPackage.eNS_URI) instanceof Device_wifi_wifidevice_cst_statsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Device_wifi_wifidevice_cst_statsPackage.eNS_URI) : Device_wifi_wifidevice_cst_statsPackage.eINSTANCE);
		Sys_info_systeminfoPackageImpl theSys_info_systeminfoPackage = (Sys_info_systeminfoPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Sys_info_systeminfoPackage.eNS_URI) instanceof Sys_info_systeminfoPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Sys_info_systeminfoPackage.eNS_URI) : Sys_info_systeminfoPackage.eINSTANCE);

		// Create package meta-data objects
		theDevice_wifi_link_stat_bcast_statsPackage.createPackageContents();
		theBrnPackage.createPackageContents();
		theDevice_wifi_wifidevice_cst_statsPackage.createPackageContents();
		theSys_info_systeminfoPackage.createPackageContents();

		// Initialize created meta-data
		theDevice_wifi_link_stat_bcast_statsPackage.initializePackageContents();
		theBrnPackage.initializePackageContents();
		theDevice_wifi_wifidevice_cst_statsPackage.initializePackageContents();
		theSys_info_systeminfoPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDevice_wifi_link_stat_bcast_statsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Device_wifi_link_stat_bcast_statsPackage.eNS_URI, theDevice_wifi_link_stat_bcast_statsPackage);
		return theDevice_wifi_link_stat_bcast_statsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBcast_stats() {
		return bcast_statsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBcast_stats_Entry() {
		return (EReference)bcast_statsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntry() {
		return entryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntry_EContainer_entry() {
		return (EReference)entryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntry_Text() {
		return (EAttribute)entryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntry_Link() {
		return (EReference)entryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntry_From() {
		return (EAttribute)entryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntry_Time() {
		return (EAttribute)entryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntry_Seq() {
		return (EAttribute)entryEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntry_Period() {
		return (EAttribute)entryEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntry_Tau() {
		return (EAttribute)entryEClass.getEStructuralFeatures().get(7);
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
	public EAttribute getLink_Text() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLink_Link_info() {
		return (EReference)linkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLink_To() {
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
	public EAttribute getLink_Period() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLink_Tau() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLink_Last_rx() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLink_info() {
		return link_infoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLink_info_EContainer_link_info() {
		return (EReference)link_infoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLink_info_Size() {
		return (EAttribute)link_infoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLink_info_Rate() {
		return (EAttribute)link_infoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLink_info_Fwd() {
		return (EAttribute)link_infoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLink_info_Rev() {
		return (EAttribute)link_infoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Device_wifi_link_stat_bcast_statsFactory getDevice_wifi_link_stat_bcast_statsFactory() {
		return (Device_wifi_link_stat_bcast_statsFactory)getEFactoryInstance();
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
		bcast_statsEClass = createEClass(BCAST_STATS);
		createEReference(bcast_statsEClass, BCAST_STATS__ENTRY);

		entryEClass = createEClass(ENTRY);
		createEReference(entryEClass, ENTRY__ECONTAINER_ENTRY);
		createEAttribute(entryEClass, ENTRY__TEXT);
		createEReference(entryEClass, ENTRY__LINK);
		createEAttribute(entryEClass, ENTRY__FROM);
		createEAttribute(entryEClass, ENTRY__TIME);
		createEAttribute(entryEClass, ENTRY__SEQ);
		createEAttribute(entryEClass, ENTRY__PERIOD);
		createEAttribute(entryEClass, ENTRY__TAU);

		linkEClass = createEClass(LINK);
		createEReference(linkEClass, LINK__ECONTAINER_LINK);
		createEAttribute(linkEClass, LINK__TEXT);
		createEReference(linkEClass, LINK__LINK_INFO);
		createEAttribute(linkEClass, LINK__TO);
		createEAttribute(linkEClass, LINK__SEQ);
		createEAttribute(linkEClass, LINK__PERIOD);
		createEAttribute(linkEClass, LINK__TAU);
		createEAttribute(linkEClass, LINK__LAST_RX);

		link_infoEClass = createEClass(LINK_INFO);
		createEReference(link_infoEClass, LINK_INFO__ECONTAINER_LINK_INFO);
		createEAttribute(link_infoEClass, LINK_INFO__SIZE);
		createEAttribute(link_infoEClass, LINK_INFO__RATE);
		createEAttribute(link_infoEClass, LINK_INFO__FWD);
		createEAttribute(link_infoEClass, LINK_INFO__REV);
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
		bcast_statsEClass.getESuperTypes().add(theClickWatchModelPackage.getHandler());

		// Initialize classes and features; add operations and parameters
		initEClass(bcast_statsEClass, Bcast_stats.class, "Bcast_stats", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBcast_stats_Entry(), this.getEntry(), this.getEntry_EContainer_entry(), "entry", null, 0, 1, Bcast_stats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entryEClass, Entry.class, "Entry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntry_EContainer_entry(), this.getBcast_stats(), this.getBcast_stats_Entry(), "eContainer_entry", null, 0, 1, Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntry_Text(), ecorePackage.getEString(), "text", null, 0, -1, Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntry_Link(), this.getLink(), this.getLink_EContainer_link(), "link", null, 0, -1, Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntry_From(), ecorePackage.getEString(), "from", null, 0, 1, Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntry_Time(), ecorePackage.getEDouble(), "time", null, 0, 1, Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntry_Seq(), ecorePackage.getEInt(), "seq", null, 0, 1, Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntry_Period(), ecorePackage.getEInt(), "period", null, 0, 1, Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntry_Tau(), ecorePackage.getEInt(), "tau", null, 0, 1, Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkEClass, Link.class, "Link", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLink_EContainer_link(), this.getEntry(), this.getEntry_Link(), "eContainer_link", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLink_Text(), ecorePackage.getEString(), "text", null, 0, -1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLink_Link_info(), this.getLink_info(), this.getLink_info_EContainer_link_info(), "link_info", null, 0, -1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLink_To(), ecorePackage.getEString(), "to", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLink_Seq(), ecorePackage.getEInt(), "seq", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLink_Period(), ecorePackage.getEInt(), "period", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLink_Tau(), ecorePackage.getEInt(), "tau", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLink_Last_rx(), ecorePackage.getEDouble(), "last_rx", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(link_infoEClass, Link_info.class, "Link_info", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLink_info_EContainer_link_info(), this.getLink(), this.getLink_Link_info(), "eContainer_link_info", null, 0, 1, Link_info.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLink_info_Size(), ecorePackage.getEInt(), "size", null, 0, 1, Link_info.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLink_info_Rate(), ecorePackage.getEInt(), "rate", null, 0, 1, Link_info.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLink_info_Fwd(), ecorePackage.getEInt(), "fwd", null, 0, 1, Link_info.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLink_info_Rev(), ecorePackage.getEInt(), "rev", null, 0, 1, Link_info.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
			 "handler_class", "Bcast_stats"
		   });		
		addAnnotation
		  (bcast_statsEClass, 
		   source, 
		   new String[] {
			 "target_id", "Bcast_stats|Handler"
		   });		
		addAnnotation
		  (getBcast_stats_Entry(), 
		   source, 
		   new String[] {
			 "target_id", "Bcast_stats|Handler/entry|entry:Entry|EObject",
			 "IsCopy", "false"
		   });		
		addAnnotation
		  (entryEClass, 
		   source, 
		   new String[] {
			 "target_id", "Bcast_stats|Handler/entry|entry:Entry|EObject"
		   });		
		addAnnotation
		  (getEntry_Text(), 
		   source, 
		   new String[] {
			 "target_id", "Bcast_stats|Handler/entry|entry:Entry|EObject/text|text:"
		   });		
		addAnnotation
		  (getEntry_Link(), 
		   source, 
		   new String[] {
			 "target_id", "Bcast_stats|Handler/entry|entry:Entry|EObject/link|link:Link|EObject",
			 "IsCopy", "false"
		   });		
		addAnnotation
		  (getEntry_From(), 
		   source, 
		   new String[] {
			 "target_id", "Bcast_stats|Handler/entry|entry:Entry|EObject/from|from:"
		   });		
		addAnnotation
		  (getEntry_Time(), 
		   source, 
		   new String[] {
			 "target_id", "Bcast_stats|Handler/entry|entry:Entry|EObject/time|time:"
		   });		
		addAnnotation
		  (getEntry_Seq(), 
		   source, 
		   new String[] {
			 "target_id", "Bcast_stats|Handler/entry|entry:Entry|EObject/seq|seq:"
		   });		
		addAnnotation
		  (getEntry_Period(), 
		   source, 
		   new String[] {
			 "target_id", "Bcast_stats|Handler/entry|entry:Entry|EObject/period|period:"
		   });		
		addAnnotation
		  (getEntry_Tau(), 
		   source, 
		   new String[] {
			 "target_id", "Bcast_stats|Handler/entry|entry:Entry|EObject/tau|tau:"
		   });		
		addAnnotation
		  (linkEClass, 
		   source, 
		   new String[] {
			 "target_id", "Bcast_stats|Handler/entry|entry:Entry|EObject/link|link:Link|EObject"
		   });		
		addAnnotation
		  (getLink_Text(), 
		   source, 
		   new String[] {
			 "target_id", "Bcast_stats|Handler/entry|entry:Entry|EObject/link|link:Link|EObject/text|text:"
		   });		
		addAnnotation
		  (getLink_Link_info(), 
		   source, 
		   new String[] {
			 "target_id", "Bcast_stats|Handler/entry|entry:Entry|EObject/link|link:Link|EObject/link_info|link_info:Link_info|EObject",
			 "IsCopy", "false"
		   });		
		addAnnotation
		  (getLink_To(), 
		   source, 
		   new String[] {
			 "target_id", "Bcast_stats|Handler/entry|entry:Entry|EObject/link|link:Link|EObject/to|to:"
		   });		
		addAnnotation
		  (getLink_Seq(), 
		   source, 
		   new String[] {
			 "target_id", "Bcast_stats|Handler/entry|entry:Entry|EObject/link|link:Link|EObject/seq|seq:"
		   });		
		addAnnotation
		  (getLink_Period(), 
		   source, 
		   new String[] {
			 "target_id", "Bcast_stats|Handler/entry|entry:Entry|EObject/link|link:Link|EObject/period|period:"
		   });		
		addAnnotation
		  (getLink_Tau(), 
		   source, 
		   new String[] {
			 "target_id", "Bcast_stats|Handler/entry|entry:Entry|EObject/link|link:Link|EObject/tau|tau:"
		   });		
		addAnnotation
		  (getLink_Last_rx(), 
		   source, 
		   new String[] {
			 "target_id", "Bcast_stats|Handler/entry|entry:Entry|EObject/link|link:Link|EObject/last_rx|last_rx:"
		   });		
		addAnnotation
		  (link_infoEClass, 
		   source, 
		   new String[] {
			 "target_id", "Bcast_stats|Handler/entry|entry:Entry|EObject/link|link:Link|EObject/link_info|link_info:Link_info|EObject"
		   });		
		addAnnotation
		  (getLink_info_Size(), 
		   source, 
		   new String[] {
			 "target_id", "Bcast_stats|Handler/entry|entry:Entry|EObject/link|link:Link|EObject/link_info|link_info:Link_info|EObject/size|size:"
		   });		
		addAnnotation
		  (getLink_info_Rate(), 
		   source, 
		   new String[] {
			 "target_id", "Bcast_stats|Handler/entry|entry:Entry|EObject/link|link:Link|EObject/link_info|link_info:Link_info|EObject/rate|rate:"
		   });		
		addAnnotation
		  (getLink_info_Fwd(), 
		   source, 
		   new String[] {
			 "target_id", "Bcast_stats|Handler/entry|entry:Entry|EObject/link|link:Link|EObject/link_info|link_info:Link_info|EObject/fwd|fwd:"
		   });		
		addAnnotation
		  (getLink_info_Rev(), 
		   source, 
		   new String[] {
			 "target_id", "Bcast_stats|Handler/entry|entry:Entry|EObject/link|link:Link|EObject/link_info|link_info:Link_info|EObject/rev|rev:"
		   });
	}

} //Device_wifi_link_stat_bcast_statsPackageImpl