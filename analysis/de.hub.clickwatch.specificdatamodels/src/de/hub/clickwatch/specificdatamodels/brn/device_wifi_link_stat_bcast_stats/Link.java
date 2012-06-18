/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificdatamodels.brn.device_wifi_link_stat_bcast_stats;

import de.hub.clickwatch.analysis.traceable.Traceable;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_link_stat_bcast_stats.Link#getEContainer_link <em>EContainer link</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_link_stat_bcast_stats.Link#getText <em>Text</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_link_stat_bcast_stats.Link#getLink_info <em>Link info</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_link_stat_bcast_stats.Link#getTo <em>To</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_link_stat_bcast_stats.Link#getSeq <em>Seq</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_link_stat_bcast_stats.Link#getPeriod <em>Period</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_link_stat_bcast_stats.Link#getTau <em>Tau</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_link_stat_bcast_stats.Link#getLast_rx <em>Last rx</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.specificdatamodels.brn.device_wifi_link_stat_bcast_stats.Device_wifi_link_stat_bcast_statsPackage#getLink()
 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Bcast_stats|Handler/entry|entry:Entry|EObject/link|link:Link|EObject'"
 * @generated
 */
public interface Link extends Traceable {
	/**
	 * Returns the value of the '<em><b>EContainer link</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_link_stat_bcast_stats.Entry#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EContainer link</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EContainer link</em>' container reference.
	 * @see #setEContainer_link(Entry)
	 * @see de.hub.clickwatch.specificdatamodels.brn.device_wifi_link_stat_bcast_stats.Device_wifi_link_stat_bcast_statsPackage#getLink_EContainer_link()
	 * @see de.hub.clickwatch.specificdatamodels.brn.device_wifi_link_stat_bcast_stats.Entry#getLink
	 * @model opposite="link" transient="false"
	 * @generated
	 */
	Entry getEContainer_link();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_link_stat_bcast_stats.Link#getEContainer_link <em>EContainer link</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EContainer link</em>' container reference.
	 * @see #getEContainer_link()
	 * @generated
	 */
	void setEContainer_link(Entry value);

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
	 * @see de.hub.clickwatch.specificdatamodels.brn.device_wifi_link_stat_bcast_stats.Device_wifi_link_stat_bcast_statsPackage#getLink_Text()
	 * @model unique="false"
	 *        annotation="http://de.hub.clickwatch.specificmodels target_id='Bcast_stats|Handler/entry|entry:Entry|EObject/link|link:Link|EObject/text|text:'"
	 * @generated
	 */
	EList<String> getText();

	/**
	 * Returns the value of the '<em><b>Link info</b></em>' containment reference list.
	 * The list contents are of type {@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_link_stat_bcast_stats.Link_info}.
	 * It is bidirectional and its opposite is '{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_link_stat_bcast_stats.Link_info#getEContainer_link_info <em>EContainer link info</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link info</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link info</em>' containment reference list.
	 * @see de.hub.clickwatch.specificdatamodels.brn.device_wifi_link_stat_bcast_stats.Device_wifi_link_stat_bcast_statsPackage#getLink_Link_info()
	 * @see de.hub.clickwatch.specificdatamodels.brn.device_wifi_link_stat_bcast_stats.Link_info#getEContainer_link_info
	 * @model opposite="eContainer_link_info" containment="true"
	 *        annotation="http://de.hub.clickwatch.specificmodels target_id='Bcast_stats|Handler/entry|entry:Entry|EObject/link|link:Link|EObject/link_info|link_info:Link_info|EObject' IsCopy='false'"
	 * @generated
	 */
	EList<Link_info> getLink_info();

	/**
	 * Returns the value of the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' attribute.
	 * @see #setTo(String)
	 * @see de.hub.clickwatch.specificdatamodels.brn.device_wifi_link_stat_bcast_stats.Device_wifi_link_stat_bcast_statsPackage#getLink_To()
	 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Bcast_stats|Handler/entry|entry:Entry|EObject/link|link:Link|EObject/to|to:'"
	 * @generated
	 */
	String getTo();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_link_stat_bcast_stats.Link#getTo <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' attribute.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(String value);

	/**
	 * Returns the value of the '<em><b>Seq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seq</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seq</em>' attribute.
	 * @see #setSeq(int)
	 * @see de.hub.clickwatch.specificdatamodels.brn.device_wifi_link_stat_bcast_stats.Device_wifi_link_stat_bcast_statsPackage#getLink_Seq()
	 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Bcast_stats|Handler/entry|entry:Entry|EObject/link|link:Link|EObject/seq|seq:'"
	 * @generated
	 */
	int getSeq();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_link_stat_bcast_stats.Link#getSeq <em>Seq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seq</em>' attribute.
	 * @see #getSeq()
	 * @generated
	 */
	void setSeq(int value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' attribute.
	 * @see #setPeriod(int)
	 * @see de.hub.clickwatch.specificdatamodels.brn.device_wifi_link_stat_bcast_stats.Device_wifi_link_stat_bcast_statsPackage#getLink_Period()
	 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Bcast_stats|Handler/entry|entry:Entry|EObject/link|link:Link|EObject/period|period:'"
	 * @generated
	 */
	int getPeriod();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_link_stat_bcast_stats.Link#getPeriod <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' attribute.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(int value);

	/**
	 * Returns the value of the '<em><b>Tau</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tau</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tau</em>' attribute.
	 * @see #setTau(int)
	 * @see de.hub.clickwatch.specificdatamodels.brn.device_wifi_link_stat_bcast_stats.Device_wifi_link_stat_bcast_statsPackage#getLink_Tau()
	 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Bcast_stats|Handler/entry|entry:Entry|EObject/link|link:Link|EObject/tau|tau:'"
	 * @generated
	 */
	int getTau();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_link_stat_bcast_stats.Link#getTau <em>Tau</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tau</em>' attribute.
	 * @see #getTau()
	 * @generated
	 */
	void setTau(int value);

	/**
	 * Returns the value of the '<em><b>Last rx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last rx</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last rx</em>' attribute.
	 * @see #setLast_rx(double)
	 * @see de.hub.clickwatch.specificdatamodels.brn.device_wifi_link_stat_bcast_stats.Device_wifi_link_stat_bcast_statsPackage#getLink_Last_rx()
	 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Bcast_stats|Handler/entry|entry:Entry|EObject/link|link:Link|EObject/last_rx|last_rx:'"
	 * @generated
	 */
	double getLast_rx();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_link_stat_bcast_stats.Link#getLast_rx <em>Last rx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last rx</em>' attribute.
	 * @see #getLast_rx()
	 * @generated
	 */
	void setLast_rx(double value);

} // Link
