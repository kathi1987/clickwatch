/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statistic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.model.Statistic#getSum <em>Sum</em>}</li>
 *   <li>{@link de.hub.clickwatch.model.Statistic#getCount <em>Count</em>}</li>
 *   <li>{@link de.hub.clickwatch.model.Statistic#getMean <em>Mean</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.model.ClickWatchModelPackage#getStatistic()
 * @model
 * @generated
 */
public interface Statistic extends EObject {
    /**
     * Returns the value of the '<em><b>Sum</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sum</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sum</em>' attribute.
     * @see #setSum(double)
     * @see de.hub.clickwatch.model.ClickWatchModelPackage#getStatistic_Sum()
     * @model
     * @generated
     */
    double getSum();

    /**
     * Sets the value of the '{@link de.hub.clickwatch.model.Statistic#getSum <em>Sum</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sum</em>' attribute.
     * @see #getSum()
     * @generated
     */
    void setSum(double value);

    /**
     * Returns the value of the '<em><b>Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Count</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Count</em>' attribute.
     * @see #setCount(double)
     * @see de.hub.clickwatch.model.ClickWatchModelPackage#getStatistic_Count()
     * @model
     * @generated
     */
    double getCount();

    /**
     * Sets the value of the '{@link de.hub.clickwatch.model.Statistic#getCount <em>Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Count</em>' attribute.
     * @see #getCount()
     * @generated
     */
    void setCount(double value);

    /**
     * Returns the value of the '<em><b>Mean</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mean</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Mean</em>' attribute.
     * @see #setMean(double)
     * @see de.hub.clickwatch.model.ClickWatchModelPackage#getStatistic_Mean()
     * @model
     * @generated
     */
    double getMean();

    /**
     * Sets the value of the '{@link de.hub.clickwatch.model.Statistic#getMean <em>Mean</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Mean</em>' attribute.
     * @see #getMean()
     * @generated
     */
    void setMean(double value);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model
     * @generated
     */
    void addValue(double value);

} // Statistic
