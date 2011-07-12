/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.xml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Handler Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.xml.HandlerType#getElement <em>Element</em>}</li>
 *   <li>{@link de.hub.clickwatch.xml.HandlerType#getRate <em>Rate</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.xml.ConfigurationPackage#getHandlerType()
 * @model extendedMetaData="name='handlerType' kind='empty'"
 * @generated
 */
public interface HandlerType extends EObject {
	/**
	 * Returns the value of the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' attribute.
	 * @see #setElement(String)
	 * @see de.hub.clickwatch.xml.ConfigurationPackage#getHandlerType_Element()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='element' namespace='##targetNamespace'"
	 * @generated
	 */
	String getElement();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.xml.HandlerType#getElement <em>Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' attribute.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(String value);

	/**
	 * Returns the value of the '<em><b>Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rate</em>' attribute.
	 * @see #setRate(String)
	 * @see de.hub.clickwatch.xml.ConfigurationPackage#getHandlerType_Rate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='rate' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRate();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.xml.HandlerType#getRate <em>Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate</em>' attribute.
	 * @see #getRate()
	 * @generated
	 */
	void setRate(String value);

} // HandlerType
