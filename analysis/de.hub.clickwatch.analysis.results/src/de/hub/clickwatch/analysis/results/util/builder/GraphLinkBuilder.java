package de.hub.clickwatch.analysis.results.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>de.hub.clickwatch.analysis.results.GraphLink</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class GraphLinkBuilder implements de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<de.hub.clickwatch.analysis.results.GraphLink> {
  // features and builders
  private java.lang.String m_name;
  private de.hub.clickwatch.analysis.results.GraphNode m_source;
  private de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<? extends de.hub.clickwatch.analysis.results.GraphNode> m_featureSourceBuilder;
  private de.hub.clickwatch.analysis.results.GraphNode m_target;
  private de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<? extends de.hub.clickwatch.analysis.results.GraphNode> m_featureTargetBuilder;
  private java.util.Collection<de.hub.clickwatch.analysis.traceable.Traceable> m_tracesFrom = new java.util.LinkedList<de.hub.clickwatch.analysis.traceable.Traceable>();
  private java.util.Collection<de.hub.clickwatch.analysis.traceable.util.builder.ITraceableBuilder<? extends de.hub.clickwatch.analysis.traceable.Traceable>> m_featureTracesFromBuilder = new java.util.LinkedList<de.hub.clickwatch.analysis.traceable.util.builder.ITraceableBuilder<? extends de.hub.clickwatch.analysis.traceable.Traceable>>();
  private java.util.Collection<de.hub.clickwatch.analysis.traceable.Traceable> m_tracesTo = new java.util.LinkedList<de.hub.clickwatch.analysis.traceable.Traceable>();
  private java.util.Collection<de.hub.clickwatch.analysis.traceable.util.builder.ITraceableBuilder<? extends de.hub.clickwatch.analysis.traceable.Traceable>> m_featureTracesToBuilder = new java.util.LinkedList<de.hub.clickwatch.analysis.traceable.util.builder.ITraceableBuilder<? extends de.hub.clickwatch.analysis.traceable.Traceable>>();
  // helper attributes
  private boolean m_featureNameSet = false;
  private boolean m_featureSourceSet = false;
  private boolean m_featureTargetSet = false;
  private boolean m_featureTracesFromSet = false;
  private boolean m_featureTracesToSet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newGraphLinkBuilder()
   */
  private GraphLinkBuilder() {
  }

  /**
   * This method creates a new instance of the GraphLinkBuilder.
   * @return new instance of the GraphLinkBuilder
   */
  public static GraphLinkBuilder newGraphLinkBuilder() {
    return new GraphLinkBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public GraphLinkBuilder but() {
    GraphLinkBuilder _builder = newGraphLinkBuilder();
    _builder.m_featureNameSet = m_featureNameSet;
    _builder.m_name = m_name;
    _builder.m_featureSourceSet = m_featureSourceSet;
    _builder.m_source = m_source;
    _builder.m_featureSourceBuilder = m_featureSourceBuilder;
    _builder.m_featureTargetSet = m_featureTargetSet;
    _builder.m_target = m_target;
    _builder.m_featureTargetBuilder = m_featureTargetBuilder;
    _builder.m_featureTracesFromSet = m_featureTracesFromSet;
    _builder.m_tracesFrom = m_tracesFrom;
    _builder.m_featureTracesFromBuilder = m_featureTracesFromBuilder;
    _builder.m_featureTracesToSet = m_featureTracesToSet;
    _builder.m_tracesTo = m_tracesTo;
    _builder.m_featureTracesToBuilder = m_featureTracesToBuilder;
    return _builder;
  }

  /**
   * This method constructs the final de.hub.clickwatch.analysis.results.GraphLink type.
   * @return new instance of the de.hub.clickwatch.analysis.results.GraphLink type
   */
  public de.hub.clickwatch.analysis.results.GraphLink build() {
    final de.hub.clickwatch.analysis.results.GraphLink _newInstance = de.hub.clickwatch.analysis.results.ResultsFactory.eINSTANCE.createGraphLink();
    if (m_featureNameSet) {
      _newInstance.setName(m_name);
    }
    if (m_featureSourceSet) {
      _newInstance.setSource(m_source);
    } else {
      if (m_featureSourceBuilder != null) {
        _newInstance.setSource(m_featureSourceBuilder.build());
      }
    }
    if (m_featureTargetSet) {
      _newInstance.setTarget(m_target);
    } else {
      if (m_featureTargetBuilder != null) {
        _newInstance.setTarget(m_featureTargetBuilder.build());
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

  public GraphLinkBuilder withName(java.lang.String p_name) {
    m_name = p_name;
    m_featureNameSet = true;
    return this;
  }

  public GraphLinkBuilder withSource(de.hub.clickwatch.analysis.results.GraphNode p_source) {
    m_source = p_source;
    m_featureSourceSet = true;
    return this;
  }

  public GraphLinkBuilder withSource(de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<? extends de.hub.clickwatch.analysis.results.GraphNode> p_graphNodeBuilder) {
    m_featureSourceBuilder = p_graphNodeBuilder;
    return this;
  }

  public GraphLinkBuilder withTarget(de.hub.clickwatch.analysis.results.GraphNode p_target) {
    m_target = p_target;
    m_featureTargetSet = true;
    return this;
  }

  public GraphLinkBuilder withTarget(de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<? extends de.hub.clickwatch.analysis.results.GraphNode> p_graphNodeBuilder) {
    m_featureTargetBuilder = p_graphNodeBuilder;
    return this;
  }

  public GraphLinkBuilder withTracesFrom(de.hub.clickwatch.analysis.traceable.Traceable p_tracesFrom) {
    m_tracesFrom.add(p_tracesFrom);
    m_featureTracesFromSet = true;
    return this;
  }

  public GraphLinkBuilder withTracesFrom(java.util.Collection<? extends de.hub.clickwatch.analysis.traceable.Traceable> p_tracesFrom) {
    m_tracesFrom.addAll(p_tracesFrom);
    m_featureTracesFromSet = true;
    return this;
  }

  public GraphLinkBuilder withTracesFrom(de.hub.clickwatch.analysis.traceable.util.builder.ITraceableBuilder<? extends de.hub.clickwatch.analysis.traceable.Traceable> p_traceableBuilder) {
    m_featureTracesFromBuilder.add(p_traceableBuilder);
    return this;
  }

  public GraphLinkBuilder withTracesTo(de.hub.clickwatch.analysis.traceable.Traceable p_tracesTo) {
    m_tracesTo.add(p_tracesTo);
    m_featureTracesToSet = true;
    return this;
  }

  public GraphLinkBuilder withTracesTo(java.util.Collection<? extends de.hub.clickwatch.analysis.traceable.Traceable> p_tracesTo) {
    m_tracesTo.addAll(p_tracesTo);
    m_featureTracesToSet = true;
    return this;
  }

  public GraphLinkBuilder withTracesTo(de.hub.clickwatch.analysis.traceable.util.builder.ITraceableBuilder<? extends de.hub.clickwatch.analysis.traceable.Traceable> p_traceableBuilder) {
    m_featureTracesToBuilder.add(p_traceableBuilder);
    return this;
  }
}
