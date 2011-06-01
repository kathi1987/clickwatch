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
 *   <li>{@link edu.hu.clickwatch.analysis.composition.model.Transformation#getInput <em>Input</em>}</li>
 *   <li>{@link edu.hu.clickwatch.analysis.composition.model.Transformation#getOutput <em>Output</em>}</li>
 *   <li>{@link edu.hu.clickwatch.analysis.composition.model.Transformation#getTargetSpec <em>Target Spec</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' containment reference.
	 * @see #setInput(ParameterSpec)
	 * @see edu.hu.clickwatch.analysis.composition.model.CompositionPackage#getTransformation_Input()
	 * @model containment="true"
	 * @generated
	 */
	ParameterSpec getInput();

	/**
	 * Sets the value of the '{@link edu.hu.clickwatch.analysis.composition.model.Transformation#getInput <em>Input</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' containment reference.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(ParameterSpec value);

	/**
	 * Returns the value of the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' containment reference.
	 * @see #setOutput(ParameterSpec)
	 * @see edu.hu.clickwatch.analysis.composition.model.CompositionPackage#getTransformation_Output()
	 * @model containment="true"
	 * @generated
	 */
	ParameterSpec getOutput();

	/**
	 * Sets the value of the '{@link edu.hu.clickwatch.analysis.composition.model.Transformation#getOutput <em>Output</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' containment reference.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(ParameterSpec value);

	/**
	 * Returns the value of the '<em><b>Target Spec</b></em>' attribute.
	 * The default value is <code>"add"</code>.
	 * The literals are from the enumeration {@link edu.hu.clickwatch.analysis.composition.model.TargetSpec}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Spec</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Spec</em>' attribute.
	 * @see edu.hu.clickwatch.analysis.composition.model.TargetSpec
	 * @see #setTargetSpec(TargetSpec)
	 * @see edu.hu.clickwatch.analysis.composition.model.CompositionPackage#getTransformation_TargetSpec()
	 * @model default="add"
	 * @generated
	 */
	TargetSpec getTargetSpec();

	/**
	 * Sets the value of the '{@link edu.hu.clickwatch.analysis.composition.model.Transformation#getTargetSpec <em>Target Spec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Spec</em>' attribute.
	 * @see edu.hu.clickwatch.analysis.composition.model.TargetSpec
	 * @see #getTargetSpec()
	 * @generated
	 */
	void setTargetSpec(TargetSpec value);
} // Transformation
