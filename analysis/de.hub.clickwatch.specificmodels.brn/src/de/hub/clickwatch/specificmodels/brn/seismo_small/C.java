/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.seismo_small;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>C</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.seismo_small.C#getEContainer_c <em>EContainer c</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.seismo_small.C#getText <em>Text</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.seismo_small.C#getV <em>V</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.specificmodels.brn.seismo_small.Seismo_smallPackage#getC()
 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Small|Handler/c|c:C|EObject'"
 * @generated
 */
public interface C extends EObject {
	/**
	 * Returns the value of the '<em><b>EContainer c</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.hub.clickwatch.specificmodels.brn.seismo_small.Small#getC <em>C</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EContainer c</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EContainer c</em>' container reference.
	 * @see #setEContainer_c(Small)
	 * @see de.hub.clickwatch.specificmodels.brn.seismo_small.Seismo_smallPackage#getC_EContainer_c()
	 * @see de.hub.clickwatch.specificmodels.brn.seismo_small.Small#getC
	 * @model opposite="c" transient="false"
	 * @generated
	 */
	Small getEContainer_c();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.seismo_small.C#getEContainer_c <em>EContainer c</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EContainer c</em>' container reference.
	 * @see #getEContainer_c()
	 * @generated
	 */
	void setEContainer_c(Small value);

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
	 * @see de.hub.clickwatch.specificmodels.brn.seismo_small.Seismo_smallPackage#getC_Text()
	 * @model unique="false"
	 *        annotation="http://de.hub.clickwatch.specificmodels target_id='Small|Handler/c|c:C|EObject/text|text:'"
	 * @generated
	 */
	EList<String> getText();

	/**
	 * Returns the value of the '<em><b>V</b></em>' containment reference list.
	 * The list contents are of type {@link de.hub.clickwatch.specificmodels.brn.seismo_small.V}.
	 * It is bidirectional and its opposite is '{@link de.hub.clickwatch.specificmodels.brn.seismo_small.V#getEContainer_v <em>EContainer v</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>V</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>V</em>' containment reference list.
	 * @see de.hub.clickwatch.specificmodels.brn.seismo_small.Seismo_smallPackage#getC_V()
	 * @see de.hub.clickwatch.specificmodels.brn.seismo_small.V#getEContainer_v
	 * @model opposite="eContainer_v" containment="true"
	 *        annotation="http://de.hub.clickwatch.specificmodels target_id='Small|Handler/c|c:C|EObject/v|v:V|EObject' IsCopy='false'"
	 * @generated
	 */
	EList<V> getV();

} // C
