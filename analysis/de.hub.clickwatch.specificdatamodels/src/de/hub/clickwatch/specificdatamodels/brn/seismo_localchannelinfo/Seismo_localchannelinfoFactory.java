/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificdatamodels.brn.seismo_localchannelinfo;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.hub.clickwatch.specificdatamodels.brn.seismo_localchannelinfo.Seismo_localchannelinfoPackage
 * @generated
 */
public interface Seismo_localchannelinfoFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Seismo_localchannelinfoFactory eINSTANCE = de.hub.clickwatch.specificdatamodels.brn.seismo_localchannelinfo.impl.Seismo_localchannelinfoFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>C</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>C</em>'.
	 * @generated
	 */
	C createC();

	/**
	 * Returns a new object of class '<em>Localchannelinfo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Localchannelinfo</em>'.
	 * @generated
	 */
	Localchannelinfo createLocalchannelinfo();

	/**
	 * Returns a new object of class '<em>V</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>V</em>'.
	 * @generated
	 */
	V createV();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Seismo_localchannelinfoPackage getSeismo_localchannelinfoPackage();

} //Seismo_localchannelinfoFactory
