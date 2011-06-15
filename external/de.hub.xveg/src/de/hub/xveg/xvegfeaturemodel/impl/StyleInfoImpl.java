/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.xveg.xvegfeaturemodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import de.hub.xveg.xvegfeaturemodel.Color;
import de.hub.xveg.xvegfeaturemodel.StyleInfo;
import de.hub.xveg.xvegfeaturemodel.XvegFeatureModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Style Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.xveg.xvegfeaturemodel.impl.StyleInfoImpl#getLineColor <em>Line Color</em>}</li>
 *   <li>{@link de.hub.xveg.xvegfeaturemodel.impl.StyleInfoImpl#getBackgroundColor <em>Background Color</em>}</li>
 *   <li>{@link de.hub.xveg.xvegfeaturemodel.impl.StyleInfoImpl#getTextColor <em>Text Color</em>}</li>
 *   <li>{@link de.hub.xveg.xvegfeaturemodel.impl.StyleInfoImpl#getFontSize <em>Font Size</em>}</li>
 *   <li>{@link de.hub.xveg.xvegfeaturemodel.impl.StyleInfoImpl#isBoldFont <em>Bold Font</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StyleInfoImpl extends EObjectImpl implements StyleInfo {
	/**
	 * The cached value of the '{@link #getLineColor() <em>Line Color</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineColor()
	 * @generated
	 * @ordered
	 */
	protected Color lineColor;

	/**
	 * The cached value of the '{@link #getBackgroundColor() <em>Background Color</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundColor()
	 * @generated
	 * @ordered
	 */
	protected Color backgroundColor;

	/**
	 * The cached value of the '{@link #getTextColor() <em>Text Color</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextColor()
	 * @generated
	 * @ordered
	 */
	protected Color textColor;

	/**
	 * The default value of the '{@link #getFontSize() <em>Font Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontSize()
	 * @generated
	 * @ordered
	 */
	protected static final int FONT_SIZE_EDEFAULT = 12;

	/**
	 * The cached value of the '{@link #getFontSize() <em>Font Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontSize()
	 * @generated
	 * @ordered
	 */
	protected int fontSize = FONT_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #isBoldFont() <em>Bold Font</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBoldFont()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BOLD_FONT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBoldFont() <em>Bold Font</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBoldFont()
	 * @generated
	 * @ordered
	 */
	protected boolean boldFont = BOLD_FONT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StyleInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XvegFeatureModelPackage.Literals.STYLE_INFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color getLineColor() {
		return lineColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLineColor(Color newLineColor, NotificationChain msgs) {
		Color oldLineColor = lineColor;
		lineColor = newLineColor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XvegFeatureModelPackage.STYLE_INFO__LINE_COLOR, oldLineColor, newLineColor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineColor(Color newLineColor) {
		if (newLineColor != lineColor) {
			NotificationChain msgs = null;
			if (lineColor != null)
				msgs = ((InternalEObject)lineColor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XvegFeatureModelPackage.STYLE_INFO__LINE_COLOR, null, msgs);
			if (newLineColor != null)
				msgs = ((InternalEObject)newLineColor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XvegFeatureModelPackage.STYLE_INFO__LINE_COLOR, null, msgs);
			msgs = basicSetLineColor(newLineColor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XvegFeatureModelPackage.STYLE_INFO__LINE_COLOR, newLineColor, newLineColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color getBackgroundColor() {
		return backgroundColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBackgroundColor(Color newBackgroundColor, NotificationChain msgs) {
		Color oldBackgroundColor = backgroundColor;
		backgroundColor = newBackgroundColor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XvegFeatureModelPackage.STYLE_INFO__BACKGROUND_COLOR, oldBackgroundColor, newBackgroundColor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackgroundColor(Color newBackgroundColor) {
		if (newBackgroundColor != backgroundColor) {
			NotificationChain msgs = null;
			if (backgroundColor != null)
				msgs = ((InternalEObject)backgroundColor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XvegFeatureModelPackage.STYLE_INFO__BACKGROUND_COLOR, null, msgs);
			if (newBackgroundColor != null)
				msgs = ((InternalEObject)newBackgroundColor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XvegFeatureModelPackage.STYLE_INFO__BACKGROUND_COLOR, null, msgs);
			msgs = basicSetBackgroundColor(newBackgroundColor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XvegFeatureModelPackage.STYLE_INFO__BACKGROUND_COLOR, newBackgroundColor, newBackgroundColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color getTextColor() {
		return textColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTextColor(Color newTextColor, NotificationChain msgs) {
		Color oldTextColor = textColor;
		textColor = newTextColor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XvegFeatureModelPackage.STYLE_INFO__TEXT_COLOR, oldTextColor, newTextColor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextColor(Color newTextColor) {
		if (newTextColor != textColor) {
			NotificationChain msgs = null;
			if (textColor != null)
				msgs = ((InternalEObject)textColor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XvegFeatureModelPackage.STYLE_INFO__TEXT_COLOR, null, msgs);
			if (newTextColor != null)
				msgs = ((InternalEObject)newTextColor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XvegFeatureModelPackage.STYLE_INFO__TEXT_COLOR, null, msgs);
			msgs = basicSetTextColor(newTextColor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XvegFeatureModelPackage.STYLE_INFO__TEXT_COLOR, newTextColor, newTextColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFontSize() {
		return fontSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontSize(int newFontSize) {
		int oldFontSize = fontSize;
		fontSize = newFontSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XvegFeatureModelPackage.STYLE_INFO__FONT_SIZE, oldFontSize, fontSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBoldFont() {
		return boldFont;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoldFont(boolean newBoldFont) {
		boolean oldBoldFont = boldFont;
		boldFont = newBoldFont;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XvegFeatureModelPackage.STYLE_INFO__BOLD_FONT, oldBoldFont, boldFont));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XvegFeatureModelPackage.STYLE_INFO__LINE_COLOR:
				return basicSetLineColor(null, msgs);
			case XvegFeatureModelPackage.STYLE_INFO__BACKGROUND_COLOR:
				return basicSetBackgroundColor(null, msgs);
			case XvegFeatureModelPackage.STYLE_INFO__TEXT_COLOR:
				return basicSetTextColor(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XvegFeatureModelPackage.STYLE_INFO__LINE_COLOR:
				return getLineColor();
			case XvegFeatureModelPackage.STYLE_INFO__BACKGROUND_COLOR:
				return getBackgroundColor();
			case XvegFeatureModelPackage.STYLE_INFO__TEXT_COLOR:
				return getTextColor();
			case XvegFeatureModelPackage.STYLE_INFO__FONT_SIZE:
				return getFontSize();
			case XvegFeatureModelPackage.STYLE_INFO__BOLD_FONT:
				return isBoldFont();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case XvegFeatureModelPackage.STYLE_INFO__LINE_COLOR:
				setLineColor((Color)newValue);
				return;
			case XvegFeatureModelPackage.STYLE_INFO__BACKGROUND_COLOR:
				setBackgroundColor((Color)newValue);
				return;
			case XvegFeatureModelPackage.STYLE_INFO__TEXT_COLOR:
				setTextColor((Color)newValue);
				return;
			case XvegFeatureModelPackage.STYLE_INFO__FONT_SIZE:
				setFontSize((Integer)newValue);
				return;
			case XvegFeatureModelPackage.STYLE_INFO__BOLD_FONT:
				setBoldFont((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case XvegFeatureModelPackage.STYLE_INFO__LINE_COLOR:
				setLineColor((Color)null);
				return;
			case XvegFeatureModelPackage.STYLE_INFO__BACKGROUND_COLOR:
				setBackgroundColor((Color)null);
				return;
			case XvegFeatureModelPackage.STYLE_INFO__TEXT_COLOR:
				setTextColor((Color)null);
				return;
			case XvegFeatureModelPackage.STYLE_INFO__FONT_SIZE:
				setFontSize(FONT_SIZE_EDEFAULT);
				return;
			case XvegFeatureModelPackage.STYLE_INFO__BOLD_FONT:
				setBoldFont(BOLD_FONT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case XvegFeatureModelPackage.STYLE_INFO__LINE_COLOR:
				return lineColor != null;
			case XvegFeatureModelPackage.STYLE_INFO__BACKGROUND_COLOR:
				return backgroundColor != null;
			case XvegFeatureModelPackage.STYLE_INFO__TEXT_COLOR:
				return textColor != null;
			case XvegFeatureModelPackage.STYLE_INFO__FONT_SIZE:
				return fontSize != FONT_SIZE_EDEFAULT;
			case XvegFeatureModelPackage.STYLE_INFO__BOLD_FONT:
				return boldFont != BOLD_FONT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (fontSize: ");
		result.append(fontSize);
		result.append(", boldFont: ");
		result.append(boldFont);
		result.append(')');
		return result.toString();
	}

} //StyleInfoImpl
