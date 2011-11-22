/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Device_wifi_wifidevice_cst_statsXMLProcessor extends XMLProcessor {

    /**
     * Public constructor to instantiate the helper.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Device_wifi_wifidevice_cst_statsXMLProcessor() {
        super((EPackage.Registry.INSTANCE));
        Device_wifi_wifidevice_cst_statsPackage.eINSTANCE.eClass();
    }
    
    /**
     * Register for "*" and "xml" file extensions the Device_wifi_wifidevice_cst_statsResourceFactoryImpl factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected Map<String, Resource.Factory> getRegistrations() {
        if (registrations == null) {
            super.getRegistrations();
            registrations.put(XML_EXTENSION, new Device_wifi_wifidevice_cst_statsResourceFactoryImpl());
            registrations.put(STAR_EXTENSION, new Device_wifi_wifidevice_cst_statsResourceFactoryImpl());
        }
        return registrations;
    }

} //Device_wifi_wifidevice_cst_statsXMLProcessor
