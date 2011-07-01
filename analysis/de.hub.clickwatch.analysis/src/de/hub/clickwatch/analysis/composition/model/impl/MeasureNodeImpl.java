/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.analysis.composition.model.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.hub.clickwatch.analysis.composition.model.CompositionPackage;
import de.hub.clickwatch.analysis.composition.model.DataNode;
import de.hub.clickwatch.analysis.composition.model.Measure;
import de.hub.clickwatch.analysis.composition.model.MeasureNode;
import de.hub.clickwatch.analysis.composition.model.Visualization;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measure Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.clickwatch.analysis.composition.model.impl.MeasureNodeImpl#isHasData <em>Has Data</em>}</li>
 *   <li>{@link de.hub.clickwatch.analysis.composition.model.impl.MeasureNodeImpl#getVisualization <em>Visualization</em>}</li>
 *   <li>{@link de.hub.clickwatch.analysis.composition.model.impl.MeasureNodeImpl#getData <em>Data</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MeasureNodeImpl extends NodeImpl implements MeasureNode {
	/**
	 * The default value of the '{@link #isHasData() <em>Has Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasData()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_DATA_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isHasData() <em>Has Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasData()
	 * @generated
	 * @ordered
	 */
	protected boolean hasData = HAS_DATA_EDEFAULT;
	/**
	 * The cached value of the '{@link #getVisualization() <em>Visualization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisualization()
	 * @generated
	 * @ordered
	 */
	protected Visualization visualization;
	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected Measure data;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasureNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CompositionPackage.Literals.MEASURE_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHasData() {
		return hasData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasData(boolean newHasData) {
		boolean oldHasData = hasData;
		hasData = newHasData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompositionPackage.MEASURE_NODE__HAS_DATA, oldHasData, hasData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Visualization getVisualization() {
		return visualization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVisualization(Visualization newVisualization, NotificationChain msgs) {
		Visualization oldVisualization = visualization;
		visualization = newVisualization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CompositionPackage.MEASURE_NODE__VISUALIZATION, oldVisualization, newVisualization);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisualization(Visualization newVisualization) {
		if (newVisualization != visualization) {
			NotificationChain msgs = null;
			if (visualization != null)
				msgs = ((InternalEObject)visualization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CompositionPackage.MEASURE_NODE__VISUALIZATION, null, msgs);
			if (newVisualization != null)
				msgs = ((InternalEObject)newVisualization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CompositionPackage.MEASURE_NODE__VISUALIZATION, null, msgs);
			msgs = basicSetVisualization(newVisualization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompositionPackage.MEASURE_NODE__VISUALIZATION, newVisualization, newVisualization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Measure getData() {
		if (data != null && data.eIsProxy()) {
			InternalEObject oldData = (InternalEObject)data;
			data = (Measure)eResolveProxy(oldData);
			if (data != oldData) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CompositionPackage.MEASURE_NODE__DATA, oldData, data));
			}
		}
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Measure basicGetData() {
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setData(Measure newData) {
		Measure oldData = data;
		data = newData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompositionPackage.MEASURE_NODE__DATA, oldData, data));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CompositionPackage.MEASURE_NODE__VISUALIZATION:
				return basicSetVisualization(null, msgs);
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
			case CompositionPackage.MEASURE_NODE__HAS_DATA:
				return isHasData();
			case CompositionPackage.MEASURE_NODE__VISUALIZATION:
				return getVisualization();
			case CompositionPackage.MEASURE_NODE__DATA:
				if (resolve) return getData();
				return basicGetData();
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
			case CompositionPackage.MEASURE_NODE__HAS_DATA:
				setHasData((Boolean)newValue);
				return;
			case CompositionPackage.MEASURE_NODE__VISUALIZATION:
				setVisualization((Visualization)newValue);
				return;
			case CompositionPackage.MEASURE_NODE__DATA:
				setData((Measure)newValue);
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
			case CompositionPackage.MEASURE_NODE__HAS_DATA:
				setHasData(HAS_DATA_EDEFAULT);
				return;
			case CompositionPackage.MEASURE_NODE__VISUALIZATION:
				setVisualization((Visualization)null);
				return;
			case CompositionPackage.MEASURE_NODE__DATA:
				setData((Measure)null);
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
			case CompositionPackage.MEASURE_NODE__HAS_DATA:
				return hasData != HAS_DATA_EDEFAULT;
			case CompositionPackage.MEASURE_NODE__VISUALIZATION:
				return visualization != null;
			case CompositionPackage.MEASURE_NODE__DATA:
				return data != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == DataNode.class) {
			switch (derivedFeatureID) {
				case CompositionPackage.MEASURE_NODE__HAS_DATA: return CompositionPackage.DATA_NODE__HAS_DATA;
				case CompositionPackage.MEASURE_NODE__VISUALIZATION: return CompositionPackage.DATA_NODE__VISUALIZATION;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == DataNode.class) {
			switch (baseFeatureID) {
				case CompositionPackage.DATA_NODE__HAS_DATA: return CompositionPackage.MEASURE_NODE__HAS_DATA;
				case CompositionPackage.DATA_NODE__VISUALIZATION: return CompositionPackage.MEASURE_NODE__VISUALIZATION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (hasData: ");
		result.append(hasData);
		result.append(')');
		return result.toString();
	}

} //MeasureNodeImpl
