/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.recorder.database.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.hub.clickwatch.model.Network;
import de.hub.clickwatch.model.impl.ModelElementWithStatisticsImpl;
import de.hub.clickwatch.recorder.database.CWDataBasePackage;
import de.hub.clickwatch.recorder.database.HBaseRowMap;
import de.hub.clickwatch.recorder.database.Record;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Record</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.clickwatch.recorder.database.impl.RecordImpl#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link de.hub.clickwatch.recorder.database.impl.RecordImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.hub.clickwatch.recorder.database.impl.RecordImpl#getStart <em>Start</em>}</li>
 *   <li>{@link de.hub.clickwatch.recorder.database.impl.RecordImpl#getNetworkTimeCopy <em>Network Time Copy</em>}</li>
 *   <li>{@link de.hub.clickwatch.recorder.database.impl.RecordImpl#getEnd <em>End</em>}</li>
 *   <li>{@link de.hub.clickwatch.recorder.database.impl.RecordImpl#getHBaseRowMap <em>HBase Row Map</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RecordImpl extends ModelElementWithStatisticsImpl implements Record {
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
     * The cached value of the '{@link #getNetworkTimeCopy() <em>Network Time Copy</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getNetworkTimeCopy()
     * @generated
     * @ordered
     */
	protected Network networkTimeCopy;

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
     * The default value of the '{@link #getHBaseRowMap() <em>HBase Row Map</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getHBaseRowMap()
     * @generated
     * @ordered
     */
	protected static final HBaseRowMap HBASE_ROW_MAP_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getHBaseRowMap() <em>HBase Row Map</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getHBaseRowMap()
     * @generated
     * @ordered
     */
	protected HBaseRowMap hBaseRowMap = HBASE_ROW_MAP_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected RecordImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return CWDataBasePackage.Literals.RECORD;
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CWDataBasePackage.RECORD__CONFIGURATION, oldConfiguration, newConfiguration);
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
                msgs = ((InternalEObject)configuration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CWDataBasePackage.RECORD__CONFIGURATION, null, msgs);
            if (newConfiguration != null)
                msgs = ((InternalEObject)newConfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CWDataBasePackage.RECORD__CONFIGURATION, null, msgs);
            msgs = basicSetConfiguration(newConfiguration, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CWDataBasePackage.RECORD__CONFIGURATION, newConfiguration, newConfiguration));
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
            eNotify(new ENotificationImpl(this, Notification.SET, CWDataBasePackage.RECORD__NAME, oldName, name));
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
            eNotify(new ENotificationImpl(this, Notification.SET, CWDataBasePackage.RECORD__START, oldStart, start));
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CWDataBasePackage.RECORD__NETWORK_TIME_COPY, oldNetworkTimeCopy, newNetworkTimeCopy);
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
                msgs = ((InternalEObject)networkTimeCopy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CWDataBasePackage.RECORD__NETWORK_TIME_COPY, null, msgs);
            if (newNetworkTimeCopy != null)
                msgs = ((InternalEObject)newNetworkTimeCopy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CWDataBasePackage.RECORD__NETWORK_TIME_COPY, null, msgs);
            msgs = basicSetNetworkTimeCopy(newNetworkTimeCopy, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CWDataBasePackage.RECORD__NETWORK_TIME_COPY, newNetworkTimeCopy, newNetworkTimeCopy));
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
            eNotify(new ENotificationImpl(this, Notification.SET, CWDataBasePackage.RECORD__END, oldEnd, end));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public HBaseRowMap getHBaseRowMap() {
        return hBaseRowMap;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setHBaseRowMap(HBaseRowMap newHBaseRowMap) {
        HBaseRowMap oldHBaseRowMap = hBaseRowMap;
        hBaseRowMap = newHBaseRowMap;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CWDataBasePackage.RECORD__HBASE_ROW_MAP, oldHBaseRowMap, hBaseRowMap));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case CWDataBasePackage.RECORD__CONFIGURATION:
                return basicSetConfiguration(null, msgs);
            case CWDataBasePackage.RECORD__NETWORK_TIME_COPY:
                return basicSetNetworkTimeCopy(null, msgs);
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
            case CWDataBasePackage.RECORD__CONFIGURATION:
                return getConfiguration();
            case CWDataBasePackage.RECORD__NAME:
                return getName();
            case CWDataBasePackage.RECORD__START:
                return getStart();
            case CWDataBasePackage.RECORD__NETWORK_TIME_COPY:
                return getNetworkTimeCopy();
            case CWDataBasePackage.RECORD__END:
                return getEnd();
            case CWDataBasePackage.RECORD__HBASE_ROW_MAP:
                return getHBaseRowMap();
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
            case CWDataBasePackage.RECORD__CONFIGURATION:
                setConfiguration((Network)newValue);
                return;
            case CWDataBasePackage.RECORD__NAME:
                setName((String)newValue);
                return;
            case CWDataBasePackage.RECORD__START:
                setStart((Long)newValue);
                return;
            case CWDataBasePackage.RECORD__NETWORK_TIME_COPY:
                setNetworkTimeCopy((Network)newValue);
                return;
            case CWDataBasePackage.RECORD__END:
                setEnd((Long)newValue);
                return;
            case CWDataBasePackage.RECORD__HBASE_ROW_MAP:
                setHBaseRowMap((HBaseRowMap)newValue);
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
            case CWDataBasePackage.RECORD__CONFIGURATION:
                setConfiguration((Network)null);
                return;
            case CWDataBasePackage.RECORD__NAME:
                setName(NAME_EDEFAULT);
                return;
            case CWDataBasePackage.RECORD__START:
                setStart(START_EDEFAULT);
                return;
            case CWDataBasePackage.RECORD__NETWORK_TIME_COPY:
                setNetworkTimeCopy((Network)null);
                return;
            case CWDataBasePackage.RECORD__END:
                setEnd(END_EDEFAULT);
                return;
            case CWDataBasePackage.RECORD__HBASE_ROW_MAP:
                setHBaseRowMap(HBASE_ROW_MAP_EDEFAULT);
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
            case CWDataBasePackage.RECORD__CONFIGURATION:
                return configuration != null;
            case CWDataBasePackage.RECORD__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case CWDataBasePackage.RECORD__START:
                return start != START_EDEFAULT;
            case CWDataBasePackage.RECORD__NETWORK_TIME_COPY:
                return networkTimeCopy != null;
            case CWDataBasePackage.RECORD__END:
                return end != END_EDEFAULT;
            case CWDataBasePackage.RECORD__HBASE_ROW_MAP:
                return HBASE_ROW_MAP_EDEFAULT == null ? hBaseRowMap != null : !HBASE_ROW_MAP_EDEFAULT.equals(hBaseRowMap);
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
        result.append(", start: ");
        result.append(start);
        result.append(", end: ");
        result.append(end);
        result.append(", hBaseRowMap: ");
        result.append(hBaseRowMap);
        result.append(')');
        return result.toString();
    }

} //RecordImpl
