/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Configuration;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Configuration.NodeType#getAddress <em>Address</em>}</li>
 *   <li>{@link Configuration.NodeType#getElementFilter <em>Element Filter</em>}</li>
 *   <li>{@link Configuration.NodeType#getHandlerFilter <em>Handler Filter</em>}</li>
 *   <li>{@link Configuration.NodeType#getPort <em>Port</em>}</li>
 *   <li>{@link Configuration.NodeType#getProtocol <em>Protocol</em>}</li>
 * </ul>
 * </p>
 *
 * @see Configuration.ConfigurationPackage#getNodeType()
 * @model extendedMetaData="name='nodeType' kind='empty'"
 * @generated
 */
public interface NodeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(String)
	 * @see Configuration.ConfigurationPackage#getNodeType_Address()
	 * @model dataType="Configuration.AddressType" required="true"
	 *        extendedMetaData="kind='attribute' name='address' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link Configuration.NodeType#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

	/**
	 * Returns the value of the '<em><b>Element Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Filter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Filter</em>' attribute.
	 * @see #setElementFilter(String)
	 * @see Configuration.ConfigurationPackage#getNodeType_ElementFilter()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='elementFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	String getElementFilter();

	/**
	 * Sets the value of the '{@link Configuration.NodeType#getElementFilter <em>Element Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Filter</em>' attribute.
	 * @see #getElementFilter()
	 * @generated
	 */
	void setElementFilter(String value);

	/**
	 * Returns the value of the '<em><b>Handler Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Handler Filter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Handler Filter</em>' attribute.
	 * @see #setHandlerFilter(String)
	 * @see Configuration.ConfigurationPackage#getNodeType_HandlerFilter()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='handlerFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	String getHandlerFilter();

	/**
	 * Sets the value of the '{@link Configuration.NodeType#getHandlerFilter <em>Handler Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Handler Filter</em>' attribute.
	 * @see #getHandlerFilter()
	 * @generated
	 */
	void setHandlerFilter(String value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' attribute.
	 * @see #setPort(BigInteger)
	 * @see Configuration.ConfigurationPackage#getNodeType_Port()
	 * @model dataType="Configuration.PortType" required="true"
	 *        extendedMetaData="kind='attribute' name='port' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getPort();

	/**
	 * Sets the value of the '{@link Configuration.NodeType#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' attribute.
	 * The literals are from the enumeration {@link Configuration.ProtocolType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protocol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol</em>' attribute.
	 * @see Configuration.ProtocolType
	 * @see #isSetProtocol()
	 * @see #unsetProtocol()
	 * @see #setProtocol(ProtocolType)
	 * @see Configuration.ConfigurationPackage#getNodeType_Protocol()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='protocol' namespace='##targetNamespace'"
	 * @generated
	 */
	ProtocolType getProtocol();

	/**
	 * Sets the value of the '{@link Configuration.NodeType#getProtocol <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' attribute.
	 * @see Configuration.ProtocolType
	 * @see #isSetProtocol()
	 * @see #unsetProtocol()
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(ProtocolType value);

	/**
	 * Unsets the value of the '{@link Configuration.NodeType#getProtocol <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProtocol()
	 * @see #getProtocol()
	 * @see #setProtocol(ProtocolType)
	 * @generated
	 */
	void unsetProtocol();

	/**
	 * Returns whether the value of the '{@link Configuration.NodeType#getProtocol <em>Protocol</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Protocol</em>' attribute is set.
	 * @see #unsetProtocol()
	 * @see #getProtocol()
	 * @see #setProtocol(ProtocolType)
	 * @generated
	 */
	boolean isSetProtocol();

} // NodeType
