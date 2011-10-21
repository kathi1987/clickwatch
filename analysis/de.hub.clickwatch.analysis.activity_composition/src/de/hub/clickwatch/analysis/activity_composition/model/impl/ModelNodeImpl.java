/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.analysis.activity_composition.model.impl;

import de.hub.clickwatch.analysis.activity_composition.model.ModelNode;
import de.hub.clickwatch.analysis.activity_composition.model.ModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.clickwatch.analysis.activity_composition.model.impl.ModelNodeImpl#getMetaModelResource <em>Meta Model Resource</em>}</li>
 *   <li>{@link de.hub.clickwatch.analysis.activity_composition.model.impl.ModelNodeImpl#getMetaModelClass <em>Meta Model Class</em>}</li>
 *   <li>{@link de.hub.clickwatch.analysis.activity_composition.model.impl.ModelNodeImpl#getModelResource <em>Model Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelNodeImpl extends DataNodeImpl implements ModelNode {
	/**
	 * The default value of the '{@link #getMetaModelResource() <em>Meta Model Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaModelResource()
	 * @generated
	 * @ordered
	 */
	protected static final String META_MODEL_RESOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMetaModelResource() <em>Meta Model Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaModelResource()
	 * @generated
	 * @ordered
	 */
	protected String metaModelResource = META_MODEL_RESOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMetaModelClass() <em>Meta Model Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaModelClass()
	 * @generated
	 * @ordered
	 */
	protected static final String META_MODEL_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMetaModelClass() <em>Meta Model Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaModelClass()
	 * @generated
	 * @ordered
	 */
	protected String metaModelClass = META_MODEL_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getModelResource() <em>Model Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelResource()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_RESOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModelResource() <em>Model Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelResource()
	 * @generated
	 * @ordered
	 */
	protected String modelResource = MODEL_RESOURCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.MODEL_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMetaModelResource() {
		return metaModelResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetaModelResource(String newMetaModelResource) {
		String oldMetaModelResource = metaModelResource;
		metaModelResource = newMetaModelResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MODEL_NODE__META_MODEL_RESOURCE, oldMetaModelResource, metaModelResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMetaModelClass() {
		return metaModelClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetaModelClass(String newMetaModelClass) {
		String oldMetaModelClass = metaModelClass;
		metaModelClass = newMetaModelClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MODEL_NODE__META_MODEL_CLASS, oldMetaModelClass, metaModelClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModelResource() {
		return modelResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelResource(String newModelResource) {
		String oldModelResource = modelResource;
		modelResource = newModelResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MODEL_NODE__MODEL_RESOURCE, oldModelResource, modelResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.MODEL_NODE__META_MODEL_RESOURCE:
				return getMetaModelResource();
			case ModelPackage.MODEL_NODE__META_MODEL_CLASS:
				return getMetaModelClass();
			case ModelPackage.MODEL_NODE__MODEL_RESOURCE:
				return getModelResource();
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
			case ModelPackage.MODEL_NODE__META_MODEL_RESOURCE:
				setMetaModelResource((String)newValue);
				return;
			case ModelPackage.MODEL_NODE__META_MODEL_CLASS:
				setMetaModelClass((String)newValue);
				return;
			case ModelPackage.MODEL_NODE__MODEL_RESOURCE:
				setModelResource((String)newValue);
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
			case ModelPackage.MODEL_NODE__META_MODEL_RESOURCE:
				setMetaModelResource(META_MODEL_RESOURCE_EDEFAULT);
				return;
			case ModelPackage.MODEL_NODE__META_MODEL_CLASS:
				setMetaModelClass(META_MODEL_CLASS_EDEFAULT);
				return;
			case ModelPackage.MODEL_NODE__MODEL_RESOURCE:
				setModelResource(MODEL_RESOURCE_EDEFAULT);
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
			case ModelPackage.MODEL_NODE__META_MODEL_RESOURCE:
				return META_MODEL_RESOURCE_EDEFAULT == null ? metaModelResource != null : !META_MODEL_RESOURCE_EDEFAULT.equals(metaModelResource);
			case ModelPackage.MODEL_NODE__META_MODEL_CLASS:
				return META_MODEL_CLASS_EDEFAULT == null ? metaModelClass != null : !META_MODEL_CLASS_EDEFAULT.equals(metaModelClass);
			case ModelPackage.MODEL_NODE__MODEL_RESOURCE:
				return MODEL_RESOURCE_EDEFAULT == null ? modelResource != null : !MODEL_RESOURCE_EDEFAULT.equals(modelResource);
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
		result.append(" (metaModelResource: ");
		result.append(metaModelResource);
		result.append(", metaModelClass: ");
		result.append(metaModelClass);
		result.append(", modelResource: ");
		result.append(modelResource);
		result.append(')');
		return result.toString();
	}

} //ModelNodeImpl
