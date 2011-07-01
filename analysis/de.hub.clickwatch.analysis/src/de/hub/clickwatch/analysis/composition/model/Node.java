/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.analysis.composition.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.analysis.composition.model.Node#getEReference0 <em>EReference0</em>}</li>
 *   <li>{@link de.hub.clickwatch.analysis.composition.model.Node#getEReference1 <em>EReference1</em>}</li>
 *   <li>{@link de.hub.clickwatch.analysis.composition.model.Node#getOutgoing <em>Outgoing</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.analysis.composition.model.CompositionPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends Element {
	/**
	 * Returns the value of the '<em><b>EReference0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EReference0</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EReference0</em>' reference.
	 * @see #setEReference0(Element)
	 * @see de.hub.clickwatch.analysis.composition.model.CompositionPackage#getNode_EReference0()
	 * @model
	 * @generated
	 */
	Element getEReference0();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.analysis.composition.model.Node#getEReference0 <em>EReference0</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EReference0</em>' reference.
	 * @see #getEReference0()
	 * @generated
	 */
	void setEReference0(Element value);

	/**
	 * Returns the value of the '<em><b>EReference1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EReference1</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EReference1</em>' reference.
	 * @see #setEReference1(Element)
	 * @see de.hub.clickwatch.analysis.composition.model.CompositionPackage#getNode_EReference1()
	 * @model
	 * @generated
	 */
	Element getEReference1();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.analysis.composition.model.Node#getEReference1 <em>EReference1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EReference1</em>' reference.
	 * @see #getEReference1()
	 * @generated
	 */
	void setEReference1(Element value);

	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link de.hub.clickwatch.analysis.composition.model.Edge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see de.hub.clickwatch.analysis.composition.model.CompositionPackage#getNode_Outgoing()
	 * @model
	 * @generated
	 */
	EList<Edge> getOutgoing();

} // Node
