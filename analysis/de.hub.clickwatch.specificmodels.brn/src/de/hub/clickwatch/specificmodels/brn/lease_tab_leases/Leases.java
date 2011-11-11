/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.lease_tab_leases;

import de.hub.clickwatch.model.Handler;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Leases</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.lease_tab_leases.Leases#getDhcpleases <em>Dhcpleases</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.specificmodels.brn.lease_tab_leases.Lease_tab_leasesPackage#getLeases()
 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Leases|Handler'"
 * @generated
 */
public interface Leases extends Handler {
	/**
     * Returns the value of the '<em><b>Dhcpleases</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link de.hub.clickwatch.specificmodels.brn.lease_tab_leases.Dhcpleases#getEContainer_dhcpleases <em>EContainer dhcpleases</em>}'.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dhcpleases</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Dhcpleases</em>' containment reference.
     * @see #setDhcpleases(Dhcpleases)
     * @see de.hub.clickwatch.specificmodels.brn.lease_tab_leases.Lease_tab_leasesPackage#getLeases_Dhcpleases()
     * @see de.hub.clickwatch.specificmodels.brn.lease_tab_leases.Dhcpleases#getEContainer_dhcpleases
     * @model opposite="eContainer_dhcpleases" containment="true"
     *        annotation="http://de.hub.clickwatch.specificmodels target_id='Leases|Handler/dhcpleases|dhcpleases:Dhcpleases|EObject' IsCopy='false'"
     * @generated
     */
	Dhcpleases getDhcpleases();

	/**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.lease_tab_leases.Leases#getDhcpleases <em>Dhcpleases</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Dhcpleases</em>' containment reference.
     * @see #getDhcpleases()
     * @generated
     */
	void setDhcpleases(Dhcpleases value);

} // Leases
