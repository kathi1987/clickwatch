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

import de.hub.clickwatch.analysis.results.Chart;
import de.hub.clickwatch.analysis.results.ChartType;
import de.hub.clickwatch.analysis.results.ResultsPackage;
import de.hub.clickwatch.analysis.results.ValueSpec;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chart</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.clickwatch.analysis.results.impl.ChartImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.hub.clickwatch.analysis.results.impl.ChartImpl#getValueSpecs <em>Value Specs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChartImpl extends NamedElementImpl implements Chart {
	/**
     * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
	protected ChartType type;

	/**
     * The cached value of the '{@link #getValueSpecs() <em>Value Specs</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getValueSpecs()
     * @generated
     * @ordered
     */
	protected EList<ValueSpec> valueSpecs;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected ChartImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return ResultsPackage.Literals.CHART;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ChartType getType() {
        return type;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetType(ChartType newType, NotificationChain msgs) {
        ChartType oldType = type;
        type = newType;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResultsPackage.CHART__TYPE, oldType, newType);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setType(ChartType newType) {
        if (newType != type) {
            NotificationChain msgs = null;
            if (type != null)
                msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResultsPackage.CHART__TYPE, null, msgs);
            if (newType != null)
                msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResultsPackage.CHART__TYPE, null, msgs);
            msgs = basicSetType(newType, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ResultsPackage.CHART__TYPE, newType, newType));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<ValueSpec> getValueSpecs() {
        if (valueSpecs == null) {
            valueSpecs = new EObjectContainmentEList<ValueSpec>(ValueSpec.class, this, ResultsPackage.CHART__VALUE_SPECS);
        }
        return valueSpecs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ResultsPackage.CHART__TYPE:
                return basicSetType(null, msgs);
            case ResultsPackage.CHART__VALUE_SPECS:
                return ((InternalEList<?>)getValueSpecs()).basicRemove(otherEnd, msgs);
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
            case ResultsPackage.CHART__TYPE:
                return getType();
            case ResultsPackage.CHART__VALUE_SPECS:
                return getValueSpecs();
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
            case ResultsPackage.CHART__TYPE:
                setType((ChartType)newValue);
                return;
            case ResultsPackage.CHART__VALUE_SPECS:
                getValueSpecs().clear();
                getValueSpecs().addAll((Collection<? extends ValueSpec>)newValue);
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
            case ResultsPackage.CHART__TYPE:
                setType((ChartType)null);
                return;
            case ResultsPackage.CHART__VALUE_SPECS:
                getValueSpecs().clear();
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
            case ResultsPackage.CHART__TYPE:
                return type != null;
            case ResultsPackage.CHART__VALUE_SPECS:
                return valueSpecs != null && !valueSpecs.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //ChartImpl
