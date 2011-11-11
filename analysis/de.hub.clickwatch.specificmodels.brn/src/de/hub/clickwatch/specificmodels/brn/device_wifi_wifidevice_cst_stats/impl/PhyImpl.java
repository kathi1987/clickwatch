/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl;

import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Channelstats;
import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage;
import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Phy;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Phy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.PhyImpl#getEContainer_phy <em>EContainer phy</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.PhyImpl#getHwbusy <em>Hwbusy</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.PhyImpl#getHwrx <em>Hwrx</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.PhyImpl#getHwtx <em>Hwtx</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.PhyImpl#getLast_hw_stat_time <em>Last hw stat time</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.PhyImpl#getHw_stats_count <em>Hw stats count</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.PhyImpl#getAvg_noise <em>Avg noise</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.PhyImpl#getStd_noise <em>Std noise</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.PhyImpl#getAvg_rssi <em>Avg rssi</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.PhyImpl#getStd_rssi <em>Std rssi</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.PhyImpl#getCtl_rssi0 <em>Ctl rssi0</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.PhyImpl#getCtl_rssi1 <em>Ctl rssi1</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.PhyImpl#getCtl_rssi2 <em>Ctl rssi2</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.PhyImpl#getExt_rssi0 <em>Ext rssi0</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.PhyImpl#getExt_rssi1 <em>Ext rssi1</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.PhyImpl#getExt_rssi2 <em>Ext rssi2</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.PhyImpl#getChannel <em>Channel</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PhyImpl extends EObjectImpl implements Phy {
	/**
     * The default value of the '{@link #getHwbusy() <em>Hwbusy</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getHwbusy()
     * @generated
     * @ordered
     */
	protected static final int HWBUSY_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getHwbusy() <em>Hwbusy</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getHwbusy()
     * @generated
     * @ordered
     */
	protected int hwbusy = HWBUSY_EDEFAULT;

	/**
     * The default value of the '{@link #getHwrx() <em>Hwrx</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getHwrx()
     * @generated
     * @ordered
     */
	protected static final int HWRX_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getHwrx() <em>Hwrx</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getHwrx()
     * @generated
     * @ordered
     */
	protected int hwrx = HWRX_EDEFAULT;

	/**
     * The default value of the '{@link #getHwtx() <em>Hwtx</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getHwtx()
     * @generated
     * @ordered
     */
	protected static final int HWTX_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getHwtx() <em>Hwtx</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getHwtx()
     * @generated
     * @ordered
     */
	protected int hwtx = HWTX_EDEFAULT;

	/**
     * The default value of the '{@link #getLast_hw_stat_time() <em>Last hw stat time</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getLast_hw_stat_time()
     * @generated
     * @ordered
     */
	protected static final double LAST_HW_STAT_TIME_EDEFAULT = 0.0;

	/**
     * The cached value of the '{@link #getLast_hw_stat_time() <em>Last hw stat time</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getLast_hw_stat_time()
     * @generated
     * @ordered
     */
	protected double last_hw_stat_time = LAST_HW_STAT_TIME_EDEFAULT;

	/**
     * The default value of the '{@link #getHw_stats_count() <em>Hw stats count</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getHw_stats_count()
     * @generated
     * @ordered
     */
	protected static final int HW_STATS_COUNT_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getHw_stats_count() <em>Hw stats count</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getHw_stats_count()
     * @generated
     * @ordered
     */
	protected int hw_stats_count = HW_STATS_COUNT_EDEFAULT;

	/**
     * The default value of the '{@link #getAvg_noise() <em>Avg noise</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getAvg_noise()
     * @generated
     * @ordered
     */
	protected static final int AVG_NOISE_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getAvg_noise() <em>Avg noise</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getAvg_noise()
     * @generated
     * @ordered
     */
	protected int avg_noise = AVG_NOISE_EDEFAULT;

	/**
     * The default value of the '{@link #getStd_noise() <em>Std noise</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getStd_noise()
     * @generated
     * @ordered
     */
	protected static final int STD_NOISE_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getStd_noise() <em>Std noise</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getStd_noise()
     * @generated
     * @ordered
     */
	protected int std_noise = STD_NOISE_EDEFAULT;

	/**
     * The default value of the '{@link #getAvg_rssi() <em>Avg rssi</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getAvg_rssi()
     * @generated
     * @ordered
     */
	protected static final int AVG_RSSI_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getAvg_rssi() <em>Avg rssi</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getAvg_rssi()
     * @generated
     * @ordered
     */
	protected int avg_rssi = AVG_RSSI_EDEFAULT;

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
     * The default value of the '{@link #getCtl_rssi0() <em>Ctl rssi0</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getCtl_rssi0()
     * @generated
     * @ordered
     */
	protected static final int CTL_RSSI0_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getCtl_rssi0() <em>Ctl rssi0</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getCtl_rssi0()
     * @generated
     * @ordered
     */
	protected int ctl_rssi0 = CTL_RSSI0_EDEFAULT;

	/**
     * The default value of the '{@link #getCtl_rssi1() <em>Ctl rssi1</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getCtl_rssi1()
     * @generated
     * @ordered
     */
	protected static final int CTL_RSSI1_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getCtl_rssi1() <em>Ctl rssi1</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getCtl_rssi1()
     * @generated
     * @ordered
     */
	protected int ctl_rssi1 = CTL_RSSI1_EDEFAULT;

	/**
     * The default value of the '{@link #getCtl_rssi2() <em>Ctl rssi2</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getCtl_rssi2()
     * @generated
     * @ordered
     */
	protected static final int CTL_RSSI2_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getCtl_rssi2() <em>Ctl rssi2</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getCtl_rssi2()
     * @generated
     * @ordered
     */
	protected int ctl_rssi2 = CTL_RSSI2_EDEFAULT;

	/**
     * The default value of the '{@link #getExt_rssi0() <em>Ext rssi0</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getExt_rssi0()
     * @generated
     * @ordered
     */
	protected static final int EXT_RSSI0_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getExt_rssi0() <em>Ext rssi0</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getExt_rssi0()
     * @generated
     * @ordered
     */
	protected int ext_rssi0 = EXT_RSSI0_EDEFAULT;

	/**
     * The default value of the '{@link #getExt_rssi1() <em>Ext rssi1</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getExt_rssi1()
     * @generated
     * @ordered
     */
	protected static final int EXT_RSSI1_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getExt_rssi1() <em>Ext rssi1</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getExt_rssi1()
     * @generated
     * @ordered
     */
	protected int ext_rssi1 = EXT_RSSI1_EDEFAULT;

	/**
     * The default value of the '{@link #getExt_rssi2() <em>Ext rssi2</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getExt_rssi2()
     * @generated
     * @ordered
     */
	protected static final int EXT_RSSI2_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getExt_rssi2() <em>Ext rssi2</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getExt_rssi2()
     * @generated
     * @ordered
     */
	protected int ext_rssi2 = EXT_RSSI2_EDEFAULT;

	/**
     * The default value of the '{@link #getChannel() <em>Channel</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getChannel()
     * @generated
     * @ordered
     */
	protected static final int CHANNEL_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getChannel() <em>Channel</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getChannel()
     * @generated
     * @ordered
     */
	protected int channel = CHANNEL_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected PhyImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return Device_wifi_wifidevice_cst_statsPackage.Literals.PHY;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Channelstats getEContainer_phy() {
        if (eContainerFeatureID() != Device_wifi_wifidevice_cst_statsPackage.PHY__ECONTAINER_PHY) return null;
        return (Channelstats)eContainer();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetEContainer_phy(Channelstats newEContainer_phy, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newEContainer_phy, Device_wifi_wifidevice_cst_statsPackage.PHY__ECONTAINER_PHY, msgs);
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setEContainer_phy(Channelstats newEContainer_phy) {
        if (newEContainer_phy != eInternalContainer() || (eContainerFeatureID() != Device_wifi_wifidevice_cst_statsPackage.PHY__ECONTAINER_PHY && newEContainer_phy != null)) {
            if (EcoreUtil.isAncestor(this, newEContainer_phy))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newEContainer_phy != null)
                msgs = ((InternalEObject)newEContainer_phy).eInverseAdd(this, Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__PHY, Channelstats.class, msgs);
            msgs = basicSetEContainer_phy(newEContainer_phy, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_cst_statsPackage.PHY__ECONTAINER_PHY, newEContainer_phy, newEContainer_phy));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public int getHwbusy() {
        return hwbusy;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setHwbusy(int newHwbusy) {
        int oldHwbusy = hwbusy;
        hwbusy = newHwbusy;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_cst_statsPackage.PHY__HWBUSY, oldHwbusy, hwbusy));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public int getHwrx() {
        return hwrx;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setHwrx(int newHwrx) {
        int oldHwrx = hwrx;
        hwrx = newHwrx;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_cst_statsPackage.PHY__HWRX, oldHwrx, hwrx));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public int getHwtx() {
        return hwtx;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setHwtx(int newHwtx) {
        int oldHwtx = hwtx;
        hwtx = newHwtx;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_cst_statsPackage.PHY__HWTX, oldHwtx, hwtx));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public double getLast_hw_stat_time() {
        return last_hw_stat_time;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setLast_hw_stat_time(double newLast_hw_stat_time) {
        double oldLast_hw_stat_time = last_hw_stat_time;
        last_hw_stat_time = newLast_hw_stat_time;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_cst_statsPackage.PHY__LAST_HW_STAT_TIME, oldLast_hw_stat_time, last_hw_stat_time));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public int getHw_stats_count() {
        return hw_stats_count;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setHw_stats_count(int newHw_stats_count) {
        int oldHw_stats_count = hw_stats_count;
        hw_stats_count = newHw_stats_count;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_cst_statsPackage.PHY__HW_STATS_COUNT, oldHw_stats_count, hw_stats_count));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public int getAvg_noise() {
        return avg_noise;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setAvg_noise(int newAvg_noise) {
        int oldAvg_noise = avg_noise;
        avg_noise = newAvg_noise;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_cst_statsPackage.PHY__AVG_NOISE, oldAvg_noise, avg_noise));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public int getStd_noise() {
        return std_noise;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setStd_noise(int newStd_noise) {
        int oldStd_noise = std_noise;
        std_noise = newStd_noise;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_cst_statsPackage.PHY__STD_NOISE, oldStd_noise, std_noise));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public int getAvg_rssi() {
        return avg_rssi;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setAvg_rssi(int newAvg_rssi) {
        int oldAvg_rssi = avg_rssi;
        avg_rssi = newAvg_rssi;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_cst_statsPackage.PHY__AVG_RSSI, oldAvg_rssi, avg_rssi));
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
            eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_cst_statsPackage.PHY__STD_RSSI, oldStd_rssi, std_rssi));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public int getCtl_rssi0() {
        return ctl_rssi0;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setCtl_rssi0(int newCtl_rssi0) {
        int oldCtl_rssi0 = ctl_rssi0;
        ctl_rssi0 = newCtl_rssi0;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_cst_statsPackage.PHY__CTL_RSSI0, oldCtl_rssi0, ctl_rssi0));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public int getCtl_rssi1() {
        return ctl_rssi1;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setCtl_rssi1(int newCtl_rssi1) {
        int oldCtl_rssi1 = ctl_rssi1;
        ctl_rssi1 = newCtl_rssi1;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_cst_statsPackage.PHY__CTL_RSSI1, oldCtl_rssi1, ctl_rssi1));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public int getCtl_rssi2() {
        return ctl_rssi2;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setCtl_rssi2(int newCtl_rssi2) {
        int oldCtl_rssi2 = ctl_rssi2;
        ctl_rssi2 = newCtl_rssi2;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_cst_statsPackage.PHY__CTL_RSSI2, oldCtl_rssi2, ctl_rssi2));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public int getExt_rssi0() {
        return ext_rssi0;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setExt_rssi0(int newExt_rssi0) {
        int oldExt_rssi0 = ext_rssi0;
        ext_rssi0 = newExt_rssi0;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_cst_statsPackage.PHY__EXT_RSSI0, oldExt_rssi0, ext_rssi0));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public int getExt_rssi1() {
        return ext_rssi1;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setExt_rssi1(int newExt_rssi1) {
        int oldExt_rssi1 = ext_rssi1;
        ext_rssi1 = newExt_rssi1;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_cst_statsPackage.PHY__EXT_RSSI1, oldExt_rssi1, ext_rssi1));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public int getExt_rssi2() {
        return ext_rssi2;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setExt_rssi2(int newExt_rssi2) {
        int oldExt_rssi2 = ext_rssi2;
        ext_rssi2 = newExt_rssi2;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_cst_statsPackage.PHY__EXT_RSSI2, oldExt_rssi2, ext_rssi2));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public int getChannel() {
        return channel;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setChannel(int newChannel) {
        int oldChannel = channel;
        channel = newChannel;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_cst_statsPackage.PHY__CHANNEL, oldChannel, channel));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case Device_wifi_wifidevice_cst_statsPackage.PHY__ECONTAINER_PHY:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetEContainer_phy((Channelstats)otherEnd, msgs);
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
            case Device_wifi_wifidevice_cst_statsPackage.PHY__ECONTAINER_PHY:
                return basicSetEContainer_phy(null, msgs);
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
            case Device_wifi_wifidevice_cst_statsPackage.PHY__ECONTAINER_PHY:
                return eInternalContainer().eInverseRemove(this, Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__PHY, Channelstats.class, msgs);
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
            case Device_wifi_wifidevice_cst_statsPackage.PHY__ECONTAINER_PHY:
                return getEContainer_phy();
            case Device_wifi_wifidevice_cst_statsPackage.PHY__HWBUSY:
                return getHwbusy();
            case Device_wifi_wifidevice_cst_statsPackage.PHY__HWRX:
                return getHwrx();
            case Device_wifi_wifidevice_cst_statsPackage.PHY__HWTX:
                return getHwtx();
            case Device_wifi_wifidevice_cst_statsPackage.PHY__LAST_HW_STAT_TIME:
                return getLast_hw_stat_time();
            case Device_wifi_wifidevice_cst_statsPackage.PHY__HW_STATS_COUNT:
                return getHw_stats_count();
            case Device_wifi_wifidevice_cst_statsPackage.PHY__AVG_NOISE:
                return getAvg_noise();
            case Device_wifi_wifidevice_cst_statsPackage.PHY__STD_NOISE:
                return getStd_noise();
            case Device_wifi_wifidevice_cst_statsPackage.PHY__AVG_RSSI:
                return getAvg_rssi();
            case Device_wifi_wifidevice_cst_statsPackage.PHY__STD_RSSI:
                return getStd_rssi();
            case Device_wifi_wifidevice_cst_statsPackage.PHY__CTL_RSSI0:
                return getCtl_rssi0();
            case Device_wifi_wifidevice_cst_statsPackage.PHY__CTL_RSSI1:
                return getCtl_rssi1();
            case Device_wifi_wifidevice_cst_statsPackage.PHY__CTL_RSSI2:
                return getCtl_rssi2();
            case Device_wifi_wifidevice_cst_statsPackage.PHY__EXT_RSSI0:
                return getExt_rssi0();
            case Device_wifi_wifidevice_cst_statsPackage.PHY__EXT_RSSI1:
                return getExt_rssi1();
            case Device_wifi_wifidevice_cst_statsPackage.PHY__EXT_RSSI2:
                return getExt_rssi2();
            case Device_wifi_wifidevice_cst_statsPackage.PHY__CHANNEL:
                return getChannel();
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
            case Device_wifi_wifidevice_cst_statsPackage.PHY__ECONTAINER_PHY:
                setEContainer_phy((Channelstats)newValue);
                return;
            case Device_wifi_wifidevice_cst_statsPackage.PHY__HWBUSY:
                setHwbusy((Integer)newValue);
                return;
            case Device_wifi_wifidevice_cst_statsPackage.PHY__HWRX:
                setHwrx((Integer)newValue);
                return;
            case Device_wifi_wifidevice_cst_statsPackage.PHY__HWTX:
                setHwtx((Integer)newValue);
                return;
            case Device_wifi_wifidevice_cst_statsPackage.PHY__LAST_HW_STAT_TIME:
                setLast_hw_stat_time((Double)newValue);
                return;
            case Device_wifi_wifidevice_cst_statsPackage.PHY__HW_STATS_COUNT:
                setHw_stats_count((Integer)newValue);
                return;
            case Device_wifi_wifidevice_cst_statsPackage.PHY__AVG_NOISE:
                setAvg_noise((Integer)newValue);
                return;
            case Device_wifi_wifidevice_cst_statsPackage.PHY__STD_NOISE:
                setStd_noise((Integer)newValue);
                return;
            case Device_wifi_wifidevice_cst_statsPackage.PHY__AVG_RSSI:
                setAvg_rssi((Integer)newValue);
                return;
            case Device_wifi_wifidevice_cst_statsPackage.PHY__STD_RSSI:
                setStd_rssi((Integer)newValue);
                return;
            case Device_wifi_wifidevice_cst_statsPackage.PHY__CTL_RSSI0:
                setCtl_rssi0((Integer)newValue);
                return;
            case Device_wifi_wifidevice_cst_statsPackage.PHY__CTL_RSSI1:
                setCtl_rssi1((Integer)newValue);
                return;
            case Device_wifi_wifidevice_cst_statsPackage.PHY__CTL_RSSI2:
                setCtl_rssi2((Integer)newValue);
                return;
            case Device_wifi_wifidevice_cst_statsPackage.PHY__EXT_RSSI0:
                setExt_rssi0((Integer)newValue);
                return;
            case Device_wifi_wifidevice_cst_statsPackage.PHY__EXT_RSSI1:
                setExt_rssi1((Integer)newValue);
                return;
            case Device_wifi_wifidevice_cst_statsPackage.PHY__EXT_RSSI2:
                setExt_rssi2((Integer)newValue);
                return;
            case Device_wifi_wifidevice_cst_statsPackage.PHY__CHANNEL:
                setChannel((Integer)newValue);
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
            case Device_wifi_wifidevice_cst_statsPackage.PHY__ECONTAINER_PHY:
                setEContainer_phy((Channelstats)null);
                return;
            case Device_wifi_wifidevice_cst_statsPackage.PHY__HWBUSY:
                setHwbusy(HWBUSY_EDEFAULT);
                return;
            case Device_wifi_wifidevice_cst_statsPackage.PHY__HWRX:
                setHwrx(HWRX_EDEFAULT);
                return;
            case Device_wifi_wifidevice_cst_statsPackage.PHY__HWTX:
                setHwtx(HWTX_EDEFAULT);
                return;
            case Device_wifi_wifidevice_cst_statsPackage.PHY__LAST_HW_STAT_TIME:
                setLast_hw_stat_time(LAST_HW_STAT_TIME_EDEFAULT);
                return;
            case Device_wifi_wifidevice_cst_statsPackage.PHY__HW_STATS_COUNT:
                setHw_stats_count(HW_STATS_COUNT_EDEFAULT);
                return;
            case Device_wifi_wifidevice_cst_statsPackage.PHY__AVG_NOISE:
                setAvg_noise(AVG_NOISE_EDEFAULT);
                return;
            case Device_wifi_wifidevice_cst_statsPackage.PHY__STD_NOISE:
                setStd_noise(STD_NOISE_EDEFAULT);
                return;
            case Device_wifi_wifidevice_cst_statsPackage.PHY__AVG_RSSI:
                setAvg_rssi(AVG_RSSI_EDEFAULT);
                return;
            case Device_wifi_wifidevice_cst_statsPackage.PHY__STD_RSSI:
                setStd_rssi(STD_RSSI_EDEFAULT);
                return;
            case Device_wifi_wifidevice_cst_statsPackage.PHY__CTL_RSSI0:
                setCtl_rssi0(CTL_RSSI0_EDEFAULT);
                return;
            case Device_wifi_wifidevice_cst_statsPackage.PHY__CTL_RSSI1:
                setCtl_rssi1(CTL_RSSI1_EDEFAULT);
                return;
            case Device_wifi_wifidevice_cst_statsPackage.PHY__CTL_RSSI2:
                setCtl_rssi2(CTL_RSSI2_EDEFAULT);
                return;
            case Device_wifi_wifidevice_cst_statsPackage.PHY__EXT_RSSI0:
                setExt_rssi0(EXT_RSSI0_EDEFAULT);
                return;
            case Device_wifi_wifidevice_cst_statsPackage.PHY__EXT_RSSI1:
                setExt_rssi1(EXT_RSSI1_EDEFAULT);
                return;
            case Device_wifi_wifidevice_cst_statsPackage.PHY__EXT_RSSI2:
                setExt_rssi2(EXT_RSSI2_EDEFAULT);
                return;
            case Device_wifi_wifidevice_cst_statsPackage.PHY__CHANNEL:
                setChannel(CHANNEL_EDEFAULT);
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
            case Device_wifi_wifidevice_cst_statsPackage.PHY__ECONTAINER_PHY:
                return getEContainer_phy() != null;
            case Device_wifi_wifidevice_cst_statsPackage.PHY__HWBUSY:
                return hwbusy != HWBUSY_EDEFAULT;
            case Device_wifi_wifidevice_cst_statsPackage.PHY__HWRX:
                return hwrx != HWRX_EDEFAULT;
            case Device_wifi_wifidevice_cst_statsPackage.PHY__HWTX:
                return hwtx != HWTX_EDEFAULT;
            case Device_wifi_wifidevice_cst_statsPackage.PHY__LAST_HW_STAT_TIME:
                return last_hw_stat_time != LAST_HW_STAT_TIME_EDEFAULT;
            case Device_wifi_wifidevice_cst_statsPackage.PHY__HW_STATS_COUNT:
                return hw_stats_count != HW_STATS_COUNT_EDEFAULT;
            case Device_wifi_wifidevice_cst_statsPackage.PHY__AVG_NOISE:
                return avg_noise != AVG_NOISE_EDEFAULT;
            case Device_wifi_wifidevice_cst_statsPackage.PHY__STD_NOISE:
                return std_noise != STD_NOISE_EDEFAULT;
            case Device_wifi_wifidevice_cst_statsPackage.PHY__AVG_RSSI:
                return avg_rssi != AVG_RSSI_EDEFAULT;
            case Device_wifi_wifidevice_cst_statsPackage.PHY__STD_RSSI:
                return std_rssi != STD_RSSI_EDEFAULT;
            case Device_wifi_wifidevice_cst_statsPackage.PHY__CTL_RSSI0:
                return ctl_rssi0 != CTL_RSSI0_EDEFAULT;
            case Device_wifi_wifidevice_cst_statsPackage.PHY__CTL_RSSI1:
                return ctl_rssi1 != CTL_RSSI1_EDEFAULT;
            case Device_wifi_wifidevice_cst_statsPackage.PHY__CTL_RSSI2:
                return ctl_rssi2 != CTL_RSSI2_EDEFAULT;
            case Device_wifi_wifidevice_cst_statsPackage.PHY__EXT_RSSI0:
                return ext_rssi0 != EXT_RSSI0_EDEFAULT;
            case Device_wifi_wifidevice_cst_statsPackage.PHY__EXT_RSSI1:
                return ext_rssi1 != EXT_RSSI1_EDEFAULT;
            case Device_wifi_wifidevice_cst_statsPackage.PHY__EXT_RSSI2:
                return ext_rssi2 != EXT_RSSI2_EDEFAULT;
            case Device_wifi_wifidevice_cst_statsPackage.PHY__CHANNEL:
                return channel != CHANNEL_EDEFAULT;
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
        result.append(" (hwbusy: ");
        result.append(hwbusy);
        result.append(", hwrx: ");
        result.append(hwrx);
        result.append(", hwtx: ");
        result.append(hwtx);
        result.append(", last_hw_stat_time: ");
        result.append(last_hw_stat_time);
        result.append(", hw_stats_count: ");
        result.append(hw_stats_count);
        result.append(", avg_noise: ");
        result.append(avg_noise);
        result.append(", std_noise: ");
        result.append(std_noise);
        result.append(", avg_rssi: ");
        result.append(avg_rssi);
        result.append(", std_rssi: ");
        result.append(std_rssi);
        result.append(", ctl_rssi0: ");
        result.append(ctl_rssi0);
        result.append(", ctl_rssi1: ");
        result.append(ctl_rssi1);
        result.append(", ctl_rssi2: ");
        result.append(ctl_rssi2);
        result.append(", ext_rssi0: ");
        result.append(ext_rssi0);
        result.append(", ext_rssi1: ");
        result.append(ext_rssi1);
        result.append(", ext_rssi2: ");
        result.append(ext_rssi2);
        result.append(", channel: ");
        result.append(channel);
        result.append(')');
        return result.toString();
    }

} //PhyImpl
