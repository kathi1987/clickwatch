/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats;

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
 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Device_wifi_link_stat_bcast_statsFactory
 * @model kind="package"
 *        annotation="http://de.hub.clickwatch.specificmodels handler_class='Bcast_stats'"
 * @generated
 */
public interface Device_wifi_link_stat_bcast_statsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "device_wifi_link_stat_bcast_stats";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://de.hub.clickwatch.specificmodels.brn/device_wifi/link_stat/bcast_stats";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "device_wifi_link_stat_bcast_stats";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Device_wifi_link_stat_bcast_statsPackage eINSTANCE = de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.impl.Device_wifi_link_stat_bcast_statsPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.impl.Bcast_statsImpl <em>Bcast stats</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.impl.Bcast_statsImpl
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.impl.Device_wifi_link_stat_bcast_statsPackageImpl#getBcast_stats()
	 * @generated
	 */
	int BCAST_STATS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCAST_STATS__NAME = ClickWatchModelPackage.HANDLER__NAME;

	/**
	 * The feature id for the '<em><b>Can Read</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCAST_STATS__CAN_READ = ClickWatchModelPackage.HANDLER__CAN_READ;

	/**
	 * The feature id for the '<em><b>Can Write</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCAST_STATS__CAN_WRITE = ClickWatchModelPackage.HANDLER__CAN_WRITE;

	/**
	 * The feature id for the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCAST_STATS__CHANGED = ClickWatchModelPackage.HANDLER__CHANGED;

	/**
	 * The feature id for the '<em><b>Watch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCAST_STATS__WATCH = ClickWatchModelPackage.HANDLER__WATCH;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCAST_STATS__MIXED = ClickWatchModelPackage.HANDLER__MIXED;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCAST_STATS__ANY = ClickWatchModelPackage.HANDLER__ANY;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCAST_STATS__VALUE = ClickWatchModelPackage.HANDLER__VALUE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCAST_STATS__TIMESTAMP = ClickWatchModelPackage.HANDLER__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCAST_STATS__ENTRY = ClickWatchModelPackage.HANDLER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bcast stats</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCAST_STATS_FEATURE_COUNT = ClickWatchModelPackage.HANDLER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.impl.EntryImpl <em>Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.impl.EntryImpl
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.impl.Device_wifi_link_stat_bcast_statsPackageImpl#getEntry()
	 * @generated
	 */
	int ENTRY = 1;

	/**
	 * The feature id for the '<em><b>EContainer entry</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__ECONTAINER_ENTRY = 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__TEXT = 1;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__LINK = 2;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__FROM = 3;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__TIME = 4;

	/**
	 * The feature id for the '<em><b>Seq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__SEQ = 5;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__PERIOD = 6;

	/**
	 * The feature id for the '<em><b>Tau</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__TAU = 7;

	/**
	 * The number of structural features of the '<em>Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.impl.LinkImpl
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.impl.Device_wifi_link_stat_bcast_statsPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 2;

	/**
	 * The feature id for the '<em><b>EContainer link</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__ECONTAINER_LINK = 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__TEXT = 1;

	/**
	 * The feature id for the '<em><b>Link info</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__LINK_INFO = 2;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__TO = 3;

	/**
	 * The feature id for the '<em><b>Seq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__SEQ = 4;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__PERIOD = 5;

	/**
	 * The feature id for the '<em><b>Tau</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__TAU = 6;

	/**
	 * The feature id for the '<em><b>Last rx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__LAST_RX = 7;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.impl.Link_infoImpl <em>Link info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.impl.Link_infoImpl
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.impl.Device_wifi_link_stat_bcast_statsPackageImpl#getLink_info()
	 * @generated
	 */
	int LINK_INFO = 3;

	/**
	 * The feature id for the '<em><b>EContainer link info</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_INFO__ECONTAINER_LINK_INFO = 0;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_INFO__SIZE = 1;

	/**
	 * The feature id for the '<em><b>Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_INFO__RATE = 2;

	/**
	 * The feature id for the '<em><b>Fwd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_INFO__FWD = 3;

	/**
	 * The feature id for the '<em><b>Rev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_INFO__REV = 4;

	/**
	 * The number of structural features of the '<em>Link info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_INFO_FEATURE_COUNT = 5;


	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Bcast_stats <em>Bcast stats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bcast stats</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Bcast_stats
	 * @generated
	 */
	EClass getBcast_stats();

	/**
	 * Returns the meta object for the containment reference '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Bcast_stats#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entry</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Bcast_stats#getEntry()
	 * @see #getBcast_stats()
	 * @generated
	 */
	EReference getBcast_stats_Entry();

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Entry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Entry
	 * @generated
	 */
	EClass getEntry();

	/**
	 * Returns the meta object for the container reference '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Entry#getEContainer_entry <em>EContainer entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>EContainer entry</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Entry#getEContainer_entry()
	 * @see #getEntry()
	 * @generated
	 */
	EReference getEntry_EContainer_entry();

	/**
	 * Returns the meta object for the attribute list '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Entry#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Text</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Entry#getText()
	 * @see #getEntry()
	 * @generated
	 */
	EAttribute getEntry_Text();

	/**
	 * Returns the meta object for the containment reference list '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Entry#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Entry#getLink()
	 * @see #getEntry()
	 * @generated
	 */
	EReference getEntry_Link();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Entry#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Entry#getFrom()
	 * @see #getEntry()
	 * @generated
	 */
	EAttribute getEntry_From();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Entry#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Entry#getTime()
	 * @see #getEntry()
	 * @generated
	 */
	EAttribute getEntry_Time();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Entry#getSeq <em>Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seq</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Entry#getSeq()
	 * @see #getEntry()
	 * @generated
	 */
	EAttribute getEntry_Seq();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Entry#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Entry#getPeriod()
	 * @see #getEntry()
	 * @generated
	 */
	EAttribute getEntry_Period();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Entry#getTau <em>Tau</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tau</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Entry#getTau()
	 * @see #getEntry()
	 * @generated
	 */
	EAttribute getEntry_Tau();

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the container reference '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Link#getEContainer_link <em>EContainer link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>EContainer link</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Link#getEContainer_link()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_EContainer_link();

	/**
	 * Returns the meta object for the attribute list '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Link#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Text</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Link#getText()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Text();

	/**
	 * Returns the meta object for the containment reference list '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Link#getLink_info <em>Link info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link info</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Link#getLink_info()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Link_info();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Link#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Link#getTo()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_To();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Link#getSeq <em>Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seq</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Link#getSeq()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Seq();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Link#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Link#getPeriod()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Period();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Link#getTau <em>Tau</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tau</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Link#getTau()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Tau();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Link#getLast_rx <em>Last rx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last rx</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Link#getLast_rx()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Last_rx();

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Link_info <em>Link info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link info</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Link_info
	 * @generated
	 */
	EClass getLink_info();

	/**
	 * Returns the meta object for the container reference '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Link_info#getEContainer_link_info <em>EContainer link info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>EContainer link info</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Link_info#getEContainer_link_info()
	 * @see #getLink_info()
	 * @generated
	 */
	EReference getLink_info_EContainer_link_info();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Link_info#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Link_info#getSize()
	 * @see #getLink_info()
	 * @generated
	 */
	EAttribute getLink_info_Size();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Link_info#getRate <em>Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rate</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Link_info#getRate()
	 * @see #getLink_info()
	 * @generated
	 */
	EAttribute getLink_info_Rate();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Link_info#getFwd <em>Fwd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fwd</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Link_info#getFwd()
	 * @see #getLink_info()
	 * @generated
	 */
	EAttribute getLink_info_Fwd();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Link_info#getRev <em>Rev</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rev</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Link_info#getRev()
	 * @see #getLink_info()
	 * @generated
	 */
	EAttribute getLink_info_Rev();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Device_wifi_link_stat_bcast_statsFactory getDevice_wifi_link_stat_bcast_statsFactory();

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
		 * The meta object literal for the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.impl.Bcast_statsImpl <em>Bcast stats</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.impl.Bcast_statsImpl
		 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.impl.Device_wifi_link_stat_bcast_statsPackageImpl#getBcast_stats()
		 * @generated
		 */
		EClass BCAST_STATS = eINSTANCE.getBcast_stats();

		/**
		 * The meta object literal for the '<em><b>Entry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BCAST_STATS__ENTRY = eINSTANCE.getBcast_stats_Entry();

		/**
		 * The meta object literal for the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.impl.EntryImpl <em>Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.impl.EntryImpl
		 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.impl.Device_wifi_link_stat_bcast_statsPackageImpl#getEntry()
		 * @generated
		 */
		EClass ENTRY = eINSTANCE.getEntry();

		/**
		 * The meta object literal for the '<em><b>EContainer entry</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRY__ECONTAINER_ENTRY = eINSTANCE.getEntry_EContainer_entry();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRY__TEXT = eINSTANCE.getEntry_Text();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRY__LINK = eINSTANCE.getEntry_Link();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRY__FROM = eINSTANCE.getEntry_From();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRY__TIME = eINSTANCE.getEntry_Time();

		/**
		 * The meta object literal for the '<em><b>Seq</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRY__SEQ = eINSTANCE.getEntry_Seq();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRY__PERIOD = eINSTANCE.getEntry_Period();

		/**
		 * The meta object literal for the '<em><b>Tau</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRY__TAU = eINSTANCE.getEntry_Tau();

		/**
		 * The meta object literal for the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.impl.LinkImpl
		 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.impl.Device_wifi_link_stat_bcast_statsPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>EContainer link</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__ECONTAINER_LINK = eINSTANCE.getLink_EContainer_link();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__TEXT = eINSTANCE.getLink_Text();

		/**
		 * The meta object literal for the '<em><b>Link info</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__LINK_INFO = eINSTANCE.getLink_Link_info();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__TO = eINSTANCE.getLink_To();

		/**
		 * The meta object literal for the '<em><b>Seq</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__SEQ = eINSTANCE.getLink_Seq();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__PERIOD = eINSTANCE.getLink_Period();

		/**
		 * The meta object literal for the '<em><b>Tau</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__TAU = eINSTANCE.getLink_Tau();

		/**
		 * The meta object literal for the '<em><b>Last rx</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__LAST_RX = eINSTANCE.getLink_Last_rx();

		/**
		 * The meta object literal for the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.impl.Link_infoImpl <em>Link info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.impl.Link_infoImpl
		 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.impl.Device_wifi_link_stat_bcast_statsPackageImpl#getLink_info()
		 * @generated
		 */
		EClass LINK_INFO = eINSTANCE.getLink_info();

		/**
		 * The meta object literal for the '<em><b>EContainer link info</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_INFO__ECONTAINER_LINK_INFO = eINSTANCE.getLink_info_EContainer_link_info();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_INFO__SIZE = eINSTANCE.getLink_info_Size();

		/**
		 * The meta object literal for the '<em><b>Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_INFO__RATE = eINSTANCE.getLink_info_Rate();

		/**
		 * The meta object literal for the '<em><b>Fwd</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_INFO__FWD = eINSTANCE.getLink_info_Fwd();

		/**
		 * The meta object literal for the '<em><b>Rev</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_INFO__REV = eINSTANCE.getLink_info_Rev();

	}

} //Device_wifi_link_stat_bcast_statsPackage
