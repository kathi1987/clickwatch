package de.hub.clickwatch.analysis.results.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>de.hub.clickwatch.analysis.results.GraphNode</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class GraphNodeBuilder implements de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<de.hub.clickwatch.analysis.results.GraphNode> {
  // features and builders
  private java.lang.String m_name;
  private java.util.Collection<de.hub.clickwatch.analysis.results.GraphLink> m_incoming = new java.util.LinkedList<de.hub.clickwatch.analysis.results.GraphLink>();
  private java.util.Collection<de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<? extends de.hub.clickwatch.analysis.results.GraphLink>> m_featureIncomingBuilder = new java.util.LinkedList<de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<? extends de.hub.clickwatch.analysis.results.GraphLink>>();
  private java.util.Collection<de.hub.clickwatch.analysis.results.GraphLink> m_outgoing = new java.util.LinkedList<de.hub.clickwatch.analysis.results.GraphLink>();
  private java.util.Collection<de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<? extends de.hub.clickwatch.analysis.results.GraphLink>> m_featureOutgoingBuilder = new java.util.LinkedList<de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<? extends de.hub.clickwatch.analysis.results.GraphLink>>();
  private java.util.Collection<de.hub.clickwatch.analysis.traceable.Traceable> m_tracesFrom = new java.util.LinkedList<de.hub.clickwatch.analysis.traceable.Traceable>();
  private java.util.Collection<de.hub.clickwatch.analysis.traceable.util.builder.ITraceableBuilder<? extends de.hub.clickwatch.analysis.traceable.Traceable>> m_featureTracesFromBuilder = new java.util.LinkedList<de.hub.clickwatch.analysis.traceable.util.builder.ITraceableBuilder<? extends de.hub.clickwatch.analysis.traceable.Traceable>>();
  private java.util.Collection<de.hub.clickwatch.analysis.traceable.Traceable> m_tracesTo = new java.util.LinkedList<de.hub.clickwatch.analysis.traceable.Traceable>();
  private java.util.Collection<de.hub.clickwatch.analysis.traceable.util.builder.ITraceableBuilder<? extends de.hub.clickwatch.analysis.traceable.Traceable>> m_featureTracesToBuilder = new java.util.LinkedList<de.hub.clickwatch.analysis.traceable.util.builder.ITraceableBuilder<? extends de.hub.clickwatch.analysis.traceable.Traceable>>();
  // helper attributes
  private boolean m_featureIncomingSet = false;
  private boolean m_featureNameSet = false;
  private boolean m_featureOutgoingSet = false;
  private boolean m_featureTracesFromSet = false;
  private boolean m_featureTracesToSet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newGraphNodeBuilder()
   */
  private GraphNodeBuilder() {
  }

  /**
   * This method creates a new instance of the GraphNodeBuilder.
   * @return new instance of the GraphNodeBuilder
   */
  public static GraphNodeBuilder newGraphNodeBuilder() {
    return new GraphNodeBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public GraphNodeBuilder but() {
    GraphNodeBuilder _builder = newGraphNodeBuilder();
    _builder.m_featureIncomingSet = m_featureIncomingSet;
    _builder.m_incoming = m_incoming;
    _builder.m_featureIncomingBuilder = m_featureIncomingBuilder;
    _builder.m_featureNameSet = m_featureNameSet;
    _builder.m_name = m_name;
    _builder.m_featureOutgoingSet = m_featureOutgoingSet;
    _builder.m_outgoing = m_outgoing;
    _builder.m_featureOutgoingBuilder = m_featureOutgoingBuilder;
    _builder.m_featureTracesFromSet = m_featureTracesFromSet;
    _builder.m_tracesFrom = m_tracesFrom;
    _builder.m_featureTracesFromBuilder = m_featureTracesFromBuilder;
    _builder.m_featureTracesToSet = m_featureTracesToSet;
    _builder.m_tracesTo = m_tracesTo;
    _builder.m_featureTracesToBuilder = m_featureTracesToBuilder;
    return _builder;
  }

  /**
   * This method constructs the final de.hub.clickwatch.analysis.results.GraphNode type.
   * @return new instance of the de.hub.clickwatch.analysis.results.GraphNode type
   */
  public de.hub.clickwatch.analysis.results.GraphNode build() {
    final de.hub.clickwatch.analysis.results.GraphNode _newInstance = de.hub.clickwatch.analysis.results.ResultsFactory.eINSTANCE.createGraphNode();
    if (m_featureNameSet) {
      _newInstance.setName(m_name);
    }
    if (m_featureIncomingSet) {
      _newInstance.getIncoming().addAll(m_incoming);
    } else {
      if (!m_featureIncomingBuilder.isEmpty()) {
        for (de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<? extends de.hub.clickwatch.analysis.results.GraphLink> builder : m_featureIncomingBuilder) {
          _newInstance.getIncoming().add(builder.build());
        }
      }
    }
    if (m_featureOutgoingSet) {
      _newInstance.getOutgoing().addAll(m_outgoing);
    } else {
      if (!m_featureOutgoingBuilder.isEmpty()) {
        for (de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<? extends de.hub.clickwatch.analysis.results.GraphLink> builder : m_featureOutgoingBuilder) {
          _newInstance.getOutgoing().add(builder.build());
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

  public GraphNodeBuilder withName(java.lang.String p_name) {
    m_name = p_name;
    m_featureNameSet = true;
    return this;
  }

  public GraphNodeBuilder withIncoming(de.hub.clickwatch.analysis.results.GraphLink p_incoming) {
    m_incoming.add(p_incoming);
    m_featureIncomingSet = true;
    return this;
  }

  public GraphNodeBuilder withIncoming(java.util.Collection<? extends de.hub.clickwatch.analysis.results.GraphLink> p_incoming) {
    m_incoming.addAll(p_incoming);
    m_featureIncomingSet = true;
    return this;
  }

  public GraphNodeBuilder withIncoming(de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<? extends de.hub.clickwatch.analysis.results.GraphLink> p_graphLinkBuilder) {
    m_featureIncomingBuilder.add(p_graphLinkBuilder);
    return this;
  }

  public GraphNodeBuilder withOutgoing(de.hub.clickwatch.analysis.results.GraphLink p_outgoing) {
    m_outgoing.add(p_outgoing);
    m_featureOutgoingSet = true;
    return this;
  }

  public GraphNodeBuilder withOutgoing(java.util.Collection<? extends de.hub.clickwatch.analysis.results.GraphLink> p_outgoing) {
    m_outgoing.addAll(p_outgoing);
    m_featureOutgoingSet = true;
    return this;
  }

  public GraphNodeBuilder withOutgoing(de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<? extends de.hub.clickwatch.analysis.results.GraphLink> p_graphLinkBuilder) {
    m_featureOutgoingBuilder.add(p_graphLinkBuilder);
    return this;
  }

  public GraphNodeBuilder withTracesFrom(de.hub.clickwatch.analysis.traceable.Traceable p_tracesFrom) {
    m_tracesFrom.add(p_tracesFrom);
    m_featureTracesFromSet = true;
    return this;
  }

  public GraphNodeBuilder withTracesFrom(java.util.Collection<? extends de.hub.clickwatch.analysis.traceable.Traceable> p_tracesFrom) {
    m_tracesFrom.addAll(p_tracesFrom);
    m_featureTracesFromSet = true;
    return this;
  }

  public GraphNodeBuilder withTracesFrom(de.hub.clickwatch.analysis.traceable.util.builder.ITraceableBuilder<? extends de.hub.clickwatch.analysis.traceable.Traceable> p_traceableBuilder) {
    m_featureTracesFromBuilder.add(p_traceableBuilder);
    return this;
  }

  public GraphNodeBuilder withTracesTo(de.hub.clickwatch.analysis.traceable.Traceable p_tracesTo) {
    m_tracesTo.add(p_tracesTo);
    m_featureTracesToSet = true;
    return this;
  }

  public GraphNodeBuilder withTracesTo(java.util.Collection<? extends de.hub.clickwatch.analysis.traceable.Traceable> p_tracesTo) {
    m_tracesTo.addAll(p_tracesTo);
    m_featureTracesToSet = true;
    return this;
  }

  public GraphNodeBuilder withTracesTo(de.hub.clickwatch.analysis.traceable.util.builder.ITraceableBuilder<? extends de.hub.clickwatch.analysis.traceable.Traceable> p_traceableBuilder) {
    m_featureTracesToBuilder.add(p_traceableBuilder);
    return this;
  }
}
