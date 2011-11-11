/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.sf_stats;

import de.hub.clickwatch.model.Handler;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stats</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.sf_stats.Stats#getFlowstats <em>Flowstats</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.specificmodels.brn.sf_stats.Sf_statsPackage#getStats()
 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler'"
 * @generated
 */
public interface Stats extends Handler {
	/**
     * Returns the value of the '<em><b>Flowstats</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link de.hub.clickwatch.specificmodels.brn.sf_stats.Flowstats#getEContainer_flowstats <em>EContainer flowstats</em>}'.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flowstats</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Flowstats</em>' containment reference.
     * @see #setFlowstats(Flowstats)
     * @see de.hub.clickwatch.specificmodels.brn.sf_stats.Sf_statsPackage#getStats_Flowstats()
     * @see de.hub.clickwatch.specificmodels.brn.sf_stats.Flowstats#getEContainer_flowstats
     * @model opposite="eContainer_flowstats" containment="true"
     *        annotation="http://de.hub.clickwatch.specificmodels target_id='Stats|Handler/flowstats|flowstats:Flowstats|EObject' IsCopy='false'"
     * @generated
     */
	Flowstats getFlowstats();

	/**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.sf_stats.Stats#getFlowstats <em>Flowstats</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Flowstats</em>' containment reference.
     * @see #getFlowstats()
     * @generated
     */
	void setFlowstats(Flowstats value);

} // Stats
