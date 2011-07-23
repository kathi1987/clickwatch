/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.cwdatabase.util;

import java.util.Map;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import de.hub.clickwatch.cwdatabase.CWDataBasePackage;
import de.hub.clickwatch.cwdatabase.DataBase;
import de.hub.clickwatch.cwdatabase.ExperimentDescr;
import de.hub.clickwatch.cwdatabase.ExperimentNodeRecordTimeTable;
import de.hub.clickwatch.cwdatabase.ExperimentRecord;
import de.hub.clickwatch.cwdatabase.ExperimentStatistics;
import de.hub.clickwatch.cwdatabase.NodeRecord;
import de.hub.clickwatch.cwdatabase.NodeRecordDescr;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.hub.clickwatch.cwdatabase.CWDataBasePackage
 * @generated
 */
public class CWDataBaseAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CWDataBasePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CWDataBaseAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CWDataBasePackage.eINSTANCE;
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
	protected CWDataBaseSwitch<Adapter> modelSwitch =
		new CWDataBaseSwitch<Adapter>() {
			@Override
			public Adapter caseExperimentDescr(ExperimentDescr object) {
				return createExperimentDescrAdapter();
			}
			@Override
			public Adapter caseNodeRecord(NodeRecord object) {
				return createNodeRecordAdapter();
			}
			@Override
			public Adapter caseDataBase(DataBase object) {
				return createDataBaseAdapter();
			}
			@Override
			public Adapter caseExperimentRecord(ExperimentRecord object) {
				return createExperimentRecordAdapter();
			}
			@Override
			public Adapter caseExperimentNodeRecordTimeTable(ExperimentNodeRecordTimeTable object) {
				return createExperimentNodeRecordTimeTableAdapter();
			}
			@Override
			public Adapter caseEStringToExperimentNodeRecordTimeTableMap(Map.Entry<String, ExperimentNodeRecordTimeTable> object) {
				return createEStringToExperimentNodeRecordTimeTableMapAdapter();
			}
			@Override
			public Adapter caseELongObjectToNodeRecordDescrMap(Map.Entry<Long, NodeRecordDescr> object) {
				return createELongObjectToNodeRecordDescrMapAdapter();
			}
			@Override
			public Adapter caseExperimentStatistics(ExperimentStatistics object) {
				return createExperimentStatisticsAdapter();
			}
			@Override
			public Adapter caseNodeRecordDescr(NodeRecordDescr object) {
				return createNodeRecordDescrAdapter();
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
	 * Creates a new adapter for an object of class '{@link de.hub.clickwatch.cwdatabase.ExperimentDescr <em>Experiment Descr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hub.clickwatch.cwdatabase.ExperimentDescr
	 * @generated
	 */
	public Adapter createExperimentDescrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hub.clickwatch.cwdatabase.NodeRecord <em>Node Record</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hub.clickwatch.cwdatabase.NodeRecord
	 * @generated
	 */
	public Adapter createNodeRecordAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hub.clickwatch.cwdatabase.DataBase <em>Data Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hub.clickwatch.cwdatabase.DataBase
	 * @generated
	 */
	public Adapter createDataBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hub.clickwatch.cwdatabase.ExperimentRecord <em>Experiment Record</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hub.clickwatch.cwdatabase.ExperimentRecord
	 * @generated
	 */
	public Adapter createExperimentRecordAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hub.clickwatch.cwdatabase.ExperimentNodeRecordTimeTable <em>Experiment Node Record Time Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hub.clickwatch.cwdatabase.ExperimentNodeRecordTimeTable
	 * @generated
	 */
	public Adapter createExperimentNodeRecordTimeTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>EString To Experiment Node Record Time Table Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createEStringToExperimentNodeRecordTimeTableMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>ELong Object To Node Record Descr Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createELongObjectToNodeRecordDescrMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hub.clickwatch.cwdatabase.ExperimentStatistics <em>Experiment Statistics</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hub.clickwatch.cwdatabase.ExperimentStatistics
	 * @generated
	 */
	public Adapter createExperimentStatisticsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hub.clickwatch.cwdatabase.NodeRecordDescr <em>Node Record Descr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hub.clickwatch.cwdatabase.NodeRecordDescr
	 * @generated
	 */
	public Adapter createNodeRecordDescrAdapter() {
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

} //CWDataBaseAdapterFactory
