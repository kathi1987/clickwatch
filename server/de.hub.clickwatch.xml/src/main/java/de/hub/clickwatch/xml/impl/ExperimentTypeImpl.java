/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.xml.impl;


import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.hub.clickwatch.xml.ConfigurationPackage;
import de.hub.clickwatch.xml.DatabaseType;
import de.hub.clickwatch.xml.ExperimentType;
import de.hub.clickwatch.xml.HandlerListType;
import de.hub.clickwatch.xml.NodeListType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Experiment Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.clickwatch.xml.impl.ExperimentTypeImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link de.hub.clickwatch.xml.impl.ExperimentTypeImpl#getHandlers <em>Handlers</em>}</li>
 *   <li>{@link de.hub.clickwatch.xml.impl.ExperimentTypeImpl#getDatabase <em>Database</em>}</li>
 *   <li>{@link de.hub.clickwatch.xml.impl.ExperimentTypeImpl#getLogDirectory <em>Log Directory</em>}</li>
 *   <li>{@link de.hub.clickwatch.xml.impl.ExperimentTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.hub.clickwatch.xml.impl.ExperimentTypeImpl#getStart <em>Start</em>}</li>
 *   <li>{@link de.hub.clickwatch.xml.impl.ExperimentTypeImpl#getStop <em>Stop</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExperimentTypeImpl extends EObjectImpl implements ExperimentType {
	/**
	 * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<NodeListType> nodes;

	/**
	 * The cached value of the '{@link #getHandlers() <em>Handlers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandlers()
	 * @generated
	 * @ordered
	 */
	protected EList<HandlerListType> handlers;

	/**
	 * The cached value of the '{@link #getDatabase() <em>Database</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabase()
	 * @generated
	 * @ordered
	 */
	protected EList<DatabaseType> database;

	/**
	 * The default value of the '{@link #getLogDirectory() <em>Log Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogDirectory()
	 * @generated
	 * @ordered
	 */
	protected static final String LOG_DIRECTORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLogDirectory() <em>Log Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogDirectory()
	 * @generated
	 * @ordered
	 */
	protected String logDirectory = LOG_DIRECTORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected static final String START_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected String start = START_EDEFAULT;

	/**
	 * The default value of the '{@link #getStop() <em>Stop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStop()
	 * @generated
	 * @ordered
	 */
	protected static final String STOP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStop() <em>Stop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStop()
	 * @generated
	 * @ordered
	 */
	protected String stop = STOP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExperimentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return de.hub.clickwatch.xml.ConfigurationPackage.Literals.EXPERIMENT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NodeListType> getNodes() {
		if (nodes == null) {
			nodes = new EObjectContainmentEList<NodeListType>(NodeListType.class, this, ConfigurationPackage.EXPERIMENT_TYPE__NODES);
		}
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HandlerListType> getHandlers() {
		if (handlers == null) {
			handlers = new EObjectContainmentEList<HandlerListType>(HandlerListType.class, this, ConfigurationPackage.EXPERIMENT_TYPE__HANDLERS);
		}
		return handlers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DatabaseType> getDatabase() {
		if (database == null) {
			database = new EObjectContainmentEList<DatabaseType>(DatabaseType.class, this, ConfigurationPackage.EXPERIMENT_TYPE__DATABASE);
		}
		return database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLogDirectory() {
		return logDirectory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogDirectory(String newLogDirectory) {
		String oldLogDirectory = logDirectory;
		logDirectory = newLogDirectory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.EXPERIMENT_TYPE__LOG_DIRECTORY, oldLogDirectory, logDirectory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.EXPERIMENT_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(String newStart) {
		String oldStart = start;
		start = newStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.EXPERIMENT_TYPE__START, oldStart, start));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStop() {
		return stop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStop(String newStop) {
		String oldStop = stop;
		stop = newStop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.EXPERIMENT_TYPE__STOP, oldStop, stop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConfigurationPackage.EXPERIMENT_TYPE__NODES:
				return ((InternalEList<?>)getNodes()).basicRemove(otherEnd, msgs);
			case ConfigurationPackage.EXPERIMENT_TYPE__HANDLERS:
				return ((InternalEList<?>)getHandlers()).basicRemove(otherEnd, msgs);
			case ConfigurationPackage.EXPERIMENT_TYPE__DATABASE:
				return ((InternalEList<?>)getDatabase()).basicRemove(otherEnd, msgs);
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
			case ConfigurationPackage.EXPERIMENT_TYPE__NODES:
				return getNodes();
			case ConfigurationPackage.EXPERIMENT_TYPE__HANDLERS:
				return getHandlers();
			case ConfigurationPackage.EXPERIMENT_TYPE__DATABASE:
				return getDatabase();
			case ConfigurationPackage.EXPERIMENT_TYPE__LOG_DIRECTORY:
				return getLogDirectory();
			case ConfigurationPackage.EXPERIMENT_TYPE__NAME:
				return getName();
			case ConfigurationPackage.EXPERIMENT_TYPE__START:
				return getStart();
			case ConfigurationPackage.EXPERIMENT_TYPE__STOP:
				return getStop();
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
			case ConfigurationPackage.EXPERIMENT_TYPE__NODES:
				getNodes().clear();
				getNodes().addAll((Collection<? extends NodeListType>)newValue);
				return;
			case ConfigurationPackage.EXPERIMENT_TYPE__HANDLERS:
				getHandlers().clear();
				getHandlers().addAll((Collection<? extends HandlerListType>)newValue);
				return;
			case ConfigurationPackage.EXPERIMENT_TYPE__DATABASE:
				getDatabase().clear();
				getDatabase().addAll((Collection<? extends DatabaseType>)newValue);
				return;
			case ConfigurationPackage.EXPERIMENT_TYPE__LOG_DIRECTORY:
				setLogDirectory((String)newValue);
				return;
			case ConfigurationPackage.EXPERIMENT_TYPE__NAME:
				setName((String)newValue);
				return;
			case ConfigurationPackage.EXPERIMENT_TYPE__START:
				setStart((String)newValue);
				return;
			case ConfigurationPackage.EXPERIMENT_TYPE__STOP:
				setStop((String)newValue);
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
			case ConfigurationPackage.EXPERIMENT_TYPE__NODES:
				getNodes().clear();
				return;
			case ConfigurationPackage.EXPERIMENT_TYPE__HANDLERS:
				getHandlers().clear();
				return;
			case ConfigurationPackage.EXPERIMENT_TYPE__DATABASE:
				getDatabase().clear();
				return;
			case ConfigurationPackage.EXPERIMENT_TYPE__LOG_DIRECTORY:
				setLogDirectory(LOG_DIRECTORY_EDEFAULT);
				return;
			case ConfigurationPackage.EXPERIMENT_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ConfigurationPackage.EXPERIMENT_TYPE__START:
				setStart(START_EDEFAULT);
				return;
			case ConfigurationPackage.EXPERIMENT_TYPE__STOP:
				setStop(STOP_EDEFAULT);
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
			case ConfigurationPackage.EXPERIMENT_TYPE__NODES:
				return nodes != null && !nodes.isEmpty();
			case ConfigurationPackage.EXPERIMENT_TYPE__HANDLERS:
				return handlers != null && !handlers.isEmpty();
			case ConfigurationPackage.EXPERIMENT_TYPE__DATABASE:
				return database != null && !database.isEmpty();
			case ConfigurationPackage.EXPERIMENT_TYPE__LOG_DIRECTORY:
				return LOG_DIRECTORY_EDEFAULT == null ? logDirectory != null : !LOG_DIRECTORY_EDEFAULT.equals(logDirectory);
			case ConfigurationPackage.EXPERIMENT_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ConfigurationPackage.EXPERIMENT_TYPE__START:
				return START_EDEFAULT == null ? start != null : !START_EDEFAULT.equals(start);
			case ConfigurationPackage.EXPERIMENT_TYPE__STOP:
				return STOP_EDEFAULT == null ? stop != null : !STOP_EDEFAULT.equals(stop);
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
		result.append(" (logDirectory: ");
		result.append(logDirectory);
		result.append(", name: ");
		result.append(name);
		result.append(", start: ");
		result.append(start);
		result.append(", stop: ");
		result.append(stop);
		result.append(')');
		return result.toString();
	}

} //ExperimentTypeImpl
