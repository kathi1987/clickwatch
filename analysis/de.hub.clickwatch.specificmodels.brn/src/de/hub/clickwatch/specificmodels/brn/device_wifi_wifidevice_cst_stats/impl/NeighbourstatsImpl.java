/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl;

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

import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Channelstats;
import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Device_wifi_wifidevice_cst_statsPackage;
import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Nb;
import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Neighbourstats;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Neighbourstats</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.NeighbourstatsImpl#getEContainer_neighbourstats <em>EContainer neighbourstats</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.NeighbourstatsImpl#getText <em>Text</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.impl.NeighbourstatsImpl#getNb <em>Nb</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NeighbourstatsImpl extends EObjectImpl implements Neighbourstats {
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
     * The cached value of the '{@link #getNb() <em>Nb</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNb()
     * @generated
     * @ordered
     */
    protected EList<Nb> nb;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected NeighbourstatsImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Device_wifi_wifidevice_cst_statsPackage.Literals.NEIGHBOURSTATS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Channelstats getEContainer_neighbourstats() {
        if (eContainerFeatureID() != Device_wifi_wifidevice_cst_statsPackage.NEIGHBOURSTATS__ECONTAINER_NEIGHBOURSTATS) return null;
        return (Channelstats)eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEContainer_neighbourstats(Channelstats newEContainer_neighbourstats, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newEContainer_neighbourstats, Device_wifi_wifidevice_cst_statsPackage.NEIGHBOURSTATS__ECONTAINER_NEIGHBOURSTATS, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEContainer_neighbourstats(Channelstats newEContainer_neighbourstats) {
        if (newEContainer_neighbourstats != eInternalContainer() || (eContainerFeatureID() != Device_wifi_wifidevice_cst_statsPackage.NEIGHBOURSTATS__ECONTAINER_NEIGHBOURSTATS && newEContainer_neighbourstats != null)) {
            if (EcoreUtil.isAncestor(this, newEContainer_neighbourstats))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newEContainer_neighbourstats != null)
                msgs = ((InternalEObject)newEContainer_neighbourstats).eInverseAdd(this, Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__NEIGHBOURSTATS, Channelstats.class, msgs);
            msgs = basicSetEContainer_neighbourstats(newEContainer_neighbourstats, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_wifidevice_cst_statsPackage.NEIGHBOURSTATS__ECONTAINER_NEIGHBOURSTATS, newEContainer_neighbourstats, newEContainer_neighbourstats));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<String> getText() {
        if (text == null) {
            text = new EDataTypeEList<String>(String.class, this, Device_wifi_wifidevice_cst_statsPackage.NEIGHBOURSTATS__TEXT);
        }
        return text;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Nb> getNb() {
        if (nb == null) {
            nb = new EObjectContainmentWithInverseEList<Nb>(Nb.class, this, Device_wifi_wifidevice_cst_statsPackage.NEIGHBOURSTATS__NB, Device_wifi_wifidevice_cst_statsPackage.NB__ECONTAINER_NB);
        }
        return nb;
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
            case Device_wifi_wifidevice_cst_statsPackage.NEIGHBOURSTATS__ECONTAINER_NEIGHBOURSTATS:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetEContainer_neighbourstats((Channelstats)otherEnd, msgs);
            case Device_wifi_wifidevice_cst_statsPackage.NEIGHBOURSTATS__NB:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getNb()).basicAdd(otherEnd, msgs);
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
            case Device_wifi_wifidevice_cst_statsPackage.NEIGHBOURSTATS__ECONTAINER_NEIGHBOURSTATS:
                return basicSetEContainer_neighbourstats(null, msgs);
            case Device_wifi_wifidevice_cst_statsPackage.NEIGHBOURSTATS__NB:
                return ((InternalEList<?>)getNb()).basicRemove(otherEnd, msgs);
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
            case Device_wifi_wifidevice_cst_statsPackage.NEIGHBOURSTATS__ECONTAINER_NEIGHBOURSTATS:
                return eInternalContainer().eInverseRemove(this, Device_wifi_wifidevice_cst_statsPackage.CHANNELSTATS__NEIGHBOURSTATS, Channelstats.class, msgs);
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
            case Device_wifi_wifidevice_cst_statsPackage.NEIGHBOURSTATS__ECONTAINER_NEIGHBOURSTATS:
                return getEContainer_neighbourstats();
            case Device_wifi_wifidevice_cst_statsPackage.NEIGHBOURSTATS__TEXT:
                return getText();
            case Device_wifi_wifidevice_cst_statsPackage.NEIGHBOURSTATS__NB:
                return getNb();
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
            case Device_wifi_wifidevice_cst_statsPackage.NEIGHBOURSTATS__ECONTAINER_NEIGHBOURSTATS:
                setEContainer_neighbourstats((Channelstats)newValue);
                return;
            case Device_wifi_wifidevice_cst_statsPackage.NEIGHBOURSTATS__TEXT:
                getText().clear();
                getText().addAll((Collection<? extends String>)newValue);
                return;
            case Device_wifi_wifidevice_cst_statsPackage.NEIGHBOURSTATS__NB:
                getNb().clear();
                getNb().addAll((Collection<? extends Nb>)newValue);
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
            case Device_wifi_wifidevice_cst_statsPackage.NEIGHBOURSTATS__ECONTAINER_NEIGHBOURSTATS:
                setEContainer_neighbourstats((Channelstats)null);
                return;
            case Device_wifi_wifidevice_cst_statsPackage.NEIGHBOURSTATS__TEXT:
                getText().clear();
                return;
            case Device_wifi_wifidevice_cst_statsPackage.NEIGHBOURSTATS__NB:
                getNb().clear();
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
            case Device_wifi_wifidevice_cst_statsPackage.NEIGHBOURSTATS__ECONTAINER_NEIGHBOURSTATS:
                return getEContainer_neighbourstats() != null;
            case Device_wifi_wifidevice_cst_statsPackage.NEIGHBOURSTATS__TEXT:
                return text != null && !text.isEmpty();
            case Device_wifi_wifidevice_cst_statsPackage.NEIGHBOURSTATS__NB:
                return nb != null && !nb.isEmpty();
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
        result.append(')');
        return result.toString();
    }

} //NeighbourstatsImpl
