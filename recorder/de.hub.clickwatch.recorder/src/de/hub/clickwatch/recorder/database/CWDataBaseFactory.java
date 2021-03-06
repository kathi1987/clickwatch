/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.recorder.database;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.hub.clickwatch.recorder.database.CWDataBasePackage
 * @generated
 */
public interface CWDataBaseFactory extends EFactory {
	/**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	CWDataBaseFactory eINSTANCE = de.hub.clickwatch.recorder.database.impl.CWDataBaseFactoryImpl.init();

	/**
     * Returns a new object of class '<em>Record</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Record</em>'.
     * @generated
     */
	Record createRecord();

	/**
     * Returns a new object of class '<em>Data Base</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Data Base</em>'.
     * @generated
     */
	DataBase createDataBase();

	/**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
	CWDataBasePackage getCWDataBasePackage();

} //CWDataBaseFactory
