/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.analysis.results;

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
 * @see de.hub.clickwatch.analysis.results.ResultsFactory
 * @model kind="package"
 * @generated
 */
public interface ResultsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "results";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://de.hub.clickwatch.analysis.results";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "results";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ResultsPackage eINSTANCE = de.hub.clickwatch.analysis.results.impl.ResultsPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.analysis.results.impl.DataSetImpl <em>Data Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.analysis.results.impl.DataSetImpl
	 * @see de.hub.clickwatch.analysis.results.impl.ResultsPackageImpl#getDataSet()
	 * @generated
	 */
	int DATA_SET = 0;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET__ENTRIES = 0;

	/**
	 * The number of structural features of the '<em>Data Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.analysis.results.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.analysis.results.impl.NamedElementImpl
	 * @see de.hub.clickwatch.analysis.results.impl.ResultsPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.analysis.results.impl.DataEntryImpl <em>Data Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.analysis.results.impl.DataEntryImpl
	 * @see de.hub.clickwatch.analysis.results.impl.ResultsPackageImpl#getDataEntry()
	 * @generated
	 */
	int DATA_ENTRY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ENTRY__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ENTRY__VALUES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ENTRY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.analysis.results.impl.ChartImpl <em>Chart</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.analysis.results.impl.ChartImpl
	 * @see de.hub.clickwatch.analysis.results.impl.ResultsPackageImpl#getChart()
	 * @generated
	 */
	int CHART = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value Specs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__VALUE_SPECS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Chart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.analysis.results.impl.ChartTypeImpl <em>Chart Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.analysis.results.impl.ChartTypeImpl
	 * @see de.hub.clickwatch.analysis.results.impl.ResultsPackageImpl#getChartType()
	 * @generated
	 */
	int CHART_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_TYPE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Chart Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_TYPE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.analysis.results.impl.ValueSpecImpl <em>Value Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.analysis.results.impl.ValueSpecImpl
	 * @see de.hub.clickwatch.analysis.results.impl.ResultsPackageImpl#getValueSpec()
	 * @generated
	 */
	int VALUE_SPEC = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPEC__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPEC__COLUMN = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Value Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPEC_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.analysis.results.impl.AxisImpl <em>Axis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.analysis.results.impl.AxisImpl
	 * @see de.hub.clickwatch.analysis.results.impl.ResultsPackageImpl#getAxis()
	 * @generated
	 */
	int AXIS = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS__NAME = VALUE_SPEC__NAME;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS__COLUMN = VALUE_SPEC__COLUMN;

	/**
	 * The number of structural features of the '<em>Axis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS_FEATURE_COUNT = VALUE_SPEC_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.analysis.results.impl.SeriesImpl <em>Series</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.analysis.results.impl.SeriesImpl
	 * @see de.hub.clickwatch.analysis.results.impl.ResultsPackageImpl#getSeries()
	 * @generated
	 */
	int SERIES = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES__NAME = VALUE_SPEC__NAME;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES__COLUMN = VALUE_SPEC__COLUMN;

	/**
	 * The number of structural features of the '<em>Series</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_FEATURE_COUNT = VALUE_SPEC_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.analysis.results.impl.CategoryImpl <em>Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.analysis.results.impl.CategoryImpl
	 * @see de.hub.clickwatch.analysis.results.impl.ResultsPackageImpl#getCategory()
	 * @generated
	 */
	int CATEGORY = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__NAME = VALUE_SPEC__NAME;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__COLUMN = VALUE_SPEC__COLUMN;

	/**
	 * The number of structural features of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_FEATURE_COUNT = VALUE_SPEC_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.analysis.results.impl.ResultImpl <em>Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.analysis.results.impl.ResultImpl
	 * @see de.hub.clickwatch.analysis.results.impl.ResultsPackageImpl#getResult()
	 * @generated
	 */
	int RESULT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__TIMESTAMP = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Diagrams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__DIAGRAMS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__DATA_SET = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.analysis.results.impl.XYImpl <em>XY</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.analysis.results.impl.XYImpl
	 * @see de.hub.clickwatch.analysis.results.impl.ResultsPackageImpl#getXY()
	 * @generated
	 */
	int XY = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XY__NAME = CHART_TYPE__NAME;

	/**
	 * The number of structural features of the '<em>XY</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XY_FEATURE_COUNT = CHART_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.analysis.results.impl.BoxAndWhiskersImpl <em>Box And Whiskers</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.analysis.results.impl.BoxAndWhiskersImpl
	 * @see de.hub.clickwatch.analysis.results.impl.ResultsPackageImpl#getBoxAndWhiskers()
	 * @generated
	 */
	int BOX_AND_WHISKERS = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX_AND_WHISKERS__NAME = CHART_TYPE__NAME;

	/**
	 * The number of structural features of the '<em>Box And Whiskers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX_AND_WHISKERS_FEATURE_COUNT = CHART_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.analysis.results.impl.BarImpl <em>Bar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.analysis.results.impl.BarImpl
	 * @see de.hub.clickwatch.analysis.results.impl.ResultsPackageImpl#getBar()
	 * @generated
	 */
	int BAR = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR__NAME = CHART_TYPE__NAME;

	/**
	 * The number of structural features of the '<em>Bar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_FEATURE_COUNT = CHART_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.hub.clickwatch.analysis.results.impl.ResultsImpl <em>Results</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.analysis.results.impl.ResultsImpl
	 * @see de.hub.clickwatch.analysis.results.impl.ResultsPackageImpl#getResults()
	 * @generated
	 */
	int RESULTS = 13;

	/**
	 * The feature id for the '<em><b>Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS__RESULTS = 0;

	/**
	 * The number of structural features of the '<em>Results</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_FEATURE_COUNT = 1;


	/**
	 * The meta object id for the '{@link de.hub.clickwatch.analysis.results.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.clickwatch.analysis.results.impl.ConstraintImpl
	 * @see de.hub.clickwatch.analysis.results.impl.ResultsPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__NAME = VALUE_SPEC__NAME;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__COLUMN = VALUE_SPEC__COLUMN;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__CONSTRAINT = VALUE_SPEC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = VALUE_SPEC_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.analysis.results.DataSet <em>Data Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Set</em>'.
	 * @see de.hub.clickwatch.analysis.results.DataSet
	 * @generated
	 */
	EClass getDataSet();

	/**
	 * Returns the meta object for the containment reference list '{@link de.hub.clickwatch.analysis.results.DataSet#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see de.hub.clickwatch.analysis.results.DataSet#getEntries()
	 * @see #getDataSet()
	 * @generated
	 */
	EReference getDataSet_Entries();

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.analysis.results.DataEntry <em>Data Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Entry</em>'.
	 * @see de.hub.clickwatch.analysis.results.DataEntry
	 * @generated
	 */
	EClass getDataEntry();

	/**
	 * Returns the meta object for the attribute list '{@link de.hub.clickwatch.analysis.results.DataEntry#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Values</em>'.
	 * @see de.hub.clickwatch.analysis.results.DataEntry#getValues()
	 * @see #getDataEntry()
	 * @generated
	 */
	EAttribute getDataEntry_Values();

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.analysis.results.Chart <em>Chart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chart</em>'.
	 * @see de.hub.clickwatch.analysis.results.Chart
	 * @generated
	 */
	EClass getChart();

	/**
	 * Returns the meta object for the containment reference '{@link de.hub.clickwatch.analysis.results.Chart#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see de.hub.clickwatch.analysis.results.Chart#getType()
	 * @see #getChart()
	 * @generated
	 */
	EReference getChart_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link de.hub.clickwatch.analysis.results.Chart#getValueSpecs <em>Value Specs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value Specs</em>'.
	 * @see de.hub.clickwatch.analysis.results.Chart#getValueSpecs()
	 * @see #getChart()
	 * @generated
	 */
	EReference getChart_ValueSpecs();

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.analysis.results.ChartType <em>Chart Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chart Type</em>'.
	 * @see de.hub.clickwatch.analysis.results.ChartType
	 * @generated
	 */
	EClass getChartType();

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.analysis.results.ValueSpec <em>Value Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Spec</em>'.
	 * @see de.hub.clickwatch.analysis.results.ValueSpec
	 * @generated
	 */
	EClass getValueSpec();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.analysis.results.ValueSpec#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column</em>'.
	 * @see de.hub.clickwatch.analysis.results.ValueSpec#getColumn()
	 * @see #getValueSpec()
	 * @generated
	 */
	EAttribute getValueSpec_Column();

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.analysis.results.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see de.hub.clickwatch.analysis.results.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.analysis.results.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.hub.clickwatch.analysis.results.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.analysis.results.Axis <em>Axis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Axis</em>'.
	 * @see de.hub.clickwatch.analysis.results.Axis
	 * @generated
	 */
	EClass getAxis();

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.analysis.results.Series <em>Series</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Series</em>'.
	 * @see de.hub.clickwatch.analysis.results.Series
	 * @generated
	 */
	EClass getSeries();

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.analysis.results.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category</em>'.
	 * @see de.hub.clickwatch.analysis.results.Category
	 * @generated
	 */
	EClass getCategory();

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.analysis.results.Result <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Result</em>'.
	 * @see de.hub.clickwatch.analysis.results.Result
	 * @generated
	 */
	EClass getResult();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.analysis.results.Result#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see de.hub.clickwatch.analysis.results.Result#getTimestamp()
	 * @see #getResult()
	 * @generated
	 */
	EAttribute getResult_Timestamp();

	/**
	 * Returns the meta object for the containment reference list '{@link de.hub.clickwatch.analysis.results.Result#getDiagrams <em>Diagrams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diagrams</em>'.
	 * @see de.hub.clickwatch.analysis.results.Result#getDiagrams()
	 * @see #getResult()
	 * @generated
	 */
	EReference getResult_Diagrams();

	/**
	 * Returns the meta object for the containment reference '{@link de.hub.clickwatch.analysis.results.Result#getDataSet <em>Data Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Set</em>'.
	 * @see de.hub.clickwatch.analysis.results.Result#getDataSet()
	 * @see #getResult()
	 * @generated
	 */
	EReference getResult_DataSet();

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.analysis.results.XY <em>XY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XY</em>'.
	 * @see de.hub.clickwatch.analysis.results.XY
	 * @generated
	 */
	EClass getXY();

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.analysis.results.BoxAndWhiskers <em>Box And Whiskers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Box And Whiskers</em>'.
	 * @see de.hub.clickwatch.analysis.results.BoxAndWhiskers
	 * @generated
	 */
	EClass getBoxAndWhiskers();

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.analysis.results.Bar <em>Bar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bar</em>'.
	 * @see de.hub.clickwatch.analysis.results.Bar
	 * @generated
	 */
	EClass getBar();

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.analysis.results.Results <em>Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Results</em>'.
	 * @see de.hub.clickwatch.analysis.results.Results
	 * @generated
	 */
	EClass getResults();

	/**
	 * Returns the meta object for the containment reference list '{@link de.hub.clickwatch.analysis.results.Results#getResults <em>Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Results</em>'.
	 * @see de.hub.clickwatch.analysis.results.Results#getResults()
	 * @see #getResults()
	 * @generated
	 */
	EReference getResults_Results();

	/**
	 * Returns the meta object for class '{@link de.hub.clickwatch.analysis.results.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see de.hub.clickwatch.analysis.results.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.clickwatch.analysis.results.Constraint#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraint</em>'.
	 * @see de.hub.clickwatch.analysis.results.Constraint#getConstraint()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_Constraint();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ResultsFactory getResultsFactory();

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
		 * The meta object literal for the '{@link de.hub.clickwatch.analysis.results.impl.DataSetImpl <em>Data Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.analysis.results.impl.DataSetImpl
		 * @see de.hub.clickwatch.analysis.results.impl.ResultsPackageImpl#getDataSet()
		 * @generated
		 */
		EClass DATA_SET = eINSTANCE.getDataSet();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SET__ENTRIES = eINSTANCE.getDataSet_Entries();

		/**
		 * The meta object literal for the '{@link de.hub.clickwatch.analysis.results.impl.DataEntryImpl <em>Data Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.analysis.results.impl.DataEntryImpl
		 * @see de.hub.clickwatch.analysis.results.impl.ResultsPackageImpl#getDataEntry()
		 * @generated
		 */
		EClass DATA_ENTRY = eINSTANCE.getDataEntry();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_ENTRY__VALUES = eINSTANCE.getDataEntry_Values();

		/**
		 * The meta object literal for the '{@link de.hub.clickwatch.analysis.results.impl.ChartImpl <em>Chart</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.analysis.results.impl.ChartImpl
		 * @see de.hub.clickwatch.analysis.results.impl.ResultsPackageImpl#getChart()
		 * @generated
		 */
		EClass CHART = eINSTANCE.getChart();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHART__TYPE = eINSTANCE.getChart_Type();

		/**
		 * The meta object literal for the '<em><b>Value Specs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHART__VALUE_SPECS = eINSTANCE.getChart_ValueSpecs();

		/**
		 * The meta object literal for the '{@link de.hub.clickwatch.analysis.results.impl.ChartTypeImpl <em>Chart Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.analysis.results.impl.ChartTypeImpl
		 * @see de.hub.clickwatch.analysis.results.impl.ResultsPackageImpl#getChartType()
		 * @generated
		 */
		EClass CHART_TYPE = eINSTANCE.getChartType();

		/**
		 * The meta object literal for the '{@link de.hub.clickwatch.analysis.results.impl.ValueSpecImpl <em>Value Spec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.analysis.results.impl.ValueSpecImpl
		 * @see de.hub.clickwatch.analysis.results.impl.ResultsPackageImpl#getValueSpec()
		 * @generated
		 */
		EClass VALUE_SPEC = eINSTANCE.getValueSpec();

		/**
		 * The meta object literal for the '<em><b>Column</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_SPEC__COLUMN = eINSTANCE.getValueSpec_Column();

		/**
		 * The meta object literal for the '{@link de.hub.clickwatch.analysis.results.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.analysis.results.impl.NamedElementImpl
		 * @see de.hub.clickwatch.analysis.results.impl.ResultsPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link de.hub.clickwatch.analysis.results.impl.AxisImpl <em>Axis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.analysis.results.impl.AxisImpl
		 * @see de.hub.clickwatch.analysis.results.impl.ResultsPackageImpl#getAxis()
		 * @generated
		 */
		EClass AXIS = eINSTANCE.getAxis();

		/**
		 * The meta object literal for the '{@link de.hub.clickwatch.analysis.results.impl.SeriesImpl <em>Series</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.analysis.results.impl.SeriesImpl
		 * @see de.hub.clickwatch.analysis.results.impl.ResultsPackageImpl#getSeries()
		 * @generated
		 */
		EClass SERIES = eINSTANCE.getSeries();

		/**
		 * The meta object literal for the '{@link de.hub.clickwatch.analysis.results.impl.CategoryImpl <em>Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.analysis.results.impl.CategoryImpl
		 * @see de.hub.clickwatch.analysis.results.impl.ResultsPackageImpl#getCategory()
		 * @generated
		 */
		EClass CATEGORY = eINSTANCE.getCategory();

		/**
		 * The meta object literal for the '{@link de.hub.clickwatch.analysis.results.impl.ResultImpl <em>Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.analysis.results.impl.ResultImpl
		 * @see de.hub.clickwatch.analysis.results.impl.ResultsPackageImpl#getResult()
		 * @generated
		 */
		EClass RESULT = eINSTANCE.getResult();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT__TIMESTAMP = eINSTANCE.getResult_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Diagrams</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESULT__DIAGRAMS = eINSTANCE.getResult_Diagrams();

		/**
		 * The meta object literal for the '<em><b>Data Set</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESULT__DATA_SET = eINSTANCE.getResult_DataSet();

		/**
		 * The meta object literal for the '{@link de.hub.clickwatch.analysis.results.impl.XYImpl <em>XY</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.analysis.results.impl.XYImpl
		 * @see de.hub.clickwatch.analysis.results.impl.ResultsPackageImpl#getXY()
		 * @generated
		 */
		EClass XY = eINSTANCE.getXY();

		/**
		 * The meta object literal for the '{@link de.hub.clickwatch.analysis.results.impl.BoxAndWhiskersImpl <em>Box And Whiskers</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.analysis.results.impl.BoxAndWhiskersImpl
		 * @see de.hub.clickwatch.analysis.results.impl.ResultsPackageImpl#getBoxAndWhiskers()
		 * @generated
		 */
		EClass BOX_AND_WHISKERS = eINSTANCE.getBoxAndWhiskers();

		/**
		 * The meta object literal for the '{@link de.hub.clickwatch.analysis.results.impl.BarImpl <em>Bar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.analysis.results.impl.BarImpl
		 * @see de.hub.clickwatch.analysis.results.impl.ResultsPackageImpl#getBar()
		 * @generated
		 */
		EClass BAR = eINSTANCE.getBar();

		/**
		 * The meta object literal for the '{@link de.hub.clickwatch.analysis.results.impl.ResultsImpl <em>Results</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.analysis.results.impl.ResultsImpl
		 * @see de.hub.clickwatch.analysis.results.impl.ResultsPackageImpl#getResults()
		 * @generated
		 */
		EClass RESULTS = eINSTANCE.getResults();

		/**
		 * The meta object literal for the '<em><b>Results</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESULTS__RESULTS = eINSTANCE.getResults_Results();

		/**
		 * The meta object literal for the '{@link de.hub.clickwatch.analysis.results.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.clickwatch.analysis.results.impl.ConstraintImpl
		 * @see de.hub.clickwatch.analysis.results.impl.ResultsPackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__CONSTRAINT = eINSTANCE.getConstraint_Constraint();

	}

} //ResultsPackage
