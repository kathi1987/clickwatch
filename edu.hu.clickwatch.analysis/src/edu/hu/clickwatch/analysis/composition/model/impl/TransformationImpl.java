/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package edu.hu.clickwatch.analysis.composition.model.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import edu.hu.clickwatch.analysis.composition.model.CompositionPackage;
import edu.hu.clickwatch.analysis.composition.model.ParameterSpec;
import edu.hu.clickwatch.analysis.composition.model.TargetSpec;
import edu.hu.clickwatch.analysis.composition.model.Transformation;
import edu.hu.clickwatch.analysis.composition.model.TransformationKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transformation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.hu.clickwatch.analysis.composition.model.impl.TransformationImpl#getTransformationUri <em>Transformation Uri</em>}</li>
 *   <li>{@link edu.hu.clickwatch.analysis.composition.model.impl.TransformationImpl#getTransformationFunction <em>Transformation Function</em>}</li>
 *   <li>{@link edu.hu.clickwatch.analysis.composition.model.impl.TransformationImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link edu.hu.clickwatch.analysis.composition.model.impl.TransformationImpl#getPredefinedTransformation <em>Predefined Transformation</em>}</li>
 *   <li>{@link edu.hu.clickwatch.analysis.composition.model.impl.TransformationImpl#getInput <em>Input</em>}</li>
 *   <li>{@link edu.hu.clickwatch.analysis.composition.model.impl.TransformationImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link edu.hu.clickwatch.analysis.composition.model.impl.TransformationImpl#getTargetSpec <em>Target Spec</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransformationImpl extends EdgeImpl implements Transformation {
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
	 * The cached value of the '{@link #getInput() <em>Input</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected ParameterSpec input;
	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected ParameterSpec output;
	/**
	 * The default value of the '{@link #getTargetSpec() <em>Target Spec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetSpec()
	 * @generated
	 * @ordered
	 */
	protected static final TargetSpec TARGET_SPEC_EDEFAULT = TargetSpec.ADD;
	/**
	 * The cached value of the '{@link #getTargetSpec() <em>Target Spec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetSpec()
	 * @generated
	 * @ordered
	 */
	protected TargetSpec targetSpec = TARGET_SPEC_EDEFAULT;

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
		return CompositionPackage.Literals.TRANSFORMATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CompositionPackage.TRANSFORMATION__TRANSFORMATION_URI, oldTransformationUri, transformationUri));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CompositionPackage.TRANSFORMATION__TRANSFORMATION_FUNCTION, oldTransformationFunction, transformationFunction));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CompositionPackage.TRANSFORMATION__KIND, oldKind, kind));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CompositionPackage.TRANSFORMATION__PREDEFINED_TRANSFORMATION, oldPredefinedTransformation, predefinedTransformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterSpec getInput() {
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInput(ParameterSpec newInput, NotificationChain msgs) {
		ParameterSpec oldInput = input;
		input = newInput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CompositionPackage.TRANSFORMATION__INPUT, oldInput, newInput);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput(ParameterSpec newInput) {
		if (newInput != input) {
			NotificationChain msgs = null;
			if (input != null)
				msgs = ((InternalEObject)input).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CompositionPackage.TRANSFORMATION__INPUT, null, msgs);
			if (newInput != null)
				msgs = ((InternalEObject)newInput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CompositionPackage.TRANSFORMATION__INPUT, null, msgs);
			msgs = basicSetInput(newInput, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompositionPackage.TRANSFORMATION__INPUT, newInput, newInput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterSpec getOutput() {
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutput(ParameterSpec newOutput, NotificationChain msgs) {
		ParameterSpec oldOutput = output;
		output = newOutput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CompositionPackage.TRANSFORMATION__OUTPUT, oldOutput, newOutput);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput(ParameterSpec newOutput) {
		if (newOutput != output) {
			NotificationChain msgs = null;
			if (output != null)
				msgs = ((InternalEObject)output).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CompositionPackage.TRANSFORMATION__OUTPUT, null, msgs);
			if (newOutput != null)
				msgs = ((InternalEObject)newOutput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CompositionPackage.TRANSFORMATION__OUTPUT, null, msgs);
			msgs = basicSetOutput(newOutput, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompositionPackage.TRANSFORMATION__OUTPUT, newOutput, newOutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetSpec getTargetSpec() {
		return targetSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetSpec(TargetSpec newTargetSpec) {
		TargetSpec oldTargetSpec = targetSpec;
		targetSpec = newTargetSpec == null ? TARGET_SPEC_EDEFAULT : newTargetSpec;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompositionPackage.TRANSFORMATION__TARGET_SPEC, oldTargetSpec, targetSpec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CompositionPackage.TRANSFORMATION__INPUT:
				return basicSetInput(null, msgs);
			case CompositionPackage.TRANSFORMATION__OUTPUT:
				return basicSetOutput(null, msgs);
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
			case CompositionPackage.TRANSFORMATION__TRANSFORMATION_URI:
				return getTransformationUri();
			case CompositionPackage.TRANSFORMATION__TRANSFORMATION_FUNCTION:
				return getTransformationFunction();
			case CompositionPackage.TRANSFORMATION__KIND:
				return getKind();
			case CompositionPackage.TRANSFORMATION__PREDEFINED_TRANSFORMATION:
				return getPredefinedTransformation();
			case CompositionPackage.TRANSFORMATION__INPUT:
				return getInput();
			case CompositionPackage.TRANSFORMATION__OUTPUT:
				return getOutput();
			case CompositionPackage.TRANSFORMATION__TARGET_SPEC:
				return getTargetSpec();
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
			case CompositionPackage.TRANSFORMATION__TRANSFORMATION_URI:
				setTransformationUri((String)newValue);
				return;
			case CompositionPackage.TRANSFORMATION__TRANSFORMATION_FUNCTION:
				setTransformationFunction((String)newValue);
				return;
			case CompositionPackage.TRANSFORMATION__KIND:
				setKind((TransformationKind)newValue);
				return;
			case CompositionPackage.TRANSFORMATION__PREDEFINED_TRANSFORMATION:
				setPredefinedTransformation((String)newValue);
				return;
			case CompositionPackage.TRANSFORMATION__INPUT:
				setInput((ParameterSpec)newValue);
				return;
			case CompositionPackage.TRANSFORMATION__OUTPUT:
				setOutput((ParameterSpec)newValue);
				return;
			case CompositionPackage.TRANSFORMATION__TARGET_SPEC:
				setTargetSpec((TargetSpec)newValue);
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
			case CompositionPackage.TRANSFORMATION__TRANSFORMATION_URI:
				setTransformationUri(TRANSFORMATION_URI_EDEFAULT);
				return;
			case CompositionPackage.TRANSFORMATION__TRANSFORMATION_FUNCTION:
				setTransformationFunction(TRANSFORMATION_FUNCTION_EDEFAULT);
				return;
			case CompositionPackage.TRANSFORMATION__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case CompositionPackage.TRANSFORMATION__PREDEFINED_TRANSFORMATION:
				setPredefinedTransformation(PREDEFINED_TRANSFORMATION_EDEFAULT);
				return;
			case CompositionPackage.TRANSFORMATION__INPUT:
				setInput((ParameterSpec)null);
				return;
			case CompositionPackage.TRANSFORMATION__OUTPUT:
				setOutput((ParameterSpec)null);
				return;
			case CompositionPackage.TRANSFORMATION__TARGET_SPEC:
				setTargetSpec(TARGET_SPEC_EDEFAULT);
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
			case CompositionPackage.TRANSFORMATION__TRANSFORMATION_URI:
				return TRANSFORMATION_URI_EDEFAULT == null ? transformationUri != null : !TRANSFORMATION_URI_EDEFAULT.equals(transformationUri);
			case CompositionPackage.TRANSFORMATION__TRANSFORMATION_FUNCTION:
				return TRANSFORMATION_FUNCTION_EDEFAULT == null ? transformationFunction != null : !TRANSFORMATION_FUNCTION_EDEFAULT.equals(transformationFunction);
			case CompositionPackage.TRANSFORMATION__KIND:
				return kind != KIND_EDEFAULT;
			case CompositionPackage.TRANSFORMATION__PREDEFINED_TRANSFORMATION:
				return PREDEFINED_TRANSFORMATION_EDEFAULT == null ? predefinedTransformation != null : !PREDEFINED_TRANSFORMATION_EDEFAULT.equals(predefinedTransformation);
			case CompositionPackage.TRANSFORMATION__INPUT:
				return input != null;
			case CompositionPackage.TRANSFORMATION__OUTPUT:
				return output != null;
			case CompositionPackage.TRANSFORMATION__TARGET_SPEC:
				return targetSpec != TARGET_SPEC_EDEFAULT;
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
		result.append(", transformationFunction: ");
		result.append(transformationFunction);
		result.append(", kind: ");
		result.append(kind);
		result.append(", predefinedTransformation: ");
		result.append(predefinedTransformation);
		result.append(", targetSpec: ");
		result.append(targetSpec);
		result.append(')');
		return result.toString();
	}

} //TransformationImpl
