/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificdatamodels.brn.sys_info_systeminfo;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cpu usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.sys_info_systeminfo.Cpu_usage#getEContainer_cpu_usage <em>EContainer cpu usage</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.sys_info_systeminfo.Cpu_usage#getReal <em>Real</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.sys_info_systeminfo.Cpu_usage#getUser <em>User</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.sys_info_systeminfo.Cpu_usage#getSys <em>Sys</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.sys_info_systeminfo.Cpu_usage#getUnit <em>Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.specificdatamodels.brn.sys_info_systeminfo.Sys_info_systeminfoPackage#getCpu_usage()
 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Systeminfo|Handler/system|system:System|EObject/cpu_usage|cpu_usage:Cpu_usage|EObject'"
 * @generated
 */
public interface Cpu_usage extends EObject {
	/**
	 * Returns the value of the '<em><b>EContainer cpu usage</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.hub.clickwatch.specificdatamodels.brn.sys_info_systeminfo.System#getCpu_usage <em>Cpu usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EContainer cpu usage</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EContainer cpu usage</em>' container reference.
	 * @see #setEContainer_cpu_usage(de.hub.clickwatch.specificdatamodels.brn.sys_info_systeminfo.System)
	 * @see de.hub.clickwatch.specificdatamodels.brn.sys_info_systeminfo.Sys_info_systeminfoPackage#getCpu_usage_EContainer_cpu_usage()
	 * @see de.hub.clickwatch.specificdatamodels.brn.sys_info_systeminfo.System#getCpu_usage
	 * @model opposite="cpu_usage" transient="false"
	 * @generated
	 */
	de.hub.clickwatch.specificdatamodels.brn.sys_info_systeminfo.System getEContainer_cpu_usage();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificdatamodels.brn.sys_info_systeminfo.Cpu_usage#getEContainer_cpu_usage <em>EContainer cpu usage</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EContainer cpu usage</em>' container reference.
	 * @see #getEContainer_cpu_usage()
	 * @generated
	 */
	void setEContainer_cpu_usage(de.hub.clickwatch.specificdatamodels.brn.sys_info_systeminfo.System value);

	/**
	 * Returns the value of the '<em><b>Real</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Real</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Real</em>' attribute.
	 * @see #setReal(double)
	 * @see de.hub.clickwatch.specificdatamodels.brn.sys_info_systeminfo.Sys_info_systeminfoPackage#getCpu_usage_Real()
	 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Systeminfo|Handler/system|system:System|EObject/cpu_usage|cpu_usage:Cpu_usage|EObject/real|real:'"
	 * @generated
	 */
	double getReal();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificdatamodels.brn.sys_info_systeminfo.Cpu_usage#getReal <em>Real</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Real</em>' attribute.
	 * @see #getReal()
	 * @generated
	 */
	void setReal(double value);

	/**
	 * Returns the value of the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' attribute.
	 * @see #setUser(double)
	 * @see de.hub.clickwatch.specificdatamodels.brn.sys_info_systeminfo.Sys_info_systeminfoPackage#getCpu_usage_User()
	 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Systeminfo|Handler/system|system:System|EObject/cpu_usage|cpu_usage:Cpu_usage|EObject/user|user:'"
	 * @generated
	 */
	double getUser();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificdatamodels.brn.sys_info_systeminfo.Cpu_usage#getUser <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' attribute.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(double value);

	/**
	 * Returns the value of the '<em><b>Sys</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sys</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sys</em>' attribute.
	 * @see #setSys(double)
	 * @see de.hub.clickwatch.specificdatamodels.brn.sys_info_systeminfo.Sys_info_systeminfoPackage#getCpu_usage_Sys()
	 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Systeminfo|Handler/system|system:System|EObject/cpu_usage|cpu_usage:Cpu_usage|EObject/sys|sys:'"
	 * @generated
	 */
	double getSys();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificdatamodels.brn.sys_info_systeminfo.Cpu_usage#getSys <em>Sys</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sys</em>' attribute.
	 * @see #getSys()
	 * @generated
	 */
	void setSys(double value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see #setUnit(String)
	 * @see de.hub.clickwatch.specificdatamodels.brn.sys_info_systeminfo.Sys_info_systeminfoPackage#getCpu_usage_Unit()
	 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Systeminfo|Handler/system|system:System|EObject/cpu_usage|cpu_usage:Cpu_usage|EObject/unit|unit:'"
	 * @generated
	 */
	String getUnit();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificdatamodels.brn.sys_info_systeminfo.Cpu_usage#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(String value);

} // Cpu_usage
