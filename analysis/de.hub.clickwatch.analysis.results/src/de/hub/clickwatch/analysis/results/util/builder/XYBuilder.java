package de.hub.clickwatch.analysis.results.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object '<em><b>de.hub.clickwatch.analysis.results.XY</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class XYBuilder implements de.hub.clickwatch.analysis.results.util.builder.IResultsBuilder<de.hub.clickwatch.analysis.results.XY> {
  // features and builders
  private java.lang.String m_name;
  // helper attributes
  private boolean m_featureNameSet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newXYBuilder()
   */
  private XYBuilder() {
  }

  /**
   * This method creates a new instance of the XYBuilder.
   * @return new instance of the XYBuilder
   */
  public static XYBuilder newXYBuilder() {
    return new XYBuilder();
  }

  /**
   * This method creates a new instance of the XYBuilder. 
   * The builder is initialized using an existing '<em><b>de.hub.clickwatch.analysis.results.XY</b></em>' model object.
   * In order to avoid changes to the provided '<em><b>de.hub.clickwatch.analysis.results.XY</b></em>' model object, a copy is created using <em><b>org.eclipse.emf.ecore.util.EcoreUtil.Copier</b></em>.
   * @param xY The existing '<em><b>de.hub.clickwatch.analysis.results.XY</b></em>' model object to be used for the initialization of the builder  
   * @return new initialized instance of the XYBuilder
   */
  public static XYBuilder newXYBuilder(de.hub.clickwatch.analysis.results.XY p_xY) {
    org.eclipse.emf.ecore.util.EcoreUtil.Copier c = new org.eclipse.emf.ecore.util.EcoreUtil.Copier();
    de.hub.clickwatch.analysis.results.XY _xY = (de.hub.clickwatch.analysis.results.XY) c.copy(((de.hub.clickwatch.analysis.results.XY) p_xY));
    c.copyReferences();
    XYBuilder _builder = newXYBuilder();
    _builder.name(_xY.getName());
    return _builder;
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public XYBuilder but() {
    XYBuilder _builder = newXYBuilder();
    _builder.m_featureNameSet = m_featureNameSet;
    _builder.m_name = m_name;
    return _builder;
  }

  /**
   * This method constructs the final de.hub.clickwatch.analysis.results.XY type.
   * @return new instance of the de.hub.clickwatch.analysis.results.XY type
   */
  public de.hub.clickwatch.analysis.results.XY build() {
    final de.hub.clickwatch.analysis.results.XY _newInstance = (de.hub.clickwatch.analysis.results.XY) de.hub.clickwatch.analysis.results.ResultsFactory.eINSTANCE
        .create(de.hub.clickwatch.analysis.results.ResultsPackage.eINSTANCE.getXY());
    if (m_featureNameSet) {
      _newInstance.setName(m_name);
    }
    return _newInstance;
  }

  public XYBuilder name(java.lang.String p_name) {
    m_name = p_name;
    m_featureNameSet = true;
    return this;
  }
}
