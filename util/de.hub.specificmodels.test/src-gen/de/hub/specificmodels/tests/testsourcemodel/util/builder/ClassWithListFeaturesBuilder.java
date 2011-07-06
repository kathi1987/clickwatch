package de.hub.specificmodels.tests.testsourcemodel.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>de.hub.specificmodels.tests.testsourcemodel.ClassWithListFeatures</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class ClassWithListFeaturesBuilder implements
    de.hub.specificmodels.tests.testsourcemodel.util.builder.ITestsourcemodelBuilder<de.hub.specificmodels.tests.testsourcemodel.ClassWithListFeatures> {
  // features and builders
  private Integer m_anAttribute1;
  private java.util.Collection<de.hub.specificmodels.tests.testsourcemodel.ListFeatureElementClass1> m_listFeature1 = new java.util.LinkedList<de.hub.specificmodels.tests.testsourcemodel.ListFeatureElementClass1>();
  private java.util.Collection<de.hub.specificmodels.tests.testsourcemodel.util.builder.ITestsourcemodelBuilder<? extends de.hub.specificmodels.tests.testsourcemodel.ListFeatureElementClass1>> m_featureListFeature1Builder = new java.util.LinkedList<de.hub.specificmodels.tests.testsourcemodel.util.builder.ITestsourcemodelBuilder<? extends de.hub.specificmodels.tests.testsourcemodel.ListFeatureElementClass1>>();
  private java.util.Collection<de.hub.specificmodels.tests.testsourcemodel.ListFeatureElementClass2> m_listFeature2 = new java.util.LinkedList<de.hub.specificmodels.tests.testsourcemodel.ListFeatureElementClass2>();
  private java.util.Collection<de.hub.specificmodels.tests.testsourcemodel.util.builder.ITestsourcemodelBuilder<? extends de.hub.specificmodels.tests.testsourcemodel.ListFeatureElementClass2>> m_featureListFeature2Builder = new java.util.LinkedList<de.hub.specificmodels.tests.testsourcemodel.util.builder.ITestsourcemodelBuilder<? extends de.hub.specificmodels.tests.testsourcemodel.ListFeatureElementClass2>>();
  // helper attributes
  private boolean m_featureAnAttribute1Set = false;
  private boolean m_featureListFeature1Set = false;
  private boolean m_featureListFeature2Set = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newClassWithListFeaturesBuilder()
   */
  private ClassWithListFeaturesBuilder() {
  }

  /**
   * This method creates a new instance of the ClassWithListFeaturesBuilder.
   * @return new instance of the ClassWithListFeaturesBuilder
   */
  public static ClassWithListFeaturesBuilder newClassWithListFeaturesBuilder() {
    return new ClassWithListFeaturesBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public ClassWithListFeaturesBuilder but() {
    ClassWithListFeaturesBuilder _builder = newClassWithListFeaturesBuilder();
    _builder.m_featureAnAttribute1Set = m_featureAnAttribute1Set;
    _builder.m_anAttribute1 = m_anAttribute1;
    _builder.m_featureListFeature1Set = m_featureListFeature1Set;
    _builder.m_listFeature1 = m_listFeature1;
    _builder.m_featureListFeature1Builder = m_featureListFeature1Builder;
    _builder.m_featureListFeature2Set = m_featureListFeature2Set;
    _builder.m_listFeature2 = m_listFeature2;
    _builder.m_featureListFeature2Builder = m_featureListFeature2Builder;
    return _builder;
  }

  /**
   * This method constructs the final de.hub.specificmodels.tests.testsourcemodel.ClassWithListFeatures type.
   * @return new instance of the de.hub.specificmodels.tests.testsourcemodel.ClassWithListFeatures type
   */
  public de.hub.specificmodels.tests.testsourcemodel.ClassWithListFeatures build() {
    final de.hub.specificmodels.tests.testsourcemodel.ClassWithListFeatures _newInstance = de.hub.specificmodels.tests.testsourcemodel.TestSourceModelFactory.eINSTANCE.createClassWithListFeatures();
    if (m_featureAnAttribute1Set) {
      _newInstance.setAnAttribute1(m_anAttribute1);
    }
    if (m_featureListFeature1Set) {
      _newInstance.getListFeature1().addAll(m_listFeature1);
    } else {
      if (!m_featureListFeature1Builder.isEmpty()) {
        for (de.hub.specificmodels.tests.testsourcemodel.util.builder.ITestsourcemodelBuilder<? extends de.hub.specificmodels.tests.testsourcemodel.ListFeatureElementClass1> builder : m_featureListFeature1Builder) {
          _newInstance.getListFeature1().add(builder.build());
        }
      }
    }
    if (m_featureListFeature2Set) {
      _newInstance.getListFeature2().addAll(m_listFeature2);
    } else {
      if (!m_featureListFeature2Builder.isEmpty()) {
        for (de.hub.specificmodels.tests.testsourcemodel.util.builder.ITestsourcemodelBuilder<? extends de.hub.specificmodels.tests.testsourcemodel.ListFeatureElementClass2> builder : m_featureListFeature2Builder) {
          _newInstance.getListFeature2().add(builder.build());
        }
      }
    }
    return _newInstance;
  }

  public ClassWithListFeaturesBuilder withAnAttribute1(Integer p_anAttribute1) {
    m_anAttribute1 = p_anAttribute1;
    m_featureAnAttribute1Set = true;
    return this;
  }

  public ClassWithListFeaturesBuilder withListFeature1(de.hub.specificmodels.tests.testsourcemodel.ListFeatureElementClass1 p_listFeature1) {
    m_listFeature1.add(p_listFeature1);
    m_featureListFeature1Set = true;
    return this;
  }

  public ClassWithListFeaturesBuilder withListFeature1(java.util.Collection<? extends de.hub.specificmodels.tests.testsourcemodel.ListFeatureElementClass1> p_listFeature1) {
    m_listFeature1.addAll(p_listFeature1);
    m_featureListFeature1Set = true;
    return this;
  }

  public ClassWithListFeaturesBuilder withListFeature1(
      de.hub.specificmodels.tests.testsourcemodel.util.builder.ITestsourcemodelBuilder<? extends de.hub.specificmodels.tests.testsourcemodel.ListFeatureElementClass1> p_listFeatureElementClass1Builder) {
    m_featureListFeature1Builder.add(p_listFeatureElementClass1Builder);
    return this;
  }

  public ClassWithListFeaturesBuilder withListFeature2(de.hub.specificmodels.tests.testsourcemodel.ListFeatureElementClass2 p_listFeature2) {
    m_listFeature2.add(p_listFeature2);
    m_featureListFeature2Set = true;
    return this;
  }

  public ClassWithListFeaturesBuilder withListFeature2(java.util.Collection<? extends de.hub.specificmodels.tests.testsourcemodel.ListFeatureElementClass2> p_listFeature2) {
    m_listFeature2.addAll(p_listFeature2);
    m_featureListFeature2Set = true;
    return this;
  }

  public ClassWithListFeaturesBuilder withListFeature2(
      de.hub.specificmodels.tests.testsourcemodel.util.builder.ITestsourcemodelBuilder<? extends de.hub.specificmodels.tests.testsourcemodel.ListFeatureElementClass2> p_listFeatureElementClass2Builder) {
    m_featureListFeature2Builder.add(p_listFeatureElementClass2Builder);
    return this;
  }
}
