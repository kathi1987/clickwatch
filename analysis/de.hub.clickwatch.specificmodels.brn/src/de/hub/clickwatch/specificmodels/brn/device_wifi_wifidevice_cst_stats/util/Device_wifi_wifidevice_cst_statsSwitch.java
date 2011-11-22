/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Channelstats;
import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Ctl;
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
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage
 * @generated
 */
public class Device_wifi_wifidevice_cst_statsSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static Device_wifi_wifidevice_cst_statsPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Device_wifi_wifidevice_cst_statsSwitch() {
        if (modelPackage == null) {
            modelPackage = Device_wifi_wifidevice_cst_statsPackage.eINSTANCE;
        }
    }

    /**
     * Checks whether this is a switch for the given package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @parameter ePackage the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
    @Override
    protected boolean isSwitchFor(EPackage ePackage) {
        return ePackage == modelPackage;
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    @Override
    protected T doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
            case Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS: {
                Channelstats channelstats = (Channelstats)theEObject;
                T result = caseChannelstats(channelstats);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Device_wifi_wifidevice_cst_statsPackage.CTL: {
                Ctl ctl = (Ctl)theEObject;
                T result = caseCtl(ctl);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Device_wifi_wifidevice_cst_statsPackage.EXT: {
                Ext ext = (Ext)theEObject;
                T result = caseExt(ext);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Device_wifi_wifidevice_cst_statsPackage.MAC: {
                Mac mac = (Mac)theEObject;
                T result = caseMac(mac);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Device_wifi_wifidevice_cst_statsPackage.MAC_DURATION: {
                Mac_duration mac_duration = (Mac_duration)theEObject;
                T result = caseMac_duration(mac_duration);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Device_wifi_wifidevice_cst_statsPackage.MAC_PERCENTAGE: {
                Mac_percentage mac_percentage = (Mac_percentage)theEObject;
                T result = caseMac_percentage(mac_percentage);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Device_wifi_wifidevice_cst_statsPackage.NB: {
                Nb nb = (Nb)theEObject;
                T result = caseNb(nb);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Device_wifi_wifidevice_cst_statsPackage.NEIGHBOURSTATS: {
                Neighbourstats neighbourstats = (Neighbourstats)theEObject;
                T result = caseNeighbourstats(neighbourstats);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Device_wifi_wifidevice_cst_statsPackage.PERF_COUNTER: {
                Perf_counter perf_counter = (Perf_counter)theEObject;
                T result = casePerf_counter(perf_counter);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Device_wifi_wifidevice_cst_statsPackage.PHY: {
                Phy phy = (Phy)theEObject;
                T result = casePhy(phy);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Device_wifi_wifidevice_cst_statsPackage.RSSI_EXTENDED: {
                Rssi_extended rssi_extended = (Rssi_extended)theEObject;
                T result = caseRssi_extended(rssi_extended);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Device_wifi_wifidevice_cst_statsPackage.RSSI_HIST: {
                Rssi_hist rssi_hist = (Rssi_hist)theEObject;
                T result = caseRssi_hist(rssi_hist);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Device_wifi_wifidevice_cst_statsPackage.STATS: {
                Stats stats = (Stats)theEObject;
                T result = caseStats(stats);
                if (result == null) result = caseHandler(stats);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Channelstats</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Channelstats</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseChannelstats(Channelstats object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Ctl</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Ctl</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCtl(Ctl object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Ext</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Ext</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExt(Ext object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Mac</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Mac</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMac(Mac object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Mac duration</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Mac duration</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMac_duration(Mac_duration object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Mac percentage</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Mac percentage</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMac_percentage(Mac_percentage object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Nb</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Nb</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNb(Nb object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Neighbourstats</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Neighbourstats</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNeighbourstats(Neighbourstats object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Perf counter</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Perf counter</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePerf_counter(Perf_counter object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Phy</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Phy</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePhy(Phy object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Rssi extended</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Rssi extended</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRssi_extended(Rssi_extended object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Rssi hist</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Rssi hist</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRssi_hist(Rssi_hist object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Stats</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Stats</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseStats(Stats object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Handler</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Handler</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseHandler(Handler object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch, but this is the last case anyway.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    @Override
    public T defaultCase(EObject object) {
        return null;
    }

} //Device_wifi_wifidevice_cst_statsSwitch
