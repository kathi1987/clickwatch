package de.hub.clickwatch.analysis.results.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object '<em><b>de.hub.clickwatch.analysis.results.XYDataResultSet</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class XYDataResultSetBuilder implements de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<de.hub.clickwatch.analysis.results.XYDataResultSet> {
  // features and builders
  private java.lang.String m_name;
  private java.util.Collection<de.hub.clickwatch.analysis.results.DataResultValue> m_xValues = new java.util.LinkedList<de.hub.clickwatch.analysis.results.DataResultValue>();
  private java.util.Collection<de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<? extends de.hub.clickwatch.analysis.results.DataResultValue>> m_featureXValuesBuilder = new java.util.LinkedList<de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<? extends de.hub.clickwatch.analysis.results.DataResultValue>>();
  private java.util.Collection<de.hub.clickwatch.analysis.results.DataResultValue> m_yValues = new java.util.LinkedList<de.hub.clickwatch.analysis.results.DataResultValue>();
  private java.util.Collection<de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<? extends de.hub.clickwatch.analysis.results.DataResultValue>> m_featureYValuesBuilder = new java.util.LinkedList<de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<? extends de.hub.clickwatch.analysis.results.DataResultValue>>();
  // helper attributes
  private boolean m_featureNameSet = false;
  private boolean m_featureXValuesSet = false;
  private boolean m_featureYValuesSet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newXYDataResultSetBuilder()
   */
  private XYDataResultSetBuilder() {
  }

  /**
   * This method creates a new instance of the XYDataResultSetBuilder.
   * @return new instance of the XYDataResultSetBuilder
   */
  public static XYDataResultSetBuilder newXYDataResultSetBuilder() {
    return new XYDataResultSetBuilder();
  }

  /**
   * This method creates a new instance of the XYDataResultSetBuilder. 
   * The builder is initialized using an existing '<em><b>de.hub.clickwatch.analysis.results.XYDataResultSet</b></em>' model object.
   * In order to avoid changes to the provided '<em><b>de.hub.clickwatch.analysis.results.XYDataResultSet</b></em>' model object, a copy is created using <em><b>org.eclipse.emf.ecore.util.EcoreUtil.Copier</b></em>.
   * @param xYDataResultSet The existing '<em><b>de.hub.clickwatch.analysis.results.XYDataResultSet</b></em>' model object to be used for the initialization of the builder  
   * @return new initialized instance of the XYDataResultSetBuilder
   */
  public static XYDataResultSetBuilder newXYDataResultSetBuilder(de.hub.clickwatch.analysis.results.XYDataResultSet p_xYDataResultSet) {
    org.eclipse.emf.ecore.util.EcoreUtil.Copier c = new org.eclipse.emf.ecore.util.EcoreUtil.Copier();
    de.hub.clickwatch.analysis.results.XYDataResultSet _xYDataResultSet = (de.hub.clickwatch.analysis.results.XYDataResultSet) c
        .copy(((de.hub.clickwatch.analysis.results.XYDataResultSet) p_xYDataResultSet));
    c.copyReferences();
    XYDataResultSetBuilder _builder = newXYDataResultSetBuilder();
    _builder.name(_xYDataResultSet.getName());
    if (_xYDataResultSet.getXValues() != null) {
      _builder.xValues(_xYDataResultSet.getXValues());
    }
    if (_xYDataResultSet.getYValues() != null) {
      _builder.yValues(_xYDataResultSet.getYValues());
    }
    return _builder;
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public XYDataResultSetBuilder but() {
    XYDataResultSetBuilder _builder = newXYDataResultSetBuilder();
    _builder.m_featureNameSet = m_featureNameSet;
    _builder.m_name = m_name;
    _builder.m_featureXValuesSet = m_featureXValuesSet;
    _builder.m_xValues = m_xValues;
    _builder.m_featureXValuesBuilder = m_featureXValuesBuilder;
    _builder.m_featureYValuesSet = m_featureYValuesSet;
    _builder.m_yValues = m_yValues;
    _builder.m_featureYValuesBuilder = m_featureYValuesBuilder;
    return _builder;
  }

  /**
   * This method constructs the final de.hub.clickwatch.analysis.results.XYDataResultSet type.
   * @return new instance of the de.hub.clickwatch.analysis.results.XYDataResultSet type
   */
  public de.hub.clickwatch.analysis.results.XYDataResultSet build() {
    final de.hub.clickwatch.analysis.results.XYDataResultSet _newInstance = (de.hub.clickwatch.analysis.results.XYDataResultSet) de.hub.clickwatch.analysis.results.ResultsFactory.eINSTANCE
        .create(de.hub.clickwatch.analysis.results.ResultsPackage.eINSTANCE.getXYDataResultSet());
    if (m_featureNameSet) {
      _newInstance.setName(m_name);
    }
    if (m_featureXValuesSet) {
      _newInstance.getXValues().addAll(m_xValues);
    } else {
      if (!m_featureXValuesBuilder.isEmpty()) {
        for (de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<? extends de.hub.clickwatch.analysis.results.DataResultValue> builder : m_featureXValuesBuilder) {
          _newInstance.getXValues().add(builder.build());
        }
      }
    }
    if (m_featureYValuesSet) {
      _newInstance.getYValues().addAll(m_yValues);
    } else {
      if (!m_featureYValuesBuilder.isEmpty()) {
        for (de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<? extends de.hub.clickwatch.analysis.results.DataResultValue> builder : m_featureYValuesBuilder) {
          _newInstance.getYValues().add(builder.build());
        }
      }
    }
    return _newInstance;
  }

  public XYDataResultSetBuilder name(java.lang.String p_name) {
    m_name = p_name;
    m_featureNameSet = true;
    return this;
  }

  public XYDataResultSetBuilder xValues(de.hub.clickwatch.analysis.results.DataResultValue p_xValues) {
    m_xValues.add(p_xValues);
    m_featureXValuesSet = true;
    return this;
  }

  public XYDataResultSetBuilder xValues(java.util.Collection<? extends de.hub.clickwatch.analysis.results.DataResultValue> p_xValues) {
    m_xValues.addAll(p_xValues);
    m_featureXValuesSet = true;
    return this;
  }

  public XYDataResultSetBuilder xValues(de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<? extends de.hub.clickwatch.analysis.results.DataResultValue> p_dataResultValueBuilder) {
    m_featureXValuesBuilder.add(p_dataResultValueBuilder);
    return this;
  }

  public XYDataResultSetBuilder yValues(de.hub.clickwatch.analysis.results.DataResultValue p_yValues) {
    m_yValues.add(p_yValues);
    m_featureYValuesSet = true;
    return this;
  }

  public XYDataResultSetBuilder yValues(java.util.Collection<? extends de.hub.clickwatch.analysis.results.DataResultValue> p_yValues) {
    m_yValues.addAll(p_yValues);
    m_featureYValuesSet = true;
    return this;
  }

  public XYDataResultSetBuilder yValues(de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<? extends de.hub.clickwatch.analysis.results.DataResultValue> p_dataResultValueBuilder) {
    m_featureYValuesBuilder.add(p_dataResultValueBuilder);
    return this;
  }
}
