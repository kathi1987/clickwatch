package de.hub.clickwatch.recorder.database.cwdatabase.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>de.hub.clickwatch.recoder.cwdatabase.DataBase</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class DataBaseBuilder implements de.hub.clickwatch.recorder.database.cwdatabase.util.builder.ICwdatabaseBuilder<de.hub.clickwatch.recorder.database.cwdatabase.DataBase> {
  // features and builders
  private java.util.Collection<de.hub.clickwatch.recorder.database.cwdatabase.Record> m_records = new java.util.LinkedList<de.hub.clickwatch.recorder.database.cwdatabase.Record>();
  private java.util.Collection<de.hub.clickwatch.recorder.database.cwdatabase.util.builder.ICwdatabaseBuilder<? extends de.hub.clickwatch.recorder.database.cwdatabase.Record>> m_featureRecordsBuilder = new java.util.LinkedList<de.hub.clickwatch.recorder.database.cwdatabase.util.builder.ICwdatabaseBuilder<? extends de.hub.clickwatch.recorder.database.cwdatabase.Record>>();
  // helper attributes
  private boolean m_featureRecordsSet = false;

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
    return _builder;
  }

  /**
   * This method constructs the final de.hub.clickwatch.recoder.cwdatabase.DataBase type.
   * @return new instance of the de.hub.clickwatch.recoder.cwdatabase.DataBase type
   */
  public de.hub.clickwatch.recorder.database.cwdatabase.DataBase build() {
    final de.hub.clickwatch.recorder.database.cwdatabase.DataBase _newInstance = de.hub.clickwatch.recorder.database.cwdatabase.CWDataBaseFactory.eINSTANCE.createDataBase();
    if (m_featureRecordsSet) {
      _newInstance.getRecords().addAll(m_records);
    } else {
      if (!m_featureRecordsBuilder.isEmpty()) {
        for (de.hub.clickwatch.recorder.database.cwdatabase.util.builder.ICwdatabaseBuilder<? extends de.hub.clickwatch.recorder.database.cwdatabase.Record> builder : m_featureRecordsBuilder) {
          _newInstance.getRecords().add(builder.build());
        }
      }
    }
    return _newInstance;
  }

  public DataBaseBuilder withRecords(de.hub.clickwatch.recorder.database.cwdatabase.Record p_records) {
    m_records.add(p_records);
    m_featureRecordsSet = true;
    return this;
  }

  public DataBaseBuilder withRecords(java.util.Collection<? extends de.hub.clickwatch.recorder.database.cwdatabase.Record> p_records) {
    m_records.addAll(p_records);
    m_featureRecordsSet = true;
    return this;
  }

  public DataBaseBuilder withRecords(de.hub.clickwatch.recorder.database.cwdatabase.util.builder.ICwdatabaseBuilder<? extends de.hub.clickwatch.recorder.database.cwdatabase.Record> p_recordBuilder) {
    m_featureRecordsBuilder.add(p_recordBuilder);
    return this;
  }
}
