package de.hub.clickwatch.recorder.database.cwdatabase.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>de.hub.clickwatch.recoder.cwdatabase.RecordStatistics</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class RecordStatisticsBuilder implements de.hub.clickwatch.recorder.database.cwdatabase.util.builder.ICwdatabaseBuilder<de.hub.clickwatch.recorder.database.cwdatabase.RecordStatistics> {
  // features and builders
  private org.apache.commons.math.stat.descriptive.SummaryStatistics m_bytesRequestS;
  private org.apache.commons.math.stat.descriptive.SummaryStatistics m_cpuLoadS;
  private org.apache.commons.math.stat.descriptive.SummaryStatistics m_handlersN;
  private org.apache.commons.math.stat.descriptive.SummaryStatistics m_handlersPulledS;
  private org.apache.commons.math.stat.descriptive.SummaryStatistics m_handlersR;
  private org.apache.commons.math.stat.descriptive.SummaryStatistics m_nodesA;
  private org.apache.commons.math.stat.descriptive.SummaryStatistics m_recordSize;
  private org.apache.commons.math.stat.descriptive.SummaryStatistics m_samplesN;
  private org.apache.commons.math.stat.descriptive.SummaryStatistics m_samplesR;
  private org.apache.commons.math.stat.descriptive.SummaryStatistics m_timeA;
  private org.apache.commons.math.stat.descriptive.SummaryStatistics m_timeN;
  private org.apache.commons.math.stat.descriptive.SummaryStatistics m_timeRequestS;
  private org.apache.commons.math.stat.descriptive.SummaryStatistics m_timeS;
  // helper attributes
  private boolean m_featureBytesRequestSSet = false;
  private boolean m_featureCpuLoadSSet = false;
  private boolean m_featureHandlersNSet = false;
  private boolean m_featureHandlersPulledSSet = false;
  private boolean m_featureHandlersRSet = false;
  private boolean m_featureNodesASet = false;
  private boolean m_featureRecordSizeSet = false;
  private boolean m_featureSamplesNSet = false;
  private boolean m_featureSamplesRSet = false;
  private boolean m_featureTimeASet = false;
  private boolean m_featureTimeNSet = false;
  private boolean m_featureTimeRequestSSet = false;
  private boolean m_featureTimeSSet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newRecordStatisticsBuilder()
   */
  private RecordStatisticsBuilder() {
  }

  /**
   * This method creates a new instance of the RecordStatisticsBuilder.
   * @return new instance of the RecordStatisticsBuilder
   */
  public static RecordStatisticsBuilder newRecordStatisticsBuilder() {
    return new RecordStatisticsBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public RecordStatisticsBuilder but() {
    RecordStatisticsBuilder _builder = newRecordStatisticsBuilder();
    _builder.m_featureBytesRequestSSet = m_featureBytesRequestSSet;
    _builder.m_bytesRequestS = m_bytesRequestS;
    _builder.m_featureCpuLoadSSet = m_featureCpuLoadSSet;
    _builder.m_cpuLoadS = m_cpuLoadS;
    _builder.m_featureHandlersNSet = m_featureHandlersNSet;
    _builder.m_handlersN = m_handlersN;
    _builder.m_featureHandlersPulledSSet = m_featureHandlersPulledSSet;
    _builder.m_handlersPulledS = m_handlersPulledS;
    _builder.m_featureHandlersRSet = m_featureHandlersRSet;
    _builder.m_handlersR = m_handlersR;
    _builder.m_featureNodesASet = m_featureNodesASet;
    _builder.m_nodesA = m_nodesA;
    _builder.m_featureRecordSizeSet = m_featureRecordSizeSet;
    _builder.m_recordSize = m_recordSize;
    _builder.m_featureSamplesNSet = m_featureSamplesNSet;
    _builder.m_samplesN = m_samplesN;
    _builder.m_featureSamplesRSet = m_featureSamplesRSet;
    _builder.m_samplesR = m_samplesR;
    _builder.m_featureTimeASet = m_featureTimeASet;
    _builder.m_timeA = m_timeA;
    _builder.m_featureTimeNSet = m_featureTimeNSet;
    _builder.m_timeN = m_timeN;
    _builder.m_featureTimeRequestSSet = m_featureTimeRequestSSet;
    _builder.m_timeRequestS = m_timeRequestS;
    _builder.m_featureTimeSSet = m_featureTimeSSet;
    _builder.m_timeS = m_timeS;
    return _builder;
  }

  /**
   * This method constructs the final de.hub.clickwatch.recoder.cwdatabase.RecordStatistics type.
   * @return new instance of the de.hub.clickwatch.recoder.cwdatabase.RecordStatistics type
   */
  public de.hub.clickwatch.recorder.database.cwdatabase.RecordStatistics build() {
    final de.hub.clickwatch.recorder.database.cwdatabase.RecordStatistics _newInstance = de.hub.clickwatch.recorder.database.cwdatabase.CWDataBaseFactory.eINSTANCE.createRecordStatistics();
    if (m_featureBytesRequestSSet) {
      _newInstance.setBytesRequestS(m_bytesRequestS);
    }
    if (m_featureCpuLoadSSet) {
      _newInstance.setCpuLoadS(m_cpuLoadS);
    }
    if (m_featureHandlersNSet) {
      _newInstance.setHandlersN(m_handlersN);
    }
    if (m_featureHandlersPulledSSet) {
      _newInstance.setHandlersPulledS(m_handlersPulledS);
    }
    if (m_featureHandlersRSet) {
      _newInstance.setHandlersR(m_handlersR);
    }
    if (m_featureNodesASet) {
      _newInstance.setNodesA(m_nodesA);
    }
    if (m_featureRecordSizeSet) {
      _newInstance.setRecordSize(m_recordSize);
    }
    if (m_featureSamplesNSet) {
      _newInstance.setSamplesN(m_samplesN);
    }
    if (m_featureSamplesRSet) {
      _newInstance.setSamplesR(m_samplesR);
    }
    if (m_featureTimeASet) {
      _newInstance.setTimeA(m_timeA);
    }
    if (m_featureTimeNSet) {
      _newInstance.setTimeN(m_timeN);
    }
    if (m_featureTimeRequestSSet) {
      _newInstance.setTimeRequestS(m_timeRequestS);
    }
    if (m_featureTimeSSet) {
      _newInstance.setTimeS(m_timeS);
    }
    return _newInstance;
  }

  public RecordStatisticsBuilder withBytesRequestS(org.apache.commons.math.stat.descriptive.SummaryStatistics p_bytesRequestS) {
    m_bytesRequestS = p_bytesRequestS;
    m_featureBytesRequestSSet = true;
    return this;
  }

  public RecordStatisticsBuilder withCpuLoadS(org.apache.commons.math.stat.descriptive.SummaryStatistics p_cpuLoadS) {
    m_cpuLoadS = p_cpuLoadS;
    m_featureCpuLoadSSet = true;
    return this;
  }

  public RecordStatisticsBuilder withHandlersN(org.apache.commons.math.stat.descriptive.SummaryStatistics p_handlersN) {
    m_handlersN = p_handlersN;
    m_featureHandlersNSet = true;
    return this;
  }

  public RecordStatisticsBuilder withHandlersPulledS(org.apache.commons.math.stat.descriptive.SummaryStatistics p_handlersPulledS) {
    m_handlersPulledS = p_handlersPulledS;
    m_featureHandlersPulledSSet = true;
    return this;
  }

  public RecordStatisticsBuilder withHandlersR(org.apache.commons.math.stat.descriptive.SummaryStatistics p_handlersR) {
    m_handlersR = p_handlersR;
    m_featureHandlersRSet = true;
    return this;
  }

  public RecordStatisticsBuilder withNodesA(org.apache.commons.math.stat.descriptive.SummaryStatistics p_nodesA) {
    m_nodesA = p_nodesA;
    m_featureNodesASet = true;
    return this;
  }

  public RecordStatisticsBuilder withRecordSize(org.apache.commons.math.stat.descriptive.SummaryStatistics p_recordSize) {
    m_recordSize = p_recordSize;
    m_featureRecordSizeSet = true;
    return this;
  }

  public RecordStatisticsBuilder withSamplesN(org.apache.commons.math.stat.descriptive.SummaryStatistics p_samplesN) {
    m_samplesN = p_samplesN;
    m_featureSamplesNSet = true;
    return this;
  }

  public RecordStatisticsBuilder withSamplesR(org.apache.commons.math.stat.descriptive.SummaryStatistics p_samplesR) {
    m_samplesR = p_samplesR;
    m_featureSamplesRSet = true;
    return this;
  }

  public RecordStatisticsBuilder withTimeA(org.apache.commons.math.stat.descriptive.SummaryStatistics p_timeA) {
    m_timeA = p_timeA;
    m_featureTimeASet = true;
    return this;
  }

  public RecordStatisticsBuilder withTimeN(org.apache.commons.math.stat.descriptive.SummaryStatistics p_timeN) {
    m_timeN = p_timeN;
    m_featureTimeNSet = true;
    return this;
  }

  public RecordStatisticsBuilder withTimeRequestS(org.apache.commons.math.stat.descriptive.SummaryStatistics p_timeRequestS) {
    m_timeRequestS = p_timeRequestS;
    m_featureTimeRequestSSet = true;
    return this;
  }

  public RecordStatisticsBuilder withTimeS(org.apache.commons.math.stat.descriptive.SummaryStatistics p_timeS) {
    m_timeS = p_timeS;
    m_featureTimeSSet = true;
    return this;
  }
}
