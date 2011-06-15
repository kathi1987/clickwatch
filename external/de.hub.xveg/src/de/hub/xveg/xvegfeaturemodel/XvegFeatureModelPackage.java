/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.xveg.xvegfeaturemodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.hub.xveg.xvegfeaturemodel.XvegFeatureModelFactory
 * @model kind="package"
 * @generated
 */
public interface XvegFeatureModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "xvegfeaturemodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://xvegfeaturemodel/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "xvegfeaturemodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XvegFeatureModelPackage eINSTANCE = de.hub.xveg.xvegfeaturemodel.impl.XvegFeatureModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.hub.xveg.xvegfeaturemodel.impl.XvegFeatureImpl <em>Xveg Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.xveg.xvegfeaturemodel.impl.XvegFeatureImpl
	 * @see de.hub.xveg.xvegfeaturemodel.impl.XvegFeatureModelPackageImpl#getXvegFeature()
	 * @generated
	 */
	int XVEG_FEATURE = 0;

	/**
	 * The feature id for the '<em><b>Element Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XVEG_FEATURE__ELEMENT_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XVEG_FEATURE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Diagram Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XVEG_FEATURE__DIAGRAM_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XVEG_FEATURE__CONFIGURATION = 3;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XVEG_FEATURE__STYLE = 4;

	/**
	 * The number of structural features of the '<em>Xveg Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XVEG_FEATURE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link de.hub.xveg.xvegfeaturemodel.impl.VertexFeatureImpl <em>Vertex Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.xveg.xvegfeaturemodel.impl.VertexFeatureImpl
	 * @see de.hub.xveg.xvegfeaturemodel.impl.XvegFeatureModelPackageImpl#getVertexFeature()
	 * @generated
	 */
	int VERTEX_FEATURE = 1;

	/**
	 * The feature id for the '<em><b>Element Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX_FEATURE__ELEMENT_CLASS = XVEG_FEATURE__ELEMENT_CLASS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX_FEATURE__NAME = XVEG_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Diagram Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX_FEATURE__DIAGRAM_TYPE = XVEG_FEATURE__DIAGRAM_TYPE;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX_FEATURE__CONFIGURATION = XVEG_FEATURE__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX_FEATURE__STYLE = XVEG_FEATURE__STYLE;

	/**
	 * The number of structural features of the '<em>Vertex Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX_FEATURE_FEATURE_COUNT = XVEG_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.hub.xveg.xvegfeaturemodel.impl.EdgeFeatureImpl <em>Edge Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.xveg.xvegfeaturemodel.impl.EdgeFeatureImpl
	 * @see de.hub.xveg.xvegfeaturemodel.impl.XvegFeatureModelPackageImpl#getEdgeFeature()
	 * @generated
	 */
	int EDGE_FEATURE = 2;

	/**
	 * The feature id for the '<em><b>Element Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_FEATURE__ELEMENT_CLASS = XVEG_FEATURE__ELEMENT_CLASS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_FEATURE__NAME = XVEG_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Diagram Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_FEATURE__DIAGRAM_TYPE = XVEG_FEATURE__DIAGRAM_TYPE;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_FEATURE__CONFIGURATION = XVEG_FEATURE__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_FEATURE__STYLE = XVEG_FEATURE__STYLE;

	/**
	 * The feature id for the '<em><b>Possible Source Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_FEATURE__POSSIBLE_SOURCE_FEATURES = XVEG_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Possible Target Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_FEATURE__POSSIBLE_TARGET_FEATURES = XVEG_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_FEATURE__SOURCE_REFERENCE = XVEG_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Target Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_FEATURE__TARGET_REFERENCE = XVEG_FEATURE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Edge Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_FEATURE_FEATURE_COUNT = XVEG_FEATURE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link de.hub.xveg.xvegfeaturemodel.impl.XvegDiagramTypeImpl <em>Xveg Diagram Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.xveg.xvegfeaturemodel.impl.XvegDiagramTypeImpl
	 * @see de.hub.xveg.xvegfeaturemodel.impl.XvegFeatureModelPackageImpl#getXvegDiagramType()
	 * @generated
	 */
	int XVEG_DIAGRAM_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XVEG_DIAGRAM_TYPE__FEATURES = 0;

	/**
	 * The feature id for the '<em><b>Dsl Factory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XVEG_DIAGRAM_TYPE__DSL_FACTORY = 1;

	/**
	 * The number of structural features of the '<em>Xveg Diagram Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XVEG_DIAGRAM_TYPE_FEATURE_COUNT = 2;


	/**
	 * The meta object id for the '{@link de.hub.xveg.xvegfeaturemodel.impl.ColorImpl <em>Color</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.xveg.xvegfeaturemodel.impl.ColorImpl
	 * @see de.hub.xveg.xvegfeaturemodel.impl.XvegFeatureModelPackageImpl#getColor()
	 * @generated
	 */
	int COLOR = 4;

	/**
	 * The feature id for the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR__R = 0;

	/**
	 * The feature id for the '<em><b>G</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR__G = 1;

	/**
	 * The feature id for the '<em><b>B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR__B = 2;

	/**
	 * The number of structural features of the '<em>Color</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link de.hub.xveg.xvegfeaturemodel.impl.StyleInfoImpl <em>Style Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.xveg.xvegfeaturemodel.impl.StyleInfoImpl
	 * @see de.hub.xveg.xvegfeaturemodel.impl.XvegFeatureModelPackageImpl#getStyleInfo()
	 * @generated
	 */
	int STYLE_INFO = 5;

	/**
	 * The feature id for the '<em><b>Line Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_INFO__LINE_COLOR = 0;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_INFO__BACKGROUND_COLOR = 1;

	/**
	 * The feature id for the '<em><b>Text Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_INFO__TEXT_COLOR = 2;

	/**
	 * The feature id for the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_INFO__FONT_SIZE = 3;

	/**
	 * The feature id for the '<em><b>Bold Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_INFO__BOLD_FONT = 4;

	/**
	 * The number of structural features of the '<em>Style Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_INFO_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '<em>IFeature Configuration Provider</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hub.xveg.configuration.IFeatureConfigurationProvider
	 * @see de.hub.xveg.xvegfeaturemodel.impl.XvegFeatureModelPackageImpl#getIFeatureConfigurationProvider()
	 * @generated
	 */
	int IFEATURE_CONFIGURATION_PROVIDER = 6;

	/**
	 * Returns the meta object for class '{@link de.hub.xveg.xvegfeaturemodel.XvegFeature <em>Xveg Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xveg Feature</em>'.
	 * @see de.hub.xveg.xvegfeaturemodel.XvegFeature
	 * @generated
	 */
	EClass getXvegFeature();

	/**
	 * Returns the meta object for the reference '{@link de.hub.xveg.xvegfeaturemodel.XvegFeature#getElementClass <em>Element Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element Class</em>'.
	 * @see de.hub.xveg.xvegfeaturemodel.XvegFeature#getElementClass()
	 * @see #getXvegFeature()
	 * @generated
	 */
	EReference getXvegFeature_ElementClass();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.xveg.xvegfeaturemodel.XvegFeature#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.hub.xveg.xvegfeaturemodel.XvegFeature#getName()
	 * @see #getXvegFeature()
	 * @generated
	 */
	EAttribute getXvegFeature_Name();

	/**
	 * Returns the meta object for the container reference '{@link de.hub.xveg.xvegfeaturemodel.XvegFeature#getDiagramType <em>Diagram Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Diagram Type</em>'.
	 * @see de.hub.xveg.xvegfeaturemodel.XvegFeature#getDiagramType()
	 * @see #getXvegFeature()
	 * @generated
	 */
	EReference getXvegFeature_DiagramType();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.xveg.xvegfeaturemodel.XvegFeature#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Configuration</em>'.
	 * @see de.hub.xveg.xvegfeaturemodel.XvegFeature#getConfiguration()
	 * @see #getXvegFeature()
	 * @generated
	 */
	EAttribute getXvegFeature_Configuration();

	/**
	 * Returns the meta object for the containment reference '{@link de.hub.xveg.xvegfeaturemodel.XvegFeature#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Style</em>'.
	 * @see de.hub.xveg.xvegfeaturemodel.XvegFeature#getStyle()
	 * @see #getXvegFeature()
	 * @generated
	 */
	EReference getXvegFeature_Style();

	/**
	 * Returns the meta object for class '{@link de.hub.xveg.xvegfeaturemodel.VertexFeature <em>Vertex Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vertex Feature</em>'.
	 * @see de.hub.xveg.xvegfeaturemodel.VertexFeature
	 * @generated
	 */
	EClass getVertexFeature();

	/**
	 * Returns the meta object for class '{@link de.hub.xveg.xvegfeaturemodel.EdgeFeature <em>Edge Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge Feature</em>'.
	 * @see de.hub.xveg.xvegfeaturemodel.EdgeFeature
	 * @generated
	 */
	EClass getEdgeFeature();

	/**
	 * Returns the meta object for the reference list '{@link de.hub.xveg.xvegfeaturemodel.EdgeFeature#getPossibleSourceFeatures <em>Possible Source Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Possible Source Features</em>'.
	 * @see de.hub.xveg.xvegfeaturemodel.EdgeFeature#getPossibleSourceFeatures()
	 * @see #getEdgeFeature()
	 * @generated
	 */
	EReference getEdgeFeature_PossibleSourceFeatures();

	/**
	 * Returns the meta object for the reference list '{@link de.hub.xveg.xvegfeaturemodel.EdgeFeature#getPossibleTargetFeatures <em>Possible Target Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Possible Target Features</em>'.
	 * @see de.hub.xveg.xvegfeaturemodel.EdgeFeature#getPossibleTargetFeatures()
	 * @see #getEdgeFeature()
	 * @generated
	 */
	EReference getEdgeFeature_PossibleTargetFeatures();

	/**
	 * Returns the meta object for the reference '{@link de.hub.xveg.xvegfeaturemodel.EdgeFeature#getSourceReference <em>Source Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Reference</em>'.
	 * @see de.hub.xveg.xvegfeaturemodel.EdgeFeature#getSourceReference()
	 * @see #getEdgeFeature()
	 * @generated
	 */
	EReference getEdgeFeature_SourceReference();

	/**
	 * Returns the meta object for the reference '{@link de.hub.xveg.xvegfeaturemodel.EdgeFeature#getTargetReference <em>Target Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Reference</em>'.
	 * @see de.hub.xveg.xvegfeaturemodel.EdgeFeature#getTargetReference()
	 * @see #getEdgeFeature()
	 * @generated
	 */
	EReference getEdgeFeature_TargetReference();

	/**
	 * Returns the meta object for class '{@link de.hub.xveg.xvegfeaturemodel.XvegDiagramType <em>Xveg Diagram Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xveg Diagram Type</em>'.
	 * @see de.hub.xveg.xvegfeaturemodel.XvegDiagramType
	 * @generated
	 */
	EClass getXvegDiagramType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.hub.xveg.xvegfeaturemodel.XvegDiagramType#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see de.hub.xveg.xvegfeaturemodel.XvegDiagramType#getFeatures()
	 * @see #getXvegDiagramType()
	 * @generated
	 */
	EReference getXvegDiagramType_Features();

	/**
	 * Returns the meta object for the reference '{@link de.hub.xveg.xvegfeaturemodel.XvegDiagramType#getDslFactory <em>Dsl Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dsl Factory</em>'.
	 * @see de.hub.xveg.xvegfeaturemodel.XvegDiagramType#getDslFactory()
	 * @see #getXvegDiagramType()
	 * @generated
	 */
	EReference getXvegDiagramType_DslFactory();

	/**
	 * Returns the meta object for class '{@link de.hub.xveg.xvegfeaturemodel.Color <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Color</em>'.
	 * @see de.hub.xveg.xvegfeaturemodel.Color
	 * @generated
	 */
	EClass getColor();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.xveg.xvegfeaturemodel.Color#getR <em>R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>R</em>'.
	 * @see de.hub.xveg.xvegfeaturemodel.Color#getR()
	 * @see #getColor()
	 * @generated
	 */
	EAttribute getColor_R();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.xveg.xvegfeaturemodel.Color#getG <em>G</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>G</em>'.
	 * @see de.hub.xveg.xvegfeaturemodel.Color#getG()
	 * @see #getColor()
	 * @generated
	 */
	EAttribute getColor_G();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.xveg.xvegfeaturemodel.Color#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>B</em>'.
	 * @see de.hub.xveg.xvegfeaturemodel.Color#getB()
	 * @see #getColor()
	 * @generated
	 */
	EAttribute getColor_B();

	/**
	 * Returns the meta object for class '{@link de.hub.xveg.xvegfeaturemodel.StyleInfo <em>Style Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Style Info</em>'.
	 * @see de.hub.xveg.xvegfeaturemodel.StyleInfo
	 * @generated
	 */
	EClass getStyleInfo();

	/**
	 * Returns the meta object for the containment reference '{@link de.hub.xveg.xvegfeaturemodel.StyleInfo#getLineColor <em>Line Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Line Color</em>'.
	 * @see de.hub.xveg.xvegfeaturemodel.StyleInfo#getLineColor()
	 * @see #getStyleInfo()
	 * @generated
	 */
	EReference getStyleInfo_LineColor();

	/**
	 * Returns the meta object for the containment reference '{@link de.hub.xveg.xvegfeaturemodel.StyleInfo#getBackgroundColor <em>Background Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Background Color</em>'.
	 * @see de.hub.xveg.xvegfeaturemodel.StyleInfo#getBackgroundColor()
	 * @see #getStyleInfo()
	 * @generated
	 */
	EReference getStyleInfo_BackgroundColor();

	/**
	 * Returns the meta object for the containment reference '{@link de.hub.xveg.xvegfeaturemodel.StyleInfo#getTextColor <em>Text Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text Color</em>'.
	 * @see de.hub.xveg.xvegfeaturemodel.StyleInfo#getTextColor()
	 * @see #getStyleInfo()
	 * @generated
	 */
	EReference getStyleInfo_TextColor();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.xveg.xvegfeaturemodel.StyleInfo#getFontSize <em>Font Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Size</em>'.
	 * @see de.hub.xveg.xvegfeaturemodel.StyleInfo#getFontSize()
	 * @see #getStyleInfo()
	 * @generated
	 */
	EAttribute getStyleInfo_FontSize();

	/**
	 * Returns the meta object for the attribute '{@link de.hub.xveg.xvegfeaturemodel.StyleInfo#isBoldFont <em>Bold Font</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bold Font</em>'.
	 * @see de.hub.xveg.xvegfeaturemodel.StyleInfo#isBoldFont()
	 * @see #getStyleInfo()
	 * @generated
	 */
	EAttribute getStyleInfo_BoldFont();

	/**
	 * Returns the meta object for data type '{@link de.hub.xveg.configuration.IFeatureConfigurationProvider <em>IFeature Configuration Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IFeature Configuration Provider</em>'.
	 * @see de.hub.xveg.configuration.IFeatureConfigurationProvider
	 * @model instanceClass="de.hub.xveg.configuration.IFeatureConfigurationProvider" serializeable="false"
	 * @generated
	 */
	EDataType getIFeatureConfigurationProvider();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	XvegFeatureModelFactory getXvegFeatureModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.hub.xveg.xvegfeaturemodel.impl.XvegFeatureImpl <em>Xveg Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.xveg.xvegfeaturemodel.impl.XvegFeatureImpl
		 * @see de.hub.xveg.xvegfeaturemodel.impl.XvegFeatureModelPackageImpl#getXvegFeature()
		 * @generated
		 */
		EClass XVEG_FEATURE = eINSTANCE.getXvegFeature();

		/**
		 * The meta object literal for the '<em><b>Element Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XVEG_FEATURE__ELEMENT_CLASS = eINSTANCE.getXvegFeature_ElementClass();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XVEG_FEATURE__NAME = eINSTANCE.getXvegFeature_Name();

		/**
		 * The meta object literal for the '<em><b>Diagram Type</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XVEG_FEATURE__DIAGRAM_TYPE = eINSTANCE.getXvegFeature_DiagramType();

		/**
		 * The meta object literal for the '<em><b>Configuration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XVEG_FEATURE__CONFIGURATION = eINSTANCE.getXvegFeature_Configuration();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XVEG_FEATURE__STYLE = eINSTANCE.getXvegFeature_Style();

		/**
		 * The meta object literal for the '{@link de.hub.xveg.xvegfeaturemodel.impl.VertexFeatureImpl <em>Vertex Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.xveg.xvegfeaturemodel.impl.VertexFeatureImpl
		 * @see de.hub.xveg.xvegfeaturemodel.impl.XvegFeatureModelPackageImpl#getVertexFeature()
		 * @generated
		 */
		EClass VERTEX_FEATURE = eINSTANCE.getVertexFeature();

		/**
		 * The meta object literal for the '{@link de.hub.xveg.xvegfeaturemodel.impl.EdgeFeatureImpl <em>Edge Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.xveg.xvegfeaturemodel.impl.EdgeFeatureImpl
		 * @see de.hub.xveg.xvegfeaturemodel.impl.XvegFeatureModelPackageImpl#getEdgeFeature()
		 * @generated
		 */
		EClass EDGE_FEATURE = eINSTANCE.getEdgeFeature();

		/**
		 * The meta object literal for the '<em><b>Possible Source Features</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE_FEATURE__POSSIBLE_SOURCE_FEATURES = eINSTANCE.getEdgeFeature_PossibleSourceFeatures();

		/**
		 * The meta object literal for the '<em><b>Possible Target Features</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE_FEATURE__POSSIBLE_TARGET_FEATURES = eINSTANCE.getEdgeFeature_PossibleTargetFeatures();

		/**
		 * The meta object literal for the '<em><b>Source Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE_FEATURE__SOURCE_REFERENCE = eINSTANCE.getEdgeFeature_SourceReference();

		/**
		 * The meta object literal for the '<em><b>Target Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE_FEATURE__TARGET_REFERENCE = eINSTANCE.getEdgeFeature_TargetReference();

		/**
		 * The meta object literal for the '{@link de.hub.xveg.xvegfeaturemodel.impl.XvegDiagramTypeImpl <em>Xveg Diagram Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.xveg.xvegfeaturemodel.impl.XvegDiagramTypeImpl
		 * @see de.hub.xveg.xvegfeaturemodel.impl.XvegFeatureModelPackageImpl#getXvegDiagramType()
		 * @generated
		 */
		EClass XVEG_DIAGRAM_TYPE = eINSTANCE.getXvegDiagramType();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XVEG_DIAGRAM_TYPE__FEATURES = eINSTANCE.getXvegDiagramType_Features();

		/**
		 * The meta object literal for the '<em><b>Dsl Factory</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XVEG_DIAGRAM_TYPE__DSL_FACTORY = eINSTANCE.getXvegDiagramType_DslFactory();

		/**
		 * The meta object literal for the '{@link de.hub.xveg.xvegfeaturemodel.impl.ColorImpl <em>Color</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.xveg.xvegfeaturemodel.impl.ColorImpl
		 * @see de.hub.xveg.xvegfeaturemodel.impl.XvegFeatureModelPackageImpl#getColor()
		 * @generated
		 */
		EClass COLOR = eINSTANCE.getColor();

		/**
		 * The meta object literal for the '<em><b>R</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLOR__R = eINSTANCE.getColor_R();

		/**
		 * The meta object literal for the '<em><b>G</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLOR__G = eINSTANCE.getColor_G();

		/**
		 * The meta object literal for the '<em><b>B</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLOR__B = eINSTANCE.getColor_B();

		/**
		 * The meta object literal for the '{@link de.hub.xveg.xvegfeaturemodel.impl.StyleInfoImpl <em>Style Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.xveg.xvegfeaturemodel.impl.StyleInfoImpl
		 * @see de.hub.xveg.xvegfeaturemodel.impl.XvegFeatureModelPackageImpl#getStyleInfo()
		 * @generated
		 */
		EClass STYLE_INFO = eINSTANCE.getStyleInfo();

		/**
		 * The meta object literal for the '<em><b>Line Color</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STYLE_INFO__LINE_COLOR = eINSTANCE.getStyleInfo_LineColor();

		/**
		 * The meta object literal for the '<em><b>Background Color</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STYLE_INFO__BACKGROUND_COLOR = eINSTANCE.getStyleInfo_BackgroundColor();

		/**
		 * The meta object literal for the '<em><b>Text Color</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STYLE_INFO__TEXT_COLOR = eINSTANCE.getStyleInfo_TextColor();

		/**
		 * The meta object literal for the '<em><b>Font Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLE_INFO__FONT_SIZE = eINSTANCE.getStyleInfo_FontSize();

		/**
		 * The meta object literal for the '<em><b>Bold Font</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLE_INFO__BOLD_FONT = eINSTANCE.getStyleInfo_BoldFont();

		/**
		 * The meta object literal for the '<em>IFeature Configuration Provider</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hub.xveg.configuration.IFeatureConfigurationProvider
		 * @see de.hub.xveg.xvegfeaturemodel.impl.XvegFeatureModelPackageImpl#getIFeatureConfigurationProvider()
		 * @generated
		 */
		EDataType IFEATURE_CONFIGURATION_PROVIDER = eINSTANCE.getIFeatureConfigurationProvider();

	}

} //XvegFeatureModelPackage
