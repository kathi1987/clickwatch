/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.impl;

import de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.*;

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
public class Seismo_localchannelinfoFactoryImpl extends EFactoryImpl implements Seismo_localchannelinfoFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static Seismo_localchannelinfoFactory init() {
        try {
            Seismo_localchannelinfoFactory theSeismo_localchannelinfoFactory = (Seismo_localchannelinfoFactory)EPackage.Registry.INSTANCE.getEFactory("http://de.hub.clickwatch.specificmodels.brn/seismo/localchannelinfo"); 
            if (theSeismo_localchannelinfoFactory != null) {
                return theSeismo_localchannelinfoFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new Seismo_localchannelinfoFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Seismo_localchannelinfoFactoryImpl() {
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
            case Seismo_localchannelinfoPackage.C: return createC();
            case Seismo_localchannelinfoPackage.LOCALCHANNELINFO: return createLocalchannelinfo();
            case Seismo_localchannelinfoPackage.V: return createV();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public C createC() {
        CImpl c = new CImpl();
        return c;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Localchannelinfo createLocalchannelinfo() {
        LocalchannelinfoImpl localchannelinfo = new LocalchannelinfoImpl();
        return localchannelinfo;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public V createV() {
        VImpl v = new VImpl();
        return v;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Seismo_localchannelinfoPackage getSeismo_localchannelinfoPackage() {
        return (Seismo_localchannelinfoPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static Seismo_localchannelinfoPackage getPackage() {
        return Seismo_localchannelinfoPackage.eINSTANCE;
    }

} //Seismo_localchannelinfoFactoryImpl
