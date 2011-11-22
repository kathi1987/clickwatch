/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo;

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
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.C#getEContainer_c <em>EContainer c</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.C#getV <em>V</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.Seismo_localchannelinfoPackage#getC()
 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Localchannelinfo|Handler/c|c:C|EObject'"
 * @generated
 */
public interface C extends EObject {
    /**
     * Returns the value of the '<em><b>EContainer c</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.Localchannelinfo#getC <em>C</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>EContainer c</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>EContainer c</em>' container reference.
     * @see #setEContainer_c(Localchannelinfo)
     * @see de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.Seismo_localchannelinfoPackage#getC_EContainer_c()
     * @see de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.Localchannelinfo#getC
     * @model opposite="c" transient="false"
     * @generated
     */
    Localchannelinfo getEContainer_c();

    /**
     * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.C#getEContainer_c <em>EContainer c</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>EContainer c</em>' container reference.
     * @see #getEContainer_c()
     * @generated
     */
    void setEContainer_c(Localchannelinfo value);

    /**
     * Returns the value of the '<em><b>V</b></em>' containment reference list.
     * The list contents are of type {@link de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.V}.
     * It is bidirectional and its opposite is '{@link de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.V#getEContainer_v <em>EContainer v</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>V</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>V</em>' containment reference list.
     * @see de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.Seismo_localchannelinfoPackage#getC_V()
     * @see de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.V#getEContainer_v
     * @model opposite="eContainer_v" containment="true"
     *        annotation="http://de.hub.clickwatch.specificmodels target_id='Localchannelinfo|Handler/c|c:C|EObject/v|v:V|EObject' IsCopy='false'"
     * @generated
     */
    EList<V> getV();

} // C
