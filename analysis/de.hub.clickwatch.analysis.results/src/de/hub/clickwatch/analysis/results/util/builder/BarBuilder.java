package de.hub.clickwatch.analysis.results.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>de.hub.clickwatch.analysis.results.Bar</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class BarBuilder implements de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<de.hub.clickwatch.analysis.results.Bar> {
  // features and builders
  private java.lang.String m_name;
  // helper attributes
  private boolean m_featureNameSet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newBarBuilder()
   */
  private BarBuilder() {
  }

  /**
   * This method creates a new instance of the BarBuilder.
   * @return new instance of the BarBuilder
   */
  public static BarBuilder newBarBuilder() {
    return new BarBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public BarBuilder but() {
    BarBuilder _builder = newBarBuilder();
    _builder.m_featureNameSet = m_featureNameSet;
    _builder.m_name = m_name;
    return _builder;
  }

  /**
   * This method constructs the final de.hub.clickwatch.analysis.results.Bar type.
   * @return new instance of the de.hub.clickwatch.analysis.results.Bar type
   */
  public de.hub.clickwatch.analysis.results.Bar build() {
    final de.hub.clickwatch.analysis.results.Bar _newInstance = de.hub.clickwatch.analysis.results.ResultsFactory.eINSTANCE.createBar();
    if (m_featureNameSet) {
      _newInstance.setName(m_name);
    }
    return _newInstance;
  }

  public BarBuilder withName(java.lang.String p_name) {
    m_name = p_name;
    m_featureNameSet = true;
    return this;
  }
}
