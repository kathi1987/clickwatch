/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.model.impl;

import de.hub.clickwatch.model.ClickWatchModelPackage;
import de.hub.clickwatch.model.Statistic;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Statistic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.clickwatch.model.impl.StatisticImpl#getSum <em>Sum</em>}</li>
 *   <li>{@link de.hub.clickwatch.model.impl.StatisticImpl#getCount <em>Count</em>}</li>
 *   <li>{@link de.hub.clickwatch.model.impl.StatisticImpl#getMean <em>Mean</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StatisticImpl extends EObjectImpl implements Statistic {
    /**
     * The default value of the '{@link #getSum() <em>Sum</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSum()
     * @generated
     * @ordered
     */
    protected static final double SUM_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getSum() <em>Sum</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSum()
     * @generated
     * @ordered
     */
    protected double sum = SUM_EDEFAULT;

    /**
     * The default value of the '{@link #getCount() <em>Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCount()
     * @generated
     * @ordered
     */
    protected static final double COUNT_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getCount() <em>Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCount()
     * @generated
     * @ordered
     */
    protected double count = COUNT_EDEFAULT;

    /**
     * The default value of the '{@link #getMean() <em>Mean</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMean()
     * @generated
     * @ordered
     */
    protected static final double MEAN_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getMean() <em>Mean</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMean()
     * @generated
     * @ordered
     */
    protected double mean = MEAN_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected StatisticImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ClickWatchModelPackage.Literals.STATISTIC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public double getSum() {
        return sum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSum(double newSum) {
        double oldSum = sum;
        sum = newSum;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ClickWatchModelPackage.STATISTIC__SUM, oldSum, sum));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public double getCount() {
        return count;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCount(double newCount) {
        double oldCount = count;
        count = newCount;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ClickWatchModelPackage.STATISTIC__COUNT, oldCount, count));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public double getMean() {
        return mean;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMean(double newMean) {
        double oldMean = mean;
        mean = newMean;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ClickWatchModelPackage.STATISTIC__MEAN, oldMean, mean));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public void addValue(double value) {
        setSum(getSum() + value);
        setCount(getCount() + 1);
        setMean(getSum() / getCount());   
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ClickWatchModelPackage.STATISTIC__SUM:
                return getSum();
            case ClickWatchModelPackage.STATISTIC__COUNT:
                return getCount();
            case ClickWatchModelPackage.STATISTIC__MEAN:
                return getMean();
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
            case ClickWatchModelPackage.STATISTIC__SUM:
                setSum((Double)newValue);
                return;
            case ClickWatchModelPackage.STATISTIC__COUNT:
                setCount((Double)newValue);
                return;
            case ClickWatchModelPackage.STATISTIC__MEAN:
                setMean((Double)newValue);
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
            case ClickWatchModelPackage.STATISTIC__SUM:
                setSum(SUM_EDEFAULT);
                return;
            case ClickWatchModelPackage.STATISTIC__COUNT:
                setCount(COUNT_EDEFAULT);
                return;
            case ClickWatchModelPackage.STATISTIC__MEAN:
                setMean(MEAN_EDEFAULT);
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
            case ClickWatchModelPackage.STATISTIC__SUM:
                return sum != SUM_EDEFAULT;
            case ClickWatchModelPackage.STATISTIC__COUNT:
                return count != COUNT_EDEFAULT;
            case ClickWatchModelPackage.STATISTIC__MEAN:
                return mean != MEAN_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    @Override
    public String toString() {
        return "count=" + getCount() + "; sum=" + getSum() + "; mean=" + getMean() + ";";
    }

} //StatisticImpl
