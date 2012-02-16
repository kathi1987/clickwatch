/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.util;

import de.hub.clickwatch.datamodel.Value;

import de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage
 * @generated
 */
public class Device_wifi_wifidevice_cst_statsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Device_wifi_wifidevice_cst_statsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Device_wifi_wifidevice_cst_statsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Device_wifi_wifidevice_cst_statsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Device_wifi_wifidevice_cst_statsSwitch<Adapter> modelSwitch =
		new Device_wifi_wifidevice_cst_statsSwitch<Adapter>() {
			@Override
			public Adapter caseChannelstats(Channelstats object) {
				return createChannelstatsAdapter();
			}
			@Override
			public Adapter caseCtl(Ctl object) {
				return createCtlAdapter();
			}
			@Override
			public Adapter caseExt(Ext object) {
				return createExtAdapter();
			}
			@Override
			public Adapter caseMac(Mac object) {
				return createMacAdapter();
			}
			@Override
			public Adapter caseMac_duration(Mac_duration object) {
				return createMac_durationAdapter();
			}
			@Override
			public Adapter caseMac_percentage(Mac_percentage object) {
				return createMac_percentageAdapter();
			}
			@Override
			public Adapter caseNb(Nb object) {
				return createNbAdapter();
			}
			@Override
			public Adapter caseNeighbourstats(Neighbourstats object) {
				return createNeighbourstatsAdapter();
			}
			@Override
			public Adapter casePerf_counter(Perf_counter object) {
				return createPerf_counterAdapter();
			}
			@Override
			public Adapter casePhy(Phy object) {
				return createPhyAdapter();
			}
			@Override
			public Adapter caseRssi_extended(Rssi_extended object) {
				return createRssi_extendedAdapter();
			}
			@Override
			public Adapter caseRssi_hist(Rssi_hist object) {
				return createRssi_histAdapter();
			}
			@Override
			public Adapter caseStats(Stats object) {
				return createStatsAdapter();
			}
			@Override
			public Adapter caseValue(Value object) {
				return createValueAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Channelstats <em>Channelstats</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Channelstats
	 * @generated
	 */
	public Adapter createChannelstatsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Ctl <em>Ctl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Ctl
	 * @generated
	 */
	public Adapter createCtlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Ext <em>Ext</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Ext
	 * @generated
	 */
	public Adapter createExtAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Mac <em>Mac</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Mac
	 * @generated
	 */
	public Adapter createMacAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Mac_duration <em>Mac duration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Mac_duration
	 * @generated
	 */
	public Adapter createMac_durationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Mac_percentage <em>Mac percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Mac_percentage
	 * @generated
	 */
	public Adapter createMac_percentageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Nb <em>Nb</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Nb
	 * @generated
	 */
	public Adapter createNbAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Neighbourstats <em>Neighbourstats</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Neighbourstats
	 * @generated
	 */
	public Adapter createNeighbourstatsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Perf_counter <em>Perf counter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Perf_counter
	 * @generated
	 */
	public Adapter createPerf_counterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Phy <em>Phy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Phy
	 * @generated
	 */
	public Adapter createPhyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Rssi_extended <em>Rssi extended</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Rssi_extended
	 * @generated
	 */
	public Adapter createRssi_extendedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Rssi_hist <em>Rssi hist</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Rssi_hist
	 * @generated
	 */
	public Adapter createRssi_histAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Stats <em>Stats</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Stats
	 * @generated
	 */
	public Adapter createStatsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hub.clickwatch.datamodel.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hub.clickwatch.datamodel.Value
	 * @generated
	 */
	public Adapter createValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Device_wifi_wifidevice_cst_statsAdapterFactory
