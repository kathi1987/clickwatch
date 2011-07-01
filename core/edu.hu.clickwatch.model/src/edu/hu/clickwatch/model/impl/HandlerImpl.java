/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package edu.hu.clickwatch.model.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import edu.hu.clickwatch.model.ClickWatchModelPackage;
import edu.hu.clickwatch.model.Handler;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Handler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.hu.clickwatch.model.impl.HandlerImpl#getName <em>Name</em>}</li>
 *   <li>{@link edu.hu.clickwatch.model.impl.HandlerImpl#isCanRead <em>Can Read</em>}</li>
 *   <li>{@link edu.hu.clickwatch.model.impl.HandlerImpl#isCanWrite <em>Can Write</em>}</li>
 *   <li>{@link edu.hu.clickwatch.model.impl.HandlerImpl#isChanged <em>Changed</em>}</li>
 *   <li>{@link edu.hu.clickwatch.model.impl.HandlerImpl#isWatch <em>Watch</em>}</li>
 *   <li>{@link edu.hu.clickwatch.model.impl.HandlerImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link edu.hu.clickwatch.model.impl.HandlerImpl#getAny <em>Any</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HandlerImpl extends CDOObjectImpl implements Handler {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HandlerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClickWatchModelPackage.Literals.HANDLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(ClickWatchModelPackage.Literals.HANDLER__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(ClickWatchModelPackage.Literals.HANDLER__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCanRead() {
		return (Boolean)eGet(ClickWatchModelPackage.Literals.HANDLER__CAN_READ, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCanRead(boolean newCanRead) {
		eSet(ClickWatchModelPackage.Literals.HANDLER__CAN_READ, newCanRead);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCanWrite() {
		return (Boolean)eGet(ClickWatchModelPackage.Literals.HANDLER__CAN_WRITE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCanWrite(boolean newCanWrite) {
		eSet(ClickWatchModelPackage.Literals.HANDLER__CAN_WRITE, newCanWrite);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isChanged() {
		return (Boolean)eGet(ClickWatchModelPackage.Literals.HANDLER__CHANGED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChanged(boolean newChanged) {
		eSet(ClickWatchModelPackage.Literals.HANDLER__CHANGED, newChanged);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isWatch() {
		return (Boolean)eGet(ClickWatchModelPackage.Literals.HANDLER__WATCH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWatch(boolean newWatch) {
		eSet(ClickWatchModelPackage.Literals.HANDLER__WATCH, newWatch);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		return (FeatureMap)eGet(ClickWatchModelPackage.Literals.HANDLER__MIXED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		return (FeatureMap)eGet(ClickWatchModelPackage.Literals.HANDLER__ANY, true);
	}

} //HandlerImpl
