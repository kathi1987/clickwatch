/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.xml.configuration.util;

import de.hub.clickwatch.xml.configuration.ConfigurationPackage;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageRegistryImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ConfigurationXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationXMLProcessor() {
		super(new EPackageRegistryImpl(EPackage.Registry.INSTANCE));
		extendedMetaData.putPackage(null, ConfigurationPackage.eINSTANCE);
	}
	
	/**
	 * Register for "*" and "xml" file extensions the configurationResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new ConfigurationResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new ConfigurationResourceFactoryImpl());
		}
		return registrations;
	}

} //configurationXMLProcessor
