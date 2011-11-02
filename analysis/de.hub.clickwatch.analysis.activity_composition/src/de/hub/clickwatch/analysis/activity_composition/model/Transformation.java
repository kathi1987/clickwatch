/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.analysis.activity_composition.model;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.analysis.activity_composition.model.Transformation#getTransformationFile <em>Transformation File</em>}</li>
 *   <li>{@link de.hub.clickwatch.analysis.activity_composition.model.Transformation#getInput <em>Input</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.analysis.activity_composition.model.ModelPackage#getTransformation()
 * @model
 * @generated
 */
public interface Transformation extends ActionNode {
	/**
	 * Returns the value of the '<em><b>Transformation File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformation File</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformation File</em>' attribute.
	 * @see #setTransformationFile(String)
	 * @see de.hub.clickwatch.analysis.activity_composition.model.ModelPackage#getTransformation_TransformationFile()
	 * @model
	 * @generated
	 */
	String getTransformationFile();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.analysis.activity_composition.model.Transformation#getTransformationFile <em>Transformation File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformation File</em>' attribute.
	 * @see #getTransformationFile()
	 * @generated
	 */
	void setTransformationFile(String value);

	/**
	 * Returns the value of the '<em><b>Input</b></em>' reference list.
	 * The list contents are of type {@link de.hub.clickwatch.analysis.activity_composition.model.InputEdge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' reference list.
	 * @see de.hub.clickwatch.analysis.activity_composition.model.ModelPackage#getTransformation_Input()
	 * @model
	 * @generated
	 */
	EList<InputEdge> getInput();

} // Transformation
