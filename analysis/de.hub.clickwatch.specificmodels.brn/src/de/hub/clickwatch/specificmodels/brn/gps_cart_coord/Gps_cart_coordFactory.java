/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.gps_cart_coord;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.hub.clickwatch.specificmodels.brn.gps_cart_coord.Gps_cart_coordPackage
 * @generated
 */
public interface Gps_cart_coordFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Gps_cart_coordFactory eINSTANCE = de.hub.clickwatch.specificmodels.brn.gps_cart_coord.impl.Gps_cart_coordFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Cart coord</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cart coord</em>'.
	 * @generated
	 */
	Cart_coord createCart_coord();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Gps_cart_coordPackage getGps_cart_coordPackage();

} //Gps_cart_coordFactory
