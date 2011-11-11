/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.lease_tab_leases.util;

import de.hub.clickwatch.specificmodels.brn.lease_tab_leases.Lease_tab_leasesPackage;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Lease_tab_leasesXMLProcessor extends XMLProcessor {

	/**
     * Public constructor to instantiate the helper.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Lease_tab_leasesXMLProcessor() {
        super((EPackage.Registry.INSTANCE));
        Lease_tab_leasesPackage.eINSTANCE.eClass();
    }
	
	/**
     * Register for "*" and "xml" file extensions the Lease_tab_leasesResourceFactoryImpl factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
        if (registrations == null) {
            super.getRegistrations();
            registrations.put(XML_EXTENSION, new Lease_tab_leasesResourceFactoryImpl());
            registrations.put(STAR_EXTENSION, new Lease_tab_leasesResourceFactoryImpl());
        }
        return registrations;
    }

} //Lease_tab_leasesXMLProcessor
