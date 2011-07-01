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
 * A representation of the model object '<em><b>AP Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.clientlocation.clientstats.APLink#getLong <em>Long</em>}</li>
 *   <li>{@link de.hub.clickwatch.clientlocation.clientstats.APLink#getLat <em>Lat</em>}</li>
 *   <li>{@link de.hub.clickwatch.clientlocation.clientstats.APLink#getRssi <em>Rssi</em>}</li>
 *   <li>{@link de.hub.clickwatch.clientlocation.clientstats.APLink#getMac <em>Mac</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.clientlocation.clientstats.ClientStatsPackage#getAPLink()
 * @model
 * @generated
 */
public interface APLink extends EObject {
	/**
	 * Returns the value of the '<em><b>Long</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Long</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Long</em>' attribute.
	 * @see #setLong(String)
	 * @see de.hub.clickwatch.clientlocation.clientstats.ClientStatsPackage#getAPLink_Long()
	 * @model
	 * @generated
	 */
	String getLong();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.clientlocation.clientstats.APLink#getLong <em>Long</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Long</em>' attribute.
	 * @see #getLong()
	 * @generated
	 */
	void setLong(String value);

	/**
	 * Returns the value of the '<em><b>Lat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lat</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lat</em>' attribute.
	 * @see #setLat(String)
	 * @see de.hub.clickwatch.clientlocation.clientstats.ClientStatsPackage#getAPLink_Lat()
	 * @model
	 * @generated
	 */
	String getLat();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.clientlocation.clientstats.APLink#getLat <em>Lat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lat</em>' attribute.
	 * @see #getLat()
	 * @generated
	 */
	void setLat(String value);

	/**
	 * Returns the value of the '<em><b>Rssi</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rssi</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rssi</em>' attribute.
	 * @see #setRssi(int)
	 * @see de.hub.clickwatch.clientlocation.clientstats.ClientStatsPackage#getAPLink_Rssi()
	 * @model default="-1"
	 * @generated
	 */
	int getRssi();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.clientlocation.clientstats.APLink#getRssi <em>Rssi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rssi</em>' attribute.
	 * @see #getRssi()
	 * @generated
	 */
	void setRssi(int value);

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
	 * @see de.hub.clickwatch.clientlocation.clientstats.ClientStatsPackage#getAPLink_Mac()
	 * @model
	 * @generated
	 */
	String getMac();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.clientlocation.clientstats.APLink#getMac <em>Mac</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mac</em>' attribute.
	 * @see #getMac()
	 * @generated
	 */
	void setMac(String value);

} // APLink
