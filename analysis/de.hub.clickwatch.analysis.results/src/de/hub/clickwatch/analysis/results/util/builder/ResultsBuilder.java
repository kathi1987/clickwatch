package de.hub.clickwatch.analysis.results.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>de.hub.clickwatch.analysis.results.Results</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class ResultsBuilder implements de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<de.hub.clickwatch.analysis.results.Results> {
  // features and builders
  private java.util.Collection<de.hub.clickwatch.analysis.results.Result> m_results = new java.util.LinkedList<de.hub.clickwatch.analysis.results.Result>();
  private java.util.Collection<de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<? extends de.hub.clickwatch.analysis.results.Result>> m_featureResultsBuilder = new java.util.LinkedList<de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<? extends de.hub.clickwatch.analysis.results.Result>>();
  // helper attributes
  private boolean m_featureResultsSet = false;

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
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public ResultsBuilder but() {
    ResultsBuilder _builder = newResultsBuilder();
    _builder.m_featureResultsSet = m_featureResultsSet;
    _builder.m_results = m_results;
    _builder.m_featureResultsBuilder = m_featureResultsBuilder;
    return _builder;
  }

  /**
   * This method constructs the final de.hub.clickwatch.analysis.results.Results type.
   * @return new instance of the de.hub.clickwatch.analysis.results.Results type
   */
  public de.hub.clickwatch.analysis.results.Results build() {
    final de.hub.clickwatch.analysis.results.Results _newInstance = de.hub.clickwatch.analysis.results.ResultsFactory.eINSTANCE.createResults();
    if (m_featureResultsSet) {
      _newInstance.getResults().addAll(m_results);
    } else {
      if (!m_featureResultsBuilder.isEmpty()) {
        for (de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<? extends de.hub.clickwatch.analysis.results.Result> builder : m_featureResultsBuilder) {
          _newInstance.getResults().add(builder.build());
        }
      }
    }
    return _newInstance;
  }

  public ResultsBuilder withResults(de.hub.clickwatch.analysis.results.Result p_results) {
    m_results.add(p_results);
    m_featureResultsSet = true;
    return this;
  }

  public ResultsBuilder withResults(java.util.Collection<? extends de.hub.clickwatch.analysis.results.Result> p_results) {
    m_results.addAll(p_results);
    m_featureResultsSet = true;
    return this;
  }

  public ResultsBuilder withResults(de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<? extends de.hub.clickwatch.analysis.results.Result> p_resultBuilder) {
    m_featureResultsBuilder.add(p_resultBuilder);
    return this;
  }
}
