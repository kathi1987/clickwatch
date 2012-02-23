/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.analysis.traceable.impl;

import de.hub.clickwatch.analysis.traceable.Traceable;
import de.hub.clickwatch.analysis.traceable.TraceablePackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traceable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.clickwatch.analysis.traceable.impl.TraceableImpl#getTracesFrom <em>Traces From</em>}</li>
 *   <li>{@link de.hub.clickwatch.analysis.traceable.impl.TraceableImpl#getTracesTo <em>Traces To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TraceableImpl extends EObjectImpl implements Traceable {
	/**
	 * The cached value of the '{@link #getTracesFrom() <em>Traces From</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTracesFrom()
	 * @generated
	 * @ordered
	 */
	protected EList<Traceable> tracesFrom;

	/**
	 * The cached value of the '{@link #getTracesTo() <em>Traces To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTracesTo()
	 * @generated
	 * @ordered
	 */
	protected EList<Traceable> tracesTo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TraceableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TraceablePackage.Literals.TRACEABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Traceable> getTracesFrom() {
		if (tracesFrom == null) {
			tracesFrom = new EObjectResolvingEList<Traceable>(Traceable.class, this, TraceablePackage.TRACEABLE__TRACES_FROM);
		}
		return tracesFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Traceable> getTracesTo() {
		if (tracesTo == null) {
			tracesTo = new EObjectResolvingEList<Traceable>(Traceable.class, this, TraceablePackage.TRACEABLE__TRACES_TO);
		}
		return tracesTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TraceablePackage.TRACEABLE__TRACES_FROM:
				return getTracesFrom();
			case TraceablePackage.TRACEABLE__TRACES_TO:
				return getTracesTo();
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
			case TraceablePackage.TRACEABLE__TRACES_FROM:
				getTracesFrom().clear();
				getTracesFrom().addAll((Collection<? extends Traceable>)newValue);
				return;
			case TraceablePackage.TRACEABLE__TRACES_TO:
				getTracesTo().clear();
				getTracesTo().addAll((Collection<? extends Traceable>)newValue);
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
			case TraceablePackage.TRACEABLE__TRACES_FROM:
				getTracesFrom().clear();
				return;
			case TraceablePackage.TRACEABLE__TRACES_TO:
				getTracesTo().clear();
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
			case TraceablePackage.TRACEABLE__TRACES_FROM:
				return tracesFrom != null && !tracesFrom.isEmpty();
			case TraceablePackage.TRACEABLE__TRACES_TO:
				return tracesTo != null && !tracesTo.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TraceableImpl
