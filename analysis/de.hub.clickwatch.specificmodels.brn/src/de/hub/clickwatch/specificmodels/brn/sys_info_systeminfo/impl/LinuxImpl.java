/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Linux;
import de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Sys_info_systeminfoPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Linux</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.impl.LinuxImpl#getEContainer_linux <em>EContainer linux</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.impl.LinuxImpl#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinuxImpl extends EObjectImpl implements Linux {
    /**
     * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVersion()
     * @generated
     * @ordered
     */
    protected static final String VERSION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVersion()
     * @generated
     * @ordered
     */
    protected String version = VERSION_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected LinuxImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Sys_info_systeminfoPackage.Literals.LINUX;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.System getEContainer_linux() {
        if (eContainerFeatureID() != Sys_info_systeminfoPackage.LINUX__ECONTAINER_LINUX) return null;
        return (de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.System)eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEContainer_linux(de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.System newEContainer_linux, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newEContainer_linux, Sys_info_systeminfoPackage.LINUX__ECONTAINER_LINUX, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEContainer_linux(de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.System newEContainer_linux) {
        if (newEContainer_linux != eInternalContainer() || (eContainerFeatureID() != Sys_info_systeminfoPackage.LINUX__ECONTAINER_LINUX && newEContainer_linux != null)) {
            if (EcoreUtil.isAncestor(this, newEContainer_linux))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newEContainer_linux != null)
                msgs = ((InternalEObject)newEContainer_linux).eInverseAdd(this, Sys_info_systeminfoPackage.SYSTEM__LINUX, de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.System.class, msgs);
            msgs = basicSetEContainer_linux(newEContainer_linux, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Sys_info_systeminfoPackage.LINUX__ECONTAINER_LINUX, newEContainer_linux, newEContainer_linux));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getVersion() {
        return version;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setVersion(String newVersion) {
        String oldVersion = version;
        version = newVersion;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Sys_info_systeminfoPackage.LINUX__VERSION, oldVersion, version));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case Sys_info_systeminfoPackage.LINUX__ECONTAINER_LINUX:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetEContainer_linux((de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.System)otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case Sys_info_systeminfoPackage.LINUX__ECONTAINER_LINUX:
                return basicSetEContainer_linux(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
        switch (eContainerFeatureID()) {
            case Sys_info_systeminfoPackage.LINUX__ECONTAINER_LINUX:
                return eInternalContainer().eInverseRemove(this, Sys_info_systeminfoPackage.SYSTEM__LINUX, de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.System.class, msgs);
        }
        return super.eBasicRemoveFromContainerFeature(msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case Sys_info_systeminfoPackage.LINUX__ECONTAINER_LINUX:
                return getEContainer_linux();
            case Sys_info_systeminfoPackage.LINUX__VERSION:
                return getVersion();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case Sys_info_systeminfoPackage.LINUX__ECONTAINER_LINUX:
                setEContainer_linux((de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.System)newValue);
                return;
            case Sys_info_systeminfoPackage.LINUX__VERSION:
                setVersion((String)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case Sys_info_systeminfoPackage.LINUX__ECONTAINER_LINUX:
                setEContainer_linux((de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.System)null);
                return;
            case Sys_info_systeminfoPackage.LINUX__VERSION:
                setVersion(VERSION_EDEFAULT);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case Sys_info_systeminfoPackage.LINUX__ECONTAINER_LINUX:
                return getEContainer_linux() != null;
            case Sys_info_systeminfoPackage.LINUX__VERSION:
                return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (version: ");
        result.append(version);
        result.append(')');
        return result.toString();
    }

} //LinuxImpl
