/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.xveg.example.examplemodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.xveg.example.examplemodel.Transformation#getSource <em>Source</em>}</li>
 *   <li>{@link de.hub.xveg.example.examplemodel.Transformation#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.xveg.example.examplemodel.ExampleModelPackage#getTransformation()
 * @model
 * @generated
 */
public interface Transformation extends CompositionElement {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Data)
	 * @see de.hub.xveg.example.examplemodel.ExampleModelPackage#getTransformation_Source()
	 * @model
	 * @generated
	 */
	Data getSource();

	/**
	 * Sets the value of the '{@link de.hub.xveg.example.examplemodel.Transformation#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Data value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Data)
	 * @see de.hub.xveg.example.examplemodel.ExampleModelPackage#getTransformation_Target()
	 * @model
	 * @generated
	 */
	Data getTarget();

	/**
	 * Sets the value of the '{@link de.hub.xveg.example.examplemodel.Transformation#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Data value);

} // Transformation
