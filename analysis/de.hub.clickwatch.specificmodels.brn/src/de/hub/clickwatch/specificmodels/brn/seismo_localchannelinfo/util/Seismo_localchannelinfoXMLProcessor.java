/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.Seismo_localchannelinfoPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Seismo_localchannelinfoXMLProcessor extends XMLProcessor {

    /**
     * Public constructor to instantiate the helper.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Seismo_localchannelinfoXMLProcessor() {
        super((EPackage.Registry.INSTANCE));
        Seismo_localchannelinfoPackage.eINSTANCE.eClass();
    }
    
    /**
     * Register for "*" and "xml" file extensions the Seismo_localchannelinfoResourceFactoryImpl factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected Map<String, Resource.Factory> getRegistrations() {
        if (registrations == null) {
            super.getRegistrations();
            registrations.put(XML_EXTENSION, new Seismo_localchannelinfoResourceFactoryImpl());
            registrations.put(STAR_EXTENSION, new Seismo_localchannelinfoResourceFactoryImpl());
        }
        return registrations;
    }

} //Seismo_localchannelinfoXMLProcessor
