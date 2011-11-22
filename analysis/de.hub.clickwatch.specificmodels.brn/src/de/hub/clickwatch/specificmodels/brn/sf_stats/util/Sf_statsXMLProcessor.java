/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.sf_stats.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import de.hub.clickwatch.specificmodels.brn.sf_stats.Sf_statsPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Sf_statsXMLProcessor extends XMLProcessor {

    /**
     * Public constructor to instantiate the helper.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Sf_statsXMLProcessor() {
        super((EPackage.Registry.INSTANCE));
        Sf_statsPackage.eINSTANCE.eClass();
    }
    
    /**
     * Register for "*" and "xml" file extensions the Sf_statsResourceFactoryImpl factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected Map<String, Resource.Factory> getRegistrations() {
        if (registrations == null) {
            super.getRegistrations();
            registrations.put(XML_EXTENSION, new Sf_statsResourceFactoryImpl());
            registrations.put(STAR_EXTENSION, new Sf_statsResourceFactoryImpl());
        }
        return registrations;
    }

} //Sf_statsXMLProcessor
