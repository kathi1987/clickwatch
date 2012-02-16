/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificdatamodels.brn.tsi_syncinfo.impl;

import de.hub.clickwatch.specificdatamodels.brn.tsi_syncinfo.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Tsi_syncinfoFactoryImpl extends EFactoryImpl implements Tsi_syncinfoFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Tsi_syncinfoFactory init() {
		try {
			Tsi_syncinfoFactory theTsi_syncinfoFactory = (Tsi_syncinfoFactory)EPackage.Registry.INSTANCE.getEFactory("http://de.hub.clickwatch.specificmodels.brn/tsi/syncinfo"); 
			if (theTsi_syncinfoFactory != null) {
				return theTsi_syncinfoFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Tsi_syncinfoFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tsi_syncinfoFactoryImpl() {
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
			case Tsi_syncinfoPackage.SYNCINFO: return createSyncinfo();
			case Tsi_syncinfoPackage.SYNCPACKET: return createSyncpacket();
			case Tsi_syncinfoPackage.TIMESYNCINFO: return createTimesyncinfo();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Syncinfo createSyncinfo() {
		SyncinfoImpl syncinfo = new SyncinfoImpl();
		return syncinfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Syncpacket createSyncpacket() {
		SyncpacketImpl syncpacket = new SyncpacketImpl();
		return syncpacket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Timesyncinfo createTimesyncinfo() {
		TimesyncinfoImpl timesyncinfo = new TimesyncinfoImpl();
		return timesyncinfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tsi_syncinfoPackage getTsi_syncinfoPackage() {
		return (Tsi_syncinfoPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Tsi_syncinfoPackage getPackage() {
		return Tsi_syncinfoPackage.eINSTANCE;
	}

} //Tsi_syncinfoFactoryImpl
