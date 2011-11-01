/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.model;

import org.eclipse.emf.ecore.EFactory;

import com.google.inject.Injector;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.hub.clickwatch.model.ClickWatchModelPackage
 * @generated
 */
public interface ClickWatchModelFactory extends EFactory {
	/**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	ClickWatchModelFactory eINSTANCE = de.hub.clickwatch.model.impl.ClickWatchModelFactoryImpl.init();
	
	/**
	 * @generated NOT
	 */
	void registerInjector(Injector injector);

	/**
     * Returns a new object of class '<em>Node</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Node</em>'.
     * @generated
     */
	Node createNode();

	/**
     * Returns a new object of class '<em>Element</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Element</em>'.
     * @generated
     */
	Element createElement();

	/**
     * Returns a new object of class '<em>Handler</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Handler</em>'.
     * @generated
     */
	Handler createHandler();

	/**
     * Returns a new object of class '<em>Network</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Network</em>'.
     * @generated
     */
	Network createNetwork();

	/**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
	ClickWatchModelPackage getClickWatchModelPackage();

} //ModelFactory
