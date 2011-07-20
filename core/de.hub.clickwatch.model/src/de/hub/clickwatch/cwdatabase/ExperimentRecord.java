/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.cwdatabase;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;

import de.hub.clickwatch.model.Node;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Experiment Record</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.cwdatabase.ExperimentRecord#getMetaData <em>Meta Data</em>}</li>
 *   <li>{@link de.hub.clickwatch.cwdatabase.ExperimentRecord#getName <em>Name</em>}</li>
 *   <li>{@link de.hub.clickwatch.cwdatabase.ExperimentRecord#getNodeMap <em>Node Map</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.cwdatabase.CWDataBasePackage#getExperimentRecord()
 * @model
 * @generated
 */
public interface ExperimentRecord extends EObject {
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
	 * @see de.hub.clickwatch.cwdatabase.CWDataBasePackage#getExperimentRecord_MetaData()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getMetaData();

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
	 * @see de.hub.clickwatch.cwdatabase.CWDataBasePackage#getExperimentRecord_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.cwdatabase.ExperimentRecord#getName <em>Name</em>}' attribute.
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
	 * and the value is of type {@link de.hub.clickwatch.cwdatabase.ExperimentNodeRecordTimeTable},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Map</em>' map.
	 * @see de.hub.clickwatch.cwdatabase.CWDataBasePackage#getExperimentRecord_NodeMap()
	 * @model mapType="de.hub.clickwatch.cwdatabase.EStringToExperimentNodeRecordTimeTableMap<org.eclipse.emf.ecore.EString, de.hub.clickwatch.cwdatabase.ExperimentNodeRecordTimeTable>"
	 * @generated
	 */
	EMap<String, ExperimentNodeRecordTimeTable> getNodeMap();

} // ExperimentRecord
