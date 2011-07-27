package de.hub.clickwatch.model.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>de.hub.clickwatch.model.MultiNode</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class MultiNodeBuilder implements de.hub.clickwatch.model.util.builder.IModelBuilder<de.hub.clickwatch.model.MultiNode> {
  // features and builders
  private de.hub.clickwatch.model.BackboneType m_backbone;
  private Boolean m_connected;
  private java.lang.Object m_connection;
  private Boolean m_hasRecord;
  private java.lang.String m_iNetAddress;
  private java.lang.String m_port;
  private Boolean m_recording;
  private Boolean m_retrieving;
  private java.util.Collection<de.hub.clickwatch.model.Element> m_elements = new java.util.LinkedList<de.hub.clickwatch.model.Element>();
  private java.util.Collection<de.hub.clickwatch.model.util.builder.IModelBuilder<? extends de.hub.clickwatch.model.Element>> m_featureElementsBuilder = new java.util.LinkedList<de.hub.clickwatch.model.util.builder.IModelBuilder<? extends de.hub.clickwatch.model.Element>>();
  private java.util.Collection<de.hub.clickwatch.model.Node> m_nodes = new java.util.LinkedList<de.hub.clickwatch.model.Node>();
  private java.util.Collection<de.hub.clickwatch.model.util.builder.IModelBuilder<? extends de.hub.clickwatch.model.Node>> m_featureNodesBuilder = new java.util.LinkedList<de.hub.clickwatch.model.util.builder.IModelBuilder<? extends de.hub.clickwatch.model.Node>>();
  // helper attributes
  private boolean m_featureBackboneSet = false;
  private boolean m_featureConnectedSet = false;
  private boolean m_featureConnectionSet = false;
  private boolean m_featureElementsSet = false;
  private boolean m_featureHasRecordSet = false;
  private boolean m_featureINetAddressSet = false;
  private boolean m_featureNodesSet = false;
  private boolean m_featurePortSet = false;
  private boolean m_featureRecordingSet = false;
  private boolean m_featureRetrievingSet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newMultiNodeBuilder()
   */
  private MultiNodeBuilder() {
  }

  /**
   * This method creates a new instance of the MultiNodeBuilder.
   * @return new instance of the MultiNodeBuilder
   */
  public static MultiNodeBuilder newMultiNodeBuilder() {
    return new MultiNodeBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public MultiNodeBuilder but() {
    MultiNodeBuilder _builder = newMultiNodeBuilder();
    _builder.m_featureBackboneSet = m_featureBackboneSet;
    _builder.m_backbone = m_backbone;
    _builder.m_featureConnectedSet = m_featureConnectedSet;
    _builder.m_connected = m_connected;
    _builder.m_featureConnectionSet = m_featureConnectionSet;
    _builder.m_connection = m_connection;
    _builder.m_featureElementsSet = m_featureElementsSet;
    _builder.m_elements = m_elements;
    _builder.m_featureElementsBuilder = m_featureElementsBuilder;
    _builder.m_featureHasRecordSet = m_featureHasRecordSet;
    _builder.m_hasRecord = m_hasRecord;
    _builder.m_featureINetAddressSet = m_featureINetAddressSet;
    _builder.m_iNetAddress = m_iNetAddress;
    _builder.m_featureNodesSet = m_featureNodesSet;
    _builder.m_nodes = m_nodes;
    _builder.m_featureNodesBuilder = m_featureNodesBuilder;
    _builder.m_featurePortSet = m_featurePortSet;
    _builder.m_port = m_port;
    _builder.m_featureRecordingSet = m_featureRecordingSet;
    _builder.m_recording = m_recording;
    _builder.m_featureRetrievingSet = m_featureRetrievingSet;
    _builder.m_retrieving = m_retrieving;
    return _builder;
  }

  /**
   * This method constructs the final de.hub.clickwatch.model.MultiNode type.
   * @return new instance of the de.hub.clickwatch.model.MultiNode type
   */
  public de.hub.clickwatch.model.MultiNode build() {
    final de.hub.clickwatch.model.MultiNode _newInstance = de.hub.clickwatch.model.ClickWatchModelFactory.eINSTANCE.createMultiNode();
    if (m_featureBackboneSet) {
      _newInstance.setBackbone(m_backbone);
    }
    if (m_featureConnectedSet) {
      _newInstance.setConnected(m_connected);
    }
    if (m_featureConnectionSet) {
      _newInstance.setConnection(m_connection);
    }
    if (m_featureHasRecordSet) {
      _newInstance.setHasRecord(m_hasRecord);
    }
    if (m_featureINetAddressSet) {
      _newInstance.setINetAddress(m_iNetAddress);
    }
    if (m_featurePortSet) {
      _newInstance.setPort(m_port);
    }
    if (m_featureRecordingSet) {
      _newInstance.setRecording(m_recording);
    }
    if (m_featureRetrievingSet) {
      _newInstance.setRetrieving(m_retrieving);
    }
    if (m_featureElementsSet) {
      _newInstance.getElements().addAll(m_elements);
    } else {
      if (!m_featureElementsBuilder.isEmpty()) {
        for (de.hub.clickwatch.model.util.builder.IModelBuilder<? extends de.hub.clickwatch.model.Element> builder : m_featureElementsBuilder) {
          _newInstance.getElements().add(builder.build());
        }
      }
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
    return _newInstance;
  }

  public MultiNodeBuilder withBackbone(de.hub.clickwatch.model.BackboneType p_backbone) {
    m_backbone = p_backbone;
    m_featureBackboneSet = true;
    return this;
  }

  public MultiNodeBuilder withConnected(Boolean p_connected) {
    m_connected = p_connected;
    m_featureConnectedSet = true;
    return this;
  }

  public MultiNodeBuilder withConnection(java.lang.Object p_connection) {
    m_connection = p_connection;
    m_featureConnectionSet = true;
    return this;
  }

  public MultiNodeBuilder withHasRecord(Boolean p_hasRecord) {
    m_hasRecord = p_hasRecord;
    m_featureHasRecordSet = true;
    return this;
  }

  public MultiNodeBuilder withINetAddress(java.lang.String p_iNetAddress) {
    m_iNetAddress = p_iNetAddress;
    m_featureINetAddressSet = true;
    return this;
  }

  public MultiNodeBuilder withPort(java.lang.String p_port) {
    m_port = p_port;
    m_featurePortSet = true;
    return this;
  }

  public MultiNodeBuilder withRecording(Boolean p_recording) {
    m_recording = p_recording;
    m_featureRecordingSet = true;
    return this;
  }

  public MultiNodeBuilder withRetrieving(Boolean p_retrieving) {
    m_retrieving = p_retrieving;
    m_featureRetrievingSet = true;
    return this;
  }

  public MultiNodeBuilder withElements(de.hub.clickwatch.model.Element p_elements) {
    m_elements.add(p_elements);
    m_featureElementsSet = true;
    return this;
  }

  public MultiNodeBuilder withElements(java.util.Collection<? extends de.hub.clickwatch.model.Element> p_elements) {
    m_elements.addAll(p_elements);
    m_featureElementsSet = true;
    return this;
  }

  public MultiNodeBuilder withElements(de.hub.clickwatch.model.util.builder.IModelBuilder<? extends de.hub.clickwatch.model.Element> p_elementBuilder) {
    m_featureElementsBuilder.add(p_elementBuilder);
    return this;
  }

  public MultiNodeBuilder withNodes(de.hub.clickwatch.model.Node p_nodes) {
    m_nodes.add(p_nodes);
    m_featureNodesSet = true;
    return this;
  }

  public MultiNodeBuilder withNodes(java.util.Collection<? extends de.hub.clickwatch.model.Node> p_nodes) {
    m_nodes.addAll(p_nodes);
    m_featureNodesSet = true;
    return this;
  }

  public MultiNodeBuilder withNodes(de.hub.clickwatch.model.util.builder.IModelBuilder<? extends de.hub.clickwatch.model.Node> p_nodeBuilder) {
    m_featureNodesBuilder.add(p_nodeBuilder);
    return this;
  }
}
