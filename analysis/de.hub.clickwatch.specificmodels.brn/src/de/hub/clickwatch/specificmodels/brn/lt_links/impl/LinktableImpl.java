/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.lt_links.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import de.hub.clickwatch.specificmodels.brn.lt_links.Link;
import de.hub.clickwatch.specificmodels.brn.lt_links.Links;
import de.hub.clickwatch.specificmodels.brn.lt_links.Linktable;
import de.hub.clickwatch.specificmodels.brn.lt_links.Lt_linksPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Linktable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.lt_links.impl.LinktableImpl#getEContainer_linktable <em>EContainer linktable</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.lt_links.impl.LinktableImpl#getText <em>Text</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.lt_links.impl.LinktableImpl#getLink <em>Link</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.lt_links.impl.LinktableImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinktableImpl extends EObjectImpl implements Linktable {
    /**
     * The cached value of the '{@link #getText() <em>Text</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getText()
     * @generated
     * @ordered
     */
    protected EList<String> text;

    /**
     * The cached value of the '{@link #getLink() <em>Link</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLink()
     * @generated
     * @ordered
     */
    protected EList<Link> link;

    /**
     * The default value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
    protected static final String ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
    protected String id = ID_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected LinktableImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Lt_linksPackage.Literals.LINKTABLE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Links getEContainer_linktable() {
        if (eContainerFeatureID() != Lt_linksPackage.LINKTABLE__ECONTAINER_LINKTABLE) return null;
        return (Links)eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEContainer_linktable(Links newEContainer_linktable, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newEContainer_linktable, Lt_linksPackage.LINKTABLE__ECONTAINER_LINKTABLE, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEContainer_linktable(Links newEContainer_linktable) {
        if (newEContainer_linktable != eInternalContainer() || (eContainerFeatureID() != Lt_linksPackage.LINKTABLE__ECONTAINER_LINKTABLE && newEContainer_linktable != null)) {
            if (EcoreUtil.isAncestor(this, newEContainer_linktable))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newEContainer_linktable != null)
                msgs = ((InternalEObject)newEContainer_linktable).eInverseAdd(this, Lt_linksPackage.LINKS__LINKTABLE, Links.class, msgs);
            msgs = basicSetEContainer_linktable(newEContainer_linktable, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Lt_linksPackage.LINKTABLE__ECONTAINER_LINKTABLE, newEContainer_linktable, newEContainer_linktable));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<String> getText() {
        if (text == null) {
            text = new EDataTypeEList<String>(String.class, this, Lt_linksPackage.LINKTABLE__TEXT);
        }
        return text;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Link> getLink() {
        if (link == null) {
            link = new EObjectContainmentWithInverseEList<Link>(Link.class, this, Lt_linksPackage.LINKTABLE__LINK, Lt_linksPackage.LINK__ECONTAINER_LINK);
        }
        return link;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getId() {
        return id;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setId(String newId) {
        String oldId = id;
        id = newId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Lt_linksPackage.LINKTABLE__ID, oldId, id));
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
            case Lt_linksPackage.LINKTABLE__ECONTAINER_LINKTABLE:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetEContainer_linktable((Links)otherEnd, msgs);
            case Lt_linksPackage.LINKTABLE__LINK:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getLink()).basicAdd(otherEnd, msgs);
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
            case Lt_linksPackage.LINKTABLE__ECONTAINER_LINKTABLE:
                return basicSetEContainer_linktable(null, msgs);
            case Lt_linksPackage.LINKTABLE__LINK:
                return ((InternalEList<?>)getLink()).basicRemove(otherEnd, msgs);
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
            case Lt_linksPackage.LINKTABLE__ECONTAINER_LINKTABLE:
                return eInternalContainer().eInverseRemove(this, Lt_linksPackage.LINKS__LINKTABLE, Links.class, msgs);
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
            case Lt_linksPackage.LINKTABLE__ECONTAINER_LINKTABLE:
                return getEContainer_linktable();
            case Lt_linksPackage.LINKTABLE__TEXT:
                return getText();
            case Lt_linksPackage.LINKTABLE__LINK:
                return getLink();
            case Lt_linksPackage.LINKTABLE__ID:
                return getId();
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
            case Lt_linksPackage.LINKTABLE__ECONTAINER_LINKTABLE:
                setEContainer_linktable((Links)newValue);
                return;
            case Lt_linksPackage.LINKTABLE__TEXT:
                getText().clear();
                getText().addAll((Collection<? extends String>)newValue);
                return;
            case Lt_linksPackage.LINKTABLE__LINK:
                getLink().clear();
                getLink().addAll((Collection<? extends Link>)newValue);
                return;
            case Lt_linksPackage.LINKTABLE__ID:
                setId((String)newValue);
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
            case Lt_linksPackage.LINKTABLE__ECONTAINER_LINKTABLE:
                setEContainer_linktable((Links)null);
                return;
            case Lt_linksPackage.LINKTABLE__TEXT:
                getText().clear();
                return;
            case Lt_linksPackage.LINKTABLE__LINK:
                getLink().clear();
                return;
            case Lt_linksPackage.LINKTABLE__ID:
                setId(ID_EDEFAULT);
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
            case Lt_linksPackage.LINKTABLE__ECONTAINER_LINKTABLE:
                return getEContainer_linktable() != null;
            case Lt_linksPackage.LINKTABLE__TEXT:
                return text != null && !text.isEmpty();
            case Lt_linksPackage.LINKTABLE__LINK:
                return link != null && !link.isEmpty();
            case Lt_linksPackage.LINKTABLE__ID:
                return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
        result.append(" (text: ");
        result.append(text);
        result.append(", id: ");
        result.append(id);
        result.append(')');
        return result.toString();
    }

} //LinktableImpl
