/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.tsi_syncinfo;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Syncpacket</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.tsi_syncinfo.Syncpacket#getEContainer_syncpacket <em>EContainer syncpacket</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.tsi_syncinfo.Syncpacket#getTime <em>Time</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.tsi_syncinfo.Syncpacket#getUnit <em>Unit</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.tsi_syncinfo.Syncpacket#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.specificmodels.brn.tsi_syncinfo.Tsi_syncinfoPackage#getSyncpacket()
 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Syncinfo|Handler/timesyncinfo|timesyncinfo:Timesyncinfo|EObject/syncpacket|syncpacket:Syncpacket|EObject'"
 * @generated
 */
public interface Syncpacket extends EObject {
	/**
	 * Returns the value of the '<em><b>EContainer syncpacket</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.hub.clickwatch.specificmodels.brn.tsi_syncinfo.Timesyncinfo#getSyncpacket <em>Syncpacket</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EContainer syncpacket</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EContainer syncpacket</em>' container reference.
	 * @see #setEContainer_syncpacket(Timesyncinfo)
	 * @see de.hub.clickwatch.specificmodels.brn.tsi_syncinfo.Tsi_syncinfoPackage#getSyncpacket_EContainer_syncpacket()
	 * @see de.hub.clickwatch.specificmodels.brn.tsi_syncinfo.Timesyncinfo#getSyncpacket
	 * @model opposite="syncpacket" transient="false"
	 * @generated
	 */
	Timesyncinfo getEContainer_syncpacket();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.tsi_syncinfo.Syncpacket#getEContainer_syncpacket <em>EContainer syncpacket</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EContainer syncpacket</em>' container reference.
	 * @see #getEContainer_syncpacket()
	 * @generated
	 */
	void setEContainer_syncpacket(Timesyncinfo value);

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
	 * @see de.hub.clickwatch.specificmodels.brn.tsi_syncinfo.Tsi_syncinfoPackage#getSyncpacket_Time()
	 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Syncinfo|Handler/timesyncinfo|timesyncinfo:Timesyncinfo|EObject/syncpacket|syncpacket:Syncpacket|EObject/time|time:'"
	 * @generated
	 */
	long getTime();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.tsi_syncinfo.Syncpacket#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(long value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see #setUnit(String)
	 * @see de.hub.clickwatch.specificmodels.brn.tsi_syncinfo.Tsi_syncinfoPackage#getSyncpacket_Unit()
	 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Syncinfo|Handler/timesyncinfo|timesyncinfo:Timesyncinfo|EObject/syncpacket|syncpacket:Syncpacket|EObject/unit|unit:'"
	 * @generated
	 */
	String getUnit();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.tsi_syncinfo.Syncpacket#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see de.hub.clickwatch.specificmodels.brn.tsi_syncinfo.Tsi_syncinfoPackage#getSyncpacket_Id()
	 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Syncinfo|Handler/timesyncinfo|timesyncinfo:Timesyncinfo|EObject/syncpacket|syncpacket:Syncpacket|EObject/id|id:'"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.tsi_syncinfo.Syncpacket#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

} // Syncpacket
