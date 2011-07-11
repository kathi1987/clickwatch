/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.specificmodels.tests.testsourcemodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Feature Element Class1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.specificmodels.tests.testsourcemodel.ListFeatureElementClass1#getName <em>Name</em>}</li>
 *   <li>{@link de.hub.specificmodels.tests.testsourcemodel.ListFeatureElementClass1#getListFeature3 <em>List Feature3</em>}</li>
 *   <li>{@link de.hub.specificmodels.tests.testsourcemodel.ListFeatureElementClass1#getAnAttributeOfFeatureClass1 <em>An Attribute Of Feature Class1</em>}</li>
 *   <li>{@link de.hub.specificmodels.tests.testsourcemodel.ListFeatureElementClass1#getAny <em>Any</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.specificmodels.tests.testsourcemodel.TestSourceModelPackage#getListFeatureElementClass1()
 * @model
 * @generated
 */
public interface ListFeatureElementClass1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.hub.specificmodels.tests.testsourcemodel.TestSourceModelPackage#getListFeatureElementClass1_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.hub.specificmodels.tests.testsourcemodel.ListFeatureElementClass1#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>List Feature3</b></em>' containment reference list.
	 * The list contents are of type {@link de.hub.specificmodels.tests.testsourcemodel.ListFeatureElementClass3}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Feature3</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Feature3</em>' containment reference list.
	 * @see de.hub.specificmodels.tests.testsourcemodel.TestSourceModelPackage#getListFeatureElementClass1_ListFeature3()
	 * @model containment="true"
	 * @generated
	 */
	EList<ListFeatureElementClass3> getListFeature3();

	/**
	 * Returns the value of the '<em><b>An Attribute Of Feature Class1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>An Attribute Of Feature Class1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>An Attribute Of Feature Class1</em>' attribute.
	 * @see #setAnAttributeOfFeatureClass1(String)
	 * @see de.hub.specificmodels.tests.testsourcemodel.TestSourceModelPackage#getListFeatureElementClass1_AnAttributeOfFeatureClass1()
	 * @model
	 * @generated
	 */
	String getAnAttributeOfFeatureClass1();

	/**
	 * Sets the value of the '{@link de.hub.specificmodels.tests.testsourcemodel.ListFeatureElementClass1#getAnAttributeOfFeatureClass1 <em>An Attribute Of Feature Class1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>An Attribute Of Feature Class1</em>' attribute.
	 * @see #getAnAttributeOfFeatureClass1()
	 * @generated
	 */
	void setAnAttributeOfFeatureClass1(String value);

	/**
	 * Returns the value of the '<em><b>Any</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any</em>' attribute list.
	 * @see de.hub.specificmodels.tests.testsourcemodel.TestSourceModelPackage#getListFeatureElementClass1_Any()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':1' processing='lax' wildcards='##any'"
	 * @generated
	 */
	FeatureMap getAny();

} // ListFeatureElementClass1
