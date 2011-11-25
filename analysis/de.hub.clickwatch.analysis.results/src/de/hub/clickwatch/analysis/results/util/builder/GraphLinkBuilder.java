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
  // helper attributes
  private boolean m_featureNameSet = false;
  private boolean m_featureSourceSet = false;
  private boolean m_featureTargetSet = false;

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
}
