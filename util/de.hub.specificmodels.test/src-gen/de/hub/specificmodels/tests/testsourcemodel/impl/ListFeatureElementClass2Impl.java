/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.specificmodels.tests.testsourcemodel.impl;

import de.hub.specificmodels.tests.testsourcemodel.ListFeatureElementClass2;
import de.hub.specificmodels.tests.testsourcemodel.TestSourceModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Feature Element Class2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.specificmodels.tests.testsourcemodel.impl.ListFeatureElementClass2Impl#getName <em>Name</em>}</li>
 *   <li>{@link de.hub.specificmodels.tests.testsourcemodel.impl.ListFeatureElementClass2Impl#getAnAttributeOfFeatureClass2 <em>An Attribute Of Feature Class2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ListFeatureElementClass2Impl extends EObjectImpl implements ListFeatureElementClass2 {
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
	 * The default value of the '{@link #getAnAttributeOfFeatureClass2() <em>An Attribute Of Feature Class2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnAttributeOfFeatureClass2()
	 * @generated
	 * @ordered
	 */
	protected static final String AN_ATTRIBUTE_OF_FEATURE_CLASS2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnAttributeOfFeatureClass2() <em>An Attribute Of Feature Class2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnAttributeOfFeatureClass2()
	 * @generated
	 * @ordered
	 */
	protected String anAttributeOfFeatureClass2 = AN_ATTRIBUTE_OF_FEATURE_CLASS2_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListFeatureElementClass2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestSourceModelPackage.Literals.LIST_FEATURE_ELEMENT_CLASS2;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TestSourceModelPackage.LIST_FEATURE_ELEMENT_CLASS2__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAnAttributeOfFeatureClass2() {
		return anAttributeOfFeatureClass2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnAttributeOfFeatureClass2(String newAnAttributeOfFeatureClass2) {
		String oldAnAttributeOfFeatureClass2 = anAttributeOfFeatureClass2;
		anAttributeOfFeatureClass2 = newAnAttributeOfFeatureClass2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestSourceModelPackage.LIST_FEATURE_ELEMENT_CLASS2__AN_ATTRIBUTE_OF_FEATURE_CLASS2, oldAnAttributeOfFeatureClass2, anAttributeOfFeatureClass2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TestSourceModelPackage.LIST_FEATURE_ELEMENT_CLASS2__NAME:
				return getName();
			case TestSourceModelPackage.LIST_FEATURE_ELEMENT_CLASS2__AN_ATTRIBUTE_OF_FEATURE_CLASS2:
				return getAnAttributeOfFeatureClass2();
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
			case TestSourceModelPackage.LIST_FEATURE_ELEMENT_CLASS2__NAME:
				setName((String)newValue);
				return;
			case TestSourceModelPackage.LIST_FEATURE_ELEMENT_CLASS2__AN_ATTRIBUTE_OF_FEATURE_CLASS2:
				setAnAttributeOfFeatureClass2((String)newValue);
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
			case TestSourceModelPackage.LIST_FEATURE_ELEMENT_CLASS2__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TestSourceModelPackage.LIST_FEATURE_ELEMENT_CLASS2__AN_ATTRIBUTE_OF_FEATURE_CLASS2:
				setAnAttributeOfFeatureClass2(AN_ATTRIBUTE_OF_FEATURE_CLASS2_EDEFAULT);
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
			case TestSourceModelPackage.LIST_FEATURE_ELEMENT_CLASS2__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TestSourceModelPackage.LIST_FEATURE_ELEMENT_CLASS2__AN_ATTRIBUTE_OF_FEATURE_CLASS2:
				return AN_ATTRIBUTE_OF_FEATURE_CLASS2_EDEFAULT == null ? anAttributeOfFeatureClass2 != null : !AN_ATTRIBUTE_OF_FEATURE_CLASS2_EDEFAULT.equals(anAttributeOfFeatureClass2);
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
		result.append(", anAttributeOfFeatureClass2: ");
		result.append(anAttributeOfFeatureClass2);
		result.append(')');
		return result.toString();
	}

} //ListFeatureElementClass2Impl
