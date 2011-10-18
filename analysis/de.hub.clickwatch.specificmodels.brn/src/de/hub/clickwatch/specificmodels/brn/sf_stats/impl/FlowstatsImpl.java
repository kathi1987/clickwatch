/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.sf_stats.impl;

import de.hub.clickwatch.specificmodels.brn.sf_stats.Flowstats;
import de.hub.clickwatch.specificmodels.brn.sf_stats.Rxflow;
import de.hub.clickwatch.specificmodels.brn.sf_stats.Sf_statsPackage;
import de.hub.clickwatch.specificmodels.brn.sf_stats.Stats;
import de.hub.clickwatch.specificmodels.brn.sf_stats.Txflow;

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
 * An implementation of the model object '<em><b>Flowstats</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.sf_stats.impl.FlowstatsImpl#getEContainer_flowstats <em>EContainer flowstats</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.sf_stats.impl.FlowstatsImpl#getText <em>Text</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.sf_stats.impl.FlowstatsImpl#getTxflow <em>Txflow</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.sf_stats.impl.FlowstatsImpl#getRxflow <em>Rxflow</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.sf_stats.impl.FlowstatsImpl#getNode <em>Node</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FlowstatsImpl extends EObjectImpl implements Flowstats {
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
	 * The cached value of the '{@link #getTxflow() <em>Txflow</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTxflow()
	 * @generated
	 * @ordered
	 */
	protected EList<Txflow> txflow;

	/**
	 * The cached value of the '{@link #getRxflow() <em>Rxflow</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRxflow()
	 * @generated
	 * @ordered
	 */
	protected EList<Rxflow> rxflow;

	/**
	 * The default value of the '{@link #getNode() <em>Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode()
	 * @generated
	 * @ordered
	 */
	protected static final String NODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNode() <em>Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode()
	 * @generated
	 * @ordered
	 */
	protected String node = NODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlowstatsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Sf_statsPackage.Literals.FLOWSTATS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stats getEContainer_flowstats() {
		if (eContainerFeatureID() != Sf_statsPackage.FLOWSTATS__ECONTAINER_FLOWSTATS) return null;
		return (Stats)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEContainer_flowstats(Stats newEContainer_flowstats, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEContainer_flowstats, Sf_statsPackage.FLOWSTATS__ECONTAINER_FLOWSTATS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEContainer_flowstats(Stats newEContainer_flowstats) {
		if (newEContainer_flowstats != eInternalContainer() || (eContainerFeatureID() != Sf_statsPackage.FLOWSTATS__ECONTAINER_FLOWSTATS && newEContainer_flowstats != null)) {
			if (EcoreUtil.isAncestor(this, newEContainer_flowstats))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEContainer_flowstats != null)
				msgs = ((InternalEObject)newEContainer_flowstats).eInverseAdd(this, Sf_statsPackage.STATS__FLOWSTATS, Stats.class, msgs);
			msgs = basicSetEContainer_flowstats(newEContainer_flowstats, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Sf_statsPackage.FLOWSTATS__ECONTAINER_FLOWSTATS, newEContainer_flowstats, newEContainer_flowstats));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getText() {
		if (text == null) {
			text = new EDataTypeEList<String>(String.class, this, Sf_statsPackage.FLOWSTATS__TEXT);
		}
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Txflow> getTxflow() {
		if (txflow == null) {
			txflow = new EObjectContainmentWithInverseEList<Txflow>(Txflow.class, this, Sf_statsPackage.FLOWSTATS__TXFLOW, Sf_statsPackage.TXFLOW__ECONTAINER_TXFLOW);
		}
		return txflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rxflow> getRxflow() {
		if (rxflow == null) {
			rxflow = new EObjectContainmentWithInverseEList<Rxflow>(Rxflow.class, this, Sf_statsPackage.FLOWSTATS__RXFLOW, Sf_statsPackage.RXFLOW__ECONTAINER_RXFLOW);
		}
		return rxflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNode() {
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNode(String newNode) {
		String oldNode = node;
		node = newNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Sf_statsPackage.FLOWSTATS__NODE, oldNode, node));
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
			case Sf_statsPackage.FLOWSTATS__ECONTAINER_FLOWSTATS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEContainer_flowstats((Stats)otherEnd, msgs);
			case Sf_statsPackage.FLOWSTATS__TXFLOW:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTxflow()).basicAdd(otherEnd, msgs);
			case Sf_statsPackage.FLOWSTATS__RXFLOW:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRxflow()).basicAdd(otherEnd, msgs);
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
			case Sf_statsPackage.FLOWSTATS__ECONTAINER_FLOWSTATS:
				return basicSetEContainer_flowstats(null, msgs);
			case Sf_statsPackage.FLOWSTATS__TXFLOW:
				return ((InternalEList<?>)getTxflow()).basicRemove(otherEnd, msgs);
			case Sf_statsPackage.FLOWSTATS__RXFLOW:
				return ((InternalEList<?>)getRxflow()).basicRemove(otherEnd, msgs);
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
			case Sf_statsPackage.FLOWSTATS__ECONTAINER_FLOWSTATS:
				return eInternalContainer().eInverseRemove(this, Sf_statsPackage.STATS__FLOWSTATS, Stats.class, msgs);
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
			case Sf_statsPackage.FLOWSTATS__ECONTAINER_FLOWSTATS:
				return getEContainer_flowstats();
			case Sf_statsPackage.FLOWSTATS__TEXT:
				return getText();
			case Sf_statsPackage.FLOWSTATS__TXFLOW:
				return getTxflow();
			case Sf_statsPackage.FLOWSTATS__RXFLOW:
				return getRxflow();
			case Sf_statsPackage.FLOWSTATS__NODE:
				return getNode();
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
			case Sf_statsPackage.FLOWSTATS__ECONTAINER_FLOWSTATS:
				setEContainer_flowstats((Stats)newValue);
				return;
			case Sf_statsPackage.FLOWSTATS__TEXT:
				getText().clear();
				getText().addAll((Collection<? extends String>)newValue);
				return;
			case Sf_statsPackage.FLOWSTATS__TXFLOW:
				getTxflow().clear();
				getTxflow().addAll((Collection<? extends Txflow>)newValue);
				return;
			case Sf_statsPackage.FLOWSTATS__RXFLOW:
				getRxflow().clear();
				getRxflow().addAll((Collection<? extends Rxflow>)newValue);
				return;
			case Sf_statsPackage.FLOWSTATS__NODE:
				setNode((String)newValue);
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
			case Sf_statsPackage.FLOWSTATS__ECONTAINER_FLOWSTATS:
				setEContainer_flowstats((Stats)null);
				return;
			case Sf_statsPackage.FLOWSTATS__TEXT:
				getText().clear();
				return;
			case Sf_statsPackage.FLOWSTATS__TXFLOW:
				getTxflow().clear();
				return;
			case Sf_statsPackage.FLOWSTATS__RXFLOW:
				getRxflow().clear();
				return;
			case Sf_statsPackage.FLOWSTATS__NODE:
				setNode(NODE_EDEFAULT);
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
			case Sf_statsPackage.FLOWSTATS__ECONTAINER_FLOWSTATS:
				return getEContainer_flowstats() != null;
			case Sf_statsPackage.FLOWSTATS__TEXT:
				return text != null && !text.isEmpty();
			case Sf_statsPackage.FLOWSTATS__TXFLOW:
				return txflow != null && !txflow.isEmpty();
			case Sf_statsPackage.FLOWSTATS__RXFLOW:
				return rxflow != null && !rxflow.isEmpty();
			case Sf_statsPackage.FLOWSTATS__NODE:
				return NODE_EDEFAULT == null ? node != null : !NODE_EDEFAULT.equals(node);
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
		result.append(", node: ");
		result.append(node);
		result.append(')');
		return result.toString();
	}

} //FlowstatsImpl
