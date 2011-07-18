/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.cwdatabase;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.hub.clickwatch.cwdatabase.CWDataBasePackage
 * @generated
 */
public interface CWDataBaseFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CWDataBaseFactory eINSTANCE = de.hub.clickwatch.cwdatabase.impl.CWDataBaseFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Experimiment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Experimiment</em>'.
	 * @generated
	 */
	Experimiment createExperimiment();

	/**
	 * Returns a new object of class '<em>Node Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node Record</em>'.
	 * @generated
	 */
	NodeRecord createNodeRecord();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CWDataBasePackage getCWDataBasePackage();

} //CWDataBaseFactory
