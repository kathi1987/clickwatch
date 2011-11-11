/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.recorder.database;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import de.hub.clickwatch.model.ClickWatchModelPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.hub.clickwatch.recorder.database.CWDataBaseFactory
 * @model kind="package"
 * @generated
 */
public interface CWDataBasePackage extends EPackage {
	/**
     * The package name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	String eNAME = "database";

	/**
     * The package namespace URI.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	String eNS_URI = "http://de.hub.clickwatch/cwdatabase";

	/**
     * The package namespace name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	String eNS_PREFIX = "cwdb";

	/**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	CWDataBasePackage eINSTANCE = de.hub.clickwatch.recorder.database.impl.CWDataBasePackageImpl.init();

	/**
     * The meta object id for the '{@link de.hub.clickwatch.recorder.database.impl.RecordImpl <em>Record</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.hub.clickwatch.recorder.database.impl.RecordImpl
     * @see de.hub.clickwatch.recorder.database.impl.CWDataBasePackageImpl#getRecord()
     * @generated
     */
	int RECORD = 0;

	/**
     * The feature id for the '<em><b>Statistics</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RECORD__STATISTICS = ClickWatchModelPackage.MODEL_ELEMENT_WITH_STATISTICS__STATISTICS;

    /**
     * The feature id for the '<em><b>Configuration</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RECORD__CONFIGURATION = ClickWatchModelPackage.MODEL_ELEMENT_WITH_STATISTICS_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RECORD__NAME = ClickWatchModelPackage.MODEL_ELEMENT_WITH_STATISTICS_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Start</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RECORD__START = ClickWatchModelPackage.MODEL_ELEMENT_WITH_STATISTICS_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Network Time Copy</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RECORD__NETWORK_TIME_COPY = ClickWatchModelPackage.MODEL_ELEMENT_WITH_STATISTICS_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>End</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RECORD__END = ClickWatchModelPackage.MODEL_ELEMENT_WITH_STATISTICS_FEATURE_COUNT + 4;

	/**
     * The feature id for the '<em><b>HBase Row Map</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RECORD__HBASE_ROW_MAP = ClickWatchModelPackage.MODEL_ELEMENT_WITH_STATISTICS_FEATURE_COUNT + 5;

	/**
     * The number of structural features of the '<em>Record</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RECORD_FEATURE_COUNT = ClickWatchModelPackage.MODEL_ELEMENT_WITH_STATISTICS_FEATURE_COUNT + 6;

	/**
     * The meta object id for the '{@link de.hub.clickwatch.recorder.database.impl.DataBaseImpl <em>Data Base</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.hub.clickwatch.recorder.database.impl.DataBaseImpl
     * @see de.hub.clickwatch.recorder.database.impl.CWDataBasePackageImpl#getDataBase()
     * @generated
     */
	int DATA_BASE = 1;

	/**
     * The feature id for the '<em><b>Statistics</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_BASE__STATISTICS = ClickWatchModelPackage.MODEL_ELEMENT_WITH_STATISTICS__STATISTICS;

    /**
     * The feature id for the '<em><b>Records</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DATA_BASE__RECORDS = ClickWatchModelPackage.MODEL_ELEMENT_WITH_STATISTICS_FEATURE_COUNT + 0;

	/**
     * The number of structural features of the '<em>Data Base</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int DATA_BASE_FEATURE_COUNT = ClickWatchModelPackage.MODEL_ELEMENT_WITH_STATISTICS_FEATURE_COUNT + 1;

	/**
     * The meta object id for the '<em>HBase Row Map</em>' data type.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.hub.clickwatch.recorder.database.HBaseRowMap
     * @see de.hub.clickwatch.recorder.database.impl.CWDataBasePackageImpl#getHBaseRowMap()
     * @generated
     */
	int HBASE_ROW_MAP = 2;


	/**
     * Returns the meta object for class '{@link de.hub.clickwatch.recorder.database.Record <em>Record</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Record</em>'.
     * @see de.hub.clickwatch.recorder.database.Record
     * @generated
     */
	EClass getRecord();

	/**
     * Returns the meta object for the containment reference '{@link de.hub.clickwatch.recorder.database.Record#getConfiguration <em>Configuration</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Configuration</em>'.
     * @see de.hub.clickwatch.recorder.database.Record#getConfiguration()
     * @see #getRecord()
     * @generated
     */
	EReference getRecord_Configuration();

	/**
     * Returns the meta object for the attribute '{@link de.hub.clickwatch.recorder.database.Record#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see de.hub.clickwatch.recorder.database.Record#getName()
     * @see #getRecord()
     * @generated
     */
	EAttribute getRecord_Name();

	/**
     * Returns the meta object for the attribute '{@link de.hub.clickwatch.recorder.database.Record#getStart <em>Start</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Start</em>'.
     * @see de.hub.clickwatch.recorder.database.Record#getStart()
     * @see #getRecord()
     * @generated
     */
	EAttribute getRecord_Start();

	/**
     * Returns the meta object for the containment reference '{@link de.hub.clickwatch.recorder.database.Record#getNetworkTimeCopy <em>Network Time Copy</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Network Time Copy</em>'.
     * @see de.hub.clickwatch.recorder.database.Record#getNetworkTimeCopy()
     * @see #getRecord()
     * @generated
     */
	EReference getRecord_NetworkTimeCopy();

	/**
     * Returns the meta object for the attribute '{@link de.hub.clickwatch.recorder.database.Record#getEnd <em>End</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>End</em>'.
     * @see de.hub.clickwatch.recorder.database.Record#getEnd()
     * @see #getRecord()
     * @generated
     */
	EAttribute getRecord_End();

	/**
     * Returns the meta object for the attribute '{@link de.hub.clickwatch.recorder.database.Record#getHBaseRowMap <em>HBase Row Map</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>HBase Row Map</em>'.
     * @see de.hub.clickwatch.recorder.database.Record#getHBaseRowMap()
     * @see #getRecord()
     * @generated
     */
	EAttribute getRecord_HBaseRowMap();

	/**
     * Returns the meta object for class '{@link de.hub.clickwatch.recorder.database.DataBase <em>Data Base</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Data Base</em>'.
     * @see de.hub.clickwatch.recorder.database.DataBase
     * @generated
     */
	EClass getDataBase();

	/**
     * Returns the meta object for the containment reference list '{@link de.hub.clickwatch.recorder.database.DataBase#getRecords <em>Records</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Records</em>'.
     * @see de.hub.clickwatch.recorder.database.DataBase#getRecords()
     * @see #getDataBase()
     * @generated
     */
	EReference getDataBase_Records();

	/**
     * Returns the meta object for data type '{@link de.hub.clickwatch.recorder.database.HBaseRowMap <em>HBase Row Map</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for data type '<em>HBase Row Map</em>'.
     * @see de.hub.clickwatch.recorder.database.HBaseRowMap
     * @model instanceClass="de.hub.clickwatch.recorder.database.HBaseRowMap"
     * @generated
     */
	EDataType getHBaseRowMap();

	/**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
	CWDataBaseFactory getCWDataBaseFactory();

	/**
     * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
     * @generated
     */
	interface Literals {
		/**
         * The meta object literal for the '{@link de.hub.clickwatch.recorder.database.impl.RecordImpl <em>Record</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.hub.clickwatch.recorder.database.impl.RecordImpl
         * @see de.hub.clickwatch.recorder.database.impl.CWDataBasePackageImpl#getRecord()
         * @generated
         */
		EClass RECORD = eINSTANCE.getRecord();

		/**
         * The meta object literal for the '<em><b>Configuration</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference RECORD__CONFIGURATION = eINSTANCE.getRecord_Configuration();

		/**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute RECORD__NAME = eINSTANCE.getRecord_Name();

		/**
         * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute RECORD__START = eINSTANCE.getRecord_Start();

		/**
         * The meta object literal for the '<em><b>Network Time Copy</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference RECORD__NETWORK_TIME_COPY = eINSTANCE.getRecord_NetworkTimeCopy();

		/**
         * The meta object literal for the '<em><b>End</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute RECORD__END = eINSTANCE.getRecord_End();

		/**
         * The meta object literal for the '<em><b>HBase Row Map</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute RECORD__HBASE_ROW_MAP = eINSTANCE.getRecord_HBaseRowMap();

		/**
         * The meta object literal for the '{@link de.hub.clickwatch.recorder.database.impl.DataBaseImpl <em>Data Base</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.hub.clickwatch.recorder.database.impl.DataBaseImpl
         * @see de.hub.clickwatch.recorder.database.impl.CWDataBasePackageImpl#getDataBase()
         * @generated
         */
		EClass DATA_BASE = eINSTANCE.getDataBase();

		/**
         * The meta object literal for the '<em><b>Records</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference DATA_BASE__RECORDS = eINSTANCE.getDataBase_Records();

		/**
         * The meta object literal for the '<em>HBase Row Map</em>' data type.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.hub.clickwatch.recorder.database.HBaseRowMap
         * @see de.hub.clickwatch.recorder.database.impl.CWDataBasePackageImpl#getHBaseRowMap()
         * @generated
         */
		EDataType HBASE_ROW_MAP = eINSTANCE.getHBaseRowMap();

	}

} //CWDataBasePackage
