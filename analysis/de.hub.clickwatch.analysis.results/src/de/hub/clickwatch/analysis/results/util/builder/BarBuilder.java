package de.hub.clickwatch.analysis.results.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object '<em><b>de.hub.clickwatch.analysis.results.Bar</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class BarBuilder implements de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<de.hub.clickwatch.analysis.results.Bar> {
  // features and builders
  private java.lang.String m_name;
  // helper attributes
  private boolean m_featureNameSet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newBarBuilder()
   */
  private BarBuilder() {
  }

  /**
   * This method creates a new instance of the BarBuilder.
   * @return new instance of the BarBuilder
   */
  public static BarBuilder newBarBuilder() {
    return new BarBuilder();
  }

  /**
   * This method creates a new instance of the BarBuilder. 
   * The builder is initialized using an existing '<em><b>de.hub.clickwatch.analysis.results.Bar</b></em>' model object.
   * In order to avoid changes to the provided '<em><b>de.hub.clickwatch.analysis.results.Bar</b></em>' model object, a copy is created using <em><b>org.eclipse.emf.ecore.util.EcoreUtil.Copier</b></em>.
   * @param bar The existing '<em><b>de.hub.clickwatch.analysis.results.Bar</b></em>' model object to be used for the initialization of the builder  
   * @return new initialized instance of the BarBuilder
   */
  public static BarBuilder newBarBuilder(de.hub.clickwatch.analysis.results.Bar p_bar) {
    org.eclipse.emf.ecore.util.EcoreUtil.Copier c = new org.eclipse.emf.ecore.util.EcoreUtil.Copier();
    de.hub.clickwatch.analysis.results.Bar _bar = (de.hub.clickwatch.analysis.results.Bar) c.copy(((de.hub.clickwatch.analysis.results.Bar) p_bar));
    c.copyReferences();
    BarBuilder _builder = newBarBuilder();
    _builder.name(_bar.getName());
    return _builder;
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public BarBuilder but() {
    BarBuilder _builder = newBarBuilder();
    _builder.m_featureNameSet = m_featureNameSet;
    _builder.m_name = m_name;
    return _builder;
  }

  /**
   * This method constructs the final de.hub.clickwatch.analysis.results.Bar type.
   * @return new instance of the de.hub.clickwatch.analysis.results.Bar type
   */
  public de.hub.clickwatch.analysis.results.Bar build() {
    final de.hub.clickwatch.analysis.results.Bar _newInstance = (de.hub.clickwatch.analysis.results.Bar) de.hub.clickwatch.analysis.results.ResultsFactory.eINSTANCE
        .create(de.hub.clickwatch.analysis.results.ResultsPackage.eINSTANCE.getBar());
    if (m_featureNameSet) {
      _newInstance.setName(m_name);
    }
    return _newInstance;
  }

  public BarBuilder name(java.lang.String p_name) {
    m_name = p_name;
    m_featureNameSet = true;
    return this;
  }
}
