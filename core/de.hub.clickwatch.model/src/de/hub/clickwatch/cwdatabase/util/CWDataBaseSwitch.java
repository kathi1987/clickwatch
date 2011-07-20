/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.cwdatabase.util;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import de.hub.clickwatch.cwdatabase.CWDataBasePackage;
import de.hub.clickwatch.cwdatabase.DataBase;
import de.hub.clickwatch.cwdatabase.DataBaseStatistics;
import de.hub.clickwatch.cwdatabase.ExperimentDescr;
import de.hub.clickwatch.cwdatabase.ExperimentNodeRecordTimeTable;
import de.hub.clickwatch.cwdatabase.ExperimentRecord;
import de.hub.clickwatch.cwdatabase.NodeRecord;
import de.hub.clickwatch.cwdatabase.NodeRecordDescr;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.hub.clickwatch.cwdatabase.CWDataBasePackage
 * @generated
 */
public class CWDataBaseSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CWDataBasePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CWDataBaseSwitch() {
		if (modelPackage == null) {
			modelPackage = CWDataBasePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CWDataBasePackage.EXPERIMENT_DESCR: {
				ExperimentDescr experimentDescr = (ExperimentDescr)theEObject;
				T result = caseExperimentDescr(experimentDescr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CWDataBasePackage.NODE_RECORD: {
				NodeRecord nodeRecord = (NodeRecord)theEObject;
				T result = caseNodeRecord(nodeRecord);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CWDataBasePackage.DATA_BASE: {
				DataBase dataBase = (DataBase)theEObject;
				T result = caseDataBase(dataBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CWDataBasePackage.EXPERIMENT_RECORD: {
				ExperimentRecord experimentRecord = (ExperimentRecord)theEObject;
				T result = caseExperimentRecord(experimentRecord);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CWDataBasePackage.EXPERIMENT_NODE_RECORD_TIME_TABLE: {
				ExperimentNodeRecordTimeTable experimentNodeRecordTimeTable = (ExperimentNodeRecordTimeTable)theEObject;
				T result = caseExperimentNodeRecordTimeTable(experimentNodeRecordTimeTable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CWDataBasePackage.ESTRING_TO_EXPERIMENT_NODE_RECORD_TIME_TABLE_MAP: {
				@SuppressWarnings("unchecked") Map.Entry<String, ExperimentNodeRecordTimeTable> eStringToExperimentNodeRecordTimeTableMap = (Map.Entry<String, ExperimentNodeRecordTimeTable>)theEObject;
				T result = caseEStringToExperimentNodeRecordTimeTableMap(eStringToExperimentNodeRecordTimeTableMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CWDataBasePackage.ELONG_OBJECT_TO_NODE_RECORD_DESCR_MAP: {
				@SuppressWarnings("unchecked") Map.Entry<Long, NodeRecordDescr> eLongObjectToNodeRecordDescrMap = (Map.Entry<Long, NodeRecordDescr>)theEObject;
				T result = caseELongObjectToNodeRecordDescrMap(eLongObjectToNodeRecordDescrMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CWDataBasePackage.DATA_BASE_STATISTICS: {
				DataBaseStatistics dataBaseStatistics = (DataBaseStatistics)theEObject;
				T result = caseDataBaseStatistics(dataBaseStatistics);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CWDataBasePackage.NODE_RECORD_DESCR: {
				NodeRecordDescr nodeRecordDescr = (NodeRecordDescr)theEObject;
				T result = caseNodeRecordDescr(nodeRecordDescr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Experiment Descr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Experiment Descr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExperimentDescr(ExperimentDescr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Record</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Record</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeRecord(NodeRecord object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataBase(DataBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Experiment Record</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Experiment Record</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExperimentRecord(ExperimentRecord object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Experiment Node Record Time Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Experiment Node Record Time Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExperimentNodeRecordTimeTable(ExperimentNodeRecordTimeTable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EString To Experiment Node Record Time Table Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EString To Experiment Node Record Time Table Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEStringToExperimentNodeRecordTimeTableMap(Map.Entry<String, ExperimentNodeRecordTimeTable> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ELong Object To Node Record Descr Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ELong Object To Node Record Descr Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseELongObjectToNodeRecordDescrMap(Map.Entry<Long, NodeRecordDescr> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Base Statistics</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Base Statistics</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataBaseStatistics(DataBaseStatistics object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Record Descr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Record Descr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeRecordDescr(NodeRecordDescr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CWDataBaseSwitch
