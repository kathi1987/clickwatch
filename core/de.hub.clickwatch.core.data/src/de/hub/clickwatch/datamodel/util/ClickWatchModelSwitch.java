/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.datamodel.util;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import de.hub.clickwatch.datamodel.ClickWatchError;
import de.hub.clickwatch.datamodel.ClickWatchModelPackage;
import de.hub.clickwatch.datamodel.Element;
import de.hub.clickwatch.datamodel.Handler;
import de.hub.clickwatch.datamodel.ModelElementWithStatistics;
import de.hub.clickwatch.datamodel.Network;
import de.hub.clickwatch.datamodel.Node;
import de.hub.clickwatch.datamodel.Statistic;
import de.hub.clickwatch.datamodel.StatisticsContainer;


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
 * @see de.hub.clickwatch.datamodel.ClickWatchModelPackage
 * @generated
 */
public class ClickWatchModelSwitch<T> extends Switch<T> {
	/**
     * The cached model package
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected static ClickWatchModelPackage modelPackage;

	/**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ClickWatchModelSwitch() {
        if (modelPackage == null) {
            modelPackage = ClickWatchModelPackage.eINSTANCE;
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
            case ClickWatchModelPackage.NODE: {
                Node node = (Node)theEObject;
                T result = caseNode(node);
                if (result == null) result = caseModelElementWithStatistics(node);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ClickWatchModelPackage.ELEMENT: {
                Element element = (Element)theEObject;
                T result = caseElement(element);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ClickWatchModelPackage.HANDLER: {
                Handler handler = (Handler)theEObject;
                T result = caseHandler(handler);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ClickWatchModelPackage.NETWORK: {
                Network network = (Network)theEObject;
                T result = caseNetwork(network);
                if (result == null) result = caseModelElementWithStatistics(network);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ClickWatchModelPackage.MODEL_ELEMENT_WITH_STATISTICS: {
                ModelElementWithStatistics modelElementWithStatistics = (ModelElementWithStatistics)theEObject;
                T result = caseModelElementWithStatistics(modelElementWithStatistics);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ClickWatchModelPackage.STATISTICS_CONTAINER: {
                StatisticsContainer statisticsContainer = (StatisticsContainer)theEObject;
                T result = caseStatisticsContainer(statisticsContainer);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ClickWatchModelPackage.ESTRING_TO_STATISTIC_MAP: {
                @SuppressWarnings("unchecked") Map.Entry<String, Statistic> eStringToStatisticMap = (Map.Entry<String, Statistic>)theEObject;
                T result = caseEStringToStatisticMap(eStringToStatisticMap);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ClickWatchModelPackage.STATISTIC: {
                Statistic statistic = (Statistic)theEObject;
                T result = caseStatistic(statistic);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ClickWatchModelPackage.CLICK_WATCH_ERROR: {
                ClickWatchError clickWatchError = (ClickWatchError)theEObject;
                T result = caseClickWatchError(clickWatchError);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Node</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseNode(Node object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseElement(Element object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Handler</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Handler</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseHandler(Handler object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Network</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Network</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseNetwork(Network object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Statistics Container</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Statistics Container</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseStatisticsContainer(StatisticsContainer object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EString To Statistic Map</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EString To Statistic Map</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEStringToStatisticMap(Map.Entry<String, Statistic> object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Statistic</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Statistic</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseStatistic(Statistic object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Click Watch Error</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Click Watch Error</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseClickWatchError(ClickWatchError object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Model Element With Statistics</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Model Element With Statistics</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseModelElementWithStatistics(ModelElementWithStatistics object) {
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

} //ModelSwitch
