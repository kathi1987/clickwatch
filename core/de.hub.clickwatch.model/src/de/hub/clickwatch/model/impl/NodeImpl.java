/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.model.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import de.hub.clickwatch.model.BackboneType;
import de.hub.clickwatch.model.ClickWatchModelPackage;
import de.hub.clickwatch.model.Element;
import de.hub.clickwatch.model.Node;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.clickwatch.model.impl.NodeImpl#getINetAddress <em>INet Address</em>}</li>
 *   <li>{@link de.hub.clickwatch.model.impl.NodeImpl#getPort <em>Port</em>}</li>
 *   <li>{@link de.hub.clickwatch.model.impl.NodeImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link de.hub.clickwatch.model.impl.NodeImpl#isConnected <em>Connected</em>}</li>
 *   <li>{@link de.hub.clickwatch.model.impl.NodeImpl#getConnection <em>Connection</em>}</li>
 *   <li>{@link de.hub.clickwatch.model.impl.NodeImpl#getBackbone <em>Backbone</em>}</li>
 *   <li>{@link de.hub.clickwatch.model.impl.NodeImpl#isRetrieving <em>Retrieving</em>}</li>
 *   <li>{@link de.hub.clickwatch.model.impl.NodeImpl#isHasRecord <em>Has Record</em>}</li>
 *   <li>{@link de.hub.clickwatch.model.impl.NodeImpl#isRecording <em>Recording</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodeImpl extends CDOObjectImpl implements Node {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClickWatchModelPackage.Literals.NODE;
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
	public String getINetAddress() {
		return (String)eGet(ClickWatchModelPackage.Literals.NODE__INET_ADDRESS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setINetAddress(String newINetAddress) {
		eSet(ClickWatchModelPackage.Literals.NODE__INET_ADDRESS, newINetAddress);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPort() {
		return (String)eGet(ClickWatchModelPackage.Literals.NODE__PORT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort(String newPort) {
		eSet(ClickWatchModelPackage.Literals.NODE__PORT, newPort);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Element> getElements() {
		return (EList<Element>)eGet(ClickWatchModelPackage.Literals.NODE__ELEMENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isConnected() {
		return (Boolean)eGet(ClickWatchModelPackage.Literals.NODE__CONNECTED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnected(boolean newConnected) {
		eSet(ClickWatchModelPackage.Literals.NODE__CONNECTED, newConnected);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getConnection() {
		return (Object)eGet(ClickWatchModelPackage.Literals.NODE__CONNECTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnection(Object newConnection) {
		eSet(ClickWatchModelPackage.Literals.NODE__CONNECTION, newConnection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BackboneType getBackbone() {
		return (BackboneType)eGet(ClickWatchModelPackage.Literals.NODE__BACKBONE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackbone(BackboneType newBackbone) {
		eSet(ClickWatchModelPackage.Literals.NODE__BACKBONE, newBackbone);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRetrieving() {
		return (Boolean)eGet(ClickWatchModelPackage.Literals.NODE__RETRIEVING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRetrieving(boolean newRetrieving) {
		eSet(ClickWatchModelPackage.Literals.NODE__RETRIEVING, newRetrieving);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHasRecord() {
		return (Boolean)eGet(ClickWatchModelPackage.Literals.NODE__HAS_RECORD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasRecord(boolean newHasRecord) {
		eSet(ClickWatchModelPackage.Literals.NODE__HAS_RECORD, newHasRecord);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRecording() {
		return (Boolean)eGet(ClickWatchModelPackage.Literals.NODE__RECORDING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecording(boolean newRecording) {
		eSet(ClickWatchModelPackage.Literals.NODE__RECORDING, newRecording);
	}

} //NodeImpl
