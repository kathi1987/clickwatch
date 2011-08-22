/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.sf_stats.util;

import de.hub.clickwatch.model.Handler;

import de.hub.clickwatch.specificmodels.brn.sf_stats.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.hub.clickwatch.specificmodels.brn.sf_stats.Sf_statsPackage
 * @generated
 */
public class Sf_statsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Sf_statsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sf_statsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Sf_statsPackage.eINSTANCE;
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
	protected Sf_statsSwitch<Adapter> modelSwitch =
		new Sf_statsSwitch<Adapter>() {
			@Override
			public Adapter caseFlowstats(Flowstats object) {
				return createFlowstatsAdapter();
			}
			@Override
			public Adapter caseRxflow(Rxflow object) {
				return createRxflowAdapter();
			}
			@Override
			public Adapter caseStats(Stats object) {
				return createStatsAdapter();
			}
			@Override
			public Adapter caseTxflow(Txflow object) {
				return createTxflowAdapter();
			}
			@Override
			public Adapter caseHandler(Handler object) {
				return createHandlerAdapter();
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
	 * Creates a new adapter for an object of class '{@link de.hub.clickwatch.specificmodels.brn.sf_stats.Flowstats <em>Flowstats</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hub.clickwatch.specificmodels.brn.sf_stats.Flowstats
	 * @generated
	 */
	public Adapter createFlowstatsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hub.clickwatch.specificmodels.brn.sf_stats.Rxflow <em>Rxflow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hub.clickwatch.specificmodels.brn.sf_stats.Rxflow
	 * @generated
	 */
	public Adapter createRxflowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hub.clickwatch.specificmodels.brn.sf_stats.Stats <em>Stats</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hub.clickwatch.specificmodels.brn.sf_stats.Stats
	 * @generated
	 */
	public Adapter createStatsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hub.clickwatch.specificmodels.brn.sf_stats.Txflow <em>Txflow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hub.clickwatch.specificmodels.brn.sf_stats.Txflow
	 * @generated
	 */
	public Adapter createTxflowAdapter() {
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

} //Sf_statsAdapterFactory
