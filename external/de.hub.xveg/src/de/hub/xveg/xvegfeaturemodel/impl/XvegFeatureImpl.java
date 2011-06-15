/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.xveg.xvegfeaturemodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import de.hub.xveg.configuration.IFeatureConfigurationProvider;
import de.hub.xveg.xvegfeaturemodel.StyleInfo;
import de.hub.xveg.xvegfeaturemodel.XvegDiagramType;
import de.hub.xveg.xvegfeaturemodel.XvegFeature;
import de.hub.xveg.xvegfeaturemodel.XvegFeatureModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Xveg Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.xveg.xvegfeaturemodel.impl.XvegFeatureImpl#getElementClass <em>Element Class</em>}</li>
 *   <li>{@link de.hub.xveg.xvegfeaturemodel.impl.XvegFeatureImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.hub.xveg.xvegfeaturemodel.impl.XvegFeatureImpl#getDiagramType <em>Diagram Type</em>}</li>
 *   <li>{@link de.hub.xveg.xvegfeaturemodel.impl.XvegFeatureImpl#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link de.hub.xveg.xvegfeaturemodel.impl.XvegFeatureImpl#getStyle <em>Style</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class XvegFeatureImpl extends EObjectImpl implements XvegFeature {
	/**
	 * The cached value of the '{@link #getElementClass() <em>Element Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementClass()
	 * @generated
	 * @ordered
	 */
	protected EClass elementClass;

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
	 * The default value of the '{@link #getConfiguration() <em>Configuration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguration()
	 * @generated
	 * @ordered
	 */
	protected static final IFeatureConfigurationProvider CONFIGURATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConfiguration() <em>Configuration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguration()
	 * @generated
	 * @ordered
	 */
	protected IFeatureConfigurationProvider configuration = CONFIGURATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStyle() <em>Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected StyleInfo style;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XvegFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XvegFeatureModelPackage.Literals.XVEG_FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementClass() {
		if (elementClass != null && elementClass.eIsProxy()) {
			InternalEObject oldElementClass = (InternalEObject)elementClass;
			elementClass = (EClass)eResolveProxy(oldElementClass);
			if (elementClass != oldElementClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XvegFeatureModelPackage.XVEG_FEATURE__ELEMENT_CLASS, oldElementClass, elementClass));
			}
		}
		return elementClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetElementClass() {
		return elementClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementClass(EClass newElementClass) {
		EClass oldElementClass = elementClass;
		elementClass = newElementClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XvegFeatureModelPackage.XVEG_FEATURE__ELEMENT_CLASS, oldElementClass, elementClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XvegFeatureModelPackage.XVEG_FEATURE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XvegDiagramType getDiagramType() {
		if (eContainerFeatureID() != XvegFeatureModelPackage.XVEG_FEATURE__DIAGRAM_TYPE) return null;
		return (XvegDiagramType)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiagramType(XvegDiagramType newDiagramType, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDiagramType, XvegFeatureModelPackage.XVEG_FEATURE__DIAGRAM_TYPE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiagramType(XvegDiagramType newDiagramType) {
		if (newDiagramType != eInternalContainer() || (eContainerFeatureID() != XvegFeatureModelPackage.XVEG_FEATURE__DIAGRAM_TYPE && newDiagramType != null)) {
			if (EcoreUtil.isAncestor(this, newDiagramType))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDiagramType != null)
				msgs = ((InternalEObject)newDiagramType).eInverseAdd(this, XvegFeatureModelPackage.XVEG_DIAGRAM_TYPE__FEATURES, XvegDiagramType.class, msgs);
			msgs = basicSetDiagramType(newDiagramType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XvegFeatureModelPackage.XVEG_FEATURE__DIAGRAM_TYPE, newDiagramType, newDiagramType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IFeatureConfigurationProvider getConfiguration() {
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfiguration(IFeatureConfigurationProvider newConfiguration) {
		IFeatureConfigurationProvider oldConfiguration = configuration;
		configuration = newConfiguration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XvegFeatureModelPackage.XVEG_FEATURE__CONFIGURATION, oldConfiguration, configuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleInfo getStyle() {
		return style;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStyle(StyleInfo newStyle, NotificationChain msgs) {
		StyleInfo oldStyle = style;
		style = newStyle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XvegFeatureModelPackage.XVEG_FEATURE__STYLE, oldStyle, newStyle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyle(StyleInfo newStyle) {
		if (newStyle != style) {
			NotificationChain msgs = null;
			if (style != null)
				msgs = ((InternalEObject)style).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XvegFeatureModelPackage.XVEG_FEATURE__STYLE, null, msgs);
			if (newStyle != null)
				msgs = ((InternalEObject)newStyle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XvegFeatureModelPackage.XVEG_FEATURE__STYLE, null, msgs);
			msgs = basicSetStyle(newStyle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XvegFeatureModelPackage.XVEG_FEATURE__STYLE, newStyle, newStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XvegFeatureModelPackage.XVEG_FEATURE__DIAGRAM_TYPE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDiagramType((XvegDiagramType)otherEnd, msgs);
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
			case XvegFeatureModelPackage.XVEG_FEATURE__DIAGRAM_TYPE:
				return basicSetDiagramType(null, msgs);
			case XvegFeatureModelPackage.XVEG_FEATURE__STYLE:
				return basicSetStyle(null, msgs);
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
			case XvegFeatureModelPackage.XVEG_FEATURE__DIAGRAM_TYPE:
				return eInternalContainer().eInverseRemove(this, XvegFeatureModelPackage.XVEG_DIAGRAM_TYPE__FEATURES, XvegDiagramType.class, msgs);
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
			case XvegFeatureModelPackage.XVEG_FEATURE__ELEMENT_CLASS:
				if (resolve) return getElementClass();
				return basicGetElementClass();
			case XvegFeatureModelPackage.XVEG_FEATURE__NAME:
				return getName();
			case XvegFeatureModelPackage.XVEG_FEATURE__DIAGRAM_TYPE:
				return getDiagramType();
			case XvegFeatureModelPackage.XVEG_FEATURE__CONFIGURATION:
				return getConfiguration();
			case XvegFeatureModelPackage.XVEG_FEATURE__STYLE:
				return getStyle();
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
			case XvegFeatureModelPackage.XVEG_FEATURE__ELEMENT_CLASS:
				setElementClass((EClass)newValue);
				return;
			case XvegFeatureModelPackage.XVEG_FEATURE__NAME:
				setName((String)newValue);
				return;
			case XvegFeatureModelPackage.XVEG_FEATURE__DIAGRAM_TYPE:
				setDiagramType((XvegDiagramType)newValue);
				return;
			case XvegFeatureModelPackage.XVEG_FEATURE__CONFIGURATION:
				setConfiguration((IFeatureConfigurationProvider)newValue);
				return;
			case XvegFeatureModelPackage.XVEG_FEATURE__STYLE:
				setStyle((StyleInfo)newValue);
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
			case XvegFeatureModelPackage.XVEG_FEATURE__ELEMENT_CLASS:
				setElementClass((EClass)null);
				return;
			case XvegFeatureModelPackage.XVEG_FEATURE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case XvegFeatureModelPackage.XVEG_FEATURE__DIAGRAM_TYPE:
				setDiagramType((XvegDiagramType)null);
				return;
			case XvegFeatureModelPackage.XVEG_FEATURE__CONFIGURATION:
				setConfiguration(CONFIGURATION_EDEFAULT);
				return;
			case XvegFeatureModelPackage.XVEG_FEATURE__STYLE:
				setStyle((StyleInfo)null);
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
			case XvegFeatureModelPackage.XVEG_FEATURE__ELEMENT_CLASS:
				return elementClass != null;
			case XvegFeatureModelPackage.XVEG_FEATURE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case XvegFeatureModelPackage.XVEG_FEATURE__DIAGRAM_TYPE:
				return getDiagramType() != null;
			case XvegFeatureModelPackage.XVEG_FEATURE__CONFIGURATION:
				return CONFIGURATION_EDEFAULT == null ? configuration != null : !CONFIGURATION_EDEFAULT.equals(configuration);
			case XvegFeatureModelPackage.XVEG_FEATURE__STYLE:
				return style != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", configuration: ");
		result.append(configuration);
		result.append(')');
		return result.toString();
	}

} //XvegFeatureImpl
