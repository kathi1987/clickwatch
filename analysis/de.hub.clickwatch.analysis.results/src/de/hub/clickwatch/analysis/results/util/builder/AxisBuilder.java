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
  private de.hub.clickwatch.analysis.results.Constraint m_constraint;
  private de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<? extends de.hub.clickwatch.analysis.results.Constraint> m_featureConstraintBuilder;
  private double m_from;
  private java.lang.String m_name;
  private double m_to;
  // helper attributes
  private boolean m_featureColumnSet = false;
  private boolean m_featureConstraintSet = false;
  private boolean m_featureFromSet = false;
  private boolean m_featureNameSet = false;
  private boolean m_featureToSet = false;

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
    _builder.m_featureConstraintSet = m_featureConstraintSet;
    _builder.m_constraint = m_constraint;
    _builder.m_featureConstraintBuilder = m_featureConstraintBuilder;
    _builder.m_featureFromSet = m_featureFromSet;
    _builder.m_from = m_from;
    _builder.m_featureNameSet = m_featureNameSet;
    _builder.m_name = m_name;
    _builder.m_featureToSet = m_featureToSet;
    _builder.m_to = m_to;
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
    if (m_featureConstraintSet) {
      _newInstance.setConstraint(m_constraint);
    } else {
      if (m_featureConstraintBuilder != null) {
        _newInstance.setConstraint(m_featureConstraintBuilder.build());
      }
    }
    if (m_featureFromSet) {
      _newInstance.setFrom(m_from);
    }
    if (m_featureNameSet) {
      _newInstance.setName(m_name);
    }
    if (m_featureToSet) {
      _newInstance.setTo(m_to);
    }
    return _newInstance;
  }

  public AxisBuilder withColumn(Integer p_column) {
    m_column = p_column;
    m_featureColumnSet = true;
    return this;
  }

  public AxisBuilder withConstraint(de.hub.clickwatch.analysis.results.Constraint p_constraint) {
    m_constraint = p_constraint;
    m_featureConstraintSet = true;
    return this;
  }

  public AxisBuilder withConstraint(de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<? extends de.hub.clickwatch.analysis.results.Constraint> p_constraintBuilder) {
    m_featureConstraintBuilder = p_constraintBuilder;
    return this;
  }

  public AxisBuilder withFrom(double p_from) {
    m_from = p_from;
    m_featureFromSet = true;
    return this;
  }

  public AxisBuilder withName(java.lang.String p_name) {
    m_name = p_name;
    m_featureNameSet = true;
    return this;
  }

  public AxisBuilder withTo(double p_to) {
    m_to = p_to;
    m_featureToSet = true;
    return this;
  }
}
