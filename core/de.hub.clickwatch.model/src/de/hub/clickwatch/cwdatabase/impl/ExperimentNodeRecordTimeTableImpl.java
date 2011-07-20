/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.cwdatabase.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

import de.hub.clickwatch.cwdatabase.CWDataBasePackage;
import de.hub.clickwatch.cwdatabase.ExperimentNodeRecordTimeTable;
import de.hub.clickwatch.cwdatabase.NodeRecordDescr;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Experiment Node Record Time Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.clickwatch.cwdatabase.impl.ExperimentNodeRecordTimeTableImpl#getNodeMap <em>Node Map</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExperimentNodeRecordTimeTableImpl extends EObjectImpl implements ExperimentNodeRecordTimeTable {
	/**
	 * The cached value of the '{@link #getNodeMap() <em>Node Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<Long, NodeRecordDescr> nodeMap;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExperimentNodeRecordTimeTableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CWDataBasePackage.Literals.EXPERIMENT_NODE_RECORD_TIME_TABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<Long, NodeRecordDescr> getNodeMap() {
		if (nodeMap == null) {
			nodeMap = new EcoreEMap<Long,NodeRecordDescr>(CWDataBasePackage.Literals.ELONG_OBJECT_TO_NODE_RECORD_DESCR_MAP, ELongObjectToNodeRecordDescrMapImpl.class, this, CWDataBasePackage.EXPERIMENT_NODE_RECORD_TIME_TABLE__NODE_MAP);
		}
		return nodeMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CWDataBasePackage.EXPERIMENT_NODE_RECORD_TIME_TABLE__NODE_MAP:
				return ((InternalEList<?>)getNodeMap()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CWDataBasePackage.EXPERIMENT_NODE_RECORD_TIME_TABLE__NODE_MAP:
				if (coreType) return getNodeMap();
				else return getNodeMap().map();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CWDataBasePackage.EXPERIMENT_NODE_RECORD_TIME_TABLE__NODE_MAP:
				((EStructuralFeature.Setting)getNodeMap()).set(newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CWDataBasePackage.EXPERIMENT_NODE_RECORD_TIME_TABLE__NODE_MAP:
				getNodeMap().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CWDataBasePackage.EXPERIMENT_NODE_RECORD_TIME_TABLE__NODE_MAP:
				return nodeMap != null && !nodeMap.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ExperimentNodeRecordTimeTableImpl
