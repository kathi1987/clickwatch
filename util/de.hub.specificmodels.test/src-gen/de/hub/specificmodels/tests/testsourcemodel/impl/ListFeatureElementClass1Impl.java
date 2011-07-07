/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.specificmodels.tests.testsourcemodel.impl;

import de.hub.specificmodels.tests.testsourcemodel.ListFeatureElementClass1;
import de.hub.specificmodels.tests.testsourcemodel.ListFeatureElementClass3;
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
 * An implementation of the model object '<em><b>List Feature Element Class1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.specificmodels.tests.testsourcemodel.impl.ListFeatureElementClass1Impl#getName <em>Name</em>}</li>
 *   <li>{@link de.hub.specificmodels.tests.testsourcemodel.impl.ListFeatureElementClass1Impl#getListFeature3 <em>List Feature3</em>}</li>
 *   <li>{@link de.hub.specificmodels.tests.testsourcemodel.impl.ListFeatureElementClass1Impl#getAnAttributeOfFeatureClass1 <em>An Attribute Of Feature Class1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ListFeatureElementClass1Impl extends EObjectImpl implements ListFeatureElementClass1 {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getListFeature3() <em>List Feature3</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListFeature3()
	 * @generated
	 * @ordered
	 */
	protected EList<ListFeatureElementClass3> listFeature3;

	/**
	 * The default value of the '{@link #getAnAttributeOfFeatureClass1() <em>An Attribute Of Feature Class1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnAttributeOfFeatureClass1()
	 * @generated
	 * @ordered
	 */
	protected static final String AN_ATTRIBUTE_OF_FEATURE_CLASS1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnAttributeOfFeatureClass1() <em>An Attribute Of Feature Class1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnAttributeOfFeatureClass1()
	 * @generated
	 * @ordered
	 */
	protected String anAttributeOfFeatureClass1 = AN_ATTRIBUTE_OF_FEATURE_CLASS1_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListFeatureElementClass1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestSourceModelPackage.Literals.LIST_FEATURE_ELEMENT_CLASS1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestSourceModelPackage.LIST_FEATURE_ELEMENT_CLASS1__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ListFeatureElementClass3> getListFeature3() {
		if (listFeature3 == null) {
			listFeature3 = new EObjectContainmentEList<ListFeatureElementClass3>(ListFeatureElementClass3.class, this, TestSourceModelPackage.LIST_FEATURE_ELEMENT_CLASS1__LIST_FEATURE3);
		}
		return listFeature3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAnAttributeOfFeatureClass1() {
		return anAttributeOfFeatureClass1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnAttributeOfFeatureClass1(String newAnAttributeOfFeatureClass1) {
		String oldAnAttributeOfFeatureClass1 = anAttributeOfFeatureClass1;
		anAttributeOfFeatureClass1 = newAnAttributeOfFeatureClass1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestSourceModelPackage.LIST_FEATURE_ELEMENT_CLASS1__AN_ATTRIBUTE_OF_FEATURE_CLASS1, oldAnAttributeOfFeatureClass1, anAttributeOfFeatureClass1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TestSourceModelPackage.LIST_FEATURE_ELEMENT_CLASS1__LIST_FEATURE3:
				return ((InternalEList<?>)getListFeature3()).basicRemove(otherEnd, msgs);
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
			case TestSourceModelPackage.LIST_FEATURE_ELEMENT_CLASS1__NAME:
				return getName();
			case TestSourceModelPackage.LIST_FEATURE_ELEMENT_CLASS1__LIST_FEATURE3:
				return getListFeature3();
			case TestSourceModelPackage.LIST_FEATURE_ELEMENT_CLASS1__AN_ATTRIBUTE_OF_FEATURE_CLASS1:
				return getAnAttributeOfFeatureClass1();
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
			case TestSourceModelPackage.LIST_FEATURE_ELEMENT_CLASS1__NAME:
				setName((String)newValue);
				return;
			case TestSourceModelPackage.LIST_FEATURE_ELEMENT_CLASS1__LIST_FEATURE3:
				getListFeature3().clear();
				getListFeature3().addAll((Collection<? extends ListFeatureElementClass3>)newValue);
				return;
			case TestSourceModelPackage.LIST_FEATURE_ELEMENT_CLASS1__AN_ATTRIBUTE_OF_FEATURE_CLASS1:
				setAnAttributeOfFeatureClass1((String)newValue);
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
			case TestSourceModelPackage.LIST_FEATURE_ELEMENT_CLASS1__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TestSourceModelPackage.LIST_FEATURE_ELEMENT_CLASS1__LIST_FEATURE3:
				getListFeature3().clear();
				return;
			case TestSourceModelPackage.LIST_FEATURE_ELEMENT_CLASS1__AN_ATTRIBUTE_OF_FEATURE_CLASS1:
				setAnAttributeOfFeatureClass1(AN_ATTRIBUTE_OF_FEATURE_CLASS1_EDEFAULT);
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
			case TestSourceModelPackage.LIST_FEATURE_ELEMENT_CLASS1__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TestSourceModelPackage.LIST_FEATURE_ELEMENT_CLASS1__LIST_FEATURE3:
				return listFeature3 != null && !listFeature3.isEmpty();
			case TestSourceModelPackage.LIST_FEATURE_ELEMENT_CLASS1__AN_ATTRIBUTE_OF_FEATURE_CLASS1:
				return AN_ATTRIBUTE_OF_FEATURE_CLASS1_EDEFAULT == null ? anAttributeOfFeatureClass1 != null : !AN_ATTRIBUTE_OF_FEATURE_CLASS1_EDEFAULT.equals(anAttributeOfFeatureClass1);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", anAttributeOfFeatureClass1: ");
		result.append(anAttributeOfFeatureClass1);
		result.append(')');
		return result.toString();
	}

} //ListFeatureElementClass1Impl
