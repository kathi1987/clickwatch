/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.util;

import de.hub.clickwatch.model.Handler;

import de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Cpu_usage;
import de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Linux;
import de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Loadavg;
import de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Mem;
import de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Sys_info_systeminfoPackage;
import de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Systeminfo;
import de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Uptime;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Sys_info_systeminfoPackage
 * @generated
 */
public class Sys_info_systeminfoAdapterFactory extends AdapterFactoryImpl {
	/**
     * The cached model package.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected static Sys_info_systeminfoPackage modelPackage;

	/**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Sys_info_systeminfoAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = Sys_info_systeminfoPackage.eINSTANCE;
        }
    }

	/**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
	@Override
	public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject)object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

	/**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected Sys_info_systeminfoSwitch<Adapter> modelSwitch =
		new Sys_info_systeminfoSwitch<Adapter>() {
            @Override
            public Adapter caseCpu_usage(Cpu_usage object) {
                return createCpu_usageAdapter();
            }
            @Override
            public Adapter caseLinux(Linux object) {
                return createLinuxAdapter();
            }
            @Override
            public Adapter caseLoadavg(Loadavg object) {
                return createLoadavgAdapter();
            }
            @Override
            public Adapter caseMem(Mem object) {
                return createMemAdapter();
            }
            @Override
            public Adapter caseSystem(de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.System object) {
                return createSystemAdapter();
            }
            @Override
            public Adapter caseSysteminfo(Systeminfo object) {
                return createSysteminfoAdapter();
            }
            @Override
            public Adapter caseUptime(Uptime object) {
                return createUptimeAdapter();
            }
            @Override
            public Adapter caseHandler(Handler object) {
                return createHandlerAdapter();
            }
            @Override
            public Adapter defaultCase(EObject object) {
                return createEObjectAdapter();
            }
        };

	/**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
	@Override
	public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject)target);
    }


	/**
     * Creates a new adapter for an object of class '{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Cpu_usage <em>Cpu usage</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Cpu_usage
     * @generated
     */
	public Adapter createCpu_usageAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Linux <em>Linux</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Linux
     * @generated
     */
	public Adapter createLinuxAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Loadavg <em>Loadavg</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Loadavg
     * @generated
     */
	public Adapter createLoadavgAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Mem <em>Mem</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Mem
     * @generated
     */
	public Adapter createMemAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.System <em>System</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.System
     * @generated
     */
	public Adapter createSystemAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Systeminfo <em>Systeminfo</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Systeminfo
     * @generated
     */
	public Adapter createSysteminfoAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Uptime <em>Uptime</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Uptime
     * @generated
     */
	public Adapter createUptimeAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.hub.clickwatch.model.Handler <em>Handler</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.hub.clickwatch.model.Handler
     * @generated
     */
	public Adapter createHandlerAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
	public Adapter createEObjectAdapter() {
        return null;
    }

} //Sys_info_systeminfoAdapterFactory
