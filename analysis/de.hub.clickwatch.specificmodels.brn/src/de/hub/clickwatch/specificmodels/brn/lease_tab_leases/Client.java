/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.lease_tab_leases;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Client</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.lease_tab_leases.Client#getEContainer_client <em>EContainer client</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.lease_tab_leases.Client#getIp <em>Ip</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.lease_tab_leases.Client#getMac <em>Mac</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.lease_tab_leases.Client#getStart <em>Start</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.lease_tab_leases.Client#getEnd <em>End</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.lease_tab_leases.Client#getDuration <em>Duration</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.lease_tab_leases.Client#getTime_left <em>Time left</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.specificmodels.brn.lease_tab_leases.Lease_tab_leasesPackage#getClient()
 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Leases|Handler/dhcpleases|dhcpleases:Dhcpleases|EObject/client|client:Client|EObject'"
 * @generated
 */
public interface Client extends EObject {
	/**
	 * Returns the value of the '<em><b>EContainer client</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.hub.clickwatch.specificmodels.brn.lease_tab_leases.Dhcpleases#getClient <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EContainer client</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EContainer client</em>' container reference.
	 * @see #setEContainer_client(Dhcpleases)
	 * @see de.hub.clickwatch.specificmodels.brn.lease_tab_leases.Lease_tab_leasesPackage#getClient_EContainer_client()
	 * @see de.hub.clickwatch.specificmodels.brn.lease_tab_leases.Dhcpleases#getClient
	 * @model opposite="client" transient="false"
	 * @generated
	 */
	Dhcpleases getEContainer_client();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.lease_tab_leases.Client#getEContainer_client <em>EContainer client</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EContainer client</em>' container reference.
	 * @see #getEContainer_client()
	 * @generated
	 */
	void setEContainer_client(Dhcpleases value);

	/**
	 * Returns the value of the '<em><b>Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ip</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ip</em>' attribute.
	 * @see #setIp(String)
	 * @see de.hub.clickwatch.specificmodels.brn.lease_tab_leases.Lease_tab_leasesPackage#getClient_Ip()
	 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Leases|Handler/dhcpleases|dhcpleases:Dhcpleases|EObject/client|client:Client|EObject/ip|ip:'"
	 * @generated
	 */
	String getIp();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.lease_tab_leases.Client#getIp <em>Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ip</em>' attribute.
	 * @see #getIp()
	 * @generated
	 */
	void setIp(String value);

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
	 * @see de.hub.clickwatch.specificmodels.brn.lease_tab_leases.Lease_tab_leasesPackage#getClient_Mac()
	 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Leases|Handler/dhcpleases|dhcpleases:Dhcpleases|EObject/client|client:Client|EObject/mac|mac:'"
	 * @generated
	 */
	String getMac();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.lease_tab_leases.Client#getMac <em>Mac</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mac</em>' attribute.
	 * @see #getMac()
	 * @generated
	 */
	void setMac(String value);

	/**
	 * Returns the value of the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' attribute.
	 * @see #setStart(int)
	 * @see de.hub.clickwatch.specificmodels.brn.lease_tab_leases.Lease_tab_leasesPackage#getClient_Start()
	 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Leases|Handler/dhcpleases|dhcpleases:Dhcpleases|EObject/client|client:Client|EObject/start|start:'"
	 * @generated
	 */
	int getStart();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.lease_tab_leases.Client#getStart <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' attribute.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(int value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' attribute.
	 * @see #setEnd(int)
	 * @see de.hub.clickwatch.specificmodels.brn.lease_tab_leases.Lease_tab_leasesPackage#getClient_End()
	 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Leases|Handler/dhcpleases|dhcpleases:Dhcpleases|EObject/client|client:Client|EObject/end|end:'"
	 * @generated
	 */
	int getEnd();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.lease_tab_leases.Client#getEnd <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' attribute.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(int value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(int)
	 * @see de.hub.clickwatch.specificmodels.brn.lease_tab_leases.Lease_tab_leasesPackage#getClient_Duration()
	 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Leases|Handler/dhcpleases|dhcpleases:Dhcpleases|EObject/client|client:Client|EObject/duration|duration:'"
	 * @generated
	 */
	int getDuration();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.lease_tab_leases.Client#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(int value);

	/**
	 * Returns the value of the '<em><b>Time left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time left</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time left</em>' attribute.
	 * @see #setTime_left(int)
	 * @see de.hub.clickwatch.specificmodels.brn.lease_tab_leases.Lease_tab_leasesPackage#getClient_Time_left()
	 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Leases|Handler/dhcpleases|dhcpleases:Dhcpleases|EObject/client|client:Client|EObject/time_left|time_left:'"
	 * @generated
	 */
	int getTime_left();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.lease_tab_leases.Client#getTime_left <em>Time left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time left</em>' attribute.
	 * @see #getTime_left()
	 * @generated
	 */
	void setTime_left(int value);

} // Client
