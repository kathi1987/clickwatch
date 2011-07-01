/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.analysis.composition.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see de.hub.clickwatch.analysis.composition.model.CompositionFactory
 * @model kind="package"
 * @generated
 */
public interface CompositionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://de.hub.clickwatch.compositionmodel/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "comp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CompositionPackage eINSTANCE = de.hub.clickwatch.analysis.composition.model.impl.CompositionPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.analysis.composition.model.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.analysis.composition.model.impl.ElementImpl
	 * @see de.hub.clickwatch.analysis.composition.model.impl.CompositionPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__LABEL = 0;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.analysis.composition.model.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.analysis.composition.model.impl.NodeImpl
	 * @see de.hub.clickwatch.analysis.composition.model.impl.CompositionPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__LABEL = ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>EReference0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EREFERENCE0 = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EReference1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EREFERENCE1 = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__OUTGOING = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.analysis.composition.model.impl.EdgeImpl <em>Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.analysis.composition.model.impl.EdgeImpl
	 * @see de.hub.clickwatch.analysis.composition.model.impl.CompositionPackageImpl#getEdge()
	 * @generated
	 */
	int EDGE = 6;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__LABEL = ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__SOURCE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__TARGET = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.analysis.composition.model.impl.TransformationImpl <em>Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.analysis.composition.model.impl.TransformationImpl
	 * @see de.hub.clickwatch.analysis.composition.model.impl.CompositionPackageImpl#getTransformation()
	 * @generated
	 */
	int TRANSFORMATION = 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__LABEL = EDGE__LABEL;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__SOURCE = EDGE__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__TARGET = EDGE__TARGET;

	/**
	 * The feature id for the '<em><b>Transformation Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__TRANSFORMATION_URI = EDGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transformation Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__TRANSFORMATION_FUNCTION = EDGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__KIND = EDGE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Predefined Transformation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__PREDEFINED_TRANSFORMATION = EDGE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__INPUT = EDGE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__OUTPUT = EDGE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Target Spec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__TARGET_SPEC = EDGE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Required Bundle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__REQUIRED_BUNDLE = EDGE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_FEATURE_COUNT = EDGE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.analysis.composition.model.impl.ModelNodeImpl <em>Model Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.analysis.composition.model.impl.ModelNodeImpl
	 * @see de.hub.clickwatch.analysis.composition.model.impl.CompositionPackageImpl#getModelNode()
	 * @generated
	 */
	int MODEL_NODE = 3;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_NODE__LABEL = NODE__LABEL;

	/**
	 * The feature id for the '<em><b>EReference0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_NODE__EREFERENCE0 = NODE__EREFERENCE0;

	/**
	 * The feature id for the '<em><b>EReference1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_NODE__EREFERENCE1 = NODE__EREFERENCE1;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_NODE__OUTGOING = NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Has Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_NODE__HAS_DATA = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Visualization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_NODE__VISUALIZATION = NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Meta Model Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_NODE__META_MODEL_RESOURCE = NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Infered Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_NODE__INFERED_TYPE = NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Meta Model Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_NODE__META_MODEL_CLASS = NODE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Model Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_NODE__MODEL_RESOURCE = NODE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Persistent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_NODE__PERSISTENT = NODE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Registered Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_NODE__REGISTERED_PACKAGE = NODE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Model Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.analysis.composition.model.impl.DataSetNodeImpl <em>Data Set Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.analysis.composition.model.impl.DataSetNodeImpl
	 * @see de.hub.clickwatch.analysis.composition.model.impl.CompositionPackageImpl#getDataSetNode()
	 * @generated
	 */
	int DATA_SET_NODE = 4;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET_NODE__LABEL = NODE__LABEL;

	/**
	 * The feature id for the '<em><b>EReference0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET_NODE__EREFERENCE0 = NODE__EREFERENCE0;

	/**
	 * The feature id for the '<em><b>EReference1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET_NODE__EREFERENCE1 = NODE__EREFERENCE1;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET_NODE__OUTGOING = NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Has Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET_NODE__HAS_DATA = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Visualization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET_NODE__VISUALIZATION = NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET_NODE__DATA = NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Data Set Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.analysis.composition.model.impl.MeasureNodeImpl <em>Measure Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.analysis.composition.model.impl.MeasureNodeImpl
	 * @see de.hub.clickwatch.analysis.composition.model.impl.CompositionPackageImpl#getMeasureNode()
	 * @generated
	 */
	int MEASURE_NODE = 5;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_NODE__LABEL = NODE__LABEL;

	/**
	 * The feature id for the '<em><b>EReference0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_NODE__EREFERENCE0 = NODE__EREFERENCE0;

	/**
	 * The feature id for the '<em><b>EReference1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_NODE__EREFERENCE1 = NODE__EREFERENCE1;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_NODE__OUTGOING = NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Has Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_NODE__HAS_DATA = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Visualization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_NODE__VISUALIZATION = NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_NODE__DATA = NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Measure Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.analysis.composition.model.impl.TimedTransformationImpl <em>Timed Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.analysis.composition.model.impl.TimedTransformationImpl
	 * @see de.hub.clickwatch.analysis.composition.model.impl.CompositionPackageImpl#getTimedTransformation()
	 * @generated
	 */
	int TIMED_TRANSFORMATION = 7;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_TRANSFORMATION__LABEL = EDGE__LABEL;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_TRANSFORMATION__SOURCE = EDGE__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_TRANSFORMATION__TARGET = EDGE__TARGET;

	/**
	 * The feature id for the '<em><b>Transformation Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_TRANSFORMATION__TRANSFORMATION_URI = EDGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transformation Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_TRANSFORMATION__TRANSFORMATION_FUNCTION = EDGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_TRANSFORMATION__KIND = EDGE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Predefined Transformation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_TRANSFORMATION__PREDEFINED_TRANSFORMATION = EDGE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_TRANSFORMATION__INPUT = EDGE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_TRANSFORMATION__OUTPUT = EDGE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Target Spec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_TRANSFORMATION__TARGET_SPEC = EDGE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Required Bundle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_TRANSFORMATION__REQUIRED_BUNDLE = EDGE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Timed Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_TRANSFORMATION_FEATURE_COUNT = EDGE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.analysis.composition.model.impl.VisualizationImpl <em>Visualization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.analysis.composition.model.impl.VisualizationImpl
	 * @see de.hub.clickwatch.analysis.composition.model.impl.CompositionPackageImpl#getVisualization()
	 * @generated
	 */
	int VISUALIZATION = 13;

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.analysis.composition.model.impl.DataNodeImpl <em>Data Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.analysis.composition.model.impl.DataNodeImpl
	 * @see de.hub.clickwatch.analysis.composition.model.impl.CompositionPackageImpl#getDataNode()
	 * @generated
	 */
	int DATA_NODE = 8;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_NODE__LABEL = NODE__LABEL;

	/**
	 * The feature id for the '<em><b>EReference0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_NODE__EREFERENCE0 = NODE__EREFERENCE0;

	/**
	 * The feature id for the '<em><b>EReference1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_NODE__EREFERENCE1 = NODE__EREFERENCE1;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_NODE__OUTGOING = NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Has Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_NODE__HAS_DATA = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Visualization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_NODE__VISUALIZATION = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.analysis.composition.model.impl.CompositionImpl <em>Composition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.analysis.composition.model.impl.CompositionImpl
	 * @see de.hub.clickwatch.analysis.composition.model.impl.CompositionPackageImpl#getComposition()
	 * @generated
	 */
	int COMPOSITION = 9;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__CONTENTS = 0;

	/**
	 * The number of structural features of the '<em>Composition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_FEATURE_COUNT = 1;


	/**
	 * The meta object id for the '{@link de.hub.clickwatch.analysis.composition.model.impl.ParameterSpecImpl <em>Parameter Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.analysis.composition.model.impl.ParameterSpecImpl
	 * @see de.hub.clickwatch.analysis.composition.model.impl.CompositionPackageImpl#getParameterSpec()
	 * @generated
	 */
	int PARAMETER_SPEC = 10;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SPEC__KIND = 0;

	/**
	 * The feature id for the '<em><b>Map Class Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SPEC__MAP_CLASS_KEY = 1;

	/**
	 * The feature id for the '<em><b>List Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SPEC__LIST_QUERY = 2;

	/**
	 * The number of structural features of the '<em>Parameter Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SPEC_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.analysis.composition.model.impl.DataSetImpl <em>Data Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.analysis.composition.model.impl.DataSetImpl
	 * @see de.hub.clickwatch.analysis.composition.model.impl.CompositionPackageImpl#getDataSet()
	 * @generated
	 */
	int DATA_SET = 11;

	/**
	 * The feature id for the '<em><b>Int Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET__INT_VALUES = 0;

	/**
	 * The feature id for the '<em><b>Double Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET__DOUBLE_VALUES = 1;

	/**
	 * The number of structural features of the '<em>Data Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.analysis.composition.model.impl.MeasureImpl <em>Measure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.analysis.composition.model.impl.MeasureImpl
	 * @see de.hub.clickwatch.analysis.composition.model.impl.CompositionPackageImpl#getMeasure()
	 * @generated
	 */
	int MEASURE = 12;

	/**
	 * The feature id for the '<em><b>Int Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__INT_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Double Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__DOUBLE_VALUE = 1;

	/**
	 * The number of structural features of the '<em>Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION__KIND = 0;

	/**
	 * The number of structural features of the '<em>Visualization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.analysis.composition.model.TransformationKind <em>Transformation Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.analysis.composition.model.TransformationKind
	 * @see de.hub.clickwatch.analysis.composition.model.impl.CompositionPackageImpl#getTransformationKind()
	 * @generated
	 */
	int TRANSFORMATION_KIND = 14;

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.analysis.composition.model.TargetSpec <em>Target Spec</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.analysis.composition.model.TargetSpec
	 * @see de.hub.clickwatch.analysis.composition.model.impl.CompositionPackageImpl#getTargetSpec()
	 * @generated
	 */
	int TARGET_SPEC = 15;

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.analysis.composition.model.ParameterSpecKind <em>Parameter Spec Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.analysis.composition.model.ParameterSpecKind
	 * @see de.hub.clickwatch.analysis.composition.model.impl.CompositionPackageImpl#getParameterSpecKind()
	 * @generated
	 */
	int PARAMETER_SPEC_KIND = 16;

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.analysis.composition.model.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see de.hub.clickwatch.analysis.composition.model.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the reference '{@link de.hub.clickwatch.analysis.composition.model.Node#getEReference0 <em>EReference0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EReference0</em>'.
	 * @see de.hub.clickwatch.analysis.composition.model.Node#getEReference0()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_EReference0();

	/**
	 * Returns the meta object for the reference '{@link de.hub.clickwatch.analysis.composition.model.Node#getEReference1 <em>EReference1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EReference1</em>'.
	 * @see de.hub.clickwatch.analysis.composition.model.Node#getEReference1()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_EReference1();

	/**
	 * Returns the meta object for the reference list '{@link de.hub.clickwatch.analysis.composition.model.Node#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing</em>'.
	 * @see de.hub.clickwatch.analysis.composition.model.Node#getOutgoing()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Outgoing();

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.analysis.composition.model.Transformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformation</em>'.
	 * @see de.hub.clickwatch.analysis.composition.model.Transformation
	 * @generated
	 */
	EClass getTransformation();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.analysis.composition.model.Transformation#getTransformationUri <em>Transformation Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transformation Uri</em>'.
	 * @see de.hub.clickwatch.analysis.composition.model.Transformation#getTransformationUri()
	 * @see #getTransformation()
	 * @generated
	 */
	EAttribute getTransformation_TransformationUri();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.analysis.composition.model.Transformation#getTransformationFunction <em>Transformation Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transformation Function</em>'.
	 * @see de.hub.clickwatch.analysis.composition.model.Transformation#getTransformationFunction()
	 * @see #getTransformation()
	 * @generated
	 */
	EAttribute getTransformation_TransformationFunction();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.analysis.composition.model.Transformation#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see de.hub.clickwatch.analysis.composition.model.Transformation#getKind()
	 * @see #getTransformation()
	 * @generated
	 */
	EAttribute getTransformation_Kind();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.analysis.composition.model.Transformation#getPredefinedTransformation <em>Predefined Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Predefined Transformation</em>'.
	 * @see de.hub.clickwatch.analysis.composition.model.Transformation#getPredefinedTransformation()
	 * @see #getTransformation()
	 * @generated
	 */
	EAttribute getTransformation_PredefinedTransformation();

	/**
	 * Returns the meta object for the containment reference '{@link de.hub.clickwatch.analysis.composition.model.Transformation#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input</em>'.
	 * @see de.hub.clickwatch.analysis.composition.model.Transformation#getInput()
	 * @see #getTransformation()
	 * @generated
	 */
	EReference getTransformation_Input();

	/**
	 * Returns the meta object for the containment reference '{@link de.hub.clickwatch.analysis.composition.model.Transformation#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output</em>'.
	 * @see de.hub.clickwatch.analysis.composition.model.Transformation#getOutput()
	 * @see #getTransformation()
	 * @generated
	 */
	EReference getTransformation_Output();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.analysis.composition.model.Transformation#getTargetSpec <em>Target Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Spec</em>'.
	 * @see de.hub.clickwatch.analysis.composition.model.Transformation#getTargetSpec()
	 * @see #getTransformation()
	 * @generated
	 */
	EAttribute getTransformation_TargetSpec();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.analysis.composition.model.Transformation#getRequiredBundle <em>Required Bundle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required Bundle</em>'.
	 * @see de.hub.clickwatch.analysis.composition.model.Transformation#getRequiredBundle()
	 * @see #getTransformation()
	 * @generated
	 */
	EAttribute getTransformation_RequiredBundle();

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.analysis.composition.model.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see de.hub.clickwatch.analysis.composition.model.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.analysis.composition.model.Element#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see de.hub.clickwatch.analysis.composition.model.Element#getLabel()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Label();

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.analysis.composition.model.ModelNode <em>Model Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Node</em>'.
	 * @see de.hub.clickwatch.analysis.composition.model.ModelNode
	 * @generated
	 */
	EClass getModelNode();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.analysis.composition.model.ModelNode#getMetaModelResource <em>Meta Model Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Meta Model Resource</em>'.
	 * @see de.hub.clickwatch.analysis.composition.model.ModelNode#getMetaModelResource()
	 * @see #getModelNode()
	 * @generated
	 */
	EAttribute getModelNode_MetaModelResource();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.analysis.composition.model.ModelNode#isInferedType <em>Infered Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Infered Type</em>'.
	 * @see de.hub.clickwatch.analysis.composition.model.ModelNode#isInferedType()
	 * @see #getModelNode()
	 * @generated
	 */
	EAttribute getModelNode_InferedType();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.analysis.composition.model.ModelNode#getMetaModelClass <em>Meta Model Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Meta Model Class</em>'.
	 * @see de.hub.clickwatch.analysis.composition.model.ModelNode#getMetaModelClass()
	 * @see #getModelNode()
	 * @generated
	 */
	EAttribute getModelNode_MetaModelClass();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.analysis.composition.model.ModelNode#getModelResource <em>Model Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Resource</em>'.
	 * @see de.hub.clickwatch.analysis.composition.model.ModelNode#getModelResource()
	 * @see #getModelNode()
	 * @generated
	 */
	EAttribute getModelNode_ModelResource();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.analysis.composition.model.ModelNode#isPersistent <em>Persistent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Persistent</em>'.
	 * @see de.hub.clickwatch.analysis.composition.model.ModelNode#isPersistent()
	 * @see #getModelNode()
	 * @generated
	 */
	EAttribute getModelNode_Persistent();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.analysis.composition.model.ModelNode#getRegisteredPackage <em>Registered Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Registered Package</em>'.
	 * @see de.hub.clickwatch.analysis.composition.model.ModelNode#getRegisteredPackage()
	 * @see #getModelNode()
	 * @generated
	 */
	EAttribute getModelNode_RegisteredPackage();

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.analysis.composition.model.DataSetNode <em>Data Set Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Set Node</em>'.
	 * @see de.hub.clickwatch.analysis.composition.model.DataSetNode
	 * @generated
	 */
	EClass getDataSetNode();

	/**
	 * Returns the meta object for the containment reference '{@link de.hub.clickwatch.analysis.composition.model.DataSetNode#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data</em>'.
	 * @see de.hub.clickwatch.analysis.composition.model.DataSetNode#getData()
	 * @see #getDataSetNode()
	 * @generated
	 */
	EReference getDataSetNode_Data();

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.analysis.composition.model.MeasureNode <em>Measure Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measure Node</em>'.
	 * @see de.hub.clickwatch.analysis.composition.model.MeasureNode
	 * @generated
	 */
	EClass getMeasureNode();

	/**
	 * Returns the meta object for the reference '{@link de.hub.clickwatch.analysis.composition.model.MeasureNode#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data</em>'.
	 * @see de.hub.clickwatch.analysis.composition.model.MeasureNode#getData()
	 * @see #getMeasureNode()
	 * @generated
	 */
	EReference getMeasureNode_Data();

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.analysis.composition.model.Edge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge</em>'.
	 * @see de.hub.clickwatch.analysis.composition.model.Edge
	 * @generated
	 */
	EClass getEdge();

	/**
	 * Returns the meta object for the reference '{@link de.hub.clickwatch.analysis.composition.model.Edge#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see de.hub.clickwatch.analysis.composition.model.Edge#getSource()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_Source();

	/**
	 * Returns the meta object for the reference '{@link de.hub.clickwatch.analysis.composition.model.Edge#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see de.hub.clickwatch.analysis.composition.model.Edge#getTarget()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_Target();

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.analysis.composition.model.TimedTransformation <em>Timed Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timed Transformation</em>'.
	 * @see de.hub.clickwatch.analysis.composition.model.TimedTransformation
	 * @generated
	 */
	EClass getTimedTransformation();

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.analysis.composition.model.Visualization <em>Visualization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Visualization</em>'.
	 * @see de.hub.clickwatch.analysis.composition.model.Visualization
	 * @generated
	 */
	EClass getVisualization();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.analysis.composition.model.Visualization#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see de.hub.clickwatch.analysis.composition.model.Visualization#getKind()
	 * @see #getVisualization()
	 * @generated
	 */
	EAttribute getVisualization_Kind();

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.analysis.composition.model.DataNode <em>Data Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Node</em>'.
	 * @see de.hub.clickwatch.analysis.composition.model.DataNode
	 * @generated
	 */
	EClass getDataNode();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.analysis.composition.model.DataNode#isHasData <em>Has Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Data</em>'.
	 * @see de.hub.clickwatch.analysis.composition.model.DataNode#isHasData()
	 * @see #getDataNode()
	 * @generated
	 */
	EAttribute getDataNode_HasData();

	/**
	 * Returns the meta object for the containment reference '{@link de.hub.clickwatch.analysis.composition.model.DataNode#getVisualization <em>Visualization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Visualization</em>'.
	 * @see de.hub.clickwatch.analysis.composition.model.DataNode#getVisualization()
	 * @see #getDataNode()
	 * @generated
	 */
	EReference getDataNode_Visualization();

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.analysis.composition.model.Composition <em>Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composition</em>'.
	 * @see de.hub.clickwatch.analysis.composition.model.Composition
	 * @generated
	 */
	EClass getComposition();

	/**
	 * Returns the meta object for the containment reference list '{@link de.hub.clickwatch.analysis.composition.model.Composition#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contents</em>'.
	 * @see de.hub.clickwatch.analysis.composition.model.Composition#getContents()
	 * @see #getComposition()
	 * @generated
	 */
	EReference getComposition_Contents();

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.analysis.composition.model.ParameterSpec <em>Parameter Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Spec</em>'.
	 * @see de.hub.clickwatch.analysis.composition.model.ParameterSpec
	 * @generated
	 */
	EClass getParameterSpec();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.analysis.composition.model.ParameterSpec#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see de.hub.clickwatch.analysis.composition.model.ParameterSpec#getKind()
	 * @see #getParameterSpec()
	 * @generated
	 */
	EAttribute getParameterSpec_Kind();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.analysis.composition.model.ParameterSpec#getMapClassKey <em>Map Class Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Map Class Key</em>'.
	 * @see de.hub.clickwatch.analysis.composition.model.ParameterSpec#getMapClassKey()
	 * @see #getParameterSpec()
	 * @generated
	 */
	EAttribute getParameterSpec_MapClassKey();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.analysis.composition.model.ParameterSpec#getListQuery <em>List Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>List Query</em>'.
	 * @see de.hub.clickwatch.analysis.composition.model.ParameterSpec#getListQuery()
	 * @see #getParameterSpec()
	 * @generated
	 */
	EAttribute getParameterSpec_ListQuery();

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.analysis.composition.model.DataSet <em>Data Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Set</em>'.
	 * @see de.hub.clickwatch.analysis.composition.model.DataSet
	 * @generated
	 */
	EClass getDataSet();

	/**
	 * Returns the meta object for the attribute list '{@link de.hub.clickwatch.analysis.composition.model.DataSet#getIntValues <em>Int Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Int Values</em>'.
	 * @see de.hub.clickwatch.analysis.composition.model.DataSet#getIntValues()
	 * @see #getDataSet()
	 * @generated
	 */
	EAttribute getDataSet_IntValues();

	/**
	 * Returns the meta object for the attribute list '{@link de.hub.clickwatch.analysis.composition.model.DataSet#getDoubleValues <em>Double Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Double Values</em>'.
	 * @see de.hub.clickwatch.analysis.composition.model.DataSet#getDoubleValues()
	 * @see #getDataSet()
	 * @generated
	 */
	EAttribute getDataSet_DoubleValues();

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.analysis.composition.model.Measure <em>Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measure</em>'.
	 * @see de.hub.clickwatch.analysis.composition.model.Measure
	 * @generated
	 */
	EClass getMeasure();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.analysis.composition.model.Measure#getIntValue <em>Int Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Int Value</em>'.
	 * @see de.hub.clickwatch.analysis.composition.model.Measure#getIntValue()
	 * @see #getMeasure()
	 * @generated
	 */
	EAttribute getMeasure_IntValue();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.analysis.composition.model.Measure#getDoubleValue <em>Double Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Double Value</em>'.
	 * @see de.hub.clickwatch.analysis.composition.model.Measure#getDoubleValue()
	 * @see #getMeasure()
	 * @generated
	 */
	EAttribute getMeasure_DoubleValue();

	/**
	 * Returns the meta object for enum '{@link de.hub.clickwatch.analysis.composition.model.TransformationKind <em>Transformation Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Transformation Kind</em>'.
	 * @see de.hub.clickwatch.analysis.composition.model.TransformationKind
	 * @generated
	 */
	EEnum getTransformationKind();

	/**
	 * Returns the meta object for enum '{@link de.hub.clickwatch.analysis.composition.model.TargetSpec <em>Target Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Target Spec</em>'.
	 * @see de.hub.clickwatch.analysis.composition.model.TargetSpec
	 * @generated
	 */
	EEnum getTargetSpec();

	/**
	 * Returns the meta object for enum '{@link de.hub.clickwatch.analysis.composition.model.ParameterSpecKind <em>Parameter Spec Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Parameter Spec Kind</em>'.
	 * @see de.hub.clickwatch.analysis.composition.model.ParameterSpecKind
	 * @generated
	 */
	EEnum getParameterSpecKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CompositionFactory getCompositionFactory();

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
		 * The meta object literal for the '{@link de.hub.clickwatch.analysis.composition.model.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.analysis.composition.model.impl.NodeImpl
		 * @see de.hub.clickwatch.analysis.composition.model.impl.CompositionPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>EReference0</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__EREFERENCE0 = eINSTANCE.getNode_EReference0();

		/**
		 * The meta object literal for the '<em><b>EReference1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__EREFERENCE1 = eINSTANCE.getNode_EReference1();

		/**
		 * The meta object literal for the '<em><b>Outgoing</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__OUTGOING = eINSTANCE.getNode_Outgoing();

		/**
		 * The meta object literal for the '{@link de.hub.clickwatch.analysis.composition.model.impl.TransformationImpl <em>Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.analysis.composition.model.impl.TransformationImpl
		 * @see de.hub.clickwatch.analysis.composition.model.impl.CompositionPackageImpl#getTransformation()
		 * @generated
		 */
		EClass TRANSFORMATION = eINSTANCE.getTransformation();

		/**
		 * The meta object literal for the '<em><b>Transformation Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION__TRANSFORMATION_URI = eINSTANCE.getTransformation_TransformationUri();

		/**
		 * The meta object literal for the '<em><b>Transformation Function</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION__TRANSFORMATION_FUNCTION = eINSTANCE.getTransformation_TransformationFunction();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION__KIND = eINSTANCE.getTransformation_Kind();

		/**
		 * The meta object literal for the '<em><b>Predefined Transformation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION__PREDEFINED_TRANSFORMATION = eINSTANCE.getTransformation_PredefinedTransformation();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION__INPUT = eINSTANCE.getTransformation_Input();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION__OUTPUT = eINSTANCE.getTransformation_Output();

		/**
		 * The meta object literal for the '<em><b>Target Spec</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION__TARGET_SPEC = eINSTANCE.getTransformation_TargetSpec();

		/**
		 * The meta object literal for the '<em><b>Required Bundle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION__REQUIRED_BUNDLE = eINSTANCE.getTransformation_RequiredBundle();

		/**
		 * The meta object literal for the '{@link de.hub.clickwatch.analysis.composition.model.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.analysis.composition.model.impl.ElementImpl
		 * @see de.hub.clickwatch.analysis.composition.model.impl.CompositionPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__LABEL = eINSTANCE.getElement_Label();

		/**
		 * The meta object literal for the '{@link de.hub.clickwatch.analysis.composition.model.impl.ModelNodeImpl <em>Model Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.analysis.composition.model.impl.ModelNodeImpl
		 * @see de.hub.clickwatch.analysis.composition.model.impl.CompositionPackageImpl#getModelNode()
		 * @generated
		 */
		EClass MODEL_NODE = eINSTANCE.getModelNode();

		/**
		 * The meta object literal for the '<em><b>Meta Model Resource</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_NODE__META_MODEL_RESOURCE = eINSTANCE.getModelNode_MetaModelResource();

		/**
		 * The meta object literal for the '<em><b>Infered Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_NODE__INFERED_TYPE = eINSTANCE.getModelNode_InferedType();

		/**
		 * The meta object literal for the '<em><b>Meta Model Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_NODE__META_MODEL_CLASS = eINSTANCE.getModelNode_MetaModelClass();

		/**
		 * The meta object literal for the '<em><b>Model Resource</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_NODE__MODEL_RESOURCE = eINSTANCE.getModelNode_ModelResource();

		/**
		 * The meta object literal for the '<em><b>Persistent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_NODE__PERSISTENT = eINSTANCE.getModelNode_Persistent();

		/**
		 * The meta object literal for the '<em><b>Registered Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_NODE__REGISTERED_PACKAGE = eINSTANCE.getModelNode_RegisteredPackage();

		/**
		 * The meta object literal for the '{@link de.hub.clickwatch.analysis.composition.model.impl.DataSetNodeImpl <em>Data Set Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.analysis.composition.model.impl.DataSetNodeImpl
		 * @see de.hub.clickwatch.analysis.composition.model.impl.CompositionPackageImpl#getDataSetNode()
		 * @generated
		 */
		EClass DATA_SET_NODE = eINSTANCE.getDataSetNode();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SET_NODE__DATA = eINSTANCE.getDataSetNode_Data();

		/**
		 * The meta object literal for the '{@link de.hub.clickwatch.analysis.composition.model.impl.MeasureNodeImpl <em>Measure Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.analysis.composition.model.impl.MeasureNodeImpl
		 * @see de.hub.clickwatch.analysis.composition.model.impl.CompositionPackageImpl#getMeasureNode()
		 * @generated
		 */
		EClass MEASURE_NODE = eINSTANCE.getMeasureNode();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURE_NODE__DATA = eINSTANCE.getMeasureNode_Data();

		/**
		 * The meta object literal for the '{@link de.hub.clickwatch.analysis.composition.model.impl.EdgeImpl <em>Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.analysis.composition.model.impl.EdgeImpl
		 * @see de.hub.clickwatch.analysis.composition.model.impl.CompositionPackageImpl#getEdge()
		 * @generated
		 */
		EClass EDGE = eINSTANCE.getEdge();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__SOURCE = eINSTANCE.getEdge_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__TARGET = eINSTANCE.getEdge_Target();

		/**
		 * The meta object literal for the '{@link de.hub.clickwatch.analysis.composition.model.impl.TimedTransformationImpl <em>Timed Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.analysis.composition.model.impl.TimedTransformationImpl
		 * @see de.hub.clickwatch.analysis.composition.model.impl.CompositionPackageImpl#getTimedTransformation()
		 * @generated
		 */
		EClass TIMED_TRANSFORMATION = eINSTANCE.getTimedTransformation();

		/**
		 * The meta object literal for the '{@link de.hub.clickwatch.analysis.composition.model.impl.VisualizationImpl <em>Visualization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.analysis.composition.model.impl.VisualizationImpl
		 * @see de.hub.clickwatch.analysis.composition.model.impl.CompositionPackageImpl#getVisualization()
		 * @generated
		 */
		EClass VISUALIZATION = eINSTANCE.getVisualization();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISUALIZATION__KIND = eINSTANCE.getVisualization_Kind();

		/**
		 * The meta object literal for the '{@link de.hub.clickwatch.analysis.composition.model.impl.DataNodeImpl <em>Data Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.analysis.composition.model.impl.DataNodeImpl
		 * @see de.hub.clickwatch.analysis.composition.model.impl.CompositionPackageImpl#getDataNode()
		 * @generated
		 */
		EClass DATA_NODE = eINSTANCE.getDataNode();

		/**
		 * The meta object literal for the '<em><b>Has Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_NODE__HAS_DATA = eINSTANCE.getDataNode_HasData();

		/**
		 * The meta object literal for the '<em><b>Visualization</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_NODE__VISUALIZATION = eINSTANCE.getDataNode_Visualization();

		/**
		 * The meta object literal for the '{@link de.hub.clickwatch.analysis.composition.model.impl.CompositionImpl <em>Composition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.analysis.composition.model.impl.CompositionImpl
		 * @see de.hub.clickwatch.analysis.composition.model.impl.CompositionPackageImpl#getComposition()
		 * @generated
		 */
		EClass COMPOSITION = eINSTANCE.getComposition();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITION__CONTENTS = eINSTANCE.getComposition_Contents();

		/**
		 * The meta object literal for the '{@link de.hub.clickwatch.analysis.composition.model.impl.ParameterSpecImpl <em>Parameter Spec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.analysis.composition.model.impl.ParameterSpecImpl
		 * @see de.hub.clickwatch.analysis.composition.model.impl.CompositionPackageImpl#getParameterSpec()
		 * @generated
		 */
		EClass PARAMETER_SPEC = eINSTANCE.getParameterSpec();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_SPEC__KIND = eINSTANCE.getParameterSpec_Kind();

		/**
		 * The meta object literal for the '<em><b>Map Class Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_SPEC__MAP_CLASS_KEY = eINSTANCE.getParameterSpec_MapClassKey();

		/**
		 * The meta object literal for the '<em><b>List Query</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_SPEC__LIST_QUERY = eINSTANCE.getParameterSpec_ListQuery();

		/**
		 * The meta object literal for the '{@link de.hub.clickwatch.analysis.composition.model.impl.DataSetImpl <em>Data Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.analysis.composition.model.impl.DataSetImpl
		 * @see de.hub.clickwatch.analysis.composition.model.impl.CompositionPackageImpl#getDataSet()
		 * @generated
		 */
		EClass DATA_SET = eINSTANCE.getDataSet();

		/**
		 * The meta object literal for the '<em><b>Int Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SET__INT_VALUES = eINSTANCE.getDataSet_IntValues();

		/**
		 * The meta object literal for the '<em><b>Double Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SET__DOUBLE_VALUES = eINSTANCE.getDataSet_DoubleValues();

		/**
		 * The meta object literal for the '{@link de.hub.clickwatch.analysis.composition.model.impl.MeasureImpl <em>Measure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.analysis.composition.model.impl.MeasureImpl
		 * @see de.hub.clickwatch.analysis.composition.model.impl.CompositionPackageImpl#getMeasure()
		 * @generated
		 */
		EClass MEASURE = eINSTANCE.getMeasure();

		/**
		 * The meta object literal for the '<em><b>Int Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASURE__INT_VALUE = eINSTANCE.getMeasure_IntValue();

		/**
		 * The meta object literal for the '<em><b>Double Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASURE__DOUBLE_VALUE = eINSTANCE.getMeasure_DoubleValue();

		/**
		 * The meta object literal for the '{@link de.hub.clickwatch.analysis.composition.model.TransformationKind <em>Transformation Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.analysis.composition.model.TransformationKind
		 * @see de.hub.clickwatch.analysis.composition.model.impl.CompositionPackageImpl#getTransformationKind()
		 * @generated
		 */
		EEnum TRANSFORMATION_KIND = eINSTANCE.getTransformationKind();

		/**
		 * The meta object literal for the '{@link de.hub.clickwatch.analysis.composition.model.TargetSpec <em>Target Spec</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.analysis.composition.model.TargetSpec
		 * @see de.hub.clickwatch.analysis.composition.model.impl.CompositionPackageImpl#getTargetSpec()
		 * @generated
		 */
		EEnum TARGET_SPEC = eINSTANCE.getTargetSpec();

		/**
		 * The meta object literal for the '{@link de.hub.clickwatch.analysis.composition.model.ParameterSpecKind <em>Parameter Spec Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.analysis.composition.model.ParameterSpecKind
		 * @see de.hub.clickwatch.analysis.composition.model.impl.CompositionPackageImpl#getParameterSpecKind()
		 * @generated
		 */
		EEnum PARAMETER_SPEC_KIND = eINSTANCE.getParameterSpecKind();

	}

} //CompositionPackage
