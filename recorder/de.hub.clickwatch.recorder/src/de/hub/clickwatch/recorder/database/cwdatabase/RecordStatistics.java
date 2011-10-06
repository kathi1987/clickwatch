/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.recorder.database.cwdatabase;

import org.apache.commons.math.stat.descriptive.SummaryStatistics;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Record Statistics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.recorder.database.cwdatabase.RecordStatistics#getNodesA <em>Nodes A</em>}</li>
 *   <li>{@link de.hub.clickwatch.recorder.database.cwdatabase.RecordStatistics#getSamplesN <em>Samples N</em>}</li>
 *   <li>{@link de.hub.clickwatch.recorder.database.cwdatabase.RecordStatistics#getHandlersN <em>Handlers N</em>}</li>
 *   <li>{@link de.hub.clickwatch.recorder.database.cwdatabase.RecordStatistics#getHandlersPulledS <em>Handlers Pulled S</em>}</li>
 *   <li>{@link de.hub.clickwatch.recorder.database.cwdatabase.RecordStatistics#getHandlersR <em>Handlers R</em>}</li>
 *   <li>{@link de.hub.clickwatch.recorder.database.cwdatabase.RecordStatistics#getTimeA <em>Time A</em>}</li>
 *   <li>{@link de.hub.clickwatch.recorder.database.cwdatabase.RecordStatistics#getTimeN <em>Time N</em>}</li>
 *   <li>{@link de.hub.clickwatch.recorder.database.cwdatabase.RecordStatistics#getTimeS <em>Time S</em>}</li>
 *   <li>{@link de.hub.clickwatch.recorder.database.cwdatabase.RecordStatistics#getSamplesPerSecond <em>Samples Per Second</em>}</li>
 *   <li>{@link de.hub.clickwatch.recorder.database.cwdatabase.RecordStatistics#getRecordSize <em>Record Size</em>}</li>
 *   <li>{@link de.hub.clickwatch.recorder.database.cwdatabase.RecordStatistics#getSamplesR <em>Samples R</em>}</li>
 *   <li>{@link de.hub.clickwatch.recorder.database.cwdatabase.RecordStatistics#getBytesRequestS <em>Bytes Request S</em>}</li>
 *   <li>{@link de.hub.clickwatch.recorder.database.cwdatabase.RecordStatistics#getTimeRequestS <em>Time Request S</em>}</li>
 *   <li>{@link de.hub.clickwatch.recorder.database.cwdatabase.RecordStatistics#getCpuLoadS <em>Cpu Load S</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.recorder.database.cwdatabase.CWDataBasePackage#getRecordStatistics()
 * @model
 * @generated
 */
public interface RecordStatistics extends EObject {
	/**
	 * Returns the value of the '<em><b>Nodes A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes A</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes A</em>' attribute.
	 * @see #setNodesA(SummaryStatistics)
	 * @see de.hub.clickwatch.recorder.database.cwdatabase.CWDataBasePackage#getRecordStatistics_NodesA()
	 * @model dataType="de.hub.clickwatch.recorder.database.cwdatabase.ESummaryStatistics"
	 * @generated
	 */
	SummaryStatistics getNodesA();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.recorder.database.cwdatabase.RecordStatistics#getNodesA <em>Nodes A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nodes A</em>' attribute.
	 * @see #getNodesA()
	 * @generated
	 */
	void setNodesA(SummaryStatistics value);

	/**
	 * Returns the value of the '<em><b>Samples N</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Samples N</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Samples N</em>' attribute.
	 * @see #setSamplesN(SummaryStatistics)
	 * @see de.hub.clickwatch.recorder.database.cwdatabase.CWDataBasePackage#getRecordStatistics_SamplesN()
	 * @model dataType="de.hub.clickwatch.recorder.database.cwdatabase.ESummaryStatistics"
	 * @generated
	 */
	SummaryStatistics getSamplesN();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.recorder.database.cwdatabase.RecordStatistics#getSamplesN <em>Samples N</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Samples N</em>' attribute.
	 * @see #getSamplesN()
	 * @generated
	 */
	void setSamplesN(SummaryStatistics value);

	/**
	 * Returns the value of the '<em><b>Handlers N</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Handlers N</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Handlers N</em>' attribute.
	 * @see #setHandlersN(SummaryStatistics)
	 * @see de.hub.clickwatch.recorder.database.cwdatabase.CWDataBasePackage#getRecordStatistics_HandlersN()
	 * @model dataType="de.hub.clickwatch.recorder.database.cwdatabase.ESummaryStatistics"
	 * @generated
	 */
	SummaryStatistics getHandlersN();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.recorder.database.cwdatabase.RecordStatistics#getHandlersN <em>Handlers N</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Handlers N</em>' attribute.
	 * @see #getHandlersN()
	 * @generated
	 */
	void setHandlersN(SummaryStatistics value);

	/**
	 * Returns the value of the '<em><b>Handlers Pulled S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Handlers Pulled S</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Handlers Pulled S</em>' attribute.
	 * @see #setHandlersPulledS(SummaryStatistics)
	 * @see de.hub.clickwatch.recorder.database.cwdatabase.CWDataBasePackage#getRecordStatistics_HandlersPulledS()
	 * @model dataType="de.hub.clickwatch.recorder.database.cwdatabase.ESummaryStatistics"
	 * @generated
	 */
	SummaryStatistics getHandlersPulledS();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.recorder.database.cwdatabase.RecordStatistics#getHandlersPulledS <em>Handlers Pulled S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Handlers Pulled S</em>' attribute.
	 * @see #getHandlersPulledS()
	 * @generated
	 */
	void setHandlersPulledS(SummaryStatistics value);

	/**
	 * Returns the value of the '<em><b>Handlers R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Handlers R</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Handlers R</em>' attribute.
	 * @see #setHandlersR(SummaryStatistics)
	 * @see de.hub.clickwatch.recorder.database.cwdatabase.CWDataBasePackage#getRecordStatistics_HandlersR()
	 * @model dataType="de.hub.clickwatch.recorder.database.cwdatabase.ESummaryStatistics"
	 * @generated
	 */
	SummaryStatistics getHandlersR();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.recorder.database.cwdatabase.RecordStatistics#getHandlersR <em>Handlers R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Handlers R</em>' attribute.
	 * @see #getHandlersR()
	 * @generated
	 */
	void setHandlersR(SummaryStatistics value);

	/**
	 * Returns the value of the '<em><b>Time A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time A</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time A</em>' attribute.
	 * @see #setTimeA(SummaryStatistics)
	 * @see de.hub.clickwatch.recorder.database.cwdatabase.CWDataBasePackage#getRecordStatistics_TimeA()
	 * @model dataType="de.hub.clickwatch.recorder.database.cwdatabase.ESummaryStatistics"
	 * @generated
	 */
	SummaryStatistics getTimeA();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.recorder.database.cwdatabase.RecordStatistics#getTimeA <em>Time A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time A</em>' attribute.
	 * @see #getTimeA()
	 * @generated
	 */
	void setTimeA(SummaryStatistics value);

	/**
	 * Returns the value of the '<em><b>Time N</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time N</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time N</em>' attribute.
	 * @see #setTimeN(SummaryStatistics)
	 * @see de.hub.clickwatch.recorder.database.cwdatabase.CWDataBasePackage#getRecordStatistics_TimeN()
	 * @model dataType="de.hub.clickwatch.recorder.database.cwdatabase.ESummaryStatistics"
	 * @generated
	 */
	SummaryStatistics getTimeN();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.recorder.database.cwdatabase.RecordStatistics#getTimeN <em>Time N</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time N</em>' attribute.
	 * @see #getTimeN()
	 * @generated
	 */
	void setTimeN(SummaryStatistics value);

	/**
	 * Returns the value of the '<em><b>Time S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time S</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time S</em>' attribute.
	 * @see #setTimeS(SummaryStatistics)
	 * @see de.hub.clickwatch.recorder.database.cwdatabase.CWDataBasePackage#getRecordStatistics_TimeS()
	 * @model dataType="de.hub.clickwatch.recorder.database.cwdatabase.ESummaryStatistics"
	 * @generated
	 */
	SummaryStatistics getTimeS();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.recorder.database.cwdatabase.RecordStatistics#getTimeS <em>Time S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time S</em>' attribute.
	 * @see #getTimeS()
	 * @generated
	 */
	void setTimeS(SummaryStatistics value);

	/**
	 * Returns the value of the '<em><b>Samples Per Second</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Samples Per Second</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Samples Per Second</em>' attribute.
	 * @see #isSetSamplesPerSecond()
	 * @see #unsetSamplesPerSecond()
	 * @see #setSamplesPerSecond(double)
	 * @see de.hub.clickwatch.recorder.database.cwdatabase.CWDataBasePackage#getRecordStatistics_SamplesPerSecond()
	 * @model unsettable="true" derived="true"
	 * @generated
	 */
	double getSamplesPerSecond();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.recorder.database.cwdatabase.RecordStatistics#getSamplesPerSecond <em>Samples Per Second</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Samples Per Second</em>' attribute.
	 * @see #isSetSamplesPerSecond()
	 * @see #unsetSamplesPerSecond()
	 * @see #getSamplesPerSecond()
	 * @generated
	 */
	void setSamplesPerSecond(double value);

	/**
	 * Unsets the value of the '{@link de.hub.clickwatch.recorder.database.cwdatabase.RecordStatistics#getSamplesPerSecond <em>Samples Per Second</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSamplesPerSecond()
	 * @see #getSamplesPerSecond()
	 * @see #setSamplesPerSecond(double)
	 * @generated
	 */
	void unsetSamplesPerSecond();

	/**
	 * Returns whether the value of the '{@link de.hub.clickwatch.recorder.database.cwdatabase.RecordStatistics#getSamplesPerSecond <em>Samples Per Second</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Samples Per Second</em>' attribute is set.
	 * @see #unsetSamplesPerSecond()
	 * @see #getSamplesPerSecond()
	 * @see #setSamplesPerSecond(double)
	 * @generated
	 */
	boolean isSetSamplesPerSecond();

	/**
	 * Returns the value of the '<em><b>Record Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Record Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Record Size</em>' attribute.
	 * @see #setRecordSize(SummaryStatistics)
	 * @see de.hub.clickwatch.recorder.database.cwdatabase.CWDataBasePackage#getRecordStatistics_RecordSize()
	 * @model dataType="de.hub.clickwatch.recorder.database.cwdatabase.ESummaryStatistics"
	 * @generated
	 */
	SummaryStatistics getRecordSize();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.recorder.database.cwdatabase.RecordStatistics#getRecordSize <em>Record Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Record Size</em>' attribute.
	 * @see #getRecordSize()
	 * @generated
	 */
	void setRecordSize(SummaryStatistics value);

	/**
	 * Returns the value of the '<em><b>Samples R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Samples R</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Samples R</em>' attribute.
	 * @see #setSamplesR(SummaryStatistics)
	 * @see de.hub.clickwatch.recorder.database.cwdatabase.CWDataBasePackage#getRecordStatistics_SamplesR()
	 * @model dataType="de.hub.clickwatch.recorder.database.cwdatabase.ESummaryStatistics"
	 * @generated
	 */
	SummaryStatistics getSamplesR();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.recorder.database.cwdatabase.RecordStatistics#getSamplesR <em>Samples R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Samples R</em>' attribute.
	 * @see #getSamplesR()
	 * @generated
	 */
	void setSamplesR(SummaryStatistics value);

	/**
	 * Returns the value of the '<em><b>Bytes Request S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bytes Request S</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bytes Request S</em>' attribute.
	 * @see #setBytesRequestS(SummaryStatistics)
	 * @see de.hub.clickwatch.recorder.database.cwdatabase.CWDataBasePackage#getRecordStatistics_BytesRequestS()
	 * @model dataType="de.hub.clickwatch.recorder.database.cwdatabase.ESummaryStatistics"
	 * @generated
	 */
	SummaryStatistics getBytesRequestS();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.recorder.database.cwdatabase.RecordStatistics#getBytesRequestS <em>Bytes Request S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bytes Request S</em>' attribute.
	 * @see #getBytesRequestS()
	 * @generated
	 */
	void setBytesRequestS(SummaryStatistics value);

	/**
	 * Returns the value of the '<em><b>Time Request S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Request S</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Request S</em>' attribute.
	 * @see #setTimeRequestS(SummaryStatistics)
	 * @see de.hub.clickwatch.recorder.database.cwdatabase.CWDataBasePackage#getRecordStatistics_TimeRequestS()
	 * @model dataType="de.hub.clickwatch.recorder.database.cwdatabase.ESummaryStatistics"
	 * @generated
	 */
	SummaryStatistics getTimeRequestS();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.recorder.database.cwdatabase.RecordStatistics#getTimeRequestS <em>Time Request S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Request S</em>' attribute.
	 * @see #getTimeRequestS()
	 * @generated
	 */
	void setTimeRequestS(SummaryStatistics value);

	/**
	 * Returns the value of the '<em><b>Cpu Load S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cpu Load S</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cpu Load S</em>' attribute.
	 * @see #setCpuLoadS(SummaryStatistics)
	 * @see de.hub.clickwatch.recorder.database.cwdatabase.CWDataBasePackage#getRecordStatistics_CpuLoadS()
	 * @model dataType="de.hub.clickwatch.recorder.database.cwdatabase.ESummaryStatistics"
	 * @generated
	 */
	SummaryStatistics getCpuLoadS();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.recorder.database.cwdatabase.RecordStatistics#getCpuLoadS <em>Cpu Load S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cpu Load S</em>' attribute.
	 * @see #getCpuLoadS()
	 * @generated
	 */
	void setCpuLoadS(SummaryStatistics value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void reset();

} // RecordStatistics
