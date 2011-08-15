/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.gps_cart_coord.impl;

import de.hub.clickwatch.specificmodels.brn.gps_cart_coord.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import de.hub.clickwatch.specificmodels.brn.gps_cart_coord.Cart_coord;
import de.hub.clickwatch.specificmodels.brn.gps_cart_coord.Gps_cart_coordFactory;
import de.hub.clickwatch.specificmodels.brn.gps_cart_coord.Gps_cart_coordPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Gps_cart_coordFactoryImpl extends EFactoryImpl implements Gps_cart_coordFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Gps_cart_coordFactory init() {
		try {
			Gps_cart_coordFactory theGps_cart_coordFactory = (Gps_cart_coordFactory)EPackage.Registry.INSTANCE.getEFactory("http://de.hub.clickwatch.specificmodels.brn/gps/cart_coord"); 
			if (theGps_cart_coordFactory != null) {
				return theGps_cart_coordFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Gps_cart_coordFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gps_cart_coordFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Gps_cart_coordPackage.CART_COORD: return createCart_coord();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cart_coord createCart_coord() {
		Cart_coordImpl cart_coord = new Cart_coordImpl();
		return cart_coord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gps_cart_coordPackage getGps_cart_coordPackage() {
		return (Gps_cart_coordPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Gps_cart_coordPackage getPackage() {
		return Gps_cart_coordPackage.eINSTANCE;
	}

} //Gps_cart_coordFactoryImpl
