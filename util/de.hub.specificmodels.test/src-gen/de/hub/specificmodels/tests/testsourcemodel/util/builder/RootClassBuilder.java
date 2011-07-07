package de.hub.specificmodels.tests.testsourcemodel.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>de.hub.specificmodels.tests.testsourcemodel.RootClass</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class RootClassBuilder implements de.hub.specificmodels.tests.testsourcemodel.util.builder.ITestsourcemodelBuilder<de.hub.specificmodels.tests.testsourcemodel.RootClass> {
  // features and builders
  private java.lang.String m_anAttribute1;
  private java.util.Collection<de.hub.specificmodels.tests.testsourcemodel.ClassWithListFeatures> m_normalReference = new java.util.LinkedList<de.hub.specificmodels.tests.testsourcemodel.ClassWithListFeatures>();
  private java.util.Collection<de.hub.specificmodels.tests.testsourcemodel.util.builder.ITestsourcemodelBuilder<? extends de.hub.specificmodels.tests.testsourcemodel.ClassWithListFeatures>> m_featureNormalReferenceBuilder = new java.util.LinkedList<de.hub.specificmodels.tests.testsourcemodel.util.builder.ITestsourcemodelBuilder<? extends de.hub.specificmodels.tests.testsourcemodel.ClassWithListFeatures>>();
  // helper attributes
  private boolean m_featureAnAttribute1Set = false;
  private boolean m_featureNormalReferenceSet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newRootClassBuilder()
   */
  private RootClassBuilder() {
  }

  /**
   * This method creates a new instance of the RootClassBuilder.
   * @return new instance of the RootClassBuilder
   */
  public static RootClassBuilder newRootClassBuilder() {
    return new RootClassBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public RootClassBuilder but() {
    RootClassBuilder _builder = newRootClassBuilder();
    _builder.m_featureAnAttribute1Set = m_featureAnAttribute1Set;
    _builder.m_anAttribute1 = m_anAttribute1;
    _builder.m_featureNormalReferenceSet = m_featureNormalReferenceSet;
    _builder.m_normalReference = m_normalReference;
    _builder.m_featureNormalReferenceBuilder = m_featureNormalReferenceBuilder;
    return _builder;
  }

  /**
   * This method constructs the final de.hub.specificmodels.tests.testsourcemodel.RootClass type.
   * @return new instance of the de.hub.specificmodels.tests.testsourcemodel.RootClass type
   */
  public de.hub.specificmodels.tests.testsourcemodel.RootClass build() {
    final de.hub.specificmodels.tests.testsourcemodel.RootClass _newInstance = de.hub.specificmodels.tests.testsourcemodel.TestSourceModelFactory.eINSTANCE.createRootClass();
    if (m_featureAnAttribute1Set) {
      _newInstance.setAnAttribute1(m_anAttribute1);
    }
    if (m_featureNormalReferenceSet) {
      _newInstance.getNormalReference().addAll(m_normalReference);
    } else {
      if (!m_featureNormalReferenceBuilder.isEmpty()) {
        for (de.hub.specificmodels.tests.testsourcemodel.util.builder.ITestsourcemodelBuilder<? extends de.hub.specificmodels.tests.testsourcemodel.ClassWithListFeatures> builder : m_featureNormalReferenceBuilder) {
          _newInstance.getNormalReference().add(builder.build());
        }
      }
    }
    return _newInstance;
  }

  public RootClassBuilder withAnAttribute1(java.lang.String p_anAttribute1) {
    m_anAttribute1 = p_anAttribute1;
    m_featureAnAttribute1Set = true;
    return this;
  }

  public RootClassBuilder withNormalReference(de.hub.specificmodels.tests.testsourcemodel.ClassWithListFeatures p_normalReference) {
    m_normalReference.add(p_normalReference);
    m_featureNormalReferenceSet = true;
    return this;
  }

  public RootClassBuilder withNormalReference(java.util.Collection<? extends de.hub.specificmodels.tests.testsourcemodel.ClassWithListFeatures> p_normalReference) {
    m_normalReference.addAll(p_normalReference);
    m_featureNormalReferenceSet = true;
    return this;
  }

  public RootClassBuilder withNormalReference(
      de.hub.specificmodels.tests.testsourcemodel.util.builder.ITestsourcemodelBuilder<? extends de.hub.specificmodels.tests.testsourcemodel.ClassWithListFeatures> p_classWithListFeaturesBuilder) {
    m_featureNormalReferenceBuilder.add(p_classWithListFeaturesBuilder);
    return this;
  }
}
