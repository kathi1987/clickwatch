/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.util;

import de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Sys_info_systeminfoPackage;

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
public class Sys_info_systeminfoXMLProcessor extends XMLProcessor {

    /**
     * Public constructor to instantiate the helper.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Sys_info_systeminfoXMLProcessor() {
        super((EPackage.Registry.INSTANCE));
        Sys_info_systeminfoPackage.eINSTANCE.eClass();
    }
    
    /**
     * Register for "*" and "xml" file extensions the Sys_info_systeminfoResourceFactoryImpl factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected Map<String, Resource.Factory> getRegistrations() {
        if (registrations == null) {
            super.getRegistrations();
            registrations.put(XML_EXTENSION, new Sys_info_systeminfoResourceFactoryImpl());
            registrations.put(STAR_EXTENSION, new Sys_info_systeminfoResourceFactoryImpl());
        }
        return registrations;
    }

} //Sys_info_systeminfoXMLProcessor
