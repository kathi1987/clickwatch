/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.cwdatabase.impl;

import de.hub.clickwatch.cwdatabase.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CWDataBaseFactoryImpl extends EFactoryImpl implements CWDataBaseFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CWDataBaseFactory init() {
		try {
			CWDataBaseFactory theCWDataBaseFactory = (CWDataBaseFactory)EPackage.Registry.INSTANCE.getEFactory("http://de.hub.clickwatch/cwdatabase"); 
			if (theCWDataBaseFactory != null) {
				return theCWDataBaseFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CWDataBaseFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CWDataBaseFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CWDataBasePackage.EXPERIMIMENT: return createExperimiment();
			case CWDataBasePackage.NODE_RECORD: return createNodeRecord();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Experimiment createExperimiment() {
		ExperimimentImpl experimiment = new ExperimimentImpl();
		return experimiment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeRecord createNodeRecord() {
		NodeRecordImpl nodeRecord = new NodeRecordImpl();
		return nodeRecord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CWDataBasePackage getCWDataBasePackage() {
		return (CWDataBasePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CWDataBasePackage getPackage() {
		return CWDataBasePackage.eINSTANCE;
	}

} //CWDataBaseFactoryImpl
