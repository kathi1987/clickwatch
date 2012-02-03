/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.datamodel;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statistics Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.datamodel.StatisticsContainer#getStatistics <em>Statistics</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.datamodel.ClickWatchDataModelPackage#getStatisticsContainer()
 * @model
 * @generated
 */
public interface StatisticsContainer extends EObject {
    /**
	 * Returns the value of the '<em><b>Statistics</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link de.hub.clickwatch.datamodel.Statistic},
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Statistics</em>' map.
	 * @see de.hub.clickwatch.datamodel.ClickWatchDataModelPackage#getStatisticsContainer_Statistics()
	 * @model mapType="de.hub.clickwatch.datamodel.EStringToStatisticMap<org.eclipse.emf.ecore.EString, de.hub.clickwatch.datamodel.Statistic>"
	 * @generated
	 */
    EMap<String, Statistic> getStatistics();

} // StatisticsContainer
