/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.model.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import de.hub.clickwatch.model.ClickWatchModelFactory;
import de.hub.clickwatch.model.ClickWatchModelPackage;
import de.hub.clickwatch.model.ModelElementWithStatistics;
import de.hub.clickwatch.model.Statistic;
import de.hub.clickwatch.model.StatisticsContainer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Element With Statistics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.clickwatch.model.impl.ModelElementWithStatisticsImpl#getStatistics <em>Statistics</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ModelElementWithStatisticsImpl extends EObjectImpl implements ModelElementWithStatistics {
    /**
     * The cached value of the '{@link #getStatistics() <em>Statistics</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStatistics()
     * @generated
     * @ordered
     */
    protected StatisticsContainer statistics;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ModelElementWithStatisticsImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ClickWatchModelPackage.Literals.MODEL_ELEMENT_WITH_STATISTICS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public StatisticsContainer getStatistics() {
        if (statistics == null) {
            setStatistics(ClickWatchModelFactory.eINSTANCE.createStatisticsContainer());
        }
        return statistics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetStatistics(StatisticsContainer newStatistics, NotificationChain msgs) {
        StatisticsContainer oldStatistics = statistics;
        statistics = newStatistics;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ClickWatchModelPackage.MODEL_ELEMENT_WITH_STATISTICS__STATISTICS, oldStatistics, newStatistics);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setStatistics(StatisticsContainer newStatistics) {
        if (newStatistics != statistics) {
            NotificationChain msgs = null;
            if (statistics != null)
                msgs = ((InternalEObject)statistics).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ClickWatchModelPackage.MODEL_ELEMENT_WITH_STATISTICS__STATISTICS, null, msgs);
            if (newStatistics != null)
                msgs = ((InternalEObject)newStatistics).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ClickWatchModelPackage.MODEL_ELEMENT_WITH_STATISTICS__STATISTICS, null, msgs);
            msgs = basicSetStatistics(newStatistics, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ClickWatchModelPackage.MODEL_ELEMENT_WITH_STATISTICS__STATISTICS, newStatistics, newStatistics));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public Statistic getStatistics(String name) {
        Statistic statistic = getStatistics().getStatistics().get(name);
        if (statistic == null) {
            statistic = ClickWatchModelFactory.eINSTANCE.createStatistic();
            getStatistics().getStatistics().put(name, statistic);
        }
        return statistic;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ClickWatchModelPackage.MODEL_ELEMENT_WITH_STATISTICS__STATISTICS:
                return basicSetStatistics(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ClickWatchModelPackage.MODEL_ELEMENT_WITH_STATISTICS__STATISTICS:
                return getStatistics();
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
            case ClickWatchModelPackage.MODEL_ELEMENT_WITH_STATISTICS__STATISTICS:
                setStatistics((StatisticsContainer)newValue);
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
            case ClickWatchModelPackage.MODEL_ELEMENT_WITH_STATISTICS__STATISTICS:
                setStatistics((StatisticsContainer)null);
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
            case ClickWatchModelPackage.MODEL_ELEMENT_WITH_STATISTICS__STATISTICS:
                return statistics != null;
        }
        return super.eIsSet(featureID);
    }

} //ModelElementWithStatisticsImpl
