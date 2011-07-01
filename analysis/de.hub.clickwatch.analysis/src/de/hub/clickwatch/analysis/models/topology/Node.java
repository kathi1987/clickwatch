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
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.analysis.models.topology.Node#getIp <em>Ip</em>}</li>
 *   <li>{@link de.hub.clickwatch.analysis.models.topology.Node#getMac <em>Mac</em>}</li>
 *   <li>{@link de.hub.clickwatch.analysis.models.topology.Node#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link de.hub.clickwatch.analysis.models.topology.Node#getIncomming <em>Incomming</em>}</li>
 *   <li>{@link de.hub.clickwatch.analysis.models.topology.Node#getGps <em>Gps</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.analysis.models.topology.TopologyPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends EObject {
	/**
	 * Returns the value of the '<em><b>Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ip</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ip</em>' attribute.
	 * @see #setIp(String)
	 * @see de.hub.clickwatch.analysis.models.topology.TopologyPackage#getNode_Ip()
	 * @model
	 * @generated
	 */
	String getIp();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.analysis.models.topology.Node#getIp <em>Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ip</em>' attribute.
	 * @see #getIp()
	 * @generated
	 */
	void setIp(String value);

	/**
	 * Returns the value of the '<em><b>Mac</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mac</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mac</em>' attribute.
	 * @see #setMac(String)
	 * @see de.hub.clickwatch.analysis.models.topology.TopologyPackage#getNode_Mac()
	 * @model
	 * @generated
	 */
	String getMac();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.analysis.models.topology.Node#getMac <em>Mac</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mac</em>' attribute.
	 * @see #getMac()
	 * @generated
	 */
	void setMac(String value);

	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link de.hub.clickwatch.analysis.models.topology.Link}.
	 * It is bidirectional and its opposite is '{@link de.hub.clickwatch.analysis.models.topology.Link#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see de.hub.clickwatch.analysis.models.topology.TopologyPackage#getNode_Outgoing()
	 * @see de.hub.clickwatch.analysis.models.topology.Link#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<Link> getOutgoing();

	/**
	 * Returns the value of the '<em><b>Incomming</b></em>' reference list.
	 * The list contents are of type {@link de.hub.clickwatch.analysis.models.topology.Link}.
	 * It is bidirectional and its opposite is '{@link de.hub.clickwatch.analysis.models.topology.Link#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incomming</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incomming</em>' reference list.
	 * @see de.hub.clickwatch.analysis.models.topology.TopologyPackage#getNode_Incomming()
	 * @see de.hub.clickwatch.analysis.models.topology.Link#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<Link> getIncomming();

	/**
	 * Returns the value of the '<em><b>Gps</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gps</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gps</em>' containment reference.
	 * @see #setGps(Gps)
	 * @see de.hub.clickwatch.analysis.models.topology.TopologyPackage#getNode_Gps()
	 * @model containment="true"
	 * @generated
	 */
	Gps getGps();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.analysis.models.topology.Node#getGps <em>Gps</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gps</em>' containment reference.
	 * @see #getGps()
	 * @generated
	 */
	void setGps(Gps value);

} // Node
