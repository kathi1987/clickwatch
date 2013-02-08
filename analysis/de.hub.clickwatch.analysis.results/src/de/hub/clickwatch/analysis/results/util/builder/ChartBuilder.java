package de.hub.clickwatch.analysis.results.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object '<em><b>de.hub.clickwatch.analysis.results.Chart</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class ChartBuilder implements de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<de.hub.clickwatch.analysis.results.Chart> {
  // features and builders
  private java.lang.String m_name;
  private de.hub.clickwatch.analysis.results.ChartType m_type;
  private de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<? extends de.hub.clickwatch.analysis.results.ChartType> m_featureTypeBuilder;
  private java.util.Collection<de.hub.clickwatch.analysis.results.ValueSpec> m_valueSpecs = new java.util.LinkedList<de.hub.clickwatch.analysis.results.ValueSpec>();
  private java.util.Collection<de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<? extends de.hub.clickwatch.analysis.results.ValueSpec>> m_featureValueSpecsBuilder = new java.util.LinkedList<de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<? extends de.hub.clickwatch.analysis.results.ValueSpec>>();
  // helper attributes
  private boolean m_featureNameSet = false;
  private boolean m_featureTypeSet = false;
  private boolean m_featureValueSpecsSet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newChartBuilder()
   */
  private ChartBuilder() {
  }

  /**
   * This method creates a new instance of the ChartBuilder.
   * @return new instance of the ChartBuilder
   */
  public static ChartBuilder newChartBuilder() {
    return new ChartBuilder();
  }

  /**
   * This method creates a new instance of the ChartBuilder. 
   * The builder is initialized using an existing '<em><b>de.hub.clickwatch.analysis.results.Chart</b></em>' model object.
   * In order to avoid changes to the provided '<em><b>de.hub.clickwatch.analysis.results.Chart</b></em>' model object, a copy is created using <em><b>org.eclipse.emf.ecore.util.EcoreUtil.Copier</b></em>.
   * @param chart The existing '<em><b>de.hub.clickwatch.analysis.results.Chart</b></em>' model object to be used for the initialization of the builder  
   * @return new initialized instance of the ChartBuilder
   */
  public static ChartBuilder newChartBuilder(de.hub.clickwatch.analysis.results.Chart p_chart) {
    org.eclipse.emf.ecore.util.EcoreUtil.Copier c = new org.eclipse.emf.ecore.util.EcoreUtil.Copier();
    de.hub.clickwatch.analysis.results.Chart _chart = (de.hub.clickwatch.analysis.results.Chart) c.copy(((de.hub.clickwatch.analysis.results.Chart) p_chart));
    c.copyReferences();
    ChartBuilder _builder = newChartBuilder();
    _builder.name(_chart.getName());
    _builder.type(_chart.getType());
    if (_chart.getValueSpecs() != null) {
      _builder.valueSpecs(_chart.getValueSpecs());
    }
    return _builder;
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public ChartBuilder but() {
    ChartBuilder _builder = newChartBuilder();
    _builder.m_featureNameSet = m_featureNameSet;
    _builder.m_name = m_name;
    _builder.m_featureTypeSet = m_featureTypeSet;
    _builder.m_type = m_type;
    _builder.m_featureTypeBuilder = m_featureTypeBuilder;
    _builder.m_featureValueSpecsSet = m_featureValueSpecsSet;
    _builder.m_valueSpecs = m_valueSpecs;
    _builder.m_featureValueSpecsBuilder = m_featureValueSpecsBuilder;
    return _builder;
  }

  /**
   * This method constructs the final de.hub.clickwatch.analysis.results.Chart type.
   * @return new instance of the de.hub.clickwatch.analysis.results.Chart type
   */
  public de.hub.clickwatch.analysis.results.Chart build() {
    final de.hub.clickwatch.analysis.results.Chart _newInstance = (de.hub.clickwatch.analysis.results.Chart) de.hub.clickwatch.analysis.results.ResultsFactory.eINSTANCE
        .create(de.hub.clickwatch.analysis.results.ResultsPackage.eINSTANCE.getChart());
    if (m_featureNameSet) {
      _newInstance.setName(m_name);
    }
    if (m_featureTypeSet) {
      _newInstance.setType(m_type);
    } else {
      if (m_featureTypeBuilder != null) {
        _newInstance.setType(m_featureTypeBuilder.build());
      }
    }
    if (m_featureValueSpecsSet) {
      _newInstance.getValueSpecs().addAll(m_valueSpecs);
    } else {
      if (!m_featureValueSpecsBuilder.isEmpty()) {
        for (de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<? extends de.hub.clickwatch.analysis.results.ValueSpec> builder : m_featureValueSpecsBuilder) {
          _newInstance.getValueSpecs().add(builder.build());
        }
      }
    }
    return _newInstance;
  }

  public ChartBuilder name(java.lang.String p_name) {
    m_name = p_name;
    m_featureNameSet = true;
    return this;
  }

  public ChartBuilder type(de.hub.clickwatch.analysis.results.ChartType p_type) {
    m_type = p_type;
    m_featureTypeSet = true;
    return this;
  }

  public ChartBuilder type(de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<? extends de.hub.clickwatch.analysis.results.ChartType> p_chartTypeBuilder) {
    m_featureTypeBuilder = p_chartTypeBuilder;
    return this;
  }

  public ChartBuilder valueSpecs(de.hub.clickwatch.analysis.results.ValueSpec p_valueSpecs) {
    m_valueSpecs.add(p_valueSpecs);
    m_featureValueSpecsSet = true;
    return this;
  }

  public ChartBuilder valueSpecs(java.util.Collection<? extends de.hub.clickwatch.analysis.results.ValueSpec> p_valueSpecs) {
    m_valueSpecs.addAll(p_valueSpecs);
    m_featureValueSpecsSet = true;
    return this;
  }

  public ChartBuilder valueSpecs(de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<? extends de.hub.clickwatch.analysis.results.ValueSpec> p_valueSpecBuilder) {
    m_featureValueSpecsBuilder.add(p_valueSpecBuilder);
    return this;
  }
}
