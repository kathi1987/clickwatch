/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.recorder.database.cwdatabase;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import de.hub.clickwatch.model.Network;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.recorder.NetworkRecorder;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Record</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.recorder.database.cwdatabase.Record#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link de.hub.clickwatch.recorder.database.cwdatabase.Record#getName <em>Name</em>}</li>
 *   <li>{@link de.hub.clickwatch.recorder.database.cwdatabase.Record#getStart <em>Start</em>}</li>
 *   <li>{@link de.hub.clickwatch.recorder.database.cwdatabase.Record#getNetworkTimeCopy <em>Network Time Copy</em>}</li>
 *   <li>{@link de.hub.clickwatch.recorder.database.cwdatabase.Record#getDataBase <em>Data Base</em>}</li>
 *   <li>{@link de.hub.clickwatch.recorder.database.cwdatabase.Record#getDuration <em>Duration</em>}</li>
 *   <li>{@link de.hub.clickwatch.recorder.database.cwdatabase.Record#getEnd <em>End</em>}</li>
 *   <li>{@link de.hub.clickwatch.recorder.database.cwdatabase.Record#getStatistics <em>Statistics</em>}</li>
 *   <li>{@link de.hub.clickwatch.recorder.database.cwdatabase.Record#getHBaseRowMap <em>HBase Row Map</em>}</li>
 *   <li>{@link de.hub.clickwatch.recorder.database.cwdatabase.Record#getMetaData <em>Meta Data</em>}</li>
 *   <li>{@link de.hub.clickwatch.recorder.database.cwdatabase.Record#getNetworkRecorder <em>Network Recorder</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.recorder.database.cwdatabase.CWDataBasePackage#getRecord()
 * @model
 * @generated
 */
public interface Record extends EObject {
	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration</em>' containment reference.
	 * @see #setConfiguration(Network)
	 * @see de.hub.clickwatch.recorder.database.cwdatabase.CWDataBasePackage#getRecord_Configuration()
	 * @model containment="true"
	 * @generated
	 */
	Network getConfiguration();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.recorder.database.cwdatabase.Record#getConfiguration <em>Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration</em>' containment reference.
	 * @see #getConfiguration()
	 * @generated
	 */
	void setConfiguration(Network value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.hub.clickwatch.recorder.database.cwdatabase.CWDataBasePackage#getRecord_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.recorder.database.cwdatabase.Record#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' attribute.
	 * @see #setStart(long)
	 * @see de.hub.clickwatch.recorder.database.cwdatabase.CWDataBasePackage#getRecord_Start()
	 * @model
	 * @generated
	 */
	long getStart();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.recorder.database.cwdatabase.Record#getStart <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' attribute.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(long value);

	/**
	 * Returns the value of the '<em><b>Network Time Copy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Network Time Copy</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network Time Copy</em>' containment reference.
	 * @see #setNetworkTimeCopy(Network)
	 * @see de.hub.clickwatch.recorder.database.cwdatabase.CWDataBasePackage#getRecord_NetworkTimeCopy()
	 * @model containment="true"
	 * @generated
	 */
	Network getNetworkTimeCopy();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.recorder.database.cwdatabase.Record#getNetworkTimeCopy <em>Network Time Copy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network Time Copy</em>' containment reference.
	 * @see #getNetworkTimeCopy()
	 * @generated
	 */
	void setNetworkTimeCopy(Network value);

	/**
	 * Returns the value of the '<em><b>Data Base</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.hub.clickwatch.recorder.database.cwdatabase.DataBase#getRecords <em>Records</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Base</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Base</em>' container reference.
	 * @see #setDataBase(DataBase)
	 * @see de.hub.clickwatch.recorder.database.cwdatabase.CWDataBasePackage#getRecord_DataBase()
	 * @see de.hub.clickwatch.recorder.database.cwdatabase.DataBase#getRecords
	 * @model opposite="records" transient="false"
	 * @generated
	 */
	DataBase getDataBase();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.recorder.database.cwdatabase.Record#getDataBase <em>Data Base</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Base</em>' container reference.
	 * @see #getDataBase()
	 * @generated
	 */
	void setDataBase(DataBase value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(long)
	 * @see de.hub.clickwatch.recorder.database.cwdatabase.CWDataBasePackage#getRecord_Duration()
	 * @model
	 * @generated
	 */
	long getDuration();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.recorder.database.cwdatabase.Record#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(long value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' attribute.
	 * @see #setEnd(long)
	 * @see de.hub.clickwatch.recorder.database.cwdatabase.CWDataBasePackage#getRecord_End()
	 * @model
	 * @generated
	 */
	long getEnd();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.recorder.database.cwdatabase.Record#getEnd <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' attribute.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(long value);

	/**
	 * Returns the value of the '<em><b>Statistics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statistics</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statistics</em>' containment reference.
	 * @see #setStatistics(RecordStatistics)
	 * @see de.hub.clickwatch.recorder.database.cwdatabase.CWDataBasePackage#getRecord_Statistics()
	 * @model containment="true"
	 * @generated
	 */
	RecordStatistics getStatistics();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.recorder.database.cwdatabase.Record#getStatistics <em>Statistics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statistics</em>' containment reference.
	 * @see #getStatistics()
	 * @generated
	 */
	void setStatistics(RecordStatistics value);

	/**
	 * Returns the value of the '<em><b>HBase Row Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>HBase Row Map</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HBase Row Map</em>' attribute.
	 * @see #setHBaseRowMap(HBaseRowMap)
	 * @see de.hub.clickwatch.recorder.database.cwdatabase.CWDataBasePackage#getRecord_HBaseRowMap()
	 * @model dataType="de.hub.clickwatch.recorder.database.cwdatabase.HBaseRowMap"
	 * @generated
	 */
	HBaseRowMap getHBaseRowMap();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.recorder.database.cwdatabase.Record#getHBaseRowMap <em>HBase Row Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HBase Row Map</em>' attribute.
	 * @see #getHBaseRowMap()
	 * @generated
	 */
	void setHBaseRowMap(HBaseRowMap value);

	/**
	 * Returns the value of the '<em><b>Meta Data</b></em>' containment reference list.
	 * The list contents are of type {@link de.hub.clickwatch.model.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meta Data</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta Data</em>' containment reference list.
	 * @see de.hub.clickwatch.recorder.database.cwdatabase.CWDataBasePackage#getRecord_MetaData()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getMetaData();

	/**
	 * Returns the value of the '<em><b>Network Recorder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Network Recorder</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network Recorder</em>' attribute.
	 * @see #setNetworkRecorder(NetworkRecorder)
	 * @see de.hub.clickwatch.recorder.database.cwdatabase.CWDataBasePackage#getRecord_NetworkRecorder()
	 * @model dataType="de.hub.clickwatch.recorder.database.cwdatabase.NetworkRecorder" transient="true"
	 * @generated
	 */
	NetworkRecorder getNetworkRecorder();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.recorder.database.cwdatabase.Record#getNetworkRecorder <em>Network Recorder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network Recorder</em>' attribute.
	 * @see #getNetworkRecorder()
	 * @generated
	 */
	void setNetworkRecorder(NetworkRecorder value);

} // Record
