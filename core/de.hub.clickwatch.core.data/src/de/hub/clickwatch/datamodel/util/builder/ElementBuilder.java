package de.hub.clickwatch.datamodel.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>de.hub.clickwatch.datamodel.Element</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class ElementBuilder implements de.hub.clickwatch.datamodel.util.builder.IDatamodelBuilder<de.hub.clickwatch.datamodel.Element> {
  // features and builders
  private java.lang.String m_name;
  private java.util.Collection<de.hub.clickwatch.datamodel.Element> m_children = new java.util.LinkedList<de.hub.clickwatch.datamodel.Element>();
  private java.util.Collection<de.hub.clickwatch.datamodel.util.builder.IDatamodelBuilder<? extends de.hub.clickwatch.datamodel.Element>> m_featureChildrenBuilder = new java.util.LinkedList<de.hub.clickwatch.datamodel.util.builder.IDatamodelBuilder<? extends de.hub.clickwatch.datamodel.Element>>();
  private java.util.Collection<de.hub.clickwatch.datamodel.Handler> m_handlers = new java.util.LinkedList<de.hub.clickwatch.datamodel.Handler>();
  private java.util.Collection<de.hub.clickwatch.datamodel.util.builder.IDatamodelBuilder<? extends de.hub.clickwatch.datamodel.Handler>> m_featureHandlersBuilder = new java.util.LinkedList<de.hub.clickwatch.datamodel.util.builder.IDatamodelBuilder<? extends de.hub.clickwatch.datamodel.Handler>>();
  private java.util.Collection<de.hub.clickwatch.analysis.traceable.Traceable> m_tracesFrom = new java.util.LinkedList<de.hub.clickwatch.analysis.traceable.Traceable>();
  private java.util.Collection<de.hub.clickwatch.analysis.traceable.util.builder.ITraceableBuilder<? extends de.hub.clickwatch.analysis.traceable.Traceable>> m_featureTracesFromBuilder = new java.util.LinkedList<de.hub.clickwatch.analysis.traceable.util.builder.ITraceableBuilder<? extends de.hub.clickwatch.analysis.traceable.Traceable>>();
  private java.util.Collection<de.hub.clickwatch.analysis.traceable.Traceable> m_tracesTo = new java.util.LinkedList<de.hub.clickwatch.analysis.traceable.Traceable>();
  private java.util.Collection<de.hub.clickwatch.analysis.traceable.util.builder.ITraceableBuilder<? extends de.hub.clickwatch.analysis.traceable.Traceable>> m_featureTracesToBuilder = new java.util.LinkedList<de.hub.clickwatch.analysis.traceable.util.builder.ITraceableBuilder<? extends de.hub.clickwatch.analysis.traceable.Traceable>>();
  // helper attributes
  private boolean m_featureChildrenSet = false;
  private boolean m_featureHandlersSet = false;
  private boolean m_featureNameSet = false;
  private boolean m_featureTracesFromSet = false;
  private boolean m_featureTracesToSet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newElementBuilder()
   */
  private ElementBuilder() {
  }

  /**
   * This method creates a new instance of the ElementBuilder.
   * @return new instance of the ElementBuilder
   */
  public static ElementBuilder newElementBuilder() {
    return new ElementBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public ElementBuilder but() {
    ElementBuilder _builder = newElementBuilder();
    _builder.m_featureChildrenSet = m_featureChildrenSet;
    _builder.m_children = m_children;
    _builder.m_featureChildrenBuilder = m_featureChildrenBuilder;
    _builder.m_featureHandlersSet = m_featureHandlersSet;
    _builder.m_handlers = m_handlers;
    _builder.m_featureHandlersBuilder = m_featureHandlersBuilder;
    _builder.m_featureNameSet = m_featureNameSet;
    _builder.m_name = m_name;
    _builder.m_featureTracesFromSet = m_featureTracesFromSet;
    _builder.m_tracesFrom = m_tracesFrom;
    _builder.m_featureTracesFromBuilder = m_featureTracesFromBuilder;
    _builder.m_featureTracesToSet = m_featureTracesToSet;
    _builder.m_tracesTo = m_tracesTo;
    _builder.m_featureTracesToBuilder = m_featureTracesToBuilder;
    return _builder;
  }

  /**
   * This method constructs the final de.hub.clickwatch.datamodel.Element type.
   * @return new instance of the de.hub.clickwatch.datamodel.Element type
   */
  public de.hub.clickwatch.datamodel.Element build() {
    final de.hub.clickwatch.datamodel.Element _newInstance = de.hub.clickwatch.datamodel.ClickWatchDataModelFactory.eINSTANCE.createElement();
    if (m_featureNameSet) {
      _newInstance.setName(m_name);
    }
    if (m_featureChildrenSet) {
      _newInstance.getChildren().addAll(m_children);
    } else {
      if (!m_featureChildrenBuilder.isEmpty()) {
        for (de.hub.clickwatch.datamodel.util.builder.IDatamodelBuilder<? extends de.hub.clickwatch.datamodel.Element> builder : m_featureChildrenBuilder) {
          _newInstance.getChildren().add(builder.build());
        }
      }
    }
    if (m_featureHandlersSet) {
      _newInstance.getHandlers().addAll(m_handlers);
    } else {
      if (!m_featureHandlersBuilder.isEmpty()) {
        for (de.hub.clickwatch.datamodel.util.builder.IDatamodelBuilder<? extends de.hub.clickwatch.datamodel.Handler> builder : m_featureHandlersBuilder) {
          _newInstance.getHandlers().add(builder.build());
        }
      }
    }
    if (m_featureTracesFromSet) {
      _newInstance.getTracesFrom().addAll(m_tracesFrom);
    } else {
      if (!m_featureTracesFromBuilder.isEmpty()) {
        for (de.hub.clickwatch.analysis.traceable.util.builder.ITraceableBuilder<? extends de.hub.clickwatch.analysis.traceable.Traceable> builder : m_featureTracesFromBuilder) {
          _newInstance.getTracesFrom().add(builder.build());
        }
      }
    }
    if (m_featureTracesToSet) {
      _newInstance.getTracesTo().addAll(m_tracesTo);
    } else {
      if (!m_featureTracesToBuilder.isEmpty()) {
        for (de.hub.clickwatch.analysis.traceable.util.builder.ITraceableBuilder<? extends de.hub.clickwatch.analysis.traceable.Traceable> builder : m_featureTracesToBuilder) {
          _newInstance.getTracesTo().add(builder.build());
        }
      }
    }
    return _newInstance;
  }

  public ElementBuilder withName(java.lang.String p_name) {
    m_name = p_name;
    m_featureNameSet = true;
    return this;
  }

  public ElementBuilder withChildren(de.hub.clickwatch.datamodel.Element p_children) {
    m_children.add(p_children);
    m_featureChildrenSet = true;
    return this;
  }

  public ElementBuilder withChildren(java.util.Collection<? extends de.hub.clickwatch.datamodel.Element> p_children) {
    m_children.addAll(p_children);
    m_featureChildrenSet = true;
    return this;
  }

  public ElementBuilder withChildren(de.hub.clickwatch.datamodel.util.builder.IDatamodelBuilder<? extends de.hub.clickwatch.datamodel.Element> p_elementBuilder) {
    m_featureChildrenBuilder.add(p_elementBuilder);
    return this;
  }

  public ElementBuilder withHandlers(de.hub.clickwatch.datamodel.Handler p_handlers) {
    m_handlers.add(p_handlers);
    m_featureHandlersSet = true;
    return this;
  }

  public ElementBuilder withHandlers(java.util.Collection<? extends de.hub.clickwatch.datamodel.Handler> p_handlers) {
    m_handlers.addAll(p_handlers);
    m_featureHandlersSet = true;
    return this;
  }

  public ElementBuilder withHandlers(de.hub.clickwatch.datamodel.util.builder.IDatamodelBuilder<? extends de.hub.clickwatch.datamodel.Handler> p_handlerBuilder) {
    m_featureHandlersBuilder.add(p_handlerBuilder);
    return this;
  }

  public ElementBuilder withTracesFrom(de.hub.clickwatch.analysis.traceable.Traceable p_tracesFrom) {
    m_tracesFrom.add(p_tracesFrom);
    m_featureTracesFromSet = true;
    return this;
  }

  public ElementBuilder withTracesFrom(java.util.Collection<? extends de.hub.clickwatch.analysis.traceable.Traceable> p_tracesFrom) {
    m_tracesFrom.addAll(p_tracesFrom);
    m_featureTracesFromSet = true;
    return this;
  }

  public ElementBuilder withTracesFrom(de.hub.clickwatch.analysis.traceable.util.builder.ITraceableBuilder<? extends de.hub.clickwatch.analysis.traceable.Traceable> p_traceableBuilder) {
    m_featureTracesFromBuilder.add(p_traceableBuilder);
    return this;
  }

  public ElementBuilder withTracesTo(de.hub.clickwatch.analysis.traceable.Traceable p_tracesTo) {
    m_tracesTo.add(p_tracesTo);
    m_featureTracesToSet = true;
    return this;
  }

  public ElementBuilder withTracesTo(java.util.Collection<? extends de.hub.clickwatch.analysis.traceable.Traceable> p_tracesTo) {
    m_tracesTo.addAll(p_tracesTo);
    m_featureTracesToSet = true;
    return this;
  }

  public ElementBuilder withTracesTo(de.hub.clickwatch.analysis.traceable.util.builder.ITraceableBuilder<? extends de.hub.clickwatch.analysis.traceable.Traceable> p_traceableBuilder) {
    m_featureTracesToBuilder.add(p_traceableBuilder);
    return this;
  }
}
