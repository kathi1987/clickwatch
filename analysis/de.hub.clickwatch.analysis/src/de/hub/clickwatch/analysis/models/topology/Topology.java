/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.analysis.models.topology;

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
 *   <li>{@link de.hub.clickwatch.analysis.models.topology.Topology#getNodes <em>Nodes</em>}</li>
 *   <li>{@link de.hub.clickwatch.analysis.models.topology.Topology#getLinks <em>Links</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.analysis.models.topology.TopologyPackage#getTopology()
 * @model
 * @generated
 */
public interface Topology extends EObject {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link de.hub.clickwatch.analysis.models.topology.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see de.hub.clickwatch.analysis.models.topology.TopologyPackage#getTopology_Nodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getNodes();

	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link de.hub.clickwatch.analysis.models.topology.Link}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see de.hub.clickwatch.analysis.models.topology.TopologyPackage#getTopology_Links()
	 * @model containment="true"
	 * @generated
	 */
	EList<Link> getLinks();

} // Topology
