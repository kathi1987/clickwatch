/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.gps_gps_coord.impl;

import de.hub.clickwatch.specificmodels.brn.gps_gps_coord.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import de.hub.clickwatch.specificmodels.brn.gps_gps_coord.Gps;
import de.hub.clickwatch.specificmodels.brn.gps_gps_coord.Gps_coord;
import de.hub.clickwatch.specificmodels.brn.gps_gps_coord.Gps_gps_coordFactory;
import de.hub.clickwatch.specificmodels.brn.gps_gps_coord.Gps_gps_coordPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Gps_gps_coordFactoryImpl extends EFactoryImpl implements Gps_gps_coordFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Gps_gps_coordFactory init() {
		try {
			Gps_gps_coordFactory theGps_gps_coordFactory = (Gps_gps_coordFactory)EPackage.Registry.INSTANCE.getEFactory("http://de.hub.clickwatch.specificmodels.brn/gps/gps_coord"); 
			if (theGps_gps_coordFactory != null) {
				return theGps_gps_coordFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Gps_gps_coordFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gps_gps_coordFactoryImpl() {
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
			case Gps_gps_coordPackage.GPS: return createGps();
			case Gps_gps_coordPackage.GPS_COORD: return createGps_coord();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gps createGps() {
		GpsImpl gps = new GpsImpl();
		return gps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gps_coord createGps_coord() {
		Gps_coordImpl gps_coord = new Gps_coordImpl();
		return gps_coord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gps_gps_coordPackage getGps_gps_coordPackage() {
		return (Gps_gps_coordPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Gps_gps_coordPackage getPackage() {
		return Gps_gps_coordPackage.eINSTANCE;
	}

} //Gps_gps_coordFactoryImpl
