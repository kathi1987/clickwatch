/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.analysis.results.impl;

import de.hub.clickwatch.analysis.results.GraphLink;
import de.hub.clickwatch.analysis.results.GraphNode;
import de.hub.clickwatch.analysis.results.GraphResult;
import de.hub.clickwatch.analysis.results.ResultsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Graph Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.clickwatch.analysis.results.impl.GraphResultImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link de.hub.clickwatch.analysis.results.impl.GraphResultImpl#getLinks <em>Links</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GraphResultImpl extends ResultImpl implements GraphResult {
    /**
	 * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
    protected EList<GraphNode> nodes;

    /**
	 * The cached value of the '{@link #getLinks() <em>Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
    protected EList<GraphLink> links;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected GraphResultImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return ResultsPackage.Literals.GRAPH_RESULT;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<GraphNode> getNodes() {
		if (nodes == null) {
			nodes = new EObjectContainmentEList<GraphNode>(GraphNode.class, this, ResultsPackage.GRAPH_RESULT__NODES);
		}
		return nodes;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<GraphLink> getLinks() {
		if (links == null) {
			links = new EObjectContainmentEList<GraphLink>(GraphLink.class, this, ResultsPackage.GRAPH_RESULT__LINKS);
		}
		return links;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResultsPackage.GRAPH_RESULT__NODES:
				return ((InternalEList<?>)getNodes()).basicRemove(otherEnd, msgs);
			case ResultsPackage.GRAPH_RESULT__LINKS:
				return ((InternalEList<?>)getLinks()).basicRemove(otherEnd, msgs);
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
			case ResultsPackage.GRAPH_RESULT__NODES:
				return getNodes();
			case ResultsPackage.GRAPH_RESULT__LINKS:
				return getLinks();
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
			case ResultsPackage.GRAPH_RESULT__NODES:
				getNodes().clear();
				getNodes().addAll((Collection<? extends GraphNode>)newValue);
				return;
			case ResultsPackage.GRAPH_RESULT__LINKS:
				getLinks().clear();
				getLinks().addAll((Collection<? extends GraphLink>)newValue);
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
			case ResultsPackage.GRAPH_RESULT__NODES:
				getNodes().clear();
				return;
			case ResultsPackage.GRAPH_RESULT__LINKS:
				getLinks().clear();
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
			case ResultsPackage.GRAPH_RESULT__NODES:
				return nodes != null && !nodes.isEmpty();
			case ResultsPackage.GRAPH_RESULT__LINKS:
				return links != null && !links.isEmpty();
		}
		return super.eIsSet(featureID);
	}

    /**
     * @generated NOT
     */
    @Override
    public void exportCSV(String name) {
        throw new UnsupportedOperationException();
    }
    
    

} //GraphResultImpl
