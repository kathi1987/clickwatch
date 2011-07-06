/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.specificmodels.tests.testsourcemodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.hub.specificmodels.tests.testsourcemodel.TestSourceModelPackage
 * @generated
 */
public interface TestSourceModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TestSourceModelFactory eINSTANCE = de.hub.specificmodels.tests.testsourcemodel.impl.TestSourceModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Root Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Root Class</em>'.
	 * @generated
	 */
	RootClass createRootClass();

	/**
	 * Returns a new object of class '<em>Class With List Features</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class With List Features</em>'.
	 * @generated
	 */
	ClassWithListFeatures createClassWithListFeatures();

	/**
	 * Returns a new object of class '<em>List Feature Element Class1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Feature Element Class1</em>'.
	 * @generated
	 */
	ListFeatureElementClass1 createListFeatureElementClass1();

	/**
	 * Returns a new object of class '<em>List Feature Element Class2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Feature Element Class2</em>'.
	 * @generated
	 */
	ListFeatureElementClass2 createListFeatureElementClass2();

	/**
	 * Returns a new object of class '<em>List Feature Element Class3</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Feature Element Class3</em>'.
	 * @generated
	 */
	ListFeatureElementClass3 createListFeatureElementClass3();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TestSourceModelPackage getTestSourceModelPackage();

} //TestSourceModelFactory
