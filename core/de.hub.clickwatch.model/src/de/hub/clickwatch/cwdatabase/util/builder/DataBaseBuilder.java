package de.hub.clickwatch.cwdatabase.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>de.hub.clickwatch.cwdatabase.DataBase</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class DataBaseBuilder implements de.hub.clickwatch.cwdatabase.util.builder.ICwdatabaseBuilder<de.hub.clickwatch.cwdatabase.DataBase> {
  // features and builders
  private java.lang.Boolean m_inMemory;
  private java.lang.String m_storageBaseFileString;
  private java.util.Collection<de.hub.clickwatch.cwdatabase.ExperimentDescr> m_experiments = new java.util.LinkedList<de.hub.clickwatch.cwdatabase.ExperimentDescr>();
  private java.util.Collection<de.hub.clickwatch.cwdatabase.util.builder.ICwdatabaseBuilder<? extends de.hub.clickwatch.cwdatabase.ExperimentDescr>> m_featureExperimentsBuilder = new java.util.LinkedList<de.hub.clickwatch.cwdatabase.util.builder.ICwdatabaseBuilder<? extends de.hub.clickwatch.cwdatabase.ExperimentDescr>>();
  // helper attributes
  private boolean m_featureExperimentsSet = false;
  private boolean m_featureInMemorySet = false;
  private boolean m_featureStorageBaseFileStringSet = false;

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
    _builder.m_featureExperimentsSet = m_featureExperimentsSet;
    _builder.m_experiments = m_experiments;
    _builder.m_featureExperimentsBuilder = m_featureExperimentsBuilder;
    _builder.m_featureInMemorySet = m_featureInMemorySet;
    _builder.m_inMemory = m_inMemory;
    _builder.m_featureStorageBaseFileStringSet = m_featureStorageBaseFileStringSet;
    _builder.m_storageBaseFileString = m_storageBaseFileString;
    return _builder;
  }

  /**
   * This method constructs the final de.hub.clickwatch.cwdatabase.DataBase type.
   * @return new instance of the de.hub.clickwatch.cwdatabase.DataBase type
   */
  public de.hub.clickwatch.cwdatabase.DataBase build() {
    final de.hub.clickwatch.cwdatabase.DataBase _newInstance = de.hub.clickwatch.cwdatabase.CWDataBaseFactory.eINSTANCE.createDataBase();
    if (m_featureInMemorySet) {
      _newInstance.setInMemory(m_inMemory);
    }
    if (m_featureStorageBaseFileStringSet) {
      _newInstance.setStorageBaseFileString(m_storageBaseFileString);
    }
    if (m_featureExperimentsSet) {
      _newInstance.getExperiments().addAll(m_experiments);
    } else {
      if (!m_featureExperimentsBuilder.isEmpty()) {
        for (de.hub.clickwatch.cwdatabase.util.builder.ICwdatabaseBuilder<? extends de.hub.clickwatch.cwdatabase.ExperimentDescr> builder : m_featureExperimentsBuilder) {
          _newInstance.getExperiments().add(builder.build());
        }
      }
    }
    return _newInstance;
  }

  public DataBaseBuilder withInMemory(java.lang.Boolean p_inMemory) {
    m_inMemory = p_inMemory;
    m_featureInMemorySet = true;
    return this;
  }

  public DataBaseBuilder withStorageBaseFileString(java.lang.String p_storageBaseFileString) {
    m_storageBaseFileString = p_storageBaseFileString;
    m_featureStorageBaseFileStringSet = true;
    return this;
  }

  public DataBaseBuilder withExperiments(de.hub.clickwatch.cwdatabase.ExperimentDescr p_experiments) {
    m_experiments.add(p_experiments);
    m_featureExperimentsSet = true;
    return this;
  }

  public DataBaseBuilder withExperiments(java.util.Collection<? extends de.hub.clickwatch.cwdatabase.ExperimentDescr> p_experiments) {
    m_experiments.addAll(p_experiments);
    m_featureExperimentsSet = true;
    return this;
  }

  public DataBaseBuilder withExperiments(de.hub.clickwatch.cwdatabase.util.builder.ICwdatabaseBuilder<? extends de.hub.clickwatch.cwdatabase.ExperimentDescr> p_experimentDescrBuilder) {
    m_featureExperimentsBuilder.add(p_experimentDescrBuilder);
    return this;
  }
}
