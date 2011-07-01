/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.clientlocation.clientstats;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.clientlocation.clientstats.Link#getRssi <em>Rssi</em>}</li>
 *   <li>{@link de.hub.clickwatch.clientlocation.clientstats.Link#getEReference0 <em>EReference0</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.clientlocation.clientstats.ClientStatsPackage#getLink()
 * @model
 * @generated
 */
public interface Link extends EObject {
	/**
	 * Returns the value of the '<em><b>Rssi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rssi</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rssi</em>' attribute.
	 * @see #setRssi(int)
	 * @see de.hub.clickwatch.clientlocation.clientstats.ClientStatsPackage#getLink_Rssi()
	 * @model
	 * @generated
	 */
	int getRssi();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.clientlocation.clientstats.Link#getRssi <em>Rssi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rssi</em>' attribute.
	 * @see #getRssi()
	 * @generated
	 */
	void setRssi(int value);

	/**
	 * Returns the value of the '<em><b>EReference0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EReference0</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EReference0</em>' reference.
	 * @see #setEReference0(APLink)
	 * @see de.hub.clickwatch.clientlocation.clientstats.ClientStatsPackage#getLink_EReference0()
	 * @model
	 * @generated
	 */
	APLink getEReference0();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.clientlocation.clientstats.Link#getEReference0 <em>EReference0</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EReference0</em>' reference.
	 * @see #getEReference0()
	 * @generated
	 */
	void setEReference0(APLink value);

} // Link
