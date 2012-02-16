/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificdatamodels.brn.gps_gps_coord;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gps</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.gps_gps_coord.Gps#getEContainer_gps <em>EContainer gps</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.gps_gps_coord.Gps#getId <em>Id</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.gps_gps_coord.Gps#getTime <em>Time</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.gps_gps_coord.Gps#getLat <em>Lat</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.gps_gps_coord.Gps#getLong <em>Long</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.gps_gps_coord.Gps#getAlt <em>Alt</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.gps_gps_coord.Gps#getSpeed <em>Speed</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.specificdatamodels.brn.gps_gps_coord.Gps_gps_coordPackage#getGps()
 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Gps_coord|Handler/gps|gps:Gps|EObject'"
 * @generated
 */
public interface Gps extends EObject {
	/**
	 * Returns the value of the '<em><b>EContainer gps</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.hub.clickwatch.specificdatamodels.brn.gps_gps_coord.Gps_coord#getGps <em>Gps</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EContainer gps</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EContainer gps</em>' container reference.
	 * @see #setEContainer_gps(Gps_coord)
	 * @see de.hub.clickwatch.specificdatamodels.brn.gps_gps_coord.Gps_gps_coordPackage#getGps_EContainer_gps()
	 * @see de.hub.clickwatch.specificdatamodels.brn.gps_gps_coord.Gps_coord#getGps
	 * @model opposite="gps" transient="false"
	 * @generated
	 */
	Gps_coord getEContainer_gps();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificdatamodels.brn.gps_gps_coord.Gps#getEContainer_gps <em>EContainer gps</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EContainer gps</em>' container reference.
	 * @see #getEContainer_gps()
	 * @generated
	 */
	void setEContainer_gps(Gps_coord value);

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
	 * @see de.hub.clickwatch.specificdatamodels.brn.gps_gps_coord.Gps_gps_coordPackage#getGps_Id()
	 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Gps_coord|Handler/gps|gps:Gps|EObject/id|id:'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificdatamodels.brn.gps_gps_coord.Gps#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(double)
	 * @see de.hub.clickwatch.specificdatamodels.brn.gps_gps_coord.Gps_gps_coordPackage#getGps_Time()
	 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Gps_coord|Handler/gps|gps:Gps|EObject/time|time:'"
	 * @generated
	 */
	double getTime();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificdatamodels.brn.gps_gps_coord.Gps#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(double value);

	/**
	 * Returns the value of the '<em><b>Lat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lat</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lat</em>' attribute.
	 * @see #setLat(double)
	 * @see de.hub.clickwatch.specificdatamodels.brn.gps_gps_coord.Gps_gps_coordPackage#getGps_Lat()
	 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Gps_coord|Handler/gps|gps:Gps|EObject/lat|lat:'"
	 * @generated
	 */
	double getLat();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificdatamodels.brn.gps_gps_coord.Gps#getLat <em>Lat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lat</em>' attribute.
	 * @see #getLat()
	 * @generated
	 */
	void setLat(double value);

	/**
	 * Returns the value of the '<em><b>Long</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Long</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Long</em>' attribute.
	 * @see #setLong(double)
	 * @see de.hub.clickwatch.specificdatamodels.brn.gps_gps_coord.Gps_gps_coordPackage#getGps_Long()
	 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Gps_coord|Handler/gps|gps:Gps|EObject/long|long:'"
	 * @generated
	 */
	double getLong();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificdatamodels.brn.gps_gps_coord.Gps#getLong <em>Long</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Long</em>' attribute.
	 * @see #getLong()
	 * @generated
	 */
	void setLong(double value);

	/**
	 * Returns the value of the '<em><b>Alt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alt</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alt</em>' attribute.
	 * @see #setAlt(double)
	 * @see de.hub.clickwatch.specificdatamodels.brn.gps_gps_coord.Gps_gps_coordPackage#getGps_Alt()
	 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Gps_coord|Handler/gps|gps:Gps|EObject/alt|alt:'"
	 * @generated
	 */
	double getAlt();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificdatamodels.brn.gps_gps_coord.Gps#getAlt <em>Alt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alt</em>' attribute.
	 * @see #getAlt()
	 * @generated
	 */
	void setAlt(double value);

	/**
	 * Returns the value of the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Speed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speed</em>' attribute.
	 * @see #setSpeed(double)
	 * @see de.hub.clickwatch.specificdatamodels.brn.gps_gps_coord.Gps_gps_coordPackage#getGps_Speed()
	 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Gps_coord|Handler/gps|gps:Gps|EObject/speed|speed:'"
	 * @generated
	 */
	double getSpeed();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificdatamodels.brn.gps_gps_coord.Gps#getSpeed <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speed</em>' attribute.
	 * @see #getSpeed()
	 * @generated
	 */
	void setSpeed(double value);

} // Gps
