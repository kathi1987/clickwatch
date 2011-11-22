/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.analysis.results.impl;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.hub.clickwatch.analysis.results.DataEntry;
import de.hub.clickwatch.analysis.results.DataSet;
import de.hub.clickwatch.analysis.results.EqualsConstraint;
import de.hub.clickwatch.analysis.results.Result;
import de.hub.clickwatch.analysis.results.ResultsPackage;
import de.hub.clickwatch.analysis.results.ValueSpec;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Equals Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.clickwatch.analysis.results.impl.EqualsConstraintImpl#getConstraint <em>Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EqualsConstraintImpl extends ConstraintImpl implements EqualsConstraint {
	/**
     * The default value of the '{@link #getConstraint() <em>Constraint</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getConstraint()
     * @generated
     * @ordered
     */
	protected static final Object CONSTRAINT_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getConstraint() <em>Constraint</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getConstraint()
     * @generated
     * @ordered
     */
	protected Object constraint = CONSTRAINT_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected EqualsConstraintImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return ResultsPackage.Literals.EQUALS_CONSTRAINT;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Object getConstraint() {
        return constraint;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setConstraint(Object newConstraint) {
        Object oldConstraint = constraint;
        constraint = newConstraint;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ResultsPackage.EQUALS_CONSTRAINT__CONSTRAINT, oldConstraint, constraint));
    }

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Object> getValues() {
		HashSet<Object> values = new HashSet<Object>();
		
		EObject container = this;
		int column = -1;
		DataSet ds = null;
		loop: while (container != null) {
			if (container instanceof ValueSpec) {
				column = ((ValueSpec)container).getColumn();
			} else if (container instanceof Result) {
				ds = ((Result)container).getData();
				break loop;
			}
			container = container.eContainer();
		}
		for (DataEntry entry: ds.getEntries()) {
			values.add(entry.getValues()[column]);
		}
		EList<Object> theResult = new BasicEList<Object>();
		for (Object value: values) {
			theResult.add(value);
		}
		Collections.sort(theResult, new Comparator<Object>() {
			@Override
			public int compare(Object o1, Object o2) {
				return o1.toString().compareTo(o2.toString());
			}
		});
		return theResult;
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ResultsPackage.EQUALS_CONSTRAINT__CONSTRAINT:
                return getConstraint();
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
            case ResultsPackage.EQUALS_CONSTRAINT__CONSTRAINT:
                setConstraint(newValue);
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
            case ResultsPackage.EQUALS_CONSTRAINT__CONSTRAINT:
                setConstraint(CONSTRAINT_EDEFAULT);
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
            case ResultsPackage.EQUALS_CONSTRAINT__CONSTRAINT:
                return CONSTRAINT_EDEFAULT == null ? constraint != null : !CONSTRAINT_EDEFAULT.equals(constraint);
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
        result.append(" (constraint: ");
        result.append(constraint);
        result.append(')');
        return result.toString();
    }
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean evaluate(DataEntry entry) {
		Object constraint = getConstraint();
		EObject container = this;
		int column = -1;
		loop: while (container != null) {
			if (container instanceof ValueSpec) {
				column = ((ValueSpec)container).getColumn();
				break loop;
			}
			container = container.eContainer();
		}
		return constraint.equals(entry.getValues()[column]);
	}

} //EqualsConstraintImpl
