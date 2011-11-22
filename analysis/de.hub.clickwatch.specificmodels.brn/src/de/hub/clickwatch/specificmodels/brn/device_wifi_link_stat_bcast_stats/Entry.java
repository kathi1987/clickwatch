/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Entry#getEContainer_entry <em>EContainer entry</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Entry#getText <em>Text</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Entry#getLink <em>Link</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Entry#getFrom <em>From</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Entry#getTime <em>Time</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Entry#getSeq <em>Seq</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Entry#getPeriod <em>Period</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Entry#getTau <em>Tau</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Device_wifi_link_stat_bcast_statsPackage#getEntry()
 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Bcast_stats|Handler/entry|entry:Entry|EObject'"
 * @generated
 */
public interface Entry extends EObject {
    /**
     * Returns the value of the '<em><b>EContainer entry</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Bcast_stats#getEntry <em>Entry</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>EContainer entry</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>EContainer entry</em>' container reference.
     * @see #setEContainer_entry(Bcast_stats)
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Device_wifi_link_stat_bcast_statsPackage#getEntry_EContainer_entry()
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Bcast_stats#getEntry
     * @model opposite="entry" transient="false"
     * @generated
     */
    Bcast_stats getEContainer_entry();

    /**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Entry#getEContainer_entry <em>EContainer entry</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>EContainer entry</em>' container reference.
     * @see #getEContainer_entry()
     * @generated
     */
    void setEContainer_entry(Bcast_stats value);

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
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Device_wifi_link_stat_bcast_statsPackage#getEntry_Text()
     * @model unique="false"
     *        annotation="http://de.hub.clickwatch.specificmodels target_id='Bcast_stats|Handler/entry|entry:Entry|EObject/text|text:'"
     * @generated
     */
    EList<String> getText();

    /**
     * Returns the value of the '<em><b>Link</b></em>' containment reference list.
     * The list contents are of type {@link de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Link}.
     * It is bidirectional and its opposite is '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Link#getEContainer_link <em>EContainer link</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Link</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Link</em>' containment reference list.
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Device_wifi_link_stat_bcast_statsPackage#getEntry_Link()
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Link#getEContainer_link
     * @model opposite="eContainer_link" containment="true"
     *        annotation="http://de.hub.clickwatch.specificmodels target_id='Bcast_stats|Handler/entry|entry:Entry|EObject/link|link:Link|EObject' IsCopy='false'"
     * @generated
     */
    EList<Link> getLink();

    /**
     * Returns the value of the '<em><b>From</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>From</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>From</em>' attribute.
     * @see #setFrom(String)
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Device_wifi_link_stat_bcast_statsPackage#getEntry_From()
     * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Bcast_stats|Handler/entry|entry:Entry|EObject/from|from:'"
     * @generated
     */
    String getFrom();

    /**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Entry#getFrom <em>From</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>From</em>' attribute.
     * @see #getFrom()
     * @generated
     */
    void setFrom(String value);

    /**
     * Returns the value of the '<em><b>Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Time</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Time</em>' attribute.
     * @see #setTime(double)
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Device_wifi_link_stat_bcast_statsPackage#getEntry_Time()
     * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Bcast_stats|Handler/entry|entry:Entry|EObject/time|time:'"
     * @generated
     */
    double getTime();

    /**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Entry#getTime <em>Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Time</em>' attribute.
     * @see #getTime()
     * @generated
     */
    void setTime(double value);

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
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Device_wifi_link_stat_bcast_statsPackage#getEntry_Seq()
     * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Bcast_stats|Handler/entry|entry:Entry|EObject/seq|seq:'"
     * @generated
     */
    int getSeq();

    /**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Entry#getSeq <em>Seq</em>}' attribute.
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
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Device_wifi_link_stat_bcast_statsPackage#getEntry_Period()
     * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Bcast_stats|Handler/entry|entry:Entry|EObject/period|period:'"
     * @generated
     */
    int getPeriod();

    /**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Entry#getPeriod <em>Period</em>}' attribute.
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
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Device_wifi_link_stat_bcast_statsPackage#getEntry_Tau()
     * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Bcast_stats|Handler/entry|entry:Entry|EObject/tau|tau:'"
     * @generated
     */
    int getTau();

    /**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Entry#getTau <em>Tau</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tau</em>' attribute.
     * @see #getTau()
     * @generated
     */
    void setTau(int value);

} // Entry
