/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl;

import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Channelstats;
import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Ctl;
import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsFactory;
import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage;
import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Ext;
import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac;
import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac_duration;
import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Mac_percentage;
import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Nb;
import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Neighbourstats;
import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Perf_counter;
import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Phy;
import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Rssi_extended;
import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Rssi_hist;
import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Stats;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Device_wifi_wifidevice_cst_statsFactoryImpl extends EFactoryImpl implements Device_wifi_wifidevice_cst_statsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Device_wifi_wifidevice_cst_statsFactory init() {
		try {
			Device_wifi_wifidevice_cst_statsFactory theDevice_wifi_wifidevice_cst_statsFactory = (Device_wifi_wifidevice_cst_statsFactory)EPackage.Registry.INSTANCE.getEFactory("http://de.hub.clickwatch.specificmodels.brn/device_wifi/wifidevice/cst/stats"); 
			if (theDevice_wifi_wifidevice_cst_statsFactory != null) {
				return theDevice_wifi_wifidevice_cst_statsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Device_wifi_wifidevice_cst_statsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Device_wifi_wifidevice_cst_statsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS: return createChannelstats();
			case Device_wifi_wifidevice_cst_statsPackage.CTL: return createCtl();
			case Device_wifi_wifidevice_cst_statsPackage.EXT: return createExt();
			case Device_wifi_wifidevice_cst_statsPackage.MAC: return createMac();
			case Device_wifi_wifidevice_cst_statsPackage.MAC_DURATION: return createMac_duration();
			case Device_wifi_wifidevice_cst_statsPackage.MAC_PERCENTAGE: return createMac_percentage();
			case Device_wifi_wifidevice_cst_statsPackage.NB: return createNb();
			case Device_wifi_wifidevice_cst_statsPackage.NEIGHBOURSTATS: return createNeighbourstats();
			case Device_wifi_wifidevice_cst_statsPackage.PERF_COUNTER: return createPerf_counter();
			case Device_wifi_wifidevice_cst_statsPackage.PHY: return createPhy();
			case Device_wifi_wifidevice_cst_statsPackage.RSSI_EXTENDED: return createRssi_extended();
			case Device_wifi_wifidevice_cst_statsPackage.RSSI_HIST: return createRssi_hist();
			case Device_wifi_wifidevice_cst_statsPackage.STATS: return createStats();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Channelstats createChannelstats() {
		ChannelstatsImpl channelstats = new ChannelstatsImpl();
		return channelstats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ctl createCtl() {
		CtlImpl ctl = new CtlImpl();
		return ctl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ext createExt() {
		ExtImpl ext = new ExtImpl();
		return ext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mac createMac() {
		MacImpl mac = new MacImpl();
		return mac;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mac_duration createMac_duration() {
		Mac_durationImpl mac_duration = new Mac_durationImpl();
		return mac_duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mac_percentage createMac_percentage() {
		Mac_percentageImpl mac_percentage = new Mac_percentageImpl();
		return mac_percentage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Nb createNb() {
		NbImpl nb = new NbImpl();
		return nb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Neighbourstats createNeighbourstats() {
		NeighbourstatsImpl neighbourstats = new NeighbourstatsImpl();
		return neighbourstats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Perf_counter createPerf_counter() {
		Perf_counterImpl perf_counter = new Perf_counterImpl();
		return perf_counter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Phy createPhy() {
		PhyImpl phy = new PhyImpl();
		return phy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rssi_extended createRssi_extended() {
		Rssi_extendedImpl rssi_extended = new Rssi_extendedImpl();
		return rssi_extended;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rssi_hist createRssi_hist() {
		Rssi_histImpl rssi_hist = new Rssi_histImpl();
		return rssi_hist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stats createStats() {
		StatsImpl stats = new StatsImpl();
		return stats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Device_wifi_wifidevice_cst_statsPackage getDevice_wifi_wifidevice_cst_statsPackage() {
		return (Device_wifi_wifidevice_cst_statsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Device_wifi_wifidevice_cst_statsPackage getPackage() {
		return Device_wifi_wifidevice_cst_statsPackage.eINSTANCE;
	}

} //Device_wifi_wifidevice_cst_statsFactoryImpl
