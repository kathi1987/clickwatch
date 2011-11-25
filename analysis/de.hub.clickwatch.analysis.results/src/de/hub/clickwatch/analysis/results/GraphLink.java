/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.analysis.results;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graph Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.analysis.results.GraphLink#getSource <em>Source</em>}</li>
 *   <li>{@link de.hub.clickwatch.analysis.results.GraphLink#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.analysis.results.ResultsPackage#getGraphLink()
 * @model
 * @generated
 */
public interface GraphLink extends NamedElement {
    /**
     * Returns the value of the '<em><b>Source</b></em>' reference.
     * It is bidirectional and its opposite is '{@link de.hub.clickwatch.analysis.results.GraphNode#getOutgoing <em>Outgoing</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Source</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Source</em>' reference.
     * @see #setSource(GraphNode)
     * @see de.hub.clickwatch.analysis.results.ResultsPackage#getGraphLink_Source()
     * @see de.hub.clickwatch.analysis.results.GraphNode#getOutgoing
     * @model opposite="outgoing"
     * @generated
     */
    GraphNode getSource();

    /**
     * Sets the value of the '{@link de.hub.clickwatch.analysis.results.GraphLink#getSource <em>Source</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Source</em>' reference.
     * @see #getSource()
     * @generated
     */
    void setSource(GraphNode value);

    /**
     * Returns the value of the '<em><b>Target</b></em>' reference.
     * It is bidirectional and its opposite is '{@link de.hub.clickwatch.analysis.results.GraphNode#getIncoming <em>Incoming</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Target</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Target</em>' reference.
     * @see #setTarget(GraphNode)
     * @see de.hub.clickwatch.analysis.results.ResultsPackage#getGraphLink_Target()
     * @see de.hub.clickwatch.analysis.results.GraphNode#getIncoming
     * @model opposite="incoming"
     * @generated
     */
    GraphNode getTarget();

    /**
     * Sets the value of the '{@link de.hub.clickwatch.analysis.results.GraphLink#getTarget <em>Target</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Target</em>' reference.
     * @see #getTarget()
     * @generated
     */
    void setTarget(GraphNode value);

} // GraphLink
