/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.sf_stats;

import de.hub.clickwatch.model.ClickWatchModelPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.hub.clickwatch.specificmodels.brn.sf_stats.Sf_statsFactory
 * @model kind="package"
 *        annotation="http://de.hub.clickwatch.specificmodels handler_class='Stats' handler_name='sf/stats'"
 * @generated
 */
public interface Sf_statsPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "sf_stats";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://de.hub.clickwatch.specificmodels.brn/sf/stats";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "sf_stats";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    Sf_statsPackage eINSTANCE = de.hub.clickwatch.specificmodels.brn.sf_stats.impl.Sf_statsPackageImpl.init();

    /**
     * The meta object id for the '{@link de.hub.clickwatch.specificmodels.brn.sf_stats.impl.FlowstatsImpl <em>Flowstats</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hub.clickwatch.specificmodels.brn.sf_stats.impl.FlowstatsImpl
     * @see de.hub.clickwatch.specificmodels.brn.sf_stats.impl.Sf_statsPackageImpl#getFlowstats()
     * @generated
     */
    int FLOWSTATS = 0;

    /**
     * The feature id for the '<em><b>EContainer flowstats</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOWSTATS__ECONTAINER_FLOWSTATS = 0;

    /**
     * The feature id for the '<em><b>Text</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOWSTATS__TEXT = 1;

    /**
     * The feature id for the '<em><b>Txflow</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOWSTATS__TXFLOW = 2;

    /**
     * The feature id for the '<em><b>Rxflow</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOWSTATS__RXFLOW = 3;

    /**
     * The feature id for the '<em><b>Node</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOWSTATS__NODE = 4;

    /**
     * The number of structural features of the '<em>Flowstats</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOWSTATS_FEATURE_COUNT = 5;

    /**
     * The meta object id for the '{@link de.hub.clickwatch.specificmodels.brn.sf_stats.impl.RxflowImpl <em>Rxflow</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hub.clickwatch.specificmodels.brn.sf_stats.impl.RxflowImpl
     * @see de.hub.clickwatch.specificmodels.brn.sf_stats.impl.Sf_statsPackageImpl#getRxflow()
     * @generated
     */
    int RXFLOW = 1;

    /**
     * The feature id for the '<em><b>EContainer rxflow</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RXFLOW__ECONTAINER_RXFLOW = 0;

    /**
     * The feature id for the '<em><b>Src</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RXFLOW__SRC = 1;

    /**
     * The feature id for the '<em><b>Dst</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RXFLOW__DST = 2;

    /**
     * The feature id for the '<em><b>Flowid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RXFLOW__FLOWID = 3;

    /**
     * The feature id for the '<em><b>Packet count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RXFLOW__PACKET_COUNT = 4;

    /**
     * The feature id for the '<em><b>Packet size</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RXFLOW__PACKET_SIZE = 5;

    /**
     * The feature id for the '<em><b>Crc err</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RXFLOW__CRC_ERR = 6;

    /**
     * The feature id for the '<em><b>Avg hops</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RXFLOW__AVG_HOPS = 7;

    /**
     * The number of structural features of the '<em>Rxflow</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RXFLOW_FEATURE_COUNT = 8;

    /**
     * The meta object id for the '{@link de.hub.clickwatch.specificmodels.brn.sf_stats.impl.StatsImpl <em>Stats</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hub.clickwatch.specificmodels.brn.sf_stats.impl.StatsImpl
     * @see de.hub.clickwatch.specificmodels.brn.sf_stats.impl.Sf_statsPackageImpl#getStats()
     * @generated
     */
    int STATS = 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATS__NAME = ClickWatchModelPackage.HANDLER__NAME;

    /**
     * The feature id for the '<em><b>Can Read</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATS__CAN_READ = ClickWatchModelPackage.HANDLER__CAN_READ;

    /**
     * The feature id for the '<em><b>Can Write</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATS__CAN_WRITE = ClickWatchModelPackage.HANDLER__CAN_WRITE;

    /**
     * The feature id for the '<em><b>Changed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATS__CHANGED = ClickWatchModelPackage.HANDLER__CHANGED;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATS__MIXED = ClickWatchModelPackage.HANDLER__MIXED;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATS__ANY = ClickWatchModelPackage.HANDLER__ANY;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATS__VALUE = ClickWatchModelPackage.HANDLER__VALUE;

    /**
     * The feature id for the '<em><b>Timestamp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATS__TIMESTAMP = ClickWatchModelPackage.HANDLER__TIMESTAMP;

    /**
     * The feature id for the '<em><b>Flowstats</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATS__FLOWSTATS = ClickWatchModelPackage.HANDLER_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Stats</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATS_FEATURE_COUNT = ClickWatchModelPackage.HANDLER_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link de.hub.clickwatch.specificmodels.brn.sf_stats.impl.TxflowImpl <em>Txflow</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hub.clickwatch.specificmodels.brn.sf_stats.impl.TxflowImpl
     * @see de.hub.clickwatch.specificmodels.brn.sf_stats.impl.Sf_statsPackageImpl#getTxflow()
     * @generated
     */
    int TXFLOW = 3;

    /**
     * The feature id for the '<em><b>EContainer txflow</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TXFLOW__ECONTAINER_TXFLOW = 0;

    /**
     * The feature id for the '<em><b>Src</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TXFLOW__SRC = 1;

    /**
     * The feature id for the '<em><b>Dst</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TXFLOW__DST = 2;

    /**
     * The feature id for the '<em><b>Flowid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TXFLOW__FLOWID = 3;

    /**
     * The feature id for the '<em><b>Packet count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TXFLOW__PACKET_COUNT = 4;

    /**
     * The feature id for the '<em><b>Packet size</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TXFLOW__PACKET_SIZE = 5;

    /**
     * The feature id for the '<em><b>Replies</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TXFLOW__REPLIES = 6;

    /**
     * The feature id for the '<em><b>Avg hops</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TXFLOW__AVG_HOPS = 7;

    /**
     * The feature id for the '<em><b>Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TXFLOW__TIME = 8;

    /**
     * The number of structural features of the '<em>Txflow</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TXFLOW_FEATURE_COUNT = 9;


    /**
     * Returns the meta object for class '{@link de.hub.clickwatch.specificmodels.brn.sf_stats.Flowstats <em>Flowstats</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Flowstats</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.sf_stats.Flowstats
     * @generated
     */
    EClass getFlowstats();

    /**
     * Returns the meta object for the container reference '{@link de.hub.clickwatch.specificmodels.brn.sf_stats.Flowstats#getEContainer_flowstats <em>EContainer flowstats</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>EContainer flowstats</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.sf_stats.Flowstats#getEContainer_flowstats()
     * @see #getFlowstats()
     * @generated
     */
    EReference getFlowstats_EContainer_flowstats();

    /**
     * Returns the meta object for the attribute list '{@link de.hub.clickwatch.specificmodels.brn.sf_stats.Flowstats#getText <em>Text</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Text</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.sf_stats.Flowstats#getText()
     * @see #getFlowstats()
     * @generated
     */
    EAttribute getFlowstats_Text();

    /**
     * Returns the meta object for the containment reference list '{@link de.hub.clickwatch.specificmodels.brn.sf_stats.Flowstats#getTxflow <em>Txflow</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Txflow</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.sf_stats.Flowstats#getTxflow()
     * @see #getFlowstats()
     * @generated
     */
    EReference getFlowstats_Txflow();

    /**
     * Returns the meta object for the containment reference list '{@link de.hub.clickwatch.specificmodels.brn.sf_stats.Flowstats#getRxflow <em>Rxflow</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Rxflow</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.sf_stats.Flowstats#getRxflow()
     * @see #getFlowstats()
     * @generated
     */
    EReference getFlowstats_Rxflow();

    /**
     * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.sf_stats.Flowstats#getNode <em>Node</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Node</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.sf_stats.Flowstats#getNode()
     * @see #getFlowstats()
     * @generated
     */
    EAttribute getFlowstats_Node();

    /**
     * Returns the meta object for class '{@link de.hub.clickwatch.specificmodels.brn.sf_stats.Rxflow <em>Rxflow</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Rxflow</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.sf_stats.Rxflow
     * @generated
     */
    EClass getRxflow();

    /**
     * Returns the meta object for the container reference '{@link de.hub.clickwatch.specificmodels.brn.sf_stats.Rxflow#getEContainer_rxflow <em>EContainer rxflow</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>EContainer rxflow</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.sf_stats.Rxflow#getEContainer_rxflow()
     * @see #getRxflow()
     * @generated
     */
    EReference getRxflow_EContainer_rxflow();

    /**
     * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.sf_stats.Rxflow#getSrc <em>Src</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Src</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.sf_stats.Rxflow#getSrc()
     * @see #getRxflow()
     * @generated
     */
    EAttribute getRxflow_Src();

    /**
     * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.sf_stats.Rxflow#getDst <em>Dst</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Dst</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.sf_stats.Rxflow#getDst()
     * @see #getRxflow()
     * @generated
     */
    EAttribute getRxflow_Dst();

    /**
     * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.sf_stats.Rxflow#getFlowid <em>Flowid</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Flowid</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.sf_stats.Rxflow#getFlowid()
     * @see #getRxflow()
     * @generated
     */
    EAttribute getRxflow_Flowid();

    /**
     * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.sf_stats.Rxflow#getPacket_count <em>Packet count</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Packet count</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.sf_stats.Rxflow#getPacket_count()
     * @see #getRxflow()
     * @generated
     */
    EAttribute getRxflow_Packet_count();

    /**
     * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.sf_stats.Rxflow#getPacket_size <em>Packet size</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Packet size</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.sf_stats.Rxflow#getPacket_size()
     * @see #getRxflow()
     * @generated
     */
    EAttribute getRxflow_Packet_size();

    /**
     * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.sf_stats.Rxflow#getCrc_err <em>Crc err</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Crc err</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.sf_stats.Rxflow#getCrc_err()
     * @see #getRxflow()
     * @generated
     */
    EAttribute getRxflow_Crc_err();

    /**
     * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.sf_stats.Rxflow#getAvg_hops <em>Avg hops</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Avg hops</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.sf_stats.Rxflow#getAvg_hops()
     * @see #getRxflow()
     * @generated
     */
    EAttribute getRxflow_Avg_hops();

    /**
     * Returns the meta object for class '{@link de.hub.clickwatch.specificmodels.brn.sf_stats.Stats <em>Stats</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Stats</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.sf_stats.Stats
     * @generated
     */
    EClass getStats();

    /**
     * Returns the meta object for the containment reference '{@link de.hub.clickwatch.specificmodels.brn.sf_stats.Stats#getFlowstats <em>Flowstats</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Flowstats</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.sf_stats.Stats#getFlowstats()
     * @see #getStats()
     * @generated
     */
    EReference getStats_Flowstats();

    /**
     * Returns the meta object for class '{@link de.hub.clickwatch.specificmodels.brn.sf_stats.Txflow <em>Txflow</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Txflow</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.sf_stats.Txflow
     * @generated
     */
    EClass getTxflow();

    /**
     * Returns the meta object for the container reference '{@link de.hub.clickwatch.specificmodels.brn.sf_stats.Txflow#getEContainer_txflow <em>EContainer txflow</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>EContainer txflow</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.sf_stats.Txflow#getEContainer_txflow()
     * @see #getTxflow()
     * @generated
     */
    EReference getTxflow_EContainer_txflow();

    /**
     * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.sf_stats.Txflow#getSrc <em>Src</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Src</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.sf_stats.Txflow#getSrc()
     * @see #getTxflow()
     * @generated
     */
    EAttribute getTxflow_Src();

    /**
     * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.sf_stats.Txflow#getDst <em>Dst</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Dst</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.sf_stats.Txflow#getDst()
     * @see #getTxflow()
     * @generated
     */
    EAttribute getTxflow_Dst();

    /**
     * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.sf_stats.Txflow#getFlowid <em>Flowid</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Flowid</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.sf_stats.Txflow#getFlowid()
     * @see #getTxflow()
     * @generated
     */
    EAttribute getTxflow_Flowid();

    /**
     * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.sf_stats.Txflow#getPacket_count <em>Packet count</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Packet count</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.sf_stats.Txflow#getPacket_count()
     * @see #getTxflow()
     * @generated
     */
    EAttribute getTxflow_Packet_count();

    /**
     * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.sf_stats.Txflow#getPacket_size <em>Packet size</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Packet size</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.sf_stats.Txflow#getPacket_size()
     * @see #getTxflow()
     * @generated
     */
    EAttribute getTxflow_Packet_size();

    /**
     * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.sf_stats.Txflow#getReplies <em>Replies</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Replies</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.sf_stats.Txflow#getReplies()
     * @see #getTxflow()
     * @generated
     */
    EAttribute getTxflow_Replies();

    /**
     * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.sf_stats.Txflow#getAvg_hops <em>Avg hops</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Avg hops</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.sf_stats.Txflow#getAvg_hops()
     * @see #getTxflow()
     * @generated
     */
    EAttribute getTxflow_Avg_hops();

    /**
     * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.sf_stats.Txflow#getTime <em>Time</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Time</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.sf_stats.Txflow#getTime()
     * @see #getTxflow()
     * @generated
     */
    EAttribute getTxflow_Time();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    Sf_statsFactory getSf_statsFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link de.hub.clickwatch.specificmodels.brn.sf_stats.impl.FlowstatsImpl <em>Flowstats</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.hub.clickwatch.specificmodels.brn.sf_stats.impl.FlowstatsImpl
         * @see de.hub.clickwatch.specificmodels.brn.sf_stats.impl.Sf_statsPackageImpl#getFlowstats()
         * @generated
         */
        EClass FLOWSTATS = eINSTANCE.getFlowstats();

        /**
         * The meta object literal for the '<em><b>EContainer flowstats</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FLOWSTATS__ECONTAINER_FLOWSTATS = eINSTANCE.getFlowstats_EContainer_flowstats();

        /**
         * The meta object literal for the '<em><b>Text</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FLOWSTATS__TEXT = eINSTANCE.getFlowstats_Text();

        /**
         * The meta object literal for the '<em><b>Txflow</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FLOWSTATS__TXFLOW = eINSTANCE.getFlowstats_Txflow();

        /**
         * The meta object literal for the '<em><b>Rxflow</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FLOWSTATS__RXFLOW = eINSTANCE.getFlowstats_Rxflow();

        /**
         * The meta object literal for the '<em><b>Node</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FLOWSTATS__NODE = eINSTANCE.getFlowstats_Node();

        /**
         * The meta object literal for the '{@link de.hub.clickwatch.specificmodels.brn.sf_stats.impl.RxflowImpl <em>Rxflow</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.hub.clickwatch.specificmodels.brn.sf_stats.impl.RxflowImpl
         * @see de.hub.clickwatch.specificmodels.brn.sf_stats.impl.Sf_statsPackageImpl#getRxflow()
         * @generated
         */
        EClass RXFLOW = eINSTANCE.getRxflow();

        /**
         * The meta object literal for the '<em><b>EContainer rxflow</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RXFLOW__ECONTAINER_RXFLOW = eINSTANCE.getRxflow_EContainer_rxflow();

        /**
         * The meta object literal for the '<em><b>Src</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RXFLOW__SRC = eINSTANCE.getRxflow_Src();

        /**
         * The meta object literal for the '<em><b>Dst</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RXFLOW__DST = eINSTANCE.getRxflow_Dst();

        /**
         * The meta object literal for the '<em><b>Flowid</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RXFLOW__FLOWID = eINSTANCE.getRxflow_Flowid();

        /**
         * The meta object literal for the '<em><b>Packet count</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RXFLOW__PACKET_COUNT = eINSTANCE.getRxflow_Packet_count();

        /**
         * The meta object literal for the '<em><b>Packet size</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RXFLOW__PACKET_SIZE = eINSTANCE.getRxflow_Packet_size();

        /**
         * The meta object literal for the '<em><b>Crc err</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RXFLOW__CRC_ERR = eINSTANCE.getRxflow_Crc_err();

        /**
         * The meta object literal for the '<em><b>Avg hops</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RXFLOW__AVG_HOPS = eINSTANCE.getRxflow_Avg_hops();

        /**
         * The meta object literal for the '{@link de.hub.clickwatch.specificmodels.brn.sf_stats.impl.StatsImpl <em>Stats</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.hub.clickwatch.specificmodels.brn.sf_stats.impl.StatsImpl
         * @see de.hub.clickwatch.specificmodels.brn.sf_stats.impl.Sf_statsPackageImpl#getStats()
         * @generated
         */
        EClass STATS = eINSTANCE.getStats();

        /**
         * The meta object literal for the '<em><b>Flowstats</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference STATS__FLOWSTATS = eINSTANCE.getStats_Flowstats();

        /**
         * The meta object literal for the '{@link de.hub.clickwatch.specificmodels.brn.sf_stats.impl.TxflowImpl <em>Txflow</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.hub.clickwatch.specificmodels.brn.sf_stats.impl.TxflowImpl
         * @see de.hub.clickwatch.specificmodels.brn.sf_stats.impl.Sf_statsPackageImpl#getTxflow()
         * @generated
         */
        EClass TXFLOW = eINSTANCE.getTxflow();

        /**
         * The meta object literal for the '<em><b>EContainer txflow</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TXFLOW__ECONTAINER_TXFLOW = eINSTANCE.getTxflow_EContainer_txflow();

        /**
         * The meta object literal for the '<em><b>Src</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TXFLOW__SRC = eINSTANCE.getTxflow_Src();

        /**
         * The meta object literal for the '<em><b>Dst</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TXFLOW__DST = eINSTANCE.getTxflow_Dst();

        /**
         * The meta object literal for the '<em><b>Flowid</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TXFLOW__FLOWID = eINSTANCE.getTxflow_Flowid();

        /**
         * The meta object literal for the '<em><b>Packet count</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TXFLOW__PACKET_COUNT = eINSTANCE.getTxflow_Packet_count();

        /**
         * The meta object literal for the '<em><b>Packet size</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TXFLOW__PACKET_SIZE = eINSTANCE.getTxflow_Packet_size();

        /**
         * The meta object literal for the '<em><b>Replies</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TXFLOW__REPLIES = eINSTANCE.getTxflow_Replies();

        /**
         * The meta object literal for the '<em><b>Avg hops</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TXFLOW__AVG_HOPS = eINSTANCE.getTxflow_Avg_hops();

        /**
         * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TXFLOW__TIME = eINSTANCE.getTxflow_Time();

    }

} //Sf_statsPackage
