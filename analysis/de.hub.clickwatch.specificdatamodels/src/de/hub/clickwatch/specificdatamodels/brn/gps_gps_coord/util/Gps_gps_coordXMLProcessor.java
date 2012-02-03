/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificdatamodels.brn.gps_gps_coord.util;

import de.hub.clickwatch.specificdatamodels.brn.gps_gps_coord.Gps_gps_coordPackage;

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
public class Gps_gps_coordXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gps_gps_coordXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		Gps_gps_coordPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the Gps_gps_coordResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new Gps_gps_coordResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new Gps_gps_coordResourceFactoryImpl());
		}
		return registrations;
	}

} //Gps_gps_coordXMLProcessor
