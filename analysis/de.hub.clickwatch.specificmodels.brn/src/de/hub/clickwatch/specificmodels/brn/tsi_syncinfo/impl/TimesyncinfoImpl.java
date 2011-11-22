/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.tsi_syncinfo.impl;

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

import de.hub.clickwatch.specificmodels.brn.tsi_syncinfo.Syncinfo;
import de.hub.clickwatch.specificmodels.brn.tsi_syncinfo.Syncpacket;
import de.hub.clickwatch.specificmodels.brn.tsi_syncinfo.Timesyncinfo;
import de.hub.clickwatch.specificmodels.brn.tsi_syncinfo.Tsi_syncinfoPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timesyncinfo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.tsi_syncinfo.impl.TimesyncinfoImpl#getEContainer_timesyncinfo <em>EContainer timesyncinfo</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.tsi_syncinfo.impl.TimesyncinfoImpl#getText <em>Text</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.tsi_syncinfo.impl.TimesyncinfoImpl#getSyncpacket <em>Syncpacket</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.tsi_syncinfo.impl.TimesyncinfoImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.tsi_syncinfo.impl.TimesyncinfoImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.tsi_syncinfo.impl.TimesyncinfoImpl#getTime <em>Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimesyncinfoImpl extends EObjectImpl implements Timesyncinfo {
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
     * The cached value of the '{@link #getSyncpacket() <em>Syncpacket</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSyncpacket()
     * @generated
     * @ordered
     */
    protected EList<Syncpacket> syncpacket;

    /**
     * The default value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
    protected static final String ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
    protected String id = ID_EDEFAULT;

    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;

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
    protected TimesyncinfoImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Tsi_syncinfoPackage.Literals.TIMESYNCINFO;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Syncinfo getEContainer_timesyncinfo() {
        if (eContainerFeatureID() != Tsi_syncinfoPackage.TIMESYNCINFO__ECONTAINER_TIMESYNCINFO) return null;
        return (Syncinfo)eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEContainer_timesyncinfo(Syncinfo newEContainer_timesyncinfo, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newEContainer_timesyncinfo, Tsi_syncinfoPackage.TIMESYNCINFO__ECONTAINER_TIMESYNCINFO, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEContainer_timesyncinfo(Syncinfo newEContainer_timesyncinfo) {
        if (newEContainer_timesyncinfo != eInternalContainer() || (eContainerFeatureID() != Tsi_syncinfoPackage.TIMESYNCINFO__ECONTAINER_TIMESYNCINFO && newEContainer_timesyncinfo != null)) {
            if (EcoreUtil.isAncestor(this, newEContainer_timesyncinfo))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newEContainer_timesyncinfo != null)
                msgs = ((InternalEObject)newEContainer_timesyncinfo).eInverseAdd(this, Tsi_syncinfoPackage.SYNCINFO__TIMESYNCINFO, Syncinfo.class, msgs);
            msgs = basicSetEContainer_timesyncinfo(newEContainer_timesyncinfo, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Tsi_syncinfoPackage.TIMESYNCINFO__ECONTAINER_TIMESYNCINFO, newEContainer_timesyncinfo, newEContainer_timesyncinfo));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<String> getText() {
        if (text == null) {
            text = new EDataTypeEList<String>(String.class, this, Tsi_syncinfoPackage.TIMESYNCINFO__TEXT);
        }
        return text;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Syncpacket> getSyncpacket() {
        if (syncpacket == null) {
            syncpacket = new EObjectContainmentWithInverseEList<Syncpacket>(Syncpacket.class, this, Tsi_syncinfoPackage.TIMESYNCINFO__SYNCPACKET, Tsi_syncinfoPackage.SYNCPACKET__ECONTAINER_SYNCPACKET);
        }
        return syncpacket;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getId() {
        return id;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setId(String newId) {
        String oldId = id;
        id = newId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Tsi_syncinfoPackage.TIMESYNCINFO__ID, oldId, id));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setName(String newName) {
        String oldName = name;
        name = newName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Tsi_syncinfoPackage.TIMESYNCINFO__NAME, oldName, name));
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
            eNotify(new ENotificationImpl(this, Notification.SET, Tsi_syncinfoPackage.TIMESYNCINFO__TIME, oldTime, time));
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
            case Tsi_syncinfoPackage.TIMESYNCINFO__ECONTAINER_TIMESYNCINFO:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetEContainer_timesyncinfo((Syncinfo)otherEnd, msgs);
            case Tsi_syncinfoPackage.TIMESYNCINFO__SYNCPACKET:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getSyncpacket()).basicAdd(otherEnd, msgs);
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
            case Tsi_syncinfoPackage.TIMESYNCINFO__ECONTAINER_TIMESYNCINFO:
                return basicSetEContainer_timesyncinfo(null, msgs);
            case Tsi_syncinfoPackage.TIMESYNCINFO__SYNCPACKET:
                return ((InternalEList<?>)getSyncpacket()).basicRemove(otherEnd, msgs);
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
            case Tsi_syncinfoPackage.TIMESYNCINFO__ECONTAINER_TIMESYNCINFO:
                return eInternalContainer().eInverseRemove(this, Tsi_syncinfoPackage.SYNCINFO__TIMESYNCINFO, Syncinfo.class, msgs);
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
            case Tsi_syncinfoPackage.TIMESYNCINFO__ECONTAINER_TIMESYNCINFO:
                return getEContainer_timesyncinfo();
            case Tsi_syncinfoPackage.TIMESYNCINFO__TEXT:
                return getText();
            case Tsi_syncinfoPackage.TIMESYNCINFO__SYNCPACKET:
                return getSyncpacket();
            case Tsi_syncinfoPackage.TIMESYNCINFO__ID:
                return getId();
            case Tsi_syncinfoPackage.TIMESYNCINFO__NAME:
                return getName();
            case Tsi_syncinfoPackage.TIMESYNCINFO__TIME:
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
            case Tsi_syncinfoPackage.TIMESYNCINFO__ECONTAINER_TIMESYNCINFO:
                setEContainer_timesyncinfo((Syncinfo)newValue);
                return;
            case Tsi_syncinfoPackage.TIMESYNCINFO__TEXT:
                getText().clear();
                getText().addAll((Collection<? extends String>)newValue);
                return;
            case Tsi_syncinfoPackage.TIMESYNCINFO__SYNCPACKET:
                getSyncpacket().clear();
                getSyncpacket().addAll((Collection<? extends Syncpacket>)newValue);
                return;
            case Tsi_syncinfoPackage.TIMESYNCINFO__ID:
                setId((String)newValue);
                return;
            case Tsi_syncinfoPackage.TIMESYNCINFO__NAME:
                setName((String)newValue);
                return;
            case Tsi_syncinfoPackage.TIMESYNCINFO__TIME:
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
            case Tsi_syncinfoPackage.TIMESYNCINFO__ECONTAINER_TIMESYNCINFO:
                setEContainer_timesyncinfo((Syncinfo)null);
                return;
            case Tsi_syncinfoPackage.TIMESYNCINFO__TEXT:
                getText().clear();
                return;
            case Tsi_syncinfoPackage.TIMESYNCINFO__SYNCPACKET:
                getSyncpacket().clear();
                return;
            case Tsi_syncinfoPackage.TIMESYNCINFO__ID:
                setId(ID_EDEFAULT);
                return;
            case Tsi_syncinfoPackage.TIMESYNCINFO__NAME:
                setName(NAME_EDEFAULT);
                return;
            case Tsi_syncinfoPackage.TIMESYNCINFO__TIME:
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
            case Tsi_syncinfoPackage.TIMESYNCINFO__ECONTAINER_TIMESYNCINFO:
                return getEContainer_timesyncinfo() != null;
            case Tsi_syncinfoPackage.TIMESYNCINFO__TEXT:
                return text != null && !text.isEmpty();
            case Tsi_syncinfoPackage.TIMESYNCINFO__SYNCPACKET:
                return syncpacket != null && !syncpacket.isEmpty();
            case Tsi_syncinfoPackage.TIMESYNCINFO__ID:
                return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
            case Tsi_syncinfoPackage.TIMESYNCINFO__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case Tsi_syncinfoPackage.TIMESYNCINFO__TIME:
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
        result.append(", id: ");
        result.append(id);
        result.append(", name: ");
        result.append(name);
        result.append(", time: ");
        result.append(time);
        result.append(')');
        return result.toString();
    }

} //TimesyncinfoImpl
