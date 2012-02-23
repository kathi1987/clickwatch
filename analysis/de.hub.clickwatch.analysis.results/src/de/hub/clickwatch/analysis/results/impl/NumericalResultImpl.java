/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.analysis.results.impl;

import de.hub.clickwatch.analysis.results.Chart;
import de.hub.clickwatch.analysis.results.DataResultSet;
import de.hub.clickwatch.analysis.results.DataEntry;
import de.hub.clickwatch.analysis.results.DataSet;
import de.hub.clickwatch.analysis.results.NumericalResult;
import de.hub.clickwatch.analysis.results.ResultsPackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Numerical Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.clickwatch.analysis.results.impl.NumericalResultImpl#getCharts <em>Charts</em>}</li>
 *   <li>{@link de.hub.clickwatch.analysis.results.impl.NumericalResultImpl#getData <em>Data</em>}</li>
 *   <li>{@link de.hub.clickwatch.analysis.results.impl.NumericalResultImpl#getDataResultSet <em>Data Result Set</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NumericalResultImpl extends ResultImpl implements NumericalResult {
    /**
	 * The cached value of the '{@link #getCharts() <em>Charts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getCharts()
	 * @generated
	 * @ordered
	 */
    protected EList<Chart> charts;

    /**
	 * The default value of the '{@link #getData() <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
    protected static final DataSet DATA_EDEFAULT = null;
    /**
	 * The cached value of the '{@link #getData() <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
    protected DataSet data = DATA_EDEFAULT;

    /**
	 * The cached value of the '{@link #getDataResultSet() <em>Data Result Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataResultSet()
	 * @generated
	 * @ordered
	 */
	protected DataResultSet dataResultSet;

				/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    protected NumericalResultImpl() {
        super();
        setData(new DataSetImpl());
    }

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return ResultsPackage.Literals.NUMERICAL_RESULT;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<Chart> getCharts() {
		if (charts == null) {
			charts = new EObjectContainmentEList<Chart>(Chart.class, this, ResultsPackage.NUMERICAL_RESULT__CHARTS);
		}
		return charts;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public DataSet getData() {
		return data;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setData(DataSet newData) {
		DataSet oldData = data;
		data = newData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultsPackage.NUMERICAL_RESULT__DATA, oldData, data));
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataResultSet getDataResultSet() {
		if (dataResultSet != null && dataResultSet.eIsProxy()) {
			InternalEObject oldDataResultSet = (InternalEObject)dataResultSet;
			dataResultSet = (DataResultSet)eResolveProxy(oldDataResultSet);
			if (dataResultSet != oldDataResultSet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResultsPackage.NUMERICAL_RESULT__DATA_RESULT_SET, oldDataResultSet, dataResultSet));
			}
		}
		return dataResultSet;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataResultSet basicGetDataResultSet() {
		return dataResultSet;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataResultSet(DataResultSet newDataResultSet) {
		DataResultSet oldDataResultSet = dataResultSet;
		dataResultSet = newDataResultSet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultsPackage.NUMERICAL_RESULT__DATA_RESULT_SET, oldDataResultSet, dataResultSet));
	}

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResultsPackage.NUMERICAL_RESULT__CHARTS:
				return ((InternalEList<?>)getCharts()).basicRemove(otherEnd, msgs);
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
			case ResultsPackage.NUMERICAL_RESULT__CHARTS:
				return getCharts();
			case ResultsPackage.NUMERICAL_RESULT__DATA:
				return getData();
			case ResultsPackage.NUMERICAL_RESULT__DATA_RESULT_SET:
				if (resolve) return getDataResultSet();
				return basicGetDataResultSet();
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
			case ResultsPackage.NUMERICAL_RESULT__CHARTS:
				getCharts().clear();
				getCharts().addAll((Collection<? extends Chart>)newValue);
				return;
			case ResultsPackage.NUMERICAL_RESULT__DATA:
				setData((DataSet)newValue);
				return;
			case ResultsPackage.NUMERICAL_RESULT__DATA_RESULT_SET:
				setDataResultSet((DataResultSet)newValue);
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
			case ResultsPackage.NUMERICAL_RESULT__CHARTS:
				getCharts().clear();
				return;
			case ResultsPackage.NUMERICAL_RESULT__DATA:
				setData(DATA_EDEFAULT);
				return;
			case ResultsPackage.NUMERICAL_RESULT__DATA_RESULT_SET:
				setDataResultSet((DataResultSet)null);
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
			case ResultsPackage.NUMERICAL_RESULT__CHARTS:
				return charts != null && !charts.isEmpty();
			case ResultsPackage.NUMERICAL_RESULT__DATA:
				return DATA_EDEFAULT == null ? data != null : !DATA_EDEFAULT.equals(data);
			case ResultsPackage.NUMERICAL_RESULT__DATA_RESULT_SET:
				return dataResultSet != null;
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
		result.append(" (data: ");
		result.append(data);
		result.append(')');
		return result.toString();
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
        if (getData() != null) {
            for (DataEntry entry: getData().getEntries()) {
                for (Object value: entry.getValues()) {
                    out.print(value);
                    out.print(" ");
                }
                out.print("\n");
            }
        }
        out.close();
    }

} //NumericalResultImpl
