/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.analysis.results.util;

import de.hub.clickwatch.analysis.results.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * @see de.hub.clickwatch.analysis.results.ResultsPackage
 * @generated
 */
public class ResultsSwitch<T> extends Switch<T> {
	/**
     * The cached model package
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected static ResultsPackage modelPackage;

	/**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ResultsSwitch() {
        if (modelPackage == null) {
            modelPackage = ResultsPackage.eINSTANCE;
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
            case ResultsPackage.CHART: {
                Chart chart = (Chart)theEObject;
                T result = caseChart(chart);
                if (result == null) result = caseNamedElement(chart);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ResultsPackage.CHART_TYPE: {
                ChartType chartType = (ChartType)theEObject;
                T result = caseChartType(chartType);
                if (result == null) result = caseNamedElement(chartType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ResultsPackage.VALUE_SPEC: {
                ValueSpec valueSpec = (ValueSpec)theEObject;
                T result = caseValueSpec(valueSpec);
                if (result == null) result = caseNamedElement(valueSpec);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ResultsPackage.NAMED_ELEMENT: {
                NamedElement namedElement = (NamedElement)theEObject;
                T result = caseNamedElement(namedElement);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ResultsPackage.AXIS: {
                Axis axis = (Axis)theEObject;
                T result = caseAxis(axis);
                if (result == null) result = caseValueSpec(axis);
                if (result == null) result = caseNamedElement(axis);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ResultsPackage.SERIES: {
                Series series = (Series)theEObject;
                T result = caseSeries(series);
                if (result == null) result = caseValueSpec(series);
                if (result == null) result = caseNamedElement(series);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ResultsPackage.CATEGORY: {
                Category category = (Category)theEObject;
                T result = caseCategory(category);
                if (result == null) result = caseValueSpec(category);
                if (result == null) result = caseNamedElement(category);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ResultsPackage.RESULT: {
                Result result = (Result)theEObject;
                T theResult = caseResult(result);
                if (theResult == null) theResult = caseNamedElement(result);
                if (theResult == null) theResult = defaultCase(theEObject);
                return theResult;
            }
            case ResultsPackage.XY: {
                XY xy = (XY)theEObject;
                T result = caseXY(xy);
                if (result == null) result = caseChartType(xy);
                if (result == null) result = caseNamedElement(xy);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ResultsPackage.BOX_AND_WHISKERS: {
                BoxAndWhiskers boxAndWhiskers = (BoxAndWhiskers)theEObject;
                T result = caseBoxAndWhiskers(boxAndWhiskers);
                if (result == null) result = caseChartType(boxAndWhiskers);
                if (result == null) result = caseNamedElement(boxAndWhiskers);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ResultsPackage.BAR: {
                Bar bar = (Bar)theEObject;
                T result = caseBar(bar);
                if (result == null) result = caseChartType(bar);
                if (result == null) result = caseNamedElement(bar);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ResultsPackage.RESULTS: {
                Results results = (Results)theEObject;
                T result = caseResults(results);
                if (result == null) result = caseChart(results);
                if (result == null) result = caseNamedElement(results);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ResultsPackage.EQUALS_CONSTRAINT: {
                EqualsConstraint equalsConstraint = (EqualsConstraint)theEObject;
                T result = caseEqualsConstraint(equalsConstraint);
                if (result == null) result = caseConstraint(equalsConstraint);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ResultsPackage.CONSTRAINT: {
                Constraint constraint = (Constraint)theEObject;
                T result = caseConstraint(constraint);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ResultsPackage.OR: {
                Or or = (Or)theEObject;
                T result = caseOr(or);
                if (result == null) result = caseConstraint(or);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Chart</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Chart</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseChart(Chart object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Chart Type</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Chart Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseChartType(ChartType object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Value Spec</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Value Spec</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseValueSpec(ValueSpec object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseNamedElement(NamedElement object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Axis</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Axis</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseAxis(Axis object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Series</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Series</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseSeries(Series object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Category</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Category</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseCategory(Category object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Result</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Result</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseResult(Result object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>XY</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>XY</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseXY(XY object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Box And Whiskers</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Box And Whiskers</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseBoxAndWhiskers(BoxAndWhiskers object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Bar</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Bar</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseBar(Bar object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Results</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Results</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseResults(Results object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Equals Constraint</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Equals Constraint</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseEqualsConstraint(EqualsConstraint object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Constraint</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Constraint</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseConstraint(Constraint object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Or</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Or</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseOr(Or object) {
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

} //ResultsSwitch
