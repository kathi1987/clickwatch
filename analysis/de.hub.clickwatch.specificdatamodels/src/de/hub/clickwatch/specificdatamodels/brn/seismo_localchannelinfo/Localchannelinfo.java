/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificdatamodels.brn.seismo_localchannelinfo;

import de.hub.clickwatch.datamodel.Value;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Localchannelinfo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificdatamodels.brn.seismo_localchannelinfo.Localchannelinfo#getC <em>C</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.specificdatamodels.brn.seismo_localchannelinfo.Seismo_localchannelinfoPackage#getLocalchannelinfo()
 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Localchannelinfo|Handler'"
 * @generated
 */
public interface Localchannelinfo extends Value {
	/**
	 * Returns the value of the '<em><b>C</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link de.hub.clickwatch.specificdatamodels.brn.seismo_localchannelinfo.C#getEContainer_c <em>EContainer c</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>C</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>C</em>' containment reference.
	 * @see #setC(C)
	 * @see de.hub.clickwatch.specificdatamodels.brn.seismo_localchannelinfo.Seismo_localchannelinfoPackage#getLocalchannelinfo_C()
	 * @see de.hub.clickwatch.specificdatamodels.brn.seismo_localchannelinfo.C#getEContainer_c
	 * @model opposite="eContainer_c" containment="true"
	 *        annotation="http://de.hub.clickwatch.specificmodels target_id='Localchannelinfo|Handler/c|c:C|EObject' IsCopy='false'"
	 * @generated
	 */
	C getC();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificdatamodels.brn.seismo_localchannelinfo.Localchannelinfo#getC <em>C</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>C</em>' containment reference.
	 * @see #getC()
	 * @generated
	 */
	void setC(C value);

} // Localchannelinfo
