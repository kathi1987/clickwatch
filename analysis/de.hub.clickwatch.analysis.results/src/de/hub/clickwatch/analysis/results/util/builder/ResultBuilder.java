package de.hub.clickwatch.analysis.results.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>de.hub.clickwatch.analysis.results.Result</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class ResultBuilder implements de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<de.hub.clickwatch.analysis.results.Result> {
  // features and builders
  private de.hub.clickwatch.analysis.results.DataSet m_dataSet;
  private de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<? extends de.hub.clickwatch.analysis.results.DataSet> m_featureDataSetBuilder;
  private java.lang.String m_name;
  private java.util.Date m_timestamp;
  private java.util.Collection<de.hub.clickwatch.analysis.results.Chart> m_charts = new java.util.LinkedList<de.hub.clickwatch.analysis.results.Chart>();
  private java.util.Collection<de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<? extends de.hub.clickwatch.analysis.results.Chart>> m_featureChartsBuilder = new java.util.LinkedList<de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<? extends de.hub.clickwatch.analysis.results.Chart>>();
  // helper attributes
  private boolean m_featureChartsSet = false;
  private boolean m_featureDataSetSet = false;
  private boolean m_featureNameSet = false;
  private boolean m_featureTimestampSet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newResultBuilder()
   */
  private ResultBuilder() {
  }

  /**
   * This method creates a new instance of the ResultBuilder.
   * @return new instance of the ResultBuilder
   */
  public static ResultBuilder newResultBuilder() {
    return new ResultBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public ResultBuilder but() {
    ResultBuilder _builder = newResultBuilder();
    _builder.m_featureChartsSet = m_featureChartsSet;
    _builder.m_charts = m_charts;
    _builder.m_featureChartsBuilder = m_featureChartsBuilder;
    _builder.m_featureDataSetSet = m_featureDataSetSet;
    _builder.m_dataSet = m_dataSet;
    _builder.m_featureDataSetBuilder = m_featureDataSetBuilder;
    _builder.m_featureNameSet = m_featureNameSet;
    _builder.m_name = m_name;
    _builder.m_featureTimestampSet = m_featureTimestampSet;
    _builder.m_timestamp = m_timestamp;
    return _builder;
  }

  /**
   * This method constructs the final de.hub.clickwatch.analysis.results.Result type.
   * @return new instance of the de.hub.clickwatch.analysis.results.Result type
   */
  public de.hub.clickwatch.analysis.results.Result build() {
    final de.hub.clickwatch.analysis.results.Result _newInstance = de.hub.clickwatch.analysis.results.ResultsFactory.eINSTANCE.createResult();
    if (m_featureDataSetSet) {
      _newInstance.setDataSet(m_dataSet);
    } else {
      if (m_featureDataSetBuilder != null) {
        _newInstance.setDataSet(m_featureDataSetBuilder.build());
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

  public ResultBuilder withDataSet(de.hub.clickwatch.analysis.results.DataSet p_dataSet) {
    m_dataSet = p_dataSet;
    m_featureDataSetSet = true;
    return this;
  }

  public ResultBuilder withDataSet(de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<? extends de.hub.clickwatch.analysis.results.DataSet> p_dataSetBuilder) {
    m_featureDataSetBuilder = p_dataSetBuilder;
    return this;
  }

  public ResultBuilder withName(java.lang.String p_name) {
    m_name = p_name;
    m_featureNameSet = true;
    return this;
  }

  public ResultBuilder withTimestamp(java.util.Date p_timestamp) {
    m_timestamp = p_timestamp;
    m_featureTimestampSet = true;
    return this;
  }

  public ResultBuilder withCharts(de.hub.clickwatch.analysis.results.Chart p_charts) {
    m_charts.add(p_charts);
    m_featureChartsSet = true;
    return this;
  }

  public ResultBuilder withCharts(java.util.Collection<? extends de.hub.clickwatch.analysis.results.Chart> p_charts) {
    m_charts.addAll(p_charts);
    m_featureChartsSet = true;
    return this;
  }

  public ResultBuilder withCharts(de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<? extends de.hub.clickwatch.analysis.results.Chart> p_chartBuilder) {
    m_featureChartsBuilder.add(p_chartBuilder);
    return this;
  }
}
