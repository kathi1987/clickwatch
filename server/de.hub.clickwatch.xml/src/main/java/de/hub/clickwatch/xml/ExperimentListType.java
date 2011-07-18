/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.xml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Experiment List Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Configuration.ExperimentListType#getExperiment <em>Experiment</em>}</li>
 * </ul>
 * </p>
 *
 * @see Configuration.ConfigurationPackage#getExperimentListType()
 * @model extendedMetaData="name='experimentListType' kind='elementOnly'"
 * @generated
 */
public interface ExperimentListType extends EObject {
	/**
	 * Returns the value of the '<em><b>Experiment</b></em>' containment reference list.
	 * The list contents are of type {@link Configuration.ExperimentType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Experiment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Experiment</em>' containment reference list.
	 * @see Configuration.ConfigurationPackage#getExperimentListType_Experiment()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='experiment' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ExperimentType> getExperiment();

} // ExperimentListType
