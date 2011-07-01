/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package edu.hu.clickwatch.clientlocation.clientstats;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Client</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.hu.clickwatch.clientlocation.clientstats.Client#getIsSeenFrom <em>Is Seen From</em>}</li>
 *   <li>{@link edu.hu.clickwatch.clientlocation.clientstats.Client#getMac <em>Mac</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.hu.clickwatch.clientlocation.clientstats.ClientStatsPackage#getClient()
 * @model
 * @generated
 */
public interface Client extends EObject {
	/**
	 * Returns the value of the '<em><b>Is Seen From</b></em>' containment reference list.
	 * The list contents are of type {@link edu.hu.clickwatch.clientlocation.clientstats.APLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Seen From</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Seen From</em>' containment reference list.
	 * @see edu.hu.clickwatch.clientlocation.clientstats.ClientStatsPackage#getClient_IsSeenFrom()
	 * @model containment="true"
	 * @generated
	 */
	EList<APLink> getIsSeenFrom();

	/**
	 * Returns the value of the '<em><b>Mac</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mac</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mac</em>' attribute.
	 * @see #setMac(String)
	 * @see edu.hu.clickwatch.clientlocation.clientstats.ClientStatsPackage#getClient_Mac()
	 * @model
	 * @generated
	 */
	String getMac();

	/**
	 * Sets the value of the '{@link edu.hu.clickwatch.clientlocation.clientstats.Client#getMac <em>Mac</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mac</em>' attribute.
	 * @see #getMac()
	 * @generated
	 */
	void setMac(String value);

} // Client
