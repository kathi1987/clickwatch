/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificdatamodels.brn.lease_tab_leases;

import de.hub.clickwatch.datamodel.ClickWatchDataModelPackage;

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
 * @see de.hub.clickwatch.specificdatamodels.brn.lease_tab_leases.Lease_tab_leasesFactory
 * @model kind="package"
 *        annotation="http://de.hub.clickwatch.specificmodels handler_class='Leases'"
 * @generated
 */
public interface Lease_tab_leasesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "lease_tab_leases";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://de.hub.clickwatch.specificmodels.brn/lease_tab/leases";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "lease_tab_leases";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Lease_tab_leasesPackage eINSTANCE = de.hub.clickwatch.specificdatamodels.brn.lease_tab_leases.impl.Lease_tab_leasesPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.specificdatamodels.brn.lease_tab_leases.impl.ClientImpl <em>Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.specificdatamodels.brn.lease_tab_leases.impl.ClientImpl
	 * @see de.hub.clickwatch.specificdatamodels.brn.lease_tab_leases.impl.Lease_tab_leasesPackageImpl#getClient()
	 * @generated
	 */
	int CLIENT = 0;

	/**
	 * The feature id for the '<em><b>EContainer client</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__ECONTAINER_CLIENT = 0;

	/**
	 * The feature id for the '<em><b>Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__IP = 1;

	/**
	 * The feature id for the '<em><b>Mac</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__MAC = 2;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__START = 3;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__END = 4;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__DURATION = 5;

	/**
	 * The feature id for the '<em><b>Time left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__TIME_LEFT = 6;

	/**
	 * The number of structural features of the '<em>Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.specificdatamodels.brn.lease_tab_leases.impl.DhcpleasesImpl <em>Dhcpleases</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.specificdatamodels.brn.lease_tab_leases.impl.DhcpleasesImpl
	 * @see de.hub.clickwatch.specificdatamodels.brn.lease_tab_leases.impl.Lease_tab_leasesPackageImpl#getDhcpleases()
	 * @generated
	 */
	int DHCPLEASES = 1;

	/**
	 * The feature id for the '<em><b>EContainer dhcpleases</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DHCPLEASES__ECONTAINER_DHCPLEASES = 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DHCPLEASES__TEXT = 1;

	/**
	 * The feature id for the '<em><b>Client</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DHCPLEASES__CLIENT = 2;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DHCPLEASES__COUNT = 3;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DHCPLEASES__TIME = 4;

	/**
	 * The number of structural features of the '<em>Dhcpleases</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DHCPLEASES_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.specificdatamodels.brn.lease_tab_leases.impl.LeasesImpl <em>Leases</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.specificdatamodels.brn.lease_tab_leases.impl.LeasesImpl
	 * @see de.hub.clickwatch.specificdatamodels.brn.lease_tab_leases.impl.Lease_tab_leasesPackageImpl#getLeases()
	 * @generated
	 */
	int LEASES = 2;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEASES__MIXED = ClickWatchDataModelPackage.VALUE__MIXED;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEASES__ANY = ClickWatchDataModelPackage.VALUE__ANY;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEASES__VALUE = ClickWatchDataModelPackage.VALUE__VALUE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEASES__TIMESTAMP = ClickWatchDataModelPackage.VALUE__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Dhcpleases</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEASES__DHCPLEASES = ClickWatchDataModelPackage.VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Leases</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEASES_FEATURE_COUNT = ClickWatchDataModelPackage.VALUE_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.specificdatamodels.brn.lease_tab_leases.Client <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Client</em>'.
	 * @see de.hub.clickwatch.specificdatamodels.brn.lease_tab_leases.Client
	 * @generated
	 */
	EClass getClient();

	/**
	 * Returns the meta object for the container reference '{@link de.hub.clickwatch.specificdatamodels.brn.lease_tab_leases.Client#getEContainer_client <em>EContainer client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>EContainer client</em>'.
	 * @see de.hub.clickwatch.specificdatamodels.brn.lease_tab_leases.Client#getEContainer_client()
	 * @see #getClient()
	 * @generated
	 */
	EReference getClient_EContainer_client();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificdatamodels.brn.lease_tab_leases.Client#getIp <em>Ip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ip</em>'.
	 * @see de.hub.clickwatch.specificdatamodels.brn.lease_tab_leases.Client#getIp()
	 * @see #getClient()
	 * @generated
	 */
	EAttribute getClient_Ip();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificdatamodels.brn.lease_tab_leases.Client#getMac <em>Mac</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mac</em>'.
	 * @see de.hub.clickwatch.specificdatamodels.brn.lease_tab_leases.Client#getMac()
	 * @see #getClient()
	 * @generated
	 */
	EAttribute getClient_Mac();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificdatamodels.brn.lease_tab_leases.Client#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see de.hub.clickwatch.specificdatamodels.brn.lease_tab_leases.Client#getStart()
	 * @see #getClient()
	 * @generated
	 */
	EAttribute getClient_Start();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificdatamodels.brn.lease_tab_leases.Client#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see de.hub.clickwatch.specificdatamodels.brn.lease_tab_leases.Client#getEnd()
	 * @see #getClient()
	 * @generated
	 */
	EAttribute getClient_End();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificdatamodels.brn.lease_tab_leases.Client#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see de.hub.clickwatch.specificdatamodels.brn.lease_tab_leases.Client#getDuration()
	 * @see #getClient()
	 * @generated
	 */
	EAttribute getClient_Duration();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificdatamodels.brn.lease_tab_leases.Client#getTime_left <em>Time left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time left</em>'.
	 * @see de.hub.clickwatch.specificdatamodels.brn.lease_tab_leases.Client#getTime_left()
	 * @see #getClient()
	 * @generated
	 */
	EAttribute getClient_Time_left();

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.specificdatamodels.brn.lease_tab_leases.Dhcpleases <em>Dhcpleases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dhcpleases</em>'.
	 * @see de.hub.clickwatch.specificdatamodels.brn.lease_tab_leases.Dhcpleases
	 * @generated
	 */
	EClass getDhcpleases();

	/**
	 * Returns the meta object for the container reference '{@link de.hub.clickwatch.specificdatamodels.brn.lease_tab_leases.Dhcpleases#getEContainer_dhcpleases <em>EContainer dhcpleases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>EContainer dhcpleases</em>'.
	 * @see de.hub.clickwatch.specificdatamodels.brn.lease_tab_leases.Dhcpleases#getEContainer_dhcpleases()
	 * @see #getDhcpleases()
	 * @generated
	 */
	EReference getDhcpleases_EContainer_dhcpleases();

	/**
	 * Returns the meta object for the attribute list '{@link de.hub.clickwatch.specificdatamodels.brn.lease_tab_leases.Dhcpleases#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Text</em>'.
	 * @see de.hub.clickwatch.specificdatamodels.brn.lease_tab_leases.Dhcpleases#getText()
	 * @see #getDhcpleases()
	 * @generated
	 */
	EAttribute getDhcpleases_Text();

	/**
	 * Returns the meta object for the containment reference list '{@link de.hub.clickwatch.specificdatamodels.brn.lease_tab_leases.Dhcpleases#getClient <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Client</em>'.
	 * @see de.hub.clickwatch.specificdatamodels.brn.lease_tab_leases.Dhcpleases#getClient()
	 * @see #getDhcpleases()
	 * @generated
	 */
	EReference getDhcpleases_Client();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificdatamodels.brn.lease_tab_leases.Dhcpleases#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see de.hub.clickwatch.specificdatamodels.brn.lease_tab_leases.Dhcpleases#getCount()
	 * @see #getDhcpleases()
	 * @generated
	 */
	EAttribute getDhcpleases_Count();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificdatamodels.brn.lease_tab_leases.Dhcpleases#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see de.hub.clickwatch.specificdatamodels.brn.lease_tab_leases.Dhcpleases#getTime()
	 * @see #getDhcpleases()
	 * @generated
	 */
	EAttribute getDhcpleases_Time();

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.specificdatamodels.brn.lease_tab_leases.Leases <em>Leases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Leases</em>'.
	 * @see de.hub.clickwatch.specificdatamodels.brn.lease_tab_leases.Leases
	 * @generated
	 */
	EClass getLeases();

	/**
	 * Returns the meta object for the containment reference '{@link de.hub.clickwatch.specificdatamodels.brn.lease_tab_leases.Leases#getDhcpleases <em>Dhcpleases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dhcpleases</em>'.
	 * @see de.hub.clickwatch.specificdatamodels.brn.lease_tab_leases.Leases#getDhcpleases()
	 * @see #getLeases()
	 * @generated
	 */
	EReference getLeases_Dhcpleases();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Lease_tab_leasesFactory getLease_tab_leasesFactory();

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
		 * The meta object literal for the '{@link de.hub.clickwatch.specificdatamodels.brn.lease_tab_leases.impl.ClientImpl <em>Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.specificdatamodels.brn.lease_tab_leases.impl.ClientImpl
		 * @see de.hub.clickwatch.specificdatamodels.brn.lease_tab_leases.impl.Lease_tab_leasesPackageImpl#getClient()
		 * @generated
		 */
		EClass CLIENT = eINSTANCE.getClient();

		/**
		 * The meta object literal for the '<em><b>EContainer client</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLIENT__ECONTAINER_CLIENT = eINSTANCE.getClient_EContainer_client();

		/**
		 * The meta object literal for the '<em><b>Ip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENT__IP = eINSTANCE.getClient_Ip();

		/**
		 * The meta object literal for the '<em><b>Mac</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENT__MAC = eINSTANCE.getClient_Mac();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENT__START = eINSTANCE.getClient_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENT__END = eINSTANCE.getClient_End();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENT__DURATION = eINSTANCE.getClient_Duration();

		/**
		 * The meta object literal for the '<em><b>Time left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENT__TIME_LEFT = eINSTANCE.getClient_Time_left();

		/**
		 * The meta object literal for the '{@link de.hub.clickwatch.specificdatamodels.brn.lease_tab_leases.impl.DhcpleasesImpl <em>Dhcpleases</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.specificdatamodels.brn.lease_tab_leases.impl.DhcpleasesImpl
		 * @see de.hub.clickwatch.specificdatamodels.brn.lease_tab_leases.impl.Lease_tab_leasesPackageImpl#getDhcpleases()
		 * @generated
		 */
		EClass DHCPLEASES = eINSTANCE.getDhcpleases();

		/**
		 * The meta object literal for the '<em><b>EContainer dhcpleases</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DHCPLEASES__ECONTAINER_DHCPLEASES = eINSTANCE.getDhcpleases_EContainer_dhcpleases();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DHCPLEASES__TEXT = eINSTANCE.getDhcpleases_Text();

		/**
		 * The meta object literal for the '<em><b>Client</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DHCPLEASES__CLIENT = eINSTANCE.getDhcpleases_Client();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DHCPLEASES__COUNT = eINSTANCE.getDhcpleases_Count();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DHCPLEASES__TIME = eINSTANCE.getDhcpleases_Time();

		/**
		 * The meta object literal for the '{@link de.hub.clickwatch.specificdatamodels.brn.lease_tab_leases.impl.LeasesImpl <em>Leases</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.specificdatamodels.brn.lease_tab_leases.impl.LeasesImpl
		 * @see de.hub.clickwatch.specificdatamodels.brn.lease_tab_leases.impl.Lease_tab_leasesPackageImpl#getLeases()
		 * @generated
		 */
		EClass LEASES = eINSTANCE.getLeases();

		/**
		 * The meta object literal for the '<em><b>Dhcpleases</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEASES__DHCPLEASES = eINSTANCE.getLeases_Dhcpleases();

	}

} //Lease_tab_leasesPackage
