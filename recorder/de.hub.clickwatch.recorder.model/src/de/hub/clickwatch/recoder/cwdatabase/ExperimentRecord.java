/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.recoder.cwdatabase;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Experiment Record</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.recoder.cwdatabase.ExperimentRecord#getName <em>Name</em>}</li>
 *   <li>{@link de.hub.clickwatch.recoder.cwdatabase.ExperimentRecord#getNodeMap <em>Node Map</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.recoder.cwdatabase.CWDataBasePackage#getExperimentRecord()
 * @model
 * @generated
 */
public interface ExperimentRecord extends EObject {
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
	 * @see de.hub.clickwatch.recoder.cwdatabase.CWDataBasePackage#getExperimentRecord_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.recoder.cwdatabase.ExperimentRecord#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Node Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link de.hub.clickwatch.recoder.cwdatabase.ExperimentNodeRecordTimeTable},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Map</em>' map.
	 * @see de.hub.clickwatch.recoder.cwdatabase.CWDataBasePackage#getExperimentRecord_NodeMap()
	 * @model mapType="de.hub.clickwatch.recoder.cwdatabase.EStringToExperimentNodeRecordTimeTableMap<org.eclipse.emf.ecore.EString, de.hub.clickwatch.recoder.cwdatabase.ExperimentNodeRecordTimeTable>"
	 * @generated
	 */
	EMap<String, ExperimentNodeRecordTimeTable> getNodeMap();

} // ExperimentRecord