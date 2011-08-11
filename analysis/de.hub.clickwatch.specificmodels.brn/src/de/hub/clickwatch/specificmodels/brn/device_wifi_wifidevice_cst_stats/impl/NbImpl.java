/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl;

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

import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage;
import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Nb;
import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Neighbourstats;
import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Rssi_extended;
import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Rssi_hist;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nb</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.NbImpl#getEContainer_nb <em>EContainer nb</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.NbImpl#getText <em>Text</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.NbImpl#getRssi_extended <em>Rssi extended</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.NbImpl#getRssi_hist <em>Rssi hist</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.NbImpl#getAddr <em>Addr</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.NbImpl#getRssi <em>Rssi</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.NbImpl#getStd_rssi <em>Std rssi</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.NbImpl#getMin_rssi <em>Min rssi</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.NbImpl#getMax_rssi <em>Max rssi</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.NbImpl#getPkt_cnt <em>Pkt cnt</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.NbImpl#getRx_bytes <em>Rx bytes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NbImpl extends EObjectImpl implements Nb {
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
	 * The cached value of the '{@link #getRssi_extended() <em>Rssi extended</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRssi_extended()
	 * @generated
	 * @ordered
	 */
	protected Rssi_extended rssi_extended;

	/**
	 * The cached value of the '{@link #getRssi_hist() <em>Rssi hist</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRssi_hist()
	 * @generated
	 * @ordered
	 */
	protected Rssi_hist rssi_hist;

	/**
	 * The default value of the '{@link #getAddr() <em>Addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddr()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddr() <em>Addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddr()
	 * @generated
	 * @ordered
	 */
	protected String addr = ADDR_EDEFAULT;

	/**
	 * The default value of the '{@link #getRssi() <em>Rssi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRssi()
	 * @generated
	 * @ordered
	 */
	protected static final int RSSI_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRssi() <em>Rssi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRssi()
	 * @generated
	 * @ordered
	 */
	protected int rssi = RSSI_EDEFAULT;

	/**
	 * The default value of the '{@link #getStd_rssi() <em>Std rssi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStd_rssi()
	 * @generated
	 * @ordered
	 */
	protected static final int STD_RSSI_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStd_rssi() <em>Std rssi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStd_rssi()
	 * @generated
	 * @ordered
	 */
	protected int std_rssi = STD_RSSI_EDEFAULT;

	/**
	 * The default value of the '{@link #getMin_rssi() <em>Min rssi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin_rssi()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_RSSI_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMin_rssi() <em>Min rssi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin_rssi()
	 * @generated
	 * @ordered
	 */
	protected int min_rssi = MIN_RSSI_EDEFAULT;

	/**
	 * The default value of the '{@link #getMax_rssi() <em>Max rssi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax_rssi()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_RSSI_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMax_rssi() <em>Max rssi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax_rssi()
	 * @generated
	 * @ordered
	 */
	protected int max_rssi = MAX_RSSI_EDEFAULT;

	/**
	 * The default value of the '{@link #getPkt_cnt() <em>Pkt cnt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPkt_cnt()
	 * @generated
	 * @ordered
	 */
	protected static final int PKT_CNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPkt_cnt() <em>Pkt cnt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPkt_cnt()
	 * @generated
	 * @ordered
	 */
	protected int pkt_cnt = PKT_CNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRx_bytes() <em>Rx bytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRx_bytes()
	 * @generated
	 * @ordered
	 */
	protected static final int RX_BYTES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRx_bytes() <em>Rx bytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRx_bytes()
	 * @generated
	 * @ordered
	 */
	protected int rx_bytes = RX_BYTES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NbImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Device_wifi_wifidevice_cst_statsPackage.Literals.NB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Neighbourstats getEContainer_nb() {
		if (eContainerFeatureID() != Device_wifi_wifidevice_cst_statsPackage.NB__ECONTAINER_NB) return null;
		return (Neighbourstats)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEContainer_nb(Neighbourstats newEContainer_nb, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEContainer_nb, Device_wifi_wifidevice_cst_statsPackage.NB__ECONTAINER_NB, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEContainer_nb(Neighbourstats newEContainer_nb) {
		if (newEContainer_nb != eInternalContainer() || (eContainerFeatureID() != Device_wifi_wifidevice_cst_statsPackage.NB__ECONTAINER_NB && newEContainer_nb != null)) {
			if (EcoreUtil.isAncestor(this, newEContainer_nb))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEContainer_nb != null)
				msgs = ((InternalEObject)newEContainer_nb).eInverseAdd(this, Device_wifi_wifidevice_cst_statsPackage.NEIGHBOURSTATS__NB, Neighbourstats.class, msgs);
			msgs = basicSetEContainer_nb(newEContainer_nb, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_cst_statsPackage.NB__ECONTAINER_NB, newEContainer_nb, newEContainer_nb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getText() {
		if (text == null) {
			text = new EDataTypeEList<String>(String.class, this, Device_wifi_wifidevice_cst_statsPackage.NB__TEXT);
		}
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rssi_extended getRssi_extended() {
		return rssi_extended;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRssi_extended(Rssi_extended newRssi_extended, NotificationChain msgs) {
		Rssi_extended oldRssi_extended = rssi_extended;
		rssi_extended = newRssi_extended;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_cst_statsPackage.NB__RSSI_EXTENDED, oldRssi_extended, newRssi_extended);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRssi_extended(Rssi_extended newRssi_extended) {
		if (newRssi_extended != rssi_extended) {
			NotificationChain msgs = null;
			if (rssi_extended != null)
				msgs = ((InternalEObject)rssi_extended).eInverseRemove(this, Device_wifi_wifidevice_cst_statsPackage.RSSI_EXTENDED__ECONTAINER_RSSI_EXTENDED, Rssi_extended.class, msgs);
			if (newRssi_extended != null)
				msgs = ((InternalEObject)newRssi_extended).eInverseAdd(this, Device_wifi_wifidevice_cst_statsPackage.RSSI_EXTENDED__ECONTAINER_RSSI_EXTENDED, Rssi_extended.class, msgs);
			msgs = basicSetRssi_extended(newRssi_extended, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_cst_statsPackage.NB__RSSI_EXTENDED, newRssi_extended, newRssi_extended));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rssi_hist getRssi_hist() {
		return rssi_hist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRssi_hist(Rssi_hist newRssi_hist, NotificationChain msgs) {
		Rssi_hist oldRssi_hist = rssi_hist;
		rssi_hist = newRssi_hist;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_cst_statsPackage.NB__RSSI_HIST, oldRssi_hist, newRssi_hist);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRssi_hist(Rssi_hist newRssi_hist) {
		if (newRssi_hist != rssi_hist) {
			NotificationChain msgs = null;
			if (rssi_hist != null)
				msgs = ((InternalEObject)rssi_hist).eInverseRemove(this, Device_wifi_wifidevice_cst_statsPackage.RSSI_HIST__ECONTAINER_RSSI_HIST, Rssi_hist.class, msgs);
			if (newRssi_hist != null)
				msgs = ((InternalEObject)newRssi_hist).eInverseAdd(this, Device_wifi_wifidevice_cst_statsPackage.RSSI_HIST__ECONTAINER_RSSI_HIST, Rssi_hist.class, msgs);
			msgs = basicSetRssi_hist(newRssi_hist, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_cst_statsPackage.NB__RSSI_HIST, newRssi_hist, newRssi_hist));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAddr() {
		return addr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddr(String newAddr) {
		String oldAddr = addr;
		addr = newAddr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_cst_statsPackage.NB__ADDR, oldAddr, addr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRssi() {
		return rssi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRssi(int newRssi) {
		int oldRssi = rssi;
		rssi = newRssi;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_cst_statsPackage.NB__RSSI, oldRssi, rssi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStd_rssi() {
		return std_rssi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStd_rssi(int newStd_rssi) {
		int oldStd_rssi = std_rssi;
		std_rssi = newStd_rssi;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_cst_statsPackage.NB__STD_RSSI, oldStd_rssi, std_rssi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMin_rssi() {
		return min_rssi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMin_rssi(int newMin_rssi) {
		int oldMin_rssi = min_rssi;
		min_rssi = newMin_rssi;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_cst_statsPackage.NB__MIN_RSSI, oldMin_rssi, min_rssi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMax_rssi() {
		return max_rssi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMax_rssi(int newMax_rssi) {
		int oldMax_rssi = max_rssi;
		max_rssi = newMax_rssi;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_cst_statsPackage.NB__MAX_RSSI, oldMax_rssi, max_rssi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPkt_cnt() {
		return pkt_cnt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPkt_cnt(int newPkt_cnt) {
		int oldPkt_cnt = pkt_cnt;
		pkt_cnt = newPkt_cnt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_cst_statsPackage.NB__PKT_CNT, oldPkt_cnt, pkt_cnt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRx_bytes() {
		return rx_bytes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRx_bytes(int newRx_bytes) {
		int oldRx_bytes = rx_bytes;
		rx_bytes = newRx_bytes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_cst_statsPackage.NB__RX_BYTES, oldRx_bytes, rx_bytes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Device_wifi_wifidevice_cst_statsPackage.NB__ECONTAINER_NB:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEContainer_nb((Neighbourstats)otherEnd, msgs);
			case Device_wifi_wifidevice_cst_statsPackage.NB__RSSI_EXTENDED:
				if (rssi_extended != null)
					msgs = ((InternalEObject)rssi_extended).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Device_wifi_wifidevice_cst_statsPackage.NB__RSSI_EXTENDED, null, msgs);
				return basicSetRssi_extended((Rssi_extended)otherEnd, msgs);
			case Device_wifi_wifidevice_cst_statsPackage.NB__RSSI_HIST:
				if (rssi_hist != null)
					msgs = ((InternalEObject)rssi_hist).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Device_wifi_wifidevice_cst_statsPackage.NB__RSSI_HIST, null, msgs);
				return basicSetRssi_hist((Rssi_hist)otherEnd, msgs);
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
			case Device_wifi_wifidevice_cst_statsPackage.NB__ECONTAINER_NB:
				return basicSetEContainer_nb(null, msgs);
			case Device_wifi_wifidevice_cst_statsPackage.NB__RSSI_EXTENDED:
				return basicSetRssi_extended(null, msgs);
			case Device_wifi_wifidevice_cst_statsPackage.NB__RSSI_HIST:
				return basicSetRssi_hist(null, msgs);
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
			case Device_wifi_wifidevice_cst_statsPackage.NB__ECONTAINER_NB:
				return eInternalContainer().eInverseRemove(this, Device_wifi_wifidevice_cst_statsPackage.NEIGHBOURSTATS__NB, Neighbourstats.class, msgs);
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
			case Device_wifi_wifidevice_cst_statsPackage.NB__ECONTAINER_NB:
				return getEContainer_nb();
			case Device_wifi_wifidevice_cst_statsPackage.NB__TEXT:
				return getText();
			case Device_wifi_wifidevice_cst_statsPackage.NB__RSSI_EXTENDED:
				return getRssi_extended();
			case Device_wifi_wifidevice_cst_statsPackage.NB__RSSI_HIST:
				return getRssi_hist();
			case Device_wifi_wifidevice_cst_statsPackage.NB__ADDR:
				return getAddr();
			case Device_wifi_wifidevice_cst_statsPackage.NB__RSSI:
				return getRssi();
			case Device_wifi_wifidevice_cst_statsPackage.NB__STD_RSSI:
				return getStd_rssi();
			case Device_wifi_wifidevice_cst_statsPackage.NB__MIN_RSSI:
				return getMin_rssi();
			case Device_wifi_wifidevice_cst_statsPackage.NB__MAX_RSSI:
				return getMax_rssi();
			case Device_wifi_wifidevice_cst_statsPackage.NB__PKT_CNT:
				return getPkt_cnt();
			case Device_wifi_wifidevice_cst_statsPackage.NB__RX_BYTES:
				return getRx_bytes();
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
			case Device_wifi_wifidevice_cst_statsPackage.NB__ECONTAINER_NB:
				setEContainer_nb((Neighbourstats)newValue);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.NB__TEXT:
				getText().clear();
				getText().addAll((Collection<? extends String>)newValue);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.NB__RSSI_EXTENDED:
				setRssi_extended((Rssi_extended)newValue);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.NB__RSSI_HIST:
				setRssi_hist((Rssi_hist)newValue);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.NB__ADDR:
				setAddr((String)newValue);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.NB__RSSI:
				setRssi((Integer)newValue);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.NB__STD_RSSI:
				setStd_rssi((Integer)newValue);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.NB__MIN_RSSI:
				setMin_rssi((Integer)newValue);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.NB__MAX_RSSI:
				setMax_rssi((Integer)newValue);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.NB__PKT_CNT:
				setPkt_cnt((Integer)newValue);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.NB__RX_BYTES:
				setRx_bytes((Integer)newValue);
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
			case Device_wifi_wifidevice_cst_statsPackage.NB__ECONTAINER_NB:
				setEContainer_nb((Neighbourstats)null);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.NB__TEXT:
				getText().clear();
				return;
			case Device_wifi_wifidevice_cst_statsPackage.NB__RSSI_EXTENDED:
				setRssi_extended((Rssi_extended)null);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.NB__RSSI_HIST:
				setRssi_hist((Rssi_hist)null);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.NB__ADDR:
				setAddr(ADDR_EDEFAULT);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.NB__RSSI:
				setRssi(RSSI_EDEFAULT);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.NB__STD_RSSI:
				setStd_rssi(STD_RSSI_EDEFAULT);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.NB__MIN_RSSI:
				setMin_rssi(MIN_RSSI_EDEFAULT);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.NB__MAX_RSSI:
				setMax_rssi(MAX_RSSI_EDEFAULT);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.NB__PKT_CNT:
				setPkt_cnt(PKT_CNT_EDEFAULT);
				return;
			case Device_wifi_wifidevice_cst_statsPackage.NB__RX_BYTES:
				setRx_bytes(RX_BYTES_EDEFAULT);
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
			case Device_wifi_wifidevice_cst_statsPackage.NB__ECONTAINER_NB:
				return getEContainer_nb() != null;
			case Device_wifi_wifidevice_cst_statsPackage.NB__TEXT:
				return text != null && !text.isEmpty();
			case Device_wifi_wifidevice_cst_statsPackage.NB__RSSI_EXTENDED:
				return rssi_extended != null;
			case Device_wifi_wifidevice_cst_statsPackage.NB__RSSI_HIST:
				return rssi_hist != null;
			case Device_wifi_wifidevice_cst_statsPackage.NB__ADDR:
				return ADDR_EDEFAULT == null ? addr != null : !ADDR_EDEFAULT.equals(addr);
			case Device_wifi_wifidevice_cst_statsPackage.NB__RSSI:
				return rssi != RSSI_EDEFAULT;
			case Device_wifi_wifidevice_cst_statsPackage.NB__STD_RSSI:
				return std_rssi != STD_RSSI_EDEFAULT;
			case Device_wifi_wifidevice_cst_statsPackage.NB__MIN_RSSI:
				return min_rssi != MIN_RSSI_EDEFAULT;
			case Device_wifi_wifidevice_cst_statsPackage.NB__MAX_RSSI:
				return max_rssi != MAX_RSSI_EDEFAULT;
			case Device_wifi_wifidevice_cst_statsPackage.NB__PKT_CNT:
				return pkt_cnt != PKT_CNT_EDEFAULT;
			case Device_wifi_wifidevice_cst_statsPackage.NB__RX_BYTES:
				return rx_bytes != RX_BYTES_EDEFAULT;
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
		result.append(", addr: ");
		result.append(addr);
		result.append(", rssi: ");
		result.append(rssi);
		result.append(", std_rssi: ");
		result.append(std_rssi);
		result.append(", min_rssi: ");
		result.append(min_rssi);
		result.append(", max_rssi: ");
		result.append(max_rssi);
		result.append(", pkt_cnt: ");
		result.append(pkt_cnt);
		result.append(", rx_bytes: ");
		result.append(rx_bytes);
		result.append(')');
		return result.toString();
	}

} //NbImpl
