/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.model.MultiNode#getNodes <em>Nodes</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.model.ClickWatchModelPackage#getMultiNode()
 * @model
 * @generated
 */
public interface MultiNode extends Node {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' reference list.
	 * The list contents are of type {@link de.hub.clickwatch.model.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' reference list.
	 * @see de.hub.clickwatch.model.ClickWatchModelPackage#getMultiNode_Nodes()
	 * @model
	 * @generated
	 */
	EList<Node> getNodes();

} // MultiNode
