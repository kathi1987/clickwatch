/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.analysis.activity_composition.model.impl;

import de.hub.clickwatch.analysis.activity_composition.model.ActionNode;
import de.hub.clickwatch.analysis.activity_composition.model.ModelPackage;
import de.hub.clickwatch.analysis.activity_composition.model.ProgressEdge;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.clickwatch.analysis.activity_composition.model.impl.ActionNodeImpl#getProgressConnection <em>Progress Connection</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActionNodeImpl extends NodeImpl implements ActionNode {
	/**
	 * The cached value of the '{@link #getProgressConnection() <em>Progress Connection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgressConnection()
	 * @generated
	 * @ordered
	 */
	protected ProgressEdge progressConnection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.ACTION_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgressEdge getProgressConnection() {
		if (progressConnection != null && progressConnection.eIsProxy()) {
			InternalEObject oldProgressConnection = (InternalEObject)progressConnection;
			progressConnection = (ProgressEdge)eResolveProxy(oldProgressConnection);
			if (progressConnection != oldProgressConnection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.ACTION_NODE__PROGRESS_CONNECTION, oldProgressConnection, progressConnection));
			}
		}
		return progressConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgressEdge basicGetProgressConnection() {
		return progressConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProgressConnection(ProgressEdge newProgressConnection) {
		ProgressEdge oldProgressConnection = progressConnection;
		progressConnection = newProgressConnection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ACTION_NODE__PROGRESS_CONNECTION, oldProgressConnection, progressConnection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.ACTION_NODE__PROGRESS_CONNECTION:
				if (resolve) return getProgressConnection();
				return basicGetProgressConnection();
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
			case ModelPackage.ACTION_NODE__PROGRESS_CONNECTION:
				setProgressConnection((ProgressEdge)newValue);
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
			case ModelPackage.ACTION_NODE__PROGRESS_CONNECTION:
				setProgressConnection((ProgressEdge)null);
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
			case ModelPackage.ACTION_NODE__PROGRESS_CONNECTION:
				return progressConnection != null;
		}
		return super.eIsSet(featureID);
	}

} //ActionNodeImpl
