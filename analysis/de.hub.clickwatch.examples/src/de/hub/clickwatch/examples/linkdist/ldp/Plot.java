/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.examples.linkdist.ldp;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.examples.linkdist.ldp.Plot#getLinks <em>Links</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.examples.linkdist.ldp.LinkDistPlotPackage#getPlot()
 * @model
 * @generated
 */
public interface Plot extends EObject {
	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link de.hub.clickwatch.examples.linkdist.ldp.Link}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see de.hub.clickwatch.examples.linkdist.ldp.LinkDistPlotPackage#getPlot_Links()
	 * @model containment="true"
	 * @generated
	 */
	EList<Link> getLinks();

} // Plot
