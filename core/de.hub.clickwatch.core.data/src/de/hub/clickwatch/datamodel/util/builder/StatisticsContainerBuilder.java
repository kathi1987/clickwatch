package de.hub.clickwatch.datamodel.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>de.hub.clickwatch.datamodel.StatisticsContainer</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class StatisticsContainerBuilder implements de.hub.clickwatch.datamodel.util.builder.IDatamodelBuilder<de.hub.clickwatch.datamodel.StatisticsContainer> {
  // features and builders
  private java.util.Collection<java.util.Map.Entry<java.lang.String, de.hub.clickwatch.datamodel.Statistic>> m_statistics = new java.util.LinkedList<java.util.Map.Entry<java.lang.String, de.hub.clickwatch.datamodel.Statistic>>();
  // helper attributes
  private boolean m_featureStatisticsSet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newStatisticsContainerBuilder()
   */
  private StatisticsContainerBuilder() {
  }

  /**
   * This method creates a new instance of the StatisticsContainerBuilder.
   * @return new instance of the StatisticsContainerBuilder
   */
  public static StatisticsContainerBuilder newStatisticsContainerBuilder() {
    return new StatisticsContainerBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public StatisticsContainerBuilder but() {
    StatisticsContainerBuilder _builder = newStatisticsContainerBuilder();
    _builder.m_featureStatisticsSet = m_featureStatisticsSet;
    _builder.m_statistics = m_statistics;
    return _builder;
  }

  /**
   * This method constructs the final de.hub.clickwatch.datamodel.StatisticsContainer type.
   * @return new instance of the de.hub.clickwatch.datamodel.StatisticsContainer type
   */
  public de.hub.clickwatch.datamodel.StatisticsContainer build() {
    final de.hub.clickwatch.datamodel.StatisticsContainer _newInstance = de.hub.clickwatch.datamodel.ClickWatchDataModelFactory.eINSTANCE.createStatisticsContainer();
    if (m_featureStatisticsSet) {
      _newInstance.getStatistics().addAll(m_statistics);
    }
    return _newInstance;
  }

  public StatisticsContainerBuilder withStatistics(java.util.Map.Entry<java.lang.String, de.hub.clickwatch.datamodel.Statistic> p_statistics) {
    m_statistics.add(p_statistics);
    m_featureStatisticsSet = true;
    return this;
  }

  public StatisticsContainerBuilder withStatistics(java.util.Collection<? extends java.util.Map.Entry<java.lang.String, de.hub.clickwatch.datamodel.Statistic>> p_statistics) {
    m_statistics.addAll(p_statistics);
    m_featureStatisticsSet = true;
    return this;
  }
}
