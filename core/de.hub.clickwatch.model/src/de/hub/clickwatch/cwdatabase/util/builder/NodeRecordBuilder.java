package de.hub.clickwatch.cwdatabase.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>de.hub.clickwatch.cwdatabase.NodeRecord</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class NodeRecordBuilder implements de.hub.clickwatch.cwdatabase.util.builder.ICwdatabaseBuilder<de.hub.clickwatch.cwdatabase.NodeRecord> {
  // features and builders
  private long m_end;
  private java.lang.String m_node;
  private long m_start;
  private java.util.Collection<de.hub.clickwatch.model.Handler> m_records = new java.util.LinkedList<de.hub.clickwatch.model.Handler>();
  private java.util.Collection<de.hub.clickwatch.model.util.builder.IModelBuilder<? extends de.hub.clickwatch.model.Handler>> m_featureRecordsBuilder = new java.util.LinkedList<de.hub.clickwatch.model.util.builder.IModelBuilder<? extends de.hub.clickwatch.model.Handler>>();
  // helper attributes
  private boolean m_featureEndSet = false;
  private boolean m_featureNodeSet = false;
  private boolean m_featureRecordsSet = false;
  private boolean m_featureStartSet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newNodeRecordBuilder()
   */
  private NodeRecordBuilder() {
  }

  /**
   * This method creates a new instance of the NodeRecordBuilder.
   * @return new instance of the NodeRecordBuilder
   */
  public static NodeRecordBuilder newNodeRecordBuilder() {
    return new NodeRecordBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public NodeRecordBuilder but() {
    NodeRecordBuilder _builder = newNodeRecordBuilder();
    _builder.m_featureEndSet = m_featureEndSet;
    _builder.m_end = m_end;
    _builder.m_featureNodeSet = m_featureNodeSet;
    _builder.m_node = m_node;
    _builder.m_featureRecordsSet = m_featureRecordsSet;
    _builder.m_records = m_records;
    _builder.m_featureRecordsBuilder = m_featureRecordsBuilder;
    _builder.m_featureStartSet = m_featureStartSet;
    _builder.m_start = m_start;
    return _builder;
  }

  /**
   * This method constructs the final de.hub.clickwatch.cwdatabase.NodeRecord type.
   * @return new instance of the de.hub.clickwatch.cwdatabase.NodeRecord type
   */
  public de.hub.clickwatch.cwdatabase.NodeRecord build() {
    final de.hub.clickwatch.cwdatabase.NodeRecord _newInstance = de.hub.clickwatch.cwdatabase.CWDataBaseFactory.eINSTANCE.createNodeRecord();
    if (m_featureEndSet) {
      _newInstance.setEnd(m_end);
    }
    if (m_featureNodeSet) {
      _newInstance.setNode(m_node);
    }
    if (m_featureStartSet) {
      _newInstance.setStart(m_start);
    }
    if (m_featureRecordsSet) {
      _newInstance.getRecords().addAll(m_records);
    } else {
      if (!m_featureRecordsBuilder.isEmpty()) {
        for (de.hub.clickwatch.model.util.builder.IModelBuilder<? extends de.hub.clickwatch.model.Handler> builder : m_featureRecordsBuilder) {
          _newInstance.getRecords().add(builder.build());
        }
      }
    }
    return _newInstance;
  }

  public NodeRecordBuilder withEnd(long p_end) {
    m_end = p_end;
    m_featureEndSet = true;
    return this;
  }

  public NodeRecordBuilder withNode(java.lang.String p_node) {
    m_node = p_node;
    m_featureNodeSet = true;
    return this;
  }

  public NodeRecordBuilder withStart(long p_start) {
    m_start = p_start;
    m_featureStartSet = true;
    return this;
  }

  public NodeRecordBuilder withRecords(de.hub.clickwatch.model.Handler p_records) {
    m_records.add(p_records);
    m_featureRecordsSet = true;
    return this;
  }

  public NodeRecordBuilder withRecords(java.util.Collection<? extends de.hub.clickwatch.model.Handler> p_records) {
    m_records.addAll(p_records);
    m_featureRecordsSet = true;
    return this;
  }

  public NodeRecordBuilder withRecords(de.hub.clickwatch.model.util.builder.IModelBuilder<? extends de.hub.clickwatch.model.Handler> p_handlerBuilder) {
    m_featureRecordsBuilder.add(p_handlerBuilder);
    return this;
  }
}
