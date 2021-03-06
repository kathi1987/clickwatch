package de.hub.clickwatch.model.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>de.hub.clickwatch.model.Network</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class NetworkBuilder implements de.hub.clickwatch.model.util.builder.IModelBuilder<de.hub.clickwatch.model.Network> {
  // features and builders
  private java.lang.String m_ElementFilter;
  private java.lang.String m_HandlerFilter;
  private java.lang.String m_name;
  private de.hub.clickwatch.model.StatisticsContainer m_statistics;
  private de.hub.clickwatch.model.util.builder.IModelBuilder<? extends de.hub.clickwatch.model.StatisticsContainer> m_featureStatisticsBuilder;
  private long m_timestamp;
  private java.util.Collection<de.hub.clickwatch.model.Node> m_nodes = new java.util.LinkedList<de.hub.clickwatch.model.Node>();
  private java.util.Collection<de.hub.clickwatch.model.util.builder.IModelBuilder<? extends de.hub.clickwatch.model.Node>> m_featureNodesBuilder = new java.util.LinkedList<de.hub.clickwatch.model.util.builder.IModelBuilder<? extends de.hub.clickwatch.model.Node>>();
  private java.util.Collection<de.hub.clickwatch.model.Network> m_subnetworks = new java.util.LinkedList<de.hub.clickwatch.model.Network>();
  private java.util.Collection<de.hub.clickwatch.model.util.builder.IModelBuilder<? extends de.hub.clickwatch.model.Network>> m_featureSubnetworksBuilder = new java.util.LinkedList<de.hub.clickwatch.model.util.builder.IModelBuilder<? extends de.hub.clickwatch.model.Network>>();
  // helper attributes
  private boolean m_featureElementFilterSet = false;
  private boolean m_featureHandlerFilterSet = false;
  private boolean m_featureNameSet = false;
  private boolean m_featureNodesSet = false;
  private boolean m_featureStatisticsSet = false;
  private boolean m_featureSubnetworksSet = false;
  private boolean m_featureTimestampSet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newNetworkBuilder()
   */
  private NetworkBuilder() {
  }

  /**
   * This method creates a new instance of the NetworkBuilder.
   * @return new instance of the NetworkBuilder
   */
  public static NetworkBuilder newNetworkBuilder() {
    return new NetworkBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public NetworkBuilder but() {
    NetworkBuilder _builder = newNetworkBuilder();
    _builder.m_featureElementFilterSet = m_featureElementFilterSet;
    _builder.m_ElementFilter = m_ElementFilter;
    _builder.m_featureHandlerFilterSet = m_featureHandlerFilterSet;
    _builder.m_HandlerFilter = m_HandlerFilter;
    _builder.m_featureNameSet = m_featureNameSet;
    _builder.m_name = m_name;
    _builder.m_featureNodesSet = m_featureNodesSet;
    _builder.m_nodes = m_nodes;
    _builder.m_featureNodesBuilder = m_featureNodesBuilder;
    _builder.m_featureStatisticsSet = m_featureStatisticsSet;
    _builder.m_statistics = m_statistics;
    _builder.m_featureStatisticsBuilder = m_featureStatisticsBuilder;
    _builder.m_featureSubnetworksSet = m_featureSubnetworksSet;
    _builder.m_subnetworks = m_subnetworks;
    _builder.m_featureSubnetworksBuilder = m_featureSubnetworksBuilder;
    _builder.m_featureTimestampSet = m_featureTimestampSet;
    _builder.m_timestamp = m_timestamp;
    return _builder;
  }

  /**
   * This method constructs the final de.hub.clickwatch.model.Network type.
   * @return new instance of the de.hub.clickwatch.model.Network type
   */
  public de.hub.clickwatch.model.Network build() {
    final de.hub.clickwatch.model.Network _newInstance = de.hub.clickwatch.model.ClickWatchModelFactory.eINSTANCE.createNetwork();
    if (m_featureElementFilterSet) {
      _newInstance.setElementFilter(m_ElementFilter);
    }
    if (m_featureHandlerFilterSet) {
      _newInstance.setHandlerFilter(m_HandlerFilter);
    }
    if (m_featureNameSet) {
      _newInstance.setName(m_name);
    }
    if (m_featureStatisticsSet) {
      _newInstance.setStatistics(m_statistics);
    } else {
      if (m_featureStatisticsBuilder != null) {
        _newInstance.setStatistics(m_featureStatisticsBuilder.build());
      }
    }
    if (m_featureTimestampSet) {
      _newInstance.setTimestamp(m_timestamp);
    }
    if (m_featureNodesSet) {
      _newInstance.getNodes().addAll(m_nodes);
    } else {
      if (!m_featureNodesBuilder.isEmpty()) {
        for (de.hub.clickwatch.model.util.builder.IModelBuilder<? extends de.hub.clickwatch.model.Node> builder : m_featureNodesBuilder) {
          _newInstance.getNodes().add(builder.build());
        }
      }
    }
    if (m_featureSubnetworksSet) {
      _newInstance.getSubnetworks().addAll(m_subnetworks);
    } else {
      if (!m_featureSubnetworksBuilder.isEmpty()) {
        for (de.hub.clickwatch.model.util.builder.IModelBuilder<? extends de.hub.clickwatch.model.Network> builder : m_featureSubnetworksBuilder) {
          _newInstance.getSubnetworks().add(builder.build());
        }
      }
    }
    return _newInstance;
  }

  public NetworkBuilder withElementFilter(java.lang.String p_ElementFilter) {
    m_ElementFilter = p_ElementFilter;
    m_featureElementFilterSet = true;
    return this;
  }

  public NetworkBuilder withHandlerFilter(java.lang.String p_HandlerFilter) {
    m_HandlerFilter = p_HandlerFilter;
    m_featureHandlerFilterSet = true;
    return this;
  }

  public NetworkBuilder withName(java.lang.String p_name) {
    m_name = p_name;
    m_featureNameSet = true;
    return this;
  }

  public NetworkBuilder withStatistics(de.hub.clickwatch.model.StatisticsContainer p_statistics) {
    m_statistics = p_statistics;
    m_featureStatisticsSet = true;
    return this;
  }

  public NetworkBuilder withStatistics(de.hub.clickwatch.model.util.builder.IModelBuilder<? extends de.hub.clickwatch.model.StatisticsContainer> p_statisticsContainerBuilder) {
    m_featureStatisticsBuilder = p_statisticsContainerBuilder;
    return this;
  }

  public NetworkBuilder withTimestamp(long p_timestamp) {
    m_timestamp = p_timestamp;
    m_featureTimestampSet = true;
    return this;
  }

  public NetworkBuilder withNodes(de.hub.clickwatch.model.Node p_nodes) {
    m_nodes.add(p_nodes);
    m_featureNodesSet = true;
    return this;
  }

  public NetworkBuilder withNodes(java.util.Collection<? extends de.hub.clickwatch.model.Node> p_nodes) {
    m_nodes.addAll(p_nodes);
    m_featureNodesSet = true;
    return this;
  }

  public NetworkBuilder withNodes(de.hub.clickwatch.model.util.builder.IModelBuilder<? extends de.hub.clickwatch.model.Node> p_nodeBuilder) {
    m_featureNodesBuilder.add(p_nodeBuilder);
    return this;
  }

  public NetworkBuilder withSubnetworks(de.hub.clickwatch.model.Network p_subnetworks) {
    m_subnetworks.add(p_subnetworks);
    m_featureSubnetworksSet = true;
    return this;
  }

  public NetworkBuilder withSubnetworks(java.util.Collection<? extends de.hub.clickwatch.model.Network> p_subnetworks) {
    m_subnetworks.addAll(p_subnetworks);
    m_featureSubnetworksSet = true;
    return this;
  }

  public NetworkBuilder withSubnetworks(de.hub.clickwatch.model.util.builder.IModelBuilder<? extends de.hub.clickwatch.model.Network> p_networkBuilder) {
    m_featureSubnetworksBuilder.add(p_networkBuilder);
    return this;
  }
}
