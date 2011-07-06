/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.specificmodels.tests.testsourcemodel.impl;

import de.hub.specificmodels.tests.testsourcemodel.ClassWithListFeatures;
import de.hub.specificmodels.tests.testsourcemodel.ListFeatureElementClass1;
import de.hub.specificmodels.tests.testsourcemodel.ListFeatureElementClass2;
import de.hub.specificmodels.tests.testsourcemodel.TestSourceModelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class With List Features</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.specificmodels.tests.testsourcemodel.impl.ClassWithListFeaturesImpl#getListFeature1 <em>List Feature1</em>}</li>
 *   <li>{@link de.hub.specificmodels.tests.testsourcemodel.impl.ClassWithListFeaturesImpl#getListFeature2 <em>List Feature2</em>}</li>
 *   <li>{@link de.hub.specificmodels.tests.testsourcemodel.impl.ClassWithListFeaturesImpl#getAnAttribute1 <em>An Attribute1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassWithListFeaturesImpl extends EObjectImpl implements ClassWithListFeatures {
	/**
	 * The cached value of the '{@link #getListFeature1() <em>List Feature1</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListFeature1()
	 * @generated
	 * @ordered
	 */
	protected EList<ListFeatureElementClass1> listFeature1;

	/**
	 * The cached value of the '{@link #getListFeature2() <em>List Feature2</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListFeature2()
	 * @generated
	 * @ordered
	 */
	protected EList<ListFeatureElementClass2> listFeature2;

	/**
	 * The default value of the '{@link #getAnAttribute1() <em>An Attribute1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnAttribute1()
	 * @generated
	 * @ordered
	 */
	protected static final int AN_ATTRIBUTE1_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAnAttribute1() <em>An Attribute1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnAttribute1()
	 * @generated
	 * @ordered
	 */
	protected int anAttribute1 = AN_ATTRIBUTE1_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassWithListFeaturesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestSourceModelPackage.Literals.CLASS_WITH_LIST_FEATURES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ListFeatureElementClass1> getListFeature1() {
		if (listFeature1 == null) {
			listFeature1 = new EObjectContainmentEList<ListFeatureElementClass1>(ListFeatureElementClass1.class, this, TestSourceModelPackage.CLASS_WITH_LIST_FEATURES__LIST_FEATURE1);
		}
		return listFeature1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ListFeatureElementClass2> getListFeature2() {
		if (listFeature2 == null) {
			listFeature2 = new EObjectContainmentEList<ListFeatureElementClass2>(ListFeatureElementClass2.class, this, TestSourceModelPackage.CLASS_WITH_LIST_FEATURES__LIST_FEATURE2);
		}
		return listFeature2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAnAttribute1() {
		return anAttribute1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnAttribute1(int newAnAttribute1) {
		int oldAnAttribute1 = anAttribute1;
		anAttribute1 = newAnAttribute1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestSourceModelPackage.CLASS_WITH_LIST_FEATURES__AN_ATTRIBUTE1, oldAnAttribute1, anAttribute1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TestSourceModelPackage.CLASS_WITH_LIST_FEATURES__LIST_FEATURE1:
				return ((InternalEList<?>)getListFeature1()).basicRemove(otherEnd, msgs);
			case TestSourceModelPackage.CLASS_WITH_LIST_FEATURES__LIST_FEATURE2:
				return ((InternalEList<?>)getListFeature2()).basicRemove(otherEnd, msgs);
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
			case TestSourceModelPackage.CLASS_WITH_LIST_FEATURES__LIST_FEATURE1:
				return getListFeature1();
			case TestSourceModelPackage.CLASS_WITH_LIST_FEATURES__LIST_FEATURE2:
				return getListFeature2();
			case TestSourceModelPackage.CLASS_WITH_LIST_FEATURES__AN_ATTRIBUTE1:
				return getAnAttribute1();
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
			case TestSourceModelPackage.CLASS_WITH_LIST_FEATURES__LIST_FEATURE1:
				getListFeature1().clear();
				getListFeature1().addAll((Collection<? extends ListFeatureElementClass1>)newValue);
				return;
			case TestSourceModelPackage.CLASS_WITH_LIST_FEATURES__LIST_FEATURE2:
				getListFeature2().clear();
				getListFeature2().addAll((Collection<? extends ListFeatureElementClass2>)newValue);
				return;
			case TestSourceModelPackage.CLASS_WITH_LIST_FEATURES__AN_ATTRIBUTE1:
				setAnAttribute1((Integer)newValue);
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
			case TestSourceModelPackage.CLASS_WITH_LIST_FEATURES__LIST_FEATURE1:
				getListFeature1().clear();
				return;
			case TestSourceModelPackage.CLASS_WITH_LIST_FEATURES__LIST_FEATURE2:
				getListFeature2().clear();
				return;
			case TestSourceModelPackage.CLASS_WITH_LIST_FEATURES__AN_ATTRIBUTE1:
				setAnAttribute1(AN_ATTRIBUTE1_EDEFAULT);
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
			case TestSourceModelPackage.CLASS_WITH_LIST_FEATURES__LIST_FEATURE1:
				return listFeature1 != null && !listFeature1.isEmpty();
			case TestSourceModelPackage.CLASS_WITH_LIST_FEATURES__LIST_FEATURE2:
				return listFeature2 != null && !listFeature2.isEmpty();
			case TestSourceModelPackage.CLASS_WITH_LIST_FEATURES__AN_ATTRIBUTE1:
				return anAttribute1 != AN_ATTRIBUTE1_EDEFAULT;
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
		result.append(')');
		return result.toString();
	}

} //ClassWithListFeaturesImpl
