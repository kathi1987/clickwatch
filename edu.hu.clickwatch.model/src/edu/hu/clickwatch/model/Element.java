/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package edu.hu.clickwatch.model;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.hu.clickwatch.model.Element#getName <em>Name</em>}</li>
 *   <li>{@link edu.hu.clickwatch.model.Element#getHandlers <em>Handlers</em>}</li>
 *   <li>{@link edu.hu.clickwatch.model.Element#isWatch <em>Watch</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.hu.clickwatch.model.ClickWatchModelPackage#getElement()
 * @model
 * @generated
 */
public interface Element extends EObject {
	/**
	 * Returns the value of the '<em><b>Handlers</b></em>' containment reference list.
	 * The list contents are of type {@link edu.hu.clickwatch.model.Handler}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Handlers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Handlers</em>' containment reference list.
	 * @see edu.hu.clickwatch.model.ClickWatchModelPackage#getElement_Handlers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Handler> getHandlers();

	/**
	 * Returns the value of the '<em><b>Watch</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Watch</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Watch</em>' attribute.
	 * @see #setWatch(boolean)
	 * @see edu.hu.clickwatch.model.ClickWatchModelPackage#getElement_Watch()
	 * @model default="false"
	 * @generated
	 */
	boolean isWatch();

	/**
	 * Sets the value of the '{@link edu.hu.clickwatch.model.Element#isWatch <em>Watch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Watch</em>' attribute.
	 * @see #isWatch()
	 * @generated
	 */
	void setWatch(boolean value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see edu.hu.clickwatch.model.ClickWatchModelPackage#getElement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link edu.hu.clickwatch.model.Element#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Element
