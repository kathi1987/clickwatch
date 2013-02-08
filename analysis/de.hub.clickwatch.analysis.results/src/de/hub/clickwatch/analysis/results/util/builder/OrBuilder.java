package de.hub.clickwatch.analysis.results.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object '<em><b>de.hub.clickwatch.analysis.results.Or</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class OrBuilder implements de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<de.hub.clickwatch.analysis.results.Or> {
  // features and builders
  private java.util.Collection<de.hub.clickwatch.analysis.results.Constraint> m_ops = new java.util.LinkedList<de.hub.clickwatch.analysis.results.Constraint>();
  private java.util.Collection<de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<? extends de.hub.clickwatch.analysis.results.Constraint>> m_featureOpsBuilder = new java.util.LinkedList<de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<? extends de.hub.clickwatch.analysis.results.Constraint>>();
  // helper attributes
  private boolean m_featureOpsSet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newOrBuilder()
   */
  private OrBuilder() {
  }

  /**
   * This method creates a new instance of the OrBuilder.
   * @return new instance of the OrBuilder
   */
  public static OrBuilder newOrBuilder() {
    return new OrBuilder();
  }

  /**
   * This method creates a new instance of the OrBuilder. 
   * The builder is initialized using an existing '<em><b>de.hub.clickwatch.analysis.results.Or</b></em>' model object.
   * In order to avoid changes to the provided '<em><b>de.hub.clickwatch.analysis.results.Or</b></em>' model object, a copy is created using <em><b>org.eclipse.emf.ecore.util.EcoreUtil.Copier</b></em>.
   * @param or The existing '<em><b>de.hub.clickwatch.analysis.results.Or</b></em>' model object to be used for the initialization of the builder  
   * @return new initialized instance of the OrBuilder
   */
  public static OrBuilder newOrBuilder(de.hub.clickwatch.analysis.results.Or p_or) {
    org.eclipse.emf.ecore.util.EcoreUtil.Copier c = new org.eclipse.emf.ecore.util.EcoreUtil.Copier();
    de.hub.clickwatch.analysis.results.Or _or = (de.hub.clickwatch.analysis.results.Or) c.copy(((de.hub.clickwatch.analysis.results.Or) p_or));
    c.copyReferences();
    OrBuilder _builder = newOrBuilder();
    if (_or.getOps() != null) {
      _builder.ops(_or.getOps());
    }
    return _builder;
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public OrBuilder but() {
    OrBuilder _builder = newOrBuilder();
    _builder.m_featureOpsSet = m_featureOpsSet;
    _builder.m_ops = m_ops;
    _builder.m_featureOpsBuilder = m_featureOpsBuilder;
    return _builder;
  }

  /**
   * This method constructs the final de.hub.clickwatch.analysis.results.Or type.
   * @return new instance of the de.hub.clickwatch.analysis.results.Or type
   */
  public de.hub.clickwatch.analysis.results.Or build() {
    final de.hub.clickwatch.analysis.results.Or _newInstance = (de.hub.clickwatch.analysis.results.Or) de.hub.clickwatch.analysis.results.ResultsFactory.eINSTANCE
        .create(de.hub.clickwatch.analysis.results.ResultsPackage.eINSTANCE.getOr());
    if (m_featureOpsSet) {
      _newInstance.getOps().addAll(m_ops);
    } else {
      if (!m_featureOpsBuilder.isEmpty()) {
        for (de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<? extends de.hub.clickwatch.analysis.results.Constraint> builder : m_featureOpsBuilder) {
          _newInstance.getOps().add(builder.build());
        }
      }
    }
    return _newInstance;
  }

  public OrBuilder ops(de.hub.clickwatch.analysis.results.Constraint p_ops) {
    m_ops.add(p_ops);
    m_featureOpsSet = true;
    return this;
  }

  public OrBuilder ops(java.util.Collection<? extends de.hub.clickwatch.analysis.results.Constraint> p_ops) {
    m_ops.addAll(p_ops);
    m_featureOpsSet = true;
    return this;
  }

  public OrBuilder ops(de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<? extends de.hub.clickwatch.analysis.results.Constraint> p_constraintBuilder) {
    m_featureOpsBuilder.add(p_constraintBuilder);
    return this;
  }
}
