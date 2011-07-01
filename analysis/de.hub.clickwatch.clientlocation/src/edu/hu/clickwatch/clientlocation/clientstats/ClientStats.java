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
 * A representation of the model object '<em><b>Client Stats</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.hu.clickwatch.clientlocation.clientstats.ClientStats#getClients <em>Clients</em>}</li>
 *   <li>{@link edu.hu.clickwatch.clientlocation.clientstats.ClientStats#getApLinks <em>Ap Links</em>}</li>
 *   <li>{@link edu.hu.clickwatch.clientlocation.clientstats.ClientStats#getTime <em>Time</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.hu.clickwatch.clientlocation.clientstats.ClientStatsPackage#getClientStats()
 * @model
 * @generated
 */
public interface ClientStats extends EObject {
	/**
	 * Returns the value of the '<em><b>Clients</b></em>' containment reference list.
	 * The list contents are of type {@link edu.hu.clickwatch.clientlocation.clientstats.Client}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clients</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clients</em>' containment reference list.
	 * @see edu.hu.clickwatch.clientlocation.clientstats.ClientStatsPackage#getClientStats_Clients()
	 * @model containment="true"
	 * @generated
	 */
	EList<Client> getClients();

	/**
	 * Returns the value of the '<em><b>Ap Links</b></em>' containment reference list.
	 * The list contents are of type {@link edu.hu.clickwatch.clientlocation.clientstats.APLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ap Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ap Links</em>' containment reference list.
	 * @see edu.hu.clickwatch.clientlocation.clientstats.ClientStatsPackage#getClientStats_ApLinks()
	 * @model containment="true"
	 * @generated
	 */
	EList<APLink> getApLinks();

	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(long)
	 * @see edu.hu.clickwatch.clientlocation.clientstats.ClientStatsPackage#getClientStats_Time()
	 * @model
	 * @generated
	 */
	long getTime();

	/**
	 * Sets the value of the '{@link edu.hu.clickwatch.clientlocation.clientstats.ClientStats#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(long value);

} // ClientStats
