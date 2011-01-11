package edu.hu.clickwatch.model;

import com.google.inject.ImplementedBy;

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
	 * Retrieves the whole node information with all its elements and handlers
	 * from the node this adapter is connected to.
	 * 
	 * @return a copy of the latest model representation of the remote node.
	 */
	public Node retrieveAll();

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
	public void updateHandlerValue(Handler handler, String value);
}
