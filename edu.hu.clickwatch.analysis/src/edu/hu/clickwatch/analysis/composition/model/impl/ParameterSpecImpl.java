/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package edu.hu.clickwatch.analysis.composition.model.impl;

import edu.hu.clickwatch.analysis.composition.model.CompositionPackage;
import edu.hu.clickwatch.analysis.composition.model.ParameterSpec;
import edu.hu.clickwatch.analysis.composition.model.ParameterSpecKind;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Spec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.hu.clickwatch.analysis.composition.model.impl.ParameterSpecImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link edu.hu.clickwatch.analysis.composition.model.impl.ParameterSpecImpl#getMapClassKey <em>Map Class Key</em>}</li>
 *   <li>{@link edu.hu.clickwatch.analysis.composition.model.impl.ParameterSpecImpl#getListQuery <em>List Query</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParameterSpecImpl extends EObjectImpl implements ParameterSpec {
	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final ParameterSpecKind KIND_EDEFAULT = ParameterSpecKind.ROOT;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected ParameterSpecKind kind = KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getMapClassKey() <em>Map Class Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapClassKey()
	 * @generated
	 * @ordered
	 */
	protected static final String MAP_CLASS_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMapClassKey() <em>Map Class Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapClassKey()
	 * @generated
	 * @ordered
	 */
	protected String mapClassKey = MAP_CLASS_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getListQuery() <em>List Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListQuery()
	 * @generated
	 * @ordered
	 */
	protected static final String LIST_QUERY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getListQuery() <em>List Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListQuery()
	 * @generated
	 * @ordered
	 */
	protected String listQuery = LIST_QUERY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterSpecImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CompositionPackage.Literals.PARAMETER_SPEC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterSpecKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(ParameterSpecKind newKind) {
		ParameterSpecKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompositionPackage.PARAMETER_SPEC__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMapClassKey() {
		return mapClassKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMapClassKey(String newMapClassKey) {
		String oldMapClassKey = mapClassKey;
		mapClassKey = newMapClassKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompositionPackage.PARAMETER_SPEC__MAP_CLASS_KEY, oldMapClassKey, mapClassKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getListQuery() {
		return listQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListQuery(String newListQuery) {
		String oldListQuery = listQuery;
		listQuery = newListQuery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompositionPackage.PARAMETER_SPEC__LIST_QUERY, oldListQuery, listQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CompositionPackage.PARAMETER_SPEC__KIND:
				return getKind();
			case CompositionPackage.PARAMETER_SPEC__MAP_CLASS_KEY:
				return getMapClassKey();
			case CompositionPackage.PARAMETER_SPEC__LIST_QUERY:
				return getListQuery();
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
			case CompositionPackage.PARAMETER_SPEC__KIND:
				setKind((ParameterSpecKind)newValue);
				return;
			case CompositionPackage.PARAMETER_SPEC__MAP_CLASS_KEY:
				setMapClassKey((String)newValue);
				return;
			case CompositionPackage.PARAMETER_SPEC__LIST_QUERY:
				setListQuery((String)newValue);
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
			case CompositionPackage.PARAMETER_SPEC__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case CompositionPackage.PARAMETER_SPEC__MAP_CLASS_KEY:
				setMapClassKey(MAP_CLASS_KEY_EDEFAULT);
				return;
			case CompositionPackage.PARAMETER_SPEC__LIST_QUERY:
				setListQuery(LIST_QUERY_EDEFAULT);
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
			case CompositionPackage.PARAMETER_SPEC__KIND:
				return kind != KIND_EDEFAULT;
			case CompositionPackage.PARAMETER_SPEC__MAP_CLASS_KEY:
				return MAP_CLASS_KEY_EDEFAULT == null ? mapClassKey != null : !MAP_CLASS_KEY_EDEFAULT.equals(mapClassKey);
			case CompositionPackage.PARAMETER_SPEC__LIST_QUERY:
				return LIST_QUERY_EDEFAULT == null ? listQuery != null : !LIST_QUERY_EDEFAULT.equals(listQuery);
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
		result.append(" (kind: ");
		result.append(kind);
		result.append(", mapClassKey: ");
		result.append(mapClassKey);
		result.append(", listQuery: ");
		result.append(listQuery);
		result.append(')');
		return result.toString();
	}

} //ParameterSpecImpl
