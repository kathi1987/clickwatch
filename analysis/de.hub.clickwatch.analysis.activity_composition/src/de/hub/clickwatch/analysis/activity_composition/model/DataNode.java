/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.analysis.activity_composition.model;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.analysis.activity_composition.model.DataNode#getOutput <em>Output</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.analysis.activity_composition.model.ModelPackage#getDataNode()
 * @model
 * @generated
 */
public interface DataNode extends Node {

	/**
	 * Returns the value of the '<em><b>Output</b></em>' reference list.
	 * The list contents are of type {@link de.hub.clickwatch.analysis.activity_composition.model.OutputEdge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' reference list.
	 * @see de.hub.clickwatch.analysis.activity_composition.model.ModelPackage#getDataNode_Output()
	 * @model
	 * @generated
	 */
	EList<OutputEdge> getOutput();
} // DataNode
