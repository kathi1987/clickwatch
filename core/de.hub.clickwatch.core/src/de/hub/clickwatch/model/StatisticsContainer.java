/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.model;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statistics Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.model.StatisticsContainer#getStatistics <em>Statistics</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.model.ClickWatchModelPackage#getStatisticsContainer()
 * @model
 * @generated
 */
public interface StatisticsContainer extends EObject {
    /**
     * Returns the value of the '<em><b>Statistics</b></em>' map.
     * The key is of type {@link java.lang.String},
     * and the value is of type {@link de.hub.clickwatch.model.Statistic},
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Statistics</em>' map.
     * @see de.hub.clickwatch.model.ClickWatchModelPackage#getStatisticsContainer_Statistics()
     * @model mapType="de.hub.clickwatch.model.EStringToStatisticMap<org.eclipse.emf.ecore.EString, de.hub.clickwatch.model.Statistic>"
     * @generated
     */
    EMap<String, Statistic> getStatistics();

} // StatisticsContainer
