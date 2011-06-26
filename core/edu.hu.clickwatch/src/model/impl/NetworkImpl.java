/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package model.impl;

import model.ModelPackage;
import model.MultiNode;
import model.Network;
import model.Node;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Network</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link model.impl.NetworkImpl#getName <em>Name</em>}</li>
 *   <li>{@link model.impl.NetworkImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link model.impl.NetworkImpl#getAll <em>All</em>}</li>
 *   <li>{@link model.impl.NetworkImpl#getElementFilter <em>Element Filter</em>}</li>
 *   <li>{@link model.impl.NetworkImpl#getHandlerFilter <em>Handler Filter</em>}</li>
 *   <li>{@link model.impl.NetworkImpl#getUpdateIntervall <em>Update Intervall</em>}</li>
 *   <li>{@link model.impl.NetworkImpl#getSubnetworks <em>Subnetworks</em>}</li>
 *   <li>{@link model.impl.NetworkImpl#getTimeout <em>Timeout</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NetworkImpl extends CDOObjectImpl implements Network {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetworkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.NETWORK;
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
		return (String)eGet(ModelPackage.Literals.NETWORK__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(ModelPackage.Literals.NETWORK__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Node> getNodes() {
		return (EList<Node>)eGet(ModelPackage.Literals.NETWORK__NODES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiNode getAll() {
		return (MultiNode)eGet(ModelPackage.Literals.NETWORK__ALL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAll(MultiNode newAll) {
		eSet(ModelPackage.Literals.NETWORK__ALL, newAll);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getElementFilter() {
		return (String)eGet(ModelPackage.Literals.NETWORK__ELEMENT_FILTER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementFilter(String newElementFilter) {
		eSet(ModelPackage.Literals.NETWORK__ELEMENT_FILTER, newElementFilter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHandlerFilter() {
		return (String)eGet(ModelPackage.Literals.NETWORK__HANDLER_FILTER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHandlerFilter(String newHandlerFilter) {
		eSet(ModelPackage.Literals.NETWORK__HANDLER_FILTER, newHandlerFilter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getUpdateIntervall() {
		return (Integer)eGet(ModelPackage.Literals.NETWORK__UPDATE_INTERVALL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdateIntervall(int newUpdateIntervall) {
		eSet(ModelPackage.Literals.NETWORK__UPDATE_INTERVALL, newUpdateIntervall);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Network> getSubnetworks() {
		return (EList<Network>)eGet(ModelPackage.Literals.NETWORK__SUBNETWORKS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTimeout() {
		return (Integer)eGet(ModelPackage.Literals.NETWORK__TIMEOUT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeout(int newTimeout) {
		eSet(ModelPackage.Literals.NETWORK__TIMEOUT, newTimeout);
	}

} //NetworkImpl
