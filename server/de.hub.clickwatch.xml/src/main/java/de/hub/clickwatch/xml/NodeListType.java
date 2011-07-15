/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.xml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node List Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.xml.NodeListType#getNode <em>Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.xml.ConfigurationPackage#getNodeListType()
 * @model extendedMetaData="name='nodeListType' kind='elementOnly'"
 * @generated
 */
public interface NodeListType extends EObject {
	/**
	 * Returns the value of the '<em><b>Node</b></em>' containment reference list.
	 * The list contents are of type {@link de.hub.clickwatch.xml.NodeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' containment reference list.
	 * @see de.hub.clickwatch.xml.ConfigurationPackage#getNodeListType_Node()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='node' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NodeType> getNode();

} // NodeListType
