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
 * A representation of the model object '<em><b>Experiment Node Record Time Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.recoder.cwdatabase.ExperimentNodeRecordTimeTable#getNodeMap <em>Node Map</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.recoder.cwdatabase.CWDataBasePackage#getExperimentNodeRecordTimeTable()
 * @model
 * @generated
 */
public interface ExperimentNodeRecordTimeTable extends EObject {
	/**
	 * Returns the value of the '<em><b>Node Map</b></em>' map.
	 * The key is of type {@link java.lang.Long},
	 * and the value is of type {@link de.hub.clickwatch.recoder.cwdatabase.NodeRecordDescr},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Map</em>' map.
	 * @see de.hub.clickwatch.recoder.cwdatabase.CWDataBasePackage#getExperimentNodeRecordTimeTable_NodeMap()
	 * @model mapType="de.hub.clickwatch.recoder.cwdatabase.ELongObjectToNodeRecordDescrMap<org.eclipse.emf.ecore.ELongObject, de.hub.clickwatch.recoder.cwdatabase.NodeRecordDescr>"
	 * @generated
	 */
	EMap<Long, NodeRecordDescr> getNodeMap();

} // ExperimentNodeRecordTimeTable
