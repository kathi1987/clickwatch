/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.recoder.cwdatabase.impl;

import de.hub.clickwatch.recoder.cwdatabase.CWDataBasePackage;
import de.hub.clickwatch.recoder.cwdatabase.NodeRecord;
import de.hub.clickwatch.recoder.cwdatabase.NodeRecordDescr;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node Record Descr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.clickwatch.recoder.cwdatabase.impl.NodeRecordDescrImpl#getRecord <em>Record</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodeRecordDescrImpl extends EObjectImpl implements NodeRecordDescr {
	/**
	 * The cached value of the '{@link #getRecord() <em>Record</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecord()
	 * @generated
	 * @ordered
	 */
	protected NodeRecord record;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeRecordDescrImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CWDataBasePackage.Literals.NODE_RECORD_DESCR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeRecord getRecord() {
		if (record != null && record.eIsProxy()) {
			InternalEObject oldRecord = (InternalEObject)record;
			record = (NodeRecord)eResolveProxy(oldRecord);
			if (record != oldRecord) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CWDataBasePackage.NODE_RECORD_DESCR__RECORD, oldRecord, record));
			}
		}
		return record;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeRecord basicGetRecord() {
		return record;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecord(NodeRecord newRecord) {
		NodeRecord oldRecord = record;
		record = newRecord;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CWDataBasePackage.NODE_RECORD_DESCR__RECORD, oldRecord, record));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CWDataBasePackage.NODE_RECORD_DESCR__RECORD:
				if (resolve) return getRecord();
				return basicGetRecord();
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
			case CWDataBasePackage.NODE_RECORD_DESCR__RECORD:
				setRecord((NodeRecord)newValue);
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
			case CWDataBasePackage.NODE_RECORD_DESCR__RECORD:
				setRecord((NodeRecord)null);
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
			case CWDataBasePackage.NODE_RECORD_DESCR__RECORD:
				return record != null;
		}
		return super.eIsSet(featureID);
	}

} //NodeRecordDescrImpl
