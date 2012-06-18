package de.hub.clickwatch.datamodel.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>de.hub.clickwatch.datamodel.Node</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class NodeBuilder implements de.hub.clickwatch.datamodel.util.builder.IDatamodelBuilder<de.hub.clickwatch.datamodel.Node> {
  // features and builders
  private de.hub.clickwatch.datamodel.BackboneType m_backbone;
  private de.hub.clickwatch.connection.INodeConnection m_connection;
  private java.lang.String m_iNetAddress;
  private Boolean m_listening;
  private java.lang.String m_port;
  private Boolean m_recording;
  private Boolean m_retrieving;
  private de.hub.clickwatch.datamodel.StatisticsContainer m_statistics;
  private de.hub.clickwatch.datamodel.util.builder.IDatamodelBuilder<? extends de.hub.clickwatch.datamodel.StatisticsContainer> m_featureStatisticsBuilder;
  private java.util.Collection<de.hub.clickwatch.datamodel.Element> m_elements = new java.util.LinkedList<de.hub.clickwatch.datamodel.Element>();
  private java.util.Collection<de.hub.clickwatch.datamodel.util.builder.IDatamodelBuilder<? extends de.hub.clickwatch.datamodel.Element>> m_featureElementsBuilder = new java.util.LinkedList<de.hub.clickwatch.datamodel.util.builder.IDatamodelBuilder<? extends de.hub.clickwatch.datamodel.Element>>();
  private java.util.Collection<de.hub.clickwatch.datamodel.ClickWatchError> m_errors = new java.util.LinkedList<de.hub.clickwatch.datamodel.ClickWatchError>();
  private java.util.Collection<de.hub.clickwatch.datamodel.util.builder.IDatamodelBuilder<? extends de.hub.clickwatch.datamodel.ClickWatchError>> m_featureErrorsBuilder = new java.util.LinkedList<de.hub.clickwatch.datamodel.util.builder.IDatamodelBuilder<? extends de.hub.clickwatch.datamodel.ClickWatchError>>();
  private java.util.Collection<de.hub.clickwatch.analysis.traceable.Traceable> m_tracesFrom = new java.util.LinkedList<de.hub.clickwatch.analysis.traceable.Traceable>();
  private java.util.Collection<de.hub.clickwatch.analysis.traceable.util.builder.ITraceableBuilder<? extends de.hub.clickwatch.analysis.traceable.Traceable>> m_featureTracesFromBuilder = new java.util.LinkedList<de.hub.clickwatch.analysis.traceable.util.builder.ITraceableBuilder<? extends de.hub.clickwatch.analysis.traceable.Traceable>>();
  private java.util.Collection<de.hub.clickwatch.analysis.traceable.Traceable> m_tracesTo = new java.util.LinkedList<de.hub.clickwatch.analysis.traceable.Traceable>();
  private java.util.Collection<de.hub.clickwatch.analysis.traceable.util.builder.ITraceableBuilder<? extends de.hub.clickwatch.analysis.traceable.Traceable>> m_featureTracesToBuilder = new java.util.LinkedList<de.hub.clickwatch.analysis.traceable.util.builder.ITraceableBuilder<? extends de.hub.clickwatch.analysis.traceable.Traceable>>();
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
  private boolean m_featureTracesFromSet = false;
  private boolean m_featureTracesToSet = false;

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
    _builder.m_featureTracesFromSet = m_featureTracesFromSet;
    _builder.m_tracesFrom = m_tracesFrom;
    _builder.m_featureTracesFromBuilder = m_featureTracesFromBuilder;
    _builder.m_featureTracesToSet = m_featureTracesToSet;
    _builder.m_tracesTo = m_tracesTo;
    _builder.m_featureTracesToBuilder = m_featureTracesToBuilder;
    return _builder;
  }

  /**
   * This method constructs the final de.hub.clickwatch.datamodel.Node type.
   * @return new instance of the de.hub.clickwatch.datamodel.Node type
   */
  public de.hub.clickwatch.datamodel.Node build() {
    final de.hub.clickwatch.datamodel.Node _newInstance = de.hub.clickwatch.datamodel.ClickWatchDataModelFactory.eINSTANCE.createNode();
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
        for (de.hub.clickwatch.datamodel.util.builder.IDatamodelBuilder<? extends de.hub.clickwatch.datamodel.Element> builder : m_featureElementsBuilder) {
          _newInstance.getElements().add(builder.build());
        }
      }
    }
    if (m_featureErrorsSet) {
      _newInstance.getErrors().addAll(m_errors);
    } else {
      if (!m_featureErrorsBuilder.isEmpty()) {
        for (de.hub.clickwatch.datamodel.util.builder.IDatamodelBuilder<? extends de.hub.clickwatch.datamodel.ClickWatchError> builder : m_featureErrorsBuilder) {
          _newInstance.getErrors().add(builder.build());
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

  public NodeBuilder withBackbone(de.hub.clickwatch.datamodel.BackboneType p_backbone) {
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

  public NodeBuilder withStatistics(de.hub.clickwatch.datamodel.StatisticsContainer p_statistics) {
    m_statistics = p_statistics;
    m_featureStatisticsSet = true;
    return this;
  }

  public NodeBuilder withStatistics(de.hub.clickwatch.datamodel.util.builder.IDatamodelBuilder<? extends de.hub.clickwatch.datamodel.StatisticsContainer> p_statisticsContainerBuilder) {
    m_featureStatisticsBuilder = p_statisticsContainerBuilder;
    return this;
  }

  public NodeBuilder withElements(de.hub.clickwatch.datamodel.Element p_elements) {
    m_elements.add(p_elements);
    m_featureElementsSet = true;
    return this;
  }

  public NodeBuilder withElements(java.util.Collection<? extends de.hub.clickwatch.datamodel.Element> p_elements) {
    m_elements.addAll(p_elements);
    m_featureElementsSet = true;
    return this;
  }

  public NodeBuilder withElements(de.hub.clickwatch.datamodel.util.builder.IDatamodelBuilder<? extends de.hub.clickwatch.datamodel.Element> p_elementBuilder) {
    m_featureElementsBuilder.add(p_elementBuilder);
    return this;
  }

  public NodeBuilder withErrors(de.hub.clickwatch.datamodel.ClickWatchError p_errors) {
    m_errors.add(p_errors);
    m_featureErrorsSet = true;
    return this;
  }

  public NodeBuilder withErrors(java.util.Collection<? extends de.hub.clickwatch.datamodel.ClickWatchError> p_errors) {
    m_errors.addAll(p_errors);
    m_featureErrorsSet = true;
    return this;
  }

  public NodeBuilder withErrors(de.hub.clickwatch.datamodel.util.builder.IDatamodelBuilder<? extends de.hub.clickwatch.datamodel.ClickWatchError> p_clickWatchErrorBuilder) {
    m_featureErrorsBuilder.add(p_clickWatchErrorBuilder);
    return this;
  }

  public NodeBuilder withTracesFrom(de.hub.clickwatch.analysis.traceable.Traceable p_tracesFrom) {
    m_tracesFrom.add(p_tracesFrom);
    m_featureTracesFromSet = true;
    return this;
  }

  public NodeBuilder withTracesFrom(java.util.Collection<? extends de.hub.clickwatch.analysis.traceable.Traceable> p_tracesFrom) {
    m_tracesFrom.addAll(p_tracesFrom);
    m_featureTracesFromSet = true;
    return this;
  }

  public NodeBuilder withTracesFrom(de.hub.clickwatch.analysis.traceable.util.builder.ITraceableBuilder<? extends de.hub.clickwatch.analysis.traceable.Traceable> p_traceableBuilder) {
    m_featureTracesFromBuilder.add(p_traceableBuilder);
    return this;
  }

  public NodeBuilder withTracesTo(de.hub.clickwatch.analysis.traceable.Traceable p_tracesTo) {
    m_tracesTo.add(p_tracesTo);
    m_featureTracesToSet = true;
    return this;
  }

  public NodeBuilder withTracesTo(java.util.Collection<? extends de.hub.clickwatch.analysis.traceable.Traceable> p_tracesTo) {
    m_tracesTo.addAll(p_tracesTo);
    m_featureTracesToSet = true;
    return this;
  }

  public NodeBuilder withTracesTo(de.hub.clickwatch.analysis.traceable.util.builder.ITraceableBuilder<? extends de.hub.clickwatch.analysis.traceable.Traceable> p_traceableBuilder) {
    m_featureTracesToBuilder.add(p_traceableBuilder);
    return this;
  }
}
