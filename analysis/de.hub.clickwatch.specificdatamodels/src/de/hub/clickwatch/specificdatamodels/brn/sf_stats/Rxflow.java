/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificdatamodels.brn.sf_stats;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rxflow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.sf_stats.Rxflow#getEContainer_rxflow <em>EContainer rxflow</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.sf_stats.Rxflow#getSrc <em>Src</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.sf_stats.Rxflow#getDst <em>Dst</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.sf_stats.Rxflow#getFlowid <em>Flowid</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.sf_stats.Rxflow#getPacket_count <em>Packet count</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.sf_stats.Rxflow#getPacket_size <em>Packet size</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.sf_stats.Rxflow#getCrc_err <em>Crc err</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.sf_stats.Rxflow#getAvg_hops <em>Avg hops</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.specificdatamodels.brn.sf_stats.Sf_statsPackage#getRxflow()
 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/flowstats|flowstats:Flowstats|EObject/rxflow|rxflow:Rxflow|EObject'"
 * @generated
 */
public interface Rxflow extends EObject {
	/**
	 * Returns the value of the '<em><b>EContainer rxflow</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.hub.clickwatch.specificdatamodels.brn.sf_stats.Flowstats#getRxflow <em>Rxflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EContainer rxflow</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EContainer rxflow</em>' container reference.
	 * @see #setEContainer_rxflow(Flowstats)
	 * @see de.hub.clickwatch.specificdatamodels.brn.sf_stats.Sf_statsPackage#getRxflow_EContainer_rxflow()
	 * @see de.hub.clickwatch.specificdatamodels.brn.sf_stats.Flowstats#getRxflow
	 * @model opposite="rxflow" transient="false"
	 * @generated
	 */
	Flowstats getEContainer_rxflow();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificdatamodels.brn.sf_stats.Rxflow#getEContainer_rxflow <em>EContainer rxflow</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EContainer rxflow</em>' container reference.
	 * @see #getEContainer_rxflow()
	 * @generated
	 */
	void setEContainer_rxflow(Flowstats value);

	/**
	 * Returns the value of the '<em><b>Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Src</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Src</em>' attribute.
	 * @see #setSrc(String)
	 * @see de.hub.clickwatch.specificdatamodels.brn.sf_stats.Sf_statsPackage#getRxflow_Src()
	 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/flowstats|flowstats:Flowstats|EObject/rxflow|rxflow:Rxflow|EObject/src|src:'"
	 * @generated
	 */
	String getSrc();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificdatamodels.brn.sf_stats.Rxflow#getSrc <em>Src</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Src</em>' attribute.
	 * @see #getSrc()
	 * @generated
	 */
	void setSrc(String value);

	/**
	 * Returns the value of the '<em><b>Dst</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dst</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dst</em>' attribute.
	 * @see #setDst(String)
	 * @see de.hub.clickwatch.specificdatamodels.brn.sf_stats.Sf_statsPackage#getRxflow_Dst()
	 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/flowstats|flowstats:Flowstats|EObject/rxflow|rxflow:Rxflow|EObject/dst|dst:'"
	 * @generated
	 */
	String getDst();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificdatamodels.brn.sf_stats.Rxflow#getDst <em>Dst</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dst</em>' attribute.
	 * @see #getDst()
	 * @generated
	 */
	void setDst(String value);

	/**
	 * Returns the value of the '<em><b>Flowid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flowid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flowid</em>' attribute.
	 * @see #setFlowid(int)
	 * @see de.hub.clickwatch.specificdatamodels.brn.sf_stats.Sf_statsPackage#getRxflow_Flowid()
	 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/flowstats|flowstats:Flowstats|EObject/rxflow|rxflow:Rxflow|EObject/flowid|flowid:'"
	 * @generated
	 */
	int getFlowid();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificdatamodels.brn.sf_stats.Rxflow#getFlowid <em>Flowid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flowid</em>' attribute.
	 * @see #getFlowid()
	 * @generated
	 */
	void setFlowid(int value);

	/**
	 * Returns the value of the '<em><b>Packet count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packet count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packet count</em>' attribute.
	 * @see #setPacket_count(int)
	 * @see de.hub.clickwatch.specificdatamodels.brn.sf_stats.Sf_statsPackage#getRxflow_Packet_count()
	 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/flowstats|flowstats:Flowstats|EObject/rxflow|rxflow:Rxflow|EObject/packet_count|packet_count:'"
	 * @generated
	 */
	int getPacket_count();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificdatamodels.brn.sf_stats.Rxflow#getPacket_count <em>Packet count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Packet count</em>' attribute.
	 * @see #getPacket_count()
	 * @generated
	 */
	void setPacket_count(int value);

	/**
	 * Returns the value of the '<em><b>Packet size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packet size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packet size</em>' attribute.
	 * @see #setPacket_size(int)
	 * @see de.hub.clickwatch.specificdatamodels.brn.sf_stats.Sf_statsPackage#getRxflow_Packet_size()
	 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/flowstats|flowstats:Flowstats|EObject/rxflow|rxflow:Rxflow|EObject/packet_size|packet_size:'"
	 * @generated
	 */
	int getPacket_size();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificdatamodels.brn.sf_stats.Rxflow#getPacket_size <em>Packet size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Packet size</em>' attribute.
	 * @see #getPacket_size()
	 * @generated
	 */
	void setPacket_size(int value);

	/**
	 * Returns the value of the '<em><b>Crc err</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Crc err</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crc err</em>' attribute.
	 * @see #setCrc_err(int)
	 * @see de.hub.clickwatch.specificdatamodels.brn.sf_stats.Sf_statsPackage#getRxflow_Crc_err()
	 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/flowstats|flowstats:Flowstats|EObject/rxflow|rxflow:Rxflow|EObject/crc_err|crc_err:'"
	 * @generated
	 */
	int getCrc_err();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificdatamodels.brn.sf_stats.Rxflow#getCrc_err <em>Crc err</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Crc err</em>' attribute.
	 * @see #getCrc_err()
	 * @generated
	 */
	void setCrc_err(int value);

	/**
	 * Returns the value of the '<em><b>Avg hops</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Avg hops</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Avg hops</em>' attribute.
	 * @see #setAvg_hops(int)
	 * @see de.hub.clickwatch.specificdatamodels.brn.sf_stats.Sf_statsPackage#getRxflow_Avg_hops()
	 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/flowstats|flowstats:Flowstats|EObject/rxflow|rxflow:Rxflow|EObject/avg_hops|avg_hops:'"
	 * @generated
	 */
	int getAvg_hops();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificdatamodels.brn.sf_stats.Rxflow#getAvg_hops <em>Avg hops</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Avg hops</em>' attribute.
	 * @see #getAvg_hops()
	 * @generated
	 */
	void setAvg_hops(int value);

} // Rxflow
