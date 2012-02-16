/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificdatamodels.brn.gps_gps_coord;

import de.hub.clickwatch.datamodel.Value;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gps coord</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.gps_gps_coord.Gps_coord#getGps <em>Gps</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.specificdatamodels.brn.gps_gps_coord.Gps_gps_coordPackage#getGps_coord()
 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Gps_coord|Handler'"
 * @generated
 */
public interface Gps_coord extends Value {
	/**
	 * Returns the value of the '<em><b>Gps</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link de.hub.clickwatch.specificdatamodels.brn.gps_gps_coord.Gps#getEContainer_gps <em>EContainer gps</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gps</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gps</em>' containment reference.
	 * @see #setGps(Gps)
	 * @see de.hub.clickwatch.specificdatamodels.brn.gps_gps_coord.Gps_gps_coordPackage#getGps_coord_Gps()
	 * @see de.hub.clickwatch.specificdatamodels.brn.gps_gps_coord.Gps#getEContainer_gps
	 * @model opposite="eContainer_gps" containment="true"
	 *        annotation="http://de.hub.clickwatch.specificmodels target_id='Gps_coord|Handler/gps|gps:Gps|EObject' IsCopy='false'"
	 * @generated
	 */
	Gps getGps();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificdatamodels.brn.gps_gps_coord.Gps_coord#getGps <em>Gps</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gps</em>' containment reference.
	 * @see #getGps()
	 * @generated
	 */
	void setGps(Gps value);

} // Gps_coord
