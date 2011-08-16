/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.lt_routes.impl;

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

import de.hub.clickwatch.specificmodels.brn.lt_routes.Lt_routesPackage;
import de.hub.clickwatch.specificmodels.brn.lt_routes.Route;
import de.hub.clickwatch.specificmodels.brn.lt_routes.Routes;
import de.hub.clickwatch.specificmodels.brn.lt_routes.Routetable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Routetable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.lt_routes.impl.RoutetableImpl#getEContainer_routetable <em>EContainer routetable</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.lt_routes.impl.RoutetableImpl#getText <em>Text</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.lt_routes.impl.RoutetableImpl#getRoute <em>Route</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.lt_routes.impl.RoutetableImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoutetableImpl extends EObjectImpl implements Routetable {
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
	 * The cached value of the '{@link #getRoute() <em>Route</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoute()
	 * @generated
	 * @ordered
	 */
	protected EList<Route> route;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoutetableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Lt_routesPackage.Literals.ROUTETABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Routes getEContainer_routetable() {
		if (eContainerFeatureID() != Lt_routesPackage.ROUTETABLE__ECONTAINER_ROUTETABLE) return null;
		return (Routes)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEContainer_routetable(Routes newEContainer_routetable, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEContainer_routetable, Lt_routesPackage.ROUTETABLE__ECONTAINER_ROUTETABLE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEContainer_routetable(Routes newEContainer_routetable) {
		if (newEContainer_routetable != eInternalContainer() || (eContainerFeatureID() != Lt_routesPackage.ROUTETABLE__ECONTAINER_ROUTETABLE && newEContainer_routetable != null)) {
			if (EcoreUtil.isAncestor(this, newEContainer_routetable))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEContainer_routetable != null)
				msgs = ((InternalEObject)newEContainer_routetable).eInverseAdd(this, Lt_routesPackage.ROUTES__ROUTETABLE, Routes.class, msgs);
			msgs = basicSetEContainer_routetable(newEContainer_routetable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lt_routesPackage.ROUTETABLE__ECONTAINER_ROUTETABLE, newEContainer_routetable, newEContainer_routetable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getText() {
		if (text == null) {
			text = new EDataTypeEList<String>(String.class, this, Lt_routesPackage.ROUTETABLE__TEXT);
		}
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Route> getRoute() {
		if (route == null) {
			route = new EObjectContainmentWithInverseEList<Route>(Route.class, this, Lt_routesPackage.ROUTETABLE__ROUTE, Lt_routesPackage.ROUTE__ECONTAINER_ROUTE);
		}
		return route;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lt_routesPackage.ROUTETABLE__ID, oldId, id));
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
			case Lt_routesPackage.ROUTETABLE__ECONTAINER_ROUTETABLE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEContainer_routetable((Routes)otherEnd, msgs);
			case Lt_routesPackage.ROUTETABLE__ROUTE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRoute()).basicAdd(otherEnd, msgs);
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
			case Lt_routesPackage.ROUTETABLE__ECONTAINER_ROUTETABLE:
				return basicSetEContainer_routetable(null, msgs);
			case Lt_routesPackage.ROUTETABLE__ROUTE:
				return ((InternalEList<?>)getRoute()).basicRemove(otherEnd, msgs);
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
			case Lt_routesPackage.ROUTETABLE__ECONTAINER_ROUTETABLE:
				return eInternalContainer().eInverseRemove(this, Lt_routesPackage.ROUTES__ROUTETABLE, Routes.class, msgs);
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
			case Lt_routesPackage.ROUTETABLE__ECONTAINER_ROUTETABLE:
				return getEContainer_routetable();
			case Lt_routesPackage.ROUTETABLE__TEXT:
				return getText();
			case Lt_routesPackage.ROUTETABLE__ROUTE:
				return getRoute();
			case Lt_routesPackage.ROUTETABLE__ID:
				return getId();
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
			case Lt_routesPackage.ROUTETABLE__ECONTAINER_ROUTETABLE:
				setEContainer_routetable((Routes)newValue);
				return;
			case Lt_routesPackage.ROUTETABLE__TEXT:
				getText().clear();
				getText().addAll((Collection<? extends String>)newValue);
				return;
			case Lt_routesPackage.ROUTETABLE__ROUTE:
				getRoute().clear();
				getRoute().addAll((Collection<? extends Route>)newValue);
				return;
			case Lt_routesPackage.ROUTETABLE__ID:
				setId((String)newValue);
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
			case Lt_routesPackage.ROUTETABLE__ECONTAINER_ROUTETABLE:
				setEContainer_routetable((Routes)null);
				return;
			case Lt_routesPackage.ROUTETABLE__TEXT:
				getText().clear();
				return;
			case Lt_routesPackage.ROUTETABLE__ROUTE:
				getRoute().clear();
				return;
			case Lt_routesPackage.ROUTETABLE__ID:
				setId(ID_EDEFAULT);
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
			case Lt_routesPackage.ROUTETABLE__ECONTAINER_ROUTETABLE:
				return getEContainer_routetable() != null;
			case Lt_routesPackage.ROUTETABLE__TEXT:
				return text != null && !text.isEmpty();
			case Lt_routesPackage.ROUTETABLE__ROUTE:
				return route != null && !route.isEmpty();
			case Lt_routesPackage.ROUTETABLE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //RoutetableImpl
