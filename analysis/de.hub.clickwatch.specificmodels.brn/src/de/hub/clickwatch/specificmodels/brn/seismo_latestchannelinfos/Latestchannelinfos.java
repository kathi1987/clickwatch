/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos;

import de.hub.clickwatch.model.Handler;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Latestchannelinfos</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.Latestchannelinfos#getChannel_infos <em>Channel infos</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.Seismo_latestchannelinfosPackage#getLatestchannelinfos()
 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Latestchannelinfos|Handler'"
 * @generated
 */
public interface Latestchannelinfos extends Handler {
	/**
	 * Returns the value of the '<em><b>Channel infos</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.Channel_infos#getEContainer_channel_infos <em>EContainer channel infos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Channel infos</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Channel infos</em>' containment reference.
	 * @see #setChannel_infos(Channel_infos)
	 * @see de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.Seismo_latestchannelinfosPackage#getLatestchannelinfos_Channel_infos()
	 * @see de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.Channel_infos#getEContainer_channel_infos
	 * @model opposite="eContainer_channel_infos" containment="true"
	 *        annotation="http://de.hub.clickwatch.specificmodels target_id='Latestchannelinfos|Handler/channel_infos|channel_infos:Channel_infos|EObject' IsCopy='false'"
	 * @generated
	 */
	Channel_infos getChannel_infos();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.Latestchannelinfos#getChannel_infos <em>Channel infos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Channel infos</em>' containment reference.
	 * @see #getChannel_infos()
	 * @generated
	 */
	void setChannel_infos(Channel_infos value);

} // Latestchannelinfos
