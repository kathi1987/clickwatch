/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.recoder.cwdatabase.impl;

import java.lang.reflect.Method;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import org.apache.commons.math.stat.descriptive.SummaryStatistics;
import org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import de.hub.clickwatch.recoder.cwdatabase.CWDataBasePackage;
import de.hub.clickwatch.recoder.cwdatabase.ExperimentStatistics;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Experiment Statistics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.clickwatch.recoder.cwdatabase.impl.ExperimentStatisticsImpl#getNodesA <em>Nodes A</em>}</li>
 *   <li>{@link de.hub.clickwatch.recoder.cwdatabase.impl.ExperimentStatisticsImpl#getSamplesN <em>Samples N</em>}</li>
 *   <li>{@link de.hub.clickwatch.recoder.cwdatabase.impl.ExperimentStatisticsImpl#getHandlersN <em>Handlers N</em>}</li>
 *   <li>{@link de.hub.clickwatch.recoder.cwdatabase.impl.ExperimentStatisticsImpl#getHandlersPulledS <em>Handlers Pulled S</em>}</li>
 *   <li>{@link de.hub.clickwatch.recoder.cwdatabase.impl.ExperimentStatisticsImpl#getHandlersR <em>Handlers R</em>}</li>
 *   <li>{@link de.hub.clickwatch.recoder.cwdatabase.impl.ExperimentStatisticsImpl#getTimeA <em>Time A</em>}</li>
 *   <li>{@link de.hub.clickwatch.recoder.cwdatabase.impl.ExperimentStatisticsImpl#getTimeN <em>Time N</em>}</li>
 *   <li>{@link de.hub.clickwatch.recoder.cwdatabase.impl.ExperimentStatisticsImpl#getTimeS <em>Time S</em>}</li>
 *   <li>{@link de.hub.clickwatch.recoder.cwdatabase.impl.ExperimentStatisticsImpl#getSamplesPerSecond <em>Samples Per Second</em>}</li>
 *   <li>{@link de.hub.clickwatch.recoder.cwdatabase.impl.ExperimentStatisticsImpl#getRecordSize <em>Record Size</em>}</li>
 *   <li>{@link de.hub.clickwatch.recoder.cwdatabase.impl.ExperimentStatisticsImpl#getSamplesR <em>Samples R</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExperimentStatisticsImpl extends EObjectImpl implements ExperimentStatistics {
	/**
	 * The default value of the '{@link #getNodesA() <em>Nodes A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodesA()
	 * @generated
	 * @ordered
	 */
	protected static final SummaryStatistics NODES_A_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNodesA() <em>Nodes A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodesA()
	 * @generated
	 * @ordered
	 */
	protected SummaryStatistics nodesA = NODES_A_EDEFAULT;

	/**
	 * The default value of the '{@link #getSamplesN() <em>Samples N</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSamplesN()
	 * @generated
	 * @ordered
	 */
	protected static final SummaryStatistics SAMPLES_N_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSamplesN() <em>Samples N</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSamplesN()
	 * @generated
	 * @ordered
	 */
	protected SummaryStatistics samplesN = SAMPLES_N_EDEFAULT;

	/**
	 * The default value of the '{@link #getHandlersN() <em>Handlers N</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandlersN()
	 * @generated
	 * @ordered
	 */
	protected static final SummaryStatistics HANDLERS_N_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHandlersN() <em>Handlers N</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandlersN()
	 * @generated
	 * @ordered
	 */
	protected SummaryStatistics handlersN = HANDLERS_N_EDEFAULT;

	/**
	 * The default value of the '{@link #getHandlersPulledS() <em>Handlers Pulled S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandlersPulledS()
	 * @generated
	 * @ordered
	 */
	protected static final SummaryStatistics HANDLERS_PULLED_S_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHandlersPulledS() <em>Handlers Pulled S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandlersPulledS()
	 * @generated
	 * @ordered
	 */
	protected SummaryStatistics handlersPulledS = HANDLERS_PULLED_S_EDEFAULT;

	/**
	 * The default value of the '{@link #getHandlersR() <em>Handlers R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandlersR()
	 * @generated
	 * @ordered
	 */
	protected static final SummaryStatistics HANDLERS_R_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHandlersR() <em>Handlers R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandlersR()
	 * @generated
	 * @ordered
	 */
	protected SummaryStatistics handlersR = HANDLERS_R_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeA() <em>Time A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeA()
	 * @generated
	 * @ordered
	 */
	protected static final SummaryStatistics TIME_A_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeA() <em>Time A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeA()
	 * @generated
	 * @ordered
	 */
	protected SummaryStatistics timeA = TIME_A_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeN() <em>Time N</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeN()
	 * @generated
	 * @ordered
	 */
	protected static final SummaryStatistics TIME_N_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeN() <em>Time N</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeN()
	 * @generated
	 * @ordered
	 */
	protected SummaryStatistics timeN = TIME_N_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeS() <em>Time S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeS()
	 * @generated
	 * @ordered
	 */
	protected static final SummaryStatistics TIME_S_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeS() <em>Time S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeS()
	 * @generated
	 * @ordered
	 */
	protected SummaryStatistics timeS = TIME_S_EDEFAULT;

	/**
	 * The default value of the '{@link #getSamplesPerSecond() <em>Samples Per Second</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSamplesPerSecond()
	 * @generated
	 * @ordered
	 */
	protected static final double SAMPLES_PER_SECOND_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSamplesPerSecond() <em>Samples Per Second</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSamplesPerSecond()
	 * @generated
	 * @ordered
	 */
	protected double samplesPerSecond = SAMPLES_PER_SECOND_EDEFAULT;

	/**
	 * This is true if the Samples Per Second attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean samplesPerSecondESet;

	/**
	 * The default value of the '{@link #getRecordSize() <em>Record Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordSize()
	 * @generated
	 * @ordered
	 */
	protected static final SummaryStatistics RECORD_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRecordSize() <em>Record Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordSize()
	 * @generated
	 * @ordered
	 */
	protected SummaryStatistics recordSize = RECORD_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSamplesR() <em>Samples R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSamplesR()
	 * @generated
	 * @ordered
	 */
	protected static final SummaryStatistics SAMPLES_R_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSamplesR() <em>Samples R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSamplesR()
	 * @generated
	 * @ordered
	 */
	protected SummaryStatistics samplesR = SAMPLES_R_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExperimentStatisticsImpl() {
		super();
		initializeStatistics();
	}
	
	private void initializeStatistics() {
		nodesA = new SynchronizedSummaryStatistics();
		samplesN = new SynchronizedSummaryStatistics();
		handlersN = new SynchronizedSummaryStatistics();
		handlersPulledS = new SynchronizedSummaryStatistics();
		handlersR = new SynchronizedSummaryStatistics();
		samplesR = new SynchronizedSummaryStatistics();
		timeA = new SynchronizedSummaryStatistics();
		timeN = new SynchronizedSummaryStatistics();
		timeS = new SynchronizedSummaryStatistics();
		recordSize = new SynchronizedSummaryStatistics();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CWDataBasePackage.Literals.EXPERIMENT_STATISTICS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SummaryStatistics getNodesA() {
		return nodesA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodesA(SummaryStatistics newNodesA) {
		SummaryStatistics oldNodesA = nodesA;
		nodesA = newNodesA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CWDataBasePackage.EXPERIMENT_STATISTICS__NODES_A, oldNodesA, nodesA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SummaryStatistics getSamplesN() {
		return samplesN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSamplesN(SummaryStatistics newSamplesN) {
		SummaryStatistics oldSamplesN = samplesN;
		samplesN = newSamplesN;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CWDataBasePackage.EXPERIMENT_STATISTICS__SAMPLES_N, oldSamplesN, samplesN));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SummaryStatistics getHandlersN() {
		return handlersN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHandlersN(SummaryStatistics newHandlersN) {
		SummaryStatistics oldHandlersN = handlersN;
		handlersN = newHandlersN;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CWDataBasePackage.EXPERIMENT_STATISTICS__HANDLERS_N, oldHandlersN, handlersN));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SummaryStatistics getHandlersPulledS() {
		return handlersPulledS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHandlersPulledS(SummaryStatistics newHandlersPulledS) {
		SummaryStatistics oldHandlersPulledS = handlersPulledS;
		handlersPulledS = newHandlersPulledS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CWDataBasePackage.EXPERIMENT_STATISTICS__HANDLERS_PULLED_S, oldHandlersPulledS, handlersPulledS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SummaryStatistics getHandlersR() {
		return handlersR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHandlersR(SummaryStatistics newHandlersR) {
		SummaryStatistics oldHandlersR = handlersR;
		handlersR = newHandlersR;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CWDataBasePackage.EXPERIMENT_STATISTICS__HANDLERS_R, oldHandlersR, handlersR));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SummaryStatistics getTimeA() {
		return timeA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeA(SummaryStatistics newTimeA) {
		SummaryStatistics oldTimeA = timeA;
		timeA = newTimeA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CWDataBasePackage.EXPERIMENT_STATISTICS__TIME_A, oldTimeA, timeA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SummaryStatistics getTimeN() {
		return timeN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeN(SummaryStatistics newTimeN) {
		SummaryStatistics oldTimeN = timeN;
		timeN = newTimeN;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CWDataBasePackage.EXPERIMENT_STATISTICS__TIME_N, oldTimeN, timeN));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SummaryStatistics getTimeS() {
		return timeS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeS(SummaryStatistics newTimeS) {
		SummaryStatistics oldTimeS = timeS;
		timeS = newTimeS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CWDataBasePackage.EXPERIMENT_STATISTICS__TIME_S, oldTimeS, timeS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSamplesPerSecond() {
		return samplesPerSecond;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSamplesPerSecond(double newSamplesPerSecond) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSamplesPerSecond() {
		double oldSamplesPerSecond = samplesPerSecond;
		boolean oldSamplesPerSecondESet = samplesPerSecondESet;
		samplesPerSecond = SAMPLES_PER_SECOND_EDEFAULT;
		samplesPerSecondESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CWDataBasePackage.EXPERIMENT_STATISTICS__SAMPLES_PER_SECOND, oldSamplesPerSecond, SAMPLES_PER_SECOND_EDEFAULT, oldSamplesPerSecondESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSamplesPerSecond() {
		return samplesPerSecondESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SummaryStatistics getRecordSize() {
		return recordSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecordSize(SummaryStatistics newRecordSize) {
		SummaryStatistics oldRecordSize = recordSize;
		recordSize = newRecordSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CWDataBasePackage.EXPERIMENT_STATISTICS__RECORD_SIZE, oldRecordSize, recordSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SummaryStatistics getSamplesR() {
		return samplesR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSamplesR(SummaryStatistics newSamplesR) {
		SummaryStatistics oldSamplesR = samplesR;
		samplesR = newSamplesR;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CWDataBasePackage.EXPERIMENT_STATISTICS__SAMPLES_R, oldSamplesR, samplesR));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void reset() {
		initializeStatistics();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CWDataBasePackage.EXPERIMENT_STATISTICS__NODES_A:
				return getNodesA();
			case CWDataBasePackage.EXPERIMENT_STATISTICS__SAMPLES_N:
				return getSamplesN();
			case CWDataBasePackage.EXPERIMENT_STATISTICS__HANDLERS_N:
				return getHandlersN();
			case CWDataBasePackage.EXPERIMENT_STATISTICS__HANDLERS_PULLED_S:
				return getHandlersPulledS();
			case CWDataBasePackage.EXPERIMENT_STATISTICS__HANDLERS_R:
				return getHandlersR();
			case CWDataBasePackage.EXPERIMENT_STATISTICS__TIME_A:
				return getTimeA();
			case CWDataBasePackage.EXPERIMENT_STATISTICS__TIME_N:
				return getTimeN();
			case CWDataBasePackage.EXPERIMENT_STATISTICS__TIME_S:
				return getTimeS();
			case CWDataBasePackage.EXPERIMENT_STATISTICS__SAMPLES_PER_SECOND:
				return getSamplesPerSecond();
			case CWDataBasePackage.EXPERIMENT_STATISTICS__RECORD_SIZE:
				return getRecordSize();
			case CWDataBasePackage.EXPERIMENT_STATISTICS__SAMPLES_R:
				return getSamplesR();
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
			case CWDataBasePackage.EXPERIMENT_STATISTICS__NODES_A:
				setNodesA((SummaryStatistics)newValue);
				return;
			case CWDataBasePackage.EXPERIMENT_STATISTICS__SAMPLES_N:
				setSamplesN((SummaryStatistics)newValue);
				return;
			case CWDataBasePackage.EXPERIMENT_STATISTICS__HANDLERS_N:
				setHandlersN((SummaryStatistics)newValue);
				return;
			case CWDataBasePackage.EXPERIMENT_STATISTICS__HANDLERS_PULLED_S:
				setHandlersPulledS((SummaryStatistics)newValue);
				return;
			case CWDataBasePackage.EXPERIMENT_STATISTICS__HANDLERS_R:
				setHandlersR((SummaryStatistics)newValue);
				return;
			case CWDataBasePackage.EXPERIMENT_STATISTICS__TIME_A:
				setTimeA((SummaryStatistics)newValue);
				return;
			case CWDataBasePackage.EXPERIMENT_STATISTICS__TIME_N:
				setTimeN((SummaryStatistics)newValue);
				return;
			case CWDataBasePackage.EXPERIMENT_STATISTICS__TIME_S:
				setTimeS((SummaryStatistics)newValue);
				return;
			case CWDataBasePackage.EXPERIMENT_STATISTICS__SAMPLES_PER_SECOND:
				setSamplesPerSecond((Double)newValue);
				return;
			case CWDataBasePackage.EXPERIMENT_STATISTICS__RECORD_SIZE:
				setRecordSize((SummaryStatistics)newValue);
				return;
			case CWDataBasePackage.EXPERIMENT_STATISTICS__SAMPLES_R:
				setSamplesR((SummaryStatistics)newValue);
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
			case CWDataBasePackage.EXPERIMENT_STATISTICS__NODES_A:
				setNodesA(NODES_A_EDEFAULT);
				return;
			case CWDataBasePackage.EXPERIMENT_STATISTICS__SAMPLES_N:
				setSamplesN(SAMPLES_N_EDEFAULT);
				return;
			case CWDataBasePackage.EXPERIMENT_STATISTICS__HANDLERS_N:
				setHandlersN(HANDLERS_N_EDEFAULT);
				return;
			case CWDataBasePackage.EXPERIMENT_STATISTICS__HANDLERS_PULLED_S:
				setHandlersPulledS(HANDLERS_PULLED_S_EDEFAULT);
				return;
			case CWDataBasePackage.EXPERIMENT_STATISTICS__HANDLERS_R:
				setHandlersR(HANDLERS_R_EDEFAULT);
				return;
			case CWDataBasePackage.EXPERIMENT_STATISTICS__TIME_A:
				setTimeA(TIME_A_EDEFAULT);
				return;
			case CWDataBasePackage.EXPERIMENT_STATISTICS__TIME_N:
				setTimeN(TIME_N_EDEFAULT);
				return;
			case CWDataBasePackage.EXPERIMENT_STATISTICS__TIME_S:
				setTimeS(TIME_S_EDEFAULT);
				return;
			case CWDataBasePackage.EXPERIMENT_STATISTICS__SAMPLES_PER_SECOND:
				unsetSamplesPerSecond();
				return;
			case CWDataBasePackage.EXPERIMENT_STATISTICS__RECORD_SIZE:
				setRecordSize(RECORD_SIZE_EDEFAULT);
				return;
			case CWDataBasePackage.EXPERIMENT_STATISTICS__SAMPLES_R:
				setSamplesR(SAMPLES_R_EDEFAULT);
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
			case CWDataBasePackage.EXPERIMENT_STATISTICS__NODES_A:
				return NODES_A_EDEFAULT == null ? nodesA != null : !NODES_A_EDEFAULT.equals(nodesA);
			case CWDataBasePackage.EXPERIMENT_STATISTICS__SAMPLES_N:
				return SAMPLES_N_EDEFAULT == null ? samplesN != null : !SAMPLES_N_EDEFAULT.equals(samplesN);
			case CWDataBasePackage.EXPERIMENT_STATISTICS__HANDLERS_N:
				return HANDLERS_N_EDEFAULT == null ? handlersN != null : !HANDLERS_N_EDEFAULT.equals(handlersN);
			case CWDataBasePackage.EXPERIMENT_STATISTICS__HANDLERS_PULLED_S:
				return HANDLERS_PULLED_S_EDEFAULT == null ? handlersPulledS != null : !HANDLERS_PULLED_S_EDEFAULT.equals(handlersPulledS);
			case CWDataBasePackage.EXPERIMENT_STATISTICS__HANDLERS_R:
				return HANDLERS_R_EDEFAULT == null ? handlersR != null : !HANDLERS_R_EDEFAULT.equals(handlersR);
			case CWDataBasePackage.EXPERIMENT_STATISTICS__TIME_A:
				return TIME_A_EDEFAULT == null ? timeA != null : !TIME_A_EDEFAULT.equals(timeA);
			case CWDataBasePackage.EXPERIMENT_STATISTICS__TIME_N:
				return TIME_N_EDEFAULT == null ? timeN != null : !TIME_N_EDEFAULT.equals(timeN);
			case CWDataBasePackage.EXPERIMENT_STATISTICS__TIME_S:
				return TIME_S_EDEFAULT == null ? timeS != null : !TIME_S_EDEFAULT.equals(timeS);
			case CWDataBasePackage.EXPERIMENT_STATISTICS__SAMPLES_PER_SECOND:
				return isSetSamplesPerSecond();
			case CWDataBasePackage.EXPERIMENT_STATISTICS__RECORD_SIZE:
				return RECORD_SIZE_EDEFAULT == null ? recordSize != null : !RECORD_SIZE_EDEFAULT.equals(recordSize);
			case CWDataBasePackage.EXPERIMENT_STATISTICS__SAMPLES_R:
				return SAMPLES_R_EDEFAULT == null ? samplesR != null : !SAMPLES_R_EDEFAULT.equals(samplesR);
		}
		return super.eIsSet(featureID);
	}
	
	private final static String space =          "                           ";
	private static final String pattern = "###,###,###,###.00";
	private static NumberFormat format = new DecimalFormat(pattern);
	private static String format(double number) {
		String result = format.format(number);
		String space = "";
		for (int i = result.length(); i < pattern.length(); i++) {
			space += " ";
		}
		return space + result;
	}
	
	@Override
	public String toString() {
		StringBuffer result = new StringBuffer();
		for (Method method: getClass().getMethods()) {
			if (method.getName().startsWith("get") &&
					method.getReturnType().isAssignableFrom(SummaryStatistics.class) && 
					method.getParameterTypes().length == 0) {
				SummaryStatistics ss = null;
				try {
					ss = (SummaryStatistics)method.invoke(this, new Object[] {});
				} catch (Exception e) {
					throw new RuntimeException(e);
				}
				if (ss != null) {
					result.append("" + method.getName().substring(3) + ":" + space.substring(method.getName().substring(3).length()) 
							+ format(ss.getSum()) + " (sum)," 
							+ format(ss.getMean()) + " (avr),"  
							+ format(ss.getMax()) + " (max)," 
							+ format(ss.getStandardDeviation()) + " (dev)," 
							+ format(ss.getN()) + "(N)\n");
				}
			}
		}

		return "Statistics:\n" + result.toString();
	} 

} //ExperimentStatisticsImpl
