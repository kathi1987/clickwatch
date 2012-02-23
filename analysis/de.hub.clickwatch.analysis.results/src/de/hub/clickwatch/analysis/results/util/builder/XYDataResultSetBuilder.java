package de.hub.clickwatch.analysis.results.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>de.hub.clickwatch.analysis.results.XYDataResultSet</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class XYDataResultSetBuilder implements de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<de.hub.clickwatch.analysis.results.XYDataResultSet> {
  // features and builders
  private java.lang.String m_name;
  private java.util.Collection<de.hub.clickwatch.analysis.traceable.Traceable> m_tracesFrom = new java.util.LinkedList<de.hub.clickwatch.analysis.traceable.Traceable>();
  private java.util.Collection<de.hub.clickwatch.analysis.traceable.util.builder.ITraceableBuilder<? extends de.hub.clickwatch.analysis.traceable.Traceable>> m_featureTracesFromBuilder = new java.util.LinkedList<de.hub.clickwatch.analysis.traceable.util.builder.ITraceableBuilder<? extends de.hub.clickwatch.analysis.traceable.Traceable>>();
  private java.util.Collection<de.hub.clickwatch.analysis.traceable.Traceable> m_tracesTo = new java.util.LinkedList<de.hub.clickwatch.analysis.traceable.Traceable>();
  private java.util.Collection<de.hub.clickwatch.analysis.traceable.util.builder.ITraceableBuilder<? extends de.hub.clickwatch.analysis.traceable.Traceable>> m_featureTracesToBuilder = new java.util.LinkedList<de.hub.clickwatch.analysis.traceable.util.builder.ITraceableBuilder<? extends de.hub.clickwatch.analysis.traceable.Traceable>>();
  private java.util.Collection<de.hub.clickwatch.analysis.results.DataResultValue> m_xValues = new java.util.LinkedList<de.hub.clickwatch.analysis.results.DataResultValue>();
  private java.util.Collection<de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<? extends de.hub.clickwatch.analysis.results.DataResultValue>> m_featureXValuesBuilder = new java.util.LinkedList<de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<? extends de.hub.clickwatch.analysis.results.DataResultValue>>();
  private java.util.Collection<de.hub.clickwatch.analysis.results.DataResultValue> m_yValues = new java.util.LinkedList<de.hub.clickwatch.analysis.results.DataResultValue>();
  private java.util.Collection<de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<? extends de.hub.clickwatch.analysis.results.DataResultValue>> m_featureYValuesBuilder = new java.util.LinkedList<de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<? extends de.hub.clickwatch.analysis.results.DataResultValue>>();
  // helper attributes
  private boolean m_featureNameSet = false;
  private boolean m_featureTracesFromSet = false;
  private boolean m_featureTracesToSet = false;
  private boolean m_featureXValuesSet = false;
  private boolean m_featureYValuesSet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newXYDataResultSetBuilder()
   */
  private XYDataResultSetBuilder() {
  }

  /**
   * This method creates a new instance of the XYDataResultSetBuilder.
   * @return new instance of the XYDataResultSetBuilder
   */
  public static XYDataResultSetBuilder newXYDataResultSetBuilder() {
    return new XYDataResultSetBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public XYDataResultSetBuilder but() {
    XYDataResultSetBuilder _builder = newXYDataResultSetBuilder();
    _builder.m_featureNameSet = m_featureNameSet;
    _builder.m_name = m_name;
    _builder.m_featureTracesFromSet = m_featureTracesFromSet;
    _builder.m_tracesFrom = m_tracesFrom;
    _builder.m_featureTracesFromBuilder = m_featureTracesFromBuilder;
    _builder.m_featureTracesToSet = m_featureTracesToSet;
    _builder.m_tracesTo = m_tracesTo;
    _builder.m_featureTracesToBuilder = m_featureTracesToBuilder;
    _builder.m_featureXValuesSet = m_featureXValuesSet;
    _builder.m_xValues = m_xValues;
    _builder.m_featureXValuesBuilder = m_featureXValuesBuilder;
    _builder.m_featureYValuesSet = m_featureYValuesSet;
    _builder.m_yValues = m_yValues;
    _builder.m_featureYValuesBuilder = m_featureYValuesBuilder;
    return _builder;
  }

  /**
   * This method constructs the final de.hub.clickwatch.analysis.results.XYDataResultSet type.
   * @return new instance of the de.hub.clickwatch.analysis.results.XYDataResultSet type
   */
  public de.hub.clickwatch.analysis.results.XYDataResultSet build() {
    final de.hub.clickwatch.analysis.results.XYDataResultSet _newInstance = de.hub.clickwatch.analysis.results.ResultsFactory.eINSTANCE.createXYDataResultSet();
    if (m_featureNameSet) {
      _newInstance.setName(m_name);
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
    if (m_featureXValuesSet) {
      _newInstance.getXValues().addAll(m_xValues);
    } else {
      if (!m_featureXValuesBuilder.isEmpty()) {
        for (de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<? extends de.hub.clickwatch.analysis.results.DataResultValue> builder : m_featureXValuesBuilder) {
          _newInstance.getXValues().add(builder.build());
        }
      }
    }
    if (m_featureYValuesSet) {
      _newInstance.getYValues().addAll(m_yValues);
    } else {
      if (!m_featureYValuesBuilder.isEmpty()) {
        for (de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<? extends de.hub.clickwatch.analysis.results.DataResultValue> builder : m_featureYValuesBuilder) {
          _newInstance.getYValues().add(builder.build());
        }
      }
    }
    return _newInstance;
  }

  public XYDataResultSetBuilder withName(java.lang.String p_name) {
    m_name = p_name;
    m_featureNameSet = true;
    return this;
  }

  public XYDataResultSetBuilder withTracesFrom(de.hub.clickwatch.analysis.traceable.Traceable p_tracesFrom) {
    m_tracesFrom.add(p_tracesFrom);
    m_featureTracesFromSet = true;
    return this;
  }

  public XYDataResultSetBuilder withTracesFrom(java.util.Collection<? extends de.hub.clickwatch.analysis.traceable.Traceable> p_tracesFrom) {
    m_tracesFrom.addAll(p_tracesFrom);
    m_featureTracesFromSet = true;
    return this;
  }

  public XYDataResultSetBuilder withTracesFrom(de.hub.clickwatch.analysis.traceable.util.builder.ITraceableBuilder<? extends de.hub.clickwatch.analysis.traceable.Traceable> p_traceableBuilder) {
    m_featureTracesFromBuilder.add(p_traceableBuilder);
    return this;
  }

  public XYDataResultSetBuilder withTracesTo(de.hub.clickwatch.analysis.traceable.Traceable p_tracesTo) {
    m_tracesTo.add(p_tracesTo);
    m_featureTracesToSet = true;
    return this;
  }

  public XYDataResultSetBuilder withTracesTo(java.util.Collection<? extends de.hub.clickwatch.analysis.traceable.Traceable> p_tracesTo) {
    m_tracesTo.addAll(p_tracesTo);
    m_featureTracesToSet = true;
    return this;
  }

  public XYDataResultSetBuilder withTracesTo(de.hub.clickwatch.analysis.traceable.util.builder.ITraceableBuilder<? extends de.hub.clickwatch.analysis.traceable.Traceable> p_traceableBuilder) {
    m_featureTracesToBuilder.add(p_traceableBuilder);
    return this;
  }

  public XYDataResultSetBuilder withXValues(de.hub.clickwatch.analysis.results.DataResultValue p_xValues) {
    m_xValues.add(p_xValues);
    m_featureXValuesSet = true;
    return this;
  }

  public XYDataResultSetBuilder withXValues(java.util.Collection<? extends de.hub.clickwatch.analysis.results.DataResultValue> p_xValues) {
    m_xValues.addAll(p_xValues);
    m_featureXValuesSet = true;
    return this;
  }

  public XYDataResultSetBuilder withXValues(de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<? extends de.hub.clickwatch.analysis.results.DataResultValue> p_dataResultValueBuilder) {
    m_featureXValuesBuilder.add(p_dataResultValueBuilder);
    return this;
  }

  public XYDataResultSetBuilder withYValues(de.hub.clickwatch.analysis.results.DataResultValue p_yValues) {
    m_yValues.add(p_yValues);
    m_featureYValuesSet = true;
    return this;
  }

  public XYDataResultSetBuilder withYValues(java.util.Collection<? extends de.hub.clickwatch.analysis.results.DataResultValue> p_yValues) {
    m_yValues.addAll(p_yValues);
    m_featureYValuesSet = true;
    return this;
  }

  public XYDataResultSetBuilder withYValues(de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<? extends de.hub.clickwatch.analysis.results.DataResultValue> p_dataResultValueBuilder) {
    m_featureYValuesBuilder.add(p_dataResultValueBuilder);
    return this;
  }
}
