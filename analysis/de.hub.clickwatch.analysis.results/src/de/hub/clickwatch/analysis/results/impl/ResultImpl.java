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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.hub.clickwatch.analysis.results.Chart;
import de.hub.clickwatch.analysis.results.DataEntry;
import de.hub.clickwatch.analysis.results.DataSet;
import de.hub.clickwatch.analysis.results.Result;
import de.hub.clickwatch.analysis.results.ResultsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.clickwatch.analysis.results.impl.ResultImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link de.hub.clickwatch.analysis.results.impl.ResultImpl#getCharts <em>Charts</em>}</li>
 *   <li>{@link de.hub.clickwatch.analysis.results.impl.ResultImpl#getData <em>Data</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResultImpl extends NamedElementImpl implements Result {
	/**
     * The default value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getTimestamp()
     * @generated
     * @ordered
     */
	protected static final Date TIMESTAMP_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getTimestamp()
     * @generated
     * @ordered
     */
	protected Date timestamp = TIMESTAMP_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected ResultImpl() {
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
        return ResultsPackage.Literals.RESULT;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Date getTimestamp() {
        return timestamp;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setTimestamp(Date newTimestamp) {
        Date oldTimestamp = timestamp;
        timestamp = newTimestamp;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ResultsPackage.RESULT__TIMESTAMP, oldTimestamp, timestamp));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<Chart> getCharts() {
        if (charts == null) {
            charts = new EObjectContainmentEList<Chart>(Chart.class, this, ResultsPackage.RESULT__CHARTS);
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
            eNotify(new ENotificationImpl(this, Notification.SET, ResultsPackage.RESULT__DATA, oldData, data));
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

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ResultsPackage.RESULT__CHARTS:
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
            case ResultsPackage.RESULT__TIMESTAMP:
                return getTimestamp();
            case ResultsPackage.RESULT__CHARTS:
                return getCharts();
            case ResultsPackage.RESULT__DATA:
                return getData();
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
            case ResultsPackage.RESULT__TIMESTAMP:
                setTimestamp((Date)newValue);
                return;
            case ResultsPackage.RESULT__CHARTS:
                getCharts().clear();
                getCharts().addAll((Collection<? extends Chart>)newValue);
                return;
            case ResultsPackage.RESULT__DATA:
                setData((DataSet)newValue);
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
            case ResultsPackage.RESULT__TIMESTAMP:
                setTimestamp(TIMESTAMP_EDEFAULT);
                return;
            case ResultsPackage.RESULT__CHARTS:
                getCharts().clear();
                return;
            case ResultsPackage.RESULT__DATA:
                setData(DATA_EDEFAULT);
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
            case ResultsPackage.RESULT__TIMESTAMP:
                return TIMESTAMP_EDEFAULT == null ? timestamp != null : !TIMESTAMP_EDEFAULT.equals(timestamp);
            case ResultsPackage.RESULT__CHARTS:
                return charts != null && !charts.isEmpty();
            case ResultsPackage.RESULT__DATA:
                return DATA_EDEFAULT == null ? data != null : !DATA_EDEFAULT.equals(data);
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
        result.append(" (timestamp: ");
        result.append(timestamp);
        result.append(", data: ");
        result.append(data);
        result.append(')');
        return result.toString();
    }

} //ResultImpl
