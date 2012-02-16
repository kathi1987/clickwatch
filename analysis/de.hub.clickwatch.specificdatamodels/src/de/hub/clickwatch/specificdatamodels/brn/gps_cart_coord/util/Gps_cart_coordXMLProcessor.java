/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificdatamodels.brn.gps_cart_coord.util;

import de.hub.clickwatch.specificdatamodels.brn.gps_cart_coord.Gps_cart_coordPackage;

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
public class Gps_cart_coordXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gps_cart_coordXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		Gps_cart_coordPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the Gps_cart_coordResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new Gps_cart_coordResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new Gps_cart_coordResourceFactoryImpl());
		}
		return registrations;
	}

} //Gps_cart_coordXMLProcessor
