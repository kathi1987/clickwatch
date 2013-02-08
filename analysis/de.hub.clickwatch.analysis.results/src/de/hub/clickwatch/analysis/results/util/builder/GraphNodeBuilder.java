package de.hub.clickwatch.analysis.results.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object '<em><b>de.hub.clickwatch.analysis.results.GraphNode</b></em>'.
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
  // helper attributes
  private boolean m_featureIncomingSet = false;
  private boolean m_featureNameSet = false;
  private boolean m_featureOutgoingSet = false;

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
   * This method creates a new instance of the GraphNodeBuilder. 
   * The builder is initialized using an existing '<em><b>de.hub.clickwatch.analysis.results.GraphNode</b></em>' model object.
   * In order to avoid changes to the provided '<em><b>de.hub.clickwatch.analysis.results.GraphNode</b></em>' model object, a copy is created using <em><b>org.eclipse.emf.ecore.util.EcoreUtil.Copier</b></em>.
   * @param graphNode The existing '<em><b>de.hub.clickwatch.analysis.results.GraphNode</b></em>' model object to be used for the initialization of the builder  
   * @return new initialized instance of the GraphNodeBuilder
   */
  public static GraphNodeBuilder newGraphNodeBuilder(de.hub.clickwatch.analysis.results.GraphNode p_graphNode) {
    org.eclipse.emf.ecore.util.EcoreUtil.Copier c = new org.eclipse.emf.ecore.util.EcoreUtil.Copier();
    de.hub.clickwatch.analysis.results.GraphNode _graphNode = (de.hub.clickwatch.analysis.results.GraphNode) c.copy(((de.hub.clickwatch.analysis.results.GraphNode) p_graphNode));
    c.copyReferences();
    GraphNodeBuilder _builder = newGraphNodeBuilder();
    _builder.name(_graphNode.getName());
    if (_graphNode.getIncoming() != null) {
      _builder.incoming(_graphNode.getIncoming());
    }
    if (_graphNode.getOutgoing() != null) {
      _builder.outgoing(_graphNode.getOutgoing());
    }
    return _builder;
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
    return _builder;
  }

  /**
   * This method constructs the final de.hub.clickwatch.analysis.results.GraphNode type.
   * @return new instance of the de.hub.clickwatch.analysis.results.GraphNode type
   */
  public de.hub.clickwatch.analysis.results.GraphNode build() {
    final de.hub.clickwatch.analysis.results.GraphNode _newInstance = (de.hub.clickwatch.analysis.results.GraphNode) de.hub.clickwatch.analysis.results.ResultsFactory.eINSTANCE
        .create(de.hub.clickwatch.analysis.results.ResultsPackage.eINSTANCE.getGraphNode());
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
    return _newInstance;
  }

  public GraphNodeBuilder name(java.lang.String p_name) {
    m_name = p_name;
    m_featureNameSet = true;
    return this;
  }

  public GraphNodeBuilder incoming(de.hub.clickwatch.analysis.results.GraphLink p_incoming) {
    m_incoming.add(p_incoming);
    m_featureIncomingSet = true;
    return this;
  }

  public GraphNodeBuilder incoming(java.util.Collection<? extends de.hub.clickwatch.analysis.results.GraphLink> p_incoming) {
    m_incoming.addAll(p_incoming);
    m_featureIncomingSet = true;
    return this;
  }

  public GraphNodeBuilder incoming(de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<? extends de.hub.clickwatch.analysis.results.GraphLink> p_graphLinkBuilder) {
    m_featureIncomingBuilder.add(p_graphLinkBuilder);
    return this;
  }

  public GraphNodeBuilder outgoing(de.hub.clickwatch.analysis.results.GraphLink p_outgoing) {
    m_outgoing.add(p_outgoing);
    m_featureOutgoingSet = true;
    return this;
  }

  public GraphNodeBuilder outgoing(java.util.Collection<? extends de.hub.clickwatch.analysis.results.GraphLink> p_outgoing) {
    m_outgoing.addAll(p_outgoing);
    m_featureOutgoingSet = true;
    return this;
  }

  public GraphNodeBuilder outgoing(de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<? extends de.hub.clickwatch.analysis.results.GraphLink> p_graphLinkBuilder) {
    m_featureOutgoingBuilder.add(p_graphLinkBuilder);
    return this;
  }
}
