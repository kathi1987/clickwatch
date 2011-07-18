/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.xml.impl;


import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.hub.clickwatch.xml.ConfigurationPackage;
import de.hub.clickwatch.xml.ExperimentListType;
import de.hub.clickwatch.xml.ExperimentType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Experiment List Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Configuration.impl.ExperimentListTypeImpl#getExperiment <em>Experiment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExperimentListTypeImpl extends EObjectImpl implements ExperimentListType {
	/**
	 * The cached value of the '{@link #getExperiment() <em>Experiment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExperiment()
	 * @generated
	 * @ordered
	 */
	protected EList<ExperimentType> experiment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExperimentListTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigurationPackage.Literals.EXPERIMENT_LIST_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExperimentType> getExperiment() {
		if (experiment == null) {
			experiment = new EObjectContainmentEList<ExperimentType>(ExperimentType.class, this, ConfigurationPackage.EXPERIMENT_LIST_TYPE__EXPERIMENT);
		}
		return experiment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConfigurationPackage.EXPERIMENT_LIST_TYPE__EXPERIMENT:
				return ((InternalEList<?>)getExperiment()).basicRemove(otherEnd, msgs);
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
			case ConfigurationPackage.EXPERIMENT_LIST_TYPE__EXPERIMENT:
				return getExperiment();
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
			case ConfigurationPackage.EXPERIMENT_LIST_TYPE__EXPERIMENT:
				getExperiment().clear();
				getExperiment().addAll((Collection<? extends ExperimentType>)newValue);
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
			case ConfigurationPackage.EXPERIMENT_LIST_TYPE__EXPERIMENT:
				getExperiment().clear();
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
			case ConfigurationPackage.EXPERIMENT_LIST_TYPE__EXPERIMENT:
				return experiment != null && !experiment.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ExperimentListTypeImpl
