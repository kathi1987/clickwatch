/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificdatamodels.brn.device_wifi_data_power_systempower.util;

import de.hub.clickwatch.specificdatamodels.brn.device_wifi_data_power_systempower.Device_wifi_data_power_systempowerPackage;

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
public class Device_wifi_data_power_systempowerXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Device_wifi_data_power_systempowerXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		Device_wifi_data_power_systempowerPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the Device_wifi_data_power_systempowerResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new Device_wifi_data_power_systempowerResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new Device_wifi_data_power_systempowerResourceFactoryImpl());
		}
		return registrations;
	}

} //Device_wifi_data_power_systempowerXMLProcessor
