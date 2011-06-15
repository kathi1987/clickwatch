/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.xveg.xvegfeaturemodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Style Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.xveg.xvegfeaturemodel.StyleInfo#getLineColor <em>Line Color</em>}</li>
 *   <li>{@link de.hub.xveg.xvegfeaturemodel.StyleInfo#getBackgroundColor <em>Background Color</em>}</li>
 *   <li>{@link de.hub.xveg.xvegfeaturemodel.StyleInfo#getTextColor <em>Text Color</em>}</li>
 *   <li>{@link de.hub.xveg.xvegfeaturemodel.StyleInfo#getFontSize <em>Font Size</em>}</li>
 *   <li>{@link de.hub.xveg.xvegfeaturemodel.StyleInfo#isBoldFont <em>Bold Font</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.xveg.xvegfeaturemodel.XvegFeatureModelPackage#getStyleInfo()
 * @model
 * @generated
 */
public interface StyleInfo extends EObject {
	/**
	 * Returns the value of the '<em><b>Line Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Color</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Color</em>' containment reference.
	 * @see #setLineColor(Color)
	 * @see de.hub.xveg.xvegfeaturemodel.XvegFeatureModelPackage#getStyleInfo_LineColor()
	 * @model containment="true"
	 * @generated
	 */
	Color getLineColor();

	/**
	 * Sets the value of the '{@link de.hub.xveg.xvegfeaturemodel.StyleInfo#getLineColor <em>Line Color</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Color</em>' containment reference.
	 * @see #getLineColor()
	 * @generated
	 */
	void setLineColor(Color value);

	/**
	 * Returns the value of the '<em><b>Background Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Background Color</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Background Color</em>' containment reference.
	 * @see #setBackgroundColor(Color)
	 * @see de.hub.xveg.xvegfeaturemodel.XvegFeatureModelPackage#getStyleInfo_BackgroundColor()
	 * @model containment="true"
	 * @generated
	 */
	Color getBackgroundColor();

	/**
	 * Sets the value of the '{@link de.hub.xveg.xvegfeaturemodel.StyleInfo#getBackgroundColor <em>Background Color</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Background Color</em>' containment reference.
	 * @see #getBackgroundColor()
	 * @generated
	 */
	void setBackgroundColor(Color value);

	/**
	 * Returns the value of the '<em><b>Text Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Color</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Color</em>' containment reference.
	 * @see #setTextColor(Color)
	 * @see de.hub.xveg.xvegfeaturemodel.XvegFeatureModelPackage#getStyleInfo_TextColor()
	 * @model containment="true"
	 * @generated
	 */
	Color getTextColor();

	/**
	 * Sets the value of the '{@link de.hub.xveg.xvegfeaturemodel.StyleInfo#getTextColor <em>Text Color</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Color</em>' containment reference.
	 * @see #getTextColor()
	 * @generated
	 */
	void setTextColor(Color value);

	/**
	 * Returns the value of the '<em><b>Font Size</b></em>' attribute.
	 * The default value is <code>"12"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Font Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Size</em>' attribute.
	 * @see #setFontSize(int)
	 * @see de.hub.xveg.xvegfeaturemodel.XvegFeatureModelPackage#getStyleInfo_FontSize()
	 * @model default="12"
	 * @generated
	 */
	int getFontSize();

	/**
	 * Sets the value of the '{@link de.hub.xveg.xvegfeaturemodel.StyleInfo#getFontSize <em>Font Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Size</em>' attribute.
	 * @see #getFontSize()
	 * @generated
	 */
	void setFontSize(int value);

	/**
	 * Returns the value of the '<em><b>Bold Font</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bold Font</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bold Font</em>' attribute.
	 * @see #setBoldFont(boolean)
	 * @see de.hub.xveg.xvegfeaturemodel.XvegFeatureModelPackage#getStyleInfo_BoldFont()
	 * @model default="false"
	 * @generated
	 */
	boolean isBoldFont();

	/**
	 * Sets the value of the '{@link de.hub.xveg.xvegfeaturemodel.StyleInfo#isBoldFont <em>Bold Font</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bold Font</em>' attribute.
	 * @see #isBoldFont()
	 * @generated
	 */
	void setBoldFont(boolean value);

} // StyleInfo
