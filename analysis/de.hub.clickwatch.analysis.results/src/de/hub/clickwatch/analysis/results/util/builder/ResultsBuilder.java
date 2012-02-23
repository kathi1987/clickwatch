package de.hub.clickwatch.analysis.results.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>de.hub.clickwatch.analysis.results.Results</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class ResultsBuilder implements de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<de.hub.clickwatch.analysis.results.Results> {
  // features and builders
  private java.lang.String m_name;
  private de.hub.clickwatch.analysis.results.ChartType m_type;
  private de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<? extends de.hub.clickwatch.analysis.results.ChartType> m_featureTypeBuilder;
  private java.util.Collection<de.hub.clickwatch.analysis.results.Results> m_groups = new java.util.LinkedList<de.hub.clickwatch.analysis.results.Results>();
  private java.util.Collection<de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<? extends de.hub.clickwatch.analysis.results.Results>> m_featureGroupsBuilder = new java.util.LinkedList<de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<? extends de.hub.clickwatch.analysis.results.Results>>();
  private java.util.Collection<de.hub.clickwatch.analysis.results.Result> m_results = new java.util.LinkedList<de.hub.clickwatch.analysis.results.Result>();
  private java.util.Collection<de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<? extends de.hub.clickwatch.analysis.results.Result>> m_featureResultsBuilder = new java.util.LinkedList<de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<? extends de.hub.clickwatch.analysis.results.Result>>();
  private java.util.Collection<de.hub.clickwatch.analysis.traceable.Traceable> m_tracesFrom = new java.util.LinkedList<de.hub.clickwatch.analysis.traceable.Traceable>();
  private java.util.Collection<de.hub.clickwatch.analysis.traceable.util.builder.ITraceableBuilder<? extends de.hub.clickwatch.analysis.traceable.Traceable>> m_featureTracesFromBuilder = new java.util.LinkedList<de.hub.clickwatch.analysis.traceable.util.builder.ITraceableBuilder<? extends de.hub.clickwatch.analysis.traceable.Traceable>>();
  private java.util.Collection<de.hub.clickwatch.analysis.traceable.Traceable> m_tracesTo = new java.util.LinkedList<de.hub.clickwatch.analysis.traceable.Traceable>();
  private java.util.Collection<de.hub.clickwatch.analysis.traceable.util.builder.ITraceableBuilder<? extends de.hub.clickwatch.analysis.traceable.Traceable>> m_featureTracesToBuilder = new java.util.LinkedList<de.hub.clickwatch.analysis.traceable.util.builder.ITraceableBuilder<? extends de.hub.clickwatch.analysis.traceable.Traceable>>();
  private java.util.Collection<de.hub.clickwatch.analysis.results.ValueSpec> m_valueSpecs = new java.util.LinkedList<de.hub.clickwatch.analysis.results.ValueSpec>();
  private java.util.Collection<de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<? extends de.hub.clickwatch.analysis.results.ValueSpec>> m_featureValueSpecsBuilder = new java.util.LinkedList<de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<? extends de.hub.clickwatch.analysis.results.ValueSpec>>();
  // helper attributes
  private boolean m_featureGroupsSet = false;
  private boolean m_featureNameSet = false;
  private boolean m_featureResultsSet = false;
  private boolean m_featureTracesFromSet = false;
  private boolean m_featureTracesToSet = false;
  private boolean m_featureTypeSet = false;
  private boolean m_featureValueSpecsSet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newResultsBuilder()
   */
  private ResultsBuilder() {
  }

  /**
   * This method creates a new instance of the ResultsBuilder.
   * @return new instance of the ResultsBuilder
   */
  public static ResultsBuilder newResultsBuilder() {
    return new ResultsBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public ResultsBuilder but() {
    ResultsBuilder _builder = newResultsBuilder();
    _builder.m_featureGroupsSet = m_featureGroupsSet;
    _builder.m_groups = m_groups;
    _builder.m_featureGroupsBuilder = m_featureGroupsBuilder;
    _builder.m_featureNameSet = m_featureNameSet;
    _builder.m_name = m_name;
    _builder.m_featureResultsSet = m_featureResultsSet;
    _builder.m_results = m_results;
    _builder.m_featureResultsBuilder = m_featureResultsBuilder;
    _builder.m_featureTracesFromSet = m_featureTracesFromSet;
    _builder.m_tracesFrom = m_tracesFrom;
    _builder.m_featureTracesFromBuilder = m_featureTracesFromBuilder;
    _builder.m_featureTracesToSet = m_featureTracesToSet;
    _builder.m_tracesTo = m_tracesTo;
    _builder.m_featureTracesToBuilder = m_featureTracesToBuilder;
    _builder.m_featureTypeSet = m_featureTypeSet;
    _builder.m_type = m_type;
    _builder.m_featureTypeBuilder = m_featureTypeBuilder;
    _builder.m_featureValueSpecsSet = m_featureValueSpecsSet;
    _builder.m_valueSpecs = m_valueSpecs;
    _builder.m_featureValueSpecsBuilder = m_featureValueSpecsBuilder;
    return _builder;
  }

  /**
   * This method constructs the final de.hub.clickwatch.analysis.results.Results type.
   * @return new instance of the de.hub.clickwatch.analysis.results.Results type
   */
  public de.hub.clickwatch.analysis.results.Results build() {
    final de.hub.clickwatch.analysis.results.Results _newInstance = de.hub.clickwatch.analysis.results.ResultsFactory.eINSTANCE.createResults();
    if (m_featureNameSet) {
      _newInstance.setName(m_name);
    }
    if (m_featureTypeSet) {
      _newInstance.setType(m_type);
    } else {
      if (m_featureTypeBuilder != null) {
        _newInstance.setType(m_featureTypeBuilder.build());
      }
    }
    if (m_featureGroupsSet) {
      _newInstance.getGroups().addAll(m_groups);
    } else {
      if (!m_featureGroupsBuilder.isEmpty()) {
        for (de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<? extends de.hub.clickwatch.analysis.results.Results> builder : m_featureGroupsBuilder) {
          _newInstance.getGroups().add(builder.build());
        }
      }
    }
    if (m_featureResultsSet) {
      _newInstance.getResults().addAll(m_results);
    } else {
      if (!m_featureResultsBuilder.isEmpty()) {
        for (de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<? extends de.hub.clickwatch.analysis.results.Result> builder : m_featureResultsBuilder) {
          _newInstance.getResults().add(builder.build());
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
    if (m_featureValueSpecsSet) {
      _newInstance.getValueSpecs().addAll(m_valueSpecs);
    } else {
      if (!m_featureValueSpecsBuilder.isEmpty()) {
        for (de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<? extends de.hub.clickwatch.analysis.results.ValueSpec> builder : m_featureValueSpecsBuilder) {
          _newInstance.getValueSpecs().add(builder.build());
        }
      }
    }
    return _newInstance;
  }

  public ResultsBuilder withName(java.lang.String p_name) {
    m_name = p_name;
    m_featureNameSet = true;
    return this;
  }

  public ResultsBuilder withType(de.hub.clickwatch.analysis.results.ChartType p_type) {
    m_type = p_type;
    m_featureTypeSet = true;
    return this;
  }

  public ResultsBuilder withType(de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<? extends de.hub.clickwatch.analysis.results.ChartType> p_chartTypeBuilder) {
    m_featureTypeBuilder = p_chartTypeBuilder;
    return this;
  }

  public ResultsBuilder withGroups(de.hub.clickwatch.analysis.results.Results p_groups) {
    m_groups.add(p_groups);
    m_featureGroupsSet = true;
    return this;
  }

  public ResultsBuilder withGroups(java.util.Collection<? extends de.hub.clickwatch.analysis.results.Results> p_groups) {
    m_groups.addAll(p_groups);
    m_featureGroupsSet = true;
    return this;
  }

  public ResultsBuilder withGroups(de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<? extends de.hub.clickwatch.analysis.results.Results> p_resultsBuilder) {
    m_featureGroupsBuilder.add(p_resultsBuilder);
    return this;
  }

  public ResultsBuilder withResults(de.hub.clickwatch.analysis.results.Result p_results) {
    m_results.add(p_results);
    m_featureResultsSet = true;
    return this;
  }

  public ResultsBuilder withResults(java.util.Collection<? extends de.hub.clickwatch.analysis.results.Result> p_results) {
    m_results.addAll(p_results);
    m_featureResultsSet = true;
    return this;
  }

  public ResultsBuilder withResults(de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<? extends de.hub.clickwatch.analysis.results.Result> p_resultBuilder) {
    m_featureResultsBuilder.add(p_resultBuilder);
    return this;
  }

  public ResultsBuilder withTracesFrom(de.hub.clickwatch.analysis.traceable.Traceable p_tracesFrom) {
    m_tracesFrom.add(p_tracesFrom);
    m_featureTracesFromSet = true;
    return this;
  }

  public ResultsBuilder withTracesFrom(java.util.Collection<? extends de.hub.clickwatch.analysis.traceable.Traceable> p_tracesFrom) {
    m_tracesFrom.addAll(p_tracesFrom);
    m_featureTracesFromSet = true;
    return this;
  }

  public ResultsBuilder withTracesFrom(de.hub.clickwatch.analysis.traceable.util.builder.ITraceableBuilder<? extends de.hub.clickwatch.analysis.traceable.Traceable> p_traceableBuilder) {
    m_featureTracesFromBuilder.add(p_traceableBuilder);
    return this;
  }

  public ResultsBuilder withTracesTo(de.hub.clickwatch.analysis.traceable.Traceable p_tracesTo) {
    m_tracesTo.add(p_tracesTo);
    m_featureTracesToSet = true;
    return this;
  }

  public ResultsBuilder withTracesTo(java.util.Collection<? extends de.hub.clickwatch.analysis.traceable.Traceable> p_tracesTo) {
    m_tracesTo.addAll(p_tracesTo);
    m_featureTracesToSet = true;
    return this;
  }

  public ResultsBuilder withTracesTo(de.hub.clickwatch.analysis.traceable.util.builder.ITraceableBuilder<? extends de.hub.clickwatch.analysis.traceable.Traceable> p_traceableBuilder) {
    m_featureTracesToBuilder.add(p_traceableBuilder);
    return this;
  }

  public ResultsBuilder withValueSpecs(de.hub.clickwatch.analysis.results.ValueSpec p_valueSpecs) {
    m_valueSpecs.add(p_valueSpecs);
    m_featureValueSpecsSet = true;
    return this;
  }

  public ResultsBuilder withValueSpecs(java.util.Collection<? extends de.hub.clickwatch.analysis.results.ValueSpec> p_valueSpecs) {
    m_valueSpecs.addAll(p_valueSpecs);
    m_featureValueSpecsSet = true;
    return this;
  }

  public ResultsBuilder withValueSpecs(de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<? extends de.hub.clickwatch.analysis.results.ValueSpec> p_valueSpecBuilder) {
    m_featureValueSpecsBuilder.add(p_valueSpecBuilder);
    return this;
  }
}
