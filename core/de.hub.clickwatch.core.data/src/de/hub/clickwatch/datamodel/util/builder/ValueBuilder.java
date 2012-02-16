package de.hub.clickwatch.datamodel.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>de.hub.clickwatch.datamodel.Value</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class ValueBuilder implements de.hub.clickwatch.datamodel.util.builder.IDatamodelBuilder<de.hub.clickwatch.datamodel.Value> {
  // features and builders
  private Boolean m_canRead;
  private Boolean m_canWrite;
  private Boolean m_changed;
  private java.lang.String m_name;
  private long m_timestamp;
  private java.lang.String m_value;
  private java.util.Collection<org.eclipse.emf.ecore.util.FeatureMap.Entry> m_any = new java.util.LinkedList<org.eclipse.emf.ecore.util.FeatureMap.Entry>();
  private java.util.Collection<org.eclipse.emf.ecore.util.FeatureMap.Entry> m_mixed = new java.util.LinkedList<org.eclipse.emf.ecore.util.FeatureMap.Entry>();
  // helper attributes
  private boolean m_featureAnySet = false;
  private boolean m_featureCanReadSet = false;
  private boolean m_featureCanWriteSet = false;
  private boolean m_featureChangedSet = false;
  private boolean m_featureMixedSet = false;
  private boolean m_featureNameSet = false;
  private boolean m_featureTimestampSet = false;
  private boolean m_featureValueSet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newValueBuilder()
   */
  private ValueBuilder() {
  }

  /**
   * This method creates a new instance of the ValueBuilder.
   * @return new instance of the ValueBuilder
   */
  public static ValueBuilder newValueBuilder() {
    return new ValueBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public ValueBuilder but() {
    ValueBuilder _builder = newValueBuilder();
    _builder.m_featureAnySet = m_featureAnySet;
    _builder.m_any = m_any;
    _builder.m_featureCanReadSet = m_featureCanReadSet;
    _builder.m_canRead = m_canRead;
    _builder.m_featureCanWriteSet = m_featureCanWriteSet;
    _builder.m_canWrite = m_canWrite;
    _builder.m_featureChangedSet = m_featureChangedSet;
    _builder.m_changed = m_changed;
    _builder.m_featureMixedSet = m_featureMixedSet;
    _builder.m_mixed = m_mixed;
    _builder.m_featureNameSet = m_featureNameSet;
    _builder.m_name = m_name;
    _builder.m_featureTimestampSet = m_featureTimestampSet;
    _builder.m_timestamp = m_timestamp;
    _builder.m_featureValueSet = m_featureValueSet;
    _builder.m_value = m_value;
    return _builder;
  }

  /**
   * This method constructs the final de.hub.clickwatch.datamodel.Value type.
   * @return new instance of the de.hub.clickwatch.datamodel.Value type
   */
  public de.hub.clickwatch.datamodel.Value build() {
    final de.hub.clickwatch.datamodel.Value _newInstance = de.hub.clickwatch.datamodel.ClickWatchDataModelFactory.eINSTANCE.createValue();
    if (m_featureCanReadSet) {
      _newInstance.setCanRead(m_canRead);
    }
    if (m_featureCanWriteSet) {
      _newInstance.setCanWrite(m_canWrite);
    }
    if (m_featureChangedSet) {
      _newInstance.setChanged(m_changed);
    }
    if (m_featureNameSet) {
      _newInstance.setName(m_name);
    }
    if (m_featureTimestampSet) {
      _newInstance.setTimestamp(m_timestamp);
    }
    if (m_featureValueSet) {
      _newInstance.setValue(m_value);
    }
    if (m_featureAnySet) {
      _newInstance.getAny().addAll(m_any);
    }
    if (m_featureMixedSet) {
      _newInstance.getMixed().addAll(m_mixed);
    }
    return _newInstance;
  }

  public ValueBuilder withCanRead(Boolean p_canRead) {
    m_canRead = p_canRead;
    m_featureCanReadSet = true;
    return this;
  }

  public ValueBuilder withCanWrite(Boolean p_canWrite) {
    m_canWrite = p_canWrite;
    m_featureCanWriteSet = true;
    return this;
  }

  public ValueBuilder withChanged(Boolean p_changed) {
    m_changed = p_changed;
    m_featureChangedSet = true;
    return this;
  }

  public ValueBuilder withName(java.lang.String p_name) {
    m_name = p_name;
    m_featureNameSet = true;
    return this;
  }

  public ValueBuilder withTimestamp(long p_timestamp) {
    m_timestamp = p_timestamp;
    m_featureTimestampSet = true;
    return this;
  }

  public ValueBuilder withValue(java.lang.String p_value) {
    m_value = p_value;
    m_featureValueSet = true;
    return this;
  }

  public ValueBuilder withAny(org.eclipse.emf.ecore.util.FeatureMap.Entry p_any) {
    m_any.add(p_any);
    m_featureAnySet = true;
    return this;
  }

  public ValueBuilder withAny(java.util.Collection<? extends org.eclipse.emf.ecore.util.FeatureMap.Entry> p_any) {
    m_any.addAll(p_any);
    m_featureAnySet = true;
    return this;
  }

  public ValueBuilder withMixed(org.eclipse.emf.ecore.util.FeatureMap.Entry p_mixed) {
    m_mixed.add(p_mixed);
    m_featureMixedSet = true;
    return this;
  }

  public ValueBuilder withMixed(java.util.Collection<? extends org.eclipse.emf.ecore.util.FeatureMap.Entry> p_mixed) {
    m_mixed.addAll(p_mixed);
    m_featureMixedSet = true;
    return this;
  }
}
