/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificdatamodels.brn.device_wifi_link_stat_bcast_stats.impl;

import de.hub.clickwatch.analysis.traceable.Traceable;
import de.hub.clickwatch.analysis.traceable.TraceablePackage;
import de.hub.clickwatch.datamodel.impl.ValueImpl;

import de.hub.clickwatch.specificdatamodels.brn.device_wifi_link_stat_bcast_stats.Bcast_stats;
import de.hub.clickwatch.specificdatamodels.brn.device_wifi_link_stat_bcast_stats.Device_wifi_link_stat_bcast_statsPackage;
import de.hub.clickwatch.specificdatamodels.brn.device_wifi_link_stat_bcast_stats.Entry;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bcast stats</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_link_stat_bcast_stats.impl.Bcast_statsImpl#getTracesFrom <em>Traces From</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_link_stat_bcast_stats.impl.Bcast_statsImpl#getTracesTo <em>Traces To</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_link_stat_bcast_stats.impl.Bcast_statsImpl#getEntry <em>Entry</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Bcast_statsImpl extends ValueImpl implements Bcast_stats {
	/**
	 * The cached value of the '{@link #getTracesFrom() <em>Traces From</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTracesFrom()
	 * @generated
	 * @ordered
	 */
	protected EList<Traceable> tracesFrom;
	/**
	 * The cached value of the '{@link #getTracesTo() <em>Traces To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTracesTo()
	 * @generated
	 * @ordered
	 */
	protected EList<Traceable> tracesTo;
	/**
	 * The cached value of the '{@link #getEntry() <em>Entry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntry()
	 * @generated
	 * @ordered
	 */
	protected Entry entry;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Bcast_statsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Device_wifi_link_stat_bcast_statsPackage.Literals.BCAST_STATS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Traceable> getTracesFrom() {
		if (tracesFrom == null) {
			tracesFrom = new EObjectResolvingEList<Traceable>(Traceable.class, this, Device_wifi_link_stat_bcast_statsPackage.BCAST_STATS__TRACES_FROM);
		}
		return tracesFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Traceable> getTracesTo() {
		if (tracesTo == null) {
			tracesTo = new EObjectResolvingEList<Traceable>(Traceable.class, this, Device_wifi_link_stat_bcast_statsPackage.BCAST_STATS__TRACES_TO);
		}
		return tracesTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entry getEntry() {
		return entry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntry(Entry newEntry, NotificationChain msgs) {
		Entry oldEntry = entry;
		entry = newEntry;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Device_wifi_link_stat_bcast_statsPackage.BCAST_STATS__ENTRY, oldEntry, newEntry);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntry(Entry newEntry) {
		if (newEntry != entry) {
			NotificationChain msgs = null;
			if (entry != null)
				msgs = ((InternalEObject)entry).eInverseRemove(this, Device_wifi_link_stat_bcast_statsPackage.ENTRY__ECONTAINER_ENTRY, Entry.class, msgs);
			if (newEntry != null)
				msgs = ((InternalEObject)newEntry).eInverseAdd(this, Device_wifi_link_stat_bcast_statsPackage.ENTRY__ECONTAINER_ENTRY, Entry.class, msgs);
			msgs = basicSetEntry(newEntry, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_link_stat_bcast_statsPackage.BCAST_STATS__ENTRY, newEntry, newEntry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Device_wifi_link_stat_bcast_statsPackage.BCAST_STATS__ENTRY:
				if (entry != null)
					msgs = ((InternalEObject)entry).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Device_wifi_link_stat_bcast_statsPackage.BCAST_STATS__ENTRY, null, msgs);
				return basicSetEntry((Entry)otherEnd, msgs);
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
			case Device_wifi_link_stat_bcast_statsPackage.BCAST_STATS__ENTRY:
				return basicSetEntry(null, msgs);
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
			case Device_wifi_link_stat_bcast_statsPackage.BCAST_STATS__TRACES_FROM:
				return getTracesFrom();
			case Device_wifi_link_stat_bcast_statsPackage.BCAST_STATS__TRACES_TO:
				return getTracesTo();
			case Device_wifi_link_stat_bcast_statsPackage.BCAST_STATS__ENTRY:
				return getEntry();
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
			case Device_wifi_link_stat_bcast_statsPackage.BCAST_STATS__TRACES_FROM:
				getTracesFrom().clear();
				getTracesFrom().addAll((Collection<? extends Traceable>)newValue);
				return;
			case Device_wifi_link_stat_bcast_statsPackage.BCAST_STATS__TRACES_TO:
				getTracesTo().clear();
				getTracesTo().addAll((Collection<? extends Traceable>)newValue);
				return;
			case Device_wifi_link_stat_bcast_statsPackage.BCAST_STATS__ENTRY:
				setEntry((Entry)newValue);
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
			case Device_wifi_link_stat_bcast_statsPackage.BCAST_STATS__TRACES_FROM:
				getTracesFrom().clear();
				return;
			case Device_wifi_link_stat_bcast_statsPackage.BCAST_STATS__TRACES_TO:
				getTracesTo().clear();
				return;
			case Device_wifi_link_stat_bcast_statsPackage.BCAST_STATS__ENTRY:
				setEntry((Entry)null);
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
			case Device_wifi_link_stat_bcast_statsPackage.BCAST_STATS__TRACES_FROM:
				return tracesFrom != null && !tracesFrom.isEmpty();
			case Device_wifi_link_stat_bcast_statsPackage.BCAST_STATS__TRACES_TO:
				return tracesTo != null && !tracesTo.isEmpty();
			case Device_wifi_link_stat_bcast_statsPackage.BCAST_STATS__ENTRY:
				return entry != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Traceable.class) {
			switch (derivedFeatureID) {
				case Device_wifi_link_stat_bcast_statsPackage.BCAST_STATS__TRACES_FROM: return TraceablePackage.TRACEABLE__TRACES_FROM;
				case Device_wifi_link_stat_bcast_statsPackage.BCAST_STATS__TRACES_TO: return TraceablePackage.TRACEABLE__TRACES_TO;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Traceable.class) {
			switch (baseFeatureID) {
				case TraceablePackage.TRACEABLE__TRACES_FROM: return Device_wifi_link_stat_bcast_statsPackage.BCAST_STATS__TRACES_FROM;
				case TraceablePackage.TRACEABLE__TRACES_TO: return Device_wifi_link_stat_bcast_statsPackage.BCAST_STATS__TRACES_TO;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //Bcast_statsImpl
