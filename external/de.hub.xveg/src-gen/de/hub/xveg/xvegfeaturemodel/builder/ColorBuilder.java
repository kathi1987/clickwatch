package de.hub.xveg.xvegfeaturemodel.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>de.hub.xveg.xvegfeaturemodel.Color</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class ColorBuilder {
  private Integer m_r;
  private Integer m_g;
  private Integer m_b;
  private boolean m_featureRSet = false;
  private boolean m_featureGSet = false;
  private boolean m_featureBSet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newColorBuilder()
   */
  private ColorBuilder() {
  }

  /**
   * This method creates a new instance of the ColorBuilder.
   * @return new instance of the ColorBuilder
   */
  public static ColorBuilder newColorBuilder() {
    return new ColorBuilder();
  }

  /**
   * This method can be used to override attributes of the builder.
   */
  public ColorBuilder but() {
    ColorBuilder _builder = newColorBuilder();
    _builder.m_featureRSet = m_featureRSet;
    _builder.m_r = m_r;
    _builder.m_featureGSet = m_featureGSet;
    _builder.m_g = m_g;
    _builder.m_featureBSet = m_featureBSet;
    _builder.m_b = m_b;
    return _builder;
  }

  /**
   * This method constructs the final de.hub.xveg.xvegfeaturemodel.Color type.
   * @return new instance of the de.hub.xveg.xvegfeaturemodel.Color type
   */
  public de.hub.xveg.xvegfeaturemodel.Color build() {
    final de.hub.xveg.xvegfeaturemodel.Color _newInstance = de.hub.xveg.xvegfeaturemodel.XvegFeatureModelFactory.eINSTANCE.createColor();
    if (m_featureRSet) {
      _newInstance.setR(m_r);
    }
    if (m_featureGSet) {
      _newInstance.setG(m_g);
    }
    if (m_featureBSet) {
      _newInstance.setB(m_b);
    }
    return _newInstance;
  }

  public ColorBuilder withR(Integer p_r) {
    m_r = p_r;
    m_featureRSet = true;
    return this;
  }

  public ColorBuilder withG(Integer p_g) {
    m_g = p_g;
    m_featureGSet = true;
    return this;
  }

  public ColorBuilder withB(Integer p_b) {
    m_b = p_b;
    m_featureBSet = true;
    return this;
  }
}
