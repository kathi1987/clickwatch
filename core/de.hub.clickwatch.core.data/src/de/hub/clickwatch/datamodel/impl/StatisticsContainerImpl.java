/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.datamodel.impl;

import de.hub.clickwatch.datamodel.ClickWatchDataModelPackage;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

import de.hub.clickwatch.datamodel.ClickWatchModelPackage;
import de.hub.clickwatch.datamodel.Statistic;
import de.hub.clickwatch.datamodel.StatisticsContainer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Statistics Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.clickwatch.datamodel.impl.StatisticsContainerImpl#getStatistics <em>Statistics</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StatisticsContainerImpl extends EObjectImpl implements StatisticsContainer {
    
    /**
	 * The cached value of the '{@link #getStatistics() <em>Statistics</em>}' map.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getStatistics()
	 * @generated
	 * @ordered
	 */
    protected EMap<String, Statistic> statistics;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected StatisticsContainerImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return ClickWatchDataModelPackage.Literals.STATISTICS_CONTAINER;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EMap<String, Statistic> getStatistics() {
		if (statistics == null) {
			statistics = new EcoreEMap<String,Statistic>(ClickWatchDataModelPackage.Literals.ESTRING_TO_STATISTIC_MAP, EStringToStatisticMapImpl.class, this, ClickWatchDataModelPackage.STATISTICS_CONTAINER__STATISTICS);
		}
		return statistics;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ClickWatchDataModelPackage.STATISTICS_CONTAINER__STATISTICS:
				return ((InternalEList<?>)getStatistics()).basicRemove(otherEnd, msgs);
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
			case ClickWatchDataModelPackage.STATISTICS_CONTAINER__STATISTICS:
				if (coreType) return getStatistics();
				else return getStatistics().map();
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
			case ClickWatchDataModelPackage.STATISTICS_CONTAINER__STATISTICS:
				((EStructuralFeature.Setting)getStatistics()).set(newValue);
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
			case ClickWatchDataModelPackage.STATISTICS_CONTAINER__STATISTICS:
				getStatistics().clear();
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
			case ClickWatchDataModelPackage.STATISTICS_CONTAINER__STATISTICS:
				return statistics != null && !statistics.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StatisticsContainerImpl
