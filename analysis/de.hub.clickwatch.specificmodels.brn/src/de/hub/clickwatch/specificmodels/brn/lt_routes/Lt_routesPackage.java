/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.lt_routes;

import de.hub.clickwatch.model.ClickWatchModelPackage;

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
 * @see de.hub.clickwatch.specificmodels.brn.lt_routes.Lt_routesFactory
 * @model kind="package"
 *        annotation="http://de.hub.clickwatch.specificmodels handler_class='Routes' handler_name='lt/routes'"
 * @generated
 */
public interface Lt_routesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "lt_routes";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://de.hub.clickwatch.specificmodels.brn/lt/routes";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "lt_routes";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Lt_routesPackage eINSTANCE = de.hub.clickwatch.specificmodels.brn.lt_routes.impl.Lt_routesPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.specificmodels.brn.lt_routes.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.specificmodels.brn.lt_routes.impl.LinkImpl
	 * @see de.hub.clickwatch.specificmodels.brn.lt_routes.impl.Lt_routesPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 0;

	/**
	 * The feature id for the '<em><b>EContainer link</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__ECONTAINER_LINK = 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__FROM = 1;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__TO = 2;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__METRIC = 3;

	/**
	 * The feature id for the '<em><b>Seq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__SEQ = 4;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__AGE = 5;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.specificmodels.brn.lt_routes.impl.RouteImpl <em>Route</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.specificmodels.brn.lt_routes.impl.RouteImpl
	 * @see de.hub.clickwatch.specificmodels.brn.lt_routes.impl.Lt_routesPackageImpl#getRoute()
	 * @generated
	 */
	int ROUTE = 1;

	/**
	 * The feature id for the '<em><b>EContainer route</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__ECONTAINER_ROUTE = 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__TEXT = 1;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__LINK = 2;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__FROM = 3;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__TO = 4;

	/**
	 * The number of structural features of the '<em>Route</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.specificmodels.brn.lt_routes.impl.RoutesImpl <em>Routes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.specificmodels.brn.lt_routes.impl.RoutesImpl
	 * @see de.hub.clickwatch.specificmodels.brn.lt_routes.impl.Lt_routesPackageImpl#getRoutes()
	 * @generated
	 */
	int ROUTES = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTES__NAME = ClickWatchModelPackage.HANDLER__NAME;

	/**
	 * The feature id for the '<em><b>Can Read</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTES__CAN_READ = ClickWatchModelPackage.HANDLER__CAN_READ;

	/**
	 * The feature id for the '<em><b>Can Write</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTES__CAN_WRITE = ClickWatchModelPackage.HANDLER__CAN_WRITE;

	/**
	 * The feature id for the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTES__CHANGED = ClickWatchModelPackage.HANDLER__CHANGED;

	/**
	 * The feature id for the '<em><b>Watch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTES__WATCH = ClickWatchModelPackage.HANDLER__WATCH;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTES__MIXED = ClickWatchModelPackage.HANDLER__MIXED;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTES__ANY = ClickWatchModelPackage.HANDLER__ANY;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTES__VALUE = ClickWatchModelPackage.HANDLER__VALUE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTES__TIMESTAMP = ClickWatchModelPackage.HANDLER__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Routetable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTES__ROUTETABLE = ClickWatchModelPackage.HANDLER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Routes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTES_FEATURE_COUNT = ClickWatchModelPackage.HANDLER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.specificmodels.brn.lt_routes.impl.RoutetableImpl <em>Routetable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.specificmodels.brn.lt_routes.impl.RoutetableImpl
	 * @see de.hub.clickwatch.specificmodels.brn.lt_routes.impl.Lt_routesPackageImpl#getRoutetable()
	 * @generated
	 */
	int ROUTETABLE = 3;

	/**
	 * The feature id for the '<em><b>EContainer routetable</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTETABLE__ECONTAINER_ROUTETABLE = 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTETABLE__TEXT = 1;

	/**
	 * The feature id for the '<em><b>Route</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTETABLE__ROUTE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTETABLE__ID = 3;

	/**
	 * The number of structural features of the '<em>Routetable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTETABLE_FEATURE_COUNT = 4;


	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.specificmodels.brn.lt_routes.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.lt_routes.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the container reference '{@link de.hub.clickwatch.specificmodels.brn.lt_routes.Link#getEContainer_link <em>EContainer link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>EContainer link</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.lt_routes.Link#getEContainer_link()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_EContainer_link();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.lt_routes.Link#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.lt_routes.Link#getFrom()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_From();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.lt_routes.Link#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.lt_routes.Link#getTo()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_To();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.lt_routes.Link#getMetric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metric</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.lt_routes.Link#getMetric()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Metric();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.lt_routes.Link#getSeq <em>Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seq</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.lt_routes.Link#getSeq()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Seq();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.lt_routes.Link#getAge <em>Age</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Age</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.lt_routes.Link#getAge()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Age();

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.specificmodels.brn.lt_routes.Route <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Route</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.lt_routes.Route
	 * @generated
	 */
	EClass getRoute();

	/**
	 * Returns the meta object for the container reference '{@link de.hub.clickwatch.specificmodels.brn.lt_routes.Route#getEContainer_route <em>EContainer route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>EContainer route</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.lt_routes.Route#getEContainer_route()
	 * @see #getRoute()
	 * @generated
	 */
	EReference getRoute_EContainer_route();

	/**
	 * Returns the meta object for the attribute list '{@link de.hub.clickwatch.specificmodels.brn.lt_routes.Route#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Text</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.lt_routes.Route#getText()
	 * @see #getRoute()
	 * @generated
	 */
	EAttribute getRoute_Text();

	/**
	 * Returns the meta object for the containment reference list '{@link de.hub.clickwatch.specificmodels.brn.lt_routes.Route#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.lt_routes.Route#getLink()
	 * @see #getRoute()
	 * @generated
	 */
	EReference getRoute_Link();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.lt_routes.Route#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.lt_routes.Route#getFrom()
	 * @see #getRoute()
	 * @generated
	 */
	EAttribute getRoute_From();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.lt_routes.Route#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.lt_routes.Route#getTo()
	 * @see #getRoute()
	 * @generated
	 */
	EAttribute getRoute_To();

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.specificmodels.brn.lt_routes.Routes <em>Routes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Routes</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.lt_routes.Routes
	 * @generated
	 */
	EClass getRoutes();

	/**
	 * Returns the meta object for the containment reference '{@link de.hub.clickwatch.specificmodels.brn.lt_routes.Routes#getRoutetable <em>Routetable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Routetable</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.lt_routes.Routes#getRoutetable()
	 * @see #getRoutes()
	 * @generated
	 */
	EReference getRoutes_Routetable();

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.specificmodels.brn.lt_routes.Routetable <em>Routetable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Routetable</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.lt_routes.Routetable
	 * @generated
	 */
	EClass getRoutetable();

	/**
	 * Returns the meta object for the container reference '{@link de.hub.clickwatch.specificmodels.brn.lt_routes.Routetable#getEContainer_routetable <em>EContainer routetable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>EContainer routetable</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.lt_routes.Routetable#getEContainer_routetable()
	 * @see #getRoutetable()
	 * @generated
	 */
	EReference getRoutetable_EContainer_routetable();

	/**
	 * Returns the meta object for the attribute list '{@link de.hub.clickwatch.specificmodels.brn.lt_routes.Routetable#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Text</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.lt_routes.Routetable#getText()
	 * @see #getRoutetable()
	 * @generated
	 */
	EAttribute getRoutetable_Text();

	/**
	 * Returns the meta object for the containment reference list '{@link de.hub.clickwatch.specificmodels.brn.lt_routes.Routetable#getRoute <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Route</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.lt_routes.Routetable#getRoute()
	 * @see #getRoutetable()
	 * @generated
	 */
	EReference getRoutetable_Route();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.lt_routes.Routetable#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.lt_routes.Routetable#getId()
	 * @see #getRoutetable()
	 * @generated
	 */
	EAttribute getRoutetable_Id();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Lt_routesFactory getLt_routesFactory();

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
		 * The meta object literal for the '{@link de.hub.clickwatch.specificmodels.brn.lt_routes.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.specificmodels.brn.lt_routes.impl.LinkImpl
		 * @see de.hub.clickwatch.specificmodels.brn.lt_routes.impl.Lt_routesPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>EContainer link</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__ECONTAINER_LINK = eINSTANCE.getLink_EContainer_link();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__FROM = eINSTANCE.getLink_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__TO = eINSTANCE.getLink_To();

		/**
		 * The meta object literal for the '<em><b>Metric</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__METRIC = eINSTANCE.getLink_Metric();

		/**
		 * The meta object literal for the '<em><b>Seq</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__SEQ = eINSTANCE.getLink_Seq();

		/**
		 * The meta object literal for the '<em><b>Age</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__AGE = eINSTANCE.getLink_Age();

		/**
		 * The meta object literal for the '{@link de.hub.clickwatch.specificmodels.brn.lt_routes.impl.RouteImpl <em>Route</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.specificmodels.brn.lt_routes.impl.RouteImpl
		 * @see de.hub.clickwatch.specificmodels.brn.lt_routes.impl.Lt_routesPackageImpl#getRoute()
		 * @generated
		 */
		EClass ROUTE = eINSTANCE.getRoute();

		/**
		 * The meta object literal for the '<em><b>EContainer route</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTE__ECONTAINER_ROUTE = eINSTANCE.getRoute_EContainer_route();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTE__TEXT = eINSTANCE.getRoute_Text();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTE__LINK = eINSTANCE.getRoute_Link();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTE__FROM = eINSTANCE.getRoute_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTE__TO = eINSTANCE.getRoute_To();

		/**
		 * The meta object literal for the '{@link de.hub.clickwatch.specificmodels.brn.lt_routes.impl.RoutesImpl <em>Routes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.specificmodels.brn.lt_routes.impl.RoutesImpl
		 * @see de.hub.clickwatch.specificmodels.brn.lt_routes.impl.Lt_routesPackageImpl#getRoutes()
		 * @generated
		 */
		EClass ROUTES = eINSTANCE.getRoutes();

		/**
		 * The meta object literal for the '<em><b>Routetable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTES__ROUTETABLE = eINSTANCE.getRoutes_Routetable();

		/**
		 * The meta object literal for the '{@link de.hub.clickwatch.specificmodels.brn.lt_routes.impl.RoutetableImpl <em>Routetable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.specificmodels.brn.lt_routes.impl.RoutetableImpl
		 * @see de.hub.clickwatch.specificmodels.brn.lt_routes.impl.Lt_routesPackageImpl#getRoutetable()
		 * @generated
		 */
		EClass ROUTETABLE = eINSTANCE.getRoutetable();

		/**
		 * The meta object literal for the '<em><b>EContainer routetable</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTETABLE__ECONTAINER_ROUTETABLE = eINSTANCE.getRoutetable_EContainer_routetable();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTETABLE__TEXT = eINSTANCE.getRoutetable_Text();

		/**
		 * The meta object literal for the '<em><b>Route</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTETABLE__ROUTE = eINSTANCE.getRoutetable_Route();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTETABLE__ID = eINSTANCE.getRoutetable_Id();

	}

} //Lt_routesPackage
