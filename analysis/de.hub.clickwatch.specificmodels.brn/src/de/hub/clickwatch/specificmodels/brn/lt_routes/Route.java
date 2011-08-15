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
 * A representation of the model object '<em><b>Route</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.lt_routes.Route#getEContainer_route <em>EContainer route</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.lt_routes.Route#getText <em>Text</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.lt_routes.Route#getLink <em>Link</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.lt_routes.Route#getFrom <em>From</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.lt_routes.Route#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.specificmodels.brn.lt_routes.Lt_routesPackage#getRoute()
 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Routes|Handler/routetable|routetable:Routetable|EObject/route|route:Route|EObject'"
 * @generated
 */
public interface Route extends EObject {
	/**
	 * Returns the value of the '<em><b>EContainer route</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.hub.clickwatch.specificmodels.brn.lt_routes.Routetable#getRoute <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EContainer route</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EContainer route</em>' container reference.
	 * @see #setEContainer_route(Routetable)
	 * @see de.hub.clickwatch.specificmodels.brn.lt_routes.Lt_routesPackage#getRoute_EContainer_route()
	 * @see de.hub.clickwatch.specificmodels.brn.lt_routes.Routetable#getRoute
	 * @model opposite="route" transient="false"
	 * @generated
	 */
	Routetable getEContainer_route();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.lt_routes.Route#getEContainer_route <em>EContainer route</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EContainer route</em>' container reference.
	 * @see #getEContainer_route()
	 * @generated
	 */
	void setEContainer_route(Routetable value);

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
	 * @see de.hub.clickwatch.specificmodels.brn.lt_routes.Lt_routesPackage#getRoute_Text()
	 * @model unique="false"
	 *        annotation="http://de.hub.clickwatch.specificmodels target_id='Routes|Handler/routetable|routetable:Routetable|EObject/route|route:Route|EObject/text|text:'"
	 * @generated
	 */
	EList<String> getText();

	/**
	 * Returns the value of the '<em><b>Link</b></em>' containment reference list.
	 * The list contents are of type {@link de.hub.clickwatch.specificmodels.brn.lt_routes.Link}.
	 * It is bidirectional and its opposite is '{@link de.hub.clickwatch.specificmodels.brn.lt_routes.Link#getEContainer_link <em>EContainer link</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' containment reference list.
	 * @see de.hub.clickwatch.specificmodels.brn.lt_routes.Lt_routesPackage#getRoute_Link()
	 * @see de.hub.clickwatch.specificmodels.brn.lt_routes.Link#getEContainer_link
	 * @model opposite="eContainer_link" containment="true"
	 *        annotation="http://de.hub.clickwatch.specificmodels target_id='Routes|Handler/routetable|routetable:Routetable|EObject/route|route:Route|EObject/link|link:Link|EObject' IsCopy='false'"
	 * @generated
	 */
	EList<Link> getLink();

	/**
	 * Returns the value of the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' attribute.
	 * @see #setFrom(String)
	 * @see de.hub.clickwatch.specificmodels.brn.lt_routes.Lt_routesPackage#getRoute_From()
	 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Routes|Handler/routetable|routetable:Routetable|EObject/route|route:Route|EObject/from|from:'"
	 * @generated
	 */
	String getFrom();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.lt_routes.Route#getFrom <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' attribute.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(String value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' attribute.
	 * @see #setTo(String)
	 * @see de.hub.clickwatch.specificmodels.brn.lt_routes.Lt_routesPackage#getRoute_To()
	 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Routes|Handler/routetable|routetable:Routetable|EObject/route|route:Route|EObject/to|to:'"
	 * @generated
	 */
	String getTo();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.lt_routes.Route#getTo <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' attribute.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(String value);

} // Route
