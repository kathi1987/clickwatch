package de.hub.clickwatch.model.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>de.hub.clickwatch.model.Node</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class NodeBuilder implements de.hub.clickwatch.model.util.builder.IModelBuilder<de.hub.clickwatch.model.Node> {
  // features and builders
  private de.hub.clickwatch.model.BackboneType m_backbone;
  private de.hub.clickwatch.connection.INodeConnection m_connection;
  private java.lang.String m_iNetAddress;
  private Boolean m_listening;
  private java.lang.String m_port;
  private Boolean m_recording;
  private Boolean m_retrieving;
  private de.hub.clickwatch.model.StatisticsContainer m_statistics;
  private de.hub.clickwatch.model.util.builder.IModelBuilder<? extends de.hub.clickwatch.model.StatisticsContainer> m_featureStatisticsBuilder;
  private java.util.Collection<de.hub.clickwatch.model.Element> m_elements = new java.util.LinkedList<de.hub.clickwatch.model.Element>();
  private java.util.Collection<de.hub.clickwatch.model.util.builder.IModelBuilder<? extends de.hub.clickwatch.model.Element>> m_featureElementsBuilder = new java.util.LinkedList<de.hub.clickwatch.model.util.builder.IModelBuilder<? extends de.hub.clickwatch.model.Element>>();
  private java.util.Collection<de.hub.clickwatch.model.ClickWatchError> m_errors = new java.util.LinkedList<de.hub.clickwatch.model.ClickWatchError>();
  private java.util.Collection<de.hub.clickwatch.model.util.builder.IModelBuilder<? extends de.hub.clickwatch.model.ClickWatchError>> m_featureErrorsBuilder = new java.util.LinkedList<de.hub.clickwatch.model.util.builder.IModelBuilder<? extends de.hub.clickwatch.model.ClickWatchError>>();
  // helper attributes
  private boolean m_featureBackboneSet = false;
  private boolean m_featureConnectionSet = false;
  private boolean m_featureElementsSet = false;
  private boolean m_featureErrorsSet = false;
  private boolean m_featureINetAddressSet = false;
  private boolean m_featureListeningSet = false;
  private boolean m_featurePortSet = false;
  private boolean m_featureRecordingSet = false;
  private boolean m_featureRetrievingSet = false;
  private boolean m_featureStatisticsSet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newNodeBuilder()
   */
  private NodeBuilder() {
  }

  /**
   * This method creates a new instance of the NodeBuilder.
   * @return new instance of the NodeBuilder
   */
  public static NodeBuilder newNodeBuilder() {
    return new NodeBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public NodeBuilder but() {
    NodeBuilder _builder = newNodeBuilder();
    _builder.m_featureBackboneSet = m_featureBackboneSet;
    _builder.m_backbone = m_backbone;
    _builder.m_featureConnectionSet = m_featureConnectionSet;
    _builder.m_connection = m_connection;
    _builder.m_featureElementsSet = m_featureElementsSet;
    _builder.m_elements = m_elements;
    _builder.m_featureElementsBuilder = m_featureElementsBuilder;
    _builder.m_featureErrorsSet = m_featureErrorsSet;
    _builder.m_errors = m_errors;
    _builder.m_featureErrorsBuilder = m_featureErrorsBuilder;
    _builder.m_featureINetAddressSet = m_featureINetAddressSet;
    _builder.m_iNetAddress = m_iNetAddress;
    _builder.m_featureListeningSet = m_featureListeningSet;
    _builder.m_listening = m_listening;
    _builder.m_featurePortSet = m_featurePortSet;
    _builder.m_port = m_port;
    _builder.m_featureRecordingSet = m_featureRecordingSet;
    _builder.m_recording = m_recording;
    _builder.m_featureRetrievingSet = m_featureRetrievingSet;
    _builder.m_retrieving = m_retrieving;
    _builder.m_featureStatisticsSet = m_featureStatisticsSet;
    _builder.m_statistics = m_statistics;
    _builder.m_featureStatisticsBuilder = m_featureStatisticsBuilder;
    return _builder;
  }

  /**
   * This method constructs the final de.hub.clickwatch.model.Node type.
   * @return new instance of the de.hub.clickwatch.model.Node type
   */
  public de.hub.clickwatch.model.Node build() {
    final de.hub.clickwatch.model.Node _newInstance = de.hub.clickwatch.model.ClickWatchModelFactory.eINSTANCE.createNode();
    if (m_featureBackboneSet) {
      _newInstance.setBackbone(m_backbone);
    }
    if (m_featureConnectionSet) {
      _newInstance.setConnection(m_connection);
    }
    if (m_featureINetAddressSet) {
      _newInstance.setINetAddress(m_iNetAddress);
    }
    if (m_featureListeningSet) {
      _newInstance.setListening(m_listening);
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
    if (m_featureStatisticsSet) {
      _newInstance.setStatistics(m_statistics);
    } else {
      if (m_featureStatisticsBuilder != null) {
        _newInstance.setStatistics(m_featureStatisticsBuilder.build());
      }
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
    if (m_featureErrorsSet) {
      _newInstance.getErrors().addAll(m_errors);
    } else {
      if (!m_featureErrorsBuilder.isEmpty()) {
        for (de.hub.clickwatch.model.util.builder.IModelBuilder<? extends de.hub.clickwatch.model.ClickWatchError> builder : m_featureErrorsBuilder) {
          _newInstance.getErrors().add(builder.build());
        }
      }
    }
    return _newInstance;
  }

  public NodeBuilder withBackbone(de.hub.clickwatch.model.BackboneType p_backbone) {
    m_backbone = p_backbone;
    m_featureBackboneSet = true;
    return this;
  }

  public NodeBuilder withConnection(de.hub.clickwatch.connection.INodeConnection p_connection) {
    m_connection = p_connection;
    m_featureConnectionSet = true;
    return this;
  }

  public NodeBuilder withINetAddress(java.lang.String p_iNetAddress) {
    m_iNetAddress = p_iNetAddress;
    m_featureINetAddressSet = true;
    return this;
  }

  public NodeBuilder withListening(Boolean p_listening) {
    m_listening = p_listening;
    m_featureListeningSet = true;
    return this;
  }

  public NodeBuilder withPort(java.lang.String p_port) {
    m_port = p_port;
    m_featurePortSet = true;
    return this;
  }

  public NodeBuilder withRecording(Boolean p_recording) {
    m_recording = p_recording;
    m_featureRecordingSet = true;
    return this;
  }

  public NodeBuilder withRetrieving(Boolean p_retrieving) {
    m_retrieving = p_retrieving;
    m_featureRetrievingSet = true;
    return this;
  }

  public NodeBuilder withStatistics(de.hub.clickwatch.model.StatisticsContainer p_statistics) {
    m_statistics = p_statistics;
    m_featureStatisticsSet = true;
    return this;
  }

  public NodeBuilder withStatistics(de.hub.clickwatch.model.util.builder.IModelBuilder<? extends de.hub.clickwatch.model.StatisticsContainer> p_statisticsContainerBuilder) {
    m_featureStatisticsBuilder = p_statisticsContainerBuilder;
    return this;
  }

  public NodeBuilder withElements(de.hub.clickwatch.model.Element p_elements) {
    m_elements.add(p_elements);
    m_featureElementsSet = true;
    return this;
  }

  public NodeBuilder withElements(java.util.Collection<? extends de.hub.clickwatch.model.Element> p_elements) {
    m_elements.addAll(p_elements);
    m_featureElementsSet = true;
    return this;
  }

  public NodeBuilder withElements(de.hub.clickwatch.model.util.builder.IModelBuilder<? extends de.hub.clickwatch.model.Element> p_elementBuilder) {
    m_featureElementsBuilder.add(p_elementBuilder);
    return this;
  }

  public NodeBuilder withErrors(de.hub.clickwatch.model.ClickWatchError p_errors) {
    m_errors.add(p_errors);
    m_featureErrorsSet = true;
    return this;
  }

  public NodeBuilder withErrors(java.util.Collection<? extends de.hub.clickwatch.model.ClickWatchError> p_errors) {
    m_errors.addAll(p_errors);
    m_featureErrorsSet = true;
    return this;
  }

  public NodeBuilder withErrors(de.hub.clickwatch.model.util.builder.IModelBuilder<? extends de.hub.clickwatch.model.ClickWatchError> p_clickWatchErrorBuilder) {
    m_featureErrorsBuilder.add(p_clickWatchErrorBuilder);
    return this;
  }
}
