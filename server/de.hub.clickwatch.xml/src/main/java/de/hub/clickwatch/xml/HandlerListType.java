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
 * A representation of the model object '<em><b>Handler List Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.xml.HandlerListType#getHandler <em>Handler</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.xml.ConfigurationPackage#getHandlerListType()
 * @model extendedMetaData="name='handlerListType' kind='elementOnly'"
 * @generated
 */
public interface HandlerListType extends EObject {
	/**
	 * Returns the value of the '<em><b>Handler</b></em>' containment reference list.
	 * The list contents are of type {@link de.hub.clickwatch.xml.HandlerType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Handler</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Handler</em>' containment reference list.
	 * @see de.hub.clickwatch.xml.ConfigurationPackage#getHandlerListType_Handler()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='handler' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<HandlerType> getHandler();

} // HandlerListType
