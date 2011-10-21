/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.analysis.activity_composition.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.analysis.activity_composition.model.Transformation#getTransformationUri <em>Transformation Uri</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.analysis.activity_composition.model.ModelPackage#getTransformation()
 * @model
 * @generated
 */
public interface Transformation extends ActionNode {
	/**
	 * Returns the value of the '<em><b>Transformation Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformation Uri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformation Uri</em>' attribute.
	 * @see #setTransformationUri(String)
	 * @see de.hub.clickwatch.analysis.activity_composition.model.ModelPackage#getTransformation_TransformationUri()
	 * @model
	 * @generated
	 */
	String getTransformationUri();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.analysis.activity_composition.model.Transformation#getTransformationUri <em>Transformation Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformation Uri</em>' attribute.
	 * @see #getTransformationUri()
	 * @generated
	 */
	void setTransformationUri(String value);

} // Transformation
