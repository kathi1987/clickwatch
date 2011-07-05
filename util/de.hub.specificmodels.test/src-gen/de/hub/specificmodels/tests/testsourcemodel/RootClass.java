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
 * A representation of the model object '<em><b>Root Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.specificmodels.tests.testsourcemodel.RootClass#getAnAttribute1 <em>An Attribute1</em>}</li>
 *   <li>{@link de.hub.specificmodels.tests.testsourcemodel.RootClass#getNormalReference <em>Normal Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.specificmodels.tests.testsourcemodel.TestSourceModelPackage#getRootClass()
 * @model
 * @generated
 */
public interface RootClass extends EObject {
	/**
	 * Returns the value of the '<em><b>An Attribute1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>An Attribute1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>An Attribute1</em>' attribute.
	 * @see #setAnAttribute1(String)
	 * @see de.hub.specificmodels.tests.testsourcemodel.TestSourceModelPackage#getRootClass_AnAttribute1()
	 * @model
	 * @generated
	 */
	String getAnAttribute1();

	/**
	 * Sets the value of the '{@link de.hub.specificmodels.tests.testsourcemodel.RootClass#getAnAttribute1 <em>An Attribute1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>An Attribute1</em>' attribute.
	 * @see #getAnAttribute1()
	 * @generated
	 */
	void setAnAttribute1(String value);

	/**
	 * Returns the value of the '<em><b>Normal Reference</b></em>' containment reference list.
	 * The list contents are of type {@link de.hub.specificmodels.tests.testsourcemodel.ClassWithListFeatures}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Normal Reference</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Normal Reference</em>' containment reference list.
	 * @see de.hub.specificmodels.tests.testsourcemodel.TestSourceModelPackage#getRootClass_NormalReference()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClassWithListFeatures> getNormalReference();

} // RootClass
