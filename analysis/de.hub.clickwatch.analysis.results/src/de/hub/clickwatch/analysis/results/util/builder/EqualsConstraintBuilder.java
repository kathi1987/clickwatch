package de.hub.clickwatch.analysis.results.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>de.hub.clickwatch.analysis.results.EqualsConstraint</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class EqualsConstraintBuilder implements de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<de.hub.clickwatch.analysis.results.EqualsConstraint> {
  // features and builders
  private java.lang.Object m_constraint;
  // helper attributes
  private boolean m_featureConstraintSet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newEqualsConstraintBuilder()
   */
  private EqualsConstraintBuilder() {
  }

  /**
   * This method creates a new instance of the EqualsConstraintBuilder.
   * @return new instance of the EqualsConstraintBuilder
   */
  public static EqualsConstraintBuilder newEqualsConstraintBuilder() {
    return new EqualsConstraintBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public EqualsConstraintBuilder but() {
    EqualsConstraintBuilder _builder = newEqualsConstraintBuilder();
    _builder.m_featureConstraintSet = m_featureConstraintSet;
    _builder.m_constraint = m_constraint;
    return _builder;
  }

  /**
   * This method constructs the final de.hub.clickwatch.analysis.results.EqualsConstraint type.
   * @return new instance of the de.hub.clickwatch.analysis.results.EqualsConstraint type
   */
  public de.hub.clickwatch.analysis.results.EqualsConstraint build() {
    final de.hub.clickwatch.analysis.results.EqualsConstraint _newInstance = de.hub.clickwatch.analysis.results.ResultsFactory.eINSTANCE.createEqualsConstraint();
    if (m_featureConstraintSet) {
      _newInstance.setConstraint(m_constraint);
    }
    return _newInstance;
  }

  public EqualsConstraintBuilder withConstraint(java.lang.Object p_constraint) {
    m_constraint = p_constraint;
    m_featureConstraintSet = true;
    return this;
  }
}
