/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.xveg.xvegfeaturemodel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Xveg Diagram Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.xveg.xvegfeaturemodel.XvegDiagramType#getFeatures <em>Features</em>}</li>
 *   <li>{@link de.hub.xveg.xvegfeaturemodel.XvegDiagramType#getDslFactory <em>Dsl Factory</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.xveg.xvegfeaturemodel.XvegFeatureModelPackage#getXvegDiagramType()
 * @model
 * @generated
 */
public interface XvegDiagramType extends EObject {
	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link de.hub.xveg.xvegfeaturemodel.XvegFeature}.
	 * It is bidirectional and its opposite is '{@link de.hub.xveg.xvegfeaturemodel.XvegFeature#getDiagramType <em>Diagram Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see de.hub.xveg.xvegfeaturemodel.XvegFeatureModelPackage#getXvegDiagramType_Features()
	 * @see de.hub.xveg.xvegfeaturemodel.XvegFeature#getDiagramType
	 * @model opposite="diagramType" containment="true"
	 * @generated
	 */
	EList<XvegFeature> getFeatures();

	/**
	 * Returns the value of the '<em><b>Dsl Factory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dsl Factory</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dsl Factory</em>' reference.
	 * @see #setDslFactory(EFactory)
	 * @see de.hub.xveg.xvegfeaturemodel.XvegFeatureModelPackage#getXvegDiagramType_DslFactory()
	 * @model
	 * @generated
	 */
	EFactory getDslFactory();

	/**
	 * Sets the value of the '{@link de.hub.xveg.xvegfeaturemodel.XvegDiagramType#getDslFactory <em>Dsl Factory</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dsl Factory</em>' reference.
	 * @see #getDslFactory()
	 * @generated
	 */
	void setDslFactory(EFactory value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	XvegFeature getFeatureForObject(EObject object);

} // XvegDiagramType
