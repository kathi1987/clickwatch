/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.impl;

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

import de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Bcast_stats;
import de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Device_wifi_link_stat_bcast_statsPackage;
import de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Entry;
import de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Link;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.impl.EntryImpl#getEContainer_entry <em>EContainer entry</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.impl.EntryImpl#getText <em>Text</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.impl.EntryImpl#getLink <em>Link</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.impl.EntryImpl#getFrom <em>From</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.impl.EntryImpl#getTime <em>Time</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.impl.EntryImpl#getSeq <em>Seq</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.impl.EntryImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.impl.EntryImpl#getTau <em>Tau</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntryImpl extends EObjectImpl implements Entry {
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
     * The cached value of the '{@link #getLink() <em>Link</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLink()
     * @generated
     * @ordered
     */
    protected EList<Link> link;

    /**
     * The default value of the '{@link #getFrom() <em>From</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFrom()
     * @generated
     * @ordered
     */
    protected static final String FROM_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFrom() <em>From</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFrom()
     * @generated
     * @ordered
     */
    protected String from = FROM_EDEFAULT;

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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EntryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Device_wifi_link_stat_bcast_statsPackage.Literals.ENTRY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Bcast_stats getEContainer_entry() {
        if (eContainerFeatureID() != Device_wifi_link_stat_bcast_statsPackage.ENTRY__ECONTAINER_ENTRY) return null;
        return (Bcast_stats)eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEContainer_entry(Bcast_stats newEContainer_entry, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newEContainer_entry, Device_wifi_link_stat_bcast_statsPackage.ENTRY__ECONTAINER_ENTRY, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEContainer_entry(Bcast_stats newEContainer_entry) {
        if (newEContainer_entry != eInternalContainer() || (eContainerFeatureID() != Device_wifi_link_stat_bcast_statsPackage.ENTRY__ECONTAINER_ENTRY && newEContainer_entry != null)) {
            if (EcoreUtil.isAncestor(this, newEContainer_entry))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newEContainer_entry != null)
                msgs = ((InternalEObject)newEContainer_entry).eInverseAdd(this, Device_wifi_link_stat_bcast_statsPackage.BCAST_STATS__ENTRY, Bcast_stats.class, msgs);
            msgs = basicSetEContainer_entry(newEContainer_entry, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_link_stat_bcast_statsPackage.ENTRY__ECONTAINER_ENTRY, newEContainer_entry, newEContainer_entry));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<String> getText() {
        if (text == null) {
            text = new EDataTypeEList<String>(String.class, this, Device_wifi_link_stat_bcast_statsPackage.ENTRY__TEXT);
        }
        return text;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Link> getLink() {
        if (link == null) {
            link = new EObjectContainmentWithInverseEList<Link>(Link.class, this, Device_wifi_link_stat_bcast_statsPackage.ENTRY__LINK, Device_wifi_link_stat_bcast_statsPackage.LINK__ECONTAINER_LINK);
        }
        return link;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getFrom() {
        return from;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFrom(String newFrom) {
        String oldFrom = from;
        from = newFrom;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_link_stat_bcast_statsPackage.ENTRY__FROM, oldFrom, from));
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
            eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_link_stat_bcast_statsPackage.ENTRY__TIME, oldTime, time));
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
            eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_link_stat_bcast_statsPackage.ENTRY__SEQ, oldSeq, seq));
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
            eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_link_stat_bcast_statsPackage.ENTRY__PERIOD, oldPeriod, period));
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
            eNotify(new ENotificationImpl(this, Notification.SET, Device_wifi_link_stat_bcast_statsPackage.ENTRY__TAU, oldTau, tau));
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
            case Device_wifi_link_stat_bcast_statsPackage.ENTRY__ECONTAINER_ENTRY:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetEContainer_entry((Bcast_stats)otherEnd, msgs);
            case Device_wifi_link_stat_bcast_statsPackage.ENTRY__LINK:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getLink()).basicAdd(otherEnd, msgs);
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
            case Device_wifi_link_stat_bcast_statsPackage.ENTRY__ECONTAINER_ENTRY:
                return basicSetEContainer_entry(null, msgs);
            case Device_wifi_link_stat_bcast_statsPackage.ENTRY__LINK:
                return ((InternalEList<?>)getLink()).basicRemove(otherEnd, msgs);
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
            case Device_wifi_link_stat_bcast_statsPackage.ENTRY__ECONTAINER_ENTRY:
                return eInternalContainer().eInverseRemove(this, Device_wifi_link_stat_bcast_statsPackage.BCAST_STATS__ENTRY, Bcast_stats.class, msgs);
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
            case Device_wifi_link_stat_bcast_statsPackage.ENTRY__ECONTAINER_ENTRY:
                return getEContainer_entry();
            case Device_wifi_link_stat_bcast_statsPackage.ENTRY__TEXT:
                return getText();
            case Device_wifi_link_stat_bcast_statsPackage.ENTRY__LINK:
                return getLink();
            case Device_wifi_link_stat_bcast_statsPackage.ENTRY__FROM:
                return getFrom();
            case Device_wifi_link_stat_bcast_statsPackage.ENTRY__TIME:
                return getTime();
            case Device_wifi_link_stat_bcast_statsPackage.ENTRY__SEQ:
                return getSeq();
            case Device_wifi_link_stat_bcast_statsPackage.ENTRY__PERIOD:
                return getPeriod();
            case Device_wifi_link_stat_bcast_statsPackage.ENTRY__TAU:
                return getTau();
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
            case Device_wifi_link_stat_bcast_statsPackage.ENTRY__ECONTAINER_ENTRY:
                setEContainer_entry((Bcast_stats)newValue);
                return;
            case Device_wifi_link_stat_bcast_statsPackage.ENTRY__TEXT:
                getText().clear();
                getText().addAll((Collection<? extends String>)newValue);
                return;
            case Device_wifi_link_stat_bcast_statsPackage.ENTRY__LINK:
                getLink().clear();
                getLink().addAll((Collection<? extends Link>)newValue);
                return;
            case Device_wifi_link_stat_bcast_statsPackage.ENTRY__FROM:
                setFrom((String)newValue);
                return;
            case Device_wifi_link_stat_bcast_statsPackage.ENTRY__TIME:
                setTime((Double)newValue);
                return;
            case Device_wifi_link_stat_bcast_statsPackage.ENTRY__SEQ:
                setSeq((Integer)newValue);
                return;
            case Device_wifi_link_stat_bcast_statsPackage.ENTRY__PERIOD:
                setPeriod((Integer)newValue);
                return;
            case Device_wifi_link_stat_bcast_statsPackage.ENTRY__TAU:
                setTau((Integer)newValue);
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
            case Device_wifi_link_stat_bcast_statsPackage.ENTRY__ECONTAINER_ENTRY:
                setEContainer_entry((Bcast_stats)null);
                return;
            case Device_wifi_link_stat_bcast_statsPackage.ENTRY__TEXT:
                getText().clear();
                return;
            case Device_wifi_link_stat_bcast_statsPackage.ENTRY__LINK:
                getLink().clear();
                return;
            case Device_wifi_link_stat_bcast_statsPackage.ENTRY__FROM:
                setFrom(FROM_EDEFAULT);
                return;
            case Device_wifi_link_stat_bcast_statsPackage.ENTRY__TIME:
                setTime(TIME_EDEFAULT);
                return;
            case Device_wifi_link_stat_bcast_statsPackage.ENTRY__SEQ:
                setSeq(SEQ_EDEFAULT);
                return;
            case Device_wifi_link_stat_bcast_statsPackage.ENTRY__PERIOD:
                setPeriod(PERIOD_EDEFAULT);
                return;
            case Device_wifi_link_stat_bcast_statsPackage.ENTRY__TAU:
                setTau(TAU_EDEFAULT);
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
            case Device_wifi_link_stat_bcast_statsPackage.ENTRY__ECONTAINER_ENTRY:
                return getEContainer_entry() != null;
            case Device_wifi_link_stat_bcast_statsPackage.ENTRY__TEXT:
                return text != null && !text.isEmpty();
            case Device_wifi_link_stat_bcast_statsPackage.ENTRY__LINK:
                return link != null && !link.isEmpty();
            case Device_wifi_link_stat_bcast_statsPackage.ENTRY__FROM:
                return FROM_EDEFAULT == null ? from != null : !FROM_EDEFAULT.equals(from);
            case Device_wifi_link_stat_bcast_statsPackage.ENTRY__TIME:
                return time != TIME_EDEFAULT;
            case Device_wifi_link_stat_bcast_statsPackage.ENTRY__SEQ:
                return seq != SEQ_EDEFAULT;
            case Device_wifi_link_stat_bcast_statsPackage.ENTRY__PERIOD:
                return period != PERIOD_EDEFAULT;
            case Device_wifi_link_stat_bcast_statsPackage.ENTRY__TAU:
                return tau != TAU_EDEFAULT;
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
        result.append(", from: ");
        result.append(from);
        result.append(", time: ");
        result.append(time);
        result.append(", seq: ");
        result.append(seq);
        result.append(", period: ");
        result.append(period);
        result.append(", tau: ");
        result.append(tau);
        result.append(')');
        return result.toString();
    }

} //EntryImpl
