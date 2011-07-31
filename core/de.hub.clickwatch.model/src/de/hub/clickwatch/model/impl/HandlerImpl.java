/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.model.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import de.hub.clickwatch.model.ClickWatchModelPackage;
import de.hub.clickwatch.model.Element;
import de.hub.clickwatch.model.Handler;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Handler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.clickwatch.model.impl.HandlerImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.hub.clickwatch.model.impl.HandlerImpl#isCanRead <em>Can Read</em>}</li>
 *   <li>{@link de.hub.clickwatch.model.impl.HandlerImpl#isCanWrite <em>Can Write</em>}</li>
 *   <li>{@link de.hub.clickwatch.model.impl.HandlerImpl#isChanged <em>Changed</em>}</li>
 *   <li>{@link de.hub.clickwatch.model.impl.HandlerImpl#isWatch <em>Watch</em>}</li>
 *   <li>{@link de.hub.clickwatch.model.impl.HandlerImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link de.hub.clickwatch.model.impl.HandlerImpl#getAny <em>Any</em>}</li>
 *   <li>{@link de.hub.clickwatch.model.impl.HandlerImpl#getValue <em>Value</em>}</li>
 *   <li>{@link de.hub.clickwatch.model.impl.HandlerImpl#getTimestamp <em>Timestamp</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HandlerImpl extends EObjectImpl implements Handler {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;
	/**
	 * The default value of the '{@link #isCanRead() <em>Can Read</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanRead()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CAN_READ_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isCanRead() <em>Can Read</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanRead()
	 * @generated
	 * @ordered
	 */
	protected boolean canRead = CAN_READ_EDEFAULT;
	/**
	 * The default value of the '{@link #isCanWrite() <em>Can Write</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanWrite()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CAN_WRITE_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isCanWrite() <em>Can Write</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanWrite()
	 * @generated
	 * @ordered
	 */
	protected boolean canWrite = CAN_WRITE_EDEFAULT;
	/**
	 * The default value of the '{@link #isChanged() <em>Changed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isChanged()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CHANGED_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isChanged() <em>Changed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isChanged()
	 * @generated
	 * @ordered
	 */
	protected boolean changed = CHANGED_EDEFAULT;
	/**
	 * The default value of the '{@link #isWatch() <em>Watch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWatch()
	 * @generated
	 * @ordered
	 */
	protected static final boolean WATCH_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isWatch() <em>Watch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWatch()
	 * @generated
	 * @ordered
	 */
	protected boolean watch = WATCH_EDEFAULT;
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;
	/**
	 * The cached value of the '{@link #getAny() <em>Any</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAny()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap any;
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = "";
	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;
	/**
	 * The default value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected static final long TIMESTAMP_EDEFAULT = 0L;
	/**
	 * The cached value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected long timestamp = TIMESTAMP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HandlerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClickWatchModelPackage.Literals.HANDLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClickWatchModelPackage.HANDLER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCanRead() {
		return canRead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCanRead(boolean newCanRead) {
		boolean oldCanRead = canRead;
		canRead = newCanRead;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClickWatchModelPackage.HANDLER__CAN_READ, oldCanRead, canRead));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCanWrite() {
		return canWrite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCanWrite(boolean newCanWrite) {
		boolean oldCanWrite = canWrite;
		canWrite = newCanWrite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClickWatchModelPackage.HANDLER__CAN_WRITE, oldCanWrite, canWrite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isChanged() {
		return changed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChanged(boolean newChanged) {
		boolean oldChanged = changed;
		changed = newChanged;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClickWatchModelPackage.HANDLER__CHANGED, oldChanged, changed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isWatch() {
		return watch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWatch(boolean newWatch) {
		boolean oldWatch = watch;
		watch = newWatch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClickWatchModelPackage.HANDLER__WATCH, oldWatch, watch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, ClickWatchModelPackage.HANDLER__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, ClickWatchModelPackage.HANDLER__ANY);
		}
		return any;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClickWatchModelPackage.HANDLER__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getTimestamp() {
		return timestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimestamp(long newTimestamp) {
		long oldTimestamp = timestamp;
		timestamp = newTimestamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClickWatchModelPackage.HANDLER__TIMESTAMP, oldTimestamp, timestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getQualifiedName() {
		return (eContainer() instanceof Element) ? ((Element)eContainer()).getQualifiedName() + "/" + getName() : getName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ClickWatchModelPackage.HANDLER__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case ClickWatchModelPackage.HANDLER__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
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
			case ClickWatchModelPackage.HANDLER__NAME:
				return getName();
			case ClickWatchModelPackage.HANDLER__CAN_READ:
				return isCanRead();
			case ClickWatchModelPackage.HANDLER__CAN_WRITE:
				return isCanWrite();
			case ClickWatchModelPackage.HANDLER__CHANGED:
				return isChanged();
			case ClickWatchModelPackage.HANDLER__WATCH:
				return isWatch();
			case ClickWatchModelPackage.HANDLER__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case ClickWatchModelPackage.HANDLER__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case ClickWatchModelPackage.HANDLER__VALUE:
				return getValue();
			case ClickWatchModelPackage.HANDLER__TIMESTAMP:
				return getTimestamp();
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
			case ClickWatchModelPackage.HANDLER__NAME:
				setName((String)newValue);
				return;
			case ClickWatchModelPackage.HANDLER__CAN_READ:
				setCanRead((Boolean)newValue);
				return;
			case ClickWatchModelPackage.HANDLER__CAN_WRITE:
				setCanWrite((Boolean)newValue);
				return;
			case ClickWatchModelPackage.HANDLER__CHANGED:
				setChanged((Boolean)newValue);
				return;
			case ClickWatchModelPackage.HANDLER__WATCH:
				setWatch((Boolean)newValue);
				return;
			case ClickWatchModelPackage.HANDLER__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case ClickWatchModelPackage.HANDLER__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case ClickWatchModelPackage.HANDLER__VALUE:
				setValue((String)newValue);
				return;
			case ClickWatchModelPackage.HANDLER__TIMESTAMP:
				setTimestamp((Long)newValue);
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
			case ClickWatchModelPackage.HANDLER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ClickWatchModelPackage.HANDLER__CAN_READ:
				setCanRead(CAN_READ_EDEFAULT);
				return;
			case ClickWatchModelPackage.HANDLER__CAN_WRITE:
				setCanWrite(CAN_WRITE_EDEFAULT);
				return;
			case ClickWatchModelPackage.HANDLER__CHANGED:
				setChanged(CHANGED_EDEFAULT);
				return;
			case ClickWatchModelPackage.HANDLER__WATCH:
				setWatch(WATCH_EDEFAULT);
				return;
			case ClickWatchModelPackage.HANDLER__MIXED:
				getMixed().clear();
				return;
			case ClickWatchModelPackage.HANDLER__ANY:
				getAny().clear();
				return;
			case ClickWatchModelPackage.HANDLER__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case ClickWatchModelPackage.HANDLER__TIMESTAMP:
				setTimestamp(TIMESTAMP_EDEFAULT);
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
			case ClickWatchModelPackage.HANDLER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ClickWatchModelPackage.HANDLER__CAN_READ:
				return canRead != CAN_READ_EDEFAULT;
			case ClickWatchModelPackage.HANDLER__CAN_WRITE:
				return canWrite != CAN_WRITE_EDEFAULT;
			case ClickWatchModelPackage.HANDLER__CHANGED:
				return changed != CHANGED_EDEFAULT;
			case ClickWatchModelPackage.HANDLER__WATCH:
				return watch != WATCH_EDEFAULT;
			case ClickWatchModelPackage.HANDLER__MIXED:
				return mixed != null && !mixed.isEmpty();
			case ClickWatchModelPackage.HANDLER__ANY:
				return any != null && !any.isEmpty();
			case ClickWatchModelPackage.HANDLER__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case ClickWatchModelPackage.HANDLER__TIMESTAMP:
				return timestamp != TIMESTAMP_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String toString() {
		return getQualifiedName();
//		if (eIsProxy()) return super.toString();
//
//		StringBuffer result = new StringBuffer(super.toString());
//		result.append(" (name: ");
//		result.append(name);
//		result.append(", canRead: ");
//		result.append(canRead);
//		result.append(", canWrite: ");
//		result.append(canWrite);
//		result.append(", changed: ");
//		result.append(changed);
//		result.append(", watch: ");
//		result.append(watch);
//		result.append(", mixed: ");
//		result.append(mixed);
//		result.append(", any: ");
//		result.append(any);
//		result.append(", value: ");
//		result.append(value);
//		result.append(", timestamp: ");
//		result.append(timestamp);
//		result.append(')');
//		return result.toString();
	}	

} //HandlerImpl
