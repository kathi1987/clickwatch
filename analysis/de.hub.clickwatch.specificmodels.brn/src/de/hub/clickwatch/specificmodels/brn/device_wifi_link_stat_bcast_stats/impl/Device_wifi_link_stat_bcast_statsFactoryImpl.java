/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.impl;

import de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Device_wifi_link_stat_bcast_statsFactoryImpl extends EFactoryImpl implements Device_wifi_link_stat_bcast_statsFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static Device_wifi_link_stat_bcast_statsFactory init() {
        try {
            Device_wifi_link_stat_bcast_statsFactory theDevice_wifi_link_stat_bcast_statsFactory = (Device_wifi_link_stat_bcast_statsFactory)EPackage.Registry.INSTANCE.getEFactory("http://de.hub.clickwatch.specificmodels.brn/device_wifi/link_stat/bcast_stats"); 
            if (theDevice_wifi_link_stat_bcast_statsFactory != null) {
                return theDevice_wifi_link_stat_bcast_statsFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new Device_wifi_link_stat_bcast_statsFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Device_wifi_link_stat_bcast_statsFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case Device_wifi_link_stat_bcast_statsPackage.BCAST_STATS: return createBcast_stats();
            case Device_wifi_link_stat_bcast_statsPackage.ENTRY: return createEntry();
            case Device_wifi_link_stat_bcast_statsPackage.LINK: return createLink();
            case Device_wifi_link_stat_bcast_statsPackage.LINK_INFO: return createLink_info();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Bcast_stats createBcast_stats() {
        Bcast_statsImpl bcast_stats = new Bcast_statsImpl();
        return bcast_stats;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Entry createEntry() {
        EntryImpl entry = new EntryImpl();
        return entry;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Link createLink() {
        LinkImpl link = new LinkImpl();
        return link;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Link_info createLink_info() {
        Link_infoImpl link_info = new Link_infoImpl();
        return link_info;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Device_wifi_link_stat_bcast_statsPackage getDevice_wifi_link_stat_bcast_statsPackage() {
        return (Device_wifi_link_stat_bcast_statsPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static Device_wifi_link_stat_bcast_statsPackage getPackage() {
        return Device_wifi_link_stat_bcast_statsPackage.eINSTANCE;
    }

} //Device_wifi_link_stat_bcast_statsFactoryImpl
