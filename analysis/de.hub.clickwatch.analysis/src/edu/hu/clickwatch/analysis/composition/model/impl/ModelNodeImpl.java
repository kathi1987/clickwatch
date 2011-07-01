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
import edu.hu.clickwatch.analysis.composition.model.DataNode;
import edu.hu.clickwatch.analysis.composition.model.ModelNode;
import edu.hu.clickwatch.analysis.composition.model.Visualization;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.hu.clickwatch.analysis.composition.model.impl.ModelNodeImpl#isHasData <em>Has Data</em>}</li>
 *   <li>{@link edu.hu.clickwatch.analysis.composition.model.impl.ModelNodeImpl#getVisualization <em>Visualization</em>}</li>
 *   <li>{@link edu.hu.clickwatch.analysis.composition.model.impl.ModelNodeImpl#getMetaModelResource <em>Meta Model Resource</em>}</li>
 *   <li>{@link edu.hu.clickwatch.analysis.composition.model.impl.ModelNodeImpl#isInferedType <em>Infered Type</em>}</li>
 *   <li>{@link edu.hu.clickwatch.analysis.composition.model.impl.ModelNodeImpl#getMetaModelClass <em>Meta Model Class</em>}</li>
 *   <li>{@link edu.hu.clickwatch.analysis.composition.model.impl.ModelNodeImpl#getModelResource <em>Model Resource</em>}</li>
 *   <li>{@link edu.hu.clickwatch.analysis.composition.model.impl.ModelNodeImpl#isPersistent <em>Persistent</em>}</li>
 *   <li>{@link edu.hu.clickwatch.analysis.composition.model.impl.ModelNodeImpl#getRegisteredPackage <em>Registered Package</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelNodeImpl extends NodeImpl implements ModelNode {
	/**
	 * The default value of the '{@link #isHasData() <em>Has Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasData()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_DATA_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isHasData() <em>Has Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasData()
	 * @generated
	 * @ordered
	 */
	protected boolean hasData = HAS_DATA_EDEFAULT;
	/**
	 * The cached value of the '{@link #getVisualization() <em>Visualization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisualization()
	 * @generated
	 * @ordered
	 */
	protected Visualization visualization;
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
	 * The default value of the '{@link #isInferedType() <em>Infered Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInferedType()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INFERED_TYPE_EDEFAULT = true;
	/**
	 * The cached value of the '{@link #isInferedType() <em>Infered Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInferedType()
	 * @generated
	 * @ordered
	 */
	protected boolean inferedType = INFERED_TYPE_EDEFAULT;
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
	 * The default value of the '{@link #isPersistent() <em>Persistent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPersistent()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PERSISTENT_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isPersistent() <em>Persistent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPersistent()
	 * @generated
	 * @ordered
	 */
	protected boolean persistent = PERSISTENT_EDEFAULT;
	/**
	 * The default value of the '{@link #getRegisteredPackage() <em>Registered Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegisteredPackage()
	 * @generated
	 * @ordered
	 */
	protected static final String REGISTERED_PACKAGE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getRegisteredPackage() <em>Registered Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegisteredPackage()
	 * @generated
	 * @ordered
	 */
	protected String registeredPackage = REGISTERED_PACKAGE_EDEFAULT;
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
		return CompositionPackage.Literals.MODEL_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHasData() {
		return hasData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasData(boolean newHasData) {
		boolean oldHasData = hasData;
		hasData = newHasData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompositionPackage.MODEL_NODE__HAS_DATA, oldHasData, hasData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Visualization getVisualization() {
		return visualization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVisualization(Visualization newVisualization, NotificationChain msgs) {
		Visualization oldVisualization = visualization;
		visualization = newVisualization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CompositionPackage.MODEL_NODE__VISUALIZATION, oldVisualization, newVisualization);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisualization(Visualization newVisualization) {
		if (newVisualization != visualization) {
			NotificationChain msgs = null;
			if (visualization != null)
				msgs = ((InternalEObject)visualization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CompositionPackage.MODEL_NODE__VISUALIZATION, null, msgs);
			if (newVisualization != null)
				msgs = ((InternalEObject)newVisualization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CompositionPackage.MODEL_NODE__VISUALIZATION, null, msgs);
			msgs = basicSetVisualization(newVisualization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompositionPackage.MODEL_NODE__VISUALIZATION, newVisualization, newVisualization));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CompositionPackage.MODEL_NODE__META_MODEL_RESOURCE, oldMetaModelResource, metaModelResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInferedType() {
		return inferedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInferedType(boolean newInferedType) {
		boolean oldInferedType = inferedType;
		inferedType = newInferedType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompositionPackage.MODEL_NODE__INFERED_TYPE, oldInferedType, inferedType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CompositionPackage.MODEL_NODE__META_MODEL_CLASS, oldMetaModelClass, metaModelClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CompositionPackage.MODEL_NODE__MODEL_RESOURCE, oldModelResource, modelResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPersistent() {
		return persistent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersistent(boolean newPersistent) {
		boolean oldPersistent = persistent;
		persistent = newPersistent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompositionPackage.MODEL_NODE__PERSISTENT, oldPersistent, persistent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRegisteredPackage() {
		return registeredPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegisteredPackage(String newRegisteredPackage) {
		String oldRegisteredPackage = registeredPackage;
		registeredPackage = newRegisteredPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompositionPackage.MODEL_NODE__REGISTERED_PACKAGE, oldRegisteredPackage, registeredPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CompositionPackage.MODEL_NODE__VISUALIZATION:
				return basicSetVisualization(null, msgs);
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
			case CompositionPackage.MODEL_NODE__HAS_DATA:
				return isHasData();
			case CompositionPackage.MODEL_NODE__VISUALIZATION:
				return getVisualization();
			case CompositionPackage.MODEL_NODE__META_MODEL_RESOURCE:
				return getMetaModelResource();
			case CompositionPackage.MODEL_NODE__INFERED_TYPE:
				return isInferedType();
			case CompositionPackage.MODEL_NODE__META_MODEL_CLASS:
				return getMetaModelClass();
			case CompositionPackage.MODEL_NODE__MODEL_RESOURCE:
				return getModelResource();
			case CompositionPackage.MODEL_NODE__PERSISTENT:
				return isPersistent();
			case CompositionPackage.MODEL_NODE__REGISTERED_PACKAGE:
				return getRegisteredPackage();
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
			case CompositionPackage.MODEL_NODE__HAS_DATA:
				setHasData((Boolean)newValue);
				return;
			case CompositionPackage.MODEL_NODE__VISUALIZATION:
				setVisualization((Visualization)newValue);
				return;
			case CompositionPackage.MODEL_NODE__META_MODEL_RESOURCE:
				setMetaModelResource((String)newValue);
				return;
			case CompositionPackage.MODEL_NODE__INFERED_TYPE:
				setInferedType((Boolean)newValue);
				return;
			case CompositionPackage.MODEL_NODE__META_MODEL_CLASS:
				setMetaModelClass((String)newValue);
				return;
			case CompositionPackage.MODEL_NODE__MODEL_RESOURCE:
				setModelResource((String)newValue);
				return;
			case CompositionPackage.MODEL_NODE__PERSISTENT:
				setPersistent((Boolean)newValue);
				return;
			case CompositionPackage.MODEL_NODE__REGISTERED_PACKAGE:
				setRegisteredPackage((String)newValue);
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
			case CompositionPackage.MODEL_NODE__HAS_DATA:
				setHasData(HAS_DATA_EDEFAULT);
				return;
			case CompositionPackage.MODEL_NODE__VISUALIZATION:
				setVisualization((Visualization)null);
				return;
			case CompositionPackage.MODEL_NODE__META_MODEL_RESOURCE:
				setMetaModelResource(META_MODEL_RESOURCE_EDEFAULT);
				return;
			case CompositionPackage.MODEL_NODE__INFERED_TYPE:
				setInferedType(INFERED_TYPE_EDEFAULT);
				return;
			case CompositionPackage.MODEL_NODE__META_MODEL_CLASS:
				setMetaModelClass(META_MODEL_CLASS_EDEFAULT);
				return;
			case CompositionPackage.MODEL_NODE__MODEL_RESOURCE:
				setModelResource(MODEL_RESOURCE_EDEFAULT);
				return;
			case CompositionPackage.MODEL_NODE__PERSISTENT:
				setPersistent(PERSISTENT_EDEFAULT);
				return;
			case CompositionPackage.MODEL_NODE__REGISTERED_PACKAGE:
				setRegisteredPackage(REGISTERED_PACKAGE_EDEFAULT);
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
			case CompositionPackage.MODEL_NODE__HAS_DATA:
				return hasData != HAS_DATA_EDEFAULT;
			case CompositionPackage.MODEL_NODE__VISUALIZATION:
				return visualization != null;
			case CompositionPackage.MODEL_NODE__META_MODEL_RESOURCE:
				return META_MODEL_RESOURCE_EDEFAULT == null ? metaModelResource != null : !META_MODEL_RESOURCE_EDEFAULT.equals(metaModelResource);
			case CompositionPackage.MODEL_NODE__INFERED_TYPE:
				return inferedType != INFERED_TYPE_EDEFAULT;
			case CompositionPackage.MODEL_NODE__META_MODEL_CLASS:
				return META_MODEL_CLASS_EDEFAULT == null ? metaModelClass != null : !META_MODEL_CLASS_EDEFAULT.equals(metaModelClass);
			case CompositionPackage.MODEL_NODE__MODEL_RESOURCE:
				return MODEL_RESOURCE_EDEFAULT == null ? modelResource != null : !MODEL_RESOURCE_EDEFAULT.equals(modelResource);
			case CompositionPackage.MODEL_NODE__PERSISTENT:
				return persistent != PERSISTENT_EDEFAULT;
			case CompositionPackage.MODEL_NODE__REGISTERED_PACKAGE:
				return REGISTERED_PACKAGE_EDEFAULT == null ? registeredPackage != null : !REGISTERED_PACKAGE_EDEFAULT.equals(registeredPackage);
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
		if (baseClass == DataNode.class) {
			switch (derivedFeatureID) {
				case CompositionPackage.MODEL_NODE__HAS_DATA: return CompositionPackage.DATA_NODE__HAS_DATA;
				case CompositionPackage.MODEL_NODE__VISUALIZATION: return CompositionPackage.DATA_NODE__VISUALIZATION;
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
		if (baseClass == DataNode.class) {
			switch (baseFeatureID) {
				case CompositionPackage.DATA_NODE__HAS_DATA: return CompositionPackage.MODEL_NODE__HAS_DATA;
				case CompositionPackage.DATA_NODE__VISUALIZATION: return CompositionPackage.MODEL_NODE__VISUALIZATION;
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
		result.append(" (hasData: ");
		result.append(hasData);
		result.append(", metaModelResource: ");
		result.append(metaModelResource);
		result.append(", inferedType: ");
		result.append(inferedType);
		result.append(", metaModelClass: ");
		result.append(metaModelClass);
		result.append(", modelResource: ");
		result.append(modelResource);
		result.append(", persistent: ");
		result.append(persistent);
		result.append(", registeredPackage: ");
		result.append(registeredPackage);
		result.append(')');
		return result.toString();
	}

} //ModelNodeImpl
