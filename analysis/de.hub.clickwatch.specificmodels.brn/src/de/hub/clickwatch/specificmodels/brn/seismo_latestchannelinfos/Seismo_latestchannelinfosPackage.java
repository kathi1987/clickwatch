/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos;

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
 * @see de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.Seismo_latestchannelinfosFactory
 * @model kind="package"
 *        annotation="http://de.hub.clickwatch.specificmodels handler_class='Latestchannelinfos' handler_name='seismo/latestchannelinfos'"
 * @generated
 */
public interface Seismo_latestchannelinfosPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "seismo_latestchannelinfos";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://de.hub.clickwatch.specificmodels.brn/seismo/latestchannelinfos";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "seismo_latestchannelinfos";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Seismo_latestchannelinfosPackage eINSTANCE = de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.impl.Seismo_latestchannelinfosPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.impl.Channel_infoImpl <em>Channel info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.impl.Channel_infoImpl
	 * @see de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.impl.Seismo_latestchannelinfosPackageImpl#getChannel_info()
	 * @generated
	 */
	int CHANNEL_INFO = 0;

	/**
	 * The feature id for the '<em><b>EContainer channel info</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_INFO__ECONTAINER_CHANNEL_INFO = 0;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_INFO__TIME = 1;

	/**
	 * The feature id for the '<em><b>Channel 0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_INFO__CHANNEL_0 = 2;

	/**
	 * The feature id for the '<em><b>Channel 1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_INFO__CHANNEL_1 = 3;

	/**
	 * The feature id for the '<em><b>Channel 2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_INFO__CHANNEL_2 = 4;

	/**
	 * The feature id for the '<em><b>Channel 3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_INFO__CHANNEL_3 = 5;

	/**
	 * The number of structural features of the '<em>Channel info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_INFO_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.impl.Channel_infosImpl <em>Channel infos</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.impl.Channel_infosImpl
	 * @see de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.impl.Seismo_latestchannelinfosPackageImpl#getChannel_infos()
	 * @generated
	 */
	int CHANNEL_INFOS = 1;

	/**
	 * The feature id for the '<em><b>EContainer channel infos</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_INFOS__ECONTAINER_CHANNEL_INFOS = 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_INFOS__TEXT = 1;

	/**
	 * The feature id for the '<em><b>Channel info</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_INFOS__CHANNEL_INFO = 2;

	/**
	 * The number of structural features of the '<em>Channel infos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_INFOS_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.impl.LatestchannelinfosImpl <em>Latestchannelinfos</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.impl.LatestchannelinfosImpl
	 * @see de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.impl.Seismo_latestchannelinfosPackageImpl#getLatestchannelinfos()
	 * @generated
	 */
	int LATESTCHANNELINFOS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATESTCHANNELINFOS__NAME = ClickWatchModelPackage.HANDLER__NAME;

	/**
	 * The feature id for the '<em><b>Can Read</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATESTCHANNELINFOS__CAN_READ = ClickWatchModelPackage.HANDLER__CAN_READ;

	/**
	 * The feature id for the '<em><b>Can Write</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATESTCHANNELINFOS__CAN_WRITE = ClickWatchModelPackage.HANDLER__CAN_WRITE;

	/**
	 * The feature id for the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATESTCHANNELINFOS__CHANGED = ClickWatchModelPackage.HANDLER__CHANGED;

	/**
	 * The feature id for the '<em><b>Watch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATESTCHANNELINFOS__WATCH = ClickWatchModelPackage.HANDLER__WATCH;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATESTCHANNELINFOS__MIXED = ClickWatchModelPackage.HANDLER__MIXED;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATESTCHANNELINFOS__ANY = ClickWatchModelPackage.HANDLER__ANY;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATESTCHANNELINFOS__VALUE = ClickWatchModelPackage.HANDLER__VALUE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATESTCHANNELINFOS__TIMESTAMP = ClickWatchModelPackage.HANDLER__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Channel infos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATESTCHANNELINFOS__CHANNEL_INFOS = ClickWatchModelPackage.HANDLER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Latestchannelinfos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATESTCHANNELINFOS_FEATURE_COUNT = ClickWatchModelPackage.HANDLER_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.Channel_info <em>Channel info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Channel info</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.Channel_info
	 * @generated
	 */
	EClass getChannel_info();

	/**
	 * Returns the meta object for the container reference '{@link de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.Channel_info#getEContainer_channel_info <em>EContainer channel info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>EContainer channel info</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.Channel_info#getEContainer_channel_info()
	 * @see #getChannel_info()
	 * @generated
	 */
	EReference getChannel_info_EContainer_channel_info();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.Channel_info#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.Channel_info#getTime()
	 * @see #getChannel_info()
	 * @generated
	 */
	EAttribute getChannel_info_Time();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.Channel_info#getChannel_0 <em>Channel 0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Channel 0</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.Channel_info#getChannel_0()
	 * @see #getChannel_info()
	 * @generated
	 */
	EAttribute getChannel_info_Channel_0();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.Channel_info#getChannel_1 <em>Channel 1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Channel 1</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.Channel_info#getChannel_1()
	 * @see #getChannel_info()
	 * @generated
	 */
	EAttribute getChannel_info_Channel_1();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.Channel_info#getChannel_2 <em>Channel 2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Channel 2</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.Channel_info#getChannel_2()
	 * @see #getChannel_info()
	 * @generated
	 */
	EAttribute getChannel_info_Channel_2();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.Channel_info#getChannel_3 <em>Channel 3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Channel 3</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.Channel_info#getChannel_3()
	 * @see #getChannel_info()
	 * @generated
	 */
	EAttribute getChannel_info_Channel_3();

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.Channel_infos <em>Channel infos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Channel infos</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.Channel_infos
	 * @generated
	 */
	EClass getChannel_infos();

	/**
	 * Returns the meta object for the container reference '{@link de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.Channel_infos#getEContainer_channel_infos <em>EContainer channel infos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>EContainer channel infos</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.Channel_infos#getEContainer_channel_infos()
	 * @see #getChannel_infos()
	 * @generated
	 */
	EReference getChannel_infos_EContainer_channel_infos();

	/**
	 * Returns the meta object for the attribute list '{@link de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.Channel_infos#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Text</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.Channel_infos#getText()
	 * @see #getChannel_infos()
	 * @generated
	 */
	EAttribute getChannel_infos_Text();

	/**
	 * Returns the meta object for the containment reference list '{@link de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.Channel_infos#getChannel_info <em>Channel info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Channel info</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.Channel_infos#getChannel_info()
	 * @see #getChannel_infos()
	 * @generated
	 */
	EReference getChannel_infos_Channel_info();

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.Latestchannelinfos <em>Latestchannelinfos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Latestchannelinfos</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.Latestchannelinfos
	 * @generated
	 */
	EClass getLatestchannelinfos();

	/**
	 * Returns the meta object for the containment reference '{@link de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.Latestchannelinfos#getChannel_infos <em>Channel infos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Channel infos</em>'.
	 * @see de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.Latestchannelinfos#getChannel_infos()
	 * @see #getLatestchannelinfos()
	 * @generated
	 */
	EReference getLatestchannelinfos_Channel_infos();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Seismo_latestchannelinfosFactory getSeismo_latestchannelinfosFactory();

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
		 * The meta object literal for the '{@link de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.impl.Channel_infoImpl <em>Channel info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.impl.Channel_infoImpl
		 * @see de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.impl.Seismo_latestchannelinfosPackageImpl#getChannel_info()
		 * @generated
		 */
		EClass CHANNEL_INFO = eINSTANCE.getChannel_info();

		/**
		 * The meta object literal for the '<em><b>EContainer channel info</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANNEL_INFO__ECONTAINER_CHANNEL_INFO = eINSTANCE.getChannel_info_EContainer_channel_info();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANNEL_INFO__TIME = eINSTANCE.getChannel_info_Time();

		/**
		 * The meta object literal for the '<em><b>Channel 0</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANNEL_INFO__CHANNEL_0 = eINSTANCE.getChannel_info_Channel_0();

		/**
		 * The meta object literal for the '<em><b>Channel 1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANNEL_INFO__CHANNEL_1 = eINSTANCE.getChannel_info_Channel_1();

		/**
		 * The meta object literal for the '<em><b>Channel 2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANNEL_INFO__CHANNEL_2 = eINSTANCE.getChannel_info_Channel_2();

		/**
		 * The meta object literal for the '<em><b>Channel 3</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANNEL_INFO__CHANNEL_3 = eINSTANCE.getChannel_info_Channel_3();

		/**
		 * The meta object literal for the '{@link de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.impl.Channel_infosImpl <em>Channel infos</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.impl.Channel_infosImpl
		 * @see de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.impl.Seismo_latestchannelinfosPackageImpl#getChannel_infos()
		 * @generated
		 */
		EClass CHANNEL_INFOS = eINSTANCE.getChannel_infos();

		/**
		 * The meta object literal for the '<em><b>EContainer channel infos</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANNEL_INFOS__ECONTAINER_CHANNEL_INFOS = eINSTANCE.getChannel_infos_EContainer_channel_infos();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANNEL_INFOS__TEXT = eINSTANCE.getChannel_infos_Text();

		/**
		 * The meta object literal for the '<em><b>Channel info</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANNEL_INFOS__CHANNEL_INFO = eINSTANCE.getChannel_infos_Channel_info();

		/**
		 * The meta object literal for the '{@link de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.impl.LatestchannelinfosImpl <em>Latestchannelinfos</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.impl.LatestchannelinfosImpl
		 * @see de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.impl.Seismo_latestchannelinfosPackageImpl#getLatestchannelinfos()
		 * @generated
		 */
		EClass LATESTCHANNELINFOS = eINSTANCE.getLatestchannelinfos();

		/**
		 * The meta object literal for the '<em><b>Channel infos</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LATESTCHANNELINFOS__CHANNEL_INFOS = eINSTANCE.getLatestchannelinfos_Channel_infos();

	}

} //Seismo_latestchannelinfosPackage
