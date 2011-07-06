package de.hub.specificmodels.tests.testsourcemodel.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>de.hub.specificmodels.tests.testsourcemodel.ListFeatureElementClass3</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class ListFeatureElementClass3Builder implements
    de.hub.specificmodels.tests.testsourcemodel.util.builder.ITestsourcemodelBuilder<de.hub.specificmodels.tests.testsourcemodel.ListFeatureElementClass3> {
  // features and builders
  private java.lang.String m_anAttributeOfFeatureClass3;
  private java.lang.String m_name;
  // helper attributes
  private boolean m_featureAnAttributeOfFeatureClass3Set = false;
  private boolean m_featureNameSet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newListFeatureElementClass3Builder()
   */
  private ListFeatureElementClass3Builder() {
  }

  /**
   * This method creates a new instance of the ListFeatureElementClass3Builder.
   * @return new instance of the ListFeatureElementClass3Builder
   */
  public static ListFeatureElementClass3Builder newListFeatureElementClass3Builder() {
    return new ListFeatureElementClass3Builder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public ListFeatureElementClass3Builder but() {
    ListFeatureElementClass3Builder _builder = newListFeatureElementClass3Builder();
    _builder.m_featureAnAttributeOfFeatureClass3Set = m_featureAnAttributeOfFeatureClass3Set;
    _builder.m_anAttributeOfFeatureClass3 = m_anAttributeOfFeatureClass3;
    _builder.m_featureNameSet = m_featureNameSet;
    _builder.m_name = m_name;
    return _builder;
  }

  /**
   * This method constructs the final de.hub.specificmodels.tests.testsourcemodel.ListFeatureElementClass3 type.
   * @return new instance of the de.hub.specificmodels.tests.testsourcemodel.ListFeatureElementClass3 type
   */
  public de.hub.specificmodels.tests.testsourcemodel.ListFeatureElementClass3 build() {
    final de.hub.specificmodels.tests.testsourcemodel.ListFeatureElementClass3 _newInstance = de.hub.specificmodels.tests.testsourcemodel.TestSourceModelFactory.eINSTANCE
        .createListFeatureElementClass3();
    if (m_featureAnAttributeOfFeatureClass3Set) {
      _newInstance.setAnAttributeOfFeatureClass3(m_anAttributeOfFeatureClass3);
    }
    if (m_featureNameSet) {
      _newInstance.setName(m_name);
    }
    return _newInstance;
  }

  public ListFeatureElementClass3Builder withAnAttributeOfFeatureClass3(java.lang.String p_anAttributeOfFeatureClass3) {
    m_anAttributeOfFeatureClass3 = p_anAttributeOfFeatureClass3;
    m_featureAnAttributeOfFeatureClass3Set = true;
    return this;
  }

  public ListFeatureElementClass3Builder withName(java.lang.String p_name) {
    m_name = p_name;
    m_featureNameSet = true;
    return this;
  }
}
