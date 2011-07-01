/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.analysis.models.topology;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gps</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.analysis.models.topology.Gps#getLong <em>Long</em>}</li>
 *   <li>{@link de.hub.clickwatch.analysis.models.topology.Gps#getLat <em>Lat</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.analysis.models.topology.TopologyPackage#getGps()
 * @model
 * @generated
 */
public interface Gps extends EObject {
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
	 * @see de.hub.clickwatch.analysis.models.topology.TopologyPackage#getGps_Long()
	 * @model
	 * @generated
	 */
	String getLong();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.analysis.models.topology.Gps#getLong <em>Long</em>}' attribute.
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
	 * @see de.hub.clickwatch.analysis.models.topology.TopologyPackage#getGps_Lat()
	 * @model
	 * @generated
	 */
	String getLat();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.analysis.models.topology.Gps#getLat <em>Lat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lat</em>' attribute.
	 * @see #getLat()
	 * @generated
	 */
	void setLat(String value);

} // Gps
