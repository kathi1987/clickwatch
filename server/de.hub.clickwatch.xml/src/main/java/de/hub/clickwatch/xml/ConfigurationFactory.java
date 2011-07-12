/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.xml;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.hub.clickwatch.xml.ConfigurationPackage
 * @generated
 */
public interface ConfigurationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConfigurationFactory eINSTANCE = de.hub.clickwatch.xml.impl.ConfigurationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Database Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Database Type</em>'.
	 * @generated
	 */
	DatabaseType createDatabaseType();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Experiment List Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Experiment List Type</em>'.
	 * @generated
	 */
	ExperimentListType createExperimentListType();

	/**
	 * Returns a new object of class '<em>Experiment Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Experiment Type</em>'.
	 * @generated
	 */
	ExperimentType createExperimentType();

	/**
	 * Returns a new object of class '<em>Handler List Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Handler List Type</em>'.
	 * @generated
	 */
	HandlerListType createHandlerListType();

	/**
	 * Returns a new object of class '<em>Handler Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Handler Type</em>'.
	 * @generated
	 */
	HandlerType createHandlerType();

	/**
	 * Returns a new object of class '<em>Network Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Network Type</em>'.
	 * @generated
	 */
	NetworkType createNetworkType();

	/**
	 * Returns a new object of class '<em>Node List Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node List Type</em>'.
	 * @generated
	 */
	NodeListType createNodeListType();

	/**
	 * Returns a new object of class '<em>Node Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node Type</em>'.
	 * @generated
	 */
	NodeType createNodeType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ConfigurationPackage getConfigurationPackage();

} //ConfigurationFactory
