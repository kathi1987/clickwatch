/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.lt_routes;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Routetable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.lt_routes.Routetable#getEContainer_routetable <em>EContainer routetable</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.lt_routes.Routetable#getText <em>Text</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.lt_routes.Routetable#getRoute <em>Route</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.lt_routes.Routetable#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.specificmodels.brn.lt_routes.Lt_routesPackage#getRoutetable()
 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Routes|Handler/routetable|routetable:Routetable|EObject'"
 * @generated
 */
public interface Routetable extends EObject {
    /**
     * Returns the value of the '<em><b>EContainer routetable</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link de.hub.clickwatch.specificmodels.brn.lt_routes.Routes#getRoutetable <em>Routetable</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>EContainer routetable</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>EContainer routetable</em>' container reference.
     * @see #setEContainer_routetable(Routes)
     * @see de.hub.clickwatch.specificmodels.brn.lt_routes.Lt_routesPackage#getRoutetable_EContainer_routetable()
     * @see de.hub.clickwatch.specificmodels.brn.lt_routes.Routes#getRoutetable
     * @model opposite="routetable" transient="false"
     * @generated
     */
    Routes getEContainer_routetable();

    /**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.lt_routes.Routetable#getEContainer_routetable <em>EContainer routetable</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>EContainer routetable</em>' container reference.
     * @see #getEContainer_routetable()
     * @generated
     */
    void setEContainer_routetable(Routes value);

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
     * @see de.hub.clickwatch.specificmodels.brn.lt_routes.Lt_routesPackage#getRoutetable_Text()
     * @model unique="false"
     *        annotation="http://de.hub.clickwatch.specificmodels target_id='Routes|Handler/routetable|routetable:Routetable|EObject/text|text:'"
     * @generated
     */
    EList<String> getText();

    /**
     * Returns the value of the '<em><b>Route</b></em>' containment reference list.
     * The list contents are of type {@link de.hub.clickwatch.specificmodels.brn.lt_routes.Route}.
     * It is bidirectional and its opposite is '{@link de.hub.clickwatch.specificmodels.brn.lt_routes.Route#getEContainer_route <em>EContainer route</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Route</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Route</em>' containment reference list.
     * @see de.hub.clickwatch.specificmodels.brn.lt_routes.Lt_routesPackage#getRoutetable_Route()
     * @see de.hub.clickwatch.specificmodels.brn.lt_routes.Route#getEContainer_route
     * @model opposite="eContainer_route" containment="true"
     *        annotation="http://de.hub.clickwatch.specificmodels target_id='Routes|Handler/routetable|routetable:Routetable|EObject/route|route:Route|EObject' IsCopy='false'"
     * @generated
     */
    EList<Route> getRoute();

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
     * @see de.hub.clickwatch.specificmodels.brn.lt_routes.Lt_routesPackage#getRoutetable_Id()
     * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Routes|Handler/routetable|routetable:Routetable|EObject/id|id:'"
     * @generated
     */
    String getId();

    /**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.lt_routes.Routetable#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Id</em>' attribute.
     * @see #getId()
     * @generated
     */
    void setId(String value);

} // Routetable
