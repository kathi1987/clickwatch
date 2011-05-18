/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package edu.hu.clickwatch.analysis.composition.model;

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
 * @see edu.hu.clickwatch.analysis.composition.model.CompositionFactory
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
	String eNS_URI = "http://compositionmodel/1.0";

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
	CompositionPackage eINSTANCE = edu.hu.clickwatch.analysis.composition.model.impl.CompositionPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.hu.clickwatch.analysis.composition.model.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.hu.clickwatch.analysis.composition.model.impl.ElementImpl
	 * @see edu.hu.clickwatch.analysis.composition.model.impl.CompositionPackageImpl#getElement()
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
	 * The meta object id for the '{@link edu.hu.clickwatch.analysis.composition.model.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.hu.clickwatch.analysis.composition.model.impl.NodeImpl
	 * @see edu.hu.clickwatch.analysis.composition.model.impl.CompositionPackageImpl#getNode()
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
	 * The meta object id for the '{@link edu.hu.clickwatch.analysis.composition.model.impl.EdgeImpl <em>Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.hu.clickwatch.analysis.composition.model.impl.EdgeImpl
	 * @see edu.hu.clickwatch.analysis.composition.model.impl.CompositionPackageImpl#getEdge()
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
	 * The meta object id for the '{@link edu.hu.clickwatch.analysis.composition.model.impl.TransformationImpl <em>Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.hu.clickwatch.analysis.composition.model.impl.TransformationImpl
	 * @see edu.hu.clickwatch.analysis.composition.model.impl.CompositionPackageImpl#getTransformation()
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
	 * The number of structural features of the '<em>Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_FEATURE_COUNT = EDGE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link edu.hu.clickwatch.analysis.composition.model.impl.ModelNodeImpl <em>Model Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.hu.clickwatch.analysis.composition.model.impl.ModelNodeImpl
	 * @see edu.hu.clickwatch.analysis.composition.model.impl.CompositionPackageImpl#getModelNode()
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
	 * The feature id for the '<em><b>Meta Model Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_NODE__META_MODEL_RESOURCE = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Infered Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_NODE__INFERED_TYPE = NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Meta Model Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_NODE__META_MODEL_CLASS = NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Model Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_NODE__MODEL_RESOURCE = NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Persistent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_NODE__PERSISTENT = NODE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Has Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_NODE__HAS_MODEL = NODE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Model Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link edu.hu.clickwatch.analysis.composition.model.impl.DataSetNodeImpl <em>Data Set Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.hu.clickwatch.analysis.composition.model.impl.DataSetNodeImpl
	 * @see edu.hu.clickwatch.analysis.composition.model.impl.CompositionPackageImpl#getDataSetNode()
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
	 * The number of structural features of the '<em>Data Set Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.hu.clickwatch.analysis.composition.model.impl.MeasureNodeImpl <em>Measure Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.hu.clickwatch.analysis.composition.model.impl.MeasureNodeImpl
	 * @see edu.hu.clickwatch.analysis.composition.model.impl.CompositionPackageImpl#getMeasureNode()
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
	 * The number of structural features of the '<em>Measure Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.hu.clickwatch.analysis.composition.model.impl.TimedTransformationImpl <em>Timed Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.hu.clickwatch.analysis.composition.model.impl.TimedTransformationImpl
	 * @see edu.hu.clickwatch.analysis.composition.model.impl.CompositionPackageImpl#getTimedTransformation()
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
	 * The number of structural features of the '<em>Timed Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_TRANSFORMATION_FEATURE_COUNT = EDGE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link edu.hu.clickwatch.analysis.composition.model.impl.MappedTransformationImpl <em>Mapped Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.hu.clickwatch.analysis.composition.model.impl.MappedTransformationImpl
	 * @see edu.hu.clickwatch.analysis.composition.model.impl.CompositionPackageImpl#getMappedTransformation()
	 * @generated
	 */
	int MAPPED_TRANSFORMATION = 8;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_TRANSFORMATION__LABEL = EDGE__LABEL;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_TRANSFORMATION__SOURCE = EDGE__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_TRANSFORMATION__TARGET = EDGE__TARGET;

	/**
	 * The feature id for the '<em><b>Transformation Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_TRANSFORMATION__TRANSFORMATION_URI = EDGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transformation Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_TRANSFORMATION__TRANSFORMATION_FUNCTION = EDGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_TRANSFORMATION__KIND = EDGE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Predefined Transformation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_TRANSFORMATION__PREDEFINED_TRANSFORMATION = EDGE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Mapped Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_TRANSFORMATION_FEATURE_COUNT = EDGE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link edu.hu.clickwatch.analysis.composition.model.impl.VisualizationImpl <em>Visualization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.hu.clickwatch.analysis.composition.model.impl.VisualizationImpl
	 * @see edu.hu.clickwatch.analysis.composition.model.impl.CompositionPackageImpl#getVisualization()
	 * @generated
	 */
	int VISUALIZATION = 9;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION__LABEL = NODE__LABEL;

	/**
	 * The feature id for the '<em><b>EReference0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION__EREFERENCE0 = NODE__EREFERENCE0;

	/**
	 * The feature id for the '<em><b>EReference1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION__EREFERENCE1 = NODE__EREFERENCE1;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION__OUTGOING = NODE__OUTGOING;

	/**
	 * The number of structural features of the '<em>Visualization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.hu.clickwatch.analysis.composition.model.impl.VisualizerImpl <em>Visualizer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.hu.clickwatch.analysis.composition.model.impl.VisualizerImpl
	 * @see edu.hu.clickwatch.analysis.composition.model.impl.CompositionPackageImpl#getVisualizer()
	 * @generated
	 */
	int VISUALIZER = 10;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZER__LABEL = EDGE__LABEL;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZER__SOURCE = EDGE__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZER__TARGET = EDGE__TARGET;

	/**
	 * The number of structural features of the '<em>Visualizer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZER_FEATURE_COUNT = EDGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.hu.clickwatch.analysis.composition.model.impl.DataNodeImpl <em>Data Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.hu.clickwatch.analysis.composition.model.impl.DataNodeImpl
	 * @see edu.hu.clickwatch.analysis.composition.model.impl.CompositionPackageImpl#getDataNode()
	 * @generated
	 */
	int DATA_NODE = 11;

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
	 * The number of structural features of the '<em>Data Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.hu.clickwatch.analysis.composition.model.impl.CompositionImpl <em>Composition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.hu.clickwatch.analysis.composition.model.impl.CompositionImpl
	 * @see edu.hu.clickwatch.analysis.composition.model.impl.CompositionPackageImpl#getComposition()
	 * @generated
	 */
	int COMPOSITION = 12;

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
	 * The meta object id for the '{@link edu.hu.clickwatch.analysis.composition.model.TransformationKind <em>Transformation Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.hu.clickwatch.analysis.composition.model.TransformationKind
	 * @see edu.hu.clickwatch.analysis.composition.model.impl.CompositionPackageImpl#getTransformationKind()
	 * @generated
	 */
	int TRANSFORMATION_KIND = 13;

	/**
	 * Returns the meta object for class '{@link edu.hu.clickwatch.analysis.composition.model.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see edu.hu.clickwatch.analysis.composition.model.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the reference '{@link edu.hu.clickwatch.analysis.composition.model.Node#getEReference0 <em>EReference0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EReference0</em>'.
	 * @see edu.hu.clickwatch.analysis.composition.model.Node#getEReference0()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_EReference0();

	/**
	 * Returns the meta object for the reference '{@link edu.hu.clickwatch.analysis.composition.model.Node#getEReference1 <em>EReference1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EReference1</em>'.
	 * @see edu.hu.clickwatch.analysis.composition.model.Node#getEReference1()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_EReference1();

	/**
	 * Returns the meta object for the reference list '{@link edu.hu.clickwatch.analysis.composition.model.Node#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing</em>'.
	 * @see edu.hu.clickwatch.analysis.composition.model.Node#getOutgoing()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Outgoing();

	/**
	 * Returns the meta object for class '{@link edu.hu.clickwatch.analysis.composition.model.Transformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformation</em>'.
	 * @see edu.hu.clickwatch.analysis.composition.model.Transformation
	 * @generated
	 */
	EClass getTransformation();

	/**
	 * Returns the meta object for the attribute '{@link edu.hu.clickwatch.analysis.composition.model.Transformation#getTransformationUri <em>Transformation Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transformation Uri</em>'.
	 * @see edu.hu.clickwatch.analysis.composition.model.Transformation#getTransformationUri()
	 * @see #getTransformation()
	 * @generated
	 */
	EAttribute getTransformation_TransformationUri();

	/**
	 * Returns the meta object for the attribute '{@link edu.hu.clickwatch.analysis.composition.model.Transformation#getTransformationFunction <em>Transformation Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transformation Function</em>'.
	 * @see edu.hu.clickwatch.analysis.composition.model.Transformation#getTransformationFunction()
	 * @see #getTransformation()
	 * @generated
	 */
	EAttribute getTransformation_TransformationFunction();

	/**
	 * Returns the meta object for the attribute '{@link edu.hu.clickwatch.analysis.composition.model.Transformation#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see edu.hu.clickwatch.analysis.composition.model.Transformation#getKind()
	 * @see #getTransformation()
	 * @generated
	 */
	EAttribute getTransformation_Kind();

	/**
	 * Returns the meta object for the attribute '{@link edu.hu.clickwatch.analysis.composition.model.Transformation#getPredefinedTransformation <em>Predefined Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Predefined Transformation</em>'.
	 * @see edu.hu.clickwatch.analysis.composition.model.Transformation#getPredefinedTransformation()
	 * @see #getTransformation()
	 * @generated
	 */
	EAttribute getTransformation_PredefinedTransformation();

	/**
	 * Returns the meta object for class '{@link edu.hu.clickwatch.analysis.composition.model.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see edu.hu.clickwatch.analysis.composition.model.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the attribute '{@link edu.hu.clickwatch.analysis.composition.model.Element#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see edu.hu.clickwatch.analysis.composition.model.Element#getLabel()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Label();

	/**
	 * Returns the meta object for class '{@link edu.hu.clickwatch.analysis.composition.model.ModelNode <em>Model Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Node</em>'.
	 * @see edu.hu.clickwatch.analysis.composition.model.ModelNode
	 * @generated
	 */
	EClass getModelNode();

	/**
	 * Returns the meta object for the attribute '{@link edu.hu.clickwatch.analysis.composition.model.ModelNode#getMetaModelResource <em>Meta Model Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Meta Model Resource</em>'.
	 * @see edu.hu.clickwatch.analysis.composition.model.ModelNode#getMetaModelResource()
	 * @see #getModelNode()
	 * @generated
	 */
	EAttribute getModelNode_MetaModelResource();

	/**
	 * Returns the meta object for the attribute '{@link edu.hu.clickwatch.analysis.composition.model.ModelNode#isInferedType <em>Infered Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Infered Type</em>'.
	 * @see edu.hu.clickwatch.analysis.composition.model.ModelNode#isInferedType()
	 * @see #getModelNode()
	 * @generated
	 */
	EAttribute getModelNode_InferedType();

	/**
	 * Returns the meta object for the attribute '{@link edu.hu.clickwatch.analysis.composition.model.ModelNode#getMetaModelClass <em>Meta Model Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Meta Model Class</em>'.
	 * @see edu.hu.clickwatch.analysis.composition.model.ModelNode#getMetaModelClass()
	 * @see #getModelNode()
	 * @generated
	 */
	EAttribute getModelNode_MetaModelClass();

	/**
	 * Returns the meta object for the attribute '{@link edu.hu.clickwatch.analysis.composition.model.ModelNode#getModelResource <em>Model Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Resource</em>'.
	 * @see edu.hu.clickwatch.analysis.composition.model.ModelNode#getModelResource()
	 * @see #getModelNode()
	 * @generated
	 */
	EAttribute getModelNode_ModelResource();

	/**
	 * Returns the meta object for the attribute '{@link edu.hu.clickwatch.analysis.composition.model.ModelNode#isPersistent <em>Persistent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Persistent</em>'.
	 * @see edu.hu.clickwatch.analysis.composition.model.ModelNode#isPersistent()
	 * @see #getModelNode()
	 * @generated
	 */
	EAttribute getModelNode_Persistent();

	/**
	 * Returns the meta object for the attribute '{@link edu.hu.clickwatch.analysis.composition.model.ModelNode#isHasModel <em>Has Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Model</em>'.
	 * @see edu.hu.clickwatch.analysis.composition.model.ModelNode#isHasModel()
	 * @see #getModelNode()
	 * @generated
	 */
	EAttribute getModelNode_HasModel();

	/**
	 * Returns the meta object for class '{@link edu.hu.clickwatch.analysis.composition.model.DataSetNode <em>Data Set Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Set Node</em>'.
	 * @see edu.hu.clickwatch.analysis.composition.model.DataSetNode
	 * @generated
	 */
	EClass getDataSetNode();

	/**
	 * Returns the meta object for class '{@link edu.hu.clickwatch.analysis.composition.model.MeasureNode <em>Measure Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measure Node</em>'.
	 * @see edu.hu.clickwatch.analysis.composition.model.MeasureNode
	 * @generated
	 */
	EClass getMeasureNode();

	/**
	 * Returns the meta object for class '{@link edu.hu.clickwatch.analysis.composition.model.Edge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge</em>'.
	 * @see edu.hu.clickwatch.analysis.composition.model.Edge
	 * @generated
	 */
	EClass getEdge();

	/**
	 * Returns the meta object for the reference '{@link edu.hu.clickwatch.analysis.composition.model.Edge#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see edu.hu.clickwatch.analysis.composition.model.Edge#getSource()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_Source();

	/**
	 * Returns the meta object for the reference '{@link edu.hu.clickwatch.analysis.composition.model.Edge#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see edu.hu.clickwatch.analysis.composition.model.Edge#getTarget()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_Target();

	/**
	 * Returns the meta object for class '{@link edu.hu.clickwatch.analysis.composition.model.TimedTransformation <em>Timed Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timed Transformation</em>'.
	 * @see edu.hu.clickwatch.analysis.composition.model.TimedTransformation
	 * @generated
	 */
	EClass getTimedTransformation();

	/**
	 * Returns the meta object for class '{@link edu.hu.clickwatch.analysis.composition.model.MappedTransformation <em>Mapped Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapped Transformation</em>'.
	 * @see edu.hu.clickwatch.analysis.composition.model.MappedTransformation
	 * @generated
	 */
	EClass getMappedTransformation();

	/**
	 * Returns the meta object for class '{@link edu.hu.clickwatch.analysis.composition.model.Visualization <em>Visualization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Visualization</em>'.
	 * @see edu.hu.clickwatch.analysis.composition.model.Visualization
	 * @generated
	 */
	EClass getVisualization();

	/**
	 * Returns the meta object for class '{@link edu.hu.clickwatch.analysis.composition.model.Visualizer <em>Visualizer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Visualizer</em>'.
	 * @see edu.hu.clickwatch.analysis.composition.model.Visualizer
	 * @generated
	 */
	EClass getVisualizer();

	/**
	 * Returns the meta object for class '{@link edu.hu.clickwatch.analysis.composition.model.DataNode <em>Data Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Node</em>'.
	 * @see edu.hu.clickwatch.analysis.composition.model.DataNode
	 * @generated
	 */
	EClass getDataNode();

	/**
	 * Returns the meta object for class '{@link edu.hu.clickwatch.analysis.composition.model.Composition <em>Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composition</em>'.
	 * @see edu.hu.clickwatch.analysis.composition.model.Composition
	 * @generated
	 */
	EClass getComposition();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.hu.clickwatch.analysis.composition.model.Composition#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contents</em>'.
	 * @see edu.hu.clickwatch.analysis.composition.model.Composition#getContents()
	 * @see #getComposition()
	 * @generated
	 */
	EReference getComposition_Contents();

	/**
	 * Returns the meta object for enum '{@link edu.hu.clickwatch.analysis.composition.model.TransformationKind <em>Transformation Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Transformation Kind</em>'.
	 * @see edu.hu.clickwatch.analysis.composition.model.TransformationKind
	 * @generated
	 */
	EEnum getTransformationKind();

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
		 * The meta object literal for the '{@link edu.hu.clickwatch.analysis.composition.model.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.hu.clickwatch.analysis.composition.model.impl.NodeImpl
		 * @see edu.hu.clickwatch.analysis.composition.model.impl.CompositionPackageImpl#getNode()
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
		 * The meta object literal for the '{@link edu.hu.clickwatch.analysis.composition.model.impl.TransformationImpl <em>Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.hu.clickwatch.analysis.composition.model.impl.TransformationImpl
		 * @see edu.hu.clickwatch.analysis.composition.model.impl.CompositionPackageImpl#getTransformation()
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
		 * The meta object literal for the '{@link edu.hu.clickwatch.analysis.composition.model.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.hu.clickwatch.analysis.composition.model.impl.ElementImpl
		 * @see edu.hu.clickwatch.analysis.composition.model.impl.CompositionPackageImpl#getElement()
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
		 * The meta object literal for the '{@link edu.hu.clickwatch.analysis.composition.model.impl.ModelNodeImpl <em>Model Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.hu.clickwatch.analysis.composition.model.impl.ModelNodeImpl
		 * @see edu.hu.clickwatch.analysis.composition.model.impl.CompositionPackageImpl#getModelNode()
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
		 * The meta object literal for the '<em><b>Has Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_NODE__HAS_MODEL = eINSTANCE.getModelNode_HasModel();

		/**
		 * The meta object literal for the '{@link edu.hu.clickwatch.analysis.composition.model.impl.DataSetNodeImpl <em>Data Set Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.hu.clickwatch.analysis.composition.model.impl.DataSetNodeImpl
		 * @see edu.hu.clickwatch.analysis.composition.model.impl.CompositionPackageImpl#getDataSetNode()
		 * @generated
		 */
		EClass DATA_SET_NODE = eINSTANCE.getDataSetNode();

		/**
		 * The meta object literal for the '{@link edu.hu.clickwatch.analysis.composition.model.impl.MeasureNodeImpl <em>Measure Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.hu.clickwatch.analysis.composition.model.impl.MeasureNodeImpl
		 * @see edu.hu.clickwatch.analysis.composition.model.impl.CompositionPackageImpl#getMeasureNode()
		 * @generated
		 */
		EClass MEASURE_NODE = eINSTANCE.getMeasureNode();

		/**
		 * The meta object literal for the '{@link edu.hu.clickwatch.analysis.composition.model.impl.EdgeImpl <em>Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.hu.clickwatch.analysis.composition.model.impl.EdgeImpl
		 * @see edu.hu.clickwatch.analysis.composition.model.impl.CompositionPackageImpl#getEdge()
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
		 * The meta object literal for the '{@link edu.hu.clickwatch.analysis.composition.model.impl.TimedTransformationImpl <em>Timed Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.hu.clickwatch.analysis.composition.model.impl.TimedTransformationImpl
		 * @see edu.hu.clickwatch.analysis.composition.model.impl.CompositionPackageImpl#getTimedTransformation()
		 * @generated
		 */
		EClass TIMED_TRANSFORMATION = eINSTANCE.getTimedTransformation();

		/**
		 * The meta object literal for the '{@link edu.hu.clickwatch.analysis.composition.model.impl.MappedTransformationImpl <em>Mapped Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.hu.clickwatch.analysis.composition.model.impl.MappedTransformationImpl
		 * @see edu.hu.clickwatch.analysis.composition.model.impl.CompositionPackageImpl#getMappedTransformation()
		 * @generated
		 */
		EClass MAPPED_TRANSFORMATION = eINSTANCE.getMappedTransformation();

		/**
		 * The meta object literal for the '{@link edu.hu.clickwatch.analysis.composition.model.impl.VisualizationImpl <em>Visualization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.hu.clickwatch.analysis.composition.model.impl.VisualizationImpl
		 * @see edu.hu.clickwatch.analysis.composition.model.impl.CompositionPackageImpl#getVisualization()
		 * @generated
		 */
		EClass VISUALIZATION = eINSTANCE.getVisualization();

		/**
		 * The meta object literal for the '{@link edu.hu.clickwatch.analysis.composition.model.impl.VisualizerImpl <em>Visualizer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.hu.clickwatch.analysis.composition.model.impl.VisualizerImpl
		 * @see edu.hu.clickwatch.analysis.composition.model.impl.CompositionPackageImpl#getVisualizer()
		 * @generated
		 */
		EClass VISUALIZER = eINSTANCE.getVisualizer();

		/**
		 * The meta object literal for the '{@link edu.hu.clickwatch.analysis.composition.model.impl.DataNodeImpl <em>Data Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.hu.clickwatch.analysis.composition.model.impl.DataNodeImpl
		 * @see edu.hu.clickwatch.analysis.composition.model.impl.CompositionPackageImpl#getDataNode()
		 * @generated
		 */
		EClass DATA_NODE = eINSTANCE.getDataNode();

		/**
		 * The meta object literal for the '{@link edu.hu.clickwatch.analysis.composition.model.impl.CompositionImpl <em>Composition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.hu.clickwatch.analysis.composition.model.impl.CompositionImpl
		 * @see edu.hu.clickwatch.analysis.composition.model.impl.CompositionPackageImpl#getComposition()
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
		 * The meta object literal for the '{@link edu.hu.clickwatch.analysis.composition.model.TransformationKind <em>Transformation Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.hu.clickwatch.analysis.composition.model.TransformationKind
		 * @see edu.hu.clickwatch.analysis.composition.model.impl.CompositionPackageImpl#getTransformationKind()
		 * @generated
		 */
		EEnum TRANSFORMATION_KIND = eINSTANCE.getTransformationKind();

	}

} //CompositionPackage
