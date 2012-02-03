/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Neighbourstats</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Neighbourstats#getEContainer_neighbourstats <em>EContainer neighbourstats</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Neighbourstats#getText <em>Text</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Neighbourstats#getNb <em>Nb</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getNeighbourstats()
 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/channelstats|channelstats:Channelstats|EObject/neighbourstats|neighbourstats:Neighbourstats|EObject'"
 * @generated
 */
public interface Neighbourstats extends EObject {
	/**
	 * Returns the value of the '<em><b>EContainer neighbourstats</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Channelstats#getNeighbourstats <em>Neighbourstats</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EContainer neighbourstats</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EContainer neighbourstats</em>' container reference.
	 * @see #setEContainer_neighbourstats(Channelstats)
	 * @see de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getNeighbourstats_EContainer_neighbourstats()
	 * @see de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Channelstats#getNeighbourstats
	 * @model opposite="neighbourstats" transient="false"
	 * @generated
	 */
	Channelstats getEContainer_neighbourstats();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Neighbourstats#getEContainer_neighbourstats <em>EContainer neighbourstats</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EContainer neighbourstats</em>' container reference.
	 * @see #getEContainer_neighbourstats()
	 * @generated
	 */
	void setEContainer_neighbourstats(Channelstats value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute list.
	 * @see de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getNeighbourstats_Text()
	 * @model unique="false"
	 *        annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/channelstats|channelstats:Channelstats|EObject/neighbourstats|neighbourstats:Neighbourstats|EObject/text|text:'"
	 * @generated
	 */
	EList<String> getText();

	/**
	 * Returns the value of the '<em><b>Nb</b></em>' containment reference list.
	 * The list contents are of type {@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Nb}.
	 * It is bidirectional and its opposite is '{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Nb#getEContainer_nb <em>EContainer nb</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nb</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb</em>' containment reference list.
	 * @see de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage#getNeighbourstats_Nb()
	 * @see de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Nb#getEContainer_nb
	 * @model opposite="eContainer_nb" containment="true"
	 *        annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/channelstats|channelstats:Channelstats|EObject/neighbourstats|neighbourstats:Neighbourstats|EObject/nb|nb:Nb|EObject' IsCopy='false'"
	 * @generated
	 */
	EList<Nb> getNb();

} // Neighbourstats
