/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package edu.hu.clickwatch.analysis.composition.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.hu.clickwatch.analysis.composition.model.Transformation#getTransformationUri <em>Transformation Uri</em>}</li>
 *   <li>{@link edu.hu.clickwatch.analysis.composition.model.Transformation#getTransformationFunction <em>Transformation Function</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.hu.clickwatch.analysis.composition.model.CompositionPackage#getTransformation()
 * @model
 * @generated
 */
public interface Transformation extends Edge {

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
	 * @see edu.hu.clickwatch.analysis.composition.model.CompositionPackage#getTransformation_TransformationUri()
	 * @model
	 * @generated
	 */
	String getTransformationUri();

	/**
	 * Sets the value of the '{@link edu.hu.clickwatch.analysis.composition.model.Transformation#getTransformationUri <em>Transformation Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformation Uri</em>' attribute.
	 * @see #getTransformationUri()
	 * @generated
	 */
	void setTransformationUri(String value);

	/**
	 * Returns the value of the '<em><b>Transformation Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformation Function</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformation Function</em>' attribute.
	 * @see #setTransformationFunction(String)
	 * @see edu.hu.clickwatch.analysis.composition.model.CompositionPackage#getTransformation_TransformationFunction()
	 * @model
	 * @generated
	 */
	String getTransformationFunction();

	/**
	 * Sets the value of the '{@link edu.hu.clickwatch.analysis.composition.model.Transformation#getTransformationFunction <em>Transformation Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformation Function</em>' attribute.
	 * @see #getTransformationFunction()
	 * @generated
	 */
	void setTransformationFunction(String value);
} // Transformation
