/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.xml.impl;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import de.hub.clickwatch.xml.ConfigurationFactory;
import de.hub.clickwatch.xml.ConfigurationPackage;
import de.hub.clickwatch.xml.DatabaseType;
import de.hub.clickwatch.xml.DocumentRoot;
import de.hub.clickwatch.xml.ExperimentListType;
import de.hub.clickwatch.xml.ExperimentType;
import de.hub.clickwatch.xml.HandlerListType;
import de.hub.clickwatch.xml.HandlerType;
import de.hub.clickwatch.xml.NetworkType;
import de.hub.clickwatch.xml.NodeListType;
import de.hub.clickwatch.xml.NodeType;
import de.hub.clickwatch.xml.ProtocolType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConfigurationFactoryImpl extends EFactoryImpl implements ConfigurationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConfigurationFactory init() {
		try {
			ConfigurationFactory theConfigurationFactory = (ConfigurationFactory)EPackage.Registry.INSTANCE.getEFactory("file:/vol/home-vol1/simulant/frey/Desktop/configuration.xsd"); 
			if (theConfigurationFactory != null) {
				return theConfigurationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ConfigurationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationFactoryImpl() {
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
			case ConfigurationPackage.DATABASE_TYPE: return createDatabaseType();
			case ConfigurationPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case ConfigurationPackage.EXPERIMENT_LIST_TYPE: return createExperimentListType();
			case ConfigurationPackage.EXPERIMENT_TYPE: return createExperimentType();
			case ConfigurationPackage.HANDLER_LIST_TYPE: return createHandlerListType();
			case ConfigurationPackage.HANDLER_TYPE: return createHandlerType();
			case ConfigurationPackage.NETWORK_TYPE: return createNetworkType();
			case ConfigurationPackage.NODE_LIST_TYPE: return createNodeListType();
			case ConfigurationPackage.NODE_TYPE: return createNodeType();
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
			case ConfigurationPackage.PROTOCOL_TYPE:
				return createProtocolTypeFromString(eDataType, initialValue);
			case ConfigurationPackage.ADDRESS_TYPE:
				return createAddressTypeFromString(eDataType, initialValue);
			case ConfigurationPackage.PORT_TYPE:
				return createPortTypeFromString(eDataType, initialValue);
			case ConfigurationPackage.PROTOCOL_TYPE_OBJECT:
				return createProtocolTypeObjectFromString(eDataType, initialValue);
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
			case ConfigurationPackage.PROTOCOL_TYPE:
				return convertProtocolTypeToString(eDataType, instanceValue);
			case ConfigurationPackage.ADDRESS_TYPE:
				return convertAddressTypeToString(eDataType, instanceValue);
			case ConfigurationPackage.PORT_TYPE:
				return convertPortTypeToString(eDataType, instanceValue);
			case ConfigurationPackage.PROTOCOL_TYPE_OBJECT:
				return convertProtocolTypeObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseType createDatabaseType() {
		DatabaseTypeImpl databaseType = new DatabaseTypeImpl();
		return databaseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExperimentListType createExperimentListType() {
		ExperimentListTypeImpl experimentListType = new ExperimentListTypeImpl();
		return experimentListType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExperimentType createExperimentType() {
		ExperimentTypeImpl experimentType = new ExperimentTypeImpl();
		return experimentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HandlerListType createHandlerListType() {
		HandlerListTypeImpl handlerListType = new HandlerListTypeImpl();
		return handlerListType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HandlerType createHandlerType() {
		HandlerTypeImpl handlerType = new HandlerTypeImpl();
		return handlerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkType createNetworkType() {
		NetworkTypeImpl networkType = new NetworkTypeImpl();
		return networkType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeListType createNodeListType() {
		NodeListTypeImpl nodeListType = new NodeListTypeImpl();
		return nodeListType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeType createNodeType() {
		NodeTypeImpl nodeType = new NodeTypeImpl();
		return nodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolType createProtocolTypeFromString(EDataType eDataType, String initialValue) {
		ProtocolType result = ProtocolType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProtocolTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createAddressTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAddressTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createPortTypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPortTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolType createProtocolTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createProtocolTypeFromString(ConfigurationPackage.Literals.PROTOCOL_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProtocolTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertProtocolTypeToString(ConfigurationPackage.Literals.PROTOCOL_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationPackage getConfigurationPackage() {
		return (ConfigurationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ConfigurationPackage getPackage() {
		return ConfigurationPackage.eINSTANCE;
	}

} //ConfigurationFactoryImpl
