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
	 * Returns a new object of class '<em>Experiment Descr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Experiment Descr</em>'.
	 * @generated
	 */
	ExperimentDescr createExperimentDescr();

	/**
	 * Returns a new object of class '<em>Node Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node Record</em>'.
	 * @generated
	 */
	NodeRecord createNodeRecord();

	/**
	 * Returns a new object of class '<em>Data Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Base</em>'.
	 * @generated
	 */
	DataBase createDataBase();

	/**
	 * Returns a new object of class '<em>Experiment Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Experiment Record</em>'.
	 * @generated
	 */
	ExperimentRecord createExperimentRecord();

	/**
	 * Returns a new object of class '<em>Experiment Node Record Time Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Experiment Node Record Time Table</em>'.
	 * @generated
	 */
	ExperimentNodeRecordTimeTable createExperimentNodeRecordTimeTable();

	/**
	 * Returns a new object of class '<em>Experiment Statistics</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Experiment Statistics</em>'.
	 * @generated
	 */
	ExperimentStatistics createExperimentStatistics();

	/**
	 * Returns a new object of class '<em>Node Record Descr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node Record Descr</em>'.
	 * @generated
	 */
	NodeRecordDescr createNodeRecordDescr();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CWDataBasePackage getCWDataBasePackage();

} //CWDataBaseFactory
