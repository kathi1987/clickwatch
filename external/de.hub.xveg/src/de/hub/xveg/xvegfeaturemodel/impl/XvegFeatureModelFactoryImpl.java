/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.xveg.xvegfeaturemodel.impl;

import de.hub.xveg.xvegfeaturemodel.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

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
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XvegFeatureModelFactoryImpl extends EFactoryImpl implements XvegFeatureModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static XvegFeatureModelFactory init() {
		try {
			XvegFeatureModelFactory theXvegFeatureModelFactory = (XvegFeatureModelFactory)EPackage.Registry.INSTANCE.getEFactory("http://xvegfeaturemodel/1.0"); 
			if (theXvegFeatureModelFactory != null) {
				return theXvegFeatureModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new XvegFeatureModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XvegFeatureModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case XvegFeatureModelPackage.XVEG_FEATURE: return createXvegFeature();
			case XvegFeatureModelPackage.VERTEX_FEATURE: return createVertexFeature();
			case XvegFeatureModelPackage.EDGE_FEATURE: return createEdgeFeature();
			case XvegFeatureModelPackage.XVEG_DIAGRAM_TYPE: return createXvegDiagramType();
			case XvegFeatureModelPackage.COLOR: return createColor();
			case XvegFeatureModelPackage.STYLE_INFO: return createStyleInfo();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XvegFeature createXvegFeature() {
		XvegFeatureImpl xvegFeature = new XvegFeatureImpl();
		return xvegFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VertexFeature createVertexFeature() {
		VertexFeatureImpl vertexFeature = new VertexFeatureImpl();
		return vertexFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdgeFeature createEdgeFeature() {
		EdgeFeatureImpl edgeFeature = new EdgeFeatureImpl();
		return edgeFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XvegDiagramType createXvegDiagramType() {
		XvegDiagramTypeImpl xvegDiagramType = new XvegDiagramTypeImpl();
		return xvegDiagramType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color createColor() {
		ColorImpl color = new ColorImpl();
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleInfo createStyleInfo() {
		StyleInfoImpl styleInfo = new StyleInfoImpl();
		return styleInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XvegFeatureModelPackage getXvegFeatureModelPackage() {
		return (XvegFeatureModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static XvegFeatureModelPackage getPackage() {
		return XvegFeatureModelPackage.eINSTANCE;
	}

} //XvegFeatureModelFactoryImpl
