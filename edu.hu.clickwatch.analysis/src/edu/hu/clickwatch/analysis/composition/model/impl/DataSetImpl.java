/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package edu.hu.clickwatch.analysis.composition.model.impl;

import edu.hu.clickwatch.analysis.composition.model.CompositionPackage;
import edu.hu.clickwatch.analysis.composition.model.DataSet;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.hu.clickwatch.analysis.composition.model.impl.DataSetImpl#getIntValues <em>Int Values</em>}</li>
 *   <li>{@link edu.hu.clickwatch.analysis.composition.model.impl.DataSetImpl#getDoubleValues <em>Double Values</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataSetImpl extends EObjectImpl implements DataSet {
	/**
	 * The cached value of the '{@link #getIntValues() <em>Int Values</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntValues()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> intValues;

	/**
	 * The cached value of the '{@link #getDoubleValues() <em>Double Values</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoubleValues()
	 * @generated
	 * @ordered
	 */
	protected EList<Double> doubleValues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CompositionPackage.Literals.DATA_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getIntValues() {
		if (intValues == null) {
			intValues = new EDataTypeUniqueEList<Integer>(Integer.class, this, CompositionPackage.DATA_SET__INT_VALUES);
		}
		return intValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Double> getDoubleValues() {
		if (doubleValues == null) {
			doubleValues = new EDataTypeUniqueEList<Double>(Double.class, this, CompositionPackage.DATA_SET__DOUBLE_VALUES);
		}
		return doubleValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CompositionPackage.DATA_SET__INT_VALUES:
				return getIntValues();
			case CompositionPackage.DATA_SET__DOUBLE_VALUES:
				return getDoubleValues();
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
			case CompositionPackage.DATA_SET__INT_VALUES:
				getIntValues().clear();
				getIntValues().addAll((Collection<? extends Integer>)newValue);
				return;
			case CompositionPackage.DATA_SET__DOUBLE_VALUES:
				getDoubleValues().clear();
				getDoubleValues().addAll((Collection<? extends Double>)newValue);
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
			case CompositionPackage.DATA_SET__INT_VALUES:
				getIntValues().clear();
				return;
			case CompositionPackage.DATA_SET__DOUBLE_VALUES:
				getDoubleValues().clear();
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
			case CompositionPackage.DATA_SET__INT_VALUES:
				return intValues != null && !intValues.isEmpty();
			case CompositionPackage.DATA_SET__DOUBLE_VALUES:
				return doubleValues != null && !doubleValues.isEmpty();
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
		result.append(" (intValues: ");
		result.append(intValues);
		result.append(", doubleValues: ");
		result.append(doubleValues);
		result.append(')');
		return result.toString();
	}

} //DataSetImpl
