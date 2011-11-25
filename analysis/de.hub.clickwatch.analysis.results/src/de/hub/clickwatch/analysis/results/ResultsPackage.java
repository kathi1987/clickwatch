/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.analysis.results;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
     * The meta object id for the '<em>Data Set</em>' data type.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.hub.clickwatch.analysis.results.DataSet
     * @see de.hub.clickwatch.analysis.results.impl.ResultsPackageImpl#getDataSet()
     * @generated
     */
	int DATA_SET = 19;

	/**
     * The meta object id for the '{@link de.hub.clickwatch.analysis.results.impl.NamedElementImpl <em>Named Element</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.hub.clickwatch.analysis.results.impl.NamedElementImpl
     * @see de.hub.clickwatch.analysis.results.impl.ResultsPackageImpl#getNamedElement()
     * @generated
     */
	int NAMED_ELEMENT = 3;

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
     * The meta object id for the '<em>Data Entry</em>' data type.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.hub.clickwatch.analysis.results.DataEntry
     * @see de.hub.clickwatch.analysis.results.impl.ResultsPackageImpl#getDataEntry()
     * @generated
     */
	int DATA_ENTRY = 20;

	/**
     * The meta object id for the '{@link de.hub.clickwatch.analysis.results.impl.ChartImpl <em>Chart</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.hub.clickwatch.analysis.results.impl.ChartImpl
     * @see de.hub.clickwatch.analysis.results.impl.ResultsPackageImpl#getChart()
     * @generated
     */
	int CHART = 0;

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
	int CHART_TYPE = 1;

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
	int VALUE_SPEC = 2;

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
     * The feature id for the '<em><b>Constraint</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VALUE_SPEC__CONSTRAINT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
     * The number of structural features of the '<em>Value Spec</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int VALUE_SPEC_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
     * The meta object id for the '{@link de.hub.clickwatch.analysis.results.impl.AxisImpl <em>Axis</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.hub.clickwatch.analysis.results.impl.AxisImpl
     * @see de.hub.clickwatch.analysis.results.impl.ResultsPackageImpl#getAxis()
     * @generated
     */
	int AXIS = 4;

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
     * The feature id for the '<em><b>Constraint</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int AXIS__CONSTRAINT = VALUE_SPEC__CONSTRAINT;

	/**
     * The feature id for the '<em><b>To</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int AXIS__TO = VALUE_SPEC_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>From</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int AXIS__FROM = VALUE_SPEC_FEATURE_COUNT + 1;

	/**
     * The number of structural features of the '<em>Axis</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int AXIS_FEATURE_COUNT = VALUE_SPEC_FEATURE_COUNT + 2;

	/**
     * The meta object id for the '{@link de.hub.clickwatch.analysis.results.impl.SeriesImpl <em>Series</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.hub.clickwatch.analysis.results.impl.SeriesImpl
     * @see de.hub.clickwatch.analysis.results.impl.ResultsPackageImpl#getSeries()
     * @generated
     */
	int SERIES = 5;

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
     * The feature id for the '<em><b>Constraint</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SERIES__CONSTRAINT = VALUE_SPEC__CONSTRAINT;

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
	int CATEGORY = 6;

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
     * The feature id for the '<em><b>Constraint</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CATEGORY__CONSTRAINT = VALUE_SPEC__CONSTRAINT;

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
	int RESULT = 7;

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
     * The number of structural features of the '<em>Result</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESULT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
     * The meta object id for the '{@link de.hub.clickwatch.analysis.results.impl.XYImpl <em>XY</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.hub.clickwatch.analysis.results.impl.XYImpl
     * @see de.hub.clickwatch.analysis.results.impl.ResultsPackageImpl#getXY()
     * @generated
     */
	int XY = 8;

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
	int BOX_AND_WHISKERS = 9;

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
	int BAR = 10;

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
	int RESULTS = 11;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESULTS__NAME = CHART__NAME;

	/**
     * The feature id for the '<em><b>Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESULTS__TYPE = CHART__TYPE;

	/**
     * The feature id for the '<em><b>Value Specs</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESULTS__VALUE_SPECS = CHART__VALUE_SPECS;

	/**
     * The feature id for the '<em><b>Results</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESULTS__RESULTS = CHART_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Groups</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESULTS__GROUPS = CHART_FEATURE_COUNT + 1;

	/**
     * The number of structural features of the '<em>Results</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESULTS_FEATURE_COUNT = CHART_FEATURE_COUNT + 2;


	/**
     * The meta object id for the '{@link de.hub.clickwatch.analysis.results.impl.ConstraintImpl <em>Constraint</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.hub.clickwatch.analysis.results.impl.ConstraintImpl
     * @see de.hub.clickwatch.analysis.results.impl.ResultsPackageImpl#getConstraint()
     * @generated
     */
	int CONSTRAINT = 13;

	/**
     * The number of structural features of the '<em>Constraint</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONSTRAINT_FEATURE_COUNT = 0;


	/**
     * The meta object id for the '{@link de.hub.clickwatch.analysis.results.impl.EqualsConstraintImpl <em>Equals Constraint</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.hub.clickwatch.analysis.results.impl.EqualsConstraintImpl
     * @see de.hub.clickwatch.analysis.results.impl.ResultsPackageImpl#getEqualsConstraint()
     * @generated
     */
	int EQUALS_CONSTRAINT = 12;

	/**
     * The feature id for the '<em><b>Constraint</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int EQUALS_CONSTRAINT__CONSTRAINT = CONSTRAINT_FEATURE_COUNT + 0;

	/**
     * The number of structural features of the '<em>Equals Constraint</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int EQUALS_CONSTRAINT_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 1;

	/**
     * The meta object id for the '{@link de.hub.clickwatch.analysis.results.impl.OrImpl <em>Or</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.hub.clickwatch.analysis.results.impl.OrImpl
     * @see de.hub.clickwatch.analysis.results.impl.ResultsPackageImpl#getOr()
     * @generated
     */
	int OR = 14;

	/**
     * The feature id for the '<em><b>Ops</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int OR__OPS = CONSTRAINT_FEATURE_COUNT + 0;

	/**
     * The number of structural features of the '<em>Or</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int OR_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 1;


	/**
     * The meta object id for the '{@link de.hub.clickwatch.analysis.results.impl.NumericalResultImpl <em>Numerical Result</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hub.clickwatch.analysis.results.impl.NumericalResultImpl
     * @see de.hub.clickwatch.analysis.results.impl.ResultsPackageImpl#getNumericalResult()
     * @generated
     */
    int NUMERICAL_RESULT = 15;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUMERICAL_RESULT__NAME = RESULT__NAME;

    /**
     * The feature id for the '<em><b>Timestamp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUMERICAL_RESULT__TIMESTAMP = RESULT__TIMESTAMP;

    /**
     * The feature id for the '<em><b>Charts</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUMERICAL_RESULT__CHARTS = RESULT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Data</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUMERICAL_RESULT__DATA = RESULT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Numerical Result</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUMERICAL_RESULT_FEATURE_COUNT = RESULT_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link de.hub.clickwatch.analysis.results.impl.GraphResultImpl <em>Graph Result</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hub.clickwatch.analysis.results.impl.GraphResultImpl
     * @see de.hub.clickwatch.analysis.results.impl.ResultsPackageImpl#getGraphResult()
     * @generated
     */
    int GRAPH_RESULT = 16;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GRAPH_RESULT__NAME = RESULT__NAME;

    /**
     * The feature id for the '<em><b>Timestamp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GRAPH_RESULT__TIMESTAMP = RESULT__TIMESTAMP;

    /**
     * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GRAPH_RESULT__NODES = RESULT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Links</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GRAPH_RESULT__LINKS = RESULT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Graph Result</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GRAPH_RESULT_FEATURE_COUNT = RESULT_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link de.hub.clickwatch.analysis.results.impl.GraphNodeImpl <em>Graph Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hub.clickwatch.analysis.results.impl.GraphNodeImpl
     * @see de.hub.clickwatch.analysis.results.impl.ResultsPackageImpl#getGraphNode()
     * @generated
     */
    int GRAPH_NODE = 17;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GRAPH_NODE__NAME = NAMED_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Outgoing</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GRAPH_NODE__OUTGOING = NAMED_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Incoming</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GRAPH_NODE__INCOMING = NAMED_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Graph Node</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GRAPH_NODE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link de.hub.clickwatch.analysis.results.impl.GraphLinkImpl <em>Graph Link</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hub.clickwatch.analysis.results.impl.GraphLinkImpl
     * @see de.hub.clickwatch.analysis.results.impl.ResultsPackageImpl#getGraphLink()
     * @generated
     */
    int GRAPH_LINK = 18;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GRAPH_LINK__NAME = NAMED_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Source</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GRAPH_LINK__SOURCE = NAMED_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GRAPH_LINK__TARGET = NAMED_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Graph Link</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GRAPH_LINK_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;


    /**
     * Returns the meta object for data type '{@link de.hub.clickwatch.analysis.results.DataSet <em>Data Set</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Data Set</em>'.
     * @see de.hub.clickwatch.analysis.results.DataSet
     * @model instanceClass="de.hub.clickwatch.analysis.results.DataSet"
     * @generated
     */
	EDataType getDataSet();

	/**
     * Returns the meta object for data type '{@link de.hub.clickwatch.analysis.results.DataEntry <em>Data Entry</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Data Entry</em>'.
     * @see de.hub.clickwatch.analysis.results.DataEntry
     * @model instanceClass="de.hub.clickwatch.analysis.results.DataEntry"
     * @generated
     */
	EDataType getDataEntry();

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
     * Returns the meta object for the containment reference '{@link de.hub.clickwatch.analysis.results.ValueSpec#getConstraint <em>Constraint</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Constraint</em>'.
     * @see de.hub.clickwatch.analysis.results.ValueSpec#getConstraint()
     * @see #getValueSpec()
     * @generated
     */
	EReference getValueSpec_Constraint();

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
     * Returns the meta object for the attribute '{@link de.hub.clickwatch.analysis.results.Axis#getTo <em>To</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>To</em>'.
     * @see de.hub.clickwatch.analysis.results.Axis#getTo()
     * @see #getAxis()
     * @generated
     */
	EAttribute getAxis_To();

	/**
     * Returns the meta object for the attribute '{@link de.hub.clickwatch.analysis.results.Axis#getFrom <em>From</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>From</em>'.
     * @see de.hub.clickwatch.analysis.results.Axis#getFrom()
     * @see #getAxis()
     * @generated
     */
	EAttribute getAxis_From();

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
     * Returns the meta object for the containment reference list '{@link de.hub.clickwatch.analysis.results.Results#getGroups <em>Groups</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Groups</em>'.
     * @see de.hub.clickwatch.analysis.results.Results#getGroups()
     * @see #getResults()
     * @generated
     */
	EReference getResults_Groups();

	/**
     * Returns the meta object for class '{@link de.hub.clickwatch.analysis.results.EqualsConstraint <em>Equals Constraint</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Equals Constraint</em>'.
     * @see de.hub.clickwatch.analysis.results.EqualsConstraint
     * @generated
     */
	EClass getEqualsConstraint();

	/**
     * Returns the meta object for the attribute '{@link de.hub.clickwatch.analysis.results.EqualsConstraint#getConstraint <em>Constraint</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Constraint</em>'.
     * @see de.hub.clickwatch.analysis.results.EqualsConstraint#getConstraint()
     * @see #getEqualsConstraint()
     * @generated
     */
	EAttribute getEqualsConstraint_Constraint();

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
     * Returns the meta object for class '{@link de.hub.clickwatch.analysis.results.Or <em>Or</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Or</em>'.
     * @see de.hub.clickwatch.analysis.results.Or
     * @generated
     */
	EClass getOr();

	/**
     * Returns the meta object for the containment reference list '{@link de.hub.clickwatch.analysis.results.Or#getOps <em>Ops</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Ops</em>'.
     * @see de.hub.clickwatch.analysis.results.Or#getOps()
     * @see #getOr()
     * @generated
     */
	EReference getOr_Ops();

	/**
     * Returns the meta object for class '{@link de.hub.clickwatch.analysis.results.NumericalResult <em>Numerical Result</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Numerical Result</em>'.
     * @see de.hub.clickwatch.analysis.results.NumericalResult
     * @generated
     */
    EClass getNumericalResult();

    /**
     * Returns the meta object for the containment reference list '{@link de.hub.clickwatch.analysis.results.NumericalResult#getCharts <em>Charts</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Charts</em>'.
     * @see de.hub.clickwatch.analysis.results.NumericalResult#getCharts()
     * @see #getNumericalResult()
     * @generated
     */
    EReference getNumericalResult_Charts();

    /**
     * Returns the meta object for the attribute '{@link de.hub.clickwatch.analysis.results.NumericalResult#getData <em>Data</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Data</em>'.
     * @see de.hub.clickwatch.analysis.results.NumericalResult#getData()
     * @see #getNumericalResult()
     * @generated
     */
    EAttribute getNumericalResult_Data();

    /**
     * Returns the meta object for class '{@link de.hub.clickwatch.analysis.results.GraphResult <em>Graph Result</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Graph Result</em>'.
     * @see de.hub.clickwatch.analysis.results.GraphResult
     * @generated
     */
    EClass getGraphResult();

    /**
     * Returns the meta object for the containment reference list '{@link de.hub.clickwatch.analysis.results.GraphResult#getNodes <em>Nodes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Nodes</em>'.
     * @see de.hub.clickwatch.analysis.results.GraphResult#getNodes()
     * @see #getGraphResult()
     * @generated
     */
    EReference getGraphResult_Nodes();

    /**
     * Returns the meta object for the containment reference list '{@link de.hub.clickwatch.analysis.results.GraphResult#getLinks <em>Links</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Links</em>'.
     * @see de.hub.clickwatch.analysis.results.GraphResult#getLinks()
     * @see #getGraphResult()
     * @generated
     */
    EReference getGraphResult_Links();

    /**
     * Returns the meta object for class '{@link de.hub.clickwatch.analysis.results.GraphNode <em>Graph Node</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Graph Node</em>'.
     * @see de.hub.clickwatch.analysis.results.GraphNode
     * @generated
     */
    EClass getGraphNode();

    /**
     * Returns the meta object for the reference list '{@link de.hub.clickwatch.analysis.results.GraphNode#getOutgoing <em>Outgoing</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Outgoing</em>'.
     * @see de.hub.clickwatch.analysis.results.GraphNode#getOutgoing()
     * @see #getGraphNode()
     * @generated
     */
    EReference getGraphNode_Outgoing();

    /**
     * Returns the meta object for the reference list '{@link de.hub.clickwatch.analysis.results.GraphNode#getIncoming <em>Incoming</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Incoming</em>'.
     * @see de.hub.clickwatch.analysis.results.GraphNode#getIncoming()
     * @see #getGraphNode()
     * @generated
     */
    EReference getGraphNode_Incoming();

    /**
     * Returns the meta object for class '{@link de.hub.clickwatch.analysis.results.GraphLink <em>Graph Link</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Graph Link</em>'.
     * @see de.hub.clickwatch.analysis.results.GraphLink
     * @generated
     */
    EClass getGraphLink();

    /**
     * Returns the meta object for the reference '{@link de.hub.clickwatch.analysis.results.GraphLink#getSource <em>Source</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Source</em>'.
     * @see de.hub.clickwatch.analysis.results.GraphLink#getSource()
     * @see #getGraphLink()
     * @generated
     */
    EReference getGraphLink_Source();

    /**
     * Returns the meta object for the reference '{@link de.hub.clickwatch.analysis.results.GraphLink#getTarget <em>Target</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Target</em>'.
     * @see de.hub.clickwatch.analysis.results.GraphLink#getTarget()
     * @see #getGraphLink()
     * @generated
     */
    EReference getGraphLink_Target();

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
         * The meta object literal for the '<em>Data Set</em>' data type.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.hub.clickwatch.analysis.results.DataSet
         * @see de.hub.clickwatch.analysis.results.impl.ResultsPackageImpl#getDataSet()
         * @generated
         */
		EDataType DATA_SET = eINSTANCE.getDataSet();

		/**
         * The meta object literal for the '<em>Data Entry</em>' data type.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.hub.clickwatch.analysis.results.DataEntry
         * @see de.hub.clickwatch.analysis.results.impl.ResultsPackageImpl#getDataEntry()
         * @generated
         */
		EDataType DATA_ENTRY = eINSTANCE.getDataEntry();

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
         * The meta object literal for the '<em><b>Constraint</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference VALUE_SPEC__CONSTRAINT = eINSTANCE.getValueSpec_Constraint();

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
         * The meta object literal for the '<em><b>To</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute AXIS__TO = eINSTANCE.getAxis_To();

		/**
         * The meta object literal for the '<em><b>From</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute AXIS__FROM = eINSTANCE.getAxis_From();

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
         * The meta object literal for the '<em><b>Groups</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference RESULTS__GROUPS = eINSTANCE.getResults_Groups();

		/**
         * The meta object literal for the '{@link de.hub.clickwatch.analysis.results.impl.EqualsConstraintImpl <em>Equals Constraint</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.hub.clickwatch.analysis.results.impl.EqualsConstraintImpl
         * @see de.hub.clickwatch.analysis.results.impl.ResultsPackageImpl#getEqualsConstraint()
         * @generated
         */
		EClass EQUALS_CONSTRAINT = eINSTANCE.getEqualsConstraint();

		/**
         * The meta object literal for the '<em><b>Constraint</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute EQUALS_CONSTRAINT__CONSTRAINT = eINSTANCE.getEqualsConstraint_Constraint();

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
         * The meta object literal for the '{@link de.hub.clickwatch.analysis.results.impl.OrImpl <em>Or</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.hub.clickwatch.analysis.results.impl.OrImpl
         * @see de.hub.clickwatch.analysis.results.impl.ResultsPackageImpl#getOr()
         * @generated
         */
		EClass OR = eINSTANCE.getOr();

		/**
         * The meta object literal for the '<em><b>Ops</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference OR__OPS = eINSTANCE.getOr_Ops();

        /**
         * The meta object literal for the '{@link de.hub.clickwatch.analysis.results.impl.NumericalResultImpl <em>Numerical Result</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.hub.clickwatch.analysis.results.impl.NumericalResultImpl
         * @see de.hub.clickwatch.analysis.results.impl.ResultsPackageImpl#getNumericalResult()
         * @generated
         */
        EClass NUMERICAL_RESULT = eINSTANCE.getNumericalResult();

        /**
         * The meta object literal for the '<em><b>Charts</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference NUMERICAL_RESULT__CHARTS = eINSTANCE.getNumericalResult_Charts();

        /**
         * The meta object literal for the '<em><b>Data</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NUMERICAL_RESULT__DATA = eINSTANCE.getNumericalResult_Data();

        /**
         * The meta object literal for the '{@link de.hub.clickwatch.analysis.results.impl.GraphResultImpl <em>Graph Result</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.hub.clickwatch.analysis.results.impl.GraphResultImpl
         * @see de.hub.clickwatch.analysis.results.impl.ResultsPackageImpl#getGraphResult()
         * @generated
         */
        EClass GRAPH_RESULT = eINSTANCE.getGraphResult();

        /**
         * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference GRAPH_RESULT__NODES = eINSTANCE.getGraphResult_Nodes();

        /**
         * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference GRAPH_RESULT__LINKS = eINSTANCE.getGraphResult_Links();

        /**
         * The meta object literal for the '{@link de.hub.clickwatch.analysis.results.impl.GraphNodeImpl <em>Graph Node</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.hub.clickwatch.analysis.results.impl.GraphNodeImpl
         * @see de.hub.clickwatch.analysis.results.impl.ResultsPackageImpl#getGraphNode()
         * @generated
         */
        EClass GRAPH_NODE = eINSTANCE.getGraphNode();

        /**
         * The meta object literal for the '<em><b>Outgoing</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference GRAPH_NODE__OUTGOING = eINSTANCE.getGraphNode_Outgoing();

        /**
         * The meta object literal for the '<em><b>Incoming</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference GRAPH_NODE__INCOMING = eINSTANCE.getGraphNode_Incoming();

        /**
         * The meta object literal for the '{@link de.hub.clickwatch.analysis.results.impl.GraphLinkImpl <em>Graph Link</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.hub.clickwatch.analysis.results.impl.GraphLinkImpl
         * @see de.hub.clickwatch.analysis.results.impl.ResultsPackageImpl#getGraphLink()
         * @generated
         */
        EClass GRAPH_LINK = eINSTANCE.getGraphLink();

        /**
         * The meta object literal for the '<em><b>Source</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference GRAPH_LINK__SOURCE = eINSTANCE.getGraphLink_Source();

        /**
         * The meta object literal for the '<em><b>Target</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference GRAPH_LINK__TARGET = eINSTANCE.getGraphLink_Target();

	}

} //ResultsPackage
