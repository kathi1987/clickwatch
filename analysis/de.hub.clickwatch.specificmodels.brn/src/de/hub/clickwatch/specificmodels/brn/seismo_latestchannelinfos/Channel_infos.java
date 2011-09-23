/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Channel infos</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.Channel_infos#getEContainer_channel_infos <em>EContainer channel infos</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.Channel_infos#getText <em>Text</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.Channel_infos#getChannel_info <em>Channel info</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.Seismo_latestchannelinfosPackage#getChannel_infos()
 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Latestchannelinfos|Handler/channel_infos|channel_infos:Channel_infos|EObject'"
 * @generated
 */
public interface Channel_infos extends EObject {
	/**
	 * Returns the value of the '<em><b>EContainer channel infos</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.Latestchannelinfos#getChannel_infos <em>Channel infos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EContainer channel infos</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EContainer channel infos</em>' container reference.
	 * @see #setEContainer_channel_infos(Latestchannelinfos)
	 * @see de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.Seismo_latestchannelinfosPackage#getChannel_infos_EContainer_channel_infos()
	 * @see de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.Latestchannelinfos#getChannel_infos
	 * @model opposite="channel_infos" transient="false"
	 * @generated
	 */
	Latestchannelinfos getEContainer_channel_infos();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.Channel_infos#getEContainer_channel_infos <em>EContainer channel infos</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EContainer channel infos</em>' container reference.
	 * @see #getEContainer_channel_infos()
	 * @generated
	 */
	void setEContainer_channel_infos(Latestchannelinfos value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute list.
	 * @see de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.Seismo_latestchannelinfosPackage#getChannel_infos_Text()
	 * @model unique="false"
	 *        annotation="http://de.hub.clickwatch.specificmodels target_id='Latestchannelinfos|Handler/channel_infos|channel_infos:Channel_infos|EObject/text|text:'"
	 * @generated
	 */
	EList<String> getText();

	/**
	 * Returns the value of the '<em><b>Channel info</b></em>' containment reference list.
	 * The list contents are of type {@link de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.Channel_info}.
	 * It is bidirectional and its opposite is '{@link de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.Channel_info#getEContainer_channel_info <em>EContainer channel info</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Channel info</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Channel info</em>' containment reference list.
	 * @see de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.Seismo_latestchannelinfosPackage#getChannel_infos_Channel_info()
	 * @see de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.Channel_info#getEContainer_channel_info
	 * @model opposite="eContainer_channel_info" containment="true"
	 *        annotation="http://de.hub.clickwatch.specificmodels target_id='Latestchannelinfos|Handler/channel_infos|channel_infos:Channel_infos|EObject/channel_info|channel_info:Channel_info|EObject' IsCopy='false'"
	 * @generated
	 */
	EList<Channel_info> getChannel_info();

} // Channel_infos
