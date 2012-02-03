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
 * A representation of the model object '<em><b>Txflow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.sf_stats.Txflow#getEContainer_txflow <em>EContainer txflow</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.sf_stats.Txflow#getSrc <em>Src</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.sf_stats.Txflow#getDst <em>Dst</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.sf_stats.Txflow#getFlowid <em>Flowid</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.sf_stats.Txflow#getPacket_count <em>Packet count</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.sf_stats.Txflow#getPacket_size <em>Packet size</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.sf_stats.Txflow#getReplies <em>Replies</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.sf_stats.Txflow#getAvg_hops <em>Avg hops</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.sf_stats.Txflow#getTime <em>Time</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.specificdatamodels.brn.sf_stats.Sf_statsPackage#getTxflow()
 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/flowstats|flowstats:Flowstats|EObject/txflow|txflow:Txflow|EObject'"
 * @generated
 */
public interface Txflow extends EObject {
	/**
	 * Returns the value of the '<em><b>EContainer txflow</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.hub.clickwatch.specificdatamodels.brn.sf_stats.Flowstats#getTxflow <em>Txflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EContainer txflow</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EContainer txflow</em>' container reference.
	 * @see #setEContainer_txflow(Flowstats)
	 * @see de.hub.clickwatch.specificdatamodels.brn.sf_stats.Sf_statsPackage#getTxflow_EContainer_txflow()
	 * @see de.hub.clickwatch.specificdatamodels.brn.sf_stats.Flowstats#getTxflow
	 * @model opposite="txflow" transient="false"
	 * @generated
	 */
	Flowstats getEContainer_txflow();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificdatamodels.brn.sf_stats.Txflow#getEContainer_txflow <em>EContainer txflow</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EContainer txflow</em>' container reference.
	 * @see #getEContainer_txflow()
	 * @generated
	 */
	void setEContainer_txflow(Flowstats value);

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
	 * @see de.hub.clickwatch.specificdatamodels.brn.sf_stats.Sf_statsPackage#getTxflow_Src()
	 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/flowstats|flowstats:Flowstats|EObject/txflow|txflow:Txflow|EObject/src|src:'"
	 * @generated
	 */
	String getSrc();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificdatamodels.brn.sf_stats.Txflow#getSrc <em>Src</em>}' attribute.
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
	 * @see de.hub.clickwatch.specificdatamodels.brn.sf_stats.Sf_statsPackage#getTxflow_Dst()
	 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/flowstats|flowstats:Flowstats|EObject/txflow|txflow:Txflow|EObject/dst|dst:'"
	 * @generated
	 */
	String getDst();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificdatamodels.brn.sf_stats.Txflow#getDst <em>Dst</em>}' attribute.
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
	 * @see de.hub.clickwatch.specificdatamodels.brn.sf_stats.Sf_statsPackage#getTxflow_Flowid()
	 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/flowstats|flowstats:Flowstats|EObject/txflow|txflow:Txflow|EObject/flowid|flowid:'"
	 * @generated
	 */
	int getFlowid();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificdatamodels.brn.sf_stats.Txflow#getFlowid <em>Flowid</em>}' attribute.
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
	 * @see de.hub.clickwatch.specificdatamodels.brn.sf_stats.Sf_statsPackage#getTxflow_Packet_count()
	 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/flowstats|flowstats:Flowstats|EObject/txflow|txflow:Txflow|EObject/packet_count|packet_count:'"
	 * @generated
	 */
	int getPacket_count();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificdatamodels.brn.sf_stats.Txflow#getPacket_count <em>Packet count</em>}' attribute.
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
	 * @see de.hub.clickwatch.specificdatamodels.brn.sf_stats.Sf_statsPackage#getTxflow_Packet_size()
	 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/flowstats|flowstats:Flowstats|EObject/txflow|txflow:Txflow|EObject/packet_size|packet_size:'"
	 * @generated
	 */
	int getPacket_size();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificdatamodels.brn.sf_stats.Txflow#getPacket_size <em>Packet size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Packet size</em>' attribute.
	 * @see #getPacket_size()
	 * @generated
	 */
	void setPacket_size(int value);

	/**
	 * Returns the value of the '<em><b>Replies</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Replies</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Replies</em>' attribute.
	 * @see #setReplies(int)
	 * @see de.hub.clickwatch.specificdatamodels.brn.sf_stats.Sf_statsPackage#getTxflow_Replies()
	 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/flowstats|flowstats:Flowstats|EObject/txflow|txflow:Txflow|EObject/replies|replies:'"
	 * @generated
	 */
	int getReplies();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificdatamodels.brn.sf_stats.Txflow#getReplies <em>Replies</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replies</em>' attribute.
	 * @see #getReplies()
	 * @generated
	 */
	void setReplies(int value);

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
	 * @see de.hub.clickwatch.specificdatamodels.brn.sf_stats.Sf_statsPackage#getTxflow_Avg_hops()
	 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/flowstats|flowstats:Flowstats|EObject/txflow|txflow:Txflow|EObject/avg_hops|avg_hops:'"
	 * @generated
	 */
	int getAvg_hops();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificdatamodels.brn.sf_stats.Txflow#getAvg_hops <em>Avg hops</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Avg hops</em>' attribute.
	 * @see #getAvg_hops()
	 * @generated
	 */
	void setAvg_hops(int value);

	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(int)
	 * @see de.hub.clickwatch.specificdatamodels.brn.sf_stats.Sf_statsPackage#getTxflow_Time()
	 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/flowstats|flowstats:Flowstats|EObject/txflow|txflow:Txflow|EObject/time|time:'"
	 * @generated
	 */
	int getTime();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificdatamodels.brn.sf_stats.Txflow#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(int value);

} // Txflow
