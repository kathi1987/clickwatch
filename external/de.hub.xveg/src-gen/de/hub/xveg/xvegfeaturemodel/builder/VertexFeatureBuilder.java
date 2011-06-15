package de.hub.xveg.xvegfeaturemodel.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>de.hub.xveg.xvegfeaturemodel.VertexFeature</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class VertexFeatureBuilder {
  private org.eclipse.emf.ecore.EClass m_elementClass;
  private java.lang.String m_name;
  private de.hub.xveg.xvegfeaturemodel.XvegDiagramType m_diagramType;
  private XvegDiagramTypeBuilder m_featureDiagramTypeBuilder;
  private de.hub.xveg.configuration.IFeatureConfigurationProvider m_configuration;
  private de.hub.xveg.xvegfeaturemodel.StyleInfo m_style;
  private StyleInfoBuilder m_featureStyleBuilder;
  private boolean m_featureElementClassSet = false;
  private boolean m_featureNameSet = false;
  private boolean m_featureDiagramTypeSet = false;
  private boolean m_featureConfigurationSet = false;
  private boolean m_featureStyleSet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newVertexFeatureBuilder()
   */
  private VertexFeatureBuilder() {
  }

  /**
   * This method creates a new instance of the VertexFeatureBuilder.
   * @return new instance of the VertexFeatureBuilder
   */
  public static VertexFeatureBuilder newVertexFeatureBuilder() {
    return new VertexFeatureBuilder();
  }

  /**
   * This method can be used to override attributes of the builder.
   */
  public VertexFeatureBuilder but() {
    VertexFeatureBuilder _builder = newVertexFeatureBuilder();
    _builder.m_featureElementClassSet = m_featureElementClassSet;
    _builder.m_elementClass = m_elementClass;
    _builder.m_featureNameSet = m_featureNameSet;
    _builder.m_name = m_name;
    _builder.m_featureDiagramTypeSet = m_featureDiagramTypeSet;
    _builder.m_diagramType = m_diagramType;
    _builder.m_featureDiagramTypeBuilder = m_featureDiagramTypeBuilder;
    _builder.m_featureConfigurationSet = m_featureConfigurationSet;
    _builder.m_configuration = m_configuration;
    _builder.m_featureStyleSet = m_featureStyleSet;
    _builder.m_style = m_style;
    _builder.m_featureStyleBuilder = m_featureStyleBuilder;
    return _builder;
  }

  /**
   * This method constructs the final de.hub.xveg.xvegfeaturemodel.VertexFeature type.
   * @return new instance of the de.hub.xveg.xvegfeaturemodel.VertexFeature type
   */
  public de.hub.xveg.xvegfeaturemodel.VertexFeature build() {
    final de.hub.xveg.xvegfeaturemodel.VertexFeature _newInstance = de.hub.xveg.xvegfeaturemodel.XvegFeatureModelFactory.eINSTANCE.createVertexFeature();
    if (m_featureElementClassSet) {
      _newInstance.setElementClass(m_elementClass);
    }
    if (m_featureNameSet) {
      _newInstance.setName(m_name);
    }
    if (m_featureDiagramTypeSet) {
      _newInstance.setDiagramType(m_diagramType);
    } else {
      if (m_featureDiagramTypeBuilder != null) {
        _newInstance.setDiagramType(m_featureDiagramTypeBuilder.build());
      }
    }
    if (m_featureConfigurationSet) {
      _newInstance.setConfiguration(m_configuration);
    }
    if (m_featureStyleSet) {
      _newInstance.setStyle(m_style);
    } else {
      if (m_featureStyleBuilder != null) {
        _newInstance.setStyle(m_featureStyleBuilder.build());
      }
    }
    return _newInstance;
  }

  public VertexFeatureBuilder withElementClass(org.eclipse.emf.ecore.EClass p_elementClass) {
    m_elementClass = p_elementClass;
    m_featureElementClassSet = true;
    return this;
  }

  public VertexFeatureBuilder withName(java.lang.String p_name) {
    m_name = p_name;
    m_featureNameSet = true;
    return this;
  }

  public VertexFeatureBuilder withDiagramType(de.hub.xveg.xvegfeaturemodel.XvegDiagramType p_diagramType) {
    m_diagramType = p_diagramType;
    m_featureDiagramTypeSet = true;
    return this;
  }

  public VertexFeatureBuilder withDiagramType(XvegDiagramTypeBuilder p_xvegDiagramTypeBuilder) {
    m_featureDiagramTypeBuilder = p_xvegDiagramTypeBuilder;
    return this;
  }

  public VertexFeatureBuilder withConfiguration(de.hub.xveg.configuration.IFeatureConfigurationProvider p_configuration) {
    m_configuration = p_configuration;
    m_featureConfigurationSet = true;
    return this;
  }

  public VertexFeatureBuilder withStyle(de.hub.xveg.xvegfeaturemodel.StyleInfo p_style) {
    m_style = p_style;
    m_featureStyleSet = true;
    return this;
  }

  public VertexFeatureBuilder withStyle(StyleInfoBuilder p_styleInfoBuilder) {
    m_featureStyleBuilder = p_styleInfoBuilder;
    return this;
  }
}
