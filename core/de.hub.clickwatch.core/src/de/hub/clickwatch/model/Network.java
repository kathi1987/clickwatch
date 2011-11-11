/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.model.Network#getName <em>Name</em>}</li>
 *   <li>{@link de.hub.clickwatch.model.Network#getNodes <em>Nodes</em>}</li>
 *   <li>{@link de.hub.clickwatch.model.Network#getElementFilter <em>Element Filter</em>}</li>
 *   <li>{@link de.hub.clickwatch.model.Network#getHandlerFilter <em>Handler Filter</em>}</li>
 *   <li>{@link de.hub.clickwatch.model.Network#getSubnetworks <em>Subnetworks</em>}</li>
 *   <li>{@link de.hub.clickwatch.model.Network#getTimestamp <em>Timestamp</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.model.ClickWatchModelPackage#getNetwork()
 * @model
 * @generated
 */
public interface Network extends ModelElementWithStatistics {
	/**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * The default value is <code>"My Network"</code>.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see de.hub.clickwatch.model.ClickWatchModelPackage#getNetwork_Name()
     * @model default="My Network"
     * @generated
     */
	String getName();

	/**
     * Sets the value of the '{@link de.hub.clickwatch.model.Network#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
	void setName(String value);

	/**
     * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
     * The list contents are of type {@link de.hub.clickwatch.model.Node}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Nodes</em>' containment reference list.
     * @see de.hub.clickwatch.model.ClickWatchModelPackage#getNetwork_Nodes()
     * @model containment="true"
     *        extendedMetaData="name='node' kind='element'"
     * @generated
     */
	EList<Node> getNodes();

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
     * @see de.hub.clickwatch.model.ClickWatchModelPackage#getNetwork_ElementFilter()
     * @model
     * @generated
     */
	String getElementFilter();

	/**
     * Sets the value of the '{@link de.hub.clickwatch.model.Network#getElementFilter <em>Element Filter</em>}' attribute.
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
     * @see de.hub.clickwatch.model.ClickWatchModelPackage#getNetwork_HandlerFilter()
     * @model
     * @generated
     */
	String getHandlerFilter();

	/**
     * Sets the value of the '{@link de.hub.clickwatch.model.Network#getHandlerFilter <em>Handler Filter</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Handler Filter</em>' attribute.
     * @see #getHandlerFilter()
     * @generated
     */
	void setHandlerFilter(String value);

	/**
     * Returns the value of the '<em><b>Subnetworks</b></em>' containment reference list.
     * The list contents are of type {@link de.hub.clickwatch.model.Network}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subnetworks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Subnetworks</em>' containment reference list.
     * @see de.hub.clickwatch.model.ClickWatchModelPackage#getNetwork_Subnetworks()
     * @model containment="true"
     *        extendedMetaData="name='subnetwork' kind='element'"
     * @generated
     */
	EList<Network> getSubnetworks();

    /**
     * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Timestamp</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Timestamp</em>' attribute.
     * @see #setTimestamp(long)
     * @see de.hub.clickwatch.model.ClickWatchModelPackage#getNetwork_Timestamp()
     * @model
     * @generated
     */
    long getTimestamp();

    /**
     * Sets the value of the '{@link de.hub.clickwatch.model.Network#getTimestamp <em>Timestamp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Timestamp</em>' attribute.
     * @see #getTimestamp()
     * @generated
     */
    void setTimestamp(long value);

} // Network
