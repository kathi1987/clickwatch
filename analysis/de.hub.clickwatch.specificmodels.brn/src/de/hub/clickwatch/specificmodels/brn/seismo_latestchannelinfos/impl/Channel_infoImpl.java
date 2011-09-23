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
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.Channel_info;
import de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.Channel_infos;
import de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.Seismo_latestchannelinfosPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Channel info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.impl.Channel_infoImpl#getEContainer_channel_info <em>EContainer channel info</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.impl.Channel_infoImpl#getTime <em>Time</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.impl.Channel_infoImpl#getChannel_0 <em>Channel 0</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.impl.Channel_infoImpl#getChannel_1 <em>Channel 1</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.impl.Channel_infoImpl#getChannel_2 <em>Channel 2</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.impl.Channel_infoImpl#getChannel_3 <em>Channel 3</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Channel_infoImpl extends EObjectImpl implements Channel_info {
	/**
	 * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected static final long TIME_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected long time = TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getChannel_0() <em>Channel 0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannel_0()
	 * @generated
	 * @ordered
	 */
	protected static final int CHANNEL_0_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getChannel_0() <em>Channel 0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannel_0()
	 * @generated
	 * @ordered
	 */
	protected int channel_0 = CHANNEL_0_EDEFAULT;

	/**
	 * The default value of the '{@link #getChannel_1() <em>Channel 1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannel_1()
	 * @generated
	 * @ordered
	 */
	protected static final int CHANNEL_1_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getChannel_1() <em>Channel 1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannel_1()
	 * @generated
	 * @ordered
	 */
	protected int channel_1 = CHANNEL_1_EDEFAULT;

	/**
	 * The default value of the '{@link #getChannel_2() <em>Channel 2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannel_2()
	 * @generated
	 * @ordered
	 */
	protected static final int CHANNEL_2_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getChannel_2() <em>Channel 2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannel_2()
	 * @generated
	 * @ordered
	 */
	protected int channel_2 = CHANNEL_2_EDEFAULT;

	/**
	 * The default value of the '{@link #getChannel_3() <em>Channel 3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannel_3()
	 * @generated
	 * @ordered
	 */
	protected static final int CHANNEL_3_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getChannel_3() <em>Channel 3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannel_3()
	 * @generated
	 * @ordered
	 */
	protected int channel_3 = CHANNEL_3_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Channel_infoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Seismo_latestchannelinfosPackage.Literals.CHANNEL_INFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Channel_infos getEContainer_channel_info() {
		if (eContainerFeatureID() != Seismo_latestchannelinfosPackage.CHANNEL_INFO__ECONTAINER_CHANNEL_INFO) return null;
		return (Channel_infos)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEContainer_channel_info(Channel_infos newEContainer_channel_info, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEContainer_channel_info, Seismo_latestchannelinfosPackage.CHANNEL_INFO__ECONTAINER_CHANNEL_INFO, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEContainer_channel_info(Channel_infos newEContainer_channel_info) {
		if (newEContainer_channel_info != eInternalContainer() || (eContainerFeatureID() != Seismo_latestchannelinfosPackage.CHANNEL_INFO__ECONTAINER_CHANNEL_INFO && newEContainer_channel_info != null)) {
			if (EcoreUtil.isAncestor(this, newEContainer_channel_info))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEContainer_channel_info != null)
				msgs = ((InternalEObject)newEContainer_channel_info).eInverseAdd(this, Seismo_latestchannelinfosPackage.CHANNEL_INFOS__CHANNEL_INFO, Channel_infos.class, msgs);
			msgs = basicSetEContainer_channel_info(newEContainer_channel_info, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Seismo_latestchannelinfosPackage.CHANNEL_INFO__ECONTAINER_CHANNEL_INFO, newEContainer_channel_info, newEContainer_channel_info));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime(long newTime) {
		long oldTime = time;
		time = newTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Seismo_latestchannelinfosPackage.CHANNEL_INFO__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getChannel_0() {
		return channel_0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChannel_0(int newChannel_0) {
		int oldChannel_0 = channel_0;
		channel_0 = newChannel_0;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Seismo_latestchannelinfosPackage.CHANNEL_INFO__CHANNEL_0, oldChannel_0, channel_0));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getChannel_1() {
		return channel_1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChannel_1(int newChannel_1) {
		int oldChannel_1 = channel_1;
		channel_1 = newChannel_1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Seismo_latestchannelinfosPackage.CHANNEL_INFO__CHANNEL_1, oldChannel_1, channel_1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getChannel_2() {
		return channel_2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChannel_2(int newChannel_2) {
		int oldChannel_2 = channel_2;
		channel_2 = newChannel_2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Seismo_latestchannelinfosPackage.CHANNEL_INFO__CHANNEL_2, oldChannel_2, channel_2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getChannel_3() {
		return channel_3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChannel_3(int newChannel_3) {
		int oldChannel_3 = channel_3;
		channel_3 = newChannel_3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Seismo_latestchannelinfosPackage.CHANNEL_INFO__CHANNEL_3, oldChannel_3, channel_3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Seismo_latestchannelinfosPackage.CHANNEL_INFO__ECONTAINER_CHANNEL_INFO:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEContainer_channel_info((Channel_infos)otherEnd, msgs);
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
			case Seismo_latestchannelinfosPackage.CHANNEL_INFO__ECONTAINER_CHANNEL_INFO:
				return basicSetEContainer_channel_info(null, msgs);
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
			case Seismo_latestchannelinfosPackage.CHANNEL_INFO__ECONTAINER_CHANNEL_INFO:
				return eInternalContainer().eInverseRemove(this, Seismo_latestchannelinfosPackage.CHANNEL_INFOS__CHANNEL_INFO, Channel_infos.class, msgs);
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
			case Seismo_latestchannelinfosPackage.CHANNEL_INFO__ECONTAINER_CHANNEL_INFO:
				return getEContainer_channel_info();
			case Seismo_latestchannelinfosPackage.CHANNEL_INFO__TIME:
				return getTime();
			case Seismo_latestchannelinfosPackage.CHANNEL_INFO__CHANNEL_0:
				return getChannel_0();
			case Seismo_latestchannelinfosPackage.CHANNEL_INFO__CHANNEL_1:
				return getChannel_1();
			case Seismo_latestchannelinfosPackage.CHANNEL_INFO__CHANNEL_2:
				return getChannel_2();
			case Seismo_latestchannelinfosPackage.CHANNEL_INFO__CHANNEL_3:
				return getChannel_3();
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
			case Seismo_latestchannelinfosPackage.CHANNEL_INFO__ECONTAINER_CHANNEL_INFO:
				setEContainer_channel_info((Channel_infos)newValue);
				return;
			case Seismo_latestchannelinfosPackage.CHANNEL_INFO__TIME:
				setTime((Long)newValue);
				return;
			case Seismo_latestchannelinfosPackage.CHANNEL_INFO__CHANNEL_0:
				setChannel_0((Integer)newValue);
				return;
			case Seismo_latestchannelinfosPackage.CHANNEL_INFO__CHANNEL_1:
				setChannel_1((Integer)newValue);
				return;
			case Seismo_latestchannelinfosPackage.CHANNEL_INFO__CHANNEL_2:
				setChannel_2((Integer)newValue);
				return;
			case Seismo_latestchannelinfosPackage.CHANNEL_INFO__CHANNEL_3:
				setChannel_3((Integer)newValue);
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
			case Seismo_latestchannelinfosPackage.CHANNEL_INFO__ECONTAINER_CHANNEL_INFO:
				setEContainer_channel_info((Channel_infos)null);
				return;
			case Seismo_latestchannelinfosPackage.CHANNEL_INFO__TIME:
				setTime(TIME_EDEFAULT);
				return;
			case Seismo_latestchannelinfosPackage.CHANNEL_INFO__CHANNEL_0:
				setChannel_0(CHANNEL_0_EDEFAULT);
				return;
			case Seismo_latestchannelinfosPackage.CHANNEL_INFO__CHANNEL_1:
				setChannel_1(CHANNEL_1_EDEFAULT);
				return;
			case Seismo_latestchannelinfosPackage.CHANNEL_INFO__CHANNEL_2:
				setChannel_2(CHANNEL_2_EDEFAULT);
				return;
			case Seismo_latestchannelinfosPackage.CHANNEL_INFO__CHANNEL_3:
				setChannel_3(CHANNEL_3_EDEFAULT);
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
			case Seismo_latestchannelinfosPackage.CHANNEL_INFO__ECONTAINER_CHANNEL_INFO:
				return getEContainer_channel_info() != null;
			case Seismo_latestchannelinfosPackage.CHANNEL_INFO__TIME:
				return time != TIME_EDEFAULT;
			case Seismo_latestchannelinfosPackage.CHANNEL_INFO__CHANNEL_0:
				return channel_0 != CHANNEL_0_EDEFAULT;
			case Seismo_latestchannelinfosPackage.CHANNEL_INFO__CHANNEL_1:
				return channel_1 != CHANNEL_1_EDEFAULT;
			case Seismo_latestchannelinfosPackage.CHANNEL_INFO__CHANNEL_2:
				return channel_2 != CHANNEL_2_EDEFAULT;
			case Seismo_latestchannelinfosPackage.CHANNEL_INFO__CHANNEL_3:
				return channel_3 != CHANNEL_3_EDEFAULT;
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
		result.append(" (time: ");
		result.append(time);
		result.append(", channel_0: ");
		result.append(channel_0);
		result.append(", channel_1: ");
		result.append(channel_1);
		result.append(", channel_2: ");
		result.append(channel_2);
		result.append(", channel_3: ");
		result.append(channel_3);
		result.append(')');
		return result.toString();
	}

} //Channel_infoImpl
