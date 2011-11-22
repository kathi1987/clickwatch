/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loadavg</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Loadavg#getEContainer_loadavg <em>EContainer loadavg</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Loadavg#getOnemin <em>Onemin</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Loadavg#getFivemin <em>Fivemin</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Loadavg#getFifteen <em>Fifteen</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Sys_info_systeminfoPackage#getLoadavg()
 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Systeminfo|Handler/system|system:System|EObject/loadavg|loadavg:Loadavg|EObject'"
 * @generated
 */
public interface Loadavg extends EObject {
    /**
     * Returns the value of the '<em><b>EContainer loadavg</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.System#getLoadavg <em>Loadavg</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>EContainer loadavg</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>EContainer loadavg</em>' container reference.
     * @see #setEContainer_loadavg(de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.System)
     * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Sys_info_systeminfoPackage#getLoadavg_EContainer_loadavg()
     * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.System#getLoadavg
     * @model opposite="loadavg" transient="false"
     * @generated
     */
    de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.System getEContainer_loadavg();

    /**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Loadavg#getEContainer_loadavg <em>EContainer loadavg</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>EContainer loadavg</em>' container reference.
     * @see #getEContainer_loadavg()
     * @generated
     */
    void setEContainer_loadavg(de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.System value);

    /**
     * Returns the value of the '<em><b>Onemin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Onemin</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Onemin</em>' attribute.
     * @see #setOnemin(double)
     * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Sys_info_systeminfoPackage#getLoadavg_Onemin()
     * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Systeminfo|Handler/system|system:System|EObject/loadavg|loadavg:Loadavg|EObject/onemin|onemin:'"
     * @generated
     */
    double getOnemin();

    /**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Loadavg#getOnemin <em>Onemin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Onemin</em>' attribute.
     * @see #getOnemin()
     * @generated
     */
    void setOnemin(double value);

    /**
     * Returns the value of the '<em><b>Fivemin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Fivemin</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Fivemin</em>' attribute.
     * @see #setFivemin(double)
     * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Sys_info_systeminfoPackage#getLoadavg_Fivemin()
     * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Systeminfo|Handler/system|system:System|EObject/loadavg|loadavg:Loadavg|EObject/fivemin|fivemin:'"
     * @generated
     */
    double getFivemin();

    /**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Loadavg#getFivemin <em>Fivemin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Fivemin</em>' attribute.
     * @see #getFivemin()
     * @generated
     */
    void setFivemin(double value);

    /**
     * Returns the value of the '<em><b>Fifteen</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Fifteen</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Fifteen</em>' attribute.
     * @see #setFifteen(double)
     * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Sys_info_systeminfoPackage#getLoadavg_Fifteen()
     * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Systeminfo|Handler/system|system:System|EObject/loadavg|loadavg:Loadavg|EObject/fifteen|fifteen:'"
     * @generated
     */
    double getFifteen();

    /**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Loadavg#getFifteen <em>Fifteen</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Fifteen</em>' attribute.
     * @see #getFifteen()
     * @generated
     */
    void setFifteen(double value);

} // Loadavg
