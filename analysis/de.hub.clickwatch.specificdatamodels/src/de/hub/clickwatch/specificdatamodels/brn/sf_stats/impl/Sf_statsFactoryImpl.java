/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificdatamodels.brn.sf_stats.impl;

import de.hub.clickwatch.specificdatamodels.brn.sf_stats.*;

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
public class Sf_statsFactoryImpl extends EFactoryImpl implements Sf_statsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Sf_statsFactory init() {
		try {
			Sf_statsFactory theSf_statsFactory = (Sf_statsFactory)EPackage.Registry.INSTANCE.getEFactory("http://de.hub.clickwatch.specificmodels.brn/sf/stats"); 
			if (theSf_statsFactory != null) {
				return theSf_statsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Sf_statsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sf_statsFactoryImpl() {
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
			case Sf_statsPackage.FLOWSTATS: return createFlowstats();
			case Sf_statsPackage.RXFLOW: return createRxflow();
			case Sf_statsPackage.STATS: return createStats();
			case Sf_statsPackage.TXFLOW: return createTxflow();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Flowstats createFlowstats() {
		FlowstatsImpl flowstats = new FlowstatsImpl();
		return flowstats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rxflow createRxflow() {
		RxflowImpl rxflow = new RxflowImpl();
		return rxflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stats createStats() {
		StatsImpl stats = new StatsImpl();
		return stats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Txflow createTxflow() {
		TxflowImpl txflow = new TxflowImpl();
		return txflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sf_statsPackage getSf_statsPackage() {
		return (Sf_statsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Sf_statsPackage getPackage() {
		return Sf_statsPackage.eINSTANCE;
	}

} //Sf_statsFactoryImpl
