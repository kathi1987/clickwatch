/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.analysis.activity_composition.model;

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
 * @see de.hub.clickwatch.analysis.activity_composition.model.ModelFactory
 * @model kind="package"
 * @generated
 */
public interface ModelPackage extends EPackage {
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
	String eNS_URI = "http://de.hub.clickwatch.compositionmodel/2.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "compositemodelv2";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelPackage eINSTANCE = de.hub.clickwatch.analysis.activity_composition.model.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.analysis.activity_composition.model.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.analysis.activity_composition.model.impl.ElementImpl
	 * @see de.hub.clickwatch.analysis.activity_composition.model.impl.ModelPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 1;

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
	 * The meta object id for the '{@link de.hub.clickwatch.analysis.activity_composition.model.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.analysis.activity_composition.model.impl.NodeImpl
	 * @see de.hub.clickwatch.analysis.activity_composition.model.impl.ModelPackageImpl#getNode()
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
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.analysis.activity_composition.model.impl.EdgeImpl <em>Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.analysis.activity_composition.model.impl.EdgeImpl
	 * @see de.hub.clickwatch.analysis.activity_composition.model.impl.ModelPackageImpl#getEdge()
	 * @generated
	 */
	int EDGE = 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__LABEL = ELEMENT__LABEL;

	/**
	 * The number of structural features of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.analysis.activity_composition.model.impl.DataNodeImpl <em>Data Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.analysis.activity_composition.model.impl.DataNodeImpl
	 * @see de.hub.clickwatch.analysis.activity_composition.model.impl.ModelPackageImpl#getDataNode()
	 * @generated
	 */
	int DATA_NODE = 3;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_NODE__LABEL = NODE__LABEL;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_NODE__OUTPUT = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.analysis.activity_composition.model.impl.ModelNodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.analysis.activity_composition.model.impl.ModelNodeImpl
	 * @see de.hub.clickwatch.analysis.activity_composition.model.impl.ModelPackageImpl#getModelNode()
	 * @generated
	 */
	int MODEL_NODE = 4;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_NODE__LABEL = DATA_NODE__LABEL;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_NODE__OUTPUT = DATA_NODE__OUTPUT;

	/**
	 * The feature id for the '<em><b>Model Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_NODE__MODEL_RESOURCE = DATA_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_NODE_FEATURE_COUNT = DATA_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.analysis.activity_composition.model.impl.ActionNodeImpl <em>Action Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.analysis.activity_composition.model.impl.ActionNodeImpl
	 * @see de.hub.clickwatch.analysis.activity_composition.model.impl.ModelPackageImpl#getActionNode()
	 * @generated
	 */
	int ACTION_NODE = 9;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_NODE__LABEL = NODE__LABEL;

	/**
	 * The feature id for the '<em><b>Progress Connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_NODE__PROGRESS_CONNECTION = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Action Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.analysis.activity_composition.model.impl.TransformationImpl <em>Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.analysis.activity_composition.model.impl.TransformationImpl
	 * @see de.hub.clickwatch.analysis.activity_composition.model.impl.ModelPackageImpl#getTransformation()
	 * @generated
	 */
	int TRANSFORMATION = 5;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__LABEL = ACTION_NODE__LABEL;

	/**
	 * The feature id for the '<em><b>Progress Connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__PROGRESS_CONNECTION = ACTION_NODE__PROGRESS_CONNECTION;

	/**
	 * The feature id for the '<em><b>Transformation File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__TRANSFORMATION_FILE = ACTION_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__INPUT = ACTION_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_FEATURE_COUNT = ACTION_NODE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.analysis.activity_composition.model.impl.StartNodeImpl <em>Start Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.analysis.activity_composition.model.impl.StartNodeImpl
	 * @see de.hub.clickwatch.analysis.activity_composition.model.impl.ModelPackageImpl#getStartNode()
	 * @generated
	 */
	int START_NODE = 6;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE__LABEL = ACTION_NODE__LABEL;

	/**
	 * The feature id for the '<em><b>Progress Connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE__PROGRESS_CONNECTION = ACTION_NODE__PROGRESS_CONNECTION;

	/**
	 * The number of structural features of the '<em>Start Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE_FEATURE_COUNT = ACTION_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.analysis.activity_composition.model.impl.ProgressEdgeImpl <em>Progress Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.analysis.activity_composition.model.impl.ProgressEdgeImpl
	 * @see de.hub.clickwatch.analysis.activity_composition.model.impl.ModelPackageImpl#getProgressEdge()
	 * @generated
	 */
	int PROGRESS_EDGE = 7;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_EDGE__LABEL = EDGE__LABEL;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_EDGE__TARGET = EDGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_EDGE__SOURCE = EDGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Progress Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_EDGE_FEATURE_COUNT = EDGE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.analysis.activity_composition.model.impl.CompositionImpl <em>Composition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.analysis.activity_composition.model.impl.CompositionImpl
	 * @see de.hub.clickwatch.analysis.activity_composition.model.impl.ModelPackageImpl#getComposition()
	 * @generated
	 */
	int COMPOSITION = 8;

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
	 * The meta object id for the '{@link de.hub.clickwatch.analysis.activity_composition.model.impl.DataEdgeImpl <em>Data Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.analysis.activity_composition.model.impl.DataEdgeImpl
	 * @see de.hub.clickwatch.analysis.activity_composition.model.impl.ModelPackageImpl#getDataEdge()
	 * @generated
	 */
	int DATA_EDGE = 10;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EDGE__LABEL = EDGE__LABEL;

	/**
	 * The number of structural features of the '<em>Data Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EDGE_FEATURE_COUNT = EDGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.analysis.activity_composition.model.impl.InputEdgeImpl <em>Input Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.analysis.activity_composition.model.impl.InputEdgeImpl
	 * @see de.hub.clickwatch.analysis.activity_composition.model.impl.ModelPackageImpl#getInputEdge()
	 * @generated
	 */
	int INPUT_EDGE = 11;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_EDGE__LABEL = DATA_EDGE__LABEL;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_EDGE__SOURCE = DATA_EDGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_EDGE__TARGET = DATA_EDGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Clickwatch Model Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_EDGE__CLICKWATCH_MODEL_ELEMENT = DATA_EDGE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Input Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_EDGE_FEATURE_COUNT = DATA_EDGE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.analysis.activity_composition.model.impl.OutputEdgeImpl <em>Output Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.analysis.activity_composition.model.impl.OutputEdgeImpl
	 * @see de.hub.clickwatch.analysis.activity_composition.model.impl.ModelPackageImpl#getOutputEdge()
	 * @generated
	 */
	int OUTPUT_EDGE = 12;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_EDGE__LABEL = DATA_EDGE__LABEL;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_EDGE__SOURCE = DATA_EDGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_EDGE__TARGET = DATA_EDGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Output Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_EDGE_FEATURE_COUNT = DATA_EDGE_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.analysis.activity_composition.model.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see de.hub.clickwatch.analysis.activity_composition.model.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.analysis.activity_composition.model.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see de.hub.clickwatch.analysis.activity_composition.model.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.analysis.activity_composition.model.Element#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see de.hub.clickwatch.analysis.activity_composition.model.Element#getLabel()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Label();

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.analysis.activity_composition.model.Edge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge</em>'.
	 * @see de.hub.clickwatch.analysis.activity_composition.model.Edge
	 * @generated
	 */
	EClass getEdge();

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.analysis.activity_composition.model.DataNode <em>Data Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Node</em>'.
	 * @see de.hub.clickwatch.analysis.activity_composition.model.DataNode
	 * @generated
	 */
	EClass getDataNode();

	/**
	 * Returns the meta object for the reference list '{@link de.hub.clickwatch.analysis.activity_composition.model.DataNode#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Output</em>'.
	 * @see de.hub.clickwatch.analysis.activity_composition.model.DataNode#getOutput()
	 * @see #getDataNode()
	 * @generated
	 */
	EReference getDataNode_Output();

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.analysis.activity_composition.model.ModelNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see de.hub.clickwatch.analysis.activity_composition.model.ModelNode
	 * @generated
	 */
	EClass getModelNode();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.analysis.activity_composition.model.ModelNode#getModelResource <em>Model Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Resource</em>'.
	 * @see de.hub.clickwatch.analysis.activity_composition.model.ModelNode#getModelResource()
	 * @see #getModelNode()
	 * @generated
	 */
	EAttribute getModelNode_ModelResource();

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.analysis.activity_composition.model.Transformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformation</em>'.
	 * @see de.hub.clickwatch.analysis.activity_composition.model.Transformation
	 * @generated
	 */
	EClass getTransformation();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.analysis.activity_composition.model.Transformation#getTransformationFile <em>Transformation File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transformation File</em>'.
	 * @see de.hub.clickwatch.analysis.activity_composition.model.Transformation#getTransformationFile()
	 * @see #getTransformation()
	 * @generated
	 */
	EAttribute getTransformation_TransformationFile();

	/**
	 * Returns the meta object for the reference list '{@link de.hub.clickwatch.analysis.activity_composition.model.Transformation#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input</em>'.
	 * @see de.hub.clickwatch.analysis.activity_composition.model.Transformation#getInput()
	 * @see #getTransformation()
	 * @generated
	 */
	EReference getTransformation_Input();

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.analysis.activity_composition.model.StartNode <em>Start Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start Node</em>'.
	 * @see de.hub.clickwatch.analysis.activity_composition.model.StartNode
	 * @generated
	 */
	EClass getStartNode();

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.analysis.activity_composition.model.ProgressEdge <em>Progress Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Progress Edge</em>'.
	 * @see de.hub.clickwatch.analysis.activity_composition.model.ProgressEdge
	 * @generated
	 */
	EClass getProgressEdge();

	/**
	 * Returns the meta object for the reference '{@link de.hub.clickwatch.analysis.activity_composition.model.ProgressEdge#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see de.hub.clickwatch.analysis.activity_composition.model.ProgressEdge#getTarget()
	 * @see #getProgressEdge()
	 * @generated
	 */
	EReference getProgressEdge_Target();

	/**
	 * Returns the meta object for the reference '{@link de.hub.clickwatch.analysis.activity_composition.model.ProgressEdge#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see de.hub.clickwatch.analysis.activity_composition.model.ProgressEdge#getSource()
	 * @see #getProgressEdge()
	 * @generated
	 */
	EReference getProgressEdge_Source();

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.analysis.activity_composition.model.Composition <em>Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composition</em>'.
	 * @see de.hub.clickwatch.analysis.activity_composition.model.Composition
	 * @generated
	 */
	EClass getComposition();

	/**
	 * Returns the meta object for the containment reference list '{@link de.hub.clickwatch.analysis.activity_composition.model.Composition#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contents</em>'.
	 * @see de.hub.clickwatch.analysis.activity_composition.model.Composition#getContents()
	 * @see #getComposition()
	 * @generated
	 */
	EReference getComposition_Contents();

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.analysis.activity_composition.model.ActionNode <em>Action Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Node</em>'.
	 * @see de.hub.clickwatch.analysis.activity_composition.model.ActionNode
	 * @generated
	 */
	EClass getActionNode();

	/**
	 * Returns the meta object for the reference '{@link de.hub.clickwatch.analysis.activity_composition.model.ActionNode#getProgressConnection <em>Progress Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Progress Connection</em>'.
	 * @see de.hub.clickwatch.analysis.activity_composition.model.ActionNode#getProgressConnection()
	 * @see #getActionNode()
	 * @generated
	 */
	EReference getActionNode_ProgressConnection();

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.analysis.activity_composition.model.DataEdge <em>Data Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Edge</em>'.
	 * @see de.hub.clickwatch.analysis.activity_composition.model.DataEdge
	 * @generated
	 */
	EClass getDataEdge();

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.analysis.activity_composition.model.InputEdge <em>Input Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Edge</em>'.
	 * @see de.hub.clickwatch.analysis.activity_composition.model.InputEdge
	 * @generated
	 */
	EClass getInputEdge();

	/**
	 * Returns the meta object for the reference '{@link de.hub.clickwatch.analysis.activity_composition.model.InputEdge#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see de.hub.clickwatch.analysis.activity_composition.model.InputEdge#getSource()
	 * @see #getInputEdge()
	 * @generated
	 */
	EReference getInputEdge_Source();

	/**
	 * Returns the meta object for the reference '{@link de.hub.clickwatch.analysis.activity_composition.model.InputEdge#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see de.hub.clickwatch.analysis.activity_composition.model.InputEdge#getTarget()
	 * @see #getInputEdge()
	 * @generated
	 */
	EReference getInputEdge_Target();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.analysis.activity_composition.model.InputEdge#getClickwatchModelElement <em>Clickwatch Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clickwatch Model Element</em>'.
	 * @see de.hub.clickwatch.analysis.activity_composition.model.InputEdge#getClickwatchModelElement()
	 * @see #getInputEdge()
	 * @generated
	 */
	EAttribute getInputEdge_ClickwatchModelElement();

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.analysis.activity_composition.model.OutputEdge <em>Output Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Edge</em>'.
	 * @see de.hub.clickwatch.analysis.activity_composition.model.OutputEdge
	 * @generated
	 */
	EClass getOutputEdge();

	/**
	 * Returns the meta object for the reference '{@link de.hub.clickwatch.analysis.activity_composition.model.OutputEdge#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see de.hub.clickwatch.analysis.activity_composition.model.OutputEdge#getSource()
	 * @see #getOutputEdge()
	 * @generated
	 */
	EReference getOutputEdge_Source();

	/**
	 * Returns the meta object for the reference '{@link de.hub.clickwatch.analysis.activity_composition.model.OutputEdge#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see de.hub.clickwatch.analysis.activity_composition.model.OutputEdge#getTarget()
	 * @see #getOutputEdge()
	 * @generated
	 */
	EReference getOutputEdge_Target();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelFactory getModelFactory();

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
		 * The meta object literal for the '{@link de.hub.clickwatch.analysis.activity_composition.model.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.analysis.activity_composition.model.impl.NodeImpl
		 * @see de.hub.clickwatch.analysis.activity_composition.model.impl.ModelPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '{@link de.hub.clickwatch.analysis.activity_composition.model.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.analysis.activity_composition.model.impl.ElementImpl
		 * @see de.hub.clickwatch.analysis.activity_composition.model.impl.ModelPackageImpl#getElement()
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
		 * The meta object literal for the '{@link de.hub.clickwatch.analysis.activity_composition.model.impl.EdgeImpl <em>Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.analysis.activity_composition.model.impl.EdgeImpl
		 * @see de.hub.clickwatch.analysis.activity_composition.model.impl.ModelPackageImpl#getEdge()
		 * @generated
		 */
		EClass EDGE = eINSTANCE.getEdge();

		/**
		 * The meta object literal for the '{@link de.hub.clickwatch.analysis.activity_composition.model.impl.DataNodeImpl <em>Data Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.analysis.activity_composition.model.impl.DataNodeImpl
		 * @see de.hub.clickwatch.analysis.activity_composition.model.impl.ModelPackageImpl#getDataNode()
		 * @generated
		 */
		EClass DATA_NODE = eINSTANCE.getDataNode();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_NODE__OUTPUT = eINSTANCE.getDataNode_Output();

		/**
		 * The meta object literal for the '{@link de.hub.clickwatch.analysis.activity_composition.model.impl.ModelNodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.analysis.activity_composition.model.impl.ModelNodeImpl
		 * @see de.hub.clickwatch.analysis.activity_composition.model.impl.ModelPackageImpl#getModelNode()
		 * @generated
		 */
		EClass MODEL_NODE = eINSTANCE.getModelNode();

		/**
		 * The meta object literal for the '<em><b>Model Resource</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_NODE__MODEL_RESOURCE = eINSTANCE.getModelNode_ModelResource();

		/**
		 * The meta object literal for the '{@link de.hub.clickwatch.analysis.activity_composition.model.impl.TransformationImpl <em>Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.analysis.activity_composition.model.impl.TransformationImpl
		 * @see de.hub.clickwatch.analysis.activity_composition.model.impl.ModelPackageImpl#getTransformation()
		 * @generated
		 */
		EClass TRANSFORMATION = eINSTANCE.getTransformation();

		/**
		 * The meta object literal for the '<em><b>Transformation File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION__TRANSFORMATION_FILE = eINSTANCE.getTransformation_TransformationFile();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION__INPUT = eINSTANCE.getTransformation_Input();

		/**
		 * The meta object literal for the '{@link de.hub.clickwatch.analysis.activity_composition.model.impl.StartNodeImpl <em>Start Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.analysis.activity_composition.model.impl.StartNodeImpl
		 * @see de.hub.clickwatch.analysis.activity_composition.model.impl.ModelPackageImpl#getStartNode()
		 * @generated
		 */
		EClass START_NODE = eINSTANCE.getStartNode();

		/**
		 * The meta object literal for the '{@link de.hub.clickwatch.analysis.activity_composition.model.impl.ProgressEdgeImpl <em>Progress Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.analysis.activity_composition.model.impl.ProgressEdgeImpl
		 * @see de.hub.clickwatch.analysis.activity_composition.model.impl.ModelPackageImpl#getProgressEdge()
		 * @generated
		 */
		EClass PROGRESS_EDGE = eINSTANCE.getProgressEdge();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRESS_EDGE__TARGET = eINSTANCE.getProgressEdge_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRESS_EDGE__SOURCE = eINSTANCE.getProgressEdge_Source();

		/**
		 * The meta object literal for the '{@link de.hub.clickwatch.analysis.activity_composition.model.impl.CompositionImpl <em>Composition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.analysis.activity_composition.model.impl.CompositionImpl
		 * @see de.hub.clickwatch.analysis.activity_composition.model.impl.ModelPackageImpl#getComposition()
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
		 * The meta object literal for the '{@link de.hub.clickwatch.analysis.activity_composition.model.impl.ActionNodeImpl <em>Action Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.analysis.activity_composition.model.impl.ActionNodeImpl
		 * @see de.hub.clickwatch.analysis.activity_composition.model.impl.ModelPackageImpl#getActionNode()
		 * @generated
		 */
		EClass ACTION_NODE = eINSTANCE.getActionNode();

		/**
		 * The meta object literal for the '<em><b>Progress Connection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_NODE__PROGRESS_CONNECTION = eINSTANCE.getActionNode_ProgressConnection();

		/**
		 * The meta object literal for the '{@link de.hub.clickwatch.analysis.activity_composition.model.impl.DataEdgeImpl <em>Data Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.analysis.activity_composition.model.impl.DataEdgeImpl
		 * @see de.hub.clickwatch.analysis.activity_composition.model.impl.ModelPackageImpl#getDataEdge()
		 * @generated
		 */
		EClass DATA_EDGE = eINSTANCE.getDataEdge();

		/**
		 * The meta object literal for the '{@link de.hub.clickwatch.analysis.activity_composition.model.impl.InputEdgeImpl <em>Input Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.analysis.activity_composition.model.impl.InputEdgeImpl
		 * @see de.hub.clickwatch.analysis.activity_composition.model.impl.ModelPackageImpl#getInputEdge()
		 * @generated
		 */
		EClass INPUT_EDGE = eINSTANCE.getInputEdge();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_EDGE__SOURCE = eINSTANCE.getInputEdge_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_EDGE__TARGET = eINSTANCE.getInputEdge_Target();

		/**
		 * The meta object literal for the '<em><b>Clickwatch Model Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_EDGE__CLICKWATCH_MODEL_ELEMENT = eINSTANCE.getInputEdge_ClickwatchModelElement();

		/**
		 * The meta object literal for the '{@link de.hub.clickwatch.analysis.activity_composition.model.impl.OutputEdgeImpl <em>Output Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.analysis.activity_composition.model.impl.OutputEdgeImpl
		 * @see de.hub.clickwatch.analysis.activity_composition.model.impl.ModelPackageImpl#getOutputEdge()
		 * @generated
		 */
		EClass OUTPUT_EDGE = eINSTANCE.getOutputEdge();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_EDGE__SOURCE = eINSTANCE.getOutputEdge_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_EDGE__TARGET = eINSTANCE.getOutputEdge_Target();

	}

} //ModelPackage
