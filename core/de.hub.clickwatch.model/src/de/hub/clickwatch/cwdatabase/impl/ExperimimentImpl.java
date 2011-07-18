/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.cwdatabase.impl;

import de.hub.clickwatch.cwdatabase.CWDataBasePackage;
import de.hub.clickwatch.cwdatabase.Experimiment;
import de.hub.clickwatch.cwdatabase.NodeRecord;

import de.hub.clickwatch.model.Network;
import de.hub.clickwatch.model.Node;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Experimiment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.clickwatch.cwdatabase.impl.ExperimimentImpl#getMetaData <em>Meta Data</em>}</li>
 *   <li>{@link de.hub.clickwatch.cwdatabase.impl.ExperimimentImpl#getRecords <em>Records</em>}</li>
 *   <li>{@link de.hub.clickwatch.cwdatabase.impl.ExperimimentImpl#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link de.hub.clickwatch.cwdatabase.impl.ExperimimentImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.hub.clickwatch.cwdatabase.impl.ExperimimentImpl#getRecordURIs <em>Record UR Is</em>}</li>
 *   <li>{@link de.hub.clickwatch.cwdatabase.impl.ExperimimentImpl#getStorageBaseFileStr <em>Storage Base File Str</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExperimimentImpl extends EObjectImpl implements Experimiment {
	/**
	 * The cached value of the '{@link #getMetaData() <em>Meta Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaData()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> metaData;

	/**
	 * The cached value of the '{@link #getRecords() <em>Records</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecords()
	 * @generated
	 * @ordered
	 */
	protected EList<NodeRecord> records;

	/**
	 * The cached value of the '{@link #getConfiguration() <em>Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguration()
	 * @generated
	 * @ordered
	 */
	protected Network configuration;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRecordURIs() <em>Record UR Is</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordURIs()
	 * @generated
	 * @ordered
	 */
	protected EList<String> recordURIs;

	/**
	 * The default value of the '{@link #getStorageBaseFileStr() <em>Storage Base File Str</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorageBaseFileStr()
	 * @generated
	 * @ordered
	 */
	protected static final String STORAGE_BASE_FILE_STR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStorageBaseFileStr() <em>Storage Base File Str</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorageBaseFileStr()
	 * @generated
	 * @ordered
	 */
	protected String storageBaseFileStr = STORAGE_BASE_FILE_STR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExperimimentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CWDataBasePackage.Literals.EXPERIMIMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getMetaData() {
		if (metaData == null) {
			metaData = new EObjectContainmentEList<Node>(Node.class, this, CWDataBasePackage.EXPERIMIMENT__META_DATA);
		}
		return metaData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NodeRecord> getRecords() {
		if (records == null) {
			records = new EObjectContainmentEList<NodeRecord>(NodeRecord.class, this, CWDataBasePackage.EXPERIMIMENT__RECORDS);
		}
		return records;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Network getConfiguration() {
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfiguration(Network newConfiguration, NotificationChain msgs) {
		Network oldConfiguration = configuration;
		configuration = newConfiguration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CWDataBasePackage.EXPERIMIMENT__CONFIGURATION, oldConfiguration, newConfiguration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfiguration(Network newConfiguration) {
		if (newConfiguration != configuration) {
			NotificationChain msgs = null;
			if (configuration != null)
				msgs = ((InternalEObject)configuration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CWDataBasePackage.EXPERIMIMENT__CONFIGURATION, null, msgs);
			if (newConfiguration != null)
				msgs = ((InternalEObject)newConfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CWDataBasePackage.EXPERIMIMENT__CONFIGURATION, null, msgs);
			msgs = basicSetConfiguration(newConfiguration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CWDataBasePackage.EXPERIMIMENT__CONFIGURATION, newConfiguration, newConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CWDataBasePackage.EXPERIMIMENT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getRecordURIs() {
		if (recordURIs == null) {
			recordURIs = new EDataTypeUniqueEList<String>(String.class, this, CWDataBasePackage.EXPERIMIMENT__RECORD_UR_IS);
		}
		return recordURIs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStorageBaseFileStr() {
		return storageBaseFileStr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStorageBaseFileStr(String newStorageBaseFileStr) {
		String oldStorageBaseFileStr = storageBaseFileStr;
		storageBaseFileStr = newStorageBaseFileStr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CWDataBasePackage.EXPERIMIMENT__STORAGE_BASE_FILE_STR, oldStorageBaseFileStr, storageBaseFileStr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CWDataBasePackage.EXPERIMIMENT__META_DATA:
				return ((InternalEList<?>)getMetaData()).basicRemove(otherEnd, msgs);
			case CWDataBasePackage.EXPERIMIMENT__RECORDS:
				return ((InternalEList<?>)getRecords()).basicRemove(otherEnd, msgs);
			case CWDataBasePackage.EXPERIMIMENT__CONFIGURATION:
				return basicSetConfiguration(null, msgs);
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
			case CWDataBasePackage.EXPERIMIMENT__META_DATA:
				return getMetaData();
			case CWDataBasePackage.EXPERIMIMENT__RECORDS:
				return getRecords();
			case CWDataBasePackage.EXPERIMIMENT__CONFIGURATION:
				return getConfiguration();
			case CWDataBasePackage.EXPERIMIMENT__ID:
				return getId();
			case CWDataBasePackage.EXPERIMIMENT__RECORD_UR_IS:
				return getRecordURIs();
			case CWDataBasePackage.EXPERIMIMENT__STORAGE_BASE_FILE_STR:
				return getStorageBaseFileStr();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CWDataBasePackage.EXPERIMIMENT__META_DATA:
				getMetaData().clear();
				getMetaData().addAll((Collection<? extends Node>)newValue);
				return;
			case CWDataBasePackage.EXPERIMIMENT__RECORDS:
				getRecords().clear();
				getRecords().addAll((Collection<? extends NodeRecord>)newValue);
				return;
			case CWDataBasePackage.EXPERIMIMENT__CONFIGURATION:
				setConfiguration((Network)newValue);
				return;
			case CWDataBasePackage.EXPERIMIMENT__ID:
				setId((String)newValue);
				return;
			case CWDataBasePackage.EXPERIMIMENT__RECORD_UR_IS:
				getRecordURIs().clear();
				getRecordURIs().addAll((Collection<? extends String>)newValue);
				return;
			case CWDataBasePackage.EXPERIMIMENT__STORAGE_BASE_FILE_STR:
				setStorageBaseFileStr((String)newValue);
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
			case CWDataBasePackage.EXPERIMIMENT__META_DATA:
				getMetaData().clear();
				return;
			case CWDataBasePackage.EXPERIMIMENT__RECORDS:
				getRecords().clear();
				return;
			case CWDataBasePackage.EXPERIMIMENT__CONFIGURATION:
				setConfiguration((Network)null);
				return;
			case CWDataBasePackage.EXPERIMIMENT__ID:
				setId(ID_EDEFAULT);
				return;
			case CWDataBasePackage.EXPERIMIMENT__RECORD_UR_IS:
				getRecordURIs().clear();
				return;
			case CWDataBasePackage.EXPERIMIMENT__STORAGE_BASE_FILE_STR:
				setStorageBaseFileStr(STORAGE_BASE_FILE_STR_EDEFAULT);
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
			case CWDataBasePackage.EXPERIMIMENT__META_DATA:
				return metaData != null && !metaData.isEmpty();
			case CWDataBasePackage.EXPERIMIMENT__RECORDS:
				return records != null && !records.isEmpty();
			case CWDataBasePackage.EXPERIMIMENT__CONFIGURATION:
				return configuration != null;
			case CWDataBasePackage.EXPERIMIMENT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case CWDataBasePackage.EXPERIMIMENT__RECORD_UR_IS:
				return recordURIs != null && !recordURIs.isEmpty();
			case CWDataBasePackage.EXPERIMIMENT__STORAGE_BASE_FILE_STR:
				return STORAGE_BASE_FILE_STR_EDEFAULT == null ? storageBaseFileStr != null : !STORAGE_BASE_FILE_STR_EDEFAULT.equals(storageBaseFileStr);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", recordURIs: ");
		result.append(recordURIs);
		result.append(", storageBaseFileStr: ");
		result.append(storageBaseFileStr);
		result.append(')');
		return result.toString();
	}

} //ExperimimentImpl
