/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.recoder.cwdatabase.impl;

import de.hub.clickwatch.model.Network;

import de.hub.clickwatch.recoder.cwdatabase.CWDataBasePackage;
import de.hub.clickwatch.recoder.cwdatabase.DataBase;
import de.hub.clickwatch.recoder.cwdatabase.ExperimentDescr;
import de.hub.clickwatch.recoder.cwdatabase.ExperimentRecord;
import de.hub.clickwatch.recoder.cwdatabase.ExperimentStatistics;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Experiment Descr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.clickwatch.recoder.cwdatabase.impl.ExperimentDescrImpl#getNetwork <em>Network</em>}</li>
 *   <li>{@link de.hub.clickwatch.recoder.cwdatabase.impl.ExperimentDescrImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.hub.clickwatch.recoder.cwdatabase.impl.ExperimentDescrImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link de.hub.clickwatch.recoder.cwdatabase.impl.ExperimentDescrImpl#getStart <em>Start</em>}</li>
 *   <li>{@link de.hub.clickwatch.recoder.cwdatabase.impl.ExperimentDescrImpl#getRecord <em>Record</em>}</li>
 *   <li>{@link de.hub.clickwatch.recoder.cwdatabase.impl.ExperimentDescrImpl#getNetworkTimeCopy <em>Network Time Copy</em>}</li>
 *   <li>{@link de.hub.clickwatch.recoder.cwdatabase.impl.ExperimentDescrImpl#getDataBase <em>Data Base</em>}</li>
 *   <li>{@link de.hub.clickwatch.recoder.cwdatabase.impl.ExperimentDescrImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link de.hub.clickwatch.recoder.cwdatabase.impl.ExperimentDescrImpl#getEnd <em>End</em>}</li>
 *   <li>{@link de.hub.clickwatch.recoder.cwdatabase.impl.ExperimentDescrImpl#getStatistics <em>Statistics</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExperimentDescrImpl extends EObjectImpl implements ExperimentDescr {
	/**
	 * The cached value of the '{@link #getNetwork() <em>Network</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetwork()
	 * @generated
	 * @ordered
	 */
	protected Network network;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

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
	 * The cached value of the '{@link #getRecord() <em>Record</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecord()
	 * @generated
	 * @ordered
	 */
	protected ExperimentRecord record;

	/**
	 * The cached value of the '{@link #getNetworkTimeCopy() <em>Network Time Copy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkTimeCopy()
	 * @generated
	 * @ordered
	 */
	protected Network networkTimeCopy;

	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final long DURATION_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected long duration = DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected static final long END_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected long end = END_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStatistics() <em>Statistics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatistics()
	 * @generated
	 * @ordered
	 */
	protected ExperimentStatistics statistics;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExperimentDescrImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CWDataBasePackage.Literals.EXPERIMENT_DESCR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Network getNetwork() {
		return network;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNetwork(Network newNetwork, NotificationChain msgs) {
		Network oldNetwork = network;
		network = newNetwork;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CWDataBasePackage.EXPERIMENT_DESCR__NETWORK, oldNetwork, newNetwork);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetwork(Network newNetwork) {
		if (newNetwork != network) {
			NotificationChain msgs = null;
			if (network != null)
				msgs = ((InternalEObject)network).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CWDataBasePackage.EXPERIMENT_DESCR__NETWORK, null, msgs);
			if (newNetwork != null)
				msgs = ((InternalEObject)newNetwork).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CWDataBasePackage.EXPERIMENT_DESCR__NETWORK, null, msgs);
			msgs = basicSetNetwork(newNetwork, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CWDataBasePackage.EXPERIMENT_DESCR__NETWORK, newNetwork, newNetwork));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CWDataBasePackage.EXPERIMENT_DESCR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CWDataBasePackage.EXPERIMENT_DESCR__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CWDataBasePackage.EXPERIMENT_DESCR__START, oldStart, start));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExperimentRecord getRecord() {
		if (record != null && record.eIsProxy()) {
			InternalEObject oldRecord = (InternalEObject)record;
			record = (ExperimentRecord)eResolveProxy(oldRecord);
			if (record != oldRecord) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CWDataBasePackage.EXPERIMENT_DESCR__RECORD, oldRecord, record));
			}
		}
		return record;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExperimentRecord basicGetRecord() {
		return record;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecord(ExperimentRecord newRecord) {
		ExperimentRecord oldRecord = record;
		record = newRecord;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CWDataBasePackage.EXPERIMENT_DESCR__RECORD, oldRecord, record));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Network getNetworkTimeCopy() {
		return networkTimeCopy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNetworkTimeCopy(Network newNetworkTimeCopy, NotificationChain msgs) {
		Network oldNetworkTimeCopy = networkTimeCopy;
		networkTimeCopy = newNetworkTimeCopy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CWDataBasePackage.EXPERIMENT_DESCR__NETWORK_TIME_COPY, oldNetworkTimeCopy, newNetworkTimeCopy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetworkTimeCopy(Network newNetworkTimeCopy) {
		if (newNetworkTimeCopy != networkTimeCopy) {
			NotificationChain msgs = null;
			if (networkTimeCopy != null)
				msgs = ((InternalEObject)networkTimeCopy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CWDataBasePackage.EXPERIMENT_DESCR__NETWORK_TIME_COPY, null, msgs);
			if (newNetworkTimeCopy != null)
				msgs = ((InternalEObject)newNetworkTimeCopy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CWDataBasePackage.EXPERIMENT_DESCR__NETWORK_TIME_COPY, null, msgs);
			msgs = basicSetNetworkTimeCopy(newNetworkTimeCopy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CWDataBasePackage.EXPERIMENT_DESCR__NETWORK_TIME_COPY, newNetworkTimeCopy, newNetworkTimeCopy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataBase getDataBase() {
		if (eContainerFeatureID() != CWDataBasePackage.EXPERIMENT_DESCR__DATA_BASE) return null;
		return (DataBase)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataBase(DataBase newDataBase, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDataBase, CWDataBasePackage.EXPERIMENT_DESCR__DATA_BASE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataBase(DataBase newDataBase) {
		if (newDataBase != eInternalContainer() || (eContainerFeatureID() != CWDataBasePackage.EXPERIMENT_DESCR__DATA_BASE && newDataBase != null)) {
			if (EcoreUtil.isAncestor(this, newDataBase))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDataBase != null)
				msgs = ((InternalEObject)newDataBase).eInverseAdd(this, CWDataBasePackage.DATA_BASE__EXPERIMENTS, DataBase.class, msgs);
			msgs = basicSetDataBase(newDataBase, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CWDataBasePackage.EXPERIMENT_DESCR__DATA_BASE, newDataBase, newDataBase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(long newDuration) {
		long oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CWDataBasePackage.EXPERIMENT_DESCR__DURATION, oldDuration, duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd(long newEnd) {
		long oldEnd = end;
		end = newEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CWDataBasePackage.EXPERIMENT_DESCR__END, oldEnd, end));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExperimentStatistics getStatistics() {
		return statistics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatistics(ExperimentStatistics newStatistics, NotificationChain msgs) {
		ExperimentStatistics oldStatistics = statistics;
		statistics = newStatistics;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CWDataBasePackage.EXPERIMENT_DESCR__STATISTICS, oldStatistics, newStatistics);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatistics(ExperimentStatistics newStatistics) {
		if (newStatistics != statistics) {
			NotificationChain msgs = null;
			if (statistics != null)
				msgs = ((InternalEObject)statistics).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CWDataBasePackage.EXPERIMENT_DESCR__STATISTICS, null, msgs);
			if (newStatistics != null)
				msgs = ((InternalEObject)newStatistics).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CWDataBasePackage.EXPERIMENT_DESCR__STATISTICS, null, msgs);
			msgs = basicSetStatistics(newStatistics, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CWDataBasePackage.EXPERIMENT_DESCR__STATISTICS, newStatistics, newStatistics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CWDataBasePackage.EXPERIMENT_DESCR__DATA_BASE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDataBase((DataBase)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CWDataBasePackage.EXPERIMENT_DESCR__NETWORK:
				return basicSetNetwork(null, msgs);
			case CWDataBasePackage.EXPERIMENT_DESCR__NETWORK_TIME_COPY:
				return basicSetNetworkTimeCopy(null, msgs);
			case CWDataBasePackage.EXPERIMENT_DESCR__DATA_BASE:
				return basicSetDataBase(null, msgs);
			case CWDataBasePackage.EXPERIMENT_DESCR__STATISTICS:
				return basicSetStatistics(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case CWDataBasePackage.EXPERIMENT_DESCR__DATA_BASE:
				return eInternalContainer().eInverseRemove(this, CWDataBasePackage.DATA_BASE__EXPERIMENTS, DataBase.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CWDataBasePackage.EXPERIMENT_DESCR__NETWORK:
				return getNetwork();
			case CWDataBasePackage.EXPERIMENT_DESCR__NAME:
				return getName();
			case CWDataBasePackage.EXPERIMENT_DESCR__DESCRIPTION:
				return getDescription();
			case CWDataBasePackage.EXPERIMENT_DESCR__START:
				return getStart();
			case CWDataBasePackage.EXPERIMENT_DESCR__RECORD:
				if (resolve) return getRecord();
				return basicGetRecord();
			case CWDataBasePackage.EXPERIMENT_DESCR__NETWORK_TIME_COPY:
				return getNetworkTimeCopy();
			case CWDataBasePackage.EXPERIMENT_DESCR__DATA_BASE:
				return getDataBase();
			case CWDataBasePackage.EXPERIMENT_DESCR__DURATION:
				return getDuration();
			case CWDataBasePackage.EXPERIMENT_DESCR__END:
				return getEnd();
			case CWDataBasePackage.EXPERIMENT_DESCR__STATISTICS:
				return getStatistics();
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
			case CWDataBasePackage.EXPERIMENT_DESCR__NETWORK:
				setNetwork((Network)newValue);
				return;
			case CWDataBasePackage.EXPERIMENT_DESCR__NAME:
				setName((String)newValue);
				return;
			case CWDataBasePackage.EXPERIMENT_DESCR__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case CWDataBasePackage.EXPERIMENT_DESCR__START:
				setStart((Long)newValue);
				return;
			case CWDataBasePackage.EXPERIMENT_DESCR__RECORD:
				setRecord((ExperimentRecord)newValue);
				return;
			case CWDataBasePackage.EXPERIMENT_DESCR__NETWORK_TIME_COPY:
				setNetworkTimeCopy((Network)newValue);
				return;
			case CWDataBasePackage.EXPERIMENT_DESCR__DATA_BASE:
				setDataBase((DataBase)newValue);
				return;
			case CWDataBasePackage.EXPERIMENT_DESCR__DURATION:
				setDuration((Long)newValue);
				return;
			case CWDataBasePackage.EXPERIMENT_DESCR__END:
				setEnd((Long)newValue);
				return;
			case CWDataBasePackage.EXPERIMENT_DESCR__STATISTICS:
				setStatistics((ExperimentStatistics)newValue);
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
			case CWDataBasePackage.EXPERIMENT_DESCR__NETWORK:
				setNetwork((Network)null);
				return;
			case CWDataBasePackage.EXPERIMENT_DESCR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CWDataBasePackage.EXPERIMENT_DESCR__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case CWDataBasePackage.EXPERIMENT_DESCR__START:
				setStart(START_EDEFAULT);
				return;
			case CWDataBasePackage.EXPERIMENT_DESCR__RECORD:
				setRecord((ExperimentRecord)null);
				return;
			case CWDataBasePackage.EXPERIMENT_DESCR__NETWORK_TIME_COPY:
				setNetworkTimeCopy((Network)null);
				return;
			case CWDataBasePackage.EXPERIMENT_DESCR__DATA_BASE:
				setDataBase((DataBase)null);
				return;
			case CWDataBasePackage.EXPERIMENT_DESCR__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case CWDataBasePackage.EXPERIMENT_DESCR__END:
				setEnd(END_EDEFAULT);
				return;
			case CWDataBasePackage.EXPERIMENT_DESCR__STATISTICS:
				setStatistics((ExperimentStatistics)null);
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
			case CWDataBasePackage.EXPERIMENT_DESCR__NETWORK:
				return network != null;
			case CWDataBasePackage.EXPERIMENT_DESCR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CWDataBasePackage.EXPERIMENT_DESCR__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case CWDataBasePackage.EXPERIMENT_DESCR__START:
				return start != START_EDEFAULT;
			case CWDataBasePackage.EXPERIMENT_DESCR__RECORD:
				return record != null;
			case CWDataBasePackage.EXPERIMENT_DESCR__NETWORK_TIME_COPY:
				return networkTimeCopy != null;
			case CWDataBasePackage.EXPERIMENT_DESCR__DATA_BASE:
				return getDataBase() != null;
			case CWDataBasePackage.EXPERIMENT_DESCR__DURATION:
				return duration != DURATION_EDEFAULT;
			case CWDataBasePackage.EXPERIMENT_DESCR__END:
				return end != END_EDEFAULT;
			case CWDataBasePackage.EXPERIMENT_DESCR__STATISTICS:
				return statistics != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", start: ");
		result.append(start);
		result.append(", duration: ");
		result.append(duration);
		result.append(", end: ");
		result.append(end);
		result.append(')');
		return result.toString();
	}

} //ExperimentDescrImpl
