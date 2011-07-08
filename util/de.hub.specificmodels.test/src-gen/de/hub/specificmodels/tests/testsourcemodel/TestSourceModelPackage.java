/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.specificmodels.tests.testsourcemodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.hub.specificmodels.tests.testsourcemodel.TestSourceModelFactory
 * @model kind="package"
 * @generated
 */
public interface TestSourceModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "testsourcemodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://testsourcemodel/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "testsourcemodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TestSourceModelPackage eINSTANCE = de.hub.specificmodels.tests.testsourcemodel.impl.TestSourceModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.hub.specificmodels.tests.testsourcemodel.impl.RootClassImpl <em>Root Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.specificmodels.tests.testsourcemodel.impl.RootClassImpl
	 * @see de.hub.specificmodels.tests.testsourcemodel.impl.TestSourceModelPackageImpl#getRootClass()
	 * @generated
	 */
	int ROOT_CLASS = 0;

	/**
	 * The feature id for the '<em><b>An Attribute1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_CLASS__AN_ATTRIBUTE1 = 0;

	/**
	 * The feature id for the '<em><b>Normal Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_CLASS__NORMAL_REFERENCE = 1;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_CLASS__ANY = 2;

	/**
	 * The number of structural features of the '<em>Root Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_CLASS_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link de.hub.specificmodels.tests.testsourcemodel.impl.ClassWithListFeaturesImpl <em>Class With List Features</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.specificmodels.tests.testsourcemodel.impl.ClassWithListFeaturesImpl
	 * @see de.hub.specificmodels.tests.testsourcemodel.impl.TestSourceModelPackageImpl#getClassWithListFeatures()
	 * @generated
	 */
	int CLASS_WITH_LIST_FEATURES = 1;

	/**
	 * The feature id for the '<em><b>List Feature1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_WITH_LIST_FEATURES__LIST_FEATURE1 = 0;

	/**
	 * The feature id for the '<em><b>List Feature2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_WITH_LIST_FEATURES__LIST_FEATURE2 = 1;

	/**
	 * The feature id for the '<em><b>An Attribute1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_WITH_LIST_FEATURES__AN_ATTRIBUTE1 = 2;

	/**
	 * The number of structural features of the '<em>Class With List Features</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_WITH_LIST_FEATURES_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link de.hub.specificmodels.tests.testsourcemodel.impl.ListFeatureElementClass1Impl <em>List Feature Element Class1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.specificmodels.tests.testsourcemodel.impl.ListFeatureElementClass1Impl
	 * @see de.hub.specificmodels.tests.testsourcemodel.impl.TestSourceModelPackageImpl#getListFeatureElementClass1()
	 * @generated
	 */
	int LIST_FEATURE_ELEMENT_CLASS1 = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FEATURE_ELEMENT_CLASS1__NAME = 0;

	/**
	 * The feature id for the '<em><b>List Feature3</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FEATURE_ELEMENT_CLASS1__LIST_FEATURE3 = 1;

	/**
	 * The feature id for the '<em><b>An Attribute Of Feature Class1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FEATURE_ELEMENT_CLASS1__AN_ATTRIBUTE_OF_FEATURE_CLASS1 = 2;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FEATURE_ELEMENT_CLASS1__ANY = 3;

	/**
	 * The number of structural features of the '<em>List Feature Element Class1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FEATURE_ELEMENT_CLASS1_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link de.hub.specificmodels.tests.testsourcemodel.impl.ListFeatureElementClass2Impl <em>List Feature Element Class2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.specificmodels.tests.testsourcemodel.impl.ListFeatureElementClass2Impl
	 * @see de.hub.specificmodels.tests.testsourcemodel.impl.TestSourceModelPackageImpl#getListFeatureElementClass2()
	 * @generated
	 */
	int LIST_FEATURE_ELEMENT_CLASS2 = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FEATURE_ELEMENT_CLASS2__NAME = 0;

	/**
	 * The feature id for the '<em><b>An Attribute Of Feature Class2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FEATURE_ELEMENT_CLASS2__AN_ATTRIBUTE_OF_FEATURE_CLASS2 = 1;

	/**
	 * The number of structural features of the '<em>List Feature Element Class2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FEATURE_ELEMENT_CLASS2_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link de.hub.specificmodels.tests.testsourcemodel.impl.ListFeatureElementClass3Impl <em>List Feature Element Class3</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.specificmodels.tests.testsourcemodel.impl.ListFeatureElementClass3Impl
	 * @see de.hub.specificmodels.tests.testsourcemodel.impl.TestSourceModelPackageImpl#getListFeatureElementClass3()
	 * @generated
	 */
	int LIST_FEATURE_ELEMENT_CLASS3 = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FEATURE_ELEMENT_CLASS3__NAME = 0;

	/**
	 * The feature id for the '<em><b>An Attribute Of Feature Class3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FEATURE_ELEMENT_CLASS3__AN_ATTRIBUTE_OF_FEATURE_CLASS3 = 1;

	/**
	 * The number of structural features of the '<em>List Feature Element Class3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FEATURE_ELEMENT_CLASS3_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link de.hub.specificmodels.tests.testsourcemodel.RootClass <em>Root Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Class</em>'.
	 * @see de.hub.specificmodels.tests.testsourcemodel.RootClass
	 * @generated
	 */
	EClass getRootClass();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.specificmodels.tests.testsourcemodel.RootClass#getAnAttribute1 <em>An Attribute1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>An Attribute1</em>'.
	 * @see de.hub.specificmodels.tests.testsourcemodel.RootClass#getAnAttribute1()
	 * @see #getRootClass()
	 * @generated
	 */
	EAttribute getRootClass_AnAttribute1();

	/**
	 * Returns the meta object for the containment reference list '{@link de.hub.specificmodels.tests.testsourcemodel.RootClass#getNormalReference <em>Normal Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Normal Reference</em>'.
	 * @see de.hub.specificmodels.tests.testsourcemodel.RootClass#getNormalReference()
	 * @see #getRootClass()
	 * @generated
	 */
	EReference getRootClass_NormalReference();

	/**
	 * Returns the meta object for the attribute list '{@link de.hub.specificmodels.tests.testsourcemodel.RootClass#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see de.hub.specificmodels.tests.testsourcemodel.RootClass#getAny()
	 * @see #getRootClass()
	 * @generated
	 */
	EAttribute getRootClass_Any();

	/**
	 * Returns the meta object for class '{@link de.hub.specificmodels.tests.testsourcemodel.ClassWithListFeatures <em>Class With List Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class With List Features</em>'.
	 * @see de.hub.specificmodels.tests.testsourcemodel.ClassWithListFeatures
	 * @generated
	 */
	EClass getClassWithListFeatures();

	/**
	 * Returns the meta object for the containment reference list '{@link de.hub.specificmodels.tests.testsourcemodel.ClassWithListFeatures#getListFeature1 <em>List Feature1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List Feature1</em>'.
	 * @see de.hub.specificmodels.tests.testsourcemodel.ClassWithListFeatures#getListFeature1()
	 * @see #getClassWithListFeatures()
	 * @generated
	 */
	EReference getClassWithListFeatures_ListFeature1();

	/**
	 * Returns the meta object for the containment reference list '{@link de.hub.specificmodels.tests.testsourcemodel.ClassWithListFeatures#getListFeature2 <em>List Feature2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List Feature2</em>'.
	 * @see de.hub.specificmodels.tests.testsourcemodel.ClassWithListFeatures#getListFeature2()
	 * @see #getClassWithListFeatures()
	 * @generated
	 */
	EReference getClassWithListFeatures_ListFeature2();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.specificmodels.tests.testsourcemodel.ClassWithListFeatures#getAnAttribute1 <em>An Attribute1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>An Attribute1</em>'.
	 * @see de.hub.specificmodels.tests.testsourcemodel.ClassWithListFeatures#getAnAttribute1()
	 * @see #getClassWithListFeatures()
	 * @generated
	 */
	EAttribute getClassWithListFeatures_AnAttribute1();

	/**
	 * Returns the meta object for class '{@link de.hub.specificmodels.tests.testsourcemodel.ListFeatureElementClass1 <em>List Feature Element Class1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Feature Element Class1</em>'.
	 * @see de.hub.specificmodels.tests.testsourcemodel.ListFeatureElementClass1
	 * @generated
	 */
	EClass getListFeatureElementClass1();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.specificmodels.tests.testsourcemodel.ListFeatureElementClass1#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.hub.specificmodels.tests.testsourcemodel.ListFeatureElementClass1#getName()
	 * @see #getListFeatureElementClass1()
	 * @generated
	 */
	EAttribute getListFeatureElementClass1_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link de.hub.specificmodels.tests.testsourcemodel.ListFeatureElementClass1#getListFeature3 <em>List Feature3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List Feature3</em>'.
	 * @see de.hub.specificmodels.tests.testsourcemodel.ListFeatureElementClass1#getListFeature3()
	 * @see #getListFeatureElementClass1()
	 * @generated
	 */
	EReference getListFeatureElementClass1_ListFeature3();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.specificmodels.tests.testsourcemodel.ListFeatureElementClass1#getAnAttributeOfFeatureClass1 <em>An Attribute Of Feature Class1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>An Attribute Of Feature Class1</em>'.
	 * @see de.hub.specificmodels.tests.testsourcemodel.ListFeatureElementClass1#getAnAttributeOfFeatureClass1()
	 * @see #getListFeatureElementClass1()
	 * @generated
	 */
	EAttribute getListFeatureElementClass1_AnAttributeOfFeatureClass1();

	/**
	 * Returns the meta object for the attribute list '{@link de.hub.specificmodels.tests.testsourcemodel.ListFeatureElementClass1#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see de.hub.specificmodels.tests.testsourcemodel.ListFeatureElementClass1#getAny()
	 * @see #getListFeatureElementClass1()
	 * @generated
	 */
	EAttribute getListFeatureElementClass1_Any();

	/**
	 * Returns the meta object for class '{@link de.hub.specificmodels.tests.testsourcemodel.ListFeatureElementClass2 <em>List Feature Element Class2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Feature Element Class2</em>'.
	 * @see de.hub.specificmodels.tests.testsourcemodel.ListFeatureElementClass2
	 * @generated
	 */
	EClass getListFeatureElementClass2();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.specificmodels.tests.testsourcemodel.ListFeatureElementClass2#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.hub.specificmodels.tests.testsourcemodel.ListFeatureElementClass2#getName()
	 * @see #getListFeatureElementClass2()
	 * @generated
	 */
	EAttribute getListFeatureElementClass2_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.specificmodels.tests.testsourcemodel.ListFeatureElementClass2#getAnAttributeOfFeatureClass2 <em>An Attribute Of Feature Class2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>An Attribute Of Feature Class2</em>'.
	 * @see de.hub.specificmodels.tests.testsourcemodel.ListFeatureElementClass2#getAnAttributeOfFeatureClass2()
	 * @see #getListFeatureElementClass2()
	 * @generated
	 */
	EAttribute getListFeatureElementClass2_AnAttributeOfFeatureClass2();

	/**
	 * Returns the meta object for class '{@link de.hub.specificmodels.tests.testsourcemodel.ListFeatureElementClass3 <em>List Feature Element Class3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Feature Element Class3</em>'.
	 * @see de.hub.specificmodels.tests.testsourcemodel.ListFeatureElementClass3
	 * @generated
	 */
	EClass getListFeatureElementClass3();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.specificmodels.tests.testsourcemodel.ListFeatureElementClass3#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.hub.specificmodels.tests.testsourcemodel.ListFeatureElementClass3#getName()
	 * @see #getListFeatureElementClass3()
	 * @generated
	 */
	EAttribute getListFeatureElementClass3_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.specificmodels.tests.testsourcemodel.ListFeatureElementClass3#getAnAttributeOfFeatureClass3 <em>An Attribute Of Feature Class3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>An Attribute Of Feature Class3</em>'.
	 * @see de.hub.specificmodels.tests.testsourcemodel.ListFeatureElementClass3#getAnAttributeOfFeatureClass3()
	 * @see #getListFeatureElementClass3()
	 * @generated
	 */
	EAttribute getListFeatureElementClass3_AnAttributeOfFeatureClass3();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TestSourceModelFactory getTestSourceModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.hub.specificmodels.tests.testsourcemodel.impl.RootClassImpl <em>Root Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.specificmodels.tests.testsourcemodel.impl.RootClassImpl
		 * @see de.hub.specificmodels.tests.testsourcemodel.impl.TestSourceModelPackageImpl#getRootClass()
		 * @generated
		 */
		EClass ROOT_CLASS = eINSTANCE.getRootClass();

		/**
		 * The meta object literal for the '<em><b>An Attribute1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOT_CLASS__AN_ATTRIBUTE1 = eINSTANCE.getRootClass_AnAttribute1();

		/**
		 * The meta object literal for the '<em><b>Normal Reference</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT_CLASS__NORMAL_REFERENCE = eINSTANCE.getRootClass_NormalReference();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOT_CLASS__ANY = eINSTANCE.getRootClass_Any();

		/**
		 * The meta object literal for the '{@link de.hub.specificmodels.tests.testsourcemodel.impl.ClassWithListFeaturesImpl <em>Class With List Features</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.specificmodels.tests.testsourcemodel.impl.ClassWithListFeaturesImpl
		 * @see de.hub.specificmodels.tests.testsourcemodel.impl.TestSourceModelPackageImpl#getClassWithListFeatures()
		 * @generated
		 */
		EClass CLASS_WITH_LIST_FEATURES = eINSTANCE.getClassWithListFeatures();

		/**
		 * The meta object literal for the '<em><b>List Feature1</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_WITH_LIST_FEATURES__LIST_FEATURE1 = eINSTANCE.getClassWithListFeatures_ListFeature1();

		/**
		 * The meta object literal for the '<em><b>List Feature2</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_WITH_LIST_FEATURES__LIST_FEATURE2 = eINSTANCE.getClassWithListFeatures_ListFeature2();

		/**
		 * The meta object literal for the '<em><b>An Attribute1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_WITH_LIST_FEATURES__AN_ATTRIBUTE1 = eINSTANCE.getClassWithListFeatures_AnAttribute1();

		/**
		 * The meta object literal for the '{@link de.hub.specificmodels.tests.testsourcemodel.impl.ListFeatureElementClass1Impl <em>List Feature Element Class1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.specificmodels.tests.testsourcemodel.impl.ListFeatureElementClass1Impl
		 * @see de.hub.specificmodels.tests.testsourcemodel.impl.TestSourceModelPackageImpl#getListFeatureElementClass1()
		 * @generated
		 */
		EClass LIST_FEATURE_ELEMENT_CLASS1 = eINSTANCE.getListFeatureElementClass1();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_FEATURE_ELEMENT_CLASS1__NAME = eINSTANCE.getListFeatureElementClass1_Name();

		/**
		 * The meta object literal for the '<em><b>List Feature3</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_FEATURE_ELEMENT_CLASS1__LIST_FEATURE3 = eINSTANCE.getListFeatureElementClass1_ListFeature3();

		/**
		 * The meta object literal for the '<em><b>An Attribute Of Feature Class1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_FEATURE_ELEMENT_CLASS1__AN_ATTRIBUTE_OF_FEATURE_CLASS1 = eINSTANCE.getListFeatureElementClass1_AnAttributeOfFeatureClass1();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_FEATURE_ELEMENT_CLASS1__ANY = eINSTANCE.getListFeatureElementClass1_Any();

		/**
		 * The meta object literal for the '{@link de.hub.specificmodels.tests.testsourcemodel.impl.ListFeatureElementClass2Impl <em>List Feature Element Class2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.specificmodels.tests.testsourcemodel.impl.ListFeatureElementClass2Impl
		 * @see de.hub.specificmodels.tests.testsourcemodel.impl.TestSourceModelPackageImpl#getListFeatureElementClass2()
		 * @generated
		 */
		EClass LIST_FEATURE_ELEMENT_CLASS2 = eINSTANCE.getListFeatureElementClass2();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_FEATURE_ELEMENT_CLASS2__NAME = eINSTANCE.getListFeatureElementClass2_Name();

		/**
		 * The meta object literal for the '<em><b>An Attribute Of Feature Class2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_FEATURE_ELEMENT_CLASS2__AN_ATTRIBUTE_OF_FEATURE_CLASS2 = eINSTANCE.getListFeatureElementClass2_AnAttributeOfFeatureClass2();

		/**
		 * The meta object literal for the '{@link de.hub.specificmodels.tests.testsourcemodel.impl.ListFeatureElementClass3Impl <em>List Feature Element Class3</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.specificmodels.tests.testsourcemodel.impl.ListFeatureElementClass3Impl
		 * @see de.hub.specificmodels.tests.testsourcemodel.impl.TestSourceModelPackageImpl#getListFeatureElementClass3()
		 * @generated
		 */
		EClass LIST_FEATURE_ELEMENT_CLASS3 = eINSTANCE.getListFeatureElementClass3();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_FEATURE_ELEMENT_CLASS3__NAME = eINSTANCE.getListFeatureElementClass3_Name();

		/**
		 * The meta object literal for the '<em><b>An Attribute Of Feature Class3</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_FEATURE_ELEMENT_CLASS3__AN_ATTRIBUTE_OF_FEATURE_CLASS3 = eINSTANCE.getListFeatureElementClass3_AnAttributeOfFeatureClass3();

	}

} //TestSourceModelPackage
