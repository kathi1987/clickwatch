/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.examples.linkdist.ldp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.examples.linkdist.ldp.Link#getSrcAddr <em>Src Addr</em>}</li>
 *   <li>{@link de.hub.clickwatch.examples.linkdist.ldp.Link#getDestAddr <em>Dest Addr</em>}</li>
 *   <li>{@link de.hub.clickwatch.examples.linkdist.ldp.Link#getDistance <em>Distance</em>}</li>
 *   <li>{@link de.hub.clickwatch.examples.linkdist.ldp.Link#getRssi <em>Rssi</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.examples.linkdist.ldp.LinkDistPlotPackage#getLink()
 * @model
 * @generated
 */
public interface Link extends EObject {
	/**
	 * Returns the value of the '<em><b>Src Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Src Addr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Src Addr</em>' attribute.
	 * @see #setSrcAddr(String)
	 * @see de.hub.clickwatch.examples.linkdist.ldp.LinkDistPlotPackage#getLink_SrcAddr()
	 * @model
	 * @generated
	 */
	String getSrcAddr();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.examples.linkdist.ldp.Link#getSrcAddr <em>Src Addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Src Addr</em>' attribute.
	 * @see #getSrcAddr()
	 * @generated
	 */
	void setSrcAddr(String value);

	/**
	 * Returns the value of the '<em><b>Dest Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dest Addr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dest Addr</em>' attribute.
	 * @see #setDestAddr(String)
	 * @see de.hub.clickwatch.examples.linkdist.ldp.LinkDistPlotPackage#getLink_DestAddr()
	 * @model
	 * @generated
	 */
	String getDestAddr();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.examples.linkdist.ldp.Link#getDestAddr <em>Dest Addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dest Addr</em>' attribute.
	 * @see #getDestAddr()
	 * @generated
	 */
	void setDestAddr(String value);

	/**
	 * Returns the value of the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance</em>' attribute.
	 * @see #setDistance(double)
	 * @see de.hub.clickwatch.examples.linkdist.ldp.LinkDistPlotPackage#getLink_Distance()
	 * @model
	 * @generated
	 */
	double getDistance();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.examples.linkdist.ldp.Link#getDistance <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance</em>' attribute.
	 * @see #getDistance()
	 * @generated
	 */
	void setDistance(double value);

	/**
	 * Returns the value of the '<em><b>Rssi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rssi</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rssi</em>' attribute.
	 * @see #setRssi(int)
	 * @see de.hub.clickwatch.examples.linkdist.ldp.LinkDistPlotPackage#getLink_Rssi()
	 * @model
	 * @generated
	 */
	int getRssi();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.examples.linkdist.ldp.Link#getRssi <em>Rssi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rssi</em>' attribute.
	 * @see #getRssi()
	 * @generated
	 */
	void setRssi(int value);

} // Link
