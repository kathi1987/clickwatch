package edu.hu.clickwatch.nodeadapter;

import org.eclipse.emf.common.notify.Notification;

import com.google.inject.ImplementedBy;

import edu.hu.clickwatch.model.Handler;
import edu.hu.clickwatch.model.Node;

/**
 * This interface describes node adapters. A node adapter adapts a node model to
 * some node in reality.
 * 
 * It is not intended to reuse node adapter for multiple connections or
 * reconnects.
 * 
 * @author Markus Scheidgen
 * 
 */
@ImplementedBy(ClickControlNodeAdapter.class)
public interface INodeAdapter {

	/**
	 * Establishes a connection to the target node. Must only be called once in
	 * the object life-cycle.
	 */
	public void connect();

	/**
	 * @return true, iff this node adapter is connected to the remote node.
	 */
	public boolean isConnected();

	/**
	 * Disconnects from the target node. Must only be called once in the object
	 * life-cycle.
	 */
	public void disconnect();

	/**
	 * Retrieves the node information that is described by the given filter.
	 * 
	 * @param elemFilter filter elements
	 * @param handFilter filter handler
	 * @return a copy of the lates model representation of the remote node
	 *         filtered by filter.
	 */
	public Node retrieve(String elemFilter, String handFilter);

	/**
	 * Retrieves (reads) the value of a handler from the remote node this
	 * adapter is connected to.
	 * 
	 * @param handler
	 *            , model representation of the handler that is to be read. The
	 *            remote handler is identified by the handlers name and the name
	 *            of the container element.
	 * @return the value as read from the remote node.
	 */
	public String retrieveHandlerValue(Handler handler);

	/**
	 * Updates (writes) a value to a handler on the remote node this adapter is
	 * connected to.
	 * 
	 * @param handler
	 *            , model representation of the handler that should be read. The
	 *            remote handler is identified by the handlers name and the name
	 *            of the container element.
	 * @param value
	 *            , the value that should be set. Attention! There is not
	 *            additional check of the value and no exception will be thrown
	 *            if the value is invalid for the handler.
	 */
	public void updateHandlerValue(Handler handler, Object value);
	
	/**
	 * Based on the value representation of this {@link ClickControlNodeAdapter}, this method
	 * must decide whether a notification on a handler represents a change of the handler value.
	 * 
	 * @param notification A notification for a handler.
	 * @return True, iff the handler has changed.
	 */
	public boolean determineHandlerHasChangedInModel(Notification notification);
	
	/**
	 * Based on the value representation of this {@link INodeAdapter}, this
	 * method must decide whether the handler value has changed, comparing a new
	 * value from the network with an old model value.
	 * 
	 * @param modelCopy
	 * @param realityCopy
	 * @return True, iff the handler values are not identically.
	 */
	public boolean determineHandlerHasChangedInReality(Handler modelCopy, Handler realityCopy);

}
