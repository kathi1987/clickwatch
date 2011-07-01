/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package edu.hu.clickwatch.analysis.composition.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.hu.clickwatch.analysis.composition.model.ParameterSpec#getKind <em>Kind</em>}</li>
 *   <li>{@link edu.hu.clickwatch.analysis.composition.model.ParameterSpec#getMapClassKey <em>Map Class Key</em>}</li>
 *   <li>{@link edu.hu.clickwatch.analysis.composition.model.ParameterSpec#getListQuery <em>List Query</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.hu.clickwatch.analysis.composition.model.CompositionPackage#getParameterSpec()
 * @model
 * @generated
 */
public interface ParameterSpec extends EObject {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The default value is <code>"root"</code>.
	 * The literals are from the enumeration {@link edu.hu.clickwatch.analysis.composition.model.ParameterSpecKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see edu.hu.clickwatch.analysis.composition.model.ParameterSpecKind
	 * @see #setKind(ParameterSpecKind)
	 * @see edu.hu.clickwatch.analysis.composition.model.CompositionPackage#getParameterSpec_Kind()
	 * @model default="root"
	 * @generated
	 */
	ParameterSpecKind getKind();

	/**
	 * Sets the value of the '{@link edu.hu.clickwatch.analysis.composition.model.ParameterSpec#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see edu.hu.clickwatch.analysis.composition.model.ParameterSpecKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(ParameterSpecKind value);

	/**
	 * Returns the value of the '<em><b>Map Class Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Map Class Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Map Class Key</em>' attribute.
	 * @see #setMapClassKey(String)
	 * @see edu.hu.clickwatch.analysis.composition.model.CompositionPackage#getParameterSpec_MapClassKey()
	 * @model
	 * @generated
	 */
	String getMapClassKey();

	/**
	 * Sets the value of the '{@link edu.hu.clickwatch.analysis.composition.model.ParameterSpec#getMapClassKey <em>Map Class Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Map Class Key</em>' attribute.
	 * @see #getMapClassKey()
	 * @generated
	 */
	void setMapClassKey(String value);

	/**
	 * Returns the value of the '<em><b>List Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Query</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Query</em>' attribute.
	 * @see #setListQuery(String)
	 * @see edu.hu.clickwatch.analysis.composition.model.CompositionPackage#getParameterSpec_ListQuery()
	 * @model
	 * @generated
	 */
	String getListQuery();

	/**
	 * Sets the value of the '{@link edu.hu.clickwatch.analysis.composition.model.ParameterSpec#getListQuery <em>List Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Query</em>' attribute.
	 * @see #getListQuery()
	 * @generated
	 */
	void setListQuery(String value);

} // ParameterSpec
