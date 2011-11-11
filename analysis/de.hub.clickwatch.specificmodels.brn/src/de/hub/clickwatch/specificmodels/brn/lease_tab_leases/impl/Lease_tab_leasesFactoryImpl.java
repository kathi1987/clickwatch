/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.lease_tab_leases.impl;

import de.hub.clickwatch.specificmodels.brn.lease_tab_leases.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Lease_tab_leasesFactoryImpl extends EFactoryImpl implements Lease_tab_leasesFactory {
	/**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static Lease_tab_leasesFactory init() {
        try {
            Lease_tab_leasesFactory theLease_tab_leasesFactory = (Lease_tab_leasesFactory)EPackage.Registry.INSTANCE.getEFactory("http://de.hub.clickwatch.specificmodels.brn/lease_tab/leases"); 
            if (theLease_tab_leasesFactory != null) {
                return theLease_tab_leasesFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new Lease_tab_leasesFactoryImpl();
    }

	/**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Lease_tab_leasesFactoryImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case Lease_tab_leasesPackage.CLIENT: return createClient();
            case Lease_tab_leasesPackage.DHCPLEASES: return createDhcpleases();
            case Lease_tab_leasesPackage.LEASES: return createLeases();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Client createClient() {
        ClientImpl client = new ClientImpl();
        return client;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Dhcpleases createDhcpleases() {
        DhcpleasesImpl dhcpleases = new DhcpleasesImpl();
        return dhcpleases;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Leases createLeases() {
        LeasesImpl leases = new LeasesImpl();
        return leases;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Lease_tab_leasesPackage getLease_tab_leasesPackage() {
        return (Lease_tab_leasesPackage)getEPackage();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
	@Deprecated
	public static Lease_tab_leasesPackage getPackage() {
        return Lease_tab_leasesPackage.eINSTANCE;
    }

} //Lease_tab_leasesFactoryImpl
