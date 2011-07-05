/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.specificmodels.tests.testsourcemodel.impl;

import de.hub.specificmodels.tests.testsourcemodel.*;

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
public class TestSourceModelFactoryImpl extends EFactoryImpl implements TestSourceModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TestSourceModelFactory init() {
		try {
			TestSourceModelFactory theTestSourceModelFactory = (TestSourceModelFactory)EPackage.Registry.INSTANCE.getEFactory("http://testsourcemodel/1.0"); 
			if (theTestSourceModelFactory != null) {
				return theTestSourceModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TestSourceModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestSourceModelFactoryImpl() {
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
			case TestSourceModelPackage.ROOT_CLASS: return createRootClass();
			case TestSourceModelPackage.CLASS_WITH_LIST_FEATURES: return createClassWithListFeatures();
			case TestSourceModelPackage.LIST_FEATURE_ELEMENT_CLASS1: return createListFeatureElementClass1();
			case TestSourceModelPackage.LIST_FEATURE_ELEMENT_CLASS2: return createListFeatureElementClass2();
			case TestSourceModelPackage.LIST_FEATURE_ELEMENT_CLASS3: return createListFeatureElementClass3();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RootClass createRootClass() {
		RootClassImpl rootClass = new RootClassImpl();
		return rootClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassWithListFeatures createClassWithListFeatures() {
		ClassWithListFeaturesImpl classWithListFeatures = new ClassWithListFeaturesImpl();
		return classWithListFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListFeatureElementClass1 createListFeatureElementClass1() {
		ListFeatureElementClass1Impl listFeatureElementClass1 = new ListFeatureElementClass1Impl();
		return listFeatureElementClass1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListFeatureElementClass2 createListFeatureElementClass2() {
		ListFeatureElementClass2Impl listFeatureElementClass2 = new ListFeatureElementClass2Impl();
		return listFeatureElementClass2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListFeatureElementClass3 createListFeatureElementClass3() {
		ListFeatureElementClass3Impl listFeatureElementClass3 = new ListFeatureElementClass3Impl();
		return listFeatureElementClass3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestSourceModelPackage getTestSourceModelPackage() {
		return (TestSourceModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TestSourceModelPackage getPackage() {
		return TestSourceModelPackage.eINSTANCE;
	}

} //TestSourceModelFactoryImpl
