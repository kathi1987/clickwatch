/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.analysis.traceable;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traceable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.analysis.traceable.Traceable#getTracesFrom <em>Traces From</em>}</li>
 *   <li>{@link de.hub.clickwatch.analysis.traceable.Traceable#getTracesTo <em>Traces To</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.analysis.traceable.TraceablePackage#getTraceable()
 * @model
 * @generated
 */
public interface Traceable extends EObject {
	/**
	 * Returns the value of the '<em><b>Traces From</b></em>' reference list.
	 * The list contents are of type {@link de.hub.clickwatch.analysis.traceable.Traceable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Traces From</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Traces From</em>' reference list.
	 * @see de.hub.clickwatch.analysis.traceable.TraceablePackage#getTraceable_TracesFrom()
	 * @model
	 * @generated
	 */
	EList<Traceable> getTracesFrom();

	/**
	 * Returns the value of the '<em><b>Traces To</b></em>' reference list.
	 * The list contents are of type {@link de.hub.clickwatch.analysis.traceable.Traceable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Traces To</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Traces To</em>' reference list.
	 * @see de.hub.clickwatch.analysis.traceable.TraceablePackage#getTraceable_TracesTo()
	 * @model
	 * @generated
	 */
	EList<Traceable> getTracesTo();

} // Traceable
