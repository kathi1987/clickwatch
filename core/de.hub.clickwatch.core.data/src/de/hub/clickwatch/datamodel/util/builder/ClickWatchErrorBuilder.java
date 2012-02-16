package de.hub.clickwatch.datamodel.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>de.hub.clickwatch.datamodel.ClickWatchError</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class ClickWatchErrorBuilder implements de.hub.clickwatch.datamodel.util.builder.IDatamodelBuilder<de.hub.clickwatch.datamodel.ClickWatchError> {
  // features and builders
  private java.lang.Exception m_exception;
  private java.lang.String m_message;
  // helper attributes
  private boolean m_featureExceptionSet = false;
  private boolean m_featureMessageSet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newClickWatchErrorBuilder()
   */
  private ClickWatchErrorBuilder() {
  }

  /**
   * This method creates a new instance of the ClickWatchErrorBuilder.
   * @return new instance of the ClickWatchErrorBuilder
   */
  public static ClickWatchErrorBuilder newClickWatchErrorBuilder() {
    return new ClickWatchErrorBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public ClickWatchErrorBuilder but() {
    ClickWatchErrorBuilder _builder = newClickWatchErrorBuilder();
    _builder.m_featureExceptionSet = m_featureExceptionSet;
    _builder.m_exception = m_exception;
    _builder.m_featureMessageSet = m_featureMessageSet;
    _builder.m_message = m_message;
    return _builder;
  }

  /**
   * This method constructs the final de.hub.clickwatch.datamodel.ClickWatchError type.
   * @return new instance of the de.hub.clickwatch.datamodel.ClickWatchError type
   */
  public de.hub.clickwatch.datamodel.ClickWatchError build() {
    final de.hub.clickwatch.datamodel.ClickWatchError _newInstance = de.hub.clickwatch.datamodel.ClickWatchDataModelFactory.eINSTANCE.createClickWatchError();
    if (m_featureExceptionSet) {
      _newInstance.setException(m_exception);
    }
    if (m_featureMessageSet) {
      _newInstance.setMessage(m_message);
    }
    return _newInstance;
  }

  public ClickWatchErrorBuilder withException(java.lang.Exception p_exception) {
    m_exception = p_exception;
    m_featureExceptionSet = true;
    return this;
  }

  public ClickWatchErrorBuilder withMessage(java.lang.String p_message) {
    m_message = p_message;
    m_featureMessageSet = true;
    return this;
  }
}
