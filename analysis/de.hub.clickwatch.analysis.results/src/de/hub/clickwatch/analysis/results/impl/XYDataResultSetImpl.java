/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.analysis.results.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.hub.clickwatch.analysis.results.DataResultValue;
import de.hub.clickwatch.analysis.results.ResultsPackage;
import de.hub.clickwatch.analysis.results.XYDataResultSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XY Data Result Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.clickwatch.analysis.results.impl.XYDataResultSetImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.hub.clickwatch.analysis.results.impl.XYDataResultSetImpl#getXValues <em>XValues</em>}</li>
 *   <li>{@link de.hub.clickwatch.analysis.results.impl.XYDataResultSetImpl#getYValues <em>YValues</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class XYDataResultSetImpl extends DataResultSetImpl implements XYDataResultSet {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getXValues() <em>XValues</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXValues()
	 * @generated
	 * @ordered
	 */
	protected EList<DataResultValue> xValues;

	/**
	 * The cached value of the '{@link #getYValues() <em>YValues</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYValues()
	 * @generated
	 * @ordered
	 */
	protected EList<DataResultValue> yValues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XYDataResultSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResultsPackage.Literals.XY_DATA_RESULT_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultsPackage.XY_DATA_RESULT_SET__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataResultValue> getXValues() {
		if (xValues == null) {
			xValues = new EObjectContainmentEList<DataResultValue>(DataResultValue.class, this, ResultsPackage.XY_DATA_RESULT_SET__XVALUES);
		}
		return xValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataResultValue> getYValues() {
		if (yValues == null) {
			yValues = new EObjectContainmentEList<DataResultValue>(DataResultValue.class, this, ResultsPackage.XY_DATA_RESULT_SET__YVALUES);
		}
		return yValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResultsPackage.XY_DATA_RESULT_SET__XVALUES:
				return ((InternalEList<?>)getXValues()).basicRemove(otherEnd, msgs);
			case ResultsPackage.XY_DATA_RESULT_SET__YVALUES:
				return ((InternalEList<?>)getYValues()).basicRemove(otherEnd, msgs);
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
			case ResultsPackage.XY_DATA_RESULT_SET__NAME:
				return getName();
			case ResultsPackage.XY_DATA_RESULT_SET__XVALUES:
				return getXValues();
			case ResultsPackage.XY_DATA_RESULT_SET__YVALUES:
				return getYValues();
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
			case ResultsPackage.XY_DATA_RESULT_SET__NAME:
				setName((String)newValue);
				return;
			case ResultsPackage.XY_DATA_RESULT_SET__XVALUES:
				getXValues().clear();
				getXValues().addAll((Collection<? extends DataResultValue>)newValue);
				return;
			case ResultsPackage.XY_DATA_RESULT_SET__YVALUES:
				getYValues().clear();
				getYValues().addAll((Collection<? extends DataResultValue>)newValue);
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
			case ResultsPackage.XY_DATA_RESULT_SET__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ResultsPackage.XY_DATA_RESULT_SET__XVALUES:
				getXValues().clear();
				return;
			case ResultsPackage.XY_DATA_RESULT_SET__YVALUES:
				getYValues().clear();
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
			case ResultsPackage.XY_DATA_RESULT_SET__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ResultsPackage.XY_DATA_RESULT_SET__XVALUES:
				return xValues != null && !xValues.isEmpty();
			case ResultsPackage.XY_DATA_RESULT_SET__YVALUES:
				return yValues != null && !yValues.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //XYDataResultSetImpl
