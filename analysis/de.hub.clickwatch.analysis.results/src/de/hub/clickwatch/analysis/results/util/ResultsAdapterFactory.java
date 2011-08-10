/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.analysis.results.util;

import de.hub.clickwatch.analysis.results.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.hub.clickwatch.analysis.results.ResultsPackage
 * @generated
 */
public class ResultsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ResultsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ResultsPackage.eINSTANCE;
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
	protected ResultsSwitch<Adapter> modelSwitch =
		new ResultsSwitch<Adapter>() {
			@Override
			public Adapter caseDataSet(DataSet object) {
				return createDataSetAdapter();
			}
			@Override
			public Adapter caseDataEntry(DataEntry object) {
				return createDataEntryAdapter();
			}
			@Override
			public Adapter caseChart(Chart object) {
				return createChartAdapter();
			}
			@Override
			public Adapter caseChartType(ChartType object) {
				return createChartTypeAdapter();
			}
			@Override
			public Adapter caseValueSpec(ValueSpec object) {
				return createValueSpecAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseAxis(Axis object) {
				return createAxisAdapter();
			}
			@Override
			public Adapter caseSeries(Series object) {
				return createSeriesAdapter();
			}
			@Override
			public Adapter caseCategory(Category object) {
				return createCategoryAdapter();
			}
			@Override
			public Adapter caseResult(Result object) {
				return createResultAdapter();
			}
			@Override
			public Adapter caseXY(XY object) {
				return createXYAdapter();
			}
			@Override
			public Adapter caseBoxAndWhiskers(BoxAndWhiskers object) {
				return createBoxAndWhiskersAdapter();
			}
			@Override
			public Adapter caseBar(Bar object) {
				return createBarAdapter();
			}
			@Override
			public Adapter caseResults(Results object) {
				return createResultsAdapter();
			}
			@Override
			public Adapter caseConstraint(Constraint object) {
				return createConstraintAdapter();
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
	 * Creates a new adapter for an object of class '{@link de.hub.clickwatch.analysis.results.DataSet <em>Data Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hub.clickwatch.analysis.results.DataSet
	 * @generated
	 */
	public Adapter createDataSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hub.clickwatch.analysis.results.DataEntry <em>Data Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hub.clickwatch.analysis.results.DataEntry
	 * @generated
	 */
	public Adapter createDataEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hub.clickwatch.analysis.results.Chart <em>Chart</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hub.clickwatch.analysis.results.Chart
	 * @generated
	 */
	public Adapter createChartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hub.clickwatch.analysis.results.ChartType <em>Chart Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hub.clickwatch.analysis.results.ChartType
	 * @generated
	 */
	public Adapter createChartTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hub.clickwatch.analysis.results.ValueSpec <em>Value Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hub.clickwatch.analysis.results.ValueSpec
	 * @generated
	 */
	public Adapter createValueSpecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hub.clickwatch.analysis.results.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hub.clickwatch.analysis.results.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hub.clickwatch.analysis.results.Axis <em>Axis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hub.clickwatch.analysis.results.Axis
	 * @generated
	 */
	public Adapter createAxisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hub.clickwatch.analysis.results.Series <em>Series</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hub.clickwatch.analysis.results.Series
	 * @generated
	 */
	public Adapter createSeriesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hub.clickwatch.analysis.results.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hub.clickwatch.analysis.results.Category
	 * @generated
	 */
	public Adapter createCategoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hub.clickwatch.analysis.results.Result <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hub.clickwatch.analysis.results.Result
	 * @generated
	 */
	public Adapter createResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hub.clickwatch.analysis.results.XY <em>XY</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hub.clickwatch.analysis.results.XY
	 * @generated
	 */
	public Adapter createXYAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hub.clickwatch.analysis.results.BoxAndWhiskers <em>Box And Whiskers</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hub.clickwatch.analysis.results.BoxAndWhiskers
	 * @generated
	 */
	public Adapter createBoxAndWhiskersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hub.clickwatch.analysis.results.Bar <em>Bar</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hub.clickwatch.analysis.results.Bar
	 * @generated
	 */
	public Adapter createBarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hub.clickwatch.analysis.results.Results <em>Results</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hub.clickwatch.analysis.results.Results
	 * @generated
	 */
	public Adapter createResultsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hub.clickwatch.analysis.results.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hub.clickwatch.analysis.results.Constraint
	 * @generated
	 */
	public Adapter createConstraintAdapter() {
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

} //ResultsAdapterFactory
