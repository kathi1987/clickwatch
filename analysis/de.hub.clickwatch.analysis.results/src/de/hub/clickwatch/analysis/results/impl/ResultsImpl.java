/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.analysis.results.impl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.hub.clickwatch.analysis.results.DataEntry;
import de.hub.clickwatch.analysis.results.GraphResult;
import de.hub.clickwatch.analysis.results.NumericalResult;
import de.hub.clickwatch.analysis.results.Result;
import de.hub.clickwatch.analysis.results.Results;
import de.hub.clickwatch.analysis.results.ResultsFactory;
import de.hub.clickwatch.analysis.results.ResultsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Results</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.clickwatch.analysis.results.impl.ResultsImpl#getResults <em>Results</em>}</li>
 *   <li>{@link de.hub.clickwatch.analysis.results.impl.ResultsImpl#getGroups <em>Groups</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResultsImpl extends ChartImpl implements Results {
	/**
	 * The cached value of the '{@link #getResults() <em>Results</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResults()
	 * @generated
	 * @ordered
	 */
	protected EList<Result> results;

	/**
	 * The cached value of the '{@link #getGroups() <em>Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<Results> groups;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResultsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResultsPackage.Literals.RESULTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Result> getResults() {
		if (results == null) {
			results = new EObjectContainmentEList<Result>(Result.class, this, ResultsPackage.RESULTS__RESULTS);
		}
		return results;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Results> getGroups() {
		if (groups == null) {
			groups = new EObjectContainmentEList<Results>(Results.class, this, ResultsPackage.RESULTS__GROUPS);
		}
		return groups;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NumericalResult createNewNumericalResult(String name) {
		NumericalResult result = ResultsFactory.eINSTANCE.createNumericalResult();
		result.setName(name);
		result.setTimestamp(new Date());
		getResults().add(result);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Results createNewGroup(String name) {
		Results results = ResultsFactory.eINSTANCE.createResults();
		results.setName(name);
		getGroups().add(results);
		return results;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Result getResult(String name) {
		for (Result result: getResults()) {
			if (name.equals(result.getName())) {
				return result;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Results getGroup(String name) {
		for (Results group: getGroups()) {
			if (name.equals(group.getName())) {
				return group;
			}
		}
		return createNewGroup(name);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void exportCSV(String fileName) {
		PrintStream out = null;
		try {
			out = new PrintStream(new File(fileName));
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}
		for (Result result: getResults()) {
		    if (result instanceof NumericalResult) {
		        NumericalResult numResult = (NumericalResult)result;
    			if (numResult.getData() != null) {
    				for (DataEntry entry: numResult.getData().getEntries()) {
    					out.print(result.getName());
    					out.print(" ");
    					for (Object value: entry.getValues()) {
    						out.print(value);
    						out.print(" ");
    					}
    					out.print("\n");
    				}
    			}
		    }
		}
		out.close();
	}

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public GraphResult createNewGraphResult(String name) {
        GraphResult result = ResultsFactory.eINSTANCE.createGraphResult();
        result.setName(name);
        result.setTimestamp(new Date());
        getResults().add(result);
        return result;
    }

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResultsPackage.RESULTS__RESULTS:
				return ((InternalEList<?>)getResults()).basicRemove(otherEnd, msgs);
			case ResultsPackage.RESULTS__GROUPS:
				return ((InternalEList<?>)getGroups()).basicRemove(otherEnd, msgs);
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
			case ResultsPackage.RESULTS__RESULTS:
				return getResults();
			case ResultsPackage.RESULTS__GROUPS:
				return getGroups();
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
			case ResultsPackage.RESULTS__RESULTS:
				getResults().clear();
				getResults().addAll((Collection<? extends Result>)newValue);
				return;
			case ResultsPackage.RESULTS__GROUPS:
				getGroups().clear();
				getGroups().addAll((Collection<? extends Results>)newValue);
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
			case ResultsPackage.RESULTS__RESULTS:
				getResults().clear();
				return;
			case ResultsPackage.RESULTS__GROUPS:
				getGroups().clear();
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
			case ResultsPackage.RESULTS__RESULTS:
				return results != null && !results.isEmpty();
			case ResultsPackage.RESULTS__GROUPS:
				return groups != null && !groups.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ResultsImpl
