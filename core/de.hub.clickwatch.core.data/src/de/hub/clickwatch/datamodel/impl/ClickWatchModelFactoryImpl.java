/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.datamodel.impl;


import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import com.google.inject.Injector;

import de.hub.clickwatch.datamodel.BackboneType;
import de.hub.clickwatch.datamodel.ClickWatchError;
import de.hub.clickwatch.datamodel.ClickWatchModelFactory;
import de.hub.clickwatch.datamodel.ClickWatchModelPackage;
import de.hub.clickwatch.datamodel.Element;
import de.hub.clickwatch.datamodel.Handler;
import de.hub.clickwatch.datamodel.Network;
import de.hub.clickwatch.datamodel.Node;
import de.hub.clickwatch.datamodel.Statistic;
import de.hub.clickwatch.datamodel.StatisticsContainer;


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
            case ClickWatchModelPackage.STATISTICS_CONTAINER: return createStatisticsContainer();
            case ClickWatchModelPackage.ESTRING_TO_STATISTIC_MAP: return (EObject)createEStringToStatisticMap();
            case ClickWatchModelPackage.STATISTIC: return createStatistic();
            case ClickWatchModelPackage.CLICK_WATCH_ERROR: return createClickWatchError();
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
            case ClickWatchModelPackage.EXCEPTION:
                return createExceptionFromString(eDataType, initialValue);
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
            case ClickWatchModelPackage.EXCEPTION:
                return convertExceptionToString(eDataType, instanceValue);
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
    public StatisticsContainer createStatisticsContainer() {
        StatisticsContainerImpl statisticsContainer = new StatisticsContainerImpl();
        return statisticsContainer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Map.Entry<String, Statistic> createEStringToStatisticMap() {
        EStringToStatisticMapImpl eStringToStatisticMap = new EStringToStatisticMapImpl();
        return eStringToStatisticMap;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Statistic createStatistic() {
        StatisticImpl statistic = new StatisticImpl();
        return statistic;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ClickWatchError createClickWatchError() {
        ClickWatchErrorImpl clickWatchError = new ClickWatchErrorImpl();
        return clickWatchError;
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
    public Exception createExceptionFromString(EDataType eDataType, String initialValue) {
        return (Exception)super.createFromString(eDataType, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertExceptionToString(EDataType eDataType, Object instanceValue) {
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
