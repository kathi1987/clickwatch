/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.impl;

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

import de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.Channel_info;
import de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.Channel_infos;
import de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.Latestchannelinfos;
import de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.Seismo_latestchannelinfosPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Channel infos</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.impl.Channel_infosImpl#getEContainer_channel_infos <em>EContainer channel infos</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.impl.Channel_infosImpl#getText <em>Text</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.impl.Channel_infosImpl#getChannel_info <em>Channel info</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Channel_infosImpl extends EObjectImpl implements Channel_infos {
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
	 * The cached value of the '{@link #getChannel_info() <em>Channel info</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannel_info()
	 * @generated
	 * @ordered
	 */
	protected EList<Channel_info> channel_info;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Channel_infosImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Seismo_latestchannelinfosPackage.Literals.CHANNEL_INFOS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Latestchannelinfos getEContainer_channel_infos() {
		if (eContainerFeatureID() != Seismo_latestchannelinfosPackage.CHANNEL_INFOS__ECONTAINER_CHANNEL_INFOS) return null;
		return (Latestchannelinfos)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEContainer_channel_infos(Latestchannelinfos newEContainer_channel_infos, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEContainer_channel_infos, Seismo_latestchannelinfosPackage.CHANNEL_INFOS__ECONTAINER_CHANNEL_INFOS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEContainer_channel_infos(Latestchannelinfos newEContainer_channel_infos) {
		if (newEContainer_channel_infos != eInternalContainer() || (eContainerFeatureID() != Seismo_latestchannelinfosPackage.CHANNEL_INFOS__ECONTAINER_CHANNEL_INFOS && newEContainer_channel_infos != null)) {
			if (EcoreUtil.isAncestor(this, newEContainer_channel_infos))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEContainer_channel_infos != null)
				msgs = ((InternalEObject)newEContainer_channel_infos).eInverseAdd(this, Seismo_latestchannelinfosPackage.LATESTCHANNELINFOS__CHANNEL_INFOS, Latestchannelinfos.class, msgs);
			msgs = basicSetEContainer_channel_infos(newEContainer_channel_infos, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Seismo_latestchannelinfosPackage.CHANNEL_INFOS__ECONTAINER_CHANNEL_INFOS, newEContainer_channel_infos, newEContainer_channel_infos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getText() {
		if (text == null) {
			text = new EDataTypeEList<String>(String.class, this, Seismo_latestchannelinfosPackage.CHANNEL_INFOS__TEXT);
		}
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Channel_info> getChannel_info() {
		if (channel_info == null) {
			channel_info = new EObjectContainmentWithInverseEList<Channel_info>(Channel_info.class, this, Seismo_latestchannelinfosPackage.CHANNEL_INFOS__CHANNEL_INFO, Seismo_latestchannelinfosPackage.CHANNEL_INFO__ECONTAINER_CHANNEL_INFO);
		}
		return channel_info;
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
			case Seismo_latestchannelinfosPackage.CHANNEL_INFOS__ECONTAINER_CHANNEL_INFOS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEContainer_channel_infos((Latestchannelinfos)otherEnd, msgs);
			case Seismo_latestchannelinfosPackage.CHANNEL_INFOS__CHANNEL_INFO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChannel_info()).basicAdd(otherEnd, msgs);
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
			case Seismo_latestchannelinfosPackage.CHANNEL_INFOS__ECONTAINER_CHANNEL_INFOS:
				return basicSetEContainer_channel_infos(null, msgs);
			case Seismo_latestchannelinfosPackage.CHANNEL_INFOS__CHANNEL_INFO:
				return ((InternalEList<?>)getChannel_info()).basicRemove(otherEnd, msgs);
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
			case Seismo_latestchannelinfosPackage.CHANNEL_INFOS__ECONTAINER_CHANNEL_INFOS:
				return eInternalContainer().eInverseRemove(this, Seismo_latestchannelinfosPackage.LATESTCHANNELINFOS__CHANNEL_INFOS, Latestchannelinfos.class, msgs);
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
			case Seismo_latestchannelinfosPackage.CHANNEL_INFOS__ECONTAINER_CHANNEL_INFOS:
				return getEContainer_channel_infos();
			case Seismo_latestchannelinfosPackage.CHANNEL_INFOS__TEXT:
				return getText();
			case Seismo_latestchannelinfosPackage.CHANNEL_INFOS__CHANNEL_INFO:
				return getChannel_info();
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
			case Seismo_latestchannelinfosPackage.CHANNEL_INFOS__ECONTAINER_CHANNEL_INFOS:
				setEContainer_channel_infos((Latestchannelinfos)newValue);
				return;
			case Seismo_latestchannelinfosPackage.CHANNEL_INFOS__TEXT:
				getText().clear();
				getText().addAll((Collection<? extends String>)newValue);
				return;
			case Seismo_latestchannelinfosPackage.CHANNEL_INFOS__CHANNEL_INFO:
				getChannel_info().clear();
				getChannel_info().addAll((Collection<? extends Channel_info>)newValue);
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
			case Seismo_latestchannelinfosPackage.CHANNEL_INFOS__ECONTAINER_CHANNEL_INFOS:
				setEContainer_channel_infos((Latestchannelinfos)null);
				return;
			case Seismo_latestchannelinfosPackage.CHANNEL_INFOS__TEXT:
				getText().clear();
				return;
			case Seismo_latestchannelinfosPackage.CHANNEL_INFOS__CHANNEL_INFO:
				getChannel_info().clear();
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
			case Seismo_latestchannelinfosPackage.CHANNEL_INFOS__ECONTAINER_CHANNEL_INFOS:
				return getEContainer_channel_infos() != null;
			case Seismo_latestchannelinfosPackage.CHANNEL_INFOS__TEXT:
				return text != null && !text.isEmpty();
			case Seismo_latestchannelinfosPackage.CHANNEL_INFOS__CHANNEL_INFO:
				return channel_info != null && !channel_info.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //Channel_infosImpl
