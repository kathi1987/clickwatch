/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.lease_tab_leases;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dhcpleases</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.lease_tab_leases.Dhcpleases#getEContainer_dhcpleases <em>EContainer dhcpleases</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.lease_tab_leases.Dhcpleases#getText <em>Text</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.lease_tab_leases.Dhcpleases#getClient <em>Client</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.lease_tab_leases.Dhcpleases#getCount <em>Count</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.lease_tab_leases.Dhcpleases#getTime <em>Time</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.specificmodels.brn.lease_tab_leases.Lease_tab_leasesPackage#getDhcpleases()
 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Leases|Handler/dhcpleases|dhcpleases:Dhcpleases|EObject'"
 * @generated
 */
public interface Dhcpleases extends EObject {
    /**
     * Returns the value of the '<em><b>EContainer dhcpleases</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link de.hub.clickwatch.specificmodels.brn.lease_tab_leases.Leases#getDhcpleases <em>Dhcpleases</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>EContainer dhcpleases</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>EContainer dhcpleases</em>' container reference.
     * @see #setEContainer_dhcpleases(Leases)
     * @see de.hub.clickwatch.specificmodels.brn.lease_tab_leases.Lease_tab_leasesPackage#getDhcpleases_EContainer_dhcpleases()
     * @see de.hub.clickwatch.specificmodels.brn.lease_tab_leases.Leases#getDhcpleases
     * @model opposite="dhcpleases" transient="false"
     * @generated
     */
    Leases getEContainer_dhcpleases();

    /**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.lease_tab_leases.Dhcpleases#getEContainer_dhcpleases <em>EContainer dhcpleases</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>EContainer dhcpleases</em>' container reference.
     * @see #getEContainer_dhcpleases()
     * @generated
     */
    void setEContainer_dhcpleases(Leases value);

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
     * @see de.hub.clickwatch.specificmodels.brn.lease_tab_leases.Lease_tab_leasesPackage#getDhcpleases_Text()
     * @model unique="false"
     *        annotation="http://de.hub.clickwatch.specificmodels target_id='Leases|Handler/dhcpleases|dhcpleases:Dhcpleases|EObject/text|text:'"
     * @generated
     */
    EList<String> getText();

    /**
     * Returns the value of the '<em><b>Client</b></em>' containment reference list.
     * The list contents are of type {@link de.hub.clickwatch.specificmodels.brn.lease_tab_leases.Client}.
     * It is bidirectional and its opposite is '{@link de.hub.clickwatch.specificmodels.brn.lease_tab_leases.Client#getEContainer_client <em>EContainer client</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Client</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Client</em>' containment reference list.
     * @see de.hub.clickwatch.specificmodels.brn.lease_tab_leases.Lease_tab_leasesPackage#getDhcpleases_Client()
     * @see de.hub.clickwatch.specificmodels.brn.lease_tab_leases.Client#getEContainer_client
     * @model opposite="eContainer_client" containment="true"
     *        annotation="http://de.hub.clickwatch.specificmodels target_id='Leases|Handler/dhcpleases|dhcpleases:Dhcpleases|EObject/client|client:Client|EObject' IsCopy='false'"
     * @generated
     */
    EList<Client> getClient();

    /**
     * Returns the value of the '<em><b>Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Count</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Count</em>' attribute.
     * @see #setCount(int)
     * @see de.hub.clickwatch.specificmodels.brn.lease_tab_leases.Lease_tab_leasesPackage#getDhcpleases_Count()
     * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Leases|Handler/dhcpleases|dhcpleases:Dhcpleases|EObject/count|count:'"
     * @generated
     */
    int getCount();

    /**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.lease_tab_leases.Dhcpleases#getCount <em>Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Count</em>' attribute.
     * @see #getCount()
     * @generated
     */
    void setCount(int value);

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
     * @see de.hub.clickwatch.specificmodels.brn.lease_tab_leases.Lease_tab_leasesPackage#getDhcpleases_Time()
     * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Leases|Handler/dhcpleases|dhcpleases:Dhcpleases|EObject/time|time:'"
     * @generated
     */
    double getTime();

    /**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.lease_tab_leases.Dhcpleases#getTime <em>Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Time</em>' attribute.
     * @see #getTime()
     * @generated
     */
    void setTime(double value);

} // Dhcpleases
