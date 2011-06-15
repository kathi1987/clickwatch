/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.xveg.xvegfeaturemodel;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import de.hub.xveg.configuration.IFeatureConfigurationProvider;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Xveg Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.xveg.xvegfeaturemodel.XvegFeature#getElementClass <em>Element Class</em>}</li>
 *   <li>{@link de.hub.xveg.xvegfeaturemodel.XvegFeature#getName <em>Name</em>}</li>
 *   <li>{@link de.hub.xveg.xvegfeaturemodel.XvegFeature#getDiagramType <em>Diagram Type</em>}</li>
 *   <li>{@link de.hub.xveg.xvegfeaturemodel.XvegFeature#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link de.hub.xveg.xvegfeaturemodel.XvegFeature#getStyle <em>Style</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.xveg.xvegfeaturemodel.XvegFeatureModelPackage#getXvegFeature()
 * @model
 * @generated
 */
public interface XvegFeature extends EObject {
	/**
	 * Returns the value of the '<em><b>Element Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Class</em>' reference.
	 * @see #setElementClass(EClass)
	 * @see de.hub.xveg.xvegfeaturemodel.XvegFeatureModelPackage#getXvegFeature_ElementClass()
	 * @model
	 * @generated
	 */
	EClass getElementClass();

	/**
	 * Sets the value of the '{@link de.hub.xveg.xvegfeaturemodel.XvegFeature#getElementClass <em>Element Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Class</em>' reference.
	 * @see #getElementClass()
	 * @generated
	 */
	void setElementClass(EClass value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.hub.xveg.xvegfeaturemodel.XvegFeatureModelPackage#getXvegFeature_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.hub.xveg.xvegfeaturemodel.XvegFeature#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Diagram Type</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.hub.xveg.xvegfeaturemodel.XvegDiagramType#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagram Type</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram Type</em>' container reference.
	 * @see #setDiagramType(XvegDiagramType)
	 * @see de.hub.xveg.xvegfeaturemodel.XvegFeatureModelPackage#getXvegFeature_DiagramType()
	 * @see de.hub.xveg.xvegfeaturemodel.XvegDiagramType#getFeatures
	 * @model opposite="features" transient="false"
	 * @generated
	 */
	XvegDiagramType getDiagramType();

	/**
	 * Sets the value of the '{@link de.hub.xveg.xvegfeaturemodel.XvegFeature#getDiagramType <em>Diagram Type</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagram Type</em>' container reference.
	 * @see #getDiagramType()
	 * @generated
	 */
	void setDiagramType(XvegDiagramType value);

	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration</em>' attribute.
	 * @see #setConfiguration(IFeatureConfigurationProvider)
	 * @see de.hub.xveg.xvegfeaturemodel.XvegFeatureModelPackage#getXvegFeature_Configuration()
	 * @model dataType="de.hub.xveg.xvegfeaturemodel.IFeatureConfigurationProvider" transient="true"
	 * @generated
	 */
	IFeatureConfigurationProvider getConfiguration();

	/**
	 * Sets the value of the '{@link de.hub.xveg.xvegfeaturemodel.XvegFeature#getConfiguration <em>Configuration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration</em>' attribute.
	 * @see #getConfiguration()
	 * @generated
	 */
	void setConfiguration(IFeatureConfigurationProvider value);

	/**
	 * Returns the value of the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style</em>' containment reference.
	 * @see #setStyle(StyleInfo)
	 * @see de.hub.xveg.xvegfeaturemodel.XvegFeatureModelPackage#getXvegFeature_Style()
	 * @model containment="true"
	 * @generated
	 */
	StyleInfo getStyle();

	/**
	 * Sets the value of the '{@link de.hub.xveg.xvegfeaturemodel.XvegFeature#getStyle <em>Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' containment reference.
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(StyleInfo value);

} // XvegFeature
