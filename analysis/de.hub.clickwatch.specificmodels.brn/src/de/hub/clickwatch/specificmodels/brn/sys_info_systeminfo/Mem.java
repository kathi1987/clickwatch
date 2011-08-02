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
 * A representation of the model object '<em><b>Mem</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Mem#getEContainer_mem <em>EContainer mem</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Mem#getTotal <em>Total</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Mem#getUsed <em>Used</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Mem#getCached <em>Cached</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Mem#getBuffers <em>Buffers</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Mem#getNFS_Unstable <em>NFS Unstable</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Sys_info_systeminfoPackage#getMem()
 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Systeminfo|Handler/system|system:System|EObject/mem|mem:Mem|EObject'"
 * @generated
 */
public interface Mem extends EObject {
	/**
	 * Returns the value of the '<em><b>EContainer mem</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.System#getMem <em>Mem</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EContainer mem</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EContainer mem</em>' container reference.
	 * @see #setEContainer_mem(de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.System)
	 * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Sys_info_systeminfoPackage#getMem_EContainer_mem()
	 * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.System#getMem
	 * @model opposite="mem" transient="false"
	 * @generated
	 */
	de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.System getEContainer_mem();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Mem#getEContainer_mem <em>EContainer mem</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EContainer mem</em>' container reference.
	 * @see #getEContainer_mem()
	 * @generated
	 */
	void setEContainer_mem(de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.System value);

	/**
	 * Returns the value of the '<em><b>Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total</em>' attribute.
	 * @see #setTotal(int)
	 * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Sys_info_systeminfoPackage#getMem_Total()
	 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Systeminfo|Handler/system|system:System|EObject/mem|mem:Mem|EObject/total|total:'"
	 * @generated
	 */
	int getTotal();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Mem#getTotal <em>Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total</em>' attribute.
	 * @see #getTotal()
	 * @generated
	 */
	void setTotal(int value);

	/**
	 * Returns the value of the '<em><b>Used</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Used</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used</em>' attribute.
	 * @see #setUsed(int)
	 * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Sys_info_systeminfoPackage#getMem_Used()
	 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Systeminfo|Handler/system|system:System|EObject/mem|mem:Mem|EObject/used|used:'"
	 * @generated
	 */
	int getUsed();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Mem#getUsed <em>Used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Used</em>' attribute.
	 * @see #getUsed()
	 * @generated
	 */
	void setUsed(int value);

	/**
	 * Returns the value of the '<em><b>Cached</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cached</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cached</em>' attribute.
	 * @see #setCached(int)
	 * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Sys_info_systeminfoPackage#getMem_Cached()
	 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Systeminfo|Handler/system|system:System|EObject/mem|mem:Mem|EObject/cached|cached:'"
	 * @generated
	 */
	int getCached();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Mem#getCached <em>Cached</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cached</em>' attribute.
	 * @see #getCached()
	 * @generated
	 */
	void setCached(int value);

	/**
	 * Returns the value of the '<em><b>Buffers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Buffers</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buffers</em>' attribute.
	 * @see #setBuffers(int)
	 * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Sys_info_systeminfoPackage#getMem_Buffers()
	 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Systeminfo|Handler/system|system:System|EObject/mem|mem:Mem|EObject/buffers|buffers:'"
	 * @generated
	 */
	int getBuffers();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Mem#getBuffers <em>Buffers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Buffers</em>' attribute.
	 * @see #getBuffers()
	 * @generated
	 */
	void setBuffers(int value);

	/**
	 * Returns the value of the '<em><b>NFS Unstable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>NFS Unstable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NFS Unstable</em>' attribute.
	 * @see #setNFS_Unstable(int)
	 * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Sys_info_systeminfoPackage#getMem_NFS_Unstable()
	 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Systeminfo|Handler/system|system:System|EObject/mem|mem:Mem|EObject/nFS_Unstable|NFS_Unstable:'"
	 *        extendedMetaData="name='NFS_Unstable' kind='attribute'"
	 * @generated
	 */
	int getNFS_Unstable();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Mem#getNFS_Unstable <em>NFS Unstable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NFS Unstable</em>' attribute.
	 * @see #getNFS_Unstable()
	 * @generated
	 */
	void setNFS_Unstable(int value);

} // Mem
