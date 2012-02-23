/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.analysis.traceable;

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
 * @see de.hub.clickwatch.analysis.traceable.TraceableFactory
 * @model kind="package"
 * @generated
 */
public interface TraceablePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "traceable";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://traceable/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "traceable";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TraceablePackage eINSTANCE = de.hub.clickwatch.analysis.traceable.impl.TraceablePackageImpl.init();

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.analysis.traceable.impl.TraceableImpl <em>Traceable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.analysis.traceable.impl.TraceableImpl
	 * @see de.hub.clickwatch.analysis.traceable.impl.TraceablePackageImpl#getTraceable()
	 * @generated
	 */
	int TRACEABLE = 0;

	/**
	 * The feature id for the '<em><b>Traces From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABLE__TRACES_FROM = 0;

	/**
	 * The feature id for the '<em><b>Traces To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABLE__TRACES_TO = 1;

	/**
	 * The number of structural features of the '<em>Traceable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABLE_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.analysis.traceable.Traceable <em>Traceable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traceable</em>'.
	 * @see de.hub.clickwatch.analysis.traceable.Traceable
	 * @generated
	 */
	EClass getTraceable();

	/**
	 * Returns the meta object for the reference list '{@link de.hub.clickwatch.analysis.traceable.Traceable#getTracesFrom <em>Traces From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Traces From</em>'.
	 * @see de.hub.clickwatch.analysis.traceable.Traceable#getTracesFrom()
	 * @see #getTraceable()
	 * @generated
	 */
	EReference getTraceable_TracesFrom();

	/**
	 * Returns the meta object for the reference list '{@link de.hub.clickwatch.analysis.traceable.Traceable#getTracesTo <em>Traces To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Traces To</em>'.
	 * @see de.hub.clickwatch.analysis.traceable.Traceable#getTracesTo()
	 * @see #getTraceable()
	 * @generated
	 */
	EReference getTraceable_TracesTo();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TraceableFactory getTraceableFactory();

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
		 * The meta object literal for the '{@link de.hub.clickwatch.analysis.traceable.impl.TraceableImpl <em>Traceable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.analysis.traceable.impl.TraceableImpl
		 * @see de.hub.clickwatch.analysis.traceable.impl.TraceablePackageImpl#getTraceable()
		 * @generated
		 */
		EClass TRACEABLE = eINSTANCE.getTraceable();

		/**
		 * The meta object literal for the '<em><b>Traces From</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACEABLE__TRACES_FROM = eINSTANCE.getTraceable_TracesFrom();

		/**
		 * The meta object literal for the '<em><b>Traces To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACEABLE__TRACES_TO = eINSTANCE.getTraceable_TracesTo();

	}

} //TraceablePackage
