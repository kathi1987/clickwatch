/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.Seismo_latestchannelinfosPackage
 * @generated
 */
public interface Seismo_latestchannelinfosFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Seismo_latestchannelinfosFactory eINSTANCE = de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.impl.Seismo_latestchannelinfosFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Channel info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Channel info</em>'.
	 * @generated
	 */
	Channel_info createChannel_info();

	/**
	 * Returns a new object of class '<em>Channel infos</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Channel infos</em>'.
	 * @generated
	 */
	Channel_infos createChannel_infos();

	/**
	 * Returns a new object of class '<em>Latestchannelinfos</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Latestchannelinfos</em>'.
	 * @generated
	 */
	Latestchannelinfos createLatestchannelinfos();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Seismo_latestchannelinfosPackage getSeismo_latestchannelinfosPackage();

} //Seismo_latestchannelinfosFactory
