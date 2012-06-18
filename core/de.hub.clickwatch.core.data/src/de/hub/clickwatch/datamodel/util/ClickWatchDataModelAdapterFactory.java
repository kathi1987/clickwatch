/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.datamodel.util;

import de.hub.clickwatch.analysis.traceable.Traceable;
import de.hub.clickwatch.datamodel.*;

import java.util.Map;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.hub.clickwatch.datamodel.ClickWatchDataModelPackage
 * @generated
 */
public class ClickWatchDataModelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ClickWatchDataModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClickWatchDataModelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ClickWatchDataModelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClickWatchDataModelSwitch<Adapter> modelSwitch =
		new ClickWatchDataModelSwitch<Adapter>() {
			@Override
			public Adapter caseNode(Node object) {
				return createNodeAdapter();
			}
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseHandler(Handler object) {
				return createHandlerAdapter();
			}
			@Override
			public Adapter caseNetwork(Network object) {
				return createNetworkAdapter();
			}
			@Override
			public Adapter caseModelElementWithStatistics(ModelElementWithStatistics object) {
				return createModelElementWithStatisticsAdapter();
			}
			@Override
			public Adapter caseStatisticsContainer(StatisticsContainer object) {
				return createStatisticsContainerAdapter();
			}
			@Override
			public Adapter caseEStringToStatisticMap(Map.Entry<String, Statistic> object) {
				return createEStringToStatisticMapAdapter();
			}
			@Override
			public Adapter caseStatistic(Statistic object) {
				return createStatisticAdapter();
			}
			@Override
			public Adapter caseClickWatchError(ClickWatchError object) {
				return createClickWatchErrorAdapter();
			}
			@Override
			public Adapter caseValue(Value object) {
				return createValueAdapter();
			}
			@Override
			public Adapter caseTraceable(Traceable object) {
				return createTraceableAdapter();
			}
			@Override
			public Adapter caseClickWatchModel_Handler(de.hub.clickwatch.model.Handler object) {
				return createClickWatchModel_HandlerAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link de.hub.clickwatch.datamodel.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hub.clickwatch.datamodel.Node
	 * @generated
	 */
	public Adapter createNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hub.clickwatch.datamodel.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hub.clickwatch.datamodel.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hub.clickwatch.datamodel.Handler <em>Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hub.clickwatch.datamodel.Handler
	 * @generated
	 */
	public Adapter createHandlerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hub.clickwatch.datamodel.Network <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hub.clickwatch.datamodel.Network
	 * @generated
	 */
	public Adapter createNetworkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hub.clickwatch.datamodel.ModelElementWithStatistics <em>Model Element With Statistics</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hub.clickwatch.datamodel.ModelElementWithStatistics
	 * @generated
	 */
	public Adapter createModelElementWithStatisticsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hub.clickwatch.datamodel.StatisticsContainer <em>Statistics Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hub.clickwatch.datamodel.StatisticsContainer
	 * @generated
	 */
	public Adapter createStatisticsContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>EString To Statistic Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createEStringToStatisticMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hub.clickwatch.datamodel.Statistic <em>Statistic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hub.clickwatch.datamodel.Statistic
	 * @generated
	 */
	public Adapter createStatisticAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hub.clickwatch.datamodel.ClickWatchError <em>Click Watch Error</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hub.clickwatch.datamodel.ClickWatchError
	 * @generated
	 */
	public Adapter createClickWatchErrorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hub.clickwatch.datamodel.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hub.clickwatch.datamodel.Value
	 * @generated
	 */
	public Adapter createValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hub.clickwatch.analysis.traceable.Traceable <em>Traceable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hub.clickwatch.analysis.traceable.Traceable
	 * @generated
	 */
	public Adapter createTraceableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hub.clickwatch.model.Handler <em>Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hub.clickwatch.model.Handler
	 * @generated
	 */
	public Adapter createClickWatchModel_HandlerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ClickWatchDataModelAdapterFactory
