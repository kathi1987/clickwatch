package de.hub.clickwatch.analysis.results.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object '<em><b>de.hub.clickwatch.analysis.results.DoubleDataResultValue</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class DoubleDataResultValueBuilder implements de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<de.hub.clickwatch.analysis.results.DoubleDataResultValue> {
  // features and builders
  private double m_value;
  // helper attributes
  private boolean m_featureValueSet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newDoubleDataResultValueBuilder()
   */
  private DoubleDataResultValueBuilder() {
  }

  /**
   * This method creates a new instance of the DoubleDataResultValueBuilder.
   * @return new instance of the DoubleDataResultValueBuilder
   */
  public static DoubleDataResultValueBuilder newDoubleDataResultValueBuilder() {
    return new DoubleDataResultValueBuilder();
  }

  /**
   * This method creates a new instance of the DoubleDataResultValueBuilder. 
   * The builder is initialized using an existing '<em><b>de.hub.clickwatch.analysis.results.DoubleDataResultValue</b></em>' model object.
   * In order to avoid changes to the provided '<em><b>de.hub.clickwatch.analysis.results.DoubleDataResultValue</b></em>' model object, a copy is created using <em><b>org.eclipse.emf.ecore.util.EcoreUtil.Copier</b></em>.
   * @param doubleDataResultValue The existing '<em><b>de.hub.clickwatch.analysis.results.DoubleDataResultValue</b></em>' model object to be used for the initialization of the builder  
   * @return new initialized instance of the DoubleDataResultValueBuilder
   */
  public static DoubleDataResultValueBuilder newDoubleDataResultValueBuilder(de.hub.clickwatch.analysis.results.DoubleDataResultValue p_doubleDataResultValue) {
    org.eclipse.emf.ecore.util.EcoreUtil.Copier c = new org.eclipse.emf.ecore.util.EcoreUtil.Copier();
    de.hub.clickwatch.analysis.results.DoubleDataResultValue _doubleDataResultValue = (de.hub.clickwatch.analysis.results.DoubleDataResultValue) c
        .copy(((de.hub.clickwatch.analysis.results.DoubleDataResultValue) p_doubleDataResultValue));
    c.copyReferences();
    DoubleDataResultValueBuilder _builder = newDoubleDataResultValueBuilder();
    _builder.value(_doubleDataResultValue.getValue());
    return _builder;
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public DoubleDataResultValueBuilder but() {
    DoubleDataResultValueBuilder _builder = newDoubleDataResultValueBuilder();
    _builder.m_featureValueSet = m_featureValueSet;
    _builder.m_value = m_value;
    return _builder;
  }

  /**
   * This method constructs the final de.hub.clickwatch.analysis.results.DoubleDataResultValue type.
   * @return new instance of the de.hub.clickwatch.analysis.results.DoubleDataResultValue type
   */
  public de.hub.clickwatch.analysis.results.DoubleDataResultValue build() {
    final de.hub.clickwatch.analysis.results.DoubleDataResultValue _newInstance = (de.hub.clickwatch.analysis.results.DoubleDataResultValue) de.hub.clickwatch.analysis.results.ResultsFactory.eINSTANCE
        .create(de.hub.clickwatch.analysis.results.ResultsPackage.eINSTANCE.getDoubleDataResultValue());
    if (m_featureValueSet) {
      _newInstance.setValue(m_value);
    }
    return _newInstance;
  }

  public DoubleDataResultValueBuilder value(double p_value) {
    m_value = p_value;
    m_featureValueSet = true;
    return this;
  }
}
