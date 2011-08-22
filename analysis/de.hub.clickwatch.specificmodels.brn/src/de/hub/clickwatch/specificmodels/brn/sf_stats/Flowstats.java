/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.sf_stats;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flowstats</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.sf_stats.Flowstats#getEContainer_flowstats <em>EContainer flowstats</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.sf_stats.Flowstats#getText <em>Text</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.sf_stats.Flowstats#getTxflow <em>Txflow</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.sf_stats.Flowstats#getNode <em>Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.specificmodels.brn.sf_stats.Sf_statsPackage#getFlowstats()
 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/flowstats|flowstats:Flowstats|EObject'"
 * @generated
 */
public interface Flowstats extends EObject {
	/**
	 * Returns the value of the '<em><b>EContainer flowstats</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.hub.clickwatch.specificmodels.brn.sf_stats.Stats#getFlowstats <em>Flowstats</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EContainer flowstats</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EContainer flowstats</em>' container reference.
	 * @see #setEContainer_flowstats(Stats)
	 * @see de.hub.clickwatch.specificmodels.brn.sf_stats.Sf_statsPackage#getFlowstats_EContainer_flowstats()
	 * @see de.hub.clickwatch.specificmodels.brn.sf_stats.Stats#getFlowstats
	 * @model opposite="flowstats" transient="false"
	 * @generated
	 */
	Stats getEContainer_flowstats();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.sf_stats.Flowstats#getEContainer_flowstats <em>EContainer flowstats</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EContainer flowstats</em>' container reference.
	 * @see #getEContainer_flowstats()
	 * @generated
	 */
	void setEContainer_flowstats(Stats value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute list.
	 * @see de.hub.clickwatch.specificmodels.brn.sf_stats.Sf_statsPackage#getFlowstats_Text()
	 * @model unique="false"
	 *        annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/flowstats|flowstats:Flowstats|EObject/text|text:'"
	 * @generated
	 */
	EList<String> getText();

	/**
	 * Returns the value of the '<em><b>Txflow</b></em>' containment reference list.
	 * The list contents are of type {@link de.hub.clickwatch.specificmodels.brn.sf_stats.Txflow}.
	 * It is bidirectional and its opposite is '{@link de.hub.clickwatch.specificmodels.brn.sf_stats.Txflow#getEContainer_txflow <em>EContainer txflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Txflow</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Txflow</em>' containment reference list.
	 * @see de.hub.clickwatch.specificmodels.brn.sf_stats.Sf_statsPackage#getFlowstats_Txflow()
	 * @see de.hub.clickwatch.specificmodels.brn.sf_stats.Txflow#getEContainer_txflow
	 * @model opposite="eContainer_txflow" containment="true"
	 *        annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/flowstats|flowstats:Flowstats|EObject/txflow|txflow:Txflow|EObject' IsCopy='false'"
	 * @generated
	 */
	EList<Txflow> getTxflow();

	/**
	 * Returns the value of the '<em><b>Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' attribute.
	 * @see #setNode(String)
	 * @see de.hub.clickwatch.specificmodels.brn.sf_stats.Sf_statsPackage#getFlowstats_Node()
	 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/flowstats|flowstats:Flowstats|EObject/node|node:'"
	 * @generated
	 */
	String getNode();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.sf_stats.Flowstats#getNode <em>Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node</em>' attribute.
	 * @see #getNode()
	 * @generated
	 */
	void setNode(String value);

} // Flowstats
