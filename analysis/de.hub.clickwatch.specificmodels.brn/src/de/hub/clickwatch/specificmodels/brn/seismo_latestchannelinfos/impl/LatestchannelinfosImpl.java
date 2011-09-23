/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.hub.clickwatch.model.impl.HandlerImpl;
import de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.Channel_infos;
import de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.Latestchannelinfos;
import de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.Seismo_latestchannelinfosPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Latestchannelinfos</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.impl.LatestchannelinfosImpl#getChannel_infos <em>Channel infos</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LatestchannelinfosImpl extends HandlerImpl implements Latestchannelinfos {
	/**
	 * The cached value of the '{@link #getChannel_infos() <em>Channel infos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannel_infos()
	 * @generated
	 * @ordered
	 */
	protected Channel_infos channel_infos;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LatestchannelinfosImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Seismo_latestchannelinfosPackage.Literals.LATESTCHANNELINFOS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Channel_infos getChannel_infos() {
		return channel_infos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChannel_infos(Channel_infos newChannel_infos, NotificationChain msgs) {
		Channel_infos oldChannel_infos = channel_infos;
		channel_infos = newChannel_infos;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Seismo_latestchannelinfosPackage.LATESTCHANNELINFOS__CHANNEL_INFOS, oldChannel_infos, newChannel_infos);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChannel_infos(Channel_infos newChannel_infos) {
		if (newChannel_infos != channel_infos) {
			NotificationChain msgs = null;
			if (channel_infos != null)
				msgs = ((InternalEObject)channel_infos).eInverseRemove(this, Seismo_latestchannelinfosPackage.CHANNEL_INFOS__ECONTAINER_CHANNEL_INFOS, Channel_infos.class, msgs);
			if (newChannel_infos != null)
				msgs = ((InternalEObject)newChannel_infos).eInverseAdd(this, Seismo_latestchannelinfosPackage.CHANNEL_INFOS__ECONTAINER_CHANNEL_INFOS, Channel_infos.class, msgs);
			msgs = basicSetChannel_infos(newChannel_infos, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Seismo_latestchannelinfosPackage.LATESTCHANNELINFOS__CHANNEL_INFOS, newChannel_infos, newChannel_infos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Seismo_latestchannelinfosPackage.LATESTCHANNELINFOS__CHANNEL_INFOS:
				if (channel_infos != null)
					msgs = ((InternalEObject)channel_infos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Seismo_latestchannelinfosPackage.LATESTCHANNELINFOS__CHANNEL_INFOS, null, msgs);
				return basicSetChannel_infos((Channel_infos)otherEnd, msgs);
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
			case Seismo_latestchannelinfosPackage.LATESTCHANNELINFOS__CHANNEL_INFOS:
				return basicSetChannel_infos(null, msgs);
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
			case Seismo_latestchannelinfosPackage.LATESTCHANNELINFOS__CHANNEL_INFOS:
				return getChannel_infos();
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
			case Seismo_latestchannelinfosPackage.LATESTCHANNELINFOS__CHANNEL_INFOS:
				setChannel_infos((Channel_infos)newValue);
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
			case Seismo_latestchannelinfosPackage.LATESTCHANNELINFOS__CHANNEL_INFOS:
				setChannel_infos((Channel_infos)null);
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
			case Seismo_latestchannelinfosPackage.LATESTCHANNELINFOS__CHANNEL_INFOS:
				return channel_infos != null;
		}
		return super.eIsSet(featureID);
	}

} //LatestchannelinfosImpl
