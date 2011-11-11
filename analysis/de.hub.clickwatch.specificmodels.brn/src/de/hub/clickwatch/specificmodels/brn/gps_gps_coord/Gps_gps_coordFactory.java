/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.gps_gps_coord;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.hub.clickwatch.specificmodels.brn.gps_gps_coord.Gps_gps_coordPackage
 * @generated
 */
public interface Gps_gps_coordFactory extends EFactory {
	/**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	Gps_gps_coordFactory eINSTANCE = de.hub.clickwatch.specificmodels.brn.gps_gps_coord.impl.Gps_gps_coordFactoryImpl.init();

	/**
     * Returns a new object of class '<em>Gps</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Gps</em>'.
     * @generated
     */
	Gps createGps();

	/**
     * Returns a new object of class '<em>Gps coord</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Gps coord</em>'.
     * @generated
     */
	Gps_coord createGps_coord();

	/**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
	Gps_gps_coordPackage getGps_gps_coordPackage();

} //Gps_gps_coordFactory
