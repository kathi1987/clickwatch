package de.hub.xveg.xvegfeaturemodel.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>de.hub.xveg.xvegfeaturemodel.StyleInfo</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class StyleInfoBuilder {
  private de.hub.xveg.xvegfeaturemodel.Color m_lineColor;
  private ColorBuilder m_featureLineColorBuilder;
  private de.hub.xveg.xvegfeaturemodel.Color m_backgroundColor;
  private ColorBuilder m_featureBackgroundColorBuilder;
  private de.hub.xveg.xvegfeaturemodel.Color m_textColor;
  private ColorBuilder m_featureTextColorBuilder;
  private Integer m_fontSize;
  private Boolean m_boldFont;
  private boolean m_featureLineColorSet = false;
  private boolean m_featureBackgroundColorSet = false;
  private boolean m_featureTextColorSet = false;
  private boolean m_featureFontSizeSet = false;
  private boolean m_featureBoldFontSet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newStyleInfoBuilder()
   */
  private StyleInfoBuilder() {
  }

  /**
   * This method creates a new instance of the StyleInfoBuilder.
   * @return new instance of the StyleInfoBuilder
   */
  public static StyleInfoBuilder newStyleInfoBuilder() {
    return new StyleInfoBuilder();
  }

  /**
   * This method can be used to override attributes of the builder.
   */
  public StyleInfoBuilder but() {
    StyleInfoBuilder _builder = newStyleInfoBuilder();
    _builder.m_featureLineColorSet = m_featureLineColorSet;
    _builder.m_lineColor = m_lineColor;
    _builder.m_featureLineColorBuilder = m_featureLineColorBuilder;
    _builder.m_featureBackgroundColorSet = m_featureBackgroundColorSet;
    _builder.m_backgroundColor = m_backgroundColor;
    _builder.m_featureBackgroundColorBuilder = m_featureBackgroundColorBuilder;
    _builder.m_featureTextColorSet = m_featureTextColorSet;
    _builder.m_textColor = m_textColor;
    _builder.m_featureTextColorBuilder = m_featureTextColorBuilder;
    _builder.m_featureFontSizeSet = m_featureFontSizeSet;
    _builder.m_fontSize = m_fontSize;
    _builder.m_featureBoldFontSet = m_featureBoldFontSet;
    _builder.m_boldFont = m_boldFont;
    return _builder;
  }

  /**
   * This method constructs the final de.hub.xveg.xvegfeaturemodel.StyleInfo type.
   * @return new instance of the de.hub.xveg.xvegfeaturemodel.StyleInfo type
   */
  public de.hub.xveg.xvegfeaturemodel.StyleInfo build() {
    final de.hub.xveg.xvegfeaturemodel.StyleInfo _newInstance = de.hub.xveg.xvegfeaturemodel.XvegFeatureModelFactory.eINSTANCE.createStyleInfo();
    if (m_featureLineColorSet) {
      _newInstance.setLineColor(m_lineColor);
    } else {
      if (m_featureLineColorBuilder != null) {
        _newInstance.setLineColor(m_featureLineColorBuilder.build());
      }
    }
    if (m_featureBackgroundColorSet) {
      _newInstance.setBackgroundColor(m_backgroundColor);
    } else {
      if (m_featureBackgroundColorBuilder != null) {
        _newInstance.setBackgroundColor(m_featureBackgroundColorBuilder.build());
      }
    }
    if (m_featureTextColorSet) {
      _newInstance.setTextColor(m_textColor);
    } else {
      if (m_featureTextColorBuilder != null) {
        _newInstance.setTextColor(m_featureTextColorBuilder.build());
      }
    }
    if (m_featureFontSizeSet) {
      _newInstance.setFontSize(m_fontSize);
    }
    if (m_featureBoldFontSet) {
      _newInstance.setBoldFont(m_boldFont);
    }
    return _newInstance;
  }

  public StyleInfoBuilder withLineColor(de.hub.xveg.xvegfeaturemodel.Color p_lineColor) {
    m_lineColor = p_lineColor;
    m_featureLineColorSet = true;
    return this;
  }

  public StyleInfoBuilder withLineColor(ColorBuilder p_colorBuilder) {
    m_featureLineColorBuilder = p_colorBuilder;
    return this;
  }

  public StyleInfoBuilder withBackgroundColor(de.hub.xveg.xvegfeaturemodel.Color p_backgroundColor) {
    m_backgroundColor = p_backgroundColor;
    m_featureBackgroundColorSet = true;
    return this;
  }

  public StyleInfoBuilder withBackgroundColor(ColorBuilder p_colorBuilder) {
    m_featureBackgroundColorBuilder = p_colorBuilder;
    return this;
  }

  public StyleInfoBuilder withTextColor(de.hub.xveg.xvegfeaturemodel.Color p_textColor) {
    m_textColor = p_textColor;
    m_featureTextColorSet = true;
    return this;
  }

  public StyleInfoBuilder withTextColor(ColorBuilder p_colorBuilder) {
    m_featureTextColorBuilder = p_colorBuilder;
    return this;
  }

  public StyleInfoBuilder withFontSize(Integer p_fontSize) {
    m_fontSize = p_fontSize;
    m_featureFontSizeSet = true;
    return this;
  }

  public StyleInfoBuilder withBoldFont(Boolean p_boldFont) {
    m_boldFont = p_boldFont;
    m_featureBoldFontSet = true;
    return this;
  }
}
