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
  private long m_time;
  private Integer m_timeout;
  private Integer m_updateIntervall;
  private java.util.Collection<de.hub.clickwatch.model.Node> m_nodes = new java.util.LinkedList<de.hub.clickwatch.model.Node>();
  private java.util.Collection<de.hub.clickwatch.model.util.builder.IModelBuilder<? extends de.hub.clickwatch.model.Node>> m_featureNodesBuilder = new java.util.LinkedList<de.hub.clickwatch.model.util.builder.IModelBuilder<? extends de.hub.clickwatch.model.Node>>();
  private java.util.Collection<de.hub.clickwatch.model.Network> m_subnetworks = new java.util.LinkedList<de.hub.clickwatch.model.Network>();
  private java.util.Collection<de.hub.clickwatch.model.util.builder.IModelBuilder<? extends de.hub.clickwatch.model.Network>> m_featureSubnetworksBuilder = new java.util.LinkedList<de.hub.clickwatch.model.util.builder.IModelBuilder<? extends de.hub.clickwatch.model.Network>>();
  // helper attributes
  private boolean m_featureElementFilterSet = false;
  private boolean m_featureHandlerFilterSet = false;
  private boolean m_featureNameSet = false;
  private boolean m_featureNodesSet = false;
  private boolean m_featureSubnetworksSet = false;
  private boolean m_featureTimeSet = false;
  private boolean m_featureTimeoutSet = false;
  private boolean m_featureUpdateIntervallSet = false;

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
    _builder.m_featureSubnetworksSet = m_featureSubnetworksSet;
    _builder.m_subnetworks = m_subnetworks;
    _builder.m_featureSubnetworksBuilder = m_featureSubnetworksBuilder;
    _builder.m_featureTimeSet = m_featureTimeSet;
    _builder.m_time = m_time;
    _builder.m_featureTimeoutSet = m_featureTimeoutSet;
    _builder.m_timeout = m_timeout;
    _builder.m_featureUpdateIntervallSet = m_featureUpdateIntervallSet;
    _builder.m_updateIntervall = m_updateIntervall;
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
    if (m_featureTimeSet) {
      _newInstance.setTime(m_time);
    }
    if (m_featureTimeoutSet) {
      _newInstance.setTimeout(m_timeout);
    }
    if (m_featureUpdateIntervallSet) {
      _newInstance.setUpdateIntervall(m_updateIntervall);
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

  public NetworkBuilder withTime(long p_time) {
    m_time = p_time;
    m_featureTimeSet = true;
    return this;
  }

  public NetworkBuilder withTimeout(Integer p_timeout) {
    m_timeout = p_timeout;
    m_featureTimeoutSet = true;
    return this;
  }

  public NetworkBuilder withUpdateIntervall(Integer p_updateIntervall) {
    m_updateIntervall = p_updateIntervall;
    m_featureUpdateIntervallSet = true;
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
