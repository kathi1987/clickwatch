/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.gps_gps_coord;

import de.hub.clickwatch.model.ClickWatchModelPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see de.hub.clickwatch.specificmodels.brn.gps_gps_coord.Gps_gps_coordFactory
 * @model kind="package"
 *        annotation="http://de.hub.clickwatch.specificmodels handler_class='Gps_coord'"
 * @generated
 */
public interface Gps_gps_coordPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "gps_gps_coord";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://de.hub.clickwatch.specificmodels.brn/gps/gps_coord";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gps_gps_coord";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Gps_gps_coordPackage eINSTANCE = de.hub.clickwatch.specificmodels.brn.gps_gps_coord.impl.Gps_gps_coordPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.specificmodels.brn.gps_gps_coord.impl.GpsImpl <em>Gps</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.specificmodels.brn.gps_gps_coord.impl.GpsImpl
	 * @see de.hub.clickwatch.specificmodels.brn.gps_gps_coord.impl.Gps_gps_coordPackageImpl#getGps()
	 * @generated
	 */
	int GPS = 0;

	/**
	 * The feature id for the '<em><b>EContainer gps</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS__ECONTAINER_GPS = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS__ID = 1;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS__TIME = 2;

	/**
	 * The feature id for the '<em><b>Lat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS__LAT = 3;

	/**
	 * The feature id for the '<em><b>Long</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS__LONG = 4;

	/**
	 * The feature id for the '<em><b>Alt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS__ALT = 5;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS__SPEED = 6;

	/**
	 * The number of structural features of the '<em>Gps</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.specificmodels.brn.gps_gps_coord.impl.Gps_coordImpl <em>Gps coord</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.specificmodels.brn.gps_gps_coord.impl.Gps_coordImpl
	 * @see de.hub.clickwatch.specificmodels.brn.gps_gps_coord.impl.Gps_gps_coordPackageImpl#getGps_coord()
	 * @generated
	 */
	int GPS_COORD = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_COORD__NAME = ClickWatchModelPackage.HANDLER__NAME;

	/**
	 * The feature id for the '<em><b>Can Read</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_COORD__CAN_READ = ClickWatchModelPackage.HANDLER__CAN_READ;

	/**
	 * The feature id for the '<em><b>Can Write</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_COORD__CAN_WRITE = ClickWatchModelPackage.HANDLER__CAN_WRITE;

	/**
	 * The feature id for the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_COORD__CHANGED = ClickWatchModelPackage.HANDLER__CHANGED;

	/**
	 * The feature id for the '<em><b>Watch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_COORD__WATCH = ClickWatchModelPackage.HANDLER__WATCH;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_COORD__MIXED = ClickWatchModelPackage.HANDLER__MIXED;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_COORD__ANY = ClickWatchModelPackage.HANDLER__ANY;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_COORD__VALUE = ClickWatchModelPackage.HANDLER__VALUE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_COORD__TIMESTAMP = ClickWatchModelPackage.HANDLER__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Gps</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_COORD__GPS = ClickWatchModelPackage.HANDLER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gps coord</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_COORD_FEATURE_COUNT = ClickWatchModelPackage.HANDLER_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.specificmodels.brn.gps_gps_coord.Gps <em>Gps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gps</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.gps_gps_coord.Gps
	 * @generated
	 */
	EClass getGps();

	/**
	 * Returns the meta object for the container reference '{@link de.hub.clickwatch.specificmodels.brn.gps_gps_coord.Gps#getEContainer_gps <em>EContainer gps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>EContainer gps</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.gps_gps_coord.Gps#getEContainer_gps()
	 * @see #getGps()
	 * @generated
	 */
	EReference getGps_EContainer_gps();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.gps_gps_coord.Gps#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.gps_gps_coord.Gps#getId()
	 * @see #getGps()
	 * @generated
	 */
	EAttribute getGps_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.gps_gps_coord.Gps#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.gps_gps_coord.Gps#getTime()
	 * @see #getGps()
	 * @generated
	 */
	EAttribute getGps_Time();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.gps_gps_coord.Gps#getLat <em>Lat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lat</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.gps_gps_coord.Gps#getLat()
	 * @see #getGps()
	 * @generated
	 */
	EAttribute getGps_Lat();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.gps_gps_coord.Gps#getLong <em>Long</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Long</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.gps_gps_coord.Gps#getLong()
	 * @see #getGps()
	 * @generated
	 */
	EAttribute getGps_Long();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.gps_gps_coord.Gps#getAlt <em>Alt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alt</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.gps_gps_coord.Gps#getAlt()
	 * @see #getGps()
	 * @generated
	 */
	EAttribute getGps_Alt();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.gps_gps_coord.Gps#getSpeed <em>Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.gps_gps_coord.Gps#getSpeed()
	 * @see #getGps()
	 * @generated
	 */
	EAttribute getGps_Speed();

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.specificmodels.brn.gps_gps_coord.Gps_coord <em>Gps coord</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gps coord</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.gps_gps_coord.Gps_coord
	 * @generated
	 */
	EClass getGps_coord();

	/**
	 * Returns the meta object for the containment reference '{@link de.hub.clickwatch.specificmodels.brn.gps_gps_coord.Gps_coord#getGps <em>Gps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gps</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.gps_gps_coord.Gps_coord#getGps()
	 * @see #getGps_coord()
	 * @generated
	 */
	EReference getGps_coord_Gps();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Gps_gps_coordFactory getGps_gps_coordFactory();

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
		 * The meta object literal for the '{@link de.hub.clickwatch.specificmodels.brn.gps_gps_coord.impl.GpsImpl <em>Gps</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.specificmodels.brn.gps_gps_coord.impl.GpsImpl
		 * @see de.hub.clickwatch.specificmodels.brn.gps_gps_coord.impl.Gps_gps_coordPackageImpl#getGps()
		 * @generated
		 */
		EClass GPS = eINSTANCE.getGps();

		/**
		 * The meta object literal for the '<em><b>EContainer gps</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GPS__ECONTAINER_GPS = eINSTANCE.getGps_EContainer_gps();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GPS__ID = eINSTANCE.getGps_Id();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GPS__TIME = eINSTANCE.getGps_Time();

		/**
		 * The meta object literal for the '<em><b>Lat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GPS__LAT = eINSTANCE.getGps_Lat();

		/**
		 * The meta object literal for the '<em><b>Long</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GPS__LONG = eINSTANCE.getGps_Long();

		/**
		 * The meta object literal for the '<em><b>Alt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GPS__ALT = eINSTANCE.getGps_Alt();

		/**
		 * The meta object literal for the '<em><b>Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GPS__SPEED = eINSTANCE.getGps_Speed();

		/**
		 * The meta object literal for the '{@link de.hub.clickwatch.specificmodels.brn.gps_gps_coord.impl.Gps_coordImpl <em>Gps coord</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.specificmodels.brn.gps_gps_coord.impl.Gps_coordImpl
		 * @see de.hub.clickwatch.specificmodels.brn.gps_gps_coord.impl.Gps_gps_coordPackageImpl#getGps_coord()
		 * @generated
		 */
		EClass GPS_COORD = eINSTANCE.getGps_coord();

		/**
		 * The meta object literal for the '<em><b>Gps</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GPS_COORD__GPS = eINSTANCE.getGps_coord_Gps();

	}

} //Gps_gps_coordPackage
