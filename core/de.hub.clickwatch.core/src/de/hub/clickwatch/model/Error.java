/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Error</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.model.Error#getMessage <em>Message</em>}</li>
 *   <li>{@link de.hub.clickwatch.model.Error#getException <em>Exception</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.model.ClickWatchModelPackage#getError()
 * @model
 * @generated
 */
public interface Error extends EObject {
    /**
     * Returns the value of the '<em><b>Message</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Message</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Message</em>' attribute.
     * @see #setMessage(String)
     * @see de.hub.clickwatch.model.ClickWatchModelPackage#getError_Message()
     * @model
     * @generated
     */
    String getMessage();

    /**
     * Sets the value of the '{@link de.hub.clickwatch.model.Error#getMessage <em>Message</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Message</em>' attribute.
     * @see #getMessage()
     * @generated
     */
    void setMessage(String value);

    /**
     * Returns the value of the '<em><b>Exception</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Exception</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Exception</em>' attribute.
     * @see #setException(Exception)
     * @see de.hub.clickwatch.model.ClickWatchModelPackage#getError_Exception()
     * @model dataType="de.hub.clickwatch.model.Exception"
     * @generated
     */
    Exception getException();

    /**
     * Sets the value of the '{@link de.hub.clickwatch.model.Error#getException <em>Exception</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Exception</em>' attribute.
     * @see #getException()
     * @generated
     */
    void setException(Exception value);

} // Error
