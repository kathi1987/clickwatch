package de.hub.xveg.xvegfeaturemodel.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>de.hub.xveg.xvegfeaturemodel.EdgeFeature</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class EdgeFeatureBuilder {
  private org.eclipse.emf.ecore.EClass m_elementClass;
  private java.lang.String m_name;
  private de.hub.xveg.xvegfeaturemodel.XvegDiagramType m_diagramType;
  private XvegDiagramTypeBuilder m_featureDiagramTypeBuilder;
  private de.hub.xveg.configuration.IFeatureConfigurationProvider m_configuration;
  private de.hub.xveg.xvegfeaturemodel.StyleInfo m_style;
  private StyleInfoBuilder m_featureStyleBuilder;
  private org.eclipse.emf.ecore.EReference m_sourceReference;
  private org.eclipse.emf.ecore.EReference m_targetReference;
  private java.util.Collection<de.hub.xveg.xvegfeaturemodel.VertexFeature> m_possibleSourceFeatures = new java.util.LinkedList<de.hub.xveg.xvegfeaturemodel.VertexFeature>();
  private java.util.Collection<VertexFeatureBuilder> m_featurePossibleSourceFeaturesBuilder = new java.util.LinkedList<VertexFeatureBuilder>();
  private java.util.Collection<de.hub.xveg.xvegfeaturemodel.VertexFeature> m_possibleTargetFeatures = new java.util.LinkedList<de.hub.xveg.xvegfeaturemodel.VertexFeature>();
  private java.util.Collection<VertexFeatureBuilder> m_featurePossibleTargetFeaturesBuilder = new java.util.LinkedList<VertexFeatureBuilder>();
  private boolean m_featureElementClassSet = false;
  private boolean m_featureNameSet = false;
  private boolean m_featureDiagramTypeSet = false;
  private boolean m_featureConfigurationSet = false;
  private boolean m_featureStyleSet = false;
  private boolean m_featurePossibleSourceFeaturesSet = false;
  private boolean m_featurePossibleTargetFeaturesSet = false;
  private boolean m_featureSourceReferenceSet = false;
  private boolean m_featureTargetReferenceSet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newEdgeFeatureBuilder()
   */
  private EdgeFeatureBuilder() {
  }

  /**
   * This method creates a new instance of the EdgeFeatureBuilder.
   * @return new instance of the EdgeFeatureBuilder
   */
  public static EdgeFeatureBuilder newEdgeFeatureBuilder() {
    return new EdgeFeatureBuilder();
  }

  /**
   * This method can be used to override attributes of the builder.
   */
  public EdgeFeatureBuilder but() {
    EdgeFeatureBuilder _builder = newEdgeFeatureBuilder();
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
    _builder.m_featurePossibleSourceFeaturesSet = m_featurePossibleSourceFeaturesSet;
    _builder.m_possibleSourceFeatures = m_possibleSourceFeatures;
    _builder.m_featurePossibleSourceFeaturesBuilder = m_featurePossibleSourceFeaturesBuilder;
    _builder.m_featurePossibleTargetFeaturesSet = m_featurePossibleTargetFeaturesSet;
    _builder.m_possibleTargetFeatures = m_possibleTargetFeatures;
    _builder.m_featurePossibleTargetFeaturesBuilder = m_featurePossibleTargetFeaturesBuilder;
    _builder.m_featureSourceReferenceSet = m_featureSourceReferenceSet;
    _builder.m_sourceReference = m_sourceReference;
    _builder.m_featureTargetReferenceSet = m_featureTargetReferenceSet;
    _builder.m_targetReference = m_targetReference;
    return _builder;
  }

  /**
   * This method constructs the final de.hub.xveg.xvegfeaturemodel.EdgeFeature type.
   * @return new instance of the de.hub.xveg.xvegfeaturemodel.EdgeFeature type
   */
  public de.hub.xveg.xvegfeaturemodel.EdgeFeature build() {
    final de.hub.xveg.xvegfeaturemodel.EdgeFeature _newInstance = de.hub.xveg.xvegfeaturemodel.XvegFeatureModelFactory.eINSTANCE.createEdgeFeature();
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
    if (m_featurePossibleSourceFeaturesSet) {
      _newInstance.getPossibleSourceFeatures().addAll(m_possibleSourceFeatures);
    } else {
      if (!m_featurePossibleSourceFeaturesBuilder.isEmpty()) {
        for (VertexFeatureBuilder builder : m_featurePossibleSourceFeaturesBuilder) {
          _newInstance.getPossibleSourceFeatures().add(builder.build());
        }
      }
    }
    if (m_featurePossibleTargetFeaturesSet) {
      _newInstance.getPossibleTargetFeatures().addAll(m_possibleTargetFeatures);
    } else {
      if (!m_featurePossibleTargetFeaturesBuilder.isEmpty()) {
        for (VertexFeatureBuilder builder : m_featurePossibleTargetFeaturesBuilder) {
          _newInstance.getPossibleTargetFeatures().add(builder.build());
        }
      }
    }
    if (m_featureSourceReferenceSet) {
      _newInstance.setSourceReference(m_sourceReference);
    }
    if (m_featureTargetReferenceSet) {
      _newInstance.setTargetReference(m_targetReference);
    }
    return _newInstance;
  }

  public EdgeFeatureBuilder withElementClass(org.eclipse.emf.ecore.EClass p_elementClass) {
    m_elementClass = p_elementClass;
    m_featureElementClassSet = true;
    return this;
  }

  public EdgeFeatureBuilder withName(java.lang.String p_name) {
    m_name = p_name;
    m_featureNameSet = true;
    return this;
  }

  public EdgeFeatureBuilder withDiagramType(de.hub.xveg.xvegfeaturemodel.XvegDiagramType p_diagramType) {
    m_diagramType = p_diagramType;
    m_featureDiagramTypeSet = true;
    return this;
  }

  public EdgeFeatureBuilder withDiagramType(XvegDiagramTypeBuilder p_xvegDiagramTypeBuilder) {
    m_featureDiagramTypeBuilder = p_xvegDiagramTypeBuilder;
    return this;
  }

  public EdgeFeatureBuilder withConfiguration(de.hub.xveg.configuration.IFeatureConfigurationProvider p_configuration) {
    m_configuration = p_configuration;
    m_featureConfigurationSet = true;
    return this;
  }

  public EdgeFeatureBuilder withStyle(de.hub.xveg.xvegfeaturemodel.StyleInfo p_style) {
    m_style = p_style;
    m_featureStyleSet = true;
    return this;
  }

  public EdgeFeatureBuilder withStyle(StyleInfoBuilder p_styleInfoBuilder) {
    m_featureStyleBuilder = p_styleInfoBuilder;
    return this;
  }

  public EdgeFeatureBuilder withPossibleSourceFeatures(de.hub.xveg.xvegfeaturemodel.VertexFeature p_possibleSourceFeatures) {
    m_possibleSourceFeatures.add(p_possibleSourceFeatures);
    m_featurePossibleSourceFeaturesSet = true;
    return this;
  }

  public EdgeFeatureBuilder withPossibleSourceFeatures(java.util.Collection<? extends de.hub.xveg.xvegfeaturemodel.VertexFeature> p_possibleSourceFeatures) {
    m_possibleSourceFeatures.addAll(p_possibleSourceFeatures);
    m_featurePossibleSourceFeaturesSet = true;
    return this;
  }

  public EdgeFeatureBuilder withPossibleSourceFeatures(VertexFeatureBuilder p_vertexFeatureBuilder) {
    m_featurePossibleSourceFeaturesBuilder.add(p_vertexFeatureBuilder);
    return this;
  }

  public EdgeFeatureBuilder withPossibleTargetFeatures(de.hub.xveg.xvegfeaturemodel.VertexFeature p_possibleTargetFeatures) {
    m_possibleTargetFeatures.add(p_possibleTargetFeatures);
    m_featurePossibleTargetFeaturesSet = true;
    return this;
  }

  public EdgeFeatureBuilder withPossibleTargetFeatures(java.util.Collection<? extends de.hub.xveg.xvegfeaturemodel.VertexFeature> p_possibleTargetFeatures) {
    m_possibleTargetFeatures.addAll(p_possibleTargetFeatures);
    m_featurePossibleTargetFeaturesSet = true;
    return this;
  }

  public EdgeFeatureBuilder withPossibleTargetFeatures(VertexFeatureBuilder p_vertexFeatureBuilder) {
    m_featurePossibleTargetFeaturesBuilder.add(p_vertexFeatureBuilder);
    return this;
  }

  public EdgeFeatureBuilder withSourceReference(org.eclipse.emf.ecore.EReference p_sourceReference) {
    m_sourceReference = p_sourceReference;
    m_featureSourceReferenceSet = true;
    return this;
  }

  public EdgeFeatureBuilder withTargetReference(org.eclipse.emf.ecore.EReference p_targetReference) {
    m_targetReference = p_targetReference;
    m_featureTargetReferenceSet = true;
    return this;
  }
}
