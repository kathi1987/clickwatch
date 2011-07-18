/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.cwdatabase.impl;

import de.hub.clickwatch.cwdatabase.CWDataBaseFactory;
import de.hub.clickwatch.cwdatabase.CWDataBasePackage;
import de.hub.clickwatch.cwdatabase.Experimiment;
import de.hub.clickwatch.cwdatabase.NodeRecord;

import de.hub.clickwatch.model.ClickWatchModelPackage;

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
public class CWDataBasePackageImpl extends EPackageImpl implements CWDataBasePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass experimimentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeRecordEClass = null;

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
	 * @see de.hub.clickwatch.cwdatabase.CWDataBasePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CWDataBasePackageImpl() {
		super(eNS_URI, CWDataBaseFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CWDataBasePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CWDataBasePackage init() {
		if (isInited) return (CWDataBasePackage)EPackage.Registry.INSTANCE.getEPackage(CWDataBasePackage.eNS_URI);

		// Obtain or create and register package
		CWDataBasePackageImpl theCWDataBasePackage = (CWDataBasePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CWDataBasePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CWDataBasePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ClickWatchModelPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCWDataBasePackage.createPackageContents();

		// Initialize created meta-data
		theCWDataBasePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCWDataBasePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CWDataBasePackage.eNS_URI, theCWDataBasePackage);
		return theCWDataBasePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExperimiment() {
		return experimimentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExperimiment_MetaData() {
		return (EReference)experimimentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExperimiment_Records() {
		return (EReference)experimimentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExperimiment_Configuration() {
		return (EReference)experimimentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExperimiment_Id() {
		return (EAttribute)experimimentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExperimiment_RecordURIs() {
		return (EAttribute)experimimentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExperimiment_StorageBaseFileStr() {
		return (EAttribute)experimimentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodeRecord() {
		return nodeRecordEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeRecord_Records() {
		return (EReference)nodeRecordEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeRecord_Key() {
		return (EReference)nodeRecordEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeRecord_Start() {
		return (EAttribute)nodeRecordEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeRecord_Stop() {
		return (EAttribute)nodeRecordEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeRecord_Id() {
		return (EAttribute)nodeRecordEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CWDataBaseFactory getCWDataBaseFactory() {
		return (CWDataBaseFactory)getEFactoryInstance();
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
		experimimentEClass = createEClass(EXPERIMIMENT);
		createEReference(experimimentEClass, EXPERIMIMENT__META_DATA);
		createEReference(experimimentEClass, EXPERIMIMENT__RECORDS);
		createEReference(experimimentEClass, EXPERIMIMENT__CONFIGURATION);
		createEAttribute(experimimentEClass, EXPERIMIMENT__ID);
		createEAttribute(experimimentEClass, EXPERIMIMENT__RECORD_UR_IS);
		createEAttribute(experimimentEClass, EXPERIMIMENT__STORAGE_BASE_FILE_STR);

		nodeRecordEClass = createEClass(NODE_RECORD);
		createEReference(nodeRecordEClass, NODE_RECORD__RECORDS);
		createEReference(nodeRecordEClass, NODE_RECORD__KEY);
		createEAttribute(nodeRecordEClass, NODE_RECORD__START);
		createEAttribute(nodeRecordEClass, NODE_RECORD__STOP);
		createEAttribute(nodeRecordEClass, NODE_RECORD__ID);
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

		// Initialize classes and features; add operations and parameters
		initEClass(experimimentEClass, Experimiment.class, "Experimiment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExperimiment_MetaData(), theClickWatchModelPackage.getNode(), null, "metaData", null, 0, -1, Experimiment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExperimiment_Records(), this.getNodeRecord(), null, "records", null, 0, -1, Experimiment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExperimiment_Configuration(), theClickWatchModelPackage.getNetwork(), null, "configuration", null, 0, 1, Experimiment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExperimiment_Id(), ecorePackage.getEString(), "id", null, 0, 1, Experimiment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExperimiment_RecordURIs(), ecorePackage.getEString(), "recordURIs", null, 0, -1, Experimiment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExperimiment_StorageBaseFileStr(), ecorePackage.getEString(), "storageBaseFileStr", null, 0, 1, Experimiment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeRecordEClass, NodeRecord.class, "NodeRecord", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNodeRecord_Records(), theClickWatchModelPackage.getHandler(), null, "records", null, 0, -1, NodeRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNodeRecord_Key(), theClickWatchModelPackage.getHandler(), null, "key", null, 0, -1, NodeRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeRecord_Start(), ecorePackage.getELong(), "start", null, 0, 1, NodeRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeRecord_Stop(), ecorePackage.getELong(), "stop", null, 0, 1, NodeRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeRecord_Id(), ecorePackage.getEString(), "id", null, 0, 1, NodeRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //CWDataBasePackageImpl
