/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package edu.hu.clickwatch.model.impl;

import edu.hu.clickwatch.model.BackboneType;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import edu.hu.clickwatch.model.ClickWatchModelPackage;
import edu.hu.clickwatch.model.Element;
import edu.hu.clickwatch.model.Node;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.hu.clickwatch.model.impl.NodeImpl#getINetAdress <em>INet Adress</em>}</li>
 *   <li>{@link edu.hu.clickwatch.model.impl.NodeImpl#getPort <em>Port</em>}</li>
 *   <li>{@link edu.hu.clickwatch.model.impl.NodeImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link edu.hu.clickwatch.model.impl.NodeImpl#isConnected <em>Connected</em>}</li>
 *   <li>{@link edu.hu.clickwatch.model.impl.NodeImpl#getConnection <em>Connection</em>}</li>
 *   <li>{@link edu.hu.clickwatch.model.impl.NodeImpl#getBackbone <em>Backbone</em>}</li>
 *   <li>{@link edu.hu.clickwatch.model.impl.NodeImpl#isRetrieving <em>Retrieving</em>}</li>
 *   <li>{@link edu.hu.clickwatch.model.impl.NodeImpl#isHasRecord <em>Has Record</em>}</li>
 *   <li>{@link edu.hu.clickwatch.model.impl.NodeImpl#isRecording <em>Recording</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodeImpl extends EObjectImpl implements Node {
	/**
	 * The default value of the '{@link #getINetAdress() <em>INet Adress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getINetAdress()
	 * @generated
	 * @ordered
	 */
	protected static final String INET_ADRESS_EDEFAULT = "localhost";

	/**
	 * The cached value of the '{@link #getINetAdress() <em>INet Adress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getINetAdress()
	 * @generated
	 * @ordered
	 */
	protected String iNetAdress = INET_ADRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected static final String PORT_EDEFAULT = "7777";

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected String port = PORT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> elements;

	/**
	 * The default value of the '{@link #isConnected() <em>Connected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConnected()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONNECTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isConnected() <em>Connected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConnected()
	 * @generated
	 * @ordered
	 */
	protected boolean connected = CONNECTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getConnection() <em>Connection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnection()
	 * @generated
	 * @ordered
	 */
	protected static final Object CONNECTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConnection() <em>Connection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnection()
	 * @generated
	 * @ordered
	 */
	protected Object connection = CONNECTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getBackbone() <em>Backbone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackbone()
	 * @generated
	 * @ordered
	 */
	protected static final BackboneType BACKBONE_EDEFAULT = BackboneType.UNKNOWN;

	/**
	 * The cached value of the '{@link #getBackbone() <em>Backbone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackbone()
	 * @generated
	 * @ordered
	 */
	protected BackboneType backbone = BACKBONE_EDEFAULT;

	/**
	 * The default value of the '{@link #isRetrieving() <em>Retrieving</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRetrieving()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RETRIEVING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRetrieving() <em>Retrieving</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRetrieving()
	 * @generated
	 * @ordered
	 */
	protected boolean retrieving = RETRIEVING_EDEFAULT;

	/**
	 * The default value of the '{@link #isHasRecord() <em>Has Record</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasRecord()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_RECORD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHasRecord() <em>Has Record</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasRecord()
	 * @generated
	 * @ordered
	 */
	protected boolean hasRecord = HAS_RECORD_EDEFAULT;

	/**
	 * The default value of the '{@link #isRecording() <em>Recording</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRecording()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RECORDING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRecording() <em>Recording</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRecording()
	 * @generated
	 * @ordered
	 */
	protected boolean recording = RECORDING_EDEFAULT;

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
	public String getINetAdress() {
		return iNetAdress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setINetAdress(String newINetAdress) {
		String oldINetAdress = iNetAdress;
		iNetAdress = newINetAdress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClickWatchModelPackage.NODE__INET_ADRESS, oldINetAdress, iNetAdress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort(String newPort) {
		String oldPort = port;
		port = newPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClickWatchModelPackage.NODE__PORT, oldPort, port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<Element>(Element.class, this, ClickWatchModelPackage.NODE__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isConnected() {
		return connected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnected(boolean newConnected) {
		boolean oldConnected = connected;
		connected = newConnected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClickWatchModelPackage.NODE__CONNECTED, oldConnected, connected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getConnection() {
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnection(Object newConnection) {
		Object oldConnection = connection;
		connection = newConnection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClickWatchModelPackage.NODE__CONNECTION, oldConnection, connection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BackboneType getBackbone() {
		return backbone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackbone(BackboneType newBackbone) {
		BackboneType oldBackbone = backbone;
		backbone = newBackbone == null ? BACKBONE_EDEFAULT : newBackbone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClickWatchModelPackage.NODE__BACKBONE, oldBackbone, backbone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRetrieving() {
		return retrieving;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRetrieving(boolean newRetrieving) {
		boolean oldRetrieving = retrieving;
		retrieving = newRetrieving;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClickWatchModelPackage.NODE__RETRIEVING, oldRetrieving, retrieving));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHasRecord() {
		return hasRecord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasRecord(boolean newHasRecord) {
		boolean oldHasRecord = hasRecord;
		hasRecord = newHasRecord;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClickWatchModelPackage.NODE__HAS_RECORD, oldHasRecord, hasRecord));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRecording() {
		return recording;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecording(boolean newRecording) {
		boolean oldRecording = recording;
		recording = newRecording;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClickWatchModelPackage.NODE__RECORDING, oldRecording, recording));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ClickWatchModelPackage.NODE__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
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
			case ClickWatchModelPackage.NODE__INET_ADRESS:
				return getINetAdress();
			case ClickWatchModelPackage.NODE__PORT:
				return getPort();
			case ClickWatchModelPackage.NODE__ELEMENTS:
				return getElements();
			case ClickWatchModelPackage.NODE__CONNECTED:
				return isConnected();
			case ClickWatchModelPackage.NODE__CONNECTION:
				return getConnection();
			case ClickWatchModelPackage.NODE__BACKBONE:
				return getBackbone();
			case ClickWatchModelPackage.NODE__RETRIEVING:
				return isRetrieving();
			case ClickWatchModelPackage.NODE__HAS_RECORD:
				return isHasRecord();
			case ClickWatchModelPackage.NODE__RECORDING:
				return isRecording();
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
			case ClickWatchModelPackage.NODE__INET_ADRESS:
				setINetAdress((String)newValue);
				return;
			case ClickWatchModelPackage.NODE__PORT:
				setPort((String)newValue);
				return;
			case ClickWatchModelPackage.NODE__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends Element>)newValue);
				return;
			case ClickWatchModelPackage.NODE__CONNECTED:
				setConnected((Boolean)newValue);
				return;
			case ClickWatchModelPackage.NODE__CONNECTION:
				setConnection(newValue);
				return;
			case ClickWatchModelPackage.NODE__BACKBONE:
				setBackbone((BackboneType)newValue);
				return;
			case ClickWatchModelPackage.NODE__RETRIEVING:
				setRetrieving((Boolean)newValue);
				return;
			case ClickWatchModelPackage.NODE__HAS_RECORD:
				setHasRecord((Boolean)newValue);
				return;
			case ClickWatchModelPackage.NODE__RECORDING:
				setRecording((Boolean)newValue);
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
			case ClickWatchModelPackage.NODE__INET_ADRESS:
				setINetAdress(INET_ADRESS_EDEFAULT);
				return;
			case ClickWatchModelPackage.NODE__PORT:
				setPort(PORT_EDEFAULT);
				return;
			case ClickWatchModelPackage.NODE__ELEMENTS:
				getElements().clear();
				return;
			case ClickWatchModelPackage.NODE__CONNECTED:
				setConnected(CONNECTED_EDEFAULT);
				return;
			case ClickWatchModelPackage.NODE__CONNECTION:
				setConnection(CONNECTION_EDEFAULT);
				return;
			case ClickWatchModelPackage.NODE__BACKBONE:
				setBackbone(BACKBONE_EDEFAULT);
				return;
			case ClickWatchModelPackage.NODE__RETRIEVING:
				setRetrieving(RETRIEVING_EDEFAULT);
				return;
			case ClickWatchModelPackage.NODE__HAS_RECORD:
				setHasRecord(HAS_RECORD_EDEFAULT);
				return;
			case ClickWatchModelPackage.NODE__RECORDING:
				setRecording(RECORDING_EDEFAULT);
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
			case ClickWatchModelPackage.NODE__INET_ADRESS:
				return INET_ADRESS_EDEFAULT == null ? iNetAdress != null : !INET_ADRESS_EDEFAULT.equals(iNetAdress);
			case ClickWatchModelPackage.NODE__PORT:
				return PORT_EDEFAULT == null ? port != null : !PORT_EDEFAULT.equals(port);
			case ClickWatchModelPackage.NODE__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case ClickWatchModelPackage.NODE__CONNECTED:
				return connected != CONNECTED_EDEFAULT;
			case ClickWatchModelPackage.NODE__CONNECTION:
				return CONNECTION_EDEFAULT == null ? connection != null : !CONNECTION_EDEFAULT.equals(connection);
			case ClickWatchModelPackage.NODE__BACKBONE:
				return backbone != BACKBONE_EDEFAULT;
			case ClickWatchModelPackage.NODE__RETRIEVING:
				return retrieving != RETRIEVING_EDEFAULT;
			case ClickWatchModelPackage.NODE__HAS_RECORD:
				return hasRecord != HAS_RECORD_EDEFAULT;
			case ClickWatchModelPackage.NODE__RECORDING:
				return recording != RECORDING_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (iNetAdress: ");
		result.append(iNetAdress);
		result.append(", port: ");
		result.append(port);
		result.append(", connected: ");
		result.append(connected);
		result.append(", connection: ");
		result.append(connection);
		result.append(')');
		return result.toString();
	}	

} //NodeImpl
