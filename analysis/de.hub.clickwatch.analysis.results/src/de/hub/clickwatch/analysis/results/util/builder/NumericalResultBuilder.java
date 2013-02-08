package de.hub.clickwatch.analysis.results.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object '<em><b>de.hub.clickwatch.analysis.results.NumericalResult</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class NumericalResultBuilder implements de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<de.hub.clickwatch.analysis.results.NumericalResult> {
  // features and builders
  private de.hub.clickwatch.analysis.results.DataSet m_data;
  private de.hub.clickwatch.analysis.results.DataResultSet m_dataResultSet;
  private de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<? extends de.hub.clickwatch.analysis.results.DataResultSet> m_featureDataResultSetBuilder;
  private java.lang.String m_name;
  private java.util.Date m_timestamp;
  private java.util.Collection<de.hub.clickwatch.analysis.results.Chart> m_charts = new java.util.LinkedList<de.hub.clickwatch.analysis.results.Chart>();
  private java.util.Collection<de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<? extends de.hub.clickwatch.analysis.results.Chart>> m_featureChartsBuilder = new java.util.LinkedList<de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<? extends de.hub.clickwatch.analysis.results.Chart>>();
  // helper attributes
  private boolean m_featureChartsSet = false;
  private boolean m_featureDataSet = false;
  private boolean m_featureDataResultSetSet = false;
  private boolean m_featureNameSet = false;
  private boolean m_featureTimestampSet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newNumericalResultBuilder()
   */
  private NumericalResultBuilder() {
  }

  /**
   * This method creates a new instance of the NumericalResultBuilder.
   * @return new instance of the NumericalResultBuilder
   */
  public static NumericalResultBuilder newNumericalResultBuilder() {
    return new NumericalResultBuilder();
  }

  /**
   * This method creates a new instance of the NumericalResultBuilder. 
   * The builder is initialized using an existing '<em><b>de.hub.clickwatch.analysis.results.NumericalResult</b></em>' model object.
   * In order to avoid changes to the provided '<em><b>de.hub.clickwatch.analysis.results.NumericalResult</b></em>' model object, a copy is created using <em><b>org.eclipse.emf.ecore.util.EcoreUtil.Copier</b></em>.
   * @param numericalResult The existing '<em><b>de.hub.clickwatch.analysis.results.NumericalResult</b></em>' model object to be used for the initialization of the builder  
   * @return new initialized instance of the NumericalResultBuilder
   */
  public static NumericalResultBuilder newNumericalResultBuilder(de.hub.clickwatch.analysis.results.NumericalResult p_numericalResult) {
    org.eclipse.emf.ecore.util.EcoreUtil.Copier c = new org.eclipse.emf.ecore.util.EcoreUtil.Copier();
    de.hub.clickwatch.analysis.results.NumericalResult _numericalResult = (de.hub.clickwatch.analysis.results.NumericalResult) c
        .copy(((de.hub.clickwatch.analysis.results.NumericalResult) p_numericalResult));
    c.copyReferences();
    NumericalResultBuilder _builder = newNumericalResultBuilder();
    _builder.data(_numericalResult.getData());
    _builder.dataResultSet(_numericalResult.getDataResultSet());
    _builder.name(_numericalResult.getName());
    _builder.timestamp(_numericalResult.getTimestamp());
    if (_numericalResult.getCharts() != null) {
      _builder.charts(_numericalResult.getCharts());
    }
    return _builder;
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public NumericalResultBuilder but() {
    NumericalResultBuilder _builder = newNumericalResultBuilder();
    _builder.m_featureChartsSet = m_featureChartsSet;
    _builder.m_charts = m_charts;
    _builder.m_featureChartsBuilder = m_featureChartsBuilder;
    _builder.m_featureDataSet = m_featureDataSet;
    _builder.m_data = m_data;
    _builder.m_featureDataResultSetSet = m_featureDataResultSetSet;
    _builder.m_dataResultSet = m_dataResultSet;
    _builder.m_featureDataResultSetBuilder = m_featureDataResultSetBuilder;
    _builder.m_featureNameSet = m_featureNameSet;
    _builder.m_name = m_name;
    _builder.m_featureTimestampSet = m_featureTimestampSet;
    _builder.m_timestamp = m_timestamp;
    return _builder;
  }

  /**
   * This method constructs the final de.hub.clickwatch.analysis.results.NumericalResult type.
   * @return new instance of the de.hub.clickwatch.analysis.results.NumericalResult type
   */
  public de.hub.clickwatch.analysis.results.NumericalResult build() {
    final de.hub.clickwatch.analysis.results.NumericalResult _newInstance = (de.hub.clickwatch.analysis.results.NumericalResult) de.hub.clickwatch.analysis.results.ResultsFactory.eINSTANCE
        .create(de.hub.clickwatch.analysis.results.ResultsPackage.eINSTANCE.getNumericalResult());
    if (m_featureDataSet) {
      _newInstance.setData(m_data);
    }
    if (m_featureDataResultSetSet) {
      _newInstance.setDataResultSet(m_dataResultSet);
    } else {
      if (m_featureDataResultSetBuilder != null) {
        _newInstance.setDataResultSet(m_featureDataResultSetBuilder.build());
      }
    }
    if (m_featureNameSet) {
      _newInstance.setName(m_name);
    }
    if (m_featureTimestampSet) {
      _newInstance.setTimestamp(m_timestamp);
    }
    if (m_featureChartsSet) {
      _newInstance.getCharts().addAll(m_charts);
    } else {
      if (!m_featureChartsBuilder.isEmpty()) {
        for (de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<? extends de.hub.clickwatch.analysis.results.Chart> builder : m_featureChartsBuilder) {
          _newInstance.getCharts().add(builder.build());
        }
      }
    }
    return _newInstance;
  }

  public NumericalResultBuilder data(de.hub.clickwatch.analysis.results.DataSet p_data) {
    m_data = p_data;
    m_featureDataSet = true;
    return this;
  }

  public NumericalResultBuilder dataResultSet(de.hub.clickwatch.analysis.results.DataResultSet p_dataResultSet) {
    m_dataResultSet = p_dataResultSet;
    m_featureDataResultSetSet = true;
    return this;
  }

  public NumericalResultBuilder dataResultSet(de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<? extends de.hub.clickwatch.analysis.results.DataResultSet> p_dataResultSetBuilder) {
    m_featureDataResultSetBuilder = p_dataResultSetBuilder;
    return this;
  }

  public NumericalResultBuilder name(java.lang.String p_name) {
    m_name = p_name;
    m_featureNameSet = true;
    return this;
  }

  public NumericalResultBuilder timestamp(java.util.Date p_timestamp) {
    m_timestamp = p_timestamp;
    m_featureTimestampSet = true;
    return this;
  }

  public NumericalResultBuilder charts(de.hub.clickwatch.analysis.results.Chart p_charts) {
    m_charts.add(p_charts);
    m_featureChartsSet = true;
    return this;
  }

  public NumericalResultBuilder charts(java.util.Collection<? extends de.hub.clickwatch.analysis.results.Chart> p_charts) {
    m_charts.addAll(p_charts);
    m_featureChartsSet = true;
    return this;
  }

  public NumericalResultBuilder charts(de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<? extends de.hub.clickwatch.analysis.results.Chart> p_chartBuilder) {
    m_featureChartsBuilder.add(p_chartBuilder);
    return this;
  }
}
