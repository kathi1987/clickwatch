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
 *   <li>{@link edu.hu.clickwatch.analysis.composition.model.Transformation#getKind <em>Kind</em>}</li>
 *   <li>{@link edu.hu.clickwatch.analysis.composition.model.Transformation#getPredefinedTransformation <em>Predefined Transformation</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The default value is <code>"predefined"</code>.
	 * The literals are from the enumeration {@link edu.hu.clickwatch.analysis.composition.model.TransformationKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see edu.hu.clickwatch.analysis.composition.model.TransformationKind
	 * @see #setKind(TransformationKind)
	 * @see edu.hu.clickwatch.analysis.composition.model.CompositionPackage#getTransformation_Kind()
	 * @model default="predefined"
	 * @generated
	 */
	TransformationKind getKind();

	/**
	 * Sets the value of the '{@link edu.hu.clickwatch.analysis.composition.model.Transformation#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see edu.hu.clickwatch.analysis.composition.model.TransformationKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(TransformationKind value);

	/**
	 * Returns the value of the '<em><b>Predefined Transformation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predefined Transformation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predefined Transformation</em>' attribute.
	 * @see #setPredefinedTransformation(String)
	 * @see edu.hu.clickwatch.analysis.composition.model.CompositionPackage#getTransformation_PredefinedTransformation()
	 * @model
	 * @generated
	 */
	String getPredefinedTransformation();

	/**
	 * Sets the value of the '{@link edu.hu.clickwatch.analysis.composition.model.Transformation#getPredefinedTransformation <em>Predefined Transformation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predefined Transformation</em>' attribute.
	 * @see #getPredefinedTransformation()
	 * @generated
	 */
	void setPredefinedTransformation(String value);
} // Transformation
