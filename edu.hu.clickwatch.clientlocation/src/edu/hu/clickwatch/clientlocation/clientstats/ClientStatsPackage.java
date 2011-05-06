/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package edu.hu.clickwatch.clientlocation.clientstats;

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
 * @see edu.hu.clickwatch.clientlocation.clientstats.ClientStatsFactory
 * @model kind="package"
 * @generated
 */
public interface ClientStatsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "clientstats";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://clientstats/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "clientstats";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ClientStatsPackage eINSTANCE = edu.hu.clickwatch.clientlocation.clientstats.impl.ClientStatsPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.hu.clickwatch.clientlocation.clientstats.impl.ClientImpl <em>Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.hu.clickwatch.clientlocation.clientstats.impl.ClientImpl
	 * @see edu.hu.clickwatch.clientlocation.clientstats.impl.ClientStatsPackageImpl#getClient()
	 * @generated
	 */
	int CLIENT = 0;

	/**
	 * The feature id for the '<em><b>Is Seen From</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__IS_SEEN_FROM = 0;

	/**
	 * The feature id for the '<em><b>Mac</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__MAC = 1;

	/**
	 * The number of structural features of the '<em>Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link edu.hu.clickwatch.clientlocation.clientstats.impl.APLinkImpl <em>AP Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.hu.clickwatch.clientlocation.clientstats.impl.APLinkImpl
	 * @see edu.hu.clickwatch.clientlocation.clientstats.impl.ClientStatsPackageImpl#getAPLink()
	 * @generated
	 */
	int AP_LINK = 1;

	/**
	 * The feature id for the '<em><b>Long</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AP_LINK__LONG = 0;

	/**
	 * The feature id for the '<em><b>Lat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AP_LINK__LAT = 1;

	/**
	 * The feature id for the '<em><b>Rssi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AP_LINK__RSSI = 2;

	/**
	 * The feature id for the '<em><b>Mac</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AP_LINK__MAC = 3;

	/**
	 * The number of structural features of the '<em>AP Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AP_LINK_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link edu.hu.clickwatch.clientlocation.clientstats.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.hu.clickwatch.clientlocation.clientstats.impl.LinkImpl
	 * @see edu.hu.clickwatch.clientlocation.clientstats.impl.ClientStatsPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 2;

	/**
	 * The feature id for the '<em><b>Rssi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__RSSI = 0;

	/**
	 * The feature id for the '<em><b>EReference0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__EREFERENCE0 = 1;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = 2;


	/**
	 * The meta object id for the '{@link edu.hu.clickwatch.clientlocation.clientstats.impl.ClientStatsImpl <em>Client Stats</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.hu.clickwatch.clientlocation.clientstats.impl.ClientStatsImpl
	 * @see edu.hu.clickwatch.clientlocation.clientstats.impl.ClientStatsPackageImpl#getClientStats()
	 * @generated
	 */
	int CLIENT_STATS = 3;

	/**
	 * The feature id for the '<em><b>Clients</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_STATS__CLIENTS = 0;

	/**
	 * The feature id for the '<em><b>Ap Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_STATS__AP_LINKS = 1;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_STATS__TIME = 2;

	/**
	 * The number of structural features of the '<em>Client Stats</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_STATS_FEATURE_COUNT = 3;


	/**
	 * Returns the meta object for class '{@link edu.hu.clickwatch.clientlocation.clientstats.Client <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Client</em>'.
	 * @see edu.hu.clickwatch.clientlocation.clientstats.Client
	 * @generated
	 */
	EClass getClient();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.hu.clickwatch.clientlocation.clientstats.Client#getIsSeenFrom <em>Is Seen From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Is Seen From</em>'.
	 * @see edu.hu.clickwatch.clientlocation.clientstats.Client#getIsSeenFrom()
	 * @see #getClient()
	 * @generated
	 */
	EReference getClient_IsSeenFrom();

	/**
	 * Returns the meta object for the attribute '{@link edu.hu.clickwatch.clientlocation.clientstats.Client#getMac <em>Mac</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mac</em>'.
	 * @see edu.hu.clickwatch.clientlocation.clientstats.Client#getMac()
	 * @see #getClient()
	 * @generated
	 */
	EAttribute getClient_Mac();

	/**
	 * Returns the meta object for class '{@link edu.hu.clickwatch.clientlocation.clientstats.APLink <em>AP Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AP Link</em>'.
	 * @see edu.hu.clickwatch.clientlocation.clientstats.APLink
	 * @generated
	 */
	EClass getAPLink();

	/**
	 * Returns the meta object for the attribute '{@link edu.hu.clickwatch.clientlocation.clientstats.APLink#getLong <em>Long</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Long</em>'.
	 * @see edu.hu.clickwatch.clientlocation.clientstats.APLink#getLong()
	 * @see #getAPLink()
	 * @generated
	 */
	EAttribute getAPLink_Long();

	/**
	 * Returns the meta object for the attribute '{@link edu.hu.clickwatch.clientlocation.clientstats.APLink#getLat <em>Lat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lat</em>'.
	 * @see edu.hu.clickwatch.clientlocation.clientstats.APLink#getLat()
	 * @see #getAPLink()
	 * @generated
	 */
	EAttribute getAPLink_Lat();

	/**
	 * Returns the meta object for the attribute '{@link edu.hu.clickwatch.clientlocation.clientstats.APLink#getRssi <em>Rssi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rssi</em>'.
	 * @see edu.hu.clickwatch.clientlocation.clientstats.APLink#getRssi()
	 * @see #getAPLink()
	 * @generated
	 */
	EAttribute getAPLink_Rssi();

	/**
	 * Returns the meta object for the attribute '{@link edu.hu.clickwatch.clientlocation.clientstats.APLink#getMac <em>Mac</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mac</em>'.
	 * @see edu.hu.clickwatch.clientlocation.clientstats.APLink#getMac()
	 * @see #getAPLink()
	 * @generated
	 */
	EAttribute getAPLink_Mac();

	/**
	 * Returns the meta object for class '{@link edu.hu.clickwatch.clientlocation.clientstats.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see edu.hu.clickwatch.clientlocation.clientstats.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the attribute '{@link edu.hu.clickwatch.clientlocation.clientstats.Link#getRssi <em>Rssi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rssi</em>'.
	 * @see edu.hu.clickwatch.clientlocation.clientstats.Link#getRssi()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Rssi();

	/**
	 * Returns the meta object for the reference '{@link edu.hu.clickwatch.clientlocation.clientstats.Link#getEReference0 <em>EReference0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EReference0</em>'.
	 * @see edu.hu.clickwatch.clientlocation.clientstats.Link#getEReference0()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_EReference0();

	/**
	 * Returns the meta object for class '{@link edu.hu.clickwatch.clientlocation.clientstats.ClientStats <em>Client Stats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Client Stats</em>'.
	 * @see edu.hu.clickwatch.clientlocation.clientstats.ClientStats
	 * @generated
	 */
	EClass getClientStats();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.hu.clickwatch.clientlocation.clientstats.ClientStats#getClients <em>Clients</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Clients</em>'.
	 * @see edu.hu.clickwatch.clientlocation.clientstats.ClientStats#getClients()
	 * @see #getClientStats()
	 * @generated
	 */
	EReference getClientStats_Clients();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.hu.clickwatch.clientlocation.clientstats.ClientStats#getApLinks <em>Ap Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ap Links</em>'.
	 * @see edu.hu.clickwatch.clientlocation.clientstats.ClientStats#getApLinks()
	 * @see #getClientStats()
	 * @generated
	 */
	EReference getClientStats_ApLinks();

	/**
	 * Returns the meta object for the attribute '{@link edu.hu.clickwatch.clientlocation.clientstats.ClientStats#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see edu.hu.clickwatch.clientlocation.clientstats.ClientStats#getTime()
	 * @see #getClientStats()
	 * @generated
	 */
	EAttribute getClientStats_Time();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ClientStatsFactory getClientStatsFactory();

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
		 * The meta object literal for the '{@link edu.hu.clickwatch.clientlocation.clientstats.impl.ClientImpl <em>Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.hu.clickwatch.clientlocation.clientstats.impl.ClientImpl
		 * @see edu.hu.clickwatch.clientlocation.clientstats.impl.ClientStatsPackageImpl#getClient()
		 * @generated
		 */
		EClass CLIENT = eINSTANCE.getClient();

		/**
		 * The meta object literal for the '<em><b>Is Seen From</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLIENT__IS_SEEN_FROM = eINSTANCE.getClient_IsSeenFrom();

		/**
		 * The meta object literal for the '<em><b>Mac</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENT__MAC = eINSTANCE.getClient_Mac();

		/**
		 * The meta object literal for the '{@link edu.hu.clickwatch.clientlocation.clientstats.impl.APLinkImpl <em>AP Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.hu.clickwatch.clientlocation.clientstats.impl.APLinkImpl
		 * @see edu.hu.clickwatch.clientlocation.clientstats.impl.ClientStatsPackageImpl#getAPLink()
		 * @generated
		 */
		EClass AP_LINK = eINSTANCE.getAPLink();

		/**
		 * The meta object literal for the '<em><b>Long</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AP_LINK__LONG = eINSTANCE.getAPLink_Long();

		/**
		 * The meta object literal for the '<em><b>Lat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AP_LINK__LAT = eINSTANCE.getAPLink_Lat();

		/**
		 * The meta object literal for the '<em><b>Rssi</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AP_LINK__RSSI = eINSTANCE.getAPLink_Rssi();

		/**
		 * The meta object literal for the '<em><b>Mac</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AP_LINK__MAC = eINSTANCE.getAPLink_Mac();

		/**
		 * The meta object literal for the '{@link edu.hu.clickwatch.clientlocation.clientstats.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.hu.clickwatch.clientlocation.clientstats.impl.LinkImpl
		 * @see edu.hu.clickwatch.clientlocation.clientstats.impl.ClientStatsPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>Rssi</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__RSSI = eINSTANCE.getLink_Rssi();

		/**
		 * The meta object literal for the '<em><b>EReference0</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__EREFERENCE0 = eINSTANCE.getLink_EReference0();

		/**
		 * The meta object literal for the '{@link edu.hu.clickwatch.clientlocation.clientstats.impl.ClientStatsImpl <em>Client Stats</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.hu.clickwatch.clientlocation.clientstats.impl.ClientStatsImpl
		 * @see edu.hu.clickwatch.clientlocation.clientstats.impl.ClientStatsPackageImpl#getClientStats()
		 * @generated
		 */
		EClass CLIENT_STATS = eINSTANCE.getClientStats();

		/**
		 * The meta object literal for the '<em><b>Clients</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLIENT_STATS__CLIENTS = eINSTANCE.getClientStats_Clients();

		/**
		 * The meta object literal for the '<em><b>Ap Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLIENT_STATS__AP_LINKS = eINSTANCE.getClientStats_ApLinks();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENT_STATS__TIME = eINSTANCE.getClientStats_Time();

	}

} //ClientStatsPackage
