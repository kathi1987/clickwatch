package de.hub.clickwatch.analysis.results.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>de.hub.clickwatch.analysis.results.XY</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class XYBuilder implements de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<de.hub.clickwatch.analysis.results.XY> {
  // features and builders
  private java.lang.String m_name;
  // helper attributes
  private boolean m_featureNameSet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newXYBuilder()
   */
  private XYBuilder() {
  }

  /**
   * This method creates a new instance of the XYBuilder.
   * @return new instance of the XYBuilder
   */
  public static XYBuilder newXYBuilder() {
    return new XYBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public XYBuilder but() {
    XYBuilder _builder = newXYBuilder();
    _builder.m_featureNameSet = m_featureNameSet;
    _builder.m_name = m_name;
    return _builder;
  }

  /**
   * This method constructs the final de.hub.clickwatch.analysis.results.XY type.
   * @return new instance of the de.hub.clickwatch.analysis.results.XY type
   */
  public de.hub.clickwatch.analysis.results.XY build() {
    final de.hub.clickwatch.analysis.results.XY _newInstance = de.hub.clickwatch.analysis.results.ResultsFactory.eINSTANCE.createXY();
    if (m_featureNameSet) {
      _newInstance.setName(m_name);
    }
    return _newInstance;
  }

  public XYBuilder withName(java.lang.String p_name) {
    m_name = p_name;
    m_featureNameSet = true;
    return this;
  }
}
