/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.lt_links.impl;

import de.hub.clickwatch.specificmodels.brn.lt_links.Link;
import de.hub.clickwatch.specificmodels.brn.lt_links.Linktable;
import de.hub.clickwatch.specificmodels.brn.lt_links.Lt_linksPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.lt_links.impl.LinkImpl#getEContainer_link <em>EContainer link</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.lt_links.impl.LinkImpl#getFrom <em>From</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.lt_links.impl.LinkImpl#getTo <em>To</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.lt_links.impl.LinkImpl#getMetric <em>Metric</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.lt_links.impl.LinkImpl#getSeq <em>Seq</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.lt_links.impl.LinkImpl#getAge <em>Age</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinkImpl extends EObjectImpl implements Link {
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
     * The default value of the '{@link #getMetric() <em>Metric</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMetric()
     * @generated
     * @ordered
     */
    protected static final int METRIC_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getMetric() <em>Metric</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMetric()
     * @generated
     * @ordered
     */
    protected int metric = METRIC_EDEFAULT;

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
     * The default value of the '{@link #getAge() <em>Age</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAge()
     * @generated
     * @ordered
     */
    protected static final int AGE_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getAge() <em>Age</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAge()
     * @generated
     * @ordered
     */
    protected int age = AGE_EDEFAULT;

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
        return Lt_linksPackage.Literals.LINK;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Linktable getEContainer_link() {
        if (eContainerFeatureID() != Lt_linksPackage.LINK__ECONTAINER_LINK) return null;
        return (Linktable)eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEContainer_link(Linktable newEContainer_link, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newEContainer_link, Lt_linksPackage.LINK__ECONTAINER_LINK, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEContainer_link(Linktable newEContainer_link) {
        if (newEContainer_link != eInternalContainer() || (eContainerFeatureID() != Lt_linksPackage.LINK__ECONTAINER_LINK && newEContainer_link != null)) {
            if (EcoreUtil.isAncestor(this, newEContainer_link))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newEContainer_link != null)
                msgs = ((InternalEObject)newEContainer_link).eInverseAdd(this, Lt_linksPackage.LINKTABLE__LINK, Linktable.class, msgs);
            msgs = basicSetEContainer_link(newEContainer_link, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Lt_linksPackage.LINK__ECONTAINER_LINK, newEContainer_link, newEContainer_link));
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
            eNotify(new ENotificationImpl(this, Notification.SET, Lt_linksPackage.LINK__FROM, oldFrom, from));
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
            eNotify(new ENotificationImpl(this, Notification.SET, Lt_linksPackage.LINK__TO, oldTo, to));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getMetric() {
        return metric;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMetric(int newMetric) {
        int oldMetric = metric;
        metric = newMetric;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Lt_linksPackage.LINK__METRIC, oldMetric, metric));
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
            eNotify(new ENotificationImpl(this, Notification.SET, Lt_linksPackage.LINK__SEQ, oldSeq, seq));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getAge() {
        return age;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAge(int newAge) {
        int oldAge = age;
        age = newAge;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Lt_linksPackage.LINK__AGE, oldAge, age));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case Lt_linksPackage.LINK__ECONTAINER_LINK:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetEContainer_link((Linktable)otherEnd, msgs);
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
            case Lt_linksPackage.LINK__ECONTAINER_LINK:
                return basicSetEContainer_link(null, msgs);
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
            case Lt_linksPackage.LINK__ECONTAINER_LINK:
                return eInternalContainer().eInverseRemove(this, Lt_linksPackage.LINKTABLE__LINK, Linktable.class, msgs);
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
            case Lt_linksPackage.LINK__ECONTAINER_LINK:
                return getEContainer_link();
            case Lt_linksPackage.LINK__FROM:
                return getFrom();
            case Lt_linksPackage.LINK__TO:
                return getTo();
            case Lt_linksPackage.LINK__METRIC:
                return getMetric();
            case Lt_linksPackage.LINK__SEQ:
                return getSeq();
            case Lt_linksPackage.LINK__AGE:
                return getAge();
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
            case Lt_linksPackage.LINK__ECONTAINER_LINK:
                setEContainer_link((Linktable)newValue);
                return;
            case Lt_linksPackage.LINK__FROM:
                setFrom((String)newValue);
                return;
            case Lt_linksPackage.LINK__TO:
                setTo((String)newValue);
                return;
            case Lt_linksPackage.LINK__METRIC:
                setMetric((Integer)newValue);
                return;
            case Lt_linksPackage.LINK__SEQ:
                setSeq((Integer)newValue);
                return;
            case Lt_linksPackage.LINK__AGE:
                setAge((Integer)newValue);
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
            case Lt_linksPackage.LINK__ECONTAINER_LINK:
                setEContainer_link((Linktable)null);
                return;
            case Lt_linksPackage.LINK__FROM:
                setFrom(FROM_EDEFAULT);
                return;
            case Lt_linksPackage.LINK__TO:
                setTo(TO_EDEFAULT);
                return;
            case Lt_linksPackage.LINK__METRIC:
                setMetric(METRIC_EDEFAULT);
                return;
            case Lt_linksPackage.LINK__SEQ:
                setSeq(SEQ_EDEFAULT);
                return;
            case Lt_linksPackage.LINK__AGE:
                setAge(AGE_EDEFAULT);
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
            case Lt_linksPackage.LINK__ECONTAINER_LINK:
                return getEContainer_link() != null;
            case Lt_linksPackage.LINK__FROM:
                return FROM_EDEFAULT == null ? from != null : !FROM_EDEFAULT.equals(from);
            case Lt_linksPackage.LINK__TO:
                return TO_EDEFAULT == null ? to != null : !TO_EDEFAULT.equals(to);
            case Lt_linksPackage.LINK__METRIC:
                return metric != METRIC_EDEFAULT;
            case Lt_linksPackage.LINK__SEQ:
                return seq != SEQ_EDEFAULT;
            case Lt_linksPackage.LINK__AGE:
                return age != AGE_EDEFAULT;
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
        result.append(" (from: ");
        result.append(from);
        result.append(", to: ");
        result.append(to);
        result.append(", metric: ");
        result.append(metric);
        result.append(", seq: ");
        result.append(seq);
        result.append(", age: ");
        result.append(age);
        result.append(')');
        return result.toString();
    }

} //LinkImpl
