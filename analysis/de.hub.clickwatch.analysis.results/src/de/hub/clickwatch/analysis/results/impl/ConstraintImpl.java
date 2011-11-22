/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.analysis.results.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import de.hub.clickwatch.analysis.results.Constraint;
import de.hub.clickwatch.analysis.results.DataEntry;
import de.hub.clickwatch.analysis.results.ResultsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class ConstraintImpl extends EObjectImpl implements Constraint {
	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected ConstraintImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return ResultsPackage.Literals.CONSTRAINT;
    }

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean evaluate(DataEntry entry) {
		throw new UnsupportedOperationException();
	}

} //ConstraintImpl
