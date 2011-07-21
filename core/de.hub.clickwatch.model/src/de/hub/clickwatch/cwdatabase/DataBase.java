/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.cwdatabase;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.cwdatabase.DataBase#getExperiments <em>Experiments</em>}</li>
 *   <li>{@link de.hub.clickwatch.cwdatabase.DataBase#getStorageBaseFileString <em>Storage Base File String</em>}</li>
 *   <li>{@link de.hub.clickwatch.cwdatabase.DataBase#getInMemory <em>In Memory</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.cwdatabase.CWDataBasePackage#getDataBase()
 * @model
 * @generated
 */
public interface DataBase extends EObject {
	/**
	 * Returns the value of the '<em><b>Experiments</b></em>' containment reference list.
	 * The list contents are of type {@link de.hub.clickwatch.cwdatabase.ExperimentDescr}.
	 * It is bidirectional and its opposite is '{@link de.hub.clickwatch.cwdatabase.ExperimentDescr#getDataBase <em>Data Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Experiments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Experiments</em>' containment reference list.
	 * @see de.hub.clickwatch.cwdatabase.CWDataBasePackage#getDataBase_Experiments()
	 * @see de.hub.clickwatch.cwdatabase.ExperimentDescr#getDataBase
	 * @model opposite="dataBase" containment="true"
	 * @generated
	 */
	EList<ExperimentDescr> getExperiments();

	/**
	 * Returns the value of the '<em><b>Storage Base File String</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Storage Base File String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Storage Base File String</em>' attribute.
	 * @see #setStorageBaseFileString(String)
	 * @see de.hub.clickwatch.cwdatabase.CWDataBasePackage#getDataBase_StorageBaseFileString()
	 * @model default=""
	 * @generated
	 */
	String getStorageBaseFileString();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.cwdatabase.DataBase#getStorageBaseFileString <em>Storage Base File String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Storage Base File String</em>' attribute.
	 * @see #getStorageBaseFileString()
	 * @generated
	 */
	void setStorageBaseFileString(String value);

	/**
	 * Returns the value of the '<em><b>In Memory</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Memory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Memory</em>' attribute.
	 * @see #setInMemory(Boolean)
	 * @see de.hub.clickwatch.cwdatabase.CWDataBasePackage#getDataBase_InMemory()
	 * @model default="false"
	 * @generated
	 */
	Boolean getInMemory();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.cwdatabase.DataBase#getInMemory <em>In Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Memory</em>' attribute.
	 * @see #getInMemory()
	 * @generated
	 */
	void setInMemory(Boolean value);

} // DataBase
