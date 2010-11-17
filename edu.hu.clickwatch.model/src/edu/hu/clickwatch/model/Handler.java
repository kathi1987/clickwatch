/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package edu.hu.clickwatch.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.hu.clickwatch.model.Handler#getValue <em>Value</em>}</li>
 *   <li>{@link edu.hu.clickwatch.model.Handler#getName <em>Name</em>}</li>
 *   <li>{@link edu.hu.clickwatch.model.Handler#isCanRead <em>Can Read</em>}</li>
 *   <li>{@link edu.hu.clickwatch.model.Handler#isCanWrite <em>Can Write</em>}</li>
 *   <li>{@link edu.hu.clickwatch.model.Handler#isChanged <em>Changed</em>}</li>
 *   <li>{@link edu.hu.clickwatch.model.Handler#isWatch <em>Watch</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.hu.clickwatch.model.ClickWatchModelPackage#getHandler()
 * @model
 * @generated
 */
public interface Handler extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see edu.hu.clickwatch.model.ClickWatchModelPackage#getHandler_Value()
	 * @model transient="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link edu.hu.clickwatch.model.Handler#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

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
	 * @see edu.hu.clickwatch.model.ClickWatchModelPackage#getHandler_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link edu.hu.clickwatch.model.Handler#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Can Read</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Can Read</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Can Read</em>' attribute.
	 * @see #setCanRead(boolean)
	 * @see edu.hu.clickwatch.model.ClickWatchModelPackage#getHandler_CanRead()
	 * @model transient="true"
	 * @generated
	 */
	boolean isCanRead();

	/**
	 * Sets the value of the '{@link edu.hu.clickwatch.model.Handler#isCanRead <em>Can Read</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Can Read</em>' attribute.
	 * @see #isCanRead()
	 * @generated
	 */
	void setCanRead(boolean value);

	/**
	 * Returns the value of the '<em><b>Can Write</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Can Write</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Can Write</em>' attribute.
	 * @see #setCanWrite(boolean)
	 * @see edu.hu.clickwatch.model.ClickWatchModelPackage#getHandler_CanWrite()
	 * @model transient="true"
	 * @generated
	 */
	boolean isCanWrite();

	/**
	 * Sets the value of the '{@link edu.hu.clickwatch.model.Handler#isCanWrite <em>Can Write</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Can Write</em>' attribute.
	 * @see #isCanWrite()
	 * @generated
	 */
	void setCanWrite(boolean value);

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
	 * @see edu.hu.clickwatch.model.ClickWatchModelPackage#getHandler_Watch()
	 * @model default="false"
	 * @generated
	 */
	boolean isWatch();

	/**
	 * Sets the value of the '{@link edu.hu.clickwatch.model.Handler#isWatch <em>Watch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Watch</em>' attribute.
	 * @see #isWatch()
	 * @generated
	 */
	void setWatch(boolean value);

	/**
	 * Returns the value of the '<em><b>Changed</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Changed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Changed</em>' attribute.
	 * @see #setChanged(boolean)
	 * @see edu.hu.clickwatch.model.ClickWatchModelPackage#getHandler_Changed()
	 * @model default="false"
	 * @generated
	 */
	boolean isChanged();

	/**
	 * Sets the value of the '{@link edu.hu.clickwatch.model.Handler#isChanged <em>Changed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Changed</em>' attribute.
	 * @see #isChanged()
	 * @generated
	 */
	void setChanged(boolean value);

} // Handler