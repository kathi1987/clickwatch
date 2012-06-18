/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.analysis.results.impl;

import de.hub.clickwatch.analysis.results.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.xml.type.internal.DataValue.Base64;

import de.hub.clickwatch.analysis.results.Axis;
import de.hub.clickwatch.analysis.results.Bar;
import de.hub.clickwatch.analysis.results.BoxAndWhiskers;
import de.hub.clickwatch.analysis.results.Category;
import de.hub.clickwatch.analysis.results.Chart;
import de.hub.clickwatch.analysis.results.DataEntry;
import de.hub.clickwatch.analysis.results.DataSet;
import de.hub.clickwatch.analysis.results.EqualsConstraint;
import de.hub.clickwatch.analysis.results.GraphLink;
import de.hub.clickwatch.analysis.results.GraphNode;
import de.hub.clickwatch.analysis.results.GraphResult;
import de.hub.clickwatch.analysis.results.NumericalResult;
import de.hub.clickwatch.analysis.results.Or;
import de.hub.clickwatch.analysis.results.Results;
import de.hub.clickwatch.analysis.results.ResultsFactory;
import de.hub.clickwatch.analysis.results.ResultsPackage;
import de.hub.clickwatch.analysis.results.Series;
import de.hub.clickwatch.analysis.results.XY;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResultsFactoryImpl extends EFactoryImpl implements ResultsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ResultsFactory init() {
		try {
			ResultsFactory theResultsFactory = (ResultsFactory)EPackage.Registry.INSTANCE.getEFactory("http://de.hub.clickwatch.analysis.results"); 
			if (theResultsFactory != null) {
				return theResultsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ResultsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultsFactoryImpl() {
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
			case ResultsPackage.CHART: return createChart();
			case ResultsPackage.AXIS: return createAxis();
			case ResultsPackage.SERIES: return createSeries();
			case ResultsPackage.CATEGORY: return createCategory();
			case ResultsPackage.XY: return createXY();
			case ResultsPackage.BOX_AND_WHISKERS: return createBoxAndWhiskers();
			case ResultsPackage.BAR: return createBar();
			case ResultsPackage.RESULTS: return createResults();
			case ResultsPackage.EQUALS_CONSTRAINT: return createEqualsConstraint();
			case ResultsPackage.OR: return createOr();
			case ResultsPackage.NUMERICAL_RESULT: return createNumericalResult();
			case ResultsPackage.GRAPH_RESULT: return createGraphResult();
			case ResultsPackage.GRAPH_NODE: return createGraphNode();
			case ResultsPackage.GRAPH_LINK: return createGraphLink();
			case ResultsPackage.XY_DATA_RESULT_SET: return createXYDataResultSet();
			case ResultsPackage.DOUBLE_DATA_RESULT_VALUE: return createDoubleDataResultValue();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ResultsPackage.DATA_SET:
				return createDataSetFromString(eDataType, initialValue);
			case ResultsPackage.DATA_ENTRY:
				return createDataEntryFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ResultsPackage.DATA_SET:
				return convertDataSetToString(eDataType, instanceValue);
			case ResultsPackage.DATA_ENTRY:
				return convertDataEntryToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Chart createChart() {
		ChartImpl chart = new ChartImpl();
		return chart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Axis createAxis() {
		AxisImpl axis = new AxisImpl();
		return axis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Series createSeries() {
		SeriesImpl series = new SeriesImpl();
		return series;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category createCategory() {
		CategoryImpl category = new CategoryImpl();
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XY createXY() {
		XYImpl xy = new XYImpl();
		return xy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoxAndWhiskers createBoxAndWhiskers() {
		BoxAndWhiskersImpl boxAndWhiskers = new BoxAndWhiskersImpl();
		return boxAndWhiskers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bar createBar() {
		BarImpl bar = new BarImpl();
		return bar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Results createResults() {
		ResultsImpl results = new ResultsImpl();
		return results;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EqualsConstraint createEqualsConstraint() {
		EqualsConstraintImpl equalsConstraint = new EqualsConstraintImpl();
		return equalsConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Or createOr() {
		OrImpl or = new OrImpl();
		return or;
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NumericalResult createNumericalResult() {
		NumericalResultImpl numericalResult = new NumericalResultImpl();
		return numericalResult;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public GraphResult createGraphResult() {
		GraphResultImpl graphResult = new GraphResultImpl();
		return graphResult;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public GraphNode createGraphNode() {
		GraphNodeImpl graphNode = new GraphNodeImpl();
		return graphNode;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public GraphLink createGraphLink() {
		GraphLinkImpl graphLink = new GraphLinkImpl();
		return graphLink;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XYDataResultSet createXYDataResultSet() {
		XYDataResultSetImpl xyDataResultSet = new XYDataResultSetImpl();
		return xyDataResultSet;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleDataResultValue createDoubleDataResultValue() {
		DoubleDataResultValueImpl doubleDataResultValue = new DoubleDataResultValueImpl();
		return doubleDataResultValue;
	}

				/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public DataSet createDataSetFromString(EDataType eDataType, String initialValue) {
        byte[] decoded = Base64.decode(initialValue);
        DataSet dataSet;
        try {
            dataSet = (DataSet)new ObjectInputStream(new ByteArrayInputStream(decoded)).readObject();
        } catch (Exception e) {
            throw new IllegalArgumentException("is not a serialized DataSet");
        }
        return dataSet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public String convertDataSetToString(EDataType eDataType, Object instanceValue) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            new ObjectOutputStream(baos).writeObject(instanceValue);
        } catch (IOException e) {
            throw new IllegalArgumentException("cannot serialize data set");
        }
        String result = Base64.encode(baos.toByteArray());
        return result;
    }

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public DataEntry createDataEntryFromString(EDataType eDataType, String initialValue) {
		return (DataEntry)super.createFromString(eDataType, initialValue);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String convertDataEntryToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultsPackage getResultsPackage() {
		return (ResultsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ResultsPackage getPackage() {
		return ResultsPackage.eINSTANCE;
	}

} //ResultsFactoryImpl
