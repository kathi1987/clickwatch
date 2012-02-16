package de.hub.clickwatch.datamodel.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>de.hub.clickwatch.datamodel.Statistic</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class StatisticBuilder implements de.hub.clickwatch.datamodel.util.builder.IDatamodelBuilder<de.hub.clickwatch.datamodel.Statistic> {
  // features and builders
  private double m_count;
  private double m_largest;
  private double m_latest;
  private double m_mean;
  private double m_smallest;
  private double m_sum;
  // helper attributes
  private boolean m_featureCountSet = false;
  private boolean m_featureLargestSet = false;
  private boolean m_featureLatestSet = false;
  private boolean m_featureMeanSet = false;
  private boolean m_featureSmallestSet = false;
  private boolean m_featureSumSet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newStatisticBuilder()
   */
  private StatisticBuilder() {
  }

  /**
   * This method creates a new instance of the StatisticBuilder.
   * @return new instance of the StatisticBuilder
   */
  public static StatisticBuilder newStatisticBuilder() {
    return new StatisticBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public StatisticBuilder but() {
    StatisticBuilder _builder = newStatisticBuilder();
    _builder.m_featureCountSet = m_featureCountSet;
    _builder.m_count = m_count;
    _builder.m_featureLargestSet = m_featureLargestSet;
    _builder.m_largest = m_largest;
    _builder.m_featureLatestSet = m_featureLatestSet;
    _builder.m_latest = m_latest;
    _builder.m_featureMeanSet = m_featureMeanSet;
    _builder.m_mean = m_mean;
    _builder.m_featureSmallestSet = m_featureSmallestSet;
    _builder.m_smallest = m_smallest;
    _builder.m_featureSumSet = m_featureSumSet;
    _builder.m_sum = m_sum;
    return _builder;
  }

  /**
   * This method constructs the final de.hub.clickwatch.datamodel.Statistic type.
   * @return new instance of the de.hub.clickwatch.datamodel.Statistic type
   */
  public de.hub.clickwatch.datamodel.Statistic build() {
    final de.hub.clickwatch.datamodel.Statistic _newInstance = de.hub.clickwatch.datamodel.ClickWatchDataModelFactory.eINSTANCE.createStatistic();
    if (m_featureCountSet) {
      _newInstance.setCount(m_count);
    }
    if (m_featureLargestSet) {
      _newInstance.setLargest(m_largest);
    }
    if (m_featureLatestSet) {
      _newInstance.setLatest(m_latest);
    }
    if (m_featureMeanSet) {
      _newInstance.setMean(m_mean);
    }
    if (m_featureSmallestSet) {
      _newInstance.setSmallest(m_smallest);
    }
    if (m_featureSumSet) {
      _newInstance.setSum(m_sum);
    }
    return _newInstance;
  }

  public StatisticBuilder withCount(double p_count) {
    m_count = p_count;
    m_featureCountSet = true;
    return this;
  }

  public StatisticBuilder withLargest(double p_largest) {
    m_largest = p_largest;
    m_featureLargestSet = true;
    return this;
  }

  public StatisticBuilder withLatest(double p_latest) {
    m_latest = p_latest;
    m_featureLatestSet = true;
    return this;
  }

  public StatisticBuilder withMean(double p_mean) {
    m_mean = p_mean;
    m_featureMeanSet = true;
    return this;
  }

  public StatisticBuilder withSmallest(double p_smallest) {
    m_smallest = p_smallest;
    m_featureSmallestSet = true;
    return this;
  }

  public StatisticBuilder withSum(double p_sum) {
    m_sum = p_sum;
    m_featureSumSet = true;
    return this;
  }
}
