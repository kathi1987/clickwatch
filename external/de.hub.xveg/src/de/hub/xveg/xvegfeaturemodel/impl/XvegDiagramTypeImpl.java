/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.xveg.xvegfeaturemodel.impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.hub.xveg.xvegfeaturemodel.XvegDiagramType;
import de.hub.xveg.xvegfeaturemodel.XvegFeature;
import de.hub.xveg.xvegfeaturemodel.XvegFeatureModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Xveg Diagram Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.xveg.xvegfeaturemodel.impl.XvegDiagramTypeImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link de.hub.xveg.xvegfeaturemodel.impl.XvegDiagramTypeImpl#getDslFactory <em>Dsl Factory</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class XvegDiagramTypeImpl extends EObjectImpl implements XvegDiagramType {
	/**
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<XvegFeature> features;

	/**
	 * The cached value of the '{@link #getDslFactory() <em>Dsl Factory</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDslFactory()
	 * @generated
	 * @ordered
	 */
	protected EFactory dslFactory;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XvegDiagramTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XvegFeatureModelPackage.Literals.XVEG_DIAGRAM_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XvegFeature> getFeatures() {
		if (features == null) {
			features = new EObjectContainmentWithInverseEList<XvegFeature>(XvegFeature.class, this, XvegFeatureModelPackage.XVEG_DIAGRAM_TYPE__FEATURES, XvegFeatureModelPackage.XVEG_FEATURE__DIAGRAM_TYPE);
		}
		return features;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EFactory getDslFactory() {
		if (dslFactory != null && dslFactory.eIsProxy()) {
			InternalEObject oldDslFactory = (InternalEObject)dslFactory;
			dslFactory = (EFactory)eResolveProxy(oldDslFactory);
			if (dslFactory != oldDslFactory) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XvegFeatureModelPackage.XVEG_DIAGRAM_TYPE__DSL_FACTORY, oldDslFactory, dslFactory));
			}
		}
		return dslFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EFactory basicGetDslFactory() {
		return dslFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDslFactory(EFactory newDslFactory) {
		EFactory oldDslFactory = dslFactory;
		dslFactory = newDslFactory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XvegFeatureModelPackage.XVEG_DIAGRAM_TYPE__DSL_FACTORY, oldDslFactory, dslFactory));
	}
	
	/**
	 * @generated NOT
	 */
	private Map<EClass, XvegFeature> featureMap = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public XvegFeature getFeatureForObject(EObject object) {
		if (featureMap == null) {
			featureMap = new HashMap<EClass, XvegFeature>();
			for (XvegFeature feature: getFeatures()) {
				featureMap.put(feature.getElementClass(), feature);
			}	
		}
		return featureMap.get(object.eClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XvegFeatureModelPackage.XVEG_DIAGRAM_TYPE__FEATURES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFeatures()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XvegFeatureModelPackage.XVEG_DIAGRAM_TYPE__FEATURES:
				return ((InternalEList<?>)getFeatures()).basicRemove(otherEnd, msgs);
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
			case XvegFeatureModelPackage.XVEG_DIAGRAM_TYPE__FEATURES:
				return getFeatures();
			case XvegFeatureModelPackage.XVEG_DIAGRAM_TYPE__DSL_FACTORY:
				if (resolve) return getDslFactory();
				return basicGetDslFactory();
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
			case XvegFeatureModelPackage.XVEG_DIAGRAM_TYPE__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends XvegFeature>)newValue);
				return;
			case XvegFeatureModelPackage.XVEG_DIAGRAM_TYPE__DSL_FACTORY:
				setDslFactory((EFactory)newValue);
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
			case XvegFeatureModelPackage.XVEG_DIAGRAM_TYPE__FEATURES:
				getFeatures().clear();
				return;
			case XvegFeatureModelPackage.XVEG_DIAGRAM_TYPE__DSL_FACTORY:
				setDslFactory((EFactory)null);
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
			case XvegFeatureModelPackage.XVEG_DIAGRAM_TYPE__FEATURES:
				return features != null && !features.isEmpty();
			case XvegFeatureModelPackage.XVEG_DIAGRAM_TYPE__DSL_FACTORY:
				return dslFactory != null;
		}
		return super.eIsSet(featureID);
	}

} //XvegDiagramTypeImpl
