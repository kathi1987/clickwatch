/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.analysis.compositionV2.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.analysis.compositionV2.model.Composition#getContents <em>Contents</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.analysis.compositionV2.model.Compositemodelv2Package#getComposition()
 * @model
 * @generated
 */
public interface Composition extends EObject {
	/**
	 * Returns the value of the '<em><b>Contents</b></em>' containment reference list.
	 * The list contents are of type {@link de.hub.clickwatch.analysis.compositionV2.model.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contents</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contents</em>' containment reference list.
	 * @see de.hub.clickwatch.analysis.compositionV2.model.Compositemodelv2Package#getComposition_Contents()
	 * @model containment="true"
	 * @generated
	 */
	EList<Element> getContents();

} // Composition
