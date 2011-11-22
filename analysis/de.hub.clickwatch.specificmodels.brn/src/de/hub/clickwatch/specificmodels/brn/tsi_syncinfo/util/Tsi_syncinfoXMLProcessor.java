/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.tsi_syncinfo.util;

import de.hub.clickwatch.specificmodels.brn.tsi_syncinfo.Tsi_syncinfoPackage;

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
public class Tsi_syncinfoXMLProcessor extends XMLProcessor {

    /**
     * Public constructor to instantiate the helper.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Tsi_syncinfoXMLProcessor() {
        super((EPackage.Registry.INSTANCE));
        Tsi_syncinfoPackage.eINSTANCE.eClass();
    }
    
    /**
     * Register for "*" and "xml" file extensions the Tsi_syncinfoResourceFactoryImpl factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected Map<String, Resource.Factory> getRegistrations() {
        if (registrations == null) {
            super.getRegistrations();
            registrations.put(XML_EXTENSION, new Tsi_syncinfoResourceFactoryImpl());
            registrations.put(STAR_EXTENSION, new Tsi_syncinfoResourceFactoryImpl());
        }
        return registrations;
    }

} //Tsi_syncinfoXMLProcessor
