/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.seismo_small.impl;

import de.hub.clickwatch.specificmodels.brn.seismo_small.C;
import de.hub.clickwatch.specificmodels.brn.seismo_small.Seismo_smallPackage;
import de.hub.clickwatch.specificmodels.brn.seismo_small.V;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>V</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.seismo_small.impl.VImpl#getEContainer_v <em>EContainer v</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.seismo_small.impl.VImpl#getT <em>T</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.seismo_small.impl.VImpl#getC0 <em>C0</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.seismo_small.impl.VImpl#getC1 <em>C1</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.seismo_small.impl.VImpl#getC2 <em>C2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VImpl extends EObjectImpl implements V {
	/**
	 * The default value of the '{@link #getT() <em>T</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getT()
	 * @generated
	 * @ordered
	 */
	protected static final long T_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getT() <em>T</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getT()
	 * @generated
	 * @ordered
	 */
	protected long t = T_EDEFAULT;

	/**
	 * The default value of the '{@link #getC0() <em>C0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC0()
	 * @generated
	 * @ordered
	 */
	protected static final int C0_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getC0() <em>C0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC0()
	 * @generated
	 * @ordered
	 */
	protected int c0 = C0_EDEFAULT;

	/**
	 * The default value of the '{@link #getC1() <em>C1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC1()
	 * @generated
	 * @ordered
	 */
	protected static final int C1_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getC1() <em>C1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC1()
	 * @generated
	 * @ordered
	 */
	protected int c1 = C1_EDEFAULT;

	/**
	 * The default value of the '{@link #getC2() <em>C2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC2()
	 * @generated
	 * @ordered
	 */
	protected static final int C2_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getC2() <em>C2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC2()
	 * @generated
	 * @ordered
	 */
	protected int c2 = C2_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Seismo_smallPackage.Literals.V;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public C getEContainer_v() {
		if (eContainerFeatureID() != Seismo_smallPackage.V__ECONTAINER_V) return null;
		return (C)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEContainer_v(C newEContainer_v, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEContainer_v, Seismo_smallPackage.V__ECONTAINER_V, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEContainer_v(C newEContainer_v) {
		if (newEContainer_v != eInternalContainer() || (eContainerFeatureID() != Seismo_smallPackage.V__ECONTAINER_V && newEContainer_v != null)) {
			if (EcoreUtil.isAncestor(this, newEContainer_v))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEContainer_v != null)
				msgs = ((InternalEObject)newEContainer_v).eInverseAdd(this, Seismo_smallPackage.C__V, C.class, msgs);
			msgs = basicSetEContainer_v(newEContainer_v, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Seismo_smallPackage.V__ECONTAINER_V, newEContainer_v, newEContainer_v));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getT() {
		return t;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setT(long newT) {
		long oldT = t;
		t = newT;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Seismo_smallPackage.V__T, oldT, t));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getC0() {
		return c0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setC0(int newC0) {
		int oldC0 = c0;
		c0 = newC0;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Seismo_smallPackage.V__C0, oldC0, c0));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getC1() {
		return c1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setC1(int newC1) {
		int oldC1 = c1;
		c1 = newC1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Seismo_smallPackage.V__C1, oldC1, c1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getC2() {
		return c2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setC2(int newC2) {
		int oldC2 = c2;
		c2 = newC2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Seismo_smallPackage.V__C2, oldC2, c2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Seismo_smallPackage.V__ECONTAINER_V:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEContainer_v((C)otherEnd, msgs);
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
			case Seismo_smallPackage.V__ECONTAINER_V:
				return basicSetEContainer_v(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case Seismo_smallPackage.V__ECONTAINER_V:
				return eInternalContainer().eInverseRemove(this, Seismo_smallPackage.C__V, C.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Seismo_smallPackage.V__ECONTAINER_V:
				return getEContainer_v();
			case Seismo_smallPackage.V__T:
				return getT();
			case Seismo_smallPackage.V__C0:
				return getC0();
			case Seismo_smallPackage.V__C1:
				return getC1();
			case Seismo_smallPackage.V__C2:
				return getC2();
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
			case Seismo_smallPackage.V__ECONTAINER_V:
				setEContainer_v((C)newValue);
				return;
			case Seismo_smallPackage.V__T:
				setT((Long)newValue);
				return;
			case Seismo_smallPackage.V__C0:
				setC0((Integer)newValue);
				return;
			case Seismo_smallPackage.V__C1:
				setC1((Integer)newValue);
				return;
			case Seismo_smallPackage.V__C2:
				setC2((Integer)newValue);
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
			case Seismo_smallPackage.V__ECONTAINER_V:
				setEContainer_v((C)null);
				return;
			case Seismo_smallPackage.V__T:
				setT(T_EDEFAULT);
				return;
			case Seismo_smallPackage.V__C0:
				setC0(C0_EDEFAULT);
				return;
			case Seismo_smallPackage.V__C1:
				setC1(C1_EDEFAULT);
				return;
			case Seismo_smallPackage.V__C2:
				setC2(C2_EDEFAULT);
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
			case Seismo_smallPackage.V__ECONTAINER_V:
				return getEContainer_v() != null;
			case Seismo_smallPackage.V__T:
				return t != T_EDEFAULT;
			case Seismo_smallPackage.V__C0:
				return c0 != C0_EDEFAULT;
			case Seismo_smallPackage.V__C1:
				return c1 != C1_EDEFAULT;
			case Seismo_smallPackage.V__C2:
				return c2 != C2_EDEFAULT;
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
		result.append(" (t: ");
		result.append(t);
		result.append(", c0: ");
		result.append(c0);
		result.append(", c1: ");
		result.append(c1);
		result.append(", c2: ");
		result.append(c2);
		result.append(')');
		return result.toString();
	}

} //VImpl
