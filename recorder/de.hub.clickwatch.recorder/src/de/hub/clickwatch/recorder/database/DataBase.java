/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.recorder.database;

import org.eclipse.emf.common.util.EList;

import de.hub.clickwatch.model.ModelElementWithStatistics;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.recorder.database.DataBase#getRecords <em>Records</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.recorder.database.CWDataBasePackage#getDataBase()
 * @model
 * @generated
 */
public interface DataBase extends ModelElementWithStatistics {
	/**
     * Returns the value of the '<em><b>Records</b></em>' containment reference list.
     * The list contents are of type {@link de.hub.clickwatch.recorder.database.Record}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Records</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Records</em>' containment reference list.
     * @see de.hub.clickwatch.recorder.database.CWDataBasePackage#getDataBase_Records()
     * @model containment="true"
     * @generated
     */
	EList<Record> getRecords();

} // DataBase
