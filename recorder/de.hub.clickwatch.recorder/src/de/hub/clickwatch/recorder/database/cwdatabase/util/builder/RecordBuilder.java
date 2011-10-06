package de.hub.clickwatch.recorder.database.cwdatabase.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>de.hub.clickwatch.recoder.cwdatabase.Record</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class RecordBuilder implements de.hub.clickwatch.recorder.database.cwdatabase.util.builder.ICwdatabaseBuilder<de.hub.clickwatch.recorder.database.cwdatabase.Record> {
  // features and builders
  private de.hub.clickwatch.model.Network m_configuration;
  private de.hub.clickwatch.model.util.builder.IModelBuilder<? extends de.hub.clickwatch.model.Network> m_featureConfigurationBuilder;
  private de.hub.clickwatch.recorder.database.cwdatabase.DataBase m_dataBase;
  private de.hub.clickwatch.recorder.database.cwdatabase.util.builder.ICwdatabaseBuilder<? extends de.hub.clickwatch.recorder.database.cwdatabase.DataBase> m_featureDataBaseBuilder;
  private long m_duration;
  private long m_end;
  private de.hub.clickwatch.recorder.database.cwdatabase.HBaseRowMap m_hBaseRowMap;
  private java.lang.String m_name;
  private de.hub.clickwatch.model.Network m_networkTimeCopy;
  private de.hub.clickwatch.model.util.builder.IModelBuilder<? extends de.hub.clickwatch.model.Network> m_featureNetworkTimeCopyBuilder;
  private long m_start;
  private de.hub.clickwatch.recorder.database.cwdatabase.RecordStatistics m_statistics;
  private de.hub.clickwatch.recorder.database.cwdatabase.util.builder.ICwdatabaseBuilder<? extends de.hub.clickwatch.recorder.database.cwdatabase.RecordStatistics> m_featureStatisticsBuilder;
  private java.util.Collection<de.hub.clickwatch.model.Node> m_metaData = new java.util.LinkedList<de.hub.clickwatch.model.Node>();
  private java.util.Collection<de.hub.clickwatch.model.util.builder.IModelBuilder<? extends de.hub.clickwatch.model.Node>> m_featureMetaDataBuilder = new java.util.LinkedList<de.hub.clickwatch.model.util.builder.IModelBuilder<? extends de.hub.clickwatch.model.Node>>();
  // helper attributes
  private boolean m_featureConfigurationSet = false;
  private boolean m_featureDataBaseSet = false;
  private boolean m_featureDurationSet = false;
  private boolean m_featureEndSet = false;
  private boolean m_featureHBaseRowMapSet = false;
  private boolean m_featureMetaDataSet = false;
  private boolean m_featureNameSet = false;
  private boolean m_featureNetworkTimeCopySet = false;
  private boolean m_featureStartSet = false;
  private boolean m_featureStatisticsSet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newRecordBuilder()
   */
  private RecordBuilder() {
  }

  /**
   * This method creates a new instance of the RecordBuilder.
   * @return new instance of the RecordBuilder
   */
  public static RecordBuilder newRecordBuilder() {
    return new RecordBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public RecordBuilder but() {
    RecordBuilder _builder = newRecordBuilder();
    _builder.m_featureConfigurationSet = m_featureConfigurationSet;
    _builder.m_configuration = m_configuration;
    _builder.m_featureConfigurationBuilder = m_featureConfigurationBuilder;
    _builder.m_featureDataBaseSet = m_featureDataBaseSet;
    _builder.m_dataBase = m_dataBase;
    _builder.m_featureDataBaseBuilder = m_featureDataBaseBuilder;
    _builder.m_featureDurationSet = m_featureDurationSet;
    _builder.m_duration = m_duration;
    _builder.m_featureEndSet = m_featureEndSet;
    _builder.m_end = m_end;
    _builder.m_featureHBaseRowMapSet = m_featureHBaseRowMapSet;
    _builder.m_hBaseRowMap = m_hBaseRowMap;
    _builder.m_featureMetaDataSet = m_featureMetaDataSet;
    _builder.m_metaData = m_metaData;
    _builder.m_featureMetaDataBuilder = m_featureMetaDataBuilder;
    _builder.m_featureNameSet = m_featureNameSet;
    _builder.m_name = m_name;
    _builder.m_featureNetworkTimeCopySet = m_featureNetworkTimeCopySet;
    _builder.m_networkTimeCopy = m_networkTimeCopy;
    _builder.m_featureNetworkTimeCopyBuilder = m_featureNetworkTimeCopyBuilder;
    _builder.m_featureStartSet = m_featureStartSet;
    _builder.m_start = m_start;
    _builder.m_featureStatisticsSet = m_featureStatisticsSet;
    _builder.m_statistics = m_statistics;
    _builder.m_featureStatisticsBuilder = m_featureStatisticsBuilder;
    return _builder;
  }

  /**
   * This method constructs the final de.hub.clickwatch.recoder.cwdatabase.Record type.
   * @return new instance of the de.hub.clickwatch.recoder.cwdatabase.Record type
   */
  public de.hub.clickwatch.recorder.database.cwdatabase.Record build() {
    final de.hub.clickwatch.recorder.database.cwdatabase.Record _newInstance = de.hub.clickwatch.recorder.database.cwdatabase.CWDataBaseFactory.eINSTANCE.createRecord();
    if (m_featureConfigurationSet) {
      _newInstance.setConfiguration(m_configuration);
    } else {
      if (m_featureConfigurationBuilder != null) {
        _newInstance.setConfiguration(m_featureConfigurationBuilder.build());
      }
    }
    if (m_featureDataBaseSet) {
      _newInstance.setDataBase(m_dataBase);
    } else {
      if (m_featureDataBaseBuilder != null) {
        _newInstance.setDataBase(m_featureDataBaseBuilder.build());
      }
    }
    if (m_featureDurationSet) {
      _newInstance.setDuration(m_duration);
    }
    if (m_featureEndSet) {
      _newInstance.setEnd(m_end);
    }
    if (m_featureHBaseRowMapSet) {
      _newInstance.setHBaseRowMap(m_hBaseRowMap);
    }
    if (m_featureNameSet) {
      _newInstance.setName(m_name);
    }
    if (m_featureNetworkTimeCopySet) {
      _newInstance.setNetworkTimeCopy(m_networkTimeCopy);
    } else {
      if (m_featureNetworkTimeCopyBuilder != null) {
        _newInstance.setNetworkTimeCopy(m_featureNetworkTimeCopyBuilder.build());
      }
    }
    if (m_featureStartSet) {
      _newInstance.setStart(m_start);
    }
    if (m_featureStatisticsSet) {
      _newInstance.setStatistics(m_statistics);
    } else {
      if (m_featureStatisticsBuilder != null) {
        _newInstance.setStatistics(m_featureStatisticsBuilder.build());
      }
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
    return _newInstance;
  }

  public RecordBuilder withConfiguration(de.hub.clickwatch.model.Network p_configuration) {
    m_configuration = p_configuration;
    m_featureConfigurationSet = true;
    return this;
  }

  public RecordBuilder withConfiguration(de.hub.clickwatch.model.util.builder.IModelBuilder<? extends de.hub.clickwatch.model.Network> p_networkBuilder) {
    m_featureConfigurationBuilder = p_networkBuilder;
    return this;
  }

  public RecordBuilder withDataBase(de.hub.clickwatch.recorder.database.cwdatabase.DataBase p_dataBase) {
    m_dataBase = p_dataBase;
    m_featureDataBaseSet = true;
    return this;
  }

  public RecordBuilder withDataBase(de.hub.clickwatch.recorder.database.cwdatabase.util.builder.ICwdatabaseBuilder<? extends de.hub.clickwatch.recorder.database.cwdatabase.DataBase> p_dataBaseBuilder) {
    m_featureDataBaseBuilder = p_dataBaseBuilder;
    return this;
  }

  public RecordBuilder withDuration(long p_duration) {
    m_duration = p_duration;
    m_featureDurationSet = true;
    return this;
  }

  public RecordBuilder withEnd(long p_end) {
    m_end = p_end;
    m_featureEndSet = true;
    return this;
  }

  public RecordBuilder withHBaseRowMap(de.hub.clickwatch.recorder.database.cwdatabase.HBaseRowMap p_hBaseRowMap) {
    m_hBaseRowMap = p_hBaseRowMap;
    m_featureHBaseRowMapSet = true;
    return this;
  }

  public RecordBuilder withName(java.lang.String p_name) {
    m_name = p_name;
    m_featureNameSet = true;
    return this;
  }

  public RecordBuilder withNetworkTimeCopy(de.hub.clickwatch.model.Network p_networkTimeCopy) {
    m_networkTimeCopy = p_networkTimeCopy;
    m_featureNetworkTimeCopySet = true;
    return this;
  }

  public RecordBuilder withNetworkTimeCopy(de.hub.clickwatch.model.util.builder.IModelBuilder<? extends de.hub.clickwatch.model.Network> p_networkBuilder) {
    m_featureNetworkTimeCopyBuilder = p_networkBuilder;
    return this;
  }

  public RecordBuilder withStart(long p_start) {
    m_start = p_start;
    m_featureStartSet = true;
    return this;
  }

  public RecordBuilder withStatistics(de.hub.clickwatch.recorder.database.cwdatabase.RecordStatistics p_statistics) {
    m_statistics = p_statistics;
    m_featureStatisticsSet = true;
    return this;
  }

  public RecordBuilder withStatistics(de.hub.clickwatch.recorder.database.cwdatabase.util.builder.ICwdatabaseBuilder<? extends de.hub.clickwatch.recorder.database.cwdatabase.RecordStatistics> p_recordStatisticsBuilder) {
    m_featureStatisticsBuilder = p_recordStatisticsBuilder;
    return this;
  }

  public RecordBuilder withMetaData(de.hub.clickwatch.model.Node p_metaData) {
    m_metaData.add(p_metaData);
    m_featureMetaDataSet = true;
    return this;
  }

  public RecordBuilder withMetaData(java.util.Collection<? extends de.hub.clickwatch.model.Node> p_metaData) {
    m_metaData.addAll(p_metaData);
    m_featureMetaDataSet = true;
    return this;
  }

  public RecordBuilder withMetaData(de.hub.clickwatch.model.util.builder.IModelBuilder<? extends de.hub.clickwatch.model.Node> p_nodeBuilder) {
    m_featureMetaDataBuilder.add(p_nodeBuilder);
    return this;
  }
}
