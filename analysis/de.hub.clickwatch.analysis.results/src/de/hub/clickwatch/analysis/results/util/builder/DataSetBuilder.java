package de.hub.clickwatch.analysis.results.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>de.hub.clickwatch.analysis.results.DataSet</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class DataSetBuilder implements de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<de.hub.clickwatch.analysis.results.DataSet> {
  // features and builders
  private java.util.Collection<de.hub.clickwatch.analysis.results.DataEntry> m_entries = new java.util.LinkedList<de.hub.clickwatch.analysis.results.DataEntry>();
  private java.util.Collection<de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<? extends de.hub.clickwatch.analysis.results.DataEntry>> m_featureEntriesBuilder = new java.util.LinkedList<de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<? extends de.hub.clickwatch.analysis.results.DataEntry>>();
  // helper attributes
  private boolean m_featureEntriesSet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newDataSetBuilder()
   */
  private DataSetBuilder() {
  }

  /**
   * This method creates a new instance of the DataSetBuilder.
   * @return new instance of the DataSetBuilder
   */
  public static DataSetBuilder newDataSetBuilder() {
    return new DataSetBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public DataSetBuilder but() {
    DataSetBuilder _builder = newDataSetBuilder();
    _builder.m_featureEntriesSet = m_featureEntriesSet;
    _builder.m_entries = m_entries;
    _builder.m_featureEntriesBuilder = m_featureEntriesBuilder;
    return _builder;
  }

  /**
   * This method constructs the final de.hub.clickwatch.analysis.results.DataSet type.
   * @return new instance of the de.hub.clickwatch.analysis.results.DataSet type
   */
  public de.hub.clickwatch.analysis.results.DataSet build() {
    final de.hub.clickwatch.analysis.results.DataSet _newInstance = de.hub.clickwatch.analysis.results.ResultsFactory.eINSTANCE.createDataSet();
    if (m_featureEntriesSet) {
      _newInstance.getEntries().addAll(m_entries);
    } else {
      if (!m_featureEntriesBuilder.isEmpty()) {
        for (de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<? extends de.hub.clickwatch.analysis.results.DataEntry> builder : m_featureEntriesBuilder) {
          _newInstance.getEntries().add(builder.build());
        }
      }
    }
    return _newInstance;
  }

  public DataSetBuilder withEntries(de.hub.clickwatch.analysis.results.DataEntry p_entries) {
    m_entries.add(p_entries);
    m_featureEntriesSet = true;
    return this;
  }

  public DataSetBuilder withEntries(java.util.Collection<? extends de.hub.clickwatch.analysis.results.DataEntry> p_entries) {
    m_entries.addAll(p_entries);
    m_featureEntriesSet = true;
    return this;
  }

  public DataSetBuilder withEntries(de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<? extends de.hub.clickwatch.analysis.results.DataEntry> p_dataEntryBuilder) {
    m_featureEntriesBuilder.add(p_dataEntryBuilder);
    return this;
  }
}
