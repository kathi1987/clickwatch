/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.xveg.xvegfeaturemodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import de.hub.xveg.xvegfeaturemodel.Color;
import de.hub.xveg.xvegfeaturemodel.XvegFeatureModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Color</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.xveg.xvegfeaturemodel.impl.ColorImpl#getR <em>R</em>}</li>
 *   <li>{@link de.hub.xveg.xvegfeaturemodel.impl.ColorImpl#getG <em>G</em>}</li>
 *   <li>{@link de.hub.xveg.xvegfeaturemodel.impl.ColorImpl#getB <em>B</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ColorImpl extends EObjectImpl implements Color {
	/**
	 * The default value of the '{@link #getR() <em>R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR()
	 * @generated
	 * @ordered
	 */
	protected static final int R_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getR() <em>R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR()
	 * @generated
	 * @ordered
	 */
	protected int r = R_EDEFAULT;

	/**
	 * The default value of the '{@link #getG() <em>G</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getG()
	 * @generated
	 * @ordered
	 */
	protected static final int G_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getG() <em>G</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getG()
	 * @generated
	 * @ordered
	 */
	protected int g = G_EDEFAULT;

	/**
	 * The default value of the '{@link #getB() <em>B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getB()
	 * @generated
	 * @ordered
	 */
	protected static final int B_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getB() <em>B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getB()
	 * @generated
	 * @ordered
	 */
	protected int b = B_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XvegFeatureModelPackage.Literals.COLOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getR() {
		return r;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setR(int newR) {
		int oldR = r;
		r = newR;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XvegFeatureModelPackage.COLOR__R, oldR, r));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getG() {
		return g;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setG(int newG) {
		int oldG = g;
		g = newG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XvegFeatureModelPackage.COLOR__G, oldG, g));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getB() {
		return b;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setB(int newB) {
		int oldB = b;
		b = newB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XvegFeatureModelPackage.COLOR__B, oldB, b));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XvegFeatureModelPackage.COLOR__R:
				return getR();
			case XvegFeatureModelPackage.COLOR__G:
				return getG();
			case XvegFeatureModelPackage.COLOR__B:
				return getB();
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
			case XvegFeatureModelPackage.COLOR__R:
				setR((Integer)newValue);
				return;
			case XvegFeatureModelPackage.COLOR__G:
				setG((Integer)newValue);
				return;
			case XvegFeatureModelPackage.COLOR__B:
				setB((Integer)newValue);
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
			case XvegFeatureModelPackage.COLOR__R:
				setR(R_EDEFAULT);
				return;
			case XvegFeatureModelPackage.COLOR__G:
				setG(G_EDEFAULT);
				return;
			case XvegFeatureModelPackage.COLOR__B:
				setB(B_EDEFAULT);
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
			case XvegFeatureModelPackage.COLOR__R:
				return r != R_EDEFAULT;
			case XvegFeatureModelPackage.COLOR__G:
				return g != G_EDEFAULT;
			case XvegFeatureModelPackage.COLOR__B:
				return b != B_EDEFAULT;
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
		result.append(" (r: ");
		result.append(r);
		result.append(", g: ");
		result.append(g);
		result.append(", b: ");
		result.append(b);
		result.append(')');
		return result.toString();
	}

} //ColorImpl
