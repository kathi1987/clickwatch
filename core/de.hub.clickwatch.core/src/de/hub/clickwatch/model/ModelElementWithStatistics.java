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
 * A representation of the model object '<em><b>Model Element With Statistics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.model.ModelElementWithStatistics#getStatistics <em>Statistics</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.model.ClickWatchModelPackage#getModelElementWithStatistics()
 * @model abstract="true"
 * @generated
 */
public interface ModelElementWithStatistics extends EObject {
    /**
     * Returns the value of the '<em><b>Statistics</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Statistics</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Statistics</em>' containment reference.
     * @see #setStatistics(StatisticsContainer)
     * @see de.hub.clickwatch.model.ClickWatchModelPackage#getModelElementWithStatistics_Statistics()
     * @model containment="true" transient="true"
     * @generated
     */
    StatisticsContainer getStatistics();

    /**
     * Sets the value of the '{@link de.hub.clickwatch.model.ModelElementWithStatistics#getStatistics <em>Statistics</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Statistics</em>' containment reference.
     * @see #getStatistics()
     * @generated
     */
    void setStatistics(StatisticsContainer value);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model
     * @generated
     */
    Statistic getStatistics(String name);

} // ModelElementWithStatistics
