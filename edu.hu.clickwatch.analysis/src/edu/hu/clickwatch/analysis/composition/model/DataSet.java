/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package edu.hu.clickwatch.analysis.composition.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.hu.clickwatch.analysis.composition.model.DataSet#getIntValues <em>Int Values</em>}</li>
 *   <li>{@link edu.hu.clickwatch.analysis.composition.model.DataSet#getDoubleValues <em>Double Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.hu.clickwatch.analysis.composition.model.CompositionPackage#getDataSet()
 * @model
 * @generated
 */
public interface DataSet extends EObject {
	/**
	 * Returns the value of the '<em><b>Int Values</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Int Values</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Int Values</em>' attribute list.
	 * @see edu.hu.clickwatch.analysis.composition.model.CompositionPackage#getDataSet_IntValues()
	 * @model
	 * @generated
	 */
	EList<Integer> getIntValues();

	/**
	 * Returns the value of the '<em><b>Double Values</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Double}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Double Values</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Double Values</em>' attribute list.
	 * @see edu.hu.clickwatch.analysis.composition.model.CompositionPackage#getDataSet_DoubleValues()
	 * @model
	 * @generated
	 */
	EList<Double> getDoubleValues();

} // DataSet
