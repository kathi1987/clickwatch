/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.datamodel.impl;

import de.hub.clickwatch.analysis.traceable.impl.TraceableImpl;
import de.hub.clickwatch.datamodel.ClickWatchDataModelPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import de.hub.clickwatch.datamodel.ClickWatchModelPackage;
import de.hub.clickwatch.datamodel.Element;
import de.hub.clickwatch.datamodel.Handler;
import de.hub.clickwatch.datamodel.Value;
import java.util.Collection;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Handler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.clickwatch.datamodel.impl.HandlerImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.hub.clickwatch.datamodel.impl.HandlerImpl#isCanRead <em>Can Read</em>}</li>
 *   <li>{@link de.hub.clickwatch.datamodel.impl.HandlerImpl#isCanWrite <em>Can Write</em>}</li>
 *   <li>{@link de.hub.clickwatch.datamodel.impl.HandlerImpl#isChanged <em>Changed</em>}</li>
 *   <li>{@link de.hub.clickwatch.datamodel.impl.HandlerImpl#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HandlerImpl extends TraceableImpl implements Handler {
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
	 * The cached value of the '{@link #getValues() <em>Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValues()
	 * @generated
	 * @ordered
	 */
	protected EList<Value> values;
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
		return ClickWatchDataModelPackage.Literals.HANDLER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ClickWatchDataModelPackage.HANDLER__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ClickWatchDataModelPackage.HANDLER__CAN_READ, oldCanRead, canRead));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ClickWatchDataModelPackage.HANDLER__CAN_WRITE, oldCanWrite, canWrite));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ClickWatchDataModelPackage.HANDLER__CHANGED, oldChanged, changed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Value> getValues() {
		if (values == null) {
			values = new EObjectContainmentEList<Value>(Value.class, this, ClickWatchDataModelPackage.HANDLER__VALUES);
		}
		return values;
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
			case ClickWatchDataModelPackage.HANDLER__VALUES:
				return ((InternalEList<?>)getValues()).basicRemove(otherEnd, msgs);
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
			case ClickWatchDataModelPackage.HANDLER__NAME:
				return getName();
			case ClickWatchDataModelPackage.HANDLER__CAN_READ:
				return isCanRead();
			case ClickWatchDataModelPackage.HANDLER__CAN_WRITE:
				return isCanWrite();
			case ClickWatchDataModelPackage.HANDLER__CHANGED:
				return isChanged();
			case ClickWatchDataModelPackage.HANDLER__VALUES:
				return getValues();
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
			case ClickWatchDataModelPackage.HANDLER__NAME:
				setName((String)newValue);
				return;
			case ClickWatchDataModelPackage.HANDLER__CAN_READ:
				setCanRead((Boolean)newValue);
				return;
			case ClickWatchDataModelPackage.HANDLER__CAN_WRITE:
				setCanWrite((Boolean)newValue);
				return;
			case ClickWatchDataModelPackage.HANDLER__CHANGED:
				setChanged((Boolean)newValue);
				return;
			case ClickWatchDataModelPackage.HANDLER__VALUES:
				getValues().clear();
				getValues().addAll((Collection<? extends Value>)newValue);
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
			case ClickWatchDataModelPackage.HANDLER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ClickWatchDataModelPackage.HANDLER__CAN_READ:
				setCanRead(CAN_READ_EDEFAULT);
				return;
			case ClickWatchDataModelPackage.HANDLER__CAN_WRITE:
				setCanWrite(CAN_WRITE_EDEFAULT);
				return;
			case ClickWatchDataModelPackage.HANDLER__CHANGED:
				setChanged(CHANGED_EDEFAULT);
				return;
			case ClickWatchDataModelPackage.HANDLER__VALUES:
				getValues().clear();
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
			case ClickWatchDataModelPackage.HANDLER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ClickWatchDataModelPackage.HANDLER__CAN_READ:
				return canRead != CAN_READ_EDEFAULT;
			case ClickWatchDataModelPackage.HANDLER__CAN_WRITE:
				return canWrite != CAN_WRITE_EDEFAULT;
			case ClickWatchDataModelPackage.HANDLER__CHANGED:
				return changed != CHANGED_EDEFAULT;
			case ClickWatchDataModelPackage.HANDLER__VALUES:
				return values != null && !values.isEmpty();
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
