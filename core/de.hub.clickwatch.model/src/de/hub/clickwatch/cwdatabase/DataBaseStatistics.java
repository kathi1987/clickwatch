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
 * A representation of the model object '<em><b>Data Base Statistics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.cwdatabase.DataBaseStatistics#getHandlerCount <em>Handler Count</em>}</li>
 *   <li>{@link de.hub.clickwatch.cwdatabase.DataBaseStatistics#getSampleCount <em>Sample Count</em>}</li>
 *   <li>{@link de.hub.clickwatch.cwdatabase.DataBaseStatistics#getExperimentCount <em>Experiment Count</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.cwdatabase.CWDataBasePackage#getDataBaseStatistics()
 * @model
 * @generated
 */
public interface DataBaseStatistics extends EObject {
	/**
	 * Returns the value of the '<em><b>Handler Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Handler Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Handler Count</em>' attribute.
	 * @see #setHandlerCount(long)
	 * @see de.hub.clickwatch.cwdatabase.CWDataBasePackage#getDataBaseStatistics_HandlerCount()
	 * @model
	 * @generated
	 */
	long getHandlerCount();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.cwdatabase.DataBaseStatistics#getHandlerCount <em>Handler Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Handler Count</em>' attribute.
	 * @see #getHandlerCount()
	 * @generated
	 */
	void setHandlerCount(long value);

	/**
	 * Returns the value of the '<em><b>Sample Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sample Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sample Count</em>' attribute.
	 * @see #setSampleCount(long)
	 * @see de.hub.clickwatch.cwdatabase.CWDataBasePackage#getDataBaseStatistics_SampleCount()
	 * @model
	 * @generated
	 */
	long getSampleCount();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.cwdatabase.DataBaseStatistics#getSampleCount <em>Sample Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sample Count</em>' attribute.
	 * @see #getSampleCount()
	 * @generated
	 */
	void setSampleCount(long value);

	/**
	 * Returns the value of the '<em><b>Experiment Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Experiment Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Experiment Count</em>' attribute.
	 * @see #setExperimentCount(long)
	 * @see de.hub.clickwatch.cwdatabase.CWDataBasePackage#getDataBaseStatistics_ExperimentCount()
	 * @model
	 * @generated
	 */
	long getExperimentCount();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.cwdatabase.DataBaseStatistics#getExperimentCount <em>Experiment Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Experiment Count</em>' attribute.
	 * @see #getExperimentCount()
	 * @generated
	 */
	void setExperimentCount(long value);

} // DataBaseStatistics
