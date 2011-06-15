/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.xveg.xvegfeaturemodel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.xveg.xvegfeaturemodel.EdgeFeature#getPossibleSourceFeatures <em>Possible Source Features</em>}</li>
 *   <li>{@link de.hub.xveg.xvegfeaturemodel.EdgeFeature#getPossibleTargetFeatures <em>Possible Target Features</em>}</li>
 *   <li>{@link de.hub.xveg.xvegfeaturemodel.EdgeFeature#getSourceReference <em>Source Reference</em>}</li>
 *   <li>{@link de.hub.xveg.xvegfeaturemodel.EdgeFeature#getTargetReference <em>Target Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.xveg.xvegfeaturemodel.XvegFeatureModelPackage#getEdgeFeature()
 * @model
 * @generated
 */
public interface EdgeFeature extends XvegFeature {
	/**
	 * Returns the value of the '<em><b>Possible Source Features</b></em>' reference list.
	 * The list contents are of type {@link de.hub.xveg.xvegfeaturemodel.VertexFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Possible Source Features</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Possible Source Features</em>' reference list.
	 * @see de.hub.xveg.xvegfeaturemodel.XvegFeatureModelPackage#getEdgeFeature_PossibleSourceFeatures()
	 * @model
	 * @generated
	 */
	EList<VertexFeature> getPossibleSourceFeatures();

	/**
	 * Returns the value of the '<em><b>Possible Target Features</b></em>' reference list.
	 * The list contents are of type {@link de.hub.xveg.xvegfeaturemodel.VertexFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Possible Target Features</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Possible Target Features</em>' reference list.
	 * @see de.hub.xveg.xvegfeaturemodel.XvegFeatureModelPackage#getEdgeFeature_PossibleTargetFeatures()
	 * @model
	 * @generated
	 */
	EList<VertexFeature> getPossibleTargetFeatures();

	/**
	 * Returns the value of the '<em><b>Source Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Reference</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Reference</em>' reference.
	 * @see #setSourceReference(EReference)
	 * @see de.hub.xveg.xvegfeaturemodel.XvegFeatureModelPackage#getEdgeFeature_SourceReference()
	 * @model
	 * @generated
	 */
	EReference getSourceReference();

	/**
	 * Sets the value of the '{@link de.hub.xveg.xvegfeaturemodel.EdgeFeature#getSourceReference <em>Source Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Reference</em>' reference.
	 * @see #getSourceReference()
	 * @generated
	 */
	void setSourceReference(EReference value);

	/**
	 * Returns the value of the '<em><b>Target Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Reference</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Reference</em>' reference.
	 * @see #setTargetReference(EReference)
	 * @see de.hub.xveg.xvegfeaturemodel.XvegFeatureModelPackage#getEdgeFeature_TargetReference()
	 * @model
	 * @generated
	 */
	EReference getTargetReference();

	/**
	 * Sets the value of the '{@link de.hub.xveg.xvegfeaturemodel.EdgeFeature#getTargetReference <em>Target Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Reference</em>' reference.
	 * @see #getTargetReference()
	 * @generated
	 */
	void setTargetReference(EReference value);

} // EdgeFeature
