/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.util;

import de.hub.clickwatch.model.Handler;

import de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.Seismo_localchannelinfoPackage
 * @generated
 */
public class Seismo_localchannelinfoAdapterFactory extends AdapterFactoryImpl {
	/**
     * The cached model package.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected static Seismo_localchannelinfoPackage modelPackage;

	/**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Seismo_localchannelinfoAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = Seismo_localchannelinfoPackage.eINSTANCE;
        }
    }

	/**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
	@Override
	public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject)object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

	/**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected Seismo_localchannelinfoSwitch<Adapter> modelSwitch =
		new Seismo_localchannelinfoSwitch<Adapter>() {
            @Override
            public Adapter caseC(C object) {
                return createCAdapter();
            }
            @Override
            public Adapter caseLocalchannelinfo(Localchannelinfo object) {
                return createLocalchannelinfoAdapter();
            }
            @Override
            public Adapter caseV(V object) {
                return createVAdapter();
            }
            @Override
            public Adapter caseHandler(Handler object) {
                return createHandlerAdapter();
            }
            @Override
            public Adapter defaultCase(EObject object) {
                return createEObjectAdapter();
            }
        };

	/**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
	@Override
	public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject)target);
    }


	/**
     * Creates a new adapter for an object of class '{@link de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.C <em>C</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.C
     * @generated
     */
	public Adapter createCAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.Localchannelinfo <em>Localchannelinfo</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.Localchannelinfo
     * @generated
     */
	public Adapter createLocalchannelinfoAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.V <em>V</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.V
     * @generated
     */
	public Adapter createVAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link de.hub.clickwatch.model.Handler <em>Handler</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.hub.clickwatch.model.Handler
     * @generated
     */
	public Adapter createHandlerAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
	public Adapter createEObjectAdapter() {
        return null;
    }

} //Seismo_localchannelinfoAdapterFactory
