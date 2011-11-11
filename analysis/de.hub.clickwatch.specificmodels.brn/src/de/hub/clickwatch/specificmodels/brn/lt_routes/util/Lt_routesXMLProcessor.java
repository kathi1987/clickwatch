/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.lt_routes.util;

import de.hub.clickwatch.specificmodels.brn.lt_routes.Lt_routesPackage;

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
public class Lt_routesXMLProcessor extends XMLProcessor {

	/**
     * Public constructor to instantiate the helper.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Lt_routesXMLProcessor() {
        super((EPackage.Registry.INSTANCE));
        Lt_routesPackage.eINSTANCE.eClass();
    }
	
	/**
     * Register for "*" and "xml" file extensions the Lt_routesResourceFactoryImpl factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
        if (registrations == null) {
            super.getRegistrations();
            registrations.put(XML_EXTENSION, new Lt_routesResourceFactoryImpl());
            registrations.put(STAR_EXTENSION, new Lt_routesResourceFactoryImpl());
        }
        return registrations;
    }

} //Lt_routesXMLProcessor
