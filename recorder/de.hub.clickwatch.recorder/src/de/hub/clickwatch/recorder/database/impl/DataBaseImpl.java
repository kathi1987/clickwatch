/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.recorder.database.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.hub.clickwatch.model.impl.ModelElementWithStatisticsImpl;
import de.hub.clickwatch.recorder.database.CWDataBasePackage;
import de.hub.clickwatch.recorder.database.DataBase;
import de.hub.clickwatch.recorder.database.Record;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Base</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.clickwatch.recorder.database.impl.DataBaseImpl#getRecords <em>Records</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataBaseImpl extends ModelElementWithStatisticsImpl implements DataBase {
	/**
     * The cached value of the '{@link #getRecords() <em>Records</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getRecords()
     * @generated
     * @ordered
     */
	protected EList<Record> records;

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
	public EList<Record> getRecords() {
        if (records == null) {
            records = new EObjectContainmentEList<Record>(Record.class, this, CWDataBasePackage.DATA_BASE__RECORDS);
        }
        return records;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case CWDataBasePackage.DATA_BASE__RECORDS:
                return ((InternalEList<?>)getRecords()).basicRemove(otherEnd, msgs);
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
            case CWDataBasePackage.DATA_BASE__RECORDS:
                return getRecords();
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
            case CWDataBasePackage.DATA_BASE__RECORDS:
                getRecords().clear();
                getRecords().addAll((Collection<? extends Record>)newValue);
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
            case CWDataBasePackage.DATA_BASE__RECORDS:
                getRecords().clear();
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
            case CWDataBasePackage.DATA_BASE__RECORDS:
                return records != null && !records.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //DataBaseImpl
