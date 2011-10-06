/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.impl;

import de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.Channel_info;
import de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.Channel_infos;
import de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.Latestchannelinfos;
import de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.Seismo_latestchannelinfosFactory;
import de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.Seismo_latestchannelinfosPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Seismo_latestchannelinfosFactoryImpl extends EFactoryImpl implements Seismo_latestchannelinfosFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Seismo_latestchannelinfosFactory init() {
		try {
			Seismo_latestchannelinfosFactory theSeismo_latestchannelinfosFactory = (Seismo_latestchannelinfosFactory)EPackage.Registry.INSTANCE.getEFactory("http://de.hub.clickwatch.specificmodels.brn/seismo/latestchannelinfos"); 
			if (theSeismo_latestchannelinfosFactory != null) {
				return theSeismo_latestchannelinfosFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Seismo_latestchannelinfosFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Seismo_latestchannelinfosFactoryImpl() {
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
			case Seismo_latestchannelinfosPackage.CHANNEL_INFO: return createChannel_info();
			case Seismo_latestchannelinfosPackage.CHANNEL_INFOS: return createChannel_infos();
			case Seismo_latestchannelinfosPackage.LATESTCHANNELINFOS: return createLatestchannelinfos();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Channel_info createChannel_info() {
		Channel_infoImpl channel_info = new Channel_infoImpl();
		return channel_info;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Channel_infos createChannel_infos() {
		Channel_infosImpl channel_infos = new Channel_infosImpl();
		return channel_infos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Latestchannelinfos createLatestchannelinfos() {
		LatestchannelinfosImpl latestchannelinfos = new LatestchannelinfosImpl();
		return latestchannelinfos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Seismo_latestchannelinfosPackage getSeismo_latestchannelinfosPackage() {
		return (Seismo_latestchannelinfosPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Seismo_latestchannelinfosPackage getPackage() {
		return Seismo_latestchannelinfosPackage.eINSTANCE;
	}

} //Seismo_latestchannelinfosFactoryImpl
