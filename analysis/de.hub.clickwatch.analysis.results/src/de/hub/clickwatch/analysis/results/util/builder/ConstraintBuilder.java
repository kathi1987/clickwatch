package de.hub.clickwatch.analysis.results.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>de.hub.clickwatch.analysis.results.Constraint</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class ConstraintBuilder implements de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<de.hub.clickwatch.analysis.results.Constraint> {
  // features and builders
  private Integer m_column;
  private java.lang.String m_constraint;
  private java.lang.String m_name;
  // helper attributes
  private boolean m_featureColumnSet = false;
  private boolean m_featureConstraintSet = false;
  private boolean m_featureNameSet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newConstraintBuilder()
   */
  private ConstraintBuilder() {
  }

  /**
   * This method creates a new instance of the ConstraintBuilder.
   * @return new instance of the ConstraintBuilder
   */
  public static ConstraintBuilder newConstraintBuilder() {
    return new ConstraintBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public ConstraintBuilder but() {
    ConstraintBuilder _builder = newConstraintBuilder();
    _builder.m_featureColumnSet = m_featureColumnSet;
    _builder.m_column = m_column;
    _builder.m_featureConstraintSet = m_featureConstraintSet;
    _builder.m_constraint = m_constraint;
    _builder.m_featureNameSet = m_featureNameSet;
    _builder.m_name = m_name;
    return _builder;
  }

  /**
   * This method constructs the final de.hub.clickwatch.analysis.results.Constraint type.
   * @return new instance of the de.hub.clickwatch.analysis.results.Constraint type
   */
  public de.hub.clickwatch.analysis.results.Constraint build() {
    final de.hub.clickwatch.analysis.results.Constraint _newInstance = de.hub.clickwatch.analysis.results.ResultsFactory.eINSTANCE.createConstraint();
    if (m_featureColumnSet) {
      _newInstance.setColumn(m_column);
    }
    if (m_featureConstraintSet) {
      _newInstance.setConstraint(m_constraint);
    }
    if (m_featureNameSet) {
      _newInstance.setName(m_name);
    }
    return _newInstance;
  }

  public ConstraintBuilder withColumn(Integer p_column) {
    m_column = p_column;
    m_featureColumnSet = true;
    return this;
  }

  public ConstraintBuilder withConstraint(java.lang.String p_constraint) {
    m_constraint = p_constraint;
    m_featureConstraintSet = true;
    return this;
  }

  public ConstraintBuilder withName(java.lang.String p_name) {
    m_name = p_name;
    m_featureNameSet = true;
    return this;
  }
}
