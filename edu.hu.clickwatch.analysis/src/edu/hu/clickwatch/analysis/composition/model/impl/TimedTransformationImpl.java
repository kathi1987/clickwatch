/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package edu.hu.clickwatch.analysis.composition.model.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import edu.hu.clickwatch.analysis.composition.model.CompositionPackage;
import edu.hu.clickwatch.analysis.composition.model.TimedTransformation;
import edu.hu.clickwatch.analysis.composition.model.Transformation;
import edu.hu.clickwatch.analysis.composition.model.TransformationKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timed Transformation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.hu.clickwatch.analysis.composition.model.impl.TimedTransformationImpl#getTransformationUri <em>Transformation Uri</em>}</li>
 *   <li>{@link edu.hu.clickwatch.analysis.composition.model.impl.TimedTransformationImpl#getTransformationFunction <em>Transformation Function</em>}</li>
 *   <li>{@link edu.hu.clickwatch.analysis.composition.model.impl.TimedTransformationImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link edu.hu.clickwatch.analysis.composition.model.impl.TimedTransformationImpl#getPredefinedTransformation <em>Predefined Transformation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimedTransformationImpl extends EdgeImpl implements TimedTransformation {
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
	 * The default value of the '{@link #getTransformationFunction() <em>Transformation Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformationFunction()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSFORMATION_FUNCTION_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getTransformationFunction() <em>Transformation Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformationFunction()
	 * @generated
	 * @ordered
	 */
	protected String transformationFunction = TRANSFORMATION_FUNCTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final TransformationKind KIND_EDEFAULT = TransformationKind.PREDEFINED;
	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected TransformationKind kind = KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getPredefinedTransformation() <em>Predefined Transformation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredefinedTransformation()
	 * @generated
	 * @ordered
	 */
	protected static final String PREDEFINED_TRANSFORMATION_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPredefinedTransformation() <em>Predefined Transformation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredefinedTransformation()
	 * @generated
	 * @ordered
	 */
	protected String predefinedTransformation = PREDEFINED_TRANSFORMATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimedTransformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CompositionPackage.Literals.TIMED_TRANSFORMATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CompositionPackage.TIMED_TRANSFORMATION__TRANSFORMATION_URI, oldTransformationUri, transformationUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTransformationFunction() {
		return transformationFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformationFunction(String newTransformationFunction) {
		String oldTransformationFunction = transformationFunction;
		transformationFunction = newTransformationFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompositionPackage.TIMED_TRANSFORMATION__TRANSFORMATION_FUNCTION, oldTransformationFunction, transformationFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformationKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(TransformationKind newKind) {
		TransformationKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompositionPackage.TIMED_TRANSFORMATION__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPredefinedTransformation() {
		return predefinedTransformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPredefinedTransformation(String newPredefinedTransformation) {
		String oldPredefinedTransformation = predefinedTransformation;
		predefinedTransformation = newPredefinedTransformation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompositionPackage.TIMED_TRANSFORMATION__PREDEFINED_TRANSFORMATION, oldPredefinedTransformation, predefinedTransformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CompositionPackage.TIMED_TRANSFORMATION__TRANSFORMATION_URI:
				return getTransformationUri();
			case CompositionPackage.TIMED_TRANSFORMATION__TRANSFORMATION_FUNCTION:
				return getTransformationFunction();
			case CompositionPackage.TIMED_TRANSFORMATION__KIND:
				return getKind();
			case CompositionPackage.TIMED_TRANSFORMATION__PREDEFINED_TRANSFORMATION:
				return getPredefinedTransformation();
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
			case CompositionPackage.TIMED_TRANSFORMATION__TRANSFORMATION_URI:
				setTransformationUri((String)newValue);
				return;
			case CompositionPackage.TIMED_TRANSFORMATION__TRANSFORMATION_FUNCTION:
				setTransformationFunction((String)newValue);
				return;
			case CompositionPackage.TIMED_TRANSFORMATION__KIND:
				setKind((TransformationKind)newValue);
				return;
			case CompositionPackage.TIMED_TRANSFORMATION__PREDEFINED_TRANSFORMATION:
				setPredefinedTransformation((String)newValue);
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
			case CompositionPackage.TIMED_TRANSFORMATION__TRANSFORMATION_URI:
				setTransformationUri(TRANSFORMATION_URI_EDEFAULT);
				return;
			case CompositionPackage.TIMED_TRANSFORMATION__TRANSFORMATION_FUNCTION:
				setTransformationFunction(TRANSFORMATION_FUNCTION_EDEFAULT);
				return;
			case CompositionPackage.TIMED_TRANSFORMATION__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case CompositionPackage.TIMED_TRANSFORMATION__PREDEFINED_TRANSFORMATION:
				setPredefinedTransformation(PREDEFINED_TRANSFORMATION_EDEFAULT);
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
			case CompositionPackage.TIMED_TRANSFORMATION__TRANSFORMATION_URI:
				return TRANSFORMATION_URI_EDEFAULT == null ? transformationUri != null : !TRANSFORMATION_URI_EDEFAULT.equals(transformationUri);
			case CompositionPackage.TIMED_TRANSFORMATION__TRANSFORMATION_FUNCTION:
				return TRANSFORMATION_FUNCTION_EDEFAULT == null ? transformationFunction != null : !TRANSFORMATION_FUNCTION_EDEFAULT.equals(transformationFunction);
			case CompositionPackage.TIMED_TRANSFORMATION__KIND:
				return kind != KIND_EDEFAULT;
			case CompositionPackage.TIMED_TRANSFORMATION__PREDEFINED_TRANSFORMATION:
				return PREDEFINED_TRANSFORMATION_EDEFAULT == null ? predefinedTransformation != null : !PREDEFINED_TRANSFORMATION_EDEFAULT.equals(predefinedTransformation);
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
		if (baseClass == Transformation.class) {
			switch (derivedFeatureID) {
				case CompositionPackage.TIMED_TRANSFORMATION__TRANSFORMATION_URI: return CompositionPackage.TRANSFORMATION__TRANSFORMATION_URI;
				case CompositionPackage.TIMED_TRANSFORMATION__TRANSFORMATION_FUNCTION: return CompositionPackage.TRANSFORMATION__TRANSFORMATION_FUNCTION;
				case CompositionPackage.TIMED_TRANSFORMATION__KIND: return CompositionPackage.TRANSFORMATION__KIND;
				case CompositionPackage.TIMED_TRANSFORMATION__PREDEFINED_TRANSFORMATION: return CompositionPackage.TRANSFORMATION__PREDEFINED_TRANSFORMATION;
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
		if (baseClass == Transformation.class) {
			switch (baseFeatureID) {
				case CompositionPackage.TRANSFORMATION__TRANSFORMATION_URI: return CompositionPackage.TIMED_TRANSFORMATION__TRANSFORMATION_URI;
				case CompositionPackage.TRANSFORMATION__TRANSFORMATION_FUNCTION: return CompositionPackage.TIMED_TRANSFORMATION__TRANSFORMATION_FUNCTION;
				case CompositionPackage.TRANSFORMATION__KIND: return CompositionPackage.TIMED_TRANSFORMATION__KIND;
				case CompositionPackage.TRANSFORMATION__PREDEFINED_TRANSFORMATION: return CompositionPackage.TIMED_TRANSFORMATION__PREDEFINED_TRANSFORMATION;
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
		result.append(" (transformationUri: ");
		result.append(transformationUri);
		result.append(", transformationFunction: ");
		result.append(transformationFunction);
		result.append(", kind: ");
		result.append(kind);
		result.append(", predefinedTransformation: ");
		result.append(predefinedTransformation);
		result.append(')');
		return result.toString();
	}

} //TimedTransformationImpl
