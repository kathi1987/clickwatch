/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package edu.hu.clickwatch.examples.lifd.topology;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Topology</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.hu.clickwatch.examples.lifd.topology.Topology#getNodes <em>Nodes</em>}</li>
 *   <li>{@link edu.hu.clickwatch.examples.lifd.topology.Topology#getLinks <em>Links</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.hu.clickwatch.examples.lifd.topology.TopologyPackage#getTopology()
 * @model
 * @generated
 */
public interface Topology extends EObject {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link edu.hu.clickwatch.examples.lifd.topology.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see edu.hu.clickwatch.examples.lifd.topology.TopologyPackage#getTopology_Nodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getNodes();

	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link edu.hu.clickwatch.examples.lifd.topology.Link}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see edu.hu.clickwatch.examples.lifd.topology.TopologyPackage#getTopology_Links()
	 * @model containment="true"
	 * @generated
	 */
	EList<Link> getLinks();

} // Topology
