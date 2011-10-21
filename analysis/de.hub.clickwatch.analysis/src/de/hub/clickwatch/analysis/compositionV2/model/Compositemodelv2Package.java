/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.analysis.compositionV2.model;

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
 * @see de.hub.clickwatch.analysis.compositionV2.model.Compositemodelv2Factory
 * @model kind="package"
 * @generated
 */
public interface Compositemodelv2Package extends EPackage {
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
	Compositemodelv2Package eINSTANCE = de.hub.clickwatch.analysis.compositionV2.model.impl.Compositemodelv2PackageImpl.init();

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.analysis.compositionV2.model.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.analysis.compositionV2.model.impl.ElementImpl
	 * @see de.hub.clickwatch.analysis.compositionV2.model.impl.Compositemodelv2PackageImpl#getElement()
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
	 * The meta object id for the '{@link de.hub.clickwatch.analysis.compositionV2.model.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.analysis.compositionV2.model.impl.NodeImpl
	 * @see de.hub.clickwatch.analysis.compositionV2.model.impl.Compositemodelv2PackageImpl#getNode()
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
	 * The meta object id for the '{@link de.hub.clickwatch.analysis.compositionV2.model.impl.EdgeImpl <em>Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.analysis.compositionV2.model.impl.EdgeImpl
	 * @see de.hub.clickwatch.analysis.compositionV2.model.impl.Compositemodelv2PackageImpl#getEdge()
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
	 * The meta object id for the '{@link de.hub.clickwatch.analysis.compositionV2.model.impl.DataNodeImpl <em>Data Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.analysis.compositionV2.model.impl.DataNodeImpl
	 * @see de.hub.clickwatch.analysis.compositionV2.model.impl.Compositemodelv2PackageImpl#getDataNode()
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
	 * The number of structural features of the '<em>Data Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.analysis.compositionV2.model.impl.ModelNodeImpl <em>Model Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.analysis.compositionV2.model.impl.ModelNodeImpl
	 * @see de.hub.clickwatch.analysis.compositionV2.model.impl.Compositemodelv2PackageImpl#getModelNode()
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
	 * The feature id for the '<em><b>Meta Model Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_NODE__META_MODEL_RESOURCE = DATA_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Meta Model Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_NODE__META_MODEL_CLASS = DATA_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Model Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_NODE__MODEL_RESOURCE = DATA_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Model Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_NODE_FEATURE_COUNT = DATA_NODE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.analysis.compositionV2.model.impl.ActionNodeImpl <em>Action Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.analysis.compositionV2.model.impl.ActionNodeImpl
	 * @see de.hub.clickwatch.analysis.compositionV2.model.impl.Compositemodelv2PackageImpl#getActionNode()
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
	 * The number of structural features of the '<em>Action Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.analysis.compositionV2.model.impl.TransformationImpl <em>Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.analysis.compositionV2.model.impl.TransformationImpl
	 * @see de.hub.clickwatch.analysis.compositionV2.model.impl.Compositemodelv2PackageImpl#getTransformation()
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
	 * The feature id for the '<em><b>Transformation Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__TRANSFORMATION_URI = ACTION_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_FEATURE_COUNT = ACTION_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.analysis.compositionV2.model.impl.StartNodeImpl <em>Start Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.analysis.compositionV2.model.impl.StartNodeImpl
	 * @see de.hub.clickwatch.analysis.compositionV2.model.impl.Compositemodelv2PackageImpl#getStartNode()
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
	 * The number of structural features of the '<em>Start Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE_FEATURE_COUNT = ACTION_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.analysis.compositionV2.model.impl.ProgressEdgeImpl <em>Progress Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.analysis.compositionV2.model.impl.ProgressEdgeImpl
	 * @see de.hub.clickwatch.analysis.compositionV2.model.impl.Compositemodelv2PackageImpl#getProgressEdge()
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
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_EDGE__SOURCE = EDGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_EDGE__TARGET = EDGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Progress Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_EDGE_FEATURE_COUNT = EDGE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.analysis.compositionV2.model.impl.CompositionImpl <em>Composition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.analysis.compositionV2.model.impl.CompositionImpl
	 * @see de.hub.clickwatch.analysis.compositionV2.model.impl.Compositemodelv2PackageImpl#getComposition()
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
	 * The meta object id for the '{@link de.hub.clickwatch.analysis.compositionV2.model.impl.DataEdgeImpl <em>Data Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.analysis.compositionV2.model.impl.DataEdgeImpl
	 * @see de.hub.clickwatch.analysis.compositionV2.model.impl.Compositemodelv2PackageImpl#getDataEdge()
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
	 * The meta object id for the '{@link de.hub.clickwatch.analysis.compositionV2.model.impl.InputEdgeImpl <em>Input Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.analysis.compositionV2.model.impl.InputEdgeImpl
	 * @see de.hub.clickwatch.analysis.compositionV2.model.impl.Compositemodelv2PackageImpl#getInputEdge()
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
	 * The number of structural features of the '<em>Input Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_EDGE_FEATURE_COUNT = DATA_EDGE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.analysis.compositionV2.model.impl.OutputEdgeImpl <em>Output Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.analysis.compositionV2.model.impl.OutputEdgeImpl
	 * @see de.hub.clickwatch.analysis.compositionV2.model.impl.Compositemodelv2PackageImpl#getOutputEdge()
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
	 * Returns the meta object for class '{@link de.hub.clickwatch.analysis.compositionV2.model.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see de.hub.clickwatch.analysis.compositionV2.model.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.analysis.compositionV2.model.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see de.hub.clickwatch.analysis.compositionV2.model.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.analysis.compositionV2.model.Element#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see de.hub.clickwatch.analysis.compositionV2.model.Element#getLabel()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Label();

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.analysis.compositionV2.model.Edge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge</em>'.
	 * @see de.hub.clickwatch.analysis.compositionV2.model.Edge
	 * @generated
	 */
	EClass getEdge();

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.analysis.compositionV2.model.DataNode <em>Data Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Node</em>'.
	 * @see de.hub.clickwatch.analysis.compositionV2.model.DataNode
	 * @generated
	 */
	EClass getDataNode();

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.analysis.compositionV2.model.ModelNode <em>Model Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Node</em>'.
	 * @see de.hub.clickwatch.analysis.compositionV2.model.ModelNode
	 * @generated
	 */
	EClass getModelNode();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.analysis.compositionV2.model.ModelNode#getMetaModelResource <em>Meta Model Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Meta Model Resource</em>'.
	 * @see de.hub.clickwatch.analysis.compositionV2.model.ModelNode#getMetaModelResource()
	 * @see #getModelNode()
	 * @generated
	 */
	EAttribute getModelNode_MetaModelResource();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.analysis.compositionV2.model.ModelNode#getMetaModelClass <em>Meta Model Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Meta Model Class</em>'.
	 * @see de.hub.clickwatch.analysis.compositionV2.model.ModelNode#getMetaModelClass()
	 * @see #getModelNode()
	 * @generated
	 */
	EAttribute getModelNode_MetaModelClass();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.analysis.compositionV2.model.ModelNode#getModelResource <em>Model Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Resource</em>'.
	 * @see de.hub.clickwatch.analysis.compositionV2.model.ModelNode#getModelResource()
	 * @see #getModelNode()
	 * @generated
	 */
	EAttribute getModelNode_ModelResource();

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.analysis.compositionV2.model.Transformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformation</em>'.
	 * @see de.hub.clickwatch.analysis.compositionV2.model.Transformation
	 * @generated
	 */
	EClass getTransformation();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.analysis.compositionV2.model.Transformation#getTransformationUri <em>Transformation Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transformation Uri</em>'.
	 * @see de.hub.clickwatch.analysis.compositionV2.model.Transformation#getTransformationUri()
	 * @see #getTransformation()
	 * @generated
	 */
	EAttribute getTransformation_TransformationUri();

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.analysis.compositionV2.model.StartNode <em>Start Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start Node</em>'.
	 * @see de.hub.clickwatch.analysis.compositionV2.model.StartNode
	 * @generated
	 */
	EClass getStartNode();

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.analysis.compositionV2.model.ProgressEdge <em>Progress Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Progress Edge</em>'.
	 * @see de.hub.clickwatch.analysis.compositionV2.model.ProgressEdge
	 * @generated
	 */
	EClass getProgressEdge();

	/**
	 * Returns the meta object for the reference '{@link de.hub.clickwatch.analysis.compositionV2.model.ProgressEdge#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see de.hub.clickwatch.analysis.compositionV2.model.ProgressEdge#getSource()
	 * @see #getProgressEdge()
	 * @generated
	 */
	EReference getProgressEdge_Source();

	/**
	 * Returns the meta object for the reference '{@link de.hub.clickwatch.analysis.compositionV2.model.ProgressEdge#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see de.hub.clickwatch.analysis.compositionV2.model.ProgressEdge#getTarget()
	 * @see #getProgressEdge()
	 * @generated
	 */
	EReference getProgressEdge_Target();

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.analysis.compositionV2.model.Composition <em>Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composition</em>'.
	 * @see de.hub.clickwatch.analysis.compositionV2.model.Composition
	 * @generated
	 */
	EClass getComposition();

	/**
	 * Returns the meta object for the containment reference list '{@link de.hub.clickwatch.analysis.compositionV2.model.Composition#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contents</em>'.
	 * @see de.hub.clickwatch.analysis.compositionV2.model.Composition#getContents()
	 * @see #getComposition()
	 * @generated
	 */
	EReference getComposition_Contents();

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.analysis.compositionV2.model.ActionNode <em>Action Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Node</em>'.
	 * @see de.hub.clickwatch.analysis.compositionV2.model.ActionNode
	 * @generated
	 */
	EClass getActionNode();

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.analysis.compositionV2.model.DataEdge <em>Data Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Edge</em>'.
	 * @see de.hub.clickwatch.analysis.compositionV2.model.DataEdge
	 * @generated
	 */
	EClass getDataEdge();

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.analysis.compositionV2.model.InputEdge <em>Input Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Edge</em>'.
	 * @see de.hub.clickwatch.analysis.compositionV2.model.InputEdge
	 * @generated
	 */
	EClass getInputEdge();

	/**
	 * Returns the meta object for the reference '{@link de.hub.clickwatch.analysis.compositionV2.model.InputEdge#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see de.hub.clickwatch.analysis.compositionV2.model.InputEdge#getSource()
	 * @see #getInputEdge()
	 * @generated
	 */
	EReference getInputEdge_Source();

	/**
	 * Returns the meta object for the reference '{@link de.hub.clickwatch.analysis.compositionV2.model.InputEdge#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see de.hub.clickwatch.analysis.compositionV2.model.InputEdge#getTarget()
	 * @see #getInputEdge()
	 * @generated
	 */
	EReference getInputEdge_Target();

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.analysis.compositionV2.model.OutputEdge <em>Output Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Edge</em>'.
	 * @see de.hub.clickwatch.analysis.compositionV2.model.OutputEdge
	 * @generated
	 */
	EClass getOutputEdge();

	/**
	 * Returns the meta object for the reference '{@link de.hub.clickwatch.analysis.compositionV2.model.OutputEdge#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see de.hub.clickwatch.analysis.compositionV2.model.OutputEdge#getSource()
	 * @see #getOutputEdge()
	 * @generated
	 */
	EReference getOutputEdge_Source();

	/**
	 * Returns the meta object for the reference '{@link de.hub.clickwatch.analysis.compositionV2.model.OutputEdge#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see de.hub.clickwatch.analysis.compositionV2.model.OutputEdge#getTarget()
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
	Compositemodelv2Factory getCompositemodelv2Factory();

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
		 * The meta object literal for the '{@link de.hub.clickwatch.analysis.compositionV2.model.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.analysis.compositionV2.model.impl.NodeImpl
		 * @see de.hub.clickwatch.analysis.compositionV2.model.impl.Compositemodelv2PackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '{@link de.hub.clickwatch.analysis.compositionV2.model.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.analysis.compositionV2.model.impl.ElementImpl
		 * @see de.hub.clickwatch.analysis.compositionV2.model.impl.Compositemodelv2PackageImpl#getElement()
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
		 * The meta object literal for the '{@link de.hub.clickwatch.analysis.compositionV2.model.impl.EdgeImpl <em>Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.analysis.compositionV2.model.impl.EdgeImpl
		 * @see de.hub.clickwatch.analysis.compositionV2.model.impl.Compositemodelv2PackageImpl#getEdge()
		 * @generated
		 */
		EClass EDGE = eINSTANCE.getEdge();

		/**
		 * The meta object literal for the '{@link de.hub.clickwatch.analysis.compositionV2.model.impl.DataNodeImpl <em>Data Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.analysis.compositionV2.model.impl.DataNodeImpl
		 * @see de.hub.clickwatch.analysis.compositionV2.model.impl.Compositemodelv2PackageImpl#getDataNode()
		 * @generated
		 */
		EClass DATA_NODE = eINSTANCE.getDataNode();

		/**
		 * The meta object literal for the '{@link de.hub.clickwatch.analysis.compositionV2.model.impl.ModelNodeImpl <em>Model Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.analysis.compositionV2.model.impl.ModelNodeImpl
		 * @see de.hub.clickwatch.analysis.compositionV2.model.impl.Compositemodelv2PackageImpl#getModelNode()
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
		 * The meta object literal for the '{@link de.hub.clickwatch.analysis.compositionV2.model.impl.TransformationImpl <em>Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.analysis.compositionV2.model.impl.TransformationImpl
		 * @see de.hub.clickwatch.analysis.compositionV2.model.impl.Compositemodelv2PackageImpl#getTransformation()
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
		 * The meta object literal for the '{@link de.hub.clickwatch.analysis.compositionV2.model.impl.StartNodeImpl <em>Start Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.analysis.compositionV2.model.impl.StartNodeImpl
		 * @see de.hub.clickwatch.analysis.compositionV2.model.impl.Compositemodelv2PackageImpl#getStartNode()
		 * @generated
		 */
		EClass START_NODE = eINSTANCE.getStartNode();

		/**
		 * The meta object literal for the '{@link de.hub.clickwatch.analysis.compositionV2.model.impl.ProgressEdgeImpl <em>Progress Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.analysis.compositionV2.model.impl.ProgressEdgeImpl
		 * @see de.hub.clickwatch.analysis.compositionV2.model.impl.Compositemodelv2PackageImpl#getProgressEdge()
		 * @generated
		 */
		EClass PROGRESS_EDGE = eINSTANCE.getProgressEdge();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRESS_EDGE__SOURCE = eINSTANCE.getProgressEdge_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRESS_EDGE__TARGET = eINSTANCE.getProgressEdge_Target();

		/**
		 * The meta object literal for the '{@link de.hub.clickwatch.analysis.compositionV2.model.impl.CompositionImpl <em>Composition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.analysis.compositionV2.model.impl.CompositionImpl
		 * @see de.hub.clickwatch.analysis.compositionV2.model.impl.Compositemodelv2PackageImpl#getComposition()
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
		 * The meta object literal for the '{@link de.hub.clickwatch.analysis.compositionV2.model.impl.ActionNodeImpl <em>Action Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.analysis.compositionV2.model.impl.ActionNodeImpl
		 * @see de.hub.clickwatch.analysis.compositionV2.model.impl.Compositemodelv2PackageImpl#getActionNode()
		 * @generated
		 */
		EClass ACTION_NODE = eINSTANCE.getActionNode();

		/**
		 * The meta object literal for the '{@link de.hub.clickwatch.analysis.compositionV2.model.impl.DataEdgeImpl <em>Data Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.analysis.compositionV2.model.impl.DataEdgeImpl
		 * @see de.hub.clickwatch.analysis.compositionV2.model.impl.Compositemodelv2PackageImpl#getDataEdge()
		 * @generated
		 */
		EClass DATA_EDGE = eINSTANCE.getDataEdge();

		/**
		 * The meta object literal for the '{@link de.hub.clickwatch.analysis.compositionV2.model.impl.InputEdgeImpl <em>Input Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.analysis.compositionV2.model.impl.InputEdgeImpl
		 * @see de.hub.clickwatch.analysis.compositionV2.model.impl.Compositemodelv2PackageImpl#getInputEdge()
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
		 * The meta object literal for the '{@link de.hub.clickwatch.analysis.compositionV2.model.impl.OutputEdgeImpl <em>Output Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.analysis.compositionV2.model.impl.OutputEdgeImpl
		 * @see de.hub.clickwatch.analysis.compositionV2.model.impl.Compositemodelv2PackageImpl#getOutputEdge()
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

} //Compositemodelv2Package
