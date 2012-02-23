/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.datamodel;

import de.hub.clickwatch.analysis.traceable.Traceable;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.datamodel.Handler#getName <em>Name</em>}</li>
 *   <li>{@link de.hub.clickwatch.datamodel.Handler#isCanRead <em>Can Read</em>}</li>
 *   <li>{@link de.hub.clickwatch.datamodel.Handler#isCanWrite <em>Can Write</em>}</li>
 *   <li>{@link de.hub.clickwatch.datamodel.Handler#isChanged <em>Changed</em>}</li>
 *   <li>{@link de.hub.clickwatch.datamodel.Handler#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.datamodel.ClickWatchDataModelPackage#getHandler()
 * @model extendedMetaData="kind='mixed'"
 * @generated
 */
public interface Handler extends Traceable {
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
	 * @see de.hub.clickwatch.datamodel.ClickWatchDataModelPackage#getHandler_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.datamodel.Handler#getName <em>Name</em>}' attribute.
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
	 * @see de.hub.clickwatch.datamodel.ClickWatchDataModelPackage#getHandler_CanRead()
	 * @model
	 * @generated
	 */
	boolean isCanRead();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.datamodel.Handler#isCanRead <em>Can Read</em>}' attribute.
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
	 * @see de.hub.clickwatch.datamodel.ClickWatchDataModelPackage#getHandler_CanWrite()
	 * @model
	 * @generated
	 */
	boolean isCanWrite();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.datamodel.Handler#isCanWrite <em>Can Write</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Can Write</em>' attribute.
	 * @see #isCanWrite()
	 * @generated
	 */
	void setCanWrite(boolean value);

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
	 * @see de.hub.clickwatch.datamodel.ClickWatchDataModelPackage#getHandler_Changed()
	 * @model default="false"
	 * @generated
	 */
	boolean isChanged();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.datamodel.Handler#isChanged <em>Changed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Changed</em>' attribute.
	 * @see #isChanged()
	 * @generated
	 */
	void setChanged(boolean value);

	/**
	 * Returns the value of the '<em><b>Values</b></em>' containment reference list.
	 * The list contents are of type {@link de.hub.clickwatch.datamodel.Value}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' containment reference list.
	 * @see de.hub.clickwatch.datamodel.ClickWatchDataModelPackage#getHandler_Values()
	 * @model containment="true"
	 * @generated
	 */
	EList<Value> getValues();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getQualifiedName();

} // Handler
