package de.hub.clickwatch.analysis.results.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object '<em><b>de.hub.clickwatch.analysis.results.Results</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class ResultsBuilder implements de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<de.hub.clickwatch.analysis.results.Results> {
  // features and builders
  private java.lang.String m_name;
  private de.hub.clickwatch.analysis.results.ChartType m_type;
  private de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<? extends de.hub.clickwatch.analysis.results.ChartType> m_featureTypeBuilder;
  private java.util.Collection<de.hub.clickwatch.analysis.results.Results> m_groups = new java.util.LinkedList<de.hub.clickwatch.analysis.results.Results>();
  private java.util.Collection<de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<? extends de.hub.clickwatch.analysis.results.Results>> m_featureGroupsBuilder = new java.util.LinkedList<de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<? extends de.hub.clickwatch.analysis.results.Results>>();
  private java.util.Collection<de.hub.clickwatch.analysis.results.Result> m_results = new java.util.LinkedList<de.hub.clickwatch.analysis.results.Result>();
  private java.util.Collection<de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<? extends de.hub.clickwatch.analysis.results.Result>> m_featureResultsBuilder = new java.util.LinkedList<de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<? extends de.hub.clickwatch.analysis.results.Result>>();
  private java.util.Collection<de.hub.clickwatch.analysis.results.ValueSpec> m_valueSpecs = new java.util.LinkedList<de.hub.clickwatch.analysis.results.ValueSpec>();
  private java.util.Collection<de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<? extends de.hub.clickwatch.analysis.results.ValueSpec>> m_featureValueSpecsBuilder = new java.util.LinkedList<de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<? extends de.hub.clickwatch.analysis.results.ValueSpec>>();
  // helper attributes
  private boolean m_featureGroupsSet = false;
  private boolean m_featureNameSet = false;
  private boolean m_featureResultsSet = false;
  private boolean m_featureTypeSet = false;
  private boolean m_featureValueSpecsSet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newResultsBuilder()
   */
  private ResultsBuilder() {
  }

  /**
   * This method creates a new instance of the ResultsBuilder.
   * @return new instance of the ResultsBuilder
   */
  public static ResultsBuilder newResultsBuilder() {
    return new ResultsBuilder();
  }

  /**
   * This method creates a new instance of the ResultsBuilder. 
   * The builder is initialized using an existing '<em><b>de.hub.clickwatch.analysis.results.Results</b></em>' model object.
   * In order to avoid changes to the provided '<em><b>de.hub.clickwatch.analysis.results.Results</b></em>' model object, a copy is created using <em><b>org.eclipse.emf.ecore.util.EcoreUtil.Copier</b></em>.
   * @param results The existing '<em><b>de.hub.clickwatch.analysis.results.Results</b></em>' model object to be used for the initialization of the builder  
   * @return new initialized instance of the ResultsBuilder
   */
  public static ResultsBuilder newResultsBuilder(de.hub.clickwatch.analysis.results.Results p_results) {
    org.eclipse.emf.ecore.util.EcoreUtil.Copier c = new org.eclipse.emf.ecore.util.EcoreUtil.Copier();
    de.hub.clickwatch.analysis.results.Results _results = (de.hub.clickwatch.analysis.results.Results) c.copy(((de.hub.clickwatch.analysis.results.Results) p_results));
    c.copyReferences();
    ResultsBuilder _builder = newResultsBuilder();
    _builder.name(_results.getName());
    _builder.type(_results.getType());
    if (_results.getGroups() != null) {
      _builder.groups(_results.getGroups());
    }
    if (_results.getResults() != null) {
      _builder.results(_results.getResults());
    }
    if (_results.getValueSpecs() != null) {
      _builder.valueSpecs(_results.getValueSpecs());
    }
    return _builder;
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public ResultsBuilder but() {
    ResultsBuilder _builder = newResultsBuilder();
    _builder.m_featureGroupsSet = m_featureGroupsSet;
    _builder.m_groups = m_groups;
    _builder.m_featureGroupsBuilder = m_featureGroupsBuilder;
    _builder.m_featureNameSet = m_featureNameSet;
    _builder.m_name = m_name;
    _builder.m_featureResultsSet = m_featureResultsSet;
    _builder.m_results = m_results;
    _builder.m_featureResultsBuilder = m_featureResultsBuilder;
    _builder.m_featureTypeSet = m_featureTypeSet;
    _builder.m_type = m_type;
    _builder.m_featureTypeBuilder = m_featureTypeBuilder;
    _builder.m_featureValueSpecsSet = m_featureValueSpecsSet;
    _builder.m_valueSpecs = m_valueSpecs;
    _builder.m_featureValueSpecsBuilder = m_featureValueSpecsBuilder;
    return _builder;
  }

  /**
   * This method constructs the final de.hub.clickwatch.analysis.results.Results type.
   * @return new instance of the de.hub.clickwatch.analysis.results.Results type
   */
  public de.hub.clickwatch.analysis.results.Results build() {
    final de.hub.clickwatch.analysis.results.Results _newInstance = (de.hub.clickwatch.analysis.results.Results) de.hub.clickwatch.analysis.results.ResultsFactory.eINSTANCE
        .create(de.hub.clickwatch.analysis.results.ResultsPackage.eINSTANCE.getResults());
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
    if (m_featureGroupsSet) {
      _newInstance.getGroups().addAll(m_groups);
    } else {
      if (!m_featureGroupsBuilder.isEmpty()) {
        for (de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<? extends de.hub.clickwatch.analysis.results.Results> builder : m_featureGroupsBuilder) {
          _newInstance.getGroups().add(builder.build());
        }
      }
    }
    if (m_featureResultsSet) {
      _newInstance.getResults().addAll(m_results);
    } else {
      if (!m_featureResultsBuilder.isEmpty()) {
        for (de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<? extends de.hub.clickwatch.analysis.results.Result> builder : m_featureResultsBuilder) {
          _newInstance.getResults().add(builder.build());
        }
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

  public ResultsBuilder name(java.lang.String p_name) {
    m_name = p_name;
    m_featureNameSet = true;
    return this;
  }

  public ResultsBuilder type(de.hub.clickwatch.analysis.results.ChartType p_type) {
    m_type = p_type;
    m_featureTypeSet = true;
    return this;
  }

  public ResultsBuilder type(de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<? extends de.hub.clickwatch.analysis.results.ChartType> p_chartTypeBuilder) {
    m_featureTypeBuilder = p_chartTypeBuilder;
    return this;
  }

  public ResultsBuilder groups(de.hub.clickwatch.analysis.results.Results p_groups) {
    m_groups.add(p_groups);
    m_featureGroupsSet = true;
    return this;
  }

  public ResultsBuilder groups(java.util.Collection<? extends de.hub.clickwatch.analysis.results.Results> p_groups) {
    m_groups.addAll(p_groups);
    m_featureGroupsSet = true;
    return this;
  }

  public ResultsBuilder groups(de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<? extends de.hub.clickwatch.analysis.results.Results> p_resultsBuilder) {
    m_featureGroupsBuilder.add(p_resultsBuilder);
    return this;
  }

  public ResultsBuilder results(de.hub.clickwatch.analysis.results.Result p_results) {
    m_results.add(p_results);
    m_featureResultsSet = true;
    return this;
  }

  public ResultsBuilder results(java.util.Collection<? extends de.hub.clickwatch.analysis.results.Result> p_results) {
    m_results.addAll(p_results);
    m_featureResultsSet = true;
    return this;
  }

  public ResultsBuilder results(de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<? extends de.hub.clickwatch.analysis.results.Result> p_resultBuilder) {
    m_featureResultsBuilder.add(p_resultBuilder);
    return this;
  }

  public ResultsBuilder valueSpecs(de.hub.clickwatch.analysis.results.ValueSpec p_valueSpecs) {
    m_valueSpecs.add(p_valueSpecs);
    m_featureValueSpecsSet = true;
    return this;
  }

  public ResultsBuilder valueSpecs(java.util.Collection<? extends de.hub.clickwatch.analysis.results.ValueSpec> p_valueSpecs) {
    m_valueSpecs.addAll(p_valueSpecs);
    m_featureValueSpecsSet = true;
    return this;
  }

  public ResultsBuilder valueSpecs(de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<? extends de.hub.clickwatch.analysis.results.ValueSpec> p_valueSpecBuilder) {
    m_featureValueSpecsBuilder.add(p_valueSpecBuilder);
    return this;
  }
}
