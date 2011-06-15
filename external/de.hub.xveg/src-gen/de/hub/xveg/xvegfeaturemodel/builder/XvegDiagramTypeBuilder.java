package de.hub.xveg.xvegfeaturemodel.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>de.hub.xveg.xvegfeaturemodel.XvegDiagramType</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class XvegDiagramTypeBuilder {
  private org.eclipse.emf.ecore.EFactory m_dslFactory;
  private java.util.Collection<de.hub.xveg.xvegfeaturemodel.XvegFeature> m_features = new java.util.LinkedList<de.hub.xveg.xvegfeaturemodel.XvegFeature>();
  private java.util.Collection<XvegFeatureBuilder> m_featureFeaturesBuilder = new java.util.LinkedList<XvegFeatureBuilder>();
  private boolean m_featureFeaturesSet = false;
  private boolean m_featureDslFactorySet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newXvegDiagramTypeBuilder()
   */
  private XvegDiagramTypeBuilder() {
  }

  /**
   * This method creates a new instance of the XvegDiagramTypeBuilder.
   * @return new instance of the XvegDiagramTypeBuilder
   */
  public static XvegDiagramTypeBuilder newXvegDiagramTypeBuilder() {
    return new XvegDiagramTypeBuilder();
  }

  /**
   * This method can be used to override attributes of the builder.
   */
  public XvegDiagramTypeBuilder but() {
    XvegDiagramTypeBuilder _builder = newXvegDiagramTypeBuilder();
    _builder.m_featureFeaturesSet = m_featureFeaturesSet;
    _builder.m_features = m_features;
    _builder.m_featureFeaturesBuilder = m_featureFeaturesBuilder;
    _builder.m_featureDslFactorySet = m_featureDslFactorySet;
    _builder.m_dslFactory = m_dslFactory;
    return _builder;
  }

  /**
   * This method constructs the final de.hub.xveg.xvegfeaturemodel.XvegDiagramType type.
   * @return new instance of the de.hub.xveg.xvegfeaturemodel.XvegDiagramType type
   */
  public de.hub.xveg.xvegfeaturemodel.XvegDiagramType build() {
    final de.hub.xveg.xvegfeaturemodel.XvegDiagramType _newInstance = de.hub.xveg.xvegfeaturemodel.XvegFeatureModelFactory.eINSTANCE.createXvegDiagramType();
    if (m_featureFeaturesSet) {
      _newInstance.getFeatures().addAll(m_features);
    } else {
      if (!m_featureFeaturesBuilder.isEmpty()) {
        for (XvegFeatureBuilder builder : m_featureFeaturesBuilder) {
          _newInstance.getFeatures().add(builder.build());
        }
      }
    }
    if (m_featureDslFactorySet) {
      _newInstance.setDslFactory(m_dslFactory);
    }
    return _newInstance;
  }

  public XvegDiagramTypeBuilder withFeatures(de.hub.xveg.xvegfeaturemodel.XvegFeature p_features) {
    m_features.add(p_features);
    m_featureFeaturesSet = true;
    return this;
  }

  public XvegDiagramTypeBuilder withFeatures(java.util.Collection<? extends de.hub.xveg.xvegfeaturemodel.XvegFeature> p_features) {
    m_features.addAll(p_features);
    m_featureFeaturesSet = true;
    return this;
  }

  public XvegDiagramTypeBuilder withFeatures(XvegFeatureBuilder p_xvegFeatureBuilder) {
    m_featureFeaturesBuilder.add(p_xvegFeatureBuilder);
    return this;
  }

  public XvegDiagramTypeBuilder withDslFactory(org.eclipse.emf.ecore.EFactory p_dslFactory) {
    m_dslFactory = p_dslFactory;
    m_featureDslFactorySet = true;
    return this;
  }
}
