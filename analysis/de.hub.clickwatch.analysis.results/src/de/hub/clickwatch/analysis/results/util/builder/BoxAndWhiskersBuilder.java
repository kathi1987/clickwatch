package de.hub.clickwatch.analysis.results.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>de.hub.clickwatch.analysis.results.BoxAndWhiskers</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class BoxAndWhiskersBuilder implements de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<de.hub.clickwatch.analysis.results.BoxAndWhiskers> {
  // features and builders
  private java.lang.String m_name;
  // helper attributes
  private boolean m_featureNameSet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newBoxAndWhiskersBuilder()
   */
  private BoxAndWhiskersBuilder() {
  }

  /**
   * This method creates a new instance of the BoxAndWhiskersBuilder.
   * @return new instance of the BoxAndWhiskersBuilder
   */
  public static BoxAndWhiskersBuilder newBoxAndWhiskersBuilder() {
    return new BoxAndWhiskersBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public BoxAndWhiskersBuilder but() {
    BoxAndWhiskersBuilder _builder = newBoxAndWhiskersBuilder();
    _builder.m_featureNameSet = m_featureNameSet;
    _builder.m_name = m_name;
    return _builder;
  }

  /**
   * This method constructs the final de.hub.clickwatch.analysis.results.BoxAndWhiskers type.
   * @return new instance of the de.hub.clickwatch.analysis.results.BoxAndWhiskers type
   */
  public de.hub.clickwatch.analysis.results.BoxAndWhiskers build() {
    final de.hub.clickwatch.analysis.results.BoxAndWhiskers _newInstance = de.hub.clickwatch.analysis.results.ResultsFactory.eINSTANCE.createBoxAndWhiskers();
    if (m_featureNameSet) {
      _newInstance.setName(m_name);
    }
    return _newInstance;
  }

  public BoxAndWhiskersBuilder withName(java.lang.String p_name) {
    m_name = p_name;
    m_featureNameSet = true;
    return this;
  }
}
