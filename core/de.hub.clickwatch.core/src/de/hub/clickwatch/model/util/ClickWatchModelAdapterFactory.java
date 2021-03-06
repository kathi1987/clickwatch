/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.model.util;



import java.util.Map;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import de.hub.clickwatch.model.ClickWatchError;
import de.hub.clickwatch.model.ClickWatchModelPackage;
import de.hub.clickwatch.model.Element;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.model.ModelElementWithStatistics;
import de.hub.clickwatch.model.Network;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.model.Statistic;
import de.hub.clickwatch.model.StatisticsContainer;


/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.hub.clickwatch.model.ClickWatchModelPackage
 * @generated
 */
public class ClickWatchModelAdapterFactory extends AdapterFactoryImpl {
	/**
     * The cached model package.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected static ClickWatchModelPackage modelPackage;

	/**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ClickWatchModelAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = ClickWatchModelPackage.eINSTANCE;
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
	protected ClickWatchModelSwitch<Adapter> modelSwitch =
		new ClickWatchModelSwitch<Adapter>() {
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
     * Creates a new adapter for an object of class '{@link de.hub.clickwatch.model.Node <em>Node</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.hub.clickwatch.model.Node
     * @generated
     */
	public Adapter createNodeAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.hub.clickwatch.model.Element <em>Element</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.hub.clickwatch.model.Element
     * @generated
     */
	public Adapter createElementAdapter() {
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
	public Adapter createHandlerAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.hub.clickwatch.model.Network <em>Network</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.hub.clickwatch.model.Network
     * @generated
     */
	public Adapter createNetworkAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.hub.clickwatch.model.StatisticsContainer <em>Statistics Container</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.hub.clickwatch.model.StatisticsContainer
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
     * Creates a new adapter for an object of class '{@link de.hub.clickwatch.model.Statistic <em>Statistic</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.hub.clickwatch.model.Statistic
     * @generated
     */
    public Adapter createStatisticAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.hub.clickwatch.model.ClickWatchError <em>Click Watch Error</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.hub.clickwatch.model.ClickWatchError
     * @generated
     */
    public Adapter createClickWatchErrorAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.hub.clickwatch.model.ModelElementWithStatistics <em>Model Element With Statistics</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.hub.clickwatch.model.ModelElementWithStatistics
     * @generated
     */
    public Adapter createModelElementWithStatisticsAdapter() {
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

} //ModelAdapterFactory
