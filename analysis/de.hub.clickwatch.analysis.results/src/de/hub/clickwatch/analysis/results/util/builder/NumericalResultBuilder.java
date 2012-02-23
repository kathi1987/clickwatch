package de.hub.clickwatch.analysis.results.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>de.hub.clickwatch.analysis.results.NumericalResult</b></em>'.
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
  private java.util.Collection<de.hub.clickwatch.analysis.traceable.Traceable> m_tracesFrom = new java.util.LinkedList<de.hub.clickwatch.analysis.traceable.Traceable>();
  private java.util.Collection<de.hub.clickwatch.analysis.traceable.util.builder.ITraceableBuilder<? extends de.hub.clickwatch.analysis.traceable.Traceable>> m_featureTracesFromBuilder = new java.util.LinkedList<de.hub.clickwatch.analysis.traceable.util.builder.ITraceableBuilder<? extends de.hub.clickwatch.analysis.traceable.Traceable>>();
  private java.util.Collection<de.hub.clickwatch.analysis.traceable.Traceable> m_tracesTo = new java.util.LinkedList<de.hub.clickwatch.analysis.traceable.Traceable>();
  private java.util.Collection<de.hub.clickwatch.analysis.traceable.util.builder.ITraceableBuilder<? extends de.hub.clickwatch.analysis.traceable.Traceable>> m_featureTracesToBuilder = new java.util.LinkedList<de.hub.clickwatch.analysis.traceable.util.builder.ITraceableBuilder<? extends de.hub.clickwatch.analysis.traceable.Traceable>>();
  // helper attributes
  private boolean m_featureChartsSet = false;
  private boolean m_featureDataSet = false;
  private boolean m_featureDataResultSetSet = false;
  private boolean m_featureNameSet = false;
  private boolean m_featureTimestampSet = false;
  private boolean m_featureTracesFromSet = false;
  private boolean m_featureTracesToSet = false;

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
    _builder.m_featureTracesFromSet = m_featureTracesFromSet;
    _builder.m_tracesFrom = m_tracesFrom;
    _builder.m_featureTracesFromBuilder = m_featureTracesFromBuilder;
    _builder.m_featureTracesToSet = m_featureTracesToSet;
    _builder.m_tracesTo = m_tracesTo;
    _builder.m_featureTracesToBuilder = m_featureTracesToBuilder;
    return _builder;
  }

  /**
   * This method constructs the final de.hub.clickwatch.analysis.results.NumericalResult type.
   * @return new instance of the de.hub.clickwatch.analysis.results.NumericalResult type
   */
  public de.hub.clickwatch.analysis.results.NumericalResult build() {
    final de.hub.clickwatch.analysis.results.NumericalResult _newInstance = de.hub.clickwatch.analysis.results.ResultsFactory.eINSTANCE.createNumericalResult();
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
    if (m_featureTracesFromSet) {
      _newInstance.getTracesFrom().addAll(m_tracesFrom);
    } else {
      if (!m_featureTracesFromBuilder.isEmpty()) {
        for (de.hub.clickwatch.analysis.traceable.util.builder.ITraceableBuilder<? extends de.hub.clickwatch.analysis.traceable.Traceable> builder : m_featureTracesFromBuilder) {
          _newInstance.getTracesFrom().add(builder.build());
        }
      }
    }
    if (m_featureTracesToSet) {
      _newInstance.getTracesTo().addAll(m_tracesTo);
    } else {
      if (!m_featureTracesToBuilder.isEmpty()) {
        for (de.hub.clickwatch.analysis.traceable.util.builder.ITraceableBuilder<? extends de.hub.clickwatch.analysis.traceable.Traceable> builder : m_featureTracesToBuilder) {
          _newInstance.getTracesTo().add(builder.build());
        }
      }
    }
    return _newInstance;
  }

  public NumericalResultBuilder withData(de.hub.clickwatch.analysis.results.DataSet p_data) {
    m_data = p_data;
    m_featureDataSet = true;
    return this;
  }

  public NumericalResultBuilder withDataResultSet(de.hub.clickwatch.analysis.results.DataResultSet p_dataResultSet) {
    m_dataResultSet = p_dataResultSet;
    m_featureDataResultSetSet = true;
    return this;
  }

  public NumericalResultBuilder withDataResultSet(de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<? extends de.hub.clickwatch.analysis.results.DataResultSet> p_dataResultSetBuilder) {
    m_featureDataResultSetBuilder = p_dataResultSetBuilder;
    return this;
  }

  public NumericalResultBuilder withName(java.lang.String p_name) {
    m_name = p_name;
    m_featureNameSet = true;
    return this;
  }

  public NumericalResultBuilder withTimestamp(java.util.Date p_timestamp) {
    m_timestamp = p_timestamp;
    m_featureTimestampSet = true;
    return this;
  }

  public NumericalResultBuilder withCharts(de.hub.clickwatch.analysis.results.Chart p_charts) {
    m_charts.add(p_charts);
    m_featureChartsSet = true;
    return this;
  }

  public NumericalResultBuilder withCharts(java.util.Collection<? extends de.hub.clickwatch.analysis.results.Chart> p_charts) {
    m_charts.addAll(p_charts);
    m_featureChartsSet = true;
    return this;
  }

  public NumericalResultBuilder withCharts(de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<? extends de.hub.clickwatch.analysis.results.Chart> p_chartBuilder) {
    m_featureChartsBuilder.add(p_chartBuilder);
    return this;
  }

  public NumericalResultBuilder withTracesFrom(de.hub.clickwatch.analysis.traceable.Traceable p_tracesFrom) {
    m_tracesFrom.add(p_tracesFrom);
    m_featureTracesFromSet = true;
    return this;
  }

  public NumericalResultBuilder withTracesFrom(java.util.Collection<? extends de.hub.clickwatch.analysis.traceable.Traceable> p_tracesFrom) {
    m_tracesFrom.addAll(p_tracesFrom);
    m_featureTracesFromSet = true;
    return this;
  }

  public NumericalResultBuilder withTracesFrom(de.hub.clickwatch.analysis.traceable.util.builder.ITraceableBuilder<? extends de.hub.clickwatch.analysis.traceable.Traceable> p_traceableBuilder) {
    m_featureTracesFromBuilder.add(p_traceableBuilder);
    return this;
  }

  public NumericalResultBuilder withTracesTo(de.hub.clickwatch.analysis.traceable.Traceable p_tracesTo) {
    m_tracesTo.add(p_tracesTo);
    m_featureTracesToSet = true;
    return this;
  }

  public NumericalResultBuilder withTracesTo(java.util.Collection<? extends de.hub.clickwatch.analysis.traceable.Traceable> p_tracesTo) {
    m_tracesTo.addAll(p_tracesTo);
    m_featureTracesToSet = true;
    return this;
  }

  public NumericalResultBuilder withTracesTo(de.hub.clickwatch.analysis.traceable.util.builder.ITraceableBuilder<? extends de.hub.clickwatch.analysis.traceable.Traceable> p_traceableBuilder) {
    m_featureTracesToBuilder.add(p_traceableBuilder);
    return this;
  }
}
