package de.hub.clickwatch.analysis.results.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>de.hub.clickwatch.analysis.results.Axis</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class AxisBuilder implements de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<de.hub.clickwatch.analysis.results.Axis> {
  // features and builders
  private Integer m_column;
  private java.lang.String m_name;
  // helper attributes
  private boolean m_featureColumnSet = false;
  private boolean m_featureNameSet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newAxisBuilder()
   */
  private AxisBuilder() {
  }

  /**
   * This method creates a new instance of the AxisBuilder.
   * @return new instance of the AxisBuilder
   */
  public static AxisBuilder newAxisBuilder() {
    return new AxisBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public AxisBuilder but() {
    AxisBuilder _builder = newAxisBuilder();
    _builder.m_featureColumnSet = m_featureColumnSet;
    _builder.m_column = m_column;
    _builder.m_featureNameSet = m_featureNameSet;
    _builder.m_name = m_name;
    return _builder;
  }

  /**
   * This method constructs the final de.hub.clickwatch.analysis.results.Axis type.
   * @return new instance of the de.hub.clickwatch.analysis.results.Axis type
   */
  public de.hub.clickwatch.analysis.results.Axis build() {
    final de.hub.clickwatch.analysis.results.Axis _newInstance = de.hub.clickwatch.analysis.results.ResultsFactory.eINSTANCE.createAxis();
    if (m_featureColumnSet) {
      _newInstance.setColumn(m_column);
    }
    if (m_featureNameSet) {
      _newInstance.setName(m_name);
    }
    return _newInstance;
  }

  public AxisBuilder withColumn(Integer p_column) {
    m_column = p_column;
    m_featureColumnSet = true;
    return this;
  }

  public AxisBuilder withName(java.lang.String p_name) {
    m_name = p_name;
    m_featureNameSet = true;
    return this;
  }
}
