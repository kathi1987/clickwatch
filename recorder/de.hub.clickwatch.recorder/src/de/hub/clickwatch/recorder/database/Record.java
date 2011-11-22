/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.recorder.database;

import de.hub.clickwatch.analysis.results.Results;
import de.hub.clickwatch.model.ModelElementWithStatistics;
import de.hub.clickwatch.model.Network;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Record</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.recorder.database.Record#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link de.hub.clickwatch.recorder.database.Record#getName <em>Name</em>}</li>
 *   <li>{@link de.hub.clickwatch.recorder.database.Record#getStart <em>Start</em>}</li>
 *   <li>{@link de.hub.clickwatch.recorder.database.Record#getEnd <em>End</em>}</li>
 *   <li>{@link de.hub.clickwatch.recorder.database.Record#getHBaseRowMap <em>HBase Row Map</em>}</li>
 *   <li>{@link de.hub.clickwatch.recorder.database.Record#getResults <em>Results</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.recorder.database.CWDataBasePackage#getRecord()
 * @model
 * @generated
 */
public interface Record extends ModelElementWithStatistics {
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
     * @see de.hub.clickwatch.recorder.database.CWDataBasePackage#getRecord_Configuration()
     * @model containment="true"
     * @generated
     */
	Network getConfiguration();

	/**
     * Sets the value of the '{@link de.hub.clickwatch.recorder.database.Record#getConfiguration <em>Configuration</em>}' containment reference.
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
     * @see de.hub.clickwatch.recorder.database.CWDataBasePackage#getRecord_Name()
     * @model
     * @generated
     */
	String getName();

	/**
     * Sets the value of the '{@link de.hub.clickwatch.recorder.database.Record#getName <em>Name</em>}' attribute.
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
     * @see de.hub.clickwatch.recorder.database.CWDataBasePackage#getRecord_Start()
     * @model
     * @generated
     */
	long getStart();

	/**
     * Sets the value of the '{@link de.hub.clickwatch.recorder.database.Record#getStart <em>Start</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Start</em>' attribute.
     * @see #getStart()
     * @generated
     */
	void setStart(long value);

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
     * @see de.hub.clickwatch.recorder.database.CWDataBasePackage#getRecord_End()
     * @model
     * @generated
     */
	long getEnd();

	/**
     * Sets the value of the '{@link de.hub.clickwatch.recorder.database.Record#getEnd <em>End</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>End</em>' attribute.
     * @see #getEnd()
     * @generated
     */
	void setEnd(long value);

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
     * @see de.hub.clickwatch.recorder.database.CWDataBasePackage#getRecord_HBaseRowMap()
     * @model dataType="de.hub.clickwatch.recorder.database.HBaseRowMap"
     * @generated
     */
	HBaseRowMap getHBaseRowMap();

	/**
     * Sets the value of the '{@link de.hub.clickwatch.recorder.database.Record#getHBaseRowMap <em>HBase Row Map</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>HBase Row Map</em>' attribute.
     * @see #getHBaseRowMap()
     * @generated
     */
	void setHBaseRowMap(HBaseRowMap value);

    /**
     * Returns the value of the '<em><b>Results</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Results</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Results</em>' containment reference.
     * @see #setResults(Results)
     * @see de.hub.clickwatch.recorder.database.CWDataBasePackage#getRecord_Results()
     * @model containment="true"
     * @generated
     */
    Results getResults();

    /**
     * Sets the value of the '{@link de.hub.clickwatch.recorder.database.Record#getResults <em>Results</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Results</em>' containment reference.
     * @see #getResults()
     * @generated
     */
    void setResults(Results value);

} // Record
