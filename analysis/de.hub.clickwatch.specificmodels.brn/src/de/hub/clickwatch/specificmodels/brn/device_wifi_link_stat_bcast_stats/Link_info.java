/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Link_info#getEContainer_link_info <em>EContainer link info</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Link_info#getSize <em>Size</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Link_info#getRate <em>Rate</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Link_info#getFwd <em>Fwd</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Link_info#getRev <em>Rev</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Device_wifi_link_stat_bcast_statsPackage#getLink_info()
 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Bcast_stats|Handler/entry|entry:Entry|EObject/link|link:Link|EObject/link_info|link_info:Link_info|EObject'"
 * @generated
 */
public interface Link_info extends EObject {
    /**
     * Returns the value of the '<em><b>EContainer link info</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Link#getLink_info <em>Link info</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>EContainer link info</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>EContainer link info</em>' container reference.
     * @see #setEContainer_link_info(Link)
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Device_wifi_link_stat_bcast_statsPackage#getLink_info_EContainer_link_info()
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Link#getLink_info
     * @model opposite="link_info" transient="false"
     * @generated
     */
    Link getEContainer_link_info();

    /**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Link_info#getEContainer_link_info <em>EContainer link info</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>EContainer link info</em>' container reference.
     * @see #getEContainer_link_info()
     * @generated
     */
    void setEContainer_link_info(Link value);

    /**
     * Returns the value of the '<em><b>Size</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Size</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Size</em>' attribute.
     * @see #setSize(int)
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Device_wifi_link_stat_bcast_statsPackage#getLink_info_Size()
     * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Bcast_stats|Handler/entry|entry:Entry|EObject/link|link:Link|EObject/link_info|link_info:Link_info|EObject/size|size:'"
     * @generated
     */
    int getSize();

    /**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Link_info#getSize <em>Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Size</em>' attribute.
     * @see #getSize()
     * @generated
     */
    void setSize(int value);

    /**
     * Returns the value of the '<em><b>Rate</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rate</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rate</em>' attribute.
     * @see #setRate(int)
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Device_wifi_link_stat_bcast_statsPackage#getLink_info_Rate()
     * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Bcast_stats|Handler/entry|entry:Entry|EObject/link|link:Link|EObject/link_info|link_info:Link_info|EObject/rate|rate:'"
     * @generated
     */
    int getRate();

    /**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Link_info#getRate <em>Rate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rate</em>' attribute.
     * @see #getRate()
     * @generated
     */
    void setRate(int value);

    /**
     * Returns the value of the '<em><b>Fwd</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Fwd</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Fwd</em>' attribute.
     * @see #setFwd(int)
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Device_wifi_link_stat_bcast_statsPackage#getLink_info_Fwd()
     * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Bcast_stats|Handler/entry|entry:Entry|EObject/link|link:Link|EObject/link_info|link_info:Link_info|EObject/fwd|fwd:'"
     * @generated
     */
    int getFwd();

    /**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Link_info#getFwd <em>Fwd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Fwd</em>' attribute.
     * @see #getFwd()
     * @generated
     */
    void setFwd(int value);

    /**
     * Returns the value of the '<em><b>Rev</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rev</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rev</em>' attribute.
     * @see #setRev(int)
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Device_wifi_link_stat_bcast_statsPackage#getLink_info_Rev()
     * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Bcast_stats|Handler/entry|entry:Entry|EObject/link|link:Link|EObject/link_info|link_info:Link_info|EObject/rev|rev:'"
     * @generated
     */
    int getRev();

    /**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Link_info#getRev <em>Rev</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rev</em>' attribute.
     * @see #getRev()
     * @generated
     */
    void setRev(int value);

} // Link_info
