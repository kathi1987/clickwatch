/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_sc_systemchannel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import de.hub.clickwatch.model.ClickWatchModelPackage;

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
 * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_sc_systemchannel.Device_wifi_wifidevice_sc_systemchannelFactory
 * @model kind="package"
 *        annotation="http://de.hub.clickwatch.specificmodels handler_class='Systemchannel'"
 * @generated
 */
public interface Device_wifi_wifidevice_sc_systemchannelPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "device_wifi_wifidevice_sc_systemchannel";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://de.hub.clickwatch.specificmodels.brn/device_wifi/wifidevice/sc/systemchannel";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "device_wifi_wifidevice_sc_systemchannel";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    Device_wifi_wifidevice_sc_systemchannelPackage eINSTANCE = de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_sc_systemchannel.impl.Device_wifi_wifidevice_sc_systemchannelPackageImpl.init();

    /**
     * The meta object id for the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_sc_systemchannel.impl.DeviceImpl <em>Device</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_sc_systemchannel.impl.DeviceImpl
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_sc_systemchannel.impl.Device_wifi_wifidevice_sc_systemchannelPackageImpl#getDevice()
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
     * The meta object id for the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_sc_systemchannel.impl.SetchannelImpl <em>Setchannel</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_sc_systemchannel.impl.SetchannelImpl
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_sc_systemchannel.impl.Device_wifi_wifidevice_sc_systemchannelPackageImpl#getSetchannel()
     * @generated
     */
    int SETCHANNEL = 1;

    /**
     * The feature id for the '<em><b>EContainer setchannel</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SETCHANNEL__ECONTAINER_SETCHANNEL = 0;

    /**
     * The feature id for the '<em><b>Text</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SETCHANNEL__TEXT = 1;

    /**
     * The feature id for the '<em><b>Device</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SETCHANNEL__DEVICE = 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SETCHANNEL__NAME = 3;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SETCHANNEL__ID = 4;

    /**
     * The feature id for the '<em><b>Channel</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SETCHANNEL__CHANNEL = 5;

    /**
     * The number of structural features of the '<em>Setchannel</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SETCHANNEL_FEATURE_COUNT = 6;

    /**
     * The meta object id for the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_sc_systemchannel.impl.SystemchannelImpl <em>Systemchannel</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_sc_systemchannel.impl.SystemchannelImpl
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_sc_systemchannel.impl.Device_wifi_wifidevice_sc_systemchannelPackageImpl#getSystemchannel()
     * @generated
     */
    int SYSTEMCHANNEL = 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEMCHANNEL__NAME = ClickWatchModelPackage.HANDLER__NAME;

    /**
     * The feature id for the '<em><b>Can Read</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEMCHANNEL__CAN_READ = ClickWatchModelPackage.HANDLER__CAN_READ;

    /**
     * The feature id for the '<em><b>Can Write</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEMCHANNEL__CAN_WRITE = ClickWatchModelPackage.HANDLER__CAN_WRITE;

    /**
     * The feature id for the '<em><b>Changed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEMCHANNEL__CHANGED = ClickWatchModelPackage.HANDLER__CHANGED;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEMCHANNEL__MIXED = ClickWatchModelPackage.HANDLER__MIXED;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEMCHANNEL__ANY = ClickWatchModelPackage.HANDLER__ANY;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEMCHANNEL__VALUE = ClickWatchModelPackage.HANDLER__VALUE;

    /**
     * The feature id for the '<em><b>Timestamp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEMCHANNEL__TIMESTAMP = ClickWatchModelPackage.HANDLER__TIMESTAMP;

    /**
     * The feature id for the '<em><b>Setchannel</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEMCHANNEL__SETCHANNEL = ClickWatchModelPackage.HANDLER_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Systemchannel</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEMCHANNEL_FEATURE_COUNT = ClickWatchModelPackage.HANDLER_FEATURE_COUNT + 1;


    /**
     * Returns the meta object for class '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_sc_systemchannel.Device <em>Device</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Device</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_sc_systemchannel.Device
     * @generated
     */
    EClass getDevice();

    /**
     * Returns the meta object for the container reference '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_sc_systemchannel.Device#getEContainer_device <em>EContainer device</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>EContainer device</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_sc_systemchannel.Device#getEContainer_device()
     * @see #getDevice()
     * @generated
     */
    EReference getDevice_EContainer_device();

    /**
     * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_sc_systemchannel.Device#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_sc_systemchannel.Device#getName()
     * @see #getDevice()
     * @generated
     */
    EAttribute getDevice_Name();

    /**
     * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_sc_systemchannel.Device#getDevice_addr <em>Device addr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Device addr</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_sc_systemchannel.Device#getDevice_addr()
     * @see #getDevice()
     * @generated
     */
    EAttribute getDevice_Device_addr();

    /**
     * Returns the meta object for class '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_sc_systemchannel.Setchannel <em>Setchannel</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Setchannel</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_sc_systemchannel.Setchannel
     * @generated
     */
    EClass getSetchannel();

    /**
     * Returns the meta object for the container reference '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_sc_systemchannel.Setchannel#getEContainer_setchannel <em>EContainer setchannel</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>EContainer setchannel</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_sc_systemchannel.Setchannel#getEContainer_setchannel()
     * @see #getSetchannel()
     * @generated
     */
    EReference getSetchannel_EContainer_setchannel();

    /**
     * Returns the meta object for the attribute list '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_sc_systemchannel.Setchannel#getText <em>Text</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Text</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_sc_systemchannel.Setchannel#getText()
     * @see #getSetchannel()
     * @generated
     */
    EAttribute getSetchannel_Text();

    /**
     * Returns the meta object for the containment reference '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_sc_systemchannel.Setchannel#getDevice <em>Device</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Device</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_sc_systemchannel.Setchannel#getDevice()
     * @see #getSetchannel()
     * @generated
     */
    EReference getSetchannel_Device();

    /**
     * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_sc_systemchannel.Setchannel#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_sc_systemchannel.Setchannel#getName()
     * @see #getSetchannel()
     * @generated
     */
    EAttribute getSetchannel_Name();

    /**
     * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_sc_systemchannel.Setchannel#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_sc_systemchannel.Setchannel#getId()
     * @see #getSetchannel()
     * @generated
     */
    EAttribute getSetchannel_Id();

    /**
     * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_sc_systemchannel.Setchannel#getChannel <em>Channel</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Channel</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_sc_systemchannel.Setchannel#getChannel()
     * @see #getSetchannel()
     * @generated
     */
    EAttribute getSetchannel_Channel();

    /**
     * Returns the meta object for class '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_sc_systemchannel.Systemchannel <em>Systemchannel</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Systemchannel</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_sc_systemchannel.Systemchannel
     * @generated
     */
    EClass getSystemchannel();

    /**
     * Returns the meta object for the containment reference '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_sc_systemchannel.Systemchannel#getSetchannel <em>Setchannel</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Setchannel</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_sc_systemchannel.Systemchannel#getSetchannel()
     * @see #getSystemchannel()
     * @generated
     */
    EReference getSystemchannel_Setchannel();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    Device_wifi_wifidevice_sc_systemchannelFactory getDevice_wifi_wifidevice_sc_systemchannelFactory();

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
         * The meta object literal for the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_sc_systemchannel.impl.DeviceImpl <em>Device</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_sc_systemchannel.impl.DeviceImpl
         * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_sc_systemchannel.impl.Device_wifi_wifidevice_sc_systemchannelPackageImpl#getDevice()
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
         * The meta object literal for the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_sc_systemchannel.impl.SetchannelImpl <em>Setchannel</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_sc_systemchannel.impl.SetchannelImpl
         * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_sc_systemchannel.impl.Device_wifi_wifidevice_sc_systemchannelPackageImpl#getSetchannel()
         * @generated
         */
        EClass SETCHANNEL = eINSTANCE.getSetchannel();

        /**
         * The meta object literal for the '<em><b>EContainer setchannel</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SETCHANNEL__ECONTAINER_SETCHANNEL = eINSTANCE.getSetchannel_EContainer_setchannel();

        /**
         * The meta object literal for the '<em><b>Text</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SETCHANNEL__TEXT = eINSTANCE.getSetchannel_Text();

        /**
         * The meta object literal for the '<em><b>Device</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SETCHANNEL__DEVICE = eINSTANCE.getSetchannel_Device();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SETCHANNEL__NAME = eINSTANCE.getSetchannel_Name();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SETCHANNEL__ID = eINSTANCE.getSetchannel_Id();

        /**
         * The meta object literal for the '<em><b>Channel</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SETCHANNEL__CHANNEL = eINSTANCE.getSetchannel_Channel();

        /**
         * The meta object literal for the '{@link de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_sc_systemchannel.impl.SystemchannelImpl <em>Systemchannel</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_sc_systemchannel.impl.SystemchannelImpl
         * @see de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_sc_systemchannel.impl.Device_wifi_wifidevice_sc_systemchannelPackageImpl#getSystemchannel()
         * @generated
         */
        EClass SYSTEMCHANNEL = eINSTANCE.getSystemchannel();

        /**
         * The meta object literal for the '<em><b>Setchannel</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SYSTEMCHANNEL__SETCHANNEL = eINSTANCE.getSystemchannel_Setchannel();

    }

} //Device_wifi_wifidevice_sc_systemchannelPackage
