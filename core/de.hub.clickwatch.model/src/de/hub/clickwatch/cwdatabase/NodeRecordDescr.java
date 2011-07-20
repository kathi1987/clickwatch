/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.cwdatabase;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Record Descr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.cwdatabase.NodeRecordDescr#getRecord <em>Record</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.cwdatabase.CWDataBasePackage#getNodeRecordDescr()
 * @model
 * @generated
 */
public interface NodeRecordDescr extends EObject {
	/**
	 * Returns the value of the '<em><b>Record</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Record</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Record</em>' reference.
	 * @see #setRecord(NodeRecord)
	 * @see de.hub.clickwatch.cwdatabase.CWDataBasePackage#getNodeRecordDescr_Record()
	 * @model
	 * @generated
	 */
	NodeRecord getRecord();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.cwdatabase.NodeRecordDescr#getRecord <em>Record</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Record</em>' reference.
	 * @see #getRecord()
	 * @generated
	 */
	void setRecord(NodeRecord value);

} // NodeRecordDescr
