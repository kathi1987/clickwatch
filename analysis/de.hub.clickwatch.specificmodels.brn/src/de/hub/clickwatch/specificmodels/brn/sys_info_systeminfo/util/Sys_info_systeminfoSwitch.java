/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Cpu_usage;
import de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Linux;
import de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Loadavg;
import de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Mem;
import de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Sys_info_systeminfoPackage;
import de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Systeminfo;
import de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Uptime;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Sys_info_systeminfoPackage
 * @generated
 */
public class Sys_info_systeminfoSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static Sys_info_systeminfoPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Sys_info_systeminfoSwitch() {
        if (modelPackage == null) {
            modelPackage = Sys_info_systeminfoPackage.eINSTANCE;
        }
    }

    /**
     * Checks whether this is a switch for the given package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @parameter ePackage the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
    @Override
    protected boolean isSwitchFor(EPackage ePackage) {
        return ePackage == modelPackage;
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    @Override
    protected T doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
            case Sys_info_systeminfoPackage.CPU_USAGE: {
                Cpu_usage cpu_usage = (Cpu_usage)theEObject;
                T result = caseCpu_usage(cpu_usage);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Sys_info_systeminfoPackage.LINUX: {
                Linux linux = (Linux)theEObject;
                T result = caseLinux(linux);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Sys_info_systeminfoPackage.LOADAVG: {
                Loadavg loadavg = (Loadavg)theEObject;
                T result = caseLoadavg(loadavg);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Sys_info_systeminfoPackage.MEM: {
                Mem mem = (Mem)theEObject;
                T result = caseMem(mem);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Sys_info_systeminfoPackage.SYSTEM: {
                de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.System system = (de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.System)theEObject;
                T result = caseSystem(system);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Sys_info_systeminfoPackage.SYSTEMINFO: {
                Systeminfo systeminfo = (Systeminfo)theEObject;
                T result = caseSysteminfo(systeminfo);
                if (result == null) result = caseHandler(systeminfo);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Sys_info_systeminfoPackage.UPTIME: {
                Uptime uptime = (Uptime)theEObject;
                T result = caseUptime(uptime);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Cpu usage</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Cpu usage</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCpu_usage(Cpu_usage object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Linux</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Linux</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLinux(Linux object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Loadavg</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Loadavg</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLoadavg(Loadavg object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Mem</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Mem</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMem(Mem object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>System</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>System</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSystem(de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.System object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Systeminfo</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Systeminfo</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSysteminfo(Systeminfo object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Uptime</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Uptime</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseUptime(Uptime object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Handler</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Handler</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseHandler(Handler object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch, but this is the last case anyway.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    @Override
    public T defaultCase(EObject object) {
        return null;
    }

} //Sys_info_systeminfoSwitch
