/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.analysis.activity_composition.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import de.hub.clickwatch.analysis.activity_composition.model.InputEdge;
import de.hub.clickwatch.analysis.activity_composition.model.ModelPackage;
import de.hub.clickwatch.analysis.activity_composition.model.Transformation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transformation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.clickwatch.analysis.activity_composition.model.impl.TransformationImpl#getTransformationFile <em>Transformation File</em>}</li>
 *   <li>{@link de.hub.clickwatch.analysis.activity_composition.model.impl.TransformationImpl#getInput <em>Input</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransformationImpl extends ActionNodeImpl implements Transformation {
	/**
	 * The default value of the '{@link #getTransformationFile() <em>Transformation File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformationFile()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSFORMATION_FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransformationFile() <em>Transformation File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformationFile()
	 * @generated
	 * @ordered
	 */
	protected String transformationFile = TRANSFORMATION_FILE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected EList<InputEdge> input;

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
		return ModelPackage.Literals.TRANSFORMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTransformationFile() {
		return transformationFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformationFile(String newTransformationFile) {
		String oldTransformationFile = transformationFile;
		transformationFile = newTransformationFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TRANSFORMATION__TRANSFORMATION_FILE, oldTransformationFile, transformationFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputEdge> getInput() {
		if (input == null) {
			input = new EObjectResolvingEList<InputEdge>(InputEdge.class, this, ModelPackage.TRANSFORMATION__INPUT);
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.TRANSFORMATION__TRANSFORMATION_FILE:
				return getTransformationFile();
			case ModelPackage.TRANSFORMATION__INPUT:
				return getInput();
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
			case ModelPackage.TRANSFORMATION__TRANSFORMATION_FILE:
				setTransformationFile((String)newValue);
				return;
			case ModelPackage.TRANSFORMATION__INPUT:
				getInput().clear();
				getInput().addAll((Collection<? extends InputEdge>)newValue);
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
			case ModelPackage.TRANSFORMATION__TRANSFORMATION_FILE:
				setTransformationFile(TRANSFORMATION_FILE_EDEFAULT);
				return;
			case ModelPackage.TRANSFORMATION__INPUT:
				getInput().clear();
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
			case ModelPackage.TRANSFORMATION__TRANSFORMATION_FILE:
				return TRANSFORMATION_FILE_EDEFAULT == null ? transformationFile != null : !TRANSFORMATION_FILE_EDEFAULT.equals(transformationFile);
			case ModelPackage.TRANSFORMATION__INPUT:
				return input != null && !input.isEmpty();
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
		result.append(" (transformationFile: ");
		result.append(transformationFile);
		result.append(')');
		return result.toString();
	}

} //TransformationImpl
