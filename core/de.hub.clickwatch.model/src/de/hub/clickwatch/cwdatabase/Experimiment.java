/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.cwdatabase;

import de.hub.clickwatch.model.Network;
import de.hub.clickwatch.model.Node;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Experimiment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.cwdatabase.Experimiment#getMetaData <em>Meta Data</em>}</li>
 *   <li>{@link de.hub.clickwatch.cwdatabase.Experimiment#getRecords <em>Records</em>}</li>
 *   <li>{@link de.hub.clickwatch.cwdatabase.Experimiment#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link de.hub.clickwatch.cwdatabase.Experimiment#getId <em>Id</em>}</li>
 *   <li>{@link de.hub.clickwatch.cwdatabase.Experimiment#getRecordURIs <em>Record UR Is</em>}</li>
 *   <li>{@link de.hub.clickwatch.cwdatabase.Experimiment#getStorageBaseFileStr <em>Storage Base File Str</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.cwdatabase.CWDataBasePackage#getExperimiment()
 * @model
 * @generated
 */
public interface Experimiment extends EObject {
	/**
	 * Returns the value of the '<em><b>Meta Data</b></em>' containment reference list.
	 * The list contents are of type {@link de.hub.clickwatch.model.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meta Data</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta Data</em>' containment reference list.
	 * @see de.hub.clickwatch.cwdatabase.CWDataBasePackage#getExperimiment_MetaData()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getMetaData();

	/**
	 * Returns the value of the '<em><b>Records</b></em>' containment reference list.
	 * The list contents are of type {@link de.hub.clickwatch.cwdatabase.NodeRecord}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Records</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Records</em>' containment reference list.
	 * @see de.hub.clickwatch.cwdatabase.CWDataBasePackage#getExperimiment_Records()
	 * @model containment="true"
	 * @generated
	 */
	EList<NodeRecord> getRecords();

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
	 * @see de.hub.clickwatch.cwdatabase.CWDataBasePackage#getExperimiment_Configuration()
	 * @model containment="true"
	 * @generated
	 */
	Network getConfiguration();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.cwdatabase.Experimiment#getConfiguration <em>Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration</em>' containment reference.
	 * @see #getConfiguration()
	 * @generated
	 */
	void setConfiguration(Network value);

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
	 * @see de.hub.clickwatch.cwdatabase.CWDataBasePackage#getExperimiment_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.cwdatabase.Experimiment#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Record UR Is</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Record UR Is</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Record UR Is</em>' attribute list.
	 * @see de.hub.clickwatch.cwdatabase.CWDataBasePackage#getExperimiment_RecordURIs()
	 * @model
	 * @generated
	 */
	EList<String> getRecordURIs();

	/**
	 * Returns the value of the '<em><b>Storage Base File Str</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Storage Base File Str</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Storage Base File Str</em>' attribute.
	 * @see #setStorageBaseFileStr(String)
	 * @see de.hub.clickwatch.cwdatabase.CWDataBasePackage#getExperimiment_StorageBaseFileStr()
	 * @model
	 * @generated
	 */
	String getStorageBaseFileStr();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.cwdatabase.Experimiment#getStorageBaseFileStr <em>Storage Base File Str</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Storage Base File Str</em>' attribute.
	 * @see #getStorageBaseFileStr()
	 * @generated
	 */
	void setStorageBaseFileStr(String value);

} // Experimiment
