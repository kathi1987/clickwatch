/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificdatamodels.brn.lt_links;

import de.hub.clickwatch.datamodel.Value;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Links</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.lt_links.Links#getLinktable <em>Linktable</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.specificdatamodels.brn.lt_links.Lt_linksPackage#getLinks()
 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Links|Handler'"
 * @generated
 */
public interface Links extends Value {
	/**
	 * Returns the value of the '<em><b>Linktable</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link de.hub.clickwatch.specificdatamodels.brn.lt_links.Linktable#getEContainer_linktable <em>EContainer linktable</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linktable</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linktable</em>' containment reference.
	 * @see #setLinktable(Linktable)
	 * @see de.hub.clickwatch.specificdatamodels.brn.lt_links.Lt_linksPackage#getLinks_Linktable()
	 * @see de.hub.clickwatch.specificdatamodels.brn.lt_links.Linktable#getEContainer_linktable
	 * @model opposite="eContainer_linktable" containment="true"
	 *        annotation="http://de.hub.clickwatch.specificmodels target_id='Links|Handler/linktable|linktable:Linktable|EObject' IsCopy='false'"
	 * @generated
	 */
	Linktable getLinktable();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificdatamodels.brn.lt_links.Links#getLinktable <em>Linktable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linktable</em>' containment reference.
	 * @see #getLinktable()
	 * @generated
	 */
	void setLinktable(Linktable value);

} // Links
