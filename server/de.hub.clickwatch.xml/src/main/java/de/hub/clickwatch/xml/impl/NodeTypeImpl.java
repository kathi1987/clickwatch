/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.xml.impl;


import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import de.hub.clickwatch.xml.ConfigurationPackage;
import de.hub.clickwatch.xml.NodeType;
import de.hub.clickwatch.xml.ProtocolType;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.clickwatch.xml.impl.NodeTypeImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link de.hub.clickwatch.xml.impl.NodeTypeImpl#getElementFilter <em>Element Filter</em>}</li>
 *   <li>{@link de.hub.clickwatch.xml.impl.NodeTypeImpl#getHandlerFilter <em>Handler Filter</em>}</li>
 *   <li>{@link de.hub.clickwatch.xml.impl.NodeTypeImpl#getPort <em>Port</em>}</li>
 *   <li>{@link de.hub.clickwatch.xml.impl.NodeTypeImpl#getProtocol <em>Protocol</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodeTypeImpl extends EObjectImpl implements NodeType {
	/**
	 * The default value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected String address = ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getElementFilter() <em>Element Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementFilter()
	 * @generated
	 * @ordered
	 */
	protected static final String ELEMENT_FILTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getElementFilter() <em>Element Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementFilter()
	 * @generated
	 * @ordered
	 */
	protected String elementFilter = ELEMENT_FILTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getHandlerFilter() <em>Handler Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandlerFilter()
	 * @generated
	 * @ordered
	 */
	protected static final String HANDLER_FILTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHandlerFilter() <em>Handler Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandlerFilter()
	 * @generated
	 * @ordered
	 */
	protected String handlerFilter = HANDLER_FILTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger PORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected BigInteger port = PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected static final ProtocolType PROTOCOL_EDEFAULT = ProtocolType.TCP;

	/**
	 * The cached value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected ProtocolType protocol = PROTOCOL_EDEFAULT;

	/**
	 * This is true if the Protocol attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean protocolESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return de.hub.clickwatch.xml.ConfigurationPackage.Literals.NODE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddress(String newAddress) {
		String oldAddress = address;
		address = newAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.NODE_TYPE__ADDRESS, oldAddress, address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getElementFilter() {
		return elementFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementFilter(String newElementFilter) {
		String oldElementFilter = elementFilter;
		elementFilter = newElementFilter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.NODE_TYPE__ELEMENT_FILTER, oldElementFilter, elementFilter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHandlerFilter() {
		return handlerFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHandlerFilter(String newHandlerFilter) {
		String oldHandlerFilter = handlerFilter;
		handlerFilter = newHandlerFilter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.NODE_TYPE__HANDLER_FILTER, oldHandlerFilter, handlerFilter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort(BigInteger newPort) {
		BigInteger oldPort = port;
		port = newPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.NODE_TYPE__PORT, oldPort, port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolType getProtocol() {
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtocol(ProtocolType newProtocol) {
		ProtocolType oldProtocol = protocol;
		protocol = newProtocol == null ? PROTOCOL_EDEFAULT : newProtocol;
		boolean oldProtocolESet = protocolESet;
		protocolESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.NODE_TYPE__PROTOCOL, oldProtocol, protocol, !oldProtocolESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetProtocol() {
		ProtocolType oldProtocol = protocol;
		boolean oldProtocolESet = protocolESet;
		protocol = PROTOCOL_EDEFAULT;
		protocolESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ConfigurationPackage.NODE_TYPE__PROTOCOL, oldProtocol, PROTOCOL_EDEFAULT, oldProtocolESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetProtocol() {
		return protocolESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConfigurationPackage.NODE_TYPE__ADDRESS:
				return getAddress();
			case ConfigurationPackage.NODE_TYPE__ELEMENT_FILTER:
				return getElementFilter();
			case ConfigurationPackage.NODE_TYPE__HANDLER_FILTER:
				return getHandlerFilter();
			case ConfigurationPackage.NODE_TYPE__PORT:
				return getPort();
			case ConfigurationPackage.NODE_TYPE__PROTOCOL:
				return getProtocol();
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
			case ConfigurationPackage.NODE_TYPE__ADDRESS:
				setAddress((String)newValue);
				return;
			case ConfigurationPackage.NODE_TYPE__ELEMENT_FILTER:
				setElementFilter((String)newValue);
				return;
			case ConfigurationPackage.NODE_TYPE__HANDLER_FILTER:
				setHandlerFilter((String)newValue);
				return;
			case ConfigurationPackage.NODE_TYPE__PORT:
				setPort((BigInteger)newValue);
				return;
			case ConfigurationPackage.NODE_TYPE__PROTOCOL:
				setProtocol((ProtocolType)newValue);
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
			case ConfigurationPackage.NODE_TYPE__ADDRESS:
				setAddress(ADDRESS_EDEFAULT);
				return;
			case ConfigurationPackage.NODE_TYPE__ELEMENT_FILTER:
				setElementFilter(ELEMENT_FILTER_EDEFAULT);
				return;
			case ConfigurationPackage.NODE_TYPE__HANDLER_FILTER:
				setHandlerFilter(HANDLER_FILTER_EDEFAULT);
				return;
			case ConfigurationPackage.NODE_TYPE__PORT:
				setPort(PORT_EDEFAULT);
				return;
			case ConfigurationPackage.NODE_TYPE__PROTOCOL:
				unsetProtocol();
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
			case ConfigurationPackage.NODE_TYPE__ADDRESS:
				return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
			case ConfigurationPackage.NODE_TYPE__ELEMENT_FILTER:
				return ELEMENT_FILTER_EDEFAULT == null ? elementFilter != null : !ELEMENT_FILTER_EDEFAULT.equals(elementFilter);
			case ConfigurationPackage.NODE_TYPE__HANDLER_FILTER:
				return HANDLER_FILTER_EDEFAULT == null ? handlerFilter != null : !HANDLER_FILTER_EDEFAULT.equals(handlerFilter);
			case ConfigurationPackage.NODE_TYPE__PORT:
				return PORT_EDEFAULT == null ? port != null : !PORT_EDEFAULT.equals(port);
			case ConfigurationPackage.NODE_TYPE__PROTOCOL:
				return isSetProtocol();
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
		result.append(" (address: ");
		result.append(address);
		result.append(", elementFilter: ");
		result.append(elementFilter);
		result.append(", handlerFilter: ");
		result.append(handlerFilter);
		result.append(", port: ");
		result.append(port);
		result.append(", protocol: ");
		if (protocolESet) result.append(protocol); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //NodeTypeImpl
