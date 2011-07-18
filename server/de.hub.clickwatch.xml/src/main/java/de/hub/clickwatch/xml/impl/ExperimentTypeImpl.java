/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.xml.impl;



import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

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
 *   <li>{@link Configuration.impl.ExperimentTypeImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link Configuration.impl.ExperimentTypeImpl#getHandlers <em>Handlers</em>}</li>
 *   <li>{@link Configuration.impl.ExperimentTypeImpl#getDatabase <em>Database</em>}</li>
 *   <li>{@link Configuration.impl.ExperimentTypeImpl#getLogDirectory <em>Log Directory</em>}</li>
 *   <li>{@link Configuration.impl.ExperimentTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link Configuration.impl.ExperimentTypeImpl#getStart <em>Start</em>}</li>
 *   <li>{@link Configuration.impl.ExperimentTypeImpl#getStop <em>Stop</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExperimentTypeImpl extends EObjectImpl implements ExperimentType {
	/**
	 * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected NodeListType nodes;

	/**
	 * The cached value of the '{@link #getHandlers() <em>Handlers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandlers()
	 * @generated
	 * @ordered
	 */
	protected HandlerListType handlers;

	/**
	 * The cached value of the '{@link #getDatabase() <em>Database</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabase()
	 * @generated
	 * @ordered
	 */
	protected DatabaseType database;

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
		return ConfigurationPackage.Literals.EXPERIMENT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeListType getNodes() {
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNodes(NodeListType newNodes, NotificationChain msgs) {
		NodeListType oldNodes = nodes;
		nodes = newNodes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfigurationPackage.EXPERIMENT_TYPE__NODES, oldNodes, newNodes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodes(NodeListType newNodes) {
		if (newNodes != nodes) {
			NotificationChain msgs = null;
			if (nodes != null)
				msgs = ((InternalEObject)nodes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfigurationPackage.EXPERIMENT_TYPE__NODES, null, msgs);
			if (newNodes != null)
				msgs = ((InternalEObject)newNodes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfigurationPackage.EXPERIMENT_TYPE__NODES, null, msgs);
			msgs = basicSetNodes(newNodes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.EXPERIMENT_TYPE__NODES, newNodes, newNodes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HandlerListType getHandlers() {
		return handlers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHandlers(HandlerListType newHandlers, NotificationChain msgs) {
		HandlerListType oldHandlers = handlers;
		handlers = newHandlers;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfigurationPackage.EXPERIMENT_TYPE__HANDLERS, oldHandlers, newHandlers);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHandlers(HandlerListType newHandlers) {
		if (newHandlers != handlers) {
			NotificationChain msgs = null;
			if (handlers != null)
				msgs = ((InternalEObject)handlers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfigurationPackage.EXPERIMENT_TYPE__HANDLERS, null, msgs);
			if (newHandlers != null)
				msgs = ((InternalEObject)newHandlers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfigurationPackage.EXPERIMENT_TYPE__HANDLERS, null, msgs);
			msgs = basicSetHandlers(newHandlers, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.EXPERIMENT_TYPE__HANDLERS, newHandlers, newHandlers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseType getDatabase() {
		return database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatabase(DatabaseType newDatabase, NotificationChain msgs) {
		DatabaseType oldDatabase = database;
		database = newDatabase;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfigurationPackage.EXPERIMENT_TYPE__DATABASE, oldDatabase, newDatabase);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabase(DatabaseType newDatabase) {
		if (newDatabase != database) {
			NotificationChain msgs = null;
			if (database != null)
				msgs = ((InternalEObject)database).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfigurationPackage.EXPERIMENT_TYPE__DATABASE, null, msgs);
			if (newDatabase != null)
				msgs = ((InternalEObject)newDatabase).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfigurationPackage.EXPERIMENT_TYPE__DATABASE, null, msgs);
			msgs = basicSetDatabase(newDatabase, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.EXPERIMENT_TYPE__DATABASE, newDatabase, newDatabase));
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
				return basicSetNodes(null, msgs);
			case ConfigurationPackage.EXPERIMENT_TYPE__HANDLERS:
				return basicSetHandlers(null, msgs);
			case ConfigurationPackage.EXPERIMENT_TYPE__DATABASE:
				return basicSetDatabase(null, msgs);
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
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ConfigurationPackage.EXPERIMENT_TYPE__NODES:
				setNodes((NodeListType)newValue);
				return;
			case ConfigurationPackage.EXPERIMENT_TYPE__HANDLERS:
				setHandlers((HandlerListType)newValue);
				return;
			case ConfigurationPackage.EXPERIMENT_TYPE__DATABASE:
				setDatabase((DatabaseType)newValue);
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
				setNodes((NodeListType)null);
				return;
			case ConfigurationPackage.EXPERIMENT_TYPE__HANDLERS:
				setHandlers((HandlerListType)null);
				return;
			case ConfigurationPackage.EXPERIMENT_TYPE__DATABASE:
				setDatabase((DatabaseType)null);
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
				return nodes != null;
			case ConfigurationPackage.EXPERIMENT_TYPE__HANDLERS:
				return handlers != null;
			case ConfigurationPackage.EXPERIMENT_TYPE__DATABASE:
				return database != null;
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
