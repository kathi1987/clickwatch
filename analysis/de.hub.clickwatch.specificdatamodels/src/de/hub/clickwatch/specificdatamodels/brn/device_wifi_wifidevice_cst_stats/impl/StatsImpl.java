/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.impl;

import de.hub.clickwatch.analysis.traceable.Traceable;
import de.hub.clickwatch.analysis.traceable.TraceablePackage;
import de.hub.clickwatch.datamodel.impl.ValueImpl;

import de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Channelstats;
import de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage;
import de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Stats;

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
 * An implementation of the model object '<em><b>Stats</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.impl.StatsImpl#getTracesFrom <em>Traces From</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.impl.StatsImpl#getTracesTo <em>Traces To</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.impl.StatsImpl#getChannelstats <em>Channelstats</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StatsImpl extends ValueImpl implements Stats {
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
	 * The cached value of the '{@link #getChannelstats() <em>Channelstats</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannelstats()
	 * @generated
	 * @ordered
	 */
	protected Channelstats channelstats;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StatsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Device_wifi_wifidevice_cst_statsPackage.Literals.STATS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Traceable> getTracesFrom() {
		if (tracesFrom == null) {
			tracesFrom = new EObjectResolvingEList<Traceable>(Traceable.class, this, Device_wifi_wifidevice_cst_statsPackage.STATS__TRACES_FROM);
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
			tracesTo = new EObjectResolvingEList<Traceable>(Traceable.class, this, Device_wifi_wifidevice_cst_statsPackage.STATS__TRACES_TO);
		}
		return tracesTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Channelstats getChannelstats() {
		return channelstats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChannelstats(Channelstats newChannelstats, NotificationChain msgs) {
		Channelstats oldChannelstats = channelstats;
		channelstats = newChannelstats;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_cst_statsPackage.STATS__CHANNELSTATS, oldChannelstats, newChannelstats);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChannelstats(Channelstats newChannelstats) {
		if (newChannelstats != channelstats) {
			NotificationChain msgs = null;
			if (channelstats != null)
				msgs = ((InternalEObject)channelstats).eInverseRemove(this, Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__ECONTAINER_CHANNELSTATS, Channelstats.class, msgs);
			if (newChannelstats != null)
				msgs = ((InternalEObject)newChannelstats).eInverseAdd(this, Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__ECONTAINER_CHANNELSTATS, Channelstats.class, msgs);
			msgs = basicSetChannelstats(newChannelstats, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_cst_statsPackage.STATS__CHANNELSTATS, newChannelstats, newChannelstats));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Device_wifi_wifidevice_cst_statsPackage.STATS__CHANNELSTATS:
				if (channelstats != null)
					msgs = ((InternalEObject)channelstats).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Device_wifi_wifidevice_cst_statsPackage.STATS__CHANNELSTATS, null, msgs);
				return basicSetChannelstats((Channelstats)otherEnd, msgs);
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
			case Device_wifi_wifidevice_cst_statsPackage.STATS__CHANNELSTATS:
				return basicSetChannelstats(null, msgs);
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
			case Device_wifi_wifidevice_cst_statsPackage.STATS__TRACES_FROM:
				return getTracesFrom();
			case Device_wifi_wifidevice_cst_statsPackage.STATS__TRACES_TO:
				return getTracesTo();
			case Device_wifi_wifidevice_cst_statsPackage.STATS__CHANNELSTATS:
				return getChannelstats();
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
			case Device_wifi_wifidevice_cst_statsPackage.STATS__TRACES_FROM:
				getTracesFrom().clear();
				getTracesFrom().addAll((Collection<? extends Traceable>)newValue);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.STATS__TRACES_TO:
				getTracesTo().clear();
				getTracesTo().addAll((Collection<? extends Traceable>)newValue);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.STATS__CHANNELSTATS:
				setChannelstats((Channelstats)newValue);
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
			case Device_wifi_wifidevice_cst_statsPackage.STATS__TRACES_FROM:
				getTracesFrom().clear();
				return;
			case Device_wifi_wifidevice_cst_statsPackage.STATS__TRACES_TO:
				getTracesTo().clear();
				return;
			case Device_wifi_wifidevice_cst_statsPackage.STATS__CHANNELSTATS:
				setChannelstats((Channelstats)null);
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
			case Device_wifi_wifidevice_cst_statsPackage.STATS__TRACES_FROM:
				return tracesFrom != null && !tracesFrom.isEmpty();
			case Device_wifi_wifidevice_cst_statsPackage.STATS__TRACES_TO:
				return tracesTo != null && !tracesTo.isEmpty();
			case Device_wifi_wifidevice_cst_statsPackage.STATS__CHANNELSTATS:
				return channelstats != null;
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
				case Device_wifi_wifidevice_cst_statsPackage.STATS__TRACES_FROM: return TraceablePackage.TRACEABLE__TRACES_FROM;
				case Device_wifi_wifidevice_cst_statsPackage.STATS__TRACES_TO: return TraceablePackage.TRACEABLE__TRACES_TO;
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
				case TraceablePackage.TRACEABLE__TRACES_FROM: return Device_wifi_wifidevice_cst_statsPackage.STATS__TRACES_FROM;
				case TraceablePackage.TRACEABLE__TRACES_TO: return Device_wifi_wifidevice_cst_statsPackage.STATS__TRACES_TO;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //StatsImpl
