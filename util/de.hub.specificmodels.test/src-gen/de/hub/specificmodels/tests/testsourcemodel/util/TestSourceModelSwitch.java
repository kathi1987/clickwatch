/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.specificmodels.tests.testsourcemodel.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import de.hub.specificmodels.tests.testsourcemodel.ClassWithListFeatures;
import de.hub.specificmodels.tests.testsourcemodel.ListFeatureElementClass1;
import de.hub.specificmodels.tests.testsourcemodel.ListFeatureElementClass2;
import de.hub.specificmodels.tests.testsourcemodel.ListFeatureElementClass3;
import de.hub.specificmodels.tests.testsourcemodel.RootClass;
import de.hub.specificmodels.tests.testsourcemodel.TestSourceModelPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.hub.specificmodels.tests.testsourcemodel.TestSourceModelPackage
 * @generated
 */
public class TestSourceModelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TestSourceModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestSourceModelSwitch() {
		if (modelPackage == null) {
			modelPackage = TestSourceModelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case TestSourceModelPackage.ROOT_CLASS: {
				RootClass rootClass = (RootClass)theEObject;
				T result = caseRootClass(rootClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestSourceModelPackage.CLASS_WITH_LIST_FEATURES: {
				ClassWithListFeatures classWithListFeatures = (ClassWithListFeatures)theEObject;
				T result = caseClassWithListFeatures(classWithListFeatures);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestSourceModelPackage.LIST_FEATURE_ELEMENT_CLASS1: {
				ListFeatureElementClass1 listFeatureElementClass1 = (ListFeatureElementClass1)theEObject;
				T result = caseListFeatureElementClass1(listFeatureElementClass1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestSourceModelPackage.LIST_FEATURE_ELEMENT_CLASS2: {
				ListFeatureElementClass2 listFeatureElementClass2 = (ListFeatureElementClass2)theEObject;
				T result = caseListFeatureElementClass2(listFeatureElementClass2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestSourceModelPackage.LIST_FEATURE_ELEMENT_CLASS3: {
				ListFeatureElementClass3 listFeatureElementClass3 = (ListFeatureElementClass3)theEObject;
				T result = caseListFeatureElementClass3(listFeatureElementClass3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRootClass(RootClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class With List Features</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class With List Features</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassWithListFeatures(ClassWithListFeatures object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Feature Element Class1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Feature Element Class1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListFeatureElementClass1(ListFeatureElementClass1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Feature Element Class2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Feature Element Class2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListFeatureElementClass2(ListFeatureElementClass2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Feature Element Class3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Feature Element Class3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListFeatureElementClass3(ListFeatureElementClass3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //TestSourceModelSwitch
