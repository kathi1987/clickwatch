/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.model.impl;


import de.hub.clickwatch.model.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import com.google.inject.Injector;

import de.hub.clickwatch.model.BackboneType;
import de.hub.clickwatch.model.ClickWatchModelFactory;
import de.hub.clickwatch.model.ClickWatchModelPackage;
import de.hub.clickwatch.model.Element;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.model.Network;
import de.hub.clickwatch.model.Node;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ClickWatchModelFactoryImpl extends EFactoryImpl implements ClickWatchModelFactory {
    
    /**
     * @generated NOT
     */
    private Injector injector = null;
    
	/**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static ClickWatchModelFactory init() {
        try {
            ClickWatchModelFactory theClickWatchModelFactory = (ClickWatchModelFactory)EPackage.Registry.INSTANCE.getEFactory("http://de.hub.clickwatch.model"); 
            if (theClickWatchModelFactory != null) {
                return theClickWatchModelFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new ClickWatchModelFactoryImpl();
    }

	/**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ClickWatchModelFactoryImpl() {
        super();
    }
	
	/**
	 * @generated NOT
	 */
	public void registerInjector(Injector injector) {
	    this.injector = injector;
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case ClickWatchModelPackage.NODE: return createNode();
            case ClickWatchModelPackage.ELEMENT: return createElement();
            case ClickWatchModelPackage.HANDLER: return createHandler();
            case ClickWatchModelPackage.NETWORK: return createNetwork();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
        switch (eDataType.getClassifierID()) {
            case ClickWatchModelPackage.BACKBONE_TYPE:
                return createBackboneTypeFromString(eDataType, initialValue);
            case ClickWatchModelPackage.CHANGE:
                return createChangeFromString(eDataType, initialValue);
            case ClickWatchModelPackage.ERROR:
                return createErrorFromString(eDataType, initialValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
        switch (eDataType.getClassifierID()) {
            case ClickWatchModelPackage.BACKBONE_TYPE:
                return convertBackboneTypeToString(eDataType, instanceValue);
            case ClickWatchModelPackage.CHANGE:
                return convertChangeToString(eDataType, instanceValue);
            case ClickWatchModelPackage.ERROR:
                return convertErrorToString(eDataType, instanceValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated NOT
     */
	public Node createNode() {
	    NodeImpl node = null;
	    if (injector != null) {
	        node = injector.getInstance(NodeImpl.class);
	    } else {
	        node = new NodeImpl(); 
	    }        
        return node;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Element createElement() {
        ElementImpl element = new ElementImpl();
        return element;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Handler createHandler() {
        HandlerImpl handler = new HandlerImpl();
        return handler;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Network createNetwork() {
        NetworkImpl network = new NetworkImpl();
        return network;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public BackboneType createBackboneTypeFromString(EDataType eDataType, String initialValue) {
        BackboneType result = BackboneType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertBackboneTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ChangeMark createChangeFromString(EDataType eDataType, String initialValue) {
        return (ChangeMark)super.createFromString(eDataType, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertChangeToString(EDataType eDataType, Object instanceValue) {
        return super.convertToString(eDataType, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ClickWatchError createErrorFromString(EDataType eDataType, String initialValue) {
        return (ClickWatchError)super.createFromString(eDataType, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertErrorToString(EDataType eDataType, Object instanceValue) {
        return super.convertToString(eDataType, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ClickWatchModelPackage getClickWatchModelPackage() {
        return (ClickWatchModelPackage)getEPackage();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
	@Deprecated
	public static ClickWatchModelPackage getPackage() {
        return ClickWatchModelPackage.eINSTANCE;
    }

} //ModelFactoryImpl
