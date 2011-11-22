/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.tsi_syncinfo;

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
 * @see de.hub.clickwatch.specificmodels.brn.tsi_syncinfo.Tsi_syncinfoFactory
 * @model kind="package"
 *        annotation="http://de.hub.clickwatch.specificmodels handler_class='Syncinfo' handler_name='tsi/syncinfo'"
 * @generated
 */
public interface Tsi_syncinfoPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "tsi_syncinfo";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://de.hub.clickwatch.specificmodels.brn/tsi/syncinfo";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "tsi_syncinfo";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    Tsi_syncinfoPackage eINSTANCE = de.hub.clickwatch.specificmodels.brn.tsi_syncinfo.impl.Tsi_syncinfoPackageImpl.init();

    /**
     * The meta object id for the '{@link de.hub.clickwatch.specificmodels.brn.tsi_syncinfo.impl.SyncinfoImpl <em>Syncinfo</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hub.clickwatch.specificmodels.brn.tsi_syncinfo.impl.SyncinfoImpl
     * @see de.hub.clickwatch.specificmodels.brn.tsi_syncinfo.impl.Tsi_syncinfoPackageImpl#getSyncinfo()
     * @generated
     */
    int SYNCINFO = 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYNCINFO__NAME = ClickWatchModelPackage.HANDLER__NAME;

    /**
     * The feature id for the '<em><b>Can Read</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYNCINFO__CAN_READ = ClickWatchModelPackage.HANDLER__CAN_READ;

    /**
     * The feature id for the '<em><b>Can Write</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYNCINFO__CAN_WRITE = ClickWatchModelPackage.HANDLER__CAN_WRITE;

    /**
     * The feature id for the '<em><b>Changed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYNCINFO__CHANGED = ClickWatchModelPackage.HANDLER__CHANGED;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYNCINFO__MIXED = ClickWatchModelPackage.HANDLER__MIXED;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYNCINFO__ANY = ClickWatchModelPackage.HANDLER__ANY;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYNCINFO__VALUE = ClickWatchModelPackage.HANDLER__VALUE;

    /**
     * The feature id for the '<em><b>Timestamp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYNCINFO__TIMESTAMP = ClickWatchModelPackage.HANDLER__TIMESTAMP;

    /**
     * The feature id for the '<em><b>Timesyncinfo</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYNCINFO__TIMESYNCINFO = ClickWatchModelPackage.HANDLER_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Syncinfo</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYNCINFO_FEATURE_COUNT = ClickWatchModelPackage.HANDLER_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link de.hub.clickwatch.specificmodels.brn.tsi_syncinfo.impl.SyncpacketImpl <em>Syncpacket</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hub.clickwatch.specificmodels.brn.tsi_syncinfo.impl.SyncpacketImpl
     * @see de.hub.clickwatch.specificmodels.brn.tsi_syncinfo.impl.Tsi_syncinfoPackageImpl#getSyncpacket()
     * @generated
     */
    int SYNCPACKET = 1;

    /**
     * The feature id for the '<em><b>EContainer syncpacket</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYNCPACKET__ECONTAINER_SYNCPACKET = 0;

    /**
     * The feature id for the '<em><b>Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYNCPACKET__TIME = 1;

    /**
     * The feature id for the '<em><b>Unit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYNCPACKET__UNIT = 2;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYNCPACKET__ID = 3;

    /**
     * The number of structural features of the '<em>Syncpacket</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYNCPACKET_FEATURE_COUNT = 4;

    /**
     * The meta object id for the '{@link de.hub.clickwatch.specificmodels.brn.tsi_syncinfo.impl.TimesyncinfoImpl <em>Timesyncinfo</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hub.clickwatch.specificmodels.brn.tsi_syncinfo.impl.TimesyncinfoImpl
     * @see de.hub.clickwatch.specificmodels.brn.tsi_syncinfo.impl.Tsi_syncinfoPackageImpl#getTimesyncinfo()
     * @generated
     */
    int TIMESYNCINFO = 2;

    /**
     * The feature id for the '<em><b>EContainer timesyncinfo</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIMESYNCINFO__ECONTAINER_TIMESYNCINFO = 0;

    /**
     * The feature id for the '<em><b>Text</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIMESYNCINFO__TEXT = 1;

    /**
     * The feature id for the '<em><b>Syncpacket</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIMESYNCINFO__SYNCPACKET = 2;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIMESYNCINFO__ID = 3;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIMESYNCINFO__NAME = 4;

    /**
     * The feature id for the '<em><b>Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIMESYNCINFO__TIME = 5;

    /**
     * The number of structural features of the '<em>Timesyncinfo</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIMESYNCINFO_FEATURE_COUNT = 6;


    /**
     * Returns the meta object for class '{@link de.hub.clickwatch.specificmodels.brn.tsi_syncinfo.Syncinfo <em>Syncinfo</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Syncinfo</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.tsi_syncinfo.Syncinfo
     * @generated
     */
    EClass getSyncinfo();

    /**
     * Returns the meta object for the containment reference '{@link de.hub.clickwatch.specificmodels.brn.tsi_syncinfo.Syncinfo#getTimesyncinfo <em>Timesyncinfo</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Timesyncinfo</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.tsi_syncinfo.Syncinfo#getTimesyncinfo()
     * @see #getSyncinfo()
     * @generated
     */
    EReference getSyncinfo_Timesyncinfo();

    /**
     * Returns the meta object for class '{@link de.hub.clickwatch.specificmodels.brn.tsi_syncinfo.Syncpacket <em>Syncpacket</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Syncpacket</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.tsi_syncinfo.Syncpacket
     * @generated
     */
    EClass getSyncpacket();

    /**
     * Returns the meta object for the container reference '{@link de.hub.clickwatch.specificmodels.brn.tsi_syncinfo.Syncpacket#getEContainer_syncpacket <em>EContainer syncpacket</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>EContainer syncpacket</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.tsi_syncinfo.Syncpacket#getEContainer_syncpacket()
     * @see #getSyncpacket()
     * @generated
     */
    EReference getSyncpacket_EContainer_syncpacket();

    /**
     * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.tsi_syncinfo.Syncpacket#getTime <em>Time</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Time</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.tsi_syncinfo.Syncpacket#getTime()
     * @see #getSyncpacket()
     * @generated
     */
    EAttribute getSyncpacket_Time();

    /**
     * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.tsi_syncinfo.Syncpacket#getUnit <em>Unit</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Unit</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.tsi_syncinfo.Syncpacket#getUnit()
     * @see #getSyncpacket()
     * @generated
     */
    EAttribute getSyncpacket_Unit();

    /**
     * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.tsi_syncinfo.Syncpacket#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.tsi_syncinfo.Syncpacket#getId()
     * @see #getSyncpacket()
     * @generated
     */
    EAttribute getSyncpacket_Id();

    /**
     * Returns the meta object for class '{@link de.hub.clickwatch.specificmodels.brn.tsi_syncinfo.Timesyncinfo <em>Timesyncinfo</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Timesyncinfo</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.tsi_syncinfo.Timesyncinfo
     * @generated
     */
    EClass getTimesyncinfo();

    /**
     * Returns the meta object for the container reference '{@link de.hub.clickwatch.specificmodels.brn.tsi_syncinfo.Timesyncinfo#getEContainer_timesyncinfo <em>EContainer timesyncinfo</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>EContainer timesyncinfo</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.tsi_syncinfo.Timesyncinfo#getEContainer_timesyncinfo()
     * @see #getTimesyncinfo()
     * @generated
     */
    EReference getTimesyncinfo_EContainer_timesyncinfo();

    /**
     * Returns the meta object for the attribute list '{@link de.hub.clickwatch.specificmodels.brn.tsi_syncinfo.Timesyncinfo#getText <em>Text</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Text</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.tsi_syncinfo.Timesyncinfo#getText()
     * @see #getTimesyncinfo()
     * @generated
     */
    EAttribute getTimesyncinfo_Text();

    /**
     * Returns the meta object for the containment reference list '{@link de.hub.clickwatch.specificmodels.brn.tsi_syncinfo.Timesyncinfo#getSyncpacket <em>Syncpacket</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Syncpacket</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.tsi_syncinfo.Timesyncinfo#getSyncpacket()
     * @see #getTimesyncinfo()
     * @generated
     */
    EReference getTimesyncinfo_Syncpacket();

    /**
     * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.tsi_syncinfo.Timesyncinfo#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.tsi_syncinfo.Timesyncinfo#getId()
     * @see #getTimesyncinfo()
     * @generated
     */
    EAttribute getTimesyncinfo_Id();

    /**
     * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.tsi_syncinfo.Timesyncinfo#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.tsi_syncinfo.Timesyncinfo#getName()
     * @see #getTimesyncinfo()
     * @generated
     */
    EAttribute getTimesyncinfo_Name();

    /**
     * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.tsi_syncinfo.Timesyncinfo#getTime <em>Time</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Time</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.tsi_syncinfo.Timesyncinfo#getTime()
     * @see #getTimesyncinfo()
     * @generated
     */
    EAttribute getTimesyncinfo_Time();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    Tsi_syncinfoFactory getTsi_syncinfoFactory();

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
         * The meta object literal for the '{@link de.hub.clickwatch.specificmodels.brn.tsi_syncinfo.impl.SyncinfoImpl <em>Syncinfo</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.hub.clickwatch.specificmodels.brn.tsi_syncinfo.impl.SyncinfoImpl
         * @see de.hub.clickwatch.specificmodels.brn.tsi_syncinfo.impl.Tsi_syncinfoPackageImpl#getSyncinfo()
         * @generated
         */
        EClass SYNCINFO = eINSTANCE.getSyncinfo();

        /**
         * The meta object literal for the '<em><b>Timesyncinfo</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SYNCINFO__TIMESYNCINFO = eINSTANCE.getSyncinfo_Timesyncinfo();

        /**
         * The meta object literal for the '{@link de.hub.clickwatch.specificmodels.brn.tsi_syncinfo.impl.SyncpacketImpl <em>Syncpacket</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.hub.clickwatch.specificmodels.brn.tsi_syncinfo.impl.SyncpacketImpl
         * @see de.hub.clickwatch.specificmodels.brn.tsi_syncinfo.impl.Tsi_syncinfoPackageImpl#getSyncpacket()
         * @generated
         */
        EClass SYNCPACKET = eINSTANCE.getSyncpacket();

        /**
         * The meta object literal for the '<em><b>EContainer syncpacket</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SYNCPACKET__ECONTAINER_SYNCPACKET = eINSTANCE.getSyncpacket_EContainer_syncpacket();

        /**
         * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SYNCPACKET__TIME = eINSTANCE.getSyncpacket_Time();

        /**
         * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SYNCPACKET__UNIT = eINSTANCE.getSyncpacket_Unit();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SYNCPACKET__ID = eINSTANCE.getSyncpacket_Id();

        /**
         * The meta object literal for the '{@link de.hub.clickwatch.specificmodels.brn.tsi_syncinfo.impl.TimesyncinfoImpl <em>Timesyncinfo</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.hub.clickwatch.specificmodels.brn.tsi_syncinfo.impl.TimesyncinfoImpl
         * @see de.hub.clickwatch.specificmodels.brn.tsi_syncinfo.impl.Tsi_syncinfoPackageImpl#getTimesyncinfo()
         * @generated
         */
        EClass TIMESYNCINFO = eINSTANCE.getTimesyncinfo();

        /**
         * The meta object literal for the '<em><b>EContainer timesyncinfo</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TIMESYNCINFO__ECONTAINER_TIMESYNCINFO = eINSTANCE.getTimesyncinfo_EContainer_timesyncinfo();

        /**
         * The meta object literal for the '<em><b>Text</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TIMESYNCINFO__TEXT = eINSTANCE.getTimesyncinfo_Text();

        /**
         * The meta object literal for the '<em><b>Syncpacket</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TIMESYNCINFO__SYNCPACKET = eINSTANCE.getTimesyncinfo_Syncpacket();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TIMESYNCINFO__ID = eINSTANCE.getTimesyncinfo_Id();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TIMESYNCINFO__NAME = eINSTANCE.getTimesyncinfo_Name();

        /**
         * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TIMESYNCINFO__TIME = eINSTANCE.getTimesyncinfo_Time();

    }

} //Tsi_syncinfoPackage
