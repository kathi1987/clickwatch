/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificdatamodels.brn.gps_cart_coord;

import de.hub.clickwatch.datamodel.ClickWatchDataModelPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.hub.clickwatch.specificdatamodels.brn.gps_cart_coord.Gps_cart_coordFactory
 * @model kind="package"
 *        annotation="http://de.hub.clickwatch.specificmodels handler_class='Cart_coord'"
 * @generated
 */
public interface Gps_cart_coordPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "gps_cart_coord";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://de.hub.clickwatch.specificmodels.brn/gps/cart_coord";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gps_cart_coord";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Gps_cart_coordPackage eINSTANCE = de.hub.clickwatch.specificdatamodels.brn.gps_cart_coord.impl.Gps_cart_coordPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.specificdatamodels.brn.gps_cart_coord.impl.Cart_coordImpl <em>Cart coord</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.specificdatamodels.brn.gps_cart_coord.impl.Cart_coordImpl
	 * @see de.hub.clickwatch.specificdatamodels.brn.gps_cart_coord.impl.Gps_cart_coordPackageImpl#getCart_coord()
	 * @generated
	 */
	int CART_COORD = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CART_COORD__NAME = ClickWatchDataModelPackage.VALUE__NAME;

	/**
	 * The feature id for the '<em><b>Can Read</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CART_COORD__CAN_READ = ClickWatchDataModelPackage.VALUE__CAN_READ;

	/**
	 * The feature id for the '<em><b>Can Write</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CART_COORD__CAN_WRITE = ClickWatchDataModelPackage.VALUE__CAN_WRITE;

	/**
	 * The feature id for the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CART_COORD__CHANGED = ClickWatchDataModelPackage.VALUE__CHANGED;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CART_COORD__MIXED = ClickWatchDataModelPackage.VALUE__MIXED;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CART_COORD__ANY = ClickWatchDataModelPackage.VALUE__ANY;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CART_COORD__VALUE = ClickWatchDataModelPackage.VALUE__VALUE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CART_COORD__TIMESTAMP = ClickWatchDataModelPackage.VALUE__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CART_COORD__TEXT = ClickWatchDataModelPackage.VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cart coord</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CART_COORD_FEATURE_COUNT = ClickWatchDataModelPackage.VALUE_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.specificdatamodels.brn.gps_cart_coord.Cart_coord <em>Cart coord</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cart coord</em>'.
	 * @see de.hub.clickwatch.specificdatamodels.brn.gps_cart_coord.Cart_coord
	 * @generated
	 */
	EClass getCart_coord();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificdatamodels.brn.gps_cart_coord.Cart_coord#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see de.hub.clickwatch.specificdatamodels.brn.gps_cart_coord.Cart_coord#getText()
	 * @see #getCart_coord()
	 * @generated
	 */
	EAttribute getCart_coord_Text();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Gps_cart_coordFactory getGps_cart_coordFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.hub.clickwatch.specificdatamodels.brn.gps_cart_coord.impl.Cart_coordImpl <em>Cart coord</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.specificdatamodels.brn.gps_cart_coord.impl.Cart_coordImpl
		 * @see de.hub.clickwatch.specificdatamodels.brn.gps_cart_coord.impl.Gps_cart_coordPackageImpl#getCart_coord()
		 * @generated
		 */
		EClass CART_COORD = eINSTANCE.getCart_coord();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CART_COORD__TEXT = eINSTANCE.getCart_coord_Text();

	}

} //Gps_cart_coordPackage
