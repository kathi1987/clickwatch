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
import de.hub.clickwatch.analysis.results.ResultsFactory;
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
 *   <li>{@link de.hub.clickwatch.analysis.results.impl.ResultImpl#getDataSet <em>Data Set</em>}</li>
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
	 * The cached value of the '{@link #getDataSet() <em>Data Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSet()
	 * @generated
	 * @ordered
	 */
	protected DataSet dataSet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected ResultImpl() {
		super();
		setDataSet(ResultsFactory.eINSTANCE.createDataSet());
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
	public DataSet getDataSet() {
		return dataSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataSet(DataSet newDataSet, NotificationChain msgs) {
		DataSet oldDataSet = dataSet;
		dataSet = newDataSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResultsPackage.RESULT__DATA_SET, oldDataSet, newDataSet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataSet(DataSet newDataSet) {
		if (newDataSet != dataSet) {
			NotificationChain msgs = null;
			if (dataSet != null)
				msgs = ((InternalEObject)dataSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResultsPackage.RESULT__DATA_SET, null, msgs);
			if (newDataSet != null)
				msgs = ((InternalEObject)newDataSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResultsPackage.RESULT__DATA_SET, null, msgs);
			msgs = basicSetDataSet(newDataSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultsPackage.RESULT__DATA_SET, newDataSet, newDataSet));
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
		if (getDataSet() != null) {
			for (DataEntry entry: getDataSet().getEntries()) {
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
			case ResultsPackage.RESULT__DATA_SET:
				return basicSetDataSet(null, msgs);
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
			case ResultsPackage.RESULT__DATA_SET:
				return getDataSet();
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
			case ResultsPackage.RESULT__DATA_SET:
				setDataSet((DataSet)newValue);
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
			case ResultsPackage.RESULT__DATA_SET:
				setDataSet((DataSet)null);
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
			case ResultsPackage.RESULT__DATA_SET:
				return dataSet != null;
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
		result.append(')');
		return result.toString();
	}

} //ResultImpl
