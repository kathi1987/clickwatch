package de.hub.clickwatch.analysis.results.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>de.hub.clickwatch.analysis.results.ChartType</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class ChartTypeBuilder implements de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<de.hub.clickwatch.analysis.results.ChartType> {
  // features and builders
  private java.lang.String m_name;
  // helper attributes
  private boolean m_featureNameSet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newChartTypeBuilder()
   */
  private ChartTypeBuilder() {
  }

  /**
   * This method creates a new instance of the ChartTypeBuilder.
   * @return new instance of the ChartTypeBuilder
   */
  public static ChartTypeBuilder newChartTypeBuilder() {
    return new ChartTypeBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public ChartTypeBuilder but() {
    ChartTypeBuilder _builder = newChartTypeBuilder();
    _builder.m_featureNameSet = m_featureNameSet;
    _builder.m_name = m_name;
    return _builder;
  }

  /**
   * This method constructs the final de.hub.clickwatch.analysis.results.ChartType type.
   * @return new instance of the de.hub.clickwatch.analysis.results.ChartType type
   */
  public de.hub.clickwatch.analysis.results.ChartType build() {
    final de.hub.clickwatch.analysis.results.ChartType _newInstance = de.hub.clickwatch.analysis.results.ResultsFactory.eINSTANCE.createChartType();
    if (m_featureNameSet) {
      _newInstance.setName(m_name);
    }
    return _newInstance;
  }

  public ChartTypeBuilder withName(java.lang.String p_name) {
    m_name = p_name;
    m_featureNameSet = true;
    return this;
  }
}
