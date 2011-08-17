/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.recoder.cwdatabase.impl;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import org.apache.commons.math.stat.descriptive.SummaryStatistics;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.xml.type.internal.DataValue.Base64;

import de.hub.clickwatch.recoder.cwdatabase.CWDataBaseFactory;
import de.hub.clickwatch.recoder.cwdatabase.CWDataBasePackage;
import de.hub.clickwatch.recoder.cwdatabase.DataBase;
import de.hub.clickwatch.recoder.cwdatabase.HBaseRowMap;
import de.hub.clickwatch.recoder.cwdatabase.Record;
import de.hub.clickwatch.recoder.cwdatabase.RecordStatistics;

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
			case CWDataBasePackage.RECORD: return createRecord();
			case CWDataBasePackage.DATA_BASE: return createDataBase();
			case CWDataBasePackage.RECORD_STATISTICS: return createRecordStatistics();
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
			case CWDataBasePackage.ESUMMARY_STATISTICS:
				return createESummaryStatisticsFromString(eDataType, initialValue);
			case CWDataBasePackage.HBASE_ROW_MAP:
				return createHBaseRowMapFromString(eDataType, initialValue);
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
			case CWDataBasePackage.ESUMMARY_STATISTICS:
				return convertESummaryStatisticsToString(eDataType, instanceValue);
			case CWDataBasePackage.HBASE_ROW_MAP:
				return convertHBaseRowMapToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Record createRecord() {
		RecordImpl record = new RecordImpl();
		return record;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataBase createDataBase() {
		DataBaseImpl dataBase = new DataBaseImpl();
		return dataBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecordStatistics createRecordStatistics() {
		RecordStatisticsImpl recordStatistics = new RecordStatisticsImpl();
		return recordStatistics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public SummaryStatistics createESummaryStatisticsFromString(EDataType eDataType, String initialValue) {
		try {
		    byte[] bytes = Base64.decode(initialValue);
		    ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(bytes));
		    SummaryStatistics value = (SummaryStatistics)in.readObject();
		    in.close();
		    return value;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String convertESummaryStatisticsToString(EDataType eDataType, Object instanceValue) {
		try {
			Serializable value = (Serializable)instanceValue;
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
		    ObjectOutputStream out = new ObjectOutputStream(bos) ;
		    out.writeObject(value);
		    out.close();
	
		    return Base64.encode(bos.toByteArray());
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public HBaseRowMap createHBaseRowMapFromString(EDataType eDataType, String initialValue) {
		try {
		    byte[] bytes = Base64.decode(initialValue);
		    ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(bytes));
		    HBaseRowMap value = (HBaseRowMap)in.readObject();
		    in.close();
		    return value;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String convertHBaseRowMapToString(EDataType eDataType, Object instanceValue) {
		try {
			Serializable value = (Serializable)instanceValue;
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
		    ObjectOutputStream out = new ObjectOutputStream(bos) ;
		    out.writeObject(value);
		    out.close();
	
		    return Base64.encode(bos.toByteArray());
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
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
