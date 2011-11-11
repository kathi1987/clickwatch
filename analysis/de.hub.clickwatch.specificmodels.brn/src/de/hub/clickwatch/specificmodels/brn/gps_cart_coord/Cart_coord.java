/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.gps_cart_coord;

import de.hub.clickwatch.model.Handler;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cart coord</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.gps_cart_coord.Cart_coord#getText <em>Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.specificmodels.brn.gps_cart_coord.Gps_cart_coordPackage#getCart_coord()
 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Cart_coord|Handler'"
 * @generated
 */
public interface Cart_coord extends Handler {
	/**
     * Returns the value of the '<em><b>Text</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Text</em>' attribute.
     * @see #setText(String)
     * @see de.hub.clickwatch.specificmodels.brn.gps_cart_coord.Gps_cart_coordPackage#getCart_coord_Text()
     * @model unique="false"
     *        annotation="http://de.hub.clickwatch.specificmodels target_id='Cart_coord|Handler/text|text:'"
     * @generated
     */
	String getText();

	/**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.gps_cart_coord.Cart_coord#getText <em>Text</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Text</em>' attribute.
     * @see #getText()
     * @generated
     */
	void setText(String value);

} // Cart_coord
