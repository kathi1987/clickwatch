/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl;

import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Channelstats;
import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage;
import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac;
import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac_duration;
import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac_percentage;
import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Neighbourstats;
import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Perf_counter;
import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Phy;
import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Stats;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Channelstats</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.ChannelstatsImpl#getEContainer_channelstats <em>EContainer channelstats</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.ChannelstatsImpl#getText <em>Text</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.ChannelstatsImpl#getMac <em>Mac</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.ChannelstatsImpl#getMac_percentage <em>Mac percentage</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.ChannelstatsImpl#getMac_duration <em>Mac duration</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.ChannelstatsImpl#getPhy <em>Phy</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.ChannelstatsImpl#getPerf_counter <em>Perf counter</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.ChannelstatsImpl#getNeighbourstats <em>Neighbourstats</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.ChannelstatsImpl#getNode <em>Node</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.ChannelstatsImpl#getTime <em>Time</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.ChannelstatsImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.ChannelstatsImpl#getLength <em>Length</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.ChannelstatsImpl#getHw_duration <em>Hw duration</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.ChannelstatsImpl#getUnit <em>Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChannelstatsImpl extends EObjectImpl implements Channelstats {
	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected EList<String> text;

	/**
	 * The cached value of the '{@link #getMac() <em>Mac</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMac()
	 * @generated
	 * @ordered
	 */
	protected Mac mac;

	/**
	 * The cached value of the '{@link #getMac_percentage() <em>Mac percentage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMac_percentage()
	 * @generated
	 * @ordered
	 */
	protected Mac_percentage mac_percentage;

	/**
	 * The cached value of the '{@link #getMac_duration() <em>Mac duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMac_duration()
	 * @generated
	 * @ordered
	 */
	protected Mac_duration mac_duration;

	/**
	 * The cached value of the '{@link #getPhy() <em>Phy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhy()
	 * @generated
	 * @ordered
	 */
	protected Phy phy;

	/**
	 * The cached value of the '{@link #getPerf_counter() <em>Perf counter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerf_counter()
	 * @generated
	 * @ordered
	 */
	protected Perf_counter perf_counter;

	/**
	 * The cached value of the '{@link #getNeighbourstats() <em>Neighbourstats</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeighbourstats()
	 * @generated
	 * @ordered
	 */
	protected Neighbourstats neighbourstats;

	/**
	 * The default value of the '{@link #getNode() <em>Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode()
	 * @generated
	 * @ordered
	 */
	protected static final String NODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNode() <em>Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode()
	 * @generated
	 * @ordered
	 */
	protected String node = NODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected static final double TIME_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected double time = TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected static final int LENGTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected int length = LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getHw_duration() <em>Hw duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHw_duration()
	 * @generated
	 * @ordered
	 */
	protected static final int HW_DURATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHw_duration() <em>Hw duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHw_duration()
	 * @generated
	 * @ordered
	 */
	protected int hw_duration = HW_DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected String unit = UNIT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChannelstatsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Device_wifi_wifidevice_cst_statsPackage.Literals.CHANNELSTATS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stats getEContainer_channelstats() {
		if (eContainerFeatureID() != Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__ECONTAINER_CHANNELSTATS) return null;
		return (Stats)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEContainer_channelstats(Stats newEContainer_channelstats, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEContainer_channelstats, Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__ECONTAINER_CHANNELSTATS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEContainer_channelstats(Stats newEContainer_channelstats) {
		if (newEContainer_channelstats != eInternalContainer() || (eContainerFeatureID() != Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__ECONTAINER_CHANNELSTATS && newEContainer_channelstats != null)) {
			if (EcoreUtil.isAncestor(this, newEContainer_channelstats))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEContainer_channelstats != null)
				msgs = ((InternalEObject)newEContainer_channelstats).eInverseAdd(this, Device_wifi_wifidevice_cst_statsPackage.STATS__CHANNELSTATS, Stats.class, msgs);
			msgs = basicSetEContainer_channelstats(newEContainer_channelstats, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__ECONTAINER_CHANNELSTATS, newEContainer_channelstats, newEContainer_channelstats));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getText() {
		if (text == null) {
			text = new EDataTypeEList<String>(String.class, this, Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__TEXT);
		}
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mac getMac() {
		return mac;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMac(Mac newMac, NotificationChain msgs) {
		Mac oldMac = mac;
		mac = newMac;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__MAC, oldMac, newMac);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMac(Mac newMac) {
		if (newMac != mac) {
			NotificationChain msgs = null;
			if (mac != null)
				msgs = ((InternalEObject)mac).eInverseRemove(this, Device_wifi_wifidevice_cst_statsPackage.MAC__ECONTAINER_MAC, Mac.class, msgs);
			if (newMac != null)
				msgs = ((InternalEObject)newMac).eInverseAdd(this, Device_wifi_wifidevice_cst_statsPackage.MAC__ECONTAINER_MAC, Mac.class, msgs);
			msgs = basicSetMac(newMac, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__MAC, newMac, newMac));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mac_percentage getMac_percentage() {
		return mac_percentage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMac_percentage(Mac_percentage newMac_percentage, NotificationChain msgs) {
		Mac_percentage oldMac_percentage = mac_percentage;
		mac_percentage = newMac_percentage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__MAC_PERCENTAGE, oldMac_percentage, newMac_percentage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMac_percentage(Mac_percentage newMac_percentage) {
		if (newMac_percentage != mac_percentage) {
			NotificationChain msgs = null;
			if (mac_percentage != null)
				msgs = ((InternalEObject)mac_percentage).eInverseRemove(this, Device_wifi_wifidevice_cst_statsPackage.MAC_PERCENTAGE__ECONTAINER_MAC_PERCENTAGE, Mac_percentage.class, msgs);
			if (newMac_percentage != null)
				msgs = ((InternalEObject)newMac_percentage).eInverseAdd(this, Device_wifi_wifidevice_cst_statsPackage.MAC_PERCENTAGE__ECONTAINER_MAC_PERCENTAGE, Mac_percentage.class, msgs);
			msgs = basicSetMac_percentage(newMac_percentage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__MAC_PERCENTAGE, newMac_percentage, newMac_percentage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mac_duration getMac_duration() {
		return mac_duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMac_duration(Mac_duration newMac_duration, NotificationChain msgs) {
		Mac_duration oldMac_duration = mac_duration;
		mac_duration = newMac_duration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__MAC_DURATION, oldMac_duration, newMac_duration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMac_duration(Mac_duration newMac_duration) {
		if (newMac_duration != mac_duration) {
			NotificationChain msgs = null;
			if (mac_duration != null)
				msgs = ((InternalEObject)mac_duration).eInverseRemove(this, Device_wifi_wifidevice_cst_statsPackage.MAC_DURATION__ECONTAINER_MAC_DURATION, Mac_duration.class, msgs);
			if (newMac_duration != null)
				msgs = ((InternalEObject)newMac_duration).eInverseAdd(this, Device_wifi_wifidevice_cst_statsPackage.MAC_DURATION__ECONTAINER_MAC_DURATION, Mac_duration.class, msgs);
			msgs = basicSetMac_duration(newMac_duration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__MAC_DURATION, newMac_duration, newMac_duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Phy getPhy() {
		return phy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPhy(Phy newPhy, NotificationChain msgs) {
		Phy oldPhy = phy;
		phy = newPhy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__PHY, oldPhy, newPhy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhy(Phy newPhy) {
		if (newPhy != phy) {
			NotificationChain msgs = null;
			if (phy != null)
				msgs = ((InternalEObject)phy).eInverseRemove(this, Device_wifi_wifidevice_cst_statsPackage.PHY__ECONTAINER_PHY, Phy.class, msgs);
			if (newPhy != null)
				msgs = ((InternalEObject)newPhy).eInverseAdd(this, Device_wifi_wifidevice_cst_statsPackage.PHY__ECONTAINER_PHY, Phy.class, msgs);
			msgs = basicSetPhy(newPhy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__PHY, newPhy, newPhy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Perf_counter getPerf_counter() {
		return perf_counter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPerf_counter(Perf_counter newPerf_counter, NotificationChain msgs) {
		Perf_counter oldPerf_counter = perf_counter;
		perf_counter = newPerf_counter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__PERF_COUNTER, oldPerf_counter, newPerf_counter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerf_counter(Perf_counter newPerf_counter) {
		if (newPerf_counter != perf_counter) {
			NotificationChain msgs = null;
			if (perf_counter != null)
				msgs = ((InternalEObject)perf_counter).eInverseRemove(this, Device_wifi_wifidevice_cst_statsPackage.PERF_COUNTER__ECONTAINER_PERF_COUNTER, Perf_counter.class, msgs);
			if (newPerf_counter != null)
				msgs = ((InternalEObject)newPerf_counter).eInverseAdd(this, Device_wifi_wifidevice_cst_statsPackage.PERF_COUNTER__ECONTAINER_PERF_COUNTER, Perf_counter.class, msgs);
			msgs = basicSetPerf_counter(newPerf_counter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__PERF_COUNTER, newPerf_counter, newPerf_counter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Neighbourstats getNeighbourstats() {
		return neighbourstats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNeighbourstats(Neighbourstats newNeighbourstats, NotificationChain msgs) {
		Neighbourstats oldNeighbourstats = neighbourstats;
		neighbourstats = newNeighbourstats;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__NEIGHBOURSTATS, oldNeighbourstats, newNeighbourstats);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNeighbourstats(Neighbourstats newNeighbourstats) {
		if (newNeighbourstats != neighbourstats) {
			NotificationChain msgs = null;
			if (neighbourstats != null)
				msgs = ((InternalEObject)neighbourstats).eInverseRemove(this, Device_wifi_wifidevice_cst_statsPackage.NEIGHBOURSTATS__ECONTAINER_NEIGHBOURSTATS, Neighbourstats.class, msgs);
			if (newNeighbourstats != null)
				msgs = ((InternalEObject)newNeighbourstats).eInverseAdd(this, Device_wifi_wifidevice_cst_statsPackage.NEIGHBOURSTATS__ECONTAINER_NEIGHBOURSTATS, Neighbourstats.class, msgs);
			msgs = basicSetNeighbourstats(newNeighbourstats, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__NEIGHBOURSTATS, newNeighbourstats, newNeighbourstats));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNode() {
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNode(String newNode) {
		String oldNode = node;
		node = newNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__NODE, oldNode, node));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime(double newTime) {
		double oldTime = time;
		time = newTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLength(int newLength) {
		int oldLength = length;
		length = newLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__LENGTH, oldLength, length));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHw_duration() {
		return hw_duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHw_duration(int newHw_duration) {
		int oldHw_duration = hw_duration;
		hw_duration = newHw_duration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__HW_DURATION, oldHw_duration, hw_duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(String newUnit) {
		String oldUnit = unit;
		unit = newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__UNIT, oldUnit, unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__ECONTAINER_CHANNELSTATS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEContainer_channelstats((Stats)otherEnd, msgs);
			case Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__MAC:
				if (mac != null)
					msgs = ((InternalEObject)mac).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__MAC, null, msgs);
				return basicSetMac((Mac)otherEnd, msgs);
			case Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__MAC_PERCENTAGE:
				if (mac_percentage != null)
					msgs = ((InternalEObject)mac_percentage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__MAC_PERCENTAGE, null, msgs);
				return basicSetMac_percentage((Mac_percentage)otherEnd, msgs);
			case Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__MAC_DURATION:
				if (mac_duration != null)
					msgs = ((InternalEObject)mac_duration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__MAC_DURATION, null, msgs);
				return basicSetMac_duration((Mac_duration)otherEnd, msgs);
			case Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__PHY:
				if (phy != null)
					msgs = ((InternalEObject)phy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__PHY, null, msgs);
				return basicSetPhy((Phy)otherEnd, msgs);
			case Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__PERF_COUNTER:
				if (perf_counter != null)
					msgs = ((InternalEObject)perf_counter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__PERF_COUNTER, null, msgs);
				return basicSetPerf_counter((Perf_counter)otherEnd, msgs);
			case Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__NEIGHBOURSTATS:
				if (neighbourstats != null)
					msgs = ((InternalEObject)neighbourstats).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__NEIGHBOURSTATS, null, msgs);
				return basicSetNeighbourstats((Neighbourstats)otherEnd, msgs);
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
			case Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__ECONTAINER_CHANNELSTATS:
				return basicSetEContainer_channelstats(null, msgs);
			case Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__MAC:
				return basicSetMac(null, msgs);
			case Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__MAC_PERCENTAGE:
				return basicSetMac_percentage(null, msgs);
			case Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__MAC_DURATION:
				return basicSetMac_duration(null, msgs);
			case Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__PHY:
				return basicSetPhy(null, msgs);
			case Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__PERF_COUNTER:
				return basicSetPerf_counter(null, msgs);
			case Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__NEIGHBOURSTATS:
				return basicSetNeighbourstats(null, msgs);
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
			case Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__ECONTAINER_CHANNELSTATS:
				return eInternalContainer().eInverseRemove(this, Device_wifi_wifidevice_cst_statsPackage.STATS__CHANNELSTATS, Stats.class, msgs);
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
			case Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__ECONTAINER_CHANNELSTATS:
				return getEContainer_channelstats();
			case Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__TEXT:
				return getText();
			case Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__MAC:
				return getMac();
			case Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__MAC_PERCENTAGE:
				return getMac_percentage();
			case Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__MAC_DURATION:
				return getMac_duration();
			case Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__PHY:
				return getPhy();
			case Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__PERF_COUNTER:
				return getPerf_counter();
			case Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__NEIGHBOURSTATS:
				return getNeighbourstats();
			case Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__NODE:
				return getNode();
			case Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__TIME:
				return getTime();
			case Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__ID:
				return getId();
			case Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__LENGTH:
				return getLength();
			case Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__HW_DURATION:
				return getHw_duration();
			case Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__UNIT:
				return getUnit();
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
			case Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__ECONTAINER_CHANNELSTATS:
				setEContainer_channelstats((Stats)newValue);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__TEXT:
				getText().clear();
				getText().addAll((Collection<? extends String>)newValue);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__MAC:
				setMac((Mac)newValue);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__MAC_PERCENTAGE:
				setMac_percentage((Mac_percentage)newValue);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__MAC_DURATION:
				setMac_duration((Mac_duration)newValue);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__PHY:
				setPhy((Phy)newValue);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__PERF_COUNTER:
				setPerf_counter((Perf_counter)newValue);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__NEIGHBOURSTATS:
				setNeighbourstats((Neighbourstats)newValue);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__NODE:
				setNode((String)newValue);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__TIME:
				setTime((Double)newValue);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__ID:
				setId((Integer)newValue);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__LENGTH:
				setLength((Integer)newValue);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__HW_DURATION:
				setHw_duration((Integer)newValue);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__UNIT:
				setUnit((String)newValue);
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
			case Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__ECONTAINER_CHANNELSTATS:
				setEContainer_channelstats((Stats)null);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__TEXT:
				getText().clear();
				return;
			case Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__MAC:
				setMac((Mac)null);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__MAC_PERCENTAGE:
				setMac_percentage((Mac_percentage)null);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__MAC_DURATION:
				setMac_duration((Mac_duration)null);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__PHY:
				setPhy((Phy)null);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__PERF_COUNTER:
				setPerf_counter((Perf_counter)null);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__NEIGHBOURSTATS:
				setNeighbourstats((Neighbourstats)null);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__NODE:
				setNode(NODE_EDEFAULT);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__TIME:
				setTime(TIME_EDEFAULT);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__ID:
				setId(ID_EDEFAULT);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__LENGTH:
				setLength(LENGTH_EDEFAULT);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__HW_DURATION:
				setHw_duration(HW_DURATION_EDEFAULT);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__UNIT:
				setUnit(UNIT_EDEFAULT);
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
			case Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__ECONTAINER_CHANNELSTATS:
				return getEContainer_channelstats() != null;
			case Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__TEXT:
				return text != null && !text.isEmpty();
			case Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__MAC:
				return mac != null;
			case Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__MAC_PERCENTAGE:
				return mac_percentage != null;
			case Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__MAC_DURATION:
				return mac_duration != null;
			case Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__PHY:
				return phy != null;
			case Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__PERF_COUNTER:
				return perf_counter != null;
			case Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__NEIGHBOURSTATS:
				return neighbourstats != null;
			case Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__NODE:
				return NODE_EDEFAULT == null ? node != null : !NODE_EDEFAULT.equals(node);
			case Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__TIME:
				return time != TIME_EDEFAULT;
			case Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__ID:
				return id != ID_EDEFAULT;
			case Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__LENGTH:
				return length != LENGTH_EDEFAULT;
			case Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__HW_DURATION:
				return hw_duration != HW_DURATION_EDEFAULT;
			case Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__UNIT:
				return UNIT_EDEFAULT == null ? unit != null : !UNIT_EDEFAULT.equals(unit);
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
		result.append(" (text: ");
		result.append(text);
		result.append(", node: ");
		result.append(node);
		result.append(", time: ");
		result.append(time);
		result.append(", id: ");
		result.append(id);
		result.append(", length: ");
		result.append(length);
		result.append(", hw_duration: ");
		result.append(hw_duration);
		result.append(", unit: ");
		result.append(unit);
		result.append(')');
		return result.toString();
	}

} //ChannelstatsImpl
