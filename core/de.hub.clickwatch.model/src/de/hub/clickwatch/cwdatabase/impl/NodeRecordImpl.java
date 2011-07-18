/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.cwdatabase.impl;

import de.hub.clickwatch.cwdatabase.CWDataBasePackage;
import de.hub.clickwatch.cwdatabase.NodeRecord;

import de.hub.clickwatch.model.Handler;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node Record</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.clickwatch.cwdatabase.impl.NodeRecordImpl#getRecords <em>Records</em>}</li>
 *   <li>{@link de.hub.clickwatch.cwdatabase.impl.NodeRecordImpl#getKey <em>Key</em>}</li>
 *   <li>{@link de.hub.clickwatch.cwdatabase.impl.NodeRecordImpl#getStart <em>Start</em>}</li>
 *   <li>{@link de.hub.clickwatch.cwdatabase.impl.NodeRecordImpl#getStop <em>Stop</em>}</li>
 *   <li>{@link de.hub.clickwatch.cwdatabase.impl.NodeRecordImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodeRecordImpl extends EObjectImpl implements NodeRecord {
	/**
	 * The cached value of the '{@link #getRecords() <em>Records</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecords()
	 * @generated
	 * @ordered
	 */
	protected EList<Handler> records;

	/**
	 * The cached value of the '{@link #getKey() <em>Key</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected EList<Handler> key;
	/**
	 * The default value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected static final long START_EDEFAULT = 0L;
	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected long start = START_EDEFAULT;
	/**
	 * The default value of the '{@link #getStop() <em>Stop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStop()
	 * @generated
	 * @ordered
	 */
	protected static final long STOP_EDEFAULT = 0L;
	/**
	 * The cached value of the '{@link #getStop() <em>Stop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStop()
	 * @generated
	 * @ordered
	 */
	protected long stop = STOP_EDEFAULT;
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeRecordImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CWDataBasePackage.Literals.NODE_RECORD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Handler> getRecords() {
		if (records == null) {
			records = new EObjectContainmentEList<Handler>(Handler.class, this, CWDataBasePackage.NODE_RECORD__RECORDS);
		}
		return records;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Handler> getKey() {
		if (key == null) {
			key = new EObjectResolvingEList<Handler>(Handler.class, this, CWDataBasePackage.NODE_RECORD__KEY);
		}
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(long newStart) {
		long oldStart = start;
		start = newStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CWDataBasePackage.NODE_RECORD__START, oldStart, start));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getStop() {
		return stop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStop(long newStop) {
		long oldStop = stop;
		stop = newStop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CWDataBasePackage.NODE_RECORD__STOP, oldStop, stop));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CWDataBasePackage.NODE_RECORD__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CWDataBasePackage.NODE_RECORD__RECORDS:
				return ((InternalEList<?>)getRecords()).basicRemove(otherEnd, msgs);
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
			case CWDataBasePackage.NODE_RECORD__RECORDS:
				return getRecords();
			case CWDataBasePackage.NODE_RECORD__KEY:
				return getKey();
			case CWDataBasePackage.NODE_RECORD__START:
				return getStart();
			case CWDataBasePackage.NODE_RECORD__STOP:
				return getStop();
			case CWDataBasePackage.NODE_RECORD__ID:
				return getId();
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
			case CWDataBasePackage.NODE_RECORD__RECORDS:
				getRecords().clear();
				getRecords().addAll((Collection<? extends Handler>)newValue);
				return;
			case CWDataBasePackage.NODE_RECORD__KEY:
				getKey().clear();
				getKey().addAll((Collection<? extends Handler>)newValue);
				return;
			case CWDataBasePackage.NODE_RECORD__START:
				setStart((Long)newValue);
				return;
			case CWDataBasePackage.NODE_RECORD__STOP:
				setStop((Long)newValue);
				return;
			case CWDataBasePackage.NODE_RECORD__ID:
				setId((String)newValue);
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
			case CWDataBasePackage.NODE_RECORD__RECORDS:
				getRecords().clear();
				return;
			case CWDataBasePackage.NODE_RECORD__KEY:
				getKey().clear();
				return;
			case CWDataBasePackage.NODE_RECORD__START:
				setStart(START_EDEFAULT);
				return;
			case CWDataBasePackage.NODE_RECORD__STOP:
				setStop(STOP_EDEFAULT);
				return;
			case CWDataBasePackage.NODE_RECORD__ID:
				setId(ID_EDEFAULT);
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
			case CWDataBasePackage.NODE_RECORD__RECORDS:
				return records != null && !records.isEmpty();
			case CWDataBasePackage.NODE_RECORD__KEY:
				return key != null && !key.isEmpty();
			case CWDataBasePackage.NODE_RECORD__START:
				return start != START_EDEFAULT;
			case CWDataBasePackage.NODE_RECORD__STOP:
				return stop != STOP_EDEFAULT;
			case CWDataBasePackage.NODE_RECORD__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
		result.append(" (start: ");
		result.append(start);
		result.append(", stop: ");
		result.append(stop);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //NodeRecordImpl
