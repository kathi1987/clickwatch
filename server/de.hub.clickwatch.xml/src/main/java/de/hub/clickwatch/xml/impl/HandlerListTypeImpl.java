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
import de.hub.clickwatch.xml.HandlerListType;
import de.hub.clickwatch.xml.HandlerType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Handler List Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.clickwatch.xml.impl.HandlerListTypeImpl#getHandler <em>Handler</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HandlerListTypeImpl extends EObjectImpl implements HandlerListType {
	/**
	 * The cached value of the '{@link #getHandler() <em>Handler</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandler()
	 * @generated
	 * @ordered
	 */
	protected EList<HandlerType> handler;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HandlerListTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return de.hub.clickwatch.xml.ConfigurationPackage.Literals.HANDLER_LIST_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HandlerType> getHandler() {
		if (handler == null) {
			handler = new EObjectContainmentEList<HandlerType>(HandlerType.class, this, ConfigurationPackage.HANDLER_LIST_TYPE__HANDLER);
		}
		return handler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConfigurationPackage.HANDLER_LIST_TYPE__HANDLER:
				return ((InternalEList<?>)getHandler()).basicRemove(otherEnd, msgs);
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
			case ConfigurationPackage.HANDLER_LIST_TYPE__HANDLER:
				return getHandler();
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
			case ConfigurationPackage.HANDLER_LIST_TYPE__HANDLER:
				getHandler().clear();
				getHandler().addAll((Collection<? extends HandlerType>)newValue);
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
			case ConfigurationPackage.HANDLER_LIST_TYPE__HANDLER:
				getHandler().clear();
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
			case ConfigurationPackage.HANDLER_LIST_TYPE__HANDLER:
				return handler != null && !handler.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //HandlerListTypeImpl
