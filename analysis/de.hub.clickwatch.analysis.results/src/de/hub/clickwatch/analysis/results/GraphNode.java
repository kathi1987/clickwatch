/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.analysis.results;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graph Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.analysis.results.GraphNode#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link de.hub.clickwatch.analysis.results.GraphNode#getIncoming <em>Incoming</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.analysis.results.ResultsPackage#getGraphNode()
 * @model
 * @generated
 */
public interface GraphNode extends NamedElement {
    /**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link de.hub.clickwatch.analysis.results.GraphLink}.
	 * It is bidirectional and its opposite is '{@link de.hub.clickwatch.analysis.results.GraphLink#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Outgoing</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see de.hub.clickwatch.analysis.results.ResultsPackage#getGraphNode_Outgoing()
	 * @see de.hub.clickwatch.analysis.results.GraphLink#getSource
	 * @model opposite="source"
	 * @generated
	 */
    EList<GraphLink> getOutgoing();

    /**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link de.hub.clickwatch.analysis.results.GraphLink}.
	 * It is bidirectional and its opposite is '{@link de.hub.clickwatch.analysis.results.GraphLink#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Incoming</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see de.hub.clickwatch.analysis.results.ResultsPackage#getGraphNode_Incoming()
	 * @see de.hub.clickwatch.analysis.results.GraphLink#getTarget
	 * @model opposite="target"
	 * @generated
	 */
    EList<GraphLink> getIncoming();

} // GraphNode
