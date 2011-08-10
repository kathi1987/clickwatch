/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.analysis.results;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.analysis.results.DataSet#getEntries <em>Entries</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.analysis.results.ResultsPackage#getDataSet()
 * @model
 * @generated
 */
public interface DataSet extends EObject {
	/**
	 * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
	 * The list contents are of type {@link de.hub.clickwatch.analysis.results.DataEntry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries</em>' containment reference list.
	 * @see de.hub.clickwatch.analysis.results.ResultsPackage#getDataSet_Entries()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataEntry> getEntries();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valuesMany="true"
	 * @generated
	 */
	void addEntry(EList<Double> values);
	
	/**
	 * @generated NOT
	 */
	void add(double... values);

} // DataSet
