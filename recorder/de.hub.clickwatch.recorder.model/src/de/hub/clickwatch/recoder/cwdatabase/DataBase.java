/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.recoder.cwdatabase;

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
 *   <li>{@link de.hub.clickwatch.recoder.cwdatabase.DataBase#getRecords <em>Records</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.recoder.cwdatabase.CWDataBasePackage#getDataBase()
 * @model
 * @generated
 */
public interface DataBase extends EObject {
	/**
	 * Returns the value of the '<em><b>Records</b></em>' containment reference list.
	 * The list contents are of type {@link de.hub.clickwatch.recoder.cwdatabase.Record}.
	 * It is bidirectional and its opposite is '{@link de.hub.clickwatch.recoder.cwdatabase.Record#getDataBase <em>Data Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Records</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Records</em>' containment reference list.
	 * @see de.hub.clickwatch.recoder.cwdatabase.CWDataBasePackage#getDataBase_Records()
	 * @see de.hub.clickwatch.recoder.cwdatabase.Record#getDataBase
	 * @model opposite="dataBase" containment="true"
	 * @generated
	 */
	EList<Record> getRecords();

} // DataBase
