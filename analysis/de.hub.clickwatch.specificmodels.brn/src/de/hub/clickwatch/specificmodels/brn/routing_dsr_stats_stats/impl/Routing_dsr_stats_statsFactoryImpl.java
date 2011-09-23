/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats.Dsr_route_stats;
import de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats.Route;
import de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats.Route_info;
import de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats.Routing_dsr_stats_statsFactory;
import de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats.Routing_dsr_stats_statsPackage;
import de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats.Stats;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Routing_dsr_stats_statsFactoryImpl extends EFactoryImpl implements Routing_dsr_stats_statsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Routing_dsr_stats_statsFactory init() {
		try {
			Routing_dsr_stats_statsFactory theRouting_dsr_stats_statsFactory = (Routing_dsr_stats_statsFactory)EPackage.Registry.INSTANCE.getEFactory("http://de.hub.clickwatch.specificmodels.brn/routing/dsr_stats/stats"); 
			if (theRouting_dsr_stats_statsFactory != null) {
				return theRouting_dsr_stats_statsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Routing_dsr_stats_statsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Routing_dsr_stats_statsFactoryImpl() {
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
			case Routing_dsr_stats_statsPackage.DSR_ROUTE_STATS: return createDsr_route_stats();
			case Routing_dsr_stats_statsPackage.ROUTE: return createRoute();
			case Routing_dsr_stats_statsPackage.ROUTE_INFO: return createRoute_info();
			case Routing_dsr_stats_statsPackage.STATS: return createStats();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dsr_route_stats createDsr_route_stats() {
		Dsr_route_statsImpl dsr_route_stats = new Dsr_route_statsImpl();
		return dsr_route_stats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Route createRoute() {
		RouteImpl route = new RouteImpl();
		return route;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Route_info createRoute_info() {
		Route_infoImpl route_info = new Route_infoImpl();
		return route_info;
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
	public Routing_dsr_stats_statsPackage getRouting_dsr_stats_statsPackage() {
		return (Routing_dsr_stats_statsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Routing_dsr_stats_statsPackage getPackage() {
		return Routing_dsr_stats_statsPackage.eINSTANCE;
	}

} //Routing_dsr_stats_statsFactoryImpl
