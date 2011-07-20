/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.cwdatabase.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import de.hub.clickwatch.cwdatabase.CWDataBasePackage;
import de.hub.clickwatch.cwdatabase.DataBaseStatistics;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Base Statistics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.clickwatch.cwdatabase.impl.DataBaseStatisticsImpl#getHandlerCount <em>Handler Count</em>}</li>
 *   <li>{@link de.hub.clickwatch.cwdatabase.impl.DataBaseStatisticsImpl#getSampleCount <em>Sample Count</em>}</li>
 *   <li>{@link de.hub.clickwatch.cwdatabase.impl.DataBaseStatisticsImpl#getExperimentCount <em>Experiment Count</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataBaseStatisticsImpl extends EObjectImpl implements DataBaseStatistics {
	/**
	 * The default value of the '{@link #getHandlerCount() <em>Handler Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandlerCount()
	 * @generated
	 * @ordered
	 */
	protected static final long HANDLER_COUNT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getHandlerCount() <em>Handler Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandlerCount()
	 * @generated
	 * @ordered
	 */
	protected long handlerCount = HANDLER_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSampleCount() <em>Sample Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSampleCount()
	 * @generated
	 * @ordered
	 */
	protected static final long SAMPLE_COUNT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getSampleCount() <em>Sample Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSampleCount()
	 * @generated
	 * @ordered
	 */
	protected long sampleCount = SAMPLE_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getExperimentCount() <em>Experiment Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExperimentCount()
	 * @generated
	 * @ordered
	 */
	protected static final long EXPERIMENT_COUNT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getExperimentCount() <em>Experiment Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExperimentCount()
	 * @generated
	 * @ordered
	 */
	protected long experimentCount = EXPERIMENT_COUNT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataBaseStatisticsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CWDataBasePackage.Literals.DATA_BASE_STATISTICS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getHandlerCount() {
		return handlerCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHandlerCount(long newHandlerCount) {
		long oldHandlerCount = handlerCount;
		handlerCount = newHandlerCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CWDataBasePackage.DATA_BASE_STATISTICS__HANDLER_COUNT, oldHandlerCount, handlerCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getSampleCount() {
		return sampleCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSampleCount(long newSampleCount) {
		long oldSampleCount = sampleCount;
		sampleCount = newSampleCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CWDataBasePackage.DATA_BASE_STATISTICS__SAMPLE_COUNT, oldSampleCount, sampleCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getExperimentCount() {
		return experimentCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExperimentCount(long newExperimentCount) {
		long oldExperimentCount = experimentCount;
		experimentCount = newExperimentCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CWDataBasePackage.DATA_BASE_STATISTICS__EXPERIMENT_COUNT, oldExperimentCount, experimentCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CWDataBasePackage.DATA_BASE_STATISTICS__HANDLER_COUNT:
				return getHandlerCount();
			case CWDataBasePackage.DATA_BASE_STATISTICS__SAMPLE_COUNT:
				return getSampleCount();
			case CWDataBasePackage.DATA_BASE_STATISTICS__EXPERIMENT_COUNT:
				return getExperimentCount();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CWDataBasePackage.DATA_BASE_STATISTICS__HANDLER_COUNT:
				setHandlerCount((Long)newValue);
				return;
			case CWDataBasePackage.DATA_BASE_STATISTICS__SAMPLE_COUNT:
				setSampleCount((Long)newValue);
				return;
			case CWDataBasePackage.DATA_BASE_STATISTICS__EXPERIMENT_COUNT:
				setExperimentCount((Long)newValue);
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
			case CWDataBasePackage.DATA_BASE_STATISTICS__HANDLER_COUNT:
				setHandlerCount(HANDLER_COUNT_EDEFAULT);
				return;
			case CWDataBasePackage.DATA_BASE_STATISTICS__SAMPLE_COUNT:
				setSampleCount(SAMPLE_COUNT_EDEFAULT);
				return;
			case CWDataBasePackage.DATA_BASE_STATISTICS__EXPERIMENT_COUNT:
				setExperimentCount(EXPERIMENT_COUNT_EDEFAULT);
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
			case CWDataBasePackage.DATA_BASE_STATISTICS__HANDLER_COUNT:
				return handlerCount != HANDLER_COUNT_EDEFAULT;
			case CWDataBasePackage.DATA_BASE_STATISTICS__SAMPLE_COUNT:
				return sampleCount != SAMPLE_COUNT_EDEFAULT;
			case CWDataBasePackage.DATA_BASE_STATISTICS__EXPERIMENT_COUNT:
				return experimentCount != EXPERIMENT_COUNT_EDEFAULT;
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
		result.append(" (handlerCount: ");
		result.append(handlerCount);
		result.append(", sampleCount: ");
		result.append(sampleCount);
		result.append(", experimentCount: ");
		result.append(experimentCount);
		result.append(')');
		return result.toString();
	}

} //DataBaseStatisticsImpl
