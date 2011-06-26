/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.MultiNode#getNodes <em>Nodes</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ModelPackage#getMultiNode()
 * @model
 * @generated
 */
public interface MultiNode extends Node {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' reference list.
	 * The list contents are of type {@link model.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' reference list.
	 * @see model.ModelPackage#getMultiNode_Nodes()
	 * @model
	 * @generated
	 */
	EList<Node> getNodes();

} // MultiNode
