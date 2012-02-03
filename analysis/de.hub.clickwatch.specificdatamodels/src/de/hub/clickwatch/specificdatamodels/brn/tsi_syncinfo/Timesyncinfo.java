/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificdatamodels.brn.tsi_syncinfo;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timesyncinfo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.tsi_syncinfo.Timesyncinfo#getEContainer_timesyncinfo <em>EContainer timesyncinfo</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.tsi_syncinfo.Timesyncinfo#getText <em>Text</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.tsi_syncinfo.Timesyncinfo#getSyncpacket <em>Syncpacket</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.tsi_syncinfo.Timesyncinfo#getId <em>Id</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.tsi_syncinfo.Timesyncinfo#getName <em>Name</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.tsi_syncinfo.Timesyncinfo#getTime <em>Time</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.specificdatamodels.brn.tsi_syncinfo.Tsi_syncinfoPackage#getTimesyncinfo()
 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Syncinfo|Handler/timesyncinfo|timesyncinfo:Timesyncinfo|EObject'"
 * @generated
 */
public interface Timesyncinfo extends EObject {
	/**
	 * Returns the value of the '<em><b>EContainer timesyncinfo</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.hub.clickwatch.specificdatamodels.brn.tsi_syncinfo.Syncinfo#getTimesyncinfo <em>Timesyncinfo</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EContainer timesyncinfo</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EContainer timesyncinfo</em>' container reference.
	 * @see #setEContainer_timesyncinfo(Syncinfo)
	 * @see de.hub.clickwatch.specificdatamodels.brn.tsi_syncinfo.Tsi_syncinfoPackage#getTimesyncinfo_EContainer_timesyncinfo()
	 * @see de.hub.clickwatch.specificdatamodels.brn.tsi_syncinfo.Syncinfo#getTimesyncinfo
	 * @model opposite="timesyncinfo" transient="false"
	 * @generated
	 */
	Syncinfo getEContainer_timesyncinfo();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificdatamodels.brn.tsi_syncinfo.Timesyncinfo#getEContainer_timesyncinfo <em>EContainer timesyncinfo</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EContainer timesyncinfo</em>' container reference.
	 * @see #getEContainer_timesyncinfo()
	 * @generated
	 */
	void setEContainer_timesyncinfo(Syncinfo value);

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
	 * @see de.hub.clickwatch.specificdatamodels.brn.tsi_syncinfo.Tsi_syncinfoPackage#getTimesyncinfo_Text()
	 * @model unique="false"
	 *        annotation="http://de.hub.clickwatch.specificmodels target_id='Syncinfo|Handler/timesyncinfo|timesyncinfo:Timesyncinfo|EObject/text|text:'"
	 * @generated
	 */
	EList<String> getText();

	/**
	 * Returns the value of the '<em><b>Syncpacket</b></em>' containment reference list.
	 * The list contents are of type {@link de.hub.clickwatch.specificdatamodels.brn.tsi_syncinfo.Syncpacket}.
	 * It is bidirectional and its opposite is '{@link de.hub.clickwatch.specificdatamodels.brn.tsi_syncinfo.Syncpacket#getEContainer_syncpacket <em>EContainer syncpacket</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Syncpacket</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Syncpacket</em>' containment reference list.
	 * @see de.hub.clickwatch.specificdatamodels.brn.tsi_syncinfo.Tsi_syncinfoPackage#getTimesyncinfo_Syncpacket()
	 * @see de.hub.clickwatch.specificdatamodels.brn.tsi_syncinfo.Syncpacket#getEContainer_syncpacket
	 * @model opposite="eContainer_syncpacket" containment="true"
	 *        annotation="http://de.hub.clickwatch.specificmodels target_id='Syncinfo|Handler/timesyncinfo|timesyncinfo:Timesyncinfo|EObject/syncpacket|syncpacket:Syncpacket|EObject' IsCopy='false'"
	 * @generated
	 */
	EList<Syncpacket> getSyncpacket();

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
	 * @see de.hub.clickwatch.specificdatamodels.brn.tsi_syncinfo.Tsi_syncinfoPackage#getTimesyncinfo_Id()
	 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Syncinfo|Handler/timesyncinfo|timesyncinfo:Timesyncinfo|EObject/id|id:'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificdatamodels.brn.tsi_syncinfo.Timesyncinfo#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.hub.clickwatch.specificdatamodels.brn.tsi_syncinfo.Tsi_syncinfoPackage#getTimesyncinfo_Name()
	 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Syncinfo|Handler/timesyncinfo|timesyncinfo:Timesyncinfo|EObject/name|name:'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificdatamodels.brn.tsi_syncinfo.Timesyncinfo#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see de.hub.clickwatch.specificdatamodels.brn.tsi_syncinfo.Tsi_syncinfoPackage#getTimesyncinfo_Time()
	 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Syncinfo|Handler/timesyncinfo|timesyncinfo:Timesyncinfo|EObject/time|time:'"
	 * @generated
	 */
	double getTime();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificdatamodels.brn.tsi_syncinfo.Timesyncinfo#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(double value);

} // Timesyncinfo
