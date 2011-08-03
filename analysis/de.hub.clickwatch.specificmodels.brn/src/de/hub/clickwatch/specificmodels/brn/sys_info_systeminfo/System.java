/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.System#getEContainer_system <em>EContainer system</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.System#getText <em>Text</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.System#getMem <em>Mem</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.System#getLoadavg <em>Loadavg</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.System#getCpu_usage <em>Cpu usage</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.System#getUptime <em>Uptime</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.System#getLinux <em>Linux</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.System#getId <em>Id</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.System#getName <em>Name</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.System#getTime <em>Time</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Sys_info_systeminfoPackage#getSystem()
 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Systeminfo|Handler/system|system:System|EObject'"
 * @generated
 */
public interface System extends EObject {
	/**
	 * Returns the value of the '<em><b>EContainer system</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Systeminfo#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EContainer system</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EContainer system</em>' container reference.
	 * @see #setEContainer_system(Systeminfo)
	 * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Sys_info_systeminfoPackage#getSystem_EContainer_system()
	 * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Systeminfo#getSystem
	 * @model opposite="system" transient="false"
	 * @generated
	 */
	Systeminfo getEContainer_system();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.System#getEContainer_system <em>EContainer system</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EContainer system</em>' container reference.
	 * @see #getEContainer_system()
	 * @generated
	 */
	void setEContainer_system(Systeminfo value);

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
	 * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Sys_info_systeminfoPackage#getSystem_Text()
	 * @model unique="false"
	 *        annotation="http://de.hub.clickwatch.specificmodels target_id='Systeminfo|Handler/system|system:System|EObject/text|text:'"
	 * @generated
	 */
	EList<String> getText();

	/**
	 * Returns the value of the '<em><b>Mem</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Mem#getEContainer_mem <em>EContainer mem</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mem</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mem</em>' containment reference.
	 * @see #setMem(Mem)
	 * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Sys_info_systeminfoPackage#getSystem_Mem()
	 * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Mem#getEContainer_mem
	 * @model opposite="eContainer_mem" containment="true"
	 *        annotation="http://de.hub.clickwatch.specificmodels target_id='Systeminfo|Handler/system|system:System|EObject/mem|mem:Mem|EObject' IsCopy='false'"
	 * @generated
	 */
	Mem getMem();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.System#getMem <em>Mem</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mem</em>' containment reference.
	 * @see #getMem()
	 * @generated
	 */
	void setMem(Mem value);

	/**
	 * Returns the value of the '<em><b>Loadavg</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Loadavg#getEContainer_loadavg <em>EContainer loadavg</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loadavg</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loadavg</em>' containment reference.
	 * @see #setLoadavg(Loadavg)
	 * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Sys_info_systeminfoPackage#getSystem_Loadavg()
	 * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Loadavg#getEContainer_loadavg
	 * @model opposite="eContainer_loadavg" containment="true"
	 *        annotation="http://de.hub.clickwatch.specificmodels target_id='Systeminfo|Handler/system|system:System|EObject/loadavg|loadavg:Loadavg|EObject' IsCopy='false'"
	 * @generated
	 */
	Loadavg getLoadavg();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.System#getLoadavg <em>Loadavg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loadavg</em>' containment reference.
	 * @see #getLoadavg()
	 * @generated
	 */
	void setLoadavg(Loadavg value);

	/**
	 * Returns the value of the '<em><b>Cpu usage</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Cpu_usage#getEContainer_cpu_usage <em>EContainer cpu usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cpu usage</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cpu usage</em>' containment reference.
	 * @see #setCpu_usage(Cpu_usage)
	 * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Sys_info_systeminfoPackage#getSystem_Cpu_usage()
	 * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Cpu_usage#getEContainer_cpu_usage
	 * @model opposite="eContainer_cpu_usage" containment="true"
	 *        annotation="http://de.hub.clickwatch.specificmodels target_id='Systeminfo|Handler/system|system:System|EObject/cpu_usage|cpu_usage:Cpu_usage|EObject' IsCopy='false'"
	 * @generated
	 */
	Cpu_usage getCpu_usage();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.System#getCpu_usage <em>Cpu usage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cpu usage</em>' containment reference.
	 * @see #getCpu_usage()
	 * @generated
	 */
	void setCpu_usage(Cpu_usage value);

	/**
	 * Returns the value of the '<em><b>Uptime</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Uptime#getEContainer_uptime <em>EContainer uptime</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uptime</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uptime</em>' containment reference.
	 * @see #setUptime(Uptime)
	 * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Sys_info_systeminfoPackage#getSystem_Uptime()
	 * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Uptime#getEContainer_uptime
	 * @model opposite="eContainer_uptime" containment="true"
	 *        annotation="http://de.hub.clickwatch.specificmodels target_id='Systeminfo|Handler/system|system:System|EObject/uptime|uptime:Uptime|EObject' IsCopy='false'"
	 * @generated
	 */
	Uptime getUptime();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.System#getUptime <em>Uptime</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uptime</em>' containment reference.
	 * @see #getUptime()
	 * @generated
	 */
	void setUptime(Uptime value);

	/**
	 * Returns the value of the '<em><b>Linux</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Linux#getEContainer_linux <em>EContainer linux</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linux</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linux</em>' containment reference.
	 * @see #setLinux(Linux)
	 * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Sys_info_systeminfoPackage#getSystem_Linux()
	 * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Linux#getEContainer_linux
	 * @model opposite="eContainer_linux" containment="true"
	 *        annotation="http://de.hub.clickwatch.specificmodels target_id='Systeminfo|Handler/system|system:System|EObject/linux|linux:Linux|EObject' IsCopy='false'"
	 * @generated
	 */
	Linux getLinux();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.System#getLinux <em>Linux</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linux</em>' containment reference.
	 * @see #getLinux()
	 * @generated
	 */
	void setLinux(Linux value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Sys_info_systeminfoPackage#getSystem_Id()
	 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Systeminfo|Handler/system|system:System|EObject/id|id:'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.System#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Sys_info_systeminfoPackage#getSystem_Name()
	 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Systeminfo|Handler/system|system:System|EObject/name|name:'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.System#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Sys_info_systeminfoPackage#getSystem_Time()
	 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Systeminfo|Handler/system|system:System|EObject/time|time:'"
	 * @generated
	 */
	double getTime();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.System#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(double value);

} // System
