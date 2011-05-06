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
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.hu.clickwatch.examples.lifd.topology.Node#getIp <em>Ip</em>}</li>
 *   <li>{@link edu.hu.clickwatch.examples.lifd.topology.Node#getMac <em>Mac</em>}</li>
 *   <li>{@link edu.hu.clickwatch.examples.lifd.topology.Node#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link edu.hu.clickwatch.examples.lifd.topology.Node#getIncomming <em>Incomming</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.hu.clickwatch.examples.lifd.topology.TopologyPackage#getNode()
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
	 * @see edu.hu.clickwatch.examples.lifd.topology.TopologyPackage#getNode_Ip()
	 * @model
	 * @generated
	 */
	String getIp();

	/**
	 * Sets the value of the '{@link edu.hu.clickwatch.examples.lifd.topology.Node#getIp <em>Ip</em>}' attribute.
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
	 * @see edu.hu.clickwatch.examples.lifd.topology.TopologyPackage#getNode_Mac()
	 * @model
	 * @generated
	 */
	String getMac();

	/**
	 * Sets the value of the '{@link edu.hu.clickwatch.examples.lifd.topology.Node#getMac <em>Mac</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mac</em>' attribute.
	 * @see #getMac()
	 * @generated
	 */
	void setMac(String value);

	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link edu.hu.clickwatch.examples.lifd.topology.Link}.
	 * It is bidirectional and its opposite is '{@link edu.hu.clickwatch.examples.lifd.topology.Link#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see edu.hu.clickwatch.examples.lifd.topology.TopologyPackage#getNode_Outgoing()
	 * @see edu.hu.clickwatch.examples.lifd.topology.Link#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<Link> getOutgoing();

	/**
	 * Returns the value of the '<em><b>Incomming</b></em>' reference list.
	 * The list contents are of type {@link edu.hu.clickwatch.examples.lifd.topology.Link}.
	 * It is bidirectional and its opposite is '{@link edu.hu.clickwatch.examples.lifd.topology.Link#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incomming</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incomming</em>' reference list.
	 * @see edu.hu.clickwatch.examples.lifd.topology.TopologyPackage#getNode_Incomming()
	 * @see edu.hu.clickwatch.examples.lifd.topology.Link#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<Link> getIncomming();

} // Node
