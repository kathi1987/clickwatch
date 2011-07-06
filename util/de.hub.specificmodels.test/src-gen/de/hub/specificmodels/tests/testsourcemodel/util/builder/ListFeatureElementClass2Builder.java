package de.hub.specificmodels.tests.testsourcemodel.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>de.hub.specificmodels.tests.testsourcemodel.ListFeatureElementClass2</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class ListFeatureElementClass2Builder implements
    de.hub.specificmodels.tests.testsourcemodel.util.builder.ITestsourcemodelBuilder<de.hub.specificmodels.tests.testsourcemodel.ListFeatureElementClass2> {
  // features and builders
  private java.lang.String m_anAttributeOfFeatureClass2;
  private java.lang.String m_name;
  // helper attributes
  private boolean m_featureAnAttributeOfFeatureClass2Set = false;
  private boolean m_featureNameSet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newListFeatureElementClass2Builder()
   */
  private ListFeatureElementClass2Builder() {
  }

  /**
   * This method creates a new instance of the ListFeatureElementClass2Builder.
   * @return new instance of the ListFeatureElementClass2Builder
   */
  public static ListFeatureElementClass2Builder newListFeatureElementClass2Builder() {
    return new ListFeatureElementClass2Builder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public ListFeatureElementClass2Builder but() {
    ListFeatureElementClass2Builder _builder = newListFeatureElementClass2Builder();
    _builder.m_featureAnAttributeOfFeatureClass2Set = m_featureAnAttributeOfFeatureClass2Set;
    _builder.m_anAttributeOfFeatureClass2 = m_anAttributeOfFeatureClass2;
    _builder.m_featureNameSet = m_featureNameSet;
    _builder.m_name = m_name;
    return _builder;
  }

  /**
   * This method constructs the final de.hub.specificmodels.tests.testsourcemodel.ListFeatureElementClass2 type.
   * @return new instance of the de.hub.specificmodels.tests.testsourcemodel.ListFeatureElementClass2 type
   */
  public de.hub.specificmodels.tests.testsourcemodel.ListFeatureElementClass2 build() {
    final de.hub.specificmodels.tests.testsourcemodel.ListFeatureElementClass2 _newInstance = de.hub.specificmodels.tests.testsourcemodel.TestSourceModelFactory.eINSTANCE
        .createListFeatureElementClass2();
    if (m_featureAnAttributeOfFeatureClass2Set) {
      _newInstance.setAnAttributeOfFeatureClass2(m_anAttributeOfFeatureClass2);
    }
    if (m_featureNameSet) {
      _newInstance.setName(m_name);
    }
    return _newInstance;
  }

  public ListFeatureElementClass2Builder withAnAttributeOfFeatureClass2(java.lang.String p_anAttributeOfFeatureClass2) {
    m_anAttributeOfFeatureClass2 = p_anAttributeOfFeatureClass2;
    m_featureAnAttributeOfFeatureClass2Set = true;
    return this;
  }

  public ListFeatureElementClass2Builder withName(java.lang.String p_name) {
    m_name = p_name;
    m_featureNameSet = true;
    return this;
  }
}
