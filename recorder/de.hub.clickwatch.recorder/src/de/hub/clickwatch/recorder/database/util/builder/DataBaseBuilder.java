package de.hub.clickwatch.recorder.database.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>de.hub.clickwatch.recorder.database.DataBase</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class DataBaseBuilder implements de.hub.clickwatch.recorder.database.util.builder.IDatabaseBuilder<de.hub.clickwatch.recorder.database.DataBase> {
  // features and builders
  private de.hub.clickwatch.model.StatisticsContainer m_statistics;
  private de.hub.clickwatch.model.util.builder.IModelBuilder<? extends de.hub.clickwatch.model.StatisticsContainer> m_featureStatisticsBuilder;
  private java.util.Collection<de.hub.clickwatch.recorder.database.Record> m_records = new java.util.LinkedList<de.hub.clickwatch.recorder.database.Record>();
  private java.util.Collection<de.hub.clickwatch.recorder.database.util.builder.IDatabaseBuilder<? extends de.hub.clickwatch.recorder.database.Record>> m_featureRecordsBuilder = new java.util.LinkedList<de.hub.clickwatch.recorder.database.util.builder.IDatabaseBuilder<? extends de.hub.clickwatch.recorder.database.Record>>();
  // helper attributes
  private boolean m_featureRecordsSet = false;
  private boolean m_featureStatisticsSet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newDataBaseBuilder()
   */
  private DataBaseBuilder() {
  }

  /**
   * This method creates a new instance of the DataBaseBuilder.
   * @return new instance of the DataBaseBuilder
   */
  public static DataBaseBuilder newDataBaseBuilder() {
    return new DataBaseBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public DataBaseBuilder but() {
    DataBaseBuilder _builder = newDataBaseBuilder();
    _builder.m_featureRecordsSet = m_featureRecordsSet;
    _builder.m_records = m_records;
    _builder.m_featureRecordsBuilder = m_featureRecordsBuilder;
    _builder.m_featureStatisticsSet = m_featureStatisticsSet;
    _builder.m_statistics = m_statistics;
    _builder.m_featureStatisticsBuilder = m_featureStatisticsBuilder;
    return _builder;
  }

  /**
   * This method constructs the final de.hub.clickwatch.recorder.database.DataBase type.
   * @return new instance of the de.hub.clickwatch.recorder.database.DataBase type
   */
  public de.hub.clickwatch.recorder.database.DataBase build() {
    final de.hub.clickwatch.recorder.database.DataBase _newInstance = de.hub.clickwatch.recorder.database.CWDataBaseFactory.eINSTANCE.createDataBase();
    if (m_featureStatisticsSet) {
      _newInstance.setStatistics(m_statistics);
    } else {
      if (m_featureStatisticsBuilder != null) {
        _newInstance.setStatistics(m_featureStatisticsBuilder.build());
      }
    }
    if (m_featureRecordsSet) {
      _newInstance.getRecords().addAll(m_records);
    } else {
      if (!m_featureRecordsBuilder.isEmpty()) {
        for (de.hub.clickwatch.recorder.database.util.builder.IDatabaseBuilder<? extends de.hub.clickwatch.recorder.database.Record> builder : m_featureRecordsBuilder) {
          _newInstance.getRecords().add(builder.build());
        }
      }
    }
    return _newInstance;
  }

  public DataBaseBuilder withStatistics(de.hub.clickwatch.model.StatisticsContainer p_statistics) {
    m_statistics = p_statistics;
    m_featureStatisticsSet = true;
    return this;
  }

  public DataBaseBuilder withStatistics(de.hub.clickwatch.model.util.builder.IModelBuilder<? extends de.hub.clickwatch.model.StatisticsContainer> p_statisticsContainerBuilder) {
    m_featureStatisticsBuilder = p_statisticsContainerBuilder;
    return this;
  }

  public DataBaseBuilder withRecords(de.hub.clickwatch.recorder.database.Record p_records) {
    m_records.add(p_records);
    m_featureRecordsSet = true;
    return this;
  }

  public DataBaseBuilder withRecords(java.util.Collection<? extends de.hub.clickwatch.recorder.database.Record> p_records) {
    m_records.addAll(p_records);
    m_featureRecordsSet = true;
    return this;
  }

  public DataBaseBuilder withRecords(de.hub.clickwatch.recorder.database.util.builder.IDatabaseBuilder<? extends de.hub.clickwatch.recorder.database.Record> p_recordBuilder) {
    m_featureRecordsBuilder.add(p_recordBuilder);
    return this;
  }
}
