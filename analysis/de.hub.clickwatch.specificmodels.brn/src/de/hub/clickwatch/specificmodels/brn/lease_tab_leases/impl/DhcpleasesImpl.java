/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.lease_tab_leases.impl;

import de.hub.clickwatch.specificmodels.brn.lease_tab_leases.Client;
import de.hub.clickwatch.specificmodels.brn.lease_tab_leases.Dhcpleases;
import de.hub.clickwatch.specificmodels.brn.lease_tab_leases.Lease_tab_leasesPackage;
import de.hub.clickwatch.specificmodels.brn.lease_tab_leases.Leases;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dhcpleases</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.lease_tab_leases.impl.DhcpleasesImpl#getEContainer_dhcpleases <em>EContainer dhcpleases</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.lease_tab_leases.impl.DhcpleasesImpl#getText <em>Text</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.lease_tab_leases.impl.DhcpleasesImpl#getClient <em>Client</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.lease_tab_leases.impl.DhcpleasesImpl#getCount <em>Count</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.lease_tab_leases.impl.DhcpleasesImpl#getTime <em>Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DhcpleasesImpl extends EObjectImpl implements Dhcpleases {
    /**
     * The cached value of the '{@link #getText() <em>Text</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getText()
     * @generated
     * @ordered
     */
    protected EList<String> text;

    /**
     * The cached value of the '{@link #getClient() <em>Client</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getClient()
     * @generated
     * @ordered
     */
    protected EList<Client> client;

    /**
     * The default value of the '{@link #getCount() <em>Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCount()
     * @generated
     * @ordered
     */
    protected static final int COUNT_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getCount() <em>Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCount()
     * @generated
     * @ordered
     */
    protected int count = COUNT_EDEFAULT;

    /**
     * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTime()
     * @generated
     * @ordered
     */
    protected static final double TIME_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTime()
     * @generated
     * @ordered
     */
    protected double time = TIME_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DhcpleasesImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Lease_tab_leasesPackage.Literals.DHCPLEASES;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Leases getEContainer_dhcpleases() {
        if (eContainerFeatureID() != Lease_tab_leasesPackage.DHCPLEASES__ECONTAINER_DHCPLEASES) return null;
        return (Leases)eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEContainer_dhcpleases(Leases newEContainer_dhcpleases, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newEContainer_dhcpleases, Lease_tab_leasesPackage.DHCPLEASES__ECONTAINER_DHCPLEASES, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEContainer_dhcpleases(Leases newEContainer_dhcpleases) {
        if (newEContainer_dhcpleases != eInternalContainer() || (eContainerFeatureID() != Lease_tab_leasesPackage.DHCPLEASES__ECONTAINER_DHCPLEASES && newEContainer_dhcpleases != null)) {
            if (EcoreUtil.isAncestor(this, newEContainer_dhcpleases))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newEContainer_dhcpleases != null)
                msgs = ((InternalEObject)newEContainer_dhcpleases).eInverseAdd(this, Lease_tab_leasesPackage.LEASES__DHCPLEASES, Leases.class, msgs);
            msgs = basicSetEContainer_dhcpleases(newEContainer_dhcpleases, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Lease_tab_leasesPackage.DHCPLEASES__ECONTAINER_DHCPLEASES, newEContainer_dhcpleases, newEContainer_dhcpleases));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<String> getText() {
        if (text == null) {
            text = new EDataTypeEList<String>(String.class, this, Lease_tab_leasesPackage.DHCPLEASES__TEXT);
        }
        return text;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Client> getClient() {
        if (client == null) {
            client = new EObjectContainmentWithInverseEList<Client>(Client.class, this, Lease_tab_leasesPackage.DHCPLEASES__CLIENT, Lease_tab_leasesPackage.CLIENT__ECONTAINER_CLIENT);
        }
        return client;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getCount() {
        return count;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCount(int newCount) {
        int oldCount = count;
        count = newCount;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Lease_tab_leasesPackage.DHCPLEASES__COUNT, oldCount, count));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public double getTime() {
        return time;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTime(double newTime) {
        double oldTime = time;
        time = newTime;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Lease_tab_leasesPackage.DHCPLEASES__TIME, oldTime, time));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case Lease_tab_leasesPackage.DHCPLEASES__ECONTAINER_DHCPLEASES:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetEContainer_dhcpleases((Leases)otherEnd, msgs);
            case Lease_tab_leasesPackage.DHCPLEASES__CLIENT:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getClient()).basicAdd(otherEnd, msgs);
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
            case Lease_tab_leasesPackage.DHCPLEASES__ECONTAINER_DHCPLEASES:
                return basicSetEContainer_dhcpleases(null, msgs);
            case Lease_tab_leasesPackage.DHCPLEASES__CLIENT:
                return ((InternalEList<?>)getClient()).basicRemove(otherEnd, msgs);
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
            case Lease_tab_leasesPackage.DHCPLEASES__ECONTAINER_DHCPLEASES:
                return eInternalContainer().eInverseRemove(this, Lease_tab_leasesPackage.LEASES__DHCPLEASES, Leases.class, msgs);
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
            case Lease_tab_leasesPackage.DHCPLEASES__ECONTAINER_DHCPLEASES:
                return getEContainer_dhcpleases();
            case Lease_tab_leasesPackage.DHCPLEASES__TEXT:
                return getText();
            case Lease_tab_leasesPackage.DHCPLEASES__CLIENT:
                return getClient();
            case Lease_tab_leasesPackage.DHCPLEASES__COUNT:
                return getCount();
            case Lease_tab_leasesPackage.DHCPLEASES__TIME:
                return getTime();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case Lease_tab_leasesPackage.DHCPLEASES__ECONTAINER_DHCPLEASES:
                setEContainer_dhcpleases((Leases)newValue);
                return;
            case Lease_tab_leasesPackage.DHCPLEASES__TEXT:
                getText().clear();
                getText().addAll((Collection<? extends String>)newValue);
                return;
            case Lease_tab_leasesPackage.DHCPLEASES__CLIENT:
                getClient().clear();
                getClient().addAll((Collection<? extends Client>)newValue);
                return;
            case Lease_tab_leasesPackage.DHCPLEASES__COUNT:
                setCount((Integer)newValue);
                return;
            case Lease_tab_leasesPackage.DHCPLEASES__TIME:
                setTime((Double)newValue);
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
            case Lease_tab_leasesPackage.DHCPLEASES__ECONTAINER_DHCPLEASES:
                setEContainer_dhcpleases((Leases)null);
                return;
            case Lease_tab_leasesPackage.DHCPLEASES__TEXT:
                getText().clear();
                return;
            case Lease_tab_leasesPackage.DHCPLEASES__CLIENT:
                getClient().clear();
                return;
            case Lease_tab_leasesPackage.DHCPLEASES__COUNT:
                setCount(COUNT_EDEFAULT);
                return;
            case Lease_tab_leasesPackage.DHCPLEASES__TIME:
                setTime(TIME_EDEFAULT);
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
            case Lease_tab_leasesPackage.DHCPLEASES__ECONTAINER_DHCPLEASES:
                return getEContainer_dhcpleases() != null;
            case Lease_tab_leasesPackage.DHCPLEASES__TEXT:
                return text != null && !text.isEmpty();
            case Lease_tab_leasesPackage.DHCPLEASES__CLIENT:
                return client != null && !client.isEmpty();
            case Lease_tab_leasesPackage.DHCPLEASES__COUNT:
                return count != COUNT_EDEFAULT;
            case Lease_tab_leasesPackage.DHCPLEASES__TIME:
                return time != TIME_EDEFAULT;
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
        result.append(" (text: ");
        result.append(text);
        result.append(", count: ");
        result.append(count);
        result.append(", time: ");
        result.append(time);
        result.append(')');
        return result.toString();
    }

} //DhcpleasesImpl
