/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.recoder.cwdatabase;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import de.hub.clickwatch.model.Network;
import de.hub.clickwatch.model.Node;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Experiment Descr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.recoder.cwdatabase.ExperimentDescr#getNetwork <em>Network</em>}</li>
 *   <li>{@link de.hub.clickwatch.recoder.cwdatabase.ExperimentDescr#getName <em>Name</em>}</li>
 *   <li>{@link de.hub.clickwatch.recoder.cwdatabase.ExperimentDescr#getDescription <em>Description</em>}</li>
 *   <li>{@link de.hub.clickwatch.recoder.cwdatabase.ExperimentDescr#getStart <em>Start</em>}</li>
 *   <li>{@link de.hub.clickwatch.recoder.cwdatabase.ExperimentDescr#getRecord <em>Record</em>}</li>
 *   <li>{@link de.hub.clickwatch.recoder.cwdatabase.ExperimentDescr#getNetworkTimeCopy <em>Network Time Copy</em>}</li>
 *   <li>{@link de.hub.clickwatch.recoder.cwdatabase.ExperimentDescr#getDataBase <em>Data Base</em>}</li>
 *   <li>{@link de.hub.clickwatch.recoder.cwdatabase.ExperimentDescr#getDuration <em>Duration</em>}</li>
 *   <li>{@link de.hub.clickwatch.recoder.cwdatabase.ExperimentDescr#getEnd <em>End</em>}</li>
 *   <li>{@link de.hub.clickwatch.recoder.cwdatabase.ExperimentDescr#getStatistics <em>Statistics</em>}</li>
 *   <li>{@link de.hub.clickwatch.recoder.cwdatabase.ExperimentDescr#getHBaseRowMap <em>HBase Row Map</em>}</li>
 *   <li>{@link de.hub.clickwatch.recoder.cwdatabase.ExperimentDescr#getMetaData <em>Meta Data</em>}</li>
 *   <li>{@link de.hub.clickwatch.recoder.cwdatabase.ExperimentDescr#getHbaseRootDir <em>Hbase Root Dir</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.recoder.cwdatabase.CWDataBasePackage#getExperimentDescr()
 * @model
 * @generated
 */
public interface ExperimentDescr extends EObject {
	/**
	 * Returns the value of the '<em><b>Network</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Network</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network</em>' containment reference.
	 * @see #setNetwork(Network)
	 * @see de.hub.clickwatch.recoder.cwdatabase.CWDataBasePackage#getExperimentDescr_Network()
	 * @model containment="true"
	 * @generated
	 */
	Network getNetwork();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.recoder.cwdatabase.ExperimentDescr#getNetwork <em>Network</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network</em>' containment reference.
	 * @see #getNetwork()
	 * @generated
	 */
	void setNetwork(Network value);

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
	 * @see de.hub.clickwatch.recoder.cwdatabase.CWDataBasePackage#getExperimentDescr_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.recoder.cwdatabase.ExperimentDescr#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see de.hub.clickwatch.recoder.cwdatabase.CWDataBasePackage#getExperimentDescr_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.recoder.cwdatabase.ExperimentDescr#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

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
	 * @see de.hub.clickwatch.recoder.cwdatabase.CWDataBasePackage#getExperimentDescr_Start()
	 * @model
	 * @generated
	 */
	long getStart();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.recoder.cwdatabase.ExperimentDescr#getStart <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' attribute.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(long value);

	/**
	 * Returns the value of the '<em><b>Record</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Record</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Record</em>' reference.
	 * @see #setRecord(ExperimentRecord)
	 * @see de.hub.clickwatch.recoder.cwdatabase.CWDataBasePackage#getExperimentDescr_Record()
	 * @model
	 * @generated
	 */
	ExperimentRecord getRecord();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.recoder.cwdatabase.ExperimentDescr#getRecord <em>Record</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Record</em>' reference.
	 * @see #getRecord()
	 * @generated
	 */
	void setRecord(ExperimentRecord value);

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
	 * @see de.hub.clickwatch.recoder.cwdatabase.CWDataBasePackage#getExperimentDescr_NetworkTimeCopy()
	 * @model containment="true" transient="true"
	 * @generated
	 */
	Network getNetworkTimeCopy();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.recoder.cwdatabase.ExperimentDescr#getNetworkTimeCopy <em>Network Time Copy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network Time Copy</em>' containment reference.
	 * @see #getNetworkTimeCopy()
	 * @generated
	 */
	void setNetworkTimeCopy(Network value);

	/**
	 * Returns the value of the '<em><b>Data Base</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.hub.clickwatch.recoder.cwdatabase.DataBase#getExperiments <em>Experiments</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Base</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Base</em>' container reference.
	 * @see #setDataBase(DataBase)
	 * @see de.hub.clickwatch.recoder.cwdatabase.CWDataBasePackage#getExperimentDescr_DataBase()
	 * @see de.hub.clickwatch.recoder.cwdatabase.DataBase#getExperiments
	 * @model opposite="experiments" transient="false"
	 * @generated
	 */
	DataBase getDataBase();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.recoder.cwdatabase.ExperimentDescr#getDataBase <em>Data Base</em>}' container reference.
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
	 * @see de.hub.clickwatch.recoder.cwdatabase.CWDataBasePackage#getExperimentDescr_Duration()
	 * @model
	 * @generated
	 */
	long getDuration();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.recoder.cwdatabase.ExperimentDescr#getDuration <em>Duration</em>}' attribute.
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
	 * @see de.hub.clickwatch.recoder.cwdatabase.CWDataBasePackage#getExperimentDescr_End()
	 * @model
	 * @generated
	 */
	long getEnd();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.recoder.cwdatabase.ExperimentDescr#getEnd <em>End</em>}' attribute.
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
	 * @see #setStatistics(ExperimentStatistics)
	 * @see de.hub.clickwatch.recoder.cwdatabase.CWDataBasePackage#getExperimentDescr_Statistics()
	 * @model containment="true"
	 * @generated
	 */
	ExperimentStatistics getStatistics();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.recoder.cwdatabase.ExperimentDescr#getStatistics <em>Statistics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statistics</em>' containment reference.
	 * @see #getStatistics()
	 * @generated
	 */
	void setStatistics(ExperimentStatistics value);

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
	 * @see de.hub.clickwatch.recoder.cwdatabase.CWDataBasePackage#getExperimentDescr_HBaseRowMap()
	 * @model dataType="de.hub.clickwatch.recoder.cwdatabase.HBaseRowMap"
	 * @generated
	 */
	HBaseRowMap getHBaseRowMap();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.recoder.cwdatabase.ExperimentDescr#getHBaseRowMap <em>HBase Row Map</em>}' attribute.
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
	 * @see de.hub.clickwatch.recoder.cwdatabase.CWDataBasePackage#getExperimentDescr_MetaData()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getMetaData();

	/**
	 * Returns the value of the '<em><b>Hbase Root Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hbase Root Dir</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hbase Root Dir</em>' attribute.
	 * @see #setHbaseRootDir(String)
	 * @see de.hub.clickwatch.recoder.cwdatabase.CWDataBasePackage#getExperimentDescr_HbaseRootDir()
	 * @model
	 * @generated
	 */
	String getHbaseRootDir();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.recoder.cwdatabase.ExperimentDescr#getHbaseRootDir <em>Hbase Root Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hbase Root Dir</em>' attribute.
	 * @see #getHbaseRootDir()
	 * @generated
	 */
	void setHbaseRootDir(String value);

} // ExperimentDescr
