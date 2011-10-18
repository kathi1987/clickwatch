/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats.impl;

import de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats.Dsr_route_stats;
import de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats.Route;
import de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats.Route_info;
import de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats.Routing_dsr_stats_statsPackage;

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
 * An implementation of the model object '<em><b>Route info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats.impl.Route_infoImpl#getEContainer_route_info <em>EContainer route info</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats.impl.Route_infoImpl#getText <em>Text</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats.impl.Route_infoImpl#getRoute <em>Route</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats.impl.Route_infoImpl#getSrc <em>Src</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats.impl.Route_infoImpl#getDst <em>Dst</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Route_infoImpl extends EObjectImpl implements Route_info {
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
	 * The default value of the '{@link #getSrc() <em>Src</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrc()
	 * @generated
	 * @ordered
	 */
	protected static final String SRC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSrc() <em>Src</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrc()
	 * @generated
	 * @ordered
	 */
	protected String src = SRC_EDEFAULT;

	/**
	 * The default value of the '{@link #getDst() <em>Dst</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDst()
	 * @generated
	 * @ordered
	 */
	protected static final String DST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDst() <em>Dst</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDst()
	 * @generated
	 * @ordered
	 */
	protected String dst = DST_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Route_infoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Routing_dsr_stats_statsPackage.Literals.ROUTE_INFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dsr_route_stats getEContainer_route_info() {
		if (eContainerFeatureID() != Routing_dsr_stats_statsPackage.ROUTE_INFO__ECONTAINER_ROUTE_INFO) return null;
		return (Dsr_route_stats)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEContainer_route_info(Dsr_route_stats newEContainer_route_info, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEContainer_route_info, Routing_dsr_stats_statsPackage.ROUTE_INFO__ECONTAINER_ROUTE_INFO, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEContainer_route_info(Dsr_route_stats newEContainer_route_info) {
		if (newEContainer_route_info != eInternalContainer() || (eContainerFeatureID() != Routing_dsr_stats_statsPackage.ROUTE_INFO__ECONTAINER_ROUTE_INFO && newEContainer_route_info != null)) {
			if (EcoreUtil.isAncestor(this, newEContainer_route_info))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEContainer_route_info != null)
				msgs = ((InternalEObject)newEContainer_route_info).eInverseAdd(this, Routing_dsr_stats_statsPackage.DSR_ROUTE_STATS__ROUTE_INFO, Dsr_route_stats.class, msgs);
			msgs = basicSetEContainer_route_info(newEContainer_route_info, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Routing_dsr_stats_statsPackage.ROUTE_INFO__ECONTAINER_ROUTE_INFO, newEContainer_route_info, newEContainer_route_info));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getText() {
		if (text == null) {
			text = new EDataTypeEList<String>(String.class, this, Routing_dsr_stats_statsPackage.ROUTE_INFO__TEXT);
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
			route = new EObjectContainmentWithInverseEList<Route>(Route.class, this, Routing_dsr_stats_statsPackage.ROUTE_INFO__ROUTE, Routing_dsr_stats_statsPackage.ROUTE__ECONTAINER_ROUTE);
		}
		return route;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSrc() {
		return src;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSrc(String newSrc) {
		String oldSrc = src;
		src = newSrc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Routing_dsr_stats_statsPackage.ROUTE_INFO__SRC, oldSrc, src));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDst() {
		return dst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDst(String newDst) {
		String oldDst = dst;
		dst = newDst;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Routing_dsr_stats_statsPackage.ROUTE_INFO__DST, oldDst, dst));
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
			case Routing_dsr_stats_statsPackage.ROUTE_INFO__ECONTAINER_ROUTE_INFO:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEContainer_route_info((Dsr_route_stats)otherEnd, msgs);
			case Routing_dsr_stats_statsPackage.ROUTE_INFO__ROUTE:
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
			case Routing_dsr_stats_statsPackage.ROUTE_INFO__ECONTAINER_ROUTE_INFO:
				return basicSetEContainer_route_info(null, msgs);
			case Routing_dsr_stats_statsPackage.ROUTE_INFO__ROUTE:
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
			case Routing_dsr_stats_statsPackage.ROUTE_INFO__ECONTAINER_ROUTE_INFO:
				return eInternalContainer().eInverseRemove(this, Routing_dsr_stats_statsPackage.DSR_ROUTE_STATS__ROUTE_INFO, Dsr_route_stats.class, msgs);
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
			case Routing_dsr_stats_statsPackage.ROUTE_INFO__ECONTAINER_ROUTE_INFO:
				return getEContainer_route_info();
			case Routing_dsr_stats_statsPackage.ROUTE_INFO__TEXT:
				return getText();
			case Routing_dsr_stats_statsPackage.ROUTE_INFO__ROUTE:
				return getRoute();
			case Routing_dsr_stats_statsPackage.ROUTE_INFO__SRC:
				return getSrc();
			case Routing_dsr_stats_statsPackage.ROUTE_INFO__DST:
				return getDst();
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
			case Routing_dsr_stats_statsPackage.ROUTE_INFO__ECONTAINER_ROUTE_INFO:
				setEContainer_route_info((Dsr_route_stats)newValue);
				return;
			case Routing_dsr_stats_statsPackage.ROUTE_INFO__TEXT:
				getText().clear();
				getText().addAll((Collection<? extends String>)newValue);
				return;
			case Routing_dsr_stats_statsPackage.ROUTE_INFO__ROUTE:
				getRoute().clear();
				getRoute().addAll((Collection<? extends Route>)newValue);
				return;
			case Routing_dsr_stats_statsPackage.ROUTE_INFO__SRC:
				setSrc((String)newValue);
				return;
			case Routing_dsr_stats_statsPackage.ROUTE_INFO__DST:
				setDst((String)newValue);
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
			case Routing_dsr_stats_statsPackage.ROUTE_INFO__ECONTAINER_ROUTE_INFO:
				setEContainer_route_info((Dsr_route_stats)null);
				return;
			case Routing_dsr_stats_statsPackage.ROUTE_INFO__TEXT:
				getText().clear();
				return;
			case Routing_dsr_stats_statsPackage.ROUTE_INFO__ROUTE:
				getRoute().clear();
				return;
			case Routing_dsr_stats_statsPackage.ROUTE_INFO__SRC:
				setSrc(SRC_EDEFAULT);
				return;
			case Routing_dsr_stats_statsPackage.ROUTE_INFO__DST:
				setDst(DST_EDEFAULT);
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
			case Routing_dsr_stats_statsPackage.ROUTE_INFO__ECONTAINER_ROUTE_INFO:
				return getEContainer_route_info() != null;
			case Routing_dsr_stats_statsPackage.ROUTE_INFO__TEXT:
				return text != null && !text.isEmpty();
			case Routing_dsr_stats_statsPackage.ROUTE_INFO__ROUTE:
				return route != null && !route.isEmpty();
			case Routing_dsr_stats_statsPackage.ROUTE_INFO__SRC:
				return SRC_EDEFAULT == null ? src != null : !SRC_EDEFAULT.equals(src);
			case Routing_dsr_stats_statsPackage.ROUTE_INFO__DST:
				return DST_EDEFAULT == null ? dst != null : !DST_EDEFAULT.equals(dst);
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
		result.append(", src: ");
		result.append(src);
		result.append(", dst: ");
		result.append(dst);
		result.append(')');
		return result.toString();
	}

} //Route_infoImpl
