/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.seismo_small;

import de.hub.clickwatch.model.Handler;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Small</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.seismo_small.Small#getC <em>C</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.specificmodels.brn.seismo_small.Seismo_smallPackage#getSmall()
 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Small|Handler'"
 * @generated
 */
public interface Small extends Handler {
	/**
	 * Returns the value of the '<em><b>C</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link de.hub.clickwatch.specificmodels.brn.seismo_small.C#getEContainer_c <em>EContainer c</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>C</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>C</em>' containment reference.
	 * @see #setC(C)
	 * @see de.hub.clickwatch.specificmodels.brn.seismo_small.Seismo_smallPackage#getSmall_C()
	 * @see de.hub.clickwatch.specificmodels.brn.seismo_small.C#getEContainer_c
	 * @model opposite="eContainer_c" containment="true"
	 *        annotation="http://de.hub.clickwatch.specificmodels target_id='Small|Handler/c|c:C|EObject' IsCopy='false'"
	 * @generated
	 */
	C getC();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.seismo_small.Small#getC <em>C</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>C</em>' containment reference.
	 * @see #getC()
	 * @generated
	 */
	void setC(C value);

} // Small
