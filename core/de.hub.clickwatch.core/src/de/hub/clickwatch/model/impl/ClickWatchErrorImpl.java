/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.model.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import de.hub.clickwatch.model.ClickWatchError;
import de.hub.clickwatch.model.ClickWatchModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Error</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.clickwatch.model.impl.ClickWatchErrorImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link de.hub.clickwatch.model.impl.ClickWatchErrorImpl#getException <em>Exception</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClickWatchErrorImpl extends EObjectImpl implements ClickWatchError {
    /**
     * The default value of the '{@link #getMessage() <em>Message</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMessage()
     * @generated
     * @ordered
     */
    protected static final String MESSAGE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMessage() <em>Message</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMessage()
     * @generated
     * @ordered
     */
    protected String message = MESSAGE_EDEFAULT;

    /**
     * The default value of the '{@link #getException() <em>Exception</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getException()
     * @generated
     * @ordered
     */
    protected static final Exception EXCEPTION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getException() <em>Exception</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getException()
     * @generated
     * @ordered
     */
    protected Exception exception = EXCEPTION_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ClickWatchErrorImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ClickWatchModelPackage.Literals.CLICK_WATCH_ERROR;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getMessage() {
        return message;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMessage(String newMessage) {
        String oldMessage = message;
        message = newMessage;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ClickWatchModelPackage.CLICK_WATCH_ERROR__MESSAGE, oldMessage, message));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Exception getException() {
        return exception;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setException(Exception newException) {
        Exception oldException = exception;
        exception = newException;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ClickWatchModelPackage.CLICK_WATCH_ERROR__EXCEPTION, oldException, exception));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ClickWatchModelPackage.CLICK_WATCH_ERROR__MESSAGE:
                return getMessage();
            case ClickWatchModelPackage.CLICK_WATCH_ERROR__EXCEPTION:
                return getException();
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
            case ClickWatchModelPackage.CLICK_WATCH_ERROR__MESSAGE:
                setMessage((String)newValue);
                return;
            case ClickWatchModelPackage.CLICK_WATCH_ERROR__EXCEPTION:
                setException((Exception)newValue);
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
            case ClickWatchModelPackage.CLICK_WATCH_ERROR__MESSAGE:
                setMessage(MESSAGE_EDEFAULT);
                return;
            case ClickWatchModelPackage.CLICK_WATCH_ERROR__EXCEPTION:
                setException(EXCEPTION_EDEFAULT);
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
            case ClickWatchModelPackage.CLICK_WATCH_ERROR__MESSAGE:
                return MESSAGE_EDEFAULT == null ? message != null : !MESSAGE_EDEFAULT.equals(message);
            case ClickWatchModelPackage.CLICK_WATCH_ERROR__EXCEPTION:
                return EXCEPTION_EDEFAULT == null ? exception != null : !EXCEPTION_EDEFAULT.equals(exception);
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
        result.append(" (message: ");
        result.append(message);
        result.append(", exception: ");
        result.append(exception);
        result.append(')');
        return result.toString();
    }

} //ErrorImpl
