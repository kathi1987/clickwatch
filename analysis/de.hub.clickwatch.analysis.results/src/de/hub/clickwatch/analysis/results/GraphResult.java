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
 * A representation of the model object '<em><b>Graph Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.analysis.results.GraphResult#getNodes <em>Nodes</em>}</li>
 *   <li>{@link de.hub.clickwatch.analysis.results.GraphResult#getLinks <em>Links</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.analysis.results.ResultsPackage#getGraphResult()
 * @model
 * @generated
 */
public interface GraphResult extends Result {
    /**
     * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
     * The list contents are of type {@link de.hub.clickwatch.analysis.results.GraphNode}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Nodes</em>' containment reference list.
     * @see de.hub.clickwatch.analysis.results.ResultsPackage#getGraphResult_Nodes()
     * @model containment="true"
     * @generated
     */
    EList<GraphNode> getNodes();

    /**
     * Returns the value of the '<em><b>Links</b></em>' containment reference list.
     * The list contents are of type {@link de.hub.clickwatch.analysis.results.GraphLink}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Links</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Links</em>' containment reference list.
     * @see de.hub.clickwatch.analysis.results.ResultsPackage#getGraphResult_Links()
     * @model containment="true"
     * @generated
     */
    EList<GraphLink> getLinks();

} // GraphResult
