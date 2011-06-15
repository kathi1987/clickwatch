/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.xveg.xvegfeaturemodel.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import de.hub.xveg.configuration.IFeatureConfigurationProvider;
import de.hub.xveg.xvegfeaturemodel.Color;
import de.hub.xveg.xvegfeaturemodel.EdgeFeature;
import de.hub.xveg.xvegfeaturemodel.StyleInfo;
import de.hub.xveg.xvegfeaturemodel.VertexFeature;
import de.hub.xveg.xvegfeaturemodel.XvegDiagramType;
import de.hub.xveg.xvegfeaturemodel.XvegFeature;
import de.hub.xveg.xvegfeaturemodel.XvegFeatureModelFactory;
import de.hub.xveg.xvegfeaturemodel.XvegFeatureModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XvegFeatureModelPackageImpl extends EPackageImpl implements XvegFeatureModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xvegFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vertexFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass edgeFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xvegDiagramTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass styleInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType iFeatureConfigurationProviderEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.hub.xveg.xvegfeaturemodel.XvegFeatureModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private XvegFeatureModelPackageImpl() {
		super(eNS_URI, XvegFeatureModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link XvegFeatureModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static XvegFeatureModelPackage init() {
		if (isInited) return (XvegFeatureModelPackage)EPackage.Registry.INSTANCE.getEPackage(XvegFeatureModelPackage.eNS_URI);

		// Obtain or create and register package
		XvegFeatureModelPackageImpl theXvegFeatureModelPackage = (XvegFeatureModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof XvegFeatureModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new XvegFeatureModelPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theXvegFeatureModelPackage.createPackageContents();

		// Initialize created meta-data
		theXvegFeatureModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theXvegFeatureModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(XvegFeatureModelPackage.eNS_URI, theXvegFeatureModelPackage);
		return theXvegFeatureModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXvegFeature() {
		return xvegFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXvegFeature_ElementClass() {
		return (EReference)xvegFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXvegFeature_Name() {
		return (EAttribute)xvegFeatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXvegFeature_DiagramType() {
		return (EReference)xvegFeatureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXvegFeature_Configuration() {
		return (EAttribute)xvegFeatureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXvegFeature_Style() {
		return (EReference)xvegFeatureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVertexFeature() {
		return vertexFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEdgeFeature() {
		return edgeFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEdgeFeature_PossibleSourceFeatures() {
		return (EReference)edgeFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEdgeFeature_PossibleTargetFeatures() {
		return (EReference)edgeFeatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEdgeFeature_SourceReference() {
		return (EReference)edgeFeatureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEdgeFeature_TargetReference() {
		return (EReference)edgeFeatureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXvegDiagramType() {
		return xvegDiagramTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXvegDiagramType_Features() {
		return (EReference)xvegDiagramTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXvegDiagramType_DslFactory() {
		return (EReference)xvegDiagramTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColor() {
		return colorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColor_R() {
		return (EAttribute)colorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColor_G() {
		return (EAttribute)colorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColor_B() {
		return (EAttribute)colorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStyleInfo() {
		return styleInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStyleInfo_LineColor() {
		return (EReference)styleInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStyleInfo_BackgroundColor() {
		return (EReference)styleInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStyleInfo_TextColor() {
		return (EReference)styleInfoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStyleInfo_FontSize() {
		return (EAttribute)styleInfoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStyleInfo_BoldFont() {
		return (EAttribute)styleInfoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIFeatureConfigurationProvider() {
		return iFeatureConfigurationProviderEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XvegFeatureModelFactory getXvegFeatureModelFactory() {
		return (XvegFeatureModelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		xvegFeatureEClass = createEClass(XVEG_FEATURE);
		createEReference(xvegFeatureEClass, XVEG_FEATURE__ELEMENT_CLASS);
		createEAttribute(xvegFeatureEClass, XVEG_FEATURE__NAME);
		createEReference(xvegFeatureEClass, XVEG_FEATURE__DIAGRAM_TYPE);
		createEAttribute(xvegFeatureEClass, XVEG_FEATURE__CONFIGURATION);
		createEReference(xvegFeatureEClass, XVEG_FEATURE__STYLE);

		vertexFeatureEClass = createEClass(VERTEX_FEATURE);

		edgeFeatureEClass = createEClass(EDGE_FEATURE);
		createEReference(edgeFeatureEClass, EDGE_FEATURE__POSSIBLE_SOURCE_FEATURES);
		createEReference(edgeFeatureEClass, EDGE_FEATURE__POSSIBLE_TARGET_FEATURES);
		createEReference(edgeFeatureEClass, EDGE_FEATURE__SOURCE_REFERENCE);
		createEReference(edgeFeatureEClass, EDGE_FEATURE__TARGET_REFERENCE);

		xvegDiagramTypeEClass = createEClass(XVEG_DIAGRAM_TYPE);
		createEReference(xvegDiagramTypeEClass, XVEG_DIAGRAM_TYPE__FEATURES);
		createEReference(xvegDiagramTypeEClass, XVEG_DIAGRAM_TYPE__DSL_FACTORY);

		colorEClass = createEClass(COLOR);
		createEAttribute(colorEClass, COLOR__R);
		createEAttribute(colorEClass, COLOR__G);
		createEAttribute(colorEClass, COLOR__B);

		styleInfoEClass = createEClass(STYLE_INFO);
		createEReference(styleInfoEClass, STYLE_INFO__LINE_COLOR);
		createEReference(styleInfoEClass, STYLE_INFO__BACKGROUND_COLOR);
		createEReference(styleInfoEClass, STYLE_INFO__TEXT_COLOR);
		createEAttribute(styleInfoEClass, STYLE_INFO__FONT_SIZE);
		createEAttribute(styleInfoEClass, STYLE_INFO__BOLD_FONT);

		// Create data types
		iFeatureConfigurationProviderEDataType = createEDataType(IFEATURE_CONFIGURATION_PROVIDER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		vertexFeatureEClass.getESuperTypes().add(this.getXvegFeature());
		edgeFeatureEClass.getESuperTypes().add(this.getXvegFeature());

		// Initialize classes and features; add operations and parameters
		initEClass(xvegFeatureEClass, XvegFeature.class, "XvegFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXvegFeature_ElementClass(), ecorePackage.getEClass(), null, "elementClass", null, 0, 1, XvegFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXvegFeature_Name(), ecorePackage.getEString(), "name", null, 0, 1, XvegFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXvegFeature_DiagramType(), this.getXvegDiagramType(), this.getXvegDiagramType_Features(), "diagramType", null, 0, 1, XvegFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXvegFeature_Configuration(), this.getIFeatureConfigurationProvider(), "configuration", null, 0, 1, XvegFeature.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXvegFeature_Style(), this.getStyleInfo(), null, "style", null, 0, 1, XvegFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vertexFeatureEClass, VertexFeature.class, "VertexFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(edgeFeatureEClass, EdgeFeature.class, "EdgeFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEdgeFeature_PossibleSourceFeatures(), this.getVertexFeature(), null, "possibleSourceFeatures", null, 0, -1, EdgeFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEdgeFeature_PossibleTargetFeatures(), this.getVertexFeature(), null, "possibleTargetFeatures", null, 0, -1, EdgeFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEdgeFeature_SourceReference(), ecorePackage.getEReference(), null, "sourceReference", null, 0, 1, EdgeFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEdgeFeature_TargetReference(), ecorePackage.getEReference(), null, "targetReference", null, 0, 1, EdgeFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xvegDiagramTypeEClass, XvegDiagramType.class, "XvegDiagramType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXvegDiagramType_Features(), this.getXvegFeature(), this.getXvegFeature_DiagramType(), "features", null, 0, -1, XvegDiagramType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXvegDiagramType_DslFactory(), ecorePackage.getEFactory(), null, "dslFactory", null, 0, 1, XvegDiagramType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(xvegDiagramTypeEClass, this.getXvegFeature(), "getFeatureForObject", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "object", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(colorEClass, Color.class, "Color", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getColor_R(), ecorePackage.getEInt(), "r", null, 0, 1, Color.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColor_G(), ecorePackage.getEInt(), "g", null, 0, 1, Color.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColor_B(), ecorePackage.getEInt(), "b", null, 0, 1, Color.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(styleInfoEClass, StyleInfo.class, "StyleInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStyleInfo_LineColor(), this.getColor(), null, "lineColor", null, 0, 1, StyleInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStyleInfo_BackgroundColor(), this.getColor(), null, "backgroundColor", null, 0, 1, StyleInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStyleInfo_TextColor(), this.getColor(), null, "textColor", null, 0, 1, StyleInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStyleInfo_FontSize(), ecorePackage.getEInt(), "fontSize", "12", 0, 1, StyleInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStyleInfo_BoldFont(), ecorePackage.getEBoolean(), "boldFont", "false", 0, 1, StyleInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(iFeatureConfigurationProviderEDataType, IFeatureConfigurationProvider.class, "IFeatureConfigurationProvider", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //XvegFeatureModelPackageImpl
