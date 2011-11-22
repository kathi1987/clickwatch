/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.impl;

import de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Device_wifi_link_stat_bcast_statsPackage;
import de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Entry;
import de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Link;
import de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Link_info;

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
 * An implementation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.impl.LinkImpl#getEContainer_link <em>EContainer link</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.impl.LinkImpl#getText <em>Text</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.impl.LinkImpl#getLink_info <em>Link info</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.impl.LinkImpl#getTo <em>To</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.impl.LinkImpl#getSeq <em>Seq</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.impl.LinkImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.impl.LinkImpl#getTau <em>Tau</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.impl.LinkImpl#getLast_rx <em>Last rx</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinkImpl extends EObjectImpl implements Link {
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
     * The cached value of the '{@link #getLink_info() <em>Link info</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLink_info()
     * @generated
     * @ordered
     */
    protected EList<Link_info> link_info;

    /**
     * The default value of the '{@link #getTo() <em>To</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTo()
     * @generated
     * @ordered
     */
    protected static final String TO_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTo() <em>To</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTo()
     * @generated
     * @ordered
     */
    protected String to = TO_EDEFAULT;

    /**
     * The default value of the '{@link #getSeq() <em>Seq</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSeq()
     * @generated
     * @ordered
     */
    protected static final int SEQ_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getSeq() <em>Seq</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSeq()
     * @generated
     * @ordered
     */
    protected int seq = SEQ_EDEFAULT;

    /**
     * The default value of the '{@link #getPeriod() <em>Period</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPeriod()
     * @generated
     * @ordered
     */
    protected static final int PERIOD_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getPeriod() <em>Period</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPeriod()
     * @generated
     * @ordered
     */
    protected int period = PERIOD_EDEFAULT;

    /**
     * The default value of the '{@link #getTau() <em>Tau</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTau()
     * @generated
     * @ordered
     */
    protected static final int TAU_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getTau() <em>Tau</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTau()
     * @generated
     * @ordered
     */
    protected int tau = TAU_EDEFAULT;

    /**
     * The default value of the '{@link #getLast_rx() <em>Last rx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLast_rx()
     * @generated
     * @ordered
     */
    protected static final double LAST_RX_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getLast_rx() <em>Last rx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLast_rx()
     * @generated
     * @ordered
     */
    protected double last_rx = LAST_RX_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected LinkImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Device_wifi_link_stat_bcast_statsPackage.Literals.LINK;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Entry getEContainer_link() {
        if (eContainerFeatureID() != Device_wifi_link_stat_bcast_statsPackage.LINK__ECONTAINER_LINK) return null;
        return (Entry)eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEContainer_link(Entry newEContainer_link, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newEContainer_link, Device_wifi_link_stat_bcast_statsPackage.LINK__ECONTAINER_LINK, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEContainer_link(Entry newEContainer_link) {
        if (newEContainer_link != eInternalContainer() || (eContainerFeatureID() != Device_wifi_link_stat_bcast_statsPackage.LINK__ECONTAINER_LINK && newEContainer_link != null)) {
            if (EcoreUtil.isAncestor(this, newEContainer_link))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newEContainer_link != null)
                msgs = ((InternalEObject)newEContainer_link).eInverseAdd(this, Device_wifi_link_stat_bcast_statsPackage.ENTRY__LINK, Entry.class, msgs);
            msgs = basicSetEContainer_link(newEContainer_link, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_link_stat_bcast_statsPackage.LINK__ECONTAINER_LINK, newEContainer_link, newEContainer_link));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<String> getText() {
        if (text == null) {
            text = new EDataTypeEList<String>(String.class, this, Device_wifi_link_stat_bcast_statsPackage.LINK__TEXT);
        }
        return text;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Link_info> getLink_info() {
        if (link_info == null) {
            link_info = new EObjectContainmentWithInverseEList<Link_info>(Link_info.class, this, Device_wifi_link_stat_bcast_statsPackage.LINK__LINK_INFO, Device_wifi_link_stat_bcast_statsPackage.LINK_INFO__ECONTAINER_LINK_INFO);
        }
        return link_info;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getTo() {
        return to;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTo(String newTo) {
        String oldTo = to;
        to = newTo;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_link_stat_bcast_statsPackage.LINK__TO, oldTo, to));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getSeq() {
        return seq;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSeq(int newSeq) {
        int oldSeq = seq;
        seq = newSeq;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_link_stat_bcast_statsPackage.LINK__SEQ, oldSeq, seq));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getPeriod() {
        return period;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPeriod(int newPeriod) {
        int oldPeriod = period;
        period = newPeriod;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_link_stat_bcast_statsPackage.LINK__PERIOD, oldPeriod, period));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getTau() {
        return tau;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTau(int newTau) {
        int oldTau = tau;
        tau = newTau;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_link_stat_bcast_statsPackage.LINK__TAU, oldTau, tau));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public double getLast_rx() {
        return last_rx;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLast_rx(double newLast_rx) {
        double oldLast_rx = last_rx;
        last_rx = newLast_rx;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_link_stat_bcast_statsPackage.LINK__LAST_RX, oldLast_rx, last_rx));
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
            case Device_wifi_link_stat_bcast_statsPackage.LINK__ECONTAINER_LINK:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetEContainer_link((Entry)otherEnd, msgs);
            case Device_wifi_link_stat_bcast_statsPackage.LINK__LINK_INFO:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getLink_info()).basicAdd(otherEnd, msgs);
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
            case Device_wifi_link_stat_bcast_statsPackage.LINK__ECONTAINER_LINK:
                return basicSetEContainer_link(null, msgs);
            case Device_wifi_link_stat_bcast_statsPackage.LINK__LINK_INFO:
                return ((InternalEList<?>)getLink_info()).basicRemove(otherEnd, msgs);
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
            case Device_wifi_link_stat_bcast_statsPackage.LINK__ECONTAINER_LINK:
                return eInternalContainer().eInverseRemove(this, Device_wifi_link_stat_bcast_statsPackage.ENTRY__LINK, Entry.class, msgs);
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
            case Device_wifi_link_stat_bcast_statsPackage.LINK__ECONTAINER_LINK:
                return getEContainer_link();
            case Device_wifi_link_stat_bcast_statsPackage.LINK__TEXT:
                return getText();
            case Device_wifi_link_stat_bcast_statsPackage.LINK__LINK_INFO:
                return getLink_info();
            case Device_wifi_link_stat_bcast_statsPackage.LINK__TO:
                return getTo();
            case Device_wifi_link_stat_bcast_statsPackage.LINK__SEQ:
                return getSeq();
            case Device_wifi_link_stat_bcast_statsPackage.LINK__PERIOD:
                return getPeriod();
            case Device_wifi_link_stat_bcast_statsPackage.LINK__TAU:
                return getTau();
            case Device_wifi_link_stat_bcast_statsPackage.LINK__LAST_RX:
                return getLast_rx();
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
            case Device_wifi_link_stat_bcast_statsPackage.LINK__ECONTAINER_LINK:
                setEContainer_link((Entry)newValue);
                return;
            case Device_wifi_link_stat_bcast_statsPackage.LINK__TEXT:
                getText().clear();
                getText().addAll((Collection<? extends String>)newValue);
                return;
            case Device_wifi_link_stat_bcast_statsPackage.LINK__LINK_INFO:
                getLink_info().clear();
                getLink_info().addAll((Collection<? extends Link_info>)newValue);
                return;
            case Device_wifi_link_stat_bcast_statsPackage.LINK__TO:
                setTo((String)newValue);
                return;
            case Device_wifi_link_stat_bcast_statsPackage.LINK__SEQ:
                setSeq((Integer)newValue);
                return;
            case Device_wifi_link_stat_bcast_statsPackage.LINK__PERIOD:
                setPeriod((Integer)newValue);
                return;
            case Device_wifi_link_stat_bcast_statsPackage.LINK__TAU:
                setTau((Integer)newValue);
                return;
            case Device_wifi_link_stat_bcast_statsPackage.LINK__LAST_RX:
                setLast_rx((Double)newValue);
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
            case Device_wifi_link_stat_bcast_statsPackage.LINK__ECONTAINER_LINK:
                setEContainer_link((Entry)null);
                return;
            case Device_wifi_link_stat_bcast_statsPackage.LINK__TEXT:
                getText().clear();
                return;
            case Device_wifi_link_stat_bcast_statsPackage.LINK__LINK_INFO:
                getLink_info().clear();
                return;
            case Device_wifi_link_stat_bcast_statsPackage.LINK__TO:
                setTo(TO_EDEFAULT);
                return;
            case Device_wifi_link_stat_bcast_statsPackage.LINK__SEQ:
                setSeq(SEQ_EDEFAULT);
                return;
            case Device_wifi_link_stat_bcast_statsPackage.LINK__PERIOD:
                setPeriod(PERIOD_EDEFAULT);
                return;
            case Device_wifi_link_stat_bcast_statsPackage.LINK__TAU:
                setTau(TAU_EDEFAULT);
                return;
            case Device_wifi_link_stat_bcast_statsPackage.LINK__LAST_RX:
                setLast_rx(LAST_RX_EDEFAULT);
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
            case Device_wifi_link_stat_bcast_statsPackage.LINK__ECONTAINER_LINK:
                return getEContainer_link() != null;
            case Device_wifi_link_stat_bcast_statsPackage.LINK__TEXT:
                return text != null && !text.isEmpty();
            case Device_wifi_link_stat_bcast_statsPackage.LINK__LINK_INFO:
                return link_info != null && !link_info.isEmpty();
            case Device_wifi_link_stat_bcast_statsPackage.LINK__TO:
                return TO_EDEFAULT == null ? to != null : !TO_EDEFAULT.equals(to);
            case Device_wifi_link_stat_bcast_statsPackage.LINK__SEQ:
                return seq != SEQ_EDEFAULT;
            case Device_wifi_link_stat_bcast_statsPackage.LINK__PERIOD:
                return period != PERIOD_EDEFAULT;
            case Device_wifi_link_stat_bcast_statsPackage.LINK__TAU:
                return tau != TAU_EDEFAULT;
            case Device_wifi_link_stat_bcast_statsPackage.LINK__LAST_RX:
                return last_rx != LAST_RX_EDEFAULT;
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
        result.append(", to: ");
        result.append(to);
        result.append(", seq: ");
        result.append(seq);
        result.append(", period: ");
        result.append(period);
        result.append(", tau: ");
        result.append(tau);
        result.append(", last_rx: ");
        result.append(last_rx);
        result.append(')');
        return result.toString();
    }

} //LinkImpl
