/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.impl;

import de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Cpu_usage;
import de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Linux;
import de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Loadavg;
import de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Mem;
import de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Sys_info_systeminfoPackage;
import de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Systeminfo;
import de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.Uptime;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.impl.SystemImpl#getEContainer_system <em>EContainer system</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.impl.SystemImpl#getText <em>Text</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.impl.SystemImpl#getMem <em>Mem</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.impl.SystemImpl#getLoadavg <em>Loadavg</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.impl.SystemImpl#getCpu_usage <em>Cpu usage</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.impl.SystemImpl#getUptime <em>Uptime</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.impl.SystemImpl#getLinux <em>Linux</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.impl.SystemImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.impl.SystemImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.impl.SystemImpl#getTime <em>Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SystemImpl extends EObjectImpl implements de.hub.clickwatch.specificmodels.brn.sys_info_systeminfo.System {
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
	 * The cached value of the '{@link #getMem() <em>Mem</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMem()
	 * @generated
	 * @ordered
	 */
	protected Mem mem;

	/**
	 * The cached value of the '{@link #getLoadavg() <em>Loadavg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadavg()
	 * @generated
	 * @ordered
	 */
	protected Loadavg loadavg;

	/**
	 * The cached value of the '{@link #getCpu_usage() <em>Cpu usage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpu_usage()
	 * @generated
	 * @ordered
	 */
	protected Cpu_usage cpu_usage;

	/**
	 * The cached value of the '{@link #getUptime() <em>Uptime</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUptime()
	 * @generated
	 * @ordered
	 */
	protected Uptime uptime;

	/**
	 * The cached value of the '{@link #getLinux() <em>Linux</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinux()
	 * @generated
	 * @ordered
	 */
	protected Linux linux;

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
	 * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected static final double TIME_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected double time = TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Sys_info_systeminfoPackage.Literals.SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Systeminfo getEContainer_system() {
		if (eContainerFeatureID() != Sys_info_systeminfoPackage.SYSTEM__ECONTAINER_SYSTEM) return null;
		return (Systeminfo)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEContainer_system(Systeminfo newEContainer_system, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEContainer_system, Sys_info_systeminfoPackage.SYSTEM__ECONTAINER_SYSTEM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEContainer_system(Systeminfo newEContainer_system) {
		if (newEContainer_system != eInternalContainer() || (eContainerFeatureID() != Sys_info_systeminfoPackage.SYSTEM__ECONTAINER_SYSTEM && newEContainer_system != null)) {
			if (EcoreUtil.isAncestor(this, newEContainer_system))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEContainer_system != null)
				msgs = ((InternalEObject)newEContainer_system).eInverseAdd(this, Sys_info_systeminfoPackage.SYSTEMINFO__SYSTEM, Systeminfo.class, msgs);
			msgs = basicSetEContainer_system(newEContainer_system, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Sys_info_systeminfoPackage.SYSTEM__ECONTAINER_SYSTEM, newEContainer_system, newEContainer_system));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getText() {
		if (text == null) {
			text = new EDataTypeEList<String>(String.class, this, Sys_info_systeminfoPackage.SYSTEM__TEXT);
		}
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mem getMem() {
		return mem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMem(Mem newMem, NotificationChain msgs) {
		Mem oldMem = mem;
		mem = newMem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Sys_info_systeminfoPackage.SYSTEM__MEM, oldMem, newMem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMem(Mem newMem) {
		if (newMem != mem) {
			NotificationChain msgs = null;
			if (mem != null)
				msgs = ((InternalEObject)mem).eInverseRemove(this, Sys_info_systeminfoPackage.MEM__ECONTAINER_MEM, Mem.class, msgs);
			if (newMem != null)
				msgs = ((InternalEObject)newMem).eInverseAdd(this, Sys_info_systeminfoPackage.MEM__ECONTAINER_MEM, Mem.class, msgs);
			msgs = basicSetMem(newMem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Sys_info_systeminfoPackage.SYSTEM__MEM, newMem, newMem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Loadavg getLoadavg() {
		return loadavg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoadavg(Loadavg newLoadavg, NotificationChain msgs) {
		Loadavg oldLoadavg = loadavg;
		loadavg = newLoadavg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Sys_info_systeminfoPackage.SYSTEM__LOADAVG, oldLoadavg, newLoadavg);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoadavg(Loadavg newLoadavg) {
		if (newLoadavg != loadavg) {
			NotificationChain msgs = null;
			if (loadavg != null)
				msgs = ((InternalEObject)loadavg).eInverseRemove(this, Sys_info_systeminfoPackage.LOADAVG__ECONTAINER_LOADAVG, Loadavg.class, msgs);
			if (newLoadavg != null)
				msgs = ((InternalEObject)newLoadavg).eInverseAdd(this, Sys_info_systeminfoPackage.LOADAVG__ECONTAINER_LOADAVG, Loadavg.class, msgs);
			msgs = basicSetLoadavg(newLoadavg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Sys_info_systeminfoPackage.SYSTEM__LOADAVG, newLoadavg, newLoadavg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cpu_usage getCpu_usage() {
		return cpu_usage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCpu_usage(Cpu_usage newCpu_usage, NotificationChain msgs) {
		Cpu_usage oldCpu_usage = cpu_usage;
		cpu_usage = newCpu_usage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Sys_info_systeminfoPackage.SYSTEM__CPU_USAGE, oldCpu_usage, newCpu_usage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCpu_usage(Cpu_usage newCpu_usage) {
		if (newCpu_usage != cpu_usage) {
			NotificationChain msgs = null;
			if (cpu_usage != null)
				msgs = ((InternalEObject)cpu_usage).eInverseRemove(this, Sys_info_systeminfoPackage.CPU_USAGE__ECONTAINER_CPU_USAGE, Cpu_usage.class, msgs);
			if (newCpu_usage != null)
				msgs = ((InternalEObject)newCpu_usage).eInverseAdd(this, Sys_info_systeminfoPackage.CPU_USAGE__ECONTAINER_CPU_USAGE, Cpu_usage.class, msgs);
			msgs = basicSetCpu_usage(newCpu_usage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Sys_info_systeminfoPackage.SYSTEM__CPU_USAGE, newCpu_usage, newCpu_usage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uptime getUptime() {
		return uptime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUptime(Uptime newUptime, NotificationChain msgs) {
		Uptime oldUptime = uptime;
		uptime = newUptime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Sys_info_systeminfoPackage.SYSTEM__UPTIME, oldUptime, newUptime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUptime(Uptime newUptime) {
		if (newUptime != uptime) {
			NotificationChain msgs = null;
			if (uptime != null)
				msgs = ((InternalEObject)uptime).eInverseRemove(this, Sys_info_systeminfoPackage.UPTIME__ECONTAINER_UPTIME, Uptime.class, msgs);
			if (newUptime != null)
				msgs = ((InternalEObject)newUptime).eInverseAdd(this, Sys_info_systeminfoPackage.UPTIME__ECONTAINER_UPTIME, Uptime.class, msgs);
			msgs = basicSetUptime(newUptime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Sys_info_systeminfoPackage.SYSTEM__UPTIME, newUptime, newUptime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Linux getLinux() {
		return linux;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLinux(Linux newLinux, NotificationChain msgs) {
		Linux oldLinux = linux;
		linux = newLinux;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Sys_info_systeminfoPackage.SYSTEM__LINUX, oldLinux, newLinux);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinux(Linux newLinux) {
		if (newLinux != linux) {
			NotificationChain msgs = null;
			if (linux != null)
				msgs = ((InternalEObject)linux).eInverseRemove(this, Sys_info_systeminfoPackage.LINUX__ECONTAINER_LINUX, Linux.class, msgs);
			if (newLinux != null)
				msgs = ((InternalEObject)newLinux).eInverseAdd(this, Sys_info_systeminfoPackage.LINUX__ECONTAINER_LINUX, Linux.class, msgs);
			msgs = basicSetLinux(newLinux, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Sys_info_systeminfoPackage.SYSTEM__LINUX, newLinux, newLinux));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Sys_info_systeminfoPackage.SYSTEM__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Sys_info_systeminfoPackage.SYSTEM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime(double newTime) {
		double oldTime = time;
		time = newTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Sys_info_systeminfoPackage.SYSTEM__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Sys_info_systeminfoPackage.SYSTEM__ECONTAINER_SYSTEM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEContainer_system((Systeminfo)otherEnd, msgs);
			case Sys_info_systeminfoPackage.SYSTEM__MEM:
				if (mem != null)
					msgs = ((InternalEObject)mem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Sys_info_systeminfoPackage.SYSTEM__MEM, null, msgs);
				return basicSetMem((Mem)otherEnd, msgs);
			case Sys_info_systeminfoPackage.SYSTEM__LOADAVG:
				if (loadavg != null)
					msgs = ((InternalEObject)loadavg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Sys_info_systeminfoPackage.SYSTEM__LOADAVG, null, msgs);
				return basicSetLoadavg((Loadavg)otherEnd, msgs);
			case Sys_info_systeminfoPackage.SYSTEM__CPU_USAGE:
				if (cpu_usage != null)
					msgs = ((InternalEObject)cpu_usage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Sys_info_systeminfoPackage.SYSTEM__CPU_USAGE, null, msgs);
				return basicSetCpu_usage((Cpu_usage)otherEnd, msgs);
			case Sys_info_systeminfoPackage.SYSTEM__UPTIME:
				if (uptime != null)
					msgs = ((InternalEObject)uptime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Sys_info_systeminfoPackage.SYSTEM__UPTIME, null, msgs);
				return basicSetUptime((Uptime)otherEnd, msgs);
			case Sys_info_systeminfoPackage.SYSTEM__LINUX:
				if (linux != null)
					msgs = ((InternalEObject)linux).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Sys_info_systeminfoPackage.SYSTEM__LINUX, null, msgs);
				return basicSetLinux((Linux)otherEnd, msgs);
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
			case Sys_info_systeminfoPackage.SYSTEM__ECONTAINER_SYSTEM:
				return basicSetEContainer_system(null, msgs);
			case Sys_info_systeminfoPackage.SYSTEM__MEM:
				return basicSetMem(null, msgs);
			case Sys_info_systeminfoPackage.SYSTEM__LOADAVG:
				return basicSetLoadavg(null, msgs);
			case Sys_info_systeminfoPackage.SYSTEM__CPU_USAGE:
				return basicSetCpu_usage(null, msgs);
			case Sys_info_systeminfoPackage.SYSTEM__UPTIME:
				return basicSetUptime(null, msgs);
			case Sys_info_systeminfoPackage.SYSTEM__LINUX:
				return basicSetLinux(null, msgs);
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
			case Sys_info_systeminfoPackage.SYSTEM__ECONTAINER_SYSTEM:
				return eInternalContainer().eInverseRemove(this, Sys_info_systeminfoPackage.SYSTEMINFO__SYSTEM, Systeminfo.class, msgs);
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
			case Sys_info_systeminfoPackage.SYSTEM__ECONTAINER_SYSTEM:
				return getEContainer_system();
			case Sys_info_systeminfoPackage.SYSTEM__TEXT:
				return getText();
			case Sys_info_systeminfoPackage.SYSTEM__MEM:
				return getMem();
			case Sys_info_systeminfoPackage.SYSTEM__LOADAVG:
				return getLoadavg();
			case Sys_info_systeminfoPackage.SYSTEM__CPU_USAGE:
				return getCpu_usage();
			case Sys_info_systeminfoPackage.SYSTEM__UPTIME:
				return getUptime();
			case Sys_info_systeminfoPackage.SYSTEM__LINUX:
				return getLinux();
			case Sys_info_systeminfoPackage.SYSTEM__ID:
				return getId();
			case Sys_info_systeminfoPackage.SYSTEM__NAME:
				return getName();
			case Sys_info_systeminfoPackage.SYSTEM__TIME:
				return getTime();
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
			case Sys_info_systeminfoPackage.SYSTEM__ECONTAINER_SYSTEM:
				setEContainer_system((Systeminfo)newValue);
				return;
			case Sys_info_systeminfoPackage.SYSTEM__TEXT:
				getText().clear();
				getText().addAll((Collection<? extends String>)newValue);
				return;
			case Sys_info_systeminfoPackage.SYSTEM__MEM:
				setMem((Mem)newValue);
				return;
			case Sys_info_systeminfoPackage.SYSTEM__LOADAVG:
				setLoadavg((Loadavg)newValue);
				return;
			case Sys_info_systeminfoPackage.SYSTEM__CPU_USAGE:
				setCpu_usage((Cpu_usage)newValue);
				return;
			case Sys_info_systeminfoPackage.SYSTEM__UPTIME:
				setUptime((Uptime)newValue);
				return;
			case Sys_info_systeminfoPackage.SYSTEM__LINUX:
				setLinux((Linux)newValue);
				return;
			case Sys_info_systeminfoPackage.SYSTEM__ID:
				setId((String)newValue);
				return;
			case Sys_info_systeminfoPackage.SYSTEM__NAME:
				setName((String)newValue);
				return;
			case Sys_info_systeminfoPackage.SYSTEM__TIME:
				setTime((Double)newValue);
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
			case Sys_info_systeminfoPackage.SYSTEM__ECONTAINER_SYSTEM:
				setEContainer_system((Systeminfo)null);
				return;
			case Sys_info_systeminfoPackage.SYSTEM__TEXT:
				getText().clear();
				return;
			case Sys_info_systeminfoPackage.SYSTEM__MEM:
				setMem((Mem)null);
				return;
			case Sys_info_systeminfoPackage.SYSTEM__LOADAVG:
				setLoadavg((Loadavg)null);
				return;
			case Sys_info_systeminfoPackage.SYSTEM__CPU_USAGE:
				setCpu_usage((Cpu_usage)null);
				return;
			case Sys_info_systeminfoPackage.SYSTEM__UPTIME:
				setUptime((Uptime)null);
				return;
			case Sys_info_systeminfoPackage.SYSTEM__LINUX:
				setLinux((Linux)null);
				return;
			case Sys_info_systeminfoPackage.SYSTEM__ID:
				setId(ID_EDEFAULT);
				return;
			case Sys_info_systeminfoPackage.SYSTEM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Sys_info_systeminfoPackage.SYSTEM__TIME:
				setTime(TIME_EDEFAULT);
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
			case Sys_info_systeminfoPackage.SYSTEM__ECONTAINER_SYSTEM:
				return getEContainer_system() != null;
			case Sys_info_systeminfoPackage.SYSTEM__TEXT:
				return text != null && !text.isEmpty();
			case Sys_info_systeminfoPackage.SYSTEM__MEM:
				return mem != null;
			case Sys_info_systeminfoPackage.SYSTEM__LOADAVG:
				return loadavg != null;
			case Sys_info_systeminfoPackage.SYSTEM__CPU_USAGE:
				return cpu_usage != null;
			case Sys_info_systeminfoPackage.SYSTEM__UPTIME:
				return uptime != null;
			case Sys_info_systeminfoPackage.SYSTEM__LINUX:
				return linux != null;
			case Sys_info_systeminfoPackage.SYSTEM__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Sys_info_systeminfoPackage.SYSTEM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Sys_info_systeminfoPackage.SYSTEM__TIME:
				return time != TIME_EDEFAULT;
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
		result.append(", name: ");
		result.append(name);
		result.append(", time: ");
		result.append(time);
		result.append(')');
		return result.toString();
	}

} //SystemImpl
