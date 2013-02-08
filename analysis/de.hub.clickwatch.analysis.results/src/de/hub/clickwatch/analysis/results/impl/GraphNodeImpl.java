/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.analysis.results.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.hub.clickwatch.analysis.results.GraphLink;
import de.hub.clickwatch.analysis.results.GraphNode;
import de.hub.clickwatch.analysis.results.ResultsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Graph Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.clickwatch.analysis.results.impl.GraphNodeImpl#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link de.hub.clickwatch.analysis.results.impl.GraphNodeImpl#getIncoming <em>Incoming</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GraphNodeImpl extends NamedElementImpl implements GraphNode {
    /**
	 * The cached value of the '{@link #getOutgoing() <em>Outgoing</em>}' reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getOutgoing()
	 * @generated
	 * @ordered
	 */
    protected EList<GraphLink> outgoing;

    /**
	 * The cached value of the '{@link #getIncoming() <em>Incoming</em>}' reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getIncoming()
	 * @generated
	 * @ordered
	 */
    protected EList<GraphLink> incoming;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected GraphNodeImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return ResultsPackage.Literals.GRAPH_NODE;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<GraphLink> getOutgoing() {
		if (outgoing == null) {
			outgoing = new EObjectWithInverseResolvingEList<GraphLink>(GraphLink.class, this, ResultsPackage.GRAPH_NODE__OUTGOING, ResultsPackage.GRAPH_LINK__SOURCE);
		}
		return outgoing;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<GraphLink> getIncoming() {
		if (incoming == null) {
			incoming = new EObjectWithInverseResolvingEList<GraphLink>(GraphLink.class, this, ResultsPackage.GRAPH_NODE__INCOMING, ResultsPackage.GRAPH_LINK__TARGET);
		}
		return incoming;
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
			case ResultsPackage.GRAPH_NODE__OUTGOING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoing()).basicAdd(otherEnd, msgs);
			case ResultsPackage.GRAPH_NODE__INCOMING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncoming()).basicAdd(otherEnd, msgs);
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
			case ResultsPackage.GRAPH_NODE__OUTGOING:
				return ((InternalEList<?>)getOutgoing()).basicRemove(otherEnd, msgs);
			case ResultsPackage.GRAPH_NODE__INCOMING:
				return ((InternalEList<?>)getIncoming()).basicRemove(otherEnd, msgs);
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
			case ResultsPackage.GRAPH_NODE__OUTGOING:
				return getOutgoing();
			case ResultsPackage.GRAPH_NODE__INCOMING:
				return getIncoming();
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
			case ResultsPackage.GRAPH_NODE__OUTGOING:
				getOutgoing().clear();
				getOutgoing().addAll((Collection<? extends GraphLink>)newValue);
				return;
			case ResultsPackage.GRAPH_NODE__INCOMING:
				getIncoming().clear();
				getIncoming().addAll((Collection<? extends GraphLink>)newValue);
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
			case ResultsPackage.GRAPH_NODE__OUTGOING:
				getOutgoing().clear();
				return;
			case ResultsPackage.GRAPH_NODE__INCOMING:
				getIncoming().clear();
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
			case ResultsPackage.GRAPH_NODE__OUTGOING:
				return outgoing != null && !outgoing.isEmpty();
			case ResultsPackage.GRAPH_NODE__INCOMING:
				return incoming != null && !incoming.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GraphNodeImpl
