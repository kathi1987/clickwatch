/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.specificmodels.tests.testsourcemodel.impl;

import de.hub.specificmodels.tests.testsourcemodel.ClassWithListFeatures;
import de.hub.specificmodels.tests.testsourcemodel.RootClass;
import de.hub.specificmodels.tests.testsourcemodel.TestSourceModelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.specificmodels.tests.testsourcemodel.impl.RootClassImpl#getAnAttribute1 <em>An Attribute1</em>}</li>
 *   <li>{@link de.hub.specificmodels.tests.testsourcemodel.impl.RootClassImpl#getNormalReference <em>Normal Reference</em>}</li>
 *   <li>{@link de.hub.specificmodels.tests.testsourcemodel.impl.RootClassImpl#getAny <em>Any</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RootClassImpl extends EObjectImpl implements RootClass {
	/**
	 * The default value of the '{@link #getAnAttribute1() <em>An Attribute1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnAttribute1()
	 * @generated
	 * @ordered
	 */
	protected static final String AN_ATTRIBUTE1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnAttribute1() <em>An Attribute1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnAttribute1()
	 * @generated
	 * @ordered
	 */
	protected String anAttribute1 = AN_ATTRIBUTE1_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNormalReference() <em>Normal Reference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormalReference()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassWithListFeatures> normalReference;

	/**
	 * The cached value of the '{@link #getAny() <em>Any</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAny()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap any;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RootClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestSourceModelPackage.Literals.ROOT_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAnAttribute1() {
		return anAttribute1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnAttribute1(String newAnAttribute1) {
		String oldAnAttribute1 = anAttribute1;
		anAttribute1 = newAnAttribute1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestSourceModelPackage.ROOT_CLASS__AN_ATTRIBUTE1, oldAnAttribute1, anAttribute1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClassWithListFeatures> getNormalReference() {
		if (normalReference == null) {
			normalReference = new EObjectContainmentEList<ClassWithListFeatures>(ClassWithListFeatures.class, this, TestSourceModelPackage.ROOT_CLASS__NORMAL_REFERENCE);
		}
		return normalReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, TestSourceModelPackage.ROOT_CLASS__ANY);
		}
		return any;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TestSourceModelPackage.ROOT_CLASS__NORMAL_REFERENCE:
				return ((InternalEList<?>)getNormalReference()).basicRemove(otherEnd, msgs);
			case TestSourceModelPackage.ROOT_CLASS__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
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
			case TestSourceModelPackage.ROOT_CLASS__AN_ATTRIBUTE1:
				return getAnAttribute1();
			case TestSourceModelPackage.ROOT_CLASS__NORMAL_REFERENCE:
				return getNormalReference();
			case TestSourceModelPackage.ROOT_CLASS__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
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
			case TestSourceModelPackage.ROOT_CLASS__AN_ATTRIBUTE1:
				setAnAttribute1((String)newValue);
				return;
			case TestSourceModelPackage.ROOT_CLASS__NORMAL_REFERENCE:
				getNormalReference().clear();
				getNormalReference().addAll((Collection<? extends ClassWithListFeatures>)newValue);
				return;
			case TestSourceModelPackage.ROOT_CLASS__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
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
			case TestSourceModelPackage.ROOT_CLASS__AN_ATTRIBUTE1:
				setAnAttribute1(AN_ATTRIBUTE1_EDEFAULT);
				return;
			case TestSourceModelPackage.ROOT_CLASS__NORMAL_REFERENCE:
				getNormalReference().clear();
				return;
			case TestSourceModelPackage.ROOT_CLASS__ANY:
				getAny().clear();
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
			case TestSourceModelPackage.ROOT_CLASS__AN_ATTRIBUTE1:
				return AN_ATTRIBUTE1_EDEFAULT == null ? anAttribute1 != null : !AN_ATTRIBUTE1_EDEFAULT.equals(anAttribute1);
			case TestSourceModelPackage.ROOT_CLASS__NORMAL_REFERENCE:
				return normalReference != null && !normalReference.isEmpty();
			case TestSourceModelPackage.ROOT_CLASS__ANY:
				return any != null && !any.isEmpty();
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
		result.append(" (anAttribute1: ");
		result.append(anAttribute1);
		result.append(", any: ");
		result.append(any);
		result.append(')');
		return result.toString();
	}

} //RootClassImpl
