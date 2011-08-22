/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.sf_stats;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.hub.clickwatch.specificmodels.brn.sf_stats.Sf_statsPackage
 * @generated
 */
public interface Sf_statsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Sf_statsFactory eINSTANCE = de.hub.clickwatch.specificmodels.brn.sf_stats.impl.Sf_statsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Flowstats</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Flowstats</em>'.
	 * @generated
	 */
	Flowstats createFlowstats();

	/**
	 * Returns a new object of class '<em>Stats</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stats</em>'.
	 * @generated
	 */
	Stats createStats();

	/**
	 * Returns a new object of class '<em>Txflow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Txflow</em>'.
	 * @generated
	 */
	Txflow createTxflow();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Sf_statsPackage getSf_statsPackage();

} //Sf_statsFactory
