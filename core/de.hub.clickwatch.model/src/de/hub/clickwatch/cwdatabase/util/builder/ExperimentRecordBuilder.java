package de.hub.clickwatch.cwdatabase.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>de.hub.clickwatch.cwdatabase.ExperimentRecord</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class ExperimentRecordBuilder implements de.hub.clickwatch.cwdatabase.util.builder.ICwdatabaseBuilder<de.hub.clickwatch.cwdatabase.ExperimentRecord> {
  // features and builders
  private java.lang.String m_name;
  private java.util.Collection<de.hub.clickwatch.model.Node> m_metaData = new java.util.LinkedList<de.hub.clickwatch.model.Node>();
  private java.util.Collection<de.hub.clickwatch.model.util.builder.IModelBuilder<? extends de.hub.clickwatch.model.Node>> m_featureMetaDataBuilder = new java.util.LinkedList<de.hub.clickwatch.model.util.builder.IModelBuilder<? extends de.hub.clickwatch.model.Node>>();
  private java.util.Collection<java.util.Map.Entry<java.lang.String, de.hub.clickwatch.cwdatabase.ExperimentNodeRecordTimeTable>> m_nodeMap = new java.util.LinkedList<java.util.Map.Entry<java.lang.String, de.hub.clickwatch.cwdatabase.ExperimentNodeRecordTimeTable>>();
  // helper attributes
  private boolean m_featureMetaDataSet = false;
  private boolean m_featureNameSet = false;
  private boolean m_featureNodeMapSet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newExperimentRecordBuilder()
   */
  private ExperimentRecordBuilder() {
  }

  /**
   * This method creates a new instance of the ExperimentRecordBuilder.
   * @return new instance of the ExperimentRecordBuilder
   */
  public static ExperimentRecordBuilder newExperimentRecordBuilder() {
    return new ExperimentRecordBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public ExperimentRecordBuilder but() {
    ExperimentRecordBuilder _builder = newExperimentRecordBuilder();
    _builder.m_featureMetaDataSet = m_featureMetaDataSet;
    _builder.m_metaData = m_metaData;
    _builder.m_featureMetaDataBuilder = m_featureMetaDataBuilder;
    _builder.m_featureNameSet = m_featureNameSet;
    _builder.m_name = m_name;
    _builder.m_featureNodeMapSet = m_featureNodeMapSet;
    _builder.m_nodeMap = m_nodeMap;
    return _builder;
  }

  /**
   * This method constructs the final de.hub.clickwatch.cwdatabase.ExperimentRecord type.
   * @return new instance of the de.hub.clickwatch.cwdatabase.ExperimentRecord type
   */
  public de.hub.clickwatch.cwdatabase.ExperimentRecord build() {
    final de.hub.clickwatch.cwdatabase.ExperimentRecord _newInstance = de.hub.clickwatch.cwdatabase.CWDataBaseFactory.eINSTANCE.createExperimentRecord();
    if (m_featureNameSet) {
      _newInstance.setName(m_name);
    }
    if (m_featureMetaDataSet) {
      _newInstance.getMetaData().addAll(m_metaData);
    } else {
      if (!m_featureMetaDataBuilder.isEmpty()) {
        for (de.hub.clickwatch.model.util.builder.IModelBuilder<? extends de.hub.clickwatch.model.Node> builder : m_featureMetaDataBuilder) {
          _newInstance.getMetaData().add(builder.build());
        }
      }
    }
    if (m_featureNodeMapSet) {
      _newInstance.getNodeMap().addAll(m_nodeMap);
    }
    return _newInstance;
  }

  public ExperimentRecordBuilder withName(java.lang.String p_name) {
    m_name = p_name;
    m_featureNameSet = true;
    return this;
  }

  public ExperimentRecordBuilder withMetaData(de.hub.clickwatch.model.Node p_metaData) {
    m_metaData.add(p_metaData);
    m_featureMetaDataSet = true;
    return this;
  }

  public ExperimentRecordBuilder withMetaData(java.util.Collection<? extends de.hub.clickwatch.model.Node> p_metaData) {
    m_metaData.addAll(p_metaData);
    m_featureMetaDataSet = true;
    return this;
  }

  public ExperimentRecordBuilder withMetaData(de.hub.clickwatch.model.util.builder.IModelBuilder<? extends de.hub.clickwatch.model.Node> p_nodeBuilder) {
    m_featureMetaDataBuilder.add(p_nodeBuilder);
    return this;
  }

  public ExperimentRecordBuilder withNodeMap(java.util.Map.Entry<java.lang.String, de.hub.clickwatch.cwdatabase.ExperimentNodeRecordTimeTable> p_nodeMap) {
    m_nodeMap.add(p_nodeMap);
    m_featureNodeMapSet = true;
    return this;
  }

  public ExperimentRecordBuilder withNodeMap(java.util.Collection<? extends java.util.Map.Entry<java.lang.String, de.hub.clickwatch.cwdatabase.ExperimentNodeRecordTimeTable>> p_nodeMap) {
    m_nodeMap.addAll(p_nodeMap);
    m_featureNodeMapSet = true;
    return this;
  }
}
