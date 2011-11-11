/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.lt_links.impl;

import de.hub.clickwatch.model.impl.HandlerImpl;

import de.hub.clickwatch.specificmodels.brn.lt_links.Links;
import de.hub.clickwatch.specificmodels.brn.lt_links.Linktable;
import de.hub.clickwatch.specificmodels.brn.lt_links.Lt_linksPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Links</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.lt_links.impl.LinksImpl#getLinktable <em>Linktable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinksImpl extends HandlerImpl implements Links {
	/**
     * The cached value of the '{@link #getLinktable() <em>Linktable</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getLinktable()
     * @generated
     * @ordered
     */
	protected Linktable linktable;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected LinksImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return Lt_linksPackage.Literals.LINKS;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Linktable getLinktable() {
        return linktable;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetLinktable(Linktable newLinktable, NotificationChain msgs) {
        Linktable oldLinktable = linktable;
        linktable = newLinktable;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Lt_linksPackage.LINKS__LINKTABLE, oldLinktable, newLinktable);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setLinktable(Linktable newLinktable) {
        if (newLinktable != linktable) {
            NotificationChain msgs = null;
            if (linktable != null)
                msgs = ((InternalEObject)linktable).eInverseRemove(this, Lt_linksPackage.LINKTABLE__ECONTAINER_LINKTABLE, Linktable.class, msgs);
            if (newLinktable != null)
                msgs = ((InternalEObject)newLinktable).eInverseAdd(this, Lt_linksPackage.LINKTABLE__ECONTAINER_LINKTABLE, Linktable.class, msgs);
            msgs = basicSetLinktable(newLinktable, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Lt_linksPackage.LINKS__LINKTABLE, newLinktable, newLinktable));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case Lt_linksPackage.LINKS__LINKTABLE:
                if (linktable != null)
                    msgs = ((InternalEObject)linktable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Lt_linksPackage.LINKS__LINKTABLE, null, msgs);
                return basicSetLinktable((Linktable)otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case Lt_linksPackage.LINKS__LINKTABLE:
                return basicSetLinktable(null, msgs);
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
            case Lt_linksPackage.LINKS__LINKTABLE:
                return getLinktable();
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
            case Lt_linksPackage.LINKS__LINKTABLE:
                setLinktable((Linktable)newValue);
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
            case Lt_linksPackage.LINKS__LINKTABLE:
                setLinktable((Linktable)null);
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
            case Lt_linksPackage.LINKS__LINKTABLE:
                return linktable != null;
        }
        return super.eIsSet(featureID);
    }

} //LinksImpl
