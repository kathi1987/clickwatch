/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificdatamodels.brn.device_wifi_data_power_systempower;

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
 * @see de.hub.clickwatch.specificdatamodels.brn.device_wifi_data_power_systempower.Device_wifi_data_power_systempowerFactory
 * @model kind="package"
 *        annotation="http://de.hub.clickwatch.specificmodels handler_class='Systempower'"
 * @generated
 */
public interface Device_wifi_data_power_systempowerPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "device_wifi_data_power_systempower";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://de.hub.clickwatch.specificmodels.brn/device_wifi/data_power/systempower";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "device_wifi_data_power_systempower";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Device_wifi_data_power_systempowerPackage eINSTANCE = de.hub.clickwatch.specificdatamodels.brn.device_wifi_data_power_systempower.impl.Device_wifi_data_power_systempowerPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_data_power_systempower.impl.DeviceImpl <em>Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.specificdatamodels.brn.device_wifi_data_power_systempower.impl.DeviceImpl
	 * @see de.hub.clickwatch.specificdatamodels.brn.device_wifi_data_power_systempower.impl.Device_wifi_data_power_systempowerPackageImpl#getDevice()
	 * @generated
	 */
	int DEVICE = 0;

	/**
	 * The feature id for the '<em><b>EContainer device</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__ECONTAINER_DEVICE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Device addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__DEVICE_ADDR = 2;

	/**
	 * The number of structural features of the '<em>Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_data_power_systempower.impl.SettxpowerImpl <em>Settxpower</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.specificdatamodels.brn.device_wifi_data_power_systempower.impl.SettxpowerImpl
	 * @see de.hub.clickwatch.specificdatamodels.brn.device_wifi_data_power_systempower.impl.Device_wifi_data_power_systempowerPackageImpl#getSettxpower()
	 * @generated
	 */
	int SETTXPOWER = 1;

	/**
	 * The feature id for the '<em><b>EContainer settxpower</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTXPOWER__ECONTAINER_SETTXPOWER = 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTXPOWER__TEXT = 1;

	/**
	 * The feature id for the '<em><b>Device</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTXPOWER__DEVICE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTXPOWER__NAME = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTXPOWER__ID = 4;

	/**
	 * The feature id for the '<em><b>Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTXPOWER__POWER = 5;

	/**
	 * The number of structural features of the '<em>Settxpower</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTXPOWER_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_data_power_systempower.impl.SystempowerImpl <em>Systempower</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.specificdatamodels.brn.device_wifi_data_power_systempower.impl.SystempowerImpl
	 * @see de.hub.clickwatch.specificdatamodels.brn.device_wifi_data_power_systempower.impl.Device_wifi_data_power_systempowerPackageImpl#getSystempower()
	 * @generated
	 */
	int SYSTEMPOWER = 2;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMPOWER__MIXED = ClickWatchDataModelPackage.VALUE__MIXED;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMPOWER__ANY = ClickWatchDataModelPackage.VALUE__ANY;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMPOWER__VALUE = ClickWatchDataModelPackage.VALUE__VALUE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMPOWER__TIMESTAMP = ClickWatchDataModelPackage.VALUE__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Settxpower</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMPOWER__SETTXPOWER = ClickWatchDataModelPackage.VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Systempower</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEMPOWER_FEATURE_COUNT = ClickWatchDataModelPackage.VALUE_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_data_power_systempower.Device <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device</em>'.
	 * @see de.hub.clickwatch.specificdatamodels.brn.device_wifi_data_power_systempower.Device
	 * @generated
	 */
	EClass getDevice();

	/**
	 * Returns the meta object for the container reference '{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_data_power_systempower.Device#getEContainer_device <em>EContainer device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>EContainer device</em>'.
	 * @see de.hub.clickwatch.specificdatamodels.brn.device_wifi_data_power_systempower.Device#getEContainer_device()
	 * @see #getDevice()
	 * @generated
	 */
	EReference getDevice_EContainer_device();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_data_power_systempower.Device#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.hub.clickwatch.specificdatamodels.brn.device_wifi_data_power_systempower.Device#getName()
	 * @see #getDevice()
	 * @generated
	 */
	EAttribute getDevice_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_data_power_systempower.Device#getDevice_addr <em>Device addr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Device addr</em>'.
	 * @see de.hub.clickwatch.specificdatamodels.brn.device_wifi_data_power_systempower.Device#getDevice_addr()
	 * @see #getDevice()
	 * @generated
	 */
	EAttribute getDevice_Device_addr();

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_data_power_systempower.Settxpower <em>Settxpower</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Settxpower</em>'.
	 * @see de.hub.clickwatch.specificdatamodels.brn.device_wifi_data_power_systempower.Settxpower
	 * @generated
	 */
	EClass getSettxpower();

	/**
	 * Returns the meta object for the container reference '{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_data_power_systempower.Settxpower#getEContainer_settxpower <em>EContainer settxpower</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>EContainer settxpower</em>'.
	 * @see de.hub.clickwatch.specificdatamodels.brn.device_wifi_data_power_systempower.Settxpower#getEContainer_settxpower()
	 * @see #getSettxpower()
	 * @generated
	 */
	EReference getSettxpower_EContainer_settxpower();

	/**
	 * Returns the meta object for the attribute list '{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_data_power_systempower.Settxpower#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Text</em>'.
	 * @see de.hub.clickwatch.specificdatamodels.brn.device_wifi_data_power_systempower.Settxpower#getText()
	 * @see #getSettxpower()
	 * @generated
	 */
	EAttribute getSettxpower_Text();

	/**
	 * Returns the meta object for the containment reference '{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_data_power_systempower.Settxpower#getDevice <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Device</em>'.
	 * @see de.hub.clickwatch.specificdatamodels.brn.device_wifi_data_power_systempower.Settxpower#getDevice()
	 * @see #getSettxpower()
	 * @generated
	 */
	EReference getSettxpower_Device();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_data_power_systempower.Settxpower#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.hub.clickwatch.specificdatamodels.brn.device_wifi_data_power_systempower.Settxpower#getName()
	 * @see #getSettxpower()
	 * @generated
	 */
	EAttribute getSettxpower_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_data_power_systempower.Settxpower#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.hub.clickwatch.specificdatamodels.brn.device_wifi_data_power_systempower.Settxpower#getId()
	 * @see #getSettxpower()
	 * @generated
	 */
	EAttribute getSettxpower_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_data_power_systempower.Settxpower#getPower <em>Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Power</em>'.
	 * @see de.hub.clickwatch.specificdatamodels.brn.device_wifi_data_power_systempower.Settxpower#getPower()
	 * @see #getSettxpower()
	 * @generated
	 */
	EAttribute getSettxpower_Power();

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_data_power_systempower.Systempower <em>Systempower</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Systempower</em>'.
	 * @see de.hub.clickwatch.specificdatamodels.brn.device_wifi_data_power_systempower.Systempower
	 * @generated
	 */
	EClass getSystempower();

	/**
	 * Returns the meta object for the containment reference '{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_data_power_systempower.Systempower#getSettxpower <em>Settxpower</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Settxpower</em>'.
	 * @see de.hub.clickwatch.specificdatamodels.brn.device_wifi_data_power_systempower.Systempower#getSettxpower()
	 * @see #getSystempower()
	 * @generated
	 */
	EReference getSystempower_Settxpower();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Device_wifi_data_power_systempowerFactory getDevice_wifi_data_power_systempowerFactory();

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
		 * The meta object literal for the '{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_data_power_systempower.impl.DeviceImpl <em>Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.specificdatamodels.brn.device_wifi_data_power_systempower.impl.DeviceImpl
		 * @see de.hub.clickwatch.specificdatamodels.brn.device_wifi_data_power_systempower.impl.Device_wifi_data_power_systempowerPackageImpl#getDevice()
		 * @generated
		 */
		EClass DEVICE = eINSTANCE.getDevice();

		/**
		 * The meta object literal for the '<em><b>EContainer device</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE__ECONTAINER_DEVICE = eINSTANCE.getDevice_EContainer_device();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE__NAME = eINSTANCE.getDevice_Name();

		/**
		 * The meta object literal for the '<em><b>Device addr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE__DEVICE_ADDR = eINSTANCE.getDevice_Device_addr();

		/**
		 * The meta object literal for the '{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_data_power_systempower.impl.SettxpowerImpl <em>Settxpower</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.specificdatamodels.brn.device_wifi_data_power_systempower.impl.SettxpowerImpl
		 * @see de.hub.clickwatch.specificdatamodels.brn.device_wifi_data_power_systempower.impl.Device_wifi_data_power_systempowerPackageImpl#getSettxpower()
		 * @generated
		 */
		EClass SETTXPOWER = eINSTANCE.getSettxpower();

		/**
		 * The meta object literal for the '<em><b>EContainer settxpower</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SETTXPOWER__ECONTAINER_SETTXPOWER = eINSTANCE.getSettxpower_EContainer_settxpower();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SETTXPOWER__TEXT = eINSTANCE.getSettxpower_Text();

		/**
		 * The meta object literal for the '<em><b>Device</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SETTXPOWER__DEVICE = eINSTANCE.getSettxpower_Device();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SETTXPOWER__NAME = eINSTANCE.getSettxpower_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SETTXPOWER__ID = eINSTANCE.getSettxpower_Id();

		/**
		 * The meta object literal for the '<em><b>Power</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SETTXPOWER__POWER = eINSTANCE.getSettxpower_Power();

		/**
		 * The meta object literal for the '{@link de.hub.clickwatch.specificdatamodels.brn.device_wifi_data_power_systempower.impl.SystempowerImpl <em>Systempower</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.specificdatamodels.brn.device_wifi_data_power_systempower.impl.SystempowerImpl
		 * @see de.hub.clickwatch.specificdatamodels.brn.device_wifi_data_power_systempower.impl.Device_wifi_data_power_systempowerPackageImpl#getSystempower()
		 * @generated
		 */
		EClass SYSTEMPOWER = eINSTANCE.getSystempower();

		/**
		 * The meta object literal for the '<em><b>Settxpower</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEMPOWER__SETTXPOWER = eINSTANCE.getSystempower_Settxpower();

	}

} //Device_wifi_data_power_systempowerPackage
