/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package edu.hu.clickwatch.xml.impl;


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

import edu.hu.clickwatch.xml.CdoType;
import edu.hu.clickwatch.xml.ConfigurationPackage;
import edu.hu.clickwatch.xml.ConfigurationType;
import edu.hu.clickwatch.xml.NetworkType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.hu.clickwatch.xml.impl.ConfigurationTypeImpl#getNetwork <em>Network</em>}</li>
 *   <li>{@link edu.hu.clickwatch.xml.impl.ConfigurationTypeImpl#getCdo <em>Cdo</em>}</li>
 *   <li>{@link edu.hu.clickwatch.xml.impl.ConfigurationTypeImpl#getLogDirectory <em>Log Directory</em>}</li>
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
	 * The cached value of the '{@link #getCdo() <em>Cdo</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCdo()
	 * @generated
	 * @ordered
	 */
	protected EList<CdoType> cdo;

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
		return edu.hu.clickwatch.xml.ConfigurationPackage.Literals.CONFIGURATION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NetworkType> getNetwork() {
		if (network == null) {
			network = new EObjectContainmentEList<NetworkType>(NetworkType.class, this, ConfigurationPackage.CONFIGURATION_TYPE__NETWORK);
		}
		return network;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CdoType> getCdo() {
		if (cdo == null) {
			cdo = new EObjectContainmentEList<CdoType>(CdoType.class, this, ConfigurationPackage.CONFIGURATION_TYPE__CDO);
		}
		return cdo;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.CONFIGURATION_TYPE__LOG_DIRECTORY, oldLogDirectory, logDirectory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConfigurationPackage.CONFIGURATION_TYPE__NETWORK:
				return ((InternalEList<?>)getNetwork()).basicRemove(otherEnd, msgs);
			case ConfigurationPackage.CONFIGURATION_TYPE__CDO:
				return ((InternalEList<?>)getCdo()).basicRemove(otherEnd, msgs);
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
			case ConfigurationPackage.CONFIGURATION_TYPE__NETWORK:
				return getNetwork();
			case ConfigurationPackage.CONFIGURATION_TYPE__CDO:
				return getCdo();
			case ConfigurationPackage.CONFIGURATION_TYPE__LOG_DIRECTORY:
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
			case ConfigurationPackage.CONFIGURATION_TYPE__NETWORK:
				getNetwork().clear();
				getNetwork().addAll((Collection<? extends NetworkType>)newValue);
				return;
			case ConfigurationPackage.CONFIGURATION_TYPE__CDO:
				getCdo().clear();
				getCdo().addAll((Collection<? extends CdoType>)newValue);
				return;
			case ConfigurationPackage.CONFIGURATION_TYPE__LOG_DIRECTORY:
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
			case ConfigurationPackage.CONFIGURATION_TYPE__NETWORK:
				getNetwork().clear();
				return;
			case ConfigurationPackage.CONFIGURATION_TYPE__CDO:
				getCdo().clear();
				return;
			case ConfigurationPackage.CONFIGURATION_TYPE__LOG_DIRECTORY:
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
			case ConfigurationPackage.CONFIGURATION_TYPE__NETWORK:
				return network != null && !network.isEmpty();
			case ConfigurationPackage.CONFIGURATION_TYPE__CDO:
				return cdo != null && !cdo.isEmpty();
			case ConfigurationPackage.CONFIGURATION_TYPE__LOG_DIRECTORY:
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
