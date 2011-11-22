/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.lt_routes;

import de.hub.clickwatch.model.Handler;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Routes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.lt_routes.Routes#getRoutetable <em>Routetable</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.specificmodels.brn.lt_routes.Lt_routesPackage#getRoutes()
 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Routes|Handler'"
 * @generated
 */
public interface Routes extends Handler {
    /**
     * Returns the value of the '<em><b>Routetable</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link de.hub.clickwatch.specificmodels.brn.lt_routes.Routetable#getEContainer_routetable <em>EContainer routetable</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Routetable</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Routetable</em>' containment reference.
     * @see #setRoutetable(Routetable)
     * @see de.hub.clickwatch.specificmodels.brn.lt_routes.Lt_routesPackage#getRoutes_Routetable()
     * @see de.hub.clickwatch.specificmodels.brn.lt_routes.Routetable#getEContainer_routetable
     * @model opposite="eContainer_routetable" containment="true"
     *        annotation="http://de.hub.clickwatch.specificmodels target_id='Routes|Handler/routetable|routetable:Routetable|EObject' IsCopy='false'"
     * @generated
     */
    Routetable getRoutetable();

    /**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.lt_routes.Routes#getRoutetable <em>Routetable</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Routetable</em>' containment reference.
     * @see #getRoutetable()
     * @generated
     */
    void setRoutetable(Routetable value);

} // Routes
