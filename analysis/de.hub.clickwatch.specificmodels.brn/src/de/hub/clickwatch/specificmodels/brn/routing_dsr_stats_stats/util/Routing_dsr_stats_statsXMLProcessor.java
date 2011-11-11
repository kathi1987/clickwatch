/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats.util;

import de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats.Routing_dsr_stats_statsPackage;

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
public class Routing_dsr_stats_statsXMLProcessor extends XMLProcessor {

	/**
     * Public constructor to instantiate the helper.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Routing_dsr_stats_statsXMLProcessor() {
        super((EPackage.Registry.INSTANCE));
        Routing_dsr_stats_statsPackage.eINSTANCE.eClass();
    }
	
	/**
     * Register for "*" and "xml" file extensions the Routing_dsr_stats_statsResourceFactoryImpl factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
        if (registrations == null) {
            super.getRegistrations();
            registrations.put(XML_EXTENSION, new Routing_dsr_stats_statsResourceFactoryImpl());
            registrations.put(STAR_EXTENSION, new Routing_dsr_stats_statsResourceFactoryImpl());
        }
        return registrations;
    }

} //Routing_dsr_stats_statsXMLProcessor
