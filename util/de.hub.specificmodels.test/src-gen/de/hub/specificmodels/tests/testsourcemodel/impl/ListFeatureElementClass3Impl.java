/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.specificmodels.tests.testsourcemodel.impl;

import de.hub.specificmodels.tests.testsourcemodel.ListFeatureElementClass3;
import de.hub.specificmodels.tests.testsourcemodel.TestSourceModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Feature Element Class3</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.specificmodels.tests.testsourcemodel.impl.ListFeatureElementClass3Impl#getName <em>Name</em>}</li>
 *   <li>{@link de.hub.specificmodels.tests.testsourcemodel.impl.ListFeatureElementClass3Impl#getAnAttributeOfFeatureClass3 <em>An Attribute Of Feature Class3</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ListFeatureElementClass3Impl extends EObjectImpl implements ListFeatureElementClass3 {
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
	 * The default value of the '{@link #getAnAttributeOfFeatureClass3() <em>An Attribute Of Feature Class3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnAttributeOfFeatureClass3()
	 * @generated
	 * @ordered
	 */
	protected static final String AN_ATTRIBUTE_OF_FEATURE_CLASS3_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnAttributeOfFeatureClass3() <em>An Attribute Of Feature Class3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnAttributeOfFeatureClass3()
	 * @generated
	 * @ordered
	 */
	protected String anAttributeOfFeatureClass3 = AN_ATTRIBUTE_OF_FEATURE_CLASS3_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListFeatureElementClass3Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestSourceModelPackage.Literals.LIST_FEATURE_ELEMENT_CLASS3;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TestSourceModelPackage.LIST_FEATURE_ELEMENT_CLASS3__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAnAttributeOfFeatureClass3() {
		return anAttributeOfFeatureClass3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnAttributeOfFeatureClass3(String newAnAttributeOfFeatureClass3) {
		String oldAnAttributeOfFeatureClass3 = anAttributeOfFeatureClass3;
		anAttributeOfFeatureClass3 = newAnAttributeOfFeatureClass3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestSourceModelPackage.LIST_FEATURE_ELEMENT_CLASS3__AN_ATTRIBUTE_OF_FEATURE_CLASS3, oldAnAttributeOfFeatureClass3, anAttributeOfFeatureClass3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TestSourceModelPackage.LIST_FEATURE_ELEMENT_CLASS3__NAME:
				return getName();
			case TestSourceModelPackage.LIST_FEATURE_ELEMENT_CLASS3__AN_ATTRIBUTE_OF_FEATURE_CLASS3:
				return getAnAttributeOfFeatureClass3();
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
			case TestSourceModelPackage.LIST_FEATURE_ELEMENT_CLASS3__NAME:
				setName((String)newValue);
				return;
			case TestSourceModelPackage.LIST_FEATURE_ELEMENT_CLASS3__AN_ATTRIBUTE_OF_FEATURE_CLASS3:
				setAnAttributeOfFeatureClass3((String)newValue);
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
			case TestSourceModelPackage.LIST_FEATURE_ELEMENT_CLASS3__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TestSourceModelPackage.LIST_FEATURE_ELEMENT_CLASS3__AN_ATTRIBUTE_OF_FEATURE_CLASS3:
				setAnAttributeOfFeatureClass3(AN_ATTRIBUTE_OF_FEATURE_CLASS3_EDEFAULT);
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
			case TestSourceModelPackage.LIST_FEATURE_ELEMENT_CLASS3__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TestSourceModelPackage.LIST_FEATURE_ELEMENT_CLASS3__AN_ATTRIBUTE_OF_FEATURE_CLASS3:
				return AN_ATTRIBUTE_OF_FEATURE_CLASS3_EDEFAULT == null ? anAttributeOfFeatureClass3 != null : !AN_ATTRIBUTE_OF_FEATURE_CLASS3_EDEFAULT.equals(anAttributeOfFeatureClass3);
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
		result.append(", anAttributeOfFeatureClass3: ");
		result.append(anAttributeOfFeatureClass3);
		result.append(')');
		return result.toString();
	}

} //ListFeatureElementClass3Impl
