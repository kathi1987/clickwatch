package de.hub.clickwatch.cwdatabase.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>de.hub.clickwatch.cwdatabase.ExperimentNodeRecordTimeTable</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class ExperimentNodeRecordTimeTableBuilder implements de.hub.clickwatch.cwdatabase.util.builder.ICwdatabaseBuilder<de.hub.clickwatch.cwdatabase.ExperimentNodeRecordTimeTable> {
  // features and builders
  private java.util.Collection<java.util.Map.Entry<java.lang.Long, de.hub.clickwatch.cwdatabase.NodeRecordDescr>> m_nodeMap = new java.util.LinkedList<java.util.Map.Entry<java.lang.Long, de.hub.clickwatch.cwdatabase.NodeRecordDescr>>();
  // helper attributes
  private boolean m_featureNodeMapSet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newExperimentNodeRecordTimeTableBuilder()
   */
  private ExperimentNodeRecordTimeTableBuilder() {
  }

  /**
   * This method creates a new instance of the ExperimentNodeRecordTimeTableBuilder.
   * @return new instance of the ExperimentNodeRecordTimeTableBuilder
   */
  public static ExperimentNodeRecordTimeTableBuilder newExperimentNodeRecordTimeTableBuilder() {
    return new ExperimentNodeRecordTimeTableBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public ExperimentNodeRecordTimeTableBuilder but() {
    ExperimentNodeRecordTimeTableBuilder _builder = newExperimentNodeRecordTimeTableBuilder();
    _builder.m_featureNodeMapSet = m_featureNodeMapSet;
    _builder.m_nodeMap = m_nodeMap;
    return _builder;
  }

  /**
   * This method constructs the final de.hub.clickwatch.cwdatabase.ExperimentNodeRecordTimeTable type.
   * @return new instance of the de.hub.clickwatch.cwdatabase.ExperimentNodeRecordTimeTable type
   */
  public de.hub.clickwatch.cwdatabase.ExperimentNodeRecordTimeTable build() {
    final de.hub.clickwatch.cwdatabase.ExperimentNodeRecordTimeTable _newInstance = de.hub.clickwatch.cwdatabase.CWDataBaseFactory.eINSTANCE.createExperimentNodeRecordTimeTable();
    if (m_featureNodeMapSet) {
      _newInstance.getNodeMap().addAll(m_nodeMap);
    }
    return _newInstance;
  }

  public ExperimentNodeRecordTimeTableBuilder withNodeMap(java.util.Map.Entry<java.lang.Long, de.hub.clickwatch.cwdatabase.NodeRecordDescr> p_nodeMap) {
    m_nodeMap.add(p_nodeMap);
    m_featureNodeMapSet = true;
    return this;
  }

  public ExperimentNodeRecordTimeTableBuilder withNodeMap(java.util.Collection<? extends java.util.Map.Entry<java.lang.Long, de.hub.clickwatch.cwdatabase.NodeRecordDescr>> p_nodeMap) {
    m_nodeMap.addAll(p_nodeMap);
    m_featureNodeMapSet = true;
    return this;
  }
}
