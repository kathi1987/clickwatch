/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.recorder.database.cwdatabase;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see de.hub.clickwatch.recorder.database.cwdatabase.CWDataBaseFactory
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
	CWDataBasePackage eINSTANCE = de.hub.clickwatch.recorder.database.cwdatabase.impl.CWDataBasePackageImpl.init();

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.recorder.database.cwdatabase.impl.RecordImpl <em>Record</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.recorder.database.cwdatabase.impl.RecordImpl
	 * @see de.hub.clickwatch.recorder.database.cwdatabase.impl.CWDataBasePackageImpl#getRecord()
	 * @generated
	 */
	int RECORD = 0;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__CONFIGURATION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__NAME = 1;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__START = 2;

	/**
	 * The feature id for the '<em><b>Network Time Copy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__NETWORK_TIME_COPY = 3;

	/**
	 * The feature id for the '<em><b>Data Base</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__DATA_BASE = 4;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__DURATION = 5;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__END = 6;

	/**
	 * The feature id for the '<em><b>Statistics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__STATISTICS = 7;

	/**
	 * The feature id for the '<em><b>HBase Row Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__HBASE_ROW_MAP = 8;

	/**
	 * The feature id for the '<em><b>Meta Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__META_DATA = 9;

	/**
	 * The feature id for the '<em><b>Network Recorder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__NETWORK_RECORDER = 10;

	/**
	 * The number of structural features of the '<em>Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.recorder.database.cwdatabase.impl.DataBaseImpl <em>Data Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.recorder.database.cwdatabase.impl.DataBaseImpl
	 * @see de.hub.clickwatch.recorder.database.cwdatabase.impl.CWDataBasePackageImpl#getDataBase()
	 * @generated
	 */
	int DATA_BASE = 1;

	/**
	 * The feature id for the '<em><b>Records</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BASE__RECORDS = 0;

	/**
	 * The number of structural features of the '<em>Data Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BASE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.recorder.database.cwdatabase.impl.RecordStatisticsImpl <em>Record Statistics</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.recorder.database.cwdatabase.impl.RecordStatisticsImpl
	 * @see de.hub.clickwatch.recorder.database.cwdatabase.impl.CWDataBasePackageImpl#getRecordStatistics()
	 * @generated
	 */
	int RECORD_STATISTICS = 2;

	/**
	 * The feature id for the '<em><b>Nodes A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_STATISTICS__NODES_A = 0;

	/**
	 * The feature id for the '<em><b>Samples N</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_STATISTICS__SAMPLES_N = 1;

	/**
	 * The feature id for the '<em><b>Handlers N</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_STATISTICS__HANDLERS_N = 2;

	/**
	 * The feature id for the '<em><b>Handlers Pulled S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_STATISTICS__HANDLERS_PULLED_S = 3;

	/**
	 * The feature id for the '<em><b>Handlers R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_STATISTICS__HANDLERS_R = 4;

	/**
	 * The feature id for the '<em><b>Time A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_STATISTICS__TIME_A = 5;

	/**
	 * The feature id for the '<em><b>Time N</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_STATISTICS__TIME_N = 6;

	/**
	 * The feature id for the '<em><b>Time S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_STATISTICS__TIME_S = 7;

	/**
	 * The feature id for the '<em><b>Samples Per Second</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_STATISTICS__SAMPLES_PER_SECOND = 8;

	/**
	 * The feature id for the '<em><b>Record Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_STATISTICS__RECORD_SIZE = 9;

	/**
	 * The feature id for the '<em><b>Samples R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_STATISTICS__SAMPLES_R = 10;

	/**
	 * The feature id for the '<em><b>Bytes Request S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_STATISTICS__BYTES_REQUEST_S = 11;

	/**
	 * The feature id for the '<em><b>Time Request S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_STATISTICS__TIME_REQUEST_S = 12;

	/**
	 * The feature id for the '<em><b>Cpu Load S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_STATISTICS__CPU_LOAD_S = 13;

	/**
	 * The number of structural features of the '<em>Record Statistics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_STATISTICS_FEATURE_COUNT = 14;

	/**
	 * The meta object id for the '<em>ESummary Statistics</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.apache.commons.math.stat.descriptive.SummaryStatistics
	 * @see de.hub.clickwatch.recorder.database.cwdatabase.impl.CWDataBasePackageImpl#getESummaryStatistics()
	 * @generated
	 */
	int ESUMMARY_STATISTICS = 3;


	/**
	 * The meta object id for the '<em>HBase Row Map</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.recorder.database.cwdatabase.HBaseRowMap
	 * @see de.hub.clickwatch.recorder.database.cwdatabase.impl.CWDataBasePackageImpl#getHBaseRowMap()
	 * @generated
	 */
	int HBASE_ROW_MAP = 4;


	/**
	 * The meta object id for the '<em>Network Recorder</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.recorder.NetworkRecorder
	 * @see de.hub.clickwatch.recorder.database.cwdatabase.impl.CWDataBasePackageImpl#getNetworkRecorder()
	 * @generated
	 */
	int NETWORK_RECORDER = 5;


	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.recorder.database.cwdatabase.Record <em>Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Record</em>'.
	 * @see de.hub.clickwatch.recorder.database.cwdatabase.Record
	 * @generated
	 */
	EClass getRecord();

	/**
	 * Returns the meta object for the containment reference '{@link de.hub.clickwatch.recorder.database.cwdatabase.Record#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Configuration</em>'.
	 * @see de.hub.clickwatch.recorder.database.cwdatabase.Record#getConfiguration()
	 * @see #getRecord()
	 * @generated
	 */
	EReference getRecord_Configuration();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.recorder.database.cwdatabase.Record#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.hub.clickwatch.recorder.database.cwdatabase.Record#getName()
	 * @see #getRecord()
	 * @generated
	 */
	EAttribute getRecord_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.recorder.database.cwdatabase.Record#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see de.hub.clickwatch.recorder.database.cwdatabase.Record#getStart()
	 * @see #getRecord()
	 * @generated
	 */
	EAttribute getRecord_Start();

	/**
	 * Returns the meta object for the containment reference '{@link de.hub.clickwatch.recorder.database.cwdatabase.Record#getNetworkTimeCopy <em>Network Time Copy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Network Time Copy</em>'.
	 * @see de.hub.clickwatch.recorder.database.cwdatabase.Record#getNetworkTimeCopy()
	 * @see #getRecord()
	 * @generated
	 */
	EReference getRecord_NetworkTimeCopy();

	/**
	 * Returns the meta object for the container reference '{@link de.hub.clickwatch.recorder.database.cwdatabase.Record#getDataBase <em>Data Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Data Base</em>'.
	 * @see de.hub.clickwatch.recorder.database.cwdatabase.Record#getDataBase()
	 * @see #getRecord()
	 * @generated
	 */
	EReference getRecord_DataBase();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.recorder.database.cwdatabase.Record#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see de.hub.clickwatch.recorder.database.cwdatabase.Record#getDuration()
	 * @see #getRecord()
	 * @generated
	 */
	EAttribute getRecord_Duration();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.recorder.database.cwdatabase.Record#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see de.hub.clickwatch.recorder.database.cwdatabase.Record#getEnd()
	 * @see #getRecord()
	 * @generated
	 */
	EAttribute getRecord_End();

	/**
	 * Returns the meta object for the containment reference '{@link de.hub.clickwatch.recorder.database.cwdatabase.Record#getStatistics <em>Statistics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Statistics</em>'.
	 * @see de.hub.clickwatch.recorder.database.cwdatabase.Record#getStatistics()
	 * @see #getRecord()
	 * @generated
	 */
	EReference getRecord_Statistics();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.recorder.database.cwdatabase.Record#getHBaseRowMap <em>HBase Row Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>HBase Row Map</em>'.
	 * @see de.hub.clickwatch.recorder.database.cwdatabase.Record#getHBaseRowMap()
	 * @see #getRecord()
	 * @generated
	 */
	EAttribute getRecord_HBaseRowMap();

	/**
	 * Returns the meta object for the containment reference list '{@link de.hub.clickwatch.recorder.database.cwdatabase.Record#getMetaData <em>Meta Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Meta Data</em>'.
	 * @see de.hub.clickwatch.recorder.database.cwdatabase.Record#getMetaData()
	 * @see #getRecord()
	 * @generated
	 */
	EReference getRecord_MetaData();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.recorder.database.cwdatabase.Record#getNetworkRecorder <em>Network Recorder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Network Recorder</em>'.
	 * @see de.hub.clickwatch.recorder.database.cwdatabase.Record#getNetworkRecorder()
	 * @see #getRecord()
	 * @generated
	 */
	EAttribute getRecord_NetworkRecorder();

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.recorder.database.cwdatabase.DataBase <em>Data Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Base</em>'.
	 * @see de.hub.clickwatch.recorder.database.cwdatabase.DataBase
	 * @generated
	 */
	EClass getDataBase();

	/**
	 * Returns the meta object for the containment reference list '{@link de.hub.clickwatch.recorder.database.cwdatabase.DataBase#getRecords <em>Records</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Records</em>'.
	 * @see de.hub.clickwatch.recorder.database.cwdatabase.DataBase#getRecords()
	 * @see #getDataBase()
	 * @generated
	 */
	EReference getDataBase_Records();

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.recorder.database.cwdatabase.RecordStatistics <em>Record Statistics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Record Statistics</em>'.
	 * @see de.hub.clickwatch.recorder.database.cwdatabase.RecordStatistics
	 * @generated
	 */
	EClass getRecordStatistics();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.recorder.database.cwdatabase.RecordStatistics#getNodesA <em>Nodes A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nodes A</em>'.
	 * @see de.hub.clickwatch.recorder.database.cwdatabase.RecordStatistics#getNodesA()
	 * @see #getRecordStatistics()
	 * @generated
	 */
	EAttribute getRecordStatistics_NodesA();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.recorder.database.cwdatabase.RecordStatistics#getSamplesN <em>Samples N</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Samples N</em>'.
	 * @see de.hub.clickwatch.recorder.database.cwdatabase.RecordStatistics#getSamplesN()
	 * @see #getRecordStatistics()
	 * @generated
	 */
	EAttribute getRecordStatistics_SamplesN();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.recorder.database.cwdatabase.RecordStatistics#getHandlersN <em>Handlers N</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Handlers N</em>'.
	 * @see de.hub.clickwatch.recorder.database.cwdatabase.RecordStatistics#getHandlersN()
	 * @see #getRecordStatistics()
	 * @generated
	 */
	EAttribute getRecordStatistics_HandlersN();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.recorder.database.cwdatabase.RecordStatistics#getHandlersPulledS <em>Handlers Pulled S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Handlers Pulled S</em>'.
	 * @see de.hub.clickwatch.recorder.database.cwdatabase.RecordStatistics#getHandlersPulledS()
	 * @see #getRecordStatistics()
	 * @generated
	 */
	EAttribute getRecordStatistics_HandlersPulledS();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.recorder.database.cwdatabase.RecordStatistics#getHandlersR <em>Handlers R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Handlers R</em>'.
	 * @see de.hub.clickwatch.recorder.database.cwdatabase.RecordStatistics#getHandlersR()
	 * @see #getRecordStatistics()
	 * @generated
	 */
	EAttribute getRecordStatistics_HandlersR();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.recorder.database.cwdatabase.RecordStatistics#getTimeA <em>Time A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time A</em>'.
	 * @see de.hub.clickwatch.recorder.database.cwdatabase.RecordStatistics#getTimeA()
	 * @see #getRecordStatistics()
	 * @generated
	 */
	EAttribute getRecordStatistics_TimeA();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.recorder.database.cwdatabase.RecordStatistics#getTimeN <em>Time N</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time N</em>'.
	 * @see de.hub.clickwatch.recorder.database.cwdatabase.RecordStatistics#getTimeN()
	 * @see #getRecordStatistics()
	 * @generated
	 */
	EAttribute getRecordStatistics_TimeN();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.recorder.database.cwdatabase.RecordStatistics#getTimeS <em>Time S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time S</em>'.
	 * @see de.hub.clickwatch.recorder.database.cwdatabase.RecordStatistics#getTimeS()
	 * @see #getRecordStatistics()
	 * @generated
	 */
	EAttribute getRecordStatistics_TimeS();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.recorder.database.cwdatabase.RecordStatistics#getSamplesPerSecond <em>Samples Per Second</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Samples Per Second</em>'.
	 * @see de.hub.clickwatch.recorder.database.cwdatabase.RecordStatistics#getSamplesPerSecond()
	 * @see #getRecordStatistics()
	 * @generated
	 */
	EAttribute getRecordStatistics_SamplesPerSecond();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.recorder.database.cwdatabase.RecordStatistics#getRecordSize <em>Record Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Record Size</em>'.
	 * @see de.hub.clickwatch.recorder.database.cwdatabase.RecordStatistics#getRecordSize()
	 * @see #getRecordStatistics()
	 * @generated
	 */
	EAttribute getRecordStatistics_RecordSize();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.recorder.database.cwdatabase.RecordStatistics#getSamplesR <em>Samples R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Samples R</em>'.
	 * @see de.hub.clickwatch.recorder.database.cwdatabase.RecordStatistics#getSamplesR()
	 * @see #getRecordStatistics()
	 * @generated
	 */
	EAttribute getRecordStatistics_SamplesR();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.recorder.database.cwdatabase.RecordStatistics#getBytesRequestS <em>Bytes Request S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bytes Request S</em>'.
	 * @see de.hub.clickwatch.recorder.database.cwdatabase.RecordStatistics#getBytesRequestS()
	 * @see #getRecordStatistics()
	 * @generated
	 */
	EAttribute getRecordStatistics_BytesRequestS();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.recorder.database.cwdatabase.RecordStatistics#getTimeRequestS <em>Time Request S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Request S</em>'.
	 * @see de.hub.clickwatch.recorder.database.cwdatabase.RecordStatistics#getTimeRequestS()
	 * @see #getRecordStatistics()
	 * @generated
	 */
	EAttribute getRecordStatistics_TimeRequestS();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.recorder.database.cwdatabase.RecordStatistics#getCpuLoadS <em>Cpu Load S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cpu Load S</em>'.
	 * @see de.hub.clickwatch.recorder.database.cwdatabase.RecordStatistics#getCpuLoadS()
	 * @see #getRecordStatistics()
	 * @generated
	 */
	EAttribute getRecordStatistics_CpuLoadS();

	/**
	 * Returns the meta object for data type '{@link org.apache.commons.math.stat.descriptive.SummaryStatistics <em>ESummary Statistics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ESummary Statistics</em>'.
	 * @see org.apache.commons.math.stat.descriptive.SummaryStatistics
	 * @model instanceClass="org.apache.commons.math.stat.descriptive.SummaryStatistics"
	 * @generated
	 */
	EDataType getESummaryStatistics();

	/**
	 * Returns the meta object for data type '{@link de.hub.clickwatch.recorder.database.cwdatabase.HBaseRowMap <em>HBase Row Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>HBase Row Map</em>'.
	 * @see de.hub.clickwatch.recorder.database.cwdatabase.HBaseRowMap
	 * @model instanceClass="de.hub.clickwatch.recorder.database.cwdatabase.HBaseRowMap"
	 * @generated
	 */
	EDataType getHBaseRowMap();

	/**
	 * Returns the meta object for data type '{@link de.hub.clickwatch.recorder.NetworkRecorder <em>Network Recorder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Network Recorder</em>'.
	 * @see de.hub.clickwatch.recorder.NetworkRecorder
	 * @model instanceClass="de.hub.clickwatch.recorder.NetworkRecorder" serializeable="false"
	 * @generated
	 */
	EDataType getNetworkRecorder();

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
		 * The meta object literal for the '{@link de.hub.clickwatch.recorder.database.cwdatabase.impl.RecordImpl <em>Record</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.recorder.database.cwdatabase.impl.RecordImpl
		 * @see de.hub.clickwatch.recorder.database.cwdatabase.impl.CWDataBasePackageImpl#getRecord()
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
		 * The meta object literal for the '<em><b>Data Base</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECORD__DATA_BASE = eINSTANCE.getRecord_DataBase();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECORD__DURATION = eINSTANCE.getRecord_Duration();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECORD__END = eINSTANCE.getRecord_End();

		/**
		 * The meta object literal for the '<em><b>Statistics</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECORD__STATISTICS = eINSTANCE.getRecord_Statistics();

		/**
		 * The meta object literal for the '<em><b>HBase Row Map</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECORD__HBASE_ROW_MAP = eINSTANCE.getRecord_HBaseRowMap();

		/**
		 * The meta object literal for the '<em><b>Meta Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECORD__META_DATA = eINSTANCE.getRecord_MetaData();

		/**
		 * The meta object literal for the '<em><b>Network Recorder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECORD__NETWORK_RECORDER = eINSTANCE.getRecord_NetworkRecorder();

		/**
		 * The meta object literal for the '{@link de.hub.clickwatch.recorder.database.cwdatabase.impl.DataBaseImpl <em>Data Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.recorder.database.cwdatabase.impl.DataBaseImpl
		 * @see de.hub.clickwatch.recorder.database.cwdatabase.impl.CWDataBasePackageImpl#getDataBase()
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
		 * The meta object literal for the '{@link de.hub.clickwatch.recorder.database.cwdatabase.impl.RecordStatisticsImpl <em>Record Statistics</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.recorder.database.cwdatabase.impl.RecordStatisticsImpl
		 * @see de.hub.clickwatch.recorder.database.cwdatabase.impl.CWDataBasePackageImpl#getRecordStatistics()
		 * @generated
		 */
		EClass RECORD_STATISTICS = eINSTANCE.getRecordStatistics();

		/**
		 * The meta object literal for the '<em><b>Nodes A</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECORD_STATISTICS__NODES_A = eINSTANCE.getRecordStatistics_NodesA();

		/**
		 * The meta object literal for the '<em><b>Samples N</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECORD_STATISTICS__SAMPLES_N = eINSTANCE.getRecordStatistics_SamplesN();

		/**
		 * The meta object literal for the '<em><b>Handlers N</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECORD_STATISTICS__HANDLERS_N = eINSTANCE.getRecordStatistics_HandlersN();

		/**
		 * The meta object literal for the '<em><b>Handlers Pulled S</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECORD_STATISTICS__HANDLERS_PULLED_S = eINSTANCE.getRecordStatistics_HandlersPulledS();

		/**
		 * The meta object literal for the '<em><b>Handlers R</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECORD_STATISTICS__HANDLERS_R = eINSTANCE.getRecordStatistics_HandlersR();

		/**
		 * The meta object literal for the '<em><b>Time A</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECORD_STATISTICS__TIME_A = eINSTANCE.getRecordStatistics_TimeA();

		/**
		 * The meta object literal for the '<em><b>Time N</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECORD_STATISTICS__TIME_N = eINSTANCE.getRecordStatistics_TimeN();

		/**
		 * The meta object literal for the '<em><b>Time S</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECORD_STATISTICS__TIME_S = eINSTANCE.getRecordStatistics_TimeS();

		/**
		 * The meta object literal for the '<em><b>Samples Per Second</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECORD_STATISTICS__SAMPLES_PER_SECOND = eINSTANCE.getRecordStatistics_SamplesPerSecond();

		/**
		 * The meta object literal for the '<em><b>Record Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECORD_STATISTICS__RECORD_SIZE = eINSTANCE.getRecordStatistics_RecordSize();

		/**
		 * The meta object literal for the '<em><b>Samples R</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECORD_STATISTICS__SAMPLES_R = eINSTANCE.getRecordStatistics_SamplesR();

		/**
		 * The meta object literal for the '<em><b>Bytes Request S</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECORD_STATISTICS__BYTES_REQUEST_S = eINSTANCE.getRecordStatistics_BytesRequestS();

		/**
		 * The meta object literal for the '<em><b>Time Request S</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECORD_STATISTICS__TIME_REQUEST_S = eINSTANCE.getRecordStatistics_TimeRequestS();

		/**
		 * The meta object literal for the '<em><b>Cpu Load S</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECORD_STATISTICS__CPU_LOAD_S = eINSTANCE.getRecordStatistics_CpuLoadS();

		/**
		 * The meta object literal for the '<em>ESummary Statistics</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.apache.commons.math.stat.descriptive.SummaryStatistics
		 * @see de.hub.clickwatch.recorder.database.cwdatabase.impl.CWDataBasePackageImpl#getESummaryStatistics()
		 * @generated
		 */
		EDataType ESUMMARY_STATISTICS = eINSTANCE.getESummaryStatistics();

		/**
		 * The meta object literal for the '<em>HBase Row Map</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.recorder.database.cwdatabase.HBaseRowMap
		 * @see de.hub.clickwatch.recorder.database.cwdatabase.impl.CWDataBasePackageImpl#getHBaseRowMap()
		 * @generated
		 */
		EDataType HBASE_ROW_MAP = eINSTANCE.getHBaseRowMap();

		/**
		 * The meta object literal for the '<em>Network Recorder</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.recorder.NetworkRecorder
		 * @see de.hub.clickwatch.recorder.database.cwdatabase.impl.CWDataBasePackageImpl#getNetworkRecorder()
		 * @generated
		 */
		EDataType NETWORK_RECORDER = eINSTANCE.getNetworkRecorder();

	}

} //CWDataBasePackage
