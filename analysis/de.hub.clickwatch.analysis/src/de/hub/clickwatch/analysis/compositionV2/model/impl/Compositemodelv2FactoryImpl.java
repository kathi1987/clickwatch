/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.analysis.compositionV2.model.impl;

import de.hub.clickwatch.analysis.compositionV2.model.*;

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
public class Compositemodelv2FactoryImpl extends EFactoryImpl implements Compositemodelv2Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Compositemodelv2Factory init() {
		try {
			Compositemodelv2Factory theCompositemodelv2Factory = (Compositemodelv2Factory)EPackage.Registry.INSTANCE.getEFactory("http://de.hub.clickwatch.compositionmodel/2.0"); 
			if (theCompositemodelv2Factory != null) {
				return theCompositemodelv2Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Compositemodelv2FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Compositemodelv2FactoryImpl() {
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
			case Compositemodelv2Package.NODE: return createNode();
			case Compositemodelv2Package.ELEMENT: return createElement();
			case Compositemodelv2Package.EDGE: return createEdge();
			case Compositemodelv2Package.DATA_NODE: return createDataNode();
			case Compositemodelv2Package.MODEL_NODE: return createModelNode();
			case Compositemodelv2Package.TRANSFORMATION: return createTransformation();
			case Compositemodelv2Package.START_NODE: return createStartNode();
			case Compositemodelv2Package.PROGRESS_EDGE: return createProgressEdge();
			case Compositemodelv2Package.COMPOSITION: return createComposition();
			case Compositemodelv2Package.ACTION_NODE: return createActionNode();
			case Compositemodelv2Package.DATA_EDGE: return createDataEdge();
			case Compositemodelv2Package.INPUT_EDGE: return createInputEdge();
			case Compositemodelv2Package.OUTPUT_EDGE: return createOutputEdge();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node createNode() {
		NodeImpl node = new NodeImpl();
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element createElement() {
		ElementImpl element = new ElementImpl();
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Edge createEdge() {
		EdgeImpl edge = new EdgeImpl();
		return edge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataNode createDataNode() {
		DataNodeImpl dataNode = new DataNodeImpl();
		return dataNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelNode createModelNode() {
		ModelNodeImpl modelNode = new ModelNodeImpl();
		return modelNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transformation createTransformation() {
		TransformationImpl transformation = new TransformationImpl();
		return transformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartNode createStartNode() {
		StartNodeImpl startNode = new StartNodeImpl();
		return startNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgressEdge createProgressEdge() {
		ProgressEdgeImpl progressEdge = new ProgressEdgeImpl();
		return progressEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Composition createComposition() {
		CompositionImpl composition = new CompositionImpl();
		return composition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionNode createActionNode() {
		ActionNodeImpl actionNode = new ActionNodeImpl();
		return actionNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataEdge createDataEdge() {
		DataEdgeImpl dataEdge = new DataEdgeImpl();
		return dataEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputEdge createInputEdge() {
		InputEdgeImpl inputEdge = new InputEdgeImpl();
		return inputEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputEdge createOutputEdge() {
		OutputEdgeImpl outputEdge = new OutputEdgeImpl();
		return outputEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Compositemodelv2Package getCompositemodelv2Package() {
		return (Compositemodelv2Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Compositemodelv2Package getPackage() {
		return Compositemodelv2Package.eINSTANCE;
	}

} //Compositemodelv2FactoryImpl
