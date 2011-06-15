/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.xveg.xvegfeaturemodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import de.hub.xveg.xvegfeaturemodel.EdgeFeature;
import de.hub.xveg.xvegfeaturemodel.VertexFeature;
import de.hub.xveg.xvegfeaturemodel.XvegFeatureModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Edge Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.xveg.xvegfeaturemodel.impl.EdgeFeatureImpl#getPossibleSourceFeatures <em>Possible Source Features</em>}</li>
 *   <li>{@link de.hub.xveg.xvegfeaturemodel.impl.EdgeFeatureImpl#getPossibleTargetFeatures <em>Possible Target Features</em>}</li>
 *   <li>{@link de.hub.xveg.xvegfeaturemodel.impl.EdgeFeatureImpl#getSourceReference <em>Source Reference</em>}</li>
 *   <li>{@link de.hub.xveg.xvegfeaturemodel.impl.EdgeFeatureImpl#getTargetReference <em>Target Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EdgeFeatureImpl extends XvegFeatureImpl implements EdgeFeature {
	/**
	 * The cached value of the '{@link #getPossibleSourceFeatures() <em>Possible Source Features</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPossibleSourceFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<VertexFeature> possibleSourceFeatures;

	/**
	 * The cached value of the '{@link #getPossibleTargetFeatures() <em>Possible Target Features</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPossibleTargetFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<VertexFeature> possibleTargetFeatures;

	/**
	 * The cached value of the '{@link #getSourceReference() <em>Source Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceReference()
	 * @generated
	 * @ordered
	 */
	protected EReference sourceReference;

	/**
	 * The cached value of the '{@link #getTargetReference() <em>Target Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetReference()
	 * @generated
	 * @ordered
	 */
	protected EReference targetReference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EdgeFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XvegFeatureModelPackage.Literals.EDGE_FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VertexFeature> getPossibleSourceFeatures() {
		if (possibleSourceFeatures == null) {
			possibleSourceFeatures = new EObjectResolvingEList<VertexFeature>(VertexFeature.class, this, XvegFeatureModelPackage.EDGE_FEATURE__POSSIBLE_SOURCE_FEATURES);
		}
		return possibleSourceFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VertexFeature> getPossibleTargetFeatures() {
		if (possibleTargetFeatures == null) {
			possibleTargetFeatures = new EObjectResolvingEList<VertexFeature>(VertexFeature.class, this, XvegFeatureModelPackage.EDGE_FEATURE__POSSIBLE_TARGET_FEATURES);
		}
		return possibleTargetFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSourceReference() {
		if (sourceReference != null && sourceReference.eIsProxy()) {
			InternalEObject oldSourceReference = (InternalEObject)sourceReference;
			sourceReference = (EReference)eResolveProxy(oldSourceReference);
			if (sourceReference != oldSourceReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XvegFeatureModelPackage.EDGE_FEATURE__SOURCE_REFERENCE, oldSourceReference, sourceReference));
			}
		}
		return sourceReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference basicGetSourceReference() {
		return sourceReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceReference(EReference newSourceReference) {
		EReference oldSourceReference = sourceReference;
		sourceReference = newSourceReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XvegFeatureModelPackage.EDGE_FEATURE__SOURCE_REFERENCE, oldSourceReference, sourceReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTargetReference() {
		if (targetReference != null && targetReference.eIsProxy()) {
			InternalEObject oldTargetReference = (InternalEObject)targetReference;
			targetReference = (EReference)eResolveProxy(oldTargetReference);
			if (targetReference != oldTargetReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XvegFeatureModelPackage.EDGE_FEATURE__TARGET_REFERENCE, oldTargetReference, targetReference));
			}
		}
		return targetReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference basicGetTargetReference() {
		return targetReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetReference(EReference newTargetReference) {
		EReference oldTargetReference = targetReference;
		targetReference = newTargetReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XvegFeatureModelPackage.EDGE_FEATURE__TARGET_REFERENCE, oldTargetReference, targetReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XvegFeatureModelPackage.EDGE_FEATURE__POSSIBLE_SOURCE_FEATURES:
				return getPossibleSourceFeatures();
			case XvegFeatureModelPackage.EDGE_FEATURE__POSSIBLE_TARGET_FEATURES:
				return getPossibleTargetFeatures();
			case XvegFeatureModelPackage.EDGE_FEATURE__SOURCE_REFERENCE:
				if (resolve) return getSourceReference();
				return basicGetSourceReference();
			case XvegFeatureModelPackage.EDGE_FEATURE__TARGET_REFERENCE:
				if (resolve) return getTargetReference();
				return basicGetTargetReference();
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
			case XvegFeatureModelPackage.EDGE_FEATURE__POSSIBLE_SOURCE_FEATURES:
				getPossibleSourceFeatures().clear();
				getPossibleSourceFeatures().addAll((Collection<? extends VertexFeature>)newValue);
				return;
			case XvegFeatureModelPackage.EDGE_FEATURE__POSSIBLE_TARGET_FEATURES:
				getPossibleTargetFeatures().clear();
				getPossibleTargetFeatures().addAll((Collection<? extends VertexFeature>)newValue);
				return;
			case XvegFeatureModelPackage.EDGE_FEATURE__SOURCE_REFERENCE:
				setSourceReference((EReference)newValue);
				return;
			case XvegFeatureModelPackage.EDGE_FEATURE__TARGET_REFERENCE:
				setTargetReference((EReference)newValue);
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
			case XvegFeatureModelPackage.EDGE_FEATURE__POSSIBLE_SOURCE_FEATURES:
				getPossibleSourceFeatures().clear();
				return;
			case XvegFeatureModelPackage.EDGE_FEATURE__POSSIBLE_TARGET_FEATURES:
				getPossibleTargetFeatures().clear();
				return;
			case XvegFeatureModelPackage.EDGE_FEATURE__SOURCE_REFERENCE:
				setSourceReference((EReference)null);
				return;
			case XvegFeatureModelPackage.EDGE_FEATURE__TARGET_REFERENCE:
				setTargetReference((EReference)null);
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
			case XvegFeatureModelPackage.EDGE_FEATURE__POSSIBLE_SOURCE_FEATURES:
				return possibleSourceFeatures != null && !possibleSourceFeatures.isEmpty();
			case XvegFeatureModelPackage.EDGE_FEATURE__POSSIBLE_TARGET_FEATURES:
				return possibleTargetFeatures != null && !possibleTargetFeatures.isEmpty();
			case XvegFeatureModelPackage.EDGE_FEATURE__SOURCE_REFERENCE:
				return sourceReference != null;
			case XvegFeatureModelPackage.EDGE_FEATURE__TARGET_REFERENCE:
				return targetReference != null;
		}
		return super.eIsSet(featureID);
	}

} //EdgeFeatureImpl
