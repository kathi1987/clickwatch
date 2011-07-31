package de.hub.specificmodels.tests.testsourcemodel.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>de.hub.specificmodels.tests.testsourcemodel.ListFeatureElementClass1</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class ListFeatureElementClass1Builder implements
    de.hub.specificmodels.tests.testsourcemodel.util.builder.ITestsourcemodelBuilder<de.hub.specificmodels.tests.testsourcemodel.ListFeatureElementClass1> {
  // features and builders
  private java.lang.String m_anAttributeOfFeatureClass1;
  private java.lang.String m_name;
  private java.util.Collection<org.eclipse.emf.ecore.util.FeatureMap.Entry> m_any = new java.util.LinkedList<org.eclipse.emf.ecore.util.FeatureMap.Entry>();
  private java.util.Collection<de.hub.specificmodels.tests.testsourcemodel.ListFeatureElementClass3> m_listFeature3 = new java.util.LinkedList<de.hub.specificmodels.tests.testsourcemodel.ListFeatureElementClass3>();
  private java.util.Collection<de.hub.specificmodels.tests.testsourcemodel.util.builder.ITestsourcemodelBuilder<? extends de.hub.specificmodels.tests.testsourcemodel.ListFeatureElementClass3>> m_featureListFeature3Builder = new java.util.LinkedList<de.hub.specificmodels.tests.testsourcemodel.util.builder.ITestsourcemodelBuilder<? extends de.hub.specificmodels.tests.testsourcemodel.ListFeatureElementClass3>>();
  // helper attributes
  private boolean m_featureAnAttributeOfFeatureClass1Set = false;
  private boolean m_featureAnySet = false;
  private boolean m_featureListFeature3Set = false;
  private boolean m_featureNameSet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newListFeatureElementClass1Builder()
   */
  private ListFeatureElementClass1Builder() {
  }

  /**
   * This method creates a new instance of the ListFeatureElementClass1Builder.
   * @return new instance of the ListFeatureElementClass1Builder
   */
  public static ListFeatureElementClass1Builder newListFeatureElementClass1Builder() {
    return new ListFeatureElementClass1Builder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public ListFeatureElementClass1Builder but() {
    ListFeatureElementClass1Builder _builder = newListFeatureElementClass1Builder();
    _builder.m_featureAnAttributeOfFeatureClass1Set = m_featureAnAttributeOfFeatureClass1Set;
    _builder.m_anAttributeOfFeatureClass1 = m_anAttributeOfFeatureClass1;
    _builder.m_featureAnySet = m_featureAnySet;
    _builder.m_any = m_any;
    _builder.m_featureListFeature3Set = m_featureListFeature3Set;
    _builder.m_listFeature3 = m_listFeature3;
    _builder.m_featureListFeature3Builder = m_featureListFeature3Builder;
    _builder.m_featureNameSet = m_featureNameSet;
    _builder.m_name = m_name;
    return _builder;
  }

  /**
   * This method constructs the final de.hub.specificmodels.tests.testsourcemodel.ListFeatureElementClass1 type.
   * @return new instance of the de.hub.specificmodels.tests.testsourcemodel.ListFeatureElementClass1 type
   */
  public de.hub.specificmodels.tests.testsourcemodel.ListFeatureElementClass1 build() {
    final de.hub.specificmodels.tests.testsourcemodel.ListFeatureElementClass1 _newInstance = de.hub.specificmodels.tests.testsourcemodel.TestSourceModelFactory.eINSTANCE
        .createListFeatureElementClass1();
    if (m_featureAnAttributeOfFeatureClass1Set) {
      _newInstance.setAnAttributeOfFeatureClass1(m_anAttributeOfFeatureClass1);
    }
    if (m_featureNameSet) {
      _newInstance.setName(m_name);
    }
    if (m_featureAnySet) {
      _newInstance.getAny().addAll(m_any);
    }
    if (m_featureListFeature3Set) {
      _newInstance.getListFeature3().addAll(m_listFeature3);
    } else {
      if (!m_featureListFeature3Builder.isEmpty()) {
        for (de.hub.specificmodels.tests.testsourcemodel.util.builder.ITestsourcemodelBuilder<? extends de.hub.specificmodels.tests.testsourcemodel.ListFeatureElementClass3> builder : m_featureListFeature3Builder) {
          _newInstance.getListFeature3().add(builder.build());
        }
      }
    }
    return _newInstance;
  }

  public ListFeatureElementClass1Builder withAnAttributeOfFeatureClass1(java.lang.String p_anAttributeOfFeatureClass1) {
    m_anAttributeOfFeatureClass1 = p_anAttributeOfFeatureClass1;
    m_featureAnAttributeOfFeatureClass1Set = true;
    return this;
  }

  public ListFeatureElementClass1Builder withName(java.lang.String p_name) {
    m_name = p_name;
    m_featureNameSet = true;
    return this;
  }

  public ListFeatureElementClass1Builder withAny(org.eclipse.emf.ecore.util.FeatureMap.Entry p_any) {
    m_any.add(p_any);
    m_featureAnySet = true;
    return this;
  }

  public ListFeatureElementClass1Builder withAny(java.util.Collection<? extends org.eclipse.emf.ecore.util.FeatureMap.Entry> p_any) {
    m_any.addAll(p_any);
    m_featureAnySet = true;
    return this;
  }

  public ListFeatureElementClass1Builder withListFeature3(de.hub.specificmodels.tests.testsourcemodel.ListFeatureElementClass3 p_listFeature3) {
    m_listFeature3.add(p_listFeature3);
    m_featureListFeature3Set = true;
    return this;
  }

  public ListFeatureElementClass1Builder withListFeature3(java.util.Collection<? extends de.hub.specificmodels.tests.testsourcemodel.ListFeatureElementClass3> p_listFeature3) {
    m_listFeature3.addAll(p_listFeature3);
    m_featureListFeature3Set = true;
    return this;
  }

  public ListFeatureElementClass1Builder withListFeature3(
      de.hub.specificmodels.tests.testsourcemodel.util.builder.ITestsourcemodelBuilder<? extends de.hub.specificmodels.tests.testsourcemodel.ListFeatureElementClass3> p_listFeatureElementClass3Builder) {
    m_featureListFeature3Builder.add(p_listFeatureElementClass3Builder);
    return this;
  }
}
