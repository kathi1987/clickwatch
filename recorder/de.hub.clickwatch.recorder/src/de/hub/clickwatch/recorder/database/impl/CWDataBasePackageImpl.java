/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.recorder.database.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import de.hub.clickwatch.analysis.results.ResultsPackage;
import de.hub.clickwatch.model.ClickWatchModelPackage;
import de.hub.clickwatch.recorder.database.CWDataBaseFactory;
import de.hub.clickwatch.recorder.database.CWDataBasePackage;
import de.hub.clickwatch.recorder.database.DataBase;
import de.hub.clickwatch.recorder.database.HBaseRowMap;
import de.hub.clickwatch.recorder.database.Record;

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
	private EClass recordEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass dataBaseEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EDataType hBaseRowMapEDataType = null;

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
     * @see de.hub.clickwatch.recorder.database.CWDataBasePackage#eNS_URI
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
        ResultsPackage.eINSTANCE.eClass();

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
	public EClass getRecord() {
        return recordEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getRecord_Configuration() {
        return (EReference)recordEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getRecord_Name() {
        return (EAttribute)recordEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getRecord_Start() {
        return (EAttribute)recordEClass.getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getRecord_End() {
        return (EAttribute)recordEClass.getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getRecord_HBaseRowMap() {
        return (EAttribute)recordEClass.getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRecord_Results() {
        return (EReference)recordEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getDataBase() {
        return dataBaseEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getDataBase_Records() {
        return (EReference)dataBaseEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EDataType getHBaseRowMap() {
        return hBaseRowMapEDataType;
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
        recordEClass = createEClass(RECORD);
        createEReference(recordEClass, RECORD__CONFIGURATION);
        createEAttribute(recordEClass, RECORD__NAME);
        createEAttribute(recordEClass, RECORD__START);
        createEAttribute(recordEClass, RECORD__END);
        createEAttribute(recordEClass, RECORD__HBASE_ROW_MAP);
        createEReference(recordEClass, RECORD__RESULTS);

        dataBaseEClass = createEClass(DATA_BASE);
        createEReference(dataBaseEClass, DATA_BASE__RECORDS);

        // Create data types
        hBaseRowMapEDataType = createEDataType(HBASE_ROW_MAP);
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
        ResultsPackage theResultsPackage = (ResultsPackage)EPackage.Registry.INSTANCE.getEPackage(ResultsPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        recordEClass.getESuperTypes().add(theClickWatchModelPackage.getModelElementWithStatistics());
        dataBaseEClass.getESuperTypes().add(theClickWatchModelPackage.getModelElementWithStatistics());

        // Initialize classes and features; add operations and parameters
        initEClass(recordEClass, Record.class, "Record", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getRecord_Configuration(), theClickWatchModelPackage.getNetwork(), null, "configuration", null, 0, 1, Record.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRecord_Name(), ecorePackage.getEString(), "name", null, 0, 1, Record.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRecord_Start(), ecorePackage.getELong(), "start", null, 0, 1, Record.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRecord_End(), ecorePackage.getELong(), "end", null, 0, 1, Record.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRecord_HBaseRowMap(), this.getHBaseRowMap(), "hBaseRowMap", null, 0, 1, Record.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRecord_Results(), theResultsPackage.getResults(), null, "results", null, 0, 1, Record.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(dataBaseEClass, DataBase.class, "DataBase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getDataBase_Records(), this.getRecord(), null, "records", null, 0, -1, DataBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Initialize data types
        initEDataType(hBaseRowMapEDataType, HBaseRowMap.class, "HBaseRowMap", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

        // Create resource
        createResource(eNS_URI);
    }

} //CWDataBasePackageImpl
