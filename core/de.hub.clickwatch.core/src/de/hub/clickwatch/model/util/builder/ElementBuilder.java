package de.hub.clickwatch.model.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>de.hub.clickwatch.model.Element</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class ElementBuilder implements de.hub.clickwatch.model.util.builder.IModelBuilder<de.hub.clickwatch.model.Element> {
  // features and builders
  private java.lang.String m_name;
  private Boolean m_watch;
  private java.util.Collection<de.hub.clickwatch.model.Element> m_children = new java.util.LinkedList<de.hub.clickwatch.model.Element>();
  private java.util.Collection<de.hub.clickwatch.model.util.builder.IModelBuilder<? extends de.hub.clickwatch.model.Element>> m_featureChildrenBuilder = new java.util.LinkedList<de.hub.clickwatch.model.util.builder.IModelBuilder<? extends de.hub.clickwatch.model.Element>>();
  private java.util.Collection<de.hub.clickwatch.model.Handler> m_handlers = new java.util.LinkedList<de.hub.clickwatch.model.Handler>();
  private java.util.Collection<de.hub.clickwatch.model.util.builder.IModelBuilder<? extends de.hub.clickwatch.model.Handler>> m_featureHandlersBuilder = new java.util.LinkedList<de.hub.clickwatch.model.util.builder.IModelBuilder<? extends de.hub.clickwatch.model.Handler>>();
  // helper attributes
  private boolean m_featureChildrenSet = false;
  private boolean m_featureHandlersSet = false;
  private boolean m_featureNameSet = false;
  private boolean m_featureWatchSet = false;

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
    _builder.m_featureWatchSet = m_featureWatchSet;
    _builder.m_watch = m_watch;
    return _builder;
  }

  /**
   * This method constructs the final de.hub.clickwatch.model.Element type.
   * @return new instance of the de.hub.clickwatch.model.Element type
   */
  public de.hub.clickwatch.model.Element build() {
    final de.hub.clickwatch.model.Element _newInstance = de.hub.clickwatch.model.ClickWatchModelFactory.eINSTANCE.createElement();
    if (m_featureNameSet) {
      _newInstance.setName(m_name);
    }
    if (m_featureWatchSet) {
      _newInstance.setWatch(m_watch);
    }
    if (m_featureChildrenSet) {
      _newInstance.getChildren().addAll(m_children);
    } else {
      if (!m_featureChildrenBuilder.isEmpty()) {
        for (de.hub.clickwatch.model.util.builder.IModelBuilder<? extends de.hub.clickwatch.model.Element> builder : m_featureChildrenBuilder) {
          _newInstance.getChildren().add(builder.build());
        }
      }
    }
    if (m_featureHandlersSet) {
      _newInstance.getHandlers().addAll(m_handlers);
    } else {
      if (!m_featureHandlersBuilder.isEmpty()) {
        for (de.hub.clickwatch.model.util.builder.IModelBuilder<? extends de.hub.clickwatch.model.Handler> builder : m_featureHandlersBuilder) {
          _newInstance.getHandlers().add(builder.build());
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

  public ElementBuilder withWatch(Boolean p_watch) {
    m_watch = p_watch;
    m_featureWatchSet = true;
    return this;
  }

  public ElementBuilder withChildren(de.hub.clickwatch.model.Element p_children) {
    m_children.add(p_children);
    m_featureChildrenSet = true;
    return this;
  }

  public ElementBuilder withChildren(java.util.Collection<? extends de.hub.clickwatch.model.Element> p_children) {
    m_children.addAll(p_children);
    m_featureChildrenSet = true;
    return this;
  }

  public ElementBuilder withChildren(de.hub.clickwatch.model.util.builder.IModelBuilder<? extends de.hub.clickwatch.model.Element> p_elementBuilder) {
    m_featureChildrenBuilder.add(p_elementBuilder);
    return this;
  }

  public ElementBuilder withHandlers(de.hub.clickwatch.model.Handler p_handlers) {
    m_handlers.add(p_handlers);
    m_featureHandlersSet = true;
    return this;
  }

  public ElementBuilder withHandlers(java.util.Collection<? extends de.hub.clickwatch.model.Handler> p_handlers) {
    m_handlers.addAll(p_handlers);
    m_featureHandlersSet = true;
    return this;
  }

  public ElementBuilder withHandlers(de.hub.clickwatch.model.util.builder.IModelBuilder<? extends de.hub.clickwatch.model.Handler> p_handlerBuilder) {
    m_featureHandlersBuilder.add(p_handlerBuilder);
    return this;
  }
}
