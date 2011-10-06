/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.seismo_small.impl;

import de.hub.clickwatch.specificmodels.brn.seismo_small.C;
import de.hub.clickwatch.specificmodels.brn.seismo_small.Seismo_smallPackage;
import de.hub.clickwatch.specificmodels.brn.seismo_small.Small;
import de.hub.clickwatch.specificmodels.brn.seismo_small.V;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>C</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.seismo_small.impl.CImpl#getEContainer_c <em>EContainer c</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.seismo_small.impl.CImpl#getText <em>Text</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.seismo_small.impl.CImpl#getV <em>V</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CImpl extends EObjectImpl implements C {
	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected EList<String> text;

	/**
	 * The cached value of the '{@link #getV() <em>V</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getV()
	 * @generated
	 * @ordered
	 */
	protected EList<V> v;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Seismo_smallPackage.Literals.C;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Small getEContainer_c() {
		if (eContainerFeatureID() != Seismo_smallPackage.C__ECONTAINER_C) return null;
		return (Small)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEContainer_c(Small newEContainer_c, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEContainer_c, Seismo_smallPackage.C__ECONTAINER_C, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEContainer_c(Small newEContainer_c) {
		if (newEContainer_c != eInternalContainer() || (eContainerFeatureID() != Seismo_smallPackage.C__ECONTAINER_C && newEContainer_c != null)) {
			if (EcoreUtil.isAncestor(this, newEContainer_c))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEContainer_c != null)
				msgs = ((InternalEObject)newEContainer_c).eInverseAdd(this, Seismo_smallPackage.SMALL__C, Small.class, msgs);
			msgs = basicSetEContainer_c(newEContainer_c, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Seismo_smallPackage.C__ECONTAINER_C, newEContainer_c, newEContainer_c));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getText() {
		if (text == null) {
			text = new EDataTypeEList<String>(String.class, this, Seismo_smallPackage.C__TEXT);
		}
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<V> getV() {
		if (v == null) {
			v = new EObjectContainmentWithInverseEList<V>(V.class, this, Seismo_smallPackage.C__V, Seismo_smallPackage.V__ECONTAINER_V);
		}
		return v;
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
			case Seismo_smallPackage.C__ECONTAINER_C:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEContainer_c((Small)otherEnd, msgs);
			case Seismo_smallPackage.C__V:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getV()).basicAdd(otherEnd, msgs);
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
			case Seismo_smallPackage.C__ECONTAINER_C:
				return basicSetEContainer_c(null, msgs);
			case Seismo_smallPackage.C__V:
				return ((InternalEList<?>)getV()).basicRemove(otherEnd, msgs);
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
			case Seismo_smallPackage.C__ECONTAINER_C:
				return eInternalContainer().eInverseRemove(this, Seismo_smallPackage.SMALL__C, Small.class, msgs);
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
			case Seismo_smallPackage.C__ECONTAINER_C:
				return getEContainer_c();
			case Seismo_smallPackage.C__TEXT:
				return getText();
			case Seismo_smallPackage.C__V:
				return getV();
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
			case Seismo_smallPackage.C__ECONTAINER_C:
				setEContainer_c((Small)newValue);
				return;
			case Seismo_smallPackage.C__TEXT:
				getText().clear();
				getText().addAll((Collection<? extends String>)newValue);
				return;
			case Seismo_smallPackage.C__V:
				getV().clear();
				getV().addAll((Collection<? extends V>)newValue);
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
			case Seismo_smallPackage.C__ECONTAINER_C:
				setEContainer_c((Small)null);
				return;
			case Seismo_smallPackage.C__TEXT:
				getText().clear();
				return;
			case Seismo_smallPackage.C__V:
				getV().clear();
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
			case Seismo_smallPackage.C__ECONTAINER_C:
				return getEContainer_c() != null;
			case Seismo_smallPackage.C__TEXT:
				return text != null && !text.isEmpty();
			case Seismo_smallPackage.C__V:
				return v != null && !v.isEmpty();
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
		result.append(" (text: ");
		result.append(text);
		result.append(')');
		return result.toString();
	}

} //CImpl
