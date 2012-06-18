package de.hub.clickwatch.analysis.results.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>de.hub.clickwatch.analysis.results.GraphResult</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class GraphResultBuilder implements de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<de.hub.clickwatch.analysis.results.GraphResult> {
  // features and builders
  private java.lang.String m_name;
  private java.util.Date m_timestamp;
  private java.util.Collection<de.hub.clickwatch.analysis.results.GraphLink> m_links = new java.util.LinkedList<de.hub.clickwatch.analysis.results.GraphLink>();
  private java.util.Collection<de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<? extends de.hub.clickwatch.analysis.results.GraphLink>> m_featureLinksBuilder = new java.util.LinkedList<de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<? extends de.hub.clickwatch.analysis.results.GraphLink>>();
  private java.util.Collection<de.hub.clickwatch.analysis.results.GraphNode> m_nodes = new java.util.LinkedList<de.hub.clickwatch.analysis.results.GraphNode>();
  private java.util.Collection<de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<? extends de.hub.clickwatch.analysis.results.GraphNode>> m_featureNodesBuilder = new java.util.LinkedList<de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<? extends de.hub.clickwatch.analysis.results.GraphNode>>();
  private java.util.Collection<de.hub.clickwatch.analysis.traceable.Traceable> m_tracesFrom = new java.util.LinkedList<de.hub.clickwatch.analysis.traceable.Traceable>();
  private java.util.Collection<de.hub.clickwatch.analysis.traceable.util.builder.ITraceableBuilder<? extends de.hub.clickwatch.analysis.traceable.Traceable>> m_featureTracesFromBuilder = new java.util.LinkedList<de.hub.clickwatch.analysis.traceable.util.builder.ITraceableBuilder<? extends de.hub.clickwatch.analysis.traceable.Traceable>>();
  private java.util.Collection<de.hub.clickwatch.analysis.traceable.Traceable> m_tracesTo = new java.util.LinkedList<de.hub.clickwatch.analysis.traceable.Traceable>();
  private java.util.Collection<de.hub.clickwatch.analysis.traceable.util.builder.ITraceableBuilder<? extends de.hub.clickwatch.analysis.traceable.Traceable>> m_featureTracesToBuilder = new java.util.LinkedList<de.hub.clickwatch.analysis.traceable.util.builder.ITraceableBuilder<? extends de.hub.clickwatch.analysis.traceable.Traceable>>();
  // helper attributes
  private boolean m_featureLinksSet = false;
  private boolean m_featureNameSet = false;
  private boolean m_featureNodesSet = false;
  private boolean m_featureTimestampSet = false;
  private boolean m_featureTracesFromSet = false;
  private boolean m_featureTracesToSet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newGraphResultBuilder()
   */
  private GraphResultBuilder() {
  }

  /**
   * This method creates a new instance of the GraphResultBuilder.
   * @return new instance of the GraphResultBuilder
   */
  public static GraphResultBuilder newGraphResultBuilder() {
    return new GraphResultBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public GraphResultBuilder but() {
    GraphResultBuilder _builder = newGraphResultBuilder();
    _builder.m_featureLinksSet = m_featureLinksSet;
    _builder.m_links = m_links;
    _builder.m_featureLinksBuilder = m_featureLinksBuilder;
    _builder.m_featureNameSet = m_featureNameSet;
    _builder.m_name = m_name;
    _builder.m_featureNodesSet = m_featureNodesSet;
    _builder.m_nodes = m_nodes;
    _builder.m_featureNodesBuilder = m_featureNodesBuilder;
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
   * This method constructs the final de.hub.clickwatch.analysis.results.GraphResult type.
   * @return new instance of the de.hub.clickwatch.analysis.results.GraphResult type
   */
  public de.hub.clickwatch.analysis.results.GraphResult build() {
    final de.hub.clickwatch.analysis.results.GraphResult _newInstance = de.hub.clickwatch.analysis.results.ResultsFactory.eINSTANCE.createGraphResult();
    if (m_featureNameSet) {
      _newInstance.setName(m_name);
    }
    if (m_featureTimestampSet) {
      _newInstance.setTimestamp(m_timestamp);
    }
    if (m_featureLinksSet) {
      _newInstance.getLinks().addAll(m_links);
    } else {
      if (!m_featureLinksBuilder.isEmpty()) {
        for (de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<? extends de.hub.clickwatch.analysis.results.GraphLink> builder : m_featureLinksBuilder) {
          _newInstance.getLinks().add(builder.build());
        }
      }
    }
    if (m_featureNodesSet) {
      _newInstance.getNodes().addAll(m_nodes);
    } else {
      if (!m_featureNodesBuilder.isEmpty()) {
        for (de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<? extends de.hub.clickwatch.analysis.results.GraphNode> builder : m_featureNodesBuilder) {
          _newInstance.getNodes().add(builder.build());
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

  public GraphResultBuilder withName(java.lang.String p_name) {
    m_name = p_name;
    m_featureNameSet = true;
    return this;
  }

  public GraphResultBuilder withTimestamp(java.util.Date p_timestamp) {
    m_timestamp = p_timestamp;
    m_featureTimestampSet = true;
    return this;
  }

  public GraphResultBuilder withLinks(de.hub.clickwatch.analysis.results.GraphLink p_links) {
    m_links.add(p_links);
    m_featureLinksSet = true;
    return this;
  }

  public GraphResultBuilder withLinks(java.util.Collection<? extends de.hub.clickwatch.analysis.results.GraphLink> p_links) {
    m_links.addAll(p_links);
    m_featureLinksSet = true;
    return this;
  }

  public GraphResultBuilder withLinks(de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<? extends de.hub.clickwatch.analysis.results.GraphLink> p_graphLinkBuilder) {
    m_featureLinksBuilder.add(p_graphLinkBuilder);
    return this;
  }

  public GraphResultBuilder withNodes(de.hub.clickwatch.analysis.results.GraphNode p_nodes) {
    m_nodes.add(p_nodes);
    m_featureNodesSet = true;
    return this;
  }

  public GraphResultBuilder withNodes(java.util.Collection<? extends de.hub.clickwatch.analysis.results.GraphNode> p_nodes) {
    m_nodes.addAll(p_nodes);
    m_featureNodesSet = true;
    return this;
  }

  public GraphResultBuilder withNodes(de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<? extends de.hub.clickwatch.analysis.results.GraphNode> p_graphNodeBuilder) {
    m_featureNodesBuilder.add(p_graphNodeBuilder);
    return this;
  }

  public GraphResultBuilder withTracesFrom(de.hub.clickwatch.analysis.traceable.Traceable p_tracesFrom) {
    m_tracesFrom.add(p_tracesFrom);
    m_featureTracesFromSet = true;
    return this;
  }

  public GraphResultBuilder withTracesFrom(java.util.Collection<? extends de.hub.clickwatch.analysis.traceable.Traceable> p_tracesFrom) {
    m_tracesFrom.addAll(p_tracesFrom);
    m_featureTracesFromSet = true;
    return this;
  }

  public GraphResultBuilder withTracesFrom(de.hub.clickwatch.analysis.traceable.util.builder.ITraceableBuilder<? extends de.hub.clickwatch.analysis.traceable.Traceable> p_traceableBuilder) {
    m_featureTracesFromBuilder.add(p_traceableBuilder);
    return this;
  }

  public GraphResultBuilder withTracesTo(de.hub.clickwatch.analysis.traceable.Traceable p_tracesTo) {
    m_tracesTo.add(p_tracesTo);
    m_featureTracesToSet = true;
    return this;
  }

  public GraphResultBuilder withTracesTo(java.util.Collection<? extends de.hub.clickwatch.analysis.traceable.Traceable> p_tracesTo) {
    m_tracesTo.addAll(p_tracesTo);
    m_featureTracesToSet = true;
    return this;
  }

  public GraphResultBuilder withTracesTo(de.hub.clickwatch.analysis.traceable.util.builder.ITraceableBuilder<? extends de.hub.clickwatch.analysis.traceable.Traceable> p_traceableBuilder) {
    m_featureTracesToBuilder.add(p_traceableBuilder);
    return this;
  }
}
