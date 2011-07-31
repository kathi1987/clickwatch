package de.hub.clickwatch.recoder.cwdatabase.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>de.hub.clickwatch.recoder.cwdatabase.NodeRecordDescr</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class NodeRecordDescrBuilder implements de.hub.clickwatch.recoder.cwdatabase.util.builder.ICwdatabaseBuilder<de.hub.clickwatch.recoder.cwdatabase.NodeRecordDescr> {
  // features and builders
  private de.hub.clickwatch.recoder.cwdatabase.NodeRecord m_record;
  private de.hub.clickwatch.recoder.cwdatabase.util.builder.ICwdatabaseBuilder<? extends de.hub.clickwatch.recoder.cwdatabase.NodeRecord> m_featureRecordBuilder;
  // helper attributes
  private boolean m_featureRecordSet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newNodeRecordDescrBuilder()
   */
  private NodeRecordDescrBuilder() {
  }

  /**
   * This method creates a new instance of the NodeRecordDescrBuilder.
   * @return new instance of the NodeRecordDescrBuilder
   */
  public static NodeRecordDescrBuilder newNodeRecordDescrBuilder() {
    return new NodeRecordDescrBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public NodeRecordDescrBuilder but() {
    NodeRecordDescrBuilder _builder = newNodeRecordDescrBuilder();
    _builder.m_featureRecordSet = m_featureRecordSet;
    _builder.m_record = m_record;
    _builder.m_featureRecordBuilder = m_featureRecordBuilder;
    return _builder;
  }

  /**
   * This method constructs the final de.hub.clickwatch.recoder.cwdatabase.NodeRecordDescr type.
   * @return new instance of the de.hub.clickwatch.recoder.cwdatabase.NodeRecordDescr type
   */
  public de.hub.clickwatch.recoder.cwdatabase.NodeRecordDescr build() {
    final de.hub.clickwatch.recoder.cwdatabase.NodeRecordDescr _newInstance = de.hub.clickwatch.recoder.cwdatabase.CWDataBaseFactory.eINSTANCE.createNodeRecordDescr();
    if (m_featureRecordSet) {
      _newInstance.setRecord(m_record);
    } else {
      if (m_featureRecordBuilder != null) {
        _newInstance.setRecord(m_featureRecordBuilder.build());
      }
    }
    return _newInstance;
  }

  public NodeRecordDescrBuilder withRecord(de.hub.clickwatch.recoder.cwdatabase.NodeRecord p_record) {
    m_record = p_record;
    m_featureRecordSet = true;
    return this;
  }

  public NodeRecordDescrBuilder withRecord(de.hub.clickwatch.recoder.cwdatabase.util.builder.ICwdatabaseBuilder<? extends de.hub.clickwatch.recoder.cwdatabase.NodeRecord> p_nodeRecordBuilder) {
    m_featureRecordBuilder = p_nodeRecordBuilder;
    return this;
  }
}
