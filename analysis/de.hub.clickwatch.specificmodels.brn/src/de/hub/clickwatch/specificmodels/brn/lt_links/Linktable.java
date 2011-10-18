/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.lt_links;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Linktable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.lt_links.Linktable#getEContainer_linktable <em>EContainer linktable</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.lt_links.Linktable#getText <em>Text</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.lt_links.Linktable#getLink <em>Link</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.lt_links.Linktable#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.specificmodels.brn.lt_links.Lt_linksPackage#getLinktable()
 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Links|Handler/linktable|linktable:Linktable|EObject'"
 * @generated
 */
public interface Linktable extends EObject {
	/**
	 * Returns the value of the '<em><b>EContainer linktable</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.hub.clickwatch.specificmodels.brn.lt_links.Links#getLinktable <em>Linktable</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EContainer linktable</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EContainer linktable</em>' container reference.
	 * @see #setEContainer_linktable(Links)
	 * @see de.hub.clickwatch.specificmodels.brn.lt_links.Lt_linksPackage#getLinktable_EContainer_linktable()
	 * @see de.hub.clickwatch.specificmodels.brn.lt_links.Links#getLinktable
	 * @model opposite="linktable" transient="false"
	 * @generated
	 */
	Links getEContainer_linktable();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.lt_links.Linktable#getEContainer_linktable <em>EContainer linktable</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EContainer linktable</em>' container reference.
	 * @see #getEContainer_linktable()
	 * @generated
	 */
	void setEContainer_linktable(Links value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute list.
	 * @see de.hub.clickwatch.specificmodels.brn.lt_links.Lt_linksPackage#getLinktable_Text()
	 * @model unique="false"
	 *        annotation="http://de.hub.clickwatch.specificmodels target_id='Links|Handler/linktable|linktable:Linktable|EObject/text|text:'"
	 * @generated
	 */
	EList<String> getText();

	/**
	 * Returns the value of the '<em><b>Link</b></em>' containment reference list.
	 * The list contents are of type {@link de.hub.clickwatch.specificmodels.brn.lt_links.Link}.
	 * It is bidirectional and its opposite is '{@link de.hub.clickwatch.specificmodels.brn.lt_links.Link#getEContainer_link <em>EContainer link</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' containment reference list.
	 * @see de.hub.clickwatch.specificmodels.brn.lt_links.Lt_linksPackage#getLinktable_Link()
	 * @see de.hub.clickwatch.specificmodels.brn.lt_links.Link#getEContainer_link
	 * @model opposite="eContainer_link" containment="true"
	 *        annotation="http://de.hub.clickwatch.specificmodels target_id='Links|Handler/linktable|linktable:Linktable|EObject/link|link:Link|EObject' IsCopy='false'"
	 * @generated
	 */
	EList<Link> getLink();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see de.hub.clickwatch.specificmodels.brn.lt_links.Lt_linksPackage#getLinktable_Id()
	 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Links|Handler/linktable|linktable:Linktable|EObject/id|id:'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.lt_links.Linktable#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // Linktable
