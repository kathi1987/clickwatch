/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.tsi_syncinfo;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.hub.clickwatch.specificmodels.brn.tsi_syncinfo.Tsi_syncinfoPackage
 * @generated
 */
public interface Tsi_syncinfoFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Tsi_syncinfoFactory eINSTANCE = de.hub.clickwatch.specificmodels.brn.tsi_syncinfo.impl.Tsi_syncinfoFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Syncinfo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Syncinfo</em>'.
	 * @generated
	 */
	Syncinfo createSyncinfo();

	/**
	 * Returns a new object of class '<em>Syncpacket</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Syncpacket</em>'.
	 * @generated
	 */
	Syncpacket createSyncpacket();

	/**
	 * Returns a new object of class '<em>Timesyncinfo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Timesyncinfo</em>'.
	 * @generated
	 */
	Timesyncinfo createTimesyncinfo();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Tsi_syncinfoPackage getTsi_syncinfoPackage();

} //Tsi_syncinfoFactory
