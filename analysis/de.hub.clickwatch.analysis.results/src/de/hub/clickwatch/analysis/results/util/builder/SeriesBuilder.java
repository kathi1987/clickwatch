package de.hub.clickwatch.analysis.results.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object '<em><b>de.hub.clickwatch.analysis.results.Series</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class SeriesBuilder implements de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<de.hub.clickwatch.analysis.results.Series> {
  // features and builders
  private Integer m_column;
  private de.hub.clickwatch.analysis.results.Constraint m_constraint;
  private de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<? extends de.hub.clickwatch.analysis.results.Constraint> m_featureConstraintBuilder;
  private java.lang.String m_name;
  // helper attributes
  private boolean m_featureColumnSet = false;
  private boolean m_featureConstraintSet = false;
  private boolean m_featureNameSet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newSeriesBuilder()
   */
  private SeriesBuilder() {
  }

  /**
   * This method creates a new instance of the SeriesBuilder.
   * @return new instance of the SeriesBuilder
   */
  public static SeriesBuilder newSeriesBuilder() {
    return new SeriesBuilder();
  }

  /**
   * This method creates a new instance of the SeriesBuilder. 
   * The builder is initialized using an existing '<em><b>de.hub.clickwatch.analysis.results.Series</b></em>' model object.
   * In order to avoid changes to the provided '<em><b>de.hub.clickwatch.analysis.results.Series</b></em>' model object, a copy is created using <em><b>org.eclipse.emf.ecore.util.EcoreUtil.Copier</b></em>.
   * @param series The existing '<em><b>de.hub.clickwatch.analysis.results.Series</b></em>' model object to be used for the initialization of the builder  
   * @return new initialized instance of the SeriesBuilder
   */
  public static SeriesBuilder newSeriesBuilder(de.hub.clickwatch.analysis.results.Series p_series) {
    org.eclipse.emf.ecore.util.EcoreUtil.Copier c = new org.eclipse.emf.ecore.util.EcoreUtil.Copier();
    de.hub.clickwatch.analysis.results.Series _series = (de.hub.clickwatch.analysis.results.Series) c.copy(((de.hub.clickwatch.analysis.results.Series) p_series));
    c.copyReferences();
    SeriesBuilder _builder = newSeriesBuilder();
    _builder.column(_series.getColumn());
    _builder.constraint(_series.getConstraint());
    _builder.name(_series.getName());
    return _builder;
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public SeriesBuilder but() {
    SeriesBuilder _builder = newSeriesBuilder();
    _builder.m_featureColumnSet = m_featureColumnSet;
    _builder.m_column = m_column;
    _builder.m_featureConstraintSet = m_featureConstraintSet;
    _builder.m_constraint = m_constraint;
    _builder.m_featureConstraintBuilder = m_featureConstraintBuilder;
    _builder.m_featureNameSet = m_featureNameSet;
    _builder.m_name = m_name;
    return _builder;
  }

  /**
   * This method constructs the final de.hub.clickwatch.analysis.results.Series type.
   * @return new instance of the de.hub.clickwatch.analysis.results.Series type
   */
  public de.hub.clickwatch.analysis.results.Series build() {
    final de.hub.clickwatch.analysis.results.Series _newInstance = (de.hub.clickwatch.analysis.results.Series) de.hub.clickwatch.analysis.results.ResultsFactory.eINSTANCE
        .create(de.hub.clickwatch.analysis.results.ResultsPackage.eINSTANCE.getSeries());
    if (m_featureColumnSet) {
      _newInstance.setColumn(m_column);
    }
    if (m_featureConstraintSet) {
      _newInstance.setConstraint(m_constraint);
    } else {
      if (m_featureConstraintBuilder != null) {
        _newInstance.setConstraint(m_featureConstraintBuilder.build());
      }
    }
    if (m_featureNameSet) {
      _newInstance.setName(m_name);
    }
    return _newInstance;
  }

  public SeriesBuilder column(Integer p_column) {
    m_column = p_column;
    m_featureColumnSet = true;
    return this;
  }

  public SeriesBuilder constraint(de.hub.clickwatch.analysis.results.Constraint p_constraint) {
    m_constraint = p_constraint;
    m_featureConstraintSet = true;
    return this;
  }

  public SeriesBuilder constraint(de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<? extends de.hub.clickwatch.analysis.results.Constraint> p_constraintBuilder) {
    m_featureConstraintBuilder = p_constraintBuilder;
    return this;
  }

  public SeriesBuilder name(java.lang.String p_name) {
    m_name = p_name;
    m_featureNameSet = true;
    return this;
  }
}
