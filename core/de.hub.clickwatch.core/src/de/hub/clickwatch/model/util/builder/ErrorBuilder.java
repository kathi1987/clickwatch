package de.hub.clickwatch.model.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>de.hub.clickwatch.model.Error</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class ErrorBuilder implements de.hub.clickwatch.model.util.builder.IModelBuilder<de.hub.clickwatch.model.Error> {
  // features and builders
  private java.lang.Exception m_exception;
  private java.lang.String m_message;
  // helper attributes
  private boolean m_featureExceptionSet = false;
  private boolean m_featureMessageSet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newErrorBuilder()
   */
  private ErrorBuilder() {
  }

  /**
   * This method creates a new instance of the ErrorBuilder.
   * @return new instance of the ErrorBuilder
   */
  public static ErrorBuilder newErrorBuilder() {
    return new ErrorBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public ErrorBuilder but() {
    ErrorBuilder _builder = newErrorBuilder();
    _builder.m_featureExceptionSet = m_featureExceptionSet;
    _builder.m_exception = m_exception;
    _builder.m_featureMessageSet = m_featureMessageSet;
    _builder.m_message = m_message;
    return _builder;
  }

  /**
   * This method constructs the final de.hub.clickwatch.model.Error type.
   * @return new instance of the de.hub.clickwatch.model.Error type
   */
  public de.hub.clickwatch.model.Error build() {
    final de.hub.clickwatch.model.Error _newInstance = de.hub.clickwatch.model.ClickWatchModelFactory.eINSTANCE.createError();
    if (m_featureExceptionSet) {
      _newInstance.setException(m_exception);
    }
    if (m_featureMessageSet) {
      _newInstance.setMessage(m_message);
    }
    return _newInstance;
  }

  public ErrorBuilder withException(java.lang.Exception p_exception) {
    m_exception = p_exception;
    m_featureExceptionSet = true;
    return this;
  }

  public ErrorBuilder withMessage(java.lang.String p_message) {
    m_message = p_message;
    m_featureMessageSet = true;
    return this;
  }
}
