/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.xveg.example.examplemodel;

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
 * @see de.hub.xveg.example.examplemodel.ExampleModelFactory
 * @model kind="package"
 * @generated
 */
public interface ExampleModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "examplemodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://examplemodel/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "examplemodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExampleModelPackage eINSTANCE = de.hub.xveg.example.examplemodel.impl.ExampleModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.hub.xveg.example.examplemodel.impl.CompositionElementImpl <em>Composition Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.xveg.example.examplemodel.impl.CompositionElementImpl
	 * @see de.hub.xveg.example.examplemodel.impl.ExampleModelPackageImpl#getCompositionElement()
	 * @generated
	 */
	int COMPOSITION_ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Composition Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.hub.xveg.example.examplemodel.impl.DataImpl <em>Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.xveg.example.examplemodel.impl.DataImpl
	 * @see de.hub.xveg.example.examplemodel.impl.ExampleModelPackageImpl#getData()
	 * @generated
	 */
	int DATA = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__NAME = COMPOSITION_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE_COUNT = COMPOSITION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.hub.xveg.example.examplemodel.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.xveg.example.examplemodel.impl.ModelImpl
	 * @see de.hub.xveg.example.examplemodel.impl.ExampleModelPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NAME = DATA__NAME;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = DATA_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.hub.xveg.example.examplemodel.impl.DataSetImpl <em>Data Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.xveg.example.examplemodel.impl.DataSetImpl
	 * @see de.hub.xveg.example.examplemodel.impl.ExampleModelPackageImpl#getDataSet()
	 * @generated
	 */
	int DATA_SET = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET__NAME = DATA__NAME;

	/**
	 * The number of structural features of the '<em>Data Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET_FEATURE_COUNT = DATA_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.hub.xveg.example.examplemodel.impl.MeasureImpl <em>Measure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.xveg.example.examplemodel.impl.MeasureImpl
	 * @see de.hub.xveg.example.examplemodel.impl.ExampleModelPackageImpl#getMeasure()
	 * @generated
	 */
	int MEASURE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__NAME = DATA__NAME;

	/**
	 * The number of structural features of the '<em>Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_FEATURE_COUNT = DATA_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.hub.xveg.example.examplemodel.impl.TransformationImpl <em>Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.xveg.example.examplemodel.impl.TransformationImpl
	 * @see de.hub.xveg.example.examplemodel.impl.ExampleModelPackageImpl#getTransformation()
	 * @generated
	 */
	int TRANSFORMATION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__NAME = COMPOSITION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__SOURCE = COMPOSITION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__TARGET = COMPOSITION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_FEATURE_COUNT = COMPOSITION_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.hub.xveg.example.examplemodel.impl.EClass0Impl <em>EClass0</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.xveg.example.examplemodel.impl.EClass0Impl
	 * @see de.hub.xveg.example.examplemodel.impl.ExampleModelPackageImpl#getEClass0()
	 * @generated
	 */
	int ECLASS0 = 4;

	/**
	 * The number of structural features of the '<em>EClass0</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS0_FEATURE_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link de.hub.xveg.example.examplemodel.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see de.hub.xveg.example.examplemodel.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for class '{@link de.hub.xveg.example.examplemodel.DataSet <em>Data Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Set</em>'.
	 * @see de.hub.xveg.example.examplemodel.DataSet
	 * @generated
	 */
	EClass getDataSet();

	/**
	 * Returns the meta object for class '{@link de.hub.xveg.example.examplemodel.Measure <em>Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measure</em>'.
	 * @see de.hub.xveg.example.examplemodel.Measure
	 * @generated
	 */
	EClass getMeasure();

	/**
	 * Returns the meta object for class '{@link de.hub.xveg.example.examplemodel.Transformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformation</em>'.
	 * @see de.hub.xveg.example.examplemodel.Transformation
	 * @generated
	 */
	EClass getTransformation();

	/**
	 * Returns the meta object for the reference '{@link de.hub.xveg.example.examplemodel.Transformation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see de.hub.xveg.example.examplemodel.Transformation#getSource()
	 * @see #getTransformation()
	 * @generated
	 */
	EReference getTransformation_Source();

	/**
	 * Returns the meta object for the reference '{@link de.hub.xveg.example.examplemodel.Transformation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see de.hub.xveg.example.examplemodel.Transformation#getTarget()
	 * @see #getTransformation()
	 * @generated
	 */
	EReference getTransformation_Target();

	/**
	 * Returns the meta object for class '{@link de.hub.xveg.example.examplemodel.EClass0 <em>EClass0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EClass0</em>'.
	 * @see de.hub.xveg.example.examplemodel.EClass0
	 * @generated
	 */
	EClass getEClass0();

	/**
	 * Returns the meta object for class '{@link de.hub.xveg.example.examplemodel.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data</em>'.
	 * @see de.hub.xveg.example.examplemodel.Data
	 * @generated
	 */
	EClass getData();

	/**
	 * Returns the meta object for class '{@link de.hub.xveg.example.examplemodel.CompositionElement <em>Composition Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composition Element</em>'.
	 * @see de.hub.xveg.example.examplemodel.CompositionElement
	 * @generated
	 */
	EClass getCompositionElement();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.xveg.example.examplemodel.CompositionElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.hub.xveg.example.examplemodel.CompositionElement#getName()
	 * @see #getCompositionElement()
	 * @generated
	 */
	EAttribute getCompositionElement_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExampleModelFactory getExampleModelFactory();

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
		 * The meta object literal for the '{@link de.hub.xveg.example.examplemodel.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.xveg.example.examplemodel.impl.ModelImpl
		 * @see de.hub.xveg.example.examplemodel.impl.ExampleModelPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '{@link de.hub.xveg.example.examplemodel.impl.DataSetImpl <em>Data Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.xveg.example.examplemodel.impl.DataSetImpl
		 * @see de.hub.xveg.example.examplemodel.impl.ExampleModelPackageImpl#getDataSet()
		 * @generated
		 */
		EClass DATA_SET = eINSTANCE.getDataSet();

		/**
		 * The meta object literal for the '{@link de.hub.xveg.example.examplemodel.impl.MeasureImpl <em>Measure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.xveg.example.examplemodel.impl.MeasureImpl
		 * @see de.hub.xveg.example.examplemodel.impl.ExampleModelPackageImpl#getMeasure()
		 * @generated
		 */
		EClass MEASURE = eINSTANCE.getMeasure();

		/**
		 * The meta object literal for the '{@link de.hub.xveg.example.examplemodel.impl.TransformationImpl <em>Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.xveg.example.examplemodel.impl.TransformationImpl
		 * @see de.hub.xveg.example.examplemodel.impl.ExampleModelPackageImpl#getTransformation()
		 * @generated
		 */
		EClass TRANSFORMATION = eINSTANCE.getTransformation();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION__SOURCE = eINSTANCE.getTransformation_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION__TARGET = eINSTANCE.getTransformation_Target();

		/**
		 * The meta object literal for the '{@link de.hub.xveg.example.examplemodel.impl.EClass0Impl <em>EClass0</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.xveg.example.examplemodel.impl.EClass0Impl
		 * @see de.hub.xveg.example.examplemodel.impl.ExampleModelPackageImpl#getEClass0()
		 * @generated
		 */
		EClass ECLASS0 = eINSTANCE.getEClass0();

		/**
		 * The meta object literal for the '{@link de.hub.xveg.example.examplemodel.impl.DataImpl <em>Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.xveg.example.examplemodel.impl.DataImpl
		 * @see de.hub.xveg.example.examplemodel.impl.ExampleModelPackageImpl#getData()
		 * @generated
		 */
		EClass DATA = eINSTANCE.getData();

		/**
		 * The meta object literal for the '{@link de.hub.xveg.example.examplemodel.impl.CompositionElementImpl <em>Composition Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.xveg.example.examplemodel.impl.CompositionElementImpl
		 * @see de.hub.xveg.example.examplemodel.impl.ExampleModelPackageImpl#getCompositionElement()
		 * @generated
		 */
		EClass COMPOSITION_ELEMENT = eINSTANCE.getCompositionElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSITION_ELEMENT__NAME = eINSTANCE.getCompositionElement_Name();

	}

} //ExampleModelPackage
