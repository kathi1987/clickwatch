/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package edu.hu.clickwatch.analysis.composition.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.hu.clickwatch.analysis.composition.model.Measure#getIntValue <em>Int Value</em>}</li>
 *   <li>{@link edu.hu.clickwatch.analysis.composition.model.Measure#getDoubleValue <em>Double Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.hu.clickwatch.analysis.composition.model.CompositionPackage#getMeasure()
 * @model
 * @generated
 */
public interface Measure extends EObject {
	/**
	 * Returns the value of the '<em><b>Int Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Int Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Int Value</em>' attribute.
	 * @see #setIntValue(int)
	 * @see edu.hu.clickwatch.analysis.composition.model.CompositionPackage#getMeasure_IntValue()
	 * @model
	 * @generated
	 */
	int getIntValue();

	/**
	 * Sets the value of the '{@link edu.hu.clickwatch.analysis.composition.model.Measure#getIntValue <em>Int Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Int Value</em>' attribute.
	 * @see #getIntValue()
	 * @generated
	 */
	void setIntValue(int value);

	/**
	 * Returns the value of the '<em><b>Double Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Double Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Double Value</em>' attribute.
	 * @see #setDoubleValue(double)
	 * @see edu.hu.clickwatch.analysis.composition.model.CompositionPackage#getMeasure_DoubleValue()
	 * @model
	 * @generated
	 */
	double getDoubleValue();

	/**
	 * Sets the value of the '{@link edu.hu.clickwatch.analysis.composition.model.Measure#getDoubleValue <em>Double Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Double Value</em>' attribute.
	 * @see #getDoubleValue()
	 * @generated
	 */
	void setDoubleValue(double value);

} // Measure
