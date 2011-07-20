/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.cwdatabase;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see de.hub.clickwatch.cwdatabase.CWDataBaseFactory
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
	String eNAME = "cwdatabase";

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
	CWDataBasePackage eINSTANCE = de.hub.clickwatch.cwdatabase.impl.CWDataBasePackageImpl.init();

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.cwdatabase.impl.ExperimentDescrImpl <em>Experiment Descr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.cwdatabase.impl.ExperimentDescrImpl
	 * @see de.hub.clickwatch.cwdatabase.impl.CWDataBasePackageImpl#getExperimentDescr()
	 * @generated
	 */
	int EXPERIMENT_DESCR = 0;

	/**
	 * The feature id for the '<em><b>Network</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_DESCR__NETWORK = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_DESCR__NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_DESCR__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_DESCR__START = 3;

	/**
	 * The feature id for the '<em><b>Record</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_DESCR__RECORD = 4;

	/**
	 * The feature id for the '<em><b>Network Time Copy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_DESCR__NETWORK_TIME_COPY = 5;

	/**
	 * The feature id for the '<em><b>Data Base</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_DESCR__DATA_BASE = 6;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_DESCR__DURATION = 7;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_DESCR__END = 8;

	/**
	 * The number of structural features of the '<em>Experiment Descr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_DESCR_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.cwdatabase.impl.NodeRecordImpl <em>Node Record</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.cwdatabase.impl.NodeRecordImpl
	 * @see de.hub.clickwatch.cwdatabase.impl.CWDataBasePackageImpl#getNodeRecord()
	 * @generated
	 */
	int NODE_RECORD = 1;

	/**
	 * The feature id for the '<em><b>Records</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_RECORD__RECORDS = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_RECORD__KEY = 1;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_RECORD__START = 2;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_RECORD__END = 3;

	/**
	 * The feature id for the '<em><b>Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_RECORD__NODE = 4;

	/**
	 * The number of structural features of the '<em>Node Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_RECORD_FEATURE_COUNT = 5;


	/**
	 * The meta object id for the '{@link de.hub.clickwatch.cwdatabase.impl.DataBaseImpl <em>Data Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.cwdatabase.impl.DataBaseImpl
	 * @see de.hub.clickwatch.cwdatabase.impl.CWDataBasePackageImpl#getDataBase()
	 * @generated
	 */
	int DATA_BASE = 2;

	/**
	 * The feature id for the '<em><b>Experiments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BASE__EXPERIMENTS = 0;

	/**
	 * The feature id for the '<em><b>Storage Base File String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BASE__STORAGE_BASE_FILE_STRING = 1;

	/**
	 * The feature id for the '<em><b>Statistics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BASE__STATISTICS = 2;

	/**
	 * The number of structural features of the '<em>Data Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BASE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.cwdatabase.impl.ExperimentRecordImpl <em>Experiment Record</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.cwdatabase.impl.ExperimentRecordImpl
	 * @see de.hub.clickwatch.cwdatabase.impl.CWDataBasePackageImpl#getExperimentRecord()
	 * @generated
	 */
	int EXPERIMENT_RECORD = 3;

	/**
	 * The feature id for the '<em><b>Meta Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_RECORD__META_DATA = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_RECORD__NAME = 1;

	/**
	 * The feature id for the '<em><b>Node Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_RECORD__NODE_MAP = 2;

	/**
	 * The number of structural features of the '<em>Experiment Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_RECORD_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.cwdatabase.impl.ExperimentNodeRecordTimeTableImpl <em>Experiment Node Record Time Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.cwdatabase.impl.ExperimentNodeRecordTimeTableImpl
	 * @see de.hub.clickwatch.cwdatabase.impl.CWDataBasePackageImpl#getExperimentNodeRecordTimeTable()
	 * @generated
	 */
	int EXPERIMENT_NODE_RECORD_TIME_TABLE = 4;

	/**
	 * The feature id for the '<em><b>Node Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_NODE_RECORD_TIME_TABLE__NODE_MAP = 0;

	/**
	 * The number of structural features of the '<em>Experiment Node Record Time Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_NODE_RECORD_TIME_TABLE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.cwdatabase.impl.EStringToExperimentNodeRecordTimeTableMapImpl <em>EString To Experiment Node Record Time Table Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.cwdatabase.impl.EStringToExperimentNodeRecordTimeTableMapImpl
	 * @see de.hub.clickwatch.cwdatabase.impl.CWDataBasePackageImpl#getEStringToExperimentNodeRecordTimeTableMap()
	 * @generated
	 */
	int ESTRING_TO_EXPERIMENT_NODE_RECORD_TIME_TABLE_MAP = 5;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRING_TO_EXPERIMENT_NODE_RECORD_TIME_TABLE_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRING_TO_EXPERIMENT_NODE_RECORD_TIME_TABLE_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>EString To Experiment Node Record Time Table Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRING_TO_EXPERIMENT_NODE_RECORD_TIME_TABLE_MAP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.cwdatabase.impl.ELongObjectToNodeRecordDescrMapImpl <em>ELong Object To Node Record Descr Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.cwdatabase.impl.ELongObjectToNodeRecordDescrMapImpl
	 * @see de.hub.clickwatch.cwdatabase.impl.CWDataBasePackageImpl#getELongObjectToNodeRecordDescrMap()
	 * @generated
	 */
	int ELONG_OBJECT_TO_NODE_RECORD_DESCR_MAP = 6;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELONG_OBJECT_TO_NODE_RECORD_DESCR_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELONG_OBJECT_TO_NODE_RECORD_DESCR_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>ELong Object To Node Record Descr Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELONG_OBJECT_TO_NODE_RECORD_DESCR_MAP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.cwdatabase.impl.DataBaseStatisticsImpl <em>Data Base Statistics</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.cwdatabase.impl.DataBaseStatisticsImpl
	 * @see de.hub.clickwatch.cwdatabase.impl.CWDataBasePackageImpl#getDataBaseStatistics()
	 * @generated
	 */
	int DATA_BASE_STATISTICS = 7;

	/**
	 * The feature id for the '<em><b>Handler Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BASE_STATISTICS__HANDLER_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Sample Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BASE_STATISTICS__SAMPLE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Experiment Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BASE_STATISTICS__EXPERIMENT_COUNT = 2;

	/**
	 * The number of structural features of the '<em>Data Base Statistics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BASE_STATISTICS_FEATURE_COUNT = 3;


	/**
	 * The meta object id for the '{@link de.hub.clickwatch.cwdatabase.impl.NodeRecordDescrImpl <em>Node Record Descr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.cwdatabase.impl.NodeRecordDescrImpl
	 * @see de.hub.clickwatch.cwdatabase.impl.CWDataBasePackageImpl#getNodeRecordDescr()
	 * @generated
	 */
	int NODE_RECORD_DESCR = 8;

	/**
	 * The feature id for the '<em><b>Record</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_RECORD_DESCR__RECORD = 0;

	/**
	 * The number of structural features of the '<em>Node Record Descr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_RECORD_DESCR_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.cwdatabase.ExperimentDescr <em>Experiment Descr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Experiment Descr</em>'.
	 * @see de.hub.clickwatch.cwdatabase.ExperimentDescr
	 * @generated
	 */
	EClass getExperimentDescr();

	/**
	 * Returns the meta object for the containment reference '{@link de.hub.clickwatch.cwdatabase.ExperimentDescr#getNetwork <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Network</em>'.
	 * @see de.hub.clickwatch.cwdatabase.ExperimentDescr#getNetwork()
	 * @see #getExperimentDescr()
	 * @generated
	 */
	EReference getExperimentDescr_Network();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.cwdatabase.ExperimentDescr#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.hub.clickwatch.cwdatabase.ExperimentDescr#getName()
	 * @see #getExperimentDescr()
	 * @generated
	 */
	EAttribute getExperimentDescr_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.cwdatabase.ExperimentDescr#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see de.hub.clickwatch.cwdatabase.ExperimentDescr#getDescription()
	 * @see #getExperimentDescr()
	 * @generated
	 */
	EAttribute getExperimentDescr_Description();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.cwdatabase.ExperimentDescr#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see de.hub.clickwatch.cwdatabase.ExperimentDescr#getStart()
	 * @see #getExperimentDescr()
	 * @generated
	 */
	EAttribute getExperimentDescr_Start();

	/**
	 * Returns the meta object for the reference '{@link de.hub.clickwatch.cwdatabase.ExperimentDescr#getRecord <em>Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Record</em>'.
	 * @see de.hub.clickwatch.cwdatabase.ExperimentDescr#getRecord()
	 * @see #getExperimentDescr()
	 * @generated
	 */
	EReference getExperimentDescr_Record();

	/**
	 * Returns the meta object for the containment reference '{@link de.hub.clickwatch.cwdatabase.ExperimentDescr#getNetworkTimeCopy <em>Network Time Copy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Network Time Copy</em>'.
	 * @see de.hub.clickwatch.cwdatabase.ExperimentDescr#getNetworkTimeCopy()
	 * @see #getExperimentDescr()
	 * @generated
	 */
	EReference getExperimentDescr_NetworkTimeCopy();

	/**
	 * Returns the meta object for the container reference '{@link de.hub.clickwatch.cwdatabase.ExperimentDescr#getDataBase <em>Data Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Data Base</em>'.
	 * @see de.hub.clickwatch.cwdatabase.ExperimentDescr#getDataBase()
	 * @see #getExperimentDescr()
	 * @generated
	 */
	EReference getExperimentDescr_DataBase();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.cwdatabase.ExperimentDescr#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see de.hub.clickwatch.cwdatabase.ExperimentDescr#getDuration()
	 * @see #getExperimentDescr()
	 * @generated
	 */
	EAttribute getExperimentDescr_Duration();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.cwdatabase.ExperimentDescr#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see de.hub.clickwatch.cwdatabase.ExperimentDescr#getEnd()
	 * @see #getExperimentDescr()
	 * @generated
	 */
	EAttribute getExperimentDescr_End();

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.cwdatabase.NodeRecord <em>Node Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Record</em>'.
	 * @see de.hub.clickwatch.cwdatabase.NodeRecord
	 * @generated
	 */
	EClass getNodeRecord();

	/**
	 * Returns the meta object for the containment reference list '{@link de.hub.clickwatch.cwdatabase.NodeRecord#getRecords <em>Records</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Records</em>'.
	 * @see de.hub.clickwatch.cwdatabase.NodeRecord#getRecords()
	 * @see #getNodeRecord()
	 * @generated
	 */
	EReference getNodeRecord_Records();

	/**
	 * Returns the meta object for the reference list '{@link de.hub.clickwatch.cwdatabase.NodeRecord#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Key</em>'.
	 * @see de.hub.clickwatch.cwdatabase.NodeRecord#getKey()
	 * @see #getNodeRecord()
	 * @generated
	 */
	EReference getNodeRecord_Key();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.cwdatabase.NodeRecord#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see de.hub.clickwatch.cwdatabase.NodeRecord#getStart()
	 * @see #getNodeRecord()
	 * @generated
	 */
	EAttribute getNodeRecord_Start();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.cwdatabase.NodeRecord#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see de.hub.clickwatch.cwdatabase.NodeRecord#getEnd()
	 * @see #getNodeRecord()
	 * @generated
	 */
	EAttribute getNodeRecord_End();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.cwdatabase.NodeRecord#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node</em>'.
	 * @see de.hub.clickwatch.cwdatabase.NodeRecord#getNode()
	 * @see #getNodeRecord()
	 * @generated
	 */
	EAttribute getNodeRecord_Node();

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.cwdatabase.DataBase <em>Data Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Base</em>'.
	 * @see de.hub.clickwatch.cwdatabase.DataBase
	 * @generated
	 */
	EClass getDataBase();

	/**
	 * Returns the meta object for the containment reference list '{@link de.hub.clickwatch.cwdatabase.DataBase#getExperiments <em>Experiments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Experiments</em>'.
	 * @see de.hub.clickwatch.cwdatabase.DataBase#getExperiments()
	 * @see #getDataBase()
	 * @generated
	 */
	EReference getDataBase_Experiments();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.cwdatabase.DataBase#getStorageBaseFileString <em>Storage Base File String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Storage Base File String</em>'.
	 * @see de.hub.clickwatch.cwdatabase.DataBase#getStorageBaseFileString()
	 * @see #getDataBase()
	 * @generated
	 */
	EAttribute getDataBase_StorageBaseFileString();

	/**
	 * Returns the meta object for the containment reference '{@link de.hub.clickwatch.cwdatabase.DataBase#getStatistics <em>Statistics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Statistics</em>'.
	 * @see de.hub.clickwatch.cwdatabase.DataBase#getStatistics()
	 * @see #getDataBase()
	 * @generated
	 */
	EReference getDataBase_Statistics();

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.cwdatabase.ExperimentRecord <em>Experiment Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Experiment Record</em>'.
	 * @see de.hub.clickwatch.cwdatabase.ExperimentRecord
	 * @generated
	 */
	EClass getExperimentRecord();

	/**
	 * Returns the meta object for the containment reference list '{@link de.hub.clickwatch.cwdatabase.ExperimentRecord#getMetaData <em>Meta Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Meta Data</em>'.
	 * @see de.hub.clickwatch.cwdatabase.ExperimentRecord#getMetaData()
	 * @see #getExperimentRecord()
	 * @generated
	 */
	EReference getExperimentRecord_MetaData();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.cwdatabase.ExperimentRecord#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.hub.clickwatch.cwdatabase.ExperimentRecord#getName()
	 * @see #getExperimentRecord()
	 * @generated
	 */
	EAttribute getExperimentRecord_Name();

	/**
	 * Returns the meta object for the map '{@link de.hub.clickwatch.cwdatabase.ExperimentRecord#getNodeMap <em>Node Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Node Map</em>'.
	 * @see de.hub.clickwatch.cwdatabase.ExperimentRecord#getNodeMap()
	 * @see #getExperimentRecord()
	 * @generated
	 */
	EReference getExperimentRecord_NodeMap();

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.cwdatabase.ExperimentNodeRecordTimeTable <em>Experiment Node Record Time Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Experiment Node Record Time Table</em>'.
	 * @see de.hub.clickwatch.cwdatabase.ExperimentNodeRecordTimeTable
	 * @generated
	 */
	EClass getExperimentNodeRecordTimeTable();

	/**
	 * Returns the meta object for the map '{@link de.hub.clickwatch.cwdatabase.ExperimentNodeRecordTimeTable#getNodeMap <em>Node Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Node Map</em>'.
	 * @see de.hub.clickwatch.cwdatabase.ExperimentNodeRecordTimeTable#getNodeMap()
	 * @see #getExperimentNodeRecordTimeTable()
	 * @generated
	 */
	EReference getExperimentNodeRecordTimeTable_NodeMap();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>EString To Experiment Node Record Time Table Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EString To Experiment Node Record Time Table Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueType="de.hub.clickwatch.cwdatabase.ExperimentNodeRecordTimeTable" valueContainment="true"
	 * @generated
	 */
	EClass getEStringToExperimentNodeRecordTimeTableMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getEStringToExperimentNodeRecordTimeTableMap()
	 * @generated
	 */
	EAttribute getEStringToExperimentNodeRecordTimeTableMap_Key();

	/**
	 * Returns the meta object for the containment reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getEStringToExperimentNodeRecordTimeTableMap()
	 * @generated
	 */
	EReference getEStringToExperimentNodeRecordTimeTableMap_Value();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>ELong Object To Node Record Descr Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ELong Object To Node Record Descr Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.ELongObject"
	 *        valueType="de.hub.clickwatch.cwdatabase.NodeRecordDescr" valueContainment="true"
	 * @generated
	 */
	EClass getELongObjectToNodeRecordDescrMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getELongObjectToNodeRecordDescrMap()
	 * @generated
	 */
	EAttribute getELongObjectToNodeRecordDescrMap_Key();

	/**
	 * Returns the meta object for the containment reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getELongObjectToNodeRecordDescrMap()
	 * @generated
	 */
	EReference getELongObjectToNodeRecordDescrMap_Value();

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.cwdatabase.DataBaseStatistics <em>Data Base Statistics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Base Statistics</em>'.
	 * @see de.hub.clickwatch.cwdatabase.DataBaseStatistics
	 * @generated
	 */
	EClass getDataBaseStatistics();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.cwdatabase.DataBaseStatistics#getHandlerCount <em>Handler Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Handler Count</em>'.
	 * @see de.hub.clickwatch.cwdatabase.DataBaseStatistics#getHandlerCount()
	 * @see #getDataBaseStatistics()
	 * @generated
	 */
	EAttribute getDataBaseStatistics_HandlerCount();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.cwdatabase.DataBaseStatistics#getSampleCount <em>Sample Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sample Count</em>'.
	 * @see de.hub.clickwatch.cwdatabase.DataBaseStatistics#getSampleCount()
	 * @see #getDataBaseStatistics()
	 * @generated
	 */
	EAttribute getDataBaseStatistics_SampleCount();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.cwdatabase.DataBaseStatistics#getExperimentCount <em>Experiment Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Experiment Count</em>'.
	 * @see de.hub.clickwatch.cwdatabase.DataBaseStatistics#getExperimentCount()
	 * @see #getDataBaseStatistics()
	 * @generated
	 */
	EAttribute getDataBaseStatistics_ExperimentCount();

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.cwdatabase.NodeRecordDescr <em>Node Record Descr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Record Descr</em>'.
	 * @see de.hub.clickwatch.cwdatabase.NodeRecordDescr
	 * @generated
	 */
	EClass getNodeRecordDescr();

	/**
	 * Returns the meta object for the reference '{@link de.hub.clickwatch.cwdatabase.NodeRecordDescr#getRecord <em>Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Record</em>'.
	 * @see de.hub.clickwatch.cwdatabase.NodeRecordDescr#getRecord()
	 * @see #getNodeRecordDescr()
	 * @generated
	 */
	EReference getNodeRecordDescr_Record();

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
		 * The meta object literal for the '{@link de.hub.clickwatch.cwdatabase.impl.ExperimentDescrImpl <em>Experiment Descr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.cwdatabase.impl.ExperimentDescrImpl
		 * @see de.hub.clickwatch.cwdatabase.impl.CWDataBasePackageImpl#getExperimentDescr()
		 * @generated
		 */
		EClass EXPERIMENT_DESCR = eINSTANCE.getExperimentDescr();

		/**
		 * The meta object literal for the '<em><b>Network</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPERIMENT_DESCR__NETWORK = eINSTANCE.getExperimentDescr_Network();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPERIMENT_DESCR__NAME = eINSTANCE.getExperimentDescr_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPERIMENT_DESCR__DESCRIPTION = eINSTANCE.getExperimentDescr_Description();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPERIMENT_DESCR__START = eINSTANCE.getExperimentDescr_Start();

		/**
		 * The meta object literal for the '<em><b>Record</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPERIMENT_DESCR__RECORD = eINSTANCE.getExperimentDescr_Record();

		/**
		 * The meta object literal for the '<em><b>Network Time Copy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPERIMENT_DESCR__NETWORK_TIME_COPY = eINSTANCE.getExperimentDescr_NetworkTimeCopy();

		/**
		 * The meta object literal for the '<em><b>Data Base</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPERIMENT_DESCR__DATA_BASE = eINSTANCE.getExperimentDescr_DataBase();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPERIMENT_DESCR__DURATION = eINSTANCE.getExperimentDescr_Duration();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPERIMENT_DESCR__END = eINSTANCE.getExperimentDescr_End();

		/**
		 * The meta object literal for the '{@link de.hub.clickwatch.cwdatabase.impl.NodeRecordImpl <em>Node Record</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.cwdatabase.impl.NodeRecordImpl
		 * @see de.hub.clickwatch.cwdatabase.impl.CWDataBasePackageImpl#getNodeRecord()
		 * @generated
		 */
		EClass NODE_RECORD = eINSTANCE.getNodeRecord();

		/**
		 * The meta object literal for the '<em><b>Records</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_RECORD__RECORDS = eINSTANCE.getNodeRecord_Records();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_RECORD__KEY = eINSTANCE.getNodeRecord_Key();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_RECORD__START = eINSTANCE.getNodeRecord_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_RECORD__END = eINSTANCE.getNodeRecord_End();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_RECORD__NODE = eINSTANCE.getNodeRecord_Node();

		/**
		 * The meta object literal for the '{@link de.hub.clickwatch.cwdatabase.impl.DataBaseImpl <em>Data Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.cwdatabase.impl.DataBaseImpl
		 * @see de.hub.clickwatch.cwdatabase.impl.CWDataBasePackageImpl#getDataBase()
		 * @generated
		 */
		EClass DATA_BASE = eINSTANCE.getDataBase();

		/**
		 * The meta object literal for the '<em><b>Experiments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_BASE__EXPERIMENTS = eINSTANCE.getDataBase_Experiments();

		/**
		 * The meta object literal for the '<em><b>Storage Base File String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_BASE__STORAGE_BASE_FILE_STRING = eINSTANCE.getDataBase_StorageBaseFileString();

		/**
		 * The meta object literal for the '<em><b>Statistics</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_BASE__STATISTICS = eINSTANCE.getDataBase_Statistics();

		/**
		 * The meta object literal for the '{@link de.hub.clickwatch.cwdatabase.impl.ExperimentRecordImpl <em>Experiment Record</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.cwdatabase.impl.ExperimentRecordImpl
		 * @see de.hub.clickwatch.cwdatabase.impl.CWDataBasePackageImpl#getExperimentRecord()
		 * @generated
		 */
		EClass EXPERIMENT_RECORD = eINSTANCE.getExperimentRecord();

		/**
		 * The meta object literal for the '<em><b>Meta Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPERIMENT_RECORD__META_DATA = eINSTANCE.getExperimentRecord_MetaData();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPERIMENT_RECORD__NAME = eINSTANCE.getExperimentRecord_Name();

		/**
		 * The meta object literal for the '<em><b>Node Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPERIMENT_RECORD__NODE_MAP = eINSTANCE.getExperimentRecord_NodeMap();

		/**
		 * The meta object literal for the '{@link de.hub.clickwatch.cwdatabase.impl.ExperimentNodeRecordTimeTableImpl <em>Experiment Node Record Time Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.cwdatabase.impl.ExperimentNodeRecordTimeTableImpl
		 * @see de.hub.clickwatch.cwdatabase.impl.CWDataBasePackageImpl#getExperimentNodeRecordTimeTable()
		 * @generated
		 */
		EClass EXPERIMENT_NODE_RECORD_TIME_TABLE = eINSTANCE.getExperimentNodeRecordTimeTable();

		/**
		 * The meta object literal for the '<em><b>Node Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPERIMENT_NODE_RECORD_TIME_TABLE__NODE_MAP = eINSTANCE.getExperimentNodeRecordTimeTable_NodeMap();

		/**
		 * The meta object literal for the '{@link de.hub.clickwatch.cwdatabase.impl.EStringToExperimentNodeRecordTimeTableMapImpl <em>EString To Experiment Node Record Time Table Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.cwdatabase.impl.EStringToExperimentNodeRecordTimeTableMapImpl
		 * @see de.hub.clickwatch.cwdatabase.impl.CWDataBasePackageImpl#getEStringToExperimentNodeRecordTimeTableMap()
		 * @generated
		 */
		EClass ESTRING_TO_EXPERIMENT_NODE_RECORD_TIME_TABLE_MAP = eINSTANCE.getEStringToExperimentNodeRecordTimeTableMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTRING_TO_EXPERIMENT_NODE_RECORD_TIME_TABLE_MAP__KEY = eINSTANCE.getEStringToExperimentNodeRecordTimeTableMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESTRING_TO_EXPERIMENT_NODE_RECORD_TIME_TABLE_MAP__VALUE = eINSTANCE.getEStringToExperimentNodeRecordTimeTableMap_Value();

		/**
		 * The meta object literal for the '{@link de.hub.clickwatch.cwdatabase.impl.ELongObjectToNodeRecordDescrMapImpl <em>ELong Object To Node Record Descr Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.cwdatabase.impl.ELongObjectToNodeRecordDescrMapImpl
		 * @see de.hub.clickwatch.cwdatabase.impl.CWDataBasePackageImpl#getELongObjectToNodeRecordDescrMap()
		 * @generated
		 */
		EClass ELONG_OBJECT_TO_NODE_RECORD_DESCR_MAP = eINSTANCE.getELongObjectToNodeRecordDescrMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELONG_OBJECT_TO_NODE_RECORD_DESCR_MAP__KEY = eINSTANCE.getELongObjectToNodeRecordDescrMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELONG_OBJECT_TO_NODE_RECORD_DESCR_MAP__VALUE = eINSTANCE.getELongObjectToNodeRecordDescrMap_Value();

		/**
		 * The meta object literal for the '{@link de.hub.clickwatch.cwdatabase.impl.DataBaseStatisticsImpl <em>Data Base Statistics</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.cwdatabase.impl.DataBaseStatisticsImpl
		 * @see de.hub.clickwatch.cwdatabase.impl.CWDataBasePackageImpl#getDataBaseStatistics()
		 * @generated
		 */
		EClass DATA_BASE_STATISTICS = eINSTANCE.getDataBaseStatistics();

		/**
		 * The meta object literal for the '<em><b>Handler Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_BASE_STATISTICS__HANDLER_COUNT = eINSTANCE.getDataBaseStatistics_HandlerCount();

		/**
		 * The meta object literal for the '<em><b>Sample Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_BASE_STATISTICS__SAMPLE_COUNT = eINSTANCE.getDataBaseStatistics_SampleCount();

		/**
		 * The meta object literal for the '<em><b>Experiment Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_BASE_STATISTICS__EXPERIMENT_COUNT = eINSTANCE.getDataBaseStatistics_ExperimentCount();

		/**
		 * The meta object literal for the '{@link de.hub.clickwatch.cwdatabase.impl.NodeRecordDescrImpl <em>Node Record Descr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.cwdatabase.impl.NodeRecordDescrImpl
		 * @see de.hub.clickwatch.cwdatabase.impl.CWDataBasePackageImpl#getNodeRecordDescr()
		 * @generated
		 */
		EClass NODE_RECORD_DESCR = eINSTANCE.getNodeRecordDescr();

		/**
		 * The meta object literal for the '<em><b>Record</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_RECORD_DESCR__RECORD = eINSTANCE.getNodeRecordDescr_Record();

	}

} //CWDataBasePackage
