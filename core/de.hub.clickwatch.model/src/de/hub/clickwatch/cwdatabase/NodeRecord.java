/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.cwdatabase;

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
 *   <li>{@link de.hub.clickwatch.cwdatabase.NodeRecord#getRecords <em>Records</em>}</li>
 *   <li>{@link de.hub.clickwatch.cwdatabase.NodeRecord#getKey <em>Key</em>}</li>
 *   <li>{@link de.hub.clickwatch.cwdatabase.NodeRecord#getStart <em>Start</em>}</li>
 *   <li>{@link de.hub.clickwatch.cwdatabase.NodeRecord#getStop <em>Stop</em>}</li>
 *   <li>{@link de.hub.clickwatch.cwdatabase.NodeRecord#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.cwdatabase.CWDataBasePackage#getNodeRecord()
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
	 * @see de.hub.clickwatch.cwdatabase.CWDataBasePackage#getNodeRecord_Records()
	 * @model containment="true"
	 * @generated
	 */
	EList<Handler> getRecords();

	/**
	 * Returns the value of the '<em><b>Key</b></em>' reference list.
	 * The list contents are of type {@link de.hub.clickwatch.model.Handler}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' reference list.
	 * @see de.hub.clickwatch.cwdatabase.CWDataBasePackage#getNodeRecord_Key()
	 * @model
	 * @generated
	 */
	EList<Handler> getKey();

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
	 * @see de.hub.clickwatch.cwdatabase.CWDataBasePackage#getNodeRecord_Start()
	 * @model
	 * @generated
	 */
	long getStart();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.cwdatabase.NodeRecord#getStart <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' attribute.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(long value);

	/**
	 * Returns the value of the '<em><b>Stop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stop</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stop</em>' attribute.
	 * @see #setStop(long)
	 * @see de.hub.clickwatch.cwdatabase.CWDataBasePackage#getNodeRecord_Stop()
	 * @model
	 * @generated
	 */
	long getStop();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.cwdatabase.NodeRecord#getStop <em>Stop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stop</em>' attribute.
	 * @see #getStop()
	 * @generated
	 */
	void setStop(long value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see de.hub.clickwatch.cwdatabase.CWDataBasePackage#getNodeRecord_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.cwdatabase.NodeRecord#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // NodeRecord
