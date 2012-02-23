package de.hub.clickwatch.datamodel.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>de.hub.clickwatch.datamodel.Network</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class NetworkBuilder implements de.hub.clickwatch.datamodel.util.builder.IDatamodelBuilder<de.hub.clickwatch.datamodel.Network> {
  // features and builders
  private java.lang.String m_ElementFilter;
  private java.lang.String m_HandlerFilter;
  private java.lang.String m_name;
  private de.hub.clickwatch.datamodel.StatisticsContainer m_statistics;
  private de.hub.clickwatch.datamodel.util.builder.IDatamodelBuilder<? extends de.hub.clickwatch.datamodel.StatisticsContainer> m_featureStatisticsBuilder;
  private long m_timestamp;
  private java.util.Collection<de.hub.clickwatch.datamodel.Node> m_nodes = new java.util.LinkedList<de.hub.clickwatch.datamodel.Node>();
  private java.util.Collection<de.hub.clickwatch.datamodel.util.builder.IDatamodelBuilder<? extends de.hub.clickwatch.datamodel.Node>> m_featureNodesBuilder = new java.util.LinkedList<de.hub.clickwatch.datamodel.util.builder.IDatamodelBuilder<? extends de.hub.clickwatch.datamodel.Node>>();
  private java.util.Collection<de.hub.clickwatch.datamodel.Network> m_subnetworks = new java.util.LinkedList<de.hub.clickwatch.datamodel.Network>();
  private java.util.Collection<de.hub.clickwatch.datamodel.util.builder.IDatamodelBuilder<? extends de.hub.clickwatch.datamodel.Network>> m_featureSubnetworksBuilder = new java.util.LinkedList<de.hub.clickwatch.datamodel.util.builder.IDatamodelBuilder<? extends de.hub.clickwatch.datamodel.Network>>();
  private java.util.Collection<de.hub.clickwatch.analysis.traceable.Traceable> m_tracesFrom = new java.util.LinkedList<de.hub.clickwatch.analysis.traceable.Traceable>();
  private java.util.Collection<de.hub.clickwatch.analysis.traceable.util.builder.ITraceableBuilder<? extends de.hub.clickwatch.analysis.traceable.Traceable>> m_featureTracesFromBuilder = new java.util.LinkedList<de.hub.clickwatch.analysis.traceable.util.builder.ITraceableBuilder<? extends de.hub.clickwatch.analysis.traceable.Traceable>>();
  private java.util.Collection<de.hub.clickwatch.analysis.traceable.Traceable> m_tracesTo = new java.util.LinkedList<de.hub.clickwatch.analysis.traceable.Traceable>();
  private java.util.Collection<de.hub.clickwatch.analysis.traceable.util.builder.ITraceableBuilder<? extends de.hub.clickwatch.analysis.traceable.Traceable>> m_featureTracesToBuilder = new java.util.LinkedList<de.hub.clickwatch.analysis.traceable.util.builder.ITraceableBuilder<? extends de.hub.clickwatch.analysis.traceable.Traceable>>();
  // helper attributes
  private boolean m_featureElementFilterSet = false;
  private boolean m_featureHandlerFilterSet = false;
  private boolean m_featureNameSet = false;
  private boolean m_featureNodesSet = false;
  private boolean m_featureStatisticsSet = false;
  private boolean m_featureSubnetworksSet = false;
  private boolean m_featureTimestampSet = false;
  private boolean m_featureTracesFromSet = false;
  private boolean m_featureTracesToSet = false;

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
    _builder.m_featureTracesFromSet = m_featureTracesFromSet;
    _builder.m_tracesFrom = m_tracesFrom;
    _builder.m_featureTracesFromBuilder = m_featureTracesFromBuilder;
    _builder.m_featureTracesToSet = m_featureTracesToSet;
    _builder.m_tracesTo = m_tracesTo;
    _builder.m_featureTracesToBuilder = m_featureTracesToBuilder;
    return _builder;
  }

  /**
   * This method constructs the final de.hub.clickwatch.datamodel.Network type.
   * @return new instance of the de.hub.clickwatch.datamodel.Network type
   */
  public de.hub.clickwatch.datamodel.Network build() {
    final de.hub.clickwatch.datamodel.Network _newInstance = de.hub.clickwatch.datamodel.ClickWatchDataModelFactory.eINSTANCE.createNetwork();
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
        for (de.hub.clickwatch.datamodel.util.builder.IDatamodelBuilder<? extends de.hub.clickwatch.datamodel.Node> builder : m_featureNodesBuilder) {
          _newInstance.getNodes().add(builder.build());
        }
      }
    }
    if (m_featureSubnetworksSet) {
      _newInstance.getSubnetworks().addAll(m_subnetworks);
    } else {
      if (!m_featureSubnetworksBuilder.isEmpty()) {
        for (de.hub.clickwatch.datamodel.util.builder.IDatamodelBuilder<? extends de.hub.clickwatch.datamodel.Network> builder : m_featureSubnetworksBuilder) {
          _newInstance.getSubnetworks().add(builder.build());
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

  public NetworkBuilder withStatistics(de.hub.clickwatch.datamodel.StatisticsContainer p_statistics) {
    m_statistics = p_statistics;
    m_featureStatisticsSet = true;
    return this;
  }

  public NetworkBuilder withStatistics(de.hub.clickwatch.datamodel.util.builder.IDatamodelBuilder<? extends de.hub.clickwatch.datamodel.StatisticsContainer> p_statisticsContainerBuilder) {
    m_featureStatisticsBuilder = p_statisticsContainerBuilder;
    return this;
  }

  public NetworkBuilder withTimestamp(long p_timestamp) {
    m_timestamp = p_timestamp;
    m_featureTimestampSet = true;
    return this;
  }

  public NetworkBuilder withNodes(de.hub.clickwatch.datamodel.Node p_nodes) {
    m_nodes.add(p_nodes);
    m_featureNodesSet = true;
    return this;
  }

  public NetworkBuilder withNodes(java.util.Collection<? extends de.hub.clickwatch.datamodel.Node> p_nodes) {
    m_nodes.addAll(p_nodes);
    m_featureNodesSet = true;
    return this;
  }

  public NetworkBuilder withNodes(de.hub.clickwatch.datamodel.util.builder.IDatamodelBuilder<? extends de.hub.clickwatch.datamodel.Node> p_nodeBuilder) {
    m_featureNodesBuilder.add(p_nodeBuilder);
    return this;
  }

  public NetworkBuilder withSubnetworks(de.hub.clickwatch.datamodel.Network p_subnetworks) {
    m_subnetworks.add(p_subnetworks);
    m_featureSubnetworksSet = true;
    return this;
  }

  public NetworkBuilder withSubnetworks(java.util.Collection<? extends de.hub.clickwatch.datamodel.Network> p_subnetworks) {
    m_subnetworks.addAll(p_subnetworks);
    m_featureSubnetworksSet = true;
    return this;
  }

  public NetworkBuilder withSubnetworks(de.hub.clickwatch.datamodel.util.builder.IDatamodelBuilder<? extends de.hub.clickwatch.datamodel.Network> p_networkBuilder) {
    m_featureSubnetworksBuilder.add(p_networkBuilder);
    return this;
  }

  public NetworkBuilder withTracesFrom(de.hub.clickwatch.analysis.traceable.Traceable p_tracesFrom) {
    m_tracesFrom.add(p_tracesFrom);
    m_featureTracesFromSet = true;
    return this;
  }

  public NetworkBuilder withTracesFrom(java.util.Collection<? extends de.hub.clickwatch.analysis.traceable.Traceable> p_tracesFrom) {
    m_tracesFrom.addAll(p_tracesFrom);
    m_featureTracesFromSet = true;
    return this;
  }

  public NetworkBuilder withTracesFrom(de.hub.clickwatch.analysis.traceable.util.builder.ITraceableBuilder<? extends de.hub.clickwatch.analysis.traceable.Traceable> p_traceableBuilder) {
    m_featureTracesFromBuilder.add(p_traceableBuilder);
    return this;
  }

  public NetworkBuilder withTracesTo(de.hub.clickwatch.analysis.traceable.Traceable p_tracesTo) {
    m_tracesTo.add(p_tracesTo);
    m_featureTracesToSet = true;
    return this;
  }

  public NetworkBuilder withTracesTo(java.util.Collection<? extends de.hub.clickwatch.analysis.traceable.Traceable> p_tracesTo) {
    m_tracesTo.addAll(p_tracesTo);
    m_featureTracesToSet = true;
    return this;
  }

  public NetworkBuilder withTracesTo(de.hub.clickwatch.analysis.traceable.util.builder.ITraceableBuilder<? extends de.hub.clickwatch.analysis.traceable.Traceable> p_traceableBuilder) {
    m_featureTracesToBuilder.add(p_traceableBuilder);
    return this;
  }
}
