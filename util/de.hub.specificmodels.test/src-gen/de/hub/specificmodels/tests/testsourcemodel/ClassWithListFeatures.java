/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.specificmodels.tests.testsourcemodel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class With List Features</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.specificmodels.tests.testsourcemodel.ClassWithListFeatures#getListFeature1 <em>List Feature1</em>}</li>
 *   <li>{@link de.hub.specificmodels.tests.testsourcemodel.ClassWithListFeatures#getListFeature2 <em>List Feature2</em>}</li>
 *   <li>{@link de.hub.specificmodels.tests.testsourcemodel.ClassWithListFeatures#getAnAttribute1 <em>An Attribute1</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.specificmodels.tests.testsourcemodel.TestSourceModelPackage#getClassWithListFeatures()
 * @model
 * @generated
 */
public interface ClassWithListFeatures extends EObject {
	/**
	 * Returns the value of the '<em><b>List Feature1</b></em>' containment reference list.
	 * The list contents are of type {@link de.hub.specificmodels.tests.testsourcemodel.ListFeatureElementClass1}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Feature1</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Feature1</em>' containment reference list.
	 * @see de.hub.specificmodels.tests.testsourcemodel.TestSourceModelPackage#getClassWithListFeatures_ListFeature1()
	 * @model containment="true"
	 * @generated
	 */
	EList<ListFeatureElementClass1> getListFeature1();

	/**
	 * Returns the value of the '<em><b>List Feature2</b></em>' containment reference list.
	 * The list contents are of type {@link de.hub.specificmodels.tests.testsourcemodel.ListFeatureElementClass2}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Feature2</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Feature2</em>' containment reference list.
	 * @see de.hub.specificmodels.tests.testsourcemodel.TestSourceModelPackage#getClassWithListFeatures_ListFeature2()
	 * @model containment="true"
	 * @generated
	 */
	EList<ListFeatureElementClass2> getListFeature2();

	/**
	 * Returns the value of the '<em><b>An Attribute1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>An Attribute1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>An Attribute1</em>' attribute.
	 * @see #setAnAttribute1(int)
	 * @see de.hub.specificmodels.tests.testsourcemodel.TestSourceModelPackage#getClassWithListFeatures_AnAttribute1()
	 * @model
	 * @generated
	 */
	int getAnAttribute1();

	/**
	 * Sets the value of the '{@link de.hub.specificmodels.tests.testsourcemodel.ClassWithListFeatures#getAnAttribute1 <em>An Attribute1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>An Attribute1</em>' attribute.
	 * @see #getAnAttribute1()
	 * @generated
	 */
	void setAnAttribute1(int value);

} // ClassWithListFeatures
