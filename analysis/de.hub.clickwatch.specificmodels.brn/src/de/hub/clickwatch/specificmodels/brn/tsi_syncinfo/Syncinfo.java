/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.tsi_syncinfo;

import de.hub.clickwatch.model.Handler;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Syncinfo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.tsi_syncinfo.Syncinfo#getTimesyncinfo <em>Timesyncinfo</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.specificmodels.brn.tsi_syncinfo.Tsi_syncinfoPackage#getSyncinfo()
 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Syncinfo|Handler'"
 * @generated
 */
public interface Syncinfo extends Handler {
    /**
     * Returns the value of the '<em><b>Timesyncinfo</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link de.hub.clickwatch.specificmodels.brn.tsi_syncinfo.Timesyncinfo#getEContainer_timesyncinfo <em>EContainer timesyncinfo</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Timesyncinfo</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Timesyncinfo</em>' containment reference.
     * @see #setTimesyncinfo(Timesyncinfo)
     * @see de.hub.clickwatch.specificmodels.brn.tsi_syncinfo.Tsi_syncinfoPackage#getSyncinfo_Timesyncinfo()
     * @see de.hub.clickwatch.specificmodels.brn.tsi_syncinfo.Timesyncinfo#getEContainer_timesyncinfo
     * @model opposite="eContainer_timesyncinfo" containment="true"
     *        annotation="http://de.hub.clickwatch.specificmodels target_id='Syncinfo|Handler/timesyncinfo|timesyncinfo:Timesyncinfo|EObject' IsCopy='false'"
     * @generated
     */
    Timesyncinfo getTimesyncinfo();

    /**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.tsi_syncinfo.Syncinfo#getTimesyncinfo <em>Timesyncinfo</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Timesyncinfo</em>' containment reference.
     * @see #getTimesyncinfo()
     * @generated
     */
    void setTimesyncinfo(Timesyncinfo value);

} // Syncinfo
