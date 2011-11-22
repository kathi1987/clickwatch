/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.impl;

import de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.C;
import de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.Localchannelinfo;
import de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.Seismo_localchannelinfoPackage;
import de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.V;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>C</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.impl.CImpl#getEContainer_c <em>EContainer c</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.impl.CImpl#getV <em>V</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CImpl extends EObjectImpl implements C {
    /**
     * The cached value of the '{@link #getV() <em>V</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getV()
     * @generated
     * @ordered
     */
    protected EList<V> v;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Seismo_localchannelinfoPackage.Literals.C;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Localchannelinfo getEContainer_c() {
        if (eContainerFeatureID() != Seismo_localchannelinfoPackage.C__ECONTAINER_C) return null;
        return (Localchannelinfo)eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEContainer_c(Localchannelinfo newEContainer_c, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newEContainer_c, Seismo_localchannelinfoPackage.C__ECONTAINER_C, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEContainer_c(Localchannelinfo newEContainer_c) {
        if (newEContainer_c != eInternalContainer() || (eContainerFeatureID() != Seismo_localchannelinfoPackage.C__ECONTAINER_C && newEContainer_c != null)) {
            if (EcoreUtil.isAncestor(this, newEContainer_c))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newEContainer_c != null)
                msgs = ((InternalEObject)newEContainer_c).eInverseAdd(this, Seismo_localchannelinfoPackage.LOCALCHANNELINFO__C, Localchannelinfo.class, msgs);
            msgs = basicSetEContainer_c(newEContainer_c, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Seismo_localchannelinfoPackage.C__ECONTAINER_C, newEContainer_c, newEContainer_c));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<V> getV() {
        if (v == null) {
            v = new EObjectContainmentWithInverseEList<V>(V.class, this, Seismo_localchannelinfoPackage.C__V, Seismo_localchannelinfoPackage.V__ECONTAINER_V);
        }
        return v;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case Seismo_localchannelinfoPackage.C__ECONTAINER_C:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetEContainer_c((Localchannelinfo)otherEnd, msgs);
            case Seismo_localchannelinfoPackage.C__V:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getV()).basicAdd(otherEnd, msgs);
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
            case Seismo_localchannelinfoPackage.C__ECONTAINER_C:
                return basicSetEContainer_c(null, msgs);
            case Seismo_localchannelinfoPackage.C__V:
                return ((InternalEList<?>)getV()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
        switch (eContainerFeatureID()) {
            case Seismo_localchannelinfoPackage.C__ECONTAINER_C:
                return eInternalContainer().eInverseRemove(this, Seismo_localchannelinfoPackage.LOCALCHANNELINFO__C, Localchannelinfo.class, msgs);
        }
        return super.eBasicRemoveFromContainerFeature(msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case Seismo_localchannelinfoPackage.C__ECONTAINER_C:
                return getEContainer_c();
            case Seismo_localchannelinfoPackage.C__V:
                return getV();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case Seismo_localchannelinfoPackage.C__ECONTAINER_C:
                setEContainer_c((Localchannelinfo)newValue);
                return;
            case Seismo_localchannelinfoPackage.C__V:
                getV().clear();
                getV().addAll((Collection<? extends V>)newValue);
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
            case Seismo_localchannelinfoPackage.C__ECONTAINER_C:
                setEContainer_c((Localchannelinfo)null);
                return;
            case Seismo_localchannelinfoPackage.C__V:
                getV().clear();
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
            case Seismo_localchannelinfoPackage.C__ECONTAINER_C:
                return getEContainer_c() != null;
            case Seismo_localchannelinfoPackage.C__V:
                return v != null && !v.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //CImpl
