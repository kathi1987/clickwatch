/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.recoder.cwdatabase;

import de.hub.clickwatch.model.Handler;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Record</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.recoder.cwdatabase.NodeRecord#getRecords <em>Records</em>}</li>
 *   <li>{@link de.hub.clickwatch.recoder.cwdatabase.NodeRecord#getStart <em>Start</em>}</li>
 *   <li>{@link de.hub.clickwatch.recoder.cwdatabase.NodeRecord#getEnd <em>End</em>}</li>
 *   <li>{@link de.hub.clickwatch.recoder.cwdatabase.NodeRecord#getNode <em>Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.recoder.cwdatabase.CWDataBasePackage#getNodeRecord()
 * @model
 * @generated
 */
public interface NodeRecord extends EObject {
	/**
	 * Returns the value of the '<em><b>Records</b></em>' containment reference list.
	 * The list contents are of type {@link de.hub.clickwatch.model.Handler}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Records</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Records</em>' containment reference list.
	 * @see de.hub.clickwatch.recoder.cwdatabase.CWDataBasePackage#getNodeRecord_Records()
	 * @model containment="true"
	 * @generated
	 */
	EList<Handler> getRecords();

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
	 * @see de.hub.clickwatch.recoder.cwdatabase.CWDataBasePackage#getNodeRecord_Start()
	 * @model
	 * @generated
	 */
	long getStart();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.recoder.cwdatabase.NodeRecord#getStart <em>Start</em>}' attribute.
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
	 * @see de.hub.clickwatch.recoder.cwdatabase.CWDataBasePackage#getNodeRecord_End()
	 * @model
	 * @generated
	 */
	long getEnd();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.recoder.cwdatabase.NodeRecord#getEnd <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' attribute.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(long value);

	/**
	 * Returns the value of the '<em><b>Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' attribute.
	 * @see #setNode(String)
	 * @see de.hub.clickwatch.recoder.cwdatabase.CWDataBasePackage#getNodeRecord_Node()
	 * @model
	 * @generated
	 */
	String getNode();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.recoder.cwdatabase.NodeRecord#getNode <em>Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node</em>' attribute.
	 * @see #getNode()
	 * @generated
	 */
	void setNode(String value);

} // NodeRecord
