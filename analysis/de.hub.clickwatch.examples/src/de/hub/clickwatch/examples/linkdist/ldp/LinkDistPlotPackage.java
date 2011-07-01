/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.examples.linkdist.ldp;

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
 * @see de.hub.clickwatch.examples.linkdist.ldp.LinkDistPlotFactory
 * @model kind="package"
 * @generated
 */
public interface LinkDistPlotPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ldp";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "edu.hu.clickwatch.examples.linkdis.ldp";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ldp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LinkDistPlotPackage eINSTANCE = de.hub.clickwatch.examples.linkdist.ldp.impl.LinkDistPlotPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.examples.linkdist.ldp.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.examples.linkdist.ldp.impl.LinkImpl
	 * @see de.hub.clickwatch.examples.linkdist.ldp.impl.LinkDistPlotPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 0;

	/**
	 * The feature id for the '<em><b>Src Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__SRC_ADDR = 0;

	/**
	 * The feature id for the '<em><b>Dest Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__DEST_ADDR = 1;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__DISTANCE = 2;

	/**
	 * The feature id for the '<em><b>Rssi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__RSSI = 3;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.examples.linkdist.ldp.impl.PlotImpl <em>Plot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.examples.linkdist.ldp.impl.PlotImpl
	 * @see de.hub.clickwatch.examples.linkdist.ldp.impl.LinkDistPlotPackageImpl#getPlot()
	 * @generated
	 */
	int PLOT = 1;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLOT__LINKS = 0;

	/**
	 * The number of structural features of the '<em>Plot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLOT_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.examples.linkdist.ldp.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see de.hub.clickwatch.examples.linkdist.ldp.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.examples.linkdist.ldp.Link#getSrcAddr <em>Src Addr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Src Addr</em>'.
	 * @see de.hub.clickwatch.examples.linkdist.ldp.Link#getSrcAddr()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_SrcAddr();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.examples.linkdist.ldp.Link#getDestAddr <em>Dest Addr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dest Addr</em>'.
	 * @see de.hub.clickwatch.examples.linkdist.ldp.Link#getDestAddr()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_DestAddr();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.examples.linkdist.ldp.Link#getDistance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance</em>'.
	 * @see de.hub.clickwatch.examples.linkdist.ldp.Link#getDistance()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Distance();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.examples.linkdist.ldp.Link#getRssi <em>Rssi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rssi</em>'.
	 * @see de.hub.clickwatch.examples.linkdist.ldp.Link#getRssi()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Rssi();

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.examples.linkdist.ldp.Plot <em>Plot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plot</em>'.
	 * @see de.hub.clickwatch.examples.linkdist.ldp.Plot
	 * @generated
	 */
	EClass getPlot();

	/**
	 * Returns the meta object for the containment reference list '{@link de.hub.clickwatch.examples.linkdist.ldp.Plot#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see de.hub.clickwatch.examples.linkdist.ldp.Plot#getLinks()
	 * @see #getPlot()
	 * @generated
	 */
	EReference getPlot_Links();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LinkDistPlotFactory getLinkDistPlotFactory();

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
		 * The meta object literal for the '{@link de.hub.clickwatch.examples.linkdist.ldp.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.examples.linkdist.ldp.impl.LinkImpl
		 * @see de.hub.clickwatch.examples.linkdist.ldp.impl.LinkDistPlotPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>Src Addr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__SRC_ADDR = eINSTANCE.getLink_SrcAddr();

		/**
		 * The meta object literal for the '<em><b>Dest Addr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__DEST_ADDR = eINSTANCE.getLink_DestAddr();

		/**
		 * The meta object literal for the '<em><b>Distance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__DISTANCE = eINSTANCE.getLink_Distance();

		/**
		 * The meta object literal for the '<em><b>Rssi</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__RSSI = eINSTANCE.getLink_Rssi();

		/**
		 * The meta object literal for the '{@link de.hub.clickwatch.examples.linkdist.ldp.impl.PlotImpl <em>Plot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.examples.linkdist.ldp.impl.PlotImpl
		 * @see de.hub.clickwatch.examples.linkdist.ldp.impl.LinkDistPlotPackageImpl#getPlot()
		 * @generated
		 */
		EClass PLOT = eINSTANCE.getPlot();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLOT__LINKS = eINSTANCE.getPlot_Links();

	}

} //LinkDistPlotPackage
