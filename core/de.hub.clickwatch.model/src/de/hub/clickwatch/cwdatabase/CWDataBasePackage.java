/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.cwdatabase;

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
 * @see de.hub.clickwatch.cwdatabase.CWDataBaseFactory
 * @model kind="package"
 * @generated
 */
public interface CWDataBasePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cwdatabase";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://de.hub.clickwatch/cwdatabase";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cwdb";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CWDataBasePackage eINSTANCE = de.hub.clickwatch.cwdatabase.impl.CWDataBasePackageImpl.init();

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.cwdatabase.impl.ExperimimentImpl <em>Experimiment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.cwdatabase.impl.ExperimimentImpl
	 * @see de.hub.clickwatch.cwdatabase.impl.CWDataBasePackageImpl#getExperimiment()
	 * @generated
	 */
	int EXPERIMIMENT = 0;

	/**
	 * The feature id for the '<em><b>Meta Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMIMENT__META_DATA = 0;

	/**
	 * The feature id for the '<em><b>Records</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMIMENT__RECORDS = 1;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMIMENT__CONFIGURATION = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMIMENT__ID = 3;

	/**
	 * The feature id for the '<em><b>Record UR Is</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMIMENT__RECORD_UR_IS = 4;

	/**
	 * The feature id for the '<em><b>Storage Base File Str</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMIMENT__STORAGE_BASE_FILE_STR = 5;

	/**
	 * The number of structural features of the '<em>Experimiment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMIMENT_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.cwdatabase.impl.NodeRecordImpl <em>Node Record</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.cwdatabase.impl.NodeRecordImpl
	 * @see de.hub.clickwatch.cwdatabase.impl.CWDataBasePackageImpl#getNodeRecord()
	 * @generated
	 */
	int NODE_RECORD = 1;

	/**
	 * The feature id for the '<em><b>Records</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_RECORD__RECORDS = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_RECORD__KEY = 1;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_RECORD__START = 2;

	/**
	 * The feature id for the '<em><b>Stop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_RECORD__STOP = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_RECORD__ID = 4;

	/**
	 * The number of structural features of the '<em>Node Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_RECORD_FEATURE_COUNT = 5;


	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.cwdatabase.Experimiment <em>Experimiment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Experimiment</em>'.
	 * @see de.hub.clickwatch.cwdatabase.Experimiment
	 * @generated
	 */
	EClass getExperimiment();

	/**
	 * Returns the meta object for the containment reference list '{@link de.hub.clickwatch.cwdatabase.Experimiment#getMetaData <em>Meta Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Meta Data</em>'.
	 * @see de.hub.clickwatch.cwdatabase.Experimiment#getMetaData()
	 * @see #getExperimiment()
	 * @generated
	 */
	EReference getExperimiment_MetaData();

	/**
	 * Returns the meta object for the containment reference list '{@link de.hub.clickwatch.cwdatabase.Experimiment#getRecords <em>Records</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Records</em>'.
	 * @see de.hub.clickwatch.cwdatabase.Experimiment#getRecords()
	 * @see #getExperimiment()
	 * @generated
	 */
	EReference getExperimiment_Records();

	/**
	 * Returns the meta object for the containment reference '{@link de.hub.clickwatch.cwdatabase.Experimiment#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Configuration</em>'.
	 * @see de.hub.clickwatch.cwdatabase.Experimiment#getConfiguration()
	 * @see #getExperimiment()
	 * @generated
	 */
	EReference getExperimiment_Configuration();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.cwdatabase.Experimiment#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.hub.clickwatch.cwdatabase.Experimiment#getId()
	 * @see #getExperimiment()
	 * @generated
	 */
	EAttribute getExperimiment_Id();

	/**
	 * Returns the meta object for the attribute list '{@link de.hub.clickwatch.cwdatabase.Experimiment#getRecordURIs <em>Record UR Is</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Record UR Is</em>'.
	 * @see de.hub.clickwatch.cwdatabase.Experimiment#getRecordURIs()
	 * @see #getExperimiment()
	 * @generated
	 */
	EAttribute getExperimiment_RecordURIs();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.cwdatabase.Experimiment#getStorageBaseFileStr <em>Storage Base File Str</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Storage Base File Str</em>'.
	 * @see de.hub.clickwatch.cwdatabase.Experimiment#getStorageBaseFileStr()
	 * @see #getExperimiment()
	 * @generated
	 */
	EAttribute getExperimiment_StorageBaseFileStr();

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.cwdatabase.NodeRecord <em>Node Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Record</em>'.
	 * @see de.hub.clickwatch.cwdatabase.NodeRecord
	 * @generated
	 */
	EClass getNodeRecord();

	/**
	 * Returns the meta object for the containment reference list '{@link de.hub.clickwatch.cwdatabase.NodeRecord#getRecords <em>Records</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Records</em>'.
	 * @see de.hub.clickwatch.cwdatabase.NodeRecord#getRecords()
	 * @see #getNodeRecord()
	 * @generated
	 */
	EReference getNodeRecord_Records();

	/**
	 * Returns the meta object for the reference list '{@link de.hub.clickwatch.cwdatabase.NodeRecord#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Key</em>'.
	 * @see de.hub.clickwatch.cwdatabase.NodeRecord#getKey()
	 * @see #getNodeRecord()
	 * @generated
	 */
	EReference getNodeRecord_Key();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.cwdatabase.NodeRecord#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see de.hub.clickwatch.cwdatabase.NodeRecord#getStart()
	 * @see #getNodeRecord()
	 * @generated
	 */
	EAttribute getNodeRecord_Start();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.cwdatabase.NodeRecord#getStop <em>Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stop</em>'.
	 * @see de.hub.clickwatch.cwdatabase.NodeRecord#getStop()
	 * @see #getNodeRecord()
	 * @generated
	 */
	EAttribute getNodeRecord_Stop();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.cwdatabase.NodeRecord#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.hub.clickwatch.cwdatabase.NodeRecord#getId()
	 * @see #getNodeRecord()
	 * @generated
	 */
	EAttribute getNodeRecord_Id();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CWDataBaseFactory getCWDataBaseFactory();

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
		 * The meta object literal for the '{@link de.hub.clickwatch.cwdatabase.impl.ExperimimentImpl <em>Experimiment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.cwdatabase.impl.ExperimimentImpl
		 * @see de.hub.clickwatch.cwdatabase.impl.CWDataBasePackageImpl#getExperimiment()
		 * @generated
		 */
		EClass EXPERIMIMENT = eINSTANCE.getExperimiment();

		/**
		 * The meta object literal for the '<em><b>Meta Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPERIMIMENT__META_DATA = eINSTANCE.getExperimiment_MetaData();

		/**
		 * The meta object literal for the '<em><b>Records</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPERIMIMENT__RECORDS = eINSTANCE.getExperimiment_Records();

		/**
		 * The meta object literal for the '<em><b>Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPERIMIMENT__CONFIGURATION = eINSTANCE.getExperimiment_Configuration();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPERIMIMENT__ID = eINSTANCE.getExperimiment_Id();

		/**
		 * The meta object literal for the '<em><b>Record UR Is</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPERIMIMENT__RECORD_UR_IS = eINSTANCE.getExperimiment_RecordURIs();

		/**
		 * The meta object literal for the '<em><b>Storage Base File Str</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPERIMIMENT__STORAGE_BASE_FILE_STR = eINSTANCE.getExperimiment_StorageBaseFileStr();

		/**
		 * The meta object literal for the '{@link de.hub.clickwatch.cwdatabase.impl.NodeRecordImpl <em>Node Record</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.cwdatabase.impl.NodeRecordImpl
		 * @see de.hub.clickwatch.cwdatabase.impl.CWDataBasePackageImpl#getNodeRecord()
		 * @generated
		 */
		EClass NODE_RECORD = eINSTANCE.getNodeRecord();

		/**
		 * The meta object literal for the '<em><b>Records</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_RECORD__RECORDS = eINSTANCE.getNodeRecord_Records();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_RECORD__KEY = eINSTANCE.getNodeRecord_Key();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_RECORD__START = eINSTANCE.getNodeRecord_Start();

		/**
		 * The meta object literal for the '<em><b>Stop</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_RECORD__STOP = eINSTANCE.getNodeRecord_Stop();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_RECORD__ID = eINSTANCE.getNodeRecord_Id();

	}

} //CWDataBasePackage
