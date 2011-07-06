/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.xml.configuration.impl;

import de.hub.clickwatch.xml.configuration.ConfigurationType;
import de.hub.clickwatch.xml.configuration.DatabaseType;
import de.hub.clickwatch.xml.configuration.NetworkType;
import de.hub.clickwatch.xml.configuration.configurationPackage;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.clickwatch.xml.configuration.impl.ConfigurationTypeImpl#getNetwork <em>Network</em>}</li>
 *   <li>{@link de.hub.clickwatch.xml.configuration.impl.ConfigurationTypeImpl#getDatabase <em>Database</em>}</li>
 *   <li>{@link de.hub.clickwatch.xml.configuration.impl.ConfigurationTypeImpl#getLogDirectory <em>Log Directory</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConfigurationTypeImpl extends EObjectImpl implements ConfigurationType {
	/**
	 * The cached value of the '{@link #getNetwork() <em>Network</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetwork()
	 * @generated
	 * @ordered
	 */
	protected EList<NetworkType> network;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return configurationPackage.Literals.CONFIGURATION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NetworkType> getNetwork() {
		if (network == null) {
			network = new EObjectContainmentEList<NetworkType>(NetworkType.class, this, configurationPackage.CONFIGURATION_TYPE__NETWORK);
		}
		return network;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DatabaseType> getDatabase() {
		if (database == null) {
			database = new EObjectContainmentEList<DatabaseType>(DatabaseType.class, this, configurationPackage.CONFIGURATION_TYPE__DATABASE);
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
			eNotify(new ENotificationImpl(this, Notification.SET, configurationPackage.CONFIGURATION_TYPE__LOG_DIRECTORY, oldLogDirectory, logDirectory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case configurationPackage.CONFIGURATION_TYPE__NETWORK:
				return ((InternalEList<?>)getNetwork()).basicRemove(otherEnd, msgs);
			case configurationPackage.CONFIGURATION_TYPE__DATABASE:
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
			case configurationPackage.CONFIGURATION_TYPE__NETWORK:
				return getNetwork();
			case configurationPackage.CONFIGURATION_TYPE__DATABASE:
				return getDatabase();
			case configurationPackage.CONFIGURATION_TYPE__LOG_DIRECTORY:
				return getLogDirectory();
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
			case configurationPackage.CONFIGURATION_TYPE__NETWORK:
				getNetwork().clear();
				getNetwork().addAll((Collection<? extends NetworkType>)newValue);
				return;
			case configurationPackage.CONFIGURATION_TYPE__DATABASE:
				getDatabase().clear();
				getDatabase().addAll((Collection<? extends DatabaseType>)newValue);
				return;
			case configurationPackage.CONFIGURATION_TYPE__LOG_DIRECTORY:
				setLogDirectory((String)newValue);
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
			case configurationPackage.CONFIGURATION_TYPE__NETWORK:
				getNetwork().clear();
				return;
			case configurationPackage.CONFIGURATION_TYPE__DATABASE:
				getDatabase().clear();
				return;
			case configurationPackage.CONFIGURATION_TYPE__LOG_DIRECTORY:
				setLogDirectory(LOG_DIRECTORY_EDEFAULT);
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
			case configurationPackage.CONFIGURATION_TYPE__NETWORK:
				return network != null && !network.isEmpty();
			case configurationPackage.CONFIGURATION_TYPE__DATABASE:
				return database != null && !database.isEmpty();
			case configurationPackage.CONFIGURATION_TYPE__LOG_DIRECTORY:
				return LOG_DIRECTORY_EDEFAULT == null ? logDirectory != null : !LOG_DIRECTORY_EDEFAULT.equals(logDirectory);
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
		result.append(')');
		return result.toString();
	}

} //ConfigurationTypeImpl
