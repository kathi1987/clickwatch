/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.analysis.activity_composition.model.impl;

import de.hub.clickwatch.analysis.activity_composition.model.DataNode;
import de.hub.clickwatch.analysis.activity_composition.model.InputEdge;
import de.hub.clickwatch.analysis.activity_composition.model.ModelPackage;
import de.hub.clickwatch.analysis.activity_composition.model.Transformation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.clickwatch.analysis.activity_composition.model.impl.InputEdgeImpl#getSource <em>Source</em>}</li>
 *   <li>{@link de.hub.clickwatch.analysis.activity_composition.model.impl.InputEdgeImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link de.hub.clickwatch.analysis.activity_composition.model.impl.InputEdgeImpl#getClickwatchModelElement <em>Clickwatch Model Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InputEdgeImpl extends DataEdgeImpl implements InputEdge {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected DataNode source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Transformation target;

	/**
	 * The default value of the '{@link #getClickwatchModelElement() <em>Clickwatch Model Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClickwatchModelElement()
	 * @generated
	 * @ordered
	 */
	protected static final String CLICKWATCH_MODEL_ELEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClickwatchModelElement() <em>Clickwatch Model Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClickwatchModelElement()
	 * @generated
	 * @ordered
	 */
	protected String clickwatchModelElement = CLICKWATCH_MODEL_ELEMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputEdgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.INPUT_EDGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataNode getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (DataNode)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.INPUT_EDGE__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataNode basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(DataNode newSource) {
		DataNode oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.INPUT_EDGE__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transformation getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (Transformation)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.INPUT_EDGE__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transformation basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Transformation newTarget) {
		Transformation oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.INPUT_EDGE__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClickwatchModelElement() {
		return clickwatchModelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClickwatchModelElement(String newClickwatchModelElement) {
		String oldClickwatchModelElement = clickwatchModelElement;
		clickwatchModelElement = newClickwatchModelElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.INPUT_EDGE__CLICKWATCH_MODEL_ELEMENT, oldClickwatchModelElement, clickwatchModelElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.INPUT_EDGE__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case ModelPackage.INPUT_EDGE__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case ModelPackage.INPUT_EDGE__CLICKWATCH_MODEL_ELEMENT:
				return getClickwatchModelElement();
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
			case ModelPackage.INPUT_EDGE__SOURCE:
				setSource((DataNode)newValue);
				return;
			case ModelPackage.INPUT_EDGE__TARGET:
				setTarget((Transformation)newValue);
				return;
			case ModelPackage.INPUT_EDGE__CLICKWATCH_MODEL_ELEMENT:
				setClickwatchModelElement((String)newValue);
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
			case ModelPackage.INPUT_EDGE__SOURCE:
				setSource((DataNode)null);
				return;
			case ModelPackage.INPUT_EDGE__TARGET:
				setTarget((Transformation)null);
				return;
			case ModelPackage.INPUT_EDGE__CLICKWATCH_MODEL_ELEMENT:
				setClickwatchModelElement(CLICKWATCH_MODEL_ELEMENT_EDEFAULT);
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
			case ModelPackage.INPUT_EDGE__SOURCE:
				return source != null;
			case ModelPackage.INPUT_EDGE__TARGET:
				return target != null;
			case ModelPackage.INPUT_EDGE__CLICKWATCH_MODEL_ELEMENT:
				return CLICKWATCH_MODEL_ELEMENT_EDEFAULT == null ? clickwatchModelElement != null : !CLICKWATCH_MODEL_ELEMENT_EDEFAULT.equals(clickwatchModelElement);
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
		result.append(" (clickwatchModelElement: ");
		result.append(clickwatchModelElement);
		result.append(')');
		return result.toString();
	}

} //InputEdgeImpl
