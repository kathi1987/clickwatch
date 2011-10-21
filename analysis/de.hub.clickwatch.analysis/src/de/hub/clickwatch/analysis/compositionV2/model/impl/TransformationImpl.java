/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.analysis.compositionV2.model.impl;

import de.hub.clickwatch.analysis.compositionV2.model.Compositemodelv2Package;
import de.hub.clickwatch.analysis.compositionV2.model.Transformation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transformation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.clickwatch.analysis.compositionV2.model.impl.TransformationImpl#getTransformationUri <em>Transformation Uri</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransformationImpl extends ActionNodeImpl implements Transformation {
	/**
	 * The default value of the '{@link #getTransformationUri() <em>Transformation Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformationUri()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSFORMATION_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransformationUri() <em>Transformation Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformationUri()
	 * @generated
	 * @ordered
	 */
	protected String transformationUri = TRANSFORMATION_URI_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Compositemodelv2Package.Literals.TRANSFORMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTransformationUri() {
		return transformationUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformationUri(String newTransformationUri) {
		String oldTransformationUri = transformationUri;
		transformationUri = newTransformationUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Compositemodelv2Package.TRANSFORMATION__TRANSFORMATION_URI, oldTransformationUri, transformationUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Compositemodelv2Package.TRANSFORMATION__TRANSFORMATION_URI:
				return getTransformationUri();
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
			case Compositemodelv2Package.TRANSFORMATION__TRANSFORMATION_URI:
				setTransformationUri((String)newValue);
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
			case Compositemodelv2Package.TRANSFORMATION__TRANSFORMATION_URI:
				setTransformationUri(TRANSFORMATION_URI_EDEFAULT);
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
			case Compositemodelv2Package.TRANSFORMATION__TRANSFORMATION_URI:
				return TRANSFORMATION_URI_EDEFAULT == null ? transformationUri != null : !TRANSFORMATION_URI_EDEFAULT.equals(transformationUri);
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
		result.append(" (transformationUri: ");
		result.append(transformationUri);
		result.append(')');
		return result.toString();
	}

} //TransformationImpl
