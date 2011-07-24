/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.recoder.cwdatabase.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.hub.clickwatch.recoder.cwdatabase.CWDataBasePackage;
import de.hub.clickwatch.recoder.cwdatabase.DataBase;
import de.hub.clickwatch.recoder.cwdatabase.ExperimentDescr;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Base</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.clickwatch.recoder.cwdatabase.impl.DataBaseImpl#getExperiments <em>Experiments</em>}</li>
 *   <li>{@link de.hub.clickwatch.recoder.cwdatabase.impl.DataBaseImpl#getStorageBaseFileString <em>Storage Base File String</em>}</li>
 *   <li>{@link de.hub.clickwatch.recoder.cwdatabase.impl.DataBaseImpl#getInMemory <em>In Memory</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataBaseImpl extends EObjectImpl implements DataBase {
	/**
	 * The cached value of the '{@link #getExperiments() <em>Experiments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExperiments()
	 * @generated
	 * @ordered
	 */
	protected EList<ExperimentDescr> experiments;

	/**
	 * The default value of the '{@link #getStorageBaseFileString() <em>Storage Base File String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorageBaseFileString()
	 * @generated
	 * @ordered
	 */
	protected static final String STORAGE_BASE_FILE_STRING_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getStorageBaseFileString() <em>Storage Base File String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorageBaseFileString()
	 * @generated
	 * @ordered
	 */
	protected String storageBaseFileString = STORAGE_BASE_FILE_STRING_EDEFAULT;

	/**
	 * The default value of the '{@link #getInMemory() <em>In Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInMemory()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IN_MEMORY_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getInMemory() <em>In Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInMemory()
	 * @generated
	 * @ordered
	 */
	protected Boolean inMemory = IN_MEMORY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataBaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CWDataBasePackage.Literals.DATA_BASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExperimentDescr> getExperiments() {
		if (experiments == null) {
			experiments = new EObjectContainmentWithInverseEList<ExperimentDescr>(ExperimentDescr.class, this, CWDataBasePackage.DATA_BASE__EXPERIMENTS, CWDataBasePackage.EXPERIMENT_DESCR__DATA_BASE);
		}
		return experiments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getStorageBaseFileString() {
		if (eResource() != null) {
			String lastSegment = eResource().getURI().lastSegment();
			String fileString = eResource().getURI().toString();
			if (lastSegment.contains(".cwdatabase") && fileString.endsWith(lastSegment)) {
				if (lastSegment.equals(fileString)) {
					return ".";
				} else {
					return fileString.substring(0, fileString.length() - lastSegment.length() - 1);
				}
			} else { 
				return fileString;
			}
		} else {
			return storageBaseFileString;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStorageBaseFileString(String newStorageBaseFileString) {
		String oldStorageBaseFileString = storageBaseFileString;
		storageBaseFileString = newStorageBaseFileString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CWDataBasePackage.DATA_BASE__STORAGE_BASE_FILE_STRING, oldStorageBaseFileString, storageBaseFileString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getInMemory() {
		return inMemory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInMemory(Boolean newInMemory) {
		Boolean oldInMemory = inMemory;
		inMemory = newInMemory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CWDataBasePackage.DATA_BASE__IN_MEMORY, oldInMemory, inMemory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CWDataBasePackage.DATA_BASE__EXPERIMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExperiments()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CWDataBasePackage.DATA_BASE__EXPERIMENTS:
				return ((InternalEList<?>)getExperiments()).basicRemove(otherEnd, msgs);
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
			case CWDataBasePackage.DATA_BASE__EXPERIMENTS:
				return getExperiments();
			case CWDataBasePackage.DATA_BASE__STORAGE_BASE_FILE_STRING:
				return getStorageBaseFileString();
			case CWDataBasePackage.DATA_BASE__IN_MEMORY:
				return getInMemory();
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
			case CWDataBasePackage.DATA_BASE__EXPERIMENTS:
				getExperiments().clear();
				getExperiments().addAll((Collection<? extends ExperimentDescr>)newValue);
				return;
			case CWDataBasePackage.DATA_BASE__STORAGE_BASE_FILE_STRING:
				setStorageBaseFileString((String)newValue);
				return;
			case CWDataBasePackage.DATA_BASE__IN_MEMORY:
				setInMemory((Boolean)newValue);
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
			case CWDataBasePackage.DATA_BASE__EXPERIMENTS:
				getExperiments().clear();
				return;
			case CWDataBasePackage.DATA_BASE__STORAGE_BASE_FILE_STRING:
				setStorageBaseFileString(STORAGE_BASE_FILE_STRING_EDEFAULT);
				return;
			case CWDataBasePackage.DATA_BASE__IN_MEMORY:
				setInMemory(IN_MEMORY_EDEFAULT);
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
			case CWDataBasePackage.DATA_BASE__EXPERIMENTS:
				return experiments != null && !experiments.isEmpty();
			case CWDataBasePackage.DATA_BASE__STORAGE_BASE_FILE_STRING:
				return STORAGE_BASE_FILE_STRING_EDEFAULT == null ? storageBaseFileString != null : !STORAGE_BASE_FILE_STRING_EDEFAULT.equals(storageBaseFileString);
			case CWDataBasePackage.DATA_BASE__IN_MEMORY:
				return IN_MEMORY_EDEFAULT == null ? inMemory != null : !IN_MEMORY_EDEFAULT.equals(inMemory);
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
		result.append(" (storageBaseFileString: ");
		result.append(storageBaseFileString);
		result.append(", inMemory: ");
		result.append(inMemory);
		result.append(')');
		return result.toString();
	}

} //DataBaseImpl
